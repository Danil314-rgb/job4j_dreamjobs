package dream;

import ru.job4j.dream.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        /*if ("root@local".equals(email) && "root".equals(password)) {
            HttpSession sc = req.getSession();
            User admin = new User();
            admin.setName("Admin");
            admin.setEmail(email);
            sc.setAttribute("user", admin);
            resp.sendRedirect(req.getContextPath() + "/posts.do");
        }*/
        if (user.getEmail().equals(DbStore.instOf().findByUserEmail(email).getEmail()) &&
                user.getPassword().equals(DbStore.instOf().findByUserEmail(email).getPassword())) {
            HttpSession session = req.getSession();
            User nUser = new User();
            String nName = DbStore.instOf().findByUserEmail(email).getName();
            nUser.setName(nName);
            nUser.setEmail(email);
            session.setAttribute(nName, nUser);
            resp.sendRedirect(req.getContextPath() + "/posts.do");
        }
        else {
            req.setAttribute("error", "Не верный email или пароль");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}

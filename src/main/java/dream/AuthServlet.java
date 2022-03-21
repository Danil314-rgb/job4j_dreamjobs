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
        User nUser = DbStore.instOf().findByUserEmail(email);

        if (nUser == null) {
            req.setAttribute("error", "Пользователя с данным email не существует");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {
            if (password.equals(nUser.getPassword())) {
                HttpSession session = req.getSession();
                User user = new User();
                user.setName(email);
                user.setEmail(email);
                session.setAttribute("user", user);
                resp.sendRedirect(req.getContextPath() + "/posts.do");
            } else {
                req.setAttribute("error", "Не верный пароль");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }
        }
    }
}

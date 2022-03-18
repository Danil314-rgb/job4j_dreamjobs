package dream;

import ru.job4j.dream.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.util.Objects.nonNull;

public class RegServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (nonNull(DbStore.instOf().findByUserEmail(email))) {
            req.setAttribute("error", "Такой email уже сущуствует");
            req.getRequestDispatcher("reg.jsp").forward(req, resp);
        } else {
            User user = new User(0, name, email, password);
            DbStore.instOf().save(user);
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
        }
    }
}

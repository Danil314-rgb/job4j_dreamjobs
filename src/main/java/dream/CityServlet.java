package dream;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.job4j.dream.model.City;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CityServlet extends HttpServlet {

    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<City> list = (List<City>) DbStore.instOf().findAllCities();
        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writeValueAsString(list);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("json");
        resp.getWriter().write(string);
    }*/
}

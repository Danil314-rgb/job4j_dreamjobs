package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*File users = null;
        for (File file : new File("C:\\projects\\job4j_dreamjob\\src\\main\\images\\").listFiles()) {
            if ("users.txt".equals(file.getName())) {
                users = file;
                break;
            }
        }
        try (FileInputStream stream = new FileInputStream(users)){
            resp.getOutputStream().write(stream.readAllBytes());
        }*/
    }
}
package ua.lviv.logos.po.controller;

import org.apache.log4j.Logger;
import ua.lviv.logos.po.Main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/home")
public class HomeController extends HttpServlet {
    public static final Logger LOG = Logger.getLogger(HomeController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.info("GET method");
        LOG.info(resp.toString());
    }
}

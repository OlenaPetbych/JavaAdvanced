package ua.lviv.logos.po;

import org.apache.log4j.Logger;
import ua.lviv.logos.po.entity.User;
import ua.lviv.logos.po.repository.UserRepository;
import ua.lviv.logos.po.repository.UserRepositoryImpl;

import java.sql.Connection;

import static ua.lviv.logos.po.ConnectionManager.createConnection;

public class Main {

    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) throws ClassNotFoundException {
        for (int i = 0; i < 3; i++) {
            LOG.debug("debug");
            LOG.info("Main is started...");
            LOG.warn("Warning it is");
            LOG.info("main is finished");
            LOG.error("error");
        }
    }
}

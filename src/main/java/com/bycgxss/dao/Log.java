package com.bycgxss.dao;
import java.util.logging.Logger;

public class Log {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Log.class.getName());
        log.severe("dao server");
        log.warning("dao warning");
        log.info("dao info");
        log.config("dao config");
        log.fine("dao fine");
        log.finer("dao finer");
        log.finest("dao finest");
    }
}

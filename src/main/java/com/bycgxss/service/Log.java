package com.bycgxss.service;
import java.util.logging.Logger;

public class Log {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Log.class.getName());
        log.severe("service server");
        log.warning("service warning");
        log.info("service info");
        log.config("service config");
        log.fine("service fine");
        log.finer("service finer");
        log.finest("service finest");
    }
}

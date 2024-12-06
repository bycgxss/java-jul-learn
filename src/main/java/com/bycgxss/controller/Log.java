package com.bycgxss.controller;
import java.util.logging.Logger;

public class Log {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Log.class.getName());
        log.severe("controller server");
        log.warning("controller warning");
        log.info("controller info");
        log.config("controller config");
        log.fine("controller fine");
        log.finer("controller finer");
        log.finest("controller finest");
    }
}

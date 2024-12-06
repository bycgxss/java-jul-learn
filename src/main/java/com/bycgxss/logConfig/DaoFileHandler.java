package com.bycgxss.logConfig;

import java.io.IOException;
import java.util.logging.FileHandler;

public class DaoFileHandler extends FileHandler {
    public DaoFileHandler() throws IOException, SecurityException {
    }

    public DaoFileHandler(String pattern) throws IOException, SecurityException {
        super(pattern);
    }

    public DaoFileHandler(String pattern, boolean append) throws IOException, SecurityException {
        super(pattern, append);
    }

    public DaoFileHandler(String pattern, int limit, int count) throws IOException, SecurityException {
        super(pattern, limit, count);
    }

    public DaoFileHandler(String pattern, int limit, int count, boolean append) throws IOException, SecurityException {
        super(pattern, limit, count, append);
    }

    public DaoFileHandler(String pattern, long limit, int count, boolean append) throws IOException {
        super(pattern, limit, count, append);
    }
}

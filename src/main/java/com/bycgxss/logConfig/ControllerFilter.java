package com.bycgxss.logConfig;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class ControllerFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getMessage().contains("server");
    }
}

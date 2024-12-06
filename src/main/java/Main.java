import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = Main.class.getClassLoader().getResourceAsStream("log.properties");
        LogManager lm = LogManager.getLogManager();
        lm.readConfiguration(is);
        Logger log = Logger.getLogger(Main.class.getName());

        log.severe("main server");
        log.warning("main warning");
        log.info("main info");
        log.config("main config");
        log.fine("main fine");
        log.finer("main finer");
        log.finest("main finest");

        com.bycgxss.controller.Log.main(args);
        com.bycgxss.dao.Log.main(args);
//        com.bycgxss.service.Log.main(args);
    }
}

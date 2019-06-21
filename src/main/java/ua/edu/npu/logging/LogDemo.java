package ua.edu.npu.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogDemo {
    public static Logger log = Logger.getLogger(LogDemo.class.getSimpleName());
    static {
//        PropertyConfigurator.configure("log4j.properties");
    }

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        log.info("Start program");

        int i = 10;

        try {
            while (i > -5) {
                if (i < 2) {
                    log.warn("root expression closes to negative");
                }
                if (i < 0) throw new ArithmeticException();
                double x = Math.sqrt(i);
                System.out.println(x);
                i--;
            }
        }
        catch (ArithmeticException e) {
            log.error("Division by zero", e);
            System.out.println("here");
        }

        log.info("Close program");
    }

}

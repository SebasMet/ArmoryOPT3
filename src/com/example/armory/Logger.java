package com.example.armory;

public class Logger {
    static final int DEBUG = 0;
    static final int NOTICE = 1;
    static final int WARNING = 2;
    static final int ERROR = 3;

    private static Logger loggerInstance = null;

    private int severityLevel = Logger.DEBUG;

    private Logger() {}

    public static Logger getInstance() {
        if (loggerInstance == null)
            loggerInstance = new Logger();

        return loggerInstance;
    }

    public void logMessage(String message, int severityLevel) {
        if (severityLevel >= this.severityLevel)
            System.out.printf("[%s] %s\n", werboseSeverityLevel(severityLevel), message);
    }

    public void logMessage(String message) {
        logMessage(message, Logger.DEBUG);
    }

    private String werboseSeverityLevel(int severityLevel) {
        switch (severityLevel) {
            case Logger.DEBUG:
                return "DEBUG";
            case Logger.NOTICE:
                return "NOTICE";
            case Logger.WARNING:
                return "WARNING";
            case Logger.ERROR:
                return "ERROR";
            default:
                return "UNKOWN";
        }
    }

    public void setSeverity(int severityLevel) {
        this.severityLevel = severityLevel;
    }

}

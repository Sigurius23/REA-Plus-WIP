package org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* JADX INFO: renamed from: d */
    public static void m85621d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    /* JADX INFO: renamed from: e */
    public static void m85622e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        if (loggable != null) {
            throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
        }
        nativeEnableLogToDebugOutput(severity.ordinal());
        loggingEnabled = true;
    }

    private static String getStackTraceString(Throwable th3) {
        if (th3 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th3.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                return;
            }
            loggable.onLogMessage(str2, severity, str);
            return;
        }
        if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            return;
        }
        int iOrdinal = severity.ordinal();
        if (iOrdinal == 1) {
            level = Level.INFO;
        } else if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINE : Level.SEVERE;
        } else {
            level = Level.WARNING;
        }
        fallbackLogger.log(level, str + ": " + str2);
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i13);

    private static native void nativeLog(int i13, String str, String str2);

    /* JADX INFO: renamed from: v */
    public static void m85624v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m85625w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m85623e(String str, String str2, Throwable th3) {
        Severity severity = Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th3.toString());
        log(severity, str, getStackTraceString(th3));
    }

    /* JADX INFO: renamed from: w */
    public static void m85626w(String str, String str2, Throwable th3) {
        Severity severity = Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th3.toString());
        log(severity, str, getStackTraceString(th3));
    }
}

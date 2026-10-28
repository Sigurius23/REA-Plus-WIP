package live.hms.video.utils;

import android.content.Context;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import c93.InterfaceC4351m;
import hms.webrtc.RTCStats;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import live.hms.video.sdk.SignatureChecker;
import live.hms.video.sdk.models.FrameworkInfo;
import live.hms.video.services.LogAlarmManager;
import m83.AbstractC25260n;
import p705ea2.C12915l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R$\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\"¨\u00067"}, m65681d2 = {"Llive/hms/video/utils/LogUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "givenSessionFile", "Ljava/io/FileWriter;", "initiateLogging", "(Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;", "", "dirName", "filename", "makeLogFile", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Ll83/a0;", "closeLogging", "Llive/hms/video/sdk/models/FrameworkInfo;", "frameworkInfo", "staticFileWriterStart", "(Landroid/content/Context;Llive/hms/video/sdk/models/FrameworkInfo;)Ljava/lang/String;", "saveLogsToFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getDirPath", "(Landroid/content/Context;)Ljava/io/File;", "checkDirSizeAndRemove", "(Landroid/content/Context;)V", "", "DEVICE_INFO", "[Ljava/lang/String;", "getDEVICE_INFO", "()[Ljava/lang/String;", "MAX_DIR_SIZE", "Ljava/lang/String;", "", "DEFAULT_DIR_SIZE", "J", "Ljava/text/SimpleDateFormat;", "logFileNameDateFormatter", "Ljava/text/SimpleDateFormat;", "logDateFormatter", "currentSessionFile", "Ljava/io/File;", "getCurrentSessionFile", "()Ljava/io/File;", "setCurrentSessionFile", "(Ljava/io/File;)V", "currentSessionFileWriter", "Ljava/io/FileWriter;", "getCurrentSessionFileWriter", "()Ljava/io/FileWriter;", "setCurrentSessionFileWriter", "(Ljava/io/FileWriter;)V", "TAG", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class LogUtils {
    public static final long DEFAULT_DIR_SIZE = 1000000;
    public static final String MAX_DIR_SIZE = "max_dir_size";
    private static final String TAG = "LogUtils";
    private static File currentSessionFile;
    private static FileWriter currentSessionFileWriter;
    private static final SimpleDateFormat logDateFormatter;
    private static final SimpleDateFormat logFileNameDateFormatter;
    public static final LogUtils INSTANCE = new LogUtils();
    private static final String[] DEVICE_INFO = {"Android SDK: " + Build.VERSION.SDK_INT, "Release: " + Build.VERSION.RELEASE, "Brand: " + Build.BRAND, "Device: " + Build.DEVICE, "Id: " + Build.ID, "Hardware: " + Build.HARDWARE, "Manufacturer: " + Build.MANUFACTURER, "Model: " + Build.MODEL, "Product: " + Build.PRODUCT};

    static {
        Locale locale = Locale.ENGLISH;
        logFileNameDateFormatter = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss.SSS", locale);
        logDateFormatter = new SimpleDateFormat("HH:mm:ss", locale);
    }

    private LogUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkDirSizeAndRemove$lambda$5$lambda$2(File file, File file2) {
        return AbstractC22676k.m65752l(file2.lastModified(), file.lastModified());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkDirSizeAndRemove$lambda$5$lambda$3(InterfaceC4351m tmp0, Object obj, Object obj2) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileWriter initiateLogging(Context context, File givenSessionFile) {
        if (givenSessionFile == null) {
            givenSessionFile = makeLogFile(context, "logs", LogAlarmManager.DEFAULT_LOGS_FILE_NAME);
        }
        currentSessionFile = givenSessionFile;
        FileWriter fileWriter = new FileWriter(currentSessionFile);
        currentSessionFileWriter = fileWriter;
        return fileWriter;
    }

    private final File makeLogFile(Context context, String dirName, String filename) {
        File file = new File(context.getExternalFilesDir(dirName), "");
        Date date = new Date();
        return new File(file, filename + '-' + (logFileNameDateFormatter.format(date) + '-' + date.getTime()) + ".log");
    }

    public final void checkDirSizeAndRemove(Context context) {
        File[] fileArrListFiles;
        AbstractC22676k.m65750j(context, "context");
        long j7 = PreferenceManager.getDefaultSharedPreferences(context).getLong("max_dir_size", 1000000L);
        File file = new File(context.getExternalFilesDir("logs"), "");
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, new C12915l(new C24405c(0), 10));
        long length = 0;
        for (File file2 : fileArrListFiles) {
            length += file2.length();
            if (length > j7) {
                file2.delete();
            }
        }
    }

    public final void closeLogging() {
        FileWriter fileWriter = currentSessionFileWriter;
        if (fileWriter != null) {
            HMSLogger.INSTANCE.removeInjectedLoggable();
            fileWriter.close();
            currentSessionFile = null;
            currentSessionFileWriter = null;
        }
    }

    public final File getCurrentSessionFile() {
        return currentSessionFile;
    }

    public final FileWriter getCurrentSessionFileWriter() {
        return currentSessionFileWriter;
    }

    public final String[] getDEVICE_INFO() {
        return DEVICE_INFO;
    }

    public final File getDirPath(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return new File(context.getExternalFilesDir("logs"), "");
    }

    public final File saveLogsToFile(Context context, String filename) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(filename, "filename");
        File fileMakeLogFile = makeLogFile(context, "crash", filename);
        try {
            Runtime.getRuntime().exec("logcat -f " + fileMakeLogFile.getAbsolutePath());
        } catch (IOException e5) {
            Log.e(TAG, "Error occurred while saving logs in " + fileMakeLogFile.getAbsolutePath(), e5);
        }
        Log.v(TAG, "Saved logs to file " + fileMakeLogFile.getAbsolutePath());
        return fileMakeLogFile;
    }

    public final void setCurrentSessionFile(File file) {
        currentSessionFile = file;
    }

    public final void setCurrentSessionFileWriter(FileWriter fileWriter) {
        currentSessionFileWriter = fileWriter;
    }

    public final String staticFileWriterStart(final Context context, FrameworkInfo frameworkInfo) throws IOException {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(frameworkInfo, "frameworkInfo");
        closeLogging();
        final C22669g0 c22669g0 = new C22669g0();
        FileWriter fileWriterInitiateLogging = initiateLogging(context, null);
        c22669g0.f89336w = fileWriterInitiateLogging;
        fileWriterInitiateLogging.write("Android Agent: " + new HMSAgentOs(frameworkInfo, new SignatureChecker(context)).getUserAgent());
        ((FileWriter) c22669g0.f89336w).write("Device Info: " + AbstractC25260n.m74028D0(DEVICE_INFO, "\n", null, null, null, 62));
        HMSLogger.INSTANCE.injectLoggable(new HMSLogger.Loggable() { // from class: live.hms.video.utils.LogUtils.staticFileWriterStart.1
            @Override // live.hms.video.utils.HMSLogger.Loggable
            public void onLogMessage(HMSLogger.LogLevel level, String tag, String message, boolean isWebRtCLog) throws IOException {
                AbstractC22676k.m65750j(level, "level");
                AbstractC22676k.m65750j(tag, "tag");
                AbstractC22676k.m65750j(message, "message");
                String str = LogUtils.logDateFormatter.format(new Date());
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append(isWebRtCLog ? "RTC" : "HMS");
                sb4.append(':');
                sb4.append(level);
                sb4.append(':');
                sb4.append(tag);
                sb4.append(':');
                sb4.append(str);
                sb4.append(']');
                String string = sb4.toString();
                try {
                    ((FileWriter) c22669g0.f89336w).write(string + "\t\t" + AbstractC39414r.m125871Q0(message).toString() + '\n');
                } catch (IOException e5) {
                    Log.e(LogUtils.TAG, "ran into an exception closing the log file :" + e5);
                    ((FileWriter) c22669g0.f89336w).close();
                    C22669g0 c22669g1 = c22669g0;
                    LogUtils logUtils = LogUtils.INSTANCE;
                    c22669g1.f89336w = logUtils.initiateLogging(context, logUtils.getCurrentSessionFile());
                }
            }

            @Override // live.hms.video.utils.HMSLogger.Loggable
            public void onLogToFile(HMSLogger.LogFiles logFiles, String str, Map<String, RTCStats> map) {
                HMSLogger.Loggable.DefaultImpls.onLogToFile(this, logFiles, str, map);
            }
        });
        File file = currentSessionFile;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }
}

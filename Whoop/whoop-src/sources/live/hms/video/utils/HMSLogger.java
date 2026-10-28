package live.hms.video.utils;

import android.os.Build;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import hms.webrtc.Logging;
import hms.webrtc.RTCStats;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25260n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u000389:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003J3\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u000bJ\u001d\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u000bJ\u001d\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u000bJ%\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107¨\u0006;"}, m65681d2 = {"Llive/hms/video/utils/HMSLogger;", "", "<init>", "()V", "", "tag", "Ll83/a0;", "logDeviceInfo", "(Ljava/lang/String;)V", "message", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "Llive/hms/video/utils/HMSLogger$LogLevel;", "level", "", "tr", "", "isWebRTCLog", "log", "(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "Llive/hms/video/utils/HMSLogger$Loggable;", "loggable", "injectLoggable", "(Llive/hms/video/utils/HMSLogger$Loggable;)V", "removeInjectedLoggable", "Llive/hms/video/utils/HMSLogger$LogFiles;", "fileName", "", "Lhms/webrtc/RTCStats;", "logFile$lib_release", "(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V", "logFile", "Lhms/webrtc/Logging$Severity;", "severity", "webRTCLog$lib_release", "(Lhms/webrtc/Logging$Severity;Ljava/lang/String;Ljava/lang/String;)V", "webRTCLog", "v", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "DEVICE_INFO", "[Ljava/lang/String;", "getDEVICE_INFO", "()[Ljava/lang/String;", "Llive/hms/video/utils/HMSLogger$LogLevel;", "getLevel", "()Llive/hms/video/utils/HMSLogger$LogLevel;", "setLevel", "(Llive/hms/video/utils/HMSLogger$LogLevel;)V", "webRtcLogLevel", "getWebRtcLogLevel", "setWebRtcLogLevel", "Llive/hms/video/utils/HMSLogger$Loggable;", "Loggable", "LogLevel", "LogFiles", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSLogger {
    private static Loggable loggable;
    public static final HMSLogger INSTANCE = new HMSLogger();
    private static final String[] DEVICE_INFO = {"Android SDK: " + Build.VERSION.SDK_INT, "Release: " + Build.VERSION.RELEASE, "Brand: " + Build.BRAND, "Device: " + Build.DEVICE, "Id: " + Build.ID, "Hardware: " + Build.HARDWARE, "Manufacturer: " + Build.MANUFACTURER, "Model: " + Build.MODEL, "Product: " + Build.PRODUCT};
    private static LogLevel level = LogLevel.DEBUG;
    private static LogLevel webRtcLogLevel = LogLevel.ERROR;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/utils/HMSLogger$LogFiles;", "", "<init>", "(Ljava/lang/String;I)V", "STATISTICS", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum LogFiles {
        STATISTICS;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/utils/HMSLogger$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "OFF", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum LogLevel {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR,
        OFF;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/utils/HMSLogger$Loggable;", "", "Llive/hms/video/utils/HMSLogger$LogLevel;", "level", "", "tag", "message", "", "isWebRtCLog", "Ll83/a0;", "onLogMessage", "(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Z)V", "Llive/hms/video/utils/HMSLogger$LogFiles;", "fileName", "", "Lhms/webrtc/RTCStats;", "onLogToFile", "(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public interface Loggable {

        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class DefaultImpls {
            public static void onLogToFile(Loggable loggable, LogFiles fileName, String tag, Map<String, RTCStats> message) {
                AbstractC22676k.m65750j(fileName, "fileName");
                AbstractC22676k.m65750j(tag, "tag");
                AbstractC22676k.m65750j(message, "message");
            }
        }

        void onLogMessage(LogLevel level, String tag, String message, boolean isWebRtCLog);

        void onLogToFile(LogFiles fileName, String tag, Map<String, RTCStats> message);
    }

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Logging.Severity.values().length];
            try {
                iArr[Logging.Severity.LS_VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logging.Severity.LS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logging.Severity.LS_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logging.Severity.LS_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LogLevel.values().length];
            try {
                iArr2[LogLevel.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LogLevel.VERBOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LogLevel.WARN.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LogLevel.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.utils.HMSLogger$log$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.utils.HMSLogger$log$1", m100430f = "HMSLogger.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243981 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $isWebRTCLog;
        final /* synthetic */ LogLevel $level;
        final /* synthetic */ String $message;
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243981(LogLevel logLevel, String str, String str2, boolean z4, InterfaceC30057d<? super C243981> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$level = logLevel;
            this.$tag = str;
            this.$message = str2;
            this.$isWebRTCLog = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C243981(this.$level, this.$tag, this.$message, this.$isWebRTCLog, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243981) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            LogLevel logLevel = this.$level;
            String str = this.$tag;
            String str2 = this.$message;
            boolean z4 = this.$isWebRTCLog;
            try {
                Loggable loggable = HMSLogger.loggable;
                if (loggable != null) {
                    loggable.onLogMessage(logLevel, str, str2, z4);
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
            return C23454a0.f92919a;
        }
    }

    private HMSLogger() {
    }

    /* JADX INFO: renamed from: d */
    public static final void m71136d(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        log$default(INSTANCE, LogLevel.DEBUG, tag, message, null, false, 24, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m71137e(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        log$default(INSTANCE, LogLevel.ERROR, tag, message, null, false, 24, null);
    }

    private final void log(LogLevel level2, String tag, String message, Throwable tr3, boolean isWebRTCLog) {
        if (!isWebRTCLog || webRtcLogLevel.ordinal() <= level2.ordinal()) {
            if (isWebRTCLog || level.ordinal() <= level2.ordinal()) {
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C243981(level2, tag, message, isWebRTCLog, null), 3);
                switch (WhenMappings.$EnumSwitchMapping$1[level2.ordinal()]) {
                    case 1:
                        return;
                    case 2:
                        Log.v(tag, message);
                        return;
                    case 3:
                        Log.d(tag, message);
                        return;
                    case 4:
                        Log.i(tag, message);
                        return;
                    case 5:
                        Log.w(tag, message, tr3);
                        return;
                    case 6:
                        Log.e(tag, message, tr3);
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public static /* synthetic */ void log$default(HMSLogger hMSLogger, LogLevel logLevel, String str, String str2, Throwable th3, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            th3 = null;
        }
        Throwable th4 = th3;
        if ((i13 & 16) != 0) {
            z4 = false;
        }
        hMSLogger.log(logLevel, str, str2, th4, z4);
    }

    public static final void logDeviceInfo(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        log$default(INSTANCE, LogLevel.VERBOSE, tag, AbstractC25260n.m74028D0(DEVICE_INFO, ", ", null, null, null, 62), null, false, 24, null);
    }

    public final String[] getDEVICE_INFO() {
        return DEVICE_INFO;
    }

    public final LogLevel getLevel() {
        return level;
    }

    public final LogLevel getWebRtcLogLevel() {
        return webRtcLogLevel;
    }

    /* JADX INFO: renamed from: i */
    public final void m71139i(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        log$default(this, LogLevel.INFO, tag, message, null, false, 24, null);
    }

    public final void injectLoggable(Loggable loggable2) {
        AbstractC22676k.m65750j(loggable2, "loggable");
        loggable = loggable2;
    }

    public final void logFile$lib_release(LogFiles fileName, String tag, Map<String, RTCStats> message) {
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        Loggable loggable2 = loggable;
        if (loggable2 != null) {
            loggable2.onLogToFile(fileName, tag, message);
        }
    }

    public final void removeInjectedLoggable() {
        loggable = null;
    }

    public final void setLevel(LogLevel logLevel) {
        AbstractC22676k.m65750j(logLevel, "<set-?>");
        level = logLevel;
    }

    public final void setWebRtcLogLevel(LogLevel logLevel) {
        AbstractC22676k.m65750j(logLevel, "<set-?>");
        webRtcLogLevel = logLevel;
    }

    /* JADX INFO: renamed from: v */
    public final void m71140v(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        log$default(this, LogLevel.VERBOSE, tag, message, null, false, 24, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m71141w(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        log$default(this, LogLevel.WARN, tag, message, null, false, 24, null);
    }

    public final void webRTCLog$lib_release(Logging.Severity severity, String tag, String message) {
        LogLevel logLevel;
        AbstractC22676k.m65750j(severity, "severity");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        int i13 = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
        if (i13 == 1) {
            logLevel = LogLevel.VERBOSE;
        } else if (i13 == 2) {
            logLevel = LogLevel.INFO;
        } else if (i13 != 3) {
            logLevel = i13 != 4 ? LogLevel.OFF : LogLevel.ERROR;
        } else {
            logLevel = LogLevel.WARN;
        }
        log$default(this, logLevel, tag, message, null, true, 8, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m71138e(String tag, String message, Throwable tr3) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(tr3, "tr");
        log$default(this, LogLevel.ERROR, tag, message, tr3, false, 16, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m71142w(String tag, String message, Throwable tr3) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(tr3, "tr");
        log$default(this, LogLevel.WARN, tag, message, tr3, false, 16, null);
    }
}

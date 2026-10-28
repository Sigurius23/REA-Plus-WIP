package live.hms.video.utils;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/utils/TelephonyUtil;", "", "<init>", "()V", "getNetworkType", "", "dataNetworkType", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TelephonyUtil {
    public static final TelephonyUtil INSTANCE = new TelephonyUtil();

    private TelephonyUtil() {
    }

    public final String getNetworkType(Integer dataNetworkType) {
        if (dataNetworkType != null && dataNetworkType.intValue() == 7) {
            return "EDGE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 4) {
            return "EDGE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 2) {
            return "EDGE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 1) {
            return "EDGE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 11) {
            return "EDGE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 16) {
            return "EDGE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 8) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 10) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 15) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 9) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 3) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 5) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 14) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 6) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 12) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 17) {
            return "3G";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 13) {
            return "LTE";
        }
        if (dataNetworkType != null && dataNetworkType.intValue() == 20) {
            return "5G";
        }
        return (dataNetworkType != null && dataNetworkType.intValue() == 18) ? "WIFI" : "UNKNOWN";
    }
}

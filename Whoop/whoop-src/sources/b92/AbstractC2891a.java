package b92;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: b92.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"", "", "a", "(I)Ljava/lang/String;", "b", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2891a {
    /* JADX INFO: renamed from: a */
    public static final String m8453a(int i13) {
        if (i13 == 0) {
            return "DISCONNECTED";
        }
        if (i13 == 1) {
            return "CONNECTING";
        }
        if (i13 != 2) {
            return i13 != 3 ? AbstractC2875y.m8295h(i13, "OTHER STATE: ") : "DISCONNECTING";
        }
        return "CONNECTED";
    }

    /* JADX INFO: renamed from: b */
    public static final String m8454b(int i13) {
        switch (i13) {
            case 1:
                return "Scan already started";
            case 2:
                return "Application registration failed";
            case 3:
                return "Internal error";
            case 4:
                return "Feature unsupported";
            case 5:
                return "Out of hardware resources";
            case 6:
                return "SCAN_FAILED_SCANNING_TOO_FREQUENTLY";
            default:
                return "Unexpected error";
        }
    }
}

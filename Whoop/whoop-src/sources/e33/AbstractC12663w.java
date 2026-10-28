package e33;

import org.webrtc.Logging;

/* JADX INFO: renamed from: e33.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12663w {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43308a;

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
        try {
            iArr[Logging.Severity.LS_NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f43308a = iArr;
    }
}

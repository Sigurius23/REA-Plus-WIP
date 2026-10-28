package p33;

import stream.video.sfu.models.ErrorCode;

/* JADX INFO: renamed from: p33.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC28810c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f116634a;

    static {
        int[] iArr = new int[ErrorCode.values().length];
        try {
            iArr[ErrorCode.ERROR_CODE_PARTICIPANT_NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorCode.ERROR_CODE_PARTICIPANT_SIGNAL_LOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorCode.ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ErrorCode.ERROR_CODE_PARTICIPANT_RECONNECT_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ErrorCode.ERROR_CODE_CALL_NOT_FOUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f116634a = iArr;
    }
}

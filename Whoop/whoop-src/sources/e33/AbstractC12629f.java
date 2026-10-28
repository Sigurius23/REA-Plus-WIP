package e33;

import stream.video.sfu.models.ErrorCode;

/* JADX INFO: renamed from: e33.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12629f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43132a;

    static {
        int[] iArr = new int[ErrorCode.values().length];
        try {
            iArr[ErrorCode.ERROR_CODE_REQUEST_VALIDATION_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f43132a = iArr;
    }
}

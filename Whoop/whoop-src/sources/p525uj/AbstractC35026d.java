package p525uj;

import com.amplitude.android.engagement.types.ButtonType;

/* JADX INFO: renamed from: uj.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC35026d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f148214a;

    static {
        int[] iArr = new int[ButtonType.values().length];
        try {
            iArr[ButtonType.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonType.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonType.SNOOZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ButtonType.TERTIARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f148214a = iArr;
    }
}

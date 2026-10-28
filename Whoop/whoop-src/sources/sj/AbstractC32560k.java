package sj;

import com.amplitude.android.engagement.types.ContentAlignment;
import com.amplitude.android.engagement.types.StepCounterFormat;

/* JADX INFO: renamed from: sj.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC32560k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f134894a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f134895b;

    static {
        int[] iArr = new int[ContentAlignment.values().length];
        try {
            iArr[ContentAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f134894a = iArr;
        int[] iArr2 = new int[StepCounterFormat.values().length];
        try {
            iArr2[StepCounterFormat.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StepCounterFormat.VERBOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StepCounterFormat.DOTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f134895b = iArr2;
    }
}

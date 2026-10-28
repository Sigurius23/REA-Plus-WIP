package sj;

import com.amplitude.android.engagement.types.NudgeStepLayout;

/* JADX INFO: renamed from: sj.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC32554e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f134873a;

    static {
        int[] iArr = new int[NudgeStepLayout.values().length];
        try {
            iArr[NudgeStepLayout.CLASSIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NudgeStepLayout.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NudgeStepLayout.VERTICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f134873a = iArr;
    }
}

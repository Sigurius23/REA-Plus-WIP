package ki;

import android.widget.ImageView;

/* JADX INFO: renamed from: ki.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22499k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88198a;

    static {
        int[] iArr = new int[EnumC22495g.values().length];
        try {
            EnumC22495g[] enumC22495gArr = EnumC22495g.f88193w;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            EnumC22495g[] enumC22495gArr2 = EnumC22495g.f88193w;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            EnumC22495g[] enumC22495gArr3 = EnumC22495g.f88193w;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            EnumC22495g[] enumC22495gArr4 = EnumC22495g.f88193w;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            EnumC22495g[] enumC22495gArr5 = EnumC22495g.f88193w;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f88198a = iArr2;
    }
}

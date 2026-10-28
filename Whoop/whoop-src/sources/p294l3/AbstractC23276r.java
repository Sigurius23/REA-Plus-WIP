package p294l3;

import android.text.Layout;

/* JADX INFO: renamed from: l3.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC23276r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f92226a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f92226a = iArr;
    }
}

package p652yl;

import java.util.Arrays;
import p460rg.AbstractC31366a;

/* JADX INFO: renamed from: yl.c */
/* JADX INFO: loaded from: classes.dex */
public final class C39617c {
    /* JADX INFO: renamed from: a */
    public static final float m126593a(float f13, float[] fArr, float[] fArr2) {
        float f14;
        float f15;
        float f16;
        float fAbs = Math.abs(f13);
        float fSignum = Math.signum(f13);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i13 = -(iBinarySearch + 1);
        int i14 = i13 - 1;
        float f17 = 0.0f;
        if (i14 >= fArr.length - 1) {
            float f18 = fArr[fArr.length - 1];
            float f19 = fArr2[fArr.length - 1];
            if (f18 == 0.0f) {
                return 0.0f;
            }
            return (f19 / f18) * f13;
        }
        if (i14 == -1) {
            f14 = fArr[0];
            f15 = fArr2[0];
            f16 = 0.0f;
        } else {
            float f24 = fArr[i14];
            f14 = fArr[i13];
            f17 = fArr2[i14];
            f15 = fArr2[i13];
            f16 = f24;
        }
        return AbstractC31366a.m96469i(f17, f15, f16, f14, fAbs) * fSignum;
    }

    /* JADX INFO: renamed from: b */
    public static String m126594b(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}

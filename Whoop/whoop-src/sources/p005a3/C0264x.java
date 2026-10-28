package p005a3;

import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0264x {

    /* JADX INFO: renamed from: a */
    public int[] f902a;

    /* JADX INFO: renamed from: b */
    public int f903b;

    public C0264x() {
        this.f902a = new int[10];
    }

    /* JADX INFO: renamed from: a */
    public int m797a(int i13) {
        int i14 = this.f903b - 1;
        return i14 >= 0 ? this.f902a[i14] : i13;
    }

    /* JADX INFO: renamed from: b */
    public int m798b() {
        int[] iArr = this.f902a;
        int i13 = this.f903b - 1;
        this.f903b = i13;
        return iArr[i13];
    }

    /* JADX INFO: renamed from: c */
    public void m799c(int i13) {
        int[] iArrCopyOf = this.f902a;
        if (this.f903b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f902a = iArrCopyOf;
        }
        int i14 = this.f903b;
        this.f903b = i14 + 1;
        iArrCopyOf[i14] = i13;
    }

    /* JADX INFO: renamed from: d */
    public void m800d(int i13, int i14, int i15) {
        int i16 = this.f903b;
        int[] iArrCopyOf = this.f902a;
        int i17 = i16 + 3;
        if (i17 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f902a = iArrCopyOf;
        }
        iArrCopyOf[i16] = i13 + i15;
        iArrCopyOf[i16 + 1] = i14 + i15;
        iArrCopyOf[i16 + 2] = i15;
        this.f903b = i17;
    }

    /* JADX INFO: renamed from: e */
    public void m801e(int i13, int i14, int i15, int i16) {
        int i17 = this.f903b;
        int[] iArrCopyOf = this.f902a;
        int i18 = i17 + 4;
        if (i18 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f902a = iArrCopyOf;
        }
        iArrCopyOf[i17] = i13;
        iArrCopyOf[i17 + 1] = i14;
        iArrCopyOf[i17 + 2] = i15;
        iArrCopyOf[i17 + 3] = i16;
        this.f903b = i18;
    }

    /* JADX INFO: renamed from: f */
    public void m802f(int i13, int i14) {
        if (i13 < i14) {
            int i15 = i13 - 3;
            for (int i16 = i13; i16 < i14; i16 += 3) {
                int[] iArr = this.f902a;
                int i17 = iArr[i16];
                int i18 = iArr[i14];
                if (i17 < i18 || (i17 == i18 && iArr[i16 + 1] <= iArr[i14 + 1])) {
                    i15 += 3;
                    m803g(i15, i16);
                }
            }
            m803g(i15 + 3, i14);
            m802f(i13, i15);
            m802f(i15 + 6, i14);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m803g(int i13, int i14) {
        int[] iArr = this.f902a;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i13 + 1;
        int i17 = i14 + 1;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
        int i19 = i13 + 2;
        int i24 = i14 + 2;
        int i25 = iArr[i19];
        iArr[i19] = iArr[i24];
        iArr[i24] = i25;
    }

    public C0264x(int i13) {
        this.f902a = new int[i13];
    }
}

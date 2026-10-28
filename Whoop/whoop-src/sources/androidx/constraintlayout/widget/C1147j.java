package androidx.constraintlayout.widget;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C1147j {

    /* JADX INFO: renamed from: a */
    public int[] f5103a;

    /* JADX INFO: renamed from: b */
    public int[] f5104b;

    /* JADX INFO: renamed from: c */
    public int f5105c;

    /* JADX INFO: renamed from: d */
    public int[] f5106d;

    /* JADX INFO: renamed from: e */
    public float[] f5107e;

    /* JADX INFO: renamed from: f */
    public int f5108f;

    /* JADX INFO: renamed from: g */
    public int[] f5109g;

    /* JADX INFO: renamed from: h */
    public String[] f5110h;

    /* JADX INFO: renamed from: i */
    public int f5111i;

    /* JADX INFO: renamed from: j */
    public int[] f5112j;

    /* JADX INFO: renamed from: k */
    public boolean[] f5113k;

    /* JADX INFO: renamed from: l */
    public int f5114l;

    /* JADX INFO: renamed from: a */
    public final void m3629a(float f13, int i13) {
        int i14 = this.f5108f;
        int[] iArr = this.f5106d;
        if (i14 >= iArr.length) {
            this.f5106d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5107e;
            this.f5107e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5106d;
        int i15 = this.f5108f;
        iArr2[i15] = i13;
        float[] fArr2 = this.f5107e;
        this.f5108f = i15 + 1;
        fArr2[i15] = f13;
    }

    /* JADX INFO: renamed from: b */
    public final void m3630b(int i13, int i14) {
        int i15 = this.f5105c;
        int[] iArr = this.f5103a;
        if (i15 >= iArr.length) {
            this.f5103a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f5104b;
            this.f5104b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5103a;
        int i16 = this.f5105c;
        iArr3[i16] = i13;
        int[] iArr4 = this.f5104b;
        this.f5105c = i16 + 1;
        iArr4[i16] = i14;
    }

    /* JADX INFO: renamed from: c */
    public final void m3631c(int i13, String str) {
        int i14 = this.f5111i;
        int[] iArr = this.f5109g;
        if (i14 >= iArr.length) {
            this.f5109g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f5110h;
            this.f5110h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f5109g;
        int i15 = this.f5111i;
        iArr2[i15] = i13;
        String[] strArr2 = this.f5110h;
        this.f5111i = i15 + 1;
        strArr2[i15] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m3632d(int i13, boolean z4) {
        int i14 = this.f5114l;
        int[] iArr = this.f5112j;
        if (i14 >= iArr.length) {
            this.f5112j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f5113k;
            this.f5113k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f5112j;
        int i15 = this.f5114l;
        iArr2[i15] = i13;
        boolean[] zArr2 = this.f5113k;
        this.f5114l = i15 + 1;
        zArr2[i15] = z4;
    }
}

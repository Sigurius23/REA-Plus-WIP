package p183h4;

import ih0.AbstractC18489d0;
import java.util.Arrays;

/* JADX INFO: renamed from: h4.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C16834b {

    /* JADX INFO: renamed from: a */
    public int[] f64694a = new int[10];

    /* JADX INFO: renamed from: b */
    public int[] f64695b = new int[10];

    /* JADX INFO: renamed from: c */
    public int f64696c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f64697d = new int[10];

    /* JADX INFO: renamed from: e */
    public float[] f64698e = new float[10];

    /* JADX INFO: renamed from: f */
    public int f64699f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f64700g = new int[5];

    /* JADX INFO: renamed from: h */
    public String[] f64701h = new String[5];

    /* JADX INFO: renamed from: i */
    public int f64702i = 0;

    /* JADX INFO: renamed from: a */
    public final void m47438a(float f13, int i13) {
        int i14 = this.f64699f;
        int[] iArr = this.f64697d;
        if (i14 >= iArr.length) {
            this.f64697d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f64698e;
            this.f64698e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f64697d;
        int i15 = this.f64699f;
        iArr2[i15] = i13;
        float[] fArr2 = this.f64698e;
        this.f64699f = i15 + 1;
        fArr2[i15] = f13;
    }

    /* JADX INFO: renamed from: b */
    public final void m47439b(int i13, int i14) {
        int i15 = this.f64696c;
        int[] iArr = this.f64694a;
        if (i15 >= iArr.length) {
            this.f64694a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f64695b;
            this.f64695b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f64694a;
        int i16 = this.f64696c;
        iArr3[i16] = i13;
        int[] iArr4 = this.f64695b;
        this.f64696c = i16 + 1;
        iArr4[i16] = i14;
    }

    /* JADX INFO: renamed from: c */
    public final void m47440c(int i13, String str) {
        int i14 = this.f64702i;
        int[] iArr = this.f64700g;
        if (i14 >= iArr.length) {
            this.f64700g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f64701h;
            this.f64701h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f64700g;
        int i15 = this.f64702i;
        iArr2[i15] = i13;
        String[] strArr2 = this.f64701h;
        this.f64702i = i15 + 1;
        strArr2[i15] = str;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TypedBundle{mCountInt=");
        sb4.append(this.f64696c);
        sb4.append(", mCountFloat=");
        sb4.append(this.f64699f);
        sb4.append(", mCountString=");
        return AbstractC18489d0.m53371l(sb4, this.f64702i, ", mCountBoolean=0}");
    }
}

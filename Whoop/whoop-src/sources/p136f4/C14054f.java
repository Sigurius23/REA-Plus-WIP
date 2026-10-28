package p136f4;

import java.util.Arrays;

/* JADX INFO: renamed from: f4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C14054f implements Comparable {

    /* JADX INFO: renamed from: E */
    public float f50173E;

    /* JADX INFO: renamed from: L */
    public int f50180L;

    /* JADX INFO: renamed from: w */
    public boolean f50181w;

    /* JADX INFO: renamed from: x */
    public int f50182x = -1;

    /* JADX INFO: renamed from: y */
    public int f50183y = -1;

    /* JADX INFO: renamed from: z */
    public int f50184z = 0;

    /* JADX INFO: renamed from: F */
    public boolean f50174F = false;

    /* JADX INFO: renamed from: G */
    public final float[] f50175G = new float[9];

    /* JADX INFO: renamed from: H */
    public final float[] f50176H = new float[9];

    /* JADX INFO: renamed from: I */
    public C14050b[] f50177I = new C14050b[16];

    /* JADX INFO: renamed from: J */
    public int f50178J = 0;

    /* JADX INFO: renamed from: K */
    public int f50179K = 0;

    public C14054f(int i13) {
        this.f50180L = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m40016a(C14050b c14050b) {
        int i13 = 0;
        while (true) {
            int i14 = this.f50178J;
            if (i13 >= i14) {
                C14050b[] c14050bArr = this.f50177I;
                if (i14 >= c14050bArr.length) {
                    this.f50177I = (C14050b[]) Arrays.copyOf(c14050bArr, c14050bArr.length * 2);
                }
                C14050b[] c14050bArr2 = this.f50177I;
                int i15 = this.f50178J;
                c14050bArr2[i15] = c14050b;
                this.f50178J = i15 + 1;
                return;
            }
            if (this.f50177I[i13] == c14050b) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m40017b(C14050b c14050b) {
        int i13 = this.f50178J;
        int i14 = 0;
        while (i14 < i13) {
            if (this.f50177I[i14] == c14050b) {
                while (i14 < i13 - 1) {
                    C14050b[] c14050bArr = this.f50177I;
                    int i15 = i14 + 1;
                    c14050bArr[i14] = c14050bArr[i15];
                    i14 = i15;
                }
                this.f50178J--;
                return;
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m40018c() {
        this.f50180L = 5;
        this.f50184z = 0;
        this.f50182x = -1;
        this.f50183y = -1;
        this.f50173E = 0.0f;
        this.f50174F = false;
        int i13 = this.f50178J;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f50177I[i14] = null;
        }
        this.f50178J = 0;
        this.f50179K = 0;
        this.f50181w = false;
        Arrays.fill(this.f50176H, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f50182x - ((C14054f) obj).f50182x;
    }

    /* JADX INFO: renamed from: d */
    public final void m40019d(C14051c c14051c, float f13) {
        this.f50173E = f13;
        this.f50174F = true;
        int i13 = this.f50178J;
        this.f50183y = -1;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f50177I[i14].m39992h(c14051c, this, false);
        }
        this.f50178J = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m40020e(C14051c c14051c, C14050b c14050b) {
        int i13 = this.f50178J;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f50177I[i14].mo39993i(c14051c, c14050b, false);
        }
        this.f50178J = 0;
    }

    public final String toString() {
        return "" + this.f50182x;
    }
}

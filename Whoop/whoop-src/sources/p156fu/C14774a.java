package p156fu;

import java.util.Arrays;

/* JADX INFO: renamed from: fu.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14774a implements Cloneable {

    /* JADX INFO: renamed from: x */
    public int f54788x = 0;

    /* JADX INFO: renamed from: w */
    public int[] f54787w = new int[1];

    /* JADX INFO: renamed from: a */
    public final void m42383a(boolean z4) {
        m42385c(this.f54788x + 1);
        if (z4) {
            int[] iArr = this.f54787w;
            int i13 = this.f54788x;
            int i14 = i13 / 32;
            iArr[i14] = (1 << (i13 & 31)) | iArr[i14];
        }
        this.f54788x++;
    }

    /* JADX INFO: renamed from: b */
    public final void m42384b(int i13, int i14) {
        if (i14 < 0 || i14 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m42385c(this.f54788x + i14);
        while (i14 > 0) {
            boolean z4 = true;
            if (((i13 >> (i14 - 1)) & 1) != 1) {
                z4 = false;
            }
            m42383a(z4);
            i14--;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m42385c(int i13) {
        int[] iArr = this.f54787w;
        if (i13 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i13 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f54787w = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f54787w.clone();
        int i13 = this.f54788x;
        C14774a c14774a = new C14774a();
        c14774a.f54787w = iArr;
        c14774a.f54788x = i13;
        return c14774a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m42386d(int i13) {
        return ((1 << (i13 & 31)) & this.f54787w[i13 / 32]) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m42387e() {
        return (this.f54788x + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14774a)) {
            return false;
        }
        C14774a c14774a = (C14774a) obj;
        return this.f54788x == c14774a.f54788x && Arrays.equals(this.f54787w, c14774a.f54787w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54787w) + (this.f54788x * 31);
    }

    public final String toString() {
        int i13 = this.f54788x;
        StringBuilder sb4 = new StringBuilder((i13 / 8) + i13 + 1);
        for (int i14 = 0; i14 < this.f54788x; i14++) {
            if ((i14 & 7) == 0) {
                sb4.append(' ');
            }
            sb4.append(m42386d(i14) ? 'X' : '.');
        }
        return sb4.toString();
    }
}

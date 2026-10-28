package p156fu;

import java.util.Arrays;

/* JADX INFO: renamed from: fu.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14775b implements Cloneable {

    /* JADX INFO: renamed from: w */
    public final int f54789w;

    /* JADX INFO: renamed from: x */
    public final int f54790x;

    /* JADX INFO: renamed from: y */
    public final int f54791y;

    /* JADX INFO: renamed from: z */
    public final int[] f54792z;

    public C14775b(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f54789w = i13;
        this.f54790x = i14;
        int i15 = (i13 + 31) / 32;
        this.f54791y = i15;
        this.f54792z = new int[i15 * i14];
    }

    public final Object clone() {
        return new C14775b(this.f54789w, this.f54790x, this.f54791y, (int[]) this.f54792z.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14775b)) {
            return false;
        }
        C14775b c14775b = (C14775b) obj;
        return this.f54789w == c14775b.f54789w && this.f54790x == c14775b.f54790x && this.f54791y == c14775b.f54791y && Arrays.equals(this.f54792z, c14775b.f54792z);
    }

    public final int hashCode() {
        int i13 = this.f54789w;
        return Arrays.hashCode(this.f54792z) + (((((((i13 * 31) + i13) * 31) + this.f54790x) * 31) + this.f54791y) * 31);
    }

    public final String toString() {
        int i13 = this.f54789w;
        int i14 = this.f54790x;
        StringBuilder sb4 = new StringBuilder((i13 + 1) * i14);
        for (int i15 = 0; i15 < i14; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                sb4.append(((this.f54792z[(i16 / 32) + (this.f54791y * i15)] >>> (i16 & 31)) & 1) != 0 ? "X " : "  ");
            }
            sb4.append("\n");
        }
        return sb4.toString();
    }

    public C14775b(int i13, int i14, int i15, int[] iArr) {
        this.f54789w = i13;
        this.f54790x = i14;
        this.f54791y = i15;
        this.f54792z = iArr;
    }
}

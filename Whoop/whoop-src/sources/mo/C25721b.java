package mo;

import java.util.Arrays;
import p465rm.InterfaceC31529f;

/* JADX INFO: renamed from: mo.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25721b implements InterfaceC31529f {

    /* JADX INFO: renamed from: E */
    public int f101325E;

    /* JADX INFO: renamed from: w */
    public final int f101326w;

    /* JADX INFO: renamed from: x */
    public final int f101327x;

    /* JADX INFO: renamed from: y */
    public final int f101328y;

    /* JADX INFO: renamed from: z */
    public final byte[] f101329z;

    public C25721b(int i13, int i14, int i15, byte[] bArr) {
        this.f101326w = i13;
        this.f101327x = i14;
        this.f101328y = i15;
        this.f101329z = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static int m75838a(int i13) {
        if (i13 == 1) {
            return 1;
        }
        if (i13 != 9) {
            return (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25721b.class == obj.getClass()) {
            C25721b c25721b = (C25721b) obj;
            if (this.f101326w == c25721b.f101326w && this.f101327x == c25721b.f101327x && this.f101328y == c25721b.f101328y && Arrays.equals(this.f101329z, c25721b.f101329z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f101325E == 0) {
            this.f101325E = Arrays.hashCode(this.f101329z) + ((((((527 + this.f101326w) * 31) + this.f101327x) * 31) + this.f101328y) * 31);
        }
        return this.f101325E;
    }

    public final String toString() {
        boolean z4 = this.f101329z != null;
        StringBuilder sb4 = new StringBuilder(55);
        sb4.append("ColorInfo(");
        sb4.append(this.f101326w);
        sb4.append(", ");
        sb4.append(this.f101327x);
        sb4.append(", ");
        sb4.append(this.f101328y);
        sb4.append(", ");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }
}

package p499t9;

import java.util.Arrays;

/* JADX INFO: renamed from: t9.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33637j0 {

    /* JADX INFO: renamed from: a */
    public final int f140398a;

    /* JADX INFO: renamed from: b */
    public final byte[] f140399b;

    /* JADX INFO: renamed from: c */
    public final int f140400c;

    /* JADX INFO: renamed from: d */
    public final int f140401d;

    public C33637j0(int i13, int i14, int i15, byte[] bArr) {
        this.f140398a = i13;
        this.f140399b = bArr;
        this.f140400c = i14;
        this.f140401d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33637j0.class == obj.getClass()) {
            C33637j0 c33637j0 = (C33637j0) obj;
            if (this.f140398a == c33637j0.f140398a && this.f140400c == c33637j0.f140400c && this.f140401d == c33637j0.f140401d && Arrays.equals(this.f140399b, c33637j0.f140399b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f140399b) + (this.f140398a * 31)) * 31) + this.f140400c) * 31) + this.f140401d;
    }
}

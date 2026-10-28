package p588wm;

import java.util.Arrays;

/* JADX INFO: renamed from: wm.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C37376r {

    /* JADX INFO: renamed from: a */
    public final int f159872a;

    /* JADX INFO: renamed from: b */
    public final byte[] f159873b;

    /* JADX INFO: renamed from: c */
    public final int f159874c;

    /* JADX INFO: renamed from: d */
    public final int f159875d;

    public C37376r(int i13, int i14, int i15, byte[] bArr) {
        this.f159872a = i13;
        this.f159873b = bArr;
        this.f159874c = i14;
        this.f159875d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C37376r.class == obj.getClass()) {
            C37376r c37376r = (C37376r) obj;
            if (this.f159872a == c37376r.f159872a && this.f159874c == c37376r.f159874c && this.f159875d == c37376r.f159875d && Arrays.equals(this.f159873b, c37376r.f159873b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f159873b) + (this.f159872a * 31)) * 31) + this.f159874c) * 31) + this.f159875d;
    }
}

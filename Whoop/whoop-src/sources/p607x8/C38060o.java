package p607x8;

import va3.AbstractC35849g;

/* JADX INFO: renamed from: x8.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C38060o {

    /* JADX INFO: renamed from: c */
    public static final C38060o f163020c = new C38060o(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f163021a;

    /* JADX INFO: renamed from: b */
    public final int f163022b;

    static {
        new C38060o(0, 0);
    }

    public C38060o(int i13, int i14) {
        AbstractC35849g.m113802d((i13 == -1 || i13 >= 0) && (i14 == -1 || i14 >= 0));
        this.f163021a = i13;
        this.f163022b = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38060o) {
            C38060o c38060o = (C38060o) obj;
            if (this.f163021a == c38060o.f163021a && this.f163022b == c38060o.f163022b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f163021a;
        return ((i13 >>> 16) | (i13 << 16)) ^ this.f163022b;
    }

    public final String toString() {
        return this.f163021a + "x" + this.f163022b;
    }
}

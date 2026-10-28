package l83;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C23461g implements Comparable {

    /* JADX INFO: renamed from: z */
    public static final C23461g f92929z = new C23461g(2, 3, 0);

    /* JADX INFO: renamed from: w */
    public final int f92930w;

    /* JADX INFO: renamed from: x */
    public final int f92931x;

    /* JADX INFO: renamed from: y */
    public final int f92932y;

    public C23461g(int i13, int i14, int i15) {
        this.f92930w = i13;
        this.f92931x = i14;
        if (i13 >= 0 && i13 < 256 && i14 >= 0 && i14 < 256) {
            this.f92932y = (i13 << 16) + (i14 << 8);
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i13 + '.' + i14 + ".0").toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23461g other = (C23461g) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f92932y - other.f92932y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C23461g c23461g = obj instanceof C23461g ? (C23461g) obj : null;
        return c23461g != null && this.f92932y == c23461g.f92932y;
    }

    public final int hashCode() {
        return this.f92932y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f92930w);
        sb4.append('.');
        return AbstractC18489d0.m53371l(sb4, this.f92931x, ".0");
    }
}

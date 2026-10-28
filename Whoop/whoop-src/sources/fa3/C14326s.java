package fa3;

import l83.C23461g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fa3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C14326s {

    /* JADX INFO: renamed from: d */
    public static final C14326s f52293d = new C14326s(EnumC14304b0.STRICT, 6);

    /* JADX INFO: renamed from: a */
    public final EnumC14304b0 f52294a;

    /* JADX INFO: renamed from: b */
    public final C23461g f52295b;

    /* JADX INFO: renamed from: c */
    public final EnumC14304b0 f52296c;

    public C14326s(EnumC14304b0 enumC14304b0, C23461g c23461g, EnumC14304b0 enumC14304b1) {
        this.f52294a = enumC14304b0;
        this.f52295b = c23461g;
        this.f52296c = enumC14304b1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14326s)) {
            return false;
        }
        C14326s c14326s = (C14326s) obj;
        return this.f52294a == c14326s.f52294a && AbstractC22676k.m65745e(this.f52295b, c14326s.f52295b) && this.f52296c == c14326s.f52296c;
    }

    public final int hashCode() {
        int iHashCode = this.f52294a.hashCode() * 31;
        C23461g c23461g = this.f52295b;
        return this.f52296c.hashCode() + ((iHashCode + (c23461g == null ? 0 : c23461g.f92932y)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f52294a + ", sinceVersion=" + this.f52295b + ", reportLevelAfter=" + this.f52296c + ')';
    }

    public C14326s(EnumC14304b0 enumC14304b0, int i13) {
        this(enumC14304b0, (i13 & 2) != 0 ? new C23461g(1, 0, 0) : null, enumC14304b0);
    }
}

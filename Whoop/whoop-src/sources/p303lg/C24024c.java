package p303lg;

import kg.C22450d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lg.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24024c extends AbstractC24025d {

    /* JADX INFO: renamed from: E */
    public final int f94892E;

    /* JADX INFO: renamed from: x */
    public final C22450d f94893x;

    /* JADX INFO: renamed from: y */
    public final C24024c f94894y;

    /* JADX INFO: renamed from: z */
    public final boolean f94895z;

    public C24024c(C22450d c22450d, C24024c c24024c, boolean z4) {
        this.f94893x = c22450d;
        this.f94894y = c24024c;
        this.f94895z = z4;
        this.f94892E = (c24024c != null ? c24024c.f94892E : 0) + 1;
    }

    /* JADX INFO: renamed from: r0 */
    public static C24024c m70880r0(C24024c c24024c) {
        return new C24024c(c24024c.f94893x, c24024c.f94894y, true);
    }

    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: Q */
    public final int mo70879Q() {
        return this.f94892E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24024c)) {
            return false;
        }
        C24024c c24024c = (C24024c) obj;
        return this.f94893x.equals(c24024c.f94893x) && AbstractC22676k.m65745e(this.f94894y, c24024c.f94894y) && this.f94895z == c24024c.f94895z;
    }

    public final int hashCode() {
        int iHashCode = this.f94893x.hashCode() * 31;
        C24024c c24024c = this.f94894y;
        return Boolean.hashCode(this.f94895z) + ((iHashCode + (c24024c == null ? 0 : c24024c.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("OpenTag(name=");
        sb4.append(this.f94893x);
        sb4.append(", parent=");
        sb4.append(this.f94894y);
        sb4.append(", seenChildren=");
        return AbstractC2875y.m8305r(sb4, this.f94895z, ')');
    }
}

package p303lg;

import kg.C22450d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lg.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24023b extends AbstractC24025d {

    /* JADX INFO: renamed from: x */
    public final C22450d f94889x;

    /* JADX INFO: renamed from: y */
    public final C24024c f94890y;

    /* JADX INFO: renamed from: z */
    public final int f94891z;

    public C24023b(C22450d c22450d, C24024c c24024c) {
        this.f94889x = c22450d;
        this.f94890y = c24024c;
        this.f94891z = (c24024c != null ? c24024c.f94892E : 0) + 1;
    }

    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: Q */
    public final int mo70879Q() {
        return this.f94891z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24023b)) {
            return false;
        }
        C24023b c24023b = (C24023b) obj;
        return AbstractC22676k.m65745e(this.f94889x, c24023b.f94889x) && AbstractC22676k.m65745e(this.f94890y, c24023b.f94890y);
    }

    public final int hashCode() {
        int iHashCode = this.f94889x.hashCode() * 31;
        C24024c c24024c = this.f94890y;
        return iHashCode + (c24024c == null ? 0 : c24024c.hashCode());
    }

    public final String toString() {
        return "EmptyTag(name=" + this.f94889x + ", parent=" + this.f94890y + ')';
    }
}

package p40;

import p000.AbstractC11266d;
import p208i2.AbstractC17921y;
import p208i2.C17903p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C28826a {

    /* JADX INFO: renamed from: a */
    public final int f116697a;

    /* JADX INFO: renamed from: b */
    public final int f116698b;

    /* JADX INFO: renamed from: c */
    public final AbstractC17921y f116699c;

    public C28826a(int i13, int i14, C17903p c17903p) {
        this.f116697a = i13;
        this.f116698b = i14;
        this.f116699c = c17903p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28826a)) {
            return false;
        }
        C28826a c28826a = (C28826a) obj;
        return this.f116697a == c28826a.f116697a && this.f116698b == c28826a.f116698b && AbstractC22676k.m65745e(this.f116699c, c28826a.f116699c);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f116698b, Integer.hashCode(this.f116697a) * 31, 31);
        AbstractC17921y abstractC17921y = this.f116699c;
        return iM30448b + (abstractC17921y == null ? 0 : abstractC17921y.hashCode());
    }

    public final String toString() {
        StringBuilder sbM30465s = AbstractC11266d.m30465s(this.f116697a, this.f116698b, "Drawable(id=", ", contentDescription=", ", colorFilter=");
        sbM30465s.append(this.f116699c);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}

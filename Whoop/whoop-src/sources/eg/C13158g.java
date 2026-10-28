package eg;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eg.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C13158g extends AbstractC13160i {

    /* JADX INFO: renamed from: a */
    public final int f45582a;

    /* JADX INFO: renamed from: b */
    public final Throwable f45583b;

    public C13158g(int i13, Throwable th3) {
        this.f45582a = i13;
        this.f45583b = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13158g)) {
            return false;
        }
        C13158g c13158g = (C13158g) obj;
        return this.f45582a == c13158g.f45582a && AbstractC22676k.m65745e(this.f45583b, c13158g.f45583b);
    }

    public final int hashCode() {
        return this.f45583b.hashCode() + (Integer.hashCode(this.f45582a) * 31);
    }

    public final String toString() {
        return "Exception(attempts=" + this.f45582a + ", exception=" + this.f45583b + ')';
    }
}

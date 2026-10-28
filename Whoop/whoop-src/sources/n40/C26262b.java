package n40;

import p114eb.C12982q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26262b {

    /* JADX INFO: renamed from: a */
    public final C12982q f104418a;

    /* JADX INFO: renamed from: b */
    public final C12982q f104419b;

    public C26262b(C12982q c12982q, C12982q c12982q2) {
        this.f104418a = c12982q;
        this.f104419b = c12982q2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26262b)) {
            return false;
        }
        C26262b c26262b = (C26262b) obj;
        return AbstractC22676k.m65745e(this.f104418a, c26262b.f104418a) && AbstractC22676k.m65745e(this.f104419b, c26262b.f104419b);
    }

    public final int hashCode() {
        C12982q c12982q = this.f104418a;
        int iHashCode = (c12982q == null ? 0 : c12982q.hashCode()) * 31;
        C12982q c12982q2 = this.f104419b;
        return iHashCode + (c12982q2 != null ? c12982q2.hashCode() : 0);
    }

    public final String toString() {
        return "NavBackStackEntryUpdate(previousBackStackEntry=" + this.f104418a + ", currentBackStackEntry=" + this.f104419b + ")";
    }
}

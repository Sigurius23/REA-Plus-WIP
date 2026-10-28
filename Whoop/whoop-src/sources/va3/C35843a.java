package va3;

import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: va3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35843a {

    /* JADX INFO: renamed from: a */
    public final C35847e f152607a;

    /* JADX INFO: renamed from: b */
    public final C35850h f152608b;

    static {
        C35850h c35850h = AbstractC35852j.f152629f;
        C35847e c35847e = C35847e.f152612c;
        AbstractC35846d.m113785j(c35850h);
    }

    public C35843a(C35847e packageName, C35850h c35850h) {
        AbstractC22676k.m65750j(packageName, "packageName");
        this.f152607a = packageName;
        this.f152608b = c35850h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35843a)) {
            return false;
        }
        C35843a c35843a = (C35843a) obj;
        return AbstractC22676k.m65745e(this.f152607a, c35843a.f152607a) && this.f152608b.equals(c35843a.f152608b);
    }

    public final int hashCode() {
        return this.f152608b.hashCode() + ((this.f152607a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return AbstractC39421y.m125927L(this.f152607a.f152613a.f152616a, '.', '/') + "/" + this.f152608b;
    }
}

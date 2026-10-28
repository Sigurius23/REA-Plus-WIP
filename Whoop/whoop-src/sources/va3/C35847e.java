package va3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: va3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C35847e {

    /* JADX INFO: renamed from: c */
    public static final C35847e f152612c = new C35847e("");

    /* JADX INFO: renamed from: a */
    public final C35848f f152613a;

    /* JADX INFO: renamed from: b */
    public transient C35847e f152614b;

    public C35847e(String fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        this.f152613a = new C35848f(fqName, this);
    }

    /* JADX INFO: renamed from: a */
    public final C35847e m113788a(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return new C35847e(this.f152613a.m113791a(name), this);
    }

    /* JADX INFO: renamed from: b */
    public final C35847e m113789b() {
        C35847e c35847e = this.f152614b;
        if (c35847e != null) {
            return c35847e;
        }
        C35848f c35848f = this.f152613a;
        if (c35848f.m113793c()) {
            throw new IllegalStateException("root");
        }
        C35847e c35847e2 = new C35847e(c35848f.m113795e());
        this.f152614b = c35847e2;
        return c35847e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35847e) {
            return AbstractC22676k.m65745e(this.f152613a, ((C35847e) obj).f152613a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f152613a.f152616a.hashCode();
    }

    public final String toString() {
        return this.f152613a.toString();
    }

    public C35847e(C35848f c35848f) {
        this.f152613a = c35848f;
    }

    public C35847e(C35848f c35848f, C35847e c35847e) {
        this.f152613a = c35848f;
        this.f152614b = c35847e;
    }
}

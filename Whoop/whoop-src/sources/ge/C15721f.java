package ge;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge.f */
/* JADX INFO: loaded from: classes.dex */
public final class C15721f {

    /* JADX INFO: renamed from: a */
    public final String f59228a;

    /* JADX INFO: renamed from: b */
    public final String f59229b;

    public C15721f(String name, String version) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(version, "version");
        this.f59228a = name;
        this.f59229b = version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15721f)) {
            return false;
        }
        C15721f c15721f = (C15721f) obj;
        return AbstractC22676k.m65745e(this.f59228a, c15721f.f59228a) && AbstractC22676k.m65745e(this.f59229b, c15721f.f59229b);
    }

    public final int hashCode() {
        return this.f59229b.hashCode() + (this.f59228a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC15719d.m44301b("lib", this.f59228a, this.f59229b);
    }
}

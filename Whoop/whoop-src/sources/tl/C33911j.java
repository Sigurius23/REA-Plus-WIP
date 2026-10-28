package tl;

/* JADX INFO: renamed from: tl.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C33911j {

    /* JADX INFO: renamed from: a */
    public Class f142089a;

    /* JADX INFO: renamed from: b */
    public Class f142090b;

    /* JADX INFO: renamed from: c */
    public Class f142091c;

    public C33911j(Class cls, Class cls2, Class cls3) {
        m107265a(cls, cls2, cls3);
    }

    /* JADX INFO: renamed from: a */
    public final void m107265a(Class cls, Class cls2, Class cls3) {
        this.f142089a = cls;
        this.f142090b = cls2;
        this.f142091c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33911j.class != obj.getClass()) {
            return false;
        }
        C33911j c33911j = (C33911j) obj;
        return this.f142089a.equals(c33911j.f142089a) && this.f142090b.equals(c33911j.f142090b) && AbstractC33913l.m107266a(this.f142091c, c33911j.f142091c);
    }

    public final int hashCode() {
        int iHashCode = (this.f142090b.hashCode() + (this.f142089a.hashCode() * 31)) * 31;
        Class cls = this.f142091c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f142089a + ", second=" + this.f142090b + '}';
    }
}

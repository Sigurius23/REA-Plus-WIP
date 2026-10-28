package gt;

/* JADX INFO: renamed from: gt.p */
/* JADX INFO: loaded from: classes.dex */
public final class C16177p {

    /* JADX INFO: renamed from: a */
    public final Class f61466a;

    /* JADX INFO: renamed from: b */
    public final Class f61467b;

    public C16177p(Class cls, Class cls2) {
        this.f61466a = cls;
        this.f61467b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static C16177p m45715a(Class cls) {
        return new C16177p(InterfaceC16176o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16177p.class != obj.getClass()) {
            return false;
        }
        C16177p c16177p = (C16177p) obj;
        if (this.f61467b.equals(c16177p.f61467b)) {
            return this.f61466a.equals(c16177p.f61466a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61466a.hashCode() + (this.f61467b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f61467b;
        Class cls2 = this.f61466a;
        if (cls2 == InterfaceC16176o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}

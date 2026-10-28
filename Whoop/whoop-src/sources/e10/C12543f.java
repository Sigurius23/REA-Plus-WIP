package e10;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12543f implements InterfaceC12549i {

    /* JADX INFO: renamed from: a */
    public final Throwable f42854a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f42855b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12573u f42856c;

    public C12543f(Throwable cause, InterfaceC41211c interfaceC41211c, InterfaceC12573u interfaceC12573u) {
        AbstractC22676k.m65750j(cause, "cause");
        this.f42854a = cause;
        this.f42855b = interfaceC41211c;
        this.f42856c = interfaceC12573u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12543f)) {
            return false;
        }
        C12543f c12543f = (C12543f) obj;
        return AbstractC22676k.m65745e(this.f42854a, c12543f.f42854a) && AbstractC22676k.m65745e(this.f42855b, c12543f.f42855b) && AbstractC22676k.m65745e(this.f42856c, c12543f.f42856c);
    }

    public final int hashCode() {
        return this.f42856c.hashCode() + ((this.f42855b.hashCode() + (this.f42854a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Failed(cause=" + this.f42854a + ", message=" + this.f42855b + ", type=" + this.f42856c + ")";
    }
}

package e10;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12535b implements InterfaceC12539d {

    /* JADX INFO: renamed from: a */
    public final Throwable f42839a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f42840b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12573u f42841c;

    public C12535b(Throwable th3, InterfaceC41211c message, InterfaceC12573u interfaceC12573u) {
        AbstractC22676k.m65750j(message, "message");
        this.f42839a = th3;
        this.f42840b = message;
        this.f42841c = interfaceC12573u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12535b)) {
            return false;
        }
        C12535b c12535b = (C12535b) obj;
        return AbstractC22676k.m65745e(this.f42839a, c12535b.f42839a) && AbstractC22676k.m65745e(this.f42840b, c12535b.f42840b) && AbstractC22676k.m65745e(this.f42841c, c12535b.f42841c);
    }

    public final int hashCode() {
        return this.f42841c.hashCode() + ((this.f42840b.hashCode() + (this.f42839a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Fail(cause=" + this.f42839a + ", message=" + this.f42840b + ", errorType=" + this.f42841c + ")";
    }
}

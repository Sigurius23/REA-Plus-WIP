package e10;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12540d0 implements InterfaceC12544f0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f42848a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f42849b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12573u f42850c;

    public C12540d0(Throwable th3, InterfaceC41211c message, InterfaceC12573u interfaceC12573u) {
        AbstractC22676k.m65750j(message, "message");
        this.f42848a = th3;
        this.f42849b = message;
        this.f42850c = interfaceC12573u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12540d0)) {
            return false;
        }
        C12540d0 c12540d0 = (C12540d0) obj;
        return AbstractC22676k.m65745e(this.f42848a, c12540d0.f42848a) && AbstractC22676k.m65745e(this.f42849b, c12540d0.f42849b) && AbstractC22676k.m65745e(this.f42850c, c12540d0.f42850c);
    }

    public final int hashCode() {
        return this.f42850c.hashCode() + ((this.f42849b.hashCode() + (this.f42848a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Fail(cause=" + this.f42848a + ", message=" + this.f42849b + ", errorType=" + this.f42850c + ")";
    }
}

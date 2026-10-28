package e10;

import p442qy.C30765d;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C12575v implements InterfaceC12578x {

    /* JADX INFO: renamed from: a */
    public final Throwable f42944a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f42945b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12573u f42946c;

    public C12575v(Throwable cause, InterfaceC41211c message, InterfaceC12573u interfaceC12573u) {
        AbstractC22676k.m65750j(cause, "cause");
        AbstractC22676k.m65750j(message, "message");
        this.f42944a = cause;
        this.f42945b = message;
        this.f42946c = interfaceC12573u;
    }

    @Override // e10.InterfaceC12578x
    /* JADX INFO: renamed from: a */
    public final void mo35243a(C30765d logger) {
        AbstractC22676k.m65750j(logger, "logger");
        logger.m94512b("ConfirmationHandler.Result.Failed", this.f42944a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12575v)) {
            return false;
        }
        C12575v c12575v = (C12575v) obj;
        return AbstractC22676k.m65745e(this.f42944a, c12575v.f42944a) && AbstractC22676k.m65745e(this.f42945b, c12575v.f42945b) && AbstractC22676k.m65745e(this.f42946c, c12575v.f42946c);
    }

    public final int hashCode() {
        return this.f42946c.hashCode() + ((this.f42945b.hashCode() + (this.f42944a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Failed(cause=" + this.f42944a + ", message=" + this.f42945b + ", type=" + this.f42946c + ")";
    }
}

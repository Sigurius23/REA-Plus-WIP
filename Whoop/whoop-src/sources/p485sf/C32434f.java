package p485sf;

import p091dg.C12002a;
import p551vf.InterfaceC35936a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wf.C37236a;

/* JADX INFO: renamed from: sf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C32434f {

    /* JADX INFO: renamed from: a */
    public final Object f134270a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC35936a f134271b;

    /* JADX INFO: renamed from: c */
    public C37236a f134272c;

    /* JADX INFO: renamed from: d */
    public final C12002a f134273d;

    public C32434f(Object obj, InterfaceC35936a protocolRequest, C37236a c37236a, C12002a executionContext) {
        AbstractC22676k.m65750j(protocolRequest, "protocolRequest");
        AbstractC22676k.m65750j(executionContext, "executionContext");
        this.f134270a = obj;
        this.f134271b = protocolRequest;
        this.f134272c = c37236a;
        this.f134273d = executionContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32434f)) {
            return false;
        }
        C32434f c32434f = (C32434f) obj;
        return AbstractC22676k.m65745e(this.f134270a, c32434f.f134270a) && AbstractC22676k.m65745e(this.f134271b, c32434f.f134271b) && AbstractC22676k.m65745e(this.f134272c, c32434f.f134272c) && AbstractC22676k.m65745e(this.f134273d, c32434f.f134273d);
    }

    public final int hashCode() {
        Object obj = this.f134270a;
        return this.f134273d.hashCode() + ((this.f134272c.hashCode() + ((this.f134271b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HttpProtocolResponseInterceptorContext(request=" + this.f134270a + ", protocolRequest=" + this.f134271b + ", protocolResponse=" + this.f134272c + ", executionContext=" + this.f134273d + ')';
    }
}

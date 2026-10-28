package p485sf;

import p091dg.C12002a;
import p551vf.InterfaceC35936a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sf.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32433e {

    /* JADX INFO: renamed from: a */
    public final Object f134267a;

    /* JADX INFO: renamed from: b */
    public InterfaceC35936a f134268b;

    /* JADX INFO: renamed from: c */
    public final C12002a f134269c;

    public C32433e(Object obj, InterfaceC35936a protocolRequest, C12002a executionContext) {
        AbstractC22676k.m65750j(protocolRequest, "protocolRequest");
        AbstractC22676k.m65750j(executionContext, "executionContext");
        this.f134267a = obj;
        this.f134268b = protocolRequest;
        this.f134269c = executionContext;
    }

    /* JADX INFO: renamed from: a */
    public final C12002a m101254a() {
        return this.f134269c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC35936a m101255b() {
        return this.f134268b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32433e)) {
            return false;
        }
        C32433e c32433e = (C32433e) obj;
        return AbstractC22676k.m65745e(this.f134267a, c32433e.f134267a) && AbstractC22676k.m65745e(this.f134268b, c32433e.f134268b) && AbstractC22676k.m65745e(this.f134269c, c32433e.f134269c);
    }

    public final int hashCode() {
        Object obj = this.f134267a;
        return this.f134269c.hashCode() + ((this.f134268b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "HttpProtocolRequestInterceptorContext(request=" + this.f134267a + ", protocolRequest=" + this.f134268b + ", executionContext=" + this.f134269c + ')';
    }
}

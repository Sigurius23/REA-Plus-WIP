package p551vf;

import cg.C4560o;
import p326mf.AbstractC25492l;
import p326mf.EnumC25498r;
import p326mf.InterfaceC25482b;
import p326mf.InterfaceC25488h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vf.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35943h implements InterfaceC35936a {

    /* JADX INFO: renamed from: a */
    public final EnumC25498r f153039a;

    /* JADX INFO: renamed from: b */
    public final C4560o f153040b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC25488h f153041c;

    /* JADX INFO: renamed from: d */
    public final AbstractC25492l f153042d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC25482b f153043e;

    public C35943h(EnumC25498r method, C4560o c4560o, InterfaceC25488h interfaceC25488h, AbstractC25492l body, InterfaceC25482b interfaceC25482b) {
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(body, "body");
        this.f153039a = method;
        this.f153040b = c4560o;
        this.f153041c = interfaceC25488h;
        this.f153042d = body;
        this.f153043e = interfaceC25482b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35943h)) {
            return false;
        }
        C35943h c35943h = (C35943h) obj;
        return this.f153039a == c35943h.f153039a && AbstractC22676k.m65745e(this.f153040b, c35943h.f153040b) && AbstractC22676k.m65745e(this.f153041c, c35943h.f153041c) && AbstractC22676k.m65745e(this.f153042d, c35943h.f153042d) && AbstractC22676k.m65745e(this.f153043e, c35943h.f153043e);
    }

    @Override // p551vf.InterfaceC35936a
    public final AbstractC25492l getBody() {
        return this.f153042d;
    }

    @Override // p551vf.InterfaceC35936a
    public final InterfaceC25488h getHeaders() {
        return this.f153041c;
    }

    @Override // p551vf.InterfaceC35936a
    public final EnumC25498r getMethod() {
        return this.f153039a;
    }

    @Override // p551vf.InterfaceC35936a
    public final C4560o getUrl() {
        return this.f153040b;
    }

    public final int hashCode() {
        return this.f153043e.hashCode() + ((this.f153042d.hashCode() + ((this.f153041c.hashCode() + ((this.f153040b.hashCode() + (this.f153039a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RealHttpRequest(method=" + this.f153039a + ", url=" + this.f153040b + ", headers=" + this.f153041c + ", body=" + this.f153042d + ", trailingHeaders=" + this.f153043e + ')';
    }
}

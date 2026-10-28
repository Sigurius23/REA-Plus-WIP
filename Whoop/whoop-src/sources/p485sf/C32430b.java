package p485sf;

import l83.C23468n;
import p091dg.C12002a;
import p551vf.C35942g;
import p551vf.InterfaceC35936a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wf.C37236a;

/* JADX INFO: renamed from: sf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32430b {

    /* JADX INFO: renamed from: a */
    public final Object f134256a;

    /* JADX INFO: renamed from: b */
    public Object f134257b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC35936a f134258c;

    /* JADX INFO: renamed from: d */
    public final C37236a f134259d;

    /* JADX INFO: renamed from: e */
    public final C12002a f134260e;

    public C32430b(Object obj, Object obj2, C35942g c35942g, C37236a c37236a, C12002a executionContext) {
        AbstractC22676k.m65750j(executionContext, "executionContext");
        this.f134256a = obj;
        this.f134257b = obj2;
        this.f134258c = c35942g;
        this.f134259d = c37236a;
        this.f134260e = executionContext;
    }

    /* JADX INFO: renamed from: a */
    public final Object m101253a() {
        return this.f134257b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32430b)) {
            return false;
        }
        C32430b c32430b = (C32430b) obj;
        return AbstractC22676k.m65745e(this.f134256a, c32430b.f134256a) && AbstractC22676k.m65745e(this.f134257b, c32430b.f134257b) && AbstractC22676k.m65745e(this.f134258c, c32430b.f134258c) && AbstractC22676k.m65745e(this.f134259d, c32430b.f134259d) && AbstractC22676k.m65745e(this.f134260e, c32430b.f134260e);
    }

    public final int hashCode() {
        Object obj = this.f134256a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f134257b;
        int iHashCode2 = ((obj2 == null ? 0 : obj2.hashCode()) + iHashCode) * 31;
        InterfaceC35936a interfaceC35936a = this.f134258c;
        int iHashCode3 = (iHashCode2 + (interfaceC35936a == null ? 0 : interfaceC35936a.hashCode())) * 31;
        C37236a c37236a = this.f134259d;
        return this.f134260e.hashCode() + ((iHashCode3 + (c37236a != null ? c37236a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HttpFinalInterceptorContext(request=" + this.f134256a + ", response=" + ((Object) C23468n.m68038b(this.f134257b)) + ", protocolRequest=" + this.f134258c + ", protocolResponse=" + this.f134259d + ", executionContext=" + this.f134260e + ')';
    }
}

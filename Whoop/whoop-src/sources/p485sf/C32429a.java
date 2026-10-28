package p485sf;

import l83.C23468n;
import p091dg.C12002a;
import p551vf.InterfaceC35936a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wf.C37236a;

/* JADX INFO: renamed from: sf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32429a {

    /* JADX INFO: renamed from: a */
    public final Object f134251a;

    /* JADX INFO: renamed from: b */
    public Object f134252b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC35936a f134253c;

    /* JADX INFO: renamed from: d */
    public final C37236a f134254d;

    /* JADX INFO: renamed from: e */
    public final C12002a f134255e;

    public C32429a(Object obj, Object obj2, InterfaceC35936a protocolRequest, C37236a c37236a, C12002a executionContext) {
        AbstractC22676k.m65750j(protocolRequest, "protocolRequest");
        AbstractC22676k.m65750j(executionContext, "executionContext");
        this.f134251a = obj;
        this.f134252b = obj2;
        this.f134253c = protocolRequest;
        this.f134254d = c37236a;
        this.f134255e = executionContext;
    }

    /* JADX INFO: renamed from: a */
    public final C12002a m101249a() {
        return this.f134255e;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC35936a m101250b() {
        return this.f134253c;
    }

    /* JADX INFO: renamed from: c */
    public final C37236a m101251c() {
        return this.f134254d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m101252d() {
        return this.f134252b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32429a)) {
            return false;
        }
        C32429a c32429a = (C32429a) obj;
        return AbstractC22676k.m65745e(this.f134251a, c32429a.f134251a) && AbstractC22676k.m65745e(this.f134252b, c32429a.f134252b) && AbstractC22676k.m65745e(this.f134253c, c32429a.f134253c) && AbstractC22676k.m65745e(this.f134254d, c32429a.f134254d) && AbstractC22676k.m65745e(this.f134255e, c32429a.f134255e);
    }

    public final int hashCode() {
        Object obj = this.f134251a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f134252b;
        int iHashCode2 = (this.f134253c.hashCode() + (((obj2 == null ? 0 : obj2.hashCode()) + iHashCode) * 31)) * 31;
        C37236a c37236a = this.f134254d;
        return this.f134255e.hashCode() + ((iHashCode2 + (c37236a != null ? c37236a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HttpAttemptInterceptorContext(request=" + this.f134251a + ", response=" + ((Object) C23468n.m68038b(this.f134252b)) + ", protocolRequest=" + this.f134253c + ", protocolResponse=" + this.f134254d + ", executionContext=" + this.f134255e + ')';
    }
}

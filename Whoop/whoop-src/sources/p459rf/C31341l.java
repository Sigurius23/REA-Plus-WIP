package p459rf;

import bc3.InterfaceC2994c0;
import p326mf.AbstractC25492l;
import p326mf.C25494n;
import p505ts.AbstractC34132o;
import p551vf.InterfaceC35936a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import ud3.InterfaceC34821j;
import ug.C34913b;
import wf.C37236a;
import zd3.C40571o;

/* JADX INFO: renamed from: rf.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C31341l implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC30063j f128961E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC34821j f128962F;

    /* JADX INFO: renamed from: w */
    public final InterfaceC35936a f128963w;

    /* JADX INFO: renamed from: x */
    public final C37236a f128964x;

    /* JADX INFO: renamed from: y */
    public final C34913b f128965y;

    /* JADX INFO: renamed from: z */
    public final C34913b f128966z;

    public C31341l(InterfaceC35936a request, C37236a c37236a, C34913b c34913b, C34913b c34913b2, InterfaceC30063j coroutineContext, InterfaceC34821j call) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        AbstractC22676k.m65750j(call, "call");
        this.f128963w = request;
        this.f128964x = c37236a;
        this.f128965y = c34913b;
        this.f128966z = c34913b2;
        this.f128961E = coroutineContext;
        this.f128962F = call;
    }

    /* JADX INFO: renamed from: b */
    public static C31341l m96420b(C31341l c31341l, C37236a response) {
        InterfaceC35936a request = c31341l.f128963w;
        c31341l.getClass();
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(response, "response");
        return new C31341l(request, response, c31341l.f128965y, c31341l.f128966z, c31341l.f128961E, c31341l.f128962F);
    }

    /* JADX INFO: renamed from: a */
    public final void m96421a() {
        try {
            AbstractC25492l abstractC25492l = this.f128964x.f159237c;
            C25494n c25494n = abstractC25492l instanceof C25494n ? (C25494n) abstractC25492l : null;
            if (c25494n != null) {
                c25494n.f99829b.cancel();
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
        ((C40571o) this.f128962F).cancel();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f128961E;
    }
}

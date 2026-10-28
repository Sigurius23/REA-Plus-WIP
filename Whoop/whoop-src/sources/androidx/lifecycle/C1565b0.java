package androidx.lifecycle;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: androidx.lifecycle.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565b0 implements InterfaceC1577e0, InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final AbstractC1638x f6190w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f6191x;

    public C1565b0(AbstractC1638x lifecycle, InterfaceC30063j coroutineContext) {
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        this.f6190w = lifecycle;
        this.f6191x = coroutineContext;
        if (lifecycle.getCurrentState() == EnumC1635w.f6325w) {
            AbstractC3006f0.m8715i(coroutineContext, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2996c2 m4972a(InterfaceC4351m interfaceC4351m) {
        return AbstractC3006f0.m8732z(this, null, null, new C1561a0(this, interfaceC4351m, null, 0), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4973b(InterfaceC4351m interfaceC4351m) {
        AbstractC3006f0.m8732z(this, null, null, new C1561a0(this, interfaceC4351m, null, 1), 3);
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f6191x;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(event, "event");
        AbstractC1638x abstractC1638x = this.f6190w;
        if (abstractC1638x.getCurrentState().compareTo(EnumC1635w.f6325w) <= 0) {
            abstractC1638x.mo4988d(this);
            AbstractC3006f0.m8715i(this.f6191x, null);
        }
    }
}

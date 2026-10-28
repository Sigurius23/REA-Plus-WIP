package p337n8;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C26444a implements AutoCloseable, InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f105042w;

    public C26444a(InterfaceC30063j coroutineContext) {
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        this.f105042w = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC3006f0.m8715i(this.f105042w, null);
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f105042w;
    }
}

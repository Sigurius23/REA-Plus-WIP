package io.ktor.utils.p228io;

import bc3.InterfaceC2994c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: io.ktor.utils.io.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C20028u implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final C20020m f75136w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f75137x;

    public C20028u(InterfaceC2994c0 delegate, C20020m c20020m) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f75136w = c20020m;
        this.f75137x = delegate;
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f75137x.getCoroutineContext();
    }
}

package io.ktor.utils.p228io.jvm.javaio;

import bc3.AbstractC3076z;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20017k extends AbstractC3076z {

    /* JADX INFO: renamed from: w */
    public static final C20017k f75101w = new C20017k();

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j context, Runnable block) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(block, "block");
        block.run();
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return true;
    }
}

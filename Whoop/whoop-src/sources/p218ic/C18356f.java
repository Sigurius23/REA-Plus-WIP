package p218ic;

import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import kc3.C22365e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: ic.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18356f extends AbstractC3076z {

    /* JADX INFO: renamed from: w */
    public static final C18356f f71476w = new C18356f();

    /* JADX INFO: renamed from: x */
    public static final C22365e f71477x = AbstractC3050q0.f12077a;

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j context, Runnable block) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(block, "block");
        f71477x.dispatch(context, block);
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return f71477x.isDispatchNeeded(context);
    }
}

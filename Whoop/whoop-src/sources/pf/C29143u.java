package pf;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: pf.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C29143u implements InterfaceC30061h {

    /* JADX INFO: renamed from: x */
    public static final C29141s f117934x = new C29141s();

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f117935w;

    public C29143u(InterfaceC30063j callContext) {
        AbstractC22676k.m65750j(callContext, "callContext");
        this.f117935w = callContext;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final /* bridge */ InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return f117934x;
    }

    @Override // q83.InterfaceC30063j
    public final /* bridge */ InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final /* bridge */ InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}

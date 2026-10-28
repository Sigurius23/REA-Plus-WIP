package lb;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p249jc.C21565a;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: lb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C23572o implements InterfaceC30061h {

    /* JADX INFO: renamed from: x */
    public static final C21565a f93483x = new C21565a(8);

    /* JADX INFO: renamed from: w */
    public final C23571n f93484w;

    public C23572o(C23571n c23571n) {
        this.f93484w = c23571n;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return f93483x;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}

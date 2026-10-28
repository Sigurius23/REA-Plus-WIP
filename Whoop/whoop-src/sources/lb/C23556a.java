package lb;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: lb.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C23556a implements InterfaceC30061h {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30062i f93428w;

    /* JADX INFO: renamed from: x */
    public final C23557a0 f93429x;

    public C23556a(InterfaceC30062i interfaceC30062i, C23557a0 connectionWrapper) {
        AbstractC22676k.m65750j(connectionWrapper, "connectionWrapper");
        this.f93428w = interfaceC30062i;
        this.f93429x = connectionWrapper;
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
        return this.f93428w;
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

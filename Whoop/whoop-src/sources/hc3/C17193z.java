package hc3;

import bc3.InterfaceC3008f2;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import q83.C30064k;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: hc3.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C17193z implements InterfaceC3008f2 {

    /* JADX INFO: renamed from: w */
    public final Object f66012w;

    /* JADX INFO: renamed from: x */
    public final ThreadLocal f66013x;

    /* JADX INFO: renamed from: y */
    public final C17166a0 f66014y;

    public C17193z(Object obj, ThreadLocal threadLocal) {
        this.f66012w = obj;
        this.f66013x = threadLocal;
        this.f66014y = new C17166a0(threadLocal);
    }

    @Override // bc3.InterfaceC3008f2
    /* JADX INFO: renamed from: J */
    public final Object mo8734J(InterfaceC30063j interfaceC30063j) {
        ThreadLocal threadLocal = this.f66013x;
        Object obj = threadLocal.get();
        threadLocal.set(this.f66012w);
        return obj;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        if (this.f66014y.equals(interfaceC30062i)) {
            return this;
        }
        return null;
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return this.f66014y;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return this.f66014y.equals(interfaceC30062i) ? C30064k.f122676w : this;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f66012w + ", threadLocal = " + this.f66013x + ')';
    }

    @Override // bc3.InterfaceC3008f2
    /* JADX INFO: renamed from: x */
    public final void mo8735x(InterfaceC30063j interfaceC30063j, Object obj) {
        this.f66013x.set(obj);
    }
}

package p027b3;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p026b2.InterfaceC2317w;
import p390p1.C28617g1;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: b3.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2419o2 implements InterfaceC2317w {

    /* JADX INFO: renamed from: w */
    public final C28617g1 f9475w = new C28617g1(1.0f);

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // p026b2.InterfaceC2317w
    /* JADX INFO: renamed from: h */
    public final float mo7160h() {
        return this.f9475w.m87022x();
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

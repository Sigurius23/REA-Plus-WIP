package androidx.room;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import q83.InterfaceC30059f;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: androidx.room.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1831t1 implements InterfaceC30061h {

    /* JADX INFO: renamed from: x */
    public static final C1828s1 f7178x = new C1828s1();

    /* JADX INFO: renamed from: w */
    public final InterfaceC30059f f7179w;

    public C1831t1(InterfaceC30059f interfaceC30059f) {
        this.f7179w = interfaceC30059f;
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
        return f7178x;
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

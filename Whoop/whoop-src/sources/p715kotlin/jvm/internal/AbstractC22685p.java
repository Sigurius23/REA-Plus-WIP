package p715kotlin.jvm.internal;

import j93.InterfaceC21459c;
import j93.InterfaceC21475k;
import j93.InterfaceC21477l;
import j93.InterfaceC21489v;

/* JADX INFO: renamed from: kotlin.jvm.internal.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22685p extends AbstractC22688s implements InterfaceC21477l {
    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public final InterfaceC21459c computeReflected() {
        return AbstractC22671h0.f89337a.mutableProperty1(this);
    }

    @Override // j93.InterfaceC21490w
    public final Object getDelegate(Object obj) {
        return ((InterfaceC21477l) getReflected()).getDelegate(obj);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // j93.InterfaceC21493z
    public final InterfaceC21489v getGetter() {
        return ((InterfaceC21477l) getReflected()).getGetter();
    }

    @Override // j93.InterfaceC21482o
    public final InterfaceC21475k getSetter() {
        return ((InterfaceC21477l) getReflected()).getSetter();
    }
}

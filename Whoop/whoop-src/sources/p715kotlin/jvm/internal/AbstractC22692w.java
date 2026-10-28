package p715kotlin.jvm.internal;

import j93.InterfaceC21459c;
import j93.InterfaceC21489v;
import j93.InterfaceC21490w;

/* JADX INFO: renamed from: kotlin.jvm.internal.w */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22692w extends AbstractC22657a0 implements InterfaceC21490w {
    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public final InterfaceC21459c computeReflected() {
        return AbstractC22671h0.f89337a.property1(this);
    }

    @Override // j93.InterfaceC21490w
    public final Object getDelegate(Object obj) {
        return ((InterfaceC21490w) getReflected()).getDelegate(obj);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // j93.InterfaceC21493z
    public final InterfaceC21489v getGetter() {
        return ((InterfaceC21490w) getReflected()).getGetter();
    }
}

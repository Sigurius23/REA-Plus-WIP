package p715kotlin.jvm.internal;

import j93.InterfaceC21459c;
import j93.InterfaceC21491x;
import j93.InterfaceC21492y;

/* JADX INFO: renamed from: kotlin.jvm.internal.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22694y extends AbstractC22657a0 implements InterfaceC21492y {
    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public final InterfaceC21459c computeReflected() {
        return AbstractC22671h0.f89337a.property2(this);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C22695z) this).getGetter().call(obj, obj2);
    }

    @Override // j93.InterfaceC21493z
    public final InterfaceC21491x getGetter() {
        return ((InterfaceC21492y) getReflected()).getGetter();
    }
}

package p715kotlin.jvm.internal;

import j93.InterfaceC21459c;
import j93.InterfaceC21487t;
import j93.InterfaceC21488u;

/* JADX INFO: renamed from: kotlin.jvm.internal.u */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22690u extends AbstractC22657a0 implements InterfaceC21488u {
    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public InterfaceC21459c computeReflected() {
        return AbstractC22671h0.f89337a.property0(this);
    }

    @Override // j93.InterfaceC21488u
    public Object getDelegate() {
        return ((InterfaceC21488u) getReflected()).getDelegate();
    }

    @Override // c93.InterfaceC4339a
    public Object invoke() {
        return get();
    }

    @Override // j93.InterfaceC21493z
    public InterfaceC21487t getGetter() {
        return ((InterfaceC21488u) getReflected()).getGetter();
    }
}

package p715kotlin.jvm.internal;

import j93.InterfaceC21459c;
import j93.InterfaceC21471i;
import j93.InterfaceC21473j;
import j93.InterfaceC21487t;

/* JADX INFO: renamed from: kotlin.jvm.internal.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22682n extends AbstractC22688s implements InterfaceC21473j {
    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public InterfaceC21459c computeReflected() {
        return AbstractC22671h0.f89337a.mutableProperty0(this);
    }

    @Override // j93.InterfaceC21488u
    public Object getDelegate() {
        return ((InterfaceC21473j) getReflected()).getDelegate();
    }

    @Override // c93.InterfaceC4339a
    public Object invoke() {
        return get();
    }

    @Override // j93.InterfaceC21493z
    public InterfaceC21487t getGetter() {
        return ((InterfaceC21473j) getReflected()).getGetter();
    }

    @Override // j93.InterfaceC21482o
    public InterfaceC21471i getSetter() {
        return ((InterfaceC21473j) getReflected()).getSetter();
    }
}

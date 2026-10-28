package p715kotlin.jvm.internal;

import b93.C2892a;
import j93.InterfaceC21459c;
import j93.InterfaceC21467g;

/* JADX INFO: renamed from: kotlin.jvm.internal.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22670h extends AbstractC22660c implements InterfaceC22668g, InterfaceC21467g {
    private final int arity;

    public AbstractC22670h(int i13, int i14, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i14 & 1) == 1);
        this.arity = i13;
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public InterfaceC21459c computeReflected() {
        return AbstractC22671h0.f89337a.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22670h) {
            AbstractC22670h abstractC22670h = (AbstractC22670h) obj;
            return getName().equals(abstractC22670h.getName()) && getSignature().equals(abstractC22670h.getSignature()) && AbstractC22676k.m65745e(getBoundReceiver(), abstractC22670h.getBoundReceiver()) && AbstractC22676k.m65745e(getOwner(), abstractC22670h.getOwner());
        }
        if (obj instanceof InterfaceC21467g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22668g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // j93.InterfaceC21467g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // j93.InterfaceC21467g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // j93.InterfaceC21467g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // j93.InterfaceC21467g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c, j93.InterfaceC21459c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC21459c interfaceC21459cCompute = compute();
        if (interfaceC21459cCompute != this) {
            return interfaceC21459cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public InterfaceC21467g getReflected() {
        InterfaceC21459c interfaceC21459cCompute = compute();
        if (interfaceC21459cCompute != this) {
            return (InterfaceC21467g) interfaceC21459cCompute;
        }
        throw new C2892a();
    }
}

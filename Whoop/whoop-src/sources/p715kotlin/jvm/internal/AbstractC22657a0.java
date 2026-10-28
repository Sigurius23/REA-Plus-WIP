package p715kotlin.jvm.internal;

import b93.C2892a;
import j93.InterfaceC21459c;
import j93.InterfaceC21493z;

/* JADX INFO: renamed from: kotlin.jvm.internal.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22657a0 extends AbstractC22660c implements InterfaceC21493z {
    private final boolean syntheticJavaProperty;

    public AbstractC22657a0(Object obj, Class cls, String str, String str2, int i13) {
        super(obj, cls, str, str2, (i13 & 1) == 1);
        this.syntheticJavaProperty = (i13 & 2) == 2;
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public InterfaceC21459c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22657a0) {
            AbstractC22657a0 abstractC22657a0 = (AbstractC22657a0) obj;
            return getOwner().equals(abstractC22657a0.getOwner()) && getName().equals(abstractC22657a0.getName()) && getSignature().equals(abstractC22657a0.getSignature()) && AbstractC22676k.m65745e(getBoundReceiver(), abstractC22657a0.getBoundReceiver());
        }
        if (obj instanceof InterfaceC21493z) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // j93.InterfaceC21493z
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // j93.InterfaceC21493z
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC21459c interfaceC21459cCompute = compute();
        if (interfaceC21459cCompute != this) {
            return interfaceC21459cCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public InterfaceC21493z getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC21459c interfaceC21459cCompute = compute();
        if (interfaceC21459cCompute != this) {
            return (InterfaceC21493z) interfaceC21459cCompute;
        }
        throw new C2892a();
    }
}

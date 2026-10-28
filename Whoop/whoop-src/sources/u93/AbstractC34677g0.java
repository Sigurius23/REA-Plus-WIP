package u93;

import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;
import r93.InterfaceC31124g0;
import r93.InterfaceC31135k;
import r93.InterfaceC31141m;
import r93.InterfaceC31155s0;
import s93.C32305g;
import va3.C35847e;
import va3.C35848f;

/* JADX INFO: renamed from: u93.g0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34677g0 extends AbstractC34692o implements InterfaceC31124g0 {

    /* JADX INFO: renamed from: F */
    public final C35847e f146067F;

    /* JADX INFO: renamed from: G */
    public final String f146068G;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC34677g0(InterfaceC31109b0 module, C35847e fqName) {
        AbstractC22676k.m65750j(module, "module");
        AbstractC22676k.m65750j(fqName, "fqName");
        C35848f c35848f = fqName.f152613a;
        super(module, C32305g.f133684a, c35848f.m113793c() ? C35848f.f152615e : c35848f.m113796g(), InterfaceC31155s0.f128370q);
        this.f146067F = fqName;
        this.f146068G = "package " + fqName + " of " + module;
    }

    @Override // u93.AbstractC34692o, r93.InterfaceC31135k
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC31109b0 mo60581g() {
        InterfaceC31135k interfaceC31135kMo60581g = super.mo60581g();
        AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC31109b0) interfaceC31135kMo60581g;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitPackageFragmentDescriptor(this, obj);
    }

    @Override // u93.AbstractC34692o, r93.InterfaceC31138l
    public InterfaceC31155s0 getSource() {
        return InterfaceC31155s0.f128370q;
    }

    @Override // u93.AbstractC34690n, al.AbstractC0954a
    public String toString() {
        return this.f146068G;
    }
}

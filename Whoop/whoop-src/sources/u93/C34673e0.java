package u93;

import bd3.C3119e0;
import dc3.C11934s;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kb3.C22336e;
import kb3.C22342k;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import o93.AbstractC27736h;
import o93.C27739k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.AbstractC31166y;
import r93.InterfaceC31109b0;
import r93.InterfaceC31133j0;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31141m;
import s93.C32305g;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: u93.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34673e0 extends AbstractC34690n implements InterfaceC31109b0 {

    /* JADX INFO: renamed from: E */
    public final AbstractC27736h f146045E;

    /* JADX INFO: renamed from: F */
    public final Map f146046F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC34683j0 f146047G;

    /* JADX INFO: renamed from: H */
    public C34671d0 f146048H;

    /* JADX INFO: renamed from: I */
    public InterfaceC31133j0 f146049I;

    /* JADX INFO: renamed from: J */
    public final boolean f146050J;

    /* JADX INFO: renamed from: K */
    public final C22336e f146051K;

    /* JADX INFO: renamed from: L */
    public final C23470p f146052L;

    /* JADX INFO: renamed from: z */
    public final C22342k f146053z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34673e0(C35850h moduleName, C22342k c22342k, AbstractC27736h abstractC27736h, int i13) {
        super(C32305g.f133684a, moduleName);
        AbstractC22676k.m65750j(moduleName, "moduleName");
        this.f146053z = c22342k;
        this.f146045E = abstractC27736h;
        if (!moduleName.f152621x) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f146046F = C25272z.f99163w;
        InterfaceC34683j0.f146081a.getClass();
        InterfaceC34683j0 interfaceC34683j0 = (InterfaceC34683j0) mo78665r(C34679h0.f146072b);
        this.f146047G = interfaceC34683j0 == null ? C34681i0.f146079b : interfaceC34683j0;
        this.f146050J = true;
        this.f146051K = c22342k.m64223b(new C11934s(this, 15));
        this.f146052L = AbstractC30060g.m92088H(new C27739k(this, 2));
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: F */
    public final InterfaceC31136k0 mo78658F(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        if (this.f146050J) {
            return (InterfaceC31136k0) this.f146051K.invoke(fqName);
        }
        AbstractC31166y.m95885c(this);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitModuleDeclaration(this, obj);
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo78661c() {
        return this.f146045E;
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: e0 */
    public final List mo78662e0() {
        if (this.f146048H != null) {
            return C25271y.f99162w;
        }
        StringBuilder sb4 = new StringBuilder("Dependencies of module ");
        String str = getName().f152620w;
        AbstractC22676k.m65749i(str, "toString(...)");
        sb4.append(str);
        sb4.append(" were not set");
        throw new AssertionError(sb4.toString());
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: f */
    public final Collection mo78663f(C35847e fqName, Function1 function1) {
        AbstractC22676k.m65750j(fqName, "fqName");
        boolean z4 = this.f146050J;
        if (!z4) {
            AbstractC31166y.m95885c(this);
            throw null;
        }
        if (z4) {
            return ((C34688m) this.f146052L.getValue()).mo52693f(fqName, function1);
        }
        AbstractC31166y.m95885c(this);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final /* bridge */ InterfaceC31135k mo60581g() {
        return null;
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: n0 */
    public final boolean mo78664n0(InterfaceC31109b0 targetModule) {
        AbstractC22676k.m65750j(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        AbstractC22676k.m65747g(this.f146048H);
        if (AbstractC25265s.m74155w0(C25235a0.f99113w, targetModule)) {
            return true;
        }
        mo78662e0();
        return targetModule.mo78662e0().contains(this);
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: r */
    public final Object mo78665r(C3119e0 capability) {
        AbstractC22676k.m65750j(capability, "capability");
        Object obj = this.f146046F.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // u93.AbstractC34690n, al.AbstractC0954a
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC34690n.m109593H0(this));
        if (!this.f146050J) {
            sb4.append(" !isValid");
        }
        sb4.append(" packageFragmentProvider: ");
        InterfaceC31133j0 interfaceC31133j0 = this.f146049I;
        sb4.append(interfaceC31133j0 != null ? interfaceC31133j0.getClass().getSimpleName() : null);
        return sb4.toString();
    }
}

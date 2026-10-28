package u93;

import bg.C3215j;
import j93.InterfaceC21493z;
import java.util.List;
import jb3.C21561u;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23767d1;
import lb3.InterfaceC23796q0;
import p000.C31931s;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import r93.AbstractC31152r;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import r93.InterfaceC31141m;
import r93.InterfaceC31155s0;
import r93.InterfaceC31163w0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC34676g extends AbstractC34692o implements InterfaceC31163w0 {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ InterfaceC21493z[] f146062J = {AbstractC22671h0.f89337a.property1(new C22693x(AbstractC34676g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: F */
    public final InterfaceC22345n f146063F;

    /* JADX INFO: renamed from: G */
    public final AbstractC31152r f146064G;

    /* JADX INFO: renamed from: H */
    public List f146065H;

    /* JADX INFO: renamed from: I */
    public final C34674f f146066I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34676g(InterfaceC22345n storageManager, InterfaceC31135k containingDeclaration, InterfaceC32307i interfaceC32307i, C35850h c35850h, AbstractC31152r visibilityImpl) {
        super(containingDeclaration, interfaceC32307i, c35850h, InterfaceC31155s0.f128370q);
        AbstractC22676k.m65750j(storageManager, "storageManager");
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(visibilityImpl, "visibilityImpl");
        this.f146063F = storageManager;
        this.f146064G = visibilityImpl;
        ((C22342k) storageManager).m64222a(new C3215j(this, 14));
        this.f146066I = new C34674f(this);
    }

    @Override // u93.AbstractC34692o
    /* JADX INFO: renamed from: I0 */
    public final InterfaceC31138l mo78660a() {
        return this;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitTypeAliasDescriptor(this, obj);
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return false;
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31126h mo78660a() {
        return this;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        return this.f146066I;
    }

    @Override // r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        return this.f146064G;
    }

    @Override // r93.InterfaceC31168z
    public final boolean isExternal() {
        return false;
    }

    @Override // r93.InterfaceC31129i
    public final boolean isInner() {
        return AbstractC23767d1.m69847c(((C21561u) this).m60591L0(), new C31931s(this, 23), null);
    }

    @Override // r93.InterfaceC31129i
    /* JADX INFO: renamed from: j */
    public final List mo60497j() {
        List list = this.f146065H;
        if (list != null) {
            return list;
        }
        AbstractC22676k.m65757q("declaredTypeParametersImpl");
        throw null;
    }

    @Override // u93.AbstractC34690n, al.AbstractC0954a
    public final String toString() {
        return "typealias " + getName().m113817b();
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31135k mo78660a() {
        return this;
    }
}

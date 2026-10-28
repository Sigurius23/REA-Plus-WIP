package nb3;

import bd3.C3119e0;
import java.util.Collection;
import java.util.List;
import l83.C23470p;
import m83.C25271y;
import o93.AbstractC27736h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31109b0;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31141m;
import s93.C32305g;
import s93.InterfaceC32307i;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: nb3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C26548e implements InterfaceC31109b0 {

    /* JADX INFO: renamed from: w */
    public static final C26548e f105509w = new C26548e();

    /* JADX INFO: renamed from: x */
    public static final C35850h f105510x;

    /* JADX INFO: renamed from: y */
    public static final C25271y f105511y;

    /* JADX INFO: renamed from: z */
    public static final C23470p f105512z;

    static {
        EnumC26545b[] enumC26545bArr = EnumC26545b.f105507w;
        f105510x = C35850h.m113816g("<Error module>");
        f105511y = C25271y.f99162w;
        f105512z = AbstractC30060g.m92088H(C26547d.f105508w);
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: F */
    public final InterfaceC31136k0 mo78658F(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return null;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31135k mo78660a() {
        return this;
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo78661c() {
        return (AbstractC27736h) f105512z.getValue();
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: e0 */
    public final List mo78662e0() {
        return f105511y;
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: f */
    public final Collection mo78663f(C35847e fqName, Function1 function1) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return C25271y.f99162w;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        return null;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return C32305g.f133684a;
    }

    @Override // r93.InterfaceC31135k
    public final C35850h getName() {
        return f105510x;
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: n0 */
    public final boolean mo78664n0(InterfaceC31109b0 targetModule) {
        AbstractC22676k.m65750j(targetModule, "targetModule");
        return false;
    }

    @Override // r93.InterfaceC31109b0
    /* JADX INFO: renamed from: r */
    public final Object mo78665r(C3119e0 capability) {
        AbstractC22676k.m65750j(capability, "capability");
        return null;
    }
}

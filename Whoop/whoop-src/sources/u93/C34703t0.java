package u93;

import ih0.AbstractC18489d0;
import j93.InterfaceC21493z;
import kb3.C22339h;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import p048ce.C4463d;
import p499t9.C33623c0;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import r93.AbstractC31146o;
import r93.EnumC31106a0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31129i;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import r93.InterfaceC31163w0;
import s93.InterfaceC32307i;
import va3.AbstractC35852j;
import va3.C35850h;

/* JADX INFO: renamed from: u93.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34703t0 extends AbstractC34710x implements InterfaceC34701s0 {

    /* JADX INFO: renamed from: e0 */
    public final InterfaceC22345n f146152e0;

    /* JADX INFO: renamed from: f0 */
    public final InterfaceC31163w0 f146153f0;

    /* JADX INFO: renamed from: g0 */
    public C34682j f146154g0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ InterfaceC21493z[] f146151i0 = {AbstractC22671h0.f89337a.property1(new C22693x(C34703t0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    /* JADX INFO: renamed from: h0 */
    public static final C33623c0 f146150h0 = new C33623c0();

    public C34703t0(InterfaceC22345n interfaceC22345n, InterfaceC31163w0 interfaceC31163w0, C34682j c34682j, InterfaceC34701s0 interfaceC34701s0, InterfaceC32307i interfaceC32307i, int i13, InterfaceC31155s0 interfaceC31155s0) {
        super(i13, interfaceC31163w0, interfaceC34701s0, interfaceC31155s0, interfaceC32307i, AbstractC35852j.f152628e);
        this.f146152e0 = interfaceC22345n;
        this.f146153f0 = interfaceC31163w0;
        C4463d c4463d = new C4463d(13, this, c34682j);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        new C22339h(c22342k, c4463d);
        this.f146154g0 = c34682j;
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final AbstractC34710x mo48177L0(int i13, InterfaceC31135k newOwner, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i annotations, C35850h c35850h) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(annotations, "annotations");
        if (i13 != 1) {
        }
        return new C34703t0(this.f146152e0, this.f146153f0, this.f146154g0, this, annotations, 1, interfaceC31155s0);
    }

    @Override // r93.InterfaceC31132j
    /* JADX INFO: renamed from: O */
    public final boolean mo95869O() {
        return this.f146154g0.f146080e0;
    }

    @Override // r93.InterfaceC31132j
    /* JADX INFO: renamed from: P */
    public final InterfaceC31117e mo95870P() {
        InterfaceC31117e interfaceC31117eMo95870P = this.f146154g0.mo95870P();
        AbstractC22676k.m65749i(interfaceC31117eMo95870P, "getConstructedClass(...)");
        return interfaceC31117eMo95870P;
    }

    @Override // u93.AbstractC34710x, u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC34701s0 mo78660a() {
        InterfaceC31162w interfaceC31162wMo78660a = super.mo78660a();
        AbstractC22676k.m65748h(interfaceC31162wMo78660a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC34701s0) interfaceC31162wMo78660a;
    }

    /* JADX INFO: renamed from: V0 */
    public final C34682j m109613V0() {
        return this.f146154g0;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w, r93.InterfaceC31159u0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final C34703t0 mo60593d(C23758a1 substitutor) {
        AbstractC22676k.m65750j(substitutor, "substitutor");
        InterfaceC31162w interfaceC31162wMo60593d = super.mo60593d(substitutor);
        AbstractC22676k.m65748h(interfaceC31162wMo60593d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C34703t0 c34703t0 = (C34703t0) interfaceC31162wMo60593d;
        AbstractC23811y abstractC23811y = c34703t0.f146194H;
        AbstractC22676k.m65747g(abstractC23811y);
        C34682j c34682jMo60593d = this.f146154g0.mo109561I0().mo60593d(C23758a1.m69818d(abstractC23811y));
        if (c34682jMo60593d == null) {
            return null;
        }
        c34703t0.f146154g0 = c34682jMo60593d;
        return c34703t0;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31111c
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC31111c mo78655a0(InterfaceC31117e newOwner, EnumC31106a0 enumC31106a0, AbstractC31146o visibility) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC22676k.m65750j(visibility, "visibility");
        AbstractC18489d0.m53382w(2, "kind");
        C34708w c34708wM109631P0 = m109631P0(C23758a1.f94121b);
        c34708wM109631P0.f146183x = newOwner;
        c34708wM109631P0.f146184y = enumC31106a0;
        c34708wM109631P0.f146185z = visibility;
        c34708wM109631P0.f146163F = 2;
        c34708wM109631P0.f146170M = false;
        InterfaceC31111c interfaceC31111cMo88262M0 = c34708wM109631P0.f146181X.mo88262M0(c34708wM109631P0);
        AbstractC22676k.m65748h(interfaceC31111cMo88262M0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC34701s0) interfaceC31111cMo88262M0;
    }

    @Override // u93.AbstractC34692o, r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31129i mo60581g() {
        return this.f146153f0;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31108b
    public final AbstractC23811y getReturnType() {
        AbstractC23811y abstractC23811y = this.f146194H;
        AbstractC22676k.m65747g(abstractC23811y);
        return abstractC23811y;
    }

    @Override // u93.AbstractC34692o, r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        return this.f146153f0;
    }
}

package ja3;

import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ia3.C18295a;
import j93.InterfaceC21493z;
import kb3.C22334c;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import la.C23548b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r80.AbstractC31061c;
import r93.InterfaceC31155s0;
import s93.C32305g;
import s93.InterfaceC32307i;
import sa3.C32331e;
import u93.AbstractC34677g0;
import x93.C38132x;

/* JADX INFO: renamed from: ja3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C21521q extends AbstractC34677g0 {

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ InterfaceC21493z[] f82549N;

    /* JADX INFO: renamed from: H */
    public final C38132x f82550H;

    /* JADX INFO: renamed from: I */
    public final C41113q f82551I;

    /* JADX INFO: renamed from: J */
    public final C22340i f82552J;

    /* JADX INFO: renamed from: K */
    public final C21505d f82553K;

    /* JADX INFO: renamed from: L */
    public final C22334c f82554L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC32307i f82555M;

    static {
        C22693x c22693x = new C22693x(C21521q.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f82549N = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C21521q.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, c22673i0)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21521q(C41113q outerContext, C38132x c38132x) {
        AbstractC22676k.m65750j(outerContext, "outerContext");
        C18295a c18295a = (C18295a) outerContext.f177224x;
        super(c18295a.f71237o, c38132x.f163241a);
        this.f82550H = c38132x;
        C41113q c41113qM44459l = AbstractC15751g.m44459l(outerContext, this, null, 6);
        this.f82551I = c41113qM44459l;
        c18295a.f71226d.m83862c().f65737c.getClass();
        C32331e c32331e = C32331e.f133827g;
        C18295a c18295a2 = (C18295a) c41113qM44459l.f177224x;
        InterfaceC22345n interfaceC22345n = c18295a2.f71223a;
        C21520p c21520p = new C21520p(this, 0);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f82552J = new C22340i(c22342k, c21520p);
        this.f82553K = new C21505d(c41113qM44459l, c38132x, this);
        C21520p c21520p2 = new C21520p(this, 1);
        C22342k c22342k2 = (C22342k) interfaceC22345n;
        c22342k2.getClass();
        this.f82554L = new C22334c(c22342k2, c21520p2);
        this.f82555M = c18295a2.f71244v.f19187y ? C32305g.f133684a : AbstractC17269i.m48897j0(c41113qM44459l, c38132x);
        ((C22342k) interfaceC22345n).m64222a(new C21520p(this, 2));
    }

    @Override // al.AbstractC0954a, s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return this.f82555M;
    }

    @Override // u93.AbstractC34677g0, u93.AbstractC34692o, r93.InterfaceC31138l
    public final InterfaceC31155s0 getSource() {
        return new C23548b(this, 22);
    }

    @Override // u93.AbstractC34677g0, u93.AbstractC34690n, al.AbstractC0954a
    public final String toString() {
        return "Lazy Java package fragment: " + this.f146067F + " of module " + ((C18295a) this.f82551I.f177224x).f71237o;
    }

    @Override // r93.InterfaceC31124g0
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo52852u() {
        return this.f82553K;
    }
}

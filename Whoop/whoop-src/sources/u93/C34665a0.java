package u93;

import j93.InterfaceC21493z;
import kb3.C22340i;
import kb3.C22342k;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22708k;
import r80.AbstractC31061c;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31141m;
import s93.C32305g;
import va3.C35847e;
import va3.C35848f;

/* JADX INFO: renamed from: u93.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34665a0 extends AbstractC34690n implements InterfaceC31136k0 {

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ InterfaceC21493z[] f146027I;

    /* JADX INFO: renamed from: E */
    public final C35847e f146028E;

    /* JADX INFO: renamed from: F */
    public final C22340i f146029F;

    /* JADX INFO: renamed from: G */
    public final C22340i f146030G;

    /* JADX INFO: renamed from: H */
    public final C22708k f146031H;

    /* JADX INFO: renamed from: z */
    public final C34673e0 f146032z;

    static {
        C22693x c22693x = new C22693x(C34665a0.class, "fragments", "getFragments()Ljava/util/List;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f146027I = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C34665a0.class, "empty", "getEmpty()Z", 0, c22673i0)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34665a0(C34673e0 c34673e0, C35847e fqName, C22342k storageManager) {
        AbstractC22676k.m65750j(fqName, "fqName");
        AbstractC22676k.m65750j(storageManager, "storageManager");
        C35848f c35848f = fqName.f152613a;
        super(C32305g.f133684a, c35848f.m113793c() ? C35848f.f152615e : c35848f.m113796g());
        this.f146032z = c34673e0;
        this.f146028E = fqName;
        this.f146029F = new C22340i(storageManager, new C34713z(this, 0));
        this.f146030G = new C22340i(storageManager, new C34713z(this, 1));
        this.f146031H = new C22708k(storageManager, new C34713z(this, 2));
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitPackageViewDescriptor(this, obj);
    }

    public final boolean equals(Object obj) {
        InterfaceC31136k0 interfaceC31136k0 = obj instanceof InterfaceC31136k0 ? (InterfaceC31136k0) obj : null;
        if (interfaceC31136k0 == null) {
            return false;
        }
        C34665a0 c34665a0 = (C34665a0) interfaceC31136k0;
        return AbstractC22676k.m65745e(this.f146028E, c34665a0.f146028E) && AbstractC22676k.m65745e(this.f146032z, c34665a0.f146032z);
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        C35847e c35847e = this.f146028E;
        if (c35847e.f152613a.m113793c()) {
            return null;
        }
        return this.f146032z.mo78658F(c35847e.m113789b());
    }

    public final int hashCode() {
        return this.f146028E.hashCode() + (this.f146032z.hashCode() * 31);
    }
}

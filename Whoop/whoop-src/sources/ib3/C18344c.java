package ib3;

import cb3.AbstractC4393e;
import fa3.C14328u;
import hb3.C17119i;
import hb3.C17123l;
import jb3.C21558r;
import kb3.C22342k;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import qa3.C30134g0;
import qa3.C30140i0;
import qa3.C30157p0;
import qa3.C30161r0;
import r93.InterfaceC31109b0;
import r93.InterfaceC31124g0;
import ra3.C31181a;
import sa3.C32333g;
import u93.AbstractC34677g0;
import va3.C35847e;

/* JADX INFO: renamed from: ib3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18344c extends AbstractC34677g0 implements InterfaceC31124g0 {

    /* JADX INFO: renamed from: H */
    public final C31181a f71438H;

    /* JADX INFO: renamed from: I */
    public final C32333g f71439I;

    /* JADX INFO: renamed from: J */
    public final C41113q f71440J;

    /* JADX INFO: renamed from: K */
    public C30140i0 f71441K;

    /* JADX INFO: renamed from: L */
    public C21558r f71442L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18344c(C35847e fqName, C22342k c22342k, InterfaceC31109b0 module, C30140i0 c30140i0, C31181a c31181a) {
        super(module, fqName);
        AbstractC22676k.m65750j(fqName, "fqName");
        AbstractC22676k.m65750j(module, "module");
        this.f71438H = c31181a;
        C30161r0 c30161r0 = c30140i0.f123218z;
        AbstractC22676k.m65749i(c30161r0, "getStrings(...)");
        C30157p0 c30157p0 = c30140i0.f123211E;
        AbstractC22676k.m65749i(c30157p0, "getQualifiedNames(...)");
        C32333g c32333g = new C32333g(c30161r0, c30157p0);
        this.f71439I = c32333g;
        this.f71440J = new C41113q(c30140i0, c32333g, c31181a, new C17123l());
        this.f71441K = c30140i0;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m52851K0(C17119i components) {
        AbstractC22676k.m65750j(components, "components");
        C30140i0 c30140i0 = this.f71441K;
        if (c30140i0 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f71441K = null;
        C30134g0 c30134g0 = c30140i0.f123212F;
        AbstractC22676k.m65749i(c30134g0, "getPackage(...)");
        this.f71442L = new C21558r(this, c30134g0, this.f71439I, this.f71438H, null, components, "scope of " + this, new C14328u(this, 1));
    }

    @Override // u93.AbstractC34677g0, u93.AbstractC34690n, al.AbstractC0954a
    public final String toString() {
        return "builtins package fragment for " + this.f146067F + " from " + AbstractC4393e.m13812j(this);
    }

    @Override // r93.InterfaceC31124g0
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo52852u() {
        C21558r c21558r = this.f71442L;
        if (c21558r != null) {
            return c21558r;
        }
        AbstractC22676k.m65757q("_memberScope");
        throw null;
    }
}

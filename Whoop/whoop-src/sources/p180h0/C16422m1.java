package p180h0;

import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import g20.C15270p;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: h0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16422m1 extends AbstractC16387f1 {

    /* JADX INFO: renamed from: Z */
    public InterfaceC16427n1 f63114Z;

    /* JADX INFO: renamed from: a0 */
    public EnumC16377d2 f63115a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f63116b0;

    /* JADX INFO: renamed from: c0 */
    public Function3 f63117c0;

    /* JADX INFO: renamed from: d0 */
    public Function3 f63118d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f63119e0;

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: e1 */
    public final Object mo46581e1(C16382e1 c16382e1, C16382e1 c16382e2) {
        Object objMo29022a = this.f63114Z.mo29022a(EnumC13840z0.f49375x, new C15270p(c16382e1, this, (InterfaceC30057d) null, 8), c16382e2);
        return objMo29022a == EnumC31071a.f128113w ? objMo29022a : C23454a0.f92919a;
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: f1 */
    public final void mo46582f1(long j7) {
        if (!this.f9141N || AbstractC22676k.m65745e(this.f63117c0, AbstractC16412k1.f63074a)) {
            return;
        }
        AbstractC3006f0.m8732z(m7158L0(), null, EnumC2998d0.f12007z, new C16417l1(this, j7, null, 0), 1);
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: g1 */
    public final void mo46583g1(long j7) {
        if (!this.f9141N || AbstractC22676k.m65745e(this.f63118d0, AbstractC16412k1.f63075b)) {
            return;
        }
        AbstractC3006f0.m8732z(m7158L0(), null, EnumC2998d0.f12007z, new C16417l1(this, j7, null, 1), 1);
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: h1 */
    public final boolean mo46584h1() {
        return this.f63116b0;
    }
}

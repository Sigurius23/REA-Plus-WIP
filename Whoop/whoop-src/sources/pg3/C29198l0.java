package pg3;

/* JADX INFO: renamed from: pg3.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29198l0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC29201n f118194c;

    /* JADX INFO: renamed from: d */
    public final boolean f118195d;

    public C29198l0(InterfaceC29201n interfaceC29201n, boolean z4) {
        this.f118194c = interfaceC29201n;
        this.f118195d = z4;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        if (obj == null) {
            return;
        }
        c29212s0.m88718b((String) this.f118194c.convert(obj), null, this.f118195d);
    }
}

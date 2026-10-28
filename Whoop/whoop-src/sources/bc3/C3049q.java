package bc3;

/* JADX INFO: renamed from: bc3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C3049q extends AbstractC3035m1 implements InterfaceC3045p {

    /* JADX INFO: renamed from: E */
    public final InterfaceC3052r f12076E;

    public C3049q(InterfaceC3052r interfaceC3052r) {
        this.f12076E = interfaceC3052r;
    }

    @Override // bc3.InterfaceC3045p
    /* JADX INFO: renamed from: a */
    public final boolean mo8793a(Throwable th3) {
        return m8786h().mo8692v(th3);
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        return true;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) {
        this.f12076E.parentCancelled(m8786h());
    }
}

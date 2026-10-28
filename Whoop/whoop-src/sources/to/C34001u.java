package to;

/* JADX INFO: renamed from: to.u */
/* JADX INFO: loaded from: classes.dex */
public final class C34001u implements InterfaceC33963b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C33971f f142491a;

    public C34001u(C33971f c33971f) {
        this.f142491a = c33971f;
    }

    @Override // to.InterfaceC33963b
    /* JADX INFO: renamed from: a */
    public final void mo34606a(boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        C33971f c33971f = this.f142491a;
        c33971f.f142427N.sendMessage(c33971f.f142427N.obtainMessage(1, boolValueOf));
    }
}

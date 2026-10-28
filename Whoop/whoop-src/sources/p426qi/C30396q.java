package p426qi;

/* JADX INFO: renamed from: qi.q */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30396q implements InterfaceC30401v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30402w f124720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f124721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f124722c;

    public /* synthetic */ C30396q(C30402w c30402w, int i13, int i14) {
        this.f124720a = c30402w;
        this.f124721b = i13;
        this.f124722c = i14;
    }

    @Override // p426qi.InterfaceC30401v
    public final void run() {
        C30402w c30402w = this.f124720a;
        C30387i c30387i = c30402w.f124769w;
        int i13 = this.f124721b;
        int i14 = this.f124722c;
        if (c30387i == null) {
            c30402w.f124732F.add(new C30396q(c30402w, i13, i14));
        } else {
            c30402w.f124770x.m33249i(i13, i14 + 0.99f);
        }
    }
}

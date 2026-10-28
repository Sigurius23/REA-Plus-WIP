package p426qi;

/* JADX INFO: renamed from: qi.m */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30392m implements InterfaceC30401v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30402w f124708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f124709c;

    public /* synthetic */ C30392m(C30402w c30402w, String str, int i13) {
        this.f124707a = i13;
        this.f124708b = c30402w;
        this.f124709c = str;
    }

    @Override // p426qi.InterfaceC30401v
    public final void run() {
        switch (this.f124707a) {
            case 0:
                this.f124708b.m92893t(this.f124709c);
                break;
            case 1:
                this.f124708b.m92892s(this.f124709c);
                break;
            default:
                this.f124708b.m92895v(this.f124709c);
                break;
        }
    }
}

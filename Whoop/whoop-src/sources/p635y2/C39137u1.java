package p635y2;

/* JADX INFO: renamed from: y2.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39137u1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39146x1 f168282a;

    /* JADX INFO: renamed from: b */
    public C39115n0 f168283b;

    /* JADX INFO: renamed from: c */
    public final C39134t1 f168284c = new C39134t1(this, 2);

    /* JADX INFO: renamed from: d */
    public final C39134t1 f168285d = new C39134t1(this, 0);

    /* JADX INFO: renamed from: e */
    public final C39134t1 f168286e = new C39134t1(this, 1);

    public C39137u1(InterfaceC39146x1 interfaceC39146x1) {
        this.f168282a = interfaceC39146x1;
    }

    /* JADX INFO: renamed from: a */
    public final C39115n0 m124665a() {
        C39115n0 c39115n0 = this.f168283b;
        if (c39115n0 != null) {
            return c39115n0;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}

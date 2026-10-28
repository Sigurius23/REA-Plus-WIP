package ws;

/* JADX INFO: renamed from: ws.b */
/* JADX INFO: loaded from: classes.dex */
public final class C37579b {

    /* JADX INFO: renamed from: c */
    public static final C37579b f160703c;

    /* JADX INFO: renamed from: d */
    public static final C37579b f160704d;

    /* JADX INFO: renamed from: e */
    public static final C37579b f160705e;

    /* JADX INFO: renamed from: f */
    public static final C37579b f160706f;

    /* JADX INFO: renamed from: g */
    public static final C37579b f160707g;

    /* JADX INFO: renamed from: h */
    public static final C37579b f160708h;

    /* JADX INFO: renamed from: i */
    public static final C37579b f160709i;

    /* JADX INFO: renamed from: j */
    public static final C37579b f160710j;

    /* JADX INFO: renamed from: k */
    public static final C37579b f160711k;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160712a;

    /* JADX INFO: renamed from: b */
    public final String f160713b;

    static {
        int i13 = 0;
        f160703c = new C37579b("SHA256", i13);
        f160704d = new C37579b("SHA384", i13);
        f160705e = new C37579b("SHA512", i13);
        int i14 = 1;
        f160706f = new C37579b("IEEE_P1363", i14);
        f160707g = new C37579b("DER", i14);
        int i15 = 2;
        f160708h = new C37579b("TINK", i15);
        f160709i = new C37579b("CRUNCHY", i15);
        f160710j = new C37579b("LEGACY", i15);
        f160711k = new C37579b("NO_PREFIX", i15);
    }

    public /* synthetic */ C37579b(String str, int i13) {
        this.f160712a = i13;
        this.f160713b = str;
    }

    public final String toString() {
        switch (this.f160712a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f160713b;
    }
}

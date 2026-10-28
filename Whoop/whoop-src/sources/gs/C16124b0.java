package gs;

/* JADX INFO: renamed from: gs.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16124b0 {

    /* JADX INFO: renamed from: c */
    public static final C16124b0 f61241c;

    /* JADX INFO: renamed from: d */
    public static final C16124b0 f61242d;

    /* JADX INFO: renamed from: e */
    public static final C16124b0 f61243e;

    /* JADX INFO: renamed from: f */
    public static final C16124b0 f61244f;

    /* JADX INFO: renamed from: g */
    public static final C16124b0 f61245g;

    /* JADX INFO: renamed from: h */
    public static final C16124b0 f61246h;

    /* JADX INFO: renamed from: i */
    public static final C16124b0 f61247i;

    /* JADX INFO: renamed from: j */
    public static final C16124b0 f61248j;

    /* JADX INFO: renamed from: k */
    public static final C16124b0 f61249k;

    /* JADX INFO: renamed from: l */
    public static final C16124b0 f61250l;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61251a;

    /* JADX INFO: renamed from: b */
    public final String f61252b;

    static {
        int i13 = 0;
        f61241c = new C16124b0("TINK", i13);
        f61242d = new C16124b0("NO_PREFIX", i13);
        int i14 = 1;
        f61243e = new C16124b0("ASSUME_AES_GCM", i14);
        f61244f = new C16124b0("ASSUME_XCHACHA20POLY1305", i14);
        f61245g = new C16124b0("ASSUME_CHACHA20POLY1305", i14);
        f61246h = new C16124b0("ASSUME_AES_CTR_HMAC", i14);
        f61247i = new C16124b0("ASSUME_AES_EAX", i14);
        f61248j = new C16124b0("ASSUME_AES_GCM_SIV", i14);
        int i15 = 2;
        f61249k = new C16124b0("TINK", i15);
        f61250l = new C16124b0("NO_PREFIX", i15);
    }

    public /* synthetic */ C16124b0(String str, int i13) {
        this.f61251a = i13;
        this.f61252b = str;
    }

    public final String toString() {
        switch (this.f61251a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f61252b;
    }
}

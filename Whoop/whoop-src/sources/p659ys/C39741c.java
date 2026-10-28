package p659ys;

/* JADX INFO: renamed from: ys.c */
/* JADX INFO: loaded from: classes.dex */
public final class C39741c {

    /* JADX INFO: renamed from: c */
    public static final C39741c f171097c;

    /* JADX INFO: renamed from: d */
    public static final C39741c f171098d;

    /* JADX INFO: renamed from: e */
    public static final C39741c f171099e;

    /* JADX INFO: renamed from: f */
    public static final C39741c f171100f;

    /* JADX INFO: renamed from: g */
    public static final C39741c f171101g;

    /* JADX INFO: renamed from: h */
    public static final C39741c f171102h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f171103a;

    /* JADX INFO: renamed from: b */
    public final String f171104b;

    static {
        int i13 = 0;
        f171097c = new C39741c("SHA1", i13);
        f171098d = new C39741c("SHA256", i13);
        f171099e = new C39741c("SHA512", i13);
        int i14 = 1;
        f171100f = new C39741c("SHA1", i14);
        f171101g = new C39741c("SHA256", i14);
        f171102h = new C39741c("SHA512", i14);
    }

    public /* synthetic */ C39741c(String str, int i13) {
        this.f171103a = i13;
        this.f171104b = str;
    }

    public final String toString() {
        switch (this.f171103a) {
            case 0:
                break;
        }
        return this.f171104b;
    }
}

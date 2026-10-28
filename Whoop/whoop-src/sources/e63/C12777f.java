package e63;

import hc3.C17191x;
import r63.AbstractC30992d;

/* JADX INFO: renamed from: e63.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C12777f extends AbstractC30992d {

    /* JADX INFO: renamed from: g */
    public static final C17191x f43722g = new C17191x("Before", 2);

    /* JADX INFO: renamed from: h */
    public static final C17191x f43723h = new C17191x("State", 2);

    /* JADX INFO: renamed from: i */
    public static final C17191x f43724i = new C17191x("Transform", 2);

    /* JADX INFO: renamed from: j */
    public static final C17191x f43725j = new C17191x("Render", 2);

    /* JADX INFO: renamed from: k */
    public static final C17191x f43726k = new C17191x("Send", 2);

    /* JADX INFO: renamed from: l */
    public static final C17191x f43727l = new C17191x("Before", 2);

    /* JADX INFO: renamed from: m */
    public static final C17191x f43728m = new C17191x("State", 2);

    /* JADX INFO: renamed from: n */
    public static final C17191x f43729n = new C17191x("Monitoring", 2);

    /* JADX INFO: renamed from: o */
    public static final C17191x f43730o = new C17191x("Engine", 2);

    /* JADX INFO: renamed from: p */
    public static final C17191x f43731p = new C17191x("Receive", 2);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f43732e;

    /* JADX INFO: renamed from: f */
    public final boolean f43733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12777f(boolean z4, int i13) {
        super(f43722g, f43723h, f43724i, f43725j, f43726k);
        this.f43732e = i13;
        switch (i13) {
            case 1:
                super(f43727l, f43728m, f43729n, f43730o, f43731p);
                this.f43733f = z4;
                break;
            default:
                this.f43733f = z4;
                break;
        }
    }

    @Override // r63.AbstractC30992d
    /* JADX INFO: renamed from: d */
    public final boolean mo35807d() {
        switch (this.f43732e) {
            case 0:
                break;
        }
        return this.f43733f;
    }
}

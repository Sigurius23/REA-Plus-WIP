package f63;

import hc3.C17191x;
import r63.AbstractC30992d;

/* JADX INFO: renamed from: f63.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14154b extends AbstractC30992d {

    /* JADX INFO: renamed from: g */
    public static final C17191x f50995g = new C17191x("Before", 2);

    /* JADX INFO: renamed from: h */
    public static final C17191x f50996h = new C17191x("State", 2);

    /* JADX INFO: renamed from: i */
    public static final C17191x f50997i = new C17191x("After", 2);

    /* JADX INFO: renamed from: j */
    public static final C17191x f50998j = new C17191x("Receive", 2);

    /* JADX INFO: renamed from: k */
    public static final C17191x f50999k = new C17191x("Parse", 2);

    /* JADX INFO: renamed from: l */
    public static final C17191x f51000l = new C17191x("Transform", 2);

    /* JADX INFO: renamed from: m */
    public static final C17191x f51001m = new C17191x("State", 2);

    /* JADX INFO: renamed from: n */
    public static final C17191x f51002n = new C17191x("After", 2);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f51003e;

    /* JADX INFO: renamed from: f */
    public final boolean f51004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14154b(boolean z4, int i13) {
        super(f50995g, f50996h, f50997i);
        this.f51003e = i13;
        switch (i13) {
            case 1:
                super(f50998j, f50999k, f51000l, f51001m, f51002n);
                this.f51004f = z4;
                break;
            default:
                this.f51004f = z4;
                break;
        }
    }

    @Override // r63.AbstractC30992d
    /* JADX INFO: renamed from: d */
    public final boolean mo35807d() {
        switch (this.f51003e) {
            case 0:
                break;
        }
        return this.f51004f;
    }
}

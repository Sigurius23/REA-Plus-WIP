package bp0;

import c93.InterfaceC4339a;
import cp0.C10998t;
import dp0.InterfaceC12251g;

/* JADX INFO: renamed from: bp0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3532t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14165w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14166x;

    public /* synthetic */ C3532t(Object obj, int i13) {
        this.f14165w = i13;
        this.f14166x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14165w) {
            case 0:
                return AbstractC3531s.b.m10535h((C10998t) this.f14166x);
            default:
                return AbstractC3531s.e.m10540h((InterfaceC12251g) this.f14166x);
        }
    }
}

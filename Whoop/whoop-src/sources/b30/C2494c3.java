package b30;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;

/* JADX INFO: renamed from: b30.c3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2494c3 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9720w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f9721x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2464x2 f9722y;

    public /* synthetic */ C2494c3(InterfaceC2464x2 interfaceC2464x2, InterfaceC4339a interfaceC4339a) {
        this.f9722y = interfaceC2464x2;
        this.f9721x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f9720w) {
            case 0:
                InterfaceC2464x2 interfaceC2464x2 = this.f9722y;
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                this.f9721x.invoke();
                break;
            default:
                this.f9721x.invoke();
                InterfaceC2464x2 interfaceC2464x3 = this.f9722y;
                if (interfaceC2464x3 != null) {
                    ((C2463x1) interfaceC2464x3).m7442a();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2494c3(InterfaceC4339a interfaceC4339a, InterfaceC2464x2 interfaceC2464x2) {
        this.f9721x = interfaceC4339a;
        this.f9722y = interfaceC2464x2;
    }
}

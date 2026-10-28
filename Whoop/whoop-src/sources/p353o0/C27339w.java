package p353o0;

import p005a3.C0230n0;
import p180h0.InterfaceC16478x2;
import p409q0.AbstractC29701y;
import p635y2.InterfaceC39113m1;

/* JADX INFO: renamed from: o0.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C27339w implements InterfaceC39113m1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109489w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC16478x2 f109490x;

    public /* synthetic */ C27339w(InterfaceC16478x2 interfaceC16478x2, int i13) {
        this.f109489w = i13;
        this.f109490x = interfaceC16478x2;
    }

    @Override // p635y2.InterfaceC39113m1
    /* JADX INFO: renamed from: f */
    public final void mo77562f(C0230n0 c0230n0) {
        switch (this.f109489w) {
            case 0:
                ((C27341y) this.f109490x).f109506j = c0230n0;
                break;
            default:
                ((AbstractC29701y) this.f109490x).f121455z.setValue(c0230n0);
                break;
        }
    }
}

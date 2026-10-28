package vo1;

import android.view.Window;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p163g1.C15199y3;

/* JADX INFO: renamed from: vo1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36235j implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f155159E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15199y3 f155160F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155161w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f155162x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Window f155163y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f155164z;

    public /* synthetic */ C36235j(InterfaceC2994c0 interfaceC2994c0, Window window, long j7, long j13, C15199y3 c15199y3, int i13) {
        this.f155161w = i13;
        this.f155162x = interfaceC2994c0;
        this.f155163y = window;
        this.f155164z = j7;
        this.f155159E = j13;
        this.f155160F = c15199y3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f155161w;
        long j7 = this.f155159E;
        C15199y3 c15199y3 = this.f155160F;
        InterfaceC2994c0 interfaceC2994c0 = this.f155162x;
        Window window = this.f155163y;
        long j13 = this.f155164z;
        switch (i13) {
            case 0:
                return AbstractC36243r.m115479A0(interfaceC2994c0, window, j13, j7, c15199y3);
            default:
                return AbstractC36243r.m115505O(interfaceC2994c0, window, j13, j7, c15199y3);
        }
    }
}

package p218ic;

import androidx.work.Worker;
import c93.InterfaceC4339a;

/* JADX INFO: renamed from: ic.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18383s0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71550w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Worker f71551x;

    public /* synthetic */ C18383s0(Worker worker, int i13) {
        this.f71550w = i13;
        this.f71551x = worker;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f71550w) {
            case 0:
                return this.f71551x.mo5513a();
            default:
                return this.f71551x.m5514b();
        }
    }
}

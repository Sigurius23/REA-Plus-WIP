package p026b2;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: b2.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2296b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9097w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f9098x;

    public /* synthetic */ RunnableC2296b(InterfaceC4339a interfaceC4339a, int i13) {
        this.f9097w = i13;
        this.f9098x = interfaceC4339a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9097w) {
            case 0:
                this.f9098x.invoke();
                break;
            default:
                this.f9098x.invoke();
                break;
        }
    }
}

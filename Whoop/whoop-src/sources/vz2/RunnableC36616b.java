package vz2;

/* JADX INFO: renamed from: vz2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC36616b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156893w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36619e f156894x;

    public /* synthetic */ RunnableC36616b(C36619e c36619e, int i13) {
        this.f156893w = i13;
        this.f156894x = c36619e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f156893w) {
            case 0:
                this.f156894x.m117633H();
                break;
            default:
                this.f156894x.m117632G();
                break;
        }
    }
}

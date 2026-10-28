package y40;

/* JADX INFO: renamed from: y40.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC39206c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168496w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39207d f168497x;

    public /* synthetic */ RunnableC39206c(C39207d c39207d, int i13) {
        this.f168496w = i13;
        this.f168497x = c39207d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f168496w) {
            case 0:
                this.f168497x.f168499x.mo109106h();
                break;
            default:
                this.f168497x.f168499x.mo109108m();
                break;
        }
    }
}

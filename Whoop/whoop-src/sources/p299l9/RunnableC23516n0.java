package p299l9;

/* JADX INFO: renamed from: l9.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC23516n0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93075w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23526s0 f93076x;

    public /* synthetic */ RunnableC23516n0(C23526s0 c23526s0, int i13) {
        this.f93075w = i13;
        this.f93076x = c23526s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f93075w) {
            case 0:
                this.f93076x.f93148i0 = true;
                break;
            case 1:
                this.f93076x.m68106z();
                break;
            default:
                C23526s0 c23526s0 = this.f93076x;
                if (!c23526s0.f93154o0) {
                    InterfaceC23539z interfaceC23539z = c23526s0.f93131R;
                    interfaceC23539z.getClass();
                    interfaceC23539z.mo8198b(c23526s0);
                }
                break;
        }
    }
}

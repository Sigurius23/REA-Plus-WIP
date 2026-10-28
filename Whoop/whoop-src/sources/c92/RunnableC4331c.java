package c92;

/* JADX INFO: renamed from: c92.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC4331c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17589w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4335g f17590x;

    public /* synthetic */ RunnableC4331c(C4335g c4335g, int i13) {
        this.f17589w = i13;
        this.f17590x = c4335g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17589w) {
            case 0:
                this.f17590x.m13677X();
                break;
            default:
                this.f17590x.m13683e0();
                break;
        }
    }
}

package cq0;

/* JADX INFO: renamed from: cq0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RunnableC11056d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34721w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC11057e f34722x;

    public /* synthetic */ RunnableC11056d(AbstractC11057e abstractC11057e, int i13) {
        this.f34721w = i13;
        this.f34722x = abstractC11057e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34721w) {
            case 0:
                AbstractC11057e.m29739t(this.f34722x);
                break;
            default:
                AbstractC11057e.m29737r(this.f34722x);
                break;
        }
    }
}

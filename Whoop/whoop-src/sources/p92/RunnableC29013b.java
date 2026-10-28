package p92;

/* JADX INFO: renamed from: p92.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29013b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117396w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29014c f117397x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f117398y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f117399z;

    public /* synthetic */ RunnableC29013b(C29014c c29014c, long j7, long j13, int i13) {
        this.f117396w = i13;
        this.f117397x = c29014c;
        this.f117398y = j7;
        this.f117399z = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f117396w) {
            case 0:
                C29014c.m88160e(this.f117397x, this.f117398y, this.f117399z);
                break;
            default:
                C29014c.m88163j(this.f117397x, this.f117398y, this.f117399z);
                break;
        }
    }
}

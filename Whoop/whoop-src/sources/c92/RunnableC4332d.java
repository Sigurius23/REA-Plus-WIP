package c92;

/* JADX INFO: renamed from: c92.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC4332d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17591w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4335g f17592x;

    public /* synthetic */ RunnableC4332d(C4335g c4335g, int i13) {
        this.f17591w = i13;
        this.f17592x = c4335g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17591w) {
            case 0:
                this.f17592x.m13717o0();
                break;
            default:
                this.f17592x.m13675V();
                break;
        }
    }
}

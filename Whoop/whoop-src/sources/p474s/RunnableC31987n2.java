package p474s;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: s.n2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC31987n2 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132788w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Toolbar f132789x;

    public /* synthetic */ RunnableC31987n2(Toolbar toolbar, int i13) {
        this.f132788w = i13;
        this.f132789x = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f132788w) {
            case 0:
                this.f132789x.m3312e();
                break;
            default:
                this.f132789x.m3326u();
                break;
        }
    }
}

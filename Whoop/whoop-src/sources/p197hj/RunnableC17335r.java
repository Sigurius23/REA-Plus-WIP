package p197hj;

import com.amplitude.android.engagement.C4861a;

/* JADX INFO: renamed from: hj.r */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC17335r implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67137w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f67138x;

    public /* synthetic */ RunnableC17335r(C4861a c4861a, int i13) {
        this.f67137w = i13;
        this.f67138x = c4861a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67137w) {
            case 0:
                this.f67138x.f20263d.m53801a("window.engagement._.messageBus.publish('rage_click')", null);
                break;
            default:
                this.f67138x.f20263d.m53801a("window.engagement._.messageBus.publish('user_inactive')", null);
                break;
        }
    }
}

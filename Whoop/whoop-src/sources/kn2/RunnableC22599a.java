package kn2;

import com.whoop.p069ui.views.ConnectingAnimationView;

/* JADX INFO: renamed from: kn2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC22599a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88927w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ConnectingAnimationView f88928x;

    public /* synthetic */ RunnableC22599a(ConnectingAnimationView connectingAnimationView, int i13) {
        this.f88927w = i13;
        this.f88928x = connectingAnimationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f88927w) {
            case 0:
                ConnectingAnimationView.m27400e(this.f88928x);
                break;
            default:
                ConnectingAnimationView.m27399d(this.f88928x);
                break;
        }
    }
}

package p474s;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC31932a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132626w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ActionBarOverlayLayout f132627x;

    public /* synthetic */ RunnableC31932a(ActionBarOverlayLayout actionBarOverlayLayout, int i13) {
        this.f132626w = i13;
        this.f132627x = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f132626w) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f132627x;
                actionBarOverlayLayout.m3275j();
                actionBarOverlayLayout.f4299W = actionBarOverlayLayout.f4308z.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4300a0);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f132627x;
                actionBarOverlayLayout2.m3275j();
                actionBarOverlayLayout2.f4299W = actionBarOverlayLayout2.f4308z.animate().translationY(-actionBarOverlayLayout2.f4308z.getHeight()).setListener(actionBarOverlayLayout2.f4300a0);
                break;
        }
    }
}

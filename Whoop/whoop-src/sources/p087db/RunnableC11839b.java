package p087db;

import android.widget.FrameLayout;
import androidx.media3.p019ui.AspectRatioFrameLayout;

/* JADX INFO: renamed from: db.b */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC11839b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38578w;

    /* JADX INFO: renamed from: x */
    public boolean f38579x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ FrameLayout f38580y;

    public /* synthetic */ RunnableC11839b(FrameLayout frameLayout, int i13) {
        this.f38578w = i13;
        this.f38580y = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f38578w;
        FrameLayout frameLayout = this.f38580y;
        switch (i13) {
            case 0:
                this.f38579x = false;
                int i14 = AspectRatioFrameLayout.f6399z;
                ((AspectRatioFrameLayout) frameLayout).getClass();
                break;
            default:
                this.f38579x = false;
                int i15 = com.google.android.exoplayer2.p051ui.AspectRatioFrameLayout.f20396z;
                ((com.google.android.exoplayer2.p051ui.AspectRatioFrameLayout) frameLayout).getClass();
                break;
        }
    }
}

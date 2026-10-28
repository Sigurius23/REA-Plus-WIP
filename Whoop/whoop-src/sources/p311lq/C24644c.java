package p311lq;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: lq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24644c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96399a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f96400b;

    public /* synthetic */ C24644c(FrameLayout frameLayout, int i13) {
        this.f96399a = i13;
        this.f96400b = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f96399a) {
            case 0:
                ((CollapsingToolbarLayout) this.f96400b).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                ((TabLayout) this.f96400b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
        }
    }
}

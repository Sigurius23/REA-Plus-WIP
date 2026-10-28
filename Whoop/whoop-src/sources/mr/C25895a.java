package mr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: mr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25895a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f102219b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC25906l f102220c;

    public /* synthetic */ C25895a(AbstractC25906l abstractC25906l, int i13, int i14) {
        this.f102218a = i14;
        this.f102220c = abstractC25906l;
        this.f102219b = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f102218a) {
            case 0:
                this.f102220c.m76613d(this.f102219b);
                break;
            default:
                this.f102220c.m76613d(this.f102219b);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f102218a) {
            case 1:
                AbstractC25906l abstractC25906l = this.f102220c;
                InterfaceC25907m interfaceC25907m = abstractC25906l.f102260j;
                int i13 = abstractC25906l.f102252b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC25907m;
                snackbarContentLayout.f21043w.setAlpha(1.0f);
                long j7 = i13;
                ViewPropertyAnimator duration = snackbarContentLayout.f21043w.animate().alpha(0.0f).setDuration(j7);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f21045y;
                long j13 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j13).start();
                if (snackbarContentLayout.f21044x.getVisibility() == 0) {
                    snackbarContentLayout.f21044x.setAlpha(1.0f);
                    snackbarContentLayout.f21044x.animate().alpha(0.0f).setDuration(j7).setInterpolator(timeInterpolator).setStartDelay(j13).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

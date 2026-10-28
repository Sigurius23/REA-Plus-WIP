package mr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: mr.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C25897c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC25906l f102224b;

    public /* synthetic */ C25897c(AbstractC25906l abstractC25906l, int i13) {
        this.f102223a = i13;
        this.f102224b = abstractC25906l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f102223a) {
            case 0:
                this.f102224b.m76614e();
                break;
            default:
                this.f102224b.m76614e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f102223a) {
            case 0:
                AbstractC25906l abstractC25906l = this.f102224b;
                InterfaceC25907m interfaceC25907m = abstractC25906l.f102260j;
                int i13 = abstractC25906l.f102253c;
                int i14 = abstractC25906l.f102251a;
                int i15 = i13 - i14;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC25907m;
                snackbarContentLayout.f21043w.setAlpha(0.0f);
                long j7 = i14;
                ViewPropertyAnimator duration = snackbarContentLayout.f21043w.animate().alpha(1.0f).setDuration(j7);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f21045y;
                long j13 = i15;
                duration.setInterpolator(timeInterpolator).setStartDelay(j13).start();
                if (snackbarContentLayout.f21044x.getVisibility() == 0) {
                    snackbarContentLayout.f21044x.setAlpha(0.0f);
                    snackbarContentLayout.f21044x.animate().alpha(1.0f).setDuration(j7).setInterpolator(timeInterpolator).setStartDelay(j13).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

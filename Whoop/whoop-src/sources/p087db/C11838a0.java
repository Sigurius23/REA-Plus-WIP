package p087db;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: db.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11838a0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11842c0 f38577b;

    public /* synthetic */ C11838a0(C11842c0 c11842c0, int i13) {
        this.f38576a = i13;
        this.f38577b = c11842c0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f38576a) {
            case 0:
                C11842c0 c11842c0 = this.f38577b;
                View view = c11842c0.f38594b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = c11842c0.f38595c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = c11842c0.f38597e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f38577b.m31796k(0);
                break;
            case 3:
                this.f38577b.m31796k(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f38577b.f38598f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f38577b.f38600h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f38576a;
        C11842c0 c11842c0 = this.f38577b;
        switch (i13) {
            case 0:
                View view = c11842c0.f38602j;
                if ((view instanceof C11847f) && !c11842c0.f38613u) {
                    C11847f c11847f = (C11847f) view;
                    ValueAnimator valueAnimator = c11847f.f38658h0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c11847f.f38659i0, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = c11842c0.f38594b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = c11842c0.f38595c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = c11842c0.f38597e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(c11842c0.f38613u ? 0 : 4);
                }
                View view3 = c11842c0.f38602j;
                if ((view3 instanceof C11847f) && !c11842c0.f38613u) {
                    C11847f c11847f2 = (C11847f) view3;
                    ValueAnimator valueAnimator2 = c11847f2.f38658h0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c11847f2.f38660j0 = false;
                    valueAnimator2.setFloatValues(c11847f2.f38659i0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                c11842c0.m31796k(4);
                break;
            case 3:
                c11842c0.m31796k(4);
                break;
            case 4:
                ViewGroup viewGroup3 = c11842c0.f38600h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = c11842c0.f38600h;
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    ViewGroup viewGroup5 = c11842c0.f38600h;
                    viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup6 = c11842c0.f38598f;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                }
                break;
        }
    }
}

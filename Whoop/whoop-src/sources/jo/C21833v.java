package jo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import p087db.C11842c0;

/* JADX INFO: renamed from: jo.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C21833v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11842c0 f84233b;

    public /* synthetic */ C21833v(C11842c0 c11842c0, int i13) {
        this.f84232a = i13;
        this.f84233b = c11842c0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f84232a) {
            case 0:
                C11842c0 c11842c0 = this.f84233b;
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
                this.f84233b.m31796k(0);
                break;
            case 3:
                this.f84233b.m31796k(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f84233b.f38598f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f84233b.f38600h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f84232a;
        C11842c0 c11842c0 = this.f84233b;
        switch (i13) {
            case 0:
                View view = c11842c0.f38602j;
                if ((view instanceof C21816e) && !c11842c0.f38613u) {
                    C21816e c21816e = (C21816e) view;
                    ValueAnimator valueAnimator = c21816e.f84116h0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c21816e.f84117i0, 0.0f);
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
                if ((view3 instanceof C21816e) && !c11842c0.f38613u) {
                    C21816e c21816e2 = (C21816e) view3;
                    ValueAnimator valueAnimator2 = c21816e2.f84116h0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c21816e2.f84118j0 = false;
                    valueAnimator2.setFloatValues(c21816e2.f84117i0, 1.0f);
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

package p032bc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p002a0.C0022g;
import p184h5.C16866d1;
import p184h5.C16926y0;
import p184h5.InterfaceC16916u0;

/* JADX INFO: renamed from: bc.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C2967p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f11887c;

    public /* synthetic */ C2967p(View view, int i13, Object obj) {
        this.f11885a = i13;
        this.f11886b = obj;
        this.f11887c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f11885a) {
            case 1:
                ((InterfaceC16916u0) this.f11886b).mo30518a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11885a) {
            case 0:
                ((C0022g) this.f11886b).remove(animator);
                ((AbstractC2974w) this.f11887c).f11920N.remove(animator);
                break;
            case 1:
                ((InterfaceC16916u0) this.f11886b).mo30520c();
                break;
            default:
                C16866d1 c16866d1 = (C16866d1) this.f11886b;
                c16866d1.f64800a.mo47491d(1.0f);
                C16926y0.m47615e((View) this.f11887c, c16866d1);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f11885a) {
            case 0:
                ((AbstractC2974w) this.f11887c).f11920N.add(animator);
                break;
            case 1:
                ((InterfaceC16916u0) this.f11886b).mo30519b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C2967p(AbstractC2974w abstractC2974w, C0022g c0022g) {
        this.f11885a = 0;
        this.f11887c = abstractC2974w;
        this.f11886b = c0022g;
    }
}

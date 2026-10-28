package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1695j0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final float f6691a;

    /* JADX INFO: renamed from: b */
    public final float f6692b;

    /* JADX INFO: renamed from: c */
    public final float f6693c;

    /* JADX INFO: renamed from: d */
    public final float f6694d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1717o2 f6695e;

    /* JADX INFO: renamed from: f */
    public final int f6696f;

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f6697g;

    /* JADX INFO: renamed from: h */
    public boolean f6698h;

    /* JADX INFO: renamed from: i */
    public float f6699i;

    /* JADX INFO: renamed from: j */
    public float f6700j;

    /* JADX INFO: renamed from: k */
    public boolean f6701k = false;

    /* JADX INFO: renamed from: l */
    public boolean f6702l = false;

    /* JADX INFO: renamed from: m */
    public float f6703m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f6704n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ AbstractC1717o2 f6705o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1715o0 f6706p;

    public C1695j0(C1715o0 c1715o0, AbstractC1717o2 abstractC1717o2, int i13, float f13, float f14, float f15, float f16, int i14, AbstractC1717o2 abstractC1717o3) {
        this.f6706p = c1715o0;
        this.f6704n = i14;
        this.f6705o = abstractC1717o3;
        this.f6696f = i13;
        this.f6695e = abstractC1717o2;
        this.f6691a = f13;
        this.f6692b = f14;
        this.f6693c = f15;
        this.f6694d = f16;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6697g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C1666c0(this, 1));
        valueAnimatorOfFloat.setTarget(abstractC1717o2.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f6703m = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m5264a(Animator animator) {
        if (!this.f6702l) {
            this.f6695e.setIsRecyclable(true);
        }
        this.f6702l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6703m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m5264a(animator);
        if (this.f6701k) {
            return;
        }
        int i13 = this.f6704n;
        AbstractC1717o2 abstractC1717o2 = this.f6705o;
        C1715o0 c1715o0 = this.f6706p;
        if (i13 <= 0) {
            c1715o0.f6781m.clearView(c1715o0.f6786r, abstractC1717o2);
        } else {
            c1715o0.f6769a.add(abstractC1717o2.itemView);
            this.f6698h = true;
            if (i13 > 0) {
                c1715o0.f6786r.post(new RunnableC1699k0(c1715o0, this, i13));
            }
        }
        View view = c1715o0.f6791w;
        View view2 = abstractC1717o2.itemView;
        if (view == view2) {
            c1715o0.m5291n(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

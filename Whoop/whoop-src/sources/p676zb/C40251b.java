package p676zb;

import android.animation.Animator;

/* JADX INFO: renamed from: zb.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C40251b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40252c f174044a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40253d f174045b;

    public C40251b(C40253d c40253d, C40252c c40252c) {
        this.f174045b = c40253d;
        this.f174044a = c40252c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C40253d c40253d = this.f174045b;
        C40252c c40252c = this.f174044a;
        c40253d.m129250a(1.0f, c40252c, true);
        c40252c.f174055j = c40252c.f174049d;
        c40252c.f174056k = c40252c.f174050e;
        c40252c.f174057l = c40252c.f174051f;
        int i13 = c40252c.f174054i + 1;
        int[] iArr = c40252c.f174053h;
        int length = i13 % iArr.length;
        c40252c.f174054i = length;
        c40252c.f174061p = iArr[length];
        if (!c40253d.f174065E) {
            c40253d.f174069z += 1.0f;
            return;
        }
        c40253d.f174065E = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f174045b.f174069z = 0.0f;
    }
}

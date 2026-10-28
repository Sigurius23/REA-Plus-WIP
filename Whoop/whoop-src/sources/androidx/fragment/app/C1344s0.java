package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1344s0 {

    /* JADX INFO: renamed from: a */
    public final Animation f5796a;

    /* JADX INFO: renamed from: b */
    public final AnimatorSet f5797b;

    public C1344s0(Animation animation) {
        this.f5796a = animation;
        this.f5797b = null;
    }

    public C1344s0(Animator animator) {
        this.f5796a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5797b = animatorSet;
        animatorSet.play(animator);
    }
}

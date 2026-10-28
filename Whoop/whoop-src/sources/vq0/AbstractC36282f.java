package vq0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vq0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "shrinkTo", "", "scaleDownDuration", "scaleUpDuration", "Ll83/a0;", "a", "(Landroid/view/View;FJJ)V", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36282f {
    /* JADX INFO: renamed from: a */
    public static final void m115969a(View view, float f13, long j7, long j13) {
        AbstractC22676k.m65750j(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", f13);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f13);
        objectAnimatorOfFloat.setDuration(j7);
        objectAnimatorOfFloat2.setDuration(j7);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        objectAnimatorOfFloat3.setDuration(j13);
        objectAnimatorOfFloat4.setDuration(j13);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }
}

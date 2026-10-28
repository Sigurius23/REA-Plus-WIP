package io.getstream.chat.android.p226ui.common.internal;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import io.getstream.chat.android.p226ui.C19469R;
import p087db.C11845e;
import p479s4.AbstractC32122c;
import p543v4.AbstractC35642a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"HIGHLIGHT_ANIM_DURATION", "", "animateHighlight", "Landroid/animation/ValueAnimator;", "Landroid/view/View;", "highlightColor", "", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AnimationUtilsKt {
    private static final long HIGHLIGHT_ANIM_DURATION = 3000;

    public static final ValueAnimator animateHighlight(final View view, int i13) {
        AbstractC22676k.m65750j(view, "<this>");
        final int iM112838g = AbstractC35642a.m112838g(i13, 0);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i13), Integer.valueOf(i13), Integer.valueOf(i13), Integer.valueOf(iM112838g));
        valueAnimatorOfObject.setDuration(3000L);
        valueAnimatorOfObject.addUpdateListener(new C11845e(view, 2));
        valueAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: io.getstream.chat.android.ui.common.internal.AnimationUtilsKt$animateHighlight$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                view.setBackgroundColor(iM112838g);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        valueAnimatorOfObject.start();
        return valueAnimatorOfObject;
    }

    public static ValueAnimator animateHighlight$default(View view, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            Context context = view.getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            i13 = AbstractC32122c.getColor(context, C19469R.color.stream_ui_highlight);
        }
        return animateHighlight(view, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHighlight$lambda$2$lambda$0(View view, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }
}

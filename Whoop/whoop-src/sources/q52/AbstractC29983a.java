package q52;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import c93.InterfaceC4339a;
import i93.C18284j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import p087db.C11845e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q52.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"", "Ll83/k;", "", "", "timeline", "Lkotlin/Function1;", "Ll83/a0;", "onAnim", "Lkotlin/Function0;", "onEnd", "Landroid/animation/ValueAnimator;", "b", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)Landroid/animation/ValueAnimator;", "realtime-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29983a {

    /* JADX INFO: renamed from: q52.a$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"q52/a$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Ll83/a0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationRepeat", "onAnimationCancel", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC4339a f122450a;

        public a(InterfaceC4339a interfaceC4339a) {
            this.f122450a = interfaceC4339a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
            InterfaceC4339a interfaceC4339a = this.f122450a;
            if (interfaceC4339a != null) {
                interfaceC4339a.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ValueAnimator m91706b(List<C23465k> timeline, Function1 onAnim, InterfaceC4339a interfaceC4339a) {
        int iIntValue;
        AbstractC22676k.m65750j(timeline, "timeline");
        AbstractC22676k.m65750j(onAnim, "onAnim");
        Iterator<T> it = timeline.iterator();
        int iIntValue2 = 0;
        while (it.hasNext()) {
            iIntValue2 += ((Number) ((C23465k) it.next()).f92938x).intValue();
        }
        if (iIntValue2 < 1) {
            return null;
        }
        int size = timeline.size();
        Keyframe[] keyframeArr = new Keyframe[size];
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                iIntValue = 0;
            } else {
                Iterator it3 = AbstractC25265s.m74148s1(timeline, new C18284j(0, i13 - 1, 1)).iterator();
                iIntValue = 0;
                while (it3.hasNext()) {
                    iIntValue += ((Number) ((C23465k) it3.next()).f92938x).intValue();
                }
            }
            Keyframe keyframeOfFloat = Keyframe.ofFloat(iIntValue / iIntValue2, ((Number) timeline.get(i13).f92937w).floatValue());
            AbstractC22676k.m65749i(keyframeOfFloat, "ofFloat(...)");
            keyframeArr[i13] = keyframeOfFloat;
        }
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("value", (Keyframe[]) Arrays.copyOf(keyframeArr, size)));
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new C11845e(onAnim, 7));
        valueAnimatorOfPropertyValuesHolder.addListener(new a(interfaceC4339a));
        valueAnimatorOfPropertyValuesHolder.setDuration(iIntValue2);
        valueAnimatorOfPropertyValuesHolder.start();
        return valueAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m91707c(Function1 function1, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        function1.invoke((Float) animatedValue);
    }
}

package p287kq;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p002a0.C0021f1;

/* JADX INFO: renamed from: kq.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C22770e {

    /* JADX INFO: renamed from: a */
    public final C0021f1 f89679a = new C0021f1(0);

    /* JADX INFO: renamed from: b */
    public final C0021f1 f89680b = new C0021f1(0);

    /* JADX INFO: renamed from: a */
    public static C22770e m65972a(TypedArray typedArray, Context context, int i13) {
        int resourceId;
        if (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0) {
            return null;
        }
        return m65973b(context, resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static C22770e m65973b(Context context, int i13) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i13);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m65974c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m65974c(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i13), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C22770e m65974c(ArrayList arrayList) {
        C22770e c22770e = new C22770e();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Animator animator = (Animator) arrayList.get(i13);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c22770e.f89680b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC22766a.f89673b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC22766a.f89674c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC22766a.f89675d;
            }
            C22771f c22771f = new C22771f();
            c22771f.f89684d = 0;
            c22771f.f89685e = 1;
            c22771f.f89681a = startDelay;
            c22771f.f89682b = duration;
            c22771f.f89683c = interpolator;
            c22771f.f89684d = objectAnimator.getRepeatCount();
            c22771f.f89685e = objectAnimator.getRepeatMode();
            c22770e.f89679a.put(propertyName, c22771f);
        }
        return c22770e;
    }

    /* JADX INFO: renamed from: d */
    public final C22771f m65975d(String str) {
        C0021f1 c0021f1 = this.f89679a;
        if (c0021f1.get(str) != null) {
            return (C22771f) c0021f1.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22770e) {
            return this.f89679a.equals(((C22770e) obj).f89679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f89679a.hashCode();
    }

    public final String toString() {
        return "\n" + C22770e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f89679a + "}\n";
    }
}

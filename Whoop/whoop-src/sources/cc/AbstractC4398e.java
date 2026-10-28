package cc;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;

/* JADX INFO: renamed from: cc.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4398e {
    /* JADX INFO: renamed from: a */
    public static void m13816a(Object obj) {
        ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
    }

    /* JADX INFO: renamed from: b */
    public static void m13817b(Object obj, Object obj2) {
        ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13818c(Object obj, Object obj2) {
        return ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
    }
}

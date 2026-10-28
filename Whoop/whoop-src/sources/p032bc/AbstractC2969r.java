package p032bc;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: renamed from: bc.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2969r {
    /* JADX INFO: renamed from: a */
    public static long m8639a(Animator animator) {
        return animator.getTotalDuration();
    }

    /* JADX INFO: renamed from: b */
    public static void m8640b(Animator animator, long j7) {
        ((AnimatorSet) animator).setCurrentPlayTime(j7);
    }
}

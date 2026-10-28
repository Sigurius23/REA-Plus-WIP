package p311lq;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: lq.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24652k {

    /* JADX INFO: renamed from: a */
    public static final int[] f96421a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    public static void m72005a(AppBarLayout appBarLayout, float f13) {
        int integer = appBarLayout.getResources().getInteger(com.whoop.android.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j7 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.whoop.android.R.attr.state_liftable, -2130970115}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j7));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f13).setDuration(j7));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}

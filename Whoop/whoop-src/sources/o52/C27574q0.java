package o52;

import android.animation.ValueAnimator;
import com.whoop.realtime.presentation.StartActivityActivity;

/* JADX INFO: renamed from: o52.q0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27574q0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StartActivityActivity f111015b;

    public /* synthetic */ C27574q0(StartActivityActivity startActivityActivity, int i13) {
        this.f111014a = i13;
        this.f111015b = startActivityActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f111014a) {
            case 0:
                StartActivityActivity.m23942d1(this.f111015b, valueAnimator);
                break;
            default:
                StartActivityActivity.m23936b1(this.f111015b, valueAnimator);
                break;
        }
    }
}

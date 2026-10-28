package o52;

import android.animation.ValueAnimator;
import com.whoop.realtime.presentation.C9886j;

/* JADX INFO: renamed from: o52.h0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27556h0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110941a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9886j f110942b;

    public /* synthetic */ C27556h0(C9886j c9886j, int i13) {
        this.f110941a = i13;
        this.f110942b = c9886j;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f110941a) {
            case 0:
                C9886j.m24062h0(this.f110942b, valueAnimator);
                break;
            default:
                C9886j.m24072s0(this.f110942b, valueAnimator);
                break;
        }
    }
}

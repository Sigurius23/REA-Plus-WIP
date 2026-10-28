package p404pq;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kr.C22788g;

/* JADX INFO: renamed from: pq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29454b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f119618a;

    public C29454b(BottomSheetBehavior bottomSheetBehavior) {
        this.f119618a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C22788g c22788g = this.f119618a.f20812i;
        if (c22788g != null) {
            c22788g.m66012n(fFloatValue);
        }
    }
}

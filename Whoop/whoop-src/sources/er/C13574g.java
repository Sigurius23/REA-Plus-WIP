package er;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;
import p186h8.C16999a;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: er.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C13574g extends AbstractC13568a {

    /* JADX INFO: renamed from: g */
    public final float f47925g;

    /* JADX INFO: renamed from: h */
    public final float f47926h;

    public C13574g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f47925g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f47926h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m38316a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f47914b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i13), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C16999a(1));
        return animatorSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m38317b(float f13) {
        float interpolation = this.f47913a.getInterpolation(f13);
        View view = this.f47914b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f14 = this.f47925g / width;
        float f15 = this.f47926h / height;
        float fM65969a = 1.0f - AbstractC22766a.m65969a(0.0f, f14, interpolation);
        float fM65969a2 = 1.0f - AbstractC22766a.m65969a(0.0f, f15, interpolation);
        view.setScaleX(fM65969a);
        view.setPivotY(height);
        view.setScaleY(fM65969a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM65969a2 != 0.0f ? fM65969a / fM65969a2 : 1.0f);
            }
        }
    }
}

package er;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: er.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C13576i extends AbstractC13568a {

    /* JADX INFO: renamed from: g */
    public final float f47930g;

    /* JADX INFO: renamed from: h */
    public final float f47931h;

    /* JADX INFO: renamed from: i */
    public final float f47932i;

    public C13576i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f47930g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f47931h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f47932i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* JADX INFO: renamed from: a */
    public final void m38318a(float f13, int i13, boolean z4) {
        float interpolation = this.f47913a.getInterpolation(f13);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        View view = this.f47914b;
        boolean z13 = (Gravity.getAbsoluteGravity(i13, view.getLayoutDirection()) & 3) == 3;
        boolean z14 = z4 == z13;
        int width = view.getWidth();
        int height = view.getHeight();
        float f14 = width;
        if (f14 > 0.0f) {
            float f15 = height;
            if (f15 <= 0.0f) {
                return;
            }
            float f16 = this.f47930g / f14;
            float f17 = this.f47931h / f14;
            float f18 = this.f47932i / f15;
            if (z13) {
                f14 = 0.0f;
            }
            view.setPivotX(f14);
            if (!z14) {
                f17 = -f16;
            }
            float fM65969a = AbstractC22766a.m65969a(0.0f, f17, interpolation);
            float f19 = fM65969a + 1.0f;
            view.setScaleX(f19);
            float fM65969a2 = 1.0f - AbstractC22766a.m65969a(0.0f, f18, interpolation);
            view.setScaleY(fM65969a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    childAt.setPivotX(z13 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f24 = z14 ? 1.0f - fM65969a : 1.0f;
                    float f25 = fM65969a2 != 0.0f ? (f19 / fM65969a2) * f24 : 1.0f;
                    childAt.setScaleX(f24);
                    childAt.setScaleY(f25);
                }
            }
        }
    }
}

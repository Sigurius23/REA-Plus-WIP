package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.x0 */
/* JADX INFO: loaded from: classes5.dex */
public class C1751x0 extends AbstractC1697j2 {

    /* JADX INFO: renamed from: k */
    public PointF f6925k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f6926l;

    /* JADX INFO: renamed from: n */
    public float f6928n;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f6923i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f6924j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    public boolean f6927m = false;

    /* JADX INFO: renamed from: o */
    public int f6929o = 0;

    /* JADX INFO: renamed from: p */
    public int f6930p = 0;

    public C1751x0(Context context) {
        this.f6926l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: e */
    public static int m5344e(int i13, int i14, int i15, int i16, int i17) {
        if (i17 == -1) {
            return i15 - i13;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                return i16 - i14;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i18 = i15 - i13;
        if (i18 > 0) {
            return i18;
        }
        int i19 = i16 - i14;
        if (i19 < 0) {
            return i19;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // androidx.recyclerview.widget.AbstractC1697j2
    /* JADX INFO: renamed from: c */
    public void mo5228c(View view, C1689h2 c1689h2) {
        int i13;
        PointF pointF = this.f6925k;
        int i14 = 0;
        if (pointF != null) {
            float f13 = pointF.x;
            if (f13 == 0.0f) {
                i13 = 0;
            } else {
                i13 = f13 > 0.0f ? 1 : -1;
            }
        } else {
            i13 = 0;
        }
        int iMo5345f = mo5345f(view, i13);
        PointF pointF2 = this.f6925k;
        if (pointF2 != null) {
            float f14 = pointF2.y;
            if (f14 != 0.0f) {
                i14 = f14 > 0.0f ? 1 : -1;
            }
        }
        int iMo5346g = mo5346g(view, i14);
        int iCeil = (int) Math.ceil(((double) mo5230i((int) Math.sqrt((iMo5346g * iMo5346g) + (iMo5345f * iMo5345f)))) / 0.3356d);
        if (iCeil > 0) {
            c1689h2.f6673a = -iMo5345f;
            c1689h2.f6674b = -iMo5346g;
            c1689h2.f6675c = iCeil;
            c1689h2.f6677e = this.f6924j;
            c1689h2.f6678f = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public int mo5345f(View view, int i13) {
        AbstractC1740u1 abstractC1740u1 = this.f6709c;
        if (abstractC1740u1 == null || !abstractC1740u1.canScrollHorizontally()) {
            return 0;
        }
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        return m5344e(abstractC1740u1.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin, abstractC1740u1.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin, abstractC1740u1.getPaddingLeft(), abstractC1740u1.getWidth() - abstractC1740u1.getPaddingRight(), i13);
    }

    /* JADX INFO: renamed from: g */
    public int mo5346g(View view, int i13) {
        AbstractC1740u1 abstractC1740u1 = this.f6709c;
        if (abstractC1740u1 == null || !abstractC1740u1.canScrollVertically()) {
            return 0;
        }
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        return m5344e(abstractC1740u1.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) c1744v1).topMargin, abstractC1740u1.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) c1744v1).bottomMargin, abstractC1740u1.getPaddingTop(), abstractC1740u1.getHeight() - abstractC1740u1.getPaddingBottom(), i13);
    }

    /* JADX INFO: renamed from: h */
    public float mo5229h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: i */
    public int mo5230i(int i13) {
        float fAbs = Math.abs(i13);
        if (!this.f6927m) {
            this.f6928n = mo5229h(this.f6926l);
            this.f6927m = true;
        }
        return (int) Math.ceil(fAbs * this.f6928n);
    }
}

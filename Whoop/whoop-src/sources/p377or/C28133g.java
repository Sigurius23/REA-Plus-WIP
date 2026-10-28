package p377or;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import cr.AbstractC11075m;
import java.util.WeakHashMap;
import ng3.C26702o;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: or.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C28133g extends LinearLayout {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f113773y = 0;

    /* JADX INFO: renamed from: w */
    public ValueAnimator f113774w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TabLayout f113775x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28133g(TabLayout tabLayout, Context context) {
        super(context);
        this.f113775x = tabLayout;
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m85119a(int i13) {
        TabLayout tabLayout = this.f113775x;
        if (tabLayout.f21100x0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i13);
            C26702o c26702o = tabLayout.f21086l0;
            Drawable drawable = tabLayout.f21066O;
            c26702o.getClass();
            RectF rectFM79408k = C26702o.m79408k(tabLayout, childAt);
            drawable.setBounds((int) rectFM79408k.left, drawable.getBounds().top, (int) rectFM79408k.right, drawable.getBounds().bottom);
            tabLayout.f21097w = i13;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m85120b(int i13) {
        TabLayout tabLayout = this.f113775x;
        Rect bounds = tabLayout.f21066O.getBounds();
        tabLayout.f21066O.setBounds(bounds.left, 0, bounds.right, i13);
        requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public final void m85121c(View view, View view2, float f13) {
        TabLayout tabLayout = this.f113775x;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f21066O;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f21066O.getBounds().bottom);
        } else {
            tabLayout.f21086l0.mo79417p(tabLayout, view, view2, f13, tabLayout.f21066O);
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: d */
    public final void m85122d(int i13, int i14, boolean z4) {
        TabLayout tabLayout = this.f113775x;
        if (tabLayout.f21097w == i13) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i13);
        if (childAt2 == null) {
            m85119a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f21097w = i13;
        C28132f c28132f = new C28132f(this, childAt, childAt2);
        if (!z4) {
            this.f113774w.removeAllUpdateListeners();
            this.f113774w.addUpdateListener(c28132f);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f113774w = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f21087m0);
        valueAnimator.setDuration(i14);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c28132f);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f113775x;
        int iHeight = tabLayout.f21066O.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f21066O.getIntrinsicHeight();
        }
        int i13 = tabLayout.f21079e0;
        if (i13 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i13 != 1) {
            height = 0;
            if (i13 != 2) {
                iHeight = i13 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f21066O.getBounds().width() > 0) {
            Rect bounds = tabLayout.f21066O.getBounds();
            tabLayout.f21066O.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f21066O.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        ValueAnimator valueAnimator = this.f113774w;
        TabLayout tabLayout = this.f113775x;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m85122d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f21097w == -1) {
            tabLayout.f21097w = tabLayout.getSelectedTabPosition();
        }
        m85119a(tabLayout.f21097w);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (View.MeasureSpec.getMode(i13) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f113775x;
        boolean z4 = true;
        if (tabLayout.f21077c0 == 1 || tabLayout.f21080f0 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC11075m.m29870d(getContext(), 16)) * 2)) {
                boolean z13 = false;
                for (int i16 = 0; i16 < childCount; i16++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i16).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z13 = true;
                    }
                }
                z4 = z13;
            } else {
                tabLayout.f21077c0 = 0;
                tabLayout.m15795o(false);
            }
            if (z4) {
                super.onMeasure(i13, i14);
            }
        }
    }
}

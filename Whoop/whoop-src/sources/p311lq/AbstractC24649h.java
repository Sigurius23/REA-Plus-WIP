package p311lq;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: lq.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24649h extends AbstractC24650i {

    /* JADX INFO: renamed from: c */
    public final Rect f96411c;

    /* JADX INFO: renamed from: d */
    public final Rect f96412d;

    /* JADX INFO: renamed from: e */
    public int f96413e;

    /* JADX INFO: renamed from: f */
    public int f96414f;

    public AbstractC24649h() {
        this.f96411c = new Rect();
        this.f96412d = new Rect();
        this.f96413e = 0;
    }

    @Override // p311lq.AbstractC24650i
    /* JADX INFO: renamed from: J */
    public final void mo72000J(CoordinatorLayout coordinatorLayout, View view, int i13) {
        AppBarLayout appBarLayoutM15672L = AppBarLayout.ScrollingViewBehavior.m15672L(coordinatorLayout.m3662k(view));
        if (appBarLayoutM15672L == null) {
            coordinatorLayout.m3666q(view, i13);
            this.f96413e = 0;
            return;
        }
        C29960e c29960e = (C29960e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin;
        int bottom = appBarLayoutM15672L.getBottom() + ((ViewGroup.MarginLayoutParams) c29960e).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c29960e).rightMargin;
        int bottom2 = ((appBarLayoutM15672L.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin;
        Rect rect = this.f96411c;
        rect.set(paddingLeft, bottom, width, bottom2);
        C16905q1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.m47598b() + rect.left;
                rect.right -= lastWindowInsets.m47599c();
            }
        }
        int i14 = c29960e.f122366c;
        if (i14 == 0) {
            i14 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f96412d;
        Gravity.apply(i14, measuredWidth, measuredHeight, rect, rect2, i13);
        int iM72001K = m72001K(appBarLayoutM15672L);
        view.layout(rect2.left, rect2.top - iM72001K, rect2.right, rect2.bottom - iM72001K);
        this.f96413e = rect2.top - appBarLayoutM15672L.getBottom();
    }

    /* JADX INFO: renamed from: K */
    public final int m72001K(View view) {
        int i13;
        if (this.f96414f == 0) {
            return 0;
        }
        float f13 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            AbstractC29957b abstractC29957b = ((C29960e) appBarLayout.getLayoutParams()).f122364a;
            int iMo15662K = abstractC29957b instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) abstractC29957b).mo15662K() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo15662K > downNestedPreScrollRange) && (i13 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f13 = (iMo15662K / i13) + 1.0f;
            }
        }
        int i14 = this.f96414f;
        return AbstractC31479j.m96939r((int) (f13 * i14), 0, i14);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: q */
    public final boolean mo15669q(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        AppBarLayout appBarLayoutM15672L;
        C16905q1 lastWindowInsets;
        int i17 = view.getLayoutParams().height;
        if ((i17 != -1 && i17 != -2) || (appBarLayoutM15672L = AppBarLayout.ScrollingViewBehavior.m15672L(coordinatorLayout.m3662k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i15);
        if (size > 0) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (appBarLayoutM15672L.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m47597a() + lastWindowInsets.m47600d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = appBarLayoutM15672L.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutM15672L.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.m3667r(view, i13, i14, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i17 == -1 ? 1073741824 : Integer.MIN_VALUE), i16);
        return true;
    }

    public AbstractC24649h(int i13) {
        super(0);
        this.f96411c = new Rect();
        this.f96412d = new Rect();
        this.f96413e = 0;
    }
}

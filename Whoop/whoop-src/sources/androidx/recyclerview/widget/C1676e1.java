package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e1 */
/* JADX INFO: loaded from: classes5.dex */
public class C1676e1 extends AbstractC1752x1 {

    /* JADX INFO: renamed from: a */
    public RecyclerView f6640a;

    /* JADX INFO: renamed from: b */
    public final C1729r2 f6641b = new C1729r2(this);

    /* JADX INFO: renamed from: c */
    public C1662b1 f6642c;

    /* JADX INFO: renamed from: d */
    public C1662b1 f6643d;

    /* JADX INFO: renamed from: c */
    public static int m5233c(View view, AbstractC1667c1 abstractC1667c1) {
        return ((abstractC1667c1.mo5179c(view) / 2) + abstractC1667c1.mo5181e(view)) - ((abstractC1667c1.mo5188l() / 2) + abstractC1667c1.mo5187k());
    }

    /* JADX INFO: renamed from: d */
    public static View m5234d(AbstractC1740u1 abstractC1740u1, AbstractC1667c1 abstractC1667c1) {
        int childCount = abstractC1740u1.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo5188l = (abstractC1667c1.mo5188l() / 2) + abstractC1667c1.mo5187k();
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = abstractC1740u1.getChildAt(i14);
            int iAbs = Math.abs(((abstractC1667c1.mo5179c(childAt) / 2) + abstractC1667c1.mo5181e(childAt)) - iMo5188l);
            if (iAbs < i13) {
                view = childAt;
                i13 = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final void m5235a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6640a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C1729r2 c1729r2 = this.f6641b;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c1729r2);
            this.f6640a.setOnFlingListener(null);
        }
        this.f6640a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f6640a.addOnScrollListener(c1729r2);
            this.f6640a.setOnFlingListener(this);
            new Scroller(this.f6640a.getContext(), new DecelerateInterpolator());
            m5240h();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m5236b(AbstractC1740u1 abstractC1740u1, View view) {
        int[] iArr = new int[2];
        if (abstractC1740u1.canScrollHorizontally()) {
            iArr[0] = m5233c(view, m5238f(abstractC1740u1));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1740u1.canScrollVertically()) {
            iArr[1] = m5233c(view, m5239g(abstractC1740u1));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public View mo5237e(AbstractC1740u1 abstractC1740u1) {
        if (abstractC1740u1.canScrollVertically()) {
            return m5234d(abstractC1740u1, m5239g(abstractC1740u1));
        }
        if (abstractC1740u1.canScrollHorizontally()) {
            return m5234d(abstractC1740u1, m5238f(abstractC1740u1));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1667c1 m5238f(AbstractC1740u1 abstractC1740u1) {
        C1662b1 c1662b1 = this.f6643d;
        if (c1662b1 == null || c1662b1.f6588a != abstractC1740u1) {
            this.f6643d = new C1662b1(abstractC1740u1, 0);
        }
        return this.f6643d;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1667c1 m5239g(AbstractC1740u1 abstractC1740u1) {
        C1662b1 c1662b1 = this.f6642c;
        if (c1662b1 == null || c1662b1.f6588a != abstractC1740u1) {
            this.f6642c = new C1662b1(abstractC1740u1, 1);
        }
        return this.f6642c;
    }

    /* JADX INFO: renamed from: h */
    public final void m5240h() {
        AbstractC1740u1 layoutManager;
        View viewMo5237e;
        RecyclerView recyclerView = this.f6640a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo5237e = mo5237e(layoutManager)) == null) {
            return;
        }
        int[] iArrM5236b = m5236b(layoutManager, viewMo5237e);
        int i13 = iArrM5236b[0];
        if (i13 == 0 && iArrM5236b[1] == 0) {
            return;
        }
        this.f6640a.smoothScrollBy(i13, iArrM5236b[1], null);
    }
}

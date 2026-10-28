package p190hc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.C1856d;
import androidx.viewpager2.widget.ViewPager2;
import fo.C14657c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import p026b2.C2298d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: hc.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C17140c extends AbstractC1760z1 {

    /* JADX INFO: renamed from: a */
    public C1856d f65812a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f65813b;

    /* JADX INFO: renamed from: c */
    public final C17149l f65814c;

    /* JADX INFO: renamed from: d */
    public final LinearLayoutManager f65815d;

    /* JADX INFO: renamed from: e */
    public int f65816e;

    /* JADX INFO: renamed from: f */
    public int f65817f;

    /* JADX INFO: renamed from: g */
    public final C14657c f65818g;

    /* JADX INFO: renamed from: h */
    public int f65819h;

    /* JADX INFO: renamed from: i */
    public int f65820i;

    /* JADX INFO: renamed from: j */
    public boolean f65821j;

    /* JADX INFO: renamed from: k */
    public boolean f65822k;

    /* JADX INFO: renamed from: l */
    public boolean f65823l;

    public C17140c(ViewPager2 viewPager2) {
        this.f65813b = viewPager2;
        C17149l c17149l = viewPager2.f7316J;
        this.f65814c = c17149l;
        this.f65815d = (LinearLayoutManager) c17149l.getLayoutManager();
        this.f65818g = new C14657c();
        m48384c();
    }

    /* JADX INFO: renamed from: a */
    public final void m48382a(int i13) {
        C1856d c1856d = this.f65812a;
        if (c1856d != null) {
            c1856d.onPageSelected(i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48383b(int i13) {
        if ((this.f65816e == 3 && this.f65817f == 0) || this.f65817f == i13) {
            return;
        }
        this.f65817f = i13;
        C1856d c1856d = this.f65812a;
        if (c1856d != null) {
            c1856d.onPageScrollStateChanged(i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m48384c() {
        this.f65816e = 0;
        this.f65817f = 0;
        C14657c c14657c = this.f65818g;
        c14657c.f54092a = -1;
        c14657c.f54093b = 0.0f;
        c14657c.f54094c = 0;
        this.f65819h = -1;
        this.f65820i = -1;
        this.f65821j = false;
        this.f65822k = false;
        this.f65823l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134 A[LOOP:2: B:64:0x0128->B:67:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0137 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m48385d() {
        int top;
        int childCount;
        int top2;
        int i13;
        int bottom;
        int i14;
        LinearLayoutManager linearLayoutManager = this.f65815d;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        C14657c c14657c = this.f65818g;
        c14657c.f54092a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            c14657c.f54092a = -1;
            c14657c.f54093b = 0.0f;
            c14657c.f54094c = 0;
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            c14657c.f54092a = -1;
            c14657c.f54093b = 0.0f;
            c14657c.f54094c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = linearLayoutManager.getOrientation();
        C17149l c17149l = this.f65814c;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - c17149l.getPaddingLeft();
            if (this.f65813b.f7313G.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - c17149l.getPaddingTop();
        }
        int i15 = -top;
        c14657c.f54094c = i15;
        if (i15 >= 0) {
            c14657c.f54093b = height != 0 ? i15 / height : 0.0f;
            return;
        }
        int childCount2 = linearLayoutManager.getChildCount();
        if (childCount2 != 0) {
            boolean z4 = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = linearLayoutManager.getChildAt(i16);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C17138a.f65811a;
                int[] iArr2 = iArr[i16];
                if (z4) {
                    top2 = childAt.getLeft();
                    i13 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i13 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i13;
                int[] iArr3 = iArr[i16];
                if (z4) {
                    bottom = childAt.getRight();
                    i14 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i14 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i14;
            }
            Arrays.sort(iArr, new C2298d(5));
            int i17 = 1;
            while (true) {
                if (i17 >= childCount2) {
                    int[] iArr4 = iArr[0];
                    int i18 = iArr4[1];
                    int i19 = iArr4[0];
                    int i24 = i18 - i19;
                    if (i19 <= 0 && iArr[childCount2 - 1][1] >= i24) {
                        if (linearLayoutManager.getChildCount() <= 1) {
                        }
                    }
                } else if (iArr[i17 - 1][1] == iArr[i17][0]) {
                    i17++;
                }
                childCount = linearLayoutManager.getChildCount();
                for (int i25 = 0; i25 < childCount; i25++) {
                    if (!C17138a.m48381a(linearLayoutManager.getChildAt(i25))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.getChildCount() <= 1) {
            childCount = linearLayoutManager.getChildCount();
            while (i25 < childCount) {
                if (!C17138a.m48381a(linearLayoutManager.getChildAt(i25))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(AbstractC2875y.m8295h(c14657c.f54094c, "Page can only be offset by a positive amount, not by "));
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i13) {
        C1856d c1856d;
        int i14 = this.f65816e;
        if (!(i14 == 1 && this.f65817f == 1) && i13 == 1) {
            this.f65816e = 1;
            int i15 = this.f65820i;
            if (i15 != -1) {
                this.f65819h = i15;
                this.f65820i = -1;
            } else if (this.f65819h == -1) {
                this.f65819h = this.f65815d.findFirstVisibleItemPosition();
            }
            m48383b(1);
            return;
        }
        if ((i14 == 1 || i14 == 4) && i13 == 2) {
            if (this.f65822k) {
                m48383b(2);
                this.f65821j = true;
                return;
            }
            return;
        }
        C14657c c14657c = this.f65818g;
        if ((i14 == 1 || i14 == 4) && i13 == 0) {
            m48385d();
            if (!this.f65822k) {
                int i16 = c14657c.f54092a;
                if (i16 != -1 && (c1856d = this.f65812a) != null) {
                    c1856d.onPageScrolled(i16, 0.0f, 0);
                }
            } else if (c14657c.f54094c == 0) {
                int i17 = this.f65819h;
                int i18 = c14657c.f54092a;
                if (i17 != i18) {
                    m48382a(i18);
                }
            }
            m48383b(0);
            m48384c();
        }
        if (this.f65816e == 2 && i13 == 0 && this.f65823l) {
            m48385d();
            if (c14657c.f54094c == 0) {
                int i19 = this.f65820i;
                int i24 = c14657c.f54092a;
                if (i19 != i24) {
                    if (i24 == -1) {
                        i24 = 0;
                    }
                    m48382a(i24);
                }
                m48383b(0);
                m48384c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrolled(RecyclerView recyclerView, int i13, int i14) {
        int i15;
        this.f65822k = true;
        m48385d();
        boolean z4 = this.f65821j;
        C14657c c14657c = this.f65818g;
        if (z4) {
            this.f65821j = false;
            if (i14 <= 0) {
                if (i14 == 0) {
                    if ((i13 < 0) == (this.f65813b.f7313G.getLayoutDirection() == 1)) {
                        if (c14657c.f54094c != 0) {
                            i15 = c14657c.f54092a + 1;
                        }
                    }
                }
                i15 = c14657c.f54092a;
            } else if (c14657c.f54094c != 0) {
                i15 = c14657c.f54092a + 1;
            } else {
                i15 = c14657c.f54092a;
            }
            this.f65820i = i15;
            if (this.f65819h != i15) {
                m48382a(i15);
            }
        } else if (this.f65816e == 0) {
            int i16 = c14657c.f54092a;
            if (i16 == -1) {
                i16 = 0;
            }
            m48382a(i16);
        }
        int i17 = c14657c.f54092a;
        if (i17 == -1) {
            i17 = 0;
        }
        float f13 = c14657c.f54093b;
        int i18 = c14657c.f54094c;
        C1856d c1856d = this.f65812a;
        if (c1856d != null) {
            c1856d.onPageScrolled(i17, f13, i18);
        }
        int i19 = c14657c.f54092a;
        int i24 = this.f65820i;
        if ((i19 == i24 || i24 == -1) && c14657c.f54094c == 0 && this.f65817f != 1) {
            m48383b(0);
            m48384c();
        }
    }
}

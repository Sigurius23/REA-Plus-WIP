package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000.AbstractC30802r;
import p016an.C1053d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C1694j {

    /* JADX INFO: renamed from: a */
    public final C1684g1 f6686a;

    /* JADX INFO: renamed from: e */
    public View f6690e;

    /* JADX INFO: renamed from: d */
    public int f6689d = 0;

    /* JADX INFO: renamed from: b */
    public final C1053d f6687b = new C1053d(2);

    /* JADX INFO: renamed from: c */
    public final ArrayList f6688c = new ArrayList();

    public C1694j(C1684g1 c1684g1) {
        this.f6686a = c1684g1;
    }

    /* JADX INFO: renamed from: a */
    public final void m5252a(View view, int i13, boolean z4) {
        RecyclerView recyclerView = this.f6686a.f6659a;
        int childCount = i13 < 0 ? recyclerView.getChildCount() : m5257f(i13);
        this.f6687b.m3085J(childCount, z4);
        if (z4) {
            m5260i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m5253b(View view, int i13, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = this.f6686a.f6659a;
        int childCount = i13 < 0 ? recyclerView.getChildCount() : m5257f(i13);
        this.f6687b.m3085J(childCount, z4);
        if (z4) {
            m5260i(view);
        }
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb4 = new StringBuilder("Called attach on a child which is not detached: ");
                sb4.append(childViewHolderInt);
                throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, sb4));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb5 = new StringBuilder("No ViewHolder found for child: ");
            sb5.append(view);
            sb5.append(", index: ");
            sb5.append(childCount);
            throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, sb5));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m5254c(int i13) {
        int iM5257f = m5257f(i13);
        this.f6687b.m3087L(iM5257f);
        RecyclerView recyclerView = this.f6686a.f6659a;
        View childAt = recyclerView.getChildAt(iM5257f);
        if (childAt != null) {
            AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb4 = new StringBuilder("called detach on an already detached child ");
                    sb4.append(childViewHolderInt);
                    throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, sb4));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb5 = new StringBuilder("No view at offset ");
            sb5.append(iM5257f);
            throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, sb5));
        }
        recyclerView.detachViewFromParent(iM5257f);
    }

    /* JADX INFO: renamed from: d */
    public final View m5255d(int i13) {
        return this.f6686a.f6659a.getChildAt(m5257f(i13));
    }

    /* JADX INFO: renamed from: e */
    public final int m5256e() {
        return this.f6686a.f6659a.getChildCount() - this.f6688c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m5257f(int i13) {
        if (i13 < 0) {
            return -1;
        }
        int childCount = this.f6686a.f6659a.getChildCount();
        int i14 = i13;
        while (i14 < childCount) {
            C1053d c1053d = this.f6687b;
            int iM3082G = i13 - (i14 - c1053d.m3082G(i14));
            if (iM3082G == 0) {
                while (c1053d.m3084I(i14)) {
                    i14++;
                }
                return i14;
            }
            i14 += iM3082G;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final View m5258g(int i13) {
        return this.f6686a.f6659a.getChildAt(i13);
    }

    /* JADX INFO: renamed from: h */
    public final int m5259h() {
        return this.f6686a.f6659a.getChildCount();
    }

    /* JADX INFO: renamed from: i */
    public final void m5260i(View view) {
        this.f6688c.add(view);
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f6686a.f6659a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m5261j(View view) {
        int iIndexOfChild = this.f6686a.f6659a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        C1053d c1053d = this.f6687b;
        if (c1053d.m3084I(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - c1053d.m3082G(iIndexOfChild);
    }

    /* JADX INFO: renamed from: k */
    public final void m5262k(int i13) {
        C1684g1 c1684g1 = this.f6686a;
        int i14 = this.f6689d;
        if (i14 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i14 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM5257f = m5257f(i13);
            View childAt = c1684g1.f6659a.getChildAt(iM5257f);
            if (childAt != null) {
                this.f6689d = 1;
                this.f6690e = childAt;
                if (this.f6687b.m3087L(iM5257f)) {
                    m5263l(childAt);
                }
                c1684g1.m5247c(iM5257f);
            }
        } finally {
            this.f6689d = 0;
            this.f6690e = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5263l(View view) {
        AbstractC1717o2 childViewHolderInt;
        if (!this.f6688c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState(this.f6686a.f6659a);
    }

    public final String toString() {
        return this.f6687b.toString() + ", hidden list:" + this.f6688c.size();
    }
}

package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1677e2 extends AbstractC1700k1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f6644a;

    public C1677e2(RecyclerView recyclerView) {
        this.f6644a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m5241a() {
        boolean z4 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f6644a;
        if (!z4 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onChanged() {
        RecyclerView recyclerView = this.f6644a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f6726f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.m5172g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeChanged(int i13, int i14, Object obj) {
        RecyclerView recyclerView = this.f6644a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1660b c1660b = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1660b.f6573b;
        if (i14 < 1) {
            return;
        }
        arrayList.add(c1660b.m5173h(obj, 4, i13, i14));
        c1660b.f6577f |= 4;
        if (arrayList.size() == 1) {
            m5241a();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeInserted(int i13, int i14) {
        RecyclerView recyclerView = this.f6644a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1660b c1660b = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1660b.f6573b;
        if (i14 < 1) {
            return;
        }
        arrayList.add(c1660b.m5173h(null, 1, i13, i14));
        c1660b.f6577f |= 1;
        if (arrayList.size() == 1) {
            m5241a();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeMoved(int i13, int i14, int i15) {
        RecyclerView recyclerView = this.f6644a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1660b c1660b = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1660b.f6573b;
        if (i13 == i14) {
            return;
        }
        arrayList.add(c1660b.m5173h(null, 8, i13, i14));
        c1660b.f6577f |= 8;
        if (arrayList.size() == 1) {
            m5241a();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeRemoved(int i13, int i14) {
        RecyclerView recyclerView = this.f6644a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1660b c1660b = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1660b.f6573b;
        if (i14 < 1) {
            return;
        }
        arrayList.add(c1660b.m5173h(null, 2, i13, i14));
        c1660b.f6577f |= 2;
        if (arrayList.size() == 1) {
            m5241a();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onStateRestorationPolicyChanged() {
        AbstractC1692i1 abstractC1692i1;
        RecyclerView recyclerView = this.f6644a;
        if (recyclerView.mPendingSavedState == null || (abstractC1692i1 = recyclerView.mAdapter) == null || !abstractC1692i1.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}

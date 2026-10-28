package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1684g1 implements InterfaceC1664b3, InterfaceC1712n1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f6659a;

    public /* synthetic */ C1684g1(RecyclerView recyclerView) {
        this.f6659a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m5245a(C1655a c1655a) {
        int i13 = c1655a.f6559a;
        RecyclerView recyclerView = this.f6659a;
        if (i13 == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, c1655a.f6560b, c1655a.f6562d);
            return;
        }
        if (i13 == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, c1655a.f6560b, c1655a.f6562d);
        } else if (i13 == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, c1655a.f6560b, c1655a.f6562d, c1655a.f6561c);
        } else {
            if (i13 != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, c1655a.f6560b, c1655a.f6562d, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1717o2 m5246b(int i13) {
        RecyclerView recyclerView = this.f6659a;
        AbstractC1717o2 abstractC1717o2FindViewHolderForPosition = recyclerView.findViewHolderForPosition(i13, true);
        if (abstractC1717o2FindViewHolderForPosition != null) {
            C1694j c1694j = recyclerView.mChildHelper;
            if (!c1694j.f6688c.contains(abstractC1717o2FindViewHolderForPosition.itemView)) {
                return abstractC1717o2FindViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m5247c(int i13) {
        RecyclerView recyclerView = this.f6659a;
        View childAt = recyclerView.getChildAt(i13);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i13);
    }
}

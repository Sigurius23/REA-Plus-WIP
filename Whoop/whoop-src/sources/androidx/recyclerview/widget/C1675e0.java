package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1675e0 implements InterfaceC1732s1 {

    /* JADX INFO: renamed from: a */
    public int f6636a;

    /* JADX INFO: renamed from: b */
    public int f6637b;

    /* JADX INFO: renamed from: c */
    public int[] f6638c;

    /* JADX INFO: renamed from: d */
    public int f6639d;

    /* JADX INFO: renamed from: a */
    public final void m5231a(int i13, int i14) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i15 = this.f6639d;
        int i16 = i15 * 2;
        int[] iArr = this.f6638c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f6638c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i16 >= iArr.length) {
            int[] iArr3 = new int[i15 * 4];
            this.f6638c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f6638c;
        iArr4[i16] = i13;
        iArr4[i16 + 1] = i14;
        this.f6639d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m5232b(RecyclerView recyclerView, boolean z4) {
        this.f6639d = 0;
        int[] iArr = this.f6638c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1740u1 abstractC1740u1 = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || abstractC1740u1 == null || !abstractC1740u1.isItemPrefetchEnabled()) {
            return;
        }
        if (z4) {
            if (!recyclerView.mAdapterHelper.m5172g()) {
                abstractC1740u1.collectInitialPrefetchPositions(recyclerView.mAdapter.getDisplayCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            abstractC1740u1.collectAdjacentPrefetchPositions(this.f6636a, this.f6637b, recyclerView.mState, this);
        }
        int i13 = this.f6639d;
        if (i13 > abstractC1740u1.mPrefetchMaxCountObserved) {
            abstractC1740u1.mPrefetchMaxCountObserved = i13;
            abstractC1740u1.mPrefetchMaxObservedInInitialPrefetch = z4;
            recyclerView.mRecycler.m5207n();
        }
    }
}

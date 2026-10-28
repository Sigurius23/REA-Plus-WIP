package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1699k0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C1695j0 f6718w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f6719x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1715o0 f6720y;

    public RunnableC1699k0(C1715o0 c1715o0, C1695j0 c1695j0, int i13) {
        this.f6720y = c1715o0;
        this.f6718w = c1695j0;
        this.f6719x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1695j0 c1695j0 = this.f6718w;
        AbstractC1717o2 abstractC1717o2 = c1695j0.f6695e;
        C1715o0 c1715o0 = this.f6720y;
        RecyclerView recyclerView = c1715o0.f6786r;
        if (recyclerView == null || !recyclerView.mIsAttached || c1695j0.f6701k || abstractC1717o2.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        AbstractC1720p1 itemAnimator = c1715o0.f6786r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.mo5300f()) {
            ArrayList arrayList = c1715o0.f6784p;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((C1695j0) arrayList.get(i13)).f6702l) {
                }
            }
            c1715o0.f6781m.onSwiped(abstractC1717o2, this.f6719x);
            return;
        }
        c1715o0.f6786r.post(this);
    }
}

package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p029b5.AbstractC2732k;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1683g0 implements Runnable {

    /* JADX INFO: renamed from: E */
    public static final ThreadLocal f6653E = new ThreadLocal();

    /* JADX INFO: renamed from: F */
    public static final C1726r f6654F = new C1726r(1);

    /* JADX INFO: renamed from: w */
    public ArrayList f6655w;

    /* JADX INFO: renamed from: x */
    public long f6656x;

    /* JADX INFO: renamed from: y */
    public long f6657y;

    /* JADX INFO: renamed from: z */
    public ArrayList f6658z;

    /* JADX INFO: renamed from: c */
    public static AbstractC1717o2 m5242c(RecyclerView recyclerView, int i13, long j7) {
        int iM5259h = recyclerView.mChildHelper.m5259h();
        for (int i14 = 0; i14 < iM5259h; i14++) {
            AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m5258g(i14));
            if (childViewHolderInt.mPosition == i13 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        C1668c2 c1668c2 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            AbstractC1717o2 abstractC1717o2M5205l = c1668c2.m5205l(i13, j7);
            if (abstractC1717o2M5205l != null) {
                if (!abstractC1717o2M5205l.isBound() || abstractC1717o2M5205l.isInvalid()) {
                    c1668c2.m5195a(abstractC1717o2M5205l, false);
                } else {
                    c1668c2.m5202i(abstractC1717o2M5205l.itemView);
                }
            }
            return abstractC1717o2M5205l;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5243a(RecyclerView recyclerView, int i13, int i14) {
        if (recyclerView.mIsAttached) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f6655w.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f6656x == 0) {
                this.f6656x = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1675e0 c1675e0 = recyclerView.mPrefetchRegistry;
        c1675e0.f6636a = i13;
        c1675e0.f6637b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX INFO: renamed from: b */
    public final void m5244b(long j7) {
        C1679f0 c1679f0;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1679f0 c1679f1;
        ArrayList arrayList = this.f6658z;
        ArrayList arrayList2 = this.f6655w;
        int size = arrayList2.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i14);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.m5232b(recyclerView3, false);
                i13 += recyclerView3.mPrefetchRegistry.f6639d;
            }
        }
        arrayList.ensureCapacity(i13);
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i16);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1675e0 c1675e0 = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(c1675e0.f6637b) + Math.abs(c1675e0.f6636a);
                for (int i17 = 0; i17 < c1675e0.f6639d * 2; i17 += 2) {
                    if (i15 >= arrayList.size()) {
                        c1679f1 = new C1679f0();
                        arrayList.add(c1679f1);
                    } else {
                        c1679f1 = (C1679f0) arrayList.get(i15);
                    }
                    int[] iArr = c1675e0.f6638c;
                    int i18 = iArr[i17 + 1];
                    c1679f1.f6645a = i18 <= iAbs;
                    c1679f1.f6646b = iAbs;
                    c1679f1.f6647c = i18;
                    c1679f1.f6648d = recyclerView4;
                    c1679f1.f6649e = iArr[i17];
                    i15++;
                }
            }
        }
        Collections.sort(arrayList, f6654F);
        for (int i19 = 0; i19 < arrayList.size() && (recyclerView = (c1679f0 = (C1679f0) arrayList.get(i19)).f6648d) != null; i19++) {
            AbstractC1717o2 abstractC1717o2M5242c = m5242c(recyclerView, c1679f0.f6649e, c1679f0.f6645a ? Long.MAX_VALUE : j7);
            if (abstractC1717o2M5242c != null && abstractC1717o2M5242c.mNestedRecyclerView != null && abstractC1717o2M5242c.isBound() && !abstractC1717o2M5242c.isInvalid() && (recyclerView2 = abstractC1717o2M5242c.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.m5259h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                C1675e0 c1675e1 = recyclerView2.mPrefetchRegistry;
                c1675e1.m5232b(recyclerView2, true);
                if (c1675e1.f6639d != 0) {
                    try {
                        int i24 = AbstractC2732k.f10742a;
                        Trace.beginSection("RV Nested Prefetch");
                        C1701k2 c1701k2 = recyclerView2.mState;
                        AbstractC1692i1 abstractC1692i1 = recyclerView2.mAdapter;
                        c1701k2.f6724d = 1;
                        c1701k2.f6725e = abstractC1692i1.getDisplayCount();
                        c1701k2.f6727g = false;
                        c1701k2.f6728h = false;
                        c1701k2.f6729i = false;
                        for (int i25 = 0; i25 < c1675e1.f6639d * 2; i25 += 2) {
                            m5242c(recyclerView2, c1675e1.f6638c[i25], j7);
                        }
                        Trace.endSection();
                    } catch (Throwable th3) {
                        int i26 = AbstractC2732k.f10742a;
                        Trace.endSection();
                        throw th3;
                    }
                }
            }
            c1679f0.f6645a = false;
            c1679f0.f6646b = 0;
            c1679f0.f6647c = 0;
            c1679f0.f6648d = null;
            c1679f0.f6649e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f6655w;
        try {
            int i13 = AbstractC2732k.f10742a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i14);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m5244b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f6657y);
                }
            }
            this.f6656x = 0L;
        } finally {
            this.f6656x = 0L;
            int i15 = AbstractC2732k.f10742a;
            Trace.endSection();
        }
    }
}

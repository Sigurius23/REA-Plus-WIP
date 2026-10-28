package androidx.viewpager2.adapter;

import android.view.ViewParent;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.lifecycle.EnumC1635w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C1859g {

    /* JADX INFO: renamed from: a */
    public C1856d f7304a;

    /* JADX INFO: renamed from: b */
    public C1857e f7305b;

    /* JADX INFO: renamed from: c */
    public C1858f f7306c;

    /* JADX INFO: renamed from: d */
    public ViewPager2 f7307d;

    /* JADX INFO: renamed from: e */
    public long f7308e = -1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1861i f7309f;

    public C1859g(AbstractC1861i abstractC1861i) {
        this.f7309f = abstractC1861i;
    }

    /* JADX INFO: renamed from: a */
    public static ViewPager2 m5503a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    /* JADX INFO: renamed from: b */
    public final void m5504b(boolean z4) {
        int currentItem;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0;
        AbstractC1861i abstractC1861i = this.f7309f;
        if (abstractC1861i.shouldDelayFragmentTransactions() || this.f7307d.getScrollState() != 0 || abstractC1861i.mFragments.m153e() || abstractC1861i.getItemCount() == 0 || (currentItem = this.f7307d.getCurrentItem()) >= abstractC1861i.getItemCount()) {
            return;
        }
        long itemId = abstractC1861i.getItemId(currentItem);
        if ((itemId != this.f7308e || z4) && (abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) abstractC1861i.mFragments.m151c(itemId)) != null && abstractComponentCallbacksC1320m0.isAdded()) {
            this.f7308e = itemId;
            AbstractC1329o1 abstractC1329o1 = abstractC1861i.mFragmentManager;
            C1271a c1271aM94758g = AbstractC30802r.m94758g(abstractC1329o1, abstractC1329o1);
            ArrayList<List> arrayList = new ArrayList();
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = null;
            for (int i13 = 0; i13 < abstractC1861i.mFragments.m157i(); i13++) {
                long jM154f = abstractC1861i.mFragments.m154f(i13);
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = (AbstractComponentCallbacksC1320m0) abstractC1861i.mFragments.m158j(i13);
                if (abstractComponentCallbacksC1320m2.isAdded()) {
                    if (jM154f != this.f7308e) {
                        c1271aM94758g.mo4043g(abstractComponentCallbacksC1320m2, EnumC1635w.f6328z);
                        C1855c c1855c = abstractC1861i.mFragmentEventDispatcher;
                        c1855c.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = c1855c.f7298a.iterator();
                        if (it.hasNext()) {
                            throw AbstractC11266d.m30454h(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        abstractComponentCallbacksC1320m1 = abstractComponentCallbacksC1320m2;
                    }
                    abstractComponentCallbacksC1320m2.setMenuVisibility(jM154f == this.f7308e);
                }
            }
            if (abstractComponentCallbacksC1320m1 != null) {
                c1271aM94758g.mo4043g(abstractComponentCallbacksC1320m1, EnumC1635w.f6323E);
                C1855c c1855c2 = abstractC1861i.mFragmentEventDispatcher;
                c1855c2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = c1855c2.f7298a.iterator();
                if (it3.hasNext()) {
                    throw AbstractC11266d.m30454h(it3);
                }
                arrayList.add(arrayList3);
            }
            if (c1271aM94758g.f5563c.isEmpty()) {
                return;
            }
            c1271aM94758g.m4048l();
            Collections.reverse(arrayList);
            for (List list : arrayList) {
                abstractC1861i.mFragmentEventDispatcher.getClass();
                C1855c.m5502a(list);
            }
        }
    }
}

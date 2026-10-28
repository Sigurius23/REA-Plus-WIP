package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.C1316l0;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1570c1;
import androidx.lifecycle.EnumC1635w;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC11266d;
import p002a0.C0007b;
import p002a0.C0025h;
import p002a0.C0062y;
import p088dc.AbstractC11895b;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1861i extends AbstractC1692i1 {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    C1855c mFragmentEventDispatcher;
    final AbstractC1329o1 mFragmentManager;
    private C1859g mFragmentMaxLifecycleEnforcer;
    final C0062y mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final C0062y mItemIdToViewHolder;
    final AbstractC1638x mLifecycle;
    private final C0062y mSavedStates;

    public AbstractC1861i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this(abstractComponentCallbacksC1320m0.getChildFragmentManager(), abstractComponentCallbacksC1320m0.getLifecycle());
    }

    /* JADX INFO: renamed from: a */
    public final Long m5505a(int i13) {
        Long lValueOf = null;
        for (int i14 = 0; i14 < this.mItemIdToViewHolder.m157i(); i14++) {
            if (((Integer) this.mItemIdToViewHolder.m158j(i14)).intValue() == i13) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.m154f(i14));
            }
        }
        return lValueOf;
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m5506b(long j7) {
        ViewParent parent;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.mFragments.m151c(j7);
        if (abstractComponentCallbacksC1320m0 == null) {
            return;
        }
        if (abstractComponentCallbacksC1320m0.getView() != null && (parent = abstractComponentCallbacksC1320m0.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j7)) {
            this.mSavedStates.m156h(j7);
        }
        if (!abstractComponentCallbacksC1320m0.isAdded()) {
            this.mFragments.m156h(j7);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (abstractComponentCallbacksC1320m0.isAdded() && containsItem(j7)) {
            C1855c c1855c = this.mFragmentEventDispatcher;
            c1855c.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = c1855c.f7298a.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
            C1316l0 c1316l0M4162c0 = this.mFragmentManager.m4162c0(abstractComponentCallbacksC1320m0);
            this.mFragmentEventDispatcher.getClass();
            C1855c.m5502a(arrayList);
            this.mSavedStates.m155g(j7, c1316l0M4162c0);
        }
        C1855c c1855c2 = this.mFragmentEventDispatcher;
        c1855c2.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = c1855c2.f7298a.iterator();
        if (it3.hasNext()) {
            throw AbstractC11266d.m30454h(it3);
        }
        try {
            AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
            abstractC1329o1.getClass();
            C1271a c1271a = new C1271a(abstractC1329o1);
            c1271a.m4050n(abstractComponentCallbacksC1320m0);
            c1271a.m4048l();
            this.mFragments.m156h(j7);
        } finally {
            this.mFragmentEventDispatcher.getClass();
            C1855c.m5502a(arrayList2);
        }
    }

    public boolean containsItem(long j7) {
        return j7 >= 0 && j7 < ((long) getItemCount());
    }

    public abstract AbstractComponentCallbacksC1320m0 createFragment(int i13);

    public void gcFragments() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0;
        View view;
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        C0025h c0025h = new C0025h(0);
        for (int i13 = 0; i13 < this.mFragments.m157i(); i13++) {
            long jM154f = this.mFragments.m154f(i13);
            if (!containsItem(jM154f)) {
                c0025h.add(Long.valueOf(jM154f));
                this.mItemIdToViewHolder.m156h(jM154f);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i14 = 0; i14 < this.mFragments.m157i(); i14++) {
                long jM154f2 = this.mFragments.m154f(i14);
                if (!this.mItemIdToViewHolder.m150b(jM154f2) && ((abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.mFragments.m151c(jM154f2)) == null || (view = abstractComponentCallbacksC1320m0.getView()) == null || view.getParent() == null)) {
                    c0025h.add(Long.valueOf(jM154f2));
                }
            }
        }
        C0007b c0007b = new C0007b(c0025h);
        while (c0007b.hasNext()) {
            m5506b(((Long) c0007b.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public long getItemId(int i13) {
        return i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.mFragmentMaxLifecycleEnforcer != null) {
            throw new IllegalArgumentException();
        }
        C1859g c1859g = new C1859g(this);
        this.mFragmentMaxLifecycleEnforcer = c1859g;
        ViewPager2 viewPager2M5503a = C1859g.m5503a(recyclerView);
        c1859g.f7307d = viewPager2M5503a;
        C1856d c1856d = new C1856d(c1859g);
        c1859g.f7304a = c1856d;
        viewPager2M5503a.m5508b(c1856d);
        C1857e c1857e = new C1857e(c1859g, 0);
        c1859g.f7305b = c1857e;
        registerAdapterDataObserver(c1857e);
        C1858f c1858f = new C1858f(c1859g);
        c1859g.f7306c = c1858f;
        this.mLifecycle.mo4986a(c1858f);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C1859g c1859g = this.mFragmentMaxLifecycleEnforcer;
        c1859g.getClass();
        ViewPager2 viewPager2M5503a = C1859g.m5503a(recyclerView);
        ((ArrayList) viewPager2M5503a.f7329y.f7300b).remove(c1859g.f7304a);
        AbstractC1861i abstractC1861i = c1859g.f7309f;
        abstractC1861i.unregisterAdapterDataObserver(c1859g.f7305b);
        abstractC1861i.mLifecycle.mo4988d(c1859g.f7306c);
        c1859g.f7307d = null;
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final boolean onFailedToRecycleView(C1862j c1862j) {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewRecycled(C1862j c1862j) {
        Long lM5505a = m5505a(((FrameLayout) c1862j.itemView).getId());
        if (lM5505a != null) {
            m5506b(lM5505a.longValue());
            this.mItemIdToViewHolder.m156h(lM5505a.longValue());
        }
    }

    public void placeFragmentInViewHolder(C1862j c1862j) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.mFragments.m151c(c1862j.getItemId());
        if (abstractComponentCallbacksC1320m0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) c1862j.itemView;
        View view = abstractComponentCallbacksC1320m0.getView();
        if (!abstractComponentCallbacksC1320m0.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (abstractComponentCallbacksC1320m0.isAdded() && view == null) {
            this.mFragmentManager.m4154X(new C1853a(this, abstractComponentCallbacksC1320m0, frameLayout), false);
            return;
        }
        if (abstractComponentCallbacksC1320m0.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                addViewToContainer(view, frameLayout);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC1320m0.isAdded()) {
            addViewToContainer(view, frameLayout);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.f5708L) {
                return;
            }
            this.mLifecycle.mo4986a(new C1570c1(this, c1862j));
            return;
        }
        this.mFragmentManager.m4154X(new C1853a(this, abstractComponentCallbacksC1320m0, frameLayout), false);
        C1855c c1855c = this.mFragmentEventDispatcher;
        c1855c.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1855c.f7298a.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        try {
            abstractComponentCallbacksC1320m0.setMenuVisibility(false);
            AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
            abstractC1329o1.getClass();
            C1271a c1271a = new C1271a(abstractC1329o1);
            c1271a.mo4042d(0, abstractComponentCallbacksC1320m0, "f" + c1862j.getItemId(), 1);
            c1271a.mo4043g(abstractComponentCallbacksC1320m0, EnumC1635w.f6328z);
            c1271a.m4048l();
            this.mFragmentMaxLifecycleEnforcer.m5504b(false);
        } finally {
            this.mFragmentEventDispatcher.getClass();
            C1855c.m5502a(arrayList);
        }
    }

    public void registerFragmentTransactionCallback(AbstractC1860h abstractC1860h) {
        this.mFragmentEventDispatcher.f7298a.add(abstractC1860h);
    }

    public final void restoreState(Parcelable parcelable) {
        if (!this.mSavedStates.m153e() || !this.mFragments.m153e()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (str.startsWith(KEY_PREFIX_FRAGMENT) && str.length() > 2) {
                long j7 = Long.parseLong(str.substring(2));
                AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
                abstractC1329o1.getClass();
                String string = bundle.getString(str);
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = null;
                if (string != null) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4055b = abstractC1329o1.f5717c.m4055b(string);
                    if (abstractComponentCallbacksC1320m0M4055b == null) {
                        abstractC1329o1.m4179l0(new IllegalStateException(AbstractC31061c.m95640p("Fragment no longer exists for key ", str, ": unique id ", string)));
                        throw null;
                    }
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4055b;
                }
                this.mFragments.m155g(j7, abstractComponentCallbacksC1320m0);
            } else {
                if (!str.startsWith(KEY_PREFIX_STATE) || str.length() <= 2) {
                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                }
                long j13 = Long.parseLong(str.substring(2));
                C1316l0 c1316l0 = (C1316l0) bundle.getParcelable(str);
                if (containsItem(j13)) {
                    this.mSavedStates.m155g(j13, c1316l0);
                }
            }
        }
        if (this.mFragments.m153e()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC1854b runnableC1854b = new RunnableC1854b(this);
        this.mLifecycle.mo4986a(new C1570c1(handler, runnableC1854b));
        handler.postDelayed(runnableC1854b, 10000L);
    }

    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.m157i() + this.mFragments.m157i());
        for (int i13 = 0; i13 < this.mFragments.m157i(); i13++) {
            long jM154f = this.mFragments.m154f(i13);
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.mFragments.m151c(jM154f);
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.isAdded()) {
                this.mFragmentManager.m4153W(bundle, AbstractC11895b.m31994m(jM154f, KEY_PREFIX_FRAGMENT), abstractComponentCallbacksC1320m0);
            }
        }
        for (int i14 = 0; i14 < this.mSavedStates.m157i(); i14++) {
            long jM154f2 = this.mSavedStates.m154f(i14);
            if (containsItem(jM154f2)) {
                bundle.putParcelable(AbstractC11895b.m31994m(jM154f2, KEY_PREFIX_STATE), (Parcelable) this.mSavedStates.m151c(jM154f2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void setHasStableIds(boolean z4) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.m4147Q();
    }

    public void unregisterFragmentTransactionCallback(AbstractC1860h abstractC1860h) {
        this.mFragmentEventDispatcher.f7298a.remove(abstractC1860h);
    }

    public AbstractC1861i(AbstractC1329o1 abstractC1329o1, AbstractC1638x abstractC1638x) {
        this.mFragments = new C0062y((Object) null);
        this.mSavedStates = new C0062y((Object) null);
        this.mItemIdToViewHolder = new C0062y((Object) null);
        C1855c c1855c = new C1855c();
        c1855c.f7298a = new CopyOnWriteArrayList();
        this.mFragmentEventDispatcher = c1855c;
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = abstractC1329o1;
        this.mLifecycle = abstractC1638x;
        super.setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(C1862j c1862j, int i13) {
        long itemId = c1862j.getItemId();
        int id4 = ((FrameLayout) c1862j.itemView).getId();
        Long lM5505a = m5505a(id4);
        if (lM5505a != null && lM5505a.longValue() != itemId) {
            m5506b(lM5505a.longValue());
            this.mItemIdToViewHolder.m156h(lM5505a.longValue());
        }
        this.mItemIdToViewHolder.m155g(itemId, Integer.valueOf(id4));
        long itemId2 = getItemId(i13);
        if (!this.mFragments.m150b(itemId2)) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0CreateFragment = createFragment(i13);
            abstractComponentCallbacksC1320m0CreateFragment.setInitialSavedState((C1316l0) this.mSavedStates.m151c(itemId2));
            this.mFragments.m155g(itemId2, abstractComponentCallbacksC1320m0CreateFragment);
        }
        if (((FrameLayout) c1862j.itemView).isAttachedToWindow()) {
            placeFragmentInViewHolder(c1862j);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final C1862j onCreateViewHolder(ViewGroup viewGroup, int i13) {
        int i14 = C1862j.f7310a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C1862j(frameLayout);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewAttachedToWindow(C1862j c1862j) {
        placeFragmentInViewHolder(c1862j);
        gcFragments();
    }
}

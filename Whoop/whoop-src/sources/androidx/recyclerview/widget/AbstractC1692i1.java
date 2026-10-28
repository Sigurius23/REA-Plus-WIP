package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;
import p029b5.AbstractC2732k;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1692i1 {
    private final C1696j1 mObservable = new C1696j1();
    private boolean mHasStableIds = false;
    private EnumC1688h1 mStateRestorationPolicy = EnumC1688h1.f6671w;

    public final void bindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        boolean z4 = abstractC1717o2.mBindingAdapter == null;
        if (z4) {
            abstractC1717o2.mPosition = i13;
            if (hasStableIds()) {
                abstractC1717o2.mItemId = getItemId(i13);
            }
            abstractC1717o2.setFlags(1, 519);
            int i14 = AbstractC2732k.f10742a;
            Trace.beginSection("RV OnBindView");
        }
        abstractC1717o2.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (abstractC1717o2.itemView.getParent() == null) {
                View view = abstractC1717o2.itemView;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                if (view.isAttachedToWindow() != abstractC1717o2.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC1717o2.isTmpDetached() + ", attached to window: " + abstractC1717o2.itemView.isAttachedToWindow() + ", holder: " + abstractC1717o2);
                }
            }
            if (abstractC1717o2.itemView.getParent() == null) {
                View view2 = abstractC1717o2.itemView;
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC1717o2);
                }
            }
        }
        onBindViewHolder(abstractC1717o2, i13, abstractC1717o2.getUnmodifiedPayloads());
        if (z4) {
            abstractC1717o2.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC1717o2.itemView.getLayoutParams();
            if (layoutParams instanceof C1744v1) {
                ((C1744v1) layoutParams).f6893c = true;
            }
            int i15 = AbstractC2732k.f10742a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2;
        }
        return getItemCount() > 0;
    }

    public final AbstractC1717o2 createViewHolder(ViewGroup viewGroup, int i13) {
        try {
            int i14 = AbstractC2732k.f10742a;
            Trace.beginSection("RV CreateView");
            AbstractC1717o2 abstractC1717o2OnCreateViewHolder = onCreateViewHolder(viewGroup, i13);
            if (abstractC1717o2OnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            abstractC1717o2OnCreateViewHolder.mItemViewType = i13;
            Trace.endSection();
            return abstractC1717o2OnCreateViewHolder;
        } catch (Throwable th3) {
            int i15 = AbstractC2732k.f10742a;
            Trace.endSection();
            throw th3;
        }
    }

    public int findRelativeAdapterPositionIn(AbstractC1692i1 abstractC1692i1, AbstractC1717o2 abstractC1717o2, int i13) {
        if (abstractC1692i1 == this) {
            return i13;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i13) {
        return -1L;
    }

    public int getItemViewType(int i13) {
        return 0;
    }

    public final EnumC1688h1 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.m5265a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.m5266b();
    }

    public final void notifyItemChanged(int i13) {
        this.mObservable.m5268d(i13, 1, null);
    }

    public final void notifyItemInserted(int i13) {
        this.mObservable.m5269e(i13, 1);
    }

    public final void notifyItemMoved(int i13, int i14) {
        this.mObservable.m5267c(i13, i14);
    }

    public final void notifyItemRangeChanged(int i13, int i14) {
        this.mObservable.m5268d(i13, i14, null);
    }

    public final void notifyItemRangeInserted(int i13, int i14) {
        this.mObservable.m5269e(i13, i14);
    }

    public final void notifyItemRangeRemoved(int i13, int i14) {
        this.mObservable.m5270f(i13, i14);
    }

    public final void notifyItemRemoved(int i13) {
        this.mObservable.m5270f(i13, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13);

    public void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13, List<Object> list) {
        onBindViewHolder(abstractC1717o2, i13);
    }

    public abstract AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(AbstractC1717o2 abstractC1717o2) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC1717o2 abstractC1717o2) {
    }

    public void onViewDetachedFromWindow(AbstractC1717o2 abstractC1717o2) {
    }

    public void onViewRecycled(AbstractC1717o2 abstractC1717o2) {
    }

    public void registerAdapterDataObserver(AbstractC1700k1 abstractC1700k1) {
        this.mObservable.registerObserver(abstractC1700k1);
    }

    public void setHasStableIds(boolean z4) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z4;
    }

    public void setStateRestorationPolicy(EnumC1688h1 enumC1688h1) {
        this.mStateRestorationPolicy = enumC1688h1;
        this.mObservable.m5271g();
    }

    public void unregisterAdapterDataObserver(AbstractC1700k1 abstractC1700k1) {
        this.mObservable.unregisterObserver(abstractC1700k1);
    }

    public final void notifyItemChanged(int i13, Object obj) {
        this.mObservable.m5268d(i13, 1, obj);
    }

    public final void notifyItemRangeChanged(int i13, int i14, Object obj) {
        this.mObservable.m5268d(i13, i14, obj);
    }
}

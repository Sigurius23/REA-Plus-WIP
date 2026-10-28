package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p108e4.AbstractC12682p;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1717o2 {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    AbstractC1692i1 mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    AbstractC1717o2 mShadowedHolder = null;
    AbstractC1717o2 mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    C1668c2 mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public AbstractC1717o2(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.itemView = view;
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i13) {
        this.mFlags = i13 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        View view = this.itemView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return view.hasTransientState();
    }

    public void flagRemovedAndOffsetPosition(int i13, int i14, boolean z4) {
        addFlags(8);
        offsetPosition(i14, z4);
        this.mPosition = i13;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final AbstractC1692i1 getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        AbstractC1692i1 adapter;
        int adapterPositionInRecyclerView;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i13 = this.mPreLayoutPosition;
        return i13 == -1 ? this.mPosition : i13;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i13 = this.mPreLayoutPosition;
        return i13 == -1 ? this.mPosition : i13;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        List<Object> list = this.mPayloads;
        return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    public boolean hasAnyOfTheFlags(int i13) {
        return (i13 & this.mFlags) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    public boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        View view = this.itemView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return !view.hasTransientState();
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int i13, boolean z4) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z4) {
            this.mPreLayoutPosition += i13;
        }
        this.mPosition += i13;
        if (this.itemView.getLayoutParams() != null) {
            ((C1744v1) this.itemView.getLayoutParams()).f6893c = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i13 = this.mPendingAccessibilityState;
        if (i13 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i13;
        } else {
            View view = this.itemView;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
        }
        recyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i13, int i14) {
        this.mFlags = (i13 & i14) | (this.mFlags & (~i14));
    }

    public final void setIsRecyclable(boolean z4) {
        int i13 = this.mIsRecyclableCount;
        int i14 = z4 ? i13 - 1 : i13 + 1;
        this.mIsRecyclableCount = i14;
        if (i14 < 0) {
            this.mIsRecyclableCount = 0;
            if (RecyclerView.sDebugAssertionsEnabled) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z4 && i14 == 1) {
            this.mFlags |= 16;
        } else if (z4 && i14 == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z4 + ":" + this);
        }
    }

    public void setScrapContainer(C1668c2 c1668c2, boolean z4) {
        this.mScrapContainer = c1668c2;
        this.mInChangeScrap = z4;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM35484d.append(Integer.toHexString(hashCode()));
        sbM35484d.append(" position=");
        sbM35484d.append(this.mPosition);
        sbM35484d.append(" id=");
        sbM35484d.append(this.mItemId);
        sbM35484d.append(", oldPos=");
        sbM35484d.append(this.mOldPosition);
        sbM35484d.append(", pLpos:");
        sbM35484d.append(this.mPreLayoutPosition);
        StringBuilder sb4 = new StringBuilder(sbM35484d.toString());
        if (isScrap()) {
            sb4.append(" scrap ");
            sb4.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb4.append(" invalid");
        }
        if (!isBound()) {
            sb4.append(" unbound");
        }
        if (needsUpdate()) {
            sb4.append(" update");
        }
        if (isRemoved()) {
            sb4.append(" removed");
        }
        if (shouldIgnore()) {
            sb4.append(" ignored");
        }
        if (isTmpDetached()) {
            sb4.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb4.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb4.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb4.append(" no parent");
        }
        sb4.append("}");
        return sb4.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m5206m(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}

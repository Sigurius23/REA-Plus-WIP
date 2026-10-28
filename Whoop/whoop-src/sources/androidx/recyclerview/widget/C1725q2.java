package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1725q2 extends C16858b {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f6824d;

    /* JADX INFO: renamed from: e */
    public final C1721p2 f6825e;

    public C1725q2(RecyclerView recyclerView) {
        this.f6824d = recyclerView;
        C1721p2 c1721p2 = this.f6825e;
        if (c1721p2 != null) {
            this.f6825e = c1721p2;
        } else {
            this.f6825e = new C1721p2(this);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: c */
    public final void mo5303c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5303c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f6824d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
        RecyclerView recyclerView = this.f6824d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c18093f);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        if (super.mo5307g(view, i13, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f6824d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i13, bundle);
    }
}

package androidx.recyclerview.widget;

import ad3.C0783z;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1721p2 extends C16858b {

    /* JADX INFO: renamed from: d */
    public final C1725q2 f6808d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f6809e = new WeakHashMap();

    public C1721p2(C1725q2 c1725q2) {
        this.f6808d = c1725q2;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: a */
    public final boolean mo5301a(View view, AccessibilityEvent accessibilityEvent) {
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        return c16858b != null ? c16858b.mo5301a(view, accessibilityEvent) : this.f64777a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: b */
    public final C0783z mo5302b(View view) {
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        return c16858b != null ? c16858b.mo5302b(view) : super.mo5302b(view);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: c */
    public final void mo5303c(View view, AccessibilityEvent accessibilityEvent) {
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        if (c16858b != null) {
            c16858b.mo5303c(view, accessibilityEvent);
        } else {
            super.mo5303c(view, accessibilityEvent);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        C1725q2 c1725q2 = this.f6808d;
        RecyclerView recyclerView = c1725q2.f6824d;
        RecyclerView recyclerView2 = c1725q2.f6824d;
        boolean zHasPendingAdapterUpdates = recyclerView.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f64777a;
        if (zHasPendingAdapterUpdates || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c18093f);
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        if (c16858b != null) {
            c16858b.mo5304d(view, c18093f);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: e */
    public final void mo5305e(View view, AccessibilityEvent accessibilityEvent) {
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        if (c16858b != null) {
            c16858b.mo5305e(view, accessibilityEvent);
        } else {
            super.mo5305e(view, accessibilityEvent);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: f */
    public final boolean mo5306f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C16858b c16858b = (C16858b) this.f6809e.get(viewGroup);
        return c16858b != null ? c16858b.mo5306f(viewGroup, view, accessibilityEvent) : this.f64777a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        C1725q2 c1725q2 = this.f6808d;
        RecyclerView recyclerView = c1725q2.f6824d;
        RecyclerView recyclerView2 = c1725q2.f6824d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.mo5307g(view, i13, bundle);
        }
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        if (c16858b != null) {
            if (c16858b.mo5307g(view, i13, bundle)) {
                return true;
            }
        } else if (super.mo5307g(view, i13, bundle)) {
            return true;
        }
        return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i13, bundle);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: h */
    public final void mo5308h(View view, int i13) {
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        if (c16858b != null) {
            c16858b.mo5308h(view, i13);
        } else {
            super.mo5308h(view, i13);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: i */
    public final void mo5309i(View view, AccessibilityEvent accessibilityEvent) {
        C16858b c16858b = (C16858b) this.f6809e.get(view);
        if (c16858b != null) {
            c16858b.mo5309i(view, accessibilityEvent);
        } else {
            super.mo5309i(view, accessibilityEvent);
        }
    }
}

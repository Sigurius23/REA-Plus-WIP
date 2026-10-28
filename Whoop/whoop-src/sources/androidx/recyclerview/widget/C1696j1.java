package androidx.recyclerview.widget;

import android.database.Observable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1696j1 extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m5265a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m5266b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1700k1) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5267c(int i13, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1700k1) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5268d(int i13, int i14, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1700k1) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i13, i14, obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5269e(int i13, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1700k1) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i13, i14);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5270f(int i13, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1700k1) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i13, i14);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5271g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1700k1) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}

package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1700k1 {
    public void onChanged() {
    }

    public void onItemRangeChanged(int i13, int i14) {
    }

    public abstract void onItemRangeInserted(int i13, int i14);

    public abstract void onItemRangeMoved(int i13, int i14, int i15);

    public void onItemRangeRemoved(int i13, int i14) {
    }

    public void onStateRestorationPolicyChanged() {
    }

    public void onItemRangeChanged(int i13, int i14, Object obj) {
        onItemRangeChanged(i13, i14);
    }
}

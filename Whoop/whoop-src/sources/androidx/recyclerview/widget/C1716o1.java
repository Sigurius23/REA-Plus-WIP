package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1716o1 {

    /* JADX INFO: renamed from: a */
    public int f6795a;

    /* JADX INFO: renamed from: b */
    public int f6796b;

    /* JADX INFO: renamed from: a */
    public final void m5294a(AbstractC1717o2 abstractC1717o2) {
        View view = abstractC1717o2.itemView;
        this.f6795a = view.getLeft();
        this.f6796b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}

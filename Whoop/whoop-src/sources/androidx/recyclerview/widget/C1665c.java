package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1665c implements InterfaceC1657a1 {

    /* JADX INFO: renamed from: w */
    public final Object f6585w;

    public /* synthetic */ C1665c(Object obj) {
        this.f6585w = obj;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: a */
    public void mo2214a(int i13, int i14) {
        ((AbstractC1692i1) this.f6585w).notifyItemRangeInserted(i13, i14);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: b */
    public void mo2215b(int i13, int i14) {
        ((AbstractC1692i1) this.f6585w).notifyItemRangeRemoved(i13, i14);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: c */
    public void mo2216c(int i13, int i14, Object obj) {
        ((AbstractC1692i1) this.f6585w).notifyItemRangeChanged(i13, i14, obj);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: d */
    public void mo2217d(int i13, int i14) {
        ((AbstractC1692i1) this.f6585w).notifyItemMoved(i13, i14);
    }
}

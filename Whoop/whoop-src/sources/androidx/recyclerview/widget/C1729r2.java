package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1729r2 extends AbstractC1760z1 {

    /* JADX INFO: renamed from: a */
    public boolean f6838a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1676e1 f6839b;

    public C1729r2(C1676e1 c1676e1) {
        this.f6839b = c1676e1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i13) {
        if (i13 == 0 && this.f6838a) {
            this.f6838a = false;
            this.f6839b.m5240h();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrolled(RecyclerView recyclerView, int i13, int i14) {
        if (i13 == 0 && i14 == 0) {
            return;
        }
        this.f6838a = true;
    }
}

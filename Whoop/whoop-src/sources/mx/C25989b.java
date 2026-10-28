package mx;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import mm.C25680d;
import p312lx.AbstractC24783d;

/* JADX INFO: renamed from: mx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25989b extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public AbstractC25990c f102690a;

    /* JADX INFO: renamed from: a */
    public final void m77090a(C25680d c25680d) {
        this.f102690a.m77107V(c25680d);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemCount() {
        return this.f102690a.m77118p();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int i13) {
        return this.f102690a.m77122t(i13);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int i13) {
        return this.f102690a.m77120q(i13);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        this.f102690a.m77108a((AbstractC24783d) abstractC1717o2, i13);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        return this.f102690a.m77110d(viewGroup, i13);
    }
}

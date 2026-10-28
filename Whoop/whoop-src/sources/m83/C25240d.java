package m83;

import java.util.List;
import java.util.RandomAccess;
import p031b9.AbstractC2875y;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: m83.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C25240d extends AbstractC25242e implements RandomAccess {

    /* JADX INFO: renamed from: w */
    public final AbstractC25242e f99119w;

    /* JADX INFO: renamed from: x */
    public final int f99120x;

    /* JADX INFO: renamed from: y */
    public final int f99121y;

    public C25240d(AbstractC25242e abstractC25242e, int i13, int i14) {
        this.f99119w = abstractC25242e;
        this.f99120x = i13;
        AbstractC30060g.m92125o(i13, i14, abstractC25242e.mo73980a());
        this.f99121y = i14 - i13;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f99121y;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        int i14 = this.f99121y;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return this.f99119w.get(this.f99120x + i13);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final List subList(int i13, int i14) {
        AbstractC30060g.m92125o(i13, i14, this.f99121y);
        int i15 = this.f99120x;
        return new C25240d(this.f99119w, i13 + i15, i15 + i14);
    }
}

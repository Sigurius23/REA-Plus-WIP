package mp;

import java.util.AbstractMap;

/* JADX INFO: renamed from: mp.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C25794q extends AbstractC25788n {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C25796r f101527y;

    public C25794q(C25796r c25796r) {
        this.f101527y = c25796r;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i13) {
        C25796r c25796r = this.f101527y;
        return new AbstractMap.SimpleImmutableEntry(c25796r.f101529z.f101533y.f101463F.get(i13), c25796r.f101529z.f101534z.get(i13));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f101527y.f101529z.f101534z.size();
    }
}

package mp;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: mp.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C25796r extends AbstractC25792p {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C25798s f101529z;

    public C25796r(C25798s c25798s) {
        this.f101529z = c25798s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f101529z.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: e */
    public final AbstractC25763e0 mo75982e() {
        return mo75984l().listIterator(0);
    }

    @Override // mp.AbstractC25792p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC25753b.m75990b(this.f101529z.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo75984l().listIterator(0);
    }

    @Override // mp.AbstractC25792p
    /* JADX INFO: renamed from: m */
    public final AbstractC25788n mo76032m() {
        return new C25794q(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f101529z.f101534z.size();
    }
}

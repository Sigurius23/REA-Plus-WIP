package p507tx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import m83.AbstractC25242e;

/* JADX INFO: renamed from: tx.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C34233d extends AbstractC25242e implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: w */
    public final ArrayList f143613w;

    public C34233d(List list) {
        this.f143613w = new ArrayList(list);
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f143613w.size();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return this.f143613w.get(i13);
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final Object[] toArray() {
        return this.f143613w.toArray(new Object[0]);
    }
}

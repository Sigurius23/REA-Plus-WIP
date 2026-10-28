package p690zr;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: zr.e */
/* JADX INFO: loaded from: classes6.dex */
public class C41016e extends AbstractC41027h1 {

    /* JADX INFO: renamed from: w */
    public final Map f176984w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C41052s0 f176985x;

    public C41016e(C41052s0 c41052s0, Map map) {
        this.f176985x = c41052s0;
        map.getClass();
        this.f176984w = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C41010c c41010c = (C41010c) it;
            if (!c41010c.hasNext()) {
                return;
            }
            c41010c.next();
            c41010c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f176984w.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f176984w.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f176984w.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f176984w.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f176984w.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C41010c(this, this.f176984w.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f176984w.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f176985x.f177047E -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f176984w.size();
    }
}

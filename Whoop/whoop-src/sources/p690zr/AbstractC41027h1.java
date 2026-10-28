package p690zr;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: zr.h1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41027h1 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC41054t0) {
            collection = ((InterfaceC41054t0) collection).m133295o0();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it3 = iterator();
        while (it3.hasNext()) {
            if (collection.contains(it3.next())) {
                it3.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}

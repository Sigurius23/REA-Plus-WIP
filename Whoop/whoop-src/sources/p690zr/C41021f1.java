package p690zr;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p463rj.AbstractC31484o;
import p658yr.InterfaceC39719f;

/* JADX INFO: renamed from: zr.f1 */
/* JADX INFO: loaded from: classes6.dex */
public class C41021f1 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: w */
    public final Set f176995w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39719f f176996x;

    public C41021f1(Set set, InterfaceC39719f interfaceC39719f) {
        this.f176995w = set;
        this.f176996x = interfaceC39719f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f176996x.apply(obj)) {
            return this.f176995w.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f176996x.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f176995w.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f176995w;
        boolean z4 = set instanceof RandomAccess;
        InterfaceC39719f interfaceC39719f = this.f176996x;
        if (!z4 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC39719f.getClass();
            while (it.hasNext()) {
                if (interfaceC39719f.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC39719f.getClass();
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            Object obj = list.get(i14);
            if (!interfaceC39719f.apply(obj)) {
                if (i14 > i13) {
                    try {
                        list.set(i13, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC41047q.m133285o(list, interfaceC39719f, i13, i14);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC41047q.m133285o(list, interfaceC39719f, i13, i14);
                        return;
                    }
                }
                i13++;
            }
        }
        list.subList(i13, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f176995w;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f176996x.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC41047q.m133276f(obj, this);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC41047q.m133280j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f176995w.iterator();
        InterfaceC39719f interfaceC39719f = this.f176996x;
        AbstractC31484o.m96958j(interfaceC39719f, "predicate");
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (interfaceC39719f.apply(it.next())) {
                break;
            }
            i13++;
        }
        return true ^ (i13 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f176995w.iterator();
        it.getClass();
        InterfaceC39719f interfaceC39719f = this.f176996x;
        interfaceC39719f.getClass();
        return new C41035k0(it, interfaceC39719f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f176995w.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f176995w.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f176996x.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f176995w.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f176996x.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f176995w.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (this.f176996x.apply(it.next())) {
                i13++;
            }
        }
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C41035k0 c41035k0 = (C41035k0) it;
            if (!c41035k0.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c41035k0.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C41035k0 c41035k0 = (C41035k0) it;
            if (c41035k0.hasNext()) {
                arrayList.add(c41035k0.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}

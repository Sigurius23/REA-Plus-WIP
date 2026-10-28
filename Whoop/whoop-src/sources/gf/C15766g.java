package gf;

import d93.InterfaceC11825f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p088dc.AbstractC11894a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C15766g implements Set, InterfaceC11825f {

    /* JADX INFO: renamed from: w */
    public final Set f59430w;

    public C15766g(Iterable initialValues) {
        AbstractC22676k.m65750j(initialValues, "initialValues");
        this.f59430w = AbstractC25265s.m74101H1(initialValues);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        String element = (String) obj;
        AbstractC22676k.m65750j(element, "element");
        return this.f59430w.add(AbstractC11894a.m31949Q(element));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                String element = (String) it.next();
                AbstractC22676k.m65750j(element, "element");
                if (this.f59430w.add(AbstractC11894a.m31949Q(element)) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f59430w.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof String) {
            return this.f59430w.contains(AbstractC11894a.m31949Q((String) obj));
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C15766g) {
            return AbstractC22676k.m65745e(this.f59430w, ((C15766g) obj).f59430w);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f59430w.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f59430w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C15765f(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof String) {
            return this.f59430w.remove(AbstractC11894a.m31949Q((String) obj));
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (remove((String) it.next()) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC11894a.m31949Q((String) it.next()));
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        Set set = this.f59430w;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!setM74103I1.contains((C15767h) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            boolean z4 = false;
            while (it3.hasNext()) {
                if (set.remove((C15767h) it3.next()) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f59430w.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return this.f59430w.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}

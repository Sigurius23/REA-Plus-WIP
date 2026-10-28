package m83;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p002a0.C0030i1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25242e extends AbstractC25234a implements List {
    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it3 = iterator();
            while (it3.hasNext()) {
                if (!AbstractC22676k.m65745e(it3.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(it.next(), obj)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0030i1(this, 2);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC22676k.m65745e(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C25238c(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i13, int i14) {
        return new C25240d(this, i13, i14);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i13) {
        return new C25238c(this, i13);
    }
}

package p446r1;

import d93.InterfaceC11822c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p002a0.C0041n0;
import p002a0.C0045p0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C30848b implements List, InterfaceC11822c {

    /* JADX INFO: renamed from: w */
    public final C30849c f127226w;

    public C30848b(C30849c c30849c) {
        this.f127226w = c30849c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f127226w.m94885b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C30849c c30849c = this.f127226w;
        return c30849c.m94888e(c30849c.f127229y, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f127226w.m94890g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f127226w.m94891h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C30849c c30849c = this.f127226w;
        c30849c.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c30849c.m94891h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC30850d.m94897a(i13, this);
        return this.f127226w.f127227w[i13];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f127226w.m94892j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f127226w.f127229y == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0041n0(this, 0, 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C30849c c30849c = this.f127226w;
        Object[] objArr = c30849c.f127227w;
        for (int i13 = c30849c.f127229y - 1; i13 >= 0; i13--) {
            if (AbstractC22676k.m65745e(obj, objArr[i13])) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0041n0(this, 0, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f127226w.m94893k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C30849c c30849c = this.f127226w;
        c30849c.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i13 = c30849c.f127229y;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c30849c.m94893k(it.next());
        }
        return i13 != c30849c.f127229y;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C30849c c30849c = this.f127226w;
        int i13 = c30849c.f127229y;
        for (int i14 = i13 - 1; -1 < i14; i14--) {
            if (!collection.contains(c30849c.f127227w[i14])) {
                c30849c.m94894l(i14);
            }
        }
        return i13 != c30849c.f127229y;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        AbstractC30850d.m94897a(i13, this);
        Object[] objArr = this.f127226w.f127227w;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f127226w.f127229y;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        AbstractC30850d.m94898b(i13, i14, this);
        return new C0045p0(i13, i14, 1, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        this.f127226w.m94884a(i13, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new C0041n0(this, i13, 1);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        AbstractC30850d.m94897a(i13, this);
        return this.f127226w.m94894l(i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        return this.f127226w.m94888e(i13, collection);
    }
}

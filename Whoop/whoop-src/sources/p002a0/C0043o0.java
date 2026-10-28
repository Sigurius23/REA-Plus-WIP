package p002a0;

import d93.InterfaceC11822c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25260n;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: a0.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0043o0 implements List, InterfaceC11822c {

    /* JADX INFO: renamed from: w */
    public final C0047q0 f129w;

    public C0043o0(C0047q0 c0047q0) {
        this.f129w = c0047q0;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        C0047q0 c0047q0 = this.f129w;
        if (i13 < 0 || i13 > (i14 = c0047q0.f137b)) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index ", " must be in 0..");
            sbM30466t.append(c0047q0.f137b);
            AbstractC34924m.m110135Q(sbM30466t.toString());
            throw null;
        }
        int i15 = i14 + 1;
        Object[] objArr = c0047q0.f136a;
        if (objArr.length < i15) {
            c0047q0.m109l(i15, objArr);
        }
        Object[] objArr2 = c0047q0.f136a;
        int i16 = c0047q0.f137b;
        if (i13 != i16) {
            AbstractC25260n.m74062d0(i13 + 1, i13, i16, objArr2, objArr2);
        }
        objArr2[i13] = obj;
        c0047q0.f137b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0047q0 c0047q0 = this.f129w;
        if (i13 < 0 || i13 > c0047q0.f137b) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index ", " must be in 0..");
            sbM30466t.append(c0047q0.f137b);
            AbstractC34924m.m110135Q(sbM30466t.toString());
            throw null;
        }
        int i14 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size() + c0047q0.f137b;
        Object[] objArr = c0047q0.f136a;
        if (objArr.length < size) {
            c0047q0.m109l(size, objArr);
        }
        Object[] objArr2 = c0047q0.f136a;
        if (i13 != c0047q0.f137b) {
            AbstractC25260n.m74062d0(elements.size() + i13, i13, c0047q0.f137b, objArr2, objArr2);
        }
        for (Object obj : elements) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            objArr2[i14 + i13] = obj;
            i14 = i15;
        }
        c0047q0.f137b = elements.size() + c0047q0.f137b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f129w.m100c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f129w.m103f(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (this.f129w.m103f(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC0009b1.m11a(i13, this);
        return this.f129w.m102e(i13);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f129w.m103f(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f129w.m104g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0041n0(this, 0, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C0047q0 c0047q0 = this.f129w;
        if (obj == null) {
            Object[] objArr = c0047q0.f136a;
            for (int i13 = c0047q0.f137b - 1; -1 < i13; i13--) {
                if (objArr[i13] == null) {
                    return i13;
                }
            }
        } else {
            Object[] objArr2 = c0047q0.f136a;
            for (int i14 = c0047q0.f137b - 1; -1 < i14; i14--) {
                if (obj.equals(objArr2[i14])) {
                    return i14;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0041n0(this, 0, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f129w.m106i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0047q0 c0047q0 = this.f129w;
        c0047q0.getClass();
        int i13 = c0047q0.f137b;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c0047q0.m106i(it.next());
        }
        return i13 != c0047q0.f137b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0047q0 c0047q0 = this.f129w;
        c0047q0.getClass();
        int i13 = c0047q0.f137b;
        Object[] objArr = c0047q0.f136a;
        for (int i14 = i13 - 1; -1 < i14; i14--) {
            if (!elements.contains(objArr[i14])) {
                c0047q0.m107j(i14);
            }
        }
        return i13 != c0047q0.f137b;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        AbstractC0009b1.m11a(i13, this);
        C0047q0 c0047q0 = this.f129w;
        if (i13 < 0 || i13 >= c0047q0.f137b) {
            c0047q0.m110m(i13);
            throw null;
        }
        Object[] objArr = c0047q0.f136a;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f129w.f137b;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        AbstractC0009b1.m12b(i13, i14, this);
        return new C0045p0(i13, i14, 0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new C0041n0(this, i13, 0);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        AbstractC0009b1.m11a(i13, this);
        return this.f129w.m107j(i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f129w.m98a(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0047q0 c0047q0 = this.f129w;
        int i13 = c0047q0.f137b;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c0047q0.m98a(it.next());
        }
        return i13 != c0047q0.f137b;
    }
}

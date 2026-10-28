package n83;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m83.AbstractC25248h;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n83.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C26460c extends AbstractC25248h implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: z */
    public static final C26460c f105095z;

    /* JADX INFO: renamed from: w */
    public Object[] f105096w;

    /* JADX INFO: renamed from: x */
    public int f105097x;

    /* JADX INFO: renamed from: y */
    public boolean f105098y;

    static {
        C26460c c26460c = new C26460c(0);
        c26460c.f105098y = true;
        f105095z = c26460c;
    }

    public C26460c(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f105096w = new Object[i13];
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: a */
    public final int mo74007a() {
        return this.f105097x;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m78373j();
        int i13 = this.f105097x;
        ((AbstractList) this).modCount++;
        m78374l(i13, 1);
        this.f105096w[i13] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78373j();
        int size = elements.size();
        m78371e(this.f105097x, elements, size);
        return size > 0;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: c */
    public final Object mo74008c(int i13) {
        m78373j();
        int i14 = this.f105097x;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return m78375m(i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m78373j();
        m78376n(0, this.f105097x);
    }

    /* JADX INFO: renamed from: e */
    public final void m78371e(int i13, Collection collection, int i14) {
        ((AbstractList) this).modCount++;
        m78374l(i13, i14);
        Iterator it = collection.iterator();
        for (int i15 = 0; i15 < i14; i15++) {
            this.f105096w[i13 + i15] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f105096w;
            int i13 = this.f105097x;
            if (i13 == list.size()) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (AbstractC22676k.m65745e(objArr[i14], list.get(i14))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m78372g(int i13, Object obj) {
        ((AbstractList) this).modCount++;
        m78374l(i13, 1);
        this.f105096w[i13] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        int i14 = this.f105097x;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return this.f105096w[i13];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f105096w;
        int i13 = this.f105097x;
        int iHashCode = 1;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = objArr[i14];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i13 = 0; i13 < this.f105097x; i13++) {
            if (AbstractC22676k.m65745e(this.f105096w[i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f105097x == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m78373j() {
        if (this.f105098y) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m78374l(int i13, int i14) {
        int i15 = this.f105097x + i14;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f105096w;
        if (i15 > objArr.length) {
            int length = objArr.length;
            int i16 = length + (length >> 1);
            if (i16 - i15 < 0) {
                i16 = i15;
            }
            if (i16 - 2147483639 > 0) {
                i16 = i15 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i16);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f105096w = objArrCopyOf;
        }
        Object[] objArr2 = this.f105096w;
        AbstractC25260n.m74062d0(i13 + i14, i13, this.f105097x, objArr2, objArr2);
        this.f105097x += i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i13 = this.f105097x - 1; i13 >= 0; i13--) {
            if (AbstractC22676k.m65745e(this.f105096w[i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: m */
    public final Object m78375m(int i13) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f105096w;
        Object obj = objArr[i13];
        AbstractC25260n.m74062d0(i13, i13 + 1, this.f105097x, objArr, objArr);
        Object[] objArr2 = this.f105096w;
        int i14 = this.f105097x - 1;
        AbstractC22676k.m65750j(objArr2, "<this>");
        objArr2[i14] = null;
        this.f105097x--;
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public final void m78376n(int i13, int i14) {
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f105096w;
        AbstractC25260n.m74062d0(i13, i13 + i14, this.f105097x, objArr, objArr);
        Object[] objArr2 = this.f105096w;
        int i15 = this.f105097x;
        AbstractC37056f.m118974b0(i15 - i14, i15, objArr2);
        this.f105097x -= i14;
    }

    /* JADX INFO: renamed from: o */
    public final int m78377o(int i13, int i14, Collection collection, boolean z4) {
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            int i17 = i13 + i15;
            if (collection.contains(this.f105096w[i17]) == z4) {
                Object[] objArr = this.f105096w;
                i15++;
                objArr[i16 + i13] = objArr[i17];
                i16++;
            } else {
                i15++;
            }
        }
        int i18 = i14 - i16;
        Object[] objArr2 = this.f105096w;
        AbstractC25260n.m74062d0(i13 + i16, i14 + i13, this.f105097x, objArr2, objArr2);
        Object[] objArr3 = this.f105096w;
        int i19 = this.f105097x;
        AbstractC37056f.m118974b0(i19 - i18, i19, objArr3);
        if (i18 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f105097x -= i18;
        return i18;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m78373j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo74008c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78373j();
        return m78377o(0, this.f105097x, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78373j();
        return m78377o(0, this.f105097x, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m78373j();
        int i14 = this.f105097x;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        Object[] objArr = this.f105096w;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i13, int i14) {
        AbstractC30060g.m92125o(i13, i14, this.f105097x);
        return new C26458a(this.f105096w, i13, i14 - i13, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        int length = array.length;
        int i13 = this.f105097x;
        if (length < i13) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f105096w, 0, i13, array.getClass());
            AbstractC22676k.m65749i(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC25260n.m74062d0(0, 0, i13, this.f105096w, array);
        int i14 = this.f105097x;
        if (i14 < array.length) {
            array[i14] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC37056f.m118973b(this.f105096w, 0, this.f105097x, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        int i14 = this.f105097x;
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return new C26459b(this, i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78373j();
        int i14 = this.f105097x;
        if (i13 >= 0 && i13 <= i14) {
            int size = elements.size();
            m78371e(i13, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        m78373j();
        int i14 = this.f105097x;
        if (i13 >= 0 && i13 <= i14) {
            ((AbstractList) this).modCount++;
            m78374l(i13, 1);
            this.f105096w[i13] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC25260n.m74072m0(0, this.f105097x, this.f105096w);
    }
}

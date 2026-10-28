package n83;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m83.AbstractC25248h;
import m83.AbstractC25260n;
import p005a3.C0252t;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n83.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C26458a extends AbstractC25248h implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: E */
    public final C26460c f105085E;

    /* JADX INFO: renamed from: w */
    public Object[] f105086w;

    /* JADX INFO: renamed from: x */
    public final int f105087x;

    /* JADX INFO: renamed from: y */
    public int f105088y;

    /* JADX INFO: renamed from: z */
    public final C26458a f105089z;

    public C26458a(Object[] backing, int i13, int i14, C26458a c26458a, C26460c root) {
        AbstractC22676k.m65750j(backing, "backing");
        AbstractC22676k.m65750j(root, "root");
        this.f105086w = backing;
        this.f105087x = i13;
        this.f105088y = i14;
        this.f105089z = c26458a;
        this.f105085E = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: a */
    public final int mo74007a() {
        m78363j();
        return this.f105088y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m78364l();
        m78363j();
        m78362g(this.f105087x + this.f105088y, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78364l();
        m78363j();
        int size = elements.size();
        m78361e(this.f105087x + this.f105088y, elements, size);
        return size > 0;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: c */
    public final Object mo74008c(int i13) {
        m78364l();
        m78363j();
        int i14 = this.f105088y;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return m78365m(this.f105087x + i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m78364l();
        m78363j();
        m78366n(this.f105087x, this.f105088y);
    }

    /* JADX INFO: renamed from: e */
    public final void m78361e(int i13, Collection collection, int i14) {
        ((AbstractList) this).modCount++;
        C26460c c26460c = this.f105085E;
        C26458a c26458a = this.f105089z;
        if (c26458a != null) {
            c26458a.m78361e(i13, collection, i14);
        } else {
            C26460c c26460c2 = C26460c.f105095z;
            c26460c.m78371e(i13, collection, i14);
        }
        this.f105086w = c26460c.f105096w;
        this.f105088y += i14;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m78363j();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f105086w;
            int i13 = this.f105088y;
            if (i13 == list.size()) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (AbstractC22676k.m65745e(objArr[this.f105087x + i14], list.get(i14))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m78362g(int i13, Object obj) {
        ((AbstractList) this).modCount++;
        C26460c c26460c = this.f105085E;
        C26458a c26458a = this.f105089z;
        if (c26458a != null) {
            c26458a.m78362g(i13, obj);
        } else {
            C26460c c26460c2 = C26460c.f105095z;
            c26460c.m78372g(i13, obj);
        }
        this.f105086w = c26460c.f105096w;
        this.f105088y++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        m78363j();
        int i14 = this.f105088y;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return this.f105086w[this.f105087x + i13];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m78363j();
        Object[] objArr = this.f105086w;
        int i13 = this.f105088y;
        int iHashCode = 1;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = objArr[this.f105087x + i14];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m78363j();
        for (int i13 = 0; i13 < this.f105088y; i13++) {
            if (AbstractC22676k.m65745e(this.f105086w[this.f105087x + i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m78363j();
        return this.f105088y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m78363j() {
        if (((AbstractList) this.f105085E).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m78364l() {
        if (this.f105085E.f105098y) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m78363j();
        for (int i13 = this.f105088y - 1; i13 >= 0; i13--) {
            if (AbstractC22676k.m65745e(this.f105086w[this.f105087x + i13], obj)) {
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
    public final Object m78365m(int i13) {
        Object objM78375m;
        ((AbstractList) this).modCount++;
        C26458a c26458a = this.f105089z;
        if (c26458a != null) {
            objM78375m = c26458a.m78365m(i13);
        } else {
            C26460c c26460c = C26460c.f105095z;
            objM78375m = this.f105085E.m78375m(i13);
        }
        this.f105088y--;
        return objM78375m;
    }

    /* JADX INFO: renamed from: n */
    public final void m78366n(int i13, int i14) {
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        C26458a c26458a = this.f105089z;
        if (c26458a != null) {
            c26458a.m78366n(i13, i14);
        } else {
            C26460c c26460c = C26460c.f105095z;
            this.f105085E.m78376n(i13, i14);
        }
        this.f105088y -= i14;
    }

    /* JADX INFO: renamed from: o */
    public final int m78367o(int i13, int i14, Collection collection, boolean z4) {
        int iM78377o;
        C26458a c26458a = this.f105089z;
        if (c26458a != null) {
            iM78377o = c26458a.m78367o(i13, i14, collection, z4);
        } else {
            C26460c c26460c = C26460c.f105095z;
            iM78377o = this.f105085E.m78377o(i13, i14, collection, z4);
        }
        if (iM78377o > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f105088y -= iM78377o;
        return iM78377o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m78364l();
        m78363j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo74008c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78364l();
        m78363j();
        return m78367o(this.f105087x, this.f105088y, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78364l();
        m78363j();
        return m78367o(this.f105087x, this.f105088y, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m78364l();
        m78363j();
        int i14 = this.f105088y;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        Object[] objArr = this.f105086w;
        int i15 = this.f105087x;
        Object obj2 = objArr[i15 + i13];
        objArr[i15 + i13] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i13, int i14) {
        AbstractC30060g.m92125o(i13, i14, this.f105088y);
        return new C26458a(this.f105086w, this.f105087x + i13, i14 - i13, this, this.f105085E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        m78363j();
        int length = array.length;
        int i13 = this.f105088y;
        int i14 = this.f105087x;
        if (length < i13) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f105086w, i14, i13 + i14, array.getClass());
            AbstractC22676k.m65749i(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC25260n.m74062d0(0, i14, i13 + i14, this.f105086w, array);
        int i15 = this.f105088y;
        if (i15 < array.length) {
            array[i15] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m78363j();
        return AbstractC37056f.m118973b(this.f105086w, this.f105087x, this.f105088y, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        m78363j();
        int i14 = this.f105088y;
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        return new C0252t(this, i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        m78364l();
        m78363j();
        int i14 = this.f105088y;
        if (i13 >= 0 && i13 <= i14) {
            m78362g(this.f105087x + i13, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        m78364l();
        m78363j();
        int i14 = this.f105088y;
        if (i13 >= 0 && i13 <= i14) {
            int size = elements.size();
            m78361e(this.f105087x + i13, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m78363j();
        Object[] objArr = this.f105086w;
        int i13 = this.f105088y;
        int i14 = this.f105087x;
        return AbstractC25260n.m74072m0(i14, i13 + i14, objArr);
    }
}

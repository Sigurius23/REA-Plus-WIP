package m83;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m83.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C25258m extends AbstractC25248h {

    /* JADX INFO: renamed from: z */
    public static final Object[] f99139z = new Object[0];

    /* JADX INFO: renamed from: w */
    public int f99140w;

    /* JADX INFO: renamed from: x */
    public Object[] f99141x;

    /* JADX INFO: renamed from: y */
    public int f99142y;

    public C25258m() {
        this.f99141x = f99139z;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: a */
    public final int mo74007a() {
        return this.f99142y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int length;
        int i14 = this.f99142y;
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        if (i13 == i14) {
            addLast(obj);
            return;
        }
        if (i13 == 0) {
            addFirst(obj);
            return;
        }
        m74023p();
        m74016e(this.f99142y + 1);
        int iM74022o = m74022o(this.f99140w + i13);
        int i15 = this.f99142y;
        if (i13 < ((i15 + 1) >> 1)) {
            if (iM74022o == 0) {
                Object[] objArr = this.f99141x;
                AbstractC22676k.m65750j(objArr, "<this>");
                iM74022o = objArr.length;
            }
            int i16 = iM74022o - 1;
            int i17 = this.f99140w;
            if (i17 == 0) {
                Object[] objArr2 = this.f99141x;
                AbstractC22676k.m65750j(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i17 - 1;
            }
            int i18 = this.f99140w;
            if (i16 >= i18) {
                Object[] objArr3 = this.f99141x;
                objArr3[length] = objArr3[i18];
                AbstractC25260n.m74062d0(i18, i18 + 1, i16 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f99141x;
                AbstractC25260n.m74062d0(i18 - 1, i18, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f99141x;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC25260n.m74062d0(0, 1, i16 + 1, objArr5, objArr5);
            }
            this.f99141x[i16] = obj;
            this.f99140w = length;
        } else {
            int iM74022o2 = m74022o(i15 + this.f99140w);
            if (iM74022o < iM74022o2) {
                Object[] objArr6 = this.f99141x;
                AbstractC25260n.m74062d0(iM74022o + 1, iM74022o, iM74022o2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f99141x;
                AbstractC25260n.m74062d0(1, 0, iM74022o2, objArr7, objArr7);
                Object[] objArr8 = this.f99141x;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC25260n.m74062d0(iM74022o + 1, iM74022o, objArr8.length - 1, objArr8, objArr8);
            }
            this.f99141x[iM74022o] = obj;
        }
        this.f99142y++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        int i14 = this.f99142y;
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i13 == this.f99142y) {
            return addAll(elements);
        }
        m74023p();
        m74016e(elements.size() + this.f99142y);
        int iM74022o = m74022o(this.f99142y + this.f99140w);
        int iM74022o2 = m74022o(this.f99140w + i13);
        int size = elements.size();
        if (i13 >= ((this.f99142y + 1) >> 1)) {
            int i15 = iM74022o2 + size;
            if (iM74022o2 < iM74022o) {
                int i16 = size + iM74022o;
                Object[] objArr = this.f99141x;
                if (i16 <= objArr.length) {
                    AbstractC25260n.m74062d0(i15, iM74022o2, iM74022o, objArr, objArr);
                } else if (i15 >= objArr.length) {
                    AbstractC25260n.m74062d0(i15 - objArr.length, iM74022o2, iM74022o, objArr, objArr);
                } else {
                    int length = iM74022o - (i16 - objArr.length);
                    AbstractC25260n.m74062d0(0, length, iM74022o, objArr, objArr);
                    Object[] objArr2 = this.f99141x;
                    AbstractC25260n.m74062d0(i15, iM74022o2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f99141x;
                AbstractC25260n.m74062d0(size, 0, iM74022o, objArr3, objArr3);
                Object[] objArr4 = this.f99141x;
                if (i15 >= objArr4.length) {
                    AbstractC25260n.m74062d0(i15 - objArr4.length, iM74022o2, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC25260n.m74062d0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f99141x;
                    AbstractC25260n.m74062d0(i15, iM74022o2, objArr5.length - size, objArr5, objArr5);
                }
            }
            m74015d(iM74022o2, elements);
            return true;
        }
        int i17 = this.f99140w;
        int length2 = i17 - size;
        if (iM74022o2 < i17) {
            Object[] objArr6 = this.f99141x;
            AbstractC25260n.m74062d0(length2, i17, objArr6.length, objArr6, objArr6);
            if (size >= iM74022o2) {
                Object[] objArr7 = this.f99141x;
                AbstractC25260n.m74062d0(objArr7.length - size, 0, iM74022o2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f99141x;
                AbstractC25260n.m74062d0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f99141x;
                AbstractC25260n.m74062d0(0, size, iM74022o2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f99141x;
            AbstractC25260n.m74062d0(length2, i17, iM74022o2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f99141x;
            length2 += objArr11.length;
            int i18 = iM74022o2 - i17;
            int length3 = objArr11.length - length2;
            if (length3 >= i18) {
                AbstractC25260n.m74062d0(length2, i17, iM74022o2, objArr11, objArr11);
            } else {
                AbstractC25260n.m74062d0(length2, i17, i17 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f99141x;
                AbstractC25260n.m74062d0(0, this.f99140w + length3, iM74022o2, objArr12, objArr12);
            }
        }
        this.f99140w = length2;
        m74015d(m74020m(iM74022o2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m74023p();
        m74016e(this.f99142y + 1);
        int length = this.f99140w;
        if (length == 0) {
            Object[] objArr = this.f99141x;
            AbstractC22676k.m65750j(objArr, "<this>");
            length = objArr.length;
        }
        int i13 = length - 1;
        this.f99140w = i13;
        this.f99141x[i13] = obj;
        this.f99142y++;
    }

    public final void addLast(Object obj) {
        m74023p();
        m74016e(mo74007a() + 1);
        this.f99141x[m74022o(mo74007a() + this.f99140w)] = obj;
        this.f99142y = mo74007a() + 1;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: c */
    public final Object mo74008c(int i13) {
        int i14 = this.f99142y;
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
        if (i13 == AbstractC37056f.m118951C(this)) {
            return removeLast();
        }
        if (i13 == 0) {
            return removeFirst();
        }
        m74023p();
        int iM74022o = m74022o(this.f99140w + i13);
        Object[] objArr = this.f99141x;
        Object obj = objArr[iM74022o];
        if (i13 < (this.f99142y >> 1)) {
            int i15 = this.f99140w;
            if (iM74022o >= i15) {
                AbstractC25260n.m74062d0(i15 + 1, i15, iM74022o, objArr, objArr);
            } else {
                AbstractC25260n.m74062d0(1, 0, iM74022o, objArr, objArr);
                Object[] objArr2 = this.f99141x;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i16 = this.f99140w;
                AbstractC25260n.m74062d0(i16 + 1, i16, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f99141x;
            int i17 = this.f99140w;
            objArr3[i17] = null;
            this.f99140w = m74018j(i17);
        } else {
            int iM74022o2 = m74022o(AbstractC37056f.m118951C(this) + this.f99140w);
            if (iM74022o <= iM74022o2) {
                Object[] objArr4 = this.f99141x;
                AbstractC25260n.m74062d0(iM74022o, iM74022o + 1, iM74022o2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f99141x;
                AbstractC25260n.m74062d0(iM74022o, iM74022o + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f99141x;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC25260n.m74062d0(0, 1, iM74022o2 + 1, objArr6, objArr6);
            }
            this.f99141x[iM74022o2] = null;
        }
        this.f99142y--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m74023p();
            m74021n(this.f99140w, m74022o(mo74007a() + this.f99140w));
        }
        this.f99140w = 0;
        this.f99142y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m74015d(int i13, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f99141x.length;
        while (i13 < length && it.hasNext()) {
            this.f99141x[i13] = it.next();
            i13++;
        }
        int i14 = this.f99140w;
        for (int i15 = 0; i15 < i14 && it.hasNext(); i15++) {
            this.f99141x[i15] = it.next();
        }
        this.f99142y = collection.size() + this.f99142y;
    }

    /* JADX INFO: renamed from: e */
    public final void m74016e(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f99141x;
        if (i13 <= objArr.length) {
            return;
        }
        if (objArr == f99139z) {
            if (i13 < 10) {
                i13 = 10;
            }
            this.f99141x = new Object[i13];
            return;
        }
        int length = objArr.length;
        int i14 = length + (length >> 1);
        if (i14 - i13 < 0) {
            i14 = i13;
        }
        if (i14 - 2147483639 > 0) {
            i14 = i13 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i14];
        AbstractC25260n.m74062d0(0, this.f99140w, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f99141x;
        int length2 = objArr3.length;
        int i15 = this.f99140w;
        AbstractC25260n.m74062d0(length2 - i15, 0, i15, objArr3, objArr2);
        this.f99140w = 0;
        this.f99141x = objArr2;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f99141x[this.f99140w];
    }

    /* JADX INFO: renamed from: g */
    public final Object m74017g() {
        if (isEmpty()) {
            return null;
        }
        return this.f99141x[this.f99140w];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        int iMo74007a = mo74007a();
        if (i13 < 0 || i13 >= iMo74007a) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, iMo74007a, "index: ", ", size: "));
        }
        return this.f99141x[m74022o(this.f99140w + i13)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i13;
        int iM74022o = m74022o(mo74007a() + this.f99140w);
        int length = this.f99140w;
        if (length < iM74022o) {
            while (length < iM74022o) {
                if (AbstractC22676k.m65745e(obj, this.f99141x[length])) {
                    i13 = this.f99140w;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f99140w) < iM74022o) {
            return -1;
        }
        int length2 = this.f99141x.length;
        while (length < length2) {
            if (AbstractC22676k.m65745e(obj, this.f99141x[length])) {
                i13 = this.f99140w;
            } else {
                length++;
            }
        }
        for (int i14 = 0; i14 < iM74022o; i14++) {
            if (AbstractC22676k.m65745e(obj, this.f99141x[i14])) {
                length = i14 + this.f99141x.length;
                i13 = this.f99140w;
            }
        }
        return -1;
        return length - i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo74007a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m74018j(int i13) {
        Object[] objArr = this.f99141x;
        AbstractC22676k.m65750j(objArr, "<this>");
        if (i13 == objArr.length - 1) {
            return 0;
        }
        return i13 + 1;
    }

    /* JADX INFO: renamed from: l */
    public final Object m74019l() {
        if (isEmpty()) {
            return null;
        }
        return this.f99141x[m74022o(AbstractC37056f.m118951C(this) + this.f99140w)];
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f99141x[m74022o(AbstractC37056f.m118951C(this) + this.f99140w)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i13;
        int iM74022o = m74022o(this.f99142y + this.f99140w);
        int i14 = this.f99140w;
        if (i14 < iM74022o) {
            length = iM74022o - 1;
            if (i14 <= length) {
                while (!AbstractC22676k.m65745e(obj, this.f99141x[length])) {
                    if (length != i14) {
                        length--;
                    }
                }
                i13 = this.f99140w;
                return length - i13;
            }
            return -1;
        }
        if (!isEmpty() && this.f99140w >= iM74022o) {
            for (int i15 = iM74022o - 1; -1 < i15; i15--) {
                if (AbstractC22676k.m65745e(obj, this.f99141x[i15])) {
                    length = i15 + this.f99141x.length;
                    i13 = this.f99140w;
                    return length - i13;
                }
            }
            Object[] objArr = this.f99141x;
            AbstractC22676k.m65750j(objArr, "<this>");
            length = objArr.length - 1;
            int i16 = this.f99140w;
            if (i16 <= length) {
                while (!AbstractC22676k.m65745e(obj, this.f99141x[length])) {
                    if (length != i16) {
                        length--;
                    }
                }
                i13 = this.f99140w;
                return length - i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final int m74020m(int i13) {
        return i13 < 0 ? i13 + this.f99141x.length : i13;
    }

    /* JADX INFO: renamed from: n */
    public final void m74021n(int i13, int i14) {
        if (i13 < i14) {
            AbstractC25260n.m74073n0(i13, i14, null, this.f99141x);
            return;
        }
        Object[] objArr = this.f99141x;
        AbstractC25260n.m74073n0(i13, objArr.length, null, objArr);
        AbstractC25260n.m74073n0(0, i14, null, this.f99141x);
    }

    /* JADX INFO: renamed from: o */
    public final int m74022o(int i13) {
        Object[] objArr = this.f99141x;
        return i13 >= objArr.length ? i13 - objArr.length : i13;
    }

    /* JADX INFO: renamed from: p */
    public final void m74023p() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: q */
    public final Object m74024q() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo74008c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iM74022o;
        AbstractC22676k.m65750j(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f99141x.length != 0) {
            int iM74022o2 = m74022o(mo74007a() + this.f99140w);
            int i13 = this.f99140w;
            if (i13 < iM74022o2) {
                iM74022o = i13;
                while (i13 < iM74022o2) {
                    Object obj = this.f99141x[i13];
                    if (elements.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f99141x[iM74022o] = obj;
                        iM74022o++;
                    }
                    i13++;
                }
                AbstractC25260n.m74073n0(iM74022o, iM74022o2, null, this.f99141x);
            } else {
                int length = this.f99141x.length;
                boolean z13 = false;
                int i14 = i13;
                while (i13 < length) {
                    Object[] objArr = this.f99141x;
                    Object obj2 = objArr[i13];
                    objArr[i13] = null;
                    if (elements.contains(obj2)) {
                        z13 = true;
                    } else {
                        this.f99141x[i14] = obj2;
                        i14++;
                    }
                    i13++;
                }
                iM74022o = m74022o(i14);
                for (int i15 = 0; i15 < iM74022o2; i15++) {
                    Object[] objArr2 = this.f99141x;
                    Object obj3 = objArr2[i15];
                    objArr2[i15] = null;
                    if (elements.contains(obj3)) {
                        z13 = true;
                    } else {
                        this.f99141x[iM74022o] = obj3;
                        iM74022o = m74018j(iM74022o);
                    }
                }
                z4 = z13;
            }
            if (z4) {
                m74023p();
                this.f99142y = m74020m(iM74022o - this.f99140w);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m74023p();
        Object[] objArr = this.f99141x;
        int i13 = this.f99140w;
        Object obj = objArr[i13];
        objArr[i13] = null;
        this.f99140w = m74018j(i13);
        this.f99142y = mo74007a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m74023p();
        int iM74022o = m74022o(AbstractC37056f.m118951C(this) + this.f99140w);
        Object[] objArr = this.f99141x;
        Object obj = objArr[iM74022o];
        objArr[iM74022o] = null;
        this.f99142y = mo74007a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        AbstractC30060g.m92125o(i13, i14, this.f99142y);
        int i15 = i14 - i13;
        if (i15 == 0) {
            return;
        }
        if (i15 == this.f99142y) {
            clear();
            return;
        }
        if (i15 == 1) {
            mo74008c(i13);
            return;
        }
        m74023p();
        if (i13 < this.f99142y - i14) {
            int iM74022o = m74022o(this.f99140w + (i13 - 1));
            int iM74022o2 = m74022o(this.f99140w + (i14 - 1));
            while (i13 > 0) {
                int i16 = iM74022o + 1;
                int iMin = Math.min(i13, Math.min(i16, iM74022o2 + 1));
                Object[] objArr = this.f99141x;
                int i17 = iM74022o2 - iMin;
                int i18 = iM74022o - iMin;
                AbstractC25260n.m74062d0(i17 + 1, i18 + 1, i16, objArr, objArr);
                iM74022o = m74020m(i18);
                iM74022o2 = m74020m(i17);
                i13 -= iMin;
            }
            int iM74022o3 = m74022o(this.f99140w + i15);
            m74021n(this.f99140w, iM74022o3);
            this.f99140w = iM74022o3;
        } else {
            int iM74022o4 = m74022o(this.f99140w + i14);
            int iM74022o5 = m74022o(this.f99140w + i13);
            int i19 = this.f99142y;
            while (true) {
                i19 -= i14;
                if (i19 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f99141x;
                i14 = Math.min(i19, Math.min(objArr2.length - iM74022o4, objArr2.length - iM74022o5));
                Object[] objArr3 = this.f99141x;
                int i24 = iM74022o4 + i14;
                AbstractC25260n.m74062d0(iM74022o5, iM74022o4, i24, objArr3, objArr3);
                iM74022o4 = m74022o(i24);
                iM74022o5 = m74022o(iM74022o5 + i14);
            }
            int iM74022o6 = m74022o(this.f99142y + this.f99140w);
            m74021n(m74020m(iM74022o6 - i15), iM74022o6);
        }
        this.f99142y -= i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iM74022o;
        AbstractC22676k.m65750j(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f99141x.length != 0) {
            int iM74022o2 = m74022o(mo74007a() + this.f99140w);
            int i13 = this.f99140w;
            if (i13 < iM74022o2) {
                iM74022o = i13;
                while (i13 < iM74022o2) {
                    Object obj = this.f99141x[i13];
                    if (elements.contains(obj)) {
                        this.f99141x[iM74022o] = obj;
                        iM74022o++;
                    } else {
                        z4 = true;
                    }
                    i13++;
                }
                AbstractC25260n.m74073n0(iM74022o, iM74022o2, null, this.f99141x);
            } else {
                int length = this.f99141x.length;
                boolean z13 = false;
                int i14 = i13;
                while (i13 < length) {
                    Object[] objArr = this.f99141x;
                    Object obj2 = objArr[i13];
                    objArr[i13] = null;
                    if (elements.contains(obj2)) {
                        this.f99141x[i14] = obj2;
                        i14++;
                    } else {
                        z13 = true;
                    }
                    i13++;
                }
                iM74022o = m74022o(i14);
                for (int i15 = 0; i15 < iM74022o2; i15++) {
                    Object[] objArr2 = this.f99141x;
                    Object obj3 = objArr2[i15];
                    objArr2[i15] = null;
                    if (elements.contains(obj3)) {
                        this.f99141x[iM74022o] = obj3;
                        iM74022o = m74018j(iM74022o);
                    } else {
                        z13 = true;
                    }
                }
                z4 = z13;
            }
            if (z4) {
                m74023p();
                this.f99142y = m74020m(iM74022o - this.f99140w);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        int iMo74007a = mo74007a();
        if (i13 < 0 || i13 >= iMo74007a) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, iMo74007a, "index: ", ", size: "));
        }
        int iM74022o = m74022o(this.f99140w + i13);
        Object[] objArr = this.f99141x;
        Object obj2 = objArr[iM74022o];
        objArr[iM74022o] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo74007a()]);
    }

    public C25258m(int i13) {
        Object[] objArr;
        if (i13 == 0) {
            objArr = f99139z;
        } else if (i13 > 0) {
            objArr = new Object[i13];
        } else {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Illegal Capacity: "));
        }
        this.f99141x = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        int length = array.length;
        int i13 = this.f99142y;
        if (length < i13) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i13);
            AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iM74022o = m74022o(this.f99142y + this.f99140w);
        int i14 = this.f99140w;
        if (i14 < iM74022o) {
            AbstractC25260n.m74068i0(i14, iM74022o, 2, this.f99141x, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f99141x;
            AbstractC25260n.m74062d0(0, this.f99140w, objArr.length, objArr, array);
            Object[] objArr2 = this.f99141x;
            AbstractC25260n.m74062d0(objArr2.length - this.f99140w, 0, iM74022o, objArr2, array);
        }
        int i15 = this.f99142y;
        if (i15 < array.length) {
            array[i15] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m74023p();
        m74016e(elements.size() + mo74007a());
        m74015d(m74022o(mo74007a() + this.f99140w), elements);
        return true;
    }
}

package p002a0;

import d93.InterfaceC11821b;
import d93.InterfaceC11825f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import o73.C27648a;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0025h implements Collection, Set, InterfaceC11821b, InterfaceC11825f {

    /* JADX INFO: renamed from: w */
    public int[] f59w = AbstractC2177a.f8657a;

    /* JADX INFO: renamed from: x */
    public Object[] f60x = AbstractC2177a.f8659c;

    /* JADX INFO: renamed from: y */
    public int f61y;

    public C0025h(int i13) {
        if (i13 > 0) {
            AbstractC0064z.m160b(this, i13);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m60a(int i13) {
        int i14 = this.f61y;
        Object[] objArr = this.f60x;
        Object obj = objArr[i13];
        if (i14 <= 1) {
            clear();
            return obj;
        }
        int i15 = i14 - 1;
        int[] iArr = this.f59w;
        if (iArr.length <= 8 || i14 >= iArr.length / 3) {
            if (i13 < i15) {
                int i16 = i13 + 1;
                AbstractC25260n.m74064e0(i13, i16, iArr, iArr, i14);
                Object[] objArr2 = this.f60x;
                AbstractC25260n.m74062d0(i13, i16, i14, objArr2, objArr2);
            }
            this.f60x[i15] = null;
        } else {
            int i17 = i14 > 8 ? i14 + (i14 >> 1) : 8;
            int[] iArr2 = new int[i17];
            this.f59w = iArr2;
            this.f60x = new Object[i17];
            if (i13 > 0) {
                AbstractC25260n.m74069j0(0, i13, iArr, iArr2, 6);
                AbstractC25260n.m74068i0(0, i13, 6, objArr, this.f60x);
            }
            if (i13 < i15) {
                int i18 = i13 + 1;
                AbstractC25260n.m74064e0(i13, i18, iArr, this.f59w, i14);
                AbstractC25260n.m74062d0(i13, i18, i14, objArr, this.f60x);
            }
        }
        if (i14 != this.f61y) {
            throw new ConcurrentModificationException();
        }
        this.f61y = i15;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i13;
        int iM161c;
        int i14 = this.f61y;
        if (obj == null) {
            iM161c = AbstractC0064z.m161c(this, null, 0);
            i13 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i13 = iHashCode;
            iM161c = AbstractC0064z.m161c(this, obj, iHashCode);
        }
        if (iM161c >= 0) {
            return false;
        }
        int i15 = ~iM161c;
        int[] iArr = this.f59w;
        if (i14 >= iArr.length) {
            int i16 = 8;
            if (i14 >= 8) {
                i16 = (i14 >> 1) + i14;
            } else if (i14 < 4) {
                i16 = 4;
            }
            Object[] objArr = this.f60x;
            int[] iArr2 = new int[i16];
            this.f59w = iArr2;
            this.f60x = new Object[i16];
            if (i14 != this.f61y) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC25260n.m74069j0(0, iArr.length, iArr, iArr2, 6);
                AbstractC25260n.m74068i0(0, objArr.length, 6, objArr, this.f60x);
            }
        }
        if (i15 < i14) {
            int[] iArr3 = this.f59w;
            int i17 = i15 + 1;
            AbstractC25260n.m74064e0(i17, i15, iArr3, iArr3, i14);
            Object[] objArr2 = this.f60x;
            AbstractC25260n.m74062d0(i17, i15, i14, objArr2, objArr2);
        }
        int i18 = this.f61y;
        if (i14 == i18) {
            int[] iArr4 = this.f59w;
            if (i15 < iArr4.length) {
                iArr4[i15] = i13;
                this.f60x[i15] = obj;
                this.f61y = i18 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        int size = elements.size() + this.f61y;
        int i13 = this.f61y;
        int[] iArr = this.f59w;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f60x;
            int[] iArr2 = new int[size];
            this.f59w = iArr2;
            this.f60x = new Object[size];
            if (i13 > 0) {
                AbstractC25260n.m74069j0(0, i13, iArr, iArr2, 6);
                AbstractC25260n.m74068i0(0, this.f61y, 6, objArr, this.f60x);
            }
        }
        if (this.f61y != i13) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f61y != 0) {
            this.f59w = AbstractC2177a.f8657a;
            this.f60x = AbstractC2177a.f8659c;
            this.f61y = 0;
        }
        if (this.f61y != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0064z.m161c(this, null, 0) : AbstractC0064z.m161c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f61y != ((Set) obj).size()) {
            return false;
        }
        try {
            int i13 = this.f61y;
            for (int i14 = 0; i14 < i13; i14++) {
                if (!((Set) obj).contains(this.f60x[i14])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f59w;
        int i13 = this.f61y;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += iArr[i15];
        }
        return i14;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f61y <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0007b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM161c = obj == null ? AbstractC0064z.m161c(this, null, 0) : AbstractC0064z.m161c(this, obj, obj.hashCode());
        if (iM161c < 0) {
            return false;
        }
        m60a(iM161c);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        boolean z4 = false;
        for (int i13 = this.f61y - 1; -1 < i13; i13--) {
            if (!AbstractC25265s.m74155w0(elements, this.f60x[i13])) {
                m60a(i13);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f61y;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC25260n.m74072m0(0, this.f61y, this.f60x);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder(this.f61y * 14);
        sb4.append('{');
        int i13 = this.f61y;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb4.append(", ");
            }
            Object obj = this.f60x[i14];
            if (obj != this) {
                sb4.append(obj);
            } else {
                sb4.append("(this Set)");
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        Object[] objArrM83572W = C27648a.m83572W(this.f61y, array);
        AbstractC25260n.m74062d0(0, 0, this.f61y, this.f60x, objArrM83572W);
        return objArrM83572W;
    }
}

package p002a0;

import d93.InterfaceC11820a;
import d93.InterfaceC11825f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0063y0 implements InterfaceC11825f, Set, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C0059w0 f199w;

    /* JADX INFO: renamed from: x */
    public final C0059w0 f200x;

    public C0063y0(C0059w0 c0059w0) {
        this.f199w = c0059w0;
        this.f200x = c0059w0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f200x.m136a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0059w0 c0059w0 = this.f200x;
        int i13 = c0059w0.f180d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c0059w0.m146k(it.next());
        }
        return i13 != c0059w0.f180d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f200x.m137b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f199w.m138c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f199w.m138c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0063y0.class != obj.getClass()) {
            return false;
        }
        return this.f199w.equals(((C0063y0) obj).f199w);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f199w.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f199w.m142g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0053t0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f200x.m147l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0059w0 c0059w0 = this.f200x;
        c0059w0.getClass();
        int i13 = c0059w0.f180d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c0059w0.m144i(it.next());
        }
        return i13 != c0059w0.f180d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        boolean z4;
        AbstractC22676k.m65750j(elements, "elements");
        C0059w0 c0059w0 = this.f200x;
        c0059w0.getClass();
        Object[] objArr = c0059w0.f178b;
        int i13 = c0059w0.f180d;
        long[] jArr = c0059w0.f177a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j7 = jArr[i14];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j7) < 128) {
                            int i17 = (i14 << 3) + i16;
                            if (!AbstractC25265s.m74155w0(elements, objArr[i17])) {
                                c0059w0.m148m(i17);
                            }
                        }
                        j7 >>= 8;
                    }
                    z4 = false;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    z4 = false;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        } else {
            z4 = false;
        }
        if (i13 != c0059w0.f180d) {
            return true;
        }
        return z4;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f199w.f180d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return this.f199w.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}

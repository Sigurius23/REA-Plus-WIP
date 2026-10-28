package p002a0;

import d93.InterfaceC11820a;
import d93.InterfaceC11825f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0055u0 implements InterfaceC11825f, Set, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C0049r0 f167w;

    /* JADX INFO: renamed from: x */
    public final C0049r0 f168x;

    public C0055u0(C0049r0 parent) {
        AbstractC22676k.m65750j(parent, "parent");
        this.f167w = parent;
        this.f168x = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f168x.m111a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        C0049r0 c0049r0 = this.f168x;
        c0049r0.getClass();
        int i13 = c0049r0.f146g;
        for (Object obj : elements) {
            int iM114d = c0049r0.m114d(obj);
            c0049r0.f141b[iM114d] = obj;
            long[] jArr = c0049r0.f142c;
            int i14 = c0049r0.f143d;
            jArr[iM114d] = (((long) i14) & 2147483647L) | 4611686016279904256L;
            if (i14 != Integer.MAX_VALUE) {
                jArr[i14] = ((((long) iM114d) & 2147483647L) << 31) | (jArr[i14] & (-4611686016279904257L));
            }
            c0049r0.f143d = iM114d;
            if (c0049r0.f144e == Integer.MAX_VALUE) {
                c0049r0.f144e = iM114d;
            }
        }
        return i13 != c0049r0.f146g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f168x.m112b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f167w.m113c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f167w.m113c(it.next())) {
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
        if (obj == null || C0055u0.class != obj.getClass()) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f167w, ((C0055u0) obj).f167w);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f167w.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f167w.f146g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0053t0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f168x.m117g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        int iNumberOfTrailingZeros;
        AbstractC22676k.m65750j(elements, "elements");
        C0049r0 c0049r0 = this.f168x;
        c0049r0.getClass();
        int i13 = c0049r0.f146g;
        Iterator it = elements.iterator();
        while (true) {
            int i14 = 1;
            int i15 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i16 = iHashCode ^ (iHashCode << 16);
            int i17 = i16 & 127;
            int i18 = c0049r0.f145f;
            int i19 = (i16 >>> 7) & i18;
            while (true) {
                long[] jArr = c0049r0.f140a;
                int i24 = i19 >> 3;
                int i25 = (i19 & 7) << 3;
                int i26 = i14;
                int i27 = i15;
                long j7 = (((-i25) >> 63) & (jArr[i24 + i14] << (64 - i25))) | (jArr[i24] >>> i25);
                long j13 = (((long) i17) * 72340172838076673L) ^ j7;
                long j14 = -9187201950435737472L;
                long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
                while (j15 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i19) & i18;
                    long j16 = j14;
                    if (AbstractC22676k.m65745e(c0049r0.f141b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j15 &= j15 - 1;
                    j14 = j16;
                }
                if ((j7 & ((~j7) << 6) & j14) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i15 = i27 + 8;
                i19 = (i19 + i15) & i18;
                i14 = i26;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c0049r0.m118h(iNumberOfTrailingZeros);
            }
        }
        return i13 != c0049r0.f146g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f168x.m119i(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f167w.f146g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return this.f167w.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}

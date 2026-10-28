package p668z1;

import d93.InterfaceC11822c;
import e93.AbstractC12889b;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25243e0;
import m83.C25249h0;
import p390p1.AbstractC28657q1;
import p491t1.AbstractC33272c;
import p491t1.C33275f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;

/* JADX INFO: renamed from: z1.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39952c0 implements List, InterfaceC11822c {

    /* JADX INFO: renamed from: w */
    public final C39967p f172423w;

    /* JADX INFO: renamed from: x */
    public final int f172424x;

    /* JADX INFO: renamed from: y */
    public int f172425y;

    /* JADX INFO: renamed from: z */
    public int f172426z;

    public C39952c0(C39967p c39967p, int i13, int i14) {
        this.f172423w = c39967p;
        this.f172424x = i13;
        this.f172425y = AbstractC39968q.m128191f(c39967p);
        this.f172426z = i14 - i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m128144a() {
        if (AbstractC39968q.m128191f(this.f172423w) != this.f172425y) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m128144a();
        int i13 = this.f172424x + this.f172426z;
        C39967p c39967p = this.f172423w;
        c39967p.add(i13, obj);
        this.f172426z++;
        this.f172425y = AbstractC39968q.m128191f(c39967p);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f172426z, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f172426z > 0) {
            m128144a();
            int i13 = this.f172426z;
            int i14 = this.f172424x;
            C39967p c39967p = this.f172423w;
            c39967p.m128186y0(i14, i13 + i14);
            this.f172426z = 0;
            this.f172425y = AbstractC39968q.m128191f(c39967p);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        m128144a();
        AbstractC39968q.m128187a(i13, this.f172426z);
        return this.f172423w.get(this.f172424x + i13);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m128144a();
        int i13 = this.f172426z;
        int i14 = this.f172424x;
        Iterator it = AbstractC12889b.m36278i0(i14, i13 + i14).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            if (AbstractC22676k.m65745e(obj, this.f172423w.get(iNextInt))) {
                return iNextInt - i14;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f172426z == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m128144a();
        int i13 = this.f172426z;
        int i14 = this.f172424x;
        for (int i15 = (i13 + i14) - 1; i15 >= i14; i15--) {
            if (AbstractC22676k.m65745e(obj, this.f172423w.get(i15))) {
                return i15 - i14;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i13;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        m128144a();
        C39967p c39967p = this.f172423w;
        int i14 = this.f172424x;
        int i15 = this.f172426z + i14;
        int size = c39967p.size();
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = c39967p.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i13 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            C33275f c33275fMo105554g = abstractC33272c.mo105554g();
            c33275fMo105554g.subList(i14, i15).retainAll(collection);
            AbstractC33272c abstractC33272cM105581d = c33275fMo105554g.m105581d();
            if (AbstractC22676k.m65745e(abstractC33272cM105581d, abstractC33272c)) {
                break;
            }
            C39974w c39974w3 = c39967p.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, c39967p, abstractC39957fM128171k), i13, abstractC33272cM105581d, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, c39967p);
        } while (!zM128188b);
        int size2 = size - c39967p.size();
        if (size2 > 0) {
            this.f172425y = AbstractC39968q.m128191f(this.f172423w);
            this.f172426z -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        AbstractC39968q.m128187a(i13, this.f172426z);
        m128144a();
        int i14 = i13 + this.f172424x;
        C39967p c39967p = this.f172423w;
        Object obj2 = c39967p.set(i14, obj);
        this.f172425y = AbstractC39968q.m128191f(c39967p);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f172426z;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        if (!(i13 >= 0 && i13 <= i14 && i14 <= this.f172426z)) {
            AbstractC28657q1.m87188a("fromIndex or toIndex are out of bounds");
        }
        m128144a();
        int i15 = this.f172424x;
        return new C39952c0(this.f172423w, i13 + i15, i14 + i15);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        m128144a();
        C22665e0 c22665e0 = new C22665e0();
        c22665e0.f89334w = i13 - 1;
        return new C25249h0(c22665e0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        m128144a();
        int i14 = i13 + this.f172424x;
        C39967p c39967p = this.f172423w;
        boolean zAddAll = c39967p.addAll(i14, collection);
        if (zAddAll) {
            this.f172426z = collection.size() + this.f172426z;
            this.f172425y = AbstractC39968q.m128191f(c39967p);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        m128144a();
        int i14 = this.f172424x + i13;
        C39967p c39967p = this.f172423w;
        Object objRemove = c39967p.remove(i14);
        this.f172426z--;
        this.f172425y = AbstractC39968q.m128191f(c39967p);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        m128144a();
        int i14 = this.f172424x + i13;
        C39967p c39967p = this.f172423w;
        c39967p.add(i14, obj);
        this.f172426z++;
        this.f172425y = AbstractC39968q.m128191f(c39967p);
    }
}

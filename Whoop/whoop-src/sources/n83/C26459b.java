package n83;

import d93.InterfaceC11820a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p668z1.AbstractC39968q;
import p668z1.C39967p;

/* JADX INFO: renamed from: n83.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26459b implements ListIterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final Object f105090E;

    /* JADX INFO: renamed from: x */
    public int f105092x;

    /* JADX INFO: renamed from: z */
    public int f105094z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105091w = 0;

    /* JADX INFO: renamed from: y */
    public int f105093y = -1;

    public C26459b(C26460c c26460c, int i13) {
        this.f105090E = c26460c;
        this.f105092x = i13;
        this.f105094z = ((AbstractList) c26460c).modCount;
    }

    /* JADX INFO: renamed from: a */
    public void m78368a() {
        if (((AbstractList) ((C26460c) this.f105090E)).modCount != this.f105094z) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f105091w) {
            case 0:
                m78368a();
                C26460c c26460c = (C26460c) this.f105090E;
                int i13 = this.f105092x;
                this.f105092x = i13 + 1;
                c26460c.add(i13, obj);
                this.f105093y = -1;
                this.f105094z = ((AbstractList) c26460c).modCount;
                break;
            default:
                m78369b();
                C39967p c39967p = (C39967p) this.f105090E;
                c39967p.add(this.f105092x + 1, obj);
                this.f105093y = -1;
                this.f105092x++;
                this.f105094z = AbstractC39968q.m128191f(c39967p);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78369b() {
        if (AbstractC39968q.m128191f((C39967p) this.f105090E) != this.f105094z) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f105091w) {
            case 0:
                return this.f105092x < ((C26460c) this.f105090E).f105097x;
            default:
                return this.f105092x < ((C39967p) this.f105090E).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f105091w) {
            case 0:
                return this.f105092x > 0;
            default:
                return this.f105092x >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f105091w) {
            case 0:
                m78368a();
                int i13 = this.f105092x;
                C26460c c26460c = (C26460c) this.f105090E;
                if (i13 >= c26460c.f105097x) {
                    throw new NoSuchElementException();
                }
                this.f105092x = i13 + 1;
                this.f105093y = i13;
                return c26460c.f105096w[i13];
            default:
                m78369b();
                int i14 = this.f105092x + 1;
                this.f105093y = i14;
                C39967p c39967p = (C39967p) this.f105090E;
                AbstractC39968q.m128187a(i14, c39967p.size());
                Object obj = c39967p.get(i14);
                this.f105092x = i14;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f105091w) {
            case 0:
                return this.f105092x;
            default:
                return this.f105092x + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f105091w) {
            case 0:
                m78368a();
                int i13 = this.f105092x;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f105092x = i14;
                this.f105093y = i14;
                return ((C26460c) this.f105090E).f105096w[i14];
            default:
                m78369b();
                int i15 = this.f105092x;
                C39967p c39967p = (C39967p) this.f105090E;
                AbstractC39968q.m128187a(i15, c39967p.size());
                int i16 = this.f105092x;
                this.f105093y = i16;
                Object obj = c39967p.get(i16);
                this.f105092x--;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f105091w) {
            case 0:
                return this.f105092x - 1;
            default:
                return this.f105092x;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f105091w) {
            case 0:
                C26460c c26460c = (C26460c) this.f105090E;
                m78368a();
                int i13 = this.f105093y;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c26460c.mo74008c(i13);
                this.f105092x = this.f105093y;
                this.f105093y = -1;
                this.f105094z = ((AbstractList) c26460c).modCount;
                return;
            default:
                m78369b();
                C39967p c39967p = (C39967p) this.f105090E;
                c39967p.remove(this.f105093y);
                this.f105092x--;
                this.f105093y = -1;
                this.f105094z = AbstractC39968q.m128191f(c39967p);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f105091w) {
            case 0:
                m78368a();
                int i13 = this.f105093y;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C26460c) this.f105090E).set(i13, obj);
                return;
            default:
                C39967p c39967p = (C39967p) this.f105090E;
                m78369b();
                int i14 = this.f105093y;
                if (i14 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                c39967p.set(i14, obj);
                this.f105094z = AbstractC39968q.m128191f(c39967p);
                return;
        }
    }

    public C26459b(C39967p c39967p, int i13) {
        this.f105090E = c39967p;
        this.f105092x = i13 - 1;
        this.f105094z = AbstractC39968q.m128191f(c39967p);
    }
}

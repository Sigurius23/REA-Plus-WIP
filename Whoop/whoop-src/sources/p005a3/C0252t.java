package p005a3;

import d93.InterfaceC11820a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import n83.C26458a;
import p002a0.C0047q0;
import p026b2.AbstractC2316v;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C0252t implements ListIterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final Object f861E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f862w;

    /* JADX INFO: renamed from: x */
    public int f863x;

    /* JADX INFO: renamed from: y */
    public int f864y;

    /* JADX INFO: renamed from: z */
    public int f865z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0252t(C0258v c0258v, int i13, int i14) {
        this(c0258v, (i14 & 1) != 0 ? 0 : i13, 0, c0258v.f881w.f137b);
        this.f862w = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m770a() {
        if (((AbstractList) ((C26458a) this.f861E).f105085E).modCount != this.f865z) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f862w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                m770a();
                C26458a c26458a = (C26458a) this.f861E;
                int i13 = this.f863x;
                this.f863x = i13 + 1;
                c26458a.add(i13, obj);
                this.f864y = -1;
                this.f865z = ((AbstractList) c26458a).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f862w) {
            case 0:
                return this.f863x < this.f865z;
            default:
                return this.f863x < ((C26458a) this.f861E).f105088y;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f862w) {
            case 0:
                return this.f863x > this.f864y;
            default:
                return this.f863x > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f862w) {
            case 0:
                C0047q0 c0047q0 = ((C0258v) this.f861E).f881w;
                int i13 = this.f863x;
                this.f863x = i13 + 1;
                Object objM102e = c0047q0.m102e(i13);
                AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC2316v) objM102e;
            default:
                m770a();
                int i14 = this.f863x;
                C26458a c26458a = (C26458a) this.f861E;
                if (i14 >= c26458a.f105088y) {
                    throw new NoSuchElementException();
                }
                this.f863x = i14 + 1;
                this.f864y = i14;
                return c26458a.f105086w[c26458a.f105087x + i14];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f862w) {
            case 0:
                return this.f863x - this.f864y;
            default:
                return this.f863x;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f862w) {
            case 0:
                C0047q0 c0047q0 = ((C0258v) this.f861E).f881w;
                int i13 = this.f863x - 1;
                this.f863x = i13;
                Object objM102e = c0047q0.m102e(i13);
                AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC2316v) objM102e;
            default:
                m770a();
                int i14 = this.f863x;
                if (i14 <= 0) {
                    throw new NoSuchElementException();
                }
                int i15 = i14 - 1;
                this.f863x = i15;
                this.f864y = i15;
                C26458a c26458a = (C26458a) this.f861E;
                return c26458a.f105086w[c26458a.f105087x + i15];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i13;
        switch (this.f862w) {
            case 0:
                i13 = this.f863x - this.f864y;
                break;
            default:
                i13 = this.f863x;
                break;
        }
        return i13 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f862w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                C26458a c26458a = (C26458a) this.f861E;
                m770a();
                int i13 = this.f864y;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c26458a.mo74008c(i13);
                this.f863x = this.f864y;
                this.f864y = -1;
                this.f865z = ((AbstractList) c26458a).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f862w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                m770a();
                int i13 = this.f864y;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C26458a) this.f861E).set(i13, obj);
                return;
        }
    }

    public C0252t(C0258v c0258v, int i13, int i14, int i15) {
        this.f862w = 0;
        this.f861E = c0258v;
        this.f863x = i13;
        this.f864y = i14;
        this.f865z = i15;
    }

    public C0252t(C26458a c26458a, int i13) {
        this.f862w = 1;
        this.f861E = c26458a;
        this.f863x = i13;
        this.f864y = -1;
        this.f865z = ((AbstractList) c26458a).modCount;
    }
}

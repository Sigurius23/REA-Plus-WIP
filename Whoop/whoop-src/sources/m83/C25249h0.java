package m83;

import d93.InterfaceC11820a;
import java.util.ListIterator;
import p668z1.AbstractC39968q;
import p668z1.C39952c0;
import p715kotlin.jvm.internal.C22665e0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m83.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25249h0 implements ListIterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99125w = 2;

    /* JADX INFO: renamed from: x */
    public final Object f99126x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f99127y;

    public C25249h0(C25253j0 c25253j0, int i13) {
        this.f99127y = c25253j0;
        this.f99126x = c25253j0.f99129w.listIterator(AbstractC25265s.m74137n0(i13, c25253j0));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f99125w) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f99126x;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f99125w) {
            case 0:
                return ((ListIterator) this.f99126x).hasPrevious();
            case 1:
                return ((ListIterator) this.f99126x).hasPrevious();
            default:
                return ((C22665e0) this.f99126x).f89334w < ((C39952c0) this.f99127y).f172426z - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f99125w) {
            case 0:
                return ((ListIterator) this.f99126x).hasNext();
            case 1:
                return ((ListIterator) this.f99126x).hasNext();
            default:
                return ((C22665e0) this.f99126x).f89334w >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f99125w) {
            case 0:
                return ((ListIterator) this.f99126x).previous();
            case 1:
                return ((ListIterator) this.f99126x).previous();
            default:
                C22665e0 c22665e0 = (C22665e0) this.f99126x;
                int i13 = c22665e0.f89334w + 1;
                C39952c0 c39952c0 = (C39952c0) this.f99127y;
                AbstractC39968q.m128187a(i13, c39952c0.f172426z);
                c22665e0.f89334w = i13;
                return c39952c0.get(i13);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f99125w) {
            case 0:
                C25251i0 c25251i0 = (C25251i0) this.f99127y;
                return AbstractC37056f.m118951C(c25251i0) - ((ListIterator) this.f99126x).previousIndex();
            case 1:
                C25253j0 c25253j0 = (C25253j0) this.f99127y;
                return AbstractC37056f.m118951C(c25253j0) - ((ListIterator) this.f99126x).previousIndex();
            default:
                return ((C22665e0) this.f99126x).f89334w + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f99125w) {
            case 0:
                return ((ListIterator) this.f99126x).next();
            case 1:
                return ((ListIterator) this.f99126x).next();
            default:
                C22665e0 c22665e0 = (C22665e0) this.f99126x;
                int i13 = c22665e0.f89334w;
                C39952c0 c39952c0 = (C39952c0) this.f99127y;
                AbstractC39968q.m128187a(i13, c39952c0.f172426z);
                c22665e0.f89334w = i13 - 1;
                return c39952c0.get(i13);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f99125w) {
            case 0:
                C25251i0 c25251i0 = (C25251i0) this.f99127y;
                return AbstractC37056f.m118951C(c25251i0) - ((ListIterator) this.f99126x).nextIndex();
            case 1:
                C25253j0 c25253j0 = (C25253j0) this.f99127y;
                return AbstractC37056f.m118951C(c25253j0) - ((ListIterator) this.f99126x).nextIndex();
            default:
                return ((C22665e0) this.f99126x).f89334w;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f99125w) {
            case 0:
                ((ListIterator) this.f99126x).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f99125w) {
            case 0:
                ((ListIterator) this.f99126x).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C25249h0(C25251i0 c25251i0, int i13) {
        this.f99127y = c25251i0;
        this.f99126x = c25251i0.f99128w.listIterator(AbstractC25265s.m74137n0(i13, c25251i0));
    }

    public C25249h0(C22665e0 c22665e0, C39952c0 c39952c0) {
        this.f99126x = c22665e0;
        this.f99127y = c39952c0;
    }
}

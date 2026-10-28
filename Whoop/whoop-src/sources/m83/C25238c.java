package m83;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p002a0.C0030i1;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: m83.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C25238c extends C0030i1 implements ListIterator {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC25242e f99116z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25238c(AbstractC25242e abstractC25242e, int i13) {
        super(abstractC25242e, 2);
        this.f99116z = abstractC25242e;
        int iMo73980a = abstractC25242e.mo73980a();
        if (i13 < 0 || i13 > iMo73980a) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, iMo73980a, "index: ", ", size: "));
        }
        this.f81x = i13;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f81x > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f81x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f81x - 1;
        this.f81x = i13;
        return this.f99116z.get(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f81x - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

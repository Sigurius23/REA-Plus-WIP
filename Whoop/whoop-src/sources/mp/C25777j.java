package mp;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: mp.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C25777j extends AbstractC25763e0 implements ListIterator {

    /* JADX INFO: renamed from: w */
    public final int f101491w;

    /* JADX INFO: renamed from: x */
    public int f101492x;

    /* JADX INFO: renamed from: y */
    public final AbstractC25788n f101493y;

    public C25777j(AbstractC25788n abstractC25788n, int i13) {
        int size = abstractC25788n.size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(AbstractC25753b.m76002n(i13, size, "index"));
        }
        this.f101491w = size;
        this.f101492x = i13;
        this.f101493y = abstractC25788n;
    }

    /* JADX INFO: renamed from: a */
    public final Object m76020a(int i13) {
        return this.f101493y.get(i13);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f101492x < this.f101491w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f101492x > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f101492x;
        this.f101492x = i13 + 1;
        return m76020a(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f101492x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f101492x - 1;
        this.f101492x = i13;
        return m76020a(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f101492x - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

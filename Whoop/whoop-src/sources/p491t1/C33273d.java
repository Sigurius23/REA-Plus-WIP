package p491t1;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: t1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C33273d extends AbstractC33270a {

    /* JADX INFO: renamed from: y */
    public final Object[] f138726y;

    public C33273d(int i13, int i14, Object[] objArr) {
        super(i13, i14);
        this.f138726y = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f138722w;
        this.f138722w = i13 + 1;
        return this.f138726y[i13];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f138722w - 1;
        this.f138722w = i13;
        return this.f138726y[i13];
    }
}

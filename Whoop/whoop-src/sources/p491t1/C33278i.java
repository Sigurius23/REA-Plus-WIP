package p491t1;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: t1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C33278i extends AbstractC33270a {

    /* JADX INFO: renamed from: y */
    public final Object f138745y;

    public C33278i(Object obj, int i13) {
        super(i13, 1);
        this.f138745y = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f138722w++;
        return this.f138745y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f138722w--;
        return this.f138745y;
    }
}

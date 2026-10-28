package p491t1;

import d93.InterfaceC11820a;
import java.util.ListIterator;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33270a implements ListIterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public int f138722w;

    /* JADX INFO: renamed from: x */
    public int f138723x;

    public AbstractC33270a(int i13, int i14) {
        this.f138722w = i13;
        this.f138723x = i14;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f138722w < this.f138723x;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f138722w > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f138722w;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f138722w - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

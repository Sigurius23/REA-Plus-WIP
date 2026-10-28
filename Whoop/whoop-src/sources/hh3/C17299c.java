package hh3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: hh3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17299c extends AtomicReferenceArray implements Queue {

    /* JADX INFO: renamed from: w */
    public final int f66481w;

    /* JADX INFO: renamed from: x */
    public final int f66482x;

    /* JADX INFO: renamed from: y */
    public final AtomicLong f66483y;

    /* JADX INFO: renamed from: z */
    public final AtomicLong f66484z;

    public C17299c(int i13) {
        super(AbstractC12350b.m34564M(i13));
        int length = length();
        this.f66481w = length - 1;
        this.f66482x = length - i13;
        this.f66483y = new AtomicLong();
        this.f66484z = new AtomicLong();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f66483y == this.f66484z;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        AtomicLong atomicLong = this.f66483y;
        long j7 = atomicLong.get();
        int i13 = (int) (((long) this.f66482x) + j7);
        int i14 = this.f66481w;
        if (get(i13 & i14) != null) {
            return false;
        }
        atomicLong.lazySet(j7 + 1);
        lazySet(((int) j7) & i14, obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return get(((int) this.f66484z.get()) & this.f66481w);
    }

    @Override // java.util.Queue
    public final Object poll() {
        AtomicLong atomicLong = this.f66484z;
        long j7 = atomicLong.get();
        int i13 = ((int) j7) & this.f66481w;
        Object obj = get(i13);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j7 + 1);
        lazySet(i13, null);
        return obj;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        AtomicLong atomicLong = this.f66484z;
        long j7 = atomicLong.get();
        while (true) {
            long j13 = this.f66483y.get();
            long j14 = atomicLong.get();
            if (j7 == j14) {
                return (int) (j13 - j14);
            }
            j7 = j14;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}

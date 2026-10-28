package hh3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: hh3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17301e implements Queue {

    /* JADX INFO: renamed from: I */
    public static final int f66495I = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: J */
    public static final Object f66496J = new Object();

    /* JADX INFO: renamed from: E */
    public AtomicReferenceArray f66497E;

    /* JADX INFO: renamed from: F */
    public final int f66498F;

    /* JADX INFO: renamed from: G */
    public AtomicReferenceArray f66499G;

    /* JADX INFO: renamed from: H */
    public final AtomicLong f66500H;

    /* JADX INFO: renamed from: w */
    public final AtomicLong f66501w;

    /* JADX INFO: renamed from: x */
    public final int f66502x;

    /* JADX INFO: renamed from: y */
    public long f66503y;

    /* JADX INFO: renamed from: z */
    public final int f66504z;

    public C17301e(int i13) {
        int iM34564M = AbstractC12350b.m34564M(Math.max(8, i13));
        int i14 = iM34564M - 1;
        AtomicLong atomicLong = new AtomicLong();
        this.f66501w = atomicLong;
        this.f66500H = new AtomicLong();
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iM34564M + 1);
        this.f66497E = atomicReferenceArray;
        this.f66504z = i14;
        this.f66502x = Math.min(iM34564M / 4, f66495I);
        this.f66499G = atomicReferenceArray;
        this.f66498F = i14;
        this.f66503y = iM34564M - 2;
        atomicLong.lazySet(0L);
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
        return this.f66501w.get() == this.f66500H.get();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        AtomicReferenceArray atomicReferenceArray = this.f66497E;
        AtomicLong atomicLong = this.f66501w;
        long j7 = atomicLong.get();
        int i13 = this.f66504z;
        int i14 = ((int) j7) & i13;
        if (j7 < this.f66503y) {
            atomicLong.lazySet(j7 + 1);
            atomicReferenceArray.lazySet(i14, obj);
            return true;
        }
        long j13 = ((long) this.f66502x) + j7;
        if (atomicReferenceArray.get(((int) j13) & i13) == null) {
            this.f66503y = j13 - 1;
            atomicLong.lazySet(j7 + 1);
            atomicReferenceArray.lazySet(i14, obj);
            return true;
        }
        long j14 = j7 + 1;
        if (atomicReferenceArray.get(((int) j14) & i13) != null) {
            atomicLong.lazySet(j14);
            atomicReferenceArray.lazySet(i14, obj);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f66497E = atomicReferenceArray2;
        this.f66503y = (j7 + ((long) i13)) - 1;
        atomicLong.lazySet(j14);
        atomicReferenceArray2.lazySet(i14, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i14, f66496J);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        AtomicReferenceArray atomicReferenceArray = this.f66499G;
        int i13 = ((int) this.f66500H.get()) & this.f66498F;
        Object obj = atomicReferenceArray.get(i13);
        if (obj != f66496J) {
            return obj;
        }
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.f66499G = atomicReferenceArray2;
        return atomicReferenceArray2.get(i13);
    }

    @Override // java.util.Queue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f66499G;
        AtomicLong atomicLong = this.f66500H;
        long j7 = atomicLong.get();
        int i13 = this.f66498F & ((int) j7);
        Object obj = atomicReferenceArray.get(i13);
        boolean z4 = obj == f66496J;
        if (obj != null && !z4) {
            atomicLong.lazySet(j7 + 1);
            atomicReferenceArray.lazySet(i13, null);
            return obj;
        }
        if (z4) {
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
            this.f66499G = atomicReferenceArray2;
            Object obj2 = atomicReferenceArray2.get(i13);
            if (obj2 != null) {
                atomicLong.lazySet(j7 + 1);
                atomicReferenceArray2.lazySet(i13, null);
                return obj2;
            }
        }
        return null;
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
        AtomicLong atomicLong = this.f66500H;
        long j7 = atomicLong.get();
        while (true) {
            long j13 = this.f66501w.get();
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

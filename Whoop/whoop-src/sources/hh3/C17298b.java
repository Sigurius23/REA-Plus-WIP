package hh3;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: hh3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17298b extends AbstractC17297a {

    /* JADX INFO: renamed from: G */
    public static final Integer f66476G = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: E */
    public final AtomicLong f66477E;

    /* JADX INFO: renamed from: F */
    public final int f66478F;

    /* JADX INFO: renamed from: y */
    public final AtomicLong f66479y;

    /* JADX INFO: renamed from: z */
    public long f66480z;

    public C17298b(int i13) {
        super(i13);
        this.f66479y = new AtomicLong();
        this.f66477E = new AtomicLong();
        this.f66478F = Math.min(i13 / 4, f66476G.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f66479y.get() == this.f66477E.get();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f66479y;
        long j7 = atomicLong.get();
        int i13 = this.f66475x;
        int i14 = ((int) j7) & i13;
        long j13 = this.f66480z;
        AtomicReferenceArray atomicReferenceArray = this.f66474w;
        if (j7 >= j13) {
            long j14 = ((long) this.f66478F) + j7;
            if (atomicReferenceArray.get(i13 & ((int) j14)) == null) {
                this.f66480z = j14;
            } else if (atomicReferenceArray.get(i14) != null) {
                return false;
            }
        }
        atomicReferenceArray.lazySet(i14, obj);
        atomicLong.lazySet(j7 + 1);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f66474w.get(((int) this.f66477E.get()) & this.f66475x);
    }

    @Override // java.util.Queue
    public final Object poll() {
        AtomicLong atomicLong = this.f66477E;
        long j7 = atomicLong.get();
        int i13 = ((int) j7) & this.f66475x;
        AtomicReferenceArray atomicReferenceArray = this.f66474w;
        Object obj = atomicReferenceArray.get(i13);
        if (obj == null) {
            return null;
        }
        atomicReferenceArray.lazySet(i13, null);
        atomicLong.lazySet(j7 + 1);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        AtomicLong atomicLong = this.f66477E;
        long j7 = atomicLong.get();
        while (true) {
            long j13 = this.f66479y.get();
            long j14 = atomicLong.get();
            if (j7 == j14) {
                return (int) (j13 - j14);
            }
            j7 = j14;
        }
    }
}

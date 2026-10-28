package x73;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s73.InterfaceC32246d;

/* JADX INFO: renamed from: x73.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C38045b implements InterfaceC32246d {

    /* JADX INFO: renamed from: I */
    public static final int f162965I = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: J */
    public static final Object f162966J = new Object();

    /* JADX INFO: renamed from: E */
    public AtomicReferenceArray f162967E;

    /* JADX INFO: renamed from: F */
    public final int f162968F;

    /* JADX INFO: renamed from: G */
    public AtomicReferenceArray f162969G;

    /* JADX INFO: renamed from: H */
    public final AtomicLong f162970H;

    /* JADX INFO: renamed from: w */
    public final AtomicLong f162971w;

    /* JADX INFO: renamed from: x */
    public final int f162972x;

    /* JADX INFO: renamed from: y */
    public long f162973y;

    /* JADX INFO: renamed from: z */
    public final int f162974z;

    public C38045b(int i13) {
        AtomicLong atomicLong = new AtomicLong();
        this.f162971w = atomicLong;
        this.f162970H = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i13) - 1));
        int i14 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f162967E = atomicReferenceArray;
        this.f162974z = i14;
        this.f162972x = Math.min(iNumberOfLeadingZeros / 4, f162965I);
        this.f162969G = atomicReferenceArray;
        this.f162968F = i14;
        this.f162973y = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // s73.InterfaceC32247e
    public final boolean isEmpty() {
        return this.f162971w.get() == this.f162970H.get();
    }

    @Override // s73.InterfaceC32247e
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f162967E;
        AtomicLong atomicLong = this.f162971w;
        long j7 = atomicLong.get();
        int i13 = this.f162974z;
        int i14 = ((int) j7) & i13;
        if (j7 < this.f162973y) {
            atomicReferenceArray.lazySet(i14, obj);
            atomicLong.lazySet(j7 + 1);
            return true;
        }
        long j13 = ((long) this.f162972x) + j7;
        if (atomicReferenceArray.get(((int) j13) & i13) == null) {
            this.f162973y = j13 - 1;
            atomicReferenceArray.lazySet(i14, obj);
            atomicLong.lazySet(j7 + 1);
            return true;
        }
        long j14 = j7 + 1;
        if (atomicReferenceArray.get(((int) j14) & i13) == null) {
            atomicReferenceArray.lazySet(i14, obj);
            atomicLong.lazySet(j14);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f162967E = atomicReferenceArray2;
        this.f162973y = (j7 + ((long) i13)) - 1;
        atomicReferenceArray2.lazySet(i14, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i14, f162966J);
        atomicLong.lazySet(j14);
        return true;
    }

    @Override // s73.InterfaceC32247e
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f162969G;
        AtomicLong atomicLong = this.f162970H;
        long j7 = atomicLong.get();
        int i13 = this.f162968F;
        int i14 = ((int) j7) & i13;
        Object obj = atomicReferenceArray.get(i14);
        boolean z4 = obj == f162966J;
        if (obj != null && !z4) {
            atomicReferenceArray.lazySet(i14, null);
            atomicLong.lazySet(j7 + 1);
            return obj;
        }
        if (!z4) {
            return null;
        }
        int i15 = i13 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i15);
        atomicReferenceArray.lazySet(i15, null);
        this.f162969G = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i14);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i14, null);
            atomicLong.lazySet(j7 + 1);
        }
        return obj2;
    }
}

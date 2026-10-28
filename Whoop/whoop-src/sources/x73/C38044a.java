package x73;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s73.InterfaceC32246d;

/* JADX INFO: renamed from: x73.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C38044a extends AtomicReferenceArray implements InterfaceC32246d {

    /* JADX INFO: renamed from: F */
    public static final Integer f162959F = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: E */
    public final int f162960E;

    /* JADX INFO: renamed from: w */
    public final int f162961w;

    /* JADX INFO: renamed from: x */
    public final AtomicLong f162962x;

    /* JADX INFO: renamed from: y */
    public long f162963y;

    /* JADX INFO: renamed from: z */
    public final AtomicLong f162964z;

    public C38044a(int i13) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i13 - 1)));
        this.f162961w = length() - 1;
        this.f162962x = new AtomicLong();
        this.f162964z = new AtomicLong();
        this.f162960E = Math.min(i13 / 4, f162959F.intValue());
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
        return this.f162962x.get() == this.f162964z.get();
    }

    @Override // s73.InterfaceC32247e
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f162962x;
        long j7 = atomicLong.get();
        int i13 = this.f162961w;
        int i14 = ((int) j7) & i13;
        if (j7 >= this.f162963y) {
            long j13 = ((long) this.f162960E) + j7;
            if (get(i13 & ((int) j13)) == null) {
                this.f162963y = j13;
            } else if (get(i14) != null) {
                return false;
            }
        }
        lazySet(i14, obj);
        atomicLong.lazySet(j7 + 1);
        return true;
    }

    @Override // s73.InterfaceC32247e
    public final Object poll() {
        AtomicLong atomicLong = this.f162964z;
        long j7 = atomicLong.get();
        int i13 = ((int) j7) & this.f162961w;
        Object obj = get(i13);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j7 + 1);
        lazySet(i13, null);
        return obj;
    }
}

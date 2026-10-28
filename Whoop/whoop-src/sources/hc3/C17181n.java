package hc3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: hc3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C17181n {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65992e = AtomicReferenceFieldUpdater.newUpdater(C17181n.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f65993f = AtomicLongFieldUpdater.newUpdater(C17181n.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C17191x f65994g = new C17191x("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f65995a;

    /* JADX INFO: renamed from: b */
    public final boolean f65996b;

    /* JADX INFO: renamed from: c */
    public final int f65997c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f65998d;

    public C17181n(int i13, boolean z4) {
        this.f65995a = i13;
        this.f65996b = z4;
        int i14 = i13 - 1;
        this.f65997c = i14;
        this.f65998d = new AtomicReferenceArray(i13);
        if (i14 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i13 & i14) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m48532a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f65993f;
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return (2305843009213693952L & j7) != 0 ? 2 : 1;
            }
            int i13 = (int) (1073741823 & j7);
            int i14 = (int) ((1152921503533105152L & j7) >> 30);
            int i15 = this.f65997c;
            if (((i14 + 2) & i15) == (i13 & i15)) {
                return 1;
            }
            boolean z4 = this.f65996b;
            AtomicReferenceArray atomicReferenceArray = this.f65998d;
            if (z4 || atomicReferenceArray.get(i14 & i15) == null) {
                if (f65993f.compareAndSet(this, j7, ((-1152921503533105153L) & j7) | (((long) ((i14 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i14 & i15, obj);
                    C17181n c17181nM48534c = this;
                    while ((atomicLongFieldUpdater.get(c17181nM48534c) & 1152921504606846976L) != 0) {
                        c17181nM48534c = c17181nM48534c.m48534c();
                        AtomicReferenceArray atomicReferenceArray2 = c17181nM48534c.f65998d;
                        int i16 = c17181nM48534c.f65997c & i14;
                        Object obj2 = atomicReferenceArray2.get(i16);
                        if ((obj2 instanceof C17180m) && ((C17180m) obj2).f65991a == i14) {
                            atomicReferenceArray2.set(i16, obj);
                        } else {
                            c17181nM48534c = null;
                        }
                        if (c17181nM48534c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i17 = this.f65995a;
                if (i17 < 1024 || ((i14 - i13) & 1073741823) > (i17 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m48533b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        do {
            atomicLongFieldUpdater = f65993f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, 2305843009213693952L | j7));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C17181n m48534c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        C17181n c17181n;
        while (true) {
            atomicLongFieldUpdater = f65993f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                c17181n = this;
                break;
            }
            long j13 = 1152921504606846976L | j7;
            c17181n = this;
            if (atomicLongFieldUpdater.compareAndSet(c17181n, j7, j13)) {
                j7 = j13;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65992e;
            C17181n c17181n2 = (C17181n) atomicReferenceFieldUpdater.get(this);
            if (c17181n2 != null) {
                return c17181n2;
            }
            C17181n c17181n3 = new C17181n(c17181n.f65995a * 2, c17181n.f65996b);
            int i13 = (int) (1073741823 & j7);
            int i14 = (int) ((1152921503533105152L & j7) >> 30);
            while (true) {
                int i15 = c17181n.f65997c;
                int i16 = i13 & i15;
                if (i16 != (i15 & i14)) {
                    Object c17180m = c17181n.f65998d.get(i16);
                    if (c17180m == null) {
                        c17180m = new C17180m(i13);
                    }
                    c17181n3.f65998d.set(c17181n3.f65997c & i13, c17180m);
                    i13++;
                }
            }
            atomicLongFieldUpdater.set(c17181n3, (-1152921504606846977L) & j7);
            AbstractC17176i.m48515q(atomicReferenceFieldUpdater, this, c17181n3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m48535d() {
        C17181n c17181nM48534c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f65993f;
            long j7 = atomicLongFieldUpdater.get(c17181nM48534c);
            if ((j7 & 1152921504606846976L) != 0) {
                return f65994g;
            }
            int i13 = (int) (j7 & 1073741823);
            int i14 = c17181nM48534c.f65997c;
            int i15 = i13 & i14;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i14) != i15) {
                AtomicReferenceArray atomicReferenceArray = c17181nM48534c.f65998d;
                Object obj = atomicReferenceArray.get(i15);
                boolean z4 = c17181nM48534c.f65996b;
                if (obj == null) {
                    if (z4) {
                    }
                } else if (!(obj instanceof C17180m)) {
                    long j13 = (i13 + 1) & 1073741823;
                    if (f65993f.compareAndSet(c17181nM48534c, j7, (j7 & (-1073741824)) | j13)) {
                        atomicReferenceArray.set(i15, null);
                        return obj;
                    }
                    c17181nM48534c = this;
                    if (z4) {
                        while (true) {
                            long j14 = atomicLongFieldUpdater.get(c17181nM48534c);
                            int i16 = (int) (j14 & 1073741823);
                            if ((j14 & 1152921504606846976L) != 0) {
                                c17181nM48534c = c17181nM48534c.m48534c();
                            } else {
                                C17181n c17181n = c17181nM48534c;
                                if (f65993f.compareAndSet(c17181n, j14, (j14 & (-1073741824)) | j13)) {
                                    c17181n.f65998d.set(i16 & c17181n.f65997c, null);
                                    c17181nM48534c = null;
                                } else {
                                    c17181nM48534c = c17181n;
                                }
                            }
                            if (c17181nM48534c == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}

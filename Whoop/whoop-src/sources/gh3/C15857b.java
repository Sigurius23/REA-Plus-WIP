package gh3;

import ch3.AbstractC4677d;
import ch3.C4692k0;
import java.util.concurrent.atomic.AtomicLong;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: gh3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C15857b extends AtomicLong implements InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public boolean f59950w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f59951x;

    /* JADX INFO: renamed from: y */
    public Throwable f59952y;

    /* JADX INFO: renamed from: z */
    public final C4692k0 f59953z;

    public C15857b(C4692k0 c4692k0) {
        this.f59953z = c4692k0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x009d A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x003e, blocks: (B:18:0x0022, B:76:0x009d), top: B:104:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[LOOP:1: B:14:0x0018->B:79:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m44772a() {
        Object objPoll;
        AtomicLong atomicLong;
        synchronized (this) {
            try {
                if (this.f59950w) {
                    return;
                }
                boolean z4 = true;
                this.f59950w = true;
                boolean z13 = this.f59951x;
                long j7 = get();
                try {
                    C4692k0 c4692k0 = this.f59953z;
                    while (true) {
                        int i13 = 0;
                        while (true) {
                            try {
                                if (j7 <= 0 && !z13) {
                                    break;
                                }
                                if (!z13) {
                                    objPoll = c4692k0.f19217E.poll();
                                    atomicLong = c4692k0.f19218F;
                                    if (atomicLong != null) {
                                        atomicLong.incrementAndGet();
                                    }
                                    if (objPoll != null) {
                                        break;
                                    }
                                    if (AbstractC4677d.m14744a(c4692k0.f19219G, objPoll)) {
                                        return;
                                    }
                                    j7--;
                                    i13++;
                                } else {
                                    try {
                                        if (c4692k0.f19217E.peek() != null) {
                                            if (j7 == 0) {
                                                break;
                                            }
                                            try {
                                                objPoll = c4692k0.f19217E.poll();
                                                atomicLong = c4692k0.f19218F;
                                                if (atomicLong != null && objPoll != null) {
                                                    atomicLong.incrementAndGet();
                                                }
                                                if (objPoll != null) {
                                                    break;
                                                }
                                                if (AbstractC4677d.m14744a(c4692k0.f19219G, objPoll)) {
                                                    return;
                                                }
                                                j7--;
                                                i13++;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                th = th;
                                                z4 = false;
                                                if (!z4) {
                                                    synchronized (this) {
                                                        this.f59950w = false;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            Throwable th4 = this.f59952y;
                                            AbstractC38292s abstractC38292s = c4692k0.f19219G;
                                            if (th4 != null) {
                                                abstractC38292s.onError(th4);
                                                return;
                                            } else {
                                                abstractC38292s.onCompleted();
                                                return;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        z4 = false;
                                        if (!z4) {
                                            synchronized (this) {
                                                this.f59950w = false;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                if (!z4) {
                                    synchronized (this) {
                                        this.f59950w = false;
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            synchronized (this) {
                                z13 = this.f59951x;
                                try {
                                    boolean z14 = c4692k0.f19217E.peek() != null;
                                    if (get() != Long.MAX_VALUE) {
                                        long jAddAndGet = addAndGet(-i13);
                                        if ((jAddAndGet != 0 && z14) || (z13 && !z14)) {
                                            j7 = jAddAndGet;
                                        }
                                        this.f59950w = false;
                                        return;
                                    }
                                    if (!z14 && !z13) {
                                        this.f59950w = false;
                                        return;
                                    }
                                    j7 = Long.MAX_VALUE;
                                } catch (Throwable th7) {
                                    th = th7;
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m44773b(Throwable th3) {
        if (this.f59951x) {
            return;
        }
        this.f59952y = th3;
        this.f59951x = true;
        m44772a();
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        boolean z4;
        long j13;
        if (j7 == 0) {
            return;
        }
        while (true) {
            long j14 = get();
            boolean z13 = true;
            z4 = j14 == 0;
            if (j14 == Long.MAX_VALUE) {
                break;
            }
            if (j7 == Long.MAX_VALUE) {
                j13 = j7;
            } else {
                j13 = j14 <= Long.MAX_VALUE - j7 ? j14 + j7 : Long.MAX_VALUE;
                z13 = z4;
            }
            if (compareAndSet(j14, j13)) {
                z4 = z13;
                break;
            }
        }
        if (z4) {
            m44772a();
        }
    }
}

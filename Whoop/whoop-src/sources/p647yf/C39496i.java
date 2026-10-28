package p647yf;

import bc3.InterfaceC3061u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p133f1.C13990x;
import p505ts.AbstractC34132o;
import p679zf.C40602c;
import p679zf.C40603d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: yf.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C39496i implements InterfaceC39501n {

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f169902I = AtomicIntegerFieldUpdater.newUpdater(C39496i.class, "z");

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f169903J;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ AtomicLongFieldUpdater f169904K;

    /* JADX INFO: renamed from: H */
    public final C40602c f169908H;

    /* JADX INFO: renamed from: y */
    public final C40603d f169911y;

    /* JADX INFO: renamed from: w */
    public final Object f169909w = new Object();

    /* JADX INFO: renamed from: x */
    public final C39498k f169910x = new C39498k();

    /* JADX INFO: renamed from: z */
    public volatile /* synthetic */ int f169912z = 0;

    /* JADX INFO: renamed from: E */
    public volatile /* synthetic */ int f169905E = 0;

    /* JADX INFO: renamed from: F */
    public volatile /* synthetic */ Object f169906F = null;

    /* JADX INFO: renamed from: G */
    public volatile /* synthetic */ long f169907G = 0;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C39496i.class, "E");
        f169903J = AtomicReferenceFieldUpdater.newUpdater(C39496i.class, Object.class, "F");
        f169904K = AtomicLongFieldUpdater.newUpdater(C39496i.class, "G");
    }

    public C39496i(int i13) {
        this.f169911y = new C40603d(i13);
        C40602c c40602c = new C40602c();
        c40602c.f174959a = null;
        this.f169908H = c40602c;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:37:0x007d, B:39:0x0083, B:41:0x0089, B:45:0x0098), top: B:74:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0089 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:37:0x007d, B:39:0x0083, B:41:0x0089, B:45:0x0098), top: B:74:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[Catch: all -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:37:0x007d, B:39:0x0083, B:41:0x0089, B:45:0x0098), top: B:74:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p647yf.InterfaceC39502o
    /* JADX INFO: renamed from: b */
    public final Object mo106283b(C39498k c39498k, long j7, AbstractC32269c abstractC32269c) throws Throwable {
        C39495h c39495h;
        C39496i c39496i;
        long j13;
        C39496i c39496i2;
        C39498k c39498k2;
        Throwable thM126152k;
        if (abstractC32269c instanceof C39495h) {
            c39495h = (C39495h) abstractC32269c;
            int i13 = c39495h.f169897F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39495h.f169897F = i13 - Integer.MIN_VALUE;
            } else {
                c39495h = new C39495h(this, abstractC32269c);
            }
        } else {
            c39495h = new C39495h(this, abstractC32269c);
        }
        Object obj = c39495h.f169901z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39495h.f169897F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (j7 < 0) {
                throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "Read limit must be >= 0, was ").toString());
            }
            Throwable thM126152k2 = m126152k();
            if (thM126152k2 != null) {
                throw thM126152k2;
            }
            if (mo106286h()) {
                return new Long(-1L);
            }
            if (j7 == 0) {
                return new Long(0L);
            }
            try {
                if (!f169902I.compareAndSet(this, 0, 1)) {
                    throw new IllegalStateException("Read operation already in progress");
                }
                try {
                    if (this.f169911y.f174964b == 0) {
                        c39495h.f169898w = c39498k;
                        c39495h.f169899x = this;
                        c39495h.f169900y = j7;
                        c39495h.f169897F = 1;
                        if (m126151i(1, c39495h) == enumC31071a) {
                            return enumC31071a;
                        }
                        c39498k2 = c39498k;
                        c39496i = this;
                        thM126152k = m126152k();
                        if (thM126152k == null) {
                            throw thM126152k;
                        }
                        if (mo106286h()) {
                            Long l7 = new Long(-1L);
                            f169902I.compareAndSet(c39496i, 1, 0);
                            return l7;
                        }
                        j13 = j7;
                        c39496i2 = c39496i;
                        c39498k = c39498k2;
                    } else {
                        j13 = j7;
                        c39496i2 = this;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c39496i = this;
                    f169902I.compareAndSet(c39496i, 1, 0);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c39495h.f169900y;
            c39496i = c39495h.f169899x;
            c39498k2 = c39495h.f169898w;
            try {
                AbstractC34132o.m107864I(obj);
                thM126152k = m126152k();
                if (thM126152k == null) {
                    throw thM126152k;
                }
                if (mo106286h()) {
                    Long l12 = new Long(-1L);
                    f169902I.compareAndSet(c39496i, 1, 0);
                    return l12;
                }
                j13 = j7;
                c39496i2 = c39496i;
                c39498k = c39498k2;
            } catch (Throwable th5) {
                th = th5;
                f169902I.compareAndSet(c39496i, 1, 0);
                throw th;
            }
        }
        try {
            long jMin = Math.min(this.f169911y.f174964b, j13);
            synchronized (this.f169909w) {
                c39498k.mo126145Y(this.f169910x, jMin);
            }
            if (jMin >= 0) {
                int i15 = (int) jMin;
                C40603d c40603d = c39496i2.f169911y;
                c40603d.getClass();
                C40603d.f174960e.getAndAdd(c40603d, -i15);
                C40603d.f174961f.getAndAdd(c40603d, i15);
                c39496i2.f169908H.m131679a();
            }
            f169902I.compareAndSet(c39496i2, 1, 0);
            return new Long(jMin);
        } catch (Throwable th6) {
            C39496i c39496i3 = c39496i2;
            th = th6;
            c39496i = c39496i3;
            f169902I.compareAndSet(c39496i, 1, 0);
            throw th;
        }
    }

    @Override // p647yf.InterfaceC39502o
    public final boolean cancel() {
        if (m126153m()) {
            return false;
        }
        return mo126154r(new CancellationException("Channel cancelled"));
    }

    @Override // p647yf.InterfaceC39502o
    /* JADX INFO: renamed from: h */
    public final boolean mo106286h() {
        if (m126152k() == null) {
            return m126153m() && this.f169911y.f174964b == 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m126151i(int i13, AbstractC32269c abstractC32269c) {
        C39494g c39494g;
        if (abstractC32269c instanceof C39494g) {
            c39494g = (C39494g) abstractC32269c;
            int i14 = c39494g.f169895z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39494g.f169895z = i14 - Integer.MIN_VALUE;
            } else {
                c39494g = new C39494g(this, abstractC32269c);
            }
        } else {
            c39494g = new C39494g(this, abstractC32269c);
        }
        Object obj = c39494g.f169893x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c39494g.f169895z;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c39494g.f169892w;
        }
        AbstractC34132o.m107864I(obj);
        while (this.f169911y.f174964b < i13 && !mo106286h()) {
            C40602c c40602c = this.f169908H;
            C13990x c13990x = new C13990x(this, i13, 7);
            c39494g.f169892w = i13;
            c39494g.f169895z = 1;
            if (c40602c.m131680b(c13990x, c39494g) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public final Throwable m126152k() {
        C39491d c39491d = (C39491d) this.f169906F;
        if (c39491d != null) {
            return c39491d.f169888a;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m126153m() {
        return this.f169906F != null;
    }

    @Override // p647yf.InterfaceC39501n
    /* JADX INFO: renamed from: r */
    public final boolean mo126154r(Throwable th3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (m126153m()) {
            return false;
        }
        C39491d c39491d = th3 == null ? AbstractC39497j.f169913a : new C39491d(th3);
        do {
            atomicReferenceFieldUpdater = f169903J;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c39491d)) {
                if (th3 == null) {
                    m126155s();
                    return true;
                }
                C40602c c40602c = this.f169908H;
                c40602c.getClass();
                InterfaceC3061u interfaceC3061u = (InterfaceC3061u) C40602c.f174958b.getAndSet(c40602c, null);
                if (interfaceC3061u == null) {
                    return true;
                }
                interfaceC3061u.completeExceptionally(th3);
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m126155s() {
        if (this.f169911y.f174966d == 0) {
            this.f169908H.m131679a();
            return false;
        }
        C40603d c40603d = this.f169911y;
        c40603d.getClass();
        int andSet = C40603d.f174962g.getAndSet(c40603d, 0);
        if (andSet != 0) {
            C40603d.f174960e.addAndGet(c40603d, andSet);
        }
        this.f169908H.m131679a();
        return true;
    }
}

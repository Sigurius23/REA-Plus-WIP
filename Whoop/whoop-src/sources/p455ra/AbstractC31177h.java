package p455ra;

import java.util.ArrayDeque;
import mm.C25680d;
import p012ab.C0679g;
import p607x8.AbstractC38065t;
import qa.C30099d;
import qa.C30104i;
import qa.InterfaceC30101f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ra.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31177h implements InterfaceC30101f {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f128466a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f128467b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f128468c;

    /* JADX INFO: renamed from: d */
    public C31176g f128469d;

    /* JADX INFO: renamed from: e */
    public long f128470e;

    /* JADX INFO: renamed from: f */
    public long f128471f;

    /* JADX INFO: renamed from: g */
    public long f128472g;

    public AbstractC31177h() {
        for (int i13 = 0; i13 < 10; i13++) {
            this.f128466a.add(new C31176g(1));
        }
        this.f128467b = new ArrayDeque();
        for (int i14 = 0; i14 < 2; i14++) {
            ArrayDeque arrayDeque = this.f128467b;
            C25680d c25680d = new C25680d(this, 27);
            C30099d c30099d = new C30099d();
            c30099d.f122829H = c25680d;
            arrayDeque.add(c30099d);
        }
        this.f128468c = new ArrayDeque();
        this.f128472g = -9223372036854775807L;
    }

    @Override // qa.InterfaceC30101f
    /* JADX INFO: renamed from: a */
    public final void mo47995a(long j7) {
        this.f128470e = j7;
    }

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: c */
    public final Object mo1503c() {
        AbstractC35849g.m113807i(this.f128469d == null);
        ArrayDeque arrayDeque = this.f128466a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C31176g c31176g = (C31176g) arrayDeque.pollFirst();
        this.f128469d = c31176g;
        return c31176g;
    }

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: d */
    public final void mo1504d(long j7) {
        this.f128472g = j7;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: e */
    public final void mo1505e(C30104i c30104i) {
        AbstractC35849g.m113802d(c30104i == this.f128469d);
        C31176g c31176g = (C31176g) c30104i;
        if (c31176g.m1496f(4)) {
            long j7 = this.f128471f;
            this.f128471f = 1 + j7;
            c31176g.f128465K = j7;
            this.f128468c.add(c31176g);
        } else {
            long j13 = c31176g.f2065G;
            if (j13 != Long.MIN_VALUE) {
                long j14 = this.f128472g;
                if (j14 == -9223372036854775807L || j13 >= j14) {
                    long j15 = this.f128471f;
                    this.f128471f = 1 + j15;
                    c31176g.f128465K = j15;
                    this.f128468c.add(c31176g);
                } else {
                    c31176g.mo1506o();
                    this.f128466a.add(c31176g);
                }
            } else {
                long j16 = this.f128471f;
                this.f128471f = 1 + j16;
                c31176g.f128465K = j16;
                this.f128468c.add(c31176g);
            }
        }
        this.f128469d = null;
    }

    /* JADX INFO: renamed from: f */
    public abstract C0679g mo95892f();

    @Override // p010a9.InterfaceC0579d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f128471f = 0L;
        this.f128470e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f128468c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f128466a;
            if (zIsEmpty) {
                break;
            }
            C31176g c31176g = (C31176g) arrayDeque2.poll();
            int i13 = AbstractC38065t.f163031a;
            c31176g.mo1506o();
            arrayDeque.add(c31176g);
        }
        C31176g c31176g2 = this.f128469d;
        if (c31176g2 != null) {
            c31176g2.mo1506o();
            arrayDeque.add(c31176g2);
            this.f128469d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo95893g(C31176g c31176g);

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C30099d mo1502b() {
        ArrayDeque arrayDeque = this.f128467b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f128468c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C31176g c31176g = (C31176g) arrayDeque2.peek();
            int i13 = AbstractC38065t.f163031a;
            if (c31176g.f2065G > this.f128470e) {
                return null;
            }
            C31176g c31176g2 = (C31176g) arrayDeque2.poll();
            boolean zM1496f = c31176g2.m1496f(4);
            ArrayDeque arrayDeque3 = this.f128466a;
            if (zM1496f) {
                C30099d c30099d = (C30099d) arrayDeque.pollFirst();
                c30099d.m1495a(4);
                c31176g2.mo1506o();
                arrayDeque3.add(c31176g2);
                return c30099d;
            }
            mo95893g(c31176g2);
            if (mo95895i()) {
                C0679g c0679gMo95892f = mo95892f();
                C30099d c30099d2 = (C30099d) arrayDeque.pollFirst();
                long j7 = c31176g2.f2065G;
                c30099d2.f2070y = j7;
                c30099d2.f122826E = c0679gMo95892f;
                c30099d2.f122827F = j7;
                c31176g2.mo1506o();
                arrayDeque3.add(c31176g2);
                return c30099d2;
            }
            c31176g2.mo1506o();
            arrayDeque3.add(c31176g2);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo95895i();

    @Override // p010a9.InterfaceC0579d
    public void release() {
    }
}

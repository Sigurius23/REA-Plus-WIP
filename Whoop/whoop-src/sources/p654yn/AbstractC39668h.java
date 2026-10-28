package p654yn;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p012ab.C0679g;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31559p;
import p621xn.C38466c;
import p621xn.C38471h;
import p621xn.InterfaceC38469f;

/* JADX INFO: renamed from: yn.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39668h implements InterfaceC38469f {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f170711a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f170712b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue f170713c;

    /* JADX INFO: renamed from: d */
    public C39667g f170714d;

    /* JADX INFO: renamed from: e */
    public long f170715e;

    /* JADX INFO: renamed from: f */
    public long f170716f;

    public AbstractC39668h() {
        for (int i13 = 0; i13 < 10; i13++) {
            this.f170711a.add(new C39667g(1));
        }
        this.f170712b = new ArrayDeque();
        for (int i14 = 0; i14 < 2; i14++) {
            ArrayDeque arrayDeque = this.f170712b;
            C31559p c31559p = new C31559p(this, 22);
            C38466c c38466c = new C38466c();
            c38466c.f164744G = c31559p;
            arrayDeque.add(c38466c);
        }
        this.f170713c = new PriorityQueue();
    }

    @Override // p621xn.InterfaceC38469f
    /* JADX INFO: renamed from: a */
    public final void mo35859a(long j7) {
        this.f170715e = j7;
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: c */
    public final Object mo35861c() {
        AbstractC24543a.m71573i(this.f170714d == null);
        ArrayDeque arrayDeque = this.f170711a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C39667g c39667g = (C39667g) arrayDeque.pollFirst();
        this.f170714d = c39667g;
        return c39667g;
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: d */
    public final void mo35862d(C38471h c38471h) {
        AbstractC24543a.m71569e(c38471h == this.f170714d);
        C39667g c39667g = (C39667g) c38471h;
        if (c39667g.m1496f(Integer.MIN_VALUE)) {
            c39667g.mo49690o();
            this.f170711a.add(c39667g);
        } else {
            long j7 = this.f170716f;
            this.f170716f = 1 + j7;
            c39667g.f170710J = j7;
            this.f170713c.add(c39667g);
        }
        this.f170714d = null;
    }

    /* JADX INFO: renamed from: e */
    public abstract C0679g mo126798e();

    /* JADX INFO: renamed from: f */
    public abstract void mo126799f(C39667g c39667g);

    @Override // p527um.InterfaceC35072b
    public void flush() {
        ArrayDeque arrayDeque;
        this.f170716f = 0L;
        this.f170715e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f170713c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f170711a;
            if (zIsEmpty) {
                break;
            }
            C39667g c39667g = (C39667g) priorityQueue.poll();
            int i13 = AbstractC24567y.f95875a;
            c39667g.mo49690o();
            arrayDeque.add(c39667g);
        }
        C39667g c39667g2 = this.f170714d;
        if (c39667g2 != null) {
            c39667g2.mo49690o();
            arrayDeque.add(c39667g2);
            this.f170714d = null;
        }
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C38466c mo35860b() {
        ArrayDeque arrayDeque = this.f170712b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f170713c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            C39667g c39667g = (C39667g) priorityQueue.peek();
            int i13 = AbstractC24567y.f95875a;
            if (c39667g.f148797F > this.f170715e) {
                return null;
            }
            C39667g c39667g2 = (C39667g) priorityQueue.poll();
            boolean zM1496f = c39667g2.m1496f(4);
            ArrayDeque arrayDeque2 = this.f170711a;
            if (zM1496f) {
                C38466c c38466c = (C38466c) arrayDeque.pollFirst();
                c38466c.m1495a(4);
                c39667g2.mo49690o();
                arrayDeque2.add(c39667g2);
                return c38466c;
            }
            mo126799f(c39667g2);
            if (mo126801h()) {
                C0679g c0679gMo126798e = mo126798e();
                C38466c c38466c2 = (C38466c) arrayDeque.pollFirst();
                c38466c2.m123261p(c39667g2.f148797F, c0679gMo126798e, Long.MAX_VALUE);
                c39667g2.mo49690o();
                arrayDeque2.add(c39667g2);
                return c38466c2;
            }
            c39667g2.mo49690o();
            arrayDeque2.add(c39667g2);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo126801h();

    @Override // p527um.InterfaceC35072b
    public void release() {
    }
}

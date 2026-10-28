package ye3;

import af3.C0823a0;
import p012ab.C0690l0;
import p047c9.C4320k;
import pg3.C29205p;
import xe3.C38248k;
import ze3.AbstractC40599c;
import ze3.C40597a;

/* JADX INFO: renamed from: ye3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C39485e implements InterfaceC39487g {

    /* JADX INFO: renamed from: a */
    public static final C40597a f169874a;

    /* JADX INFO: renamed from: b */
    public static final C40597a f169875b;

    /* JADX INFO: renamed from: c */
    public static final C40597a f169876c;

    /* JADX INFO: renamed from: d */
    public static final C40597a f169877d;

    static {
        C40597a c40597aM131672a = C40597a.m131672a();
        c40597aM131672a.m131675d('0', '9');
        c40597aM131672a.m131675d('A', 'F');
        c40597aM131672a.m131675d('a', 'f');
        f169874a = new C40597a(c40597aM131672a);
        C40597a c40597aM131672a2 = C40597a.m131672a();
        c40597aM131672a2.m131675d('0', '9');
        f169875b = new C40597a(c40597aM131672a2);
        C40597a c40597aM131672a3 = C40597a.m131672a();
        c40597aM131672a3.m131675d('A', 'Z');
        c40597aM131672a3.m131675d('a', 'z');
        C40597a c40597a = new C40597a(c40597aM131672a3);
        f169876c = c40597a;
        C40597a c40597aM131674c = c40597a.m131674c();
        c40597aM131674c.m131675d('0', '9');
        f169877d = new C40597a(c40597aM131674c);
    }

    /* JADX INFO: renamed from: b */
    public static C29205p m126142b(C0690l0 c0690l0, C4320k c4320k) {
        return new C29205p(new C0823a0(AbstractC40599c.m131678a(c0690l0.m1734d(c4320k, c0690l0.m1743m()).m1644m())), c0690l0.m1743m(), false, 15);
    }

    @Override // ye3.InterfaceC39487g
    /* JADX INFO: renamed from: a */
    public final C29205p mo126141a(C38248k c38248k) {
        C0690l0 c0690l0 = c38248k.f163997e;
        C4320k c4320kM1743m = c0690l0.m1743m();
        c0690l0.m1739i();
        char cM1742l = c0690l0.m1742l();
        if (cM1742l != '#') {
            if (!f169876c.f174945a.get(cM1742l)) {
                return null;
            }
            c0690l0.m1736f(f169877d);
            if (c0690l0.m1740j(';')) {
                return m126142b(c0690l0, c4320kM1743m);
            }
            return null;
        }
        c0690l0.m1739i();
        if (c0690l0.m1740j('x') || c0690l0.m1740j('X')) {
            int iM1736f = c0690l0.m1736f(f169874a);
            if (1 > iM1736f || iM1736f > 6 || !c0690l0.m1740j(';')) {
                return null;
            }
            return m126142b(c0690l0, c4320kM1743m);
        }
        int iM1736f2 = c0690l0.m1736f(f169875b);
        if (1 > iM1736f2 || iM1736f2 > 7 || !c0690l0.m1740j(';')) {
            return null;
        }
        return m126142b(c0690l0, c4320kM1743m);
    }
}

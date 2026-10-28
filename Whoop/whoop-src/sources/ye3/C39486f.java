package ye3;

import af3.C0837m;
import p012ab.C0690l0;
import p047c9.C4320k;
import pg3.C29205p;
import ze3.C40597a;

/* JADX INFO: renamed from: ye3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C39486f implements InterfaceC39487g {

    /* JADX INFO: renamed from: a */
    public static final C40597a f169878a;

    /* JADX INFO: renamed from: b */
    public static final C40597a f169879b;

    /* JADX INFO: renamed from: c */
    public static final C40597a f169880c;

    /* JADX INFO: renamed from: d */
    public static final C40597a f169881d;

    /* JADX INFO: renamed from: e */
    public static final C40597a f169882e;

    /* JADX INFO: renamed from: f */
    public static final C40597a f169883f;

    static {
        C40597a c40597aM131672a = C40597a.m131672a();
        c40597aM131672a.m131675d('A', 'Z');
        c40597aM131672a.m131675d('a', 'z');
        C40597a c40597a = new C40597a(c40597aM131672a);
        f169878a = c40597a;
        f169879b = c40597a;
        C40597a c40597aM131674c = c40597a.m131674c();
        c40597aM131674c.m131675d('0', '9');
        c40597aM131674c.m131673b('-');
        f169880c = new C40597a(c40597aM131674c);
        C40597a c40597aM131674c2 = c40597a.m131674c();
        c40597aM131674c2.m131673b('_');
        c40597aM131674c2.m131673b(':');
        C40597a c40597a2 = new C40597a(c40597aM131674c2);
        f169881d = c40597a2;
        C40597a c40597aM131674c3 = c40597a2.m131674c();
        c40597aM131674c3.m131675d('0', '9');
        c40597aM131674c3.m131673b('.');
        c40597aM131674c3.m131673b('-');
        f169882e = new C40597a(c40597aM131674c3);
        C40597a c40597aM131672a2 = C40597a.m131672a();
        c40597aM131672a2.m131673b(' ');
        c40597aM131672a2.m131673b('\t');
        c40597aM131672a2.m131673b('\n');
        c40597aM131672a2.m131673b((char) 11);
        c40597aM131672a2.m131673b('\f');
        c40597aM131672a2.m131673b('\r');
        c40597aM131672a2.m131673b('\"');
        c40597aM131672a2.m131673b('\'');
        c40597aM131672a2.m131673b('=');
        c40597aM131672a2.m131673b('<');
        c40597aM131672a2.m131673b('>');
        c40597aM131672a2.m131673b('`');
        f169883f = new C40597a(c40597aM131672a2);
    }

    /* JADX INFO: renamed from: b */
    public static C29205p m126143b(C0690l0 c0690l0, C4320k c4320k) {
        String strM1644m = c0690l0.m1734d(c4320k, c0690l0.m1743m()).m1644m();
        C0837m c0837m = new C0837m();
        c0837m.f3028g = strM1644m;
        return new C29205p(c0837m, c0690l0.m1743m(), false, 15);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x008c A[EDGE_INSN: B:124:0x008c->B:35:0x008c BREAK  A[LOOP:1: B:30:0x007a->B:40:0x0096], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[LOOP:1: B:30:0x007a->B:40:0x0096, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0093 -> B:6:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ye3.InterfaceC39487g
    /* JADX INFO: renamed from: a */
    public final pg3.C29205p mo126141a(xe3.C38248k r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye3.C39486f.mo126141a(xe3.k):pg3.p");
    }
}

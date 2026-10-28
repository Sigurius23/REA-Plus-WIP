package androidx.compose.p018ui.layout;

import androidx.compose.p018ui.Modifier;
import p002a0.C0023g0;
import p005a3.C0253t0;
import p635y2.AbstractC39125q1;
import p635y2.C39074a2;
import p635y2.C39082c2;
import p635y2.C39120p;
import p635y2.InterfaceC39078b2;
import p635y2.RunnableC39123q;

/* JADX INFO: renamed from: androidx.compose.ui.layout.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1133c {

    /* JADX INFO: renamed from: a */
    public static final C0023g0 f4850a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39078b2[] f4851b;

    /* JADX INFO: renamed from: c */
    public static final C0023g0 f4852c;

    static {
        C0023g0 c0023g0 = new C0023g0(8);
        InterfaceC39078b2.f168134a.getClass();
        C39082c2 c39082c2 = C39074a2.f168125g;
        c0023g0.m51h(1, c39082c2);
        C39082c2 c39082c3 = C39074a2.f168124f;
        c0023g0.m51h(2, c39082c3);
        C39082c2 c39082c4 = C39074a2.f168120b;
        c0023g0.m51h(4, c39082c4);
        C39082c2 c39082c5 = C39074a2.f168122d;
        c0023g0.m51h(8, c39082c5);
        C39082c2 c39082c6 = C39074a2.f168126h;
        c0023g0.m51h(16, c39082c6);
        C39082c2 c39082c7 = C39074a2.f168123e;
        c0023g0.m51h(32, c39082c7);
        C39082c2 c39082c8 = C39074a2.f168127i;
        c0023g0.m51h(64, c39082c8);
        f4850a = c0023g0;
        f4851b = new InterfaceC39078b2[]{c39082c2, c39082c3, c39082c4, c39082c8, c39082c6, c39082c7, c39082c5, C39074a2.f168128j, C39074a2.f168121c};
        C0023g0 c0023g1 = new C0023g0(7);
        c0023g1.m51h(1, c39082c2);
        c0023g1.m51h(2, c39082c3);
        c0023g1.m51h(4, c39082c4);
        c0023g1.m51h(16, c39082c6);
        c0023g1.m51h(64, c39082c8);
        c0023g1.m51h(32, c39082c7);
        c0023g1.m51h(8, c39082c5);
        f4852c = c0023g1;
    }

    /* JADX INFO: renamed from: a */
    public static final void m3504a(C0253t0 c0253t0, C39120p c39120p, long j7, int i13, int i14) {
        if (AbstractC39125q1.m124661g(j7, -1L)) {
            return;
        }
        c0253t0.m771a(c39120p.m124649b(), (int) ((j7 >>> 48) & 65535));
        c0253t0.m771a(c39120p.m124651d(), (int) ((j7 >>> 32) & 65535));
        c0253t0.m771a(c39120p.m124650c(), i13 - ((int) ((j7 >>> 16) & 65535)));
        c0253t0.m771a(c39120p.m124648a(), i14 - ((int) (j7 & 65535)));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3505b(RunnableC39123q runnableC39123q) {
        return new RulerProviderModifierElement(runnableC39123q);
    }
}

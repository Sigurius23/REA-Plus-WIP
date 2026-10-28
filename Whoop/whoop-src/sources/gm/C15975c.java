package gm;

import jm.C21782d;
import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;
import p127ev.AbstractC13673n;
import p381ot.C28315a;
import p381ot.InterfaceC28319e;

/* JADX INFO: renamed from: gm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15975c implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public static final C15975c f60469a = new C15975c();

    /* JADX INFO: renamed from: b */
    public static final C24719b f60470b = new C24719b("eventsDroppedCount", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(1))));

    /* JADX INFO: renamed from: c */
    public static final C24719b f60471c = new C24719b("reason", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(3))));

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        C21782d c21782d = (C21782d) obj;
        InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
        interfaceC24721d.mo72380a(f60470b, c21782d.f83916a);
        interfaceC24721d.mo72382d(f60471c, c21782d.f83917b);
    }
}

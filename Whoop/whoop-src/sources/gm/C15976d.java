package gm;

import jm.C21783e;
import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;
import p127ev.AbstractC13673n;
import p381ot.C28315a;
import p381ot.InterfaceC28319e;

/* JADX INFO: renamed from: gm.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C15976d implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public static final C15976d f60472a = new C15976d();

    /* JADX INFO: renamed from: b */
    public static final C24719b f60473b = new C24719b("logSource", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(1))));

    /* JADX INFO: renamed from: c */
    public static final C24719b f60474c = new C24719b("logEventDropped", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(2))));

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        C21783e c21783e = (C21783e) obj;
        InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
        interfaceC24721d.mo72382d(f60473b, c21783e.f83919a);
        interfaceC24721d.mo72382d(f60474c, c21783e.f83920b);
    }
}

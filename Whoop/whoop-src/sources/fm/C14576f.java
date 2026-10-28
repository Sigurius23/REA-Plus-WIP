package fm;

import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;

/* JADX INFO: renamed from: fm.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14576f implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public static final C14576f f53620a = new C14576f();

    /* JADX INFO: renamed from: b */
    public static final C24719b f53621b = C24719b.m72379a("requestTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C24719b f53622c = C24719b.m72379a("requestUptimeMs");

    /* JADX INFO: renamed from: d */
    public static final C24719b f53623d = C24719b.m72379a("clientInfo");

    /* JADX INFO: renamed from: e */
    public static final C24719b f53624e = C24719b.m72379a("logSource");

    /* JADX INFO: renamed from: f */
    public static final C24719b f53625f = C24719b.m72379a("logSourceName");

    /* JADX INFO: renamed from: g */
    public static final C24719b f53626g = C24719b.m72379a("logEvent");

    /* JADX INFO: renamed from: h */
    public static final C24719b f53627h = C24719b.m72379a("qosTier");

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
        C14582l c14582l = (C14582l) ((AbstractC14589s) obj);
        interfaceC24721d.mo72380a(f53621b, c14582l.f53652a);
        interfaceC24721d.mo72380a(f53622c, c14582l.f53653b);
        interfaceC24721d.mo72382d(f53623d, c14582l.f53654c);
        interfaceC24721d.mo72382d(f53624e, c14582l.f53655d);
        interfaceC24721d.mo72382d(f53625f, c14582l.f53656e);
        interfaceC24721d.mo72382d(f53626g, c14582l.f53657f);
        interfaceC24721d.mo72382d(f53627h, EnumC14593w.f53667w);
    }
}

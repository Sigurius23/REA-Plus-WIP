package fm;

import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;

/* JADX INFO: renamed from: fm.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14575e implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public static final C14575e f53612a = new C14575e();

    /* JADX INFO: renamed from: b */
    public static final C24719b f53613b = C24719b.m72379a("eventTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C24719b f53614c = C24719b.m72379a("eventCode");

    /* JADX INFO: renamed from: d */
    public static final C24719b f53615d = C24719b.m72379a("eventUptimeMs");

    /* JADX INFO: renamed from: e */
    public static final C24719b f53616e = C24719b.m72379a("sourceExtension");

    /* JADX INFO: renamed from: f */
    public static final C24719b f53617f = C24719b.m72379a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g */
    public static final C24719b f53618g = C24719b.m72379a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h */
    public static final C24719b f53619h = C24719b.m72379a("networkConnectionInfo");

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
        C14581k c14581k = (C14581k) ((AbstractC14588r) obj);
        interfaceC24721d.mo72380a(f53613b, c14581k.f53645a);
        interfaceC24721d.mo72382d(f53614c, c14581k.f53646b);
        interfaceC24721d.mo72380a(f53615d, c14581k.f53647c);
        interfaceC24721d.mo72382d(f53616e, c14581k.f53648d);
        interfaceC24721d.mo72382d(f53617f, c14581k.f53649e);
        interfaceC24721d.mo72380a(f53618g, c14581k.f53650f);
        interfaceC24721d.mo72382d(f53619h, c14581k.f53651g);
    }
}

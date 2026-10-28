package fm;

import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;

/* JADX INFO: renamed from: fm.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14577g implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public static final C14577g f53628a = new C14577g();

    /* JADX INFO: renamed from: b */
    public static final C24719b f53629b = C24719b.m72379a("networkType");

    /* JADX INFO: renamed from: c */
    public static final C24719b f53630c = C24719b.m72379a("mobileSubtype");

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
        C14584n c14584n = (C14584n) ((AbstractC14592v) obj);
        interfaceC24721d.mo72382d(f53629b, c14584n.f53659a);
        interfaceC24721d.mo72382d(f53630c, c14584n.f53660b);
    }
}

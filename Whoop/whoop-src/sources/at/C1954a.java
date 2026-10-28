package at;

import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p154fs.InterfaceC14739q;
import p659ys.C39739a;
import p659ys.C39741c;
import p659ys.C39742d;
import p659ys.C39743e;
import p659ys.C39745g;
import ro.C31624i;

/* JADX INFO: renamed from: at.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C1954a implements InterfaceC14739q {
    /* JADX INFO: renamed from: a */
    public static C1954a m5964a(C39739a c39739a) throws GeneralSecurityException {
        C1954a c1954a = new C1954a();
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        C31624i c31624i = c39739a.f171093c;
        C39742d c39742d = c39739a.f171092b;
        ((C11105a) c31624i.f130665x).m30035b();
        c39742d.f171106b.getClass();
        c39742d.f171109e.getClass();
        c39742d.f171110f.getClass();
        return c1954a;
    }

    /* JADX INFO: renamed from: b */
    public static C1954a m5965b(C39743e c39743e) throws GeneralSecurityException {
        C1954a c1954a = new C1954a();
        ((C11105a) c39743e.f171112c.f130665x).m30035b();
        C39745g c39745g = c39743e.f171111b;
        C39741c c39741c = c39745g.f171119c;
        if (c39741c.equals(C39741c.f171100f) || c39741c.equals(C39741c.f171101g) || c39741c.equals(C39741c.f171102h)) {
            c39745g.f171118b.getClass();
            c39745g.f171120d.getClass();
            return c1954a;
        }
        throw new GeneralSecurityException("Unknown HKDF algorithm " + c39741c);
    }
}

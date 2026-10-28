package at;

import com.google.crypto.tink.internal.AbstractC5086e;
import com.google.crypto.tink.internal.C5088f;
import gs.C16141k;
import gs.C16148q;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import ls.C24707d;
import p075ct.C11105a;
import p154fs.AbstractC14733k;
import p154fs.InterfaceC14727e;
import p347ns.C27081b;
import p347ns.C27082c;
import p347ns.C27083d;
import p347ns.C27085f;
import p347ns.C27087h;
import p477s2.AbstractC32073e;
import p581we.C37199o;

/* JADX INFO: renamed from: at.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C1968l implements InterfaceC14727e {

    /* JADX INFO: renamed from: a */
    public static final C37199o f7798a;

    /* JADX INFO: renamed from: b */
    public static final C37199o f7799b;

    static {
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC1972p.f7802w, C27081b.f108243b);
        c5088fM119196j.m15967a(EnumC1972p.f7803x, C27081b.f108244c);
        c5088fM119196j.m15967a(EnumC1972p.f7804y, C27081b.f108245d);
        f7798a = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC1974r.f7809w, C27083d.f108255c);
        c5088fM119196j2.m15967a(EnumC1974r.f7810x, C27083d.f108254b);
        c5088fM119196j2.m15967a(EnumC1974r.f7811y, C27083d.f108256d);
        f7799b = c5088fM119196j2.m15968b();
    }

    /* JADX INFO: renamed from: a */
    public static C1968l m6009a(C27087h c27087h) throws GeneralSecurityException {
        C27085f c27085f = c27087h.f108272b;
        EnumC1972p enumC1972p = (EnumC1972p) f7798a.m119215U(c27085f.f108263a);
        ECPoint eCPoint = c27087h.f108273c;
        ECPublicKey eCPublicKeyM99713B = AbstractC32073e.m99713B(enumC1972p, eCPoint.getAffineX().toByteArray(), eCPoint.getAffineY().toByteArray());
        C11105a c11105a = c27085f.f108268f;
        if (c11105a != null) {
            c11105a.m30035b();
        }
        m6011c(c27085f.f108264b);
        m6010b(c27085f.f108267e);
        c27087h.f108275e.m30035b();
        C1968l c1968l = new C1968l();
        AbstractC5086e.m15960b(eCPublicKeyM99713B.getW(), eCPublicKeyM99713B.getParams().getCurve());
        return c1968l;
    }

    /* JADX INFO: renamed from: b */
    public static void m6010b(AbstractC14733k abstractC14733k) {
        if ((abstractC14733k instanceof C16148q) || (abstractC14733k instanceof C16141k) || (abstractC14733k instanceof C24707d)) {
            return;
        }
        throw new GeneralSecurityException("Unsupported parameters for Ecies: " + abstractC14733k);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6011c(C27082c c27082c) {
        if (c27082c.equals(C27082c.f108248b) || c27082c.equals(C27082c.f108249c) || c27082c.equals(C27082c.f108250d) || c27082c.equals(C27082c.f108251e) || c27082c.equals(C27082c.f108252f)) {
            return;
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: " + c27082c);
    }
}

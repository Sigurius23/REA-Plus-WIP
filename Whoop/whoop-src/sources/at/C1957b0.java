package at;

import com.google.crypto.tink.internal.C5088f;
import ih0.AbstractC18489d0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import p154fs.InterfaceC14736n;
import p581we.C37199o;
import ws.C37600v;
import ws.C37601w;
import ws.C37602x;
import ws.C37604z;

/* JADX INFO: renamed from: at.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1957b0 implements InterfaceC14736n {

    /* JADX INFO: renamed from: a */
    public static final C37199o f7760a;

    static {
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC1979w.f7830y, C37600v.f160810b);
        c5088fM119196j.m15967a(EnumC1979w.f7831z, C37600v.f160811c);
        c5088fM119196j.m15967a(EnumC1979w.f7826E, C37600v.f160812d);
        f7760a = c5088fM119196j.m15968b();
    }

    /* JADX INFO: renamed from: a */
    public static C1957b0 m5969a(C37604z c37604z) throws GeneralSecurityException {
        KeyFactory keyFactory = (KeyFactory) C1977u.f7824g.f7825a.m6025a("RSA");
        BigInteger bigInteger = c37604z.f160834c;
        C37602x c37602x = c37604z.f160833b;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c37602x.f160821b));
        C37600v c37600v = c37602x.f160823d;
        C37199o c37199o = f7760a;
        EnumC1979w enumC1979w = (EnumC1979w) c37199o.m119215U(c37600v);
        int i13 = c37602x.f160825f;
        c37604z.f160835d.m30035b();
        c37602x.f160822c.equals(C37601w.f160816d);
        C1957b0 c1957b0 = new C1957b0();
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1959c0.m5975e(enumC1979w);
        AbstractC1959c0.m5973c(rSAPublicKey.getModulus().bitLength());
        AbstractC1959c0.m5974d(rSAPublicKey.getPublicExponent());
        return c1957b0;
    }
}

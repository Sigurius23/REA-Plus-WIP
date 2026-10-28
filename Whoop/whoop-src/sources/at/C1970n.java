package at;

import a33.C0352d;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import ih0.AbstractC18489d0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import p075ct.C11105a;
import p154fs.InterfaceC14735m;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p581we.C37199o;
import ws.C37585g;
import ws.C37587i;
import ws.C37601w;
import ws.C37602x;
import ws.C37603y;
import ws.C37604z;

/* JADX INFO: renamed from: at.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C1970n implements InterfaceC14735m {
    public C1970n(C0352d c0352d) {
        if (c0352d.m953z()) {
            C5117v c5117vM16084a = C5118w.f21467b.m16084a();
            AbstractC5078a.m15936i(c0352d);
            c5117vM16084a.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1970n m6018a(C5110q c5110q) {
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        C1971o.m6023c(c5099k0);
        ((EnumC36362h4) c5099k0.f21437F).equals(EnumC36362h4.LEGACY);
        return new C1970n();
    }

    /* JADX INFO: renamed from: b */
    public static C1970n m6019b(C37587i c37587i) throws GeneralSecurityException {
        byte[] bArrM30035b = ((C11105a) c37587i.f160737c.f130665x).m30035b();
        c37587i.mo45680X().mo45678V().m30035b();
        c37587i.f160736b.f160744b.f160735a.equals(C37585g.f160732d);
        C1970n c1970n = new C1970n();
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrM30035b.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        AbstractC5078a.m15943p(AbstractC5078a.m15935h(bArrM30035b));
        return c1970n;
    }

    /* JADX INFO: renamed from: c */
    public static C1970n m6020c(C37603y c37603y) throws GeneralSecurityException {
        KeyFactory keyFactory = (KeyFactory) C1977u.f7824g.f7825a.m6025a("RSA");
        C37604z c37604z = c37603y.f160826b;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c37604z.f160834c, c37604z.f160833b.f160821b, (BigInteger) c37603y.f160827c.f130665x, (BigInteger) c37603y.f160828d.f130665x, (BigInteger) c37603y.f160829e.f130665x, (BigInteger) c37603y.f160830f.f130665x, (BigInteger) c37603y.f160831g.f130665x, (BigInteger) c37603y.f160832h.f130665x));
        C37602x c37602x = c37604z.f160833b;
        C37199o c37199o = C1957b0.f7760a;
        EnumC1979w enumC1979w = (EnumC1979w) c37199o.m119215U(c37602x.f160823d);
        int i13 = c37602x.f160825f;
        c37603y.mo45680X().mo45678V().m30035b();
        c37604z.f160833b.f160822c.equals(C37601w.f160816d);
        C1970n c1970n = new C1970n();
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1959c0.m5975e(enumC1979w);
        AbstractC1959c0.m5973c(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC1959c0.m5974d(rSAPrivateCrtKey.getPublicExponent());
        return c1970n;
    }
}

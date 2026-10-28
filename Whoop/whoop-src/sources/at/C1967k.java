package at;

import a33.C0352d;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5086e;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import p075ct.C11105a;
import p154fs.InterfaceC14726d;
import p347ns.C27085f;
import p347ns.C27086g;
import p347ns.C27087h;
import p347ns.C27090k;
import p347ns.C27092m;
import p347ns.C27093n;
import p347ns.C27095p;
import p347ns.C27098s;
import p477s2.AbstractC32073e;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p581we.C37199o;
import se.AbstractC32417h;

/* JADX INFO: renamed from: at.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C1967k implements InterfaceC14726d {
    public C1967k(C0352d c0352d) {
        if (c0352d.m953z()) {
            C5117v c5117vM16084a = C5118w.f21467b.m16084a();
            AbstractC5078a.m15936i(c0352d);
            c5117vM16084a.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1967k m6006a(C5110q c5110q) throws GeneralSecurityException {
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        EnumC36362h4 enumC36362h4 = (EnumC36362h4) c5099k0.f21437F;
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal == 2) {
            ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + enumC36362h4);
            }
            ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        }
        return new C1967k();
    }

    /* JADX INFO: renamed from: b */
    public static C1967k m6007b(C27086g c27086g) throws NoSuchAlgorithmException {
        C37199o c37199o = C1968l.f7798a;
        C27087h c27087h = c27086g.f108269b;
        AbstractC32073e.m99712A((EnumC1972p) c37199o.m119215U(c27087h.f108272b.f108263a), AbstractC5078a.m15949v((BigInteger) c27086g.f108270c.f130665x));
        C27085f c27085f = c27087h.f108272b;
        C11105a c11105a = c27085f.f108268f;
        if (c11105a != null) {
            c11105a.m30035b();
        }
        C1968l.m6011c(c27085f.f108264b);
        C1968l.m6010b(c27085f.f108267e);
        c27086g.mo45679W().mo45678V().m30035b();
        return new C1967k();
    }

    /* JADX INFO: renamed from: c */
    public static C1967k m6008c(C27093n c27093n) throws GeneralSecurityException {
        EnumC1972p enumC1972p;
        C27095p c27095p = c27093n.f108295b;
        C27092m c27092m = c27095p.f108307b;
        C27090k c27090k = c27092m.f108291a;
        C27098s.m81471e(c27090k);
        C27098s.m81470d(c27092m.f108292b);
        C27098s.m81469c(c27092m.f108293c);
        C27090k c27090k2 = C27090k.f108285G;
        boolean zEquals = c27090k.equals(c27090k2);
        C27090k c27090k3 = C27090k.f108284F;
        C27090k c27090k4 = C27090k.f108283E;
        C27090k c27090k5 = C27090k.f108286z;
        if (!zEquals && !c27090k.equals(c27090k5) && !c27090k.equals(c27090k4) && !c27090k.equals(c27090k3)) {
            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
        }
        C11105a c11105a = (C11105a) c27093n.f108296c.f130665x;
        C27090k c27090k6 = c27095p.f108307b.f108291a;
        if (c27090k6.equals(c27090k2)) {
            byte[] bArrM30035b = c11105a.m30035b();
            byte[] bArrM101187R = AbstractC32417h.m101187R(bArrM30035b);
            C11105a.m30034a(bArrM30035b);
            C11105a.m30034a(bArrM101187R);
        } else {
            if (!c27090k6.equals(c27090k5) && !c27090k6.equals(c27090k4) && !c27090k6.equals(c27090k3)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            byte[] bArrM30035b2 = c11105a.m30035b();
            byte[] bArrM30035b3 = c27095p.f108308c.m30035b();
            if (c27090k6.equals(c27090k5)) {
                enumC1972p = EnumC1972p.f7802w;
            } else if (c27090k6.equals(c27090k4)) {
                enumC1972p = EnumC1972p.f7803x;
            } else {
                if (!c27090k6.equals(c27090k3)) {
                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                }
                enumC1972p = EnumC1972p.f7804y;
            }
            ECParameterSpec eCParameterSpecM99767z = AbstractC32073e.m99767z(enumC1972p);
            ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) C1977u.f7824g.f7825a.m6025a("EC")).generatePublic(new ECPublicKeySpec(AbstractC32073e.m99728V(eCParameterSpecM99767z.getCurve(), bArrM30035b3), eCParameterSpecM99767z));
            ECPrivateKey eCPrivateKeyM99712A = AbstractC32073e.m99712A(enumC1972p, bArrM30035b2);
            try {
                if (!AbstractC5086e.m15964f(eCPublicKey.getParams(), eCPrivateKeyM99712A.getParams())) {
                    throw new GeneralSecurityException("invalid public key spec");
                }
                AbstractC5086e.m15960b(eCPublicKey.getW(), eCPrivateKeyM99712A.getParams().getCurve());
                C11105a.m30034a(bArrM30035b2);
                C11105a.m30034a(bArrM30035b3);
            } catch (IllegalArgumentException | NullPointerException e5) {
                throw new GeneralSecurityException(e5);
            }
        }
        C11105a c11105aMo45678V = c27093n.mo45679W().mo45678V();
        C1967k c1967k = new C1967k();
        c11105aMo45678V.m30035b();
        return c1967k;
    }
}

package p202hw;

import com.nimbusds.jose.JOSEException;
import gw.C16262m;
import gw.C16263n;
import gw.InterfaceC16266q;
import hm.C17417d;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.Set;
import la.C23548b;
import p263jw.AbstractC21978d;
import p263jw.AbstractC21979e;
import p350nw.AbstractC27182c;
import p350nw.C27180a;
import p558vp.AbstractC36259c;
import p628xw.C38672b;

/* JADX INFO: renamed from: hw.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17692c extends AbstractC21978d implements InterfaceC16266q {

    /* JADX INFO: renamed from: e */
    public final C17417d f68647e;

    /* JADX INFO: renamed from: f */
    public final ECPublicKey f68648f;

    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C17692c(ECPublicKey eCPublicKey) throws JOSEException {
        C27180a c27180a;
        C16262m c16262m;
        ECParameterSpec params = eCPublicKey.getParams();
        C27180a c27180a2 = C27180a.f108790y;
        ECParameterSpec eCParameterSpec = AbstractC27182c.f108799a;
        if (params == null) {
            c27180a = null;
        } else {
            int fieldSize = params.getCurve().getField().getFieldSize();
            ECParameterSpec eCParameterSpec2 = AbstractC27182c.f108799a;
            if (fieldSize == eCParameterSpec2.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec2.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec2.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec2.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec2.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec2.getOrder()) && params.getCofactor() == eCParameterSpec2.getCofactor()) {
                c27180a = C27180a.f108790y;
            } else {
                int fieldSize2 = params.getCurve().getField().getFieldSize();
                ECParameterSpec eCParameterSpec3 = AbstractC27182c.f108800b;
                if (fieldSize2 == eCParameterSpec3.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec3.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec3.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec3.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec3.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec3.getOrder()) && params.getCofactor() == eCParameterSpec3.getCofactor()) {
                    c27180a = C27180a.f108791z;
                } else {
                    int fieldSize3 = params.getCurve().getField().getFieldSize();
                    ECParameterSpec eCParameterSpec4 = AbstractC27182c.f108801c;
                    if (fieldSize3 == eCParameterSpec4.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec4.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec4.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec4.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec4.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec4.getOrder()) && params.getCofactor() == eCParameterSpec4.getCofactor()) {
                        c27180a = C27180a.f108784F;
                    } else {
                        int fieldSize4 = params.getCurve().getField().getFieldSize();
                        ECParameterSpec eCParameterSpec5 = AbstractC27182c.f108802d;
                        if (fieldSize4 == eCParameterSpec5.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec5.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec5.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec5.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec5.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec5.getOrder()) && params.getCofactor() == eCParameterSpec5.getCofactor()) {
                            c27180a = C27180a.f108785G;
                        } else {
                            c27180a = null;
                        }
                    }
                }
            }
        }
        if (c27180a == null) {
            throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
        }
        if (C27180a.f108790y.equals(c27180a)) {
            c16262m = C16262m.f61853I;
        } else if (C27180a.f108791z.equals(c27180a)) {
            c16262m = C16262m.f61854J;
        } else if (C27180a.f108784F.equals(c27180a)) {
            c16262m = C16262m.f61855K;
        } else {
            if (!C27180a.f108785G.equals(c27180a)) {
                throw new JOSEException("Unexpected curve: " + c27180a);
            }
            c16262m = C16262m.f61856L;
        }
        super(Collections.singleton(c16262m));
        if (!AbstractC21978d.f85111d.contains(c16262m)) {
            throw new JOSEException("Unsupported EC DSA algorithm: " + c16262m);
        }
        C17417d c17417d = new C17417d(24);
        this.f68647e = c17417d;
        this.f68648f = eCPublicKey;
        C27180a c27180a3 = (C27180a) C27180a.m81761a((C16262m) ((Set) this.f9291b).iterator().next()).iterator().next();
        c27180a3.getClass();
        ECParameterSpec eCParameterSpecM81769a = AbstractC27182c.m81769a(c27180a3);
        ECPoint w9 = eCPublicKey.getW();
        if (!AbstractC36259c.m115689f0(w9.getAffineX(), w9.getAffineY(), eCParameterSpecM81769a)) {
            throw new JOSEException("Curve / public key parameters mismatch");
        }
        c17417d.f67507x = Collections.EMPTY_SET;
    }

    @Override // gw.InterfaceC16266q
    /* JADX INFO: renamed from: e */
    public final boolean mo46085e(C16263n c16263n, byte[] bArr, C38672b c38672b) throws Exception {
        C16262m c16262m = (C16262m) c16263n.f61787w;
        Set set = (Set) this.f9291b;
        if (!set.contains(c16262m)) {
            throw new JOSEException(AbstractC21979e.m62763m(c16262m, set));
        }
        if (this.f68647e.m49432k(c16263n)) {
            byte[] bArrM124047a = c38672b.m124047a();
            try {
                AbstractC21979e.m62755e(bArrM124047a, c16262m);
                byte[] bArrM62760j = AbstractC21979e.m62760j(bArrM124047a);
                Provider provider = (Provider) ((C23548b) this.f9292c).f93280x;
                String str = "SHA256withECDSA";
                if (!c16262m.equals(C16262m.f61853I) && !c16262m.equals(C16262m.f61854J)) {
                    if (c16262m.equals(C16262m.f61855K)) {
                        str = "SHA384withECDSA";
                    } else {
                        if (!c16262m.equals(C16262m.f61856L)) {
                            throw new JOSEException(AbstractC21979e.m62763m(c16262m, AbstractC21978d.f85111d));
                        }
                        str = "SHA512withECDSA";
                    }
                }
                try {
                    Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
                    try {
                        signature.initVerify(this.f68648f);
                        signature.update(bArr);
                        return signature.verify(bArrM62760j);
                    } catch (InvalidKeyException e5) {
                        throw new JOSEException("Invalid EC public key: " + e5.getMessage(), e5);
                    } catch (SignatureException unused) {
                    }
                } catch (NoSuchAlgorithmException e13) {
                    throw new JOSEException("Unsupported ECDSA algorithm: " + e13.getMessage(), e13);
                }
            } catch (JOSEException unused2) {
                return false;
            }
        }
        return false;
    }
}

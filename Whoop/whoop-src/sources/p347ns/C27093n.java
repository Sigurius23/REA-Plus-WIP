package p347ns;

import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5086e;
import gs.AbstractC16123b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import p154fs.C14738p;
import p477s2.AbstractC32073e;
import ro.C31624i;
import se.AbstractC32417h;

/* JADX INFO: renamed from: ns.n */
/* JADX INFO: loaded from: classes.dex */
public final class C27093n extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C27095p f108295b;

    /* JADX INFO: renamed from: c */
    public final C31624i f108296c;

    public C27093n(C27095p c27095p, C31624i c31624i) {
        super(1);
        this.f108295b = c27095p;
        this.f108296c = c31624i;
    }

    /* JADX INFO: renamed from: Y */
    public static C27093n m81461Y(C27095p c27095p, C31624i c31624i) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecM99717G;
        C27090k c27090k = c27095p.f108307b.f108291a;
        int iM97702E = c31624i.m97702E();
        String str = "Encoded private key byte length for " + c27090k + " must be %d, not " + iM97702E;
        C27090k c27090k2 = C27090k.f108285G;
        C27090k c27090k3 = C27090k.f108284F;
        C27090k c27090k4 = C27090k.f108283E;
        C27090k c27090k5 = C27090k.f108286z;
        if (c27090k == c27090k5) {
            if (iM97702E != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (c27090k == c27090k4) {
            if (iM97702E != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (c27090k == c27090k3) {
            if (iM97702E != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (c27090k != c27090k2) {
                throw new GeneralSecurityException("Unable to validate private key length for " + c27090k);
            }
            if (iM97702E != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] bArrM30035b = c27095p.f108308c.m30035b();
        byte[] bArrM97703F = c31624i.m97703F(C14738p.f54475a);
        if (c27090k == c27090k5 || c27090k == c27090k4 || c27090k == c27090k3) {
            if (c27090k == c27090k5) {
                eCParameterSpecM99717G = AbstractC32073e.m99715E();
            } else if (c27090k == c27090k4) {
                eCParameterSpecM99717G = AbstractC32073e.m99716F();
            } else {
                if (c27090k != c27090k3) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + c27090k);
                }
                eCParameterSpecM99717G = AbstractC32073e.m99717G();
            }
            BigInteger order = eCParameterSpecM99717G.getOrder();
            BigInteger bigIntegerM15934g = AbstractC5078a.m15934g(bArrM97703F);
            if (bigIntegerM15934g.signum() <= 0 || bigIntegerM15934g.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!AbstractC5086e.m15965g(bigIntegerM15934g, eCParameterSpecM99717G).equals(AbstractC32073e.m99728V(eCParameterSpecM99717G.getCurve(), bArrM30035b))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (c27090k != c27090k2) {
                throw new IllegalArgumentException("Unable to validate key pair for " + c27090k);
            }
            if (!Arrays.equals(AbstractC32417h.m101187R(bArrM97703F), bArrM30035b)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new C27093n(c27095p, c31624i);
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: W */
    public final AbstractC16123b mo45679W() {
        return this.f108295b;
    }
}

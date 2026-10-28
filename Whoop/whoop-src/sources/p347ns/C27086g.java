package p347ns;

import com.google.crypto.tink.internal.AbstractC5086e;
import gs.AbstractC16123b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;
import p075ct.C11105a;
import p154fs.C14738p;
import p477s2.AbstractC32073e;
import ro.C31624i;
import se.AbstractC32417h;

/* JADX INFO: renamed from: ns.g */
/* JADX INFO: loaded from: classes.dex */
public final class C27086g extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C27087h f108269b;

    /* JADX INFO: renamed from: c */
    public final C31624i f108270c;

    /* JADX INFO: renamed from: d */
    public final C31624i f108271d;

    public C27086g(C27087h c27087h, C31624i c31624i, C31624i c31624i2) {
        super(1);
        this.f108269b = c27087h;
        this.f108270c = c31624i;
        this.f108271d = c31624i2;
    }

    /* JADX INFO: renamed from: Y */
    public static C27086g m81453Y(C27087h c27087h, C31624i c31624i) throws GeneralSecurityException {
        C11105a c11105a = c27087h.f108274d;
        if (c11105a == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        byte[] bArrM97703F = c31624i.m97703F(C14738p.f54475a);
        byte[] bArrM30035b = c11105a.m30035b();
        if (bArrM97703F.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(AbstractC32417h.m101187R(bArrM97703F), bArrM30035b)) {
            return new C27086g(c27087h, null, c31624i);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    /* JADX INFO: renamed from: Z */
    public static C27086g m81454Z(C27087h c27087h, C31624i c31624i) throws GeneralSecurityException {
        ECPoint eCPoint = c27087h.f108273c;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        BigInteger bigIntegerM97713u = c31624i.m97713u(C14738p.f54475a);
        C27081b c27081b = c27087h.f108272b.f108263a;
        BigInteger order = m81455a0(c27081b).getOrder();
        if (bigIntegerM97713u.signum() <= 0 || bigIntegerM97713u.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (AbstractC5086e.m15965g(bigIntegerM97713u, m81455a0(c27081b)).equals(eCPoint)) {
            return new C27086g(c27087h, c31624i, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    /* JADX INFO: renamed from: a0 */
    public static ECParameterSpec m81455a0(C27081b c27081b) {
        if (c27081b == C27081b.f108243b) {
            return AbstractC32073e.m99715E();
        }
        if (c27081b == C27081b.f108244c) {
            return AbstractC32073e.m99716F();
        }
        if (c27081b == C27081b.f108245d) {
            return AbstractC32073e.m99717G();
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + c27081b);
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: W */
    public final AbstractC16123b mo45679W() {
        return this.f108269b;
    }
}

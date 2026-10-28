package p347ns;

import com.google.crypto.tink.internal.AbstractC5079a0;
import com.google.crypto.tink.internal.AbstractC5086e;
import gs.AbstractC16123b;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import p075ct.C11105a;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: ns.h */
/* JADX INFO: loaded from: classes.dex */
public final class C27087h extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C27085f f108272b;

    /* JADX INFO: renamed from: c */
    public final ECPoint f108273c;

    /* JADX INFO: renamed from: d */
    public final C11105a f108274d;

    /* JADX INFO: renamed from: e */
    public final C11105a f108275e;

    /* JADX INFO: renamed from: f */
    public final Integer f108276f;

    public C27087h(C27085f c27085f, ECPoint eCPoint, C11105a c11105a, C11105a c11105a2, Integer num) {
        super(2);
        this.f108272b = c27085f;
        this.f108273c = eCPoint;
        this.f108274d = c11105a;
        this.f108275e = c11105a2;
        this.f108276f = num;
    }

    /* JADX INFO: renamed from: Y */
    public static C27087h m81456Y(C27085f c27085f, C11105a c11105a, Integer num) throws GeneralSecurityException {
        C27081b c27081b = c27085f.f108263a;
        C27084e c27084e = c27085f.f108266d;
        if (!c27081b.equals(C27081b.f108246e)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        m81459b0(c27084e, num);
        if (c11105a.f35302a.length == 32) {
            return new C27087h(c27085f, null, c11105a, m81458a0(c27084e, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    /* JADX INFO: renamed from: Z */
    public static C27087h m81457Z(C27085f c27085f, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        C27081b c27081b = c27085f.f108263a;
        C27084e c27084e = c27085f.f108266d;
        if (c27081b.equals(C27081b.f108246e)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        m81459b0(c27084e, num);
        if (c27081b == C27081b.f108243b) {
            curve = AbstractC32073e.m99715E().getCurve();
        } else if (c27081b == C27081b.f108244c) {
            curve = AbstractC32073e.m99716F().getCurve();
        } else {
            if (c27081b != C27081b.f108245d) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + c27081b);
            }
            curve = AbstractC32073e.m99717G().getCurve();
        }
        AbstractC5086e.m15960b(eCPoint, curve);
        return new C27087h(c27085f, eCPoint, null, m81458a0(c27084e, num), num);
    }

    /* JADX INFO: renamed from: a0 */
    public static C11105a m81458a0(C27084e c27084e, Integer num) {
        if (c27084e == C27084e.f108260d) {
            return AbstractC5079a0.f21389a;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + c27084e);
        }
        if (c27084e == C27084e.f108259c) {
            return AbstractC5079a0.m15951a(num.intValue());
        }
        if (c27084e == C27084e.f108258b) {
            return AbstractC5079a0.m15952b(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: " + c27084e);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m81459b0(C27084e c27084e, Integer num) throws GeneralSecurityException {
        C27084e c27084e2 = C27084e.f108260d;
        if (c27084e.equals(c27084e2) || num != null) {
            if (c27084e.equals(c27084e2) && num != null) {
                throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
            }
        } else {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + c27084e + " variant.");
        }
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: V */
    public final C11105a mo45678V() {
        return this.f108275e;
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        return this.f108276f;
    }
}

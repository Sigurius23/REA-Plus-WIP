package p347ns;

import com.google.crypto.tink.internal.AbstractC5079a0;
import com.google.crypto.tink.internal.AbstractC5086e;
import gs.AbstractC16123b;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import p075ct.C11105a;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: ns.p */
/* JADX INFO: loaded from: classes.dex */
public final class C27095p extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C27092m f108307b;

    /* JADX INFO: renamed from: c */
    public final C11105a f108308c;

    /* JADX INFO: renamed from: d */
    public final C11105a f108309d;

    /* JADX INFO: renamed from: e */
    public final Integer f108310e;

    public C27095p(C27092m c27092m, C11105a c11105a, C11105a c11105a2, Integer num) {
        super(2);
        this.f108307b = c27092m;
        this.f108308c = c11105a;
        this.f108309d = c11105a2;
        this.f108310e = num;
    }

    /* JADX INFO: renamed from: Y */
    public static C27095p m81465Y(C27092m c27092m, C11105a c11105a, Integer num) {
        EllipticCurve curve;
        C11105a c11105aM15952b;
        C27091l c27091l = c27092m.f108294d;
        C27091l c27091l2 = C27091l.f108289d;
        if (!c27091l.equals(c27091l2) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + c27091l + " variant.");
        }
        if (c27091l.equals(c27091l2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        C27090k c27090k = c27092m.f108291a;
        int length = c11105a.f35302a.length;
        String str = "Encoded public key byte length for " + c27090k + " must be %d, not " + length;
        C27090k c27090k2 = C27090k.f108284F;
        C27090k c27090k3 = C27090k.f108283E;
        C27090k c27090k4 = C27090k.f108286z;
        if (c27090k == c27090k4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (c27090k == c27090k3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (c27090k == c27090k2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (c27090k != C27090k.f108285G) {
                throw new GeneralSecurityException("Unable to validate public key length for " + c27090k);
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (c27090k == c27090k4 || c27090k == c27090k3 || c27090k == c27090k2) {
            if (c27090k == c27090k4) {
                curve = AbstractC32073e.m99715E().getCurve();
            } else if (c27090k == c27090k3) {
                curve = AbstractC32073e.m99716F().getCurve();
            } else {
                if (c27090k != c27090k2) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + c27090k);
                }
                curve = AbstractC32073e.m99717G().getCurve();
            }
            AbstractC5086e.m15960b(AbstractC32073e.m99728V(curve, c11105a.m30035b()), curve);
        }
        if (c27091l == c27091l2) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + c27091l);
            }
            if (c27091l == C27091l.f108288c) {
                c11105aM15952b = AbstractC5079a0.m15951a(num.intValue());
            } else {
                if (c27091l != C27091l.f108287b) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + c27091l);
                }
                c11105aM15952b = AbstractC5079a0.m15952b(num.intValue());
            }
        }
        return new C27095p(c27092m, c11105a, c11105aM15952b, num);
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: V */
    public final C11105a mo45678V() {
        return this.f108309d;
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        return this.f108310e;
    }
}

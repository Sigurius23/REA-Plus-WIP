package p624xs;

import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import p075ct.C11105a;
import p505ts.C34119b;
import p560vs.C36347f1;
import p560vs.C36353g1;
import p560vs.C36371j1;
import p560vs.C36377k1;
import p560vs.EnumC36336d2;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p560vs.EnumC36383l1;
import ws.C37577a;
import ws.C37579b;
import ws.C37581c;
import ws.C37582d;
import ws.C37583e;

/* JADX INFO: renamed from: xs.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC38633b {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f166143a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f166144b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f166145c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f166146d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f166147e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f166148f;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        C11105a c11105aM16079c2 = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f166143a = new C5085d0(C37581c.class, new C34119b(28));
        f166144b = new C5081b0(c11105aM16079c, new C34119b(29));
        f166145c = new C5102m(C37583e.class, new C38632a(0));
        f166146d = new C5098k(c11105aM16079c2, new C38632a(1));
        f166147e = new C5102m(C37582d.class, new C38632a(2));
        f166148f = new C5098k(c11105aM16079c, new C38632a(3));
    }

    /* JADX INFO: renamed from: a */
    public static int m123832a(C37577a c37577a) {
        if (C37577a.f160693c.equals(c37577a)) {
            return 33;
        }
        if (C37577a.f160694d.equals(c37577a)) {
            return 49;
        }
        if (C37577a.f160695e.equals(c37577a)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + c37577a);
    }

    /* JADX INFO: renamed from: b */
    public static C36353g1 m123833b(C37581c c37581c) throws GeneralSecurityException {
        EnumC36354g2 enumC36354g2;
        EnumC36336d2 enumC36336d2;
        EnumC36383l1 enumC36383l1;
        C36347f1 c36347f1M116258G = C36353g1.m116258G();
        C37579b c37579b = c37581c.f160716c;
        if (C37579b.f160703c.equals(c37579b)) {
            enumC36354g2 = EnumC36354g2.SHA256;
        } else if (C37579b.f160704d.equals(c37579b)) {
            enumC36354g2 = EnumC36354g2.SHA384;
        } else {
            if (!C37579b.f160705e.equals(c37579b)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + c37579b);
            }
            enumC36354g2 = EnumC36354g2.SHA512;
        }
        c36347f1M116258G.m116236i(enumC36354g2);
        C37577a c37577a = c37581c.f160715b;
        if (C37577a.f160693c.equals(c37577a)) {
            enumC36336d2 = EnumC36336d2.NIST_P256;
        } else if (C37577a.f160694d.equals(c37577a)) {
            enumC36336d2 = EnumC36336d2.NIST_P384;
        } else {
            if (!C37577a.f160695e.equals(c37577a)) {
                throw new GeneralSecurityException("Unable to serialize CurveType " + c37577a);
            }
            enumC36336d2 = EnumC36336d2.NIST_P521;
        }
        c36347f1M116258G.m116234g(enumC36336d2);
        C37579b c37579b2 = c37581c.f160714a;
        if (C37579b.f160706f.equals(c37579b2)) {
            enumC36383l1 = EnumC36383l1.IEEE_P1363;
        } else {
            if (!C37579b.f160707g.equals(c37579b2)) {
                throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + c37579b2);
            }
            enumC36383l1 = EnumC36383l1.DER;
        }
        c36347f1M116258G.m116235h(enumC36383l1);
        return (C36353g1) c36347f1M116258G.m16347b();
    }

    /* JADX INFO: renamed from: c */
    public static C36377k1 m123834c(C37583e c37583e) {
        int iM123832a = m123832a(c37583e.f160720b.f160715b);
        ECPoint eCPoint = c37583e.f160721c;
        C36371j1 c36371j1M116372I = C36377k1.m116372I();
        c36371j1M116372I.m116344g(m123833b(c37583e.f160720b));
        byte[] bArrM15950w = AbstractC5078a.m15950w(iM123832a, eCPoint.getAffineX());
        c36371j1M116372I.m116345h(AbstractC5146i.m16173d(bArrM15950w, 0, bArrM15950w.length));
        byte[] bArrM15950w2 = AbstractC5078a.m15950w(iM123832a, eCPoint.getAffineY());
        c36371j1M116372I.m116346i(AbstractC5146i.m16173d(bArrM15950w2, 0, bArrM15950w2.length));
        return (C36377k1) c36371j1M116372I.m16347b();
    }

    /* JADX INFO: renamed from: d */
    public static C37577a m123835d(EnumC36336d2 enumC36336d2) throws GeneralSecurityException {
        int iOrdinal = enumC36336d2.ordinal();
        if (iOrdinal == 1) {
            return C37577a.f160693c;
        }
        if (iOrdinal == 2) {
            return C37577a.f160694d;
        }
        if (iOrdinal == 3) {
            return C37577a.f160695e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + enumC36336d2.m116204b());
    }

    /* JADX INFO: renamed from: e */
    public static C37579b m123836e(EnumC36354g2 enumC36354g2) throws GeneralSecurityException {
        int iOrdinal = enumC36354g2.ordinal();
        if (iOrdinal == 2) {
            return C37579b.f160704d;
        }
        if (iOrdinal == 3) {
            return C37579b.f160703c;
        }
        if (iOrdinal == 4) {
            return C37579b.f160705e;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC36354g2.m116264b());
    }

    /* JADX INFO: renamed from: f */
    public static EnumC36362h4 m123837f(C37579b c37579b) {
        if (C37579b.f160708h.equals(c37579b)) {
            return EnumC36362h4.TINK;
        }
        if (C37579b.f160709i.equals(c37579b)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C37579b.f160711k.equals(c37579b)) {
            return EnumC36362h4.RAW;
        }
        if (C37579b.f160710j.equals(c37579b)) {
            return EnumC36362h4.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c37579b);
    }

    /* JADX INFO: renamed from: g */
    public static C37579b m123838g(EnumC36383l1 enumC36383l1) throws GeneralSecurityException {
        int iOrdinal = enumC36383l1.ordinal();
        if (iOrdinal == 1) {
            return C37579b.f160706f;
        }
        if (iOrdinal == 2) {
            return C37579b.f160707g;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + enumC36383l1.m116415a());
    }

    /* JADX INFO: renamed from: h */
    public static C37579b m123839h(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C37579b.f160708h;
        }
        if (iOrdinal == 2) {
            return C37579b.f160710j;
        }
        if (iOrdinal == 3) {
            return C37579b.f160711k;
        }
        if (iOrdinal == 4) {
            return C37579b.f160709i;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
    }
}

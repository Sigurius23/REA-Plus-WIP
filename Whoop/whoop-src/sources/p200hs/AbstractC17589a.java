package p200hs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import gs.C16133g;
import gs.C16139j;
import gs.C16141k;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p184h5.C16893m1;
import p560vs.C36420r2;
import p560vs.C36426s2;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: hs.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17589a {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f68143a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f68144b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f68145c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f68146d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f68143a = new C5085d0(C16141k.class, new C16893m1(1));
        f68144b = new C5081b0(c11105aM16079c, new C16893m1(2));
        f68145c = new C5102m(C16133g.class, new C16893m1(3));
        f68146d = new C5098k(c11105aM16079c, new C16893m1(4));
    }

    /* JADX INFO: renamed from: a */
    public static C36426s2 m50090a(C16141k c16141k) throws GeneralSecurityException {
        EnumC36354g2 enumC36354g2;
        C36420r2 c36420r2M116601E = C36426s2.m116601E();
        c36420r2M116601E.m116587h(c16141k.f61328d);
        C16139j c16139j = c16141k.f61330f;
        if (C16139j.f61296c.equals(c16139j)) {
            enumC36354g2 = EnumC36354g2.SHA1;
        } else if (C16139j.f61297d.equals(c16139j)) {
            enumC36354g2 = EnumC36354g2.SHA224;
        } else if (C16139j.f61298e.equals(c16139j)) {
            enumC36354g2 = EnumC36354g2.SHA256;
        } else if (C16139j.f61299f.equals(c16139j)) {
            enumC36354g2 = EnumC36354g2.SHA384;
        } else {
            if (!C16139j.f61300g.equals(c16139j)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + c16139j);
            }
            enumC36354g2 = EnumC36354g2.SHA512;
        }
        c36420r2M116601E.m116586g(enumC36354g2);
        return (C36426s2) c36420r2M116601E.m16347b();
    }

    /* JADX INFO: renamed from: b */
    public static C16139j m50091b(EnumC36354g2 enumC36354g2) throws GeneralSecurityException {
        int iOrdinal = enumC36354g2.ordinal();
        if (iOrdinal == 1) {
            return C16139j.f61296c;
        }
        if (iOrdinal == 2) {
            return C16139j.f61299f;
        }
        if (iOrdinal == 3) {
            return C16139j.f61298e;
        }
        if (iOrdinal == 4) {
            return C16139j.f61300g;
        }
        if (iOrdinal == 5) {
            return C16139j.f61297d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC36354g2.m116264b());
    }

    /* JADX INFO: renamed from: c */
    public static EnumC36362h4 m50092c(C16139j c16139j) {
        if (C16139j.f61301h.equals(c16139j)) {
            return EnumC36362h4.TINK;
        }
        if (C16139j.f61302i.equals(c16139j)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C16139j.f61303j.equals(c16139j)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16139j);
    }

    /* JADX INFO: renamed from: d */
    public static C16139j m50093d(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C16139j.f61301h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C16139j.f61303j;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
            }
        }
        return C16139j.f61302i;
    }
}

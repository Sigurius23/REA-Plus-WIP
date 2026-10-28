package us;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p505ts.C34119b;
import p505ts.C34124g;
import p505ts.C34126i;
import p505ts.C34128k;
import p560vs.C36456x2;
import p560vs.C36462y2;
import p560vs.EnumC36354g2;

/* JADX INFO: renamed from: us.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35204c {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f149749a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f149750b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f149751c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f149752d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.HmacPrfKey");
        f149749a = new C5085d0(C34128k.class, new C34119b(14));
        f149750b = new C5081b0(c11105aM16079c, new C34119b(15));
        f149751c = new C5102m(C34126i.class, new C34119b(16));
        f149752d = new C5098k(c11105aM16079c, new C34119b(17));
    }

    /* JADX INFO: renamed from: a */
    public static C36462y2 m111544a(C34128k c34128k) throws GeneralSecurityException {
        EnumC36354g2 enumC36354g2;
        C36456x2 c36456x2M116792C = C36462y2.m116792C();
        C34124g c34124g = c34128k.f143067b;
        if (C34124g.f143049h.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA1;
        } else if (C34124g.f143050i.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA224;
        } else if (C34124g.f143051j.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA256;
        } else if (C34124g.f143052k.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA384;
        } else {
            if (!C34124g.f143053l.equals(c34124g)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + c34124g);
            }
            enumC36354g2 = EnumC36354g2.SHA512;
        }
        c36456x2M116792C.m116775g(enumC36354g2);
        return (C36462y2) c36456x2M116792C.m16347b();
    }

    /* JADX INFO: renamed from: b */
    public static C34124g m111545b(EnumC36354g2 enumC36354g2) throws GeneralSecurityException {
        int iOrdinal = enumC36354g2.ordinal();
        if (iOrdinal == 1) {
            return C34124g.f143049h;
        }
        if (iOrdinal == 2) {
            return C34124g.f143052k;
        }
        if (iOrdinal == 3) {
            return C34124g.f143051j;
        }
        if (iOrdinal == 4) {
            return C34124g.f143053l;
        }
        if (iOrdinal == 5) {
            return C34124g.f143050i;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC36354g2.m116264b());
    }
}

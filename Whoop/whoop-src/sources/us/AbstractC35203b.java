package us;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p505ts.C34119b;
import p505ts.C34122e;
import p505ts.C34124g;
import p505ts.C34125h;
import p560vs.C36384l2;
import p560vs.C36390m2;
import p560vs.EnumC36354g2;

/* JADX INFO: renamed from: us.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35203b {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f149745a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f149746b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f149747c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f149748d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.HkdfPrfKey");
        f149745a = new C5085d0(C34125h.class, new C34119b(10));
        f149746b = new C5081b0(c11105aM16079c, new C34119b(11));
        f149747c = new C5102m(C34122e.class, new C34119b(12));
        f149748d = new C5098k(c11105aM16079c, new C34119b(13));
    }

    /* JADX INFO: renamed from: a */
    public static C36390m2 m111542a(C34125h c34125h) throws GeneralSecurityException {
        EnumC36354g2 enumC36354g2;
        C36384l2 c36384l2M116425E = C36390m2.m116425E();
        C34124g c34124g = c34125h.f143057b;
        if (C34124g.f143044c.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA1;
        } else if (C34124g.f143045d.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA224;
        } else if (C34124g.f143046e.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA256;
        } else if (C34124g.f143047f.equals(c34124g)) {
            enumC36354g2 = EnumC36354g2.SHA384;
        } else {
            if (!C34124g.f143048g.equals(c34124g)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + c34124g);
            }
            enumC36354g2 = EnumC36354g2.SHA512;
        }
        c36384l2M116425E.m116416g(enumC36354g2);
        C11105a c11105a = c34125h.f143058c;
        if (c11105a != null && c11105a.f35302a.length > 0) {
            byte[] bArrM30035b = c11105a.m30035b();
            c36384l2M116425E.m116417h(AbstractC5146i.m16173d(bArrM30035b, 0, bArrM30035b.length));
        }
        return (C36390m2) c36384l2M116425E.m16347b();
    }

    /* JADX INFO: renamed from: b */
    public static C34124g m111543b(EnumC36354g2 enumC36354g2) throws GeneralSecurityException {
        int iOrdinal = enumC36354g2.ordinal();
        if (iOrdinal == 1) {
            return C34124g.f143044c;
        }
        if (iOrdinal == 2) {
            return C34124g.f143047f;
        }
        if (iOrdinal == 3) {
            return C34124g.f143046e;
        }
        if (iOrdinal == 4) {
            return C34124g.f143048g;
        }
        if (iOrdinal == 5) {
            return C34124g.f143045d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC36354g2.m116264b());
    }
}

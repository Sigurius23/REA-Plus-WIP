package p691zs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p560vs.C36376k0;
import p560vs.C36382l0;
import p560vs.EnumC36354g2;
import p659ys.C39741c;
import p659ys.C39743e;
import p659ys.C39745g;
import p692zt.C41113q;

/* JADX INFO: renamed from: zs.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC41075c {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f177094a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f177095b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f177096c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f177097d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        f177094a = new C5085d0(C39745g.class, new C41073a(1));
        f177095b = new C5081b0(c11105aM16079c, new C41073a(2));
        f177096c = new C5102m(C39743e.class, new C41073a(3));
        f177097d = new C5098k(c11105aM16079c, new C41073a(4));
    }

    /* JADX INFO: renamed from: a */
    public static C39745g m133376a(C36382l0 c36382l0, int i13) {
        C39741c c39741c;
        C41113q c41113qM127160b = C39745g.m127160b();
        c41113qM127160b.f177224x = Integer.valueOf(i13);
        c41113qM127160b.f177225y = Integer.valueOf(c36382l0.m116413E());
        c41113qM127160b.f177222E = Integer.valueOf(c36382l0.m116412C());
        EnumC36354g2 enumC36354g2M116414F = c36382l0.m116414F();
        int iOrdinal = enumC36354g2M116414F.ordinal();
        if (iOrdinal == 1) {
            c39741c = C39741c.f171100f;
        } else if (iOrdinal == 3) {
            c39741c = C39741c.f171101g;
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse HashType: " + enumC36354g2M116414F.m116264b());
            }
            c39741c = C39741c.f171102h;
        }
        c41113qM127160b.f177226z = c39741c;
        return c41113qM127160b.m133469p();
    }

    /* JADX INFO: renamed from: b */
    public static C36382l0 m133377b(C39745g c39745g) throws GeneralSecurityException {
        EnumC36354g2 enumC36354g2;
        C36376k0 c36376k0M116410G = C36382l0.m116410G();
        c36376k0M116410G.m116365g(c39745g.f171120d.intValue());
        c36376k0M116410G.m116366h(c39745g.f171118b.intValue());
        C39741c c39741c = c39745g.f171119c;
        if (C39741c.f171100f.equals(c39741c)) {
            enumC36354g2 = EnumC36354g2.SHA1;
        } else if (C39741c.f171101g.equals(c39741c)) {
            enumC36354g2 = EnumC36354g2.SHA256;
        } else {
            if (!C39741c.f171102h.equals(c39741c)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + c39741c);
            }
            enumC36354g2 = EnumC36354g2.SHA512;
        }
        c36376k0M116410G.m116367i(enumC36354g2);
        return (C36382l0) c36376k0M116410G.m16347b();
    }
}

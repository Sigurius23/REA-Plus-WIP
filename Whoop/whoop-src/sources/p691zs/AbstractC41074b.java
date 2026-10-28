package p691zs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5102m;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p560vs.C36420r2;
import p560vs.C36423s;
import p560vs.C36426s2;
import p560vs.C36429t;
import p560vs.EnumC36354g2;
import p624xs.C38632a;
import p659ys.C39739a;
import p659ys.C39741c;
import p659ys.C39742d;

/* JADX INFO: renamed from: zs.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC41074b {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f177090a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f177091b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f177092c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f177093d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        f177090a = new C5085d0(C39742d.class, new C38632a(27));
        f177091b = new C5081b0(c11105aM16079c, new C38632a(28));
        f177092c = new C5102m(C39739a.class, new C38632a(29));
        f177093d = new C5098k(c11105aM16079c, new C41073a(0));
    }

    /* JADX INFO: renamed from: a */
    public static C39741c m133372a(EnumC36354g2 enumC36354g2) throws GeneralSecurityException {
        int iOrdinal = enumC36354g2.ordinal();
        if (iOrdinal == 1) {
            return C39741c.f171097c;
        }
        if (iOrdinal == 3) {
            return C39741c.f171098d;
        }
        if (iOrdinal == 4) {
            return C39741c.f171099e;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC36354g2.m116264b());
    }

    /* JADX INFO: renamed from: b */
    public static C39742d m133373b(C36429t c36429t, int i13) {
        C5099k0 c5099k0M127159b = C39742d.m127159b();
        c5099k0M127159b.f21438w = Integer.valueOf(i13);
        c5099k0M127159b.f21439x = Integer.valueOf(c36429t.m116620F());
        c5099k0M127159b.f21437F = Integer.valueOf(c36429t.m116619D());
        c5099k0M127159b.f21440y = m133372a(c36429t.m116621G());
        c5099k0M127159b.f21441z = m133372a(c36429t.m116622H().m116603C());
        c5099k0M127159b.f21436E = Integer.valueOf(c36429t.m116622H().m116604D());
        return c5099k0M127159b.m16010l();
    }

    /* JADX INFO: renamed from: c */
    public static EnumC36354g2 m133374c(C39741c c39741c) throws GeneralSecurityException {
        if (C39741c.f171097c.equals(c39741c)) {
            return EnumC36354g2.SHA1;
        }
        if (C39741c.f171098d.equals(c39741c)) {
            return EnumC36354g2.SHA256;
        }
        if (C39741c.f171099e.equals(c39741c)) {
            return EnumC36354g2.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + c39741c);
    }

    /* JADX INFO: renamed from: d */
    public static C36429t m133375d(C39742d c39742d) {
        C36423s c36423sM116617I = C36429t.m116617I();
        c36423sM116617I.m116591g(c39742d.f171110f.intValue());
        c36423sM116617I.m116592h(c39742d.f171106b.intValue());
        c36423sM116617I.m116593i(m133374c(c39742d.f171107c));
        C36420r2 c36420r2M116601E = C36426s2.m116601E();
        c36420r2M116601E.m116586g(m133374c(c39742d.f171108d));
        c36420r2M116601E.m116587h(c39742d.f171109e.intValue());
        c36423sM116617I.m116594j(c36420r2M116601E);
        return (C36429t) c36423sM116617I.m16347b();
    }
}

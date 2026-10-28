package p624xs;

import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5088f;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import java.math.BigInteger;
import p075ct.C11105a;
import p560vs.C36386l4;
import p560vs.C36392m4;
import p560vs.C36410p4;
import p560vs.C36416q4;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p581we.C37199o;
import ro.C31624i;
import ws.C37593o;
import ws.C37594p;
import ws.C37595q;
import ws.C37596r;
import ws.C37597s;

/* JADX INFO: renamed from: xs.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC38635d {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f166156a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f166157b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f166158c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f166159d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f166160e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f166161f;

    /* JADX INFO: renamed from: g */
    public static final C37199o f166162g;

    /* JADX INFO: renamed from: h */
    public static final C37199o f166163h;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        C11105a c11105aM16079c2 = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f166156a = new C5085d0(C37595q.class, new C38632a(10));
        f166157b = new C5081b0(c11105aM16079c, new C38632a(11));
        f166158c = new C5102m(C37597s.class, new C38632a(12));
        f166159d = new C5098k(c11105aM16079c2, new C38632a(13));
        f166160e = new C5102m(C37596r.class, new C38632a(14));
        f166161f = new C5098k(c11105aM16079c, new C38632a(15));
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC36362h4.RAW, C37594p.f160778e);
        c5088fM119196j.m15967a(EnumC36362h4.TINK, C37594p.f160775b);
        c5088fM119196j.m15967a(EnumC36362h4.CRUNCHY, C37594p.f160776c);
        c5088fM119196j.m15967a(EnumC36362h4.LEGACY, C37594p.f160777d);
        f166162g = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC36354g2.SHA256, C37593o.f160771b);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA384, C37593o.f160772c);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA512, C37593o.f160773d);
        f166163h = c5088fM119196j2.m15968b();
    }

    /* JADX INFO: renamed from: a */
    public static C31624i m123840a(AbstractC5146i abstractC5146i) {
        return C31624i.m97698s(AbstractC5078a.m15934g(abstractC5146i.m16174g()));
    }

    /* JADX INFO: renamed from: b */
    public static C5143h m123841b(BigInteger bigInteger) {
        byte[] bArrM15949v = AbstractC5078a.m15949v(bigInteger);
        C5143h c5143h = AbstractC5146i.f21514x;
        return AbstractC5146i.m16173d(bArrM15949v, 0, bArrM15949v.length);
    }

    /* JADX INFO: renamed from: c */
    public static C36416q4 m123842c(C37597s c37597s) {
        C36410p4 c36410p4M116557I = C36416q4.m116557I();
        C37595q c37595q = c37597s.f160792b;
        C36386l4 c36386l4M116438C = C36392m4.m116438C();
        c36386l4M116438C.m116418g((EnumC36354g2) f166163h.m119215U(c37595q.f160784d));
        c36410p4M116557I.m116538i((C36392m4) c36386l4M116438C.m16347b());
        c36410p4M116557I.m116537h(m123841b(c37597s.f160793c));
        c36410p4M116557I.m116536g(m123841b(c37597s.f160792b.f160782b));
        return (C36416q4) c36410p4M116557I.m16347b();
    }
}

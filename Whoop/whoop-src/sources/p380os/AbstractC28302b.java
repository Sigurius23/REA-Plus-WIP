package p380os;

import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5088f;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import p075ct.C11105a;
import p154fs.AbstractC14724b;
import p347ns.C27081b;
import p347ns.C27082c;
import p347ns.C27083d;
import p347ns.C27084e;
import p347ns.C27085f;
import p347ns.C27086g;
import p347ns.C27087h;
import p560vs.C36389m1;
import p560vs.C36395n1;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.C36413q1;
import p560vs.C36419r1;
import p560vs.C36437u1;
import p560vs.C36443v1;
import p560vs.C36449w1;
import p560vs.C36455x1;
import p560vs.EnumC36329c1;
import p560vs.EnumC36336d2;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p581we.C37199o;

/* JADX INFO: renamed from: os.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28302b {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f114106a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f114107b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f114108c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f114109d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f114110e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f114111f;

    /* JADX INFO: renamed from: g */
    public static final C37199o f114112g;

    /* JADX INFO: renamed from: h */
    public static final C37199o f114113h;

    /* JADX INFO: renamed from: i */
    public static final C37199o f114114i;

    /* JADX INFO: renamed from: j */
    public static final C37199o f114115j;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        C11105a c11105aM16079c2 = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        f114106a = new C5085d0(C27085f.class, new C28301a(0));
        f114107b = new C5081b0(c11105aM16079c, new C28301a(1));
        f114108c = new C5102m(C27087h.class, new C28301a(2));
        f114109d = new C5098k(c11105aM16079c2, new C28301a(3));
        f114110e = new C5102m(C27086g.class, new C28301a(4));
        f114111f = new C5098k(c11105aM16079c, new C28301a(5));
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC36362h4.RAW, C27084e.f108260d);
        c5088fM119196j.m15967a(EnumC36362h4.TINK, C27084e.f108258b);
        EnumC36362h4 enumC36362h4 = EnumC36362h4.LEGACY;
        C27084e c27084e = C27084e.f108259c;
        c5088fM119196j.m15967a(enumC36362h4, c27084e);
        c5088fM119196j.m15967a(EnumC36362h4.CRUNCHY, c27084e);
        f114112g = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC36354g2.SHA1, C27082c.f108248b);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA224, C27082c.f108249c);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA256, C27082c.f108250d);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA384, C27082c.f108251e);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA512, C27082c.f108252f);
        f114113h = c5088fM119196j2.m15968b();
        C5088f c5088fM119196j3 = C37199o.m119196j();
        c5088fM119196j3.m15967a(EnumC36336d2.NIST_P256, C27081b.f108243b);
        c5088fM119196j3.m15967a(EnumC36336d2.NIST_P384, C27081b.f108244c);
        c5088fM119196j3.m15967a(EnumC36336d2.NIST_P521, C27081b.f108245d);
        c5088fM119196j3.m15967a(EnumC36336d2.CURVE25519, C27081b.f108246e);
        f114114i = c5088fM119196j3.m15968b();
        C5088f c5088fM119196j4 = C37199o.m119196j();
        c5088fM119196j4.m15967a(EnumC36329c1.UNCOMPRESSED, C27083d.f108255c);
        c5088fM119196j4.m15967a(EnumC36329c1.COMPRESSED, C27083d.f108254b);
        c5088fM119196j4.m15967a(EnumC36329c1.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, C27083d.f108256d);
        f114115j = c5088fM119196j4.m15968b();
    }

    /* JADX INFO: renamed from: a */
    public static C27085f m85743a(EnumC36362h4 enumC36362h4, C36419r1 c36419r1) {
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116484h(c36419r1.m116583D().m116457A().m116534E());
        c36403o3M116529G.m116483g(EnumC36362h4.RAW);
        c36403o3M116529G.m116485i(c36419r1.m116583D().m116457A().m116535F());
        C36409p3 c36409p3 = (C36409p3) c36403o3M116529G.m16347b();
        C5099k0 c5099k0M81452b = C27085f.m81452b();
        c5099k0M81452b.f21438w = (C27084e) f114112g.m119203F(enumC36362h4);
        c5099k0M81452b.f21439x = (C27081b) f114114i.m119203F(c36419r1.m116585F().m116772C());
        c5099k0M81452b.f21441z = (C27082c) f114113h.m119203F(c36419r1.m116585F().m116773E());
        c5099k0M81452b.m15997O(AbstractC14724b.m42225b(c36409p3.m16108e()));
        C11105a c11105aM30034a = C11105a.m30034a(c36419r1.m116585F().m116774F().m16174g());
        if (c11105aM30034a.f35302a.length == 0) {
            c5099k0M81452b.f21440y = null;
        } else {
            c5099k0M81452b.f21440y = c11105aM30034a;
        }
        if (!c36419r1.m116585F().m116772C().equals(EnumC36336d2.CURVE25519)) {
            c5099k0M81452b.f21436E = (C27083d) f114115j.m119203F(c36419r1.m116584E());
        } else if (!c36419r1.m116584E().equals(EnumC36329c1.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return c5099k0M81452b.m16009j();
    }

    /* JADX INFO: renamed from: b */
    public static int m85744b(C27081b c27081b) throws GeneralSecurityException {
        if (C27081b.f108243b.equals(c27081b)) {
            return 33;
        }
        if (C27081b.f108244c.equals(c27081b)) {
            return 49;
        }
        if (C27081b.f108245d.equals(c27081b)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + c27081b);
    }

    /* JADX INFO: renamed from: c */
    public static C36419r1 m85745c(C27085f c27085f) throws GeneralSecurityException {
        C36449w1 c36449w1M116770G = C36455x1.m116770G();
        c36449w1M116770G.m116726g((EnumC36336d2) f114114i.m119215U(c27085f.f108263a));
        c36449w1M116770G.m116727h((EnumC36354g2) f114113h.m119215U(c27085f.f108264b));
        C11105a c11105a = c27085f.f108268f;
        if (c11105a != null && c11105a.f35302a.length > 0) {
            byte[] bArrM30035b = c11105a.m30035b();
            c36449w1M116770G.m116728i(AbstractC5146i.m16173d(bArrM30035b, 0, bArrM30035b.length));
        }
        C36455x1 c36455x1 = (C36455x1) c36449w1M116770G.m16347b();
        try {
            C36409p3 c36409p3M116531I = C36409p3.m116531I(AbstractC14724b.m42226c(c27085f.f108267e), C5167p.m16298a());
            C36389m1 c36389m1M116455C = C36395n1.m116455C();
            C36403o3 c36403o3M116529G = C36409p3.m116529G();
            c36403o3M116529G.m116484h(c36409p3M116531I.m116534E());
            c36403o3M116529G.m116483g(EnumC36362h4.TINK);
            c36403o3M116529G.m116485i(c36409p3M116531I.m116535F());
            c36389m1M116455C.m116422g((C36409p3) c36403o3M116529G.m16347b());
            C36395n1 c36395n1 = (C36395n1) c36389m1M116455C.m16347b();
            C27083d c27083d = c27085f.f108265c;
            if (c27083d == null) {
                c27083d = C27083d.f108254b;
            }
            C36413q1 c36413q1M116581G = C36419r1.m116581G();
            c36413q1M116581G.m116544i(c36455x1);
            c36413q1M116581G.m116542g(c36395n1);
            c36413q1M116581G.m116543h((EnumC36329c1) f114115j.m119215U(c27083d));
            return (C36419r1) c36413q1M116581G.m16347b();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C36443v1 m85746d(C27087h c27087h) throws GeneralSecurityException {
        C27085f c27085f = c27087h.f108272b;
        if (c27085f.f108263a.equals(C27081b.f108246e)) {
            C36437u1 c36437u1M116705J = C36443v1.m116705J();
            c36437u1M116705J.m116657h();
            c36437u1M116705J.m116656g(m85745c(c27085f));
            byte[] bArrM30035b = c27087h.f108274d.m30035b();
            c36437u1M116705J.m116658i(AbstractC5146i.m16173d(bArrM30035b, 0, bArrM30035b.length));
            c36437u1M116705J.m116659j(AbstractC5146i.f21514x);
            return (C36443v1) c36437u1M116705J.m16347b();
        }
        int iM85744b = m85744b(c27085f.f108263a);
        ECPoint eCPoint = c27087h.f108273c;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        C36437u1 c36437u1M116705J2 = C36443v1.m116705J();
        c36437u1M116705J2.m116657h();
        c36437u1M116705J2.m116656g(m85745c(c27085f));
        byte[] bArrM15950w = AbstractC5078a.m15950w(iM85744b, eCPoint.getAffineX());
        c36437u1M116705J2.m116658i(AbstractC5146i.m16173d(bArrM15950w, 0, bArrM15950w.length));
        byte[] bArrM15950w2 = AbstractC5078a.m15950w(iM85744b, eCPoint.getAffineY());
        c36437u1M116705J2.m116659j(AbstractC5146i.m16173d(bArrM15950w2, 0, bArrM15950w2.length));
        return (C36443v1) c36437u1M116705J2.m16347b();
    }
}

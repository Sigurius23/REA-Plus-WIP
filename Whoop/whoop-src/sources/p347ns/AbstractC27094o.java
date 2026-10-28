package p347ns;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5088f;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import io.sentry.okhttp.C20450b;
import p075ct.C11105a;
import p560vs.C36343e3;
import p560vs.C36349f3;
import p560vs.C36367i3;
import p560vs.C36373j3;
import p560vs.EnumC36317a3;
import p560vs.EnumC36324b3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36468z2;
import p581we.C37199o;
import p692zt.C41113q;

/* JADX INFO: renamed from: ns.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC27094o {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f108297a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f108298b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f108299c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f108300d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f108301e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f108302f;

    /* JADX INFO: renamed from: g */
    public static final C37199o f108303g;

    /* JADX INFO: renamed from: h */
    public static final C37199o f108304h;

    /* JADX INFO: renamed from: i */
    public static final C37199o f108305i;

    /* JADX INFO: renamed from: j */
    public static final C37199o f108306j;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        C11105a c11105aM16079c2 = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        f108297a = new C5085d0(C27092m.class, new C20450b(21));
        f108298b = new C5081b0(c11105aM16079c, new C20450b(22));
        f108299c = new C5102m(C27095p.class, new C20450b(23));
        f108300d = new C5098k(c11105aM16079c2, new C20450b(24));
        f108301e = new C5102m(C27093n.class, new C20450b(25));
        f108302f = new C5098k(c11105aM16079c, new C20450b(26));
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC36362h4.RAW, C27091l.f108289d);
        c5088fM119196j.m15967a(EnumC36362h4.TINK, C27091l.f108287b);
        EnumC36362h4 enumC36362h4 = EnumC36362h4.LEGACY;
        C27091l c27091l = C27091l.f108288c;
        c5088fM119196j.m15967a(enumC36362h4, c27091l);
        c5088fM119196j.m15967a(EnumC36362h4.CRUNCHY, c27091l);
        f108303g = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC36324b3.DHKEM_P256_HKDF_SHA256, C27090k.f108286z);
        c5088fM119196j2.m15967a(EnumC36324b3.DHKEM_P384_HKDF_SHA384, C27090k.f108283E);
        c5088fM119196j2.m15967a(EnumC36324b3.DHKEM_P521_HKDF_SHA512, C27090k.f108284F);
        c5088fM119196j2.m15967a(EnumC36324b3.DHKEM_X25519_HKDF_SHA256, C27090k.f108285G);
        f108304h = c5088fM119196j2.m15968b();
        C5088f c5088fM119196j3 = C37199o.m119196j();
        c5088fM119196j3.m15967a(EnumC36317a3.HKDF_SHA256, C27089j.f108282z);
        c5088fM119196j3.m15967a(EnumC36317a3.HKDF_SHA384, C27089j.f108280E);
        c5088fM119196j3.m15967a(EnumC36317a3.HKDF_SHA512, C27089j.f108281F);
        f108305i = c5088fM119196j3.m15968b();
        C5088f c5088fM119196j4 = C37199o.m119196j();
        c5088fM119196j4.m15967a(EnumC36468z2.AES_128_GCM, C27088i.f108279z);
        c5088fM119196j4.m15967a(EnumC36468z2.AES_256_GCM, C27088i.f108277E);
        c5088fM119196j4.m15967a(EnumC36468z2.CHACHA20_POLY1305, C27088i.f108278F);
        f108306j = c5088fM119196j4.m15968b();
    }

    /* JADX INFO: renamed from: a */
    public static C27092m m81462a(EnumC36362h4 enumC36362h4, C36349f3 c36349f3) {
        C41113q c41113qM81460b = C27092m.m81460b();
        c41113qM81460b.f177222E = (C27091l) f108303g.m119203F(enumC36362h4);
        c41113qM81460b.f177224x = (C27090k) f108304h.m119203F(c36349f3.m116249F());
        c41113qM81460b.f177225y = (C27089j) f108305i.m119203F(c36349f3.m116248E());
        c41113qM81460b.f177226z = (C27088i) f108306j.m119203F(c36349f3.m116247C());
        return c41113qM81460b.m133466k();
    }

    /* JADX INFO: renamed from: b */
    public static C36349f3 m81463b(C27092m c27092m) {
        C36343e3 c36343e3M116245G = C36349f3.m116245G();
        c36343e3M116245G.m116218i((EnumC36324b3) f108304h.m119215U(c27092m.f108291a));
        c36343e3M116245G.m116217h((EnumC36317a3) f108305i.m119215U(c27092m.f108292b));
        c36343e3M116245G.m116216g((EnumC36468z2) f108306j.m119215U(c27092m.f108293c));
        return (C36349f3) c36343e3M116245G.m16347b();
    }

    /* JADX INFO: renamed from: c */
    public static C36373j3 m81464c(C27095p c27095p) {
        C36367i3 c36367i3M116353H = C36373j3.m116353H();
        c36367i3M116353H.m116330i();
        c36367i3M116353H.m116328g(m81463b(c27095p.f108307b));
        byte[] bArrM30035b = c27095p.f108308c.m30035b();
        c36367i3M116353H.m116329h(AbstractC5146i.m16173d(bArrM30035b, 0, bArrM30035b.length));
        return (C36373j3) c36367i3M116353H.m16347b();
    }
}

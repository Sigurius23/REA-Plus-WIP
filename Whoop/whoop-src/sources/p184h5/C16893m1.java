package p184h5;

import a00.C0072g;
import aa3.C0627i1;
import androidx.health.platform.client.proto.C1533u;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.InterfaceC5083c0;
import com.google.crypto.tink.internal.InterfaceC5087e0;
import com.google.crypto.tink.internal.InterfaceC5100l;
import com.google.crypto.tink.internal.InterfaceC5104n;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import gm.C15990r;
import gs.C16133g;
import gs.C16138i0;
import gs.C16141k;
import gs.C16142k0;
import gs.C16143l;
import gs.C16145n;
import gs.C16146o;
import gs.C16148q;
import gs.C16149r;
import gs.C16151t;
import gs.C16152u;
import gs.C16154w;
import gt.C16173l;
import gt.InterfaceC16166e;
import ht.EnumC17622k;
import java.security.GeneralSecurityException;
import java.util.concurrent.ScheduledExecutorService;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p200hs.AbstractC17589a;
import p200hs.AbstractC17590b;
import p200hs.AbstractC17591c;
import p200hs.AbstractC17592d;
import p200hs.AbstractC17594f;
import p200hs.AbstractC17599k;
import p505ts.AbstractC34132o;
import p560vs.C36314a0;
import p560vs.C36319a5;
import p560vs.C36321b0;
import p560vs.C36322b1;
import p560vs.C36326b5;
import p560vs.C36328c0;
import p560vs.C36334d0;
import p560vs.C36375k;
import p560vs.C36381l;
import p560vs.C36387m;
import p560vs.C36388m0;
import p560vs.C36393n;
import p560vs.C36394n0;
import p560vs.C36396n2;
import p560vs.C36400o0;
import p560vs.C36402o2;
import p560vs.C36403o3;
import p560vs.C36406p0;
import p560vs.C36408p2;
import p560vs.C36409p3;
import p560vs.C36412q0;
import p560vs.C36414q2;
import p560vs.C36418r0;
import p560vs.C36424s0;
import p560vs.C36430t0;
import p560vs.C36435u;
import p560vs.C36441v;
import p560vs.C36447w;
import p560vs.C36453x;
import p560vs.C36459y;
import p560vs.C36460y0;
import p560vs.C36465z;
import p560vs.C36466z0;
import p560vs.C36470z4;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p692zt.C41113q;
import ro.C31624i;

/* JADX INFO: renamed from: h5.m1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16893m1 implements InterfaceC5087e0, InterfaceC5083c0, InterfaceC5104n, InterfaceC5100l, InterfaceC16166e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64844w;

    public /* synthetic */ C16893m1(int i13) {
        this.f64844w = i13;
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        switch (this.f64844w) {
            case 1:
                C16141k c16141k = (C16141k) abstractC14733k;
                C36403o3 c36403o3M116529G = C36409p3.m116529G();
                c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                C36387m c36387mM116442D = C36393n.m116442D();
                C36447w c36447wM116758E = C36453x.m116758E();
                C36459y c36459yM116813C = C36465z.m116813C();
                c36459yM116813C.m116786g(c16141k.f61327c);
                c36447wM116758E.m116724h((C36465z) c36459yM116813C.m16347b());
                c36447wM116758E.m116723g(c16141k.f61325a);
                c36387mM116442D.m116419g((C36453x) c36447wM116758E.m16347b());
                C36408p2 c36408p2M116547F = C36414q2.m116547F();
                c36408p2M116547F.m116525h(AbstractC17589a.m50090a(c16141k));
                c36408p2M116547F.m116524g(c16141k.f61326b);
                c36387mM116442D.m116420h((C36414q2) c36408p2M116547F.m16347b());
                c36403o3M116529G.m116485i(((C36393n) c36387mM116442D.m16347b()).m16109f());
                c36403o3M116529G.m116483g(AbstractC17589a.m50092c(c16141k.f61329e));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
            case 5:
                C16145n c16145n = (C16145n) abstractC14733k;
                C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
                c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C36328c0 c36328c0M116197D = C36334d0.m116197D();
                c36328c0M116197D.m116175h(AbstractC17590b.m50094a(c16145n));
                c36328c0M116197D.m116174g(c16145n.f61339a);
                c36403o3M116529G2.m116485i(((C36334d0) c36328c0M116197D.m16347b()).m16109f());
                c36403o3M116529G2.m116483g(AbstractC17590b.m50095b(c16145n.f61342d));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G2.m16347b());
            case 9:
                C16148q c16148q = (C16148q) abstractC14733k;
                AbstractC17591c.m50099c(c16148q);
                C36403o3 c36403o3M116529G3 = C36409p3.m116529G();
                c36403o3M116529G3.m116484h("type.googleapis.com/google.crypto.tink.AesGcmKey");
                C36400o0 c36400o0M116515C = C36406p0.m116515C();
                c36400o0M116515C.m116471g(c16148q.f61352a);
                c36403o3M116529G3.m116485i(((C36406p0) c36400o0M116515C.m16347b()).m16109f());
                c36403o3M116529G3.m116483g(AbstractC17591c.m50097a(c16148q.f61355d));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G3.m16347b());
            case 13:
                C16151t c16151t = (C16151t) abstractC14733k;
                C36403o3 c36403o3M116529G4 = C36409p3.m116529G();
                c36403o3M116529G4.m116484h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                C36424s0 c36424s0M116623C = C36430t0.m116623C();
                c36424s0M116623C.m116595g(c16151t.f61364a);
                c36403o3M116529G4.m116485i(((C36430t0) c36424s0M116623C.m16347b()).m16109f());
                c36403o3M116529G4.m116483g(AbstractC17592d.m50100a(c16151t.f61365b));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G4.m16347b());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C36403o3 c36403o3M116529G5 = C36409p3.m116529G();
                c36403o3M116529G5.m116484h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                c36403o3M116529G5.m116485i(C36322b1.m116166z().m16109f());
                c36403o3M116529G5.m116483g(AbstractC17594f.m50105a(((C16154w) abstractC14733k).f61373a));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G5.m16347b());
            default:
                C36403o3 c36403o3M116529G6 = C36409p3.m116529G();
                c36403o3M116529G6.m116484h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                c36403o3M116529G6.m116485i(C36326b5.m116170z().m16109f());
                c36403o3M116529G6.m116483g(AbstractC17599k.m50113a(((C16142k0) abstractC14733k).f61331a));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G6.m16347b());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        switch (this.f64844w) {
            case 3:
                C16133g c16133g = (C16133g) abstractC34132o;
                C36375k c36375kM116400F = C36381l.m116400F();
                C36435u c36435uM116688F = C36441v.m116688F();
                C36459y c36459yM116813C = C36465z.m116813C();
                c36459yM116813C.m116786g(c16133g.f61272b.f61327c);
                c36435uM116688F.m116654h((C36465z) c36459yM116813C.m16347b());
                C31624i c31624i = c16133g.f61273c;
                C14738p c14738p = C14738p.f54475a;
                byte[] bArrM97703F = c31624i.m97703F(c14738p);
                c36435uM116688F.m116653g(AbstractC5146i.m16173d(bArrM97703F, 0, bArrM97703F.length));
                c36375kM116400F.m116363g((C36441v) c36435uM116688F.m16347b());
                C36396n2 c36396n2M116476G = C36402o2.m116476G();
                C16141k c16141k = c16133g.f61272b;
                c36396n2M116476G.m116459h(AbstractC17589a.m50090a(c16141k));
                byte[] bArrM97703F2 = c16133g.f61274d.m97703F(c14738p);
                c36396n2M116476G.m116458g(AbstractC5146i.m16173d(bArrM97703F2, 0, bArrM97703F2.length));
                c36375kM116400F.m116364h((C36402o2) c36396n2M116476G.m16347b());
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C36381l) c36375kM116400F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC17589a.m50092c(c16141k.f61329e), c16133g.f61276f);
            case 7:
                C16143l c16143l = (C16143l) abstractC34132o;
                C36314a0 c36314a0M116158F = C36321b0.m116158F();
                c36314a0M116158F.m116123h(AbstractC17590b.m50094a(c16143l.f61332b));
                byte[] bArrM97703F3 = c16143l.f61333c.m97703F(C14738p.f54475a);
                c36314a0M116158F.m116122g(AbstractC5146i.m16173d(bArrM97703F3, 0, bArrM97703F3.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C36321b0) c36314a0M116158F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC17590b.m50095b(c16143l.f61332b.f61342d), c16143l.f61335e);
            case 11:
                C16146o c16146o = (C16146o) abstractC34132o;
                AbstractC17591c.m50099c(c16146o.f61343b);
                C36388m0 c36388m0M116448D = C36394n0.m116448D();
                byte[] bArrM97703F4 = c16146o.f61344c.m97703F(C14738p.f54475a);
                c36388m0M116448D.m116421g(AbstractC5146i.m16173d(bArrM97703F4, 0, bArrM97703F4.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C36394n0) c36388m0M116448D.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC17591c.m50097a(c16146o.f61343b.f61355d), c16146o.f61346e);
            case 15:
                C16149r c16149r = (C16149r) abstractC34132o;
                C36412q0 c36412q0M116572D = C36418r0.m116572D();
                byte[] bArrM97703F5 = c16149r.f61357c.m97703F(C14738p.f54475a);
                c36412q0M116572D.m116541g(AbstractC5146i.m16173d(bArrM97703F5, 0, bArrM97703F5.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C36418r0) c36412q0M116572D.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC17592d.m50100a(c16149r.f61356b.f61365b), c16149r.f61359e);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C16152u c16152u = (C16152u) abstractC34132o;
                C36460y0 c36460y0M116817D = C36466z0.m116817D();
                byte[] bArrM97703F6 = c16152u.f61367c.m97703F(C14738p.f54475a);
                c36460y0M116817D.m116787g(AbstractC5146i.m16173d(bArrM97703F6, 0, bArrM97703F6.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C36466z0) c36460y0M116817D.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC17594f.m50105a(c16152u.f61366b.f61373a), c16152u.f61369e);
            default:
                C16138i0 c16138i0 = (C16138i0) abstractC34132o;
                C36470z4 c36470z4M116141D = C36319a5.m116141D();
                byte[] bArrM97703F7 = c16138i0.f61293c.m97703F(C14738p.f54475a);
                c36470z4M116141D.m116826g(AbstractC5146i.m16173d(bArrM97703F7, 0, bArrM97703F7.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C36319a5) c36470z4M116141D.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC17599k.m50113a(c16138i0.f61292b.f61331a), c16138i0.f61295e);
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f64844w) {
            case 4:
                C14738p c14738p = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    C36381l c36381lM116401G = C36381l.m116401G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36381lM116401G.m116406E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (c36381lM116401G.m116404C().m116692E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (c36381lM116401G.m116405D().m116482F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C5099k0 c5099k0M45691b = C16141k.m45691b();
                    c5099k0M45691b.m15995M(c36381lM116401G.m116404C().m116690C().size());
                    c5099k0M45691b.m15998P(c36381lM116401G.m116405D().m116480D().size());
                    c5099k0M45691b.m15999Q(c36381lM116401G.m116404C().m116691D().m116815B());
                    c5099k0M45691b.m16000S(c36381lM116401G.m116405D().m116481E().m116604D());
                    c5099k0M45691b.f21436E = AbstractC17589a.m50091b(c36381lM116401G.m116405D().m116481E().m116603C());
                    c5099k0M45691b.f21437F = AbstractC17589a.m50093d((EnumC36362h4) c5099k0.f21437F);
                    C16141k c16141kM16006f = c5099k0M45691b.m16006f();
                    C0072g c0072g = new C0072g(10);
                    c0072g.m175K(c16141kM16006f);
                    c0072g.m168D(C31624i.m97697r(c36381lM116401G.m116404C().m116690C().m16174g(), c14738p));
                    c0072g.m172H(C31624i.m97697r(c36381lM116401G.m116405D().m116480D().m16174g(), c14738p));
                    c0072g.m173I((Integer) c5099k0.f21438w);
                    return c0072g.m188f();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 8:
                C14738p c14738p2 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    C36321b0 c36321b0M116159G = C36321b0.m116159G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36321b0M116159G.m116164E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C41113q c41113qM45692b = C16145n.m45692b();
                    c41113qM45692b.m133459K(c36321b0M116159G.m116162C().size());
                    c41113qM45692b.m133458J(c36321b0M116159G.m116163D().m116233B());
                    c41113qM45692b.m133460L();
                    c41113qM45692b.f177222E = AbstractC17590b.m50096c((EnumC36362h4) c5099k0.f21437F);
                    C16145n c16145nM133464g = c41113qM45692b.m133464g();
                    C15990r c15990r = new C15990r(1);
                    c15990r.m45152R(c16145nM133464g);
                    c15990r.m45151Q(C31624i.m97697r(c36321b0M116159G.m116162C().m16174g(), c14738p2));
                    c15990r.m45150P((Integer) c5099k0.f21438w);
                    return c15990r.m45171w();
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 12:
                C14738p c14738p3 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    C36394n0 c36394n0M116449E = C36394n0.m116449E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36394n0M116449E.m116453C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C41113q c41113qM45693b = C16148q.m45693b();
                    c41113qM45693b.m133459K(c36394n0M116449E.m116452B().size());
                    c41113qM45693b.m133457I();
                    c41113qM45693b.m133460L();
                    c41113qM45693b.f177222E = AbstractC17591c.m50098b((EnumC36362h4) c5099k0.f21437F);
                    C16148q c16148qM133465j = c41113qM45693b.m133465j();
                    C15990r c15990r2 = new C15990r(2);
                    c15990r2.m45153S(c16148qM133465j);
                    c15990r2.m45151Q(C31624i.m97697r(c36394n0M116449E.m116452B().m16174g(), c14738p3));
                    c15990r2.m45150P((Integer) c5099k0.f21438w);
                    return c15990r2.m45172x();
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 16:
                C14738p c14738p4 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    C36418r0 c36418r0M116573E = C36418r0.m116573E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36418r0M116573E.m116577C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C5101l0 c5101l0M45694b = C16151t.m45694b();
                    c5101l0M45694b.m16057h0(c36418r0M116573E.m116576B().size());
                    c5101l0M45694b.f21444y = AbstractC17592d.m50101b((EnumC36362h4) c5099k0.f21437F);
                    C16151t c16151tM16028C = c5101l0M45694b.m16028C();
                    C15990r c15990r3 = new C15990r(3);
                    c15990r3.m45154T(c16151tM16028C);
                    c15990r3.m45151Q(C31624i.m97697r(c36418r0M116573E.m116576B().m16174g(), c14738p4));
                    c15990r3.m45150P((Integer) c5099k0.f21438w);
                    return c15990r3.m45173y();
                } catch (InvalidProtocolBufferException unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 20:
                C14738p c14738p5 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    C36466z0 c36466z0M116818E = C36466z0.m116818E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36466z0M116818E.m116822C() == 0) {
                        return C16152u.m45695Y(AbstractC17594f.m50106b((EnumC36362h4) c5099k0.f21437F), C31624i.m97697r(c36466z0M116818E.m116821B().m16174g(), c14738p5), (Integer) c5099k0.f21438w);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            default:
                C14738p c14738p6 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    C36319a5 c36319a5M116142E = C36319a5.m116142E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36319a5M116142E.m116146C() == 0) {
                        return C16138i0.m45690Y(AbstractC17599k.m50114b((EnumC36362h4) c5099k0.f21437F), C31624i.m97697r(c36319a5M116142E.m116145B().m16174g(), c14738p6), (Integer) c5099k0.f21438w);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public Object mo7223f(C0627i1 c0627i1) {
        switch (this.f64844w) {
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f21605a.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f21607c.get();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.f21606b.get();
            default:
                C16173l c16173l = ExecutorsRegistrar.f21605a;
                return EnumC17622k.f68344w;
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        switch (this.f64844w) {
            case 2:
                C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
                if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ")));
                }
                try {
                    C36393n c36393nM116443E = C36393n.m116443E(c36409p3.m116535F(), C5167p.m16298a());
                    if (c36393nM116443E.m116446C().m116552E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C5099k0 c5099k0M45691b = C16141k.m45691b();
                    c5099k0M45691b.m15995M(c36393nM116443E.m116445B().m116760C());
                    c5099k0M45691b.m15998P(c36393nM116443E.m116446C().m116550C());
                    c5099k0M45691b.m15999Q(c36393nM116443E.m116445B().m116761D().m116815B());
                    c5099k0M45691b.m16000S(c36393nM116443E.m116446C().m116551D().m116604D());
                    c5099k0M45691b.f21436E = AbstractC17589a.m50091b(c36393nM116443E.m116446C().m116551D().m116603C());
                    c5099k0M45691b.f21437F = AbstractC17589a.m50093d(c36409p3.m116533D());
                    return c5099k0M45691b.m16006f();
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e5);
                }
            case 6:
                C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
                if (!c36409p4.m116534E().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p4, new StringBuilder("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ")));
                }
                try {
                    C36334d0 c36334d0M116198E = C36334d0.m116198E(c36409p4.m116535F(), C5167p.m16298a());
                    C41113q c41113qM45692b = C16145n.m45692b();
                    c41113qM45692b.m133459K(c36334d0M116198E.m116200B());
                    c41113qM45692b.m133458J(c36334d0M116198E.m116201C().m116233B());
                    c41113qM45692b.m133460L();
                    c41113qM45692b.f177222E = AbstractC17590b.m50096c(c36409p4.m116533D());
                    return c41113qM45692b.m133464g();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e13);
                }
            case 10:
                C36409p3 c36409p5 = (C36409p3) c5101l0.f21444y;
                if (!c36409p5.m116534E().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p5, new StringBuilder("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ")));
                }
                try {
                    C36406p0 c36406p0M116516D = C36406p0.m116516D(c36409p5.m116535F(), C5167p.m16298a());
                    if (c36406p0M116516D.m116519B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C41113q c41113qM45693b = C16148q.m45693b();
                    c41113qM45693b.m133459K(c36406p0M116516D.m116518A());
                    c41113qM45693b.m133457I();
                    c41113qM45693b.m133460L();
                    c41113qM45693b.f177222E = AbstractC17591c.m50098b(c36409p5.m116533D());
                    return c41113qM45693b.m133465j();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e14);
                }
            case 14:
                C36409p3 c36409p6 = (C36409p3) c5101l0.f21444y;
                if (!c36409p6.m116534E().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p6, new StringBuilder("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ")));
                }
                try {
                    C36430t0 c36430t0M116624D = C36430t0.m116624D(c36409p6.m116535F(), C5167p.m16298a());
                    if (c36430t0M116624D.m116627B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C5101l0 c5101l0M45694b = C16151t.m45694b();
                    c5101l0M45694b.m16057h0(c36430t0M116624D.m116626A());
                    c5101l0M45694b.f21444y = AbstractC17592d.m50101b(c36409p6.m116533D());
                    return c5101l0M45694b.m16028C();
                } catch (InvalidProtocolBufferException e15) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e15);
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C36409p3 c36409p7 = (C36409p3) c5101l0.f21444y;
                if (!c36409p7.m116534E().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p7, new StringBuilder("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ")));
                }
                try {
                    C36322b1.m116165A(c36409p7.m116535F(), C5167p.m16298a());
                    return new C16154w(AbstractC17594f.m50106b(c36409p7.m116533D()));
                } catch (InvalidProtocolBufferException e16) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e16);
                }
            default:
                C36409p3 c36409p8 = (C36409p3) c5101l0.f21444y;
                if (!c36409p8.m116534E().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p8, new StringBuilder("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ")));
                }
                try {
                    if (C36326b5.m116169B(c36409p8.m116535F(), C5167p.m16298a()).m116171A() == 0) {
                        return new C16142k0(AbstractC17599k.m50114b(c36409p8.m116533D()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (InvalidProtocolBufferException e17) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e17);
                }
        }
    }
}

package io.sentry.okhttp;

import aa3.C0627i1;
import androidx.health.platform.client.proto.C1533u;
import at.C1962f;
import at.C1967k;
import at.C1968l;
import bh3.InterfaceC3260g;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.InterfaceC5083c0;
import com.google.crypto.tink.internal.InterfaceC5087e0;
import com.google.crypto.tink.internal.InterfaceC5091g0;
import com.google.crypto.tink.internal.InterfaceC5100l;
import com.google.crypto.tink.internal.InterfaceC5104n;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.datatransport.TransportRegistrar;
import gm.C15990r;
import gs.C16139j;
import gs.C16141k;
import gs.C16142k0;
import gs.C16148q;
import gt.InterfaceC16166e;
import io.sentry.util.InterfaceC20583e;
import io.sentry.util.network.InterfaceC20596d;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import ls.AbstractC24705b;
import ls.C24704a;
import ls.C24706c;
import ls.C24707d;
import ls.C24709f;
import ms.AbstractC25925a;
import od1.C27858u;
import od1.C27861x;
import p075ct.C11105a;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p240j2.C21223d;
import p240j2.InterfaceC21228i;
import p347ns.AbstractC27094o;
import p347ns.C27086g;
import p347ns.C27087h;
import p347ns.C27090k;
import p347ns.C27092m;
import p347ns.C27093n;
import p347ns.C27095p;
import p347ns.C27098s;
import p380os.AbstractC28304d;
import p505ts.AbstractC34132o;
import p560vs.C36331c3;
import p560vs.C36337d3;
import p560vs.C36355g3;
import p560vs.C36361h3;
import p560vs.C36373j3;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.C36436u0;
import p560vs.C36442v0;
import p560vs.C36448w0;
import p560vs.C36454x0;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import ro.C31624i;
import ud3.C34850x0;

/* JADX INFO: renamed from: io.sentry.okhttp.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20450b implements InterfaceC20596d, InterfaceC20583e, InterfaceC21228i, InterfaceC16166e, InterfaceC5091g0, InterfaceC5087e0, InterfaceC5083c0, InterfaceC5104n, InterfaceC5100l, InterfaceC3260g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76547w;

    public /* synthetic */ C20450b(int i13) {
        this.f76547w = i13;
    }

    @Override // io.sentry.util.network.InterfaceC20596d
    /* JADX INFO: renamed from: a */
    public LinkedHashMap mo51937a(Object obj) {
        C34850x0 resp = (C34850x0) obj;
        AbstractC22676k.m65750j(resp, "resp");
        return C20452d.m56650c(resp.f146777F);
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return C27861x.m84081q((C27858u.a) obj);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        switch (this.f76547w) {
            case 14:
                C24707d c24707d = (C24707d) abstractC14733k;
                C36403o3 c36403o3M116529G = C36409p3.m116529G();
                c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesSivKey");
                C36448w0 c36448w0M116762C = C36454x0.m116762C();
                c36448w0M116762C.m116725g(c24707d.f96635a);
                c36403o3M116529G.m116485i(((C36454x0) c36448w0M116762C.m16347b()).m16109f());
                c36403o3M116529G.m116483g(AbstractC25925a.m76684a(c24707d.f96636b));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
            default:
                C27092m c27092m = (C27092m) abstractC14733k;
                C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
                c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                C36331c3 c36331c3M116205B = C36337d3.m116205B();
                c36331c3M116205B.m116184g(AbstractC27094o.m81463b(c27092m));
                c36403o3M116529G2.m116485i(((C36337d3) c36331c3M116205B.m16347b()).m16109f());
                c36403o3M116529G2.m116483g((EnumC36362h4) AbstractC27094o.f108303g.m119215U(c27092m.f108294d));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G2.m16347b());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        switch (this.f76547w) {
            case 16:
                C24704a c24704a = (C24704a) abstractC34132o;
                C36436u0 c36436u0M116694D = C36442v0.m116694D();
                byte[] bArrM97703F = c24704a.f96624b.m97703F(C14738p.f54475a);
                c36436u0M116694D.m116655g(AbstractC5146i.m16173d(bArrM97703F, 0, bArrM97703F.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesSivKey", ((C36442v0) c36436u0M116694D.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC25925a.m76684a(c24704a.f96623a.f96636b), c24704a.f96626d);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C27095p c27095p = (C27095p) abstractC34132o;
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.HpkePublicKey", AbstractC27094o.m81464c(c27095p).m16109f(), EnumC36385l3.ASYMMETRIC_PUBLIC, (EnumC36362h4) AbstractC27094o.f108303g.m119215U(c27095p.f108307b.f108294d), c27095p.f108310e);
            default:
                C27093n c27093n = (C27093n) abstractC34132o;
                C36355g3 c36355g3M116298G = C36361h3.m116298G();
                c36355g3M116298G.m116267i();
                c36355g3M116298G.m116266h(AbstractC27094o.m81464c(c27093n.f108295b));
                byte[] bArrM97703F2 = c27093n.f108296c.m97703F(C14738p.f54475a);
                c36355g3M116298G.m116265g(AbstractC5146i.m16173d(bArrM97703F2, 0, bArrM97703F2.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((C36361h3) c36355g3M116298G.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PRIVATE, (EnumC36362h4) AbstractC27094o.f108303g.m119215U(c27093n.f108295b.f108307b.f108294d), c27093n.mo16076z());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f76547w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C14738p c14738p = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    C36442v0 c36442v0M116695E = C36442v0.m116695E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36442v0M116695E.m116699C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C5101l0 c5101l0M72316b = C24707d.m72316b();
                    c5101l0M72316b.m16057h0(c36442v0M116695E.m116698B().size());
                    c5101l0M72316b.f21444y = AbstractC25925a.m76685b((EnumC36362h4) c5099k0.f21437F);
                    C24707d c24707dM16029D = c5101l0M72316b.m16029D();
                    C15990r c15990r = new C15990r(15);
                    c15990r.m45155U(c24707dM16029D);
                    c15990r.m45151Q(C31624i.m97697r(c36442v0M116695E.m116698B().m16174g(), c14738p));
                    c15990r.m45150P((Integer) c5099k0.f21438w);
                    return c15990r.m45174z();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            case 24:
                String str = (String) c5099k0.f21439x;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    C36373j3 c36373j3M116354I = C36373j3.m116354I((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36373j3M116354I.m116359G() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C27092m c27092mM81462a = AbstractC27094o.m81462a((EnumC36362h4) c5099k0.f21437F, c36373j3M116354I.m116357E());
                    return C27095p.m81465Y(c27092mM81462a, C11105a.m30034a(AbstractC5078a.m15950w(AbstractC28304d.m85748b(c27092mM81462a.f108291a), AbstractC5078a.m15934g(c36373j3M116354I.m116358F().m16174g()))), (Integer) c5099k0.f21438w);
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            default:
                C14738p c14738p2 = C14738p.f54475a;
                String str2 = (String) c5099k0.f21439x;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + str2);
                }
                try {
                    C36361h3 c36361h3M116299H = C36361h3.m116299H((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36361h3M116299H.m116304F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C36373j3 c36373j3M116303E = c36361h3M116299H.m116303E();
                    C27092m c27092mM81462a2 = AbstractC27094o.m81462a((EnumC36362h4) c5099k0.f21437F, c36373j3M116303E.m116357E());
                    C27090k c27090k = c27092mM81462a2.f108291a;
                    return C27093n.m81461Y(C27095p.m81465Y(c27092mM81462a2, C11105a.m30034a(AbstractC5078a.m15950w(AbstractC28304d.m85748b(c27090k), AbstractC5078a.m15934g(c36373j3M116303E.m116358F().m16174g()))), (Integer) c5099k0.f21438w), C31624i.m97697r(AbstractC5078a.m15950w(AbstractC28304d.m85747a(c27090k), AbstractC5078a.m15934g(c36361h3M116299H.m116302D().m16174g())), c14738p2));
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
        }
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public Object mo7223f(C0627i1 c0627i1) {
        switch (this.f76547w) {
            case 9:
                return TransportRegistrar.lambda$getComponents$0(c0627i1);
            case 10:
                return TransportRegistrar.lambda$getComponents$1(c0627i1);
            default:
                return TransportRegistrar.lambda$getComponents$2(c0627i1);
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        switch (this.f76547w) {
            case 15:
                C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
                if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to AesSivParameters.parseParameters: ")));
                }
                try {
                    C36454x0 c36454x0M116763D = C36454x0.m116763D(c36409p3.m116535F(), C5167p.m16298a());
                    if (c36454x0M116763D.m116766B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C5101l0 c5101l0M72316b = C24707d.m72316b();
                    c5101l0M72316b.m16057h0(c36454x0M116763D.m116765A());
                    c5101l0M72316b.f21444y = AbstractC25925a.m76685b(c36409p3.m116533D());
                    return c5101l0M72316b.m16029D();
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e5);
                }
            default:
                C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
                if (!c36409p4.m116534E().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p4, new StringBuilder("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ")));
                }
                try {
                    return AbstractC27094o.m81462a(c36409p4.m116533D(), C36337d3.m116206C(c36409p4.m116535F(), C5167p.m16298a()).m116208A());
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e13);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5091g0
    /* JADX INFO: renamed from: h */
    public Object mo7225h(AbstractC34132o abstractC34132o) {
        switch (this.f76547w) {
            case 12:
                C24704a c24704a = (C24704a) abstractC34132o;
                AbstractC24705b.m72315a(c24704a.f96623a);
                return C1962f.m5992c(c24704a);
            case 13:
                return C24709f.m72318c((C5110q) abstractC34132o);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C1967k.m6007b((C27086g) abstractC34132o);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C1968l.m6009a((C27087h) abstractC34132o);
            case 27:
                return C1967k.m6006a((C5110q) abstractC34132o);
            default:
                return C27098s.m81467a((C5110q) abstractC34132o);
        }
    }

    @Override // p240j2.InterfaceC21228i
    /* JADX INFO: renamed from: i */
    public double mo56647i(double d3) {
        switch (this.f76547w) {
            case 2:
                double d14 = d3 < 0.0d ? -d3 : d3;
                return Math.copySign(d14 >= 0.0031308049535603718d ? (Math.pow(d14, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d14 / 0.07739938080495357d, d3);
            case 3:
                double d15 = d3 < 0.0d ? -d3 : d3;
                return Math.copySign(d15 >= 0.04045d ? Math.pow((0.9478672985781991d * d15) + 0.05213270142180095d, 2.4d) : d15 * 0.07739938080495357d, d3);
            case 4:
                float[] fArr = C21223d.f81019a;
                return C21223d.m59549b(C21223d.f81021c, d3);
            case 5:
                float[] fArr2 = C21223d.f81019a;
                return C21223d.m59548a(C21223d.f81021c, d3);
            case 6:
                float[] fArr3 = C21223d.f81019a;
                return C21223d.m59551d(C21223d.f81022d, d3);
            case 7:
                float[] fArr4 = C21223d.f81019a;
                return C21223d.m59550c(C21223d.f81022d, d3);
            default:
                return d3;
        }
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        return AbstractC30060g.m92131v();
    }

    /* JADX INFO: renamed from: k */
    public Object m56648k() throws GeneralSecurityException {
        HashSet hashSet = new HashSet();
        C41113q c41113qM45693b = C16148q.m45693b();
        c41113qM45693b.m133457I();
        c41113qM45693b.m133459K(16);
        c41113qM45693b.m133460L();
        C16139j c16139j = C16139j.f61309p;
        c41113qM45693b.f177222E = c16139j;
        hashSet.add(c41113qM45693b.m133465j());
        C41113q c41113qM45693b2 = C16148q.m45693b();
        c41113qM45693b2.m133457I();
        c41113qM45693b2.m133459K(32);
        c41113qM45693b2.m133460L();
        c41113qM45693b2.f177222E = c16139j;
        hashSet.add(c41113qM45693b2.m133465j());
        C5099k0 c5099k0M45691b = C16141k.m45691b();
        c5099k0M45691b.m15995M(16);
        c5099k0M45691b.m15998P(32);
        c5099k0M45691b.m16000S(16);
        c5099k0M45691b.m15999Q(16);
        C16139j c16139j2 = C16139j.f61298e;
        c5099k0M45691b.f21436E = c16139j2;
        C16139j c16139j3 = C16139j.f61303j;
        c5099k0M45691b.f21437F = c16139j3;
        hashSet.add(c5099k0M45691b.m16006f());
        C5099k0 c5099k0M45691b2 = C16141k.m45691b();
        c5099k0M45691b2.m15995M(32);
        c5099k0M45691b2.m15998P(32);
        c5099k0M45691b2.m16000S(32);
        c5099k0M45691b2.m15999Q(16);
        c5099k0M45691b2.f21436E = c16139j2;
        c5099k0M45691b2.f21437F = c16139j3;
        hashSet.add(c5099k0M45691b2.m16006f());
        hashSet.add(new C16142k0(C16139j.f61318y));
        C5101l0 c5101l0M72316b = C24707d.m72316b();
        c5101l0M72316b.m16057h0(64);
        c5101l0M72316b.f21444y = C24706c.f96633d;
        hashSet.add(c5101l0M72316b.m16029D());
        return Collections.unmodifiableSet(hashSet);
    }
}

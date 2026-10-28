package p380os;

import android.app.ApplicationExitInfo;
import androidx.health.platform.client.proto.C1533u;
import at.C1967k;
import at.C1982z;
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
import com.whoop.realtime.service.C9907b;
import ge3.AbstractC15751g;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m83.AbstractC25267u;
import od1.C27858u;
import p005a3.C0237p;
import p075ct.C11105a;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18369l0;
import p218ic.C18373n0;
import p218ic.EnumC18371m0;
import p347ns.C27081b;
import p347ns.C27085f;
import p347ns.C27086g;
import p347ns.C27087h;
import p347ns.C27093n;
import p347ns.C27095p;
import p347ns.C27098s;
import p420qc.C30206p;
import p420qc.C30207q;
import p436qs.C30557a;
import p436qs.C30560d;
import p436qs.C30564h;
import p436qs.C30566j;
import p436qs.C30567k;
import p436qs.C30568l;
import p499t9.InterfaceC33644n;
import p505ts.AbstractC34132o;
import p538v.InterfaceC35450a;
import p560vs.C36313a;
import p560vs.C36320b;
import p560vs.C36327c;
import p560vs.C36333d;
import p560vs.C36339e;
import p560vs.C36345f;
import p560vs.C36396n2;
import p560vs.C36401o1;
import p560vs.C36402o2;
import p560vs.C36403o3;
import p560vs.C36407p1;
import p560vs.C36408p2;
import p560vs.C36409p3;
import p560vs.C36414q2;
import p560vs.C36420r2;
import p560vs.C36425s1;
import p560vs.C36426s2;
import p560vs.C36431t1;
import p560vs.C36443v1;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import ro.C31624i;
import rs.AbstractC31779a;
import rs.AbstractC31782d;
import rs.C31781c;
import rs.C31783e;

/* JADX INFO: renamed from: os.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C28301a implements InterfaceC5087e0, InterfaceC5083c0, InterfaceC5104n, InterfaceC5100l, InterfaceC5091g0, InterfaceC35450a, InterfaceC3260g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114105w;

    public /* synthetic */ C28301a(int i13) {
        this.f114105w = i13;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m85738i(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    /* JADX INFO: renamed from: a */
    public Constructor m85742a() {
        switch (this.f114105w) {
            case 28:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC33644n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC33644n.class).getConstructor(null);
        }
    }

    @Override // p538v.InterfaceC35450a
    public Object apply(Object obj) {
        C18354e c18354e;
        long j7;
        long jM44457j;
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            C30206p c30206p = (C30206p) it.next();
            List list3 = c30206p.f123631q;
            EnumC18371m0 enumC18371m0 = c30206p.f123616b;
            C18358g c18358g = !list3.isEmpty() ? (C18358g) list3.get(0) : C18358g.f71479b;
            UUID uuidFromString = UUID.fromString(c30206p.f123615a);
            AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
            HashSet hashSet = new HashSet(c30206p.f123630p);
            C18358g c18358g2 = c30206p.f123617c;
            int i13 = c30206p.f123622h;
            int i14 = c30206p.f123627m;
            C18354e c18354e2 = c30206p.f123621g;
            long j13 = c30206p.f123618d;
            ArrayList arrayList2 = arrayList;
            long j14 = c30206p.f123619e;
            C18369l0 c18369l0 = j14 != 0 ? new C18369l0(j14, c30206p.f123620f) : null;
            EnumC18371m0 enumC18371m1 = EnumC18371m0.f71515w;
            if (enumC18371m0 == enumC18371m1) {
                String str = C30207q.f123633z;
                j7 = j13;
                c18354e = c18354e2;
                jM44457j = AbstractC15751g.m44457j(enumC18371m0 == enumC18371m1 && i13 > 0, i13, c30206p.f123623i, c30206p.f123624j, c30206p.f123625k, c30206p.f123626l, j14 != 0, j7, c30206p.f123620f, j14, c30206p.f123628n);
            } else {
                i14 = i14;
                c18354e = c18354e2;
                j7 = j13;
                i13 = i13;
                jM44457j = Long.MAX_VALUE;
            }
            arrayList2.add(new C18373n0(uuidFromString, enumC18371m0, hashSet, c18358g2, c18358g, i13, i14, c18354e, j7, c18369l0, jM44457j, c30206p.f123629o));
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return C9907b.m24236A((C27858u.a) obj);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        switch (this.f114105w) {
            case 0:
                C27085f c27085f = (C27085f) abstractC14733k;
                C36403o3 c36403o3M116529G = C36409p3.m116529G();
                c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                C36401o1 c36401o1M116520B = C36407p1.m116520B();
                c36401o1M116520B.m116472g(AbstractC28302b.m85745c(c27085f));
                c36403o3M116529G.m116485i(((C36407p1) c36401o1M116520B.m16347b()).m16109f());
                c36403o3M116529G.m116483g((EnumC36362h4) AbstractC28302b.f114112g.m119215U(c27085f.f108266d));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
            case 15:
                C30560d c30560d = (C30560d) abstractC14733k;
                C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
                c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.AesCmacKey");
                C36327c c36327cM116191D = C36333d.m116191D();
                C36339e c36339eM116227C = C36345f.m116227C();
                c36339eM116227C.m116210g(c30560d.f125762b);
                c36327cM116191D.m116173h((C36345f) c36339eM116227C.m16347b());
                c36327cM116191D.m116172g(c30560d.f125761a);
                c36403o3M116529G2.m116485i(((C36333d) c36327cM116191D.m16347b()).m16109f());
                c36403o3M116529G2.m116483g(AbstractC31779a.m98678a(c30560d.f125763c));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G2.m16347b());
            default:
                C30568l c30568l = (C30568l) abstractC14733k;
                C36403o3 c36403o3M116529G3 = C36409p3.m116529G();
                c36403o3M116529G3.m116484h("type.googleapis.com/google.crypto.tink.HmacKey");
                C36408p2 c36408p2M116547F = C36414q2.m116547F();
                C36420r2 c36420r2M116601E = C36426s2.m116601E();
                c36420r2M116601E.m116587h(c30568l.f125790b);
                c36420r2M116601E.m116586g((EnumC36354g2) AbstractC31782d.f131593b.m119215U(c30568l.f125792d));
                c36408p2M116547F.m116525h((C36426s2) c36420r2M116601E.m16347b());
                c36408p2M116547F.m116524g(c30568l.f125789a);
                c36403o3M116529G3.m116485i(((C36414q2) c36408p2M116547F.m16347b()).m16109f());
                c36403o3M116529G3.m116483g((EnumC36362h4) AbstractC31782d.f131592a.m119215U(c30568l.f125791c));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G3.m16347b());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        switch (this.f114105w) {
            case 2:
                C27087h c27087h = (C27087h) abstractC34132o;
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", AbstractC28302b.m85746d(c27087h).m16109f(), EnumC36385l3.ASYMMETRIC_PUBLIC, (EnumC36362h4) AbstractC28302b.f114112g.m119215U(c27087h.f108272b.f108266d), c27087h.f108276f);
            case 4:
                C27086g c27086g = (C27086g) abstractC34132o;
                C36425s1 c36425s1M116631G = C36431t1.m116631G();
                c36425s1M116631G.m116598i();
                c36425s1M116631G.m116597h(AbstractC28302b.m85746d(c27086g.f108269b));
                C27085f c27085f = c27086g.f108269b.f108272b;
                C27081b c27081b = c27085f.f108263a;
                boolean zEquals = c27081b.equals(C27081b.f108246e);
                C14738p c14738p = C14738p.f54475a;
                if (zEquals) {
                    byte[] bArrM97703F = c27086g.f108271d.m97703F(c14738p);
                    c36425s1M116631G.m116596g(AbstractC5146i.m16173d(bArrM97703F, 0, bArrM97703F.length));
                } else {
                    byte[] bArrM15950w = AbstractC5078a.m15950w(AbstractC28302b.m85744b(c27081b), c27086g.f108270c.m97713u(c14738p));
                    c36425s1M116631G.m116596g(AbstractC5146i.m16173d(bArrM15950w, 0, bArrM15950w.length));
                }
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((C36431t1) c36425s1M116631G.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PRIVATE, (EnumC36362h4) AbstractC28302b.f114112g.m119215U(c27085f.f108266d), c27086g.mo16076z());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C30557a c30557a = (C30557a) abstractC34132o;
                C36313a c36313aM116149F = C36320b.m116149F();
                C30560d c30560d = c30557a.f125748b;
                C36339e c36339eM116227C = C36345f.m116227C();
                c36339eM116227C.m116210g(c30560d.f125762b);
                c36313aM116149F.m116121h((C36345f) c36339eM116227C.m16347b());
                byte[] bArrM97703F2 = c30557a.f125749c.m97703F(C14738p.f54475a);
                c36313aM116149F.m116120g(AbstractC5146i.m16173d(bArrM97703F2, 0, bArrM97703F2.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C36320b) c36313aM116149F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, AbstractC31779a.m98678a(c30557a.f125748b.f125763c), c30557a.f125751e);
            default:
                C30564h c30564h = (C30564h) abstractC34132o;
                C36396n2 c36396n2M116476G = C36402o2.m116476G();
                C30568l c30568l = c30564h.f125768b;
                C36420r2 c36420r2M116601E = C36426s2.m116601E();
                c36420r2M116601E.m116587h(c30568l.f125790b);
                c36420r2M116601E.m116586g((EnumC36354g2) AbstractC31782d.f131593b.m119215U(c30568l.f125792d));
                c36396n2M116476G.m116459h((C36426s2) c36420r2M116601E.m16347b());
                byte[] bArrM97703F3 = c30564h.f125769c.m97703F(C14738p.f54475a);
                c36396n2M116476G.m116458g(AbstractC5146i.m16173d(bArrM97703F3, 0, bArrM97703F3.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.HmacKey", ((C36402o2) c36396n2M116476G.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, (EnumC36362h4) AbstractC31782d.f131592a.m119215U(c30564h.f125768b.f125791c), c30564h.f125771e);
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f114105w) {
            case 3:
                String str = (String) c5099k0.f21439x;
                Integer num = (Integer) c5099k0.f21438w;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    C36443v1 c36443v1M116706K = C36443v1.m116706K((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36443v1M116706K.m116710G() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C27085f c27085fM85743a = AbstractC28302b.m85743a((EnumC36362h4) c5099k0.f21437F, c36443v1M116706K.m116709F());
                    if (!c27085fM85743a.f108263a.equals(C27081b.f108246e)) {
                        return C27087h.m81457Z(c27085fM85743a, new ECPoint(AbstractC5078a.m15934g(c36443v1M116706K.m116711H().m16174g()), AbstractC5078a.m15934g(c36443v1M116706K.m116712I().m16174g())), num);
                    }
                    if (c36443v1M116706K.m116712I().size() == 0) {
                        return C27087h.m81456Y(c27085fM85743a, C11105a.m30034a(c36443v1M116706K.m116711H().m16174g()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 5:
                C14738p c14738p = C14738p.f54475a;
                String str2 = (String) c5099k0.f21439x;
                Integer num2 = (Integer) c5099k0.f21438w;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + str2);
                }
                try {
                    C36431t1 c36431t1M116632H = C36431t1.m116632H((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36431t1M116632H.m116637F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C36443v1 c36443v1M116636E = c36431t1M116632H.m116636E();
                    C27085f c27085fM85743a2 = AbstractC28302b.m85743a((EnumC36362h4) c5099k0.f21437F, c36443v1M116636E.m116709F());
                    return c27085fM85743a2.f108263a.equals(C27081b.f108246e) ? C27086g.m81453Y(C27087h.m81456Y(c27085fM85743a2, C11105a.m30034a(c36443v1M116636E.m116711H().m16174g()), num2), C31624i.m97697r(c36431t1M116632H.m116635D().m16174g(), c14738p)) : C27086g.m81454Z(C27087h.m81457Z(c27085fM85743a2, new ECPoint(AbstractC5078a.m15934g(c36443v1M116636E.m116711H().m16174g()), AbstractC5078a.m15934g(c36443v1M116636E.m116712I().m16174g())), num2), C31624i.m97698s(AbstractC5078a.m15934g(c36431t1M116632H.m116635D().m16174g())));
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C14738p c14738p2 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    C36320b c36320bM116150G = C36320b.m116150G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36320bM116150G.m116155E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0237p c0237pM93711b = C30560d.m93711b();
                    c0237pM93711b.m688S(c36320bM116150G.m116153C().size());
                    c0237pM93711b.m691V(c36320bM116150G.m116154D().m116229B());
                    c0237pM93711b.f814z = AbstractC31779a.m98679b((EnumC36362h4) c5099k0.f21437F);
                    C30560d c30560dM709o = c0237pM93711b.m709o();
                    C29938w0 c29938w0 = new C29938w0(1, false);
                    c29938w0.m91550F(c30560dM709o);
                    c29938w0.m91546B(C31624i.m97697r(c36320bM116150G.m116153C().m16174g(), c14738p2));
                    c29938w0.m91547C((Integer) c5099k0.f21438w);
                    return c29938w0.m91561g();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                C14738p c14738p3 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    C36402o2 c36402o2M116477H = C36402o2.m116477H((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36402o2M116477H.m116482F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C41113q c41113qM93713b = C30568l.m93713b();
                    c41113qM93713b.f177224x = Integer.valueOf(c36402o2M116477H.m116480D().size());
                    c41113qM93713b.f177225y = Integer.valueOf(c36402o2M116477H.m116481E().m116604D());
                    c41113qM93713b.f177226z = (C30566j) AbstractC31782d.f131593b.m119203F(c36402o2M116477H.m116481E().m116603C());
                    c41113qM93713b.f177222E = (C30567k) AbstractC31782d.f131592a.m119203F((EnumC36362h4) c5099k0.f21437F);
                    C30568l c30568lM133467n = c41113qM93713b.m133467n();
                    C29938w0 c29938w1 = new C29938w0(2, false);
                    c29938w1.m91551G(c30568lM133467n);
                    c29938w1.m91548D(C31624i.m97697r(c36402o2M116477H.m116480D().m16174g(), c14738p3));
                    c29938w1.m91547C((Integer) c5099k0.f21438w);
                    return c29938w1.m91562h();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        switch (this.f114105w) {
            case 1:
                C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
                if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to EciesProtoSerialization.parseParameters: ")));
                }
                try {
                    return AbstractC28302b.m85743a(c36409p3.m116533D(), C36407p1.m116521C(c36409p3.m116535F(), C5167p.m16298a()).m116523A());
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e5);
                }
            case 16:
                C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
                if (!c36409p4.m116534E().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p4, new StringBuilder("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ")));
                }
                try {
                    C36333d c36333dM116192E = C36333d.m116192E(c36409p4.m116535F(), C5167p.m16298a());
                    C0237p c0237pM93711b = C30560d.m93711b();
                    c0237pM93711b.m688S(c36333dM116192E.m116194B());
                    c0237pM93711b.m691V(c36333dM116192E.m116195C().m116229B());
                    c0237pM93711b.f814z = AbstractC31779a.m98679b(c36409p4.m116533D());
                    return c0237pM93711b.m709o();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e13);
                }
            default:
                C36409p3 c36409p5 = (C36409p3) c5101l0.f21444y;
                if (!c36409p5.m116534E().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p5, new StringBuilder("Wrong type URL in call to HmacProtoSerialization.parseParameters: ")));
                }
                try {
                    C36414q2 c36414q2M116548G = C36414q2.m116548G(c36409p5.m116535F(), C5167p.m16298a());
                    if (c36414q2M116548G.m116552E() != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + c36414q2M116548G.m116552E());
                    }
                    C41113q c41113qM93713b = C30568l.m93713b();
                    c41113qM93713b.f177224x = Integer.valueOf(c36414q2M116548G.m116550C());
                    c41113qM93713b.f177225y = Integer.valueOf(c36414q2M116548G.m116551D().m116604D());
                    c41113qM93713b.f177226z = (C30566j) AbstractC31782d.f131593b.m119203F(c36414q2M116548G.m116551D().m116603C());
                    c41113qM93713b.f177222E = (C30567k) AbstractC31782d.f131592a.m119203F(c36409p5.m116533D());
                    return c41113qM93713b.m133467n();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e14);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5091g0
    /* JADX INFO: renamed from: h */
    public Object mo7225h(AbstractC34132o abstractC34132o) throws GeneralSecurityException {
        switch (this.f114105w) {
            case 6:
                return C1967k.m6008c((C27093n) abstractC34132o);
            case 7:
                return C27098s.m81468b((C27095p) abstractC34132o);
            case 8:
            default:
                return C31783e.m98696a((C5110q) abstractC34132o);
            case 9:
                if (((C30557a) abstractC34132o).f125748b.f125761a == 32) {
                    return new C31781c(0);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 10:
                C30557a c30557a = (C30557a) abstractC34132o;
                if (c30557a.f125748b.f125761a == 32) {
                    return C1982z.m6033b(c30557a);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 11:
                return new C31781c(1);
            case 12:
                return C1982z.m6034c((C30564h) abstractC34132o);
        }
    }
}

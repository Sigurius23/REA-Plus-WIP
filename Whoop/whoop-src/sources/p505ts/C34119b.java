package p505ts;

import aa3.C0627i1;
import androidx.health.platform.client.proto.C1533u;
import at.C1955a0;
import at.C1957b0;
import at.C1965i;
import at.C1966j;
import at.C1970n;
import at.C1971o;
import at.C1980x;
import at.C1981y;
import bt.C3615b;
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
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import gt.InterfaceC16166e;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p389p0.C28539n0;
import p474s.C31983m2;
import p499t9.C33652u;
import p560vs.C36335d1;
import p560vs.C36341e1;
import p560vs.C36351g;
import p560vs.C36357h;
import p560vs.C36360h2;
import p560vs.C36363i;
import p560vs.C36366i2;
import p560vs.C36369j;
import p560vs.C36372j2;
import p560vs.C36378k2;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.C36432t2;
import p560vs.C36438u2;
import p560vs.C36444v2;
import p560vs.C36450w2;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p624xs.AbstractC38633b;
import p692zt.C41113q;
import ro.C31624i;
import so.C32800q;
import us.AbstractC35203b;
import us.AbstractC35204c;
import ws.C37581c;
import ws.C37582d;
import ws.C37583e;
import ws.C37587i;
import ws.C37589k;
import ws.C37596r;
import ws.C37597s;
import ws.C37603y;
import ws.C37604z;

/* JADX INFO: renamed from: ts.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C34119b implements InterfaceC5091g0, InterfaceC16166e, InterfaceC5087e0, InterfaceC5083c0, InterfaceC5104n, InterfaceC5100l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143033w;

    public /* synthetic */ C34119b(int i13) {
        this.f143033w = i13;
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        switch (this.f143033w) {
            case 6:
                C36403o3 c36403o3M116529G = C36409p3.m116529G();
                c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesCmacPrfKey");
                C36363i c36363iM116332C = C36369j.m116332C();
                c36363iM116332C.m116307g(((C34121d) abstractC14733k).f143037a);
                c36403o3M116529G.m116485i(((C36369j) c36363iM116332C.m16347b()).m16109f());
                c36403o3M116529G.m116483g(EnumC36362h4.RAW);
                return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
            case 10:
                C34125h c34125h = (C34125h) abstractC14733k;
                C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
                c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.HkdfPrfKey");
                C36372j2 c36372j2M116381E = C36378k2.m116381E();
                c36372j2M116381E.m116348h(AbstractC35203b.m111542a(c34125h));
                c36372j2M116381E.m116347g(c34125h.f143056a);
                c36403o3M116529G2.m116485i(((C36378k2) c36372j2M116381E.m16347b()).m16109f());
                c36403o3M116529G2.m116483g(EnumC36362h4.RAW);
                return C5101l0.m16023G((C36409p3) c36403o3M116529G2.m16347b());
            case 14:
                C34128k c34128k = (C34128k) abstractC14733k;
                C36403o3 c36403o3M116529G3 = C36409p3.m116529G();
                c36403o3M116529G3.m116484h("type.googleapis.com/google.crypto.tink.HmacPrfKey");
                C36444v2 c36444v2M116730E = C36450w2.m116730E();
                c36444v2M116730E.m116714h(AbstractC35204c.m111544a(c34128k));
                c36444v2M116730E.m116713g(c34128k.f143066a);
                c36403o3M116529G3.m116485i(((C36450w2) c36444v2M116730E.m16347b()).m16109f());
                c36403o3M116529G3.m116483g(EnumC36362h4.RAW);
                return C5101l0.m16023G((C36409p3) c36403o3M116529G3.m16347b());
            default:
                C37581c c37581c = (C37581c) abstractC14733k;
                C36403o3 c36403o3M116529G4 = C36409p3.m116529G();
                c36403o3M116529G4.m116484h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                C36335d1 c36335d1M116212B = C36341e1.m116212B();
                c36335d1M116212B.m116202g(AbstractC38633b.m123833b(c37581c));
                c36403o3M116529G4.m116485i(((C36341e1) c36335d1M116212B.m16347b()).m16109f());
                c36403o3M116529G4.m116483g(AbstractC38633b.m123837f(c37581c.f160717d));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G4.m16347b());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        switch (this.f143033w) {
            case 8:
                C36351g c36351gM116276D = C36357h.m116276D();
                byte[] bArrM97703F = ((C34118a) abstractC34132o).f143032c.m97703F(C14738p.f54475a);
                c36351gM116276D.m116252g(AbstractC5146i.m16173d(bArrM97703F, 0, bArrM97703F.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesCmacPrfKey", ((C36357h) c36351gM116276D.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, EnumC36362h4.RAW, null);
            case 12:
                C34122e c34122e = (C34122e) abstractC34132o;
                C36360h2 c36360h2M116321F = C36366i2.m116321F();
                c36360h2M116321F.m116294h(AbstractC35203b.m111542a(c34122e.f143038b));
                byte[] bArrM97703F2 = c34122e.f143039c.m97703F(C14738p.f54475a);
                c36360h2M116321F.m116293g(AbstractC5146i.m16173d(bArrM97703F2, 0, bArrM97703F2.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.HkdfPrfKey", ((C36366i2) c36360h2M116321F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, EnumC36362h4.RAW, null);
            default:
                C34126i c34126i = (C34126i) abstractC34132o;
                C36432t2 c36432t2M116662F = C36438u2.m116662F();
                c36432t2M116662F.m116639h(AbstractC35204c.m111544a(c34126i.f143059b));
                byte[] bArrM97703F3 = c34126i.f143060c.m97703F(C14738p.f54475a);
                c36432t2M116662F.m116638g(AbstractC5146i.m16173d(bArrM97703F3, 0, bArrM97703F3.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.HmacPrfKey", ((C36438u2) c36432t2M116662F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, EnumC36362h4.RAW, null);
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f143033w) {
            case 9:
                C14738p c14738p = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesCmacPrfKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacPrfProtoSerialization.parseKey");
                }
                try {
                    C36357h c36357hM116277E = C36357h.m116277E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36357hM116277E.m116281C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (((Integer) c5099k0.f21438w) != null) {
                        throw new GeneralSecurityException("ID requirement must be null.");
                    }
                    C34121d c34121dM107852b = C34121d.m107852b(c36357hM116277E.m116280B().size());
                    C31624i c31624iM97697r = C31624i.m97697r(c36357hM116277E.m116280B().m16174g(), c14738p);
                    if (c34121dM107852b.f143037a == c31624iM97697r.m97702E()) {
                        return new C34118a(c34121dM107852b, c31624iM97697r);
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacPrfKey failed");
                }
            case 13:
                C14738p c14738p2 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.HkdfPrfKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseKey");
                }
                try {
                    C36366i2 c36366i2M116322G = C36366i2.m116322G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36366i2M116322G.m116327E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (((Integer) c5099k0.f21438w) != null) {
                        throw new GeneralSecurityException("ID requirement must be null.");
                    }
                    C31983m2 c31983m2M107854b = C34125h.m107854b();
                    c31983m2M107854b.m99493t(c36366i2M116322G.m116325C().size());
                    c31983m2M107854b.f132769x = AbstractC35203b.m111543b(c36366i2M116322G.m116326D().m116427C());
                    C11105a c11105aM30034a = C11105a.m30034a(c36366i2M116322G.m116326D().m116428D().m16174g());
                    if (c11105aM30034a.f35302a.length == 0) {
                        c31983m2M107854b.f132770y = null;
                    } else {
                        c31983m2M107854b.f132770y = c11105aM30034a;
                    }
                    C34125h c34125hM99480c = c31983m2M107854b.m99480c();
                    C32800q c32800q = new C32800q(3);
                    c32800q.m102864h(c34125hM99480c);
                    c32800q.m102862f(C31624i.m97697r(c36366i2M116322G.m116325C().m16174g(), c14738p2));
                    return c32800q.m102858b();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HkdfPrfKey failed");
                }
            default:
                C14738p c14738p3 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.HmacPrfKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacPrfProtoSerialization.parseKey");
                }
                try {
                    C36438u2 c36438u2M116663G = C36438u2.m116663G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36438u2M116663G.m116668E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (((Integer) c5099k0.f21438w) != null) {
                        throw new GeneralSecurityException("ID requirement must be null.");
                    }
                    C28539n0 c28539n0M107855b = C34128k.m107855b();
                    c28539n0M107855b.m86840l(c36438u2M116663G.m116666C().size());
                    c28539n0M107855b.f115463y = AbstractC35204c.m111545b(c36438u2M116663G.m116667D().m116794B());
                    C34128k c34128kM86834d = c28539n0M107855b.m86834d();
                    C33652u c33652u = new C33652u(2);
                    c33652u.m106285g(c34128kM86834d);
                    c33652u.m106284e(C31624i.m97697r(c36438u2M116663G.m116666C().m16174g(), c14738p3));
                    return c33652u.m106282a();
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing HmacPrfKey failed");
                }
        }
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public Object mo7223f(C0627i1 c0627i1) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(c0627i1);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        switch (this.f143033w) {
            case 7:
                C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
                if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.AesCmacPrfKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to AesCmacPrfProtoSerialization.parseParameters: ")));
                }
                try {
                    C36369j c36369jM116333D = C36369j.m116333D(c36409p3.m116535F(), C5167p.m16298a());
                    if (c36369jM116333D.m116336B() == 0) {
                        if (c36409p3.m116533D() == EnumC36362h4.RAW) {
                            return C34121d.m107852b(c36369jM116333D.m116335A());
                        }
                        throw new GeneralSecurityException("Parsing AesCmacPrfParameters failed: only RAW output prefix type is accepted");
                    }
                    throw new GeneralSecurityException("Parsing AesCmacPrfParameters failed: unknown Version " + c36369jM116333D.m116336B());
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing AesCmacPrfParameters failed: ", e5);
                }
            case 11:
                C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
                if (!c36409p4.m116534E().equals("type.googleapis.com/google.crypto.tink.HkdfPrfKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p4, new StringBuilder("Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: ")));
                }
                try {
                    C36378k2 c36378k2M116382F = C36378k2.m116382F(c36409p4.m116535F(), C5167p.m16298a());
                    if (c36378k2M116382F.m116386D() != 0) {
                        throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: unknown Version " + c36378k2M116382F.m116386D());
                    }
                    if (c36409p4.m116533D() != EnumC36362h4.RAW) {
                        throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted");
                    }
                    C31983m2 c31983m2M107854b = C34125h.m107854b();
                    c31983m2M107854b.m99493t(c36378k2M116382F.m116384B());
                    c31983m2M107854b.f132769x = AbstractC35203b.m111543b(c36378k2M116382F.m116385C().m116427C());
                    C11105a c11105aM30034a = C11105a.m30034a(c36378k2M116382F.m116385C().m116428D().m16174g());
                    if (c11105aM30034a.f35302a.length == 0) {
                        c31983m2M107854b.f132770y = null;
                    } else {
                        c31983m2M107854b.f132770y = c11105aM30034a;
                    }
                    return c31983m2M107854b.m99480c();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: ", e13);
                }
            case 15:
                C36409p3 c36409p5 = (C36409p3) c5101l0.f21444y;
                if (!c36409p5.m116534E().equals("type.googleapis.com/google.crypto.tink.HmacPrfKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p5, new StringBuilder("Wrong type URL in call to HmacPrfProtoSerialization.parseParameters: ")));
                }
                try {
                    C36450w2 c36450w2M116731F = C36450w2.m116731F(c36409p5.m116535F(), C5167p.m16298a());
                    if (c36450w2M116731F.m116735D() != 0) {
                        throw new GeneralSecurityException("Parsing HmacPrfParameters failed: unknown Version " + c36450w2M116731F.m116735D());
                    }
                    if (c36409p5.m116533D() != EnumC36362h4.RAW) {
                        throw new GeneralSecurityException("Parsing HmacPrfParameters failed: only RAW output prefix type is accepted");
                    }
                    C28539n0 c28539n0M107855b = C34128k.m107855b();
                    c28539n0M107855b.m86840l(c36450w2M116731F.m116733B());
                    c28539n0M107855b.f115463y = AbstractC35204c.m111545b(c36450w2M116731F.m116734C().m116794B());
                    return c28539n0M107855b.m86834d();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing HmacPrfParameters failed: ", e14);
                }
            default:
                C36409p3 c36409p6 = (C36409p3) c5101l0.f21444y;
                if (!c36409p6.m116534E().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p6, new StringBuilder("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ")));
                }
                try {
                    C36341e1 c36341e1M116213C = C36341e1.m116213C(c36409p6.m116535F(), C5167p.m16298a());
                    C41113q c41113qM120650b = C37581c.m120650b();
                    c41113qM120650b.f177226z = AbstractC38633b.m123836e(c36341e1M116213C.m116215A().m116262F());
                    c41113qM120650b.f177224x = AbstractC38633b.m123838g(c36341e1M116213C.m116215A().m116261E());
                    c41113qM120650b.f177225y = AbstractC38633b.m123835d(c36341e1M116213C.m116215A().m116260C());
                    c41113qM120650b.f177222E = AbstractC38633b.m123839h(c36409p6.m116533D());
                    return c41113qM120650b.m133468o();
                } catch (InvalidProtocolBufferException e15) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e15);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5091g0
    /* JADX INFO: renamed from: h */
    public Object mo7225h(AbstractC34132o abstractC34132o) throws GeneralSecurityException {
        switch (this.f143033w) {
            case 0:
                C34118a c34118a = (C34118a) abstractC34132o;
                if (c34118a.f143031b.f143037a == 32) {
                    return C1980x.m6030b(c34118a);
                }
                throw new GeneralSecurityException("Key size must be 32 bytes");
            case 1:
                C34122e c34122e = (C34122e) abstractC34132o;
                AbstractC34123f.m107853a(c34122e.f143038b);
                return C3615b.m10977b(c34122e);
            case 2:
                C34122e c34122e2 = (C34122e) abstractC34132o;
                AbstractC34123f.m107853a(c34122e2.f143038b);
                return C34133p.m107903c(C3615b.m10977b(c34122e2));
            case 3:
                return C1981y.m6032b((C34126i) abstractC34132o);
            case 4:
                return C34133p.m107902b((C5110q) abstractC34132o);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            default:
                return C1957b0.m5969a((C37604z) abstractC34132o);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C1965i.m5998a((C37582d) abstractC34132o);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C1966j.m6003a((C37583e) abstractC34132o);
            case 20:
                return C1970n.m6019b((C37587i) abstractC34132o);
            case 21:
                return C1971o.m6022b((C37589k) abstractC34132o);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C1970n.m6018a((C5110q) abstractC34132o);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C1971o.m6021a((C5110q) abstractC34132o);
            case 24:
                return C1965i.m5999b((C37596r) abstractC34132o);
            case 25:
                return C1955a0.m5966a((C37597s) abstractC34132o);
            case 26:
                return C1970n.m6020c((C37603y) abstractC34132o);
        }
    }
}

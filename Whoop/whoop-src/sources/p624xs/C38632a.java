package p624xs;

import androidx.health.platform.client.proto.C1533u;
import at.C1954a;
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
import io.getstream.chat.android.p226ui.navigation.ChatNavigationHandler;
import io.getstream.chat.android.p226ui.navigation.ChatNavigator;
import io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination;
import io.sentry.InterfaceC20460p6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import m63.C25126d;
import p075ct.C11105a;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p505ts.AbstractC34132o;
import p560vs.C36316a2;
import p560vs.C36323b2;
import p560vs.C36330c2;
import p560vs.C36359h1;
import p560vs.C36365i1;
import p560vs.C36374j4;
import p560vs.C36377k1;
import p560vs.C36380k4;
import p560vs.C36386l4;
import p560vs.C36392m4;
import p560vs.C36398n4;
import p560vs.C36399o;
import p560vs.C36403o3;
import p560vs.C36404o4;
import p560vs.C36405p;
import p560vs.C36409p3;
import p560vs.C36411q;
import p560vs.C36416q4;
import p560vs.C36417r;
import p560vs.C36422r4;
import p560vs.C36428s4;
import p560vs.C36446v4;
import p560vs.C36452w4;
import p560vs.C36461y1;
import p560vs.C36464y4;
import p560vs.C36467z1;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p581we.C37199o;
import p659ys.C39739a;
import p659ys.C39742d;
import p659ys.C39743e;
import p659ys.C39748j;
import p691zs.AbstractC41074b;
import p692zt.C41113q;
import pg3.C29205p;
import q30.C29938w0;
import ro.C31624i;
import ws.C37581c;
import ws.C37582d;
import ws.C37583e;
import ws.C37585g;
import ws.C37586h;
import ws.C37587i;
import ws.C37589k;
import ws.C37592n;
import ws.C37593o;
import ws.C37594p;
import ws.C37595q;
import ws.C37596r;
import ws.C37597s;
import ws.C37599u;
import ws.C37600v;
import ws.C37601w;
import ws.C37602x;
import ws.C37603y;
import ws.C37604z;

/* JADX INFO: renamed from: xs.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C38632a implements InterfaceC5104n, InterfaceC5100l, InterfaceC5087e0, InterfaceC5083c0, InterfaceC20460p6, InterfaceC5091g0, ChatNavigationHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166142w;

    public /* synthetic */ C38632a(int i13) {
        this.f166142w = i13;
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        switch (this.f166142w) {
            case 4:
                C36403o3 c36403o3M116529G = C36409p3.m116529G();
                c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                c36403o3M116529G.m116485i(C36461y1.m116789z().m16109f());
                c36403o3M116529G.m116483g((EnumC36362h4) AbstractC38634c.f166155g.m119215U(((C37586h) abstractC14733k).f160735a));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
            case 10:
                C37595q c37595q = (C37595q) abstractC14733k;
                C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
                c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                C36374j4 c36374j4M116392F = C36380k4.m116392F();
                C36386l4 c36386l4M116438C = C36392m4.m116438C();
                c36386l4M116438C.m116418g((EnumC36354g2) AbstractC38635d.f166163h.m119215U(c37595q.f160784d));
                c36374j4M116392F.m116361h((C36392m4) c36386l4M116438C.m16347b());
                c36374j4M116392F.m116360g(c37595q.f160781a);
                c36374j4M116392F.m116362i(AbstractC38635d.m123841b(c37595q.f160782b));
                c36403o3M116529G2.m116485i(((C36380k4) c36374j4M116392F.m16347b()).m16109f());
                c36403o3M116529G2.m116483g((EnumC36362h4) AbstractC38635d.f166162g.m119215U(c37595q.f160783c));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G2.m16347b());
            case 16:
                C37602x c37602x = (C37602x) abstractC14733k;
                C36403o3 c36403o3M116529G3 = C36409p3.m116529G();
                c36403o3M116529G3.m116484h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                C36422r4 c36422r4M116607F = C36428s4.m116607F();
                c36422r4M116607F.m116589h(AbstractC38636e.m123845c(c37602x));
                c36422r4M116607F.m116588g(c37602x.f160820a);
                c36422r4M116607F.m116590i(AbstractC38636e.m123844b(c37602x.f160821b));
                c36403o3M116529G3.m116485i(((C36428s4) c36422r4M116607F.m16347b()).m16109f());
                c36403o3M116529G3.m116483g((EnumC36362h4) AbstractC38636e.f166170g.m119215U(c37602x.f160822c));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G3.m16347b());
            default:
                C39742d c39742d = (C39742d) abstractC14733k;
                C36403o3 c36403o3M116529G4 = C36409p3.m116529G();
                c36403o3M116529G4.m116484h("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
                C36411q c36411qM116566D = C36417r.m116566D();
                c36411qM116566D.m116539g(c39742d.f171105a.intValue());
                c36411qM116566D.m116540h(AbstractC41074b.m133375d(c39742d));
                c36403o3M116529G4.m116485i(((C36417r) c36411qM116566D.m16347b()).m16109f());
                c36403o3M116529G4.m116483g(EnumC36362h4.RAW);
                return C5101l0.m16023G((C36409p3) c36403o3M116529G4.m16347b());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        switch (this.f166142w) {
            case 0:
                C37583e c37583e = (C37583e) abstractC34132o;
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", AbstractC38633b.m123834c(c37583e).m16109f(), EnumC36385l3.ASYMMETRIC_PUBLIC, AbstractC38633b.m123837f(c37583e.f160720b.f160717d), c37583e.f160723e);
            case 2:
                C37582d c37582d = (C37582d) abstractC34132o;
                int iM123832a = AbstractC38633b.m123832a(c37582d.f160718b.f160720b.f160715b);
                C36359h1 c36359h1M116312F = C36365i1.m116312F();
                C37583e c37583e2 = c37582d.f160718b;
                c36359h1M116312F.m116292h(AbstractC38633b.m123834c(c37583e2));
                byte[] bArrM15950w = AbstractC5078a.m15950w(iM123832a, c37582d.f160719c.m97713u(C14738p.f54475a));
                c36359h1M116312F.m116291g(AbstractC5146i.m16173d(bArrM15950w, 0, bArrM15950w.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((C36365i1) c36359h1M116312F.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PRIVATE, AbstractC38633b.m123837f(c37583e2.f160720b.f160717d), c37582d.mo16076z());
            case 6:
                C37589k c37589k = (C37589k) abstractC34132o;
                C36323b2 c36323b2M116178E = C36330c2.m116178E();
                byte[] bArrM30035b = c37589k.f160745c.m30035b();
                c36323b2M116178E.m116167g(AbstractC5146i.m16173d(bArrM30035b, 0, bArrM30035b.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", ((C36330c2) c36323b2M116178E.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PUBLIC, (EnumC36362h4) AbstractC38634c.f166155g.m119215U(c37589k.f160744b.f160735a), c37589k.f160747e);
            case 8:
                C37587i c37587i = (C37587i) abstractC34132o;
                C36467z1 c36467z1M116126F = C36316a2.m116126F();
                C37589k c37589k2 = c37587i.f160736b;
                C36323b2 c36323b2M116178E2 = C36330c2.m116178E();
                byte[] bArrM30035b2 = c37589k2.f160745c.m30035b();
                c36323b2M116178E2.m116167g(AbstractC5146i.m16173d(bArrM30035b2, 0, bArrM30035b2.length));
                c36467z1M116126F.m116824h((C36330c2) c36323b2M116178E2.m16347b());
                byte[] bArrM97703F = c37587i.f160737c.m97703F(C14738p.f54475a);
                c36467z1M116126F.m116823g(AbstractC5146i.m16173d(bArrM97703F, 0, bArrM97703F.length));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((C36316a2) c36467z1M116126F.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PRIVATE, (EnumC36362h4) AbstractC38634c.f166155g.m119215U(c37587i.f160736b.f160744b.f160735a), c37587i.mo16076z());
            case 12:
                C37597s c37597s = (C37597s) abstractC34132o;
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", AbstractC38635d.m123842c(c37597s).m16109f(), EnumC36385l3.ASYMMETRIC_PUBLIC, (EnumC36362h4) AbstractC38635d.f166162g.m119215U(c37597s.f160792b.f160783c), c37597s.f160795e);
            case 14:
                C37596r c37596r = (C37596r) abstractC34132o;
                C36398n4 c36398n4M116494Q = C36404o4.m116494Q();
                c36398n4M116494Q.m116468o();
                c36398n4M116494Q.m116466l(AbstractC38635d.m123842c(c37596r.f160785b));
                C31624i c31624i = c37596r.f160786c;
                C14738p c14738p = C14738p.f54475a;
                c36398n4M116494Q.m116462h(AbstractC38635d.m123841b(c31624i.m97713u(c14738p)));
                c36398n4M116494Q.m116465k(AbstractC38635d.m123841b(c37596r.f160787d.m97713u(c14738p)));
                c36398n4M116494Q.m116467n(AbstractC38635d.m123841b(c37596r.f160788e.m97713u(c14738p)));
                c36398n4M116494Q.m116463i(AbstractC38635d.m123841b(c37596r.f160789f.m97713u(c14738p)));
                c36398n4M116494Q.m116464j(AbstractC38635d.m123841b(c37596r.f160790g.m97713u(c14738p)));
                c36398n4M116494Q.m116461g(AbstractC38635d.m123841b(c37596r.f160791h.m97713u(c14738p)));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((C36404o4) c36398n4M116494Q.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PRIVATE, (EnumC36362h4) AbstractC38635d.f166162g.m119215U(c37596r.f160785b.f160792b.f160783c), c37596r.mo16076z());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C37604z c37604z = (C37604z) abstractC34132o;
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", AbstractC38636e.m123846d(c37604z).m16109f(), EnumC36385l3.ASYMMETRIC_PUBLIC, (EnumC36362h4) AbstractC38636e.f166170g.m119215U(c37604z.f160833b.f160822c), c37604z.f160836e);
            case 20:
                C37603y c37603y = (C37603y) abstractC34132o;
                C36446v4 c36446v4M116744Q = C36452w4.m116744Q();
                c36446v4M116744Q.m116722o();
                c36446v4M116744Q.m116720l(AbstractC38636e.m123846d(c37603y.f160826b));
                C31624i c31624i2 = c37603y.f160827c;
                C14738p c14738p2 = C14738p.f54475a;
                c36446v4M116744Q.m116716h(AbstractC38636e.m123844b(c31624i2.m97713u(c14738p2)));
                c36446v4M116744Q.m116719k(AbstractC38636e.m123844b(c37603y.f160828d.m97713u(c14738p2)));
                c36446v4M116744Q.m116721n(AbstractC38636e.m123844b(c37603y.f160829e.m97713u(c14738p2)));
                c36446v4M116744Q.m116717i(AbstractC38636e.m123844b(c37603y.f160830f.m97713u(c14738p2)));
                c36446v4M116744Q.m116718j(AbstractC38636e.m123844b(c37603y.f160831g.m97713u(c14738p2)));
                c36446v4M116744Q.m116715g(AbstractC38636e.m123844b(c37603y.f160832h.m97713u(c14738p2)));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((C36452w4) c36446v4M116744Q.m16347b()).m16109f(), EnumC36385l3.ASYMMETRIC_PRIVATE, (EnumC36362h4) AbstractC38636e.f166170g.m119215U(c37603y.f160826b.f160833b.f160822c), c37603y.mo16076z());
            default:
                C39739a c39739a = (C39739a) abstractC34132o;
                C36399o c36399oM116508F = C36405p.m116508F();
                byte[] bArrM97703F2 = c39739a.f171093c.m97703F(C14738p.f54475a);
                c36399oM116508F.m116469g(AbstractC5146i.m16173d(bArrM97703F2, 0, bArrM97703F2.length));
                c36399oM116508F.m116470h(AbstractC41074b.m133375d(c39739a.f171092b));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", ((C36405p) c36399oM116508F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, EnumC36362h4.RAW, null);
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f166142w) {
            case 1:
                String str = (String) c5099k0.f21439x;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    C36377k1 c36377k1M116373J = C36377k1.m116373J((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36377k1M116373J.m116377F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C41113q c41113qM120650b = C37581c.m120650b();
                    c41113qM120650b.f177226z = AbstractC38633b.m123836e(c36377k1M116373J.m116376E().m116262F());
                    c41113qM120650b.f177224x = AbstractC38633b.m123838g(c36377k1M116373J.m116376E().m116261E());
                    c41113qM120650b.f177225y = AbstractC38633b.m123835d(c36377k1M116373J.m116376E().m116260C());
                    c41113qM120650b.f177222E = AbstractC38633b.m123839h((EnumC36362h4) c5099k0.f21437F);
                    C37581c c37581cM133468o = c41113qM120650b.m133468o();
                    C29938w0 c29938w0 = new C29938w0(22, false);
                    c29938w0.m91552H(c37581cM133468o);
                    c29938w0.m91555K(new ECPoint(AbstractC5078a.m15934g(c36377k1M116373J.m116378G().m16174g()), AbstractC5078a.m15934g(c36377k1M116373J.m116379H().m16174g())));
                    c29938w0.m91547C((Integer) c5099k0.f21438w);
                    return c29938w0.m91564j();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 3:
                String str2 = (String) c5099k0.f21439x;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + str2);
                }
                try {
                    C36365i1 c36365i1M116313G = C36365i1.m116313G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36365i1M116313G.m116318E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C36377k1 c36377k1M116317D = c36365i1M116313G.m116317D();
                    C41113q c41113qM120650b2 = C37581c.m120650b();
                    c41113qM120650b2.f177226z = AbstractC38633b.m123836e(c36377k1M116317D.m116376E().m116262F());
                    c41113qM120650b2.f177224x = AbstractC38633b.m123838g(c36377k1M116317D.m116376E().m116261E());
                    c41113qM120650b2.f177225y = AbstractC38633b.m123835d(c36377k1M116317D.m116376E().m116260C());
                    c41113qM120650b2.f177222E = AbstractC38633b.m123839h((EnumC36362h4) c5099k0.f21437F);
                    C37581c c37581cM133468o2 = c41113qM120650b2.m133468o();
                    C29938w0 c29938w1 = new C29938w0(22, false);
                    c29938w1.m91552H(c37581cM133468o2);
                    c29938w1.m91555K(new ECPoint(AbstractC5078a.m15934g(c36377k1M116317D.m116378G().m16174g()), AbstractC5078a.m15934g(c36377k1M116317D.m116379H().m16174g())));
                    c29938w1.m91547C((Integer) c5099k0.f21438w);
                    C37583e c37583eM91564j = c29938w1.m91564j();
                    C29205p c29205p = new C29205p(12);
                    c29205p.m88714k(c37583eM91564j);
                    c29205p.m88713j(C31624i.m97698s(AbstractC5078a.m15934g(c36365i1M116313G.m116316C().m16174g())));
                    return c29205p.m88709e();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 7:
                String str3 = (String) c5099k0.f21439x;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + str3);
                }
                try {
                    C36330c2 c36330c2M116179F = C36330c2.m116179F((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36330c2M116179F.m116183D() == 0) {
                        return C37589k.m120652Y((C37585g) AbstractC38634c.f166155g.m119203F((EnumC36362h4) c5099k0.f21437F), C11105a.m30034a(c36330c2M116179F.m116182C().m16174g()), (Integer) c5099k0.f21438w);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 9:
                C14738p c14738p = C14738p.f54475a;
                String str4 = (String) c5099k0.f21439x;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + str4);
                }
                try {
                    C36316a2 c36316a2M116127G = C36316a2.m116127G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36316a2M116127G.m116132E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return C37587i.m120651Y(C37589k.m120652Y((C37585g) AbstractC38634c.f166155g.m119203F((EnumC36362h4) c5099k0.f21437F), C11105a.m30034a(c36316a2M116127G.m116131D().m116182C().m16174g()), (Integer) c5099k0.f21438w), C31624i.m97697r(c36316a2M116127G.m116130C().m16174g(), c14738p));
                } catch (InvalidProtocolBufferException unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 13:
                String str5 = (String) c5099k0.f21439x;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + str5);
                }
                try {
                    C36416q4 c36416q4M116558J = C36416q4.m116558J((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36416q4M116558J.m116564H() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerM15934g = AbstractC5078a.m15934g(c36416q4M116558J.m116562F().m16174g());
                    int iBitLength = bigIntegerM15934g.bitLength();
                    C37592n c37592nM120654b = C37595q.m120654b();
                    c37592nM120654b.f160769c = (C37593o) AbstractC38635d.f166163h.m119203F(c36416q4M116558J.m116563G().m116440B());
                    c37592nM120654b.f160768b = AbstractC5078a.m15934g(c36416q4M116558J.m116561E().m16174g());
                    c37592nM120654b.f160767a = Integer.valueOf(iBitLength);
                    c37592nM120654b.f160770d = (C37594p) AbstractC38635d.f166162g.m119203F((EnumC36362h4) c5099k0.f21437F);
                    C37595q c37595qM120653a = c37592nM120654b.m120653a();
                    C29938w0 c29938w2 = new C29938w0(23, false);
                    c29938w2.m91553I(c37595qM120653a);
                    c29938w2.m91549E(bigIntegerM15934g);
                    c29938w2.m91547C((Integer) c5099k0.f21438w);
                    return c29938w2.m91565k();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 15:
                String str6 = (String) c5099k0.f21439x;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + str6);
                }
                try {
                    C36404o4 c36404o4M116495R = C36404o4.m116495R((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36404o4M116495R.m116505P() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C36416q4 c36416q4M116503N = c36404o4M116495R.m116503N();
                    BigInteger bigIntegerM15934g2 = AbstractC5078a.m15934g(c36416q4M116503N.m116562F().m16174g());
                    int iBitLength2 = bigIntegerM15934g2.bitLength();
                    BigInteger bigIntegerM15934g3 = AbstractC5078a.m15934g(c36416q4M116503N.m116561E().m16174g());
                    C37592n c37592nM120654b2 = C37595q.m120654b();
                    c37592nM120654b2.f160769c = (C37593o) AbstractC38635d.f166163h.m119203F(c36416q4M116503N.m116563G().m116440B());
                    c37592nM120654b2.f160768b = bigIntegerM15934g3;
                    c37592nM120654b2.f160767a = Integer.valueOf(iBitLength2);
                    c37592nM120654b2.f160770d = (C37594p) AbstractC38635d.f166162g.m119203F((EnumC36362h4) c5099k0.f21437F);
                    C37595q c37595qM120653a2 = c37592nM120654b2.m120653a();
                    C29938w0 c29938w3 = new C29938w0(23, false);
                    c29938w3.m91553I(c37595qM120653a2);
                    c29938w3.m91549E(bigIntegerM15934g2);
                    c29938w3.m91547C((Integer) c5099k0.f21438w);
                    C37597s c37597sM91565k = c29938w3.m91565k();
                    C25126d c25126d = new C25126d(11, false);
                    c25126d.m73689t(c37597sM91565k);
                    c25126d.m73687o(AbstractC38635d.m123840a(c36404o4M116495R.m116502M()), AbstractC38635d.m123840a(c36404o4M116495R.m116504O()));
                    c25126d.m73688r(AbstractC38635d.m123840a(c36404o4M116495R.m116499J()));
                    c25126d.m73686k(AbstractC38635d.m123840a(c36404o4M116495R.m116500K()), AbstractC38635d.m123840a(c36404o4M116495R.m116501L()));
                    c25126d.m73685j(AbstractC38635d.m123840a(c36404o4M116495R.m116498I()));
                    return c25126d.m73679a();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str7 = (String) c5099k0.f21439x;
                if (!str7.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: " + str7);
                }
                try {
                    C36464y4 c36464y4M116805K = C36464y4.m116805K((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36464y4M116805K.m116811I() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerM15934g4 = AbstractC5078a.m15934g(c36464y4M116805K.m116809G().m16174g());
                    int iBitLength3 = bigIntegerM15934g4.bitLength();
                    C37599u c37599uM120657b = C37602x.m120657b();
                    C37199o c37199o = AbstractC38636e.f166171h;
                    c37599uM120657b.f160806c = (C37600v) c37199o.m119203F(c36464y4M116805K.m116810H().m116685F());
                    c37599uM120657b.f160807d = (C37600v) c37199o.m119203F(c36464y4M116805K.m116810H().m116683D());
                    c37599uM120657b.f160805b = AbstractC5078a.m15934g(c36464y4M116805K.m116808F().m16174g());
                    c37599uM120657b.f160804a = Integer.valueOf(iBitLength3);
                    c37599uM120657b.m120656b(c36464y4M116805K.m116810H().m116684E());
                    c37599uM120657b.f160809f = (C37601w) AbstractC38636e.f166170g.m119203F((EnumC36362h4) c5099k0.f21437F);
                    C37602x c37602xM120655a = c37599uM120657b.m120655a();
                    C29938w0 c29938w4 = new C29938w0(24, false);
                    c29938w4.m91554J(c37602xM120655a);
                    c29938w4.m91549E(bigIntegerM15934g4);
                    c29938w4.m91547C((Integer) c5099k0.f21438w);
                    return c29938w4.m91566l();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            default:
                String str8 = (String) c5099k0.f21439x;
                if (!str8.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: " + str8);
                }
                try {
                    C36452w4 c36452w4M116745R = C36452w4.m116745R((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36452w4M116745R.m116755P() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C36464y4 c36464y4M116753N = c36452w4M116745R.m116753N();
                    BigInteger bigIntegerM15934g5 = AbstractC5078a.m15934g(c36464y4M116753N.m116809G().m16174g());
                    int iBitLength4 = bigIntegerM15934g5.bitLength();
                    BigInteger bigIntegerM15934g6 = AbstractC5078a.m15934g(c36464y4M116753N.m116808F().m16174g());
                    C37599u c37599uM120657b2 = C37602x.m120657b();
                    C37199o c37199o2 = AbstractC38636e.f166171h;
                    c37599uM120657b2.f160806c = (C37600v) c37199o2.m119203F(c36464y4M116753N.m116810H().m116685F());
                    c37599uM120657b2.f160807d = (C37600v) c37199o2.m119203F(c36464y4M116753N.m116810H().m116683D());
                    c37599uM120657b2.f160805b = bigIntegerM15934g6;
                    c37599uM120657b2.f160804a = Integer.valueOf(iBitLength4);
                    c37599uM120657b2.m120656b(c36464y4M116753N.m116810H().m116684E());
                    c37599uM120657b2.f160809f = (C37601w) AbstractC38636e.f166170g.m119203F((EnumC36362h4) c5099k0.f21437F);
                    C37602x c37602xM120655a2 = c37599uM120657b2.m120655a();
                    C29938w0 c29938w5 = new C29938w0(24, false);
                    c29938w5.m91554J(c37602xM120655a2);
                    c29938w5.m91549E(bigIntegerM15934g5);
                    c29938w5.m91547C((Integer) c5099k0.f21438w);
                    C37604z c37604zM91566l = c29938w5.m91566l();
                    C25126d c25126d2 = new C25126d(12, false);
                    c25126d2.m73690u(c37604zM91566l);
                    c25126d2.m73687o(AbstractC38636e.m123843a(c36452w4M116745R.m116752M()), AbstractC38636e.m123843a(c36452w4M116745R.m116754O()));
                    c25126d2.m73688r(AbstractC38636e.m123843a(c36452w4M116745R.m116749J()));
                    c25126d2.m73686k(AbstractC38636e.m123843a(c36452w4M116745R.m116750K()), AbstractC38636e.m123843a(c36452w4M116745R.m116751L()));
                    c25126d2.m73685j(AbstractC38636e.m123843a(c36452w4M116745R.m116748I()));
                    return c25126d2.m73680c();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused8) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        switch (this.f166142w) {
            case 5:
                C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
                if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ")));
                }
                try {
                    if (C36461y1.m116788B(c36409p3.m116535F(), C5167p.m16298a()).m116790A() == 0) {
                        return new C37586h((C37585g) AbstractC38634c.f166155g.m119203F(c36409p3.m116533D()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e5);
                }
            case 11:
                C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
                if (!c36409p4.m116534E().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p4, new StringBuilder("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ")));
                }
                try {
                    C36380k4 c36380k4M116393G = C36380k4.m116393G(c36409p4.m116535F(), C5167p.m16298a());
                    C37592n c37592nM120654b = C37595q.m120654b();
                    c37592nM120654b.f160769c = (C37593o) AbstractC38635d.f166163h.m119203F(c36380k4M116393G.m116396D().m116440B());
                    c37592nM120654b.f160768b = AbstractC5078a.m15934g(c36380k4M116393G.m116397E().m16174g());
                    c37592nM120654b.f160767a = Integer.valueOf(c36380k4M116393G.m116395C());
                    c37592nM120654b.f160770d = (C37594p) AbstractC38635d.f166162g.m119203F(c36409p4.m116533D());
                    return c37592nM120654b.m120653a();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e13);
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C36409p3 c36409p5 = (C36409p3) c5101l0.f21444y;
                if (!c36409p5.m116534E().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p5, new StringBuilder("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ")));
                }
                try {
                    C36428s4 c36428s4M116608G = C36428s4.m116608G(c36409p5.m116535F(), C5167p.m16298a());
                    C37599u c37599uM120657b = C37602x.m120657b();
                    C37199o c37199o = AbstractC38636e.f166171h;
                    c37599uM120657b.f160806c = (C37600v) c37199o.m119203F(c36428s4M116608G.m116611D().m116685F());
                    c37599uM120657b.f160807d = (C37600v) c37199o.m119203F(c36428s4M116608G.m116611D().m116683D());
                    c37599uM120657b.f160805b = AbstractC5078a.m15934g(c36428s4M116608G.m116612E().m16174g());
                    c37599uM120657b.f160804a = Integer.valueOf(c36428s4M116608G.m116610C());
                    c37599uM120657b.m120656b(c36428s4M116608G.m116611D().m116684E());
                    c37599uM120657b.f160809f = (C37601w) AbstractC38636e.f166170g.m119203F(c36409p5.m116533D());
                    return c37599uM120657b.m120655a();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e14);
                }
            default:
                C36409p3 c36409p6 = (C36409p3) c5101l0.f21444y;
                if (!c36409p6.m116534E().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p6, new StringBuilder("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ")));
                }
                try {
                    C36417r c36417rM116567E = C36417r.m116567E(c36409p6.m116535F(), C5167p.m16298a());
                    return AbstractC41074b.m133373b(c36417rM116567E.m116570C(), c36417rM116567E.m116569B());
                } catch (InvalidProtocolBufferException e15) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e15);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5091g0
    /* JADX INFO: renamed from: h */
    public Object mo7225h(AbstractC34132o abstractC34132o) {
        switch (this.f166142w) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C1954a.m5964a((C39739a) abstractC34132o);
            case 24:
                return C1954a.m5965b((C39743e) abstractC34132o);
            default:
                return C39748j.m127162a((C5110q) abstractC34132o);
        }
    }

    @Override // io.getstream.chat.android.p226ui.navigation.ChatNavigationHandler
    public boolean navigate(ChatDestination chatDestination) {
        ChatNavigator.EMPTY_HANDLER$lambda$0(chatDestination);
        return false;
    }
}

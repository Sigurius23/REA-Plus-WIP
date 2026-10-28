package com.google.crypto.tink.internal;

import a00.C0072g;
import androidx.health.platform.client.proto.C1533u;
import at.C1969m;
import at.C1977u;
import at.EnumC1972p;
import gm.C15990r;
import gs.C16122a0;
import gs.C16126c0;
import gs.C16130e0;
import gs.C16132f0;
import gs.C16138i0;
import gs.C16141k;
import gs.C16142k0;
import gs.C16145n;
import gs.C16148q;
import gs.C16151t;
import gs.C16152u;
import gs.C16154w;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import ls.AbstractC24705b;
import ls.C24707d;
import m63.C25126d;
import p075ct.C11105a;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p347ns.C27081b;
import p347ns.C27085f;
import p347ns.C27086g;
import p347ns.C27087h;
import p347ns.C27090k;
import p347ns.C27092m;
import p347ns.C27093n;
import p347ns.C27095p;
import p380os.AbstractC28304d;
import p436qs.C30560d;
import p436qs.C30568l;
import p477s2.AbstractC32073e;
import p499t9.C33652u;
import p505ts.AbstractC34123f;
import p505ts.AbstractC34132o;
import p505ts.C34118a;
import p505ts.C34121d;
import p505ts.C34125h;
import p505ts.C34128k;
import p560vs.C36391m3;
import p560vs.C36409p3;
import p659ys.C39739a;
import p659ys.C39742d;
import p659ys.C39743e;
import p659ys.C39745g;
import pg3.C29205p;
import q30.C29938w0;
import ro.C31624i;
import se.AbstractC32417h;
import so.C32800q;
import ws.C37581c;
import ws.C37583e;
import ws.C37586h;
import ws.C37587i;
import ws.C37589k;
import ws.C37595q;
import ws.C37597s;
import ws.C37602x;
import ws.C37604z;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5114s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21462a;

    public /* synthetic */ C5114s(int i13) {
        this.f21462a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC34132o m16080a(AbstractC14733k abstractC14733k) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        C31624i c31624iM97697r;
        C11105a c11105aM30034a;
        switch (this.f21462a) {
            case 0:
                C36409p3 c36409p3 = (C36409p3) ((C5112r) abstractC14733k).f21460a.f21444y;
                C5096j c5096j = C5096j.f21426d;
                C5108p c5108pM15971a = c5096j.m15971a(c36409p3.m116534E());
                if (!((Boolean) c5096j.f21428b.get(c36409p3.m116534E())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                C36391m3 c36391m3M16074b = c5108pM15971a.m16074b(c36409p3.m116535F());
                return new C5110q(C5099k0.m15980m(c36391m3M16074b.m116435E(), c36391m3M16074b.m116436F(), c36391m3M16074b.m116434D(), c36409p3.m116533D(), null));
            case 1:
                C16141k c16141k = (C16141k) abstractC14733k;
                int i13 = c16141k.f61325a;
                if (i13 != 16 && i13 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C0072g c0072g = new C0072g(10);
                c0072g.m175K(c16141k);
                c0072g.m173I(null);
                c0072g.m168D(C31624i.m97694A(i13));
                c0072g.m172H(C31624i.m97694A(c16141k.f61326b));
                return c0072g.m188f();
            case 2:
                C16145n c16145n = (C16145n) abstractC14733k;
                int i14 = c16145n.f61339a;
                if (i14 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C15990r c15990r = new C15990r(1);
                c15990r.m45152R(c16145n);
                c15990r.m45150P(null);
                c15990r.m45151Q(C31624i.m97694A(i14));
                return c15990r.m45171w();
            case 3:
                C16148q c16148q = (C16148q) abstractC14733k;
                int i15 = c16148q.f61352a;
                if (i15 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C15990r c15990r2 = new C15990r(2);
                c15990r2.m45153S(c16148q);
                c15990r2.m45150P(null);
                c15990r2.m45151Q(C31624i.m97694A(i15));
                return c15990r2.m45172x();
            case 4:
                C16151t c16151t = (C16151t) abstractC14733k;
                C15990r c15990r3 = new C15990r(3);
                c15990r3.m45154T(c16151t);
                c15990r3.m45150P(null);
                c15990r3.m45151Q(C31624i.m97694A(c16151t.f61364a));
                return c15990r3.m45173y();
            case 5:
                return C16152u.m45695Y(((C16154w) abstractC14733k).f61373a, C31624i.m97694A(32), null);
            case 6:
                return C16122a0.m45677Y((C16126c0) abstractC14733k, null);
            case 7:
                return C16130e0.m45686Y((C16132f0) abstractC14733k, null);
            case 8:
                return C16138i0.m45690Y(((C16142k0) abstractC14733k).f61331a, C31624i.m97694A(32), null);
            case 9:
                C24707d c24707d = (C24707d) abstractC14733k;
                AbstractC24705b.m72315a(c24707d);
                C15990r c15990r4 = new C15990r(15);
                c15990r4.m45155U(c24707d);
                c15990r4.m45150P(null);
                c15990r4.m45151Q(C31624i.m97694A(c24707d.f96635a));
                return c15990r4.m45174z();
            case 10:
                C27085f c27085f = (C27085f) abstractC14733k;
                C27081b c27081b = c27085f.f108263a;
                if (c27081b == C27081b.f108243b) {
                    eCParameterSpec = AbstractC5086e.f21407a;
                } else if (c27081b == C27081b.f108244c) {
                    eCParameterSpec = AbstractC5086e.f21408b;
                } else {
                    if (c27081b != C27081b.f108245d) {
                        throw new GeneralSecurityException("Unsupported curve type: " + c27081b);
                    }
                    eCParameterSpec = AbstractC5086e.f21409c;
                }
                KeyPair keyPairM99764w = AbstractC32073e.m99764w(eCParameterSpec);
                return C27086g.m81454Z(C27087h.m81457Z(c27085f, ((ECPublicKey) keyPairM99764w.getPublic()).getW(), null), C31624i.m97698s(((ECPrivateKey) keyPairM99764w.getPrivate()).getS()));
            case 11:
                C27092m c27092m = (C27092m) abstractC14733k;
                C27090k c27090k = c27092m.f108291a;
                boolean zEquals = c27090k.equals(C27090k.f108285G);
                C14738p c14738p = C14738p.f54475a;
                if (zEquals) {
                    byte[] bArrM101173D = AbstractC32417h.m101173D();
                    c31624iM97697r = C31624i.m97697r(bArrM101173D, c14738p);
                    c11105aM30034a = C11105a.m30034a(AbstractC32417h.m101187R(bArrM101173D));
                } else {
                    if (!c27090k.equals(C27090k.f108286z) && !c27090k.equals(C27090k.f108283E) && !c27090k.equals(C27090k.f108284F)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    EnumC1972p enumC1972pM85750d = AbstractC28304d.m85750d(c27090k);
                    KeyPair keyPairM99763v = AbstractC32073e.m99763v(enumC1972pM85750d);
                    C11105a c11105aM30034a2 = C11105a.m30034a(AbstractC32073e.m99729W(enumC1972pM85750d, ((ECPublicKey) keyPairM99763v.getPublic()).getW()));
                    c31624iM97697r = C31624i.m97697r(AbstractC5078a.m15950w(AbstractC28304d.m85747a(c27090k), ((ECPrivateKey) keyPairM99763v.getPrivate()).getS()), c14738p);
                    c11105aM30034a = c11105aM30034a2;
                }
                return C27093n.m81461Y(C27095p.m81465Y(c27092m, c11105aM30034a, null), c31624iM97697r);
            case 12:
                C30560d c30560d = (C30560d) abstractC14733k;
                int i16 = c30560d.f125761a;
                if (i16 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                C29938w0 c29938w0 = new C29938w0(1, false);
                c29938w0.m91550F(c30560d);
                c29938w0.m91546B(C31624i.m97694A(i16));
                c29938w0.m91547C(null);
                return c29938w0.m91561g();
            case 13:
                C30568l c30568l = (C30568l) abstractC14733k;
                C29938w0 c29938w1 = new C29938w0(2, false);
                c29938w1.m91551G(c30568l);
                c29938w1.m91548D(C31624i.m97694A(c30568l.f125789a));
                c29938w1.m91547C(null);
                return c29938w1.m91562h();
            case 14:
                C34121d c34121d = (C34121d) abstractC14733k;
                int i17 = c34121d.f143037a;
                if (i17 != 32) {
                    throw new GeneralSecurityException("Key size must be 32 bytes");
                }
                C31624i c31624iM97694A = C31624i.m97694A(i17);
                if (i17 == c31624iM97694A.m97702E()) {
                    return new C34118a(c34121d, c31624iM97694A);
                }
                throw new GeneralSecurityException("Key size mismatch");
            case 15:
                C34125h c34125h = (C34125h) abstractC14733k;
                AbstractC34123f.m107853a(c34125h);
                C32800q c32800q = new C32800q(3);
                c32800q.m102864h(c34125h);
                c32800q.m102862f(C31624i.m97694A(c34125h.f143056a));
                return c32800q.m102858b();
            case 16:
                C34128k c34128k = (C34128k) abstractC14733k;
                C33652u c33652u = new C33652u(2);
                c33652u.m106285g(c34128k);
                c33652u.m106284e(C31624i.m97694A(c34128k.f143066a));
                return c33652u.m106282a();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C37581c c37581c = (C37581c) abstractC14733k;
                KeyPair keyPairM99764w2 = AbstractC32073e.m99764w(c37581c.f160715b.f160697b);
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairM99764w2.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairM99764w2.getPrivate();
                C29938w0 c29938w2 = new C29938w0(22, false);
                c29938w2.m91552H(c37581c);
                c29938w2.m91547C(null);
                c29938w2.m91555K(eCPublicKey.getW());
                C37583e c37583eM91564j = c29938w2.m91564j();
                C29205p c29205p = new C29205p(12);
                c29205p.m88714k(c37583eM91564j);
                c29205p.m88713j(C31624i.m97698s(eCPrivateKey.getS()));
                return c29205p.m88709e();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C1969m c1969mM6013f = C1969m.m6013f();
                return C37587i.m120651Y(C37589k.m120652Y(((C37586h) abstractC14733k).f160735a, C11105a.m30034a(c1969mM6013f.m6017e()), null), C31624i.m97697r(c1969mM6013f.m6016d(), C14738p.f54475a));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C37595q c37595q = (C37595q) abstractC14733k;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C1977u.f7823f.m6028a();
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(c37595q.f160781a, new BigInteger(1, c37595q.f160782b.toByteArray())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                C29938w0 c29938w3 = new C29938w0(23, false);
                c29938w3.m91553I(c37595q);
                c29938w3.m91549E(rSAPublicKey.getModulus());
                c29938w3.m91547C(null);
                C37597s c37597sM91565k = c29938w3.m91565k();
                C25126d c25126d = new C25126d(11, false);
                c25126d.m73689t(c37597sM91565k);
                c25126d.m73687o(C31624i.m97698s(rSAPrivateCrtKey.getPrimeP()), C31624i.m97698s(rSAPrivateCrtKey.getPrimeQ()));
                c25126d.m73688r(C31624i.m97698s(rSAPrivateCrtKey.getPrivateExponent()));
                c25126d.m73686k(C31624i.m97698s(rSAPrivateCrtKey.getPrimeExponentP()), C31624i.m97698s(rSAPrivateCrtKey.getPrimeExponentQ()));
                c25126d.m73685j(C31624i.m97698s(rSAPrivateCrtKey.getCrtCoefficient()));
                return c25126d.m73679a();
            case 20:
                C37602x c37602x = (C37602x) abstractC14733k;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) C1977u.f7823f.m6028a();
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c37602x.f160820a, new BigInteger(1, c37602x.f160821b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                C29938w0 c29938w4 = new C29938w0(24, false);
                c29938w4.m91554J(c37602x);
                c29938w4.m91549E(rSAPublicKey2.getModulus());
                c29938w4.m91547C(null);
                C37604z c37604zM91566l = c29938w4.m91566l();
                C25126d c25126d2 = new C25126d(12, false);
                c25126d2.m73690u(c37604zM91566l);
                c25126d2.m73687o(C31624i.m97698s(rSAPrivateCrtKey2.getPrimeP()), C31624i.m97698s(rSAPrivateCrtKey2.getPrimeQ()));
                c25126d2.m73688r(C31624i.m97698s(rSAPrivateCrtKey2.getPrivateExponent()));
                c25126d2.m73686k(C31624i.m97698s(rSAPrivateCrtKey2.getPrimeExponentP()), C31624i.m97698s(rSAPrivateCrtKey2.getPrimeExponentQ()));
                c25126d2.m73685j(C31624i.m97698s(rSAPrivateCrtKey2.getCrtCoefficient()));
                return c25126d2.m73680c();
            case 21:
                C39742d c39742d = (C39742d) abstractC14733k;
                Integer num = c39742d.f171105a;
                C31624i c31624iM97694A2 = C31624i.m97694A(num.intValue());
                if (num.intValue() == c31624iM97694A2.m97702E()) {
                    return new C39739a(c39742d, c31624iM97694A2);
                }
                throw new GeneralSecurityException("Key size mismatch");
            default:
                C39745g c39745g = (C39745g) abstractC14733k;
                Integer num2 = c39745g.f171117a;
                C31624i c31624iM97694A3 = C31624i.m97694A(num2.intValue());
                if (num2.intValue() == c31624iM97694A3.m97702E()) {
                    return new C39743e(c39745g, c31624iM97694A3);
                }
                throw new GeneralSecurityException("Key size mismatch");
        }
    }
}

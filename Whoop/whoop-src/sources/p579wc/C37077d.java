package p579wc;

import cf.InterfaceC4526a;
import e73.C12803b;
import e93.AbstractC12889b;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p463rj.AbstractC31484o;
import p485sf.C32433e;
import p485sf.C32441m;
import p499t9.C33647p;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32306h;
import s93.AbstractC32309k;
import sb3.AbstractC32350a;
import se.AbstractC32416g;
import tg.AbstractC33769a;
import ug.C34913b;
import vg.C35973t;
import y83.C39347c;
import y83.EnumC39346b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wc.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C37077d implements InterfaceC4526a {

    /* JADX INFO: renamed from: a */
    public final String f158621a;

    public C37077d(String str) {
        this.f158621a = str;
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: c */
    public final Object mo14169c(C32433e c32433e, C32441m c32441m) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i13;
        char c3;
        int i14;
        String str = c32433e.f134268b.getUrl().f18375h;
        String strM125926K = AbstractC39421y.m125926K(AbstractC39421y.m125926K(this.f158621a, "-----BEGIN EC PRIVATE KEY-----", "", false), "-----END EC PRIVATE KEY-----", "", false);
        Pattern patternCompile = Pattern.compile("\\s");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strM125926K).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        String strM125926K2 = AbstractC39421y.m125926K(AbstractC39421y.m125926K(strReplaceAll, "\n", "", false), "\r", "", false);
        int[] iArr = AbstractC33769a.f141346a;
        byte[] bArrM125919D = AbstractC39421y.m125919D(strM125926K2);
        int length = bArrM125919D.length % 4;
        if (length != 0) {
            int i15 = 4 - length;
            byte[] bArr = new byte[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                bArr[i16] = 61;
            }
            bArrM125919D = AbstractC25260n.m74030F0(bArrM125919D, bArr);
        }
        char c7 = 3;
        int i17 = 2;
        boolean z4 = true;
        if (bArrM125919D.length == 0) {
            i13 = 0;
        } else {
            int length2 = bArrM125919D.length;
            if ((length2 & 3) != 0) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(length2, "invalid base64 string of length ", "; not a multiple of 4"));
            }
            i13 = ((length2 * 3) / 4) - ((length2 >= 2 && bArrM125919D[length2 - 1] == 61 && bArrM125919D[length2 - 2] == 61) ? 2 : bArrM125919D[length2 + (-1)] == 61 ? 1 : 0);
        }
        byte[] bArr2 = new byte[i13];
        int length3 = (bArrM125919D.length / 4) - 1;
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        while (true) {
            c3 = c7;
            if (i18 >= length3) {
                break;
            }
            int i25 = i19 + 3;
            int iM106775a = (AbstractC33769a.m106775a(bArrM125919D[i19]) << 18) | (AbstractC33769a.m106775a(bArrM125919D[i19 + 1]) << 12) | (AbstractC33769a.m106775a(bArrM125919D[i19 + 2]) << 6);
            i19 += 4;
            int i26 = i17;
            int iM106775a2 = iM106775a | (AbstractC33769a.m106775a(bArrM125919D[i25]) & 255);
            boolean z13 = z4;
            int i27 = i26;
            for (int i28 = -1; i28 < i27; i28 = -1) {
                bArr2[i24] = (byte) ((iM106775a2 >> (i27 * 8)) & 255);
                i27--;
                i24++;
            }
            i18++;
            c7 = c3;
            z4 = z13;
            i17 = i26;
        }
        boolean z14 = z4;
        if (length3 * 3 >= 0) {
            int iM106775a3 = AbstractC33769a.m106775a(bArrM125919D[i19]);
            int iM106775a4 = AbstractC33769a.m106775a(bArrM125919D[i19 + 1]);
            int iM106775a5 = AbstractC33769a.m106775a(bArrM125919D[i19 + 2]);
            int iM106775a6 = AbstractC33769a.m106775a(bArrM125919D[i19 + 3]);
            if (iM106775a3 == 255 || iM106775a4 == 255) {
                throw new IllegalArgumentException("decode base64: invalid padding");
            }
            int i29 = i24 + 1;
            bArr2[i24] = (byte) ((iM106775a3 << 2) | ((iM106775a4 >> 4) & 3));
            if (iM106775a5 != 255) {
                bArr2[i29] = (byte) (((iM106775a4 << 4) & 240) | ((iM106775a5 >> 2) & 15));
                i29 = i24 + 2;
            }
            if (iM106775a6 != 255) {
                bArr2[i29] = (byte) (iM106775a6 | ((iM106775a5 & 3) << 6));
            }
        }
        byte[] bArrM74070k0 = AbstractC25260n.m74070k0(bArr2, 7, 39);
        int i34 = 40;
        while (true) {
            if (i34 >= i13) {
                i14 = -1;
                break;
            }
            if (bArr2[i34] == 4) {
                i14 = i34 + 1;
                break;
            }
            i34++;
        }
        int i35 = (i13 - i14) / 2;
        int i36 = i14 + i35;
        byte[] bArrM96974z = AbstractC31484o.m96974z(AbstractC25260n.m74070k0(bArr2, i14, i36));
        byte[] bArrM96974z2 = AbstractC31484o.m96974z(AbstractC25260n.m74070k0(bArr2, i36, (i35 * 2) + i14));
        C39347c.f169348f.getClass();
        C39347c c39347c = C39347c.f169350h;
        EnumC39346b enumC39346b = EnumC39346b.f169347z;
        c39347c.getClass();
        if (c39347c.f169354d != enumC39346b) {
            c39347c = new C39347c(c39347c.f169351a, c39347c.f169352b, c39347c.f169353c, enumC39346b);
        }
        C12803b c12803b = new C12803b(false);
        c12803b.m35863f();
        c12803b.m35874q("typ");
        c12803b.m35875r("dpop+jwt");
        c12803b.m35874q("alg");
        c12803b.m35875r("ES256");
        c12803b.m35874q("jwk");
        c12803b.m35863f();
        c12803b.m35874q("kty");
        c12803b.m35875r("EC");
        c12803b.m35874q("x");
        c12803b.m35875r(C39347c.m125470b(c39347c, bArrM96974z));
        c12803b.m35874q("y");
        c12803b.m35875r(C39347c.m125470b(c39347c, bArrM96974z2));
        c12803b.m35874q("crv");
        c12803b.m35875r("P-256");
        c12803b.m35868k();
        c12803b.m35868k();
        byte[] bArrM35869l = c12803b.m35869l();
        C12803b c12803b2 = new C12803b(false);
        c12803b2.m35863f();
        c12803b2.m35874q("jti");
        char[] cArr = C35973t.f153162d;
        c12803b2.m35875r(AbstractC32350a.m100709q().f153170c);
        c12803b2.m35874q("htm");
        c12803b2.m35875r("POST");
        c12803b2.m35874q("htu");
        c12803b2.m35875r(str);
        c12803b2.m35874q("iat");
        C33647p c33647p = C34913b.f147015x;
        c12803b2.m35867j(Long.valueOf(C33647p.m106274t().f147018w.getEpochSecond()).toString());
        c12803b2.m35868k();
        String strM31992k = AbstractC11895b.m31992k('.', C39347c.m125470b(c39347c, bArrM35869l), C39347c.m125470b(c39347c, c12803b2.m35869l()));
        byte[] bArrM101164u = AbstractC32416g.m101164u(bArrM74070k0, AbstractC39421y.m125919D(strM31992k));
        int i37 = bArrM101164u[c3] & 255;
        byte[] bArrM74038N0 = AbstractC25260n.m74038N0(bArrM101164u, AbstractC12889b.m36278i0(4, 4 + i37));
        int i38 = i37 + 5;
        int i39 = i37 + 6;
        byte[] bArrM74038N1 = AbstractC25260n.m74038N0(bArrM101164u, AbstractC12889b.m36278i0(i39, (255 & bArrM101164u[i38]) + i39));
        ArrayList arrayList = new ArrayList();
        boolean z15 = false;
        for (byte b : bArrM74038N0) {
            if (z15) {
                arrayList.add(Byte.valueOf(b));
            } else if (b != 0) {
                arrayList.add(Byte.valueOf(b));
                z15 = z14;
            }
        }
        byte[] bArrM74162z1 = AbstractC25265s.m74162z1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        boolean z16 = false;
        for (byte b6 : bArrM74038N1) {
            if (z16) {
                arrayList2.add(Byte.valueOf(b6));
            } else if (b6 != 0) {
                arrayList2.add(Byte.valueOf(b6));
                z16 = z14;
            }
        }
        byte[] bArrM74162z2 = AbstractC25265s.m74162z1(arrayList2);
        if (bArrM74162z1.length < 32) {
            bArrM74162z1 = AbstractC25260n.m74030F0(new byte[32 - bArrM74162z1.length], bArrM74162z1);
        }
        if (bArrM74162z2.length < 32) {
            bArrM74162z2 = AbstractC25260n.m74030F0(new byte[32 - bArrM74162z2.length], bArrM74162z2);
        }
        String str2 = strM31992k + '.' + C39347c.m125470b(c39347c, AbstractC25260n.m74030F0(bArrM74162z1, bArrM74162z2));
        C35937b c35937bM100579i = AbstractC32309k.m100579i(c32433e.f134268b);
        AbstractC32306h.m100568q(c35937bM100579i, "DPoP", str2);
        return c35937bM100579i.m114177b();
    }
}

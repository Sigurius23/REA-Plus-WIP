package p094dn;

import ed3.C13117a;
import p309lo.AbstractC24567y;
import p588wm.InterfaceC37377s;

/* JADX INFO: renamed from: dn.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C12189i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37377s f40635a;

    /* JADX INFO: renamed from: d */
    public C12200t f40638d;

    /* JADX INFO: renamed from: e */
    public C12187g f40639e;

    /* JADX INFO: renamed from: f */
    public int f40640f;

    /* JADX INFO: renamed from: g */
    public int f40641g;

    /* JADX INFO: renamed from: h */
    public int f40642h;

    /* JADX INFO: renamed from: i */
    public int f40643i;

    /* JADX INFO: renamed from: l */
    public boolean f40646l;

    /* JADX INFO: renamed from: b */
    public final C12199s f40636b = new C12199s(0);

    /* JADX INFO: renamed from: c */
    public final C13117a f40637c = new C13117a();

    /* JADX INFO: renamed from: j */
    public final C13117a f40644j = new C13117a(1);

    /* JADX INFO: renamed from: k */
    public final C13117a f40645k = new C13117a();

    public C12189i(InterfaceC37377s interfaceC37377s, C12200t c12200t, C12187g c12187g) {
        this.f40635a = interfaceC37377s;
        this.f40638d = c12200t;
        this.f40639e = c12187g;
        this.f40638d = c12200t;
        this.f40639e = c12187g;
        interfaceC37377s.mo102730a(c12200t.f40751a.f40723f);
        m33803d();
    }

    /* JADX INFO: renamed from: a */
    public final C12198r m33800a() {
        if (!this.f40646l) {
            return null;
        }
        C12199s c12199s = this.f40636b;
        C12187g c12187g = (C12187g) c12199s.f40748o;
        int i13 = AbstractC24567y.f95875a;
        int i14 = c12187g.f40628a;
        C12198r c12198r = (C12198r) c12199s.f40749p;
        if (c12198r == null) {
            c12198r = this.f40638d.f40751a.f40728k[i14];
        }
        if (c12198r == null || !c12198r.f40729a) {
            return null;
        }
        return c12198r;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33801b() {
        this.f40640f++;
        if (!this.f40646l) {
            return false;
        }
        int i13 = this.f40641g + 1;
        this.f40641g = i13;
        int[] iArr = this.f40636b.f40739f;
        int i14 = this.f40642h;
        if (i13 != iArr[i14]) {
            return true;
        }
        this.f40642h = i14 + 1;
        this.f40641g = 0;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m33802c(int i13, int i14) {
        C13117a c13117a;
        C12198r c12198rM33800a = m33800a();
        if (c12198rM33800a == null) {
            return 0;
        }
        int length = c12198rM33800a.f40732d;
        C12199s c12199s = this.f40636b;
        if (length != 0) {
            c13117a = (C13117a) c12199s.f40750q;
        } else {
            byte[] bArr = c12198rM33800a.f40733e;
            int i15 = AbstractC24567y.f95875a;
            int length2 = bArr.length;
            C13117a c13117a2 = this.f40645k;
            c13117a2.m36687I(length2, bArr);
            length = bArr.length;
            c13117a = c13117a2;
        }
        boolean z4 = c12199s.f40743j && c12199s.f40744k[this.f40640f];
        boolean z13 = z4 || i14 != 0;
        C13117a c13117a3 = this.f40644j;
        c13117a3.f45381a[0] = (byte) ((z13 ? 128 : 0) | length);
        c13117a3.m36689K(0);
        InterfaceC37377s interfaceC37377s = this.f40635a;
        interfaceC37377s.mo102732c(1, c13117a3);
        interfaceC37377s.mo102732c(length, c13117a);
        if (!z13) {
            return length + 1;
        }
        C13117a c13117a4 = this.f40637c;
        if (!z4) {
            c13117a4.m36686H(8);
            byte[] bArr2 = c13117a4.f45381a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i14 & 255);
            bArr2[4] = (byte) ((i13 >> 24) & 255);
            bArr2[5] = (byte) ((i13 >> 16) & 255);
            bArr2[6] = (byte) ((i13 >> 8) & 255);
            bArr2[7] = (byte) (i13 & 255);
            interfaceC37377s.mo102732c(8, c13117a4);
            return length + 9;
        }
        C13117a c13117a5 = (C13117a) c12199s.f40750q;
        int iM36682D = c13117a5.m36682D();
        c13117a5.m36690L(-2);
        int i16 = (iM36682D * 6) + 2;
        if (i14 != 0) {
            c13117a4.m36686H(i16);
            byte[] bArr3 = c13117a4.f45381a;
            c13117a5.m36697g(bArr3, 0, i16);
            int i17 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i14;
            bArr3[2] = (byte) ((i17 >> 8) & 255);
            bArr3[3] = (byte) (i17 & 255);
        } else {
            c13117a4 = c13117a5;
        }
        interfaceC37377s.mo102732c(i16, c13117a4);
        return length + 1 + i16;
    }

    /* JADX INFO: renamed from: d */
    public final void m33803d() {
        C12199s c12199s = this.f40636b;
        c12199s.f40736c = 0;
        c12199s.f40746m = 0L;
        c12199s.f40747n = false;
        c12199s.f40743j = false;
        c12199s.f40745l = false;
        c12199s.f40749p = null;
        this.f40640f = 0;
        this.f40642h = 0;
        this.f40641g = 0;
        this.f40643i = 0;
        this.f40646l = false;
    }
}

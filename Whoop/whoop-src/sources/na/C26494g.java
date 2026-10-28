package na;

import p094dn.C12199s;
import p499t9.InterfaceC33639k0;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.C38059n;

/* JADX INFO: renamed from: na.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C26494g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC33639k0 f105212a;

    /* JADX INFO: renamed from: d */
    public C26504q f105215d;

    /* JADX INFO: renamed from: e */
    public C26491d f105216e;

    /* JADX INFO: renamed from: f */
    public int f105217f;

    /* JADX INFO: renamed from: g */
    public int f105218g;

    /* JADX INFO: renamed from: h */
    public int f105219h;

    /* JADX INFO: renamed from: i */
    public int f105220i;

    /* JADX INFO: renamed from: j */
    public final String f105221j;

    /* JADX INFO: renamed from: m */
    public boolean f105224m;

    /* JADX INFO: renamed from: b */
    public final C12199s f105213b = new C12199s(1);

    /* JADX INFO: renamed from: c */
    public final C38059n f105214c = new C38059n();

    /* JADX INFO: renamed from: k */
    public final C38059n f105222k = new C38059n(1);

    /* JADX INFO: renamed from: l */
    public final C38059n f105223l = new C38059n();

    public C26494g(InterfaceC33639k0 interfaceC33639k0, C26504q c26504q, C26491d c26491d, String str) {
        this.f105212a = interfaceC33639k0;
        this.f105215d = c26504q;
        this.f105216e = c26491d;
        this.f105221j = str;
        m78546e(c26504q, c26491d);
    }

    /* JADX INFO: renamed from: a */
    public final int m78542a() {
        int i13;
        if (this.f105224m) {
            i13 = this.f105213b.f40742i[this.f105217f] ? 1 : 0;
        } else {
            i13 = this.f105215d.f105334g[this.f105217f];
        }
        return m78543b() != null ? i13 | 1073741824 : i13;
    }

    /* JADX INFO: renamed from: b */
    public final C26503p m78543b() {
        if (!this.f105224m) {
            return null;
        }
        C12199s c12199s = this.f105213b;
        C26491d c26491d = (C26491d) c12199s.f40748o;
        int i13 = AbstractC38065t.f163031a;
        int i14 = c26491d.f105204a;
        C26503p c26503p = (C26503p) c12199s.f40749p;
        if (c26503p == null) {
            c26503p = this.f105215d.f105328a.f105322l[i14];
        }
        if (c26503p == null || !c26503p.f105323a) {
            return null;
        }
        return c26503p;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m78544c() {
        this.f105217f++;
        if (!this.f105224m) {
            return false;
        }
        int i13 = this.f105218g + 1;
        this.f105218g = i13;
        int[] iArr = this.f105213b.f40739f;
        int i14 = this.f105219h;
        if (i13 != iArr[i14]) {
            return true;
        }
        this.f105219h = i14 + 1;
        this.f105218g = 0;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m78545d(int i13, int i14) {
        C38059n c38059n;
        C26503p c26503pM78543b = m78543b();
        if (c26503pM78543b == null) {
            return 0;
        }
        int length = c26503pM78543b.f105326d;
        C12199s c12199s = this.f105213b;
        if (length != 0) {
            c38059n = (C38059n) c12199s.f40750q;
        } else {
            byte[] bArr = c26503pM78543b.f105327e;
            int i15 = AbstractC38065t.f163031a;
            int length2 = bArr.length;
            C38059n c38059n2 = this.f105223l;
            c38059n2.m121844D(length2, bArr);
            length = bArr.length;
            c38059n = c38059n2;
        }
        boolean z4 = c12199s.f40743j && c12199s.f40744k[this.f105217f];
        boolean z13 = z4 || i14 != 0;
        C38059n c38059n3 = this.f105222k;
        c38059n3.f163017a[0] = (byte) ((z13 ? 128 : 0) | length);
        c38059n3.m121846F(0);
        InterfaceC33639k0 interfaceC33639k0 = this.f105212a;
        interfaceC33639k0.mo36176d(c38059n3, 1, 1);
        interfaceC33639k0.mo36176d(c38059n, length, 1);
        if (!z13) {
            return length + 1;
        }
        C38059n c38059n4 = this.f105214c;
        if (!z4) {
            c38059n4.m121843C(8);
            byte[] bArr2 = c38059n4.f163017a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i14 & 255);
            bArr2[4] = (byte) ((i13 >> 24) & 255);
            bArr2[5] = (byte) ((i13 >> 16) & 255);
            bArr2[6] = (byte) ((i13 >> 8) & 255);
            bArr2[7] = (byte) (i13 & 255);
            interfaceC33639k0.mo36176d(c38059n4, 8, 1);
            return length + 9;
        }
        C38059n c38059n5 = (C38059n) c12199s.f40750q;
        int iM121873z = c38059n5.m121873z();
        c38059n5.m121847G(-2);
        int i16 = (iM121873z * 6) + 2;
        if (i14 != 0) {
            c38059n4.m121843C(i16);
            byte[] bArr3 = c38059n4.f163017a;
            c38059n5.m121852e(bArr3, 0, i16);
            int i17 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i14;
            bArr3[2] = (byte) ((i17 >> 8) & 255);
            bArr3[3] = (byte) (i17 & 255);
        } else {
            c38059n4 = c38059n5;
        }
        interfaceC33639k0.mo36176d(c38059n4, i16, 1);
        return length + 1 + i16;
    }

    /* JADX INFO: renamed from: e */
    public final void m78546e(C26504q c26504q, C26491d c26491d) {
        this.f105215d = c26504q;
        this.f105216e = c26491d;
        C34608o c34608oM109410a = c26504q.f105328a.f105317g.m109410a();
        c34608oM109410a.f145740l = AbstractC34587d0.m109382o(this.f105221j);
        this.f105212a.mo36173a(new C34610p(c34608oM109410a));
        m78547f();
    }

    /* JADX INFO: renamed from: f */
    public final void m78547f() {
        C12199s c12199s = this.f105213b;
        c12199s.f40736c = 0;
        c12199s.f40746m = 0L;
        c12199s.f40747n = false;
        c12199s.f40743j = false;
        c12199s.f40745l = false;
        c12199s.f40749p = null;
        this.f105217f = 0;
        this.f105219h = 0;
        this.f105218g = 0;
        this.f105220i = 0;
        this.f105224m = false;
    }
}

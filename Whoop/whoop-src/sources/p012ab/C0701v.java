package p012ab;

import p499t9.C33621b0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C0701v implements InterfaceC0685j {

    /* JADX INFO: renamed from: a */
    public final C38059n f2624a;

    /* JADX INFO: renamed from: b */
    public final C33621b0 f2625b;

    /* JADX INFO: renamed from: c */
    public final String f2626c;

    /* JADX INFO: renamed from: d */
    public final int f2627d;

    /* JADX INFO: renamed from: e */
    public final String f2628e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33639k0 f2629f;

    /* JADX INFO: renamed from: g */
    public String f2630g;

    /* JADX INFO: renamed from: h */
    public int f2631h = 0;

    /* JADX INFO: renamed from: i */
    public int f2632i;

    /* JADX INFO: renamed from: j */
    public boolean f2633j;

    /* JADX INFO: renamed from: k */
    public boolean f2634k;

    /* JADX INFO: renamed from: l */
    public long f2635l;

    /* JADX INFO: renamed from: m */
    public int f2636m;

    /* JADX INFO: renamed from: n */
    public long f2637n;

    public C0701v(String str, int i13, String str2) {
        C38059n c38059n = new C38059n(4);
        this.f2624a = c38059n;
        c38059n.f163017a[0] = -1;
        this.f2625b = new C33621b0(0);
        this.f2637n = -9223372036854775807L;
        this.f2626c = str;
        this.f2627d = i13;
        this.f2628e = str2;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        this.f2631h = 0;
        this.f2632i = 0;
        this.f2634k = false;
        this.f2637n = -9223372036854775807L;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) {
        AbstractC35849g.m113808j(this.f2629f);
        while (c38059n.m121848a() > 0) {
            int i13 = this.f2631h;
            C38059n c38059n2 = this.f2624a;
            if (i13 == 0) {
                byte[] bArr = c38059n.f163017a;
                int i14 = c38059n.f163018b;
                int i15 = c38059n.f163019c;
                while (true) {
                    if (i14 >= i15) {
                        c38059n.m121846F(i15);
                        break;
                    }
                    byte b = bArr[i14];
                    boolean z4 = (b & 255) == 255;
                    boolean z13 = this.f2634k && (b & 224) == 224;
                    this.f2634k = z4;
                    if (z13) {
                        c38059n.m121846F(i14 + 1);
                        this.f2634k = false;
                        c38059n2.f163017a[1] = bArr[i14];
                        this.f2632i = 2;
                        this.f2631h = 1;
                        break;
                    }
                    i14++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(c38059n.m121848a(), 4 - this.f2632i);
                c38059n.m121852e(c38059n2.f163017a, this.f2632i, iMin);
                int i16 = this.f2632i + iMin;
                this.f2632i = i16;
                if (i16 >= 4) {
                    c38059n2.m121846F(0);
                    int iM121854g = c38059n2.m121854g();
                    C33621b0 c33621b0 = this.f2625b;
                    if (c33621b0.m106233a(iM121854g)) {
                        this.f2636m = c33621b0.f140345d;
                        if (!this.f2633j) {
                            this.f2635l = (((long) c33621b0.f140349h) * 1000000) / ((long) c33621b0.f140346e);
                            C34608o c34608o = new C34608o();
                            c34608o.f145729a = this.f2630g;
                            c34608o.f145740l = AbstractC34587d0.m109382o(this.f2628e);
                            c34608o.f145741m = AbstractC34587d0.m109382o(c33621b0.f140344c);
                            c34608o.f145742n = 4096;
                            c34608o.f145719C = c33621b0.f140347f;
                            c34608o.f145720D = c33621b0.f140346e;
                            c34608o.f145732d = this.f2626c;
                            c34608o.f145734f = this.f2627d;
                            this.f2629f.mo36173a(new C34610p(c34608o));
                            this.f2633j = true;
                        }
                        c38059n2.m121846F(0);
                        this.f2629f.mo36176d(c38059n2, 4, 0);
                        this.f2631h = 2;
                    } else {
                        this.f2632i = 0;
                        this.f2631h = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c38059n.m121848a(), this.f2636m - this.f2632i);
                this.f2629f.mo36176d(c38059n, iMin2, 0);
                int i17 = this.f2632i + iMin2;
                this.f2632i = i17;
                if (i17 >= this.f2636m) {
                    AbstractC35849g.m113807i(this.f2637n != -9223372036854775807L);
                    this.f2629f.mo36174b(this.f2637n, 1, this.f2636m, 0, null);
                    this.f2637n += this.f2635l;
                    this.f2632i = 0;
                    this.f2631h = 0;
                }
            }
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2637n = j7;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2630g = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        this.f2629f = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
    }
}

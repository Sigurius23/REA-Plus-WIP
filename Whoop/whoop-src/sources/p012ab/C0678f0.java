package p012ab;

import no.nordicsemi.android.dfu.DfuBaseService;
import p499t9.InterfaceC33648q;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.C38064s;

/* JADX INFO: renamed from: ab.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0678f0 implements InterfaceC0692m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0676e0 f2404a;

    /* JADX INFO: renamed from: b */
    public final C38059n f2405b = new C38059n(32);

    /* JADX INFO: renamed from: c */
    public int f2406c;

    /* JADX INFO: renamed from: d */
    public int f2407d;

    /* JADX INFO: renamed from: e */
    public boolean f2408e;

    /* JADX INFO: renamed from: f */
    public boolean f2409f;

    public C0678f0(InterfaceC0676e0 interfaceC0676e0) {
        this.f2404a = interfaceC0676e0;
    }

    @Override // p012ab.InterfaceC0692m0
    /* JADX INFO: renamed from: a */
    public final void mo1669a() {
        this.f2409f = true;
    }

    @Override // p012ab.InterfaceC0692m0
    /* JADX INFO: renamed from: b */
    public final void mo1670b(int i13, C38059n c38059n) {
        int iM121867t;
        boolean z4 = (i13 & 1) != 0;
        if (z4) {
            iM121867t = c38059n.f163018b + c38059n.m121867t();
        } else {
            iM121867t = -1;
        }
        if (this.f2409f) {
            if (!z4) {
                return;
            }
            this.f2409f = false;
            c38059n.m121846F(iM121867t);
            this.f2407d = 0;
        }
        while (c38059n.m121848a() > 0) {
            int i14 = this.f2407d;
            C38059n c38059n2 = this.f2405b;
            if (i14 < 3) {
                if (i14 == 0) {
                    int iM121867t2 = c38059n.m121867t();
                    c38059n.m121846F(c38059n.f163018b - 1);
                    if (iM121867t2 == 255) {
                        this.f2409f = true;
                        return;
                    }
                }
                int iMin = Math.min(c38059n.m121848a(), 3 - this.f2407d);
                c38059n.m121852e(c38059n2.f163017a, this.f2407d, iMin);
                int i15 = this.f2407d + iMin;
                this.f2407d = i15;
                if (i15 == 3) {
                    c38059n2.m121846F(0);
                    c38059n2.m121845E(3);
                    c38059n2.m121847G(1);
                    int iM121867t3 = c38059n2.m121867t();
                    int iM121867t4 = c38059n2.m121867t();
                    this.f2408e = (iM121867t3 & 128) != 0;
                    int i16 = (((iM121867t3 & 15) << 8) | iM121867t4) + 3;
                    this.f2406c = i16;
                    byte[] bArr = c38059n2.f163017a;
                    if (bArr.length < i16) {
                        c38059n2.m121849b(Math.min(DfuBaseService.ERROR_FILE_ERROR, Math.max(i16, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c38059n.m121848a(), this.f2406c - this.f2407d);
                c38059n.m121852e(c38059n2.f163017a, this.f2407d, iMin2);
                int i17 = this.f2407d + iMin2;
                this.f2407d = i17;
                int i18 = this.f2406c;
                if (i17 != i18) {
                    continue;
                } else {
                    if (!this.f2408e) {
                        c38059n2.m121845E(i18);
                    } else {
                        if (AbstractC38065t.m121919l(0, i18, -1, c38059n2.f163017a) != 0) {
                            this.f2409f = true;
                            return;
                        }
                        c38059n2.m121845E(this.f2406c - 4);
                    }
                    c38059n2.m121846F(0);
                    this.f2404a.mo931c(c38059n2);
                    this.f2407d = 0;
                }
            }
        }
    }

    @Override // p012ab.InterfaceC0692m0
    /* JADX INFO: renamed from: g */
    public final void mo1671g(C38064s c38064s, InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        this.f2404a.mo935g(c38064s, interfaceC33648q, c0690l0);
        this.f2409f = true;
    }
}

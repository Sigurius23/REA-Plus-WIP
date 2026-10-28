package p151fn;

import ed3.C13117a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p012ab.C0690l0;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p588wm.InterfaceC37369k;

/* JADX INFO: renamed from: fn.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C14634v implements InterfaceC14638z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC14633u f54018a;

    /* JADX INFO: renamed from: b */
    public final C13117a f54019b = new C13117a(32);

    /* JADX INFO: renamed from: c */
    public int f54020c;

    /* JADX INFO: renamed from: d */
    public int f54021d;

    /* JADX INFO: renamed from: e */
    public boolean f54022e;

    /* JADX INFO: renamed from: f */
    public boolean f54023f;

    public C14634v(InterfaceC14633u interfaceC14633u) {
        this.f54018a = interfaceC14633u;
    }

    @Override // p151fn.InterfaceC14638z
    /* JADX INFO: renamed from: a */
    public final void mo41824a() {
        this.f54023f = true;
    }

    @Override // p151fn.InterfaceC14638z
    /* JADX INFO: renamed from: b */
    public final void mo41825b(int i13, C13117a c13117a) {
        boolean z4 = (i13 & 1) != 0;
        int iM36715y = z4 ? c13117a.f45382b + c13117a.m36715y() : -1;
        if (this.f54023f) {
            if (!z4) {
                return;
            }
            this.f54023f = false;
            c13117a.m36689K(iM36715y);
            this.f54021d = 0;
        }
        while (c13117a.m36692a() > 0) {
            int i14 = this.f54021d;
            C13117a c13117a2 = this.f54019b;
            if (i14 < 3) {
                if (i14 == 0) {
                    int iM36715y2 = c13117a.m36715y();
                    c13117a.m36689K(c13117a.f45382b - 1);
                    if (iM36715y2 == 255) {
                        this.f54023f = true;
                        return;
                    }
                }
                int iMin = Math.min(c13117a.m36692a(), 3 - this.f54021d);
                c13117a.m36697g(c13117a2.f45381a, this.f54021d, iMin);
                int i15 = this.f54021d + iMin;
                this.f54021d = i15;
                if (i15 == 3) {
                    c13117a2.m36689K(0);
                    c13117a2.m36688J(3);
                    c13117a2.m36690L(1);
                    int iM36715y3 = c13117a2.m36715y();
                    int iM36715y4 = c13117a2.m36715y();
                    this.f54022e = (iM36715y3 & 128) != 0;
                    int i16 = (((iM36715y3 & 15) << 8) | iM36715y4) + 3;
                    this.f54020c = i16;
                    byte[] bArr = c13117a2.f45381a;
                    if (bArr.length < i16) {
                        c13117a2.m36693b(Math.min(DfuBaseService.ERROR_FILE_ERROR, Math.max(i16, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c13117a.m36692a(), this.f54020c - this.f54021d);
                c13117a.m36697g(c13117a2.f45381a, this.f54021d, iMin2);
                int i17 = this.f54021d + iMin2;
                this.f54021d = i17;
                int i18 = this.f54020c;
                if (i17 != i18) {
                    continue;
                } else {
                    if (this.f54022e) {
                        byte[] bArr2 = c13117a2.f45381a;
                        int i19 = -1;
                        for (int i24 = 0; i24 < i18; i24++) {
                            i19 = AbstractC24567y.f95886l[((i19 >>> 24) ^ (bArr2[i24] & 255)) & 255] ^ (i19 << 8);
                        }
                        int i25 = AbstractC24567y.f95875a;
                        if (i19 != 0) {
                            this.f54023f = true;
                            return;
                        }
                        c13117a2.m36688J(this.f54020c - 4);
                    } else {
                        c13117a2.m36688J(i18);
                    }
                    c13117a2.m36689K(0);
                    this.f54018a.mo934f(c13117a2);
                    this.f54021d = 0;
                }
            }
        }
    }

    @Override // p151fn.InterfaceC14638z
    /* JADX INFO: renamed from: i */
    public final void mo41827i(C24566x c24566x, InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        this.f54018a.mo937i(c24566x, interfaceC37369k, c0690l0);
        this.f54023f = true;
    }
}

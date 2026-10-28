package p151fn;

import ed3.C13117a;
import p012ab.C0690l0;
import p309lo.AbstractC24543a;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33621b0;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;

/* JADX INFO: renamed from: fn.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C14627o implements InterfaceC14620h {

    /* JADX INFO: renamed from: a */
    public final C13117a f53967a;

    /* JADX INFO: renamed from: b */
    public final C33621b0 f53968b;

    /* JADX INFO: renamed from: c */
    public final String f53969c;

    /* JADX INFO: renamed from: d */
    public InterfaceC37377s f53970d;

    /* JADX INFO: renamed from: e */
    public String f53971e;

    /* JADX INFO: renamed from: f */
    public int f53972f = 0;

    /* JADX INFO: renamed from: g */
    public int f53973g;

    /* JADX INFO: renamed from: h */
    public boolean f53974h;

    /* JADX INFO: renamed from: i */
    public boolean f53975i;

    /* JADX INFO: renamed from: j */
    public long f53976j;

    /* JADX INFO: renamed from: k */
    public int f53977k;

    /* JADX INFO: renamed from: l */
    public long f53978l;

    public C14627o(String str) {
        C13117a c13117a = new C13117a(4);
        this.f53967a = c13117a;
        c13117a.f45381a[0] = -1;
        this.f53968b = new C33621b0(1);
        this.f53978l = -9223372036854775807L;
        this.f53969c = str;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: a */
    public final void mo41817a() {
        this.f53972f = 0;
        this.f53973g = 0;
        this.f53975i = false;
        this.f53978l = -9223372036854775807L;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: d */
    public final void mo41818d(int i13, long j7) {
        if (j7 != -9223372036854775807L) {
            this.f53978l = j7;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public final void mo1711f(C13117a c13117a) {
        AbstractC24543a.m71574j(this.f53970d);
        while (c13117a.m36692a() > 0) {
            int i13 = this.f53972f;
            C13117a c13117a2 = this.f53967a;
            if (i13 == 0) {
                byte[] bArr = c13117a.f45381a;
                int i14 = c13117a.f45382b;
                int i15 = c13117a.f45383c;
                while (true) {
                    if (i14 >= i15) {
                        c13117a.m36689K(i15);
                        break;
                    }
                    byte b = bArr[i14];
                    boolean z4 = (b & 255) == 255;
                    boolean z13 = this.f53975i && (b & 224) == 224;
                    this.f53975i = z4;
                    if (z13) {
                        c13117a.m36689K(i14 + 1);
                        this.f53975i = false;
                        c13117a2.f45381a[1] = bArr[i14];
                        this.f53973g = 2;
                        this.f53972f = 1;
                        break;
                    }
                    i14++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(c13117a.m36692a(), 4 - this.f53973g);
                c13117a.m36697g(c13117a2.f45381a, this.f53973g, iMin);
                int i16 = this.f53973g + iMin;
                this.f53973g = i16;
                if (i16 >= 4) {
                    c13117a2.m36689K(0);
                    int iM36699i = c13117a2.m36699i();
                    C33621b0 c33621b0 = this.f53968b;
                    if (c33621b0.m106233a(iM36699i)) {
                        this.f53977k = c33621b0.f140345d;
                        if (!this.f53974h) {
                            long j7 = ((long) c33621b0.f140349h) * 1000000;
                            int i17 = c33621b0.f140346e;
                            this.f53976j = j7 / ((long) i17);
                            C31518b0 c31518b0 = new C31518b0();
                            c31518b0.f130037a = this.f53971e;
                            c31518b0.f130047k = c33621b0.f140344c;
                            c31518b0.f130048l = 4096;
                            c31518b0.f130060x = c33621b0.f140347f;
                            c31518b0.f130061y = i17;
                            c31518b0.f130039c = this.f53969c;
                            this.f53970d.mo102730a(new C31521c0(c31518b0));
                            this.f53974h = true;
                        }
                        c13117a2.m36689K(0);
                        this.f53970d.mo102732c(4, c13117a2);
                        this.f53972f = 2;
                    } else {
                        this.f53973g = 0;
                        this.f53972f = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c13117a.m36692a(), this.f53977k - this.f53973g);
                this.f53970d.mo102732c(iMin2, c13117a);
                int i18 = this.f53973g + iMin2;
                this.f53973g = i18;
                int i19 = this.f53977k;
                if (i18 >= i19) {
                    long j13 = this.f53978l;
                    if (j13 != -9223372036854775807L) {
                        this.f53970d.mo102733d(j13, 1, i19, 0, null);
                        this.f53978l += this.f53976j;
                    }
                    this.f53973g = 0;
                    this.f53972f = 0;
                }
            }
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public final void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f53971e = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        this.f53970d = interfaceC37369k.mo3102o(c0690l0.f2494e, 1);
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public final void mo1713h() {
    }
}

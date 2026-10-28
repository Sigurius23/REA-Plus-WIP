package p499t9;

import p588wm.C37376r;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37377s;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: t9.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33641l0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f140417a;

    /* JADX INFO: renamed from: b */
    public boolean f140418b;

    /* JADX INFO: renamed from: c */
    public int f140419c;

    /* JADX INFO: renamed from: d */
    public long f140420d;

    /* JADX INFO: renamed from: e */
    public int f140421e;

    /* JADX INFO: renamed from: f */
    public int f140422f;

    /* JADX INFO: renamed from: g */
    public int f140423g;

    public C33641l0(int i13) {
        switch (i13) {
            case 1:
                this.f140417a = new byte[10];
                break;
            default:
                this.f140417a = new byte[10];
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m106259a(InterfaceC33639k0 interfaceC33639k0, C33637j0 c33637j0) {
        if (this.f140419c > 0) {
            interfaceC33639k0.mo36174b(this.f140420d, this.f140421e, this.f140422f, this.f140423g, c33637j0);
            this.f140419c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m106260b(InterfaceC37377s interfaceC37377s, C37376r c37376r) {
        if (this.f140419c > 0) {
            interfaceC37377s.mo102733d(this.f140420d, this.f140421e, this.f140422f, this.f140423g, c37376r);
            this.f140419c = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m106261c(InterfaceC33639k0 interfaceC33639k0, long j7, int i13, int i14, int i15, C33637j0 c33637j0) {
        AbstractC35849g.m113806h("TrueHD chunk samples must be contiguous in the sample queue.", this.f140423g <= i14 + i15);
        if (this.f140418b) {
            int i16 = this.f140419c;
            int i17 = i16 + 1;
            this.f140419c = i17;
            if (i16 == 0) {
                this.f140420d = j7;
                this.f140421e = i13;
                this.f140422f = 0;
            }
            this.f140422f += i14;
            this.f140423g = i15;
            if (i17 >= 16) {
                m106259a(interfaceC33639k0, c33637j0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m106262d(InterfaceC37377s interfaceC37377s, long j7, int i13, int i14, int i15, C37376r c37376r) {
        if (!(this.f140423g <= i14 + i15)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f140418b) {
            int i16 = this.f140419c;
            int i17 = i16 + 1;
            this.f140419c = i17;
            if (i16 == 0) {
                this.f140420d = j7;
                this.f140421e = i13;
                this.f140422f = 0;
            }
            this.f140422f += i14;
            this.f140423g = i15;
            if (i17 >= 16) {
                m106260b(interfaceC37377s, c37376r);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m106263e(InterfaceC33646o interfaceC33646o) {
        if (this.f140418b) {
            return;
        }
        byte[] bArr = this.f140417a;
        int i13 = 0;
        interfaceC33646o.mo3103p(bArr, 0, 10);
        interfaceC33646o.mo3093e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i13 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i13 == 0) {
            return;
        }
        this.f140418b = true;
    }

    /* JADX INFO: renamed from: f */
    public void m106264f(InterfaceC37368j interfaceC37368j) {
        if (this.f140418b) {
            return;
        }
        byte[] bArr = this.f140417a;
        int i13 = 0;
        interfaceC37368j.mo3103p(bArr, 0, 10);
        interfaceC37368j.mo3093e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i13 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i13 == 0) {
            return;
        }
        this.f140418b = true;
    }
}

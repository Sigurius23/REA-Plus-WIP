package p151fn;

import ed3.C13117a;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p588wm.InterfaceC37368j;

/* JADX INFO: renamed from: fn.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C14630r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53991a;

    /* JADX INFO: renamed from: b */
    public final C24566x f53992b;

    /* JADX INFO: renamed from: c */
    public final C13117a f53993c;

    /* JADX INFO: renamed from: d */
    public boolean f53994d;

    /* JADX INFO: renamed from: e */
    public boolean f53995e;

    /* JADX INFO: renamed from: f */
    public boolean f53996f;

    /* JADX INFO: renamed from: g */
    public long f53997g;

    /* JADX INFO: renamed from: h */
    public long f53998h;

    /* JADX INFO: renamed from: i */
    public long f53999i;

    public C14630r(int i13) {
        this.f53991a = i13;
        switch (i13) {
            case 1:
                this.f53992b = new C24566x(0L);
                this.f53997g = -9223372036854775807L;
                this.f53998h = -9223372036854775807L;
                this.f53999i = -9223372036854775807L;
                this.f53993c = new C13117a();
                break;
            default:
                this.f53992b = new C24566x(0L);
                this.f53997g = -9223372036854775807L;
                this.f53998h = -9223372036854775807L;
                this.f53999i = -9223372036854775807L;
                this.f53993c = new C13117a();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m41829b(int i13, byte[] bArr) {
        return (bArr[i13 + 3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m41830c(C13117a c13117a) {
        int i13 = c13117a.f45382b;
        if (c13117a.m36692a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c13117a.m36697g(bArr, 0, 9);
        c13117a.m36689K(i13);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b6 = bArr[2];
            if ((b6 & 4) == 4) {
                byte b8 = bArr[4];
                if ((b8 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j7 = b;
                    long j13 = b6;
                    return ((j13 & 3) << 13) | ((j7 & 3) << 28) | (((56 & j7) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j13 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b8) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m41831a(InterfaceC37368j interfaceC37368j) {
        switch (this.f53991a) {
            case 0:
                byte[] bArr = AbstractC24567y.f95880f;
                C13117a c13117a = this.f53993c;
                c13117a.getClass();
                c13117a.m36687I(bArr.length, bArr);
                this.f53994d = true;
                interfaceC37368j.mo3093e();
                break;
            default:
                byte[] bArr2 = AbstractC24567y.f95880f;
                C13117a c13117a2 = this.f53993c;
                c13117a2.getClass();
                c13117a2.m36687I(bArr2.length, bArr2);
                this.f53994d = true;
                interfaceC37368j.mo3093e();
                break;
        }
    }
}

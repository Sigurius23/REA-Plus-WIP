package p012ab;

import p499t9.InterfaceC33646o;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.C38064s;

/* JADX INFO: renamed from: ab.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0670b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2323a;

    /* JADX INFO: renamed from: b */
    public final C38064s f2324b;

    /* JADX INFO: renamed from: c */
    public final C38059n f2325c;

    /* JADX INFO: renamed from: d */
    public boolean f2326d;

    /* JADX INFO: renamed from: e */
    public boolean f2327e;

    /* JADX INFO: renamed from: f */
    public boolean f2328f;

    /* JADX INFO: renamed from: g */
    public long f2329g;

    /* JADX INFO: renamed from: h */
    public long f2330h;

    /* JADX INFO: renamed from: i */
    public long f2331i;

    public C0670b0(int i13) {
        this.f2323a = i13;
        switch (i13) {
            case 1:
                this.f2324b = new C38064s(0L);
                this.f2329g = -9223372036854775807L;
                this.f2330h = -9223372036854775807L;
                this.f2331i = -9223372036854775807L;
                this.f2325c = new C38059n();
                break;
            default:
                this.f2324b = new C38064s(0L);
                this.f2329g = -9223372036854775807L;
                this.f2330h = -9223372036854775807L;
                this.f2331i = -9223372036854775807L;
                this.f2325c = new C38059n();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1658b(int i13, byte[] bArr) {
        return (bArr[i13 + 3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m1659c(C38059n c38059n) {
        int i13 = c38059n.f163018b;
        if (c38059n.m121848a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c38059n.m121852e(bArr, 0, 9);
        c38059n.m121846F(i13);
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
    public final void m1660a(InterfaceC33646o interfaceC33646o) {
        switch (this.f2323a) {
            case 0:
                byte[] bArr = AbstractC38065t.f163033c;
                C38059n c38059n = this.f2325c;
                c38059n.getClass();
                c38059n.m121844D(bArr.length, bArr);
                this.f2326d = true;
                interfaceC33646o.mo3093e();
                break;
            default:
                byte[] bArr2 = AbstractC38065t.f163033c;
                C38059n c38059n2 = this.f2325c;
                c38059n2.getClass();
                c38059n2.m121844D(bArr2.length, bArr2);
                this.f2326d = true;
                interfaceC33646o.mo3093e();
                break;
        }
    }
}

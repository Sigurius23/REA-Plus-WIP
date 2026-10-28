package bb;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.C38059n;

/* JADX INFO: renamed from: bb.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C2914a implements InterfaceC2915b {

    /* JADX INFO: renamed from: m */
    public static final int[] f11705m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f11706n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final InterfaceC33648q f11707a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33639k0 f11708b;

    /* JADX INFO: renamed from: c */
    public final C2918e f11709c;

    /* JADX INFO: renamed from: d */
    public final int f11710d;

    /* JADX INFO: renamed from: e */
    public final byte[] f11711e;

    /* JADX INFO: renamed from: f */
    public final C38059n f11712f;

    /* JADX INFO: renamed from: g */
    public final int f11713g;

    /* JADX INFO: renamed from: h */
    public final C34610p f11714h;

    /* JADX INFO: renamed from: i */
    public int f11715i;

    /* JADX INFO: renamed from: j */
    public long f11716j;

    /* JADX INFO: renamed from: k */
    public int f11717k;

    /* JADX INFO: renamed from: l */
    public long f11718l;

    public C2914a(InterfaceC33648q interfaceC33648q, InterfaceC33639k0 interfaceC33639k0, C2918e c2918e) throws ParserException {
        this.f11707a = interfaceC33648q;
        this.f11708b = interfaceC33639k0;
        this.f11709c = c2918e;
        int i13 = c2918e.f11736b;
        int iMax = Math.max(1, i13 / 10);
        this.f11713g = iMax;
        C38059n c38059n = new C38059n(c2918e.f11739e);
        c38059n.m121860m();
        int iM121860m = c38059n.m121860m();
        this.f11710d = iM121860m;
        int i14 = c2918e.f11735a;
        int i15 = c2918e.f11737c;
        int i16 = (((i15 - (i14 * 4)) * 8) / (c2918e.f11738d * i14)) + 1;
        if (iM121860m != i16) {
            throw ParserException.m5049a(null, "Expected frames per block: " + i16 + "; got: " + iM121860m);
        }
        int iM121912e = AbstractC38065t.m121912e(iMax, iM121860m);
        this.f11711e = new byte[iM121912e * i15];
        this.f11712f = new C38059n(iM121860m * 2 * i14 * iM121912e);
        int i17 = ((i15 * i13) * 8) / iM121860m;
        C34608o c34608o = new C34608o();
        c34608o.f145741m = AbstractC34587d0.m109382o("audio/raw");
        c34608o.f145736h = i17;
        c34608o.f145737i = i17;
        c34608o.f145742n = iMax * 2 * i14;
        c34608o.f145719C = i14;
        c34608o.f145720D = i13;
        c34608o.f145721E = 2;
        this.f11714h = new C34610p(c34608o);
    }

    @Override // bb.InterfaceC2915b
    /* JADX INFO: renamed from: a */
    public final void mo8501a(int i13, long j7) {
        this.f11707a.mo3109v(new C2920g(this.f11709c, this.f11710d, i13, j7));
        C34610p c34610p = this.f11714h;
        InterfaceC33639k0 interfaceC33639k0 = this.f11708b;
        interfaceC33639k0.mo36173a(c34610p);
        interfaceC33639k0.getClass();
    }

    @Override // bb.InterfaceC2915b
    /* JADX INFO: renamed from: b */
    public final void mo8502b(long j7) {
        this.f11715i = 0;
        this.f11716j = j7;
        this.f11717k = 0;
        this.f11718l = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m8503c(int i13) {
        long j7 = this.f11716j;
        long j13 = this.f11718l;
        C2918e c2918e = this.f11709c;
        long j14 = c2918e.f11736b;
        int i14 = AbstractC38065t.f163031a;
        long jM121903Q = j7 + AbstractC38065t.m121903Q(j13, 1000000L, j14, RoundingMode.DOWN);
        int i15 = i13 * 2 * c2918e.f11735a;
        this.f11708b.mo36174b(jM121903Q, 1, i15, this.f11717k - i15, null);
        this.f11718l += (long) i13;
        this.f11717k -= i15;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // bb.InterfaceC2915b
    /* JADX INFO: renamed from: d */
    public final boolean mo8504d(InterfaceC33646o interfaceC33646o, long j7) {
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        C38059n c38059n;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int i19;
        int i24;
        int iM121914g;
        int iMin;
        int[] iArr;
        int i25;
        int i26;
        int i27;
        byte b;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38 = this.f11717k;
        C2918e c2918e = this.f11709c;
        int i39 = i38 / (c2918e.f11735a * 2);
        int i44 = this.f11713g;
        int i45 = this.f11710d;
        int iM121912e = AbstractC38065t.m121912e(i44 - i39, i45);
        int i46 = c2918e.f11737c;
        int i47 = iM121912e * i46;
        boolean z4 = j7 == 0;
        while (true) {
            bArr = this.f11711e;
            if (z4 && (i36 = this.f11715i) < i47) {
                i37 = interfaceC33646o.read(bArr, this.f11715i, (int) Math.min(i47 - i36, j7));
                if (i37 == -1) {
                    break;
                }
                this.f11715i += i37;
                bArr = this.f11711e;
                if (z4) {
                }
            }
            i13 = this.f11715i / i46;
            if (i13 > 0) {
                i15 = 0;
                while (true) {
                    c38059n = this.f11712f;
                    if (i15 < i13) {
                        break;
                    }
                    i17 = 0;
                    while (true) {
                        i18 = c2918e.f11735a;
                        if (i17 < i18) {
                            bArr2 = c38059n.f163017a;
                            int i48 = (i17 * 4) + (i15 * i46);
                            i19 = (i18 * 4) + i48;
                            i24 = (i46 / i18) - 4;
                            iM121914g = (short) ((bArr[i48] & 255) | ((bArr[i48 + 1] & 255) << 8));
                            int i49 = i13;
                            iMin = Math.min(bArr[i48 + 2] & 255, 88);
                            iArr = f11706n;
                            i25 = iArr[iMin];
                            i26 = ((i15 * i45 * i18) + i17) * 2;
                            bArr2[i26] = (byte) (iM121914g & 255);
                            bArr2[i26 + 1] = (byte) (iM121914g >> 8);
                            int i54 = i15;
                            i27 = 0;
                            while (i27 < i24 * 2) {
                                b = bArr[((i27 / 8) * i18 * 4) + i19 + ((i27 / 2) % 4)];
                                i28 = i27;
                                i29 = b & 255;
                                if (i28 % 2 == 0) {
                                    i34 = b & 15;
                                } else {
                                    i34 = i29 >> 4;
                                }
                                i35 = ((((i34 & 7) * 2) + 1) * i25) >> 3;
                                if ((i34 & 8) != 0) {
                                    i35 = -i35;
                                }
                                iM121914g = AbstractC38065t.m121914g(iM121914g + i35, -32768, 32767);
                                i26 = (i18 * 2) + i26;
                                bArr2[i26] = (byte) (iM121914g & 255);
                                bArr2[i26 + 1] = (byte) (iM121914g >> 8);
                                iMin = AbstractC38065t.m121914g(iMin + f11705m[i34], 0, 88);
                                i25 = iArr[iMin];
                                i27 = i28 + 1;
                            }
                            i17++;
                            i13 = i49;
                            i15 = i54;
                        }
                    }
                    i15++;
                }
                int i55 = i13;
                int i56 = i45 * i55 * 2 * c2918e.f11735a;
                c38059n.m121846F(0);
                c38059n.m121845E(i56);
                this.f11715i -= i55 * i46;
                int i57 = c38059n.f163019c;
                this.f11708b.mo36176d(c38059n, i57, 0);
                i16 = this.f11717k + i57;
                this.f11717k = i16;
                if (i16 / (c2918e.f11735a * 2) >= i44) {
                    m8503c(i44);
                }
            }
            if (z4 && (i14 = this.f11717k / (c2918e.f11735a * 2)) > 0) {
                m8503c(i14);
            }
            return z4;
        }
        while (true) {
            bArr = this.f11711e;
            if (z4) {
            }
            i13 = this.f11715i / i46;
            if (i13 > 0) {
                i15 = 0;
                while (true) {
                    c38059n = this.f11712f;
                    if (i15 < i13) {
                        break;
                        break;
                    }
                    i17 = 0;
                    while (true) {
                        i18 = c2918e.f11735a;
                        if (i17 < i18) {
                            bArr2 = c38059n.f163017a;
                            int i410 = (i17 * 4) + (i15 * i46);
                            i19 = (i18 * 4) + i410;
                            i24 = (i46 / i18) - 4;
                            iM121914g = (short) ((bArr[i410] & 255) | ((bArr[i410 + 1] & 255) << 8));
                            int i411 = i13;
                            iMin = Math.min(bArr[i410 + 2] & 255, 88);
                            iArr = f11706n;
                            i25 = iArr[iMin];
                            i26 = ((i15 * i45 * i18) + i17) * 2;
                            bArr2[i26] = (byte) (iM121914g & 255);
                            bArr2[i26 + 1] = (byte) (iM121914g >> 8);
                            int i58 = i15;
                            i27 = 0;
                            while (i27 < i24 * 2) {
                                b = bArr[((i27 / 8) * i18 * 4) + i19 + ((i27 / 2) % 4)];
                                i28 = i27;
                                i29 = b & 255;
                                if (i28 % 2 == 0) {
                                    i34 = b & 15;
                                } else {
                                    i34 = i29 >> 4;
                                }
                                i35 = ((((i34 & 7) * 2) + 1) * i25) >> 3;
                                if ((i34 & 8) != 0) {
                                    i35 = -i35;
                                }
                                iM121914g = AbstractC38065t.m121914g(iM121914g + i35, -32768, 32767);
                                i26 = (i18 * 2) + i26;
                                bArr2[i26] = (byte) (iM121914g & 255);
                                bArr2[i26 + 1] = (byte) (iM121914g >> 8);
                                iMin = AbstractC38065t.m121914g(iMin + f11705m[i34], 0, 88);
                                i25 = iArr[iMin];
                                i27 = i28 + 1;
                            }
                            i17++;
                            i13 = i411;
                            i15 = i58;
                        }
                    }
                    i15++;
                }
                int i59 = i13;
                int i510 = i45 * i59 * 2 * c2918e.f11735a;
                c38059n.m121846F(0);
                c38059n.m121845E(i510);
                this.f11715i -= i59 * i46;
                int i511 = c38059n.f163019c;
                this.f11708b.mo36176d(c38059n, i511, 0);
                i16 = this.f11717k + i511;
                this.f11717k = i16;
                if (i16 / (c2918e.f11735a * 2) >= i44) {
                    m8503c(i44);
                }
            }
            if (z4) {
                m8503c(i14);
            }
            return z4;
            this.f11715i += i37;
        }
    }
}

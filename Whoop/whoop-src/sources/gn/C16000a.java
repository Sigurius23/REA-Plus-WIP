package gn;

import bb.C2918e;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;

/* JADX INFO: renamed from: gn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16000a implements InterfaceC16001b {

    /* JADX INFO: renamed from: m */
    public static final int[] f60555m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f60556n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final InterfaceC37369k f60557a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC37377s f60558b;

    /* JADX INFO: renamed from: c */
    public final C2918e f60559c;

    /* JADX INFO: renamed from: d */
    public final int f60560d;

    /* JADX INFO: renamed from: e */
    public final byte[] f60561e;

    /* JADX INFO: renamed from: f */
    public final C13117a f60562f;

    /* JADX INFO: renamed from: g */
    public final int f60563g;

    /* JADX INFO: renamed from: h */
    public final C31521c0 f60564h;

    /* JADX INFO: renamed from: i */
    public int f60565i;

    /* JADX INFO: renamed from: j */
    public long f60566j;

    /* JADX INFO: renamed from: k */
    public int f60567k;

    /* JADX INFO: renamed from: l */
    public long f60568l;

    public C16000a(InterfaceC37369k interfaceC37369k, InterfaceC37377s interfaceC37377s, C2918e c2918e) throws ParserException {
        this.f60557a = interfaceC37369k;
        this.f60558b = interfaceC37377s;
        this.f60559c = c2918e;
        int i13 = c2918e.f11736b;
        int iMax = Math.max(1, i13 / 10);
        this.f60563g = iMax;
        byte[] bArr = c2918e.f11739e;
        int length = bArr.length;
        byte b = bArr[0];
        byte b6 = bArr[1];
        int i14 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f60560d = i14;
        int i15 = c2918e.f11735a;
        int i16 = c2918e.f11737c;
        int i17 = (((i16 - (i15 * 4)) * 8) / (c2918e.f11738d * i15)) + 1;
        if (i14 != i17) {
            StringBuilder sb4 = new StringBuilder(56);
            sb4.append("Expected frames per block: ");
            sb4.append(i17);
            sb4.append("; got: ");
            sb4.append(i14);
            throw ParserException.m15562a(null, sb4.toString());
        }
        int iM71675f = AbstractC24567y.m71675f(iMax, i14);
        this.f60561e = new byte[iM71675f * i16];
        this.f60562f = new C13117a(i14 * 2 * i15 * iM71675f);
        int i18 = ((i16 * i13) * 8) / i14;
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = "audio/raw";
        c31518b0.f130042f = i18;
        c31518b0.f130043g = i18;
        c31518b0.f130048l = iMax * 2 * i15;
        c31518b0.f130060x = i15;
        c31518b0.f130061y = i13;
        c31518b0.f130062z = 2;
        this.f60564h = new C31521c0(c31518b0);
    }

    @Override // gn.InterfaceC16001b
    /* JADX INFO: renamed from: a */
    public final void mo45297a(int i13, long j7) {
        this.f60557a.mo3111x(new C16003d(this.f60559c, this.f60560d, i13, j7));
        this.f60558b.mo102730a(this.f60564h);
    }

    @Override // gn.InterfaceC16001b
    /* JADX INFO: renamed from: b */
    public final void mo45298b(long j7) {
        this.f60565i = 0;
        this.f60566j = j7;
        this.f60567k = 0;
        this.f60568l = 0L;
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
    @Override // gn.InterfaceC16001b
    /* JADX INFO: renamed from: c */
    public final boolean mo8505c(InterfaceC37368j interfaceC37368j, long j7) {
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        C13117a c13117a;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int i19;
        int i24;
        int iM71677h;
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
        int i38 = this.f60567k;
        C2918e c2918e = this.f60559c;
        int i39 = i38 / (c2918e.f11735a * 2);
        int i44 = this.f60563g;
        int i45 = this.f60560d;
        int iM71675f = AbstractC24567y.m71675f(i44 - i39, i45);
        int i46 = c2918e.f11737c;
        int i47 = iM71675f * i46;
        boolean z4 = j7 == 0;
        while (true) {
            bArr = this.f60561e;
            if (z4 && (i36 = this.f60565i) < i47) {
                i37 = interfaceC37368j.read(bArr, this.f60565i, (int) Math.min(i47 - i36, j7));
                if (i37 == -1) {
                    break;
                }
                this.f60565i += i37;
                bArr = this.f60561e;
                if (z4) {
                }
            }
            i13 = this.f60565i / i46;
            if (i13 > 0) {
                i15 = 0;
                while (true) {
                    c13117a = this.f60562f;
                    if (i15 < i13) {
                        break;
                    }
                    i17 = 0;
                    while (true) {
                        i18 = c2918e.f11735a;
                        if (i17 < i18) {
                            bArr2 = c13117a.f45381a;
                            int i48 = (i17 * 4) + (i15 * i46);
                            i19 = (i18 * 4) + i48;
                            i24 = (i46 / i18) - 4;
                            iM71677h = (short) ((bArr[i48] & 255) | ((bArr[i48 + 1] & 255) << 8));
                            int i49 = i13;
                            iMin = Math.min(bArr[i48 + 2] & 255, 88);
                            iArr = f60556n;
                            i25 = iArr[iMin];
                            i26 = ((i15 * i45 * i18) + i17) * 2;
                            bArr2[i26] = (byte) (iM71677h & 255);
                            bArr2[i26 + 1] = (byte) (iM71677h >> 8);
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
                                iM71677h = AbstractC24567y.m71677h(iM71677h + i35, -32768, 32767);
                                i26 = (i18 * 2) + i26;
                                bArr2[i26] = (byte) (iM71677h & 255);
                                bArr2[i26 + 1] = (byte) (iM71677h >> 8);
                                iMin = AbstractC24567y.m71677h(iMin + f60555m[i34], 0, 88);
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
                c13117a.m36689K(0);
                c13117a.m36688J(i56);
                this.f60565i -= i55 * i46;
                int i57 = c13117a.f45383c;
                this.f60558b.mo102732c(i57, c13117a);
                i16 = this.f60567k + i57;
                this.f60567k = i16;
                if (i16 / (c2918e.f11735a * 2) >= i44) {
                    m45299d(i44);
                }
            }
            if (z4 && (i14 = this.f60567k / (c2918e.f11735a * 2)) > 0) {
                m45299d(i14);
            }
            return z4;
        }
        while (true) {
            bArr = this.f60561e;
            if (z4) {
            }
            i13 = this.f60565i / i46;
            if (i13 > 0) {
                i15 = 0;
                while (true) {
                    c13117a = this.f60562f;
                    if (i15 < i13) {
                        break;
                        break;
                    }
                    i17 = 0;
                    while (true) {
                        i18 = c2918e.f11735a;
                        if (i17 < i18) {
                            bArr2 = c13117a.f45381a;
                            int i410 = (i17 * 4) + (i15 * i46);
                            i19 = (i18 * 4) + i410;
                            i24 = (i46 / i18) - 4;
                            iM71677h = (short) ((bArr[i410] & 255) | ((bArr[i410 + 1] & 255) << 8));
                            int i411 = i13;
                            iMin = Math.min(bArr[i410 + 2] & 255, 88);
                            iArr = f60556n;
                            i25 = iArr[iMin];
                            i26 = ((i15 * i45 * i18) + i17) * 2;
                            bArr2[i26] = (byte) (iM71677h & 255);
                            bArr2[i26 + 1] = (byte) (iM71677h >> 8);
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
                                iM71677h = AbstractC24567y.m71677h(iM71677h + i35, -32768, 32767);
                                i26 = (i18 * 2) + i26;
                                bArr2[i26] = (byte) (iM71677h & 255);
                                bArr2[i26 + 1] = (byte) (iM71677h >> 8);
                                iMin = AbstractC24567y.m71677h(iMin + f60555m[i34], 0, 88);
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
                c13117a.m36689K(0);
                c13117a.m36688J(i510);
                this.f60565i -= i59 * i46;
                int i511 = c13117a.f45383c;
                this.f60558b.mo102732c(i511, c13117a);
                i16 = this.f60567k + i511;
                this.f60567k = i16;
                if (i16 / (c2918e.f11735a * 2) >= i44) {
                    m45299d(i44);
                }
            }
            if (z4) {
                m45299d(i14);
            }
            return z4;
            this.f60565i += i37;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m45299d(int i13) {
        long j7 = this.f60566j;
        long j13 = this.f60568l;
        C2918e c2918e = this.f60559c;
        long jM71666D = j7 + AbstractC24567y.m71666D(j13, 1000000L, c2918e.f11736b);
        int i14 = i13 * 2 * c2918e.f11735a;
        this.f60558b.mo102733d(jM71666D, 1, i14, this.f60567k - i14, null);
        this.f60568l += (long) i13;
        this.f60567k -= i14;
    }
}

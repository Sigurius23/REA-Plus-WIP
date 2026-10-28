package p654yn;

import android.util.Log;
import androidx.recyclerview.widget.AbstractC1707m0;
import ed3.C13117a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012ab.C0679g;
import p621xn.C38465b;
import p621xn.C38466c;

/* JADX INFO: renamed from: yn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39663c extends AbstractC39668h {

    /* JADX INFO: renamed from: h */
    public final int f170648h;

    /* JADX INFO: renamed from: i */
    public final int f170649i;

    /* JADX INFO: renamed from: j */
    public final int f170650j;

    /* JADX INFO: renamed from: n */
    public List f170654n;

    /* JADX INFO: renamed from: o */
    public List f170655o;

    /* JADX INFO: renamed from: p */
    public int f170656p;

    /* JADX INFO: renamed from: q */
    public int f170657q;

    /* JADX INFO: renamed from: r */
    public boolean f170658r;

    /* JADX INFO: renamed from: s */
    public boolean f170659s;

    /* JADX INFO: renamed from: t */
    public byte f170660t;

    /* JADX INFO: renamed from: u */
    public byte f170661u;

    /* JADX INFO: renamed from: w */
    public boolean f170663w;

    /* JADX INFO: renamed from: x */
    public long f170664x;

    /* JADX INFO: renamed from: y */
    public static final int[] f170645y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z */
    public static final int[] f170646z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: A */
    public static final int[] f170639A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: B */
    public static final int[] f170640B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: C */
    public static final int[] f170641C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: D */
    public static final int[] f170642D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: E */
    public static final int[] f170643E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: F */
    public static final boolean[] f170644F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g */
    public final C13117a f170647g = new C13117a();

    /* JADX INFO: renamed from: l */
    public final ArrayList f170652l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public C39662b f170653m = new C39662b(0, 4);

    /* JADX INFO: renamed from: v */
    public int f170662v = 0;

    /* JADX INFO: renamed from: k */
    public final long f170651k = 16000000;

    public C39663c(String str, int i13) {
        this.f170648h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i13 == 1) {
            this.f170650j = 0;
            this.f170649i = 0;
        } else if (i13 == 2) {
            this.f170650j = 1;
            this.f170649i = 0;
        } else if (i13 == 3) {
            this.f170650j = 0;
            this.f170649i = 1;
        } else if (i13 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f170650j = 0;
            this.f170649i = 0;
        } else {
            this.f170650j = 1;
            this.f170649i = 1;
        }
        m126804k(0);
        m126803j();
        this.f170663w = true;
        this.f170664x = -9223372036854775807L;
    }

    @Override // p654yn.AbstractC39668h
    /* JADX INFO: renamed from: e */
    public final C0679g mo126798e() {
        List list = this.f170654n;
        this.f170655o = list;
        list.getClass();
        return new C0679g(list, 5);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01be  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01db  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0208 A[LOOP:1: B:146:0x0202->B:148:0x0208, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0214  */
    /* JADX WARN: Code duplicated, block: B:153:0x0219  */
    /* JADX WARN: Code duplicated, block: B:154:0x0220  */
    /* JADX WARN: Code duplicated, block: B:155:0x022b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0236  */
    /* JADX WARN: Code duplicated, block: B:157:0x0241  */
    /* JADX WARN: Code duplicated, block: B:158:0x0246  */
    /* JADX WARN: Code duplicated, block: B:159:0x024b  */
    /* JADX WARN: Code duplicated, block: B:161:0x025c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    @Override // p654yn.AbstractC39668h
    /* JADX INFO: renamed from: f */
    public final void mo126799f(C39667g c39667g) {
        boolean z4;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c39667g.f148801z;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C13117a c13117a = this.f170647g;
        c13117a.m36687I(iLimit, bArrArray);
        boolean z13 = false;
        while (true) {
            int iM36692a = c13117a.m36692a();
            int i17 = this.f170648h;
            if (iM36692a < i17) {
                if (z13) {
                    int i18 = this.f170656p;
                    if (i18 == 1 || i18 == 3) {
                        this.f170654n = m126802i();
                        this.f170664x = this.f170715e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte bM36715y = i17 == 2 ? (byte) -4 : (byte) c13117a.m36715y();
            int iM36715y = c13117a.m36715y();
            int iM36715y2 = c13117a.m36715y();
            if ((bM36715y & 2) == 0 && (bM36715y & 1) == this.f170649i) {
                byte b = (byte) (iM36715y & 127);
                byte b6 = (byte) (iM36715y2 & 127);
                if (b != 0 || b6 != 0) {
                    boolean z14 = this.f170658r;
                    if ((bM36715y & 4) == 4) {
                        boolean[] zArr = f170644F;
                        if (zArr[iM36715y] && zArr[iM36715y2]) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    this.f170658r = z4;
                    if (!z4 || (b & 240) != 16) {
                        this.f170659s = false;
                        if (!z4) {
                            if (1 > b && b <= 15) {
                                this.f170663w = false;
                            } else if ((b & 247) == 20) {
                                if (b6 == 32 && b6 != 47) {
                                    switch (b6) {
                                        default:
                                            switch (b6) {
                                                case 42:
                                                case 43:
                                                    this.f170663w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f170663w = true;
                                            break;
                                    }
                                } else {
                                    this.f170663w = true;
                                }
                            }
                            if (this.f170663w) {
                                i13 = b & 224;
                                if (i13 == 0) {
                                    this.f170662v = (b >> 3) & 1;
                                }
                                if (this.f170662v != this.f170650j) {
                                    if (i13 == 0) {
                                        i14 = b & 247;
                                        if (i14 == 17 || (b6 & 240) != 48) {
                                            i15 = b & 246;
                                            if (i15 != 18 && (b6 & 224) == 32) {
                                                this.f170653m.m126794b();
                                                this.f170653m.m126793a((char) ((b & 1) == 0 ? f170642D[b6 & 31] : f170643E[b6 & 31]));
                                            } else if (i14 != 17 && (b6 & 240) == 32) {
                                                this.f170653m.m126793a(' ');
                                                boolean z15 = (b6 & 1) == 1;
                                                C39662b c39662b = this.f170653m;
                                                c39662b.f170631a.add(new C39661a((b6 >> 1) & 7, z15, c39662b.f170633c.length()));
                                            } else if ((b & 240) != 16 && (b6 & 192) == 64) {
                                                int i19 = f170645y[b & 7];
                                                if ((b6 & 32) != 0) {
                                                    i19++;
                                                }
                                                C39662b c39662b2 = this.f170653m;
                                                if (i19 != c39662b2.f170634d) {
                                                    if (this.f170656p != 1 && !c39662b2.m126797e()) {
                                                        C39662b c39662b3 = new C39662b(this.f170656p, this.f170657q);
                                                        this.f170653m = c39662b3;
                                                        this.f170652l.add(c39662b3);
                                                    }
                                                    this.f170653m.f170634d = i19;
                                                }
                                                boolean z16 = (b6 & 16) == 16;
                                                boolean z17 = (b6 & 1) == 1;
                                                int i24 = (b6 >> 1) & 7;
                                                C39662b c39662b4 = this.f170653m;
                                                c39662b4.f170631a.add(new C39661a(z16 ? 8 : i24, z17, c39662b4.f170633c.length()));
                                                if (z16) {
                                                    this.f170653m.f170635e = f170646z[i24];
                                                }
                                            } else if (i14 != 23 && b6 >= 33 && b6 <= 35) {
                                                this.f170653m.f170636f = b6 - 32;
                                            } else if (i15 == 20 && (b6 & 240) == 32) {
                                                if (b6 == 32) {
                                                    m126804k(2);
                                                } else if (b6 != 41) {
                                                    switch (b6) {
                                                        case 37:
                                                            m126804k(1);
                                                            this.f170657q = 2;
                                                            this.f170653m.f170638h = 2;
                                                            break;
                                                        case 38:
                                                            m126804k(1);
                                                            this.f170657q = 3;
                                                            this.f170653m.f170638h = 3;
                                                            break;
                                                        case 39:
                                                            m126804k(1);
                                                            this.f170657q = 4;
                                                            this.f170653m.f170638h = 4;
                                                            break;
                                                        default:
                                                            i16 = this.f170656p;
                                                            if (i16 != 0) {
                                                                if (b6 != 33) {
                                                                    switch (b6) {
                                                                        case 44:
                                                                            this.f170654n = Collections.EMPTY_LIST;
                                                                            if (i16 != 1 || i16 == 3) {
                                                                                m126803j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i16 == 1 && !this.f170653m.m126797e()) {
                                                                                C39662b c39662b5 = this.f170653m;
                                                                                arrayList = c39662b5.f170632b;
                                                                                arrayList.add(c39662b5.m126796d());
                                                                                c39662b5.f170633c.setLength(0);
                                                                                c39662b5.f170631a.clear();
                                                                                iMin = Math.min(c39662b5.f170638h, c39662b5.f170634d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m126803j();
                                                                            break;
                                                                        case 47:
                                                                            this.f170654n = m126802i();
                                                                            m126803j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f170653m.m126794b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m126804k(3);
                                                }
                                            }
                                        } else {
                                            this.f170653m.m126793a((char) f170641C[b6 & 15]);
                                        }
                                    } else {
                                        C39662b c39662b6 = this.f170653m;
                                        iArr = f170640B;
                                        c39662b6.m126793a((char) iArr[(b & 127) - 32]);
                                        if ((b6 & 224) != 0) {
                                            this.f170653m.m126793a((char) iArr[(b6 & 127) - 32]);
                                        }
                                    }
                                    z13 = true;
                                }
                            }
                        } else if (z14) {
                            m126803j();
                            z13 = true;
                        }
                    } else if (this.f170659s && this.f170660t == b && this.f170661u == b6) {
                        this.f170659s = false;
                    } else {
                        this.f170659s = true;
                        this.f170660t = b;
                        this.f170661u = b6;
                        if (!z4) {
                            if (1 > b) {
                                if ((b & 247) == 20) {
                                    if (b6 == 32) {
                                        this.f170663w = true;
                                    } else {
                                        this.f170663w = true;
                                    }
                                }
                            } else if ((b & 247) == 20) {
                                if (b6 == 32) {
                                    this.f170663w = true;
                                } else {
                                    this.f170663w = true;
                                }
                            }
                            if (this.f170663w) {
                                i13 = b & 224;
                                if (i13 == 0) {
                                    this.f170662v = (b >> 3) & 1;
                                }
                                if (this.f170662v != this.f170650j) {
                                    if (i13 == 0) {
                                        i14 = b & 247;
                                        if (i14 == 17) {
                                            i15 = b & 246;
                                            if (i15 != 18) {
                                                if (i14 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i14 != 23) {
                                                            if (i15 == 20) {
                                                                if (b6 == 32) {
                                                                    m126804k(2);
                                                                } else if (b6 != 41) {
                                                                    switch (b6) {
                                                                        case 37:
                                                                            m126804k(1);
                                                                            this.f170657q = 2;
                                                                            this.f170653m.f170638h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m126804k(1);
                                                                            this.f170657q = 3;
                                                                            this.f170653m.f170638h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m126804k(1);
                                                                            this.f170657q = 4;
                                                                            this.f170653m.f170638h = 4;
                                                                            break;
                                                                        default:
                                                                            i16 = this.f170656p;
                                                                            if (i16 != 0) {
                                                                                if (b6 != 33) {
                                                                                    switch (b6) {
                                                                                        case 44:
                                                                                            this.f170654n = Collections.EMPTY_LIST;
                                                                                            if (i16 != 1) {
                                                                                                m126803j();
                                                                                            } else {
                                                                                                m126803j();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i16 == 1) {
                                                                                                C39662b c39662b7 = this.f170653m;
                                                                                                arrayList = c39662b7.f170632b;
                                                                                                arrayList.add(c39662b7.m126796d());
                                                                                                c39662b7.f170633c.setLength(0);
                                                                                                c39662b7.f170631a.clear();
                                                                                                iMin = Math.min(c39662b7.f170638h, c39662b7.f170634d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m126803j();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f170654n = m126802i();
                                                                                            m126803j();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f170653m.m126794b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m126804k(3);
                                                                }
                                                            }
                                                        } else if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b8 = this.f170653m;
                                                                                            arrayList = c39662b8.f170632b;
                                                                                            arrayList.add(c39662b8.m126796d());
                                                                                            c39662b8.f170633c.setLength(0);
                                                                                            c39662b8.f170631a.clear();
                                                                                            iMin = Math.min(c39662b8.f170638h, c39662b8.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b9 = this.f170653m;
                                                                                            arrayList = c39662b9.f170632b;
                                                                                            arrayList.add(c39662b9.m126796d());
                                                                                            c39662b9.f170633c.setLength(0);
                                                                                            c39662b9.f170631a.clear();
                                                                                            iMin = Math.min(c39662b9.f170638h, c39662b9.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b10 = this.f170653m;
                                                                                        arrayList = c39662b10.f170632b;
                                                                                        arrayList.add(c39662b10.m126796d());
                                                                                        c39662b10.f170633c.setLength(0);
                                                                                        c39662b10.f170631a.clear();
                                                                                        iMin = Math.min(c39662b10.f170638h, c39662b10.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b11 = this.f170653m;
                                                                                            arrayList = c39662b11.f170632b;
                                                                                            arrayList.add(c39662b11.m126796d());
                                                                                            c39662b11.f170633c.setLength(0);
                                                                                            c39662b11.f170631a.clear();
                                                                                            iMin = Math.min(c39662b11.f170638h, c39662b11.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b12 = this.f170653m;
                                                                                        arrayList = c39662b12.f170632b;
                                                                                        arrayList.add(c39662b12.m126796d());
                                                                                        c39662b12.f170633c.setLength(0);
                                                                                        c39662b12.f170631a.clear();
                                                                                        iMin = Math.min(c39662b12.f170638h, c39662b12.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b13 = this.f170653m;
                                                                                        arrayList = c39662b13.f170632b;
                                                                                        arrayList.add(c39662b13.m126796d());
                                                                                        c39662b13.f170633c.setLength(0);
                                                                                        c39662b13.f170631a.clear();
                                                                                        iMin = Math.min(c39662b13.f170638h, c39662b13.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b14 = this.f170653m;
                                                                                    arrayList = c39662b14.f170632b;
                                                                                    arrayList.add(c39662b14.m126796d());
                                                                                    c39662b14.f170633c.setLength(0);
                                                                                    c39662b14.f170631a.clear();
                                                                                    iMin = Math.min(c39662b14.f170638h, c39662b14.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if (i14 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b15 = this.f170653m;
                                                                                            arrayList = c39662b15.f170632b;
                                                                                            arrayList.add(c39662b15.m126796d());
                                                                                            c39662b15.f170633c.setLength(0);
                                                                                            c39662b15.f170631a.clear();
                                                                                            iMin = Math.min(c39662b15.f170638h, c39662b15.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b16 = this.f170653m;
                                                                                        arrayList = c39662b16.f170632b;
                                                                                        arrayList.add(c39662b16.m126796d());
                                                                                        c39662b16.f170633c.setLength(0);
                                                                                        c39662b16.f170631a.clear();
                                                                                        iMin = Math.min(c39662b16.f170638h, c39662b16.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b17 = this.f170653m;
                                                                                        arrayList = c39662b17.f170632b;
                                                                                        arrayList.add(c39662b17.m126796d());
                                                                                        c39662b17.f170633c.setLength(0);
                                                                                        c39662b17.f170631a.clear();
                                                                                        iMin = Math.min(c39662b17.f170638h, c39662b17.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b18 = this.f170653m;
                                                                                    arrayList = c39662b18.f170632b;
                                                                                    arrayList.add(c39662b18.m126796d());
                                                                                    c39662b18.f170633c.setLength(0);
                                                                                    c39662b18.f170631a.clear();
                                                                                    iMin = Math.min(c39662b18.f170638h, c39662b18.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b19 = this.f170653m;
                                                                                        arrayList = c39662b19.f170632b;
                                                                                        arrayList.add(c39662b19.m126796d());
                                                                                        c39662b19.f170633c.setLength(0);
                                                                                        c39662b19.f170631a.clear();
                                                                                        iMin = Math.min(c39662b19.f170638h, c39662b19.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b110 = this.f170653m;
                                                                                    arrayList = c39662b110.f170632b;
                                                                                    arrayList.add(c39662b110.m126796d());
                                                                                    c39662b110.f170633c.setLength(0);
                                                                                    c39662b110.f170631a.clear();
                                                                                    iMin = Math.min(c39662b110.f170638h, c39662b110.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if (i14 != 23) {
                                                if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b111 = this.f170653m;
                                                                                    arrayList = c39662b111.f170632b;
                                                                                    arrayList.add(c39662b111.m126796d());
                                                                                    c39662b111.f170633c.setLength(0);
                                                                                    c39662b111.f170631a.clear();
                                                                                    iMin = Math.min(c39662b111.f170638h, c39662b111.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if (i15 == 20) {
                                                if (b6 == 32) {
                                                    m126804k(2);
                                                } else if (b6 != 41) {
                                                    switch (b6) {
                                                        case 37:
                                                            m126804k(1);
                                                            this.f170657q = 2;
                                                            this.f170653m.f170638h = 2;
                                                            break;
                                                        case 38:
                                                            m126804k(1);
                                                            this.f170657q = 3;
                                                            this.f170653m.f170638h = 3;
                                                            break;
                                                        case 39:
                                                            m126804k(1);
                                                            this.f170657q = 4;
                                                            this.f170653m.f170638h = 4;
                                                            break;
                                                        default:
                                                            i16 = this.f170656p;
                                                            if (i16 != 0) {
                                                                if (b6 != 33) {
                                                                    switch (b6) {
                                                                        case 44:
                                                                            this.f170654n = Collections.EMPTY_LIST;
                                                                            if (i16 != 1) {
                                                                                m126803j();
                                                                            } else {
                                                                                m126803j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i16 == 1) {
                                                                                C39662b c39662b112 = this.f170653m;
                                                                                arrayList = c39662b112.f170632b;
                                                                                arrayList.add(c39662b112.m126796d());
                                                                                c39662b112.f170633c.setLength(0);
                                                                                c39662b112.f170631a.clear();
                                                                                iMin = Math.min(c39662b112.f170638h, c39662b112.f170634d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m126803j();
                                                                            break;
                                                                        case 47:
                                                                            this.f170654n = m126802i();
                                                                            m126803j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f170653m.m126794b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m126804k(3);
                                                }
                                            }
                                        } else {
                                            i15 = b & 246;
                                            if (i15 != 18) {
                                                if (i14 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i14 != 23) {
                                                            if (i15 == 20) {
                                                                if (b6 == 32) {
                                                                    m126804k(2);
                                                                } else if (b6 != 41) {
                                                                    switch (b6) {
                                                                        case 37:
                                                                            m126804k(1);
                                                                            this.f170657q = 2;
                                                                            this.f170653m.f170638h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m126804k(1);
                                                                            this.f170657q = 3;
                                                                            this.f170653m.f170638h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m126804k(1);
                                                                            this.f170657q = 4;
                                                                            this.f170653m.f170638h = 4;
                                                                            break;
                                                                        default:
                                                                            i16 = this.f170656p;
                                                                            if (i16 != 0) {
                                                                                if (b6 != 33) {
                                                                                    switch (b6) {
                                                                                        case 44:
                                                                                            this.f170654n = Collections.EMPTY_LIST;
                                                                                            if (i16 != 1) {
                                                                                                m126803j();
                                                                                            } else {
                                                                                                m126803j();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i16 == 1) {
                                                                                                C39662b c39662b113 = this.f170653m;
                                                                                                arrayList = c39662b113.f170632b;
                                                                                                arrayList.add(c39662b113.m126796d());
                                                                                                c39662b113.f170633c.setLength(0);
                                                                                                c39662b113.f170631a.clear();
                                                                                                iMin = Math.min(c39662b113.f170638h, c39662b113.f170634d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m126803j();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f170654n = m126802i();
                                                                                            m126803j();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f170653m.m126794b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m126804k(3);
                                                                }
                                                            }
                                                        } else if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b114 = this.f170653m;
                                                                                            arrayList = c39662b114.f170632b;
                                                                                            arrayList.add(c39662b114.m126796d());
                                                                                            c39662b114.f170633c.setLength(0);
                                                                                            c39662b114.f170631a.clear();
                                                                                            iMin = Math.min(c39662b114.f170638h, c39662b114.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b115 = this.f170653m;
                                                                                            arrayList = c39662b115.f170632b;
                                                                                            arrayList.add(c39662b115.m126796d());
                                                                                            c39662b115.f170633c.setLength(0);
                                                                                            c39662b115.f170631a.clear();
                                                                                            iMin = Math.min(c39662b115.f170638h, c39662b115.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b116 = this.f170653m;
                                                                                        arrayList = c39662b116.f170632b;
                                                                                        arrayList.add(c39662b116.m126796d());
                                                                                        c39662b116.f170633c.setLength(0);
                                                                                        c39662b116.f170631a.clear();
                                                                                        iMin = Math.min(c39662b116.f170638h, c39662b116.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b117 = this.f170653m;
                                                                                            arrayList = c39662b117.f170632b;
                                                                                            arrayList.add(c39662b117.m126796d());
                                                                                            c39662b117.f170633c.setLength(0);
                                                                                            c39662b117.f170631a.clear();
                                                                                            iMin = Math.min(c39662b117.f170638h, c39662b117.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b118 = this.f170653m;
                                                                                        arrayList = c39662b118.f170632b;
                                                                                        arrayList.add(c39662b118.m126796d());
                                                                                        c39662b118.f170633c.setLength(0);
                                                                                        c39662b118.f170631a.clear();
                                                                                        iMin = Math.min(c39662b118.f170638h, c39662b118.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b119 = this.f170653m;
                                                                                        arrayList = c39662b119.f170632b;
                                                                                        arrayList.add(c39662b119.m126796d());
                                                                                        c39662b119.f170633c.setLength(0);
                                                                                        c39662b119.f170631a.clear();
                                                                                        iMin = Math.min(c39662b119.f170638h, c39662b119.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b1110 = this.f170653m;
                                                                                    arrayList = c39662b1110.f170632b;
                                                                                    arrayList.add(c39662b1110.m126796d());
                                                                                    c39662b1110.f170633c.setLength(0);
                                                                                    c39662b1110.f170631a.clear();
                                                                                    iMin = Math.min(c39662b1110.f170638h, c39662b1110.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if (i14 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m126804k(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m126804k(1);
                                                                        this.f170657q = 2;
                                                                        this.f170653m.f170638h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m126804k(1);
                                                                        this.f170657q = 3;
                                                                        this.f170653m.f170638h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m126804k(1);
                                                                        this.f170657q = 4;
                                                                        this.f170653m.f170638h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f170656p;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f170654n = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m126803j();
                                                                                        } else {
                                                                                            m126803j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C39662b c39662b1111 = this.f170653m;
                                                                                            arrayList = c39662b1111.f170632b;
                                                                                            arrayList.add(c39662b1111.m126796d());
                                                                                            c39662b1111.f170633c.setLength(0);
                                                                                            c39662b1111.f170631a.clear();
                                                                                            iMin = Math.min(c39662b1111.f170638h, c39662b1111.f170634d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m126803j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f170654n = m126802i();
                                                                                        m126803j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f170653m.m126794b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m126804k(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b1112 = this.f170653m;
                                                                                        arrayList = c39662b1112.f170632b;
                                                                                        arrayList.add(c39662b1112.m126796d());
                                                                                        c39662b1112.f170633c.setLength(0);
                                                                                        c39662b1112.f170631a.clear();
                                                                                        iMin = Math.min(c39662b1112.f170638h, c39662b1112.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b1113 = this.f170653m;
                                                                                        arrayList = c39662b1113.f170632b;
                                                                                        arrayList.add(c39662b1113.m126796d());
                                                                                        c39662b1113.f170633c.setLength(0);
                                                                                        c39662b1113.f170631a.clear();
                                                                                        iMin = Math.min(c39662b1113.f170638h, c39662b1113.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b1114 = this.f170653m;
                                                                                    arrayList = c39662b1114.f170632b;
                                                                                    arrayList.add(c39662b1114.m126796d());
                                                                                    c39662b1114.f170633c.setLength(0);
                                                                                    c39662b1114.f170631a.clear();
                                                                                    iMin = Math.min(c39662b1114.f170638h, c39662b1114.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m126804k(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m126804k(1);
                                                                    this.f170657q = 2;
                                                                    this.f170653m.f170638h = 2;
                                                                    break;
                                                                case 38:
                                                                    m126804k(1);
                                                                    this.f170657q = 3;
                                                                    this.f170653m.f170638h = 3;
                                                                    break;
                                                                case 39:
                                                                    m126804k(1);
                                                                    this.f170657q = 4;
                                                                    this.f170653m.f170638h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f170656p;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f170654n = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m126803j();
                                                                                    } else {
                                                                                        m126803j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C39662b c39662b1115 = this.f170653m;
                                                                                        arrayList = c39662b1115.f170632b;
                                                                                        arrayList.add(c39662b1115.m126796d());
                                                                                        c39662b1115.f170633c.setLength(0);
                                                                                        c39662b1115.f170631a.clear();
                                                                                        iMin = Math.min(c39662b1115.f170638h, c39662b1115.f170634d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m126803j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f170654n = m126802i();
                                                                                    m126803j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f170653m.m126794b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m126804k(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b1116 = this.f170653m;
                                                                                    arrayList = c39662b1116.f170632b;
                                                                                    arrayList.add(c39662b1116.m126796d());
                                                                                    c39662b1116.f170633c.setLength(0);
                                                                                    c39662b1116.f170631a.clear();
                                                                                    iMin = Math.min(c39662b1116.f170638h, c39662b1116.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if (i14 != 23) {
                                                if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m126804k(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m126804k(1);
                                                                this.f170657q = 2;
                                                                this.f170653m.f170638h = 2;
                                                                break;
                                                            case 38:
                                                                m126804k(1);
                                                                this.f170657q = 3;
                                                                this.f170653m.f170638h = 3;
                                                                break;
                                                            case 39:
                                                                m126804k(1);
                                                                this.f170657q = 4;
                                                                this.f170653m.f170638h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f170656p;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f170654n = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m126803j();
                                                                                } else {
                                                                                    m126803j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C39662b c39662b1117 = this.f170653m;
                                                                                    arrayList = c39662b1117.f170632b;
                                                                                    arrayList.add(c39662b1117.m126796d());
                                                                                    c39662b1117.f170633c.setLength(0);
                                                                                    c39662b1117.f170631a.clear();
                                                                                    iMin = Math.min(c39662b1117.f170638h, c39662b1117.f170634d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m126803j();
                                                                                break;
                                                                            case 47:
                                                                                this.f170654n = m126802i();
                                                                                m126803j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f170653m.m126794b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m126804k(3);
                                                    }
                                                }
                                            } else if (i15 == 20) {
                                                if (b6 == 32) {
                                                    m126804k(2);
                                                } else if (b6 != 41) {
                                                    switch (b6) {
                                                        case 37:
                                                            m126804k(1);
                                                            this.f170657q = 2;
                                                            this.f170653m.f170638h = 2;
                                                            break;
                                                        case 38:
                                                            m126804k(1);
                                                            this.f170657q = 3;
                                                            this.f170653m.f170638h = 3;
                                                            break;
                                                        case 39:
                                                            m126804k(1);
                                                            this.f170657q = 4;
                                                            this.f170653m.f170638h = 4;
                                                            break;
                                                        default:
                                                            i16 = this.f170656p;
                                                            if (i16 != 0) {
                                                                if (b6 != 33) {
                                                                    switch (b6) {
                                                                        case 44:
                                                                            this.f170654n = Collections.EMPTY_LIST;
                                                                            if (i16 != 1) {
                                                                                m126803j();
                                                                            } else {
                                                                                m126803j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i16 == 1) {
                                                                                C39662b c39662b1118 = this.f170653m;
                                                                                arrayList = c39662b1118.f170632b;
                                                                                arrayList.add(c39662b1118.m126796d());
                                                                                c39662b1118.f170633c.setLength(0);
                                                                                c39662b1118.f170631a.clear();
                                                                                iMin = Math.min(c39662b1118.f170638h, c39662b1118.f170634d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m126803j();
                                                                            break;
                                                                        case 47:
                                                                            this.f170654n = m126802i();
                                                                            m126803j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f170653m.m126794b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m126804k(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C39662b c39662b20 = this.f170653m;
                                        iArr = f170640B;
                                        c39662b20.m126793a((char) iArr[(b & 127) - 32]);
                                        if ((b6 & 224) != 0) {
                                            this.f170653m.m126793a((char) iArr[(b6 & 127) - 32]);
                                        }
                                    }
                                    z13 = true;
                                }
                            }
                        } else if (z14) {
                            m126803j();
                            z13 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p654yn.AbstractC39668h, p527um.InterfaceC35072b
    public final void flush() {
        super.flush();
        this.f170654n = null;
        this.f170655o = null;
        m126804k(0);
        this.f170657q = 4;
        this.f170653m.f170638h = 4;
        m126803j();
        this.f170658r = false;
        this.f170659s = false;
        this.f170660t = (byte) 0;
        this.f170661u = (byte) 0;
        this.f170662v = 0;
        this.f170663w = true;
        this.f170664x = -9223372036854775807L;
    }

    @Override // p654yn.AbstractC39668h, p527um.InterfaceC35072b
    /* JADX INFO: renamed from: g */
    public final C38466c mo35860b() {
        C38466c c38466c;
        C38466c c38466cMo35860b = super.mo35860b();
        if (c38466cMo35860b != null) {
            return c38466cMo35860b;
        }
        long j7 = this.f170651k;
        if (j7 == -9223372036854775807L) {
            return null;
        }
        long j13 = this.f170664x;
        if (j13 == -9223372036854775807L || this.f170715e - j13 < j7 || (c38466c = (C38466c) this.f170712b.pollFirst()) == null) {
            return null;
        }
        this.f170654n = Collections.EMPTY_LIST;
        this.f170664x = -9223372036854775807L;
        c38466c.m123261p(this.f170715e, mo126798e(), Long.MAX_VALUE);
        return c38466c;
    }

    @Override // p654yn.AbstractC39668h
    /* JADX INFO: renamed from: h */
    public final boolean mo126801h() {
        return this.f170654n != this.f170655o;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m126802i() {
        ArrayList arrayList = this.f170652l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i13 = 0; i13 < size; i13++) {
            C38465b c38465bM126795c = ((C39662b) arrayList.get(i13)).m126795c(Integer.MIN_VALUE);
            arrayList2.add(c38465bM126795c);
            if (c38465bM126795c != null) {
                iMin = Math.min(iMin, c38465bM126795c.f164729I);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            C38465b c38465bM126795c2 = (C38465b) arrayList2.get(i14);
            if (c38465bM126795c2 != null) {
                if (c38465bM126795c2.f164729I != iMin) {
                    c38465bM126795c2 = ((C39662b) arrayList.get(i14)).m126795c(iMin);
                    c38465bM126795c2.getClass();
                }
                arrayList3.add(c38465bM126795c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: j */
    public final void m126803j() {
        C39662b c39662b = this.f170653m;
        c39662b.f170637g = this.f170656p;
        c39662b.f170631a.clear();
        c39662b.f170632b.clear();
        c39662b.f170633c.setLength(0);
        c39662b.f170634d = 15;
        c39662b.f170635e = 0;
        c39662b.f170636f = 0;
        ArrayList arrayList = this.f170652l;
        arrayList.clear();
        arrayList.add(this.f170653m);
    }

    /* JADX INFO: renamed from: k */
    public final void m126804k(int i13) {
        int i14 = this.f170656p;
        if (i14 == i13) {
            return;
        }
        this.f170656p = i13;
        if (i13 != 3) {
            m126803j();
            if (i14 == 3 || i13 == 1 || i13 == 0) {
                this.f170654n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.f170652l;
            if (i15 >= arrayList.size()) {
                return;
            }
            ((C39662b) arrayList.get(i15)).f170637g = i13;
            i15++;
        }
    }

    @Override // p654yn.AbstractC39668h, p527um.InterfaceC35072b
    public final void release() {
    }
}

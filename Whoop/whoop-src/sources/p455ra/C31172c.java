package p455ra;

import androidx.recyclerview.widget.AbstractC1707m0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012ab.C0679g;
import p576w8.C36932b;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import qa.C30099d;

/* JADX INFO: renamed from: ra.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C31172c extends AbstractC31177h {

    /* JADX INFO: renamed from: i */
    public final int f128404i;

    /* JADX INFO: renamed from: j */
    public final int f128405j;

    /* JADX INFO: renamed from: k */
    public final int f128406k;

    /* JADX INFO: renamed from: o */
    public List f128410o;

    /* JADX INFO: renamed from: p */
    public List f128411p;

    /* JADX INFO: renamed from: q */
    public int f128412q;

    /* JADX INFO: renamed from: r */
    public int f128413r;

    /* JADX INFO: renamed from: s */
    public boolean f128414s;

    /* JADX INFO: renamed from: t */
    public boolean f128415t;

    /* JADX INFO: renamed from: u */
    public byte f128416u;

    /* JADX INFO: renamed from: v */
    public byte f128417v;

    /* JADX INFO: renamed from: x */
    public boolean f128419x;

    /* JADX INFO: renamed from: y */
    public long f128420y;

    /* JADX INFO: renamed from: z */
    public static final int[] f128402z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A */
    public static final int[] f128395A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B */
    public static final int[] f128396B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C */
    public static final int[] f128397C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D */
    public static final int[] f128398D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E */
    public static final int[] f128399E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F */
    public static final int[] f128400F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G */
    public static final boolean[] f128401G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h */
    public final C38059n f128403h = new C38059n();

    /* JADX INFO: renamed from: m */
    public final ArrayList f128408m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public C31171b f128409n = new C31171b(0, 4);

    /* JADX INFO: renamed from: w */
    public int f128418w = 0;

    /* JADX INFO: renamed from: l */
    public final long f128407l = 16000000;

    public C31172c(String str, int i13) {
        this.f128404i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i13 == 1) {
            this.f128406k = 0;
            this.f128405j = 0;
        } else if (i13 == 2) {
            this.f128406k = 1;
            this.f128405j = 0;
        } else if (i13 == 3) {
            this.f128406k = 0;
            this.f128405j = 1;
        } else if (i13 != 4) {
            AbstractC38046a.m121826u("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f128406k = 0;
            this.f128405j = 0;
        } else {
            this.f128406k = 1;
            this.f128405j = 1;
        }
        m95898l(0);
        m95897k();
        this.f128419x = true;
        this.f128420y = -9223372036854775807L;
    }

    @Override // p455ra.AbstractC31177h
    /* JADX INFO: renamed from: f */
    public final C0679g mo95892f() {
        List list = this.f128410o;
        this.f128411p = list;
        list.getClass();
        return new C0679g(list, 4);
    }

    @Override // p455ra.AbstractC31177h, p010a9.InterfaceC0579d
    public final void flush() {
        super.flush();
        this.f128410o = null;
        this.f128411p = null;
        m95898l(0);
        this.f128413r = 4;
        this.f128409n.f128394h = 4;
        m95897k();
        this.f128414s = false;
        this.f128415t = false;
        this.f128416u = (byte) 0;
        this.f128417v = (byte) 0;
        this.f128418w = 0;
        this.f128419x = true;
        this.f128420y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p455ra.AbstractC31177h
    /* JADX INFO: renamed from: g */
    public final void mo95893g(C31176g c31176g) {
        boolean z4;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c31176g.f2063E;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C38059n c38059n = this.f128403h;
        c38059n.m121844D(iLimit, bArrArray);
        boolean z13 = false;
        while (true) {
            int iM121848a = c38059n.m121848a();
            int i17 = this.f128404i;
            if (iM121848a < i17) {
                if (z13) {
                    int i18 = this.f128412q;
                    if (i18 == 1 || i18 == 3) {
                        this.f128410o = m95896j();
                        this.f128420y = this.f128470e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM121867t = i17 == 2 ? -4 : c38059n.m121867t();
            int iM121867t2 = c38059n.m121867t();
            int iM121867t3 = c38059n.m121867t();
            if ((iM121867t & 2) == 0 && (iM121867t & 1) == this.f128405j) {
                byte b = (byte) (iM121867t2 & 127);
                byte b6 = (byte) (iM121867t3 & 127);
                if (b != 0 || b6 != 0) {
                    boolean z14 = this.f128414s;
                    if ((iM121867t & 4) == 4) {
                        boolean[] zArr = f128401G;
                        if (zArr[iM121867t2] && zArr[iM121867t3]) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    this.f128414s = z4;
                    if (!z4 || (b & 240) != 16) {
                        this.f128415t = false;
                        if (!z4) {
                            if (1 > b && b <= 15) {
                                this.f128419x = false;
                            } else if ((b & 246) == 20) {
                                if (b6 == 32 && b6 != 47) {
                                    switch (b6) {
                                        default:
                                            switch (b6) {
                                                case 42:
                                                case 43:
                                                    this.f128419x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f128419x = true;
                                            break;
                                    }
                                } else {
                                    this.f128419x = true;
                                }
                            }
                            if (this.f128419x) {
                                i13 = b & 224;
                                if (i13 == 0) {
                                    this.f128418w = (b >> 3) & 1;
                                }
                                if (this.f128418w != this.f128406k) {
                                    if (i13 == 0) {
                                        i14 = b & 247;
                                        if (i14 == 17 || (b6 & 240) != 48) {
                                            i15 = b & 246;
                                            if (i15 != 18 && (b6 & 224) == 32) {
                                                this.f128409n.m95888b();
                                                this.f128409n.m95887a((char) ((b & 1) == 0 ? f128399E[b6 & 31] : f128400F[b6 & 31]));
                                            } else if (i14 != 17 && (b6 & 240) == 32) {
                                                this.f128409n.m95887a(' ');
                                                boolean z15 = (b6 & 1) == 1;
                                                C31171b c31171b = this.f128409n;
                                                c31171b.f128387a.add(new C31170a((b6 >> 1) & 7, z15, c31171b.f128389c.length()));
                                            } else if ((b & 240) != 16 && (b6 & 192) == 64) {
                                                int i19 = f128402z[b & 7];
                                                if ((b6 & 32) != 0) {
                                                    i19++;
                                                }
                                                C31171b c31171b2 = this.f128409n;
                                                if (i19 != c31171b2.f128390d) {
                                                    if (this.f128412q != 1 && !c31171b2.m95891e()) {
                                                        C31171b c31171b3 = new C31171b(this.f128412q, this.f128413r);
                                                        this.f128409n = c31171b3;
                                                        this.f128408m.add(c31171b3);
                                                    }
                                                    this.f128409n.f128390d = i19;
                                                }
                                                boolean z16 = (b6 & 16) == 16;
                                                boolean z17 = (b6 & 1) == 1;
                                                int i24 = (b6 >> 1) & 7;
                                                C31171b c31171b4 = this.f128409n;
                                                c31171b4.f128387a.add(new C31170a(z16 ? 8 : i24, z17, c31171b4.f128389c.length()));
                                                if (z16) {
                                                    this.f128409n.f128391e = f128395A[i24];
                                                }
                                            } else if (i14 != 23 && b6 >= 33 && b6 <= 35) {
                                                this.f128409n.f128392f = b6 - 32;
                                            } else if (i15 == 20 && (b6 & 240) == 32) {
                                                if (b6 == 32) {
                                                    m95898l(2);
                                                } else if (b6 != 41) {
                                                    switch (b6) {
                                                        case 37:
                                                            m95898l(1);
                                                            this.f128413r = 2;
                                                            this.f128409n.f128394h = 2;
                                                            break;
                                                        case 38:
                                                            m95898l(1);
                                                            this.f128413r = 3;
                                                            this.f128409n.f128394h = 3;
                                                            break;
                                                        case 39:
                                                            m95898l(1);
                                                            this.f128413r = 4;
                                                            this.f128409n.f128394h = 4;
                                                            break;
                                                        default:
                                                            i16 = this.f128412q;
                                                            if (i16 != 0) {
                                                                if (b6 != 33) {
                                                                    switch (b6) {
                                                                        case 44:
                                                                            this.f128410o = Collections.EMPTY_LIST;
                                                                            if (i16 != 1 || i16 == 3) {
                                                                                m95897k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i16 == 1 && !this.f128409n.m95891e()) {
                                                                                C31171b c31171b5 = this.f128409n;
                                                                                arrayList = c31171b5.f128388b;
                                                                                arrayList.add(c31171b5.m95890d());
                                                                                c31171b5.f128389c.setLength(0);
                                                                                c31171b5.f128387a.clear();
                                                                                iMin = Math.min(c31171b5.f128394h, c31171b5.f128390d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m95897k();
                                                                            break;
                                                                        case 47:
                                                                            this.f128410o = m95896j();
                                                                            m95897k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f128409n.m95888b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m95898l(3);
                                                }
                                            }
                                        } else {
                                            this.f128409n.m95887a((char) f128398D[b6 & 15]);
                                        }
                                    } else {
                                        C31171b c31171b6 = this.f128409n;
                                        iArr = f128397C;
                                        c31171b6.m95887a((char) iArr[(b & 127) - 32]);
                                        if ((b6 & 224) != 0) {
                                            this.f128409n.m95887a((char) iArr[(b6 & 127) - 32]);
                                        }
                                    }
                                    z13 = true;
                                }
                            }
                        } else if (z14) {
                            m95897k();
                            z13 = true;
                        }
                    } else if (this.f128415t && this.f128416u == b && this.f128417v == b6) {
                        this.f128415t = false;
                    } else {
                        this.f128415t = true;
                        this.f128416u = b;
                        this.f128417v = b6;
                        if (!z4) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b6 == 32) {
                                        this.f128419x = true;
                                    } else {
                                        this.f128419x = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b6 == 32) {
                                    this.f128419x = true;
                                } else {
                                    this.f128419x = true;
                                }
                            }
                            if (this.f128419x) {
                                i13 = b & 224;
                                if (i13 == 0) {
                                    this.f128418w = (b >> 3) & 1;
                                }
                                if (this.f128418w != this.f128406k) {
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
                                                                    m95898l(2);
                                                                } else if (b6 != 41) {
                                                                    switch (b6) {
                                                                        case 37:
                                                                            m95898l(1);
                                                                            this.f128413r = 2;
                                                                            this.f128409n.f128394h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m95898l(1);
                                                                            this.f128413r = 3;
                                                                            this.f128409n.f128394h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m95898l(1);
                                                                            this.f128413r = 4;
                                                                            this.f128409n.f128394h = 4;
                                                                            break;
                                                                        default:
                                                                            i16 = this.f128412q;
                                                                            if (i16 != 0) {
                                                                                if (b6 != 33) {
                                                                                    switch (b6) {
                                                                                        case 44:
                                                                                            this.f128410o = Collections.EMPTY_LIST;
                                                                                            if (i16 != 1) {
                                                                                                m95897k();
                                                                                            } else {
                                                                                                m95897k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i16 == 1) {
                                                                                                C31171b c31171b7 = this.f128409n;
                                                                                                arrayList = c31171b7.f128388b;
                                                                                                arrayList.add(c31171b7.m95890d());
                                                                                                c31171b7.f128389c.setLength(0);
                                                                                                c31171b7.f128387a.clear();
                                                                                                iMin = Math.min(c31171b7.f128394h, c31171b7.f128390d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m95897k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f128410o = m95896j();
                                                                                            m95897k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f128409n.m95888b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m95898l(3);
                                                                }
                                                            }
                                                        } else if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b8 = this.f128409n;
                                                                                            arrayList = c31171b8.f128388b;
                                                                                            arrayList.add(c31171b8.m95890d());
                                                                                            c31171b8.f128389c.setLength(0);
                                                                                            c31171b8.f128387a.clear();
                                                                                            iMin = Math.min(c31171b8.f128394h, c31171b8.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b9 = this.f128409n;
                                                                                            arrayList = c31171b9.f128388b;
                                                                                            arrayList.add(c31171b9.m95890d());
                                                                                            c31171b9.f128389c.setLength(0);
                                                                                            c31171b9.f128387a.clear();
                                                                                            iMin = Math.min(c31171b9.f128394h, c31171b9.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b10 = this.f128409n;
                                                                                        arrayList = c31171b10.f128388b;
                                                                                        arrayList.add(c31171b10.m95890d());
                                                                                        c31171b10.f128389c.setLength(0);
                                                                                        c31171b10.f128387a.clear();
                                                                                        iMin = Math.min(c31171b10.f128394h, c31171b10.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b11 = this.f128409n;
                                                                                            arrayList = c31171b11.f128388b;
                                                                                            arrayList.add(c31171b11.m95890d());
                                                                                            c31171b11.f128389c.setLength(0);
                                                                                            c31171b11.f128387a.clear();
                                                                                            iMin = Math.min(c31171b11.f128394h, c31171b11.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b12 = this.f128409n;
                                                                                        arrayList = c31171b12.f128388b;
                                                                                        arrayList.add(c31171b12.m95890d());
                                                                                        c31171b12.f128389c.setLength(0);
                                                                                        c31171b12.f128387a.clear();
                                                                                        iMin = Math.min(c31171b12.f128394h, c31171b12.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b13 = this.f128409n;
                                                                                        arrayList = c31171b13.f128388b;
                                                                                        arrayList.add(c31171b13.m95890d());
                                                                                        c31171b13.f128389c.setLength(0);
                                                                                        c31171b13.f128387a.clear();
                                                                                        iMin = Math.min(c31171b13.f128394h, c31171b13.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b14 = this.f128409n;
                                                                                    arrayList = c31171b14.f128388b;
                                                                                    arrayList.add(c31171b14.m95890d());
                                                                                    c31171b14.f128389c.setLength(0);
                                                                                    c31171b14.f128387a.clear();
                                                                                    iMin = Math.min(c31171b14.f128394h, c31171b14.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if (i14 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b15 = this.f128409n;
                                                                                            arrayList = c31171b15.f128388b;
                                                                                            arrayList.add(c31171b15.m95890d());
                                                                                            c31171b15.f128389c.setLength(0);
                                                                                            c31171b15.f128387a.clear();
                                                                                            iMin = Math.min(c31171b15.f128394h, c31171b15.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b16 = this.f128409n;
                                                                                        arrayList = c31171b16.f128388b;
                                                                                        arrayList.add(c31171b16.m95890d());
                                                                                        c31171b16.f128389c.setLength(0);
                                                                                        c31171b16.f128387a.clear();
                                                                                        iMin = Math.min(c31171b16.f128394h, c31171b16.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b17 = this.f128409n;
                                                                                        arrayList = c31171b17.f128388b;
                                                                                        arrayList.add(c31171b17.m95890d());
                                                                                        c31171b17.f128389c.setLength(0);
                                                                                        c31171b17.f128387a.clear();
                                                                                        iMin = Math.min(c31171b17.f128394h, c31171b17.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b18 = this.f128409n;
                                                                                    arrayList = c31171b18.f128388b;
                                                                                    arrayList.add(c31171b18.m95890d());
                                                                                    c31171b18.f128389c.setLength(0);
                                                                                    c31171b18.f128387a.clear();
                                                                                    iMin = Math.min(c31171b18.f128394h, c31171b18.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b19 = this.f128409n;
                                                                                        arrayList = c31171b19.f128388b;
                                                                                        arrayList.add(c31171b19.m95890d());
                                                                                        c31171b19.f128389c.setLength(0);
                                                                                        c31171b19.f128387a.clear();
                                                                                        iMin = Math.min(c31171b19.f128394h, c31171b19.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b110 = this.f128409n;
                                                                                    arrayList = c31171b110.f128388b;
                                                                                    arrayList.add(c31171b110.m95890d());
                                                                                    c31171b110.f128389c.setLength(0);
                                                                                    c31171b110.f128387a.clear();
                                                                                    iMin = Math.min(c31171b110.f128394h, c31171b110.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if (i14 != 23) {
                                                if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b111 = this.f128409n;
                                                                                    arrayList = c31171b111.f128388b;
                                                                                    arrayList.add(c31171b111.m95890d());
                                                                                    c31171b111.f128389c.setLength(0);
                                                                                    c31171b111.f128387a.clear();
                                                                                    iMin = Math.min(c31171b111.f128394h, c31171b111.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if (i15 == 20) {
                                                if (b6 == 32) {
                                                    m95898l(2);
                                                } else if (b6 != 41) {
                                                    switch (b6) {
                                                        case 37:
                                                            m95898l(1);
                                                            this.f128413r = 2;
                                                            this.f128409n.f128394h = 2;
                                                            break;
                                                        case 38:
                                                            m95898l(1);
                                                            this.f128413r = 3;
                                                            this.f128409n.f128394h = 3;
                                                            break;
                                                        case 39:
                                                            m95898l(1);
                                                            this.f128413r = 4;
                                                            this.f128409n.f128394h = 4;
                                                            break;
                                                        default:
                                                            i16 = this.f128412q;
                                                            if (i16 != 0) {
                                                                if (b6 != 33) {
                                                                    switch (b6) {
                                                                        case 44:
                                                                            this.f128410o = Collections.EMPTY_LIST;
                                                                            if (i16 != 1) {
                                                                                m95897k();
                                                                            } else {
                                                                                m95897k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i16 == 1) {
                                                                                C31171b c31171b112 = this.f128409n;
                                                                                arrayList = c31171b112.f128388b;
                                                                                arrayList.add(c31171b112.m95890d());
                                                                                c31171b112.f128389c.setLength(0);
                                                                                c31171b112.f128387a.clear();
                                                                                iMin = Math.min(c31171b112.f128394h, c31171b112.f128390d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m95897k();
                                                                            break;
                                                                        case 47:
                                                                            this.f128410o = m95896j();
                                                                            m95897k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f128409n.m95888b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m95898l(3);
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
                                                                    m95898l(2);
                                                                } else if (b6 != 41) {
                                                                    switch (b6) {
                                                                        case 37:
                                                                            m95898l(1);
                                                                            this.f128413r = 2;
                                                                            this.f128409n.f128394h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m95898l(1);
                                                                            this.f128413r = 3;
                                                                            this.f128409n.f128394h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m95898l(1);
                                                                            this.f128413r = 4;
                                                                            this.f128409n.f128394h = 4;
                                                                            break;
                                                                        default:
                                                                            i16 = this.f128412q;
                                                                            if (i16 != 0) {
                                                                                if (b6 != 33) {
                                                                                    switch (b6) {
                                                                                        case 44:
                                                                                            this.f128410o = Collections.EMPTY_LIST;
                                                                                            if (i16 != 1) {
                                                                                                m95897k();
                                                                                            } else {
                                                                                                m95897k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i16 == 1) {
                                                                                                C31171b c31171b113 = this.f128409n;
                                                                                                arrayList = c31171b113.f128388b;
                                                                                                arrayList.add(c31171b113.m95890d());
                                                                                                c31171b113.f128389c.setLength(0);
                                                                                                c31171b113.f128387a.clear();
                                                                                                iMin = Math.min(c31171b113.f128394h, c31171b113.f128390d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m95897k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f128410o = m95896j();
                                                                                            m95897k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f128409n.m95888b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m95898l(3);
                                                                }
                                                            }
                                                        } else if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b114 = this.f128409n;
                                                                                            arrayList = c31171b114.f128388b;
                                                                                            arrayList.add(c31171b114.m95890d());
                                                                                            c31171b114.f128389c.setLength(0);
                                                                                            c31171b114.f128387a.clear();
                                                                                            iMin = Math.min(c31171b114.f128394h, c31171b114.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b115 = this.f128409n;
                                                                                            arrayList = c31171b115.f128388b;
                                                                                            arrayList.add(c31171b115.m95890d());
                                                                                            c31171b115.f128389c.setLength(0);
                                                                                            c31171b115.f128387a.clear();
                                                                                            iMin = Math.min(c31171b115.f128394h, c31171b115.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b116 = this.f128409n;
                                                                                        arrayList = c31171b116.f128388b;
                                                                                        arrayList.add(c31171b116.m95890d());
                                                                                        c31171b116.f128389c.setLength(0);
                                                                                        c31171b116.f128387a.clear();
                                                                                        iMin = Math.min(c31171b116.f128394h, c31171b116.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b117 = this.f128409n;
                                                                                            arrayList = c31171b117.f128388b;
                                                                                            arrayList.add(c31171b117.m95890d());
                                                                                            c31171b117.f128389c.setLength(0);
                                                                                            c31171b117.f128387a.clear();
                                                                                            iMin = Math.min(c31171b117.f128394h, c31171b117.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b118 = this.f128409n;
                                                                                        arrayList = c31171b118.f128388b;
                                                                                        arrayList.add(c31171b118.m95890d());
                                                                                        c31171b118.f128389c.setLength(0);
                                                                                        c31171b118.f128387a.clear();
                                                                                        iMin = Math.min(c31171b118.f128394h, c31171b118.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b119 = this.f128409n;
                                                                                        arrayList = c31171b119.f128388b;
                                                                                        arrayList.add(c31171b119.m95890d());
                                                                                        c31171b119.f128389c.setLength(0);
                                                                                        c31171b119.f128387a.clear();
                                                                                        iMin = Math.min(c31171b119.f128394h, c31171b119.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b1110 = this.f128409n;
                                                                                    arrayList = c31171b1110.f128388b;
                                                                                    arrayList.add(c31171b1110.m95890d());
                                                                                    c31171b1110.f128389c.setLength(0);
                                                                                    c31171b1110.f128387a.clear();
                                                                                    iMin = Math.min(c31171b1110.f128394h, c31171b1110.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if (i14 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i14 != 23) {
                                                        if (i15 == 20) {
                                                            if (b6 == 32) {
                                                                m95898l(2);
                                                            } else if (b6 != 41) {
                                                                switch (b6) {
                                                                    case 37:
                                                                        m95898l(1);
                                                                        this.f128413r = 2;
                                                                        this.f128409n.f128394h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m95898l(1);
                                                                        this.f128413r = 3;
                                                                        this.f128409n.f128394h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m95898l(1);
                                                                        this.f128413r = 4;
                                                                        this.f128409n.f128394h = 4;
                                                                        break;
                                                                    default:
                                                                        i16 = this.f128412q;
                                                                        if (i16 != 0) {
                                                                            if (b6 != 33) {
                                                                                switch (b6) {
                                                                                    case 44:
                                                                                        this.f128410o = Collections.EMPTY_LIST;
                                                                                        if (i16 != 1) {
                                                                                            m95897k();
                                                                                        } else {
                                                                                            m95897k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i16 == 1) {
                                                                                            C31171b c31171b1111 = this.f128409n;
                                                                                            arrayList = c31171b1111.f128388b;
                                                                                            arrayList.add(c31171b1111.m95890d());
                                                                                            c31171b1111.f128389c.setLength(0);
                                                                                            c31171b1111.f128387a.clear();
                                                                                            iMin = Math.min(c31171b1111.f128394h, c31171b1111.f128390d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m95897k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f128410o = m95896j();
                                                                                        m95897k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f128409n.m95888b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m95898l(3);
                                                            }
                                                        }
                                                    } else if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b1112 = this.f128409n;
                                                                                        arrayList = c31171b1112.f128388b;
                                                                                        arrayList.add(c31171b1112.m95890d());
                                                                                        c31171b1112.f128389c.setLength(0);
                                                                                        c31171b1112.f128387a.clear();
                                                                                        iMin = Math.min(c31171b1112.f128394h, c31171b1112.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b1113 = this.f128409n;
                                                                                        arrayList = c31171b1113.f128388b;
                                                                                        arrayList.add(c31171b1113.m95890d());
                                                                                        c31171b1113.f128389c.setLength(0);
                                                                                        c31171b1113.f128387a.clear();
                                                                                        iMin = Math.min(c31171b1113.f128394h, c31171b1113.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b1114 = this.f128409n;
                                                                                    arrayList = c31171b1114.f128388b;
                                                                                    arrayList.add(c31171b1114.m95890d());
                                                                                    c31171b1114.f128389c.setLength(0);
                                                                                    c31171b1114.f128387a.clear();
                                                                                    iMin = Math.min(c31171b1114.f128394h, c31171b1114.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i14 != 23) {
                                                    if (i15 == 20) {
                                                        if (b6 == 32) {
                                                            m95898l(2);
                                                        } else if (b6 != 41) {
                                                            switch (b6) {
                                                                case 37:
                                                                    m95898l(1);
                                                                    this.f128413r = 2;
                                                                    this.f128409n.f128394h = 2;
                                                                    break;
                                                                case 38:
                                                                    m95898l(1);
                                                                    this.f128413r = 3;
                                                                    this.f128409n.f128394h = 3;
                                                                    break;
                                                                case 39:
                                                                    m95898l(1);
                                                                    this.f128413r = 4;
                                                                    this.f128409n.f128394h = 4;
                                                                    break;
                                                                default:
                                                                    i16 = this.f128412q;
                                                                    if (i16 != 0) {
                                                                        if (b6 != 33) {
                                                                            switch (b6) {
                                                                                case 44:
                                                                                    this.f128410o = Collections.EMPTY_LIST;
                                                                                    if (i16 != 1) {
                                                                                        m95897k();
                                                                                    } else {
                                                                                        m95897k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i16 == 1) {
                                                                                        C31171b c31171b1115 = this.f128409n;
                                                                                        arrayList = c31171b1115.f128388b;
                                                                                        arrayList.add(c31171b1115.m95890d());
                                                                                        c31171b1115.f128389c.setLength(0);
                                                                                        c31171b1115.f128387a.clear();
                                                                                        iMin = Math.min(c31171b1115.f128394h, c31171b1115.f128390d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m95897k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f128410o = m95896j();
                                                                                    m95897k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f128409n.m95888b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m95898l(3);
                                                        }
                                                    }
                                                } else if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b1116 = this.f128409n;
                                                                                    arrayList = c31171b1116.f128388b;
                                                                                    arrayList.add(c31171b1116.m95890d());
                                                                                    c31171b1116.f128389c.setLength(0);
                                                                                    c31171b1116.f128387a.clear();
                                                                                    iMin = Math.min(c31171b1116.f128394h, c31171b1116.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if (i14 != 23) {
                                                if (i15 == 20) {
                                                    if (b6 == 32) {
                                                        m95898l(2);
                                                    } else if (b6 != 41) {
                                                        switch (b6) {
                                                            case 37:
                                                                m95898l(1);
                                                                this.f128413r = 2;
                                                                this.f128409n.f128394h = 2;
                                                                break;
                                                            case 38:
                                                                m95898l(1);
                                                                this.f128413r = 3;
                                                                this.f128409n.f128394h = 3;
                                                                break;
                                                            case 39:
                                                                m95898l(1);
                                                                this.f128413r = 4;
                                                                this.f128409n.f128394h = 4;
                                                                break;
                                                            default:
                                                                i16 = this.f128412q;
                                                                if (i16 != 0) {
                                                                    if (b6 != 33) {
                                                                        switch (b6) {
                                                                            case 44:
                                                                                this.f128410o = Collections.EMPTY_LIST;
                                                                                if (i16 != 1) {
                                                                                    m95897k();
                                                                                } else {
                                                                                    m95897k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i16 == 1) {
                                                                                    C31171b c31171b1117 = this.f128409n;
                                                                                    arrayList = c31171b1117.f128388b;
                                                                                    arrayList.add(c31171b1117.m95890d());
                                                                                    c31171b1117.f128389c.setLength(0);
                                                                                    c31171b1117.f128387a.clear();
                                                                                    iMin = Math.min(c31171b1117.f128394h, c31171b1117.f128390d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m95897k();
                                                                                break;
                                                                            case 47:
                                                                                this.f128410o = m95896j();
                                                                                m95897k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f128409n.m95888b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m95898l(3);
                                                    }
                                                }
                                            } else if (i15 == 20) {
                                                if (b6 == 32) {
                                                    m95898l(2);
                                                } else if (b6 != 41) {
                                                    switch (b6) {
                                                        case 37:
                                                            m95898l(1);
                                                            this.f128413r = 2;
                                                            this.f128409n.f128394h = 2;
                                                            break;
                                                        case 38:
                                                            m95898l(1);
                                                            this.f128413r = 3;
                                                            this.f128409n.f128394h = 3;
                                                            break;
                                                        case 39:
                                                            m95898l(1);
                                                            this.f128413r = 4;
                                                            this.f128409n.f128394h = 4;
                                                            break;
                                                        default:
                                                            i16 = this.f128412q;
                                                            if (i16 != 0) {
                                                                if (b6 != 33) {
                                                                    switch (b6) {
                                                                        case 44:
                                                                            this.f128410o = Collections.EMPTY_LIST;
                                                                            if (i16 != 1) {
                                                                                m95897k();
                                                                            } else {
                                                                                m95897k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i16 == 1) {
                                                                                C31171b c31171b1118 = this.f128409n;
                                                                                arrayList = c31171b1118.f128388b;
                                                                                arrayList.add(c31171b1118.m95890d());
                                                                                c31171b1118.f128389c.setLength(0);
                                                                                c31171b1118.f128387a.clear();
                                                                                iMin = Math.min(c31171b1118.f128394h, c31171b1118.f128390d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m95897k();
                                                                            break;
                                                                        case 47:
                                                                            this.f128410o = m95896j();
                                                                            m95897k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f128409n.m95888b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m95898l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C31171b c31171b20 = this.f128409n;
                                        iArr = f128397C;
                                        c31171b20.m95887a((char) iArr[(b & 127) - 32]);
                                        if ((b6 & 224) != 0) {
                                            this.f128409n.m95887a((char) iArr[(b6 & 127) - 32]);
                                        }
                                    }
                                    z13 = true;
                                }
                            }
                        } else if (z14) {
                            m95897k();
                            z13 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p455ra.AbstractC31177h, p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: h */
    public final C30099d mo1502b() {
        C30099d c30099d;
        C30099d c30099dMo1502b = super.mo1502b();
        if (c30099dMo1502b != null) {
            return c30099dMo1502b;
        }
        long j7 = this.f128407l;
        if (j7 == -9223372036854775807L) {
            return null;
        }
        long j13 = this.f128420y;
        if (j13 == -9223372036854775807L || this.f128470e - j13 < j7 || (c30099d = (C30099d) this.f128467b.pollFirst()) == null) {
            return null;
        }
        this.f128410o = Collections.EMPTY_LIST;
        this.f128420y = -9223372036854775807L;
        C0679g c0679gMo95892f = mo95892f();
        long j14 = this.f128470e;
        c30099d.f2070y = j14;
        c30099d.f122826E = c0679gMo95892f;
        c30099d.f122827F = j14;
        return c30099d;
    }

    @Override // p455ra.AbstractC31177h
    /* JADX INFO: renamed from: i */
    public final boolean mo95895i() {
        return this.f128410o != this.f128411p;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m95896j() {
        ArrayList arrayList = this.f128408m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i13 = 0; i13 < size; i13++) {
            C36932b c36932bM95889c = ((C31171b) arrayList.get(i13)).m95889c(Integer.MIN_VALUE);
            arrayList2.add(c36932bM95889c);
            if (c36932bM95889c != null) {
                iMin = Math.min(iMin, c36932bM95889c.f158053i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            C36932b c36932bM95889c2 = (C36932b) arrayList2.get(i14);
            if (c36932bM95889c2 != null) {
                if (c36932bM95889c2.f158053i != iMin) {
                    c36932bM95889c2 = ((C31171b) arrayList.get(i14)).m95889c(iMin);
                    c36932bM95889c2.getClass();
                }
                arrayList3.add(c36932bM95889c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m95897k() {
        C31171b c31171b = this.f128409n;
        c31171b.f128393g = this.f128412q;
        c31171b.f128387a.clear();
        c31171b.f128388b.clear();
        c31171b.f128389c.setLength(0);
        c31171b.f128390d = 15;
        c31171b.f128391e = 0;
        c31171b.f128392f = 0;
        ArrayList arrayList = this.f128408m;
        arrayList.clear();
        arrayList.add(this.f128409n);
    }

    /* JADX INFO: renamed from: l */
    public final void m95898l(int i13) {
        int i14 = this.f128412q;
        if (i14 == i13) {
            return;
        }
        this.f128412q = i13;
        if (i13 != 3) {
            m95897k();
            if (i14 == 3 || i13 == 1 || i13 == 0) {
                this.f128410o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.f128408m;
            if (i15 >= arrayList.size()) {
                return;
            }
            ((C31171b) arrayList.get(i15)).f128393g = i13;
            i15++;
        }
    }

    @Override // p455ra.AbstractC31177h, p010a9.InterfaceC0579d
    public final void release() {
    }
}

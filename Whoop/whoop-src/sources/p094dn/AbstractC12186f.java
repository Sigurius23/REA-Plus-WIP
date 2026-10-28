package p094dn;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.material.datepicker.C5020n;
import com.iterable.iterableapi.C5363q;
import ed3.C13117a;
import io.getstream.chat.android.client.ChatClient;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mo.C25720a;
import mo.C25721b;
import mo.C25726g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p010a9.AbstractC0576a;
import p087db.C11856j0;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p479s4.AbstractC32126g;
import p556vm.C36136c;
import p588wm.C37371m;
import p658yr.AbstractC39717d;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: dn.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12186f {

    /* JADX INFO: renamed from: a */
    public static final byte[] f40627a;

    static {
        int i13 = AbstractC24567y.f95875a;
        f40627a = "OpusHead".getBytes(AbstractC39717d.f170958c);
    }

    /* JADX INFO: renamed from: a */
    public static Pair m33795a(int i13, C13117a c13117a) {
        c13117a.m36689K(i13 + 12);
        c13117a.m36690L(1);
        m33796b(c13117a);
        c13117a.m36690L(2);
        int iM36715y = c13117a.m36715y();
        if ((iM36715y & 128) != 0) {
            c13117a.m36690L(2);
        }
        if ((iM36715y & 64) != 0) {
            c13117a.m36690L(c13117a.m36682D());
        }
        if ((iM36715y & 32) != 0) {
            c13117a.m36690L(2);
        }
        c13117a.m36690L(1);
        m33796b(c13117a);
        String strM71610d = AbstractC24555m.m71610d(c13117a.m36715y());
        if ("audio/mpeg".equals(strM71610d) || "audio/vnd.dts".equals(strM71610d) || "audio/vnd.dts.hd".equals(strM71610d)) {
            return Pair.create(strM71610d, null);
        }
        c13117a.m36690L(12);
        c13117a.m36690L(1);
        int iM33796b = m33796b(c13117a);
        byte[] bArr = new byte[iM33796b];
        c13117a.m36697g(bArr, 0, iM33796b);
        return Pair.create(strM71610d, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m33796b(C13117a c13117a) {
        int iM36715y = c13117a.m36715y();
        int i13 = iM36715y & 127;
        while ((iM36715y & 128) == 128) {
            iM36715y = c13117a.m36715y();
            i13 = (i13 << 7) | (iM36715y & 127);
        }
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public static Pair m33797c(C13117a c13117a, int i13, int i14) throws ParserException {
        C12198r c12198r;
        Pair pairCreate;
        int i15;
        int i16;
        int i17 = c13117a.f45382b;
        while (i17 - i13 < i14) {
            c13117a.m36689K(i17);
            int iM36699i = c13117a.m36699i();
            AbstractC32126g.m100039d("childAtomSize must be positive", iM36699i > 0);
            if (c13117a.m36699i() == 1936289382) {
                int i18 = i17 + 8;
                int i19 = 0;
                int i24 = -1;
                Integer numValueOf = null;
                String strM36712v = null;
                while (i18 - i17 < iM36699i) {
                    c13117a.m36689K(i18);
                    int iM36699i2 = c13117a.m36699i();
                    int iM36699i3 = c13117a.m36699i();
                    if (iM36699i3 == 1718775137) {
                        numValueOf = Integer.valueOf(c13117a.m36699i());
                    } else if (iM36699i3 == 1935894637) {
                        c13117a.m36690L(4);
                        strM36712v = c13117a.m36712v(4, AbstractC39717d.f170958c);
                    } else if (iM36699i3 == 1935894633) {
                        i24 = i18;
                        i19 = iM36699i2;
                    }
                    i18 += iM36699i2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM36712v) || "cbc1".equals(strM36712v) || "cens".equals(strM36712v) || "cbcs".equals(strM36712v)) {
                    AbstractC32126g.m100039d("frma atom is mandatory", numValueOf != null);
                    AbstractC32126g.m100039d("schi atom is mandatory", i24 != -1);
                    int i25 = i24 + 8;
                    while (true) {
                        if (i25 - i24 >= i19) {
                            c12198r = null;
                            break;
                        }
                        c13117a.m36689K(i25);
                        int iM36699i4 = c13117a.m36699i();
                        if (c13117a.m36699i() == 1952804451) {
                            int iM1494n = AbstractC0576a.m1494n(c13117a.m36699i());
                            c13117a.m36690L(1);
                            if (iM1494n == 0) {
                                c13117a.m36690L(1);
                                i16 = 0;
                                i15 = 0;
                            } else {
                                int iM36715y = c13117a.m36715y();
                                i15 = iM36715y & 15;
                                i16 = (iM36715y & 240) >> 4;
                            }
                            boolean z4 = c13117a.m36715y() == 1;
                            int iM36715y2 = c13117a.m36715y();
                            byte[] bArr2 = new byte[16];
                            c13117a.m36697g(bArr2, 0, 16);
                            if (z4 && iM36715y2 == 0) {
                                int iM36715y3 = c13117a.m36715y();
                                byte[] bArr3 = new byte[iM36715y3];
                                c13117a.m36697g(bArr3, 0, iM36715y3);
                                bArr = bArr3;
                            }
                            c12198r = new C12198r(z4, strM36712v, iM36715y2, bArr2, i16, i15, bArr);
                            break;
                        }
                        i25 += iM36699i4;
                    }
                    AbstractC32126g.m100039d("tenc atom is mandatory", c12198r != null);
                    int i26 = AbstractC24567y.f95875a;
                    pairCreate = Pair.create(numValueOf, c12198r);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i17 += iM36699i;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0291  */
    /* JADX WARN: Code duplicated, block: B:103:0x029a A[LOOP:12: B:99:0x028f->B:103:0x029a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x02a0 A[EDGE_INSN: B:104:0x02a0->B:105:0x02a2 BREAK  A[LOOP:12: B:99:0x028f->B:103:0x029a]] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0314  */
    /* JADX WARN: Code duplicated, block: B:121:0x0322  */
    /* JADX WARN: Code duplicated, block: B:123:0x0331  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0401  */
    /* JADX WARN: Code duplicated, block: B:160:0x040b A[LOOP:4: B:158:0x0408->B:160:0x040b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x0430  */
    /* JADX WARN: Code duplicated, block: B:165:0x0433  */
    /* JADX WARN: Code duplicated, block: B:166:0x0435  */
    /* JADX WARN: Code duplicated, block: B:170:0x0448  */
    /* JADX WARN: Code duplicated, block: B:172:0x0453  */
    /* JADX WARN: Code duplicated, block: B:180:0x048a  */
    /* JADX WARN: Code duplicated, block: B:181:0x048c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0494  */
    /* JADX WARN: Code duplicated, block: B:187:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:188:0x04af  */
    /* JADX WARN: Code duplicated, block: B:191:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:194:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x04be  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:201:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:207:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:236:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01f3 A[EDGE_INSN: B:241:0x01f3->B:69:0x01f3 BREAK  A[LOOP:10: B:65:0x01d6->B:68:0x01de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de A[LOOP:10: B:65:0x01d6->B:68:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x021b  */
    /* JADX WARN: Code duplicated, block: B:75:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x023a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0242  */
    /* JADX WARN: Code duplicated, block: B:84:0x0245  */
    /* JADX WARN: Code duplicated, block: B:87:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0251  */
    /* JADX WARN: Code duplicated, block: B:92:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0270  */
    /* JADX WARN: Code duplicated, block: B:99:0x028f A[DONT_INVERT, LOOP:12: B:99:0x028f->B:103:0x029a, LOOP_START, PHI: r17
      0x028f: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:98:0x028d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public static C12200t m33798d(C12197q c12197q, C12181a c12181a, C37371m c37371m) throws ParserException {
        InterfaceC12184d c12185e;
        boolean z4;
        int iM36680B;
        int iM36680B2;
        int i13;
        int iM36680B3;
        int iMo15740b;
        int i14;
        InterfaceC12184d interfaceC12184d;
        long j7;
        C13117a c13117a;
        long[] jArr;
        long[] jArr2;
        int i15;
        long j13;
        long[] jArr3;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        C13117a c13117a2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        long j14;
        long j15;
        int iM36680B4;
        int iM36699i;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int[] iArrCopyOf2;
        int i35;
        int i36;
        String str;
        long[] jArr4;
        long[] jArr5;
        int[] iArr2;
        int iMax;
        long j16;
        long j17;
        int i37;
        boolean zM33784a;
        int i38;
        int iMo15739a;
        int i39;
        int iM36680B5;
        int[] iArr3;
        long jM71666D;
        int i44;
        int i45;
        long j18;
        int[] iArr4;
        long[] jArr6;
        long[] jArr7;
        int i46;
        int i47;
        boolean z13;
        int[] iArr5;
        int[] iArr6;
        int i48;
        boolean z14;
        int i49;
        int i54;
        int i55;
        int[] iArr7;
        int[] iArr8;
        boolean z15;
        boolean z16;
        long[] jArr8;
        int[] iArr9;
        int i56;
        int[] iArr10;
        long[] jArr9;
        int i57;
        int i58;
        int i59;
        long j19;
        long j24;
        int i64;
        int i65;
        int[] iArr11;
        int[] iArr12;
        long j25;
        int i66;
        int i67;
        int i68;
        boolean z17;
        long j26;
        int i69;
        boolean z18;
        C31521c0 c31521c0 = c12197q.f40723f;
        C12182b c12182bM33783p = c12181a.m33783p(1937011578);
        if (c12182bM33783p != null) {
            c12185e = new C5020n(c12182bM33783p, c31521c0);
        } else {
            C12182b c12182bM33783p2 = c12181a.m33783p(1937013298);
            if (c12182bM33783p2 == null) {
                throw ParserException.m15562a(null, "Track has no sample table size information");
            }
            c12185e = new C12185e(c12182bM33783p2);
        }
        int iMo15741c = c12185e.mo15741c();
        if (iMo15741c == 0) {
            return new C12200t(c12197q, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        C12182b c12182bM33783p3 = c12181a.m33783p(1937007471);
        if (c12182bM33783p3 == null) {
            c12182bM33783p3 = c12181a.m33783p(1668232756);
            c12182bM33783p3.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        C13117a c13117a3 = c12182bM33783p3.f40610y;
        C12182b c12182bM33783p4 = c12181a.m33783p(1937011555);
        c12182bM33783p4.getClass();
        C13117a c13117a4 = c12182bM33783p4.f40610y;
        C12182b c12182bM33783p5 = c12181a.m33783p(1937011827);
        c12182bM33783p5.getClass();
        C13117a c13117a5 = c12182bM33783p5.f40610y;
        C12182b c12182bM33783p6 = c12181a.m33783p(1937011571);
        C13117a c13117a6 = c12182bM33783p6 != null ? c12182bM33783p6.f40610y : null;
        C12182b c12182bM33783p7 = c12181a.m33783p(1668576371);
        C13117a c13117a7 = c12182bM33783p7 != null ? c12182bM33783p7.f40610y : null;
        C12183c c12183c = new C12183c(c13117a4, c13117a3, z4);
        c13117a5.m36689K(12);
        int iM36680B6 = c13117a5.m36680B() - 1;
        int iM36680B7 = c13117a5.m36680B();
        int iM36680B8 = c13117a5.m36680B();
        if (c13117a7 != null) {
            c13117a7.m36689K(12);
            iM36680B = c13117a7.m36680B();
        } else {
            iM36680B = 0;
        }
        if (c13117a6 != null) {
            c13117a6.m36689K(12);
            iM36680B2 = c13117a6.m36680B();
            if (iM36680B2 > 0) {
                iM36680B3 = c13117a6.m36680B() - 1;
                i13 = 0;
            } else {
                i13 = 0;
                c13117a6 = null;
            }
            iMo15740b = c12185e.mo15740b();
            i14 = c12197q.f40719b;
            interfaceC12184d = c12185e;
            j7 = c12197q.f40720c;
            c13117a = c13117a7;
            jArr = c12197q.f40726i;
            jArr2 = c12197q.f40725h;
            i15 = iM36680B2;
            String str2 = c31521c0.f130077L;
            j13 = 0;
            if (iMo15740b == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM36680B6 == 0 && iM36680B == 0 && i15 == 0)) {
                int i74 = c12183c.f40612b;
                long[] jArr10 = new long[i74];
                int[] iArr13 = new int[i74];
                while (c12183c.m33784a()) {
                    int i75 = c12183c.f40613c;
                    long[] jArr11 = jArr10;
                    int[] iArr14 = iArr13;
                    jArr11[i75] = c12183c.f40615e;
                    iArr14[i75] = c12183c.f40614d;
                    jArr10 = jArr11;
                    iArr13 = iArr14;
                }
                long[] jArr12 = jArr10;
                int[] iArr15 = iArr13;
                long j27 = iM36680B8;
                int i76 = DfuBaseService.ERROR_REMOTE_MASK / iMo15740b;
                int i77 = i13;
                int iM71675f = i77;
                while (i77 < i74) {
                    iM71675f += AbstractC24567y.m71675f(iArr15[i77], i76);
                    i77++;
                    iMo15740b = iMo15740b;
                }
                int i78 = iMo15740b;
                long[] jArr13 = new long[iM71675f];
                iArrCopyOf2 = new int[iM71675f];
                long[] jArr14 = new long[iM71675f];
                iArr2 = new int[iM71675f];
                int i79 = i13;
                int i83 = i79;
                iMax = i83;
                int i84 = iMax;
                while (i79 < i74) {
                    int i85 = iArr15[i79];
                    long j28 = jArr12[i79];
                    int i86 = i79;
                    int i87 = i85;
                    while (i87 > 0) {
                        int iMin = Math.min(i76, i87);
                        jArr13[i84] = j28;
                        int i88 = i87;
                        int i89 = i78 * iMin;
                        iArrCopyOf2[i84] = i89;
                        iMax = Math.max(iMax, i89);
                        jArr14[i84] = ((long) i83) * j27;
                        iArr2[i84] = 1;
                        j28 += (long) iArrCopyOf2[i84];
                        i83 += iMin;
                        i87 = i88 - iMin;
                        i84++;
                        i74 = i74;
                    }
                    i79 = i86 + 1;
                }
                j16 = ((long) i83) * j27;
                jArr4 = jArr13;
                jArr5 = jArr14;
            } else {
                jArr3 = new long[iMo15741c];
                iArr = new int[iMo15741c];
                jArrCopyOf = new long[iMo15741c];
                iArrCopyOf = new int[iMo15741c];
                c13117a2 = c13117a6;
                i16 = iM36680B8;
                i17 = i13;
                i18 = i17;
                i19 = i18;
                i24 = i15;
                i25 = iM36680B7;
                j14 = 0;
                j15 = 0;
                iM36680B4 = iM36680B3;
                iM36699i = i19;
                i26 = iM36680B;
                i27 = iM36680B6;
                i28 = iM36699i;
                while (true) {
                    if (i28 >= iMo15741c) {
                        i29 = i27;
                        i34 = i25;
                        iArrCopyOf2 = iArr;
                        i35 = i18;
                        break;
                    }
                    j17 = j15;
                    i37 = i18;
                    zM33784a = true;
                    while (i37 == 0) {
                        zM33784a = c12183c.m33784a();
                        if (!zM33784a) {
                            break;
                        }
                        int i94 = i27;
                        long j29 = c12183c.f40615e;
                        i37 = c12183c.f40614d;
                        j17 = j29;
                        i27 = i94;
                        i25 = i25;
                        iMo15741c = iMo15741c;
                    }
                    i38 = iMo15741c;
                    i29 = i27;
                    i34 = i25;
                    if (!zM33784a) {
                        Log.w("AtomParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i28);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i28);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                        iMo15741c = i28;
                        jArr3 = jArrCopyOf2;
                        i35 = i37;
                        break;
                    }
                    if (c13117a != null) {
                        iM36680B5 = i19;
                        while (iM36680B5 == 0 && i26 > 0) {
                            iM36680B5 = c13117a.m36680B();
                            iM36699i = c13117a.m36699i();
                            i26--;
                        }
                        i19 = iM36680B5 - 1;
                    }
                    jArr3[i28] = j17;
                    iMo15739a = interfaceC12184d.mo15739a();
                    iArr[i28] = iMo15739a;
                    if (iMo15739a > i17) {
                        i17 = iMo15739a;
                    }
                    jArrCopyOf[i28] = j14 + ((long) iM36699i);
                    if (c13117a2 == null) {
                        i39 = 1;
                    } else {
                        i39 = i13;
                    }
                    iArrCopyOf[i28] = i39;
                    if (i28 == iM36680B4) {
                        iArrCopyOf[i28] = 1;
                        i24--;
                        if (i24 > 0) {
                            c13117a2.getClass();
                            iM36680B4 = c13117a2.m36680B() - 1;
                        }
                    }
                    j14 += (long) i16;
                    i25 = i34 - 1;
                    if (i25 == 0 || i29 <= 0) {
                        i27 = i29;
                    } else {
                        int iM36680B9 = c13117a5.m36680B();
                        int iM36699i2 = c13117a5.m36699i();
                        i27 = i29 - 1;
                        i25 = iM36680B9;
                        i16 = iM36699i2;
                    }
                    long j34 = j17 + ((long) iArr[i28]);
                    i18 = i37 - 1;
                    i28++;
                    j15 = j34;
                    iMo15741c = i38;
                }
                long j35 = j14 + ((long) iM36699i);
                if (c13117a == null) {
                    i36 = 1;
                    break;
                }
                while (true) {
                    if (i26 <= 0) {
                        i36 = 1;
                        break;
                    }
                    if (c13117a.m36680B() != 0) {
                        i36 = i13;
                        break;
                    }
                    c13117a.m36699i();
                    i26--;
                }
                if (i24 == 0 || i34 != 0 || i35 != 0 || i29 != 0 || i19 != 0 || i36 == 0) {
                    int i95 = c12197q.f40718a;
                    if (i36 == 0) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb4 = new StringBuilder(str.length() + 262);
                    sb4.append("Inconsistent stbl box for track ");
                    sb4.append(i95);
                    sb4.append(": remainingSynchronizationSamples ");
                    sb4.append(i24);
                    sb4.append(", remainingSamplesAtTimestampDelta ");
                    sb4.append(i34);
                    sb4.append(", remainingSamplesInChunk ");
                    sb4.append(i35);
                    sb4.append(", remainingTimestampDeltaChanges ");
                    sb4.append(i29);
                    sb4.append(", remainingSamplesAtTimestampOffset ");
                    sb4.append(i19);
                    sb4.append(str);
                    Log.w("AtomParsers", sb4.toString());
                }
                jArr4 = jArr3;
                jArr5 = jArrCopyOf;
                iArr2 = iArrCopyOf;
                iMax = i17;
                j16 = j35;
            }
            iArr3 = iArrCopyOf2;
            jM71666D = AbstractC24567y.m71666D(j16, 1000000L, c12197q.f40720c);
            if (jArr2 == 0) {
                AbstractC24567y.m71667E(jArr5, j7);
                return new C12200t(c12197q, jArr4, iArr3, iMax, jArr5, iArr2, jM71666D);
            }
            int i96 = iMax;
            i44 = iMo15741c;
            i45 = i96;
            j18 = j16;
            iArr4 = iArr2;
            jArr6 = jArr5;
            if (jArr7.length == 1) {
                i46 = i14;
                if (i46 == 1 || jArr6.length < 2) {
                    jArr7 = jArr2;
                    jArr7 = jArr2;
                } else {
                    jArr.getClass();
                    long j36 = jArr[i13];
                    long[] jArr15 = jArr4;
                    long jM71666D2 = AbstractC24567y.m71666D(jArr7[i13], c12197q.f40720c, c12197q.f40721d) + j36;
                    int length = jArr6.length - 1;
                    int i97 = i13;
                    int iM71677h = AbstractC24567y.m71677h(4, i97, length);
                    int iM71677h2 = AbstractC24567y.m71677h(jArr6.length - 4, i97, length);
                    long j37 = jArr6[i97];
                    if (j37 > j36 || j36 >= jArr6[iM71677h] || jArr6[iM71677h2] >= jM71666D2 || jM71666D2 > j18) {
                        jArr7 = jArr2;
                        jArr7 = jArr2;
                        jArr7 = jArr2;
                        jArr7 = jArr2;
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (z18) {
                        long jM71666D3 = AbstractC24567y.m71666D(j36 - j37, c31521c0.f130091Z, c12197q.f40720c);
                        long jM71666D4 = AbstractC24567y.m71666D(j18 - jM71666D2, c31521c0.f130091Z, c12197q.f40720c);
                        if (jM71666D3 != 0 || jM71666D4 != 0) {
                            jArr7 = jArr2;
                            jArr7 = jArr2;
                            if (jM71666D3 <= 2147483647L && jM71666D4 <= 2147483647L) {
                                c37371m.f159861a = (int) jM71666D3;
                                c37371m.f159862b = (int) jM71666D4;
                                AbstractC24567y.m71667E(jArr6, j7);
                                return new C12200t(c12197q, jArr15, iArr3, i45, jArr6, iArr4, AbstractC24567y.m71666D(jArr7[0], 1000000L, c12197q.f40721d));
                            }
                        }
                        jArr7 = jArr2;
                        iArr4 = iArr4;
                        iArr3 = iArr3;
                        i45 = i45;
                        jArr4 = jArr15;
                    } else {
                        jArr7 = jArr2;
                        jArr4 = jArr15;
                        iArr3 = iArr3;
                        i45 = i45;
                    }
                }
            } else {
                jArr7 = jArr2;
                i46 = i14;
            }
            i47 = 1;
            if (jArr7.length == 1) {
                if (jArr7[0] == 0) {
                    jArr.getClass();
                    j26 = jArr[0];
                    for (i69 = 0; i69 < jArr6.length; i69++) {
                        jArr6[i69] = AbstractC24567y.m71666D(jArr6[i69] - j26, 1000000L, c12197q.f40720c);
                    }
                    return new C12200t(c12197q, jArr4, iArr3, i45, jArr6, iArr4, AbstractC24567y.m71666D(j18 - j26, 1000000L, c12197q.f40720c));
                }
                i47 = 1;
            }
            if (i46 == i47) {
                z13 = true;
            } else {
                z13 = false;
            }
            iArr5 = new int[jArr7.length];
            iArr6 = new int[jArr7.length];
            jArr.getClass();
            i48 = 0;
            z14 = false;
            i49 = 0;
            i54 = 0;
            while (i48 < jArr7.length) {
                iArr11 = iArr5;
                iArr12 = iArr6;
                j25 = jArr[i48];
                if (j25 != -1) {
                    i66 = i48;
                    boolean z19 = z14;
                    long jM71666D5 = AbstractC24567y.m71666D(jArr7[i48], c12197q.f40720c, c12197q.f40721d);
                    iArr11[i66] = AbstractC24567y.m71674e(jArr6, j25, true);
                    iArr12[i66] = AbstractC24567y.m71671b(jArr6, j25 + jM71666D5, z13);
                    while (true) {
                        i67 = iArr11[i66];
                        i68 = iArr12[i66];
                        if (i67 >= i68 || (iArr4[i67] & 1) != 0) {
                            break;
                        }
                        iArr11[i66] = i67 + 1;
                    }
                    int i98 = (i68 - i67) + i49;
                    if (i54 != i67) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z14 = z19 | z17;
                    i54 = i68;
                    i49 = i98;
                } else {
                    i66 = i48;
                }
                i48 = i66 + 1;
                iArr5 = iArr11;
                iArr6 = iArr12;
                i45 = i45;
            }
            i55 = i45;
            iArr7 = iArr5;
            iArr8 = iArr6;
            boolean z24 = z14;
            if (i49 != i44) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z24 | z15;
            if (z16) {
                jArr8 = new long[i49];
            } else {
                jArr8 = jArr4;
            }
            if (z16) {
                iArr9 = new int[i49];
            } else {
                iArr9 = iArr3;
            }
            if (z16) {
                i56 = 0;
            } else {
                i56 = i55;
            }
            if (z16) {
                iArr10 = new int[i49];
            } else {
                iArr10 = iArr4;
            }
            jArr9 = new long[i49];
            i57 = i56;
            i58 = 0;
            i59 = 0;
            j19 = 0;
            while (i58 < jArr7.length) {
                j24 = jArr[i58];
                i64 = iArr7[i58];
                long[] jArr16 = jArr7;
                i65 = iArr8[i58];
                int i99 = i57;
                if (z16) {
                    int i100 = i65 - i64;
                    System.arraycopy(jArr4, i64, jArr8, i59, i100);
                    System.arraycopy(iArr3, i64, iArr9, i59, i100);
                    System.arraycopy(iArr4, i64, iArr10, i59, i100);
                }
                i57 = i99;
                while (i64 < i65) {
                    long[] jArr17 = jArr4;
                    int[] iArr16 = iArr3;
                    long jM71666D6 = AbstractC24567y.m71666D(j19, 1000000L, c12197q.f40721d);
                    long j38 = jArr6[i64] - j24;
                    long[] jArr18 = jArr6;
                    int[] iArr17 = iArr4;
                    long j39 = j13;
                    jArr9[i59] = jM71666D6 + AbstractC24567y.m71666D(Math.max(j39, j38), 1000000L, c12197q.f40720c);
                    if (!z16 && iArr9[i59] > i57) {
                        i57 = iArr16[i64];
                    }
                    i59++;
                    i64++;
                    j13 = j39;
                    jArr4 = jArr17;
                    iArr3 = iArr16;
                    iArr4 = iArr17;
                    jArr6 = jArr18;
                }
                j19 += jArr16[i58];
                i58++;
                jArr4 = jArr4;
                iArr3 = iArr3;
                iArr4 = iArr4;
                jArr6 = jArr6;
                jArr7 = jArr16;
            }
            return new C12200t(c12197q, jArr8, iArr9, i57, jArr9, iArr10, AbstractC24567y.m71666D(j19, 1000000L, c12197q.f40721d));
        }
        iM36680B2 = 0;
        i13 = 0;
        iM36680B3 = -1;
        iMo15740b = c12185e.mo15740b();
        i14 = c12197q.f40719b;
        interfaceC12184d = c12185e;
        j7 = c12197q.f40720c;
        c13117a = c13117a7;
        jArr = c12197q.f40726i;
        jArr2 = c12197q.f40725h;
        i15 = iM36680B2;
        String str3 = c31521c0.f130077L;
        j13 = 0;
        if (iMo15740b == -1) {
            jArr3 = new long[iMo15741c];
            iArr = new int[iMo15741c];
            jArrCopyOf = new long[iMo15741c];
            iArrCopyOf = new int[iMo15741c];
            c13117a2 = c13117a6;
            i16 = iM36680B8;
            i17 = i13;
            i18 = i17;
            i19 = i18;
            i24 = i15;
            i25 = iM36680B7;
            j14 = 0;
            j15 = 0;
            iM36680B4 = iM36680B3;
            iM36699i = i19;
            i26 = iM36680B;
            i27 = iM36680B6;
            i28 = iM36699i;
            while (true) {
                if (i28 >= iMo15741c) {
                    i29 = i27;
                    i34 = i25;
                    iArrCopyOf2 = iArr;
                    i35 = i18;
                    break;
                }
                j17 = j15;
                i37 = i18;
                zM33784a = true;
                while (i37 == 0) {
                    zM33784a = c12183c.m33784a();
                    if (!zM33784a) {
                        break;
                        break;
                    }
                    int i910 = i27;
                    long j210 = c12183c.f40615e;
                    i37 = c12183c.f40614d;
                    j17 = j210;
                    i27 = i910;
                    i25 = i25;
                    iMo15741c = iMo15741c;
                }
                i38 = iMo15741c;
                i29 = i27;
                i34 = i25;
                if (!zM33784a) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i28);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i28);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                    iMo15741c = i28;
                    jArr3 = jArrCopyOf3;
                    i35 = i37;
                    break;
                }
                if (c13117a != null) {
                    iM36680B5 = i19;
                    while (iM36680B5 == 0) {
                        iM36680B5 = c13117a.m36680B();
                        iM36699i = c13117a.m36699i();
                        i26--;
                    }
                    i19 = iM36680B5 - 1;
                }
                jArr3[i28] = j17;
                iMo15739a = interfaceC12184d.mo15739a();
                iArr[i28] = iMo15739a;
                if (iMo15739a > i17) {
                    i17 = iMo15739a;
                }
                jArrCopyOf[i28] = j14 + ((long) iM36699i);
                if (c13117a2 == null) {
                    i39 = 1;
                } else {
                    i39 = i13;
                }
                iArrCopyOf[i28] = i39;
                if (i28 == iM36680B4) {
                    iArrCopyOf[i28] = 1;
                    i24--;
                    if (i24 > 0) {
                        c13117a2.getClass();
                        iM36680B4 = c13117a2.m36680B() - 1;
                    }
                }
                j14 += (long) i16;
                i25 = i34 - 1;
                if (i25 == 0) {
                    i27 = i29;
                } else {
                    i27 = i29;
                }
                long j310 = j17 + ((long) iArr[i28]);
                i18 = i37 - 1;
                i28++;
                j15 = j310;
                iMo15741c = i38;
            }
            long j311 = j14 + ((long) iM36699i);
            if (c13117a == null) {
                i36 = 1;
                break;
            }
            while (true) {
                if (i26 <= 0) {
                    i36 = 1;
                    break;
                }
                if (c13117a.m36680B() != 0) {
                    i36 = i13;
                    break;
                }
                c13117a.m36699i();
                i26--;
            }
            if (i24 == 0) {
                int i911 = c12197q.f40718a;
                if (i36 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb5 = new StringBuilder(str.length() + 262);
                sb5.append("Inconsistent stbl box for track ");
                sb5.append(i911);
                sb5.append(": remainingSynchronizationSamples ");
                sb5.append(i24);
                sb5.append(", remainingSamplesAtTimestampDelta ");
                sb5.append(i34);
                sb5.append(", remainingSamplesInChunk ");
                sb5.append(i35);
                sb5.append(", remainingTimestampDeltaChanges ");
                sb5.append(i29);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i19);
                sb5.append(str);
                Log.w("AtomParsers", sb5.toString());
            } else {
                int i912 = c12197q.f40718a;
                if (i36 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb6 = new StringBuilder(str.length() + 262);
                sb6.append("Inconsistent stbl box for track ");
                sb6.append(i912);
                sb6.append(": remainingSynchronizationSamples ");
                sb6.append(i24);
                sb6.append(", remainingSamplesAtTimestampDelta ");
                sb6.append(i34);
                sb6.append(", remainingSamplesInChunk ");
                sb6.append(i35);
                sb6.append(", remainingTimestampDeltaChanges ");
                sb6.append(i29);
                sb6.append(", remainingSamplesAtTimestampOffset ");
                sb6.append(i19);
                sb6.append(str);
                Log.w("AtomParsers", sb6.toString());
            }
            jArr4 = jArr3;
            jArr5 = jArrCopyOf;
            iArr2 = iArrCopyOf;
            iMax = i17;
            j16 = j311;
        } else {
            jArr3 = new long[iMo15741c];
            iArr = new int[iMo15741c];
            jArrCopyOf = new long[iMo15741c];
            iArrCopyOf = new int[iMo15741c];
            c13117a2 = c13117a6;
            i16 = iM36680B8;
            i17 = i13;
            i18 = i17;
            i19 = i18;
            i24 = i15;
            i25 = iM36680B7;
            j14 = 0;
            j15 = 0;
            iM36680B4 = iM36680B3;
            iM36699i = i19;
            i26 = iM36680B;
            i27 = iM36680B6;
            i28 = iM36699i;
            while (true) {
                if (i28 >= iMo15741c) {
                    i29 = i27;
                    i34 = i25;
                    iArrCopyOf2 = iArr;
                    i35 = i18;
                    break;
                }
                j17 = j15;
                i37 = i18;
                zM33784a = true;
                while (i37 == 0) {
                    zM33784a = c12183c.m33784a();
                    if (!zM33784a) {
                        break;
                        break;
                    }
                    int i913 = i27;
                    long j211 = c12183c.f40615e;
                    i37 = c12183c.f40614d;
                    j17 = j211;
                    i27 = i913;
                    i25 = i25;
                    iMo15741c = iMo15741c;
                }
                i38 = iMo15741c;
                i29 = i27;
                i34 = i25;
                if (!zM33784a) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf4 = Arrays.copyOf(jArr3, i28);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i28);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                    iMo15741c = i28;
                    jArr3 = jArrCopyOf4;
                    i35 = i37;
                    break;
                }
                if (c13117a != null) {
                    iM36680B5 = i19;
                    while (iM36680B5 == 0) {
                        iM36680B5 = c13117a.m36680B();
                        iM36699i = c13117a.m36699i();
                        i26--;
                    }
                    i19 = iM36680B5 - 1;
                }
                jArr3[i28] = j17;
                iMo15739a = interfaceC12184d.mo15739a();
                iArr[i28] = iMo15739a;
                if (iMo15739a > i17) {
                    i17 = iMo15739a;
                }
                jArrCopyOf[i28] = j14 + ((long) iM36699i);
                if (c13117a2 == null) {
                    i39 = 1;
                } else {
                    i39 = i13;
                }
                iArrCopyOf[i28] = i39;
                if (i28 == iM36680B4) {
                    iArrCopyOf[i28] = 1;
                    i24--;
                    if (i24 > 0) {
                        c13117a2.getClass();
                        iM36680B4 = c13117a2.m36680B() - 1;
                    }
                }
                j14 += (long) i16;
                i25 = i34 - 1;
                if (i25 == 0) {
                    i27 = i29;
                } else {
                    i27 = i29;
                }
                long j312 = j17 + ((long) iArr[i28]);
                i18 = i37 - 1;
                i28++;
                j15 = j312;
                iMo15741c = i38;
            }
            long j313 = j14 + ((long) iM36699i);
            if (c13117a == null) {
                i36 = 1;
                break;
            }
            while (true) {
                if (i26 <= 0) {
                    i36 = 1;
                    break;
                }
                if (c13117a.m36680B() != 0) {
                    i36 = i13;
                    break;
                }
                c13117a.m36699i();
                i26--;
            }
            if (i24 == 0) {
                int i914 = c12197q.f40718a;
                if (i36 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb7 = new StringBuilder(str.length() + 262);
                sb7.append("Inconsistent stbl box for track ");
                sb7.append(i914);
                sb7.append(": remainingSynchronizationSamples ");
                sb7.append(i24);
                sb7.append(", remainingSamplesAtTimestampDelta ");
                sb7.append(i34);
                sb7.append(", remainingSamplesInChunk ");
                sb7.append(i35);
                sb7.append(", remainingTimestampDeltaChanges ");
                sb7.append(i29);
                sb7.append(", remainingSamplesAtTimestampOffset ");
                sb7.append(i19);
                sb7.append(str);
                Log.w("AtomParsers", sb7.toString());
            } else {
                int i915 = c12197q.f40718a;
                if (i36 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb8 = new StringBuilder(str.length() + 262);
                sb8.append("Inconsistent stbl box for track ");
                sb8.append(i915);
                sb8.append(": remainingSynchronizationSamples ");
                sb8.append(i24);
                sb8.append(", remainingSamplesAtTimestampDelta ");
                sb8.append(i34);
                sb8.append(", remainingSamplesInChunk ");
                sb8.append(i35);
                sb8.append(", remainingTimestampDeltaChanges ");
                sb8.append(i29);
                sb8.append(", remainingSamplesAtTimestampOffset ");
                sb8.append(i19);
                sb8.append(str);
                Log.w("AtomParsers", sb8.toString());
            }
            jArr4 = jArr3;
            jArr5 = jArrCopyOf;
            iArr2 = iArrCopyOf;
            iMax = i17;
            j16 = j313;
        }
        iArr3 = iArrCopyOf2;
        jM71666D = AbstractC24567y.m71666D(j16, 1000000L, c12197q.f40720c);
        if (jArr2 == 0) {
            AbstractC24567y.m71667E(jArr5, j7);
            return new C12200t(c12197q, jArr4, iArr3, iMax, jArr5, iArr2, jM71666D);
        }
        int i916 = iMax;
        i44 = iMo15741c;
        i45 = i916;
        j18 = j16;
        iArr4 = iArr2;
        jArr6 = jArr5;
        if (jArr7.length == 1) {
            i46 = i14;
            if (i46 == 1) {
                jArr7 = jArr2;
                jArr7 = jArr2;
            } else {
                jArr7 = jArr2;
                jArr7 = jArr2;
            }
        } else {
            jArr7 = jArr2;
            i46 = i14;
        }
        i47 = 1;
        if (jArr7.length == 1) {
            if (jArr7[0] == 0) {
                jArr.getClass();
                j26 = jArr[0];
                while (i69 < jArr6.length) {
                    jArr6[i69] = AbstractC24567y.m71666D(jArr6[i69] - j26, 1000000L, c12197q.f40720c);
                }
                return new C12200t(c12197q, jArr4, iArr3, i45, jArr6, iArr4, AbstractC24567y.m71666D(j18 - j26, 1000000L, c12197q.f40720c));
            }
            i47 = 1;
        }
        if (i46 == i47) {
            z13 = true;
        } else {
            z13 = false;
        }
        iArr5 = new int[jArr7.length];
        iArr6 = new int[jArr7.length];
        jArr.getClass();
        i48 = 0;
        z14 = false;
        i49 = 0;
        i54 = 0;
        while (i48 < jArr7.length) {
            iArr11 = iArr5;
            iArr12 = iArr6;
            j25 = jArr[i48];
            if (j25 != -1) {
                i66 = i48;
                boolean z110 = z14;
                long jM71666D7 = AbstractC24567y.m71666D(jArr7[i48], c12197q.f40720c, c12197q.f40721d);
                iArr11[i66] = AbstractC24567y.m71674e(jArr6, j25, true);
                iArr12[i66] = AbstractC24567y.m71671b(jArr6, j25 + jM71666D7, z13);
                while (true) {
                    i67 = iArr11[i66];
                    i68 = iArr12[i66];
                    if (i67 >= i68) {
                        break;
                    }
                    break;
                    break;
                    iArr11[i66] = i67 + 1;
                }
                int i917 = (i68 - i67) + i49;
                if (i54 != i67) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z14 = z110 | z17;
                i54 = i68;
                i49 = i917;
            } else {
                i66 = i48;
            }
            i48 = i66 + 1;
            iArr5 = iArr11;
            iArr6 = iArr12;
            i45 = i45;
        }
        i55 = i45;
        iArr7 = iArr5;
        iArr8 = iArr6;
        boolean z25 = z14;
        if (i49 != i44) {
            z15 = true;
        } else {
            z15 = false;
        }
        z16 = z25 | z15;
        if (z16) {
            jArr8 = new long[i49];
        } else {
            jArr8 = jArr4;
        }
        if (z16) {
            iArr9 = new int[i49];
        } else {
            iArr9 = iArr3;
        }
        if (z16) {
            i56 = 0;
        } else {
            i56 = i55;
        }
        if (z16) {
            iArr10 = new int[i49];
        } else {
            iArr10 = iArr4;
        }
        jArr9 = new long[i49];
        i57 = i56;
        i58 = 0;
        i59 = 0;
        j19 = 0;
        while (i58 < jArr7.length) {
            j24 = jArr[i58];
            i64 = iArr7[i58];
            long[] jArr19 = jArr7;
            i65 = iArr8[i58];
            int i918 = i57;
            if (z16) {
                int i101 = i65 - i64;
                System.arraycopy(jArr4, i64, jArr8, i59, i101);
                System.arraycopy(iArr3, i64, iArr9, i59, i101);
                System.arraycopy(iArr4, i64, iArr10, i59, i101);
            }
            i57 = i918;
            while (i64 < i65) {
                long[] jArr110 = jArr4;
                int[] iArr18 = iArr3;
                long jM71666D8 = AbstractC24567y.m71666D(j19, 1000000L, c12197q.f40721d);
                long j314 = jArr6[i64] - j24;
                long[] jArr111 = jArr6;
                int[] iArr19 = iArr4;
                long j315 = j13;
                jArr9[i59] = jM71666D8 + AbstractC24567y.m71666D(Math.max(j315, j314), 1000000L, c12197q.f40720c);
                if (!z16) {
                }
                i59++;
                i64++;
                j13 = j315;
                jArr4 = jArr110;
                iArr3 = iArr18;
                iArr4 = iArr19;
                jArr6 = jArr111;
            }
            j19 += jArr19[i58];
            i58++;
            jArr4 = jArr4;
            iArr3 = iArr3;
            iArr4 = iArr4;
            jArr6 = jArr6;
            jArr7 = jArr19;
        }
        return new C12200t(c12197q, jArr8, iArr9, i57, jArr9, iArr10, AbstractC24567y.m71666D(j19, 1000000L, c12197q.f40721d));
    }

    /* JADX WARN: Code duplicated, block: B:131:0x026d  */
    /* JADX WARN: Code duplicated, block: B:327:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:329:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:330:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:333:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:336:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:338:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:344:0x0618  */
    /* JADX WARN: Code duplicated, block: B:346:0x063f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0663 A[PHI: r26 r42 r43
      0x0663: PHI (r26v13 rm.c0) = (r26v9 rm.c0), (r26v14 rm.c0) binds: [B:392:0x07bb, B:348:0x065f] A[DONT_GENERATE, DONT_INLINE]
      0x0663: PHI (r42v7 java.lang.String) = (r42v6 java.lang.String), (r42v8 java.lang.String) binds: [B:392:0x07bb, B:348:0x065f] A[DONT_GENERATE, DONT_INLINE]
      0x0663: PHI (r43v9 java.lang.String) = (r43v6 java.lang.String), (r43v10 java.lang.String) binds: [B:392:0x07bb, B:348:0x065f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x0667  */
    /* JADX WARN: Code duplicated, block: B:352:0x066e  */
    /* JADX WARN: Code duplicated, block: B:354:0x0697  */
    /* JADX WARN: Code duplicated, block: B:366:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:369:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:371:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:373:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:374:0x0703  */
    /* JADX WARN: Code duplicated, block: B:376:0x071e  */
    /* JADX WARN: Code duplicated, block: B:378:0x0723 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:379:0x0725  */
    /* JADX WARN: Code duplicated, block: B:382:0x0744  */
    /* JADX WARN: Code duplicated, block: B:384:0x0749  */
    /* JADX WARN: Code duplicated, block: B:385:0x0767  */
    /* JADX WARN: Code duplicated, block: B:387:0x076c  */
    /* JADX WARN: Code duplicated, block: B:388:0x0785  */
    /* JADX WARN: Code duplicated, block: B:390:0x078a  */
    /* JADX WARN: Code duplicated, block: B:391:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:393:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:395:0x0812  */
    /* JADX WARN: Code duplicated, block: B:397:0x0821  */
    /* JADX WARN: Code duplicated, block: B:399:0x0824  */
    /* JADX WARN: Code duplicated, block: B:401:0x0828  */
    /* JADX WARN: Code duplicated, block: B:403:0x082b  */
    /* JADX WARN: Code duplicated, block: B:407:0x0834  */
    /* JADX WARN: Code duplicated, block: B:409:0x083d  */
    /* JADX WARN: Code duplicated, block: B:410:0x083f  */
    /* JADX WARN: Code duplicated, block: B:414:0x084d A[LOOP:4: B:405:0x0830->B:414:0x084d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:417:0x0856  */
    /* JADX WARN: Code duplicated, block: B:419:0x0864  */
    /* JADX WARN: Code duplicated, block: B:421:0x086c  */
    /* JADX WARN: Code duplicated, block: B:422:0x0882  */
    /* JADX WARN: Code duplicated, block: B:424:0x0888 A[PHI: r1
      0x0888: PHI (r1v22 java.lang.String) = (r1v18 java.lang.String), (r1v24 java.lang.String) binds: [B:416:0x0854, B:418:0x0862] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:433:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:435:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:437:0x0906  */
    /* JADX WARN: Code duplicated, block: B:438:0x090a  */
    /* JADX WARN: Code duplicated, block: B:440:0x091d  */
    /* JADX WARN: Code duplicated, block: B:442:0x0924  */
    /* JADX WARN: Code duplicated, block: B:445:0x0932  */
    /* JADX WARN: Code duplicated, block: B:446:0x0935  */
    /* JADX WARN: Code duplicated, block: B:448:0x093a  */
    /* JADX WARN: Code duplicated, block: B:449:0x093c  */
    /* JADX WARN: Code duplicated, block: B:453:0x095b  */
    /* JADX WARN: Code duplicated, block: B:455:0x096a  */
    /* JADX WARN: Code duplicated, block: B:459:0x0984  */
    /* JADX WARN: Code duplicated, block: B:460:0x0986  */
    /* JADX WARN: Code duplicated, block: B:463:0x0995 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:464:0x0997  */
    /* JADX WARN: Code duplicated, block: B:466:0x099a  */
    /* JADX WARN: Code duplicated, block: B:469:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:472:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:474:0x09d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:475:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:477:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:480:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:482:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:484:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:486:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:609:0x0c6f  */
    /* JADX WARN: Code duplicated, block: B:613:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:614:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:616:0x0cbc  */
    /* JADX WARN: Code duplicated, block: B:618:0x0cc2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:621:0x0cc7  */
    /* JADX WARN: Code duplicated, block: B:624:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:625:0x0cd4  */
    /* JADX WARN: Code duplicated, block: B:632:0x0d15  */
    /* JADX WARN: Code duplicated, block: B:634:0x0d20  */
    /* JADX WARN: Code duplicated, block: B:636:0x0d29  */
    /* JADX WARN: Code duplicated, block: B:637:0x0d2b  */
    /* JADX WARN: Code duplicated, block: B:639:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:641:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:642:0x0d4d  */
    /* JADX WARN: Code duplicated, block: B:645:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:646:0x0d5a  */
    /* JADX WARN: Code duplicated, block: B:649:0x0d67 A[LOOP:7: B:638:0x0d43->B:649:0x0d67, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:654:0x0d7c  */
    /* JADX WARN: Code duplicated, block: B:655:0x0d89  */
    /* JADX WARN: Code duplicated, block: B:658:0x0d91  */
    /* JADX WARN: Code duplicated, block: B:659:0x0d95  */
    /* JADX WARN: Code duplicated, block: B:669:0x072b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0d6e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0852 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0822 A[EDGE_INSN: B:686:0x0822->B:398:0x0822 BREAK  A[LOOP:4: B:405:0x0830->B:414:0x084d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0c82 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x020c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0210  */
    /* JADX INFO: renamed from: e */
    public static ArrayList m33799e(C12181a c12181a, C37371m c37371m, long j7, C36136c c36136c, boolean z4, boolean z13, InterfaceC39718e interfaceC39718e) throws ParserException {
        int i13;
        long jM36716z;
        int i14;
        int i15;
        long j13;
        C13117a c13117a;
        int i16;
        long jM36716z2;
        int iM1494n;
        int i17;
        int i18;
        Pair pairCreate;
        C13117a c13117a2;
        String str;
        int iM36699i;
        C12198r[] c12198rArr;
        long j14;
        int i19;
        C31521c0 c31521c0;
        int i24;
        int i25;
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        int i26;
        C12181a c12181a2;
        int i27;
        C12198r[] c12198rArr2;
        int i28;
        long[] jArr;
        long[] jArr2;
        C12197q c12197q;
        C12181a c12181aM33782o;
        C12182b c12182bM33783p;
        C13117a c13117a3;
        int iM1494n2;
        int iM36680B;
        long[] jArr3;
        long[] jArr4;
        int i29;
        Pair pairCreate2;
        long jM36716z3;
        long jM36699i;
        int i34;
        int iM36699i2;
        boolean z14;
        String str2;
        int iM36699i3;
        int i35;
        int i36;
        int iM36682D;
        int iM36682D2;
        int i37;
        int i38;
        int i39;
        C36136c c36136cM114963b;
        String str3;
        int i44;
        boolean z15;
        String str4;
        float fM36680B;
        int i45;
        String str5;
        byte[] bArr;
        List listM133256r;
        int i46;
        ByteBuffer byteBufferOrder;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        float f13;
        byte[] bArr2;
        int i56;
        C36136c c36136c2;
        List list;
        int i57;
        int i58;
        int i59;
        byte[] bArrArray;
        int i64;
        int iM36699i4;
        boolean z16;
        int iM36699i5;
        int i65;
        float f14;
        List list2;
        C11856j0 c11856j0M31815k;
        int i66;
        byte[] bArrCopyOfRange;
        boolean z17;
        C25726g c25726gM75847a;
        List list3;
        int i67;
        boolean z18;
        C25720a c25720aM75837a;
        Pair pairM33797c;
        int iM36682D3;
        int i68;
        int i69;
        int iRound;
        int i74;
        int i75;
        C36136c c36136c3;
        String str6;
        String str7;
        int i76;
        String str8;
        int i77;
        int i78;
        int i79;
        List listM133256r2;
        String str9;
        List list4;
        int i83;
        String str10;
        int iM36699i6;
        boolean z19;
        int iM36699i7;
        List list5;
        int i84;
        int i85;
        int i86;
        boolean z24;
        int iM36699i8;
        boolean z25;
        byte[] bArr3;
        int i87;
        C31521c0 c31521c1;
        int iM36715y;
        int i88;
        String str11;
        int iM36715y2;
        int i89;
        long j15;
        C41060w0 c41060w0M133256r;
        ArrayList arrayList3;
        C12181a c12181a3 = c12181a;
        ArrayList arrayList4 = c12181a3.f40607E;
        ArrayList arrayList5 = new ArrayList();
        int i94 = 0;
        while (i94 < arrayList4.size()) {
            C12181a c12181a4 = (C12181a) arrayList4.get(i94);
            if (c12181a4.f2052x != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i26 = i94;
            } else {
                C12182b c12182bM33783p2 = c12181a3.m33783p(1836476516);
                c12182bM33783p2.getClass();
                C12181a c12181aM33782o2 = c12181a4.m33782o(1835297121);
                c12181aM33782o2.getClass();
                C12182b c12182bM33783p3 = c12181aM33782o2.m33783p(1751411826);
                c12182bM33783p3.getClass();
                C13117a c13117a4 = c12182bM33783p3.f40610y;
                c13117a4.m36689K(16);
                int iM36699i9 = c13117a4.m36699i();
                if (iM36699i9 == 1936684398) {
                    i13 = 1;
                } else if (iM36699i9 == 1986618469) {
                    i13 = 2;
                } else if (iM36699i9 == 1952807028 || iM36699i9 == 1935832172 || iM36699i9 == 1937072756 || iM36699i9 == 1668047728) {
                    i13 = 3;
                } else {
                    i13 = iM36699i9 == 1835365473 ? 5 : -1;
                }
                if (i13 == -1) {
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i26 = i94;
                    c12197q = null;
                } else {
                    C12182b c12182bM33783p4 = c12181a4.m33783p(1953196132);
                    c12182bM33783p4.getClass();
                    C13117a c13117a5 = c12182bM33783p4.f40610y;
                    c13117a5.m36689K(8);
                    int iM1494n3 = AbstractC0576a.m1494n(c13117a5.m36699i());
                    c13117a5.m36690L(iM1494n3 == 0 ? 8 : 16);
                    int iM36699i10 = c13117a5.m36699i();
                    c13117a5.m36690L(4);
                    int i95 = c13117a5.f45382b;
                    int i96 = iM1494n3 == 0 ? 4 : 8;
                    int i97 = 0;
                    while (true) {
                        if (i97 >= i96) {
                            c13117a5.m36690L(i96);
                        } else {
                            if (c13117a5.f45381a[i95 + i97] != -1) {
                                jM36716z = iM1494n3 == 0 ? c13117a5.m36716z() : c13117a5.m36681C();
                                if (jM36716z != 0) {
                                    break;
                                }
                                break;
                            }
                            i97++;
                        }
                        jM36716z = -9223372036854775807L;
                        break;
                    }
                    c13117a5.m36690L(16);
                    int iM36699i11 = c13117a5.m36699i();
                    int iM36699i12 = c13117a5.m36699i();
                    c13117a5.m36690L(4);
                    int iM36699i13 = c13117a5.m36699i();
                    int iM36699i14 = c13117a5.m36699i();
                    if (iM36699i11 == 0 && iM36699i12 == 65536) {
                        i14 = -65536;
                        if (iM36699i13 == -65536 && iM36699i14 == 0) {
                            i15 = 90;
                        }
                        if (j7 == -9223372036854775807L) {
                            j13 = jM36716z;
                        } else {
                            j13 = j7;
                        }
                        c13117a = c12182bM33783p2.f40610y;
                        c13117a.m36689K(8);
                        if (AbstractC0576a.m1494n(c13117a.m36699i()) == 0) {
                            i16 = 8;
                        } else {
                            i16 = 16;
                        }
                        c13117a.m36690L(i16);
                        jM36716z2 = c13117a.m36716z();
                        long jM71666D = j13 != -9223372036854775807L ? AbstractC24567y.m71666D(j13, 1000000L, jM36716z2) : -9223372036854775807L;
                        C12181a c12181aM33782o3 = c12181aM33782o2.m33782o(1835626086);
                        c12181aM33782o3.getClass();
                        C12181a c12181aM33782o4 = c12181aM33782o3.m33782o(1937007212);
                        c12181aM33782o4.getClass();
                        C12182b c12182bM33783p5 = c12181aM33782o2.m33783p(1835296868);
                        c12182bM33783p5.getClass();
                        C13117a c13117a6 = c12182bM33783p5.f40610y;
                        c13117a6.m36689K(8);
                        iM1494n = AbstractC0576a.m1494n(c13117a6.m36699i());
                        if (iM1494n == 0) {
                            i17 = 8;
                        } else {
                            i17 = 16;
                        }
                        c13117a6.m36690L(i17);
                        long jM36716z4 = c13117a6.m36716z();
                        if (iM1494n == 0) {
                            i18 = 4;
                        } else {
                            i18 = 8;
                        }
                        c13117a6.m36690L(i18);
                        int iM36682D4 = c13117a6.m36682D();
                        StringBuilder sb4 = new StringBuilder(3);
                        sb4.append((char) (((iM36682D4 >> 10) & 31) + 96));
                        sb4.append((char) (((iM36682D4 >> 5) & 31) + 96));
                        sb4.append((char) ((iM36682D4 & 31) + 96));
                        pairCreate = Pair.create(Long.valueOf(jM36716z4), sb4.toString());
                        C12182b c12182bM33783p6 = c12181aM33782o4.m33783p(1937011556);
                        c12182bM33783p6.getClass();
                        c13117a2 = c12182bM33783p6.f40610y;
                        str = (String) pairCreate.second;
                        c13117a2.m36689K(12);
                        iM36699i = c13117a2.m36699i();
                        c12198rArr = new C12198r[iM36699i];
                        j14 = jM71666D;
                        i19 = 0;
                        c31521c0 = null;
                        i24 = 0;
                        i25 = 0;
                        while (i19 < iM36699i) {
                            i34 = c13117a2.f45382b;
                            iM36699i2 = c13117a2.m36699i();
                            ArrayList arrayList6 = arrayList4;
                            if (iM36699i2 > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            int i98 = i94;
                            str2 = "childAtomSize must be positive";
                            AbstractC32126g.m100039d("childAtomSize must be positive", z14);
                            iM36699i3 = c13117a2.m36699i();
                            int i99 = iM36699i;
                            if (iM36699i3 != 1635148593 || iM36699i3 == 1635148595 || iM36699i3 == 1701733238 || iM36699i3 == 1831958048 || iM36699i3 == 1836070006 || iM36699i3 == 1752589105 || iM36699i3 == 1751479857 || iM36699i3 == 1932670515 || iM36699i3 == 1211250227 || iM36699i3 == 1987063864 || iM36699i3 == 1987063865 || iM36699i3 == 1635135537 || iM36699i3 == 1685479798 || iM36699i3 == 1685479729 || iM36699i3 == 1685481573 || iM36699i3 == 1685481521) {
                                i35 = i15;
                                arrayList5 = arrayList5;
                                pairCreate = pairCreate;
                                c12181a4 = c12181a4;
                                c12198rArr = c12198rArr;
                                i19 = i19;
                                i36 = iM36699i10;
                                c13117a2.m36689K(i34 + 16);
                                c13117a2.m36690L(16);
                                iM36682D = c13117a2.m36682D();
                                iM36682D2 = c13117a2.m36682D();
                                c13117a2.m36690L(50);
                                i37 = c13117a2.f45382b;
                                if (iM36699i3 == 1701733238) {
                                    i38 = i34;
                                    i39 = iM36699i2;
                                    pairM33797c = m33797c(c13117a2, i38, i39);
                                    if (pairM33797c != null) {
                                        iM36699i3 = ((Integer) pairM33797c.first).intValue();
                                        if (c36136c == null) {
                                            c36136cM114963b = null;
                                        } else {
                                            c36136cM114963b = c36136c.m114963b(((C12198r) pairM33797c.second).f40730b);
                                        }
                                        c12198rArr[i19] = (C12198r) pairM33797c.second;
                                    } else {
                                        c36136cM114963b = c36136c;
                                    }
                                    c13117a2.m36689K(i37);
                                } else {
                                    i38 = i34;
                                    i39 = iM36699i2;
                                    c36136cM114963b = c36136c;
                                }
                                if (iM36699i3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iM36699i3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                i44 = i38;
                                str = str;
                                z15 = false;
                                str4 = str3;
                                fM36680B = 1.0f;
                                i45 = i25;
                                str5 = null;
                                bArr = null;
                                listM133256r = null;
                                i46 = -1;
                                byteBufferOrder = null;
                                i47 = -1;
                                i48 = -1;
                                i49 = i37;
                                i54 = -1;
                                while (true) {
                                    if (i49 - i44 >= i39) {
                                        i46 = i46;
                                        break;
                                    }
                                    c13117a2.m36689K(i49);
                                    i64 = c13117a2.f45382b;
                                    int i100 = i49;
                                    iM36699i4 = c13117a2.m36699i();
                                    i46 = i46;
                                    if (iM36699i4 != 0 && c13117a2.f45382b - i44 == i39) {
                                        break;
                                    }
                                    if (iM36699i4 > 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    AbstractC32126g.m100039d(str2, z16);
                                    iM36699i5 = c13117a2.m36699i();
                                    String str12 = str2;
                                    if (iM36699i5 == 1635148611) {
                                        if (str4 == null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        AbstractC32126g.m100039d(null, z18);
                                        c13117a2.m36689K(i64 + 8);
                                        c25720aM75837a = C25720a.m75837a(c13117a2);
                                        list3 = c25720aM75837a.f101319a;
                                        i67 = c25720aM75837a.f101320b;
                                        if (!z15) {
                                            fM36680B = c25720aM75837a.f101323e;
                                        }
                                        str5 = c25720aM75837a.f101324f;
                                        str4 = "video/avc";
                                    } else {
                                        if (iM36699i5 == 1752589123) {
                                            if (str4 == null) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            AbstractC32126g.m100039d(null, z17);
                                            c13117a2.m36689K(i64 + 8);
                                            c25726gM75847a = C25726g.m75847a(c13117a2);
                                            list3 = c25726gM75847a.f101355a;
                                            i67 = c25726gM75847a.f101356b;
                                            if (!z15) {
                                                fM36680B = c25726gM75847a.f101357c;
                                            }
                                            str5 = c25726gM75847a.f101358d;
                                            str4 = "video/hevc";
                                        } else {
                                            if (iM36699i5 != 1685480259 || iM36699i5 == 1685485123) {
                                                iM36699i3 = iM36699i3;
                                                i65 = i54;
                                                f14 = fM36680B;
                                                bArr = bArr;
                                                i39 = i39;
                                                c36136cM114963b = c36136cM114963b;
                                                list2 = listM133256r;
                                                c11856j0M31815k = C11856j0.m31815k(c13117a2);
                                                if (c11856j0M31815k != null) {
                                                    str5 = c11856j0M31815k.f38685x;
                                                    str4 = "video/dolby-vision";
                                                }
                                            } else if (iM36699i5 == 1987076931) {
                                                AbstractC32126g.m100039d(null, str4 == null);
                                                str4 = iM36699i3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            } else if (iM36699i5 == 1635135811) {
                                                AbstractC32126g.m100039d(null, str4 == null);
                                                str4 = "video/av01";
                                            } else if (iM36699i5 == 1668050025) {
                                                if (byteBufferOrder == null) {
                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer = byteBufferOrder;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(c13117a2.m36710t());
                                                byteBuffer.putShort(c13117a2.m36710t());
                                                byteBufferOrder = byteBuffer;
                                            } else if (iM36699i5 == 1835295606) {
                                                if (byteBufferOrder == null) {
                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer2 = byteBufferOrder;
                                                short sM36710t = c13117a2.m36710t();
                                                short sM36710t2 = c13117a2.m36710t();
                                                iM36699i3 = iM36699i3;
                                                short sM36710t3 = c13117a2.m36710t();
                                                short sM36710t4 = c13117a2.m36710t();
                                                short sM36710t5 = c13117a2.m36710t();
                                                List list6 = listM133256r;
                                                short sM36710t6 = c13117a2.m36710t();
                                                int i101 = i54;
                                                short sM36710t7 = c13117a2.m36710t();
                                                short sM36710t8 = c13117a2.m36710t();
                                                long jM36716z5 = c13117a2.m36716z();
                                                long jM36716z6 = c13117a2.m36716z();
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sM36710t5);
                                                byteBuffer2.putShort(sM36710t6);
                                                byteBuffer2.putShort(sM36710t);
                                                byteBuffer2.putShort(sM36710t2);
                                                byteBuffer2.putShort(sM36710t3);
                                                byteBuffer2.putShort(sM36710t4);
                                                byteBuffer2.putShort(sM36710t7);
                                                byteBuffer2.putShort(sM36710t8);
                                                byteBuffer2.putShort((short) (jM36716z5 / ChatClient.RESOLVE_DEPENDENCY_TIMEOUT));
                                                byteBuffer2.putShort((short) (jM36716z6 / ChatClient.RESOLVE_DEPENDENCY_TIMEOUT));
                                                byteBufferOrder = byteBuffer2;
                                                listM133256r = list6;
                                                i54 = i101;
                                                fM36680B = fM36680B;
                                            } else {
                                                iM36699i3 = iM36699i3;
                                                i65 = i54;
                                                f14 = fM36680B;
                                                bArr = bArr;
                                                i39 = i39;
                                                c36136cM114963b = c36136cM114963b;
                                                list2 = listM133256r;
                                                if (iM36699i5 == 1681012275) {
                                                    AbstractC32126g.m100039d(null, str4 == null);
                                                    str4 = "video/3gpp";
                                                    i46 = i46;
                                                    listM133256r = list2;
                                                    i54 = i65;
                                                    fM36680B = f14;
                                                } else {
                                                    if (iM36699i5 == 1702061171) {
                                                        AbstractC32126g.m100039d(null, str4 == null);
                                                        Pair pairM33795a = m33795a(i64, c13117a2);
                                                        String str13 = (String) pairM33795a.first;
                                                        byte[] bArr4 = (byte[]) pairM33795a.second;
                                                        listM133256r = bArr4 != null ? AbstractC41023g0.m133256r(bArr4) : list2;
                                                        str4 = str13;
                                                    } else if (iM36699i5 == 1885434736) {
                                                        c13117a2.m36689K(i64 + 8);
                                                        fM36680B = c13117a2.m36680B() / c13117a2.m36680B();
                                                        i46 = i46;
                                                        listM133256r = list2;
                                                        i54 = i65;
                                                        z15 = true;
                                                    } else if (iM36699i5 == 1937126244) {
                                                        int i102 = i64 + 8;
                                                        while (true) {
                                                            if (i102 - i64 >= iM36699i4) {
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            c13117a2.m36689K(i102);
                                                            int iM36699i15 = c13117a2.m36699i();
                                                            if (c13117a2.m36699i() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(c13117a2.f45381a, i102, iM36699i15 + i102);
                                                                break;
                                                            }
                                                            i102 += iM36699i15;
                                                        }
                                                        bArr = bArrCopyOfRange;
                                                        listM133256r = list2;
                                                    } else if (iM36699i5 == 1936995172) {
                                                        int iM36715y3 = c13117a2.m36715y();
                                                        c13117a2.m36690L(3);
                                                        if (iM36715y3 == 0) {
                                                            int iM36715y4 = c13117a2.m36715y();
                                                            if (iM36715y4 == 0) {
                                                                i65 = 0;
                                                            } else if (iM36715y4 == 1) {
                                                                i65 = 1;
                                                            } else if (iM36715y4 == 2) {
                                                                i65 = 2;
                                                            } else if (iM36715y4 == 3) {
                                                                i65 = 3;
                                                            }
                                                        }
                                                        i46 = i46;
                                                        listM133256r = list2;
                                                        i54 = i65;
                                                        fM36680B = f14;
                                                    } else if (iM36699i5 == 1668246642) {
                                                        int iM36699i16 = c13117a2.m36699i();
                                                        if (iM36699i16 == 1852009592 || iM36699i16 == 1852009571) {
                                                            int iM36682D5 = c13117a2.m36682D();
                                                            int iM36682D6 = c13117a2.m36682D();
                                                            c13117a2.m36690L(2);
                                                            boolean z26 = iM36699i4 == 19 && (c13117a2.m36715y() & 128) != 0;
                                                            int iM75838a = C25721b.m75838a(iM36682D5);
                                                            int i103 = z26 ? 1 : 2;
                                                            if (iM36682D6 != 1) {
                                                                if (iM36682D6 != 16) {
                                                                    i66 = 7;
                                                                    if (iM36682D6 != 18) {
                                                                        if (iM36682D6 != 6 && iM36682D6 != 7) {
                                                                            i66 = -1;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i66 = 6;
                                                                }
                                                                i46 = iM75838a;
                                                                i48 = i103;
                                                                i47 = i66;
                                                            }
                                                            i66 = 3;
                                                            i46 = iM75838a;
                                                            i48 = i103;
                                                            i47 = i66;
                                                        } else {
                                                            String strValueOf = String.valueOf(AbstractC0576a.m1492c(iM36699i16));
                                                            Log.w("AtomParsers", strValueOf.length() != 0 ? "Unsupported color type: ".concat(strValueOf) : new String("Unsupported color type: "));
                                                        }
                                                        listM133256r = list2;
                                                        i54 = i65;
                                                        fM36680B = f14;
                                                    }
                                                    i54 = i65;
                                                    fM36680B = f14;
                                                }
                                            }
                                            i46 = i46;
                                            listM133256r = list2;
                                            i54 = i65;
                                            fM36680B = f14;
                                        }
                                        i49 = i100 + iM36699i4;
                                        str2 = str12;
                                        iM36699i3 = iM36699i3;
                                        i39 = i39;
                                        c36136cM114963b = c36136cM114963b;
                                        bArr = bArr;
                                    }
                                    iM36699i3 = iM36699i3;
                                    bArr = bArr;
                                    i39 = i39;
                                    c36136cM114963b = c36136cM114963b;
                                    i45 = i67;
                                    i46 = i46;
                                    listM133256r = list3;
                                    i49 = i100 + iM36699i4;
                                    str2 = str12;
                                    iM36699i3 = iM36699i3;
                                    i39 = i39;
                                    c36136cM114963b = c36136cM114963b;
                                    bArr = bArr;
                                }
                                i55 = i54;
                                f13 = fM36680B;
                                bArr2 = bArr;
                                i56 = i39;
                                c36136c2 = c36136cM114963b;
                                list = listM133256r;
                                if (str4 == null) {
                                    i15 = i35;
                                } else {
                                    C31518b0 c31518b0 = new C31518b0();
                                    c31518b0.f130037a = Integer.toString(i36);
                                    c31518b0.f130047k = str4;
                                    c31518b0.f130044h = str5;
                                    c31518b0.f130052p = iM36682D;
                                    c31518b0.f130053q = iM36682D2;
                                    c31518b0.f130056t = f13;
                                    i15 = i35;
                                    c31518b0.f130055s = i15;
                                    c31518b0.f130057u = bArr2;
                                    c31518b0.f130058v = i55;
                                    c31518b0.f130049m = list;
                                    c31518b0.f130050n = c36136c2;
                                    i57 = i46;
                                    if (i57 == -1) {
                                        i59 = i48;
                                        i58 = i47;
                                        if (i59 == -1 || i58 != -1 || byteBufferOrder != null) {
                                        }
                                        c31521c0 = new C31521c0(c31518b0);
                                    } else {
                                        i58 = i47;
                                        i59 = i48;
                                    }
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    c31518b0.f130059w = new C25721b(i57, i59, i58, bArrArray);
                                    c31521c0 = new C31521c0(c31518b0);
                                }
                                i25 = i45;
                            } else if (iM36699i3 == 1836069985 || iM36699i3 == 1701733217 || iM36699i3 == 1633889587 || iM36699i3 == 1700998451 || iM36699i3 == 1633889588 || iM36699i3 == 1835823201 || iM36699i3 == 1685353315 || iM36699i3 == 1685353317 || iM36699i3 == 1685353320 || iM36699i3 == 1685353324 || iM36699i3 == 1685353336 || iM36699i3 == 1935764850 || iM36699i3 == 1935767394 || iM36699i3 == 1819304813 || iM36699i3 == 1936684916 || iM36699i3 == 1953984371 || iM36699i3 == 778924082 || iM36699i3 == 778924083 || iM36699i3 == 1835557169 || iM36699i3 == 1835560241 || iM36699i3 == 1634492771 || iM36699i3 == 1634492791 || iM36699i3 == 1970037111 || iM36699i3 == 1332770163 || iM36699i3 == 1716281667) {
                                c12198rArr = c12198rArr;
                                i19 = i19;
                                int[] iArr = AbstractC33922a.f142141f;
                                int[] iArr2 = AbstractC33922a.f142139d;
                                c13117a2.m36689K(i34 + 16);
                                if (z13) {
                                    iM36682D3 = c13117a2.m36682D();
                                    c13117a2.m36690L(6);
                                } else {
                                    c13117a2.m36690L(8);
                                    iM36682D3 = 0;
                                }
                                if (iM36682D3 == 0 || iM36682D3 == 1) {
                                    int iM36682D7 = c13117a2.m36682D();
                                    c13117a2.m36690L(6);
                                    byte[] bArr5 = c13117a2.f45381a;
                                    int i104 = c13117a2.f45382b;
                                    i68 = iM36682D7;
                                    int i105 = i104 + 1;
                                    c13117a2.f45382b = i105;
                                    int i106 = (bArr5[i104] & 255) << 8;
                                    c13117a2.f45382b = i104 + 2;
                                    int i107 = i106 | (bArr5[i105] & 255);
                                    c13117a2.f45382b = i104 + 4;
                                    c13117a2.m36689K(i104);
                                    int iM36699i17 = c13117a2.m36699i();
                                    if (iM36682D3 == 1) {
                                        c13117a2.m36690L(16);
                                    }
                                    i69 = iM36699i17;
                                    iRound = i107;
                                } else {
                                    if (iM36682D3 == 2) {
                                        c13117a2.m36690L(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c13117a2.m36706p()));
                                        int iM36680B2 = c13117a2.m36680B();
                                        c13117a2.m36690L(20);
                                        i68 = iM36680B2;
                                        i69 = 0;
                                    } else {
                                        i75 = i15;
                                        arrayList5 = arrayList5;
                                        pairCreate = pairCreate;
                                        c12181a4 = c12181a4;
                                        i44 = i34;
                                        i36 = iM36699i10;
                                        i74 = iM36699i2;
                                    }
                                    str = str;
                                    i15 = i75;
                                    i56 = i74;
                                }
                                int i108 = c13117a2.f45382b;
                                int i109 = iRound;
                                if (iM36699i3 == 1701733217) {
                                    Pair pairM33797c2 = m33797c(c13117a2, i34, iM36699i2);
                                    if (pairM33797c2 != null) {
                                        int iIntValue = ((Integer) pairM33797c2.first).intValue();
                                        C36136c c36136cM114963b2 = c36136c == null ? null : c36136c.m114963b(((C12198r) pairM33797c2.second).f40730b);
                                        c12198rArr[i19] = (C12198r) pairM33797c2.second;
                                        c36136c3 = c36136cM114963b2;
                                        iM36699i3 = iIntValue;
                                    } else {
                                        c36136c3 = c36136c;
                                    }
                                    c13117a2.m36689K(i108);
                                } else {
                                    c36136c3 = c36136c;
                                }
                                String str14 = "audio/ac3";
                                i36 = iM36699i10;
                                if (iM36699i3 == 1633889587) {
                                    str7 = "audio/ac3";
                                } else if (iM36699i3 == 1700998451) {
                                    str7 = "audio/eac3";
                                } else if (iM36699i3 == 1633889588) {
                                    str7 = "audio/ac4";
                                } else {
                                    if (iM36699i3 == 1685353315) {
                                        str6 = "audio/vnd.dts";
                                    } else if (iM36699i3 == 1685353320 || iM36699i3 == 1685353324) {
                                        str6 = "audio/vnd.dts.hd";
                                    } else if (iM36699i3 == 1685353317) {
                                        str6 = "audio/vnd.dts.hd;profile=lbr";
                                    } else if (iM36699i3 == 1685353336) {
                                        str6 = "audio/vnd.dts.uhd;profile=p2";
                                    } else if (iM36699i3 == 1935764850) {
                                        str6 = "audio/3gpp";
                                    } else if (iM36699i3 == 1935767394) {
                                        str6 = "audio/amr-wb";
                                    } else {
                                        str7 = "audio/raw";
                                        if (iM36699i3 == 1819304813 || iM36699i3 == 1936684916) {
                                            i76 = 2;
                                        } else if (iM36699i3 == 1953984371) {
                                            i76 = 268435456;
                                        } else if (iM36699i3 == 778924082 || iM36699i3 == 778924083) {
                                            str6 = "audio/mpeg";
                                        } else if (iM36699i3 == 1835557169) {
                                            str6 = "audio/mha1";
                                        } else if (iM36699i3 == 1835560241) {
                                            str6 = "audio/mhm1";
                                        } else if (iM36699i3 == 1634492771) {
                                            str6 = "audio/alac";
                                        } else if (iM36699i3 == 1634492791) {
                                            str6 = "audio/g711-alaw";
                                        } else if (iM36699i3 == 1970037111) {
                                            str6 = "audio/g711-mlaw";
                                        } else if (iM36699i3 == 1332770163) {
                                            str6 = "audio/opus";
                                        } else if (iM36699i3 == 1716281667) {
                                            str6 = "audio/flac";
                                        } else if (iM36699i3 == 1835823201) {
                                            str6 = "audio/true-hd";
                                        } else {
                                            i76 = -1;
                                            str7 = null;
                                        }
                                        i75 = i15;
                                        arrayList5 = arrayList5;
                                        pairCreate = pairCreate;
                                        c12181a4 = c12181a4;
                                        i44 = i34;
                                        str8 = str7;
                                        i77 = i109;
                                        i78 = i68;
                                        i79 = i108;
                                        listM133256r2 = null;
                                        str9 = null;
                                        while (i79 - i44 < iM36699i2) {
                                            c13117a2.m36689K(i79);
                                            iM36699i6 = c13117a2.m36699i();
                                            int i110 = iM36699i2;
                                            if (iM36699i6 > 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            AbstractC32126g.m100039d("childAtomSize must be positive", z19);
                                            iM36699i7 = c13117a2.m36699i();
                                            list5 = listM133256r2;
                                            if (iM36699i7 == 1835557187) {
                                                int i111 = iM36699i6 - 13;
                                                byte[] bArr6 = new byte[i111];
                                                i84 = i76;
                                                c13117a2.m36689K(i79 + 13);
                                                c13117a2.m36697g(bArr6, 0, i111);
                                                listM133256r2 = AbstractC41023g0.m133256r(bArr6);
                                                str9 = str9;
                                                str14 = str14;
                                            } else {
                                                i84 = i76;
                                                if (iM36699i7 != 1702061171) {
                                                    if (z13 || iM36699i7 != 2002876005) {
                                                        if (iM36699i7 == 1684103987) {
                                                            c13117a2.m36689K(i79 + 8);
                                                            String string = Integer.toString(i36);
                                                            int i112 = iArr2[(c13117a2.m36715y() & 192) >> 6];
                                                            iM36715y2 = c13117a2.m36715y();
                                                            i89 = iArr[(iM36715y2 & 56) >> 3];
                                                            if ((iM36715y2 & 4) != 0) {
                                                                i89++;
                                                            }
                                                            str9 = str9;
                                                            C31518b0 c31518b1 = new C31518b0();
                                                            c31518b1.f130037a = string;
                                                            c31518b1.f130047k = str14;
                                                            c31518b1.f130060x = i89;
                                                            c31518b1.f130061y = i112;
                                                            c31518b1.f130050n = c36136c3;
                                                            c31518b1.f130039c = str;
                                                            c31521c0 = new C31521c0(c31518b1);
                                                            str14 = str14;
                                                        } else {
                                                            str9 = str9;
                                                            if (iM36699i7 == 1684366131) {
                                                                c13117a2.m36689K(i79 + 8);
                                                                String string2 = Integer.toString(i36);
                                                                c13117a2.m36690L(2);
                                                                int i113 = iArr2[(c13117a2.m36715y() & 192) >> 6];
                                                                iM36715y = c13117a2.m36715y();
                                                                i88 = iArr[(iM36715y & 14) >> 1];
                                                                if ((iM36715y & 1) != 0) {
                                                                    i88++;
                                                                }
                                                                if (((c13117a2.m36715y() & 30) >> 1) > 0 && (c13117a2.m36715y() & 2) != 0) {
                                                                    i88 += 2;
                                                                }
                                                                if (c13117a2.m36692a() > 0 || (c13117a2.m36715y() & 1) == 0) {
                                                                    str11 = "audio/eac3";
                                                                } else {
                                                                    str11 = "audio/eac3-joc";
                                                                }
                                                                str14 = str14;
                                                                C31518b0 c31518b2 = new C31518b0();
                                                                c31518b2.f130037a = string2;
                                                                c31518b2.f130047k = str11;
                                                                c31518b2.f130060x = i88;
                                                                c31518b2.f130061y = i113;
                                                                c31518b2.f130050n = c36136c3;
                                                                c31518b2.f130039c = str;
                                                                c31521c1 = new C31521c0(c31518b2);
                                                            } else {
                                                                str14 = str14;
                                                                if (iM36699i7 == 1684103988) {
                                                                    c13117a2.m36689K(i79 + 8);
                                                                    String string3 = Integer.toString(i36);
                                                                    c13117a2.m36690L(1);
                                                                    if (((c13117a2.m36715y() & 32) >> 5) == 1) {
                                                                        i87 = 48000;
                                                                    } else {
                                                                        i87 = 44100;
                                                                    }
                                                                    C31518b0 c31518b3 = new C31518b0();
                                                                    c31518b3.f130037a = string3;
                                                                    c31518b3.f130047k = "audio/ac4";
                                                                    c31518b3.f130060x = 2;
                                                                    c31518b3.f130061y = i87;
                                                                    c31518b3.f130050n = c36136c3;
                                                                    c31518b3.f130039c = str;
                                                                    c31521c1 = new C31521c0(c31518b3);
                                                                } else if (iM36699i7 == 1684892784) {
                                                                    if (i69 > 0) {
                                                                        StringBuilder sb5 = new StringBuilder(60);
                                                                        sb5.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                                        sb5.append(i69);
                                                                        throw ParserException.m15562a(null, sb5.toString());
                                                                    }
                                                                    i77 = i69;
                                                                    listM133256r2 = list5;
                                                                    i78 = 2;
                                                                } else if (iM36699i7 == 1684305011) {
                                                                    C31518b0 c31518b4 = new C31518b0();
                                                                    c31518b4.f130037a = Integer.toString(i36);
                                                                    c31518b4.f130047k = str8;
                                                                    c31518b4.f130060x = i78;
                                                                    c31518b4.f130061y = i77;
                                                                    c31518b4.f130050n = c36136c3;
                                                                    c31518b4.f130039c = str;
                                                                    c31521c0 = new C31521c0(c31518b4);
                                                                } else if (iM36699i7 == 1682927731) {
                                                                    int i114 = iM36699i6 - 8;
                                                                    byte[] bArr7 = f40627a;
                                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr7, bArr7.length + i114);
                                                                    c13117a2.m36689K(i79 + 8);
                                                                    c13117a2.m36697g(bArrCopyOf, bArr7.length, i114);
                                                                    listM133256r2 = AbstractC33922a.m107327a(bArrCopyOf);
                                                                } else if (iM36699i7 == 1684425825) {
                                                                    byte[] bArr8 = new byte[iM36699i6 - 8];
                                                                    bArr8[0] = 102;
                                                                    bArr8[1] = 76;
                                                                    bArr8[2] = 97;
                                                                    bArr8[3] = 67;
                                                                    c13117a2.m36689K(i79 + 12);
                                                                    c13117a2.m36697g(bArr8, 4, iM36699i6 - 12);
                                                                    listM133256r2 = AbstractC41023g0.m133256r(bArr8);
                                                                } else if (iM36699i7 == 1634492771) {
                                                                    int i115 = iM36699i6 - 12;
                                                                    byte[] bArr9 = new byte[i115];
                                                                    c13117a2.m36689K(i79 + 12);
                                                                    c13117a2.m36697g(bArr9, 0, i115);
                                                                    C13117a c13117a7 = new C13117a(bArr9, 1, (byte) 0);
                                                                    c13117a7.m36689K(9);
                                                                    int iM36715y5 = c13117a7.m36715y();
                                                                    c13117a7.m36689K(20);
                                                                    Pair pairCreate3 = Pair.create(Integer.valueOf(c13117a7.m36680B()), Integer.valueOf(iM36715y5));
                                                                    int iIntValue2 = ((Integer) pairCreate3.first).intValue();
                                                                    int iIntValue3 = ((Integer) pairCreate3.second).intValue();
                                                                    listM133256r2 = AbstractC41023g0.m133256r(bArr9);
                                                                    i77 = iIntValue2;
                                                                    i78 = iIntValue3;
                                                                } else {
                                                                    listM133256r2 = list5;
                                                                }
                                                            }
                                                            c31521c0 = c31521c1;
                                                        }
                                                        listM133256r2 = list5;
                                                    } else {
                                                        i85 = 1702061171;
                                                    }
                                                    i79 += iM36699i6;
                                                    i76 = i84;
                                                    str9 = str9;
                                                    str14 = str14;
                                                    iM36699i2 = i110;
                                                } else {
                                                    i85 = 1702061171;
                                                }
                                                if (iM36699i7 == i85) {
                                                    i86 = c13117a2.f45382b;
                                                    if (i86 >= i79) {
                                                        z24 = true;
                                                    } else {
                                                        z24 = false;
                                                    }
                                                    AbstractC32126g.m100039d(null, z24);
                                                    while (true) {
                                                        if (i86 - i79 < iM36699i6) {
                                                            i86 = -1;
                                                            break;
                                                        }
                                                        c13117a2.m36689K(i86);
                                                        iM36699i8 = c13117a2.m36699i();
                                                        if (iM36699i8 > 0) {
                                                            z25 = true;
                                                        } else {
                                                            z25 = false;
                                                        }
                                                        AbstractC32126g.m100039d("childAtomSize must be positive", z25);
                                                        if (c13117a2.m36699i() == 1702061171) {
                                                            break;
                                                        }
                                                        i86 += iM36699i8;
                                                    }
                                                } else {
                                                    i86 = i79;
                                                }
                                                if (i86 != -1) {
                                                    Pair pairM33795a2 = m33795a(i86, c13117a2);
                                                    str8 = (String) pairM33795a2.first;
                                                    bArr3 = (byte[]) pairM33795a2.second;
                                                    if (bArr3 != null) {
                                                        if ("audio/mp4a-latm".equals(str8)) {
                                                            C5363q c5363qM107332f = AbstractC33922a.m107332f(new C24561s(bArr3, bArr3.length, 0, (byte) 0), false);
                                                            i77 = c5363qM107332f.f21806b;
                                                            i78 = c5363qM107332f.f21807c;
                                                            str9 = c5363qM107332f.f21805a;
                                                        }
                                                        listM133256r2 = AbstractC41023g0.m133256r(bArr3);
                                                    } else {
                                                        listM133256r2 = list5;
                                                    }
                                                } else {
                                                    listM133256r2 = list5;
                                                }
                                                i79 += iM36699i6;
                                                i76 = i84;
                                                str9 = str9;
                                                str14 = str14;
                                                iM36699i2 = i110;
                                            }
                                            i79 += iM36699i6;
                                            i76 = i84;
                                            str9 = str9;
                                            str14 = str14;
                                            iM36699i2 = i110;
                                        }
                                        list4 = listM133256r2;
                                        i83 = i76;
                                        str10 = str9;
                                        i74 = iM36699i2;
                                        if (c31521c0 == null && str8 != null) {
                                            C31518b0 c31518b5 = new C31518b0();
                                            c31518b5.f130037a = Integer.toString(i36);
                                            c31518b5.f130047k = str8;
                                            c31518b5.f130044h = str10;
                                            c31518b5.f130060x = i78;
                                            c31518b5.f130061y = i77;
                                            c31518b5.f130062z = i83;
                                            c31518b5.f130049m = list4;
                                            c31518b5.f130050n = c36136c3;
                                            c31518b5.f130039c = str;
                                            c31521c0 = new C31521c0(c31518b5);
                                        }
                                        str = str;
                                        i15 = i75;
                                        i56 = i74;
                                    }
                                    str7 = str6;
                                }
                                i76 = -1;
                                i75 = i15;
                                arrayList5 = arrayList5;
                                pairCreate = pairCreate;
                                c12181a4 = c12181a4;
                                i44 = i34;
                                str8 = str7;
                                i77 = i109;
                                i78 = i68;
                                i79 = i108;
                                listM133256r2 = null;
                                str9 = null;
                                while (i79 - i44 < iM36699i2) {
                                    c13117a2.m36689K(i79);
                                    iM36699i6 = c13117a2.m36699i();
                                    int i116 = iM36699i2;
                                    if (iM36699i6 > 0) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    AbstractC32126g.m100039d("childAtomSize must be positive", z19);
                                    iM36699i7 = c13117a2.m36699i();
                                    list5 = listM133256r2;
                                    if (iM36699i7 == 1835557187) {
                                        int i117 = iM36699i6 - 13;
                                        byte[] bArr10 = new byte[i117];
                                        i84 = i76;
                                        c13117a2.m36689K(i79 + 13);
                                        c13117a2.m36697g(bArr10, 0, i117);
                                        listM133256r2 = AbstractC41023g0.m133256r(bArr10);
                                        str9 = str9;
                                        str14 = str14;
                                    } else {
                                        i84 = i76;
                                        if (iM36699i7 != 1702061171) {
                                            if (z13) {
                                            }
                                            if (iM36699i7 == 1684103987) {
                                                c13117a2.m36689K(i79 + 8);
                                                String string4 = Integer.toString(i36);
                                                int i118 = iArr2[(c13117a2.m36715y() & 192) >> 6];
                                                iM36715y2 = c13117a2.m36715y();
                                                i89 = iArr[(iM36715y2 & 56) >> 3];
                                                if ((iM36715y2 & 4) != 0) {
                                                    i89++;
                                                }
                                                str9 = str9;
                                                C31518b0 c31518b6 = new C31518b0();
                                                c31518b6.f130037a = string4;
                                                c31518b6.f130047k = str14;
                                                c31518b6.f130060x = i89;
                                                c31518b6.f130061y = i118;
                                                c31518b6.f130050n = c36136c3;
                                                c31518b6.f130039c = str;
                                                c31521c0 = new C31521c0(c31518b6);
                                                str14 = str14;
                                            } else {
                                                str9 = str9;
                                                if (iM36699i7 == 1684366131) {
                                                    c13117a2.m36689K(i79 + 8);
                                                    String string5 = Integer.toString(i36);
                                                    c13117a2.m36690L(2);
                                                    int i119 = iArr2[(c13117a2.m36715y() & 192) >> 6];
                                                    iM36715y = c13117a2.m36715y();
                                                    i88 = iArr[(iM36715y & 14) >> 1];
                                                    if ((iM36715y & 1) != 0) {
                                                        i88++;
                                                    }
                                                    if (((c13117a2.m36715y() & 30) >> 1) > 0) {
                                                        i88 += 2;
                                                    }
                                                    if (c13117a2.m36692a() > 0) {
                                                        str11 = "audio/eac3";
                                                    } else {
                                                        str11 = "audio/eac3";
                                                    }
                                                    str14 = str14;
                                                    C31518b0 c31518b7 = new C31518b0();
                                                    c31518b7.f130037a = string5;
                                                    c31518b7.f130047k = str11;
                                                    c31518b7.f130060x = i88;
                                                    c31518b7.f130061y = i119;
                                                    c31518b7.f130050n = c36136c3;
                                                    c31518b7.f130039c = str;
                                                    c31521c1 = new C31521c0(c31518b7);
                                                } else {
                                                    str14 = str14;
                                                    if (iM36699i7 == 1684103988) {
                                                        c13117a2.m36689K(i79 + 8);
                                                        String string6 = Integer.toString(i36);
                                                        c13117a2.m36690L(1);
                                                        if (((c13117a2.m36715y() & 32) >> 5) == 1) {
                                                            i87 = 48000;
                                                        } else {
                                                            i87 = 44100;
                                                        }
                                                        C31518b0 c31518b8 = new C31518b0();
                                                        c31518b8.f130037a = string6;
                                                        c31518b8.f130047k = "audio/ac4";
                                                        c31518b8.f130060x = 2;
                                                        c31518b8.f130061y = i87;
                                                        c31518b8.f130050n = c36136c3;
                                                        c31518b8.f130039c = str;
                                                        c31521c1 = new C31521c0(c31518b8);
                                                    } else if (iM36699i7 == 1684892784) {
                                                        if (i69 > 0) {
                                                            StringBuilder sb6 = new StringBuilder(60);
                                                            sb6.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                            sb6.append(i69);
                                                            throw ParserException.m15562a(null, sb6.toString());
                                                        }
                                                        i77 = i69;
                                                        listM133256r2 = list5;
                                                        i78 = 2;
                                                    } else if (iM36699i7 == 1684305011) {
                                                        C31518b0 c31518b9 = new C31518b0();
                                                        c31518b9.f130037a = Integer.toString(i36);
                                                        c31518b9.f130047k = str8;
                                                        c31518b9.f130060x = i78;
                                                        c31518b9.f130061y = i77;
                                                        c31518b9.f130050n = c36136c3;
                                                        c31518b9.f130039c = str;
                                                        c31521c0 = new C31521c0(c31518b9);
                                                    } else if (iM36699i7 == 1682927731) {
                                                        int i1110 = iM36699i6 - 8;
                                                        byte[] bArr11 = f40627a;
                                                        byte[] bArrCopyOf2 = Arrays.copyOf(bArr11, bArr11.length + i1110);
                                                        c13117a2.m36689K(i79 + 8);
                                                        c13117a2.m36697g(bArrCopyOf2, bArr11.length, i1110);
                                                        listM133256r2 = AbstractC33922a.m107327a(bArrCopyOf2);
                                                    } else if (iM36699i7 == 1684425825) {
                                                        byte[] bArr12 = new byte[iM36699i6 - 8];
                                                        bArr12[0] = 102;
                                                        bArr12[1] = 76;
                                                        bArr12[2] = 97;
                                                        bArr12[3] = 67;
                                                        c13117a2.m36689K(i79 + 12);
                                                        c13117a2.m36697g(bArr12, 4, iM36699i6 - 12);
                                                        listM133256r2 = AbstractC41023g0.m133256r(bArr12);
                                                    } else if (iM36699i7 == 1634492771) {
                                                        int i1111 = iM36699i6 - 12;
                                                        byte[] bArr13 = new byte[i1111];
                                                        c13117a2.m36689K(i79 + 12);
                                                        c13117a2.m36697g(bArr13, 0, i1111);
                                                        C13117a c13117a8 = new C13117a(bArr13, 1, (byte) 0);
                                                        c13117a8.m36689K(9);
                                                        int iM36715y6 = c13117a8.m36715y();
                                                        c13117a8.m36689K(20);
                                                        Pair pairCreate4 = Pair.create(Integer.valueOf(c13117a8.m36680B()), Integer.valueOf(iM36715y6));
                                                        int iIntValue4 = ((Integer) pairCreate4.first).intValue();
                                                        int iIntValue5 = ((Integer) pairCreate4.second).intValue();
                                                        listM133256r2 = AbstractC41023g0.m133256r(bArr13);
                                                        i77 = iIntValue4;
                                                        i78 = iIntValue5;
                                                    } else {
                                                        listM133256r2 = list5;
                                                    }
                                                    i79 += iM36699i6;
                                                    i76 = i84;
                                                    str9 = str9;
                                                    str14 = str14;
                                                    iM36699i2 = i116;
                                                }
                                                c31521c0 = c31521c1;
                                            }
                                            listM133256r2 = list5;
                                            i79 += iM36699i6;
                                            i76 = i84;
                                            str9 = str9;
                                            str14 = str14;
                                            iM36699i2 = i116;
                                        } else {
                                            i85 = 1702061171;
                                        }
                                        if (iM36699i7 == i85) {
                                            i86 = c13117a2.f45382b;
                                            if (i86 >= i79) {
                                                z24 = true;
                                            } else {
                                                z24 = false;
                                            }
                                            AbstractC32126g.m100039d(null, z24);
                                            while (true) {
                                                if (i86 - i79 < iM36699i6) {
                                                    i86 = -1;
                                                    break;
                                                }
                                                c13117a2.m36689K(i86);
                                                iM36699i8 = c13117a2.m36699i();
                                                if (iM36699i8 > 0) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                AbstractC32126g.m100039d("childAtomSize must be positive", z25);
                                                if (c13117a2.m36699i() == 1702061171) {
                                                    break;
                                                    break;
                                                }
                                                i86 += iM36699i8;
                                            }
                                        } else {
                                            i86 = i79;
                                        }
                                        if (i86 != -1) {
                                            Pair pairM33795a3 = m33795a(i86, c13117a2);
                                            str8 = (String) pairM33795a3.first;
                                            bArr3 = (byte[]) pairM33795a3.second;
                                            if (bArr3 != null) {
                                                if ("audio/mp4a-latm".equals(str8)) {
                                                    C5363q c5363qM107332f2 = AbstractC33922a.m107332f(new C24561s(bArr3, bArr3.length, 0, (byte) 0), false);
                                                    i77 = c5363qM107332f2.f21806b;
                                                    i78 = c5363qM107332f2.f21807c;
                                                    str9 = c5363qM107332f2.f21805a;
                                                }
                                                listM133256r2 = AbstractC41023g0.m133256r(bArr3);
                                            } else {
                                                listM133256r2 = list5;
                                            }
                                        } else {
                                            listM133256r2 = list5;
                                        }
                                        i79 += iM36699i6;
                                        i76 = i84;
                                        str9 = str9;
                                        str14 = str14;
                                        iM36699i2 = i116;
                                    }
                                    i79 += iM36699i6;
                                    i76 = i84;
                                    str9 = str9;
                                    str14 = str14;
                                    iM36699i2 = i116;
                                }
                                list4 = listM133256r2;
                                i83 = i76;
                                str10 = str9;
                                i74 = iM36699i2;
                                if (c31521c0 == null) {
                                    C31518b0 c31518b10 = new C31518b0();
                                    c31518b10.f130037a = Integer.toString(i36);
                                    c31518b10.f130047k = str8;
                                    c31518b10.f130044h = str10;
                                    c31518b10.f130060x = i78;
                                    c31518b10.f130061y = i77;
                                    c31518b10.f130062z = i83;
                                    c31518b10.f130049m = list4;
                                    c31518b10.f130050n = c36136c3;
                                    c31518b10.f130039c = str;
                                    c31521c0 = new C31521c0(c31518b10);
                                }
                                str = str;
                                i15 = i75;
                                i56 = i74;
                            } else {
                                if (iM36699i3 == 1414810956 || iM36699i3 == 1954034535 || iM36699i3 == 2004251764 || iM36699i3 == 1937010800 || iM36699i3 == 1664495672) {
                                    c13117a2.m36689K(i34 + 16);
                                    String str15 = "application/ttml+xml";
                                    if (iM36699i3 == 1414810956) {
                                        j15 = Long.MAX_VALUE;
                                        c41060w0M133256r = null;
                                    } else if (iM36699i3 == 1954034535) {
                                        int i120 = iM36699i2 - 16;
                                        byte[] bArr14 = new byte[i120];
                                        c13117a2.m36697g(bArr14, 0, i120);
                                        c41060w0M133256r = AbstractC41023g0.m133256r(bArr14);
                                        str15 = "application/x-quicktime-tx3g";
                                        c12198rArr = c12198rArr;
                                        i19 = i19;
                                        j15 = Long.MAX_VALUE;
                                    } else if (iM36699i3 == 2004251764) {
                                        str15 = "application/x-mp4-vtt";
                                        j15 = Long.MAX_VALUE;
                                        c41060w0M133256r = null;
                                    } else if (iM36699i3 == 1937010800) {
                                        j15 = 0;
                                        c41060w0M133256r = null;
                                    } else {
                                        if (iM36699i3 != 1664495672) {
                                            throw new IllegalStateException();
                                        }
                                        str15 = "application/x-mp4-cea-608";
                                        c12198rArr = c12198rArr;
                                        i19 = i19;
                                        j15 = Long.MAX_VALUE;
                                        c41060w0M133256r = null;
                                        i24 = 1;
                                    }
                                    C31518b0 c31518b11 = new C31518b0();
                                    c31518b11.f130037a = Integer.toString(iM36699i10);
                                    c31518b11.f130047k = str15;
                                    c31518b11.f130039c = str;
                                    c31518b11.f130051o = j15;
                                    c31518b11.f130049m = c41060w0M133256r;
                                    c31521c0 = new C31521c0(c31518b11);
                                    arrayList5 = arrayList5;
                                    pairCreate = pairCreate;
                                } else {
                                    if (iM36699i3 == 1835365492) {
                                        c13117a2.m36689K(i34 + 16);
                                        if (iM36699i3 == 1835365492) {
                                            c13117a2.m36708r();
                                            String strM36708r = c13117a2.m36708r();
                                            if (strM36708r != null) {
                                                C31518b0 c31518b12 = new C31518b0();
                                                c31518b12.f130037a = Integer.toString(iM36699i10);
                                                c31518b12.f130047k = strM36708r;
                                                c31521c0 = new C31521c0(c31518b12);
                                            }
                                        }
                                    } else {
                                        if (iM36699i3 == 1667329389) {
                                            C31518b0 c31518b13 = new C31518b0();
                                            c31518b13.f130037a = Integer.toString(iM36699i10);
                                            c31518b13.f130047k = "application/x-camera-motion";
                                            c31521c0 = new C31521c0(c31518b13);
                                        }
                                        c12198rArr = c12198rArr;
                                        i19 = i19;
                                    }
                                    c12198rArr = c12198rArr;
                                    i19 = i19;
                                }
                                i44 = i34;
                                i36 = iM36699i10;
                                i56 = iM36699i2;
                            }
                            c13117a2.m36689K(i44 + i56);
                            i19++;
                            c36136c = c36136c;
                            arrayList4 = arrayList6;
                            i94 = i98;
                            iM36699i = i99;
                            c12198rArr = c12198rArr;
                            str = str;
                            arrayList5 = arrayList5;
                            pairCreate = pairCreate;
                            c12181a4 = c12181a4;
                            i13 = i13;
                            iM36699i10 = i36;
                        }
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        pair = pairCreate;
                        i26 = i94;
                        c12181a2 = c12181a4;
                        i27 = i13;
                        c12198rArr2 = c12198rArr;
                        i28 = iM36699i10;
                        if (z4) {
                            c12181a4 = c12181a2;
                        } else {
                            c12181a4 = c12181a2;
                            c12181aM33782o = c12181a4.m33782o(1701082227);
                            if (c12181aM33782o == null) {
                                c12182bM33783p = c12181aM33782o.m33783p(1701606260);
                                if (c12182bM33783p == null) {
                                    pairCreate2 = null;
                                } else {
                                    c13117a3 = c12182bM33783p.f40610y;
                                    c13117a3.m36689K(8);
                                    iM1494n2 = AbstractC0576a.m1494n(c13117a3.m36699i());
                                    iM36680B = c13117a3.m36680B();
                                    jArr3 = new long[iM36680B];
                                    jArr4 = new long[iM36680B];
                                    for (i29 = 0; i29 < iM36680B; i29++) {
                                        if (iM1494n2 == 1) {
                                            jM36716z3 = c13117a3.m36681C();
                                        } else {
                                            jM36716z3 = c13117a3.m36716z();
                                        }
                                        jArr3[i29] = jM36716z3;
                                        if (iM1494n2 == 1) {
                                            jM36699i = c13117a3.m36706p();
                                        } else {
                                            jM36699i = c13117a3.m36699i();
                                        }
                                        jArr4[i29] = jM36699i;
                                        if (c13117a3.m36710t() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        c13117a3.m36690L(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                }
                            }
                            if (c31521c0 == null) {
                                c12197q = null;
                            } else {
                                c12197q = new C12197q(i28, i27, ((Long) pair.first).longValue(), jM36716z2, j14, c31521c0, i24, c12198rArr2, i25, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (c31521c0 == null) {
                            c12197q = null;
                        } else {
                            c12197q = new C12197q(i28, i27, ((Long) pair.first).longValue(), jM36716z2, j14, c31521c0, i24, c12198rArr2, i25, jArr, jArr2);
                        }
                    } else {
                        i14 = -65536;
                    }
                    if (iM36699i11 == 0 && iM36699i12 == i14) {
                        if (iM36699i13 == 65536 && iM36699i14 == 0) {
                            i15 = 270;
                        } else {
                            i14 = -65536;
                            if (iM36699i11 != i14) {
                                i15 = 0;
                            } else {
                                i15 = 0;
                            }
                        }
                    } else if (iM36699i11 != i14 && iM36699i12 == 0 && iM36699i13 == 0 && iM36699i14 == i14) {
                        i15 = 180;
                    } else {
                        i15 = 0;
                    }
                    if (j7 == -9223372036854775807L) {
                        j13 = jM36716z;
                    } else {
                        j13 = j7;
                    }
                    c13117a = c12182bM33783p2.f40610y;
                    c13117a.m36689K(8);
                    if (AbstractC0576a.m1494n(c13117a.m36699i()) == 0) {
                        i16 = 8;
                    } else {
                        i16 = 16;
                    }
                    c13117a.m36690L(i16);
                    jM36716z2 = c13117a.m36716z();
                    if (j13 != -9223372036854775807L) {
                    }
                    C12181a c12181aM33782o5 = c12181aM33782o2.m33782o(1835626086);
                    c12181aM33782o5.getClass();
                    C12181a c12181aM33782o6 = c12181aM33782o5.m33782o(1937007212);
                    c12181aM33782o6.getClass();
                    C12182b c12182bM33783p7 = c12181aM33782o2.m33783p(1835296868);
                    c12182bM33783p7.getClass();
                    C13117a c13117a9 = c12182bM33783p7.f40610y;
                    c13117a9.m36689K(8);
                    iM1494n = AbstractC0576a.m1494n(c13117a9.m36699i());
                    if (iM1494n == 0) {
                        i17 = 8;
                    } else {
                        i17 = 16;
                    }
                    c13117a9.m36690L(i17);
                    long jM36716z7 = c13117a9.m36716z();
                    if (iM1494n == 0) {
                        i18 = 4;
                    } else {
                        i18 = 8;
                    }
                    c13117a9.m36690L(i18);
                    int iM36682D8 = c13117a9.m36682D();
                    StringBuilder sb7 = new StringBuilder(3);
                    sb7.append((char) (((iM36682D8 >> 10) & 31) + 96));
                    sb7.append((char) (((iM36682D8 >> 5) & 31) + 96));
                    sb7.append((char) ((iM36682D8 & 31) + 96));
                    pairCreate = Pair.create(Long.valueOf(jM36716z7), sb7.toString());
                    C12182b c12182bM33783p8 = c12181aM33782o6.m33783p(1937011556);
                    c12182bM33783p8.getClass();
                    c13117a2 = c12182bM33783p8.f40610y;
                    str = (String) pairCreate.second;
                    c13117a2.m36689K(12);
                    iM36699i = c13117a2.m36699i();
                    c12198rArr = new C12198r[iM36699i];
                    j14 = jM71666D;
                    i19 = 0;
                    c31521c0 = null;
                    i24 = 0;
                    i25 = 0;
                    while (i19 < iM36699i) {
                        i34 = c13117a2.f45382b;
                        iM36699i2 = c13117a2.m36699i();
                        ArrayList arrayList7 = arrayList4;
                        if (iM36699i2 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i910 = i94;
                        str2 = "childAtomSize must be positive";
                        AbstractC32126g.m100039d("childAtomSize must be positive", z14);
                        iM36699i3 = c13117a2.m36699i();
                        int i911 = iM36699i;
                        if (iM36699i3 != 1635148593) {
                            i35 = i15;
                            arrayList5 = arrayList5;
                            pairCreate = pairCreate;
                            c12181a4 = c12181a4;
                            c12198rArr = c12198rArr;
                            i19 = i19;
                            i36 = iM36699i10;
                            c13117a2.m36689K(i34 + 16);
                            c13117a2.m36690L(16);
                            iM36682D = c13117a2.m36682D();
                            iM36682D2 = c13117a2.m36682D();
                            c13117a2.m36690L(50);
                            i37 = c13117a2.f45382b;
                            if (iM36699i3 == 1701733238) {
                                i38 = i34;
                                i39 = iM36699i2;
                                pairM33797c = m33797c(c13117a2, i38, i39);
                                if (pairM33797c != null) {
                                    iM36699i3 = ((Integer) pairM33797c.first).intValue();
                                    if (c36136c == null) {
                                        c36136cM114963b = null;
                                    } else {
                                        c36136cM114963b = c36136c.m114963b(((C12198r) pairM33797c.second).f40730b);
                                    }
                                    c12198rArr[i19] = (C12198r) pairM33797c.second;
                                } else {
                                    c36136cM114963b = c36136c;
                                }
                                c13117a2.m36689K(i37);
                            } else {
                                i38 = i34;
                                i39 = iM36699i2;
                                c36136cM114963b = c36136c;
                            }
                            if (iM36699i3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iM36699i3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i44 = i38;
                            str = str;
                            z15 = false;
                            str4 = str3;
                            fM36680B = 1.0f;
                            i45 = i25;
                            str5 = null;
                            bArr = null;
                            listM133256r = null;
                            i46 = -1;
                            byteBufferOrder = null;
                            i47 = -1;
                            i48 = -1;
                            i49 = i37;
                            i54 = -1;
                            while (true) {
                                if (i49 - i44 >= i39) {
                                    i46 = i46;
                                    break;
                                }
                                c13117a2.m36689K(i49);
                                i64 = c13117a2.f45382b;
                                int i1010 = i49;
                                iM36699i4 = c13117a2.m36699i();
                                i46 = i46;
                                if (iM36699i4 != 0) {
                                }
                                if (iM36699i4 > 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                AbstractC32126g.m100039d(str2, z16);
                                iM36699i5 = c13117a2.m36699i();
                                String str16 = str2;
                                if (iM36699i5 == 1635148611) {
                                    if (str4 == null) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    AbstractC32126g.m100039d(null, z18);
                                    c13117a2.m36689K(i64 + 8);
                                    c25720aM75837a = C25720a.m75837a(c13117a2);
                                    list3 = c25720aM75837a.f101319a;
                                    i67 = c25720aM75837a.f101320b;
                                    if (!z15) {
                                        fM36680B = c25720aM75837a.f101323e;
                                    }
                                    str5 = c25720aM75837a.f101324f;
                                    str4 = "video/avc";
                                } else {
                                    if (iM36699i5 == 1752589123) {
                                        if (str4 == null) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        AbstractC32126g.m100039d(null, z17);
                                        c13117a2.m36689K(i64 + 8);
                                        c25726gM75847a = C25726g.m75847a(c13117a2);
                                        list3 = c25726gM75847a.f101355a;
                                        i67 = c25726gM75847a.f101356b;
                                        if (!z15) {
                                            fM36680B = c25726gM75847a.f101357c;
                                        }
                                        str5 = c25726gM75847a.f101358d;
                                        str4 = "video/hevc";
                                    } else if (iM36699i5 != 1685480259) {
                                        iM36699i3 = iM36699i3;
                                        i65 = i54;
                                        f14 = fM36680B;
                                        bArr = bArr;
                                        i39 = i39;
                                        c36136cM114963b = c36136cM114963b;
                                        list2 = listM133256r;
                                        c11856j0M31815k = C11856j0.m31815k(c13117a2);
                                        if (c11856j0M31815k != null) {
                                            str5 = c11856j0M31815k.f38685x;
                                            str4 = "video/dolby-vision";
                                        }
                                        i46 = i46;
                                        listM133256r = list2;
                                        i54 = i65;
                                        fM36680B = f14;
                                    } else {
                                        iM36699i3 = iM36699i3;
                                        i65 = i54;
                                        f14 = fM36680B;
                                        bArr = bArr;
                                        i39 = i39;
                                        c36136cM114963b = c36136cM114963b;
                                        list2 = listM133256r;
                                        c11856j0M31815k = C11856j0.m31815k(c13117a2);
                                        if (c11856j0M31815k != null) {
                                            str5 = c11856j0M31815k.f38685x;
                                            str4 = "video/dolby-vision";
                                        }
                                        i46 = i46;
                                        listM133256r = list2;
                                        i54 = i65;
                                        fM36680B = f14;
                                    }
                                    i49 = i1010 + iM36699i4;
                                    str2 = str16;
                                    iM36699i3 = iM36699i3;
                                    i39 = i39;
                                    c36136cM114963b = c36136cM114963b;
                                    bArr = bArr;
                                }
                                iM36699i3 = iM36699i3;
                                bArr = bArr;
                                i39 = i39;
                                c36136cM114963b = c36136cM114963b;
                                i45 = i67;
                                i46 = i46;
                                listM133256r = list3;
                                i49 = i1010 + iM36699i4;
                                str2 = str16;
                                iM36699i3 = iM36699i3;
                                i39 = i39;
                                c36136cM114963b = c36136cM114963b;
                                bArr = bArr;
                            }
                            i55 = i54;
                            f13 = fM36680B;
                            bArr2 = bArr;
                            i56 = i39;
                            c36136c2 = c36136cM114963b;
                            list = listM133256r;
                            if (str4 == null) {
                                i15 = i35;
                            } else {
                                C31518b0 c31518b14 = new C31518b0();
                                c31518b14.f130037a = Integer.toString(i36);
                                c31518b14.f130047k = str4;
                                c31518b14.f130044h = str5;
                                c31518b14.f130052p = iM36682D;
                                c31518b14.f130053q = iM36682D2;
                                c31518b14.f130056t = f13;
                                i15 = i35;
                                c31518b14.f130055s = i15;
                                c31518b14.f130057u = bArr2;
                                c31518b14.f130058v = i55;
                                c31518b14.f130049m = list;
                                c31518b14.f130050n = c36136c2;
                                i57 = i46;
                                if (i57 == -1) {
                                    i59 = i48;
                                    i58 = i47;
                                    if (i59 == -1) {
                                    }
                                    c31521c0 = new C31521c0(c31518b14);
                                } else {
                                    i58 = i47;
                                    i59 = i48;
                                }
                                if (byteBufferOrder != null) {
                                    bArrArray = byteBufferOrder.array();
                                } else {
                                    bArrArray = null;
                                }
                                c31518b14.f130059w = new C25721b(i57, i59, i58, bArrArray);
                                c31521c0 = new C31521c0(c31518b14);
                            }
                            i25 = i45;
                        } else {
                            i35 = i15;
                            arrayList5 = arrayList5;
                            pairCreate = pairCreate;
                            c12181a4 = c12181a4;
                            c12198rArr = c12198rArr;
                            i19 = i19;
                            i36 = iM36699i10;
                            c13117a2.m36689K(i34 + 16);
                            c13117a2.m36690L(16);
                            iM36682D = c13117a2.m36682D();
                            iM36682D2 = c13117a2.m36682D();
                            c13117a2.m36690L(50);
                            i37 = c13117a2.f45382b;
                            if (iM36699i3 == 1701733238) {
                                i38 = i34;
                                i39 = iM36699i2;
                                pairM33797c = m33797c(c13117a2, i38, i39);
                                if (pairM33797c != null) {
                                    iM36699i3 = ((Integer) pairM33797c.first).intValue();
                                    if (c36136c == null) {
                                        c36136cM114963b = null;
                                    } else {
                                        c36136cM114963b = c36136c.m114963b(((C12198r) pairM33797c.second).f40730b);
                                    }
                                    c12198rArr[i19] = (C12198r) pairM33797c.second;
                                } else {
                                    c36136cM114963b = c36136c;
                                }
                                c13117a2.m36689K(i37);
                            } else {
                                i38 = i34;
                                i39 = iM36699i2;
                                c36136cM114963b = c36136c;
                            }
                            if (iM36699i3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iM36699i3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i44 = i38;
                            str = str;
                            z15 = false;
                            str4 = str3;
                            fM36680B = 1.0f;
                            i45 = i25;
                            str5 = null;
                            bArr = null;
                            listM133256r = null;
                            i46 = -1;
                            byteBufferOrder = null;
                            i47 = -1;
                            i48 = -1;
                            i49 = i37;
                            i54 = -1;
                            while (true) {
                                if (i49 - i44 >= i39) {
                                    i46 = i46;
                                    break;
                                }
                                c13117a2.m36689K(i49);
                                i64 = c13117a2.f45382b;
                                int i1011 = i49;
                                iM36699i4 = c13117a2.m36699i();
                                i46 = i46;
                                if (iM36699i4 != 0) {
                                }
                                if (iM36699i4 > 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                AbstractC32126g.m100039d(str2, z16);
                                iM36699i5 = c13117a2.m36699i();
                                String str17 = str2;
                                if (iM36699i5 == 1635148611) {
                                    if (str4 == null) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    AbstractC32126g.m100039d(null, z18);
                                    c13117a2.m36689K(i64 + 8);
                                    c25720aM75837a = C25720a.m75837a(c13117a2);
                                    list3 = c25720aM75837a.f101319a;
                                    i67 = c25720aM75837a.f101320b;
                                    if (!z15) {
                                        fM36680B = c25720aM75837a.f101323e;
                                    }
                                    str5 = c25720aM75837a.f101324f;
                                    str4 = "video/avc";
                                } else {
                                    if (iM36699i5 == 1752589123) {
                                        if (str4 == null) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        AbstractC32126g.m100039d(null, z17);
                                        c13117a2.m36689K(i64 + 8);
                                        c25726gM75847a = C25726g.m75847a(c13117a2);
                                        list3 = c25726gM75847a.f101355a;
                                        i67 = c25726gM75847a.f101356b;
                                        if (!z15) {
                                            fM36680B = c25726gM75847a.f101357c;
                                        }
                                        str5 = c25726gM75847a.f101358d;
                                        str4 = "video/hevc";
                                    } else if (iM36699i5 != 1685480259) {
                                        iM36699i3 = iM36699i3;
                                        i65 = i54;
                                        f14 = fM36680B;
                                        bArr = bArr;
                                        i39 = i39;
                                        c36136cM114963b = c36136cM114963b;
                                        list2 = listM133256r;
                                        c11856j0M31815k = C11856j0.m31815k(c13117a2);
                                        if (c11856j0M31815k != null) {
                                            str5 = c11856j0M31815k.f38685x;
                                            str4 = "video/dolby-vision";
                                        }
                                        i46 = i46;
                                        listM133256r = list2;
                                        i54 = i65;
                                        fM36680B = f14;
                                    } else {
                                        iM36699i3 = iM36699i3;
                                        i65 = i54;
                                        f14 = fM36680B;
                                        bArr = bArr;
                                        i39 = i39;
                                        c36136cM114963b = c36136cM114963b;
                                        list2 = listM133256r;
                                        c11856j0M31815k = C11856j0.m31815k(c13117a2);
                                        if (c11856j0M31815k != null) {
                                            str5 = c11856j0M31815k.f38685x;
                                            str4 = "video/dolby-vision";
                                        }
                                        i46 = i46;
                                        listM133256r = list2;
                                        i54 = i65;
                                        fM36680B = f14;
                                    }
                                    i49 = i1011 + iM36699i4;
                                    str2 = str17;
                                    iM36699i3 = iM36699i3;
                                    i39 = i39;
                                    c36136cM114963b = c36136cM114963b;
                                    bArr = bArr;
                                }
                                iM36699i3 = iM36699i3;
                                bArr = bArr;
                                i39 = i39;
                                c36136cM114963b = c36136cM114963b;
                                i45 = i67;
                                i46 = i46;
                                listM133256r = list3;
                                i49 = i1011 + iM36699i4;
                                str2 = str17;
                                iM36699i3 = iM36699i3;
                                i39 = i39;
                                c36136cM114963b = c36136cM114963b;
                                bArr = bArr;
                            }
                            i55 = i54;
                            f13 = fM36680B;
                            bArr2 = bArr;
                            i56 = i39;
                            c36136c2 = c36136cM114963b;
                            list = listM133256r;
                            if (str4 == null) {
                                i15 = i35;
                            } else {
                                C31518b0 c31518b15 = new C31518b0();
                                c31518b15.f130037a = Integer.toString(i36);
                                c31518b15.f130047k = str4;
                                c31518b15.f130044h = str5;
                                c31518b15.f130052p = iM36682D;
                                c31518b15.f130053q = iM36682D2;
                                c31518b15.f130056t = f13;
                                i15 = i35;
                                c31518b15.f130055s = i15;
                                c31518b15.f130057u = bArr2;
                                c31518b15.f130058v = i55;
                                c31518b15.f130049m = list;
                                c31518b15.f130050n = c36136c2;
                                i57 = i46;
                                if (i57 == -1) {
                                    i59 = i48;
                                    i58 = i47;
                                    if (i59 == -1) {
                                    }
                                    c31521c0 = new C31521c0(c31518b15);
                                } else {
                                    i58 = i47;
                                    i59 = i48;
                                }
                                if (byteBufferOrder != null) {
                                    bArrArray = byteBufferOrder.array();
                                } else {
                                    bArrArray = null;
                                }
                                c31518b15.f130059w = new C25721b(i57, i59, i58, bArrArray);
                                c31521c0 = new C31521c0(c31518b15);
                            }
                            i25 = i45;
                        }
                        c13117a2.m36689K(i44 + i56);
                        i19++;
                        c36136c = c36136c;
                        arrayList4 = arrayList7;
                        i94 = i910;
                        iM36699i = i911;
                        c12198rArr = c12198rArr;
                        str = str;
                        arrayList5 = arrayList5;
                        pairCreate = pairCreate;
                        c12181a4 = c12181a4;
                        i13 = i13;
                        iM36699i10 = i36;
                    }
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    pair = pairCreate;
                    i26 = i94;
                    c12181a2 = c12181a4;
                    i27 = i13;
                    c12198rArr2 = c12198rArr;
                    i28 = iM36699i10;
                    if (z4) {
                        c12181a4 = c12181a2;
                        c12181aM33782o = c12181a4.m33782o(1701082227);
                        if (c12181aM33782o == null) {
                            c12182bM33783p = c12181aM33782o.m33783p(1701606260);
                            if (c12182bM33783p == null) {
                                pairCreate2 = null;
                            } else {
                                c13117a3 = c12182bM33783p.f40610y;
                                c13117a3.m36689K(8);
                                iM1494n2 = AbstractC0576a.m1494n(c13117a3.m36699i());
                                iM36680B = c13117a3.m36680B();
                                jArr3 = new long[iM36680B];
                                jArr4 = new long[iM36680B];
                                while (i29 < iM36680B) {
                                    if (iM1494n2 == 1) {
                                        jM36716z3 = c13117a3.m36681C();
                                    } else {
                                        jM36716z3 = c13117a3.m36716z();
                                    }
                                    jArr3[i29] = jM36716z3;
                                    if (iM1494n2 == 1) {
                                        jM36699i = c13117a3.m36706p();
                                    } else {
                                        jM36699i = c13117a3.m36699i();
                                    }
                                    jArr4[i29] = jM36699i;
                                    if (c13117a3.m36710t() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    c13117a3.m36690L(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                        }
                        if (c31521c0 == null) {
                            c12197q = null;
                        } else {
                            c12197q = new C12197q(i28, i27, ((Long) pair.first).longValue(), jM36716z2, j14, c31521c0, i24, c12198rArr2, i25, jArr, jArr2);
                        }
                    } else {
                        c12181a4 = c12181a2;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (c31521c0 == null) {
                        c12197q = null;
                    } else {
                        c12197q = new C12197q(i28, i27, ((Long) pair.first).longValue(), jM36716z2, j14, c31521c0, i24, c12198rArr2, i25, jArr, jArr2);
                    }
                }
                C12197q c12197q2 = (C12197q) interfaceC39718e.apply(c12197q);
                if (c12197q2 == null) {
                    arrayList3 = arrayList2;
                } else {
                    C12181a c12181aM33782o7 = c12181a4.m33782o(1835297121);
                    c12181aM33782o7.getClass();
                    C12181a c12181aM33782o8 = c12181aM33782o7.m33782o(1835626086);
                    c12181aM33782o8.getClass();
                    C12181a c12181aM33782o9 = c12181aM33782o8.m33782o(1937007212);
                    c12181aM33782o9.getClass();
                    C12200t c12200tM33798d = m33798d(c12197q2, c12181aM33782o9, c37371m);
                    arrayList3 = arrayList2;
                    arrayList3.add(c12200tM33798d);
                }
            }
            i94 = i26 + 1;
            c12181a3 = c12181a;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
        }
        return arrayList5;
    }
}

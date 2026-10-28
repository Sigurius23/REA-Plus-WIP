package na;

import ai.C0902h;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.android.material.datepicker.C5020n;
import com.google.android.material.textfield.C5057p;
import com.iterable.iterableapi.C5363q;
import io.getstream.chat.android.client.ChatClient;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import la.C23548b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC30802r;
import p010a9.AbstractC0576a;
import p085d9.C11789f;
import p085d9.C11793j;
import p087db.C11856j0;
import p094dn.C12183c;
import p094dn.C12185e;
import p309lo.C24561s;
import p408q.C29662f;
import p499t9.AbstractC33618a;
import p499t9.C33620b;
import p499t9.C33655x;
import p499t9.C33656y;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34592g;
import p516u8.C34602l;
import p516u8.C34608o;
import p516u8.C34610p;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38047b;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.C39307b;
import p641y8.C39308c;
import p641y8.C39309d;
import p641y8.C39311f;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: na.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26490c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f105203a;

    static {
        int i13 = AbstractC38065t.f163031a;
        f105203a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static C0902h m78534a(int i13, C38059n c38059n) {
        c38059n.m121846F(i13 + 12);
        c38059n.m121847G(1);
        m78535b(c38059n);
        c38059n.m121847G(2);
        int iM121867t = c38059n.m121867t();
        if ((iM121867t & 128) != 0) {
            c38059n.m121847G(2);
        }
        if ((iM121867t & 64) != 0) {
            c38059n.m121847G(c38059n.m121867t());
        }
        if ((iM121867t & 32) != 0) {
            c38059n.m121847G(2);
        }
        c38059n.m121847G(1);
        m78535b(c38059n);
        String strM109373f = AbstractC34587d0.m109373f(c38059n.m121867t());
        if ("audio/mpeg".equals(strM109373f) || "audio/vnd.dts".equals(strM109373f) || "audio/vnd.dts.hd".equals(strM109373f)) {
            return new C0902h(strM109373f, null, -1L, -1L);
        }
        c38059n.m121847G(4);
        long jM121869v = c38059n.m121869v();
        long jM121869v2 = c38059n.m121869v();
        c38059n.m121847G(1);
        int iM78535b = m78535b(c38059n);
        long j7 = jM121869v2;
        byte[] bArr = new byte[iM78535b];
        c38059n.m121852e(bArr, 0, iM78535b);
        if (j7 <= 0) {
            j7 = -1;
        }
        return new C0902h(strM109373f, bArr, j7, jM121869v > 0 ? jM121869v : -1L);
    }

    /* JADX INFO: renamed from: b */
    public static int m78535b(C38059n c38059n) {
        int iM121867t = c38059n.m121867t();
        int i13 = iM121867t & 127;
        while ((iM121867t & 128) == 128) {
            iM121867t = c38059n.m121867t();
            i13 = (i13 << 7) | (iM121867t & 127);
        }
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public static int m78536c(int i13) {
        return (i13 >> 24) & 255;
    }

    /* JADX INFO: renamed from: d */
    public static C39311f m78537d(C38059n c38059n) {
        long jM121861n;
        long jM121861n2;
        c38059n.m121846F(8);
        if (m78536c(c38059n.m121854g()) == 0) {
            jM121861n = c38059n.m121869v();
            jM121861n2 = c38059n.m121869v();
        } else {
            jM121861n = c38059n.m121861n();
            jM121861n2 = c38059n.m121861n();
        }
        return new C39311f(jM121861n, jM121861n2, c38059n.m121869v());
    }

    /* JADX INFO: renamed from: e */
    public static Pair m78538e(C38059n c38059n, int i13, int i14) throws ParserException {
        C26503p c26503p;
        Pair pairCreate;
        int i15;
        int i16;
        int i17 = c38059n.f163018b;
        while (i17 - i13 < i14) {
            c38059n.m121846F(i17);
            int iM121854g = c38059n.m121854g();
            AbstractC33618a.m106211c("childAtomSize must be positive", iM121854g > 0);
            if (c38059n.m121854g() == 1936289382) {
                int i18 = i17 + 8;
                int i19 = 0;
                int i24 = -1;
                Integer numValueOf = null;
                String strM121865r = null;
                while (i18 - i17 < iM121854g) {
                    c38059n.m121846F(i18);
                    int iM121854g2 = c38059n.m121854g();
                    int iM121854g3 = c38059n.m121854g();
                    if (iM121854g3 == 1718775137) {
                        numValueOf = Integer.valueOf(c38059n.m121854g());
                    } else if (iM121854g3 == 1935894637) {
                        c38059n.m121847G(4);
                        strM121865r = c38059n.m121865r(4, StandardCharsets.UTF_8);
                    } else if (iM121854g3 == 1935894633) {
                        i24 = i18;
                        i19 = iM121854g2;
                    }
                    i18 += iM121854g2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM121865r) || "cbc1".equals(strM121865r) || "cens".equals(strM121865r) || "cbcs".equals(strM121865r)) {
                    AbstractC33618a.m106211c("frma atom is mandatory", numValueOf != null);
                    AbstractC33618a.m106211c("schi atom is mandatory", i24 != -1);
                    int i25 = i24 + 8;
                    while (true) {
                        if (i25 - i24 >= i19) {
                            c26503p = null;
                            break;
                        }
                        c38059n.m121846F(i25);
                        int iM121854g4 = c38059n.m121854g();
                        if (c38059n.m121854g() == 1952804451) {
                            int iM78536c = m78536c(c38059n.m121854g());
                            c38059n.m121847G(1);
                            if (iM78536c == 0) {
                                c38059n.m121847G(1);
                                i16 = 0;
                                i15 = 0;
                            } else {
                                int iM121867t = c38059n.m121867t();
                                i15 = iM121867t & 15;
                                i16 = (iM121867t & 240) >> 4;
                            }
                            boolean z4 = c38059n.m121867t() == 1;
                            int iM121867t2 = c38059n.m121867t();
                            byte[] bArr2 = new byte[16];
                            c38059n.m121852e(bArr2, 0, 16);
                            if (z4 && iM121867t2 == 0) {
                                int iM121867t3 = c38059n.m121867t();
                                byte[] bArr3 = new byte[iM121867t3];
                                c38059n.m121852e(bArr3, 0, iM121867t3);
                                bArr = bArr3;
                            }
                            c26503p = new C26503p(z4, strM121865r, iM121867t2, bArr2, i16, i15, bArr);
                            break;
                        }
                        i25 += iM121854g4;
                    }
                    AbstractC33618a.m106211c("tenc atom is mandatory", c26503p != null);
                    int i26 = AbstractC38065t.f163031a;
                    pairCreate = Pair.create(numValueOf, c26503p);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i17 += iM121854g;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0270  */
    /* JADX WARN: Code duplicated, block: B:227:0x035f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0612  */
    /* JADX WARN: Code duplicated, block: B:356:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:421:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:428:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:505:0x0907  */
    /* JADX WARN: Code duplicated, block: B:563:0x09db  */
    /* JADX WARN: Code duplicated, block: B:609:0x0bc5  */
    /* JADX WARN: Code duplicated, block: B:611:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:613:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:615:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:619:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:621:0x0beb  */
    /* JADX WARN: Code duplicated, block: B:623:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:627:0x0bfe A[LOOP:15: B:617:0x0bdc->B:627:0x0bfe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:630:0x0c0f  */
    /* JADX WARN: Code duplicated, block: B:632:0x0c1d  */
    /* JADX WARN: Code duplicated, block: B:634:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:645:0x0c62 A[LOOP:14: B:641:0x0c4f->B:645:0x0c62, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:651:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:653:0x0ca1  */
    /* JADX WARN: Code duplicated, block: B:654:0x0cb9  */
    /* JADX WARN: Code duplicated, block: B:656:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:657:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:683:0x09fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x0c6d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0c6b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x0bcc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x0c09 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static C5057p m78539f(C38059n c38059n, int i13, int i14, String str, C34602l c34602l, boolean z4) throws ParserException {
        int i15;
        int i16;
        int i17;
        int iM121873z;
        int iM121854g;
        int i18;
        int i19;
        int i24;
        int i25;
        C34602l c34602lM109391b;
        String str2;
        String str3;
        String str4;
        int i26;
        int i27;
        int i28;
        boolean z13;
        String str5;
        int iM121854g2;
        boolean z14;
        C0902h c0902hM78534a;
        byte[] bArr;
        C38059n c38059n2;
        int i29;
        int i34;
        int i35;
        int i36;
        C41060w0 c41060w0M133256r;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int iM71632i;
        int iM71632i2;
        int i46;
        boolean z15;
        boolean z16;
        int i47;
        boolean zM71631h;
        int i48;
        int iM71632i3;
        boolean z17;
        String str6;
        String str7;
        int i49;
        long j7;
        C41060w0 c41060w0M133256r2;
        C38059n c38059n3 = c38059n;
        c38059n3.m121846F(12);
        int iM121854g3 = c38059n3.m121854g();
        C5057p c5057p = new C5057p(iM121854g3);
        int i54 = 0;
        while (i54 < iM121854g3) {
            int i55 = c38059n3.f163018b;
            int iM121854g4 = c38059n3.m121854g();
            String str8 = "childAtomSize must be positive";
            AbstractC33618a.m106211c("childAtomSize must be positive", iM121854g4 > 0);
            int iM121854g5 = c38059n3.m121854g();
            if (iM121854g5 == 1635148593 || iM121854g5 == 1635148595 || iM121854g5 == 1701733238 || iM121854g5 == 1831958048 || iM121854g5 == 1836070006 || iM121854g5 == 1752589105 || iM121854g5 == 1751479857 || iM121854g5 == 1932670515 || iM121854g5 == 1211250227 || iM121854g5 == 1748121139 || iM121854g5 == 1987063864 || iM121854g5 == 1987063865 || iM121854g5 == 1635135537 || iM121854g5 == 1685479798 || iM121854g5 == 1685479729 || iM121854g5 == 1685481573 || iM121854g5 == 1685481521) {
                c38059n3 = c38059n;
                c34602l = c34602l;
            } else {
                if (iM121854g5 != 1634760241) {
                    if (iM121854g5 == 1836069985 || iM121854g5 == 1701733217 || iM121854g5 == 1633889587 || iM121854g5 == 1700998451 || iM121854g5 == 1633889588 || iM121854g5 == 1835823201 || iM121854g5 == 1685353315 || iM121854g5 == 1685353317 || iM121854g5 == 1685353320 || iM121854g5 == 1685353324 || iM121854g5 == 1685353336 || iM121854g5 == 1935764850 || iM121854g5 == 1935767394 || iM121854g5 == 1819304813 || iM121854g5 == 1936684916 || iM121854g5 == 1953984371 || iM121854g5 == 778924082 || iM121854g5 == 778924083 || iM121854g5 == 1835557169 || iM121854g5 == 1835560241 || iM121854g5 == 1634492771 || iM121854g5 == 1634492791 || iM121854g5 == 1970037111 || iM121854g5 == 1332770163 || iM121854g5 == 1716281667 || iM121854g5 == 1767992678) {
                        c38059n3.m121846F(i55 + 16);
                        if (z4) {
                            int iM121873z2 = c38059n3.m121873z();
                            c38059n3.m121847G(6);
                            i17 = iM121873z2;
                        } else {
                            c38059n3.m121847G(8);
                            i17 = 0;
                        }
                        if (i17 == 0 || i17 == 1) {
                            iM121873z = c38059n3.m121873z();
                            c38059n3.m121847G(6);
                            int iM121868u = c38059n3.m121868u();
                            c38059n3.m121846F(c38059n3.f163018b - 4);
                            iM121854g = c38059n3.m121854g();
                            if (i17 == 1) {
                                c38059n3.m121847G(16);
                            }
                            i18 = iM121868u;
                            i19 = -1;
                        } else {
                            if (i17 == 2) {
                                c38059n3.m121847G(16);
                                int iRound = (int) Math.round(Double.longBitsToDouble(c38059n3.m121861n()));
                                int iM121871x = c38059n3.m121871x();
                                c38059n3.m121847G(4);
                                int iM121871x2 = c38059n3.m121871x();
                                int iM121871x3 = c38059n3.m121871x();
                                boolean z18 = (iM121871x3 & 1) != 0;
                                boolean z19 = (iM121871x3 & 2) != 0;
                                if (z18) {
                                    if (iM121871x2 == 32) {
                                        i49 = 4;
                                    } else {
                                        i49 = -1;
                                    }
                                } else if (iM121871x2 == 8) {
                                    i49 = 3;
                                } else if (iM121871x2 == 16) {
                                    i49 = z19 ? 268435456 : 2;
                                } else if (iM121871x2 == 24) {
                                    i49 = z19 ? 1342177280 : 21;
                                } else if (iM121871x2 == 32) {
                                    i49 = z19 ? 1610612736 : 22;
                                } else {
                                    i49 = -1;
                                }
                                c38059n3.m121847G(8);
                                i18 = iRound;
                                iM121873z = iM121871x;
                                iM121854g = 0;
                                i19 = i49;
                            } else {
                                iM121854g3 = iM121854g3;
                                i24 = i55;
                                i15 = iM121854g4;
                                i16 = i54;
                            }
                            c38059n3 = c38059n;
                            i55 = i24;
                        }
                        if (iM121854g5 == 1767992678) {
                            i25 = -1;
                            iM121873z = -1;
                        } else {
                            if (iM121854g5 == 1935764850) {
                                i25 = 8000;
                            } else if (iM121854g5 == 1935767394) {
                                i25 = 16000;
                            } else {
                                i25 = i18;
                            }
                            iM121873z = 1;
                        }
                        int i56 = c38059n3.f163018b;
                        if (iM121854g5 == 1701733217) {
                            Pair pairM78538e = m78538e(c38059n3, i55, iM121854g4);
                            if (pairM78538e != null) {
                                iM121854g5 = ((Integer) pairM78538e.first).intValue();
                                c34602lM109391b = c34602l == 0 ? null : c34602l.m109391b(((C26503p) pairM78538e.second).f105324b);
                                ((C26503p[]) c5057p.f21239d)[i54] = (C26503p) pairM78538e.second;
                            } else {
                                c34602lM109391b = c34602l;
                            }
                            c38059n3.m121846F(i56);
                        } else {
                            i25 = i25;
                            c34602lM109391b = c34602l;
                        }
                        String str9 = "audio/mhm1";
                        if (iM121854g5 == 1633889587) {
                            str2 = "audio/ac3";
                        } else if (iM121854g5 == 1700998451) {
                            str2 = "audio/eac3";
                        } else if (iM121854g5 == 1633889588) {
                            str2 = "audio/ac4";
                        } else if (iM121854g5 == 1685353315) {
                            str2 = "audio/vnd.dts";
                        } else if (iM121854g5 == 1685353320 || iM121854g5 == 1685353324) {
                            str2 = "audio/vnd.dts.hd";
                        } else if (iM121854g5 == 1685353317) {
                            str2 = "audio/vnd.dts.hd;profile=lbr";
                        } else if (iM121854g5 == 1685353336) {
                            str2 = "audio/vnd.dts.uhd;profile=p2";
                        } else if (iM121854g5 == 1935764850) {
                            str2 = "audio/3gpp";
                        } else if (iM121854g5 == 1935767394) {
                            str2 = "audio/amr-wb";
                        } else if (iM121854g5 == 1936684916) {
                            str2 = "audio/raw";
                            i19 = 2;
                        } else if (iM121854g5 == 1953984371) {
                            str2 = "audio/raw";
                            i19 = 268435456;
                        } else if (iM121854g5 == 1819304813) {
                            if (i19 == -1) {
                                str2 = "audio/raw";
                                i19 = 2;
                            } else {
                                str2 = "audio/raw";
                            }
                        } else if (iM121854g5 == 778924082 || iM121854g5 == 778924083) {
                            str2 = "audio/mpeg";
                        } else if (iM121854g5 == 1835557169) {
                            str2 = "audio/mha1";
                        } else if (iM121854g5 == 1835560241) {
                            str2 = "audio/mhm1";
                        } else if (iM121854g5 == 1634492771) {
                            str2 = "audio/alac";
                        } else if (iM121854g5 == 1634492791) {
                            str2 = "audio/g711-alaw";
                        } else if (iM121854g5 == 1970037111) {
                            str2 = "audio/g711-mlaw";
                        } else if (iM121854g5 == 1332770163) {
                            str2 = "audio/opus";
                        } else if (iM121854g5 == 1716281667) {
                            str2 = "audio/flac";
                        } else if (iM121854g5 == 1835823201) {
                            str2 = "audio/true-hd";
                        } else {
                            str2 = iM121854g5 == 1767992678 ? "audio/iamf" : null;
                        }
                        String str10 = str2;
                        i24 = i55;
                        i16 = i54;
                        int i57 = i56;
                        String str11 = null;
                        List listM133257t = null;
                        C0902h c0902h = null;
                        C26488a c26488a = null;
                        int iIntValue = iM121873z;
                        int i58 = i25;
                        while (i57 - i24 < iM121854g4) {
                            c38059n3.m121846F(i57);
                            int iM121854g6 = c38059n3.m121854g();
                            int i59 = i57;
                            AbstractC33618a.m106211c(str8, iM121854g6 > 0);
                            int iM121854g7 = c38059n3.m121854g();
                            int i64 = iM121854g4;
                            if (iM121854g7 == 1835557187) {
                                c38059n3.m121846F(i59 + 8);
                                c38059n3.m121847G(1);
                                int iM121867t = c38059n3.m121867t();
                                c38059n3.m121847G(1);
                                String str12 = Objects.equals(str10, str9) ? String.format("mhm1.%02X", Integer.valueOf(iM121867t)) : String.format("mha1.%02X", Integer.valueOf(iM121867t));
                                int iM121873z3 = c38059n3.m121873z();
                                byte[] bArr2 = new byte[iM121873z3];
                                c38059n3.m121852e(bArr2, 0, iM121873z3);
                                listM133257t = listM133257t == null ? AbstractC41023g0.m133256r(bArr2) : AbstractC41023g0.m133257t(bArr2, (byte[]) listM133257t.get(0));
                                str11 = str12;
                            } else if (iM121854g7 == 1835557200) {
                                c38059n3.m121846F(i59 + 8);
                                int iM121867t2 = c38059n3.m121867t();
                                if (iM121867t2 > 0) {
                                    byte[] bArr3 = new byte[iM121867t2];
                                    str7 = str10;
                                    c38059n3.m121852e(bArr3, 0, iM121867t2);
                                    listM133257t = listM133257t == null ? AbstractC41023g0.m133256r(bArr3) : AbstractC41023g0.m133257t((byte[]) listM133257t.get(0), bArr3);
                                } else {
                                    str7 = str10;
                                }
                                listM133257t = listM133257t;
                                str10 = str7;
                            } else {
                                str10 = str10;
                                int i65 = 1702061171;
                                if (iM121854g7 == 1702061171) {
                                    str3 = str11;
                                    str4 = str8;
                                    listM133257t = listM133257t;
                                    i26 = iM121854g6;
                                    i58 = i58;
                                    i19 = i19;
                                    str9 = str9;
                                    i27 = iIntValue;
                                    if (iM121854g7 == i65) {
                                        str5 = str4;
                                        iM121854g6 = i26;
                                        i28 = i59;
                                        i59 = i28;
                                    } else {
                                        i28 = c38059n3.f163018b;
                                        i59 = i59;
                                        if (i28 >= i59) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        AbstractC33618a.m106211c(null, z13);
                                        while (true) {
                                            iM121854g6 = i26;
                                            if (i28 - i59 < iM121854g6) {
                                                c38059n3.m121846F(i28);
                                                iM121854g2 = c38059n3.m121854g();
                                                if (iM121854g2 > 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                str5 = str4;
                                                AbstractC33618a.m106211c(str5, z14);
                                                if (c38059n3.m121854g() == 1702061171) {
                                                    i28 += iM121854g2;
                                                    i26 = iM121854g6;
                                                    str4 = str5;
                                                }
                                            } else {
                                                str5 = str4;
                                                i28 = -1;
                                            }
                                        }
                                    }
                                    if (i28 != -1) {
                                        c0902hM78534a = m78534a(i28, c38059n3);
                                        str10 = (String) c0902hM78534a.f3297z;
                                        bArr = (byte[]) c0902hM78534a.f3293E;
                                        if (bArr != null) {
                                            if ("audio/vorbis".equals(str10)) {
                                                c38059n2 = new C38059n(bArr);
                                                c38059n2.m121847G(1);
                                                i29 = 0;
                                                while (c38059n2.m121848a() > 0 && (c38059n2.f163017a[c38059n2.f163018b] & 255) == 255) {
                                                    i29 += 255;
                                                    c38059n2.m121847G(1);
                                                }
                                                int iM121867t3 = c38059n2.m121867t() + i29;
                                                i34 = 0;
                                                while (true) {
                                                    if (c38059n2.m121848a() > 0) {
                                                        c0902h = c0902hM78534a;
                                                        if ((c38059n2.f163017a[c38059n2.f163018b] & 255) == 255) {
                                                            i34 += 255;
                                                            c38059n2.m121847G(1);
                                                            c0902hM78534a = c0902h;
                                                        }
                                                    } else {
                                                        c0902h = c0902hM78534a;
                                                    }
                                                }
                                                int iM121867t4 = c38059n2.m121867t() + i34;
                                                byte[] bArr4 = new byte[iM121867t3];
                                                int i66 = c38059n2.f163018b;
                                                System.arraycopy(bArr, i66, bArr4, 0, iM121867t3);
                                                int i67 = i66 + iM121867t3 + iM121867t4;
                                                int length = bArr.length - i67;
                                                byte[] bArr5 = new byte[length];
                                                System.arraycopy(bArr, i67, bArr5, 0, length);
                                                listM133257t = AbstractC41023g0.m133257t(bArr4, bArr5);
                                            } else {
                                                c0902h = c0902hM78534a;
                                                iM121854g = iM121854g;
                                                if ("audio/mp4a-latm".equals(str10)) {
                                                    C5363q c5363qM106221m = AbstractC33618a.m106221m(new C24561s(bArr, bArr.length, 5, (byte) 0), false);
                                                    int i68 = c5363qM106221m.f21806b;
                                                    int i69 = c5363qM106221m.f21807c;
                                                    str11 = c5363qM106221m.f21805a;
                                                    i27 = i69;
                                                    i58 = i68;
                                                } else {
                                                    i27 = i27;
                                                    str11 = str3;
                                                }
                                                C41060w0 c41060w0M133256r3 = AbstractC41023g0.m133256r(bArr);
                                                i58 = i58;
                                                listM133257t = c41060w0M133256r3;
                                            }
                                            iIntValue = i27;
                                        } else {
                                            c0902h = c0902hM78534a;
                                        }
                                    } else {
                                        iM121854g = iM121854g;
                                        str10 = str10;
                                    }
                                    str11 = str3;
                                    iIntValue = i27;
                                } else if (z4 && iM121854g7 == 2002876005) {
                                    i65 = 1702061171;
                                    str3 = str11;
                                    str4 = str8;
                                    listM133257t = listM133257t;
                                    i26 = iM121854g6;
                                    i58 = i58;
                                    i19 = i19;
                                    str9 = str9;
                                    i27 = iIntValue;
                                    if (iM121854g7 == i65) {
                                        str5 = str4;
                                        iM121854g6 = i26;
                                        i28 = i59;
                                        i59 = i28;
                                    } else {
                                        i28 = c38059n3.f163018b;
                                        i59 = i59;
                                        if (i28 >= i59) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        AbstractC33618a.m106211c(null, z13);
                                        while (true) {
                                            iM121854g6 = i26;
                                            if (i28 - i59 < iM121854g6) {
                                                c38059n3.m121846F(i28);
                                                iM121854g2 = c38059n3.m121854g();
                                                if (iM121854g2 > 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                str5 = str4;
                                                AbstractC33618a.m106211c(str5, z14);
                                                if (c38059n3.m121854g() == 1702061171) {
                                                    i28 += iM121854g2;
                                                    i26 = iM121854g6;
                                                    str4 = str5;
                                                }
                                            } else {
                                                str5 = str4;
                                                i28 = -1;
                                            }
                                        }
                                    }
                                    if (i28 != -1) {
                                        c0902hM78534a = m78534a(i28, c38059n3);
                                        str10 = (String) c0902hM78534a.f3297z;
                                        bArr = (byte[]) c0902hM78534a.f3293E;
                                        if (bArr != null) {
                                            if ("audio/vorbis".equals(str10)) {
                                                c38059n2 = new C38059n(bArr);
                                                c38059n2.m121847G(1);
                                                i29 = 0;
                                                while (c38059n2.m121848a() > 0) {
                                                    i29 += 255;
                                                    c38059n2.m121847G(1);
                                                }
                                                int iM121867t5 = c38059n2.m121867t() + i29;
                                                i34 = 0;
                                                while (true) {
                                                    if (c38059n2.m121848a() > 0) {
                                                        c0902h = c0902hM78534a;
                                                        if ((c38059n2.f163017a[c38059n2.f163018b] & 255) == 255) {
                                                            i34 += 255;
                                                            c38059n2.m121847G(1);
                                                            c0902hM78534a = c0902h;
                                                        }
                                                    } else {
                                                        c0902h = c0902hM78534a;
                                                    }
                                                }
                                                int iM121867t6 = c38059n2.m121867t() + i34;
                                                byte[] bArr6 = new byte[iM121867t5];
                                                int i610 = c38059n2.f163018b;
                                                System.arraycopy(bArr, i610, bArr6, 0, iM121867t5);
                                                int i611 = i610 + iM121867t5 + iM121867t6;
                                                int length2 = bArr.length - i611;
                                                byte[] bArr7 = new byte[length2];
                                                System.arraycopy(bArr, i611, bArr7, 0, length2);
                                                listM133257t = AbstractC41023g0.m133257t(bArr6, bArr7);
                                            } else {
                                                c0902h = c0902hM78534a;
                                                iM121854g = iM121854g;
                                                if ("audio/mp4a-latm".equals(str10)) {
                                                    C5363q c5363qM106221m2 = AbstractC33618a.m106221m(new C24561s(bArr, bArr.length, 5, (byte) 0), false);
                                                    int i612 = c5363qM106221m2.f21806b;
                                                    int i613 = c5363qM106221m2.f21807c;
                                                    str11 = c5363qM106221m2.f21805a;
                                                    i27 = i613;
                                                    i58 = i612;
                                                } else {
                                                    i27 = i27;
                                                    str11 = str3;
                                                }
                                                C41060w0 c41060w0M133256r4 = AbstractC41023g0.m133256r(bArr);
                                                i58 = i58;
                                                listM133257t = c41060w0M133256r4;
                                            }
                                            iIntValue = i27;
                                        } else {
                                            c0902h = c0902hM78534a;
                                        }
                                    } else {
                                        iM121854g = iM121854g;
                                        str10 = str10;
                                    }
                                    str11 = str3;
                                    iIntValue = i27;
                                } else if (iM121854g7 == 1651798644) {
                                    c38059n3.m121846F(i59 + 8);
                                    c38059n3.m121847G(4);
                                    listM133257t = listM133257t;
                                    c26488a = new C26488a(c38059n3.m121869v(), c38059n3.m121869v());
                                    str10 = str10;
                                    str11 = str11;
                                } else {
                                    str11 = str11;
                                    str9 = str9;
                                    if (iM121854g7 == 1684103987) {
                                        c38059n3.m121846F(i59 + 8);
                                        String string = Integer.toString(i13);
                                        C24561s c24561s = new C24561s(5);
                                        c24561s.m71639p(c38059n3);
                                        int i74 = AbstractC33618a.f140305d[c24561s.m71632i(2)];
                                        c24561s.m71643t(8);
                                        int i75 = AbstractC33618a.f140307f[c24561s.m71632i(3)];
                                        if (c24561s.m71632i(1) != 0) {
                                            i75++;
                                        }
                                        int i76 = AbstractC33618a.f140308g[c24561s.m71632i(5)] * 1000;
                                        c24561s.m71626c();
                                        c38059n3.m121846F(c24561s.m71629f());
                                        C34608o c34608o = new C34608o();
                                        c34608o.f145729a = string;
                                        c34608o.f145741m = AbstractC34587d0.m109382o("audio/ac3");
                                        c34608o.f145719C = i75;
                                        c34608o.f145720D = i74;
                                        c34608o.f145745q = c34602lM109391b;
                                        c34608o.f145732d = str;
                                        c34608o.f145736h = i76;
                                        c34608o.f145737i = i76;
                                        c5057p.f21240e = new C34610p(c34608o);
                                    } else if (iM121854g7 == 1684366131) {
                                        c38059n3.m121846F(i59 + 8);
                                        String string2 = Integer.toString(i13);
                                        C24561s c24561s2 = new C24561s(5);
                                        c24561s2.m71639p(c38059n3);
                                        int iM71632i4 = c24561s2.m71632i(13) * 1000;
                                        c24561s2.m71643t(3);
                                        int i77 = AbstractC33618a.f140305d[c24561s2.m71632i(2)];
                                        c24561s2.m71643t(10);
                                        int i78 = AbstractC33618a.f140307f[c24561s2.m71632i(3)];
                                        if (c24561s2.m71632i(1) != 0) {
                                            i78++;
                                        }
                                        c24561s2.m71643t(3);
                                        int iM71632i5 = c24561s2.m71632i(4);
                                        c24561s2.m71643t(1);
                                        if (iM71632i5 > 0) {
                                            c24561s2.m71643t(6);
                                            if (c24561s2.m71632i(1) != 0) {
                                                i78 += 2;
                                            }
                                            c24561s2.m71643t(1);
                                        }
                                        int i79 = i78;
                                        if (c24561s2.m71625b() > 7) {
                                            c24561s2.m71643t(7);
                                            if (c24561s2.m71632i(1) != 0) {
                                                str6 = "audio/eac3-joc";
                                            } else {
                                                str6 = "audio/eac3";
                                            }
                                        } else {
                                            str6 = "audio/eac3";
                                        }
                                        c24561s2.m71626c();
                                        c38059n3.m121846F(c24561s2.m71629f());
                                        C34608o c34608o2 = new C34608o();
                                        c34608o2.f145729a = string2;
                                        c34608o2.f145741m = AbstractC34587d0.m109382o(str6);
                                        c34608o2.f145719C = i79;
                                        c34608o2.f145720D = i77;
                                        c34608o2.f145745q = c34602lM109391b;
                                        c34608o2.f145732d = str;
                                        c34608o2.f145737i = iM71632i4;
                                        c5057p.f21240e = new C34610p(c34608o2);
                                    } else {
                                        listM133257t = listM133257t;
                                        i19 = i19;
                                        if (iM121854g7 == 1684103988) {
                                            c38059n3.m121846F(i59 + 8);
                                            String string3 = Integer.toString(i13);
                                            C24561s c24561s3 = new C24561s(5);
                                            c24561s3.m71639p(c38059n3);
                                            int iM71625b = c24561s3.m71625b();
                                            int iM71632i6 = c24561s3.m71632i(3);
                                            if (iM71632i6 > 1) {
                                                throw ParserException.m5051c("Unsupported AC-4 DSI version: " + iM71632i6);
                                            }
                                            int iM71632i7 = c24561s3.m71632i(7);
                                            int i83 = c24561s3.m71631h() ? 48000 : 44100;
                                            c24561s3.m71643t(4);
                                            int iM71632i8 = c24561s3.m71632i(9);
                                            if (iM71632i7 <= 1) {
                                                i35 = i59;
                                            } else {
                                                if (iM71632i6 == 0) {
                                                    throw ParserException.m5051c("Invalid AC-4 DSI version: " + iM71632i6);
                                                }
                                                if (c24561s3.m71631h()) {
                                                    c24561s3.m71643t(16);
                                                    i35 = i59;
                                                    if (c24561s3.m71631h()) {
                                                        c24561s3.m71643t(128);
                                                    }
                                                } else {
                                                    i35 = i59;
                                                }
                                            }
                                            if (iM71632i6 == 1) {
                                                if (c24561s3.m71625b() < 66) {
                                                    throw ParserException.m5051c("Invalid AC-4 DSI bitrate.");
                                                }
                                                c24561s3.m71643t(66);
                                                c24561s3.m71626c();
                                            }
                                            C11793j c11793j = new C11793j();
                                            c11793j.f38242a = true;
                                            c11793j.f38243b = -1;
                                            c11793j.f38244c = -1;
                                            c11793j.f38245d = true;
                                            c11793j.f38246e = 2;
                                            c11793j.f38247f = 0;
                                            int i84 = 0;
                                            while (true) {
                                                c11793j = c11793j;
                                                if (i84 < iM71632i8) {
                                                    if (iM71632i6 == 0) {
                                                        boolean zM71631h2 = c24561s3.m71631h();
                                                        iM121854g6 = iM121854g6;
                                                        iM71632i = c24561s3.m71632i(5);
                                                        c11793j = c11793j;
                                                        iM71632i2 = c24561s3.m71632i(5);
                                                        i46 = 0;
                                                        z15 = false;
                                                        z16 = zM71631h2;
                                                        i47 = 0;
                                                    } else {
                                                        int i85 = iM71632i8;
                                                        int iM71632i9 = c24561s3.m71632i(8);
                                                        iM121854g6 = iM121854g6;
                                                        int iM71632i10 = c24561s3.m71632i(8);
                                                        int iM71632i11 = iM71632i10 == 255 ? c24561s3.m71632i(16) + iM71632i10 : iM71632i10;
                                                        if (iM71632i9 > 2) {
                                                            c24561s3.m71643t(iM71632i11 * 8);
                                                            i84++;
                                                            iM71632i8 = i85;
                                                            iM121854g6 = iM121854g6;
                                                        } else {
                                                            int iM71625b2 = (iM71625b - c24561s3.m71625b()) / 8;
                                                            iM71632i = c24561s3.m71632i(5);
                                                            z15 = iM71632i == 31;
                                                            i47 = iM71632i11;
                                                            iM71632i2 = iM71632i9;
                                                            i46 = iM71625b2;
                                                            z16 = false;
                                                        }
                                                    }
                                                    i37 = i58;
                                                    if (z16 || z15 || iM71632i != 6) {
                                                        c11793j.f38247f = c24561s3.m71632i(3);
                                                        if (c24561s3.m71631h()) {
                                                            c24561s3.m71643t(5);
                                                        }
                                                        c24561s3.m71643t(2);
                                                        if (iM71632i6 == 1 && (iM71632i2 == 1 || iM71632i2 == 2)) {
                                                            c24561s3.m71643t(2);
                                                        }
                                                        c24561s3.m71643t(5);
                                                        c24561s3.m71643t(10);
                                                        if (iM71632i6 == 1) {
                                                            if (iM71632i2 > 0) {
                                                                c11793j.f38242a = c24561s3.m71631h();
                                                            }
                                                            if (c11793j.f38242a) {
                                                                if (iM71632i2 != 1) {
                                                                    i48 = 2;
                                                                    if (iM71632i2 == 2) {
                                                                        iM71632i3 = c24561s3.m71632i(5);
                                                                        if (iM71632i3 >= 0 && iM71632i3 <= 15) {
                                                                            c11793j.f38243b = iM71632i3;
                                                                        }
                                                                        if (iM71632i3 >= 11 || iM71632i3 > 14) {
                                                                            i48 = 2;
                                                                        } else {
                                                                            c11793j.f38245d = c24561s3.m71631h();
                                                                            i48 = 2;
                                                                            c11793j.f38246e = c24561s3.m71632i(2);
                                                                        }
                                                                    }
                                                                } else {
                                                                    iM71632i3 = c24561s3.m71632i(5);
                                                                    if (iM71632i3 >= 0) {
                                                                        c11793j.f38243b = iM71632i3;
                                                                    }
                                                                    if (iM71632i3 >= 11) {
                                                                        i48 = 2;
                                                                    } else {
                                                                        i48 = 2;
                                                                    }
                                                                }
                                                                c24561s3.m71643t(24);
                                                            } else {
                                                                i48 = 2;
                                                            }
                                                            if (iM71632i2 == 1 || iM71632i2 == i48) {
                                                                if (c24561s3.m71631h() && c24561s3.m71631h()) {
                                                                    c24561s3.m71643t(i48);
                                                                }
                                                                if (c24561s3.m71631h()) {
                                                                    c24561s3.m71642s();
                                                                    int i86 = 8;
                                                                    int iM71632i12 = c24561s3.m71632i(8);
                                                                    int i87 = 0;
                                                                    while (i87 < iM71632i12) {
                                                                        c24561s3.m71643t(i86);
                                                                        i87++;
                                                                        i86 = 8;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!z16 && !z15) {
                                                            c24561s3.m71642s();
                                                            if (iM71632i == 0 || iM71632i == 1 || iM71632i == 2) {
                                                                if (iM71632i2 == 0) {
                                                                    for (int i88 = 0; i88 < 2; i88++) {
                                                                        AbstractC33618a.m106222n(c24561s3, c11793j);
                                                                    }
                                                                } else {
                                                                    for (int i89 = 0; i89 < 2; i89++) {
                                                                        AbstractC33618a.m106223o(c24561s3, c11793j);
                                                                    }
                                                                }
                                                            } else if (iM71632i == 3 || iM71632i == 4) {
                                                                if (iM71632i2 == 0) {
                                                                    for (int i94 = 0; i94 < 3; i94++) {
                                                                        AbstractC33618a.m106222n(c24561s3, c11793j);
                                                                    }
                                                                } else {
                                                                    for (int i95 = 0; i95 < 3; i95++) {
                                                                        AbstractC33618a.m106223o(c24561s3, c11793j);
                                                                    }
                                                                }
                                                            } else if (iM71632i != 5) {
                                                                int iM71632i13 = c24561s3.m71632i(7);
                                                                for (int i96 = 0; i96 < iM71632i13; i96++) {
                                                                    c24561s3.m71643t(8);
                                                                }
                                                            } else if (iM71632i2 == 0) {
                                                                AbstractC33618a.m106222n(c24561s3, c11793j);
                                                            } else {
                                                                int iM71632i14 = c24561s3.m71632i(3);
                                                                for (int i97 = 0; i97 < iM71632i14 + 2; i97++) {
                                                                    AbstractC33618a.m106223o(c24561s3, c11793j);
                                                                }
                                                            }
                                                        } else if (iM71632i2 == 0) {
                                                            AbstractC33618a.m106222n(c24561s3, c11793j);
                                                        } else {
                                                            AbstractC33618a.m106223o(c24561s3, c11793j);
                                                        }
                                                        c24561s3.m71642s();
                                                        zM71631h = c24561s3.m71631h();
                                                    } else {
                                                        iM71632i2 = iM71632i2;
                                                        zM71631h = true;
                                                    }
                                                    if (zM71631h) {
                                                        int iM71632i15 = c24561s3.m71632i(7);
                                                        for (int i98 = 0; i98 < iM71632i15; i98++) {
                                                            c24561s3.m71643t(15);
                                                        }
                                                    }
                                                    if (iM71632i2 <= 0) {
                                                        i38 = 8;
                                                    } else {
                                                        if (c24561s3.m71631h()) {
                                                            if (c24561s3.m71625b() < 66) {
                                                                z17 = false;
                                                            } else {
                                                                c24561s3.m71643t(66);
                                                                z17 = true;
                                                            }
                                                            if (!z17) {
                                                                throw ParserException.m5051c("Can't parse bitrate DSI.");
                                                            }
                                                        }
                                                        if (c24561s3.m71631h()) {
                                                            c24561s3.m71626c();
                                                            c24561s3.m71644u(c24561s3.m71632i(16));
                                                            int iM71632i16 = c24561s3.m71632i(5);
                                                            for (int i99 = 0; i99 < iM71632i16; i99++) {
                                                                c24561s3.m71643t(3);
                                                                c24561s3.m71643t(8);
                                                            }
                                                            i38 = 8;
                                                        } else {
                                                            i38 = 8;
                                                        }
                                                    }
                                                    c24561s3.m71626c();
                                                    if (iM71632i6 == 1) {
                                                        int iM71625b3 = ((iM71625b - c24561s3.m71625b()) / i38) - i46;
                                                        if (i47 < iM71625b3) {
                                                            throw ParserException.m5051c("pres_bytes is smaller than presentation bytes read.");
                                                        }
                                                        c24561s3.m71644u(i47 - iM71625b3);
                                                    }
                                                    if (c11793j.f38242a && c11793j.f38243b == -1) {
                                                        throw ParserException.m5051c("Can't determine channel mode of presentation " + i84);
                                                    }
                                                } else {
                                                    iM121854g6 = iM121854g6;
                                                    i37 = i58;
                                                    i35 = i35;
                                                    iIntValue = iIntValue;
                                                    c11793j = c11793j;
                                                    i38 = 8;
                                                }
                                                if (c11793j.f38242a) {
                                                    int i100 = c11793j.f38243b;
                                                    boolean z24 = c11793j.f38245d;
                                                    int i101 = c11793j.f38246e;
                                                    switch (i100) {
                                                        case 0:
                                                            i45 = 11;
                                                            i44 = 1;
                                                            break;
                                                        case 1:
                                                            i45 = 11;
                                                            i44 = 2;
                                                            break;
                                                        case 2:
                                                            i45 = 11;
                                                            i44 = 3;
                                                            break;
                                                        case 3:
                                                            i45 = 11;
                                                            i44 = 5;
                                                            break;
                                                        case 4:
                                                            i45 = 11;
                                                            i44 = 6;
                                                            break;
                                                        case 5:
                                                        case 7:
                                                        case 9:
                                                            i45 = 11;
                                                            i44 = 7;
                                                            break;
                                                        case 6:
                                                        case 8:
                                                        case 10:
                                                            i44 = i38;
                                                            i45 = 11;
                                                            break;
                                                        case 11:
                                                            i45 = 11;
                                                            i44 = 11;
                                                            break;
                                                        case 12:
                                                            i45 = 11;
                                                            i44 = 12;
                                                            break;
                                                        case 13:
                                                            i45 = 11;
                                                            i44 = 13;
                                                            break;
                                                        case 14:
                                                            i45 = 11;
                                                            i44 = 14;
                                                            break;
                                                        case 15:
                                                            i45 = 11;
                                                            i44 = 24;
                                                            break;
                                                        default:
                                                            i45 = 11;
                                                            i44 = -1;
                                                            break;
                                                    }
                                                    if (i100 == i45 || i100 == 12 || i100 == 13 || i100 == 14) {
                                                        if (!z24) {
                                                            i44 -= 2;
                                                        }
                                                        if (i101 == 0) {
                                                            i44 -= 4;
                                                        } else if (i101 == 1) {
                                                            i44 -= 2;
                                                        }
                                                    }
                                                } else {
                                                    i39 = c11793j.f38244c + 1;
                                                    if (c11793j.f38247f == 4) {
                                                        i44 = i39 == 17 ? 21 : i39;
                                                    }
                                                    if (i39 > 0) {
                                                        throw ParserException.m5051c("Can't determine channel count of presentation.");
                                                    }
                                                    C34608o c34608o3 = new C34608o();
                                                    c34608o3.f145729a = string3;
                                                    c34608o3.f145741m = AbstractC34587d0.m109382o("audio/ac4");
                                                    c34608o3.f145719C = i39;
                                                    c34608o3.f145720D = i83;
                                                    c34608o3.f145745q = c34602lM109391b;
                                                    c34608o3.f145732d = str;
                                                    c5057p.f21240e = new C34610p(c34608o3);
                                                    i58 = i37;
                                                    i36 = iIntValue;
                                                    iIntValue = i36;
                                                    i58 = i58;
                                                    str5 = str8;
                                                    iM121854g6 = iM121854g6;
                                                    i59 = i35;
                                                }
                                                i39 = i44;
                                                if (i39 > 0) {
                                                    throw ParserException.m5051c("Can't determine channel count of presentation.");
                                                }
                                                C34608o c34608o4 = new C34608o();
                                                c34608o4.f145729a = string3;
                                                c34608o4.f145741m = AbstractC34587d0.m109382o("audio/ac4");
                                                c34608o4.f145719C = i39;
                                                c34608o4.f145720D = i83;
                                                c34608o4.f145745q = c34602lM109391b;
                                                c34608o4.f145732d = str;
                                                c5057p.f21240e = new C34610p(c34608o4);
                                                i58 = i37;
                                                i36 = iIntValue;
                                                iIntValue = i36;
                                                i58 = i58;
                                                str5 = str8;
                                                iM121854g6 = iM121854g6;
                                                i59 = i35;
                                            }
                                        } else {
                                            str8 = str8;
                                            iM121854g6 = iM121854g6;
                                            int i102 = i58;
                                            iIntValue = iIntValue;
                                            i35 = i59;
                                            if (iM121854g7 != 1684892784) {
                                                if (iM121854g7 == 1684305011 || iM121854g7 == 1969517683) {
                                                    C34608o c34608o5 = new C34608o();
                                                    c34608o5.f145729a = Integer.toString(i13);
                                                    c34608o5.f145741m = AbstractC34587d0.m109382o(str10);
                                                    i36 = iIntValue;
                                                    c34608o5.f145719C = i36;
                                                    i58 = i102;
                                                    c34608o5.f145720D = i58;
                                                    c34608o5.f145745q = c34602lM109391b;
                                                    c34608o5.f145732d = str;
                                                    c5057p.f21240e = new C34610p(c34608o5);
                                                } else if (iM121854g7 == 1682927731) {
                                                    int i103 = iM121854g6 - 8;
                                                    byte[] bArr8 = f105203a;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr8, bArr8.length + i103);
                                                    c38059n3.m121846F(i35 + 8);
                                                    c38059n3.m121852e(bArrCopyOf, bArr8.length, i103);
                                                    listM133257t = AbstractC33618a.m106209a(bArrCopyOf);
                                                    iM121854g = iM121854g;
                                                    str10 = str10;
                                                    str11 = str11;
                                                    str5 = str8;
                                                    iM121854g6 = iM121854g6;
                                                    i59 = i35;
                                                    i58 = i102;
                                                } else {
                                                    if (iM121854g7 == 1684425825) {
                                                        byte[] bArr9 = new byte[iM121854g6 - 8];
                                                        bArr9[0] = 102;
                                                        bArr9[1] = 76;
                                                        bArr9[2] = 97;
                                                        bArr9[3] = 67;
                                                        c38059n3.m121846F(i35 + 12);
                                                        c38059n3.m121852e(bArr9, 4, iM121854g6 - 12);
                                                        c41060w0M133256r = AbstractC41023g0.m133256r(bArr9);
                                                    } else {
                                                        if (iM121854g7 == 1634492771) {
                                                            int i104 = iM121854g6 - 12;
                                                            byte[] bArr10 = new byte[i104];
                                                            c38059n3.m121846F(i35 + 12);
                                                            c38059n3.m121852e(bArr10, 0, i104);
                                                            byte[] bArr11 = AbstractC38047b.f162977a;
                                                            C38059n c38059n4 = new C38059n(bArr10);
                                                            c38059n4.m121846F(9);
                                                            int iM121867t7 = c38059n4.m121867t();
                                                            c38059n4.m121846F(20);
                                                            Pair pairCreate = Pair.create(Integer.valueOf(c38059n4.m121871x()), Integer.valueOf(iM121867t7));
                                                            int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                                            iIntValue = ((Integer) pairCreate.second).intValue();
                                                            i58 = iIntValue2;
                                                            listM133257t = AbstractC41023g0.m133256r(bArr10);
                                                        } else if (iM121854g7 == 1767990114) {
                                                            c38059n3.m121846F(i35 + 9);
                                                            long j13 = 0;
                                                            int i105 = 0;
                                                            while (i105 < 9) {
                                                                if (c38059n3.f163018b == c38059n3.f163019c) {
                                                                    throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                                }
                                                                long jM121867t = c38059n3.m121867t();
                                                                long j14 = j13 | ((jM121867t & 127) << (i105 * 7));
                                                                if ((jM121867t & 128) == 0) {
                                                                    j13 = j14;
                                                                    int iM114016k = AbstractC35903f.m114016k(j13);
                                                                    byte[] bArr12 = new byte[iM114016k];
                                                                    c38059n3.m121852e(bArr12, 0, iM114016k);
                                                                    c41060w0M133256r = AbstractC41023g0.m133256r(bArr12);
                                                                } else {
                                                                    i105++;
                                                                    j13 = j14;
                                                                }
                                                            }
                                                            int iM114016k2 = AbstractC35903f.m114016k(j13);
                                                            byte[] bArr13 = new byte[iM114016k2];
                                                            c38059n3.m121852e(bArr13, 0, iM114016k2);
                                                            c41060w0M133256r = AbstractC41023g0.m133256r(bArr13);
                                                        } else {
                                                            i58 = i102;
                                                            i36 = iIntValue;
                                                        }
                                                        str5 = str8;
                                                        iM121854g6 = iM121854g6;
                                                        i59 = i35;
                                                    }
                                                    listM133257t = c41060w0M133256r;
                                                    str5 = str8;
                                                    iM121854g6 = iM121854g6;
                                                    i59 = i35;
                                                    i58 = i102;
                                                }
                                                iIntValue = i36;
                                                i58 = i58;
                                                str5 = str8;
                                                iM121854g6 = iM121854g6;
                                                i59 = i35;
                                            } else {
                                                if (iM121854g <= 0) {
                                                    throw ParserException.m5049a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM121854g);
                                                }
                                                i58 = iM121854g;
                                                iM121854g = i58;
                                                str10 = str10;
                                                str11 = str11;
                                                str5 = str8;
                                                iM121854g6 = iM121854g6;
                                                i59 = i35;
                                                iIntValue = 2;
                                            }
                                        }
                                    }
                                    i36 = iIntValue;
                                    i35 = i59;
                                    iIntValue = i36;
                                    i58 = i58;
                                    str5 = str8;
                                    iM121854g6 = iM121854g6;
                                    i59 = i35;
                                }
                                i57 = i59 + iM121854g6;
                                str8 = str5;
                                iM121854g = iM121854g;
                                iM121854g4 = i64;
                                str9 = str9;
                                listM133257t = listM133257t;
                                i19 = i19;
                                iIntValue = iIntValue;
                                c38059n3 = c38059n;
                            }
                            str5 = str8;
                            i57 = i59 + iM121854g6;
                            str8 = str5;
                            iM121854g = iM121854g;
                            iM121854g4 = i64;
                            str9 = str9;
                            listM133257t = listM133257t;
                            i19 = i19;
                            iIntValue = iIntValue;
                            c38059n3 = c38059n;
                        }
                        String str13 = str11;
                        i15 = iM121854g4;
                        String str14 = str10;
                        List list = listM133257t;
                        int i106 = i58;
                        int i107 = i19;
                        int i108 = iIntValue;
                        if (((C34610p) c5057p.f21240e) == null && str14 != null) {
                            C34608o c34608o6 = new C34608o();
                            c34608o6.f145729a = Integer.toString(i13);
                            c34608o6.f145741m = AbstractC34587d0.m109382o(str14);
                            c34608o6.f145738j = str13;
                            c34608o6.f145719C = i108;
                            c34608o6.f145720D = i106;
                            c34608o6.f145721E = i107;
                            c34608o6.f145744p = list;
                            c34608o6.f145745q = c34602lM109391b;
                            c34608o6.f145732d = str;
                            if (c0902h != null) {
                                C0902h c0902h2 = c0902h;
                                c34608o6.f145736h = AbstractC35903f.m113994L(c0902h2.f3295x);
                                c34608o6.f145737i = AbstractC35903f.m113994L(c0902h2.f3296y);
                            } else {
                                C26488a c26488a2 = c26488a;
                                if (c26488a2 != null) {
                                    c34608o6.f145736h = AbstractC35903f.m113994L(c26488a2.f105201a);
                                    c34608o6.f145737i = AbstractC35903f.m113994L(c26488a2.f105202b);
                                }
                            }
                            c5057p.f21240e = new C34610p(c34608o6);
                        }
                        c38059n3 = c38059n;
                        i55 = i24;
                    } else {
                        if (iM121854g5 == 1414810956 || iM121854g5 == 1954034535 || iM121854g5 == 2004251764 || iM121854g5 == 1937010800 || iM121854g5 == 1664495672) {
                            c38059n3.m121846F(i55 + 16);
                            String str15 = "application/ttml+xml";
                            if (iM121854g5 == 1414810956) {
                                j7 = Long.MAX_VALUE;
                                c41060w0M133256r2 = null;
                            } else if (iM121854g5 == 1954034535) {
                                int i109 = iM121854g4 - 16;
                                byte[] bArr14 = new byte[i109];
                                c38059n3.m121852e(bArr14, 0, i109);
                                str15 = "application/x-quicktime-tx3g";
                                c41060w0M133256r2 = AbstractC41023g0.m133256r(bArr14);
                                j7 = Long.MAX_VALUE;
                            } else {
                                if (iM121854g5 == 2004251764) {
                                    str15 = "application/x-mp4-vtt";
                                } else {
                                    if (iM121854g5 == 1937010800) {
                                        j7 = 0;
                                    } else {
                                        if (iM121854g5 != 1664495672) {
                                            throw new IllegalStateException();
                                        }
                                        c5057p.f21238c = 1;
                                        str15 = "application/x-mp4-cea-608";
                                    }
                                    c41060w0M133256r2 = null;
                                }
                                j7 = Long.MAX_VALUE;
                                c41060w0M133256r2 = null;
                            }
                            C34608o c34608o7 = new C34608o();
                            c34608o7.f145729a = Integer.toString(i13);
                            c34608o7.f145741m = AbstractC34587d0.m109382o(str15);
                            c34608o7.f145732d = str;
                            c34608o7.f145746r = j7;
                            c34608o7.f145744p = c41060w0M133256r2;
                            c5057p.f21240e = new C34610p(c34608o7);
                        } else if (iM121854g5 == 1835365492) {
                            c38059n3.m121846F(i55 + 16);
                            if (iM121854g5 == 1835365492) {
                                c38059n3.m121862o();
                                String strM121862o = c38059n3.m121862o();
                                if (strM121862o != null) {
                                    C34608o c34608o8 = new C34608o();
                                    c34608o8.f145729a = Integer.toString(i13);
                                    c34608o8.f145741m = AbstractC34587d0.m109382o(strM121862o);
                                    c5057p.f21240e = new C34610p(c34608o8);
                                }
                            }
                        } else if (iM121854g5 == 1667329389) {
                            C34608o c34608o9 = new C34608o();
                            c34608o9.f145729a = Integer.toString(i13);
                            c34608o9.f145741m = AbstractC34587d0.m109382o("application/x-camera-motion");
                            c5057p.f21240e = new C34610p(c34608o9);
                        }
                        i15 = iM121854g4;
                        i16 = i54;
                        iM121854g3 = iM121854g3;
                    }
                }
                c38059n3.m121846F(i55 + i15);
                i54 = i16 + 1;
                iM121854g3 = iM121854g3;
            }
            m78541h(c38059n3, iM121854g5, i55, iM121854g4, i13, str, i14, c34602l, c5057p, i54);
            i15 = iM121854g4;
            i16 = i54;
            c38059n3.m121846F(i55 + i15);
            i54 = i16 + 1;
            iM121854g3 = iM121854g3;
        }
        return c5057p;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ca A[EDGE_INSN: B:101:0x01ca->B:104:0x01e3 BREAK  A[LOOP:17: B:91:0x01a5->B:102:0x01d8]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01d8 A[LOOP:17: B:91:0x01a5->B:102:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x0228  */
    /* JADX WARN: Code duplicated, block: B:141:0x02be  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:204:0x045b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0530  */
    /* JADX WARN: Code duplicated, block: B:228:0x0534  */
    /* JADX WARN: Code duplicated, block: B:230:0x053a A[LOOP:13: B:227:0x0532->B:230:0x053a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x056d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x056f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0573 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x0591  */
    /* JADX WARN: Code duplicated, block: B:246:0x0599  */
    /* JADX WARN: Code duplicated, block: B:247:0x059b  */
    /* JADX WARN: Code duplicated, block: B:250:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:252:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:255:0x05b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x05e8 A[DONT_INVERT, LOOP:15: B:261:0x05e8->B:265:0x05f2, LOOP_START, PHI: r17
      0x05e8: PHI (r17v8 int) = (r17v6 int), (r17v9 int) binds: [B:260:0x05e6, B:265:0x05f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:262:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f2 A[LOOP:15: B:261:0x05e8->B:265:0x05f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:266:0x05f8 A[EDGE_INSN: B:266:0x05f8->B:267:0x05f9 BREAK  A[LOOP:15: B:261:0x05e8->B:265:0x05f2]] */
    /* JADX WARN: Code duplicated, block: B:268:0x05fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0609  */
    /* JADX WARN: Code duplicated, block: B:277:0x0635  */
    /* JADX WARN: Code duplicated, block: B:278:0x0638  */
    /* JADX WARN: Code duplicated, block: B:283:0x0656  */
    /* JADX WARN: Code duplicated, block: B:290:0x0692  */
    /* JADX WARN: Code duplicated, block: B:292:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:320:0x075c  */
    /* JADX WARN: Code duplicated, block: B:323:0x0766  */
    /* JADX WARN: Code duplicated, block: B:325:0x076c  */
    /* JADX WARN: Code duplicated, block: B:328:0x0776 A[LOOP:5: B:326:0x0773->B:328:0x0776, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:330:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:331:0x07ab A[PHI: r5
      0x07ab: PHI (r5v7 int) = (r5v6 int), (r5v24 int) binds: [B:322:0x0764, B:330:0x07aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:333:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:334:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:338:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:340:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:343:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:347:0x080d  */
    /* JADX WARN: Code duplicated, block: B:350:0x0815  */
    /* JADX WARN: Code duplicated, block: B:355:0x0825  */
    /* JADX WARN: Code duplicated, block: B:359:0x0834  */
    /* JADX WARN: Code duplicated, block: B:361:0x083c A[LOOP:9: B:357:0x082b->B:361:0x083c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:364:0x0848  */
    /* JADX WARN: Code duplicated, block: B:365:0x084a  */
    /* JADX WARN: Code duplicated, block: B:367:0x0853  */
    /* JADX WARN: Code duplicated, block: B:371:0x086c  */
    /* JADX WARN: Code duplicated, block: B:372:0x086e  */
    /* JADX WARN: Code duplicated, block: B:375:0x0874  */
    /* JADX WARN: Code duplicated, block: B:376:0x0877  */
    /* JADX WARN: Code duplicated, block: B:378:0x087a  */
    /* JADX WARN: Code duplicated, block: B:379:0x087d  */
    /* JADX WARN: Code duplicated, block: B:381:0x0880  */
    /* JADX WARN: Code duplicated, block: B:383:0x0884  */
    /* JADX WARN: Code duplicated, block: B:384:0x0887  */
    /* JADX WARN: Code duplicated, block: B:388:0x0895  */
    /* JADX WARN: Code duplicated, block: B:390:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:393:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:395:0x08da  */
    /* JADX WARN: Code duplicated, block: B:398:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:405:0x0914  */
    /* JADX WARN: Code duplicated, block: B:416:0x0947 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x080b A[ADDED_TO_REGION, EDGE_INSN: B:430:0x080b->B:346:0x080b BREAK  A[LOOP:7: B:341:0x07fb->B:345:0x0805], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0822 A[ADDED_TO_REGION, EDGE_INSN: B:432:0x0822->B:353:0x0822 BREAK  A[LOOP:8: B:348:0x080f->B:352:0x081d], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x083f A[EDGE_INSN: B:434:0x083f->B:362:0x083f BREAK  A[LOOP:9: B:357:0x082b->B:361:0x083c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x083f A[EDGE_INSN: B:435:0x083f->B:362:0x083f BREAK  A[LOOP:9: B:357:0x082b->B:361:0x083c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x08e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x05c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x054b A[EDGE_INSN: B:447:0x054b->B:231:0x054b BREAK  A[LOOP:13: B:227:0x0532->B:230:0x053a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x05f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    /* JADX INFO: renamed from: g */
    public static ArrayList m78540g(C39308c c39308c, C33655x c33655x, long j7, C34602l c34602l, boolean z4, boolean z13, InterfaceC39718e interfaceC39718e) {
        int i13;
        long jM121869v;
        int i14;
        int i15;
        int i16;
        long j13;
        long j14;
        long j15;
        long jM121903Q;
        C38059n c38059n;
        int iM78536c;
        int i17;
        long jM121869v2;
        int i18;
        int i19;
        int i24;
        ArrayList arrayList;
        long jM121903Q2;
        char[] cArr;
        int i25;
        String str;
        C39309d c39309dM125273p;
        C5057p c5057pM78539f;
        long j16;
        long[] jArr;
        long[] jArr2;
        C34610p c34610p;
        C34610p c34610p2;
        C26502o c26502o;
        C39307b c39307b;
        C34585c0 c34585c0;
        C34585c0 c34585c1;
        C39308c c39308cM125272o;
        Pair pairCreate;
        char c3;
        long jM121872y;
        long j17;
        InterfaceC26489b c12185e;
        boolean z14;
        int iM121871x;
        int iM121871x2;
        int iM121871x3;
        int iMo15740b;
        C38059n c38059n2;
        long[] jArr3;
        int[] iArrCopyOf;
        long[] jArrCopyOf;
        int[] iArrCopyOf2;
        InterfaceC26489b interfaceC26489b;
        int iM121871x4;
        int i26;
        int iM121854g;
        int i27;
        int iM121871x5;
        int i28;
        C38059n c38059n3;
        long j18;
        long j19;
        long j24;
        int i29;
        int i34;
        int iM121854g2;
        int i35;
        int i36;
        int i37;
        long[] jArr4;
        int[] iArr;
        int i38;
        long j25;
        boolean z15;
        boolean z16;
        String str2;
        long[] jArr5;
        int[] iArr2;
        int i39;
        long j26;
        boolean zM33784a;
        int i44;
        int iMo15739a;
        int i45;
        int iM121871x6;
        long[] jArr6;
        int[] iArr3;
        long j27;
        long j28;
        C34610p c34610p3;
        int i46;
        long[] jArr7;
        long[] jArr8;
        long jM121903Q3;
        long[] jArr9;
        C34610p c34610p4;
        int i47;
        int i48;
        int[] iArr4;
        boolean z17;
        int[] iArr5;
        int[] iArr6;
        int i49;
        int i54;
        boolean z18;
        int i55;
        int[] iArr7;
        int[] iArr8;
        boolean z19;
        boolean z24;
        long[] jArr10;
        int[] iArr9;
        int[] iArr10;
        long[] jArr11;
        int i56;
        boolean z25;
        int i57;
        long j29;
        int i58;
        C26504q c26504q;
        long j34;
        boolean z26;
        int i59;
        int i64;
        long[] jArr12;
        long jM121903Q4;
        int[] iArr11;
        int[] iArr12;
        long j35;
        int[] iArr13;
        int i65;
        boolean z27;
        long j36;
        int i66;
        int i67;
        int i68;
        boolean z28;
        int i69;
        int i74;
        int i75;
        long j37;
        int i76;
        C26504q c26504q2;
        long jM121903Q5;
        C39308c c39308c2 = c39308c;
        ArrayList arrayList2 = c39308c2.f169110E;
        ArrayList arrayList3 = new ArrayList();
        int i77 = 0;
        while (i77 < arrayList2.size()) {
            C39308c c39308c3 = (C39308c) arrayList2.get(i77);
            if (c39308c3.f2052x != 1953653099) {
                arrayList = arrayList2;
                arrayList3 = arrayList3;
                i77 = i77;
            } else {
                C39309d c39309dM125273p2 = c39308c2.m125273p(1836476516);
                c39309dM125273p2.getClass();
                C39308c c39308cM125272o2 = c39308c3.m125272o(1835297121);
                c39308cM125272o2.getClass();
                C39309d c39309dM125273p3 = c39308cM125272o2.m125273p(1751411826);
                c39309dM125273p3.getClass();
                C38059n c38059n4 = c39309dM125273p3.f169113y;
                c38059n4.m121846F(16);
                int iM121854g3 = c38059n4.m121854g();
                if (iM121854g3 == 1936684398) {
                    i13 = 1;
                } else if (iM121854g3 == 1986618469) {
                    i13 = 2;
                } else if (iM121854g3 == 1952807028 || iM121854g3 == 1935832172 || iM121854g3 == 1937072756 || iM121854g3 == 1668047728) {
                    i13 = 3;
                } else {
                    i13 = iM121854g3 == 1835365473 ? 5 : -1;
                }
                if (i13 == -1) {
                    arrayList = arrayList2;
                    c26502o = null;
                } else {
                    int i78 = 2;
                    C39309d c39309dM125273p4 = c39308c3.m125273p(1953196132);
                    c39309dM125273p4.getClass();
                    C38059n c38059n5 = c39309dM125273p4.f169113y;
                    int i79 = 1;
                    c38059n5.m121846F(8);
                    int iM78536c2 = m78536c(c38059n5.m121854g());
                    c38059n5.m121847G(iM78536c2 == 0 ? 8 : 16);
                    int iM121854g4 = c38059n5.m121854g();
                    c38059n5.m121847G(4);
                    int i83 = c38059n5.f163018b;
                    int i84 = iM78536c2 == 0 ? 4 : 8;
                    int i85 = 0;
                    while (true) {
                        if (i85 >= i84) {
                            c38059n5.m121847G(i84);
                        } else {
                            if (c38059n5.f163017a[i83 + i85] != -1) {
                                jM121869v = iM78536c2 == 0 ? c38059n5.m121869v() : c38059n5.m121872y();
                                if (jM121869v != 0) {
                                    break;
                                }
                                break;
                            }
                            i85++;
                        }
                        jM121869v = -9223372036854775807L;
                        break;
                    }
                    c38059n5.m121847G(10);
                    int iM121873z = c38059n5.m121873z();
                    c38059n5.m121847G(4);
                    int iM121854g5 = c38059n5.m121854g();
                    int iM121854g6 = c38059n5.m121854g();
                    c38059n5.m121847G(4);
                    int iM121854g7 = c38059n5.m121854g();
                    int iM121854g8 = c38059n5.m121854g();
                    if (iM121854g5 == 0 && iM121854g6 == 65536) {
                        i14 = -65536;
                        if (iM121854g7 == -65536 && iM121854g8 == 0) {
                            i16 = 90;
                        }
                        i15 = i16;
                        if (j7 == r21) {
                            j13 = jM121869v;
                        } else {
                            j13 = j7;
                        }
                        j14 = m78537d(c39309dM125273p2.f169113y).f169118c;
                        if (j13 == r21) {
                            j15 = j14;
                            jM121903Q = -9223372036854775807L;
                        } else {
                            int i86 = AbstractC38065t.f163031a;
                            j15 = j14;
                            jM121903Q = AbstractC38065t.m121903Q(j13, 1000000L, j15, RoundingMode.DOWN);
                        }
                        C39308c c39308cM125272o3 = c39308cM125272o2.m125272o(1835626086);
                        c39308cM125272o3.getClass();
                        C39308c c39308cM125272o4 = c39308cM125272o3.m125272o(1937007212);
                        c39308cM125272o4.getClass();
                        C39309d c39309dM125273p5 = c39308cM125272o2.m125273p(1835296868);
                        c39309dM125273p5.getClass();
                        c38059n = c39309dM125273p5.f169113y;
                        c38059n.m121846F(8);
                        iM78536c = m78536c(c38059n.m121854g());
                        if (iM78536c == 0) {
                            i17 = 8;
                        } else {
                            i17 = 16;
                        }
                        c38059n.m121847G(i17);
                        jM121869v2 = c38059n.m121869v();
                        i18 = c38059n.f163018b;
                        if (iM78536c == 0) {
                            i19 = 4;
                        } else {
                            i19 = 8;
                        }
                        i24 = 0;
                        while (true) {
                            if (i24 < i19) {
                                arrayList = arrayList2;
                                if (c38059n.f163017a[i18 + i24] != -1) {
                                    if (iM78536c == 0) {
                                        jM121872y = c38059n.m121869v();
                                    } else {
                                        jM121872y = c38059n.m121872y();
                                    }
                                    j17 = jM121872y;
                                    if (j17 == 0) {
                                        int i87 = AbstractC38065t.f163031a;
                                        jM121903Q2 = AbstractC38065t.m121903Q(j17, 1000000L, jM121869v2, RoundingMode.DOWN);
                                        break;
                                    }
                                    break;
                                }
                                i24++;
                                arrayList2 = arrayList;
                            } else {
                                arrayList = arrayList2;
                                c38059n.m121847G(i19);
                            }
                            jM121903Q2 = -9223372036854775807L;
                            break;
                        }
                        int iM121873z2 = c38059n.m121873z();
                        cArr = new char[]{(char) (((iM121873z2 >> 10) & 31) + 96), (char) (((iM121873z2 >> 5) & 31) + 96), (char) ((iM121873z2 & 31) + 96)};
                        i25 = 0;
                        while (true) {
                            if (i25 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c3 = cArr[i25];
                            if (c3 >= 'a' || c3 > 'z') {
                                str = null;
                                break;
                            }
                            i25++;
                        }
                        c39309dM125273p = c39308cM125272o4.m125273p(1937011556);
                        if (c39309dM125273p != null) {
                            throw ParserException.m5049a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        c5057pM78539f = m78539f(c39309dM125273p.f169113y, iM121854g4, i15, str, c34602l, z13);
                        if (!z4 || (c39308cM125272o = c39308c3.m125272o(1701082227)) == null) {
                            j16 = jM121903Q;
                        } else {
                            C39309d c39309dM125273p6 = c39308cM125272o.m125273p(1701606260);
                            if (c39309dM125273p6 == null) {
                                j16 = jM121903Q;
                                pairCreate = null;
                            } else {
                                C38059n c38059n6 = c39309dM125273p6.f169113y;
                                c38059n6.m121846F(8);
                                int iM78536c3 = m78536c(c38059n6.m121854g());
                                int iM121871x7 = c38059n6.m121871x();
                                long[] jArr13 = new long[iM121871x7];
                                long[] jArr14 = new long[iM121871x7];
                                int i88 = 0;
                                while (i88 < iM121871x7) {
                                    int i89 = i79;
                                    jArr13[i88] = iM78536c3 == i89 ? c38059n6.m121872y() : c38059n6.m121869v();
                                    jArr14[i88] = iM78536c3 == i89 ? c38059n6.m121861n() : c38059n6.m121854g();
                                    if (c38059n6.m121864q() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    c38059n6.m121847G(i78);
                                    i88++;
                                    jM121903Q = jM121903Q;
                                    i78 = 2;
                                    i79 = 1;
                                }
                                j16 = jM121903Q;
                                pairCreate = Pair.create(jArr13, jArr14);
                            }
                            if (pairCreate != null) {
                                long[] jArr15 = (long[]) pairCreate.first;
                                jArr2 = (long[]) pairCreate.second;
                                jArr = jArr15;
                            }
                            c34610p = (C34610p) c5057pM78539f.f21240e;
                            if (c34610p == null) {
                                c26502o = null;
                            } else {
                                if (iM121873z != 0) {
                                    c39307b = new C39307b(iM121873z);
                                    C34608o c34608oM109410a = c34610p.m109410a();
                                    c34585c0 = ((C34610p) c5057pM78539f.f21240e).f145781l;
                                    if (c34585c0 != null) {
                                        c34585c1 = c34585c0.m109365a(c39307b);
                                    } else {
                                        c34585c1 = new C34585c0(c39307b);
                                    }
                                    c34608oM109410a.f145739k = c34585c1;
                                    c34610p2 = new C34610p(c34608oM109410a);
                                } else {
                                    c34610p2 = c34610p;
                                }
                                c26502o = new C26502o(iM121854g4, i13, jM121869v2, j15, j16, jM121903Q2, c34610p2, c5057pM78539f.f21238c, (C26503p[]) c5057pM78539f.f21239d, c5057pM78539f.f21237b, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        c34610p = (C34610p) c5057pM78539f.f21240e;
                        if (c34610p == null) {
                            c26502o = null;
                        } else {
                            if (iM121873z != 0) {
                                c39307b = new C39307b(iM121873z);
                                C34608o c34608oM109410a2 = c34610p.m109410a();
                                c34585c0 = ((C34610p) c5057pM78539f.f21240e).f145781l;
                                if (c34585c0 != null) {
                                    c34585c1 = c34585c0.m109365a(c39307b);
                                } else {
                                    c34585c1 = new C34585c0(c39307b);
                                }
                                c34608oM109410a2.f145739k = c34585c1;
                                c34610p2 = new C34610p(c34608oM109410a2);
                            } else {
                                c34610p2 = c34610p;
                            }
                            c26502o = new C26502o(iM121854g4, i13, jM121869v2, j15, j16, jM121903Q2, c34610p2, c5057pM78539f.f21238c, (C26503p[]) c5057pM78539f.f21239d, c5057pM78539f.f21237b, jArr, jArr2);
                        }
                    } else {
                        i14 = -65536;
                    }
                    if (iM121854g5 == 0 && iM121854g6 == i14) {
                        if (iM121854g7 == 65536 && iM121854g8 == 0) {
                            i16 = 270;
                        } else {
                            i14 = -65536;
                            if (iM121854g5 != i14) {
                            }
                            i15 = 0;
                        }
                        i15 = i16;
                    } else if (iM121854g5 != i14 && iM121854g6 == 0 && iM121854g7 == 0 && iM121854g8 == i14) {
                        i16 = 180;
                        i15 = i16;
                    } else {
                        i15 = 0;
                    }
                    if (j7 == r21) {
                        j13 = jM121869v;
                    } else {
                        j13 = j7;
                    }
                    j14 = m78537d(c39309dM125273p2.f169113y).f169118c;
                    if (j13 == r21) {
                        j15 = j14;
                        jM121903Q = -9223372036854775807L;
                    } else {
                        int i810 = AbstractC38065t.f163031a;
                        j15 = j14;
                        jM121903Q = AbstractC38065t.m121903Q(j13, 1000000L, j15, RoundingMode.DOWN);
                    }
                    C39308c c39308cM125272o5 = c39308cM125272o2.m125272o(1835626086);
                    c39308cM125272o5.getClass();
                    C39308c c39308cM125272o6 = c39308cM125272o5.m125272o(1937007212);
                    c39308cM125272o6.getClass();
                    C39309d c39309dM125273p7 = c39308cM125272o2.m125273p(1835296868);
                    c39309dM125273p7.getClass();
                    c38059n = c39309dM125273p7.f169113y;
                    c38059n.m121846F(8);
                    iM78536c = m78536c(c38059n.m121854g());
                    if (iM78536c == 0) {
                        i17 = 8;
                    } else {
                        i17 = 16;
                    }
                    c38059n.m121847G(i17);
                    jM121869v2 = c38059n.m121869v();
                    i18 = c38059n.f163018b;
                    if (iM78536c == 0) {
                        i19 = 4;
                    } else {
                        i19 = 8;
                    }
                    i24 = 0;
                    while (true) {
                        if (i24 < i19) {
                            arrayList = arrayList2;
                            if (c38059n.f163017a[i18 + i24] != -1) {
                                if (iM78536c == 0) {
                                    jM121872y = c38059n.m121869v();
                                } else {
                                    jM121872y = c38059n.m121872y();
                                }
                                j17 = jM121872y;
                                if (j17 == 0) {
                                    int i811 = AbstractC38065t.f163031a;
                                    jM121903Q2 = AbstractC38065t.m121903Q(j17, 1000000L, jM121869v2, RoundingMode.DOWN);
                                    break;
                                }
                                break;
                            }
                            i24++;
                            arrayList2 = arrayList;
                        } else {
                            arrayList = arrayList2;
                            c38059n.m121847G(i19);
                        }
                        jM121903Q2 = -9223372036854775807L;
                        break;
                    }
                    int iM121873z3 = c38059n.m121873z();
                    cArr = new char[]{(char) (((iM121873z3 >> 10) & 31) + 96), (char) (((iM121873z3 >> 5) & 31) + 96), (char) ((iM121873z3 & 31) + 96)};
                    i25 = 0;
                    while (true) {
                        if (i25 < 3) {
                            c3 = cArr[i25];
                            if (c3 >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i25++;
                    }
                    c39309dM125273p = c39308cM125272o6.m125273p(1937011556);
                    if (c39309dM125273p != null) {
                        throw ParserException.m5049a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    c5057pM78539f = m78539f(c39309dM125273p.f169113y, iM121854g4, i15, str, c34602l, z13);
                    if (z4) {
                        j16 = jM121903Q;
                        jArr = null;
                        jArr2 = null;
                    } else {
                        j16 = jM121903Q;
                        jArr = null;
                        jArr2 = null;
                    }
                    c34610p = (C34610p) c5057pM78539f.f21240e;
                    if (c34610p == null) {
                        c26502o = null;
                    } else {
                        if (iM121873z != 0) {
                            c39307b = new C39307b(iM121873z);
                            C34608o c34608oM109410a3 = c34610p.m109410a();
                            c34585c0 = ((C34610p) c5057pM78539f.f21240e).f145781l;
                            if (c34585c0 != null) {
                                c34585c1 = c34585c0.m109365a(c39307b);
                            } else {
                                c34585c1 = new C34585c0(c39307b);
                            }
                            c34608oM109410a3.f145739k = c34585c1;
                            c34610p2 = new C34610p(c34608oM109410a3);
                        } else {
                            c34610p2 = c34610p;
                        }
                        c26502o = new C26502o(iM121854g4, i13, jM121869v2, j15, j16, jM121903Q2, c34610p2, c5057pM78539f.f21238c, (C26503p[]) c5057pM78539f.f21239d, c5057pM78539f.f21237b, jArr, jArr2);
                    }
                }
                C26502o c26502oM78565a = (C26502o) interfaceC39718e.apply(c26502o);
                if (c26502oM78565a == null) {
                    arrayList3 = arrayList3;
                    i77 = i77;
                } else {
                    C34610p c34610p5 = c26502oM78565a.f105317g;
                    C39308c c39308cM125272o7 = c39308c3.m125272o(1835297121);
                    c39308cM125272o7.getClass();
                    C39308c c39308cM125272o8 = c39308cM125272o7.m125272o(1835626086);
                    c39308cM125272o8.getClass();
                    C39308c c39308cM125272o9 = c39308cM125272o8.m125272o(1937007212);
                    c39308cM125272o9.getClass();
                    C39309d c39309dM125273p8 = c39308cM125272o9.m125273p(1937011578);
                    if (c39309dM125273p8 != null) {
                        c12185e = new C5020n(c39309dM125273p8, c34610p5);
                    } else {
                        C39309d c39309dM125273p9 = c39308cM125272o9.m125273p(1937013298);
                        if (c39309dM125273p9 == null) {
                            throw ParserException.m5049a(null, "Track has no sample table size information");
                        }
                        c12185e = new C12185e(c39309dM125273p9);
                    }
                    int iMo15741c = c12185e.mo15741c();
                    if (iMo15741c == 0) {
                        c26504q = new C26504q(c26502oM78565a, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        i77 = i77;
                    } else {
                        if (c26502oM78565a.f105312b == 2) {
                            long j38 = c26502oM78565a.f105316f;
                            if (j38 > 0) {
                                C34608o c34608oM109410a4 = c34610p5.m109410a();
                                c34608oM109410a4.f145750v = iMo15741c / (j38 / 1000000.0f);
                                c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a4));
                            }
                        }
                        C34610p c34610p6 = c26502oM78565a.f105317g;
                        C39309d c39309dM125273p10 = c39308cM125272o9.m125273p(1937007471);
                        if (c39309dM125273p10 == null) {
                            c39309dM125273p10 = c39308cM125272o9.m125273p(1668232756);
                            c39309dM125273p10.getClass();
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        C38059n c38059n7 = c39309dM125273p10.f169113y;
                        C39309d c39309dM125273p11 = c39308cM125272o9.m125273p(1937011555);
                        c39309dM125273p11.getClass();
                        C38059n c38059n8 = c39309dM125273p11.f169113y;
                        C39309d c39309dM125273p12 = c39308cM125272o9.m125273p(1937011827);
                        c39309dM125273p12.getClass();
                        C38059n c38059n9 = c39309dM125273p12.f169113y;
                        C39309d c39309dM125273p13 = c39308cM125272o9.m125273p(1937011571);
                        C38059n c38059n10 = c39309dM125273p13 != null ? c39309dM125273p13.f169113y : null;
                        C39309d c39309dM125273p14 = c39308cM125272o9.m125273p(1668576371);
                        C38059n c38059n11 = c39309dM125273p14 != null ? c39309dM125273p14.f169113y : null;
                        C12183c c12183c = new C12183c(c38059n8, c38059n7, z14);
                        c38059n9.m121846F(12);
                        int iM121871x8 = c38059n9.m121871x() - 1;
                        int iM121871x9 = c38059n9.m121871x();
                        int iM121871x10 = c38059n9.m121871x();
                        if (c38059n11 != null) {
                            c38059n11.m121846F(12);
                            iM121871x = c38059n11.m121871x();
                        } else {
                            iM121871x = 0;
                        }
                        if (c38059n10 != null) {
                            c38059n10.m121846F(12);
                            iM121871x2 = c38059n10.m121871x();
                            if (iM121871x2 > 0) {
                                iM121871x3 = c38059n10.m121871x() - 1;
                            } else {
                                c38059n10 = null;
                            }
                            iMo15740b = c12185e.mo15740b();
                            c38059n2 = c38059n11;
                            String str3 = c34610p6.f145783n;
                            if (iMo15740b == -1 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iM121871x8 == 0 && iM121871x == 0 && iM121871x2 == 0)) {
                                int i94 = c12183c.f40612b;
                                long[] jArr16 = new long[i94];
                                int[] iArr14 = new int[i94];
                                while (c12183c.m33784a()) {
                                    int i95 = c12183c.f40613c;
                                    jArr16[i95] = c12183c.f40615e;
                                    iArr14[i95] = c12183c.f40614d;
                                }
                                long j39 = iM121871x10;
                                int i96 = DfuBaseService.ERROR_REMOTE_MASK / iMo15740b;
                                int iM121912e = 0;
                                for (int i97 = 0; i97 < i94; i97++) {
                                    iM121912e += AbstractC38065t.m121912e(iArr14[i97], i96);
                                }
                                jArr4 = new long[iM121912e];
                                iArr = new int[iM121912e];
                                long[] jArr17 = new long[iM121912e];
                                int[] iArr15 = new int[iM121912e];
                                int i98 = 0;
                                int i99 = 0;
                                int i100 = 0;
                                int i101 = 0;
                                int i102 = 0;
                                while (i98 < i94) {
                                    int i103 = iArr14[i98];
                                    long j44 = jArr16[i98];
                                    int i104 = i102;
                                    int i105 = i94;
                                    int iMax = i101;
                                    int i106 = i104;
                                    int i107 = i98;
                                    int i108 = i103;
                                    while (i108 > 0) {
                                        int iMin = Math.min(i96, i108);
                                        jArr4[i106] = j44;
                                        int i109 = i108;
                                        int i110 = iMo15740b * iMin;
                                        iArr[i106] = i110;
                                        i100 += i110;
                                        iMax = Math.max(iMax, i110);
                                        long j45 = j39;
                                        jArr17[i106] = ((long) i99) * j45;
                                        iArr15[i106] = 1;
                                        j44 += (long) iArr[i106];
                                        i99 += iMin;
                                        i108 = i109 - iMin;
                                        i106++;
                                        j39 = j45;
                                    }
                                    long j46 = j39;
                                    i98 = i107 + 1;
                                    int i111 = i106;
                                    i101 = iMax;
                                    i94 = i105;
                                    i102 = i111;
                                    j39 = j46;
                                }
                                j25 = ((long) i99) * j39;
                                j26 = i100;
                                iArr2 = iArr15;
                                jArr5 = jArr17;
                                i39 = i101;
                            } else {
                                jArr3 = new long[iMo15741c];
                                iArrCopyOf = new int[iMo15741c];
                                jArrCopyOf = new long[iMo15741c];
                                iArrCopyOf2 = new int[iMo15741c];
                                int i112 = iM121871x;
                                interfaceC26489b = c12185e;
                                iM121871x4 = iM121871x9;
                                i26 = iM121871x2;
                                iM121854g = iM121871x10;
                                i27 = iM121871x8;
                                iM121871x5 = iM121871x3;
                                i28 = i112;
                                c38059n3 = c38059n10;
                                j18 = 0;
                                j19 = 0;
                                j24 = 0;
                                i29 = 0;
                                i34 = 0;
                                iM121854g2 = 0;
                                i35 = 0;
                                i36 = 0;
                                while (true) {
                                    if (i34 >= iMo15741c) {
                                        i37 = iM121871x4;
                                        jArr4 = jArr3;
                                        iMo15741c = iMo15741c;
                                        break;
                                    }
                                    zM33784a = true;
                                    while (i35 == 0) {
                                        zM33784a = c12183c.m33784a();
                                        if (!zM33784a) {
                                            break;
                                        }
                                        j24 = c12183c.f40615e;
                                        i35 = c12183c.f40614d;
                                        iMo15741c = iMo15741c;
                                        iM121871x4 = iM121871x4;
                                    }
                                    i44 = iMo15741c;
                                    i37 = iM121871x4;
                                    if (!zM33784a) {
                                        AbstractC38046a.m121826u("BoxParsers", "Unexpected end of chunk data");
                                        long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i34);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i34);
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i34);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i34);
                                        iMo15741c = i34;
                                        jArr4 = jArrCopyOf2;
                                        break;
                                    }
                                    if (c38059n2 != null) {
                                        iM121871x6 = i36;
                                        while (iM121871x6 == 0 && i28 > 0) {
                                            iM121871x6 = c38059n2.m121871x();
                                            iM121854g2 = c38059n2.m121854g();
                                            i28--;
                                        }
                                        i36 = iM121871x6 - 1;
                                    }
                                    jArr3[i34] = j24;
                                    iMo15739a = interfaceC26489b.mo15739a();
                                    iArrCopyOf[i34] = iMo15739a;
                                    j18 += (long) iMo15739a;
                                    if (iMo15739a > i29) {
                                        i29 = iMo15739a;
                                    }
                                    jArrCopyOf[i34] = j19 + ((long) iM121854g2);
                                    if (c38059n3 == null) {
                                        i45 = 1;
                                    } else {
                                        i45 = 0;
                                    }
                                    iArrCopyOf2[i34] = i45;
                                    if (i34 == iM121871x5) {
                                        iArrCopyOf2[i34] = 1;
                                        i26--;
                                        if (i26 > 0) {
                                            c38059n3.getClass();
                                            iM121871x5 = c38059n3.m121871x() - 1;
                                        }
                                    }
                                    j19 += (long) iM121854g;
                                    iM121871x4 = i37 - 1;
                                    if (iM121871x4 != 0 && i27 > 0) {
                                        i27--;
                                        iM121871x4 = c38059n9.m121871x();
                                        iM121854g = c38059n9.m121854g();
                                    }
                                    j24 += (long) iArrCopyOf[i34];
                                    i35--;
                                    i34++;
                                    jArr3 = jArr3;
                                    i29 = i29;
                                    iMo15741c = i44;
                                }
                                iArr = iArrCopyOf;
                                i38 = i35;
                                j25 = j19 + ((long) iM121854g2);
                                if (c38059n2 == null) {
                                    z15 = true;
                                    break;
                                }
                                while (true) {
                                    if (i28 <= 0) {
                                        z15 = true;
                                        break;
                                    }
                                    if (c38059n2.m121871x() != 0) {
                                        z15 = false;
                                        break;
                                    }
                                    c38059n2.m121854g();
                                    i28--;
                                }
                                if (i26 == 0 || i37 != 0 || i38 != 0 || i27 != 0 || i36 != 0 || !z15) {
                                    StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                    z16 = z15;
                                    AbstractC30802r.m94773v(sb4, c26502oM78565a.f105311a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                    AbstractC30802r.m94773v(sb4, i37, ", remainingSamplesInChunk ", i38, ", remainingTimestampDeltaChanges ");
                                    sb4.append(i27);
                                    sb4.append(", remainingSamplesAtTimestampOffset ");
                                    sb4.append(i36);
                                    if (z16) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb4.append(str2);
                                    AbstractC38046a.m121826u("BoxParsers", sb4.toString());
                                }
                                jArr5 = jArrCopyOf;
                                iArr2 = iArrCopyOf2;
                                i39 = i29;
                                j26 = j18;
                            }
                            jArr6 = jArr4;
                            iArr3 = iArr;
                            j27 = c26502oM78565a.f105316f;
                            if (j27 > 0) {
                                jM121903Q5 = AbstractC38065t.m121903Q(8 * j26, 1000000L, j27, RoundingMode.HALF_DOWN);
                                if (jM121903Q5 > 0 && jM121903Q5 < 2147483647L) {
                                    C34608o c34608oM109410a5 = c34610p6.m109410a();
                                    c34608oM109410a5.f145736h = (int) jM121903Q5;
                                    c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a5));
                                }
                            }
                            j28 = c26502oM78565a.f105313c;
                            c34610p3 = c26502oM78565a.f105317g;
                            i46 = c26502oM78565a.f105312b;
                            jArr7 = c26502oM78565a.f105320j;
                            jArr8 = c26502oM78565a.f105319i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jM121903Q3 = AbstractC38065t.m121903Q(j25, 1000000L, j28, roundingMode);
                            if (jArr8 == null) {
                                AbstractC38065t.m121902P(jArr5, j28);
                                c26504q2 = new C26504q(c26502oM78565a, jArr6, iArr3, i39, jArr5, iArr2, jM121903Q3);
                            } else {
                                jArr9 = jArr5;
                                if (jArr8.length == 1 || i46 != 1 || jArr9.length < 2) {
                                    c34610p4 = c34610p3;
                                    i47 = iMo15741c;
                                } else {
                                    jArr7.getClass();
                                    long j47 = jArr7[0];
                                    i47 = iMo15741c;
                                    long jM121903Q6 = AbstractC38065t.m121903Q(jArr8[0], c26502oM78565a.f105313c, c26502oM78565a.f105314d, roundingMode) + j47;
                                    int length = jArr9.length - 1;
                                    int iM121914g = AbstractC38065t.m121914g(4, 0, length);
                                    int iM121914g2 = AbstractC38065t.m121914g(jArr9.length - 4, 0, length);
                                    long j48 = jArr9[0];
                                    if (j48 <= j47 && j47 < jArr9[iM121914g] && jArr9[iM121914g2] < jM121903Q6 && jM121903Q6 <= j25) {
                                        long j49 = j25 - jM121903Q6;
                                        long jM121903Q7 = AbstractC38065t.m121903Q(j47 - j48, c34610p3.f145760E, c26502oM78565a.f105313c, roundingMode);
                                        c34610p4 = c34610p3;
                                        long jM121903Q8 = AbstractC38065t.m121903Q(j49, c34610p3.f145760E, c26502oM78565a.f105313c, roundingMode);
                                        if ((jM121903Q7 != 0 || jM121903Q8 != 0) && jM121903Q7 <= 2147483647L && jM121903Q8 <= 2147483647L) {
                                            c33655x.f140458a = (int) jM121903Q7;
                                            c33655x.f140459b = (int) jM121903Q8;
                                            AbstractC38065t.m121902P(jArr9, j28);
                                            c26504q2 = new C26504q(c26502oM78565a, jArr6, iArr3, i39, jArr9, iArr2, AbstractC38065t.m121903Q(jArr8[0], 1000000L, c26502oM78565a.f105314d, roundingMode));
                                        }
                                    } else {
                                        c34610p4 = c34610p3;
                                    }
                                    i48 = 1;
                                    if (jArr8.length != 1) {
                                        iArr4 = iArr2;
                                        if (i46 == i48) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        iArr5 = new int[jArr8.length];
                                        iArr6 = new int[jArr8.length];
                                        jArr7.getClass();
                                        i49 = 0;
                                        i54 = 0;
                                        z18 = false;
                                        i55 = 0;
                                        while (i54 < jArr8.length) {
                                            iArr11 = iArr5;
                                            iArr12 = iArr6;
                                            j35 = jArr7[i54];
                                            if (j35 != -1) {
                                                i65 = i54;
                                                boolean z29 = z18;
                                                long jM121903Q9 = AbstractC38065t.m121903Q(jArr8[i54], c26502oM78565a.f105313c, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                                iArr13 = iArr11;
                                                iArr13[i65] = AbstractC38065t.m121911d(jArr9, j35, true);
                                                j36 = j35 + jM121903Q9;
                                                iArr12[i65] = AbstractC38065t.m121908a(jArr9, j36, z17);
                                                i66 = iArr13[i65];
                                                while (true) {
                                                    i67 = iArr13[i65];
                                                    if (i67 < 0 || (iArr4[i67] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr13[i65] = i67 - 1;
                                                }
                                                if (i67 < 0) {
                                                    iArr13[i65] = i66;
                                                    while (true) {
                                                        i75 = iArr13[i65];
                                                        if (i75 >= iArr12[i65] || (iArr4[i75] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr13[i65] = i75 + 1;
                                                    }
                                                }
                                                if (i46 == 2 && iArr13[i65] != iArr12[i65]) {
                                                    while (true) {
                                                        i69 = iArr12[i65];
                                                        if (i69 < jArr9.length - 1) {
                                                            break;
                                                        }
                                                        i74 = i69 + 1;
                                                        if (jArr9[i74] <= j36) {
                                                            break;
                                                        }
                                                        iArr12[i65] = i74;
                                                    }
                                                }
                                                int i113 = iArr12[i65];
                                                i68 = iArr13[i65];
                                                int i114 = (i113 - i68) + i55;
                                                if (i49 != i68) {
                                                    z28 = true;
                                                } else {
                                                    z28 = false;
                                                }
                                                z27 = z29 | z28;
                                                i49 = i113;
                                                i55 = i114;
                                            } else {
                                                iArr13 = iArr11;
                                                i65 = i54;
                                                z27 = z18;
                                            }
                                            i54 = i65 + 1;
                                            iArr6 = iArr12;
                                            z18 = z27;
                                            iArr5 = iArr13;
                                        }
                                        iArr7 = iArr5;
                                        iArr8 = iArr6;
                                        boolean z34 = z18;
                                        if (i55 != i47) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        z24 = z34 | z19;
                                        if (z24) {
                                            jArr10 = new long[i55];
                                        } else {
                                            jArr10 = jArr6;
                                        }
                                        if (z24) {
                                            iArr9 = new int[i55];
                                        } else {
                                            iArr9 = iArr3;
                                        }
                                        if (z24) {
                                            i39 = 0;
                                        }
                                        if (z24) {
                                            iArr10 = new int[i55];
                                        } else {
                                            iArr10 = iArr4;
                                        }
                                        jArr11 = new long[i55];
                                        i56 = 0;
                                        z25 = false;
                                        i57 = 0;
                                        j29 = 0;
                                        i58 = i39;
                                        while (i56 < jArr8.length) {
                                            j34 = jArr7[i56];
                                            z26 = z24;
                                            i59 = iArr7[i56];
                                            long[] jArr18 = jArr8;
                                            i64 = iArr8[i56];
                                            jArr12 = jArr11;
                                            if (z26) {
                                                int i115 = i64 - i59;
                                                System.arraycopy(jArr6, i59, jArr10, i57, i115);
                                                System.arraycopy(iArr3, i59, iArr9, i57, i115);
                                                System.arraycopy(iArr4, i59, iArr10, i57, i115);
                                            }
                                            int i116 = i58;
                                            while (i59 < i64) {
                                                int i117 = i59;
                                                long[] jArr19 = jArr10;
                                                long j54 = c26502oM78565a.f105314d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long jM121903Q10 = AbstractC38065t.m121903Q(j29, 1000000L, j54, roundingMode2);
                                                jM121903Q4 = AbstractC38065t.m121903Q(jArr9[i117] - j34, 1000000L, c26502oM78565a.f105313c, roundingMode2);
                                                if (jM121903Q4 < 0) {
                                                    z25 = true;
                                                }
                                                jArr12[i57] = jM121903Q10 + jM121903Q4;
                                                if (!z26 && iArr9[i57] > i116) {
                                                    i116 = iArr3[i117];
                                                }
                                                i57++;
                                                i59 = i117 + 1;
                                                jArr10 = jArr19;
                                            }
                                            j29 += jArr18[i56];
                                            i56++;
                                            i58 = i116;
                                            z24 = z26;
                                            jArr8 = jArr18;
                                            jArr10 = jArr10;
                                            jArr11 = jArr12;
                                        }
                                        long[] jArr20 = jArr10;
                                        long[] jArr21 = jArr11;
                                        long jM121903Q11 = AbstractC38065t.m121903Q(j29, 1000000L, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                        if (z25) {
                                            C34608o c34608oM109410a6 = c34610p4.m109410a();
                                            c34608oM109410a6.f145747s = true;
                                            c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a6));
                                        }
                                        arrayList3 = arrayList3;
                                        c26504q = new C26504q(c26502oM78565a, jArr20, iArr9, i58, jArr21, iArr10, jM121903Q11);
                                    } else if (jArr8[0] == 0) {
                                        jArr7.getClass();
                                        j37 = jArr7[0];
                                        for (i76 = 0; i76 < jArr9.length; i76++) {
                                            jArr9[i76] = AbstractC38065t.m121903Q(jArr9[i76] - j37, 1000000L, c26502oM78565a.f105313c, RoundingMode.DOWN);
                                        }
                                        arrayList3 = arrayList3;
                                        c26504q = new C26504q(c26502oM78565a, jArr6, iArr3, i39, jArr9, iArr2, AbstractC38065t.m121903Q(j25 - j37, 1000000L, c26502oM78565a.f105313c, RoundingMode.DOWN));
                                    } else {
                                        i48 = 1;
                                        iArr4 = iArr2;
                                        if (i46 == i48) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        iArr5 = new int[jArr8.length];
                                        iArr6 = new int[jArr8.length];
                                        jArr7.getClass();
                                        i49 = 0;
                                        i54 = 0;
                                        z18 = false;
                                        i55 = 0;
                                        while (i54 < jArr8.length) {
                                            iArr11 = iArr5;
                                            iArr12 = iArr6;
                                            j35 = jArr7[i54];
                                            if (j35 != -1) {
                                                i65 = i54;
                                                boolean z210 = z18;
                                                long jM121903Q12 = AbstractC38065t.m121903Q(jArr8[i54], c26502oM78565a.f105313c, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                                iArr13 = iArr11;
                                                iArr13[i65] = AbstractC38065t.m121911d(jArr9, j35, true);
                                                j36 = j35 + jM121903Q12;
                                                iArr12[i65] = AbstractC38065t.m121908a(jArr9, j36, z17);
                                                i66 = iArr13[i65];
                                                while (true) {
                                                    i67 = iArr13[i65];
                                                    if (i67 < 0) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr13[i65] = i67 - 1;
                                                }
                                                if (i67 < 0) {
                                                    iArr13[i65] = i66;
                                                    while (true) {
                                                        i75 = iArr13[i65];
                                                        if (i75 >= iArr12[i65]) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr13[i65] = i75 + 1;
                                                    }
                                                }
                                                if (i46 == 2) {
                                                    while (true) {
                                                        i69 = iArr12[i65];
                                                        if (i69 < jArr9.length - 1) {
                                                            break;
                                                            break;
                                                        }
                                                        i74 = i69 + 1;
                                                        if (jArr9[i74] <= j36) {
                                                            break;
                                                            break;
                                                        }
                                                        iArr12[i65] = i74;
                                                    }
                                                }
                                                int i118 = iArr12[i65];
                                                i68 = iArr13[i65];
                                                int i119 = (i118 - i68) + i55;
                                                if (i49 != i68) {
                                                    z28 = true;
                                                } else {
                                                    z28 = false;
                                                }
                                                z27 = z210 | z28;
                                                i49 = i118;
                                                i55 = i119;
                                            } else {
                                                iArr13 = iArr11;
                                                i65 = i54;
                                                z27 = z18;
                                            }
                                            i54 = i65 + 1;
                                            iArr6 = iArr12;
                                            z18 = z27;
                                            iArr5 = iArr13;
                                        }
                                        iArr7 = iArr5;
                                        iArr8 = iArr6;
                                        boolean z35 = z18;
                                        if (i55 != i47) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        z24 = z35 | z19;
                                        if (z24) {
                                            jArr10 = new long[i55];
                                        } else {
                                            jArr10 = jArr6;
                                        }
                                        if (z24) {
                                            iArr9 = new int[i55];
                                        } else {
                                            iArr9 = iArr3;
                                        }
                                        if (z24) {
                                            i39 = 0;
                                        }
                                        if (z24) {
                                            iArr10 = new int[i55];
                                        } else {
                                            iArr10 = iArr4;
                                        }
                                        jArr11 = new long[i55];
                                        i56 = 0;
                                        z25 = false;
                                        i57 = 0;
                                        j29 = 0;
                                        i58 = i39;
                                        while (i56 < jArr8.length) {
                                            j34 = jArr7[i56];
                                            z26 = z24;
                                            i59 = iArr7[i56];
                                            long[] jArr110 = jArr8;
                                            i64 = iArr8[i56];
                                            jArr12 = jArr11;
                                            if (z26) {
                                                int i1110 = i64 - i59;
                                                System.arraycopy(jArr6, i59, jArr10, i57, i1110);
                                                System.arraycopy(iArr3, i59, iArr9, i57, i1110);
                                                System.arraycopy(iArr4, i59, iArr10, i57, i1110);
                                            }
                                            int i1111 = i58;
                                            while (i59 < i64) {
                                                int i1112 = i59;
                                                long[] jArr111 = jArr10;
                                                long j55 = c26502oM78565a.f105314d;
                                                RoundingMode roundingMode3 = RoundingMode.DOWN;
                                                long jM121903Q13 = AbstractC38065t.m121903Q(j29, 1000000L, j55, roundingMode3);
                                                jM121903Q4 = AbstractC38065t.m121903Q(jArr9[i1112] - j34, 1000000L, c26502oM78565a.f105313c, roundingMode3);
                                                if (jM121903Q4 < 0) {
                                                    z25 = true;
                                                }
                                                jArr12[i57] = jM121903Q13 + jM121903Q4;
                                                if (!z26) {
                                                }
                                                i57++;
                                                i59 = i1112 + 1;
                                                jArr10 = jArr111;
                                            }
                                            j29 += jArr110[i56];
                                            i56++;
                                            i58 = i1111;
                                            z24 = z26;
                                            jArr8 = jArr110;
                                            jArr10 = jArr10;
                                            jArr11 = jArr12;
                                        }
                                        long[] jArr22 = jArr10;
                                        long[] jArr23 = jArr11;
                                        long jM121903Q14 = AbstractC38065t.m121903Q(j29, 1000000L, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                        if (z25) {
                                            C34608o c34608oM109410a7 = c34610p4.m109410a();
                                            c34608oM109410a7.f145747s = true;
                                            c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a7));
                                        }
                                        arrayList3 = arrayList3;
                                        c26504q = new C26504q(c26502oM78565a, jArr22, iArr9, i58, jArr23, iArr10, jM121903Q14);
                                    }
                                    arrayList3.add(c26504q);
                                }
                                i48 = 1;
                                if (jArr8.length != 1) {
                                    iArr4 = iArr2;
                                    if (i46 == i48) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    iArr5 = new int[jArr8.length];
                                    iArr6 = new int[jArr8.length];
                                    jArr7.getClass();
                                    i49 = 0;
                                    i54 = 0;
                                    z18 = false;
                                    i55 = 0;
                                    while (i54 < jArr8.length) {
                                        iArr11 = iArr5;
                                        iArr12 = iArr6;
                                        j35 = jArr7[i54];
                                        if (j35 != -1) {
                                            i65 = i54;
                                            boolean z211 = z18;
                                            long jM121903Q15 = AbstractC38065t.m121903Q(jArr8[i54], c26502oM78565a.f105313c, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                            iArr13 = iArr11;
                                            iArr13[i65] = AbstractC38065t.m121911d(jArr9, j35, true);
                                            j36 = j35 + jM121903Q15;
                                            iArr12[i65] = AbstractC38065t.m121908a(jArr9, j36, z17);
                                            i66 = iArr13[i65];
                                            while (true) {
                                                i67 = iArr13[i65];
                                                if (i67 < 0) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr13[i65] = i67 - 1;
                                            }
                                            if (i67 < 0) {
                                                iArr13[i65] = i66;
                                                while (true) {
                                                    i75 = iArr13[i65];
                                                    if (i75 >= iArr12[i65]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr13[i65] = i75 + 1;
                                                }
                                            }
                                            if (i46 == 2) {
                                                while (true) {
                                                    i69 = iArr12[i65];
                                                    if (i69 < jArr9.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i74 = i69 + 1;
                                                    if (jArr9[i74] <= j36) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr12[i65] = i74;
                                                }
                                            }
                                            int i1113 = iArr12[i65];
                                            i68 = iArr13[i65];
                                            int i1114 = (i1113 - i68) + i55;
                                            if (i49 != i68) {
                                                z28 = true;
                                            } else {
                                                z28 = false;
                                            }
                                            z27 = z211 | z28;
                                            i49 = i1113;
                                            i55 = i1114;
                                        } else {
                                            iArr13 = iArr11;
                                            i65 = i54;
                                            z27 = z18;
                                        }
                                        i54 = i65 + 1;
                                        iArr6 = iArr12;
                                        z18 = z27;
                                        iArr5 = iArr13;
                                    }
                                    iArr7 = iArr5;
                                    iArr8 = iArr6;
                                    boolean z36 = z18;
                                    if (i55 != i47) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    z24 = z36 | z19;
                                    if (z24) {
                                        jArr10 = new long[i55];
                                    } else {
                                        jArr10 = jArr6;
                                    }
                                    if (z24) {
                                        iArr9 = new int[i55];
                                    } else {
                                        iArr9 = iArr3;
                                    }
                                    if (z24) {
                                        i39 = 0;
                                    }
                                    if (z24) {
                                        iArr10 = new int[i55];
                                    } else {
                                        iArr10 = iArr4;
                                    }
                                    jArr11 = new long[i55];
                                    i56 = 0;
                                    z25 = false;
                                    i57 = 0;
                                    j29 = 0;
                                    i58 = i39;
                                    while (i56 < jArr8.length) {
                                        j34 = jArr7[i56];
                                        z26 = z24;
                                        i59 = iArr7[i56];
                                        long[] jArr112 = jArr8;
                                        i64 = iArr8[i56];
                                        jArr12 = jArr11;
                                        if (z26) {
                                            int i1115 = i64 - i59;
                                            System.arraycopy(jArr6, i59, jArr10, i57, i1115);
                                            System.arraycopy(iArr3, i59, iArr9, i57, i1115);
                                            System.arraycopy(iArr4, i59, iArr10, i57, i1115);
                                        }
                                        int i1116 = i58;
                                        while (i59 < i64) {
                                            int i1117 = i59;
                                            long[] jArr113 = jArr10;
                                            long j56 = c26502oM78565a.f105314d;
                                            RoundingMode roundingMode4 = RoundingMode.DOWN;
                                            long jM121903Q16 = AbstractC38065t.m121903Q(j29, 1000000L, j56, roundingMode4);
                                            jM121903Q4 = AbstractC38065t.m121903Q(jArr9[i1117] - j34, 1000000L, c26502oM78565a.f105313c, roundingMode4);
                                            if (jM121903Q4 < 0) {
                                                z25 = true;
                                            }
                                            jArr12[i57] = jM121903Q16 + jM121903Q4;
                                            if (!z26) {
                                            }
                                            i57++;
                                            i59 = i1117 + 1;
                                            jArr10 = jArr113;
                                        }
                                        j29 += jArr112[i56];
                                        i56++;
                                        i58 = i1116;
                                        z24 = z26;
                                        jArr8 = jArr112;
                                        jArr10 = jArr10;
                                        jArr11 = jArr12;
                                    }
                                    long[] jArr24 = jArr10;
                                    long[] jArr25 = jArr11;
                                    long jM121903Q17 = AbstractC38065t.m121903Q(j29, 1000000L, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                    if (z25) {
                                        C34608o c34608oM109410a8 = c34610p4.m109410a();
                                        c34608oM109410a8.f145747s = true;
                                        c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a8));
                                    }
                                    arrayList3 = arrayList3;
                                    c26504q = new C26504q(c26502oM78565a, jArr24, iArr9, i58, jArr25, iArr10, jM121903Q17);
                                } else if (jArr8[0] == 0) {
                                    jArr7.getClass();
                                    j37 = jArr7[0];
                                    while (i76 < jArr9.length) {
                                        jArr9[i76] = AbstractC38065t.m121903Q(jArr9[i76] - j37, 1000000L, c26502oM78565a.f105313c, RoundingMode.DOWN);
                                    }
                                    arrayList3 = arrayList3;
                                    c26504q = new C26504q(c26502oM78565a, jArr6, iArr3, i39, jArr9, iArr2, AbstractC38065t.m121903Q(j25 - j37, 1000000L, c26502oM78565a.f105313c, RoundingMode.DOWN));
                                } else {
                                    i48 = 1;
                                    iArr4 = iArr2;
                                    if (i46 == i48) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    iArr5 = new int[jArr8.length];
                                    iArr6 = new int[jArr8.length];
                                    jArr7.getClass();
                                    i49 = 0;
                                    i54 = 0;
                                    z18 = false;
                                    i55 = 0;
                                    while (i54 < jArr8.length) {
                                        iArr11 = iArr5;
                                        iArr12 = iArr6;
                                        j35 = jArr7[i54];
                                        if (j35 != -1) {
                                            i65 = i54;
                                            boolean z212 = z18;
                                            long jM121903Q18 = AbstractC38065t.m121903Q(jArr8[i54], c26502oM78565a.f105313c, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                            iArr13 = iArr11;
                                            iArr13[i65] = AbstractC38065t.m121911d(jArr9, j35, true);
                                            j36 = j35 + jM121903Q18;
                                            iArr12[i65] = AbstractC38065t.m121908a(jArr9, j36, z17);
                                            i66 = iArr13[i65];
                                            while (true) {
                                                i67 = iArr13[i65];
                                                if (i67 < 0) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr13[i65] = i67 - 1;
                                            }
                                            if (i67 < 0) {
                                                iArr13[i65] = i66;
                                                while (true) {
                                                    i75 = iArr13[i65];
                                                    if (i75 >= iArr12[i65]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr13[i65] = i75 + 1;
                                                }
                                            }
                                            if (i46 == 2) {
                                                while (true) {
                                                    i69 = iArr12[i65];
                                                    if (i69 < jArr9.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i74 = i69 + 1;
                                                    if (jArr9[i74] <= j36) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr12[i65] = i74;
                                                }
                                            }
                                            int i1118 = iArr12[i65];
                                            i68 = iArr13[i65];
                                            int i1119 = (i1118 - i68) + i55;
                                            if (i49 != i68) {
                                                z28 = true;
                                            } else {
                                                z28 = false;
                                            }
                                            z27 = z212 | z28;
                                            i49 = i1118;
                                            i55 = i1119;
                                        } else {
                                            iArr13 = iArr11;
                                            i65 = i54;
                                            z27 = z18;
                                        }
                                        i54 = i65 + 1;
                                        iArr6 = iArr12;
                                        z18 = z27;
                                        iArr5 = iArr13;
                                    }
                                    iArr7 = iArr5;
                                    iArr8 = iArr6;
                                    boolean z37 = z18;
                                    if (i55 != i47) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    z24 = z37 | z19;
                                    if (z24) {
                                        jArr10 = new long[i55];
                                    } else {
                                        jArr10 = jArr6;
                                    }
                                    if (z24) {
                                        iArr9 = new int[i55];
                                    } else {
                                        iArr9 = iArr3;
                                    }
                                    if (z24) {
                                        i39 = 0;
                                    }
                                    if (z24) {
                                        iArr10 = new int[i55];
                                    } else {
                                        iArr10 = iArr4;
                                    }
                                    jArr11 = new long[i55];
                                    i56 = 0;
                                    z25 = false;
                                    i57 = 0;
                                    j29 = 0;
                                    i58 = i39;
                                    while (i56 < jArr8.length) {
                                        j34 = jArr7[i56];
                                        z26 = z24;
                                        i59 = iArr7[i56];
                                        long[] jArr114 = jArr8;
                                        i64 = iArr8[i56];
                                        jArr12 = jArr11;
                                        if (z26) {
                                            int i11110 = i64 - i59;
                                            System.arraycopy(jArr6, i59, jArr10, i57, i11110);
                                            System.arraycopy(iArr3, i59, iArr9, i57, i11110);
                                            System.arraycopy(iArr4, i59, iArr10, i57, i11110);
                                        }
                                        int i11111 = i58;
                                        while (i59 < i64) {
                                            int i11112 = i59;
                                            long[] jArr115 = jArr10;
                                            long j57 = c26502oM78565a.f105314d;
                                            RoundingMode roundingMode5 = RoundingMode.DOWN;
                                            long jM121903Q19 = AbstractC38065t.m121903Q(j29, 1000000L, j57, roundingMode5);
                                            jM121903Q4 = AbstractC38065t.m121903Q(jArr9[i11112] - j34, 1000000L, c26502oM78565a.f105313c, roundingMode5);
                                            if (jM121903Q4 < 0) {
                                                z25 = true;
                                            }
                                            jArr12[i57] = jM121903Q19 + jM121903Q4;
                                            if (!z26) {
                                            }
                                            i57++;
                                            i59 = i11112 + 1;
                                            jArr10 = jArr115;
                                        }
                                        j29 += jArr114[i56];
                                        i56++;
                                        i58 = i11111;
                                        z24 = z26;
                                        jArr8 = jArr114;
                                        jArr10 = jArr10;
                                        jArr11 = jArr12;
                                    }
                                    long[] jArr26 = jArr10;
                                    long[] jArr27 = jArr11;
                                    long jM121903Q110 = AbstractC38065t.m121903Q(j29, 1000000L, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                    if (z25) {
                                        C34608o c34608oM109410a9 = c34610p4.m109410a();
                                        c34608oM109410a9.f145747s = true;
                                        c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a9));
                                    }
                                    arrayList3 = arrayList3;
                                    c26504q = new C26504q(c26502oM78565a, jArr26, iArr9, i58, jArr27, iArr10, jM121903Q110);
                                }
                                arrayList3.add(c26504q);
                            }
                            c26504q = c26504q2;
                        } else {
                            iM121871x2 = 0;
                        }
                        iM121871x3 = -1;
                        iMo15740b = c12185e.mo15740b();
                        c38059n2 = c38059n11;
                        String str4 = c34610p6.f145783n;
                        if (iMo15740b == -1) {
                            jArr3 = new long[iMo15741c];
                            iArrCopyOf = new int[iMo15741c];
                            jArrCopyOf = new long[iMo15741c];
                            iArrCopyOf2 = new int[iMo15741c];
                            int i1120 = iM121871x;
                            interfaceC26489b = c12185e;
                            iM121871x4 = iM121871x9;
                            i26 = iM121871x2;
                            iM121854g = iM121871x10;
                            i27 = iM121871x8;
                            iM121871x5 = iM121871x3;
                            i28 = i1120;
                            c38059n3 = c38059n10;
                            j18 = 0;
                            j19 = 0;
                            j24 = 0;
                            i29 = 0;
                            i34 = 0;
                            iM121854g2 = 0;
                            i35 = 0;
                            i36 = 0;
                            while (true) {
                                if (i34 >= iMo15741c) {
                                    i37 = iM121871x4;
                                    jArr4 = jArr3;
                                    iMo15741c = iMo15741c;
                                    break;
                                }
                                zM33784a = true;
                                while (i35 == 0) {
                                    zM33784a = c12183c.m33784a();
                                    if (!zM33784a) {
                                        break;
                                        break;
                                    }
                                    j24 = c12183c.f40615e;
                                    i35 = c12183c.f40614d;
                                    iMo15741c = iMo15741c;
                                    iM121871x4 = iM121871x4;
                                }
                                i44 = iMo15741c;
                                i37 = iM121871x4;
                                if (!zM33784a) {
                                    AbstractC38046a.m121826u("BoxParsers", "Unexpected end of chunk data");
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i34);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i34);
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i34);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i34);
                                    iMo15741c = i34;
                                    jArr4 = jArrCopyOf3;
                                    break;
                                }
                                if (c38059n2 != null) {
                                    iM121871x6 = i36;
                                    while (iM121871x6 == 0) {
                                        iM121871x6 = c38059n2.m121871x();
                                        iM121854g2 = c38059n2.m121854g();
                                        i28--;
                                    }
                                    i36 = iM121871x6 - 1;
                                }
                                jArr3[i34] = j24;
                                iMo15739a = interfaceC26489b.mo15739a();
                                iArrCopyOf[i34] = iMo15739a;
                                j18 += (long) iMo15739a;
                                if (iMo15739a > i29) {
                                    i29 = iMo15739a;
                                }
                                jArrCopyOf[i34] = j19 + ((long) iM121854g2);
                                if (c38059n3 == null) {
                                    i45 = 1;
                                } else {
                                    i45 = 0;
                                }
                                iArrCopyOf2[i34] = i45;
                                if (i34 == iM121871x5) {
                                    iArrCopyOf2[i34] = 1;
                                    i26--;
                                    if (i26 > 0) {
                                        c38059n3.getClass();
                                        iM121871x5 = c38059n3.m121871x() - 1;
                                    }
                                }
                                j19 += (long) iM121854g;
                                iM121871x4 = i37 - 1;
                                if (iM121871x4 != 0) {
                                }
                                j24 += (long) iArrCopyOf[i34];
                                i35--;
                                i34++;
                                jArr3 = jArr3;
                                i29 = i29;
                                iMo15741c = i44;
                            }
                            iArr = iArrCopyOf;
                            i38 = i35;
                            j25 = j19 + ((long) iM121854g2);
                            if (c38059n2 == null) {
                                z15 = true;
                                break;
                            }
                            while (true) {
                                if (i28 <= 0) {
                                    z15 = true;
                                    break;
                                }
                                if (c38059n2.m121871x() != 0) {
                                    z15 = false;
                                    break;
                                }
                                c38059n2.m121854g();
                                i28--;
                            }
                            if (i26 == 0) {
                                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                z16 = z15;
                                AbstractC30802r.m94773v(sb5, c26502oM78565a.f105311a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                AbstractC30802r.m94773v(sb5, i37, ", remainingSamplesInChunk ", i38, ", remainingTimestampDeltaChanges ");
                                sb5.append(i27);
                                sb5.append(", remainingSamplesAtTimestampOffset ");
                                sb5.append(i36);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb5.append(str2);
                                AbstractC38046a.m121826u("BoxParsers", sb5.toString());
                            } else {
                                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                z16 = z15;
                                AbstractC30802r.m94773v(sb6, c26502oM78565a.f105311a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                AbstractC30802r.m94773v(sb6, i37, ", remainingSamplesInChunk ", i38, ", remainingTimestampDeltaChanges ");
                                sb6.append(i27);
                                sb6.append(", remainingSamplesAtTimestampOffset ");
                                sb6.append(i36);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb6.append(str2);
                                AbstractC38046a.m121826u("BoxParsers", sb6.toString());
                            }
                            jArr5 = jArrCopyOf;
                            iArr2 = iArrCopyOf2;
                            i39 = i29;
                            j26 = j18;
                        } else {
                            jArr3 = new long[iMo15741c];
                            iArrCopyOf = new int[iMo15741c];
                            jArrCopyOf = new long[iMo15741c];
                            iArrCopyOf2 = new int[iMo15741c];
                            int i1121 = iM121871x;
                            interfaceC26489b = c12185e;
                            iM121871x4 = iM121871x9;
                            i26 = iM121871x2;
                            iM121854g = iM121871x10;
                            i27 = iM121871x8;
                            iM121871x5 = iM121871x3;
                            i28 = i1121;
                            c38059n3 = c38059n10;
                            j18 = 0;
                            j19 = 0;
                            j24 = 0;
                            i29 = 0;
                            i34 = 0;
                            iM121854g2 = 0;
                            i35 = 0;
                            i36 = 0;
                            while (true) {
                                if (i34 >= iMo15741c) {
                                    i37 = iM121871x4;
                                    jArr4 = jArr3;
                                    iMo15741c = iMo15741c;
                                    break;
                                }
                                zM33784a = true;
                                while (i35 == 0) {
                                    zM33784a = c12183c.m33784a();
                                    if (!zM33784a) {
                                        break;
                                        break;
                                    }
                                    j24 = c12183c.f40615e;
                                    i35 = c12183c.f40614d;
                                    iMo15741c = iMo15741c;
                                    iM121871x4 = iM121871x4;
                                }
                                i44 = iMo15741c;
                                i37 = iM121871x4;
                                if (!zM33784a) {
                                    AbstractC38046a.m121826u("BoxParsers", "Unexpected end of chunk data");
                                    long[] jArrCopyOf4 = Arrays.copyOf(jArr3, i34);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i34);
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i34);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i34);
                                    iMo15741c = i34;
                                    jArr4 = jArrCopyOf4;
                                    break;
                                }
                                if (c38059n2 != null) {
                                    iM121871x6 = i36;
                                    while (iM121871x6 == 0) {
                                        iM121871x6 = c38059n2.m121871x();
                                        iM121854g2 = c38059n2.m121854g();
                                        i28--;
                                    }
                                    i36 = iM121871x6 - 1;
                                }
                                jArr3[i34] = j24;
                                iMo15739a = interfaceC26489b.mo15739a();
                                iArrCopyOf[i34] = iMo15739a;
                                j18 += (long) iMo15739a;
                                if (iMo15739a > i29) {
                                    i29 = iMo15739a;
                                }
                                jArrCopyOf[i34] = j19 + ((long) iM121854g2);
                                if (c38059n3 == null) {
                                    i45 = 1;
                                } else {
                                    i45 = 0;
                                }
                                iArrCopyOf2[i34] = i45;
                                if (i34 == iM121871x5) {
                                    iArrCopyOf2[i34] = 1;
                                    i26--;
                                    if (i26 > 0) {
                                        c38059n3.getClass();
                                        iM121871x5 = c38059n3.m121871x() - 1;
                                    }
                                }
                                j19 += (long) iM121854g;
                                iM121871x4 = i37 - 1;
                                if (iM121871x4 != 0) {
                                }
                                j24 += (long) iArrCopyOf[i34];
                                i35--;
                                i34++;
                                jArr3 = jArr3;
                                i29 = i29;
                                iMo15741c = i44;
                            }
                            iArr = iArrCopyOf;
                            i38 = i35;
                            j25 = j19 + ((long) iM121854g2);
                            if (c38059n2 == null) {
                                z15 = true;
                                break;
                            }
                            while (true) {
                                if (i28 <= 0) {
                                    z15 = true;
                                    break;
                                }
                                if (c38059n2.m121871x() != 0) {
                                    z15 = false;
                                    break;
                                }
                                c38059n2.m121854g();
                                i28--;
                            }
                            if (i26 == 0) {
                                StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                                z16 = z15;
                                AbstractC30802r.m94773v(sb7, c26502oM78565a.f105311a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                AbstractC30802r.m94773v(sb7, i37, ", remainingSamplesInChunk ", i38, ", remainingTimestampDeltaChanges ");
                                sb7.append(i27);
                                sb7.append(", remainingSamplesAtTimestampOffset ");
                                sb7.append(i36);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb7.append(str2);
                                AbstractC38046a.m121826u("BoxParsers", sb7.toString());
                            } else {
                                StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                                z16 = z15;
                                AbstractC30802r.m94773v(sb8, c26502oM78565a.f105311a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                AbstractC30802r.m94773v(sb8, i37, ", remainingSamplesInChunk ", i38, ", remainingTimestampDeltaChanges ");
                                sb8.append(i27);
                                sb8.append(", remainingSamplesAtTimestampOffset ");
                                sb8.append(i36);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb8.append(str2);
                                AbstractC38046a.m121826u("BoxParsers", sb8.toString());
                            }
                            jArr5 = jArrCopyOf;
                            iArr2 = iArrCopyOf2;
                            i39 = i29;
                            j26 = j18;
                        }
                        jArr6 = jArr4;
                        iArr3 = iArr;
                        j27 = c26502oM78565a.f105316f;
                        if (j27 > 0) {
                            jM121903Q5 = AbstractC38065t.m121903Q(8 * j26, 1000000L, j27, RoundingMode.HALF_DOWN);
                            if (jM121903Q5 > 0) {
                                C34608o c34608oM109410a10 = c34610p6.m109410a();
                                c34608oM109410a10.f145736h = (int) jM121903Q5;
                                c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a10));
                            }
                        }
                        j28 = c26502oM78565a.f105313c;
                        c34610p3 = c26502oM78565a.f105317g;
                        i46 = c26502oM78565a.f105312b;
                        jArr7 = c26502oM78565a.f105320j;
                        jArr8 = c26502oM78565a.f105319i;
                        RoundingMode roundingMode6 = RoundingMode.DOWN;
                        jM121903Q3 = AbstractC38065t.m121903Q(j25, 1000000L, j28, roundingMode6);
                        if (jArr8 == null) {
                            AbstractC38065t.m121902P(jArr5, j28);
                            c26504q2 = new C26504q(c26502oM78565a, jArr6, iArr3, i39, jArr5, iArr2, jM121903Q3);
                        } else {
                            jArr9 = jArr5;
                            if (jArr8.length == 1) {
                                c34610p4 = c34610p3;
                                i47 = iMo15741c;
                            } else {
                                c34610p4 = c34610p3;
                                i47 = iMo15741c;
                            }
                            i48 = 1;
                            if (jArr8.length != 1) {
                                iArr4 = iArr2;
                                if (i46 == i48) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr5 = new int[jArr8.length];
                                iArr6 = new int[jArr8.length];
                                jArr7.getClass();
                                i49 = 0;
                                i54 = 0;
                                z18 = false;
                                i55 = 0;
                                while (i54 < jArr8.length) {
                                    iArr11 = iArr5;
                                    iArr12 = iArr6;
                                    j35 = jArr7[i54];
                                    if (j35 != -1) {
                                        i65 = i54;
                                        boolean z213 = z18;
                                        long jM121903Q111 = AbstractC38065t.m121903Q(jArr8[i54], c26502oM78565a.f105313c, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                        iArr13 = iArr11;
                                        iArr13[i65] = AbstractC38065t.m121911d(jArr9, j35, true);
                                        j36 = j35 + jM121903Q111;
                                        iArr12[i65] = AbstractC38065t.m121908a(jArr9, j36, z17);
                                        i66 = iArr13[i65];
                                        while (true) {
                                            i67 = iArr13[i65];
                                            if (i67 < 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr13[i65] = i67 - 1;
                                        }
                                        if (i67 < 0) {
                                            iArr13[i65] = i66;
                                            while (true) {
                                                i75 = iArr13[i65];
                                                if (i75 >= iArr12[i65]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr13[i65] = i75 + 1;
                                            }
                                        }
                                        if (i46 == 2) {
                                            while (true) {
                                                i69 = iArr12[i65];
                                                if (i69 < jArr9.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i74 = i69 + 1;
                                                if (jArr9[i74] <= j36) {
                                                    break;
                                                    break;
                                                }
                                                iArr12[i65] = i74;
                                            }
                                        }
                                        int i11113 = iArr12[i65];
                                        i68 = iArr13[i65];
                                        int i11114 = (i11113 - i68) + i55;
                                        if (i49 != i68) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        z27 = z213 | z28;
                                        i49 = i11113;
                                        i55 = i11114;
                                    } else {
                                        iArr13 = iArr11;
                                        i65 = i54;
                                        z27 = z18;
                                    }
                                    i54 = i65 + 1;
                                    iArr6 = iArr12;
                                    z18 = z27;
                                    iArr5 = iArr13;
                                }
                                iArr7 = iArr5;
                                iArr8 = iArr6;
                                boolean z38 = z18;
                                if (i55 != i47) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z24 = z38 | z19;
                                if (z24) {
                                    jArr10 = new long[i55];
                                } else {
                                    jArr10 = jArr6;
                                }
                                if (z24) {
                                    iArr9 = new int[i55];
                                } else {
                                    iArr9 = iArr3;
                                }
                                if (z24) {
                                    i39 = 0;
                                }
                                if (z24) {
                                    iArr10 = new int[i55];
                                } else {
                                    iArr10 = iArr4;
                                }
                                jArr11 = new long[i55];
                                i56 = 0;
                                z25 = false;
                                i57 = 0;
                                j29 = 0;
                                i58 = i39;
                                while (i56 < jArr8.length) {
                                    j34 = jArr7[i56];
                                    z26 = z24;
                                    i59 = iArr7[i56];
                                    long[] jArr116 = jArr8;
                                    i64 = iArr8[i56];
                                    jArr12 = jArr11;
                                    if (z26) {
                                        int i11115 = i64 - i59;
                                        System.arraycopy(jArr6, i59, jArr10, i57, i11115);
                                        System.arraycopy(iArr3, i59, iArr9, i57, i11115);
                                        System.arraycopy(iArr4, i59, iArr10, i57, i11115);
                                    }
                                    int i11116 = i58;
                                    while (i59 < i64) {
                                        int i11117 = i59;
                                        long[] jArr117 = jArr10;
                                        long j58 = c26502oM78565a.f105314d;
                                        RoundingMode roundingMode7 = RoundingMode.DOWN;
                                        long jM121903Q112 = AbstractC38065t.m121903Q(j29, 1000000L, j58, roundingMode7);
                                        jM121903Q4 = AbstractC38065t.m121903Q(jArr9[i11117] - j34, 1000000L, c26502oM78565a.f105313c, roundingMode7);
                                        if (jM121903Q4 < 0) {
                                            z25 = true;
                                        }
                                        jArr12[i57] = jM121903Q112 + jM121903Q4;
                                        if (!z26) {
                                        }
                                        i57++;
                                        i59 = i11117 + 1;
                                        jArr10 = jArr117;
                                    }
                                    j29 += jArr116[i56];
                                    i56++;
                                    i58 = i11116;
                                    z24 = z26;
                                    jArr8 = jArr116;
                                    jArr10 = jArr10;
                                    jArr11 = jArr12;
                                }
                                long[] jArr28 = jArr10;
                                long[] jArr29 = jArr11;
                                long jM121903Q113 = AbstractC38065t.m121903Q(j29, 1000000L, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                if (z25) {
                                    C34608o c34608oM109410a11 = c34610p4.m109410a();
                                    c34608oM109410a11.f145747s = true;
                                    c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a11));
                                }
                                arrayList3 = arrayList3;
                                c26504q = new C26504q(c26502oM78565a, jArr28, iArr9, i58, jArr29, iArr10, jM121903Q113);
                            } else if (jArr8[0] == 0) {
                                jArr7.getClass();
                                j37 = jArr7[0];
                                while (i76 < jArr9.length) {
                                    jArr9[i76] = AbstractC38065t.m121903Q(jArr9[i76] - j37, 1000000L, c26502oM78565a.f105313c, RoundingMode.DOWN);
                                }
                                arrayList3 = arrayList3;
                                c26504q = new C26504q(c26502oM78565a, jArr6, iArr3, i39, jArr9, iArr2, AbstractC38065t.m121903Q(j25 - j37, 1000000L, c26502oM78565a.f105313c, RoundingMode.DOWN));
                            } else {
                                i48 = 1;
                                iArr4 = iArr2;
                                if (i46 == i48) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr5 = new int[jArr8.length];
                                iArr6 = new int[jArr8.length];
                                jArr7.getClass();
                                i49 = 0;
                                i54 = 0;
                                z18 = false;
                                i55 = 0;
                                while (i54 < jArr8.length) {
                                    iArr11 = iArr5;
                                    iArr12 = iArr6;
                                    j35 = jArr7[i54];
                                    if (j35 != -1) {
                                        i65 = i54;
                                        boolean z214 = z18;
                                        long jM121903Q114 = AbstractC38065t.m121903Q(jArr8[i54], c26502oM78565a.f105313c, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                        iArr13 = iArr11;
                                        iArr13[i65] = AbstractC38065t.m121911d(jArr9, j35, true);
                                        j36 = j35 + jM121903Q114;
                                        iArr12[i65] = AbstractC38065t.m121908a(jArr9, j36, z17);
                                        i66 = iArr13[i65];
                                        while (true) {
                                            i67 = iArr13[i65];
                                            if (i67 < 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr13[i65] = i67 - 1;
                                        }
                                        if (i67 < 0) {
                                            iArr13[i65] = i66;
                                            while (true) {
                                                i75 = iArr13[i65];
                                                if (i75 >= iArr12[i65]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr13[i65] = i75 + 1;
                                            }
                                        }
                                        if (i46 == 2) {
                                            while (true) {
                                                i69 = iArr12[i65];
                                                if (i69 < jArr9.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i74 = i69 + 1;
                                                if (jArr9[i74] <= j36) {
                                                    break;
                                                    break;
                                                }
                                                iArr12[i65] = i74;
                                            }
                                        }
                                        int i11118 = iArr12[i65];
                                        i68 = iArr13[i65];
                                        int i11119 = (i11118 - i68) + i55;
                                        if (i49 != i68) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        z27 = z214 | z28;
                                        i49 = i11118;
                                        i55 = i11119;
                                    } else {
                                        iArr13 = iArr11;
                                        i65 = i54;
                                        z27 = z18;
                                    }
                                    i54 = i65 + 1;
                                    iArr6 = iArr12;
                                    z18 = z27;
                                    iArr5 = iArr13;
                                }
                                iArr7 = iArr5;
                                iArr8 = iArr6;
                                boolean z39 = z18;
                                if (i55 != i47) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z24 = z39 | z19;
                                if (z24) {
                                    jArr10 = new long[i55];
                                } else {
                                    jArr10 = jArr6;
                                }
                                if (z24) {
                                    iArr9 = new int[i55];
                                } else {
                                    iArr9 = iArr3;
                                }
                                if (z24) {
                                    i39 = 0;
                                }
                                if (z24) {
                                    iArr10 = new int[i55];
                                } else {
                                    iArr10 = iArr4;
                                }
                                jArr11 = new long[i55];
                                i56 = 0;
                                z25 = false;
                                i57 = 0;
                                j29 = 0;
                                i58 = i39;
                                while (i56 < jArr8.length) {
                                    j34 = jArr7[i56];
                                    z26 = z24;
                                    i59 = iArr7[i56];
                                    long[] jArr118 = jArr8;
                                    i64 = iArr8[i56];
                                    jArr12 = jArr11;
                                    if (z26) {
                                        int i111110 = i64 - i59;
                                        System.arraycopy(jArr6, i59, jArr10, i57, i111110);
                                        System.arraycopy(iArr3, i59, iArr9, i57, i111110);
                                        System.arraycopy(iArr4, i59, iArr10, i57, i111110);
                                    }
                                    int i111111 = i58;
                                    while (i59 < i64) {
                                        int i111112 = i59;
                                        long[] jArr119 = jArr10;
                                        long j59 = c26502oM78565a.f105314d;
                                        RoundingMode roundingMode8 = RoundingMode.DOWN;
                                        long jM121903Q115 = AbstractC38065t.m121903Q(j29, 1000000L, j59, roundingMode8);
                                        jM121903Q4 = AbstractC38065t.m121903Q(jArr9[i111112] - j34, 1000000L, c26502oM78565a.f105313c, roundingMode8);
                                        if (jM121903Q4 < 0) {
                                            z25 = true;
                                        }
                                        jArr12[i57] = jM121903Q115 + jM121903Q4;
                                        if (!z26) {
                                        }
                                        i57++;
                                        i59 = i111112 + 1;
                                        jArr10 = jArr119;
                                    }
                                    j29 += jArr118[i56];
                                    i56++;
                                    i58 = i111111;
                                    z24 = z26;
                                    jArr8 = jArr118;
                                    jArr10 = jArr10;
                                    jArr11 = jArr12;
                                }
                                long[] jArr210 = jArr10;
                                long[] jArr211 = jArr11;
                                long jM121903Q116 = AbstractC38065t.m121903Q(j29, 1000000L, c26502oM78565a.f105314d, RoundingMode.DOWN);
                                if (z25) {
                                    C34608o c34608oM109410a12 = c34610p4.m109410a();
                                    c34608oM109410a12.f145747s = true;
                                    c26502oM78565a = c26502oM78565a.m78565a(new C34610p(c34608oM109410a12));
                                }
                                arrayList3 = arrayList3;
                                c26504q = new C26504q(c26502oM78565a, jArr210, iArr9, i58, jArr211, iArr10, jM121903Q116);
                            }
                            arrayList3.add(c26504q);
                        }
                        c26504q = c26504q2;
                    }
                    arrayList3.add(c26504q);
                }
            }
            i77++;
            arrayList3 = arrayList3;
            arrayList2 = arrayList;
            c39308c2 = c39308c;
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:216:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:220:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:228:0x0505  */
    /* JADX WARN: Code duplicated, block: B:229:0x0514  */
    /* JADX WARN: Code duplicated, block: B:231:0x051a  */
    /* JADX WARN: Code duplicated, block: B:232:0x0529  */
    /* JADX WARN: Code duplicated, block: B:234:0x052f  */
    /* JADX WARN: Code duplicated, block: B:235:0x053f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0547  */
    /* JADX WARN: Code duplicated, block: B:239:0x0552  */
    /* JADX WARN: Code duplicated, block: B:243:0x0578  */
    /* JADX WARN: Code duplicated, block: B:244:0x057d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0587  */
    /* JADX WARN: Code duplicated, block: B:250:0x0591  */
    /* JADX WARN: Code duplicated, block: B:251:0x0594  */
    /* JADX WARN: Code duplicated, block: B:253:0x059b  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:261:0x05b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:268:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:271:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:273:0x05dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:280:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:281:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:283:0x0600  */
    /* JADX WARN: Code duplicated, block: B:348:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:423:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:216:0x04a2, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public static void m78541h(C38059n c38059n, int i13, int i14, int i15, int i16, String str, int i17, C34602l c34602l, C5057p c5057p, int i18) throws ParserException {
        String str2;
        int iM109387f;
        int i19;
        int i24;
        String str3;
        int i25;
        String str4;
        C34602l c34602l2;
        C29662f c29662f;
        int i26;
        int i27;
        List list;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int iM71632i;
        boolean zM71631h;
        int iM71632i2;
        int i37;
        int iM71632i3;
        int i38;
        int i39;
        boolean zM71631h2;
        int i44;
        int iM71632i4;
        boolean z4;
        int i45;
        int iM109388g;
        C34592g c34592g;
        int iM71632i5;
        int i46;
        C34592g c34592g2;
        int i47;
        String str5;
        C23548b c23548b;
        int i48;
        int i49 = i14;
        int i54 = i15;
        C34602l c34602lM109391b = c34602l;
        C5057p c5057p2 = c5057p;
        c38059n.m121846F(i49 + 16);
        c38059n.m121847G(16);
        int iM121873z = c38059n.m121873z();
        int iM121873z2 = c38059n.m121873z();
        c38059n.m121847G(50);
        int i55 = c38059n.f163018b;
        int iIntValue = i13;
        if (iIntValue == 1701733238) {
            Pair pairM78538e = m78538e(c38059n, i49, i54);
            if (pairM78538e != null) {
                iIntValue = ((Integer) pairM78538e.first).intValue();
                c34602lM109391b = c34602lM109391b == null ? null : c34602lM109391b.m109391b(((C26503p) pairM78538e.second).f105324b);
                ((C26503p[]) c5057p2.f21239d)[i18] = (C26503p) pairM78538e.second;
            }
            c38059n.m121846F(i55);
        }
        String str6 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fM121871x = 1.0f;
        List listM133256r = null;
        String str7 = null;
        byte[] bArrCopyOfRange = null;
        int i56 = -1;
        int i57 = -1;
        int i58 = -1;
        ByteBuffer byteBufferOrder = null;
        boolean z13 = false;
        int i59 = -1;
        int i64 = -1;
        int iM109388g2 = -1;
        int i65 = 8;
        int iM71632i6 = 8;
        C26488a c26488a = null;
        C0902h c0902h = null;
        C29662f c29662f2 = null;
        while (i55 - i49 < i54) {
            c38059n.m121846F(i55);
            int i66 = c38059n.f163018b;
            int iM121854g = c38059n.m121854g();
            if (iM121854g == 0 && c38059n.f163018b - i49 == i54) {
                break;
            }
            String str8 = "childAtomSize must be positive";
            AbstractC33618a.m106211c("childAtomSize must be positive", iM121854g > 0);
            int iM121854g2 = c38059n.m121854g();
            if (iM121854g2 == 1635148611) {
                AbstractC33618a.m106211c(null, str2 == null);
                c38059n.m121846F(i66 + 8);
                C33620b c33620bM106232a = C33620b.m106232a(c38059n);
                listM133256r = c33620bM106232a.f140330a;
                c5057p2.f21237b = c33620bM106232a.f140331b;
                if (!z13) {
                    fM121871x = c33620bM106232a.f140340k;
                }
                String str9 = c33620bM106232a.f140341l;
                int i67 = c33620bM106232a.f140339j;
                int i68 = c33620bM106232a.f140336g;
                int i69 = c33620bM106232a.f140337h;
                str7 = str9;
                int i74 = c33620bM106232a.f140338i;
                int i75 = c33620bM106232a.f140334e;
                iM71632i6 = c33620bM106232a.f140335f;
                i25 = i75;
                c34602l2 = c34602lM109391b;
                i24 = i55;
                iM109387f = i68;
                i27 = iIntValue;
                str3 = str6;
                i19 = i69;
                iM109388g2 = i74;
                str4 = "video/avc";
                i57 = i67;
            } else {
                int i76 = i55;
                if (iM121854g2 == 1752589123) {
                    AbstractC33618a.m106211c(null, str2 == null);
                    c38059n.m121846F(i66 + 8);
                    C33656y c33656yM106297a = C33656y.m106297a(c38059n, false, null);
                    listM133256r = c33656yM106297a.f140460a;
                    c5057p2.f21237b = c33656yM106297a.f140461b;
                    if (!z13) {
                        fM121871x = c33656yM106297a.f140469j;
                    }
                    int i77 = c33656yM106297a.f140470k;
                    int i78 = c33656yM106297a.f140462c;
                    String str10 = c33656yM106297a.f140471l;
                    int i79 = c33656yM106297a.f140468i;
                    if (i79 != -1) {
                        i56 = i79;
                    }
                    int i83 = c33656yM106297a.f140465f;
                    int i84 = c33656yM106297a.f140466g;
                    int i85 = c33656yM106297a.f140467h;
                    int i86 = c33656yM106297a.f140463d;
                    iM71632i6 = c33656yM106297a.f140464e;
                    c34602l2 = c34602lM109391b;
                    str4 = "video/hevc";
                    c29662f2 = c33656yM106297a.f140472m;
                    i27 = iIntValue;
                    str3 = str6;
                    i19 = i84;
                    iM109387f = i83;
                    iM109388g2 = i85;
                    i24 = i76;
                    i58 = i78;
                    i57 = i77;
                    i25 = i86;
                    str7 = str10;
                } else {
                    String str11 = str6;
                    if (iM121854g2 == 1818785347) {
                        AbstractC33618a.m106211c("lhvC must follow hvcC atom", "video/hevc".equals(str2));
                        C29662f c29662f3 = c29662f2;
                        AbstractC33618a.m106211c("must have at least two layers", c29662f3 != null && ((AbstractC41023g0) c29662f3.f121230x).size() >= 2);
                        c38059n.m121846F(i66 + 8);
                        c29662f3.getClass();
                        C33656y c33656yM106297a2 = C33656y.m106297a(c38059n, true, c29662f3);
                        AbstractC33618a.m106211c("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c5057p2.f21237b == c33656yM106297a2.f140461b);
                        int i87 = c33656yM106297a2.f140465f;
                        int i88 = i59;
                        if (i87 != -1) {
                            AbstractC33618a.m106211c("colorSpace must be the same for both views", i88 == i87);
                        }
                        int i89 = c33656yM106297a2.f140466g;
                        int i94 = i64;
                        if (i89 != -1) {
                            AbstractC33618a.m106211c("colorRange must be the same for both views", i94 == i89);
                        }
                        int i95 = c33656yM106297a2.f140467h;
                        if (i95 != -1) {
                            i48 = iM109388g2;
                            AbstractC33618a.m106211c("colorTransfer must be the same for both views", i48 == i95);
                        } else {
                            i48 = iM109388g2;
                        }
                        int i96 = i65;
                        int i97 = i48;
                        AbstractC33618a.m106211c("bitdepthLuma must be the same for both views", i96 == c33656yM106297a2.f140463d);
                        int i98 = iM71632i6;
                        AbstractC33618a.m106211c("bitdepthChroma must be the same for both views", i98 == c33656yM106297a2.f140464e);
                        if (listM133256r != null) {
                            C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                            c41014d0M133251l.m133224c(listM133256r);
                            c41014d0M133251l.m133224c(c33656yM106297a2.f140460a);
                            listM133256r = c41014d0M133251l.m133239f();
                        } else {
                            AbstractC33618a.m106211c("initializationData must be already set from hvcC atom", false);
                        }
                        String str12 = c33656yM106297a2.f140471l;
                        c29662f2 = c29662f3;
                        c34602l2 = c34602lM109391b;
                        str4 = "video/mv-hevc";
                        iM109387f = i88;
                        i27 = iIntValue;
                        iM109388g2 = i97;
                        i24 = i76;
                        str3 = str11;
                        iM71632i6 = i98;
                        str7 = str12;
                        i19 = i94;
                        i25 = i96;
                    } else {
                        iM109387f = i59;
                        i19 = i64;
                        iM109388g2 = iM109388g2;
                        c29662f2 = c29662f2;
                        i24 = i76;
                        str3 = str11;
                        i25 = i65;
                        iM71632i6 = iM71632i6;
                        str4 = str2;
                        if (iM121854g2 == 1986361461) {
                            c38059n.m121846F(i66 + 8);
                            int i99 = c38059n.f163018b;
                            C23548b c23548b2 = null;
                            while (i99 - i66 < iM121854g) {
                                c38059n.m121846F(i99);
                                int iM121854g3 = c38059n.m121854g();
                                int i100 = i99;
                                AbstractC33618a.m106211c(str8, iM121854g3 > 0);
                                if (c38059n.m121854g() == 1702454643) {
                                    c38059n.m121846F(i100 + 8);
                                    int i101 = c38059n.f163018b;
                                    while (true) {
                                        if (i101 - i100 >= iM121854g3) {
                                            str5 = str8;
                                            c23548b = null;
                                            break;
                                        }
                                        c38059n.m121846F(i101);
                                        int iM121854g4 = c38059n.m121854g();
                                        AbstractC33618a.m106211c(str8, iM121854g4 > 0);
                                        str5 = str8;
                                        if (c38059n.m121854g() == 1937011305) {
                                            c38059n.m121847G(4);
                                            int iM121867t = c38059n.m121867t();
                                            boolean z14 = (iM121867t & 1) == 1;
                                            boolean z15 = (iM121867t & 2) == 2;
                                            boolean z16 = (iM121867t & 8) == 8;
                                            C11789f c11789f = new C11789f();
                                            c11789f.f38230a = z14;
                                            c11789f.f38231b = z15;
                                            c11789f.f38232c = z16;
                                            c23548b = new C23548b(c11789f, 14);
                                            break;
                                        }
                                        i101 += iM121854g4;
                                        str8 = str5;
                                    }
                                    c23548b2 = c23548b;
                                } else {
                                    str5 = str8;
                                    c34602lM109391b = c34602lM109391b;
                                    iM121854g3 = iM121854g3;
                                }
                                i99 = i100 + iM121854g3;
                                str8 = str5;
                                c34602lM109391b = c34602lM109391b;
                            }
                            c34602l2 = c34602lM109391b;
                            C23548b c23548b3 = c23548b2 == null ? null : new C23548b(c23548b2, 15);
                            if (c23548b3 != null) {
                                C11789f c11789f2 = (C11789f) ((C23548b) c23548b3.f93280x).f93280x;
                                if (c29662f2 == null || ((AbstractC41023g0) c29662f2.f121230x).size() < 2) {
                                    i47 = i56;
                                    if (i47 == -1) {
                                        i56 = c11789f2.f38232c ? 5 : 4;
                                    } else {
                                        i56 = i47;
                                    }
                                } else {
                                    AbstractC33618a.m106211c("both eye views must be marked as available", c11789f2.f38230a && c11789f2.f38231b);
                                    AbstractC33618a.m106211c("for MV-HEVC, eye_views_reversed must be set to false", !c11789f2.f38232c);
                                    i47 = i56;
                                    i56 = i47;
                                }
                            } else {
                                i47 = i56;
                                i56 = i47;
                            }
                        } else {
                            c34602l2 = c34602lM109391b;
                            int i102 = i56;
                            if (iM121854g2 == 1685480259 || iM121854g2 == 1685485123) {
                                c29662f = c29662f2;
                                i26 = i102;
                                i27 = iIntValue;
                                list = listM133256r;
                                i28 = iM109388g2;
                                C11856j0 c11856j0M31816l = C11856j0.m31816l(c38059n);
                                if (c11856j0M31816l != null) {
                                    str7 = c11856j0M31816l.f38685x;
                                    str4 = "video/dolby-vision";
                                }
                            } else {
                                int i103 = 11;
                                int i104 = 7;
                                int i105 = 12;
                                if (iM121854g2 == 1987076931) {
                                    AbstractC33618a.m106211c(null, str4 == null);
                                    String str13 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c38059n.m121846F(i66 + 12);
                                    byte bM121867t = (byte) c38059n.m121867t();
                                    byte bM121867t2 = (byte) c38059n.m121867t();
                                    int iM121867t2 = c38059n.m121867t();
                                    int i106 = iM121867t2 >> 4;
                                    byte b = (byte) ((iM121867t2 >> 1) & 7);
                                    if (str13.equals("video/x-vnd.on2.vp9")) {
                                        byte[] bArr = AbstractC38047b.f162977a;
                                        listM133256r = AbstractC41023g0.m133256r(new byte[]{1, 1, bM121867t, 2, 1, bM121867t2, 3, 1, (byte) i106, 4, 1, b});
                                    }
                                    boolean z17 = (iM121867t2 & 1) != 0;
                                    int iM121867t3 = c38059n.m121867t();
                                    int iM121867t4 = c38059n.m121867t();
                                    iM109387f = C34592g.m109387f(iM121867t3);
                                    int i107 = z17 ? 1 : 2;
                                    iM109388g2 = C34592g.m109388g(iM121867t4);
                                    str4 = str13;
                                    c29662f2 = c29662f2;
                                    i56 = i102;
                                    i27 = iIntValue;
                                    i25 = i106;
                                    iM71632i6 = i25;
                                    i19 = i107;
                                } else if (iM121854g2 == 1635135811) {
                                    int i108 = iM121854g - 8;
                                    byte[] bArr2 = new byte[i108];
                                    c38059n.m121852e(bArr2, 0, i108);
                                    C41060w0 c41060w0M133256r = AbstractC41023g0.m133256r(bArr2);
                                    c38059n.m121846F(i66 + 8);
                                    byte[] bArr3 = c38059n.f163017a;
                                    C24561s c24561s = new C24561s(bArr3, bArr3.length, 5, (byte) 0);
                                    c24561s.m71640q(c38059n.f163018b * 8);
                                    c24561s.m71644u(1);
                                    int iM71632i7 = c24561s.m71632i(3);
                                    c24561s.m71643t(6);
                                    boolean zM71631h3 = c24561s.m71631h();
                                    boolean zM71631h4 = c24561s.m71631h();
                                    int i109 = -1;
                                    if (iM71632i7 == 2 && zM71631h3) {
                                        int i110 = zM71631h4 ? 12 : 10;
                                        i36 = zM71631h4 ? 12 : 10;
                                        i34 = i110;
                                    } else {
                                        if (iM71632i7 <= 2) {
                                            int i111 = zM71631h3 ? 10 : 8;
                                            i36 = zM71631h3 ? 10 : 8;
                                            i34 = i111;
                                        } else {
                                            i34 = -1;
                                            i35 = -1;
                                        }
                                        c24561s.m71643t(13);
                                        c24561s.m71642s();
                                        iM71632i = c24561s.m71632i(4);
                                        if (iM71632i != 1) {
                                            AbstractC38046a.m121818m("BoxParsers", "Unsupported obu_type: " + iM71632i);
                                            c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                        } else if (c24561s.m71631h()) {
                                            AbstractC38046a.m121818m("BoxParsers", "Unsupported obu_extension_flag");
                                            c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                        } else {
                                            zM71631h = c24561s.m71631h();
                                            c24561s.m71642s();
                                            if (zM71631h || c24561s.m71632i(8) <= 127) {
                                                iM71632i2 = c24561s.m71632i(3);
                                                c24561s.m71642s();
                                                if (c24561s.m71631h()) {
                                                    AbstractC38046a.m121818m("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                                } else if (c24561s.m71631h()) {
                                                    AbstractC38046a.m121818m("BoxParsers", "Unsupported timing_info_present_flag");
                                                    c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                                } else {
                                                    if (c24561s.m71631h()) {
                                                        AbstractC38046a.m121818m("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                                    } else {
                                                        i37 = 5;
                                                        iM71632i3 = c24561s.m71632i(5);
                                                        i38 = 0;
                                                        while (i38 <= iM71632i3) {
                                                            c24561s.m71643t(i105);
                                                            if (c24561s.m71632i(i37) > i104) {
                                                                c24561s.m71642s();
                                                            }
                                                            i38++;
                                                            i37 = 5;
                                                            i105 = 12;
                                                            i104 = 7;
                                                        }
                                                        int iM71632i8 = c24561s.m71632i(4);
                                                        int iM71632i9 = c24561s.m71632i(4);
                                                        c24561s.m71643t(iM71632i8 + 1);
                                                        c24561s.m71643t(iM71632i9 + 1);
                                                        if (c24561s.m71631h()) {
                                                            i39 = 7;
                                                            c24561s.m71643t(7);
                                                        } else {
                                                            i39 = 7;
                                                        }
                                                        c24561s.m71643t(i39);
                                                        zM71631h2 = c24561s.m71631h();
                                                        if (zM71631h2) {
                                                            c24561s.m71643t(2);
                                                        }
                                                        if (c24561s.m71631h()) {
                                                            iM71632i4 = 2;
                                                            i44 = 1;
                                                        } else {
                                                            i44 = 1;
                                                            iM71632i4 = c24561s.m71632i(1);
                                                        }
                                                        if (iM71632i4 > 0 && !c24561s.m71631h()) {
                                                            c24561s.m71643t(i44);
                                                        }
                                                        if (zM71631h2) {
                                                            c24561s.m71643t(3);
                                                        }
                                                        c24561s.m71643t(3);
                                                        boolean zM71631h5 = c24561s.m71631h();
                                                        if (iM71632i2 == 2 && zM71631h5) {
                                                            c24561s.m71642s();
                                                        }
                                                        if (iM71632i2 == 1 && c24561s.m71631h()) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (c24561s.m71631h()) {
                                                            int iM71632i10 = c24561s.m71632i(8);
                                                            int iM71632i11 = c24561s.m71632i(8);
                                                            int iM71632i12 = c24561s.m71632i(8);
                                                            if (z4 && iM71632i10 == 1 && iM71632i11 == 13 && iM71632i12 == 0) {
                                                                iM71632i5 = 1;
                                                            } else {
                                                                iM71632i5 = c24561s.m71632i(1);
                                                            }
                                                            int iM109387f2 = C34592g.m109387f(iM71632i10);
                                                            if (iM71632i5 == 1) {
                                                                i46 = 1;
                                                            } else {
                                                                i46 = 2;
                                                            }
                                                            i45 = iM109387f2;
                                                            iM109388g = C34592g.m109388g(iM71632i11);
                                                            i109 = i46;
                                                        } else {
                                                            i45 = -1;
                                                            iM109388g = -1;
                                                        }
                                                        c34592g = new C34592g(i45, i109, iM109388g, i34, i35, null);
                                                    }
                                                    int i112 = c34592g.f145662e;
                                                    int i113 = c34592g.f145663f;
                                                    int i114 = c34592g.f145658a;
                                                    int i115 = c34592g.f145659b;
                                                    listM133256r = c41060w0M133256r;
                                                    c29662f2 = c29662f2;
                                                    i56 = i102;
                                                    iM109388g2 = c34592g.f145660c;
                                                    str4 = "video/av01";
                                                    i25 = i112;
                                                    iM71632i6 = i113;
                                                    i27 = iIntValue;
                                                    iM109387f = i114;
                                                    i19 = i115;
                                                }
                                            } else {
                                                AbstractC38046a.m121818m("BoxParsers", "Excessive obu_size");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            }
                                        }
                                        c34592g = c34592g2;
                                        int i116 = c34592g.f145662e;
                                        int i117 = c34592g.f145663f;
                                        int i118 = c34592g.f145658a;
                                        int i119 = c34592g.f145659b;
                                        listM133256r = c41060w0M133256r;
                                        c29662f2 = c29662f2;
                                        i56 = i102;
                                        iM109388g2 = c34592g.f145660c;
                                        str4 = "video/av01";
                                        i25 = i116;
                                        iM71632i6 = i117;
                                        i27 = iIntValue;
                                        iM109387f = i118;
                                        i19 = i119;
                                    }
                                    i35 = i36;
                                    c24561s.m71643t(13);
                                    c24561s.m71642s();
                                    iM71632i = c24561s.m71632i(4);
                                    if (iM71632i != 1) {
                                        AbstractC38046a.m121818m("BoxParsers", "Unsupported obu_type: " + iM71632i);
                                        c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                    } else if (c24561s.m71631h()) {
                                        AbstractC38046a.m121818m("BoxParsers", "Unsupported obu_extension_flag");
                                        c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                    } else {
                                        zM71631h = c24561s.m71631h();
                                        c24561s.m71642s();
                                        if (zM71631h) {
                                            iM71632i2 = c24561s.m71632i(3);
                                            c24561s.m71642s();
                                            if (c24561s.m71631h()) {
                                                AbstractC38046a.m121818m("BoxParsers", "Unsupported reduced_still_picture_header");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            } else if (c24561s.m71631h()) {
                                                AbstractC38046a.m121818m("BoxParsers", "Unsupported timing_info_present_flag");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            } else if (c24561s.m71631h()) {
                                                AbstractC38046a.m121818m("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            } else {
                                                i37 = 5;
                                                iM71632i3 = c24561s.m71632i(5);
                                                i38 = 0;
                                                while (i38 <= iM71632i3) {
                                                    c24561s.m71643t(i105);
                                                    if (c24561s.m71632i(i37) > i104) {
                                                        c24561s.m71642s();
                                                    }
                                                    i38++;
                                                    i37 = 5;
                                                    i105 = 12;
                                                    i104 = 7;
                                                }
                                                int iM71632i13 = c24561s.m71632i(4);
                                                int iM71632i14 = c24561s.m71632i(4);
                                                c24561s.m71643t(iM71632i13 + 1);
                                                c24561s.m71643t(iM71632i14 + 1);
                                                if (c24561s.m71631h()) {
                                                    i39 = 7;
                                                    c24561s.m71643t(7);
                                                } else {
                                                    i39 = 7;
                                                }
                                                c24561s.m71643t(i39);
                                                zM71631h2 = c24561s.m71631h();
                                                if (zM71631h2) {
                                                    c24561s.m71643t(2);
                                                }
                                                if (c24561s.m71631h()) {
                                                    iM71632i4 = 2;
                                                    i44 = 1;
                                                } else {
                                                    i44 = 1;
                                                    iM71632i4 = c24561s.m71632i(1);
                                                }
                                                if (iM71632i4 > 0) {
                                                    c24561s.m71643t(i44);
                                                }
                                                if (zM71631h2) {
                                                    c24561s.m71643t(3);
                                                }
                                                c24561s.m71643t(3);
                                                boolean zM71631h6 = c24561s.m71631h();
                                                if (iM71632i2 == 2) {
                                                    c24561s.m71642s();
                                                }
                                                if (iM71632i2 == 1) {
                                                    z4 = false;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (c24561s.m71631h()) {
                                                    int iM71632i15 = c24561s.m71632i(8);
                                                    int iM71632i16 = c24561s.m71632i(8);
                                                    int iM71632i17 = c24561s.m71632i(8);
                                                    if (z4) {
                                                        iM71632i5 = c24561s.m71632i(1);
                                                    } else {
                                                        iM71632i5 = c24561s.m71632i(1);
                                                    }
                                                    int iM109387f3 = C34592g.m109387f(iM71632i15);
                                                    if (iM71632i5 == 1) {
                                                        i46 = 1;
                                                    } else {
                                                        i46 = 2;
                                                    }
                                                    i45 = iM109387f3;
                                                    iM109388g = C34592g.m109388g(iM71632i16);
                                                    i109 = i46;
                                                } else {
                                                    i45 = -1;
                                                    iM109388g = -1;
                                                }
                                                c34592g = new C34592g(i45, i109, iM109388g, i34, i35, null);
                                            }
                                        } else {
                                            iM71632i2 = c24561s.m71632i(3);
                                            c24561s.m71642s();
                                            if (c24561s.m71631h()) {
                                                AbstractC38046a.m121818m("BoxParsers", "Unsupported reduced_still_picture_header");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            } else if (c24561s.m71631h()) {
                                                AbstractC38046a.m121818m("BoxParsers", "Unsupported timing_info_present_flag");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            } else if (c24561s.m71631h()) {
                                                AbstractC38046a.m121818m("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                c34592g2 = new C34592g(-1, -1, -1, i34, i35, null);
                                            } else {
                                                i37 = 5;
                                                iM71632i3 = c24561s.m71632i(5);
                                                i38 = 0;
                                                while (i38 <= iM71632i3) {
                                                    c24561s.m71643t(i105);
                                                    if (c24561s.m71632i(i37) > i104) {
                                                        c24561s.m71642s();
                                                    }
                                                    i38++;
                                                    i37 = 5;
                                                    i105 = 12;
                                                    i104 = 7;
                                                }
                                                int iM71632i18 = c24561s.m71632i(4);
                                                int iM71632i19 = c24561s.m71632i(4);
                                                c24561s.m71643t(iM71632i18 + 1);
                                                c24561s.m71643t(iM71632i19 + 1);
                                                if (c24561s.m71631h()) {
                                                    i39 = 7;
                                                    c24561s.m71643t(7);
                                                } else {
                                                    i39 = 7;
                                                }
                                                c24561s.m71643t(i39);
                                                zM71631h2 = c24561s.m71631h();
                                                if (zM71631h2) {
                                                    c24561s.m71643t(2);
                                                }
                                                if (c24561s.m71631h()) {
                                                    iM71632i4 = 2;
                                                    i44 = 1;
                                                } else {
                                                    i44 = 1;
                                                    iM71632i4 = c24561s.m71632i(1);
                                                }
                                                if (iM71632i4 > 0) {
                                                    c24561s.m71643t(i44);
                                                }
                                                if (zM71631h2) {
                                                    c24561s.m71643t(3);
                                                }
                                                c24561s.m71643t(3);
                                                boolean zM71631h7 = c24561s.m71631h();
                                                if (iM71632i2 == 2) {
                                                    c24561s.m71642s();
                                                }
                                                if (iM71632i2 == 1) {
                                                    z4 = false;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (c24561s.m71631h()) {
                                                    int iM71632i110 = c24561s.m71632i(8);
                                                    int iM71632i111 = c24561s.m71632i(8);
                                                    int iM71632i112 = c24561s.m71632i(8);
                                                    if (z4) {
                                                        iM71632i5 = c24561s.m71632i(1);
                                                    } else {
                                                        iM71632i5 = c24561s.m71632i(1);
                                                    }
                                                    int iM109387f4 = C34592g.m109387f(iM71632i110);
                                                    if (iM71632i5 == 1) {
                                                        i46 = 1;
                                                    } else {
                                                        i46 = 2;
                                                    }
                                                    i45 = iM109387f4;
                                                    iM109388g = C34592g.m109388g(iM71632i111);
                                                    i109 = i46;
                                                } else {
                                                    i45 = -1;
                                                    iM109388g = -1;
                                                }
                                                c34592g = new C34592g(i45, i109, iM109388g, i34, i35, null);
                                            }
                                        }
                                        int i1110 = c34592g.f145662e;
                                        int i1111 = c34592g.f145663f;
                                        int i1112 = c34592g.f145658a;
                                        int i1113 = c34592g.f145659b;
                                        listM133256r = c41060w0M133256r;
                                        c29662f2 = c29662f2;
                                        i56 = i102;
                                        iM109388g2 = c34592g.f145660c;
                                        str4 = "video/av01";
                                        i25 = i1110;
                                        iM71632i6 = i1111;
                                        i27 = iIntValue;
                                        iM109387f = i1112;
                                        i19 = i1113;
                                    }
                                    c34592g = c34592g2;
                                    int i1114 = c34592g.f145662e;
                                    int i1115 = c34592g.f145663f;
                                    int i1116 = c34592g.f145658a;
                                    int i1117 = c34592g.f145659b;
                                    listM133256r = c41060w0M133256r;
                                    c29662f2 = c29662f2;
                                    i56 = i102;
                                    iM109388g2 = c34592g.f145660c;
                                    str4 = "video/av01";
                                    i25 = i1114;
                                    iM71632i6 = i1115;
                                    i27 = iIntValue;
                                    iM109387f = i1116;
                                    i19 = i1117;
                                } else if (iM121854g2 == 1668050025) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer = byteBufferOrder;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(c38059n.m121864q());
                                    byteBuffer.putShort(c38059n.m121864q());
                                    byteBufferOrder = byteBuffer;
                                    i56 = i102;
                                } else {
                                    if (iM121854g2 == 1835295606) {
                                        if (byteBufferOrder == null) {
                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferOrder;
                                        short sM121864q = c38059n.m121864q();
                                        short sM121864q2 = c38059n.m121864q();
                                        short sM121864q3 = c38059n.m121864q();
                                        short sM121864q4 = c38059n.m121864q();
                                        short sM121864q5 = c38059n.m121864q();
                                        c29662f = c29662f2;
                                        short sM121864q6 = c38059n.m121864q();
                                        i27 = iIntValue;
                                        short sM121864q7 = c38059n.m121864q();
                                        list = listM133256r;
                                        short sM121864q8 = c38059n.m121864q();
                                        long jM121869v = c38059n.m121869v();
                                        long jM121869v2 = c38059n.m121869v();
                                        i26 = i102;
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(sM121864q5);
                                        byteBuffer2.putShort(sM121864q6);
                                        byteBuffer2.putShort(sM121864q);
                                        byteBuffer2.putShort(sM121864q2);
                                        byteBuffer2.putShort(sM121864q3);
                                        byteBuffer2.putShort(sM121864q4);
                                        byteBuffer2.putShort(sM121864q7);
                                        byteBuffer2.putShort(sM121864q8);
                                        byteBuffer2.putShort((short) (jM121869v / ChatClient.RESOLVE_DEPENDENCY_TIMEOUT));
                                        byteBuffer2.putShort((short) (jM121869v2 / ChatClient.RESOLVE_DEPENDENCY_TIMEOUT));
                                        byteBufferOrder = byteBuffer2;
                                    } else {
                                        c29662f = c29662f2;
                                        i26 = i102;
                                        i27 = iIntValue;
                                        list = listM133256r;
                                        if (iM121854g2 == 1681012275) {
                                            AbstractC33618a.m106211c(null, str4 == null);
                                            c29662f2 = c29662f;
                                            str4 = str3;
                                            listM133256r = list;
                                            i56 = i26;
                                        } else if (iM121854g2 == 1702061171) {
                                            AbstractC33618a.m106211c(null, str4 == null);
                                            C0902h c0902hM78534a = m78534a(i66, c38059n);
                                            String str14 = (String) c0902hM78534a.f3297z;
                                            byte[] bArr4 = (byte[]) c0902hM78534a.f3293E;
                                            listM133256r = bArr4 != null ? AbstractC41023g0.m133256r(bArr4) : list;
                                            c0902h = c0902hM78534a;
                                            str4 = str14;
                                            c29662f2 = c29662f;
                                            iM71632i6 = iM71632i6;
                                            i56 = i26;
                                        } else if (iM121854g2 == 1651798644) {
                                            c38059n.m121846F(i66 + 8);
                                            c38059n.m121847G(4);
                                            c26488a = new C26488a(c38059n.m121869v(), c38059n.m121869v());
                                        } else if (iM121854g2 == 1885434736) {
                                            c38059n.m121846F(i66 + 8);
                                            fM121871x = c38059n.m121871x() / c38059n.m121871x();
                                            c29662f2 = c29662f;
                                            iM71632i6 = iM71632i6;
                                            iM109388g2 = iM109388g2;
                                            listM133256r = list;
                                            i56 = i26;
                                            z13 = true;
                                        } else if (iM121854g2 == 1937126244) {
                                            int i120 = i66 + 8;
                                            while (true) {
                                                if (i120 - i66 >= iM121854g) {
                                                    bArrCopyOfRange = null;
                                                    break;
                                                }
                                                c38059n.m121846F(i120);
                                                int iM121854g5 = c38059n.m121854g();
                                                if (c38059n.m121854g() == 1886547818) {
                                                    bArrCopyOfRange = Arrays.copyOfRange(c38059n.f163017a, i120, iM121854g5 + i120);
                                                    break;
                                                }
                                                i120 += iM121854g5;
                                            }
                                        } else if (iM121854g2 == 1936995172) {
                                            int iM121867t5 = c38059n.m121867t();
                                            c38059n.m121847G(3);
                                            if (iM121867t5 != 0) {
                                                i29 = i26;
                                            } else {
                                                int iM121867t6 = c38059n.m121867t();
                                                if (iM121867t6 == 0) {
                                                    i29 = 0;
                                                } else if (iM121867t6 == 1) {
                                                    i29 = 1;
                                                } else if (iM121867t6 == 2) {
                                                    i29 = 2;
                                                } else if (iM121867t6 != 3) {
                                                    i29 = i26;
                                                } else {
                                                    i29 = 3;
                                                }
                                            }
                                            c29662f2 = c29662f;
                                            i56 = i29;
                                            iM71632i6 = iM71632i6;
                                            iM109388g2 = iM109388g2;
                                            listM133256r = list;
                                        } else if (iM121854g2 == 1634760259) {
                                            int i121 = iM121854g - 12;
                                            byte[] bArr5 = new byte[i121];
                                            c38059n.m121846F(i66 + 12);
                                            int i122 = 0;
                                            c38059n.m121852e(bArr5, 0, i121);
                                            C41060w0 c41060w0M133256r2 = AbstractC41023g0.m133256r(bArr5);
                                            C38059n c38059n2 = new C38059n(bArr5);
                                            C24561s c24561s2 = new C24561s(bArr5, i121, 5, (byte) 0);
                                            c24561s2.m71640q(c38059n2.f163018b * 8);
                                            c24561s2.m71644u(1);
                                            int iM71632i20 = c24561s2.m71632i(8);
                                            int i123 = 0;
                                            int i124 = -1;
                                            int i125 = -1;
                                            int i126 = -1;
                                            int i127 = -1;
                                            iM71632i6 = -1;
                                            while (i123 < iM71632i20) {
                                                c24561s2.m71644u(1);
                                                int iM71632i21 = c24561s2.m71632i(8);
                                                int iM109388g3 = i126;
                                                int i128 = i125;
                                                int iM109387f5 = i124;
                                                int i129 = i122;
                                                while (i129 < iM71632i21) {
                                                    c24561s2.m71643t(6);
                                                    boolean zM71631h8 = c24561s2.m71631h();
                                                    c24561s2.m71642s();
                                                    c24561s2.m71644u(i103);
                                                    c24561s2.m71643t(4);
                                                    iM71632i6 = c24561s2.m71632i(4) + 8;
                                                    c24561s2.m71644u(1);
                                                    if (zM71631h8) {
                                                        int iM71632i22 = c24561s2.m71632i(8);
                                                        int iM71632i23 = c24561s2.m71632i(8);
                                                        c24561s2.m71644u(1);
                                                        boolean zM71631h9 = c24561s2.m71631h();
                                                        iM109387f5 = C34592g.m109387f(iM71632i22);
                                                        int i130 = zM71631h9 ? 1 : 2;
                                                        iM109388g3 = C34592g.m109388g(iM71632i23);
                                                        i128 = i130;
                                                    }
                                                    i129++;
                                                    i127 = iM71632i6;
                                                    i103 = 11;
                                                }
                                                i123++;
                                                i124 = iM109387f5;
                                                i125 = i128;
                                                i126 = iM109388g3;
                                                i122 = 0;
                                                i103 = 11;
                                            }
                                            listM133256r = c41060w0M133256r2;
                                            iM109387f = i124;
                                            i19 = i125;
                                            iM109388g2 = i126;
                                            c29662f2 = c29662f;
                                            i25 = i127;
                                            i56 = i26;
                                            str4 = "video/apv";
                                        } else if (iM121854g2 == 1668246642) {
                                            i28 = iM109388g2;
                                            if (iM109387f == -1 && i28 == -1) {
                                                int iM121854g6 = c38059n.m121854g();
                                                if (iM121854g6 == 1852009592 || iM121854g6 == 1852009571) {
                                                    int iM121873z3 = c38059n.m121873z();
                                                    int iM121873z4 = c38059n.m121873z();
                                                    c38059n.m121847G(2);
                                                    boolean z18 = iM121854g == 19 && (c38059n.m121867t() & 128) != 0;
                                                    int iM109387f6 = C34592g.m109387f(iM121873z3);
                                                    int i131 = z18 ? 1 : 2;
                                                    iM109388g2 = C34592g.m109388g(iM121873z4);
                                                    iM109387f = iM109387f6;
                                                    i19 = i131;
                                                } else {
                                                    AbstractC38046a.m121826u("BoxParsers", "Unsupported color type: " + AbstractC0576a.m1493e(iM121854g6));
                                                }
                                            }
                                            c29662f2 = c29662f;
                                            iM71632i6 = iM71632i6;
                                            listM133256r = list;
                                            i56 = i26;
                                        } else {
                                            i28 = iM109388g2;
                                        }
                                    }
                                    c29662f2 = c29662f;
                                    listM133256r = list;
                                    i56 = i26;
                                }
                            }
                            iM109388g2 = i28;
                            c29662f2 = c29662f;
                            iM71632i6 = iM71632i6;
                            listM133256r = list;
                            i56 = i26;
                        }
                        i27 = iIntValue;
                        iM71632i6 = iM71632i6;
                        iM109388g2 = iM109388g2;
                    }
                }
            }
            int i132 = i24 + iM121854g;
            i54 = i15;
            c5057p2 = c5057p;
            i59 = iM109387f;
            str6 = str3;
            str2 = str4;
            iIntValue = i27;
            c34602lM109391b = c34602l2;
            i55 = i132;
            i65 = i25;
            i64 = i19;
            i49 = i14;
        }
        C34602l c34602l3 = c34602lM109391b;
        List list2 = listM133256r;
        int i133 = i56;
        int i134 = i59;
        int i135 = i64;
        int i136 = iM109388g2;
        int i137 = i65;
        int i138 = iM71632i6;
        String str15 = str2;
        if (str15 == null) {
            return;
        }
        C34608o c34608o = new C34608o();
        c34608o.f145729a = Integer.toString(i16);
        c34608o.f145741m = AbstractC34587d0.m109382o(str15);
        c34608o.f145738j = str7;
        c34608o.f145748t = iM121873z;
        c34608o.f145749u = iM121873z2;
        c34608o.f145752x = fM121871x;
        c34608o.f145751w = i17;
        c34608o.f145753y = bArrCopyOfRange;
        c34608o.f145754z = i133;
        c34608o.f145744p = list2;
        c34608o.f145743o = i57;
        c34608o.f145718B = i58;
        c34608o.f145745q = c34602l3;
        c34608o.f145732d = str;
        c34608o.f145717A = new C34592g(i134, i135, i136, i137, i138, byteBufferOrder != null ? byteBufferOrder.array() : null);
        C26488a c26488a2 = c26488a;
        if (c26488a2 != null) {
            c34608o.f145736h = AbstractC35903f.m113994L(c26488a2.f105201a);
            c34608o.f145737i = AbstractC35903f.m113994L(c26488a2.f105202b);
        } else {
            C0902h c0902h2 = c0902h;
            if (c0902h2 != null) {
                c34608o.f145736h = AbstractC35903f.m113994L(c0902h2.f3295x);
                c34608o.f145737i = AbstractC35903f.m113994L(c0902h2.f3296y);
            }
        }
        c5057p.f21240e = new C34610p(c34608o);
    }
}

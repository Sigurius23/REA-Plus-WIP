package p477s2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c41.C4010d4;
import c93.InterfaceC4339a;
import d13.AbstractC11478a;
import d40.AbstractC11673r;
import d40.C11671p;
import gf.C15760a;
import h00.C16521p0;
import j93.InterfaceC21467g;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p025b1.AbstractC2218i;
import p025b1.C2212c;
import p026b2.C2299e;
import p043c4.C3966j0;
import p163g1.C14991e0;
import p163g1.C15069l3;
import p208i2.C17924z0;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p335n6.C26385b;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p474s.AbstractC32004s;
import p478s3.C32096b;
import p501te.C33738c;
import p530up.AbstractC35148d;
import p545v6.C35712a;
import p545v6.C35713b;
import p545v6.C35716e;
import p545v6.C35728q;
import p545v6.C35729r;
import p545v6.C35731t;
import p566vz.InterfaceC36611c;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p599wz.C37722h1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p667z0.AbstractC39926h;
import p667z0.AbstractC39927i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import ug.C34913b;
import ug.C34919h;
import uz1.C35429g;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x30.C37885e1;
import x30.C37888f1;
import yb3.AbstractC39401e;
import zb3.C40261a;

/* JADX INFO: renamed from: s2.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32069a {
    /* JADX INFO: renamed from: A */
    public static byte[] m99659A(int i13) {
        return new byte[]{(byte) (i13 >>> 24), (byte) ((i13 >>> 16) & 255), (byte) ((i13 >>> 8) & 255), (byte) (i13 & 255)};
    }

    /* JADX INFO: renamed from: B */
    public static final C40261a m99660B(String str) {
        int i13 = 0;
        long j7 = 0;
        while (true) {
            if (i13 < 16) {
                long j13 = j7 << 4;
                char cCharAt = str.charAt(i13);
                if ((cCharAt >>> '\b') == 0) {
                    long j14 = AbstractC39401e.f169564c[cCharAt];
                    if (j14 >= 0) {
                        j7 = j13 | j14;
                        i13++;
                    }
                }
                m99662D(i13, str, "a hexadecimal digit");
                throw null;
            }
            long j15 = 0;
            for (int i14 = 16; i14 < 32; i14++) {
                long j16 = j15 << 4;
                char cCharAt2 = str.charAt(i14);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j17 = AbstractC39401e.f169564c[cCharAt2];
                    if (j17 >= 0) {
                        j15 = j16 | j17;
                    }
                }
                m99662D(i14, str, "a hexadecimal digit");
                throw null;
            }
            return (j7 == 0 && j15 == 0) ? C40261a.f174164y : new C40261a(j7, j15);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final C40261a m99661C(String str) {
        long j7 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            long j13 = j7 << 4;
            char cCharAt = str.charAt(i13);
            if ((cCharAt >>> '\b') == 0) {
                long j14 = AbstractC39401e.f169564c[cCharAt];
                if (j14 >= 0) {
                    j7 = j13 | j14;
                }
            }
            m99662D(i13, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(8) != '-') {
            m99662D(8, str, "'-' (hyphen)");
            throw null;
        }
        long j15 = 0;
        for (int i14 = 9; i14 < 13; i14++) {
            long j16 = j15 << 4;
            char cCharAt2 = str.charAt(i14);
            if ((cCharAt2 >>> '\b') == 0) {
                long j17 = AbstractC39401e.f169564c[cCharAt2];
                if (j17 >= 0) {
                    j15 = j16 | j17;
                }
            }
            m99662D(i14, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(13) != '-') {
            m99662D(13, str, "'-' (hyphen)");
            throw null;
        }
        long j18 = 0;
        for (int i15 = 14; i15 < 18; i15++) {
            long j19 = j18 << 4;
            char cCharAt3 = str.charAt(i15);
            if ((cCharAt3 >>> '\b') == 0) {
                long j24 = AbstractC39401e.f169564c[cCharAt3];
                if (j24 >= 0) {
                    j18 = j19 | j24;
                }
            }
            m99662D(i15, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(18) != '-') {
            m99662D(18, str, "'-' (hyphen)");
            throw null;
        }
        long j25 = 0;
        for (int i16 = 19; i16 < 23; i16++) {
            long j26 = j25 << 4;
            char cCharAt4 = str.charAt(i16);
            if ((cCharAt4 >>> '\b') == 0) {
                long j27 = AbstractC39401e.f169564c[cCharAt4];
                if (j27 >= 0) {
                    j25 = j26 | j27;
                }
            }
            m99662D(i16, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(23) != '-') {
            m99662D(23, str, "'-' (hyphen)");
            throw null;
        }
        long j28 = 0;
        for (int i17 = 24; i17 < 36; i17++) {
            long j29 = j28 << 4;
            char cCharAt5 = str.charAt(i17);
            if ((cCharAt5 >>> '\b') == 0) {
                long j34 = AbstractC39401e.f169564c[cCharAt5];
                if (j34 >= 0) {
                    j28 = j29 | j34;
                }
            }
            m99662D(i17, str, "a hexadecimal digit");
            throw null;
        }
        long j35 = (j7 << 32) | (j15 << 16) | j18;
        long j36 = (j25 << 48) | j28;
        return (j35 == 0 && j36 == 0) ? C40261a.f174164y : new C40261a(j35, j36);
    }

    /* JADX INFO: renamed from: D */
    public static final void m99662D(int i13, String str, String str2) {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "Expected ", str2, " at index ", ", but was '");
        sbM30467u.append(str.charAt(i13));
        sbM30467u.append('\'');
        throw new IllegalArgumentException(sbM30467u.toString());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[PHI: r1 r2 r3
      0x00b3: PHI (r1v17 int) = (r1v10 int), (r1v18 int), (r1v19 int) binds: [B:74:0x00c6, B:65:0x00af, B:66:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r2v8 int) = (r2v4 int), (r2v3 int), (r2v3 int) binds: [B:74:0x00c6, B:65:0x00af, B:66:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r3v15 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:74:0x00c6, B:65:0x00af, B:66:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m99663a(String str, Modifier modifier, int i13, int i14, Map map, Composer composer, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        Map map2;
        int i24;
        int i25;
        Map map3;
        int i26;
        int i27;
        long jM113248j;
        Object objM87133R;
        C28677v1 c28677v1M87180u;
        int i28;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(524862596);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87153g(str) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            if ((i16 & 4) == 0) {
                i18 = i13;
                int i29 = c28655q.m87149e(i18) ? 256 : 128;
                i17 |= i29;
            } else {
                i18 = i13;
            }
            i17 |= i29;
        } else {
            i18 = i13;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                i19 = i14;
                if (c28655q.m87149e(i19)) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i17 |= i28;
            } else {
                i19 = i14;
            }
            i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i17 |= i28;
        } else {
            i19 = i14;
        }
        int i34 = i16 & 16;
        if (i34 == 0) {
            if ((i15 & 24576) == 0) {
                map2 = map;
                i17 |= c28655q.m87157i(map2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i17 & 9363) == 9362 || !c28655q.m87121F()) {
                c28655q.m87140Z();
                if ((i15 & 1) != 0 || c28655q.m87118C()) {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        i18 = 1;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        i19 = 1;
                    }
                    if (i34 != 0) {
                        i24 = i18;
                        i25 = i19;
                        map3 = C25272z.f99163w;
                    }
                    c28655q.m87175r();
                    if (str != null) {
                        C23285v0 c23285v0 = C15069l3.m43149c(c28655q).f56285l;
                        jM113248j = c23285v0.f92255a.f92192b;
                        if ((jM113248j & 1095216660480L) == 4294967296L) {
                            jM113248j = AbstractC35745c.m113248j(C39183o.m124805c(jM113248j) + 3, 4294967296L);
                        }
                        long j7 = jM113248j;
                        long j13 = AbstractC11673r.m31082k(c28655q).f37672e;
                        long jM113246h = AbstractC35745c.m113246h(11);
                        float f13 = C11671p.f37683d.f37722d;
                        AbstractC35745c.m113242a(jM113246h);
                        C23285v0 c23285v0M67364b = C23285v0.m67364b(c23285v0, 0L, AbstractC11478a.m30852d(jM113246h, jM113246h & 1095216660480L, f13), C28780r.f116539F, null, 0L, i24, j7, null, null, 16613369);
                        c28655q.m87150e0(1499365562);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C37722h1(19);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC35148d.m111173d(str, AbstractC1136a.m3599a(AbstractC18032n.m51775c(modifier, true, (Function1) objM87133R), "mandate_test_tag"), map3, j13, c23285v0M67364b, false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), i25, null, c28655q, (i17 & 14) | ((i17 >> 6) & 896) | ((i17 << 12) & 29360128), 288);
                    }
                    map2 = map3;
                    i26 = i25;
                    i27 = i24;
                } else {
                    c28655q.m87138X();
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                }
                i24 = i18;
                i25 = i19;
                map3 = map2;
                c28655q.m87175r();
                if (str != null) {
                    C23285v0 c23285v1 = C15069l3.m43149c(c28655q).f56285l;
                    jM113248j = c23285v1.f92255a.f92192b;
                    if ((jM113248j & 1095216660480L) == 4294967296L) {
                        jM113248j = AbstractC35745c.m113248j(C39183o.m124805c(jM113248j) + 3, 4294967296L);
                    }
                    long j14 = jM113248j;
                    long j15 = AbstractC11673r.m31082k(c28655q).f37672e;
                    long jM113246h2 = AbstractC35745c.m113246h(11);
                    float f14 = C11671p.f37683d.f37722d;
                    AbstractC35745c.m113242a(jM113246h2);
                    C23285v0 c23285v0M67364b2 = C23285v0.m67364b(c23285v1, 0L, AbstractC11478a.m30852d(jM113246h2, jM113246h2 & 1095216660480L, f14), C28780r.f116539F, null, 0L, i24, j14, null, null, 16613369);
                    c28655q.m87150e0(1499365562);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C37722h1(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC35148d.m111173d(str, AbstractC1136a.m3599a(AbstractC18032n.m51775c(modifier, true, (Function1) objM87133R), "mandate_test_tag"), map3, j15, c23285v0M67364b2, false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), i25, null, c28655q, (i17 & 14) | ((i17 >> 6) & 896) | ((i17 << 12) & 29360128), 288);
                }
                map2 = map3;
                i26 = i25;
                i27 = i24;
            } else {
                c28655q.m87138X();
                i26 = i19;
                i27 = i18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4010d4(str, modifier, i27, i26, map2, i15, i16);
            }
        }
        i17 |= 24576;
        map2 = map;
        if ((i17 & 9363) == 9362) {
            c28655q.m87140Z();
            if ((i15 & 1) != 0) {
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    i18 = 1;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    i19 = 1;
                }
                if (i34 != 0) {
                    i24 = i18;
                    i25 = i19;
                    map3 = C25272z.f99163w;
                } else {
                    i24 = i18;
                    i25 = i19;
                    map3 = map2;
                }
            } else {
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    i18 = 1;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    i19 = 1;
                }
                if (i34 != 0) {
                    i24 = i18;
                    i25 = i19;
                    map3 = C25272z.f99163w;
                } else {
                    i24 = i18;
                    i25 = i19;
                    map3 = map2;
                }
            }
            c28655q.m87175r();
            if (str != null) {
                C23285v0 c23285v2 = C15069l3.m43149c(c28655q).f56285l;
                jM113248j = c23285v2.f92255a.f92192b;
                if ((jM113248j & 1095216660480L) == 4294967296L) {
                    jM113248j = AbstractC35745c.m113248j(C39183o.m124805c(jM113248j) + 3, 4294967296L);
                }
                long j16 = jM113248j;
                long j17 = AbstractC11673r.m31082k(c28655q).f37672e;
                long jM113246h3 = AbstractC35745c.m113246h(11);
                float f15 = C11671p.f37683d.f37722d;
                AbstractC35745c.m113242a(jM113246h3);
                C23285v0 c23285v0M67364b3 = C23285v0.m67364b(c23285v2, 0L, AbstractC11478a.m30852d(jM113246h3, jM113246h3 & 1095216660480L, f15), C28780r.f116539F, null, 0L, i24, j16, null, null, 16613369);
                c28655q.m87150e0(1499365562);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C37722h1(19);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC35148d.m111173d(str, AbstractC1136a.m3599a(AbstractC18032n.m51775c(modifier, true, (Function1) objM87133R), "mandate_test_tag"), map3, j17, c23285v0M67364b3, false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), i25, null, c28655q, (i17 & 14) | ((i17 >> 6) & 896) | ((i17 << 12) & 29360128), 288);
            }
            map2 = map3;
            i26 = i25;
            i27 = i24;
        } else {
            c28655q.m87140Z();
            if ((i15 & 1) != 0) {
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    i18 = 1;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    i19 = 1;
                }
                if (i34 != 0) {
                    i24 = i18;
                    i25 = i19;
                    map3 = C25272z.f99163w;
                } else {
                    i24 = i18;
                    i25 = i19;
                    map3 = map2;
                }
            } else {
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    i18 = 1;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    i19 = 1;
                }
                if (i34 != 0) {
                    i24 = i18;
                    i25 = i19;
                    map3 = C25272z.f99163w;
                } else {
                    i24 = i18;
                    i25 = i19;
                    map3 = map2;
                }
            }
            c28655q.m87175r();
            if (str != null) {
                C23285v0 c23285v3 = C15069l3.m43149c(c28655q).f56285l;
                jM113248j = c23285v3.f92255a.f92192b;
                if ((jM113248j & 1095216660480L) == 4294967296L) {
                    jM113248j = AbstractC35745c.m113248j(C39183o.m124805c(jM113248j) + 3, 4294967296L);
                }
                long j18 = jM113248j;
                long j19 = AbstractC11673r.m31082k(c28655q).f37672e;
                long jM113246h4 = AbstractC35745c.m113246h(11);
                float f16 = C11671p.f37683d.f37722d;
                AbstractC35745c.m113242a(jM113246h4);
                C23285v0 c23285v0M67364b4 = C23285v0.m67364b(c23285v3, 0L, AbstractC11478a.m30852d(jM113246h4, jM113246h4 & 1095216660480L, f16), C28780r.f116539F, null, 0L, i24, j18, null, null, 16613369);
                c28655q.m87150e0(1499365562);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C37722h1(19);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC35148d.m111173d(str, AbstractC1136a.m3599a(AbstractC18032n.m51775c(modifier, true, (Function1) objM87133R), "mandate_test_tag"), map3, j19, c23285v0M67364b4, false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), i25, null, c28655q, (i17 & 14) | ((i17 >> 6) & 896) | ((i17 << 12) & 29360128), 288);
            }
            map2 = map3;
            i26 = i25;
            i27 = i24;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4010d4(str, modifier, i27, i26, map2, i15, i16);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m99664b(C37885e1 element, Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        AbstractC22676k.m65750j(element, "element");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1816070877);
        int i14 = (c28655q.m87157i(element) ? 4 : 2) | i13 | (c28655q.m87153g(modifier) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            int i15 = element.f162228b;
            String[] strArr = (String[]) element.f162229c.toArray(new String[0]);
            modifier2 = modifier;
            m99663a(AbstractC30060g.m92102X(i15, Arrays.copyOf(strArr, strArr.length), c28655q), modifier2, 0, 0, null, c28655q, i14 & 112, 28);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37888f1(element, modifier2, i13, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m99665c(Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C37816b c37816b2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(790527681);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C28633k1 c28633k1 = new C28633k1(null, C28676v0.f115976y);
                c28655q.m87172p0(c28633k1);
                objM87133R = c28633k1;
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C35429g(24, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            C3966j0 c3966j0 = AbstractC39927i.f172364a;
            C2212c c2212cM111184o = AbstractC35148d.m111184o(AbstractC39926h.f172363b, c28655q, 6);
            modifier2 = modifier;
            c37816b2 = c37816b;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC2218i.f8840b.mo86977a(AbstractC32004s.m99553v(interfaceC4339a, c28655q, 2)), AbstractC2218i.f8839a.mo86977a(c2212cM111184o)}, AbstractC37817c.m121344e(1070596993, c28655q, new C14991e0(modifier2, interfaceC28601c1, c37816b2, c2212cM111184o, interfaceC4339a)), c28655q, 56);
        } else {
            modifier2 = modifier;
            c37816b2 = c37816b;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16521p0(modifier2, c37816b2, i13, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m99666d(Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(155925518);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = c28655q.m87161k(AbstractC2218i.f8839a) != null;
            boolean z13 = c28655q.m87161k(AbstractC2218i.f8840b) != null;
            if (z4 && z13) {
                c28655q.m87150e0(-1977156178);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, true);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c37816b.invoke(c28655q, Integer.valueOf((i14 >> 3) & 14));
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (z4) {
                c28655q.m87150e0(-1976965962);
                AbstractC32004s.m99533b(modifier, c37816b, c28655q, i14 & 126);
                c28655q.m87173q(false);
            } else if (z13) {
                c28655q.m87150e0(-1976815178);
                AbstractC39927i.m128088d(modifier, c37816b, c28655q, i14 & 126);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1976684761);
                m99665c(modifier, c37816b, c28655q, i14 & 126);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16521p0(modifier, c37816b, i13, 4);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m99667e(InterfaceC26398o interfaceC26398o, int i13, int i14, C37816b c37816b, Composer composer, int i15, int i16) {
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1208072102);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87153g(interfaceC26398o) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= 384;
        } else if ((i15 & 384) == 0) {
            i17 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i17 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (i18 != 0) {
                i13 = 0;
            }
            if (i19 != 0) {
                i14 = 0;
            }
            c28655q.m87152f0(1849434622);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C35729r.f151981w;
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87152f0(-683746039);
            c28655q.m87152f0(-548224868);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, new C35728q(0, (byte) 0), interfaceC26398o);
            byte b = 0;
            AbstractC28683x.m87239G(c28655q, new C35728q(1, b), new C35713b(i14));
            AbstractC28683x.m87239G(c28655q, new C35728q(2, b), new C35712a(i13));
            c37816b.invoke(C35731t.f151982a, c28655q, Integer.valueOf(((i17 >> 6) & 112) | 6));
            c28655q.m87173q(true);
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        }
        int i24 = i13;
        int i25 = i14;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35716e(interfaceC26398o, i24, i25, c37816b, i15, i16, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C34913b m99668f(C34919h c34919h) {
        List listM118959K;
        int i13 = c34919h.f147029d;
        int i14 = c34919h.f147031f;
        int i15 = c34919h.f147030e;
        if (i13 == 24 && i15 == 0 && i14 == 0) {
            listM118959K = AbstractC37056f.m118959K(1, 0, 0, 0);
        } else {
            listM118959K = (i13 == 23 && i15 == 59 && i14 == 60) ? AbstractC37056f.m118959K(0, 23, 59, 59) : AbstractC37056f.m118959K(0, Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i14));
        }
        Instant instant = LocalDateTime.of(c34919h.f147026a, c34919h.f147027b, c34919h.f147028c, ((Number) listM118959K.get(1)).intValue(), ((Number) listM118959K.get(2)).intValue(), ((Number) listM118959K.get(3)).intValue(), c34919h.f147032g).plusDays(((Number) listM118959K.get(0)).intValue()).atOffset(ZoneOffset.ofTotalSeconds(c34919h.f147033h)).toInstant();
        AbstractC22676k.m65747g(instant);
        return new C34913b(instant);
    }

    /* JADX INFO: renamed from: g */
    public static final String m99669g(String str) {
        if (str.length() <= 64) {
            return str;
        }
        String strSubstring = str.substring(0, 64);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring.concat("...");
    }

    /* JADX INFO: renamed from: h */
    public static final void m99670h(long j7, byte[] bArr, int i13, int i14, int i15) {
        int i16 = 7 - i14;
        int i17 = 8 - i15;
        if (i17 > i16) {
            return;
        }
        while (true) {
            int i18 = AbstractC39401e.f169562a[(int) ((j7 >> (i16 << 3)) & 255)];
            int i19 = i13 + 1;
            bArr[i13] = (byte) (i18 >> 8);
            i13 += 2;
            bArr[i19] = (byte) i18;
            if (i16 == i17) {
                return;
            } else {
                i16--;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m99671i() {
        return AbstractC32070b.f133001a;
    }

    /* JADX INFO: renamed from: j */
    public static C15760a m99672j() {
        return C33738c.f141119b;
    }

    /* JADX INFO: renamed from: k */
    public static long m99673k() {
        return AbstractC32070b.f133008h;
    }

    /* JADX INFO: renamed from: l */
    public static long m99674l() {
        return AbstractC32070b.f133005e;
    }

    /* JADX INFO: renamed from: m */
    public static long m99675m() {
        return AbstractC32070b.f133006f;
    }

    /* JADX INFO: renamed from: n */
    public static long m99676n() {
        return AbstractC32070b.f133007g;
    }

    /* JADX INFO: renamed from: o */
    public static long m99677o() {
        return AbstractC32070b.f133004d;
    }

    /* JADX INFO: renamed from: p */
    public static long m99678p() {
        return AbstractC32070b.f133011k;
    }

    /* JADX INFO: renamed from: q */
    public static long m99679q() {
        return AbstractC32070b.f133012l;
    }

    /* JADX INFO: renamed from: r */
    public static long m99680r() {
        return AbstractC32070b.f133003c;
    }

    /* JADX INFO: renamed from: s */
    public static long m99681s() {
        return AbstractC32070b.f133002b;
    }

    /* JADX INFO: renamed from: t */
    public static long m99682t() {
        return AbstractC32070b.f133017q;
    }

    /* JADX INFO: renamed from: u */
    public static long m99683u() {
        return AbstractC32070b.f133016p;
    }

    /* JADX INFO: renamed from: v */
    public static long m99684v() {
        return AbstractC32070b.f133015o;
    }

    /* JADX INFO: renamed from: w */
    public static LinkedHashMap m99685w(InterfaceC36611c interfaceC36611c) {
        return AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("site_key", interfaceC36611c.mo117603c()), interfaceC36611c.mo117602a());
    }

    /* JADX INFO: renamed from: x */
    public static C15760a m99686x() {
        return C33738c.f141120c;
    }

    /* JADX INFO: renamed from: y */
    public static long m99687y() {
        return AbstractC32070b.f133010j;
    }

    /* JADX INFO: renamed from: z */
    public static long m99688z() {
        return AbstractC32070b.f133009i;
    }
}

package kz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11407v;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ak\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", NotificationCompat.CATEGORY_PROGRESS, "total", "Li2/x;", "completedColor", "incompleteColor", "", "Lkz0/a;", "sections", "currentSectionIndex", "Ly3/f;", "barHeight", "Li2/a1;", "barShape", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;Landroidx/compose/runtime/Composer;II)V", "", "animatedWeight", "fillFraction", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22922c {
    /* JADX WARN: Code duplicated, block: B:100:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x013d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x015f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0161  */
    /* JADX WARN: Code duplicated, block: B:112:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x017d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0186  */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:133:0x0204  */
    /* JADX WARN: Code duplicated, block: B:135:0x0232  */
    /* JADX WARN: Code duplicated, block: B:136:0x0236  */
    /* JADX WARN: Code duplicated, block: B:139:0x0243  */
    /* JADX WARN: Code duplicated, block: B:141:0x0251  */
    /* JADX WARN: Code duplicated, block: B:145:0x0279  */
    /* JADX WARN: Code duplicated, block: B:147:0x0281  */
    /* JADX WARN: Code duplicated, block: B:149:0x0285  */
    /* JADX WARN: Code duplicated, block: B:150:0x0288  */
    /* JADX WARN: Code duplicated, block: B:152:0x028b  */
    /* JADX WARN: Code duplicated, block: B:153:0x028d  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x032b  */
    /* JADX WARN: Code duplicated, block: B:169:0x032f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0342  */
    /* JADX WARN: Code duplicated, block: B:174:0x0350  */
    /* JADX WARN: Code duplicated, block: B:177:0x037d  */
    /* JADX WARN: Code duplicated, block: B:178:0x038a  */
    /* JADX WARN: Code duplicated, block: B:183:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:191:0x040c  */
    /* JADX WARN: Code duplicated, block: B:194:0x041d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0422 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x0427  */
    /* JADX WARN: Code duplicated, block: B:203:0x0436  */
    /* JADX WARN: Code duplicated, block: B:206:0x0442  */
    /* JADX WARN: Code duplicated, block: B:207:0x0447  */
    /* JADX WARN: Code duplicated, block: B:210:0x0456  */
    /* JADX WARN: Code duplicated, block: B:211:0x0463  */
    /* JADX WARN: Code duplicated, block: B:213:0x046f A[LOOP:1: B:195:0x041e->B:213:0x046f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x0477  */
    /* JADX WARN: Code duplicated, block: B:218:0x048c  */
    /* JADX WARN: Code duplicated, block: B:221:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:224:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0475 A[EDGE_INSN: B:227:0x0475->B:214:0x0475 BREAK  A[LOOP:1: B:195:0x041e->B:213:0x046f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v22, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r4v24, types: [x81.d] */
    /* JADX INFO: renamed from: b */
    public static final void m66645b(Modifier modifier, int i13, final int i14, long j7, long j13, final List<C22920a> sections, int i15, float f13, InterfaceC17869a1 interfaceC17869a1, Composer composer, final int i16, final int i17) {
        Modifier modifier2;
        int i18;
        long brandWhite;
        long white30;
        int i19;
        int i24;
        boolean z4;
        boolean z13;
        C28655q c28655q;
        final int i25;
        final Modifier modifier3;
        final long j14;
        final long j15;
        final float f14;
        final InterfaceC17869a1 interfaceC17869a2;
        C28677v1 c28677v1M87180u;
        int i26;
        C2314t c2314t;
        Throwable th3;
        int i27;
        float f15;
        InterfaceC17869a1 interfaceC17869a3;
        int i28;
        InterfaceC17869a1 interfaceC17869a1M105489e;
        long j16;
        int iHashCode;
        C0213j c0213j;
        InterfaceC17869a1 interfaceC17869a4;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean zIsEmpty;
        C17916v0 c17916v0;
        long j17;
        long j18;
        int iHashCode2;
        boolean z14;
        InterfaceC17869a1 interfaceC17869a5;
        boolean z15;
        int i29;
        int i34;
        long j19;
        Modifier modifierM118994r;
        int iHashCode3;
        float f16;
        float f17;
        float size;
        int i35;
        int i36;
        C22920a c22920a;
        ?? r14;
        float f18;
        C28655q c28655q2;
        float completedSteps;
        float fM66646c;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i5;
        int i37;
        int i38;
        final int i39 = i13;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(sections, "sections");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1473963536);
        int i44 = i17 & 1;
        if (i44 != 0) {
            i18 = i16 | 6;
            modifier2 = modifier;
        } else if ((i16 & 6) == 0) {
            modifier2 = modifier;
            i18 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i16;
        } else {
            modifier2 = modifier;
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q3.m87149e(i39) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q3.m87149e(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            if ((i17 & 8) == 0) {
                brandWhite = j7;
                if (c28655q3.m87151f(brandWhite)) {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i18 |= i38;
            } else {
                brandWhite = j7;
            }
            i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i18 |= i38;
        } else {
            brandWhite = j7;
        }
        if ((i16 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                white30 = j13;
                if (c28655q3.m87151f(white30)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i18 |= i37;
            } else {
                white30 = j13;
            }
            i37 = DfuBaseService.ERROR_REMOTE_MASK;
            i18 |= i37;
        } else {
            white30 = j13;
        }
        if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q3.m87157i(sections) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i45 = i17 & 64;
        if (i45 != 0) {
            i18 |= 1572864;
        } else if ((i16 & 1572864) == 0) {
            i18 |= c28655q3.m87149e(i15) ? 1048576 : 524288;
        }
        int i46 = i17 & 128;
        if (i46 == 0) {
            if ((i16 & 12582912) == 0) {
                i18 |= c28655q3.m87147d(f13) ? 8388608 : 4194304;
            }
            i19 = i17 & 256;
            if (i19 != 0) {
                if ((i16 & 100663296) == 0) {
                    if (c28655q3.m87153g(interfaceC17869a1)) {
                        i24 = 67108864;
                    } else {
                        i24 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i24;
                }
                z4 = true;
                if ((i18 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i18 & 1, z13)) {
                    c28655q3.m87140Z();
                    i26 = i16 & 1;
                    c2314t = C2314t.f9131w;
                    if (i26 != 0 || c28655q3.m87118C()) {
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        th3 = null;
                        if ((i17 & 8) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                        }
                        if ((i17 & 16) != 0) {
                            white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                        }
                        if (i45 != 0) {
                            i27 = 0;
                        } else {
                            i27 = i15;
                        }
                        if (i46 != 0) {
                            f15 = 4 * 1;
                        } else {
                            f15 = f13;
                        }
                        if (i19 != 0) {
                            interfaceC17869a3 = null;
                        } else {
                            interfaceC17869a3 = interfaceC17869a1;
                        }
                        i28 = i27;
                    } else {
                        c28655q3.m87138X();
                        i28 = i15;
                        f15 = f13;
                        z4 = true;
                        th3 = null;
                        interfaceC17869a3 = interfaceC17869a1;
                    }
                    c28655q3.m87175r();
                    if (interfaceC17869a3 == null) {
                        interfaceC17869a1M105489e = AbstractC33253j.m105489e(((float) 0.5d) * 4);
                    } else {
                        interfaceC17869a1M105489e = interfaceC17869a3;
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f15, modifier2));
                    Modifier modifier4 = modifier2;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    j16 = white30;
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    interfaceC17869a4 = interfaceC17869a3;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                    zIsEmpty = sections.isEmpty();
                    c17916v0 = AbstractC17918w0.f69621a;
                    if (zIsEmpty) {
                        j17 = j16;
                        c28655q = c28655q3;
                        c28655q.m87150e0(1039607378);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 54);
                        j18 = brandWhite;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        c28655q.m87150e0(1521562874);
                        z14 = true;
                        i34 = 1;
                        if (1 <= i14) {
                            i29 = 1;
                            while (true) {
                                i39 = i13;
                                if (i34 <= i29 || i29 > i39) {
                                    j19 = j17;
                                } else {
                                    j19 = j18;
                                }
                                Modifier modifierM3411h = AbstractC1102d.m3411h(f15, c2314t);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3411h, true, 1.0f);
                                interfaceC17869a5 = interfaceC17869a4;
                                if (interfaceC17869a4 != null) {
                                    modifierM118994r = AbstractC37056f.m118994r(c2314t, interfaceC17869a5);
                                } else {
                                    modifierM118994r = c2314t;
                                }
                                z15 = false;
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM31988g.mo3471e(modifierM118994r), j19, c17916v0), c28655q, 0);
                                if (i29 != i14) {
                                    c28655q.m87150e0(-75653558);
                                    AbstractC31061c.m95650z(1, 4, c2314t, c28655q, false);
                                } else {
                                    c28655q.m87150e0(-75567068);
                                    c28655q.m87173q(false);
                                }
                                if (i29 != i14) {
                                    break;
                                }
                                i29++;
                                interfaceC17869a4 = interfaceC17869a5;
                                i34 = 1;
                            }
                            z14 = true;
                        } else {
                            i39 = i13;
                            interfaceC17869a5 = interfaceC17869a4;
                            z15 = false;
                        }
                        AbstractC25012a.m73392y(c28655q, z15, z14, z15);
                    } else {
                        c28655q3.m87150e0(1037208970);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(0.3f, c2314t);
                        j18 = brandWhite;
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3409f3);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                        f16 = 8.0f;
                        f17 = 32.0f;
                        size = ((sections.size() - 1) * 8.0f) + 32.0f;
                        c28655q3.m87150e0(1943961384);
                        i35 = 0;
                        for (Object obj : sections) {
                            i36 = i35 + 1;
                            if (i35 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw th3;
                            }
                            c22920a = (C22920a) obj;
                            if (i35 == i28) {
                                r14 = z4;
                            } else {
                                r14 = 0;
                            }
                            if (r14 != 0) {
                                f18 = f17;
                            } else {
                                f18 = f16;
                            }
                            C11407v c11407v = AbstractC11333b0.f36310a;
                            float f19 = size;
                            c28655q2 = c28655q3;
                            long j24 = j16;
                            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f18, AbstractC11348f.m30574v(300, 0, c11407v, 2), null, null, c28655q2, 0, 28);
                            if (c22920a.getTotalSteps() > 0) {
                                completedSteps = ((float) (c22920a.getCompletedSteps() + r14)) / c22920a.getTotalSteps();
                            } else {
                                completedSteps = 0.0f;
                            }
                            InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(completedSteps, AbstractC11348f.m30574v(300, 0, c11407v, 2), "fillFraction", null, c28655q2, 3072, 20);
                            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f15, c2314t);
                            fM66646c = m66646c(interfaceC28670t2M30588b) / f19;
                            if (fM66646c <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (fM66646c > Float.MAX_VALUE) {
                                fM66646c = Float.MAX_VALUE;
                            }
                            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3411h2.mo3471e(new LayoutWeightElement(fM66646c, z4)), interfaceC17869a1M105489e), j24, c17916v0);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j2);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                            c0209i5 = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                            long j25 = j18;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f15, AbstractC1102d.m3409f(m66647d(interfaceC28670t2M30588b2), c2314t)), interfaceC17869a1M105489e), j25, c17916v0), c28655q2, 0);
                            c28655q2.m87173q(true);
                            if (i35 != sections.size() - 1) {
                                c28655q2.m87150e0(1224669694);
                                AbstractC31061c.m95650z(1, 4, c2314t, c28655q2, false);
                            } else {
                                c28655q2.m87150e0(1224756184);
                                c28655q2.m87173q(false);
                            }
                            i35 = i36;
                            z4 = true;
                            c28655q3 = c28655q2;
                            j18 = j25;
                            j16 = j24;
                            f16 = 8.0f;
                            f17 = 32.0f;
                            size = f19;
                        }
                        j17 = j16;
                        c28655q = c28655q3;
                        boolean z16 = z4;
                        AbstractC25012a.m73392y(c28655q, false, z16, false);
                        i39 = i13;
                        interfaceC17869a5 = interfaceC17869a4;
                        z14 = z16;
                    }
                    c28655q.m87173q(z14);
                    modifier3 = modifier4;
                    interfaceC17869a2 = interfaceC17869a5;
                    j15 = j17;
                    f14 = f15;
                    i25 = i28;
                    j14 = j18;
                } else {
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    i25 = i15;
                    modifier3 = modifier2;
                    j14 = brandWhite;
                    j15 = white30;
                    f14 = f13;
                    interfaceC17869a2 = interfaceC17869a1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: kz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC22922c.m66648e(modifier3, i39, i14, j14, j15, sections, i25, f14, interfaceC17869a2, i16, i17, (Composer) obj2, iIntValue);
                        }
                    };
                }
            }
            i18 |= 100663296;
            z4 = true;
            if ((i18 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i18 & 1, z13)) {
                c28655q3.m87140Z();
                i26 = i16 & 1;
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    th3 = null;
                    if ((i17 & 8) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                    }
                    if ((i17 & 16) != 0) {
                        white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                    }
                    if (i45 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i15;
                    }
                    if (i46 != 0) {
                        f15 = 4 * 1;
                    } else {
                        f15 = f13;
                    }
                    if (i19 != 0) {
                        interfaceC17869a3 = null;
                    } else {
                        interfaceC17869a3 = interfaceC17869a1;
                    }
                    i28 = i27;
                } else {
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    th3 = null;
                    if ((i17 & 8) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                    }
                    if ((i17 & 16) != 0) {
                        white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                    }
                    if (i45 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i15;
                    }
                    if (i46 != 0) {
                        f15 = 4 * 1;
                    } else {
                        f15 = f13;
                    }
                    if (i19 != 0) {
                        interfaceC17869a3 = null;
                    } else {
                        interfaceC17869a3 = interfaceC17869a1;
                    }
                    i28 = i27;
                }
                c28655q3.m87175r();
                if (interfaceC17869a3 == null) {
                    interfaceC17869a1M105489e = AbstractC33253j.m105489e(((float) 0.5d) * 4);
                } else {
                    interfaceC17869a1M105489e = interfaceC17869a3;
                }
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f15, modifier2));
                Modifier modifier5 = modifier2;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                j16 = white30;
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3409f4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                interfaceC17869a4 = interfaceC17869a3;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N5);
                zIsEmpty = sections.isEmpty();
                c17916v0 = AbstractC17918w0.f69621a;
                if (zIsEmpty) {
                    c28655q3.m87150e0(1037208970);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(0.3f, c2314t);
                    j18 = brandWhite;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3409f5);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N6);
                    f16 = 8.0f;
                    f17 = 32.0f;
                    size = ((sections.size() - 1) * 8.0f) + 32.0f;
                    c28655q3.m87150e0(1943961384);
                    i35 = 0;
                    while (r6.hasNext()) {
                        i36 = i35 + 1;
                        if (i35 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw th3;
                        }
                        c22920a = (C22920a) obj;
                        if (i35 == i28) {
                            r14 = z4;
                        } else {
                            r14 = 0;
                        }
                        if (r14 != 0) {
                            f18 = f17;
                        } else {
                            f18 = f16;
                        }
                        C11407v c11407v2 = AbstractC11333b0.f36310a;
                        float f110 = size;
                        c28655q2 = c28655q3;
                        long j26 = j16;
                        InterfaceC28670t2 interfaceC28670t2M30588b3 = AbstractC11352g.m30588b(f18, AbstractC11348f.m30574v(300, 0, c11407v2, 2), null, null, c28655q2, 0, 28);
                        if (c22920a.getTotalSteps() > 0) {
                            completedSteps = ((float) (c22920a.getCompletedSteps() + r14)) / c22920a.getTotalSteps();
                        } else {
                            completedSteps = 0.0f;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b4 = AbstractC11352g.m30588b(completedSteps, AbstractC11348f.m30574v(300, 0, c11407v2, 2), "fillFraction", null, c28655q2, 3072, 20);
                        Modifier modifierM3411h3 = AbstractC1102d.m3411h(f15, c2314t);
                        fM66646c = m66646c(interfaceC28670t2M30588b3) / f110;
                        if (fM66646c <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (fM66646c > Float.MAX_VALUE) {
                            fM66646c = Float.MAX_VALUE;
                        }
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3411h3.mo3471e(new LayoutWeightElement(fM66646c, z4)), interfaceC17869a1M105489e), j26, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i5 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                        long j27 = j18;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f15, AbstractC1102d.m3409f(m66647d(interfaceC28670t2M30588b4), c2314t)), interfaceC17869a1M105489e), j27, c17916v0), c28655q2, 0);
                        c28655q2.m87173q(true);
                        if (i35 != sections.size() - 1) {
                            c28655q2.m87150e0(1224669694);
                            AbstractC31061c.m95650z(1, 4, c2314t, c28655q2, false);
                        } else {
                            c28655q2.m87150e0(1224756184);
                            c28655q2.m87173q(false);
                        }
                        i35 = i36;
                        z4 = true;
                        c28655q3 = c28655q2;
                        j18 = j27;
                        j16 = j26;
                        f16 = 8.0f;
                        f17 = 32.0f;
                        size = f110;
                    }
                    j17 = j16;
                    c28655q = c28655q3;
                    boolean z17 = z4;
                    AbstractC25012a.m73392y(c28655q, false, z17, false);
                    i39 = i13;
                    interfaceC17869a5 = interfaceC17869a4;
                    z14 = z17;
                } else {
                    j17 = j16;
                    c28655q = c28655q3;
                    c28655q.m87150e0(1039607378);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 54);
                    j18 = brandWhite;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    c28655q.m87150e0(1521562874);
                    z14 = true;
                    i34 = 1;
                    if (1 <= i14) {
                        i29 = 1;
                        while (true) {
                            i39 = i13;
                            if (i34 <= i29) {
                                j19 = j17;
                            } else {
                                j19 = j17;
                            }
                            Modifier modifierM3411h4 = AbstractC1102d.m3411h(f15, c2314t);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3411h4, true, 1.0f);
                            interfaceC17869a5 = interfaceC17869a4;
                            if (interfaceC17869a4 != null) {
                                modifierM118994r = AbstractC37056f.m118994r(c2314t, interfaceC17869a5);
                            } else {
                                modifierM118994r = c2314t;
                            }
                            z15 = false;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM31988g2.mo3471e(modifierM118994r), j19, c17916v0), c28655q, 0);
                            if (i29 != i14) {
                                c28655q.m87150e0(-75653558);
                                AbstractC31061c.m95650z(1, 4, c2314t, c28655q, false);
                            } else {
                                c28655q.m87150e0(-75567068);
                                c28655q.m87173q(false);
                            }
                            if (i29 != i14) {
                                break;
                                break;
                            } else {
                                i29++;
                                interfaceC17869a4 = interfaceC17869a5;
                                i34 = 1;
                            }
                        }
                        z14 = true;
                    } else {
                        i39 = i13;
                        interfaceC17869a5 = interfaceC17869a4;
                        z15 = false;
                    }
                    AbstractC25012a.m73392y(c28655q, z15, z14, z15);
                }
                c28655q.m87173q(z14);
                modifier3 = modifier5;
                interfaceC17869a2 = interfaceC17869a5;
                j15 = j17;
                f14 = f15;
                i25 = i28;
                j14 = j18;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                i25 = i15;
                modifier3 = modifier2;
                j14 = brandWhite;
                j15 = white30;
                f14 = f13;
                interfaceC17869a2 = interfaceC17869a1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: kz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC22922c.m66648e(modifier3, i39, i14, j14, j15, sections, i25, f14, interfaceC17869a2, i16, i17, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i18 |= 12582912;
        i19 = i17 & 256;
        if (i19 != 0) {
            if ((i16 & 100663296) == 0) {
                if (c28655q3.m87153g(interfaceC17869a1)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i24;
            }
            z4 = true;
            if ((i18 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i18 & 1, z13)) {
                c28655q3.m87140Z();
                i26 = i16 & 1;
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    th3 = null;
                    if ((i17 & 8) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                    }
                    if ((i17 & 16) != 0) {
                        white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                    }
                    if (i45 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i15;
                    }
                    if (i46 != 0) {
                        f15 = 4 * 1;
                    } else {
                        f15 = f13;
                    }
                    if (i19 != 0) {
                        interfaceC17869a3 = null;
                    } else {
                        interfaceC17869a3 = interfaceC17869a1;
                    }
                    i28 = i27;
                } else {
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    th3 = null;
                    if ((i17 & 8) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                    }
                    if ((i17 & 16) != 0) {
                        white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                    }
                    if (i45 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i15;
                    }
                    if (i46 != 0) {
                        f15 = 4 * 1;
                    } else {
                        f15 = f13;
                    }
                    if (i19 != 0) {
                        interfaceC17869a3 = null;
                    } else {
                        interfaceC17869a3 = interfaceC17869a1;
                    }
                    i28 = i27;
                }
                c28655q3.m87175r();
                if (interfaceC17869a3 == null) {
                    interfaceC17869a1M105489e = AbstractC33253j.m105489e(((float) 0.5d) * 4);
                } else {
                    interfaceC17869a1M105489e = interfaceC17869a3;
                }
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f15, modifier2));
                Modifier modifier6 = modifier2;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                j16 = white30;
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM3409f7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                interfaceC17869a4 = interfaceC17869a3;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d5);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m9);
                c0209i3 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N9);
                zIsEmpty = sections.isEmpty();
                c17916v0 = AbstractC17918w0.f69621a;
                if (zIsEmpty) {
                    c28655q3.m87150e0(1037208970);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(0.3f, c2314t);
                    j18 = brandWhite;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3409f8);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m10);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N10);
                    f16 = 8.0f;
                    f17 = 32.0f;
                    size = ((sections.size() - 1) * 8.0f) + 32.0f;
                    c28655q3.m87150e0(1943961384);
                    i35 = 0;
                    while (r6.hasNext()) {
                        i36 = i35 + 1;
                        if (i35 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw th3;
                        }
                        c22920a = (C22920a) obj;
                        if (i35 == i28) {
                            r14 = z4;
                        } else {
                            r14 = 0;
                        }
                        if (r14 != 0) {
                            f18 = f17;
                        } else {
                            f18 = f16;
                        }
                        C11407v c11407v3 = AbstractC11333b0.f36310a;
                        float f111 = size;
                        c28655q2 = c28655q3;
                        long j28 = j16;
                        InterfaceC28670t2 interfaceC28670t2M30588b5 = AbstractC11352g.m30588b(f18, AbstractC11348f.m30574v(300, 0, c11407v3, 2), null, null, c28655q2, 0, 28);
                        if (c22920a.getTotalSteps() > 0) {
                            completedSteps = ((float) (c22920a.getCompletedSteps() + r14)) / c22920a.getTotalSteps();
                        } else {
                            completedSteps = 0.0f;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b6 = AbstractC11352g.m30588b(completedSteps, AbstractC11348f.m30574v(300, 0, c11407v3, 2), "fillFraction", null, c28655q2, 3072, 20);
                        Modifier modifierM3411h5 = AbstractC1102d.m3411h(f15, c2314t);
                        fM66646c = m66646c(interfaceC28670t2M30588b5) / f111;
                        if (fM66646c <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (fM66646c > Float.MAX_VALUE) {
                            fM66646c = Float.MAX_VALUE;
                        }
                        Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3411h5.mo3471e(new LayoutWeightElement(fM66646c, z4)), interfaceC17869a1M105489e), j28, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3358c3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i5 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                        long j29 = j18;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f15, AbstractC1102d.m3409f(m66647d(interfaceC28670t2M30588b6), c2314t)), interfaceC17869a1M105489e), j29, c17916v0), c28655q2, 0);
                        c28655q2.m87173q(true);
                        if (i35 != sections.size() - 1) {
                            c28655q2.m87150e0(1224669694);
                            AbstractC31061c.m95650z(1, 4, c2314t, c28655q2, false);
                        } else {
                            c28655q2.m87150e0(1224756184);
                            c28655q2.m87173q(false);
                        }
                        i35 = i36;
                        z4 = true;
                        c28655q3 = c28655q2;
                        j18 = j29;
                        j16 = j28;
                        f16 = 8.0f;
                        f17 = 32.0f;
                        size = f111;
                    }
                    j17 = j16;
                    c28655q = c28655q3;
                    boolean z18 = z4;
                    AbstractC25012a.m73392y(c28655q, false, z18, false);
                    i39 = i13;
                    interfaceC17869a5 = interfaceC17869a4;
                    z14 = z18;
                } else {
                    j17 = j16;
                    c28655q = c28655q3;
                    c28655q.m87150e0(1039607378);
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 54);
                    j18 = brandWhite;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    c28655q.m87150e0(1521562874);
                    z14 = true;
                    i34 = 1;
                    if (1 <= i14) {
                        i29 = 1;
                        while (true) {
                            i39 = i13;
                            if (i34 <= i29) {
                                j19 = j17;
                            } else {
                                j19 = j17;
                            }
                            Modifier modifierM3411h6 = AbstractC1102d.m3411h(f15, c2314t);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM31988g3 = AbstractC11895b.m31988g(modifierM3411h6, true, 1.0f);
                            interfaceC17869a5 = interfaceC17869a4;
                            if (interfaceC17869a4 != null) {
                                modifierM118994r = AbstractC37056f.m118994r(c2314t, interfaceC17869a5);
                            } else {
                                modifierM118994r = c2314t;
                            }
                            z15 = false;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM31988g3.mo3471e(modifierM118994r), j19, c17916v0), c28655q, 0);
                            if (i29 != i14) {
                                c28655q.m87150e0(-75653558);
                                AbstractC31061c.m95650z(1, 4, c2314t, c28655q, false);
                            } else {
                                c28655q.m87150e0(-75567068);
                                c28655q.m87173q(false);
                            }
                            if (i29 != i14) {
                                break;
                                break;
                            } else {
                                i29++;
                                interfaceC17869a4 = interfaceC17869a5;
                                i34 = 1;
                            }
                        }
                        z14 = true;
                    } else {
                        i39 = i13;
                        interfaceC17869a5 = interfaceC17869a4;
                        z15 = false;
                    }
                    AbstractC25012a.m73392y(c28655q, z15, z14, z15);
                }
                c28655q.m87173q(z14);
                modifier3 = modifier6;
                interfaceC17869a2 = interfaceC17869a5;
                j15 = j17;
                f14 = f15;
                i25 = i28;
                j14 = j18;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                i25 = i15;
                modifier3 = modifier2;
                j14 = brandWhite;
                j15 = white30;
                f14 = f13;
                interfaceC17869a2 = interfaceC17869a1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: kz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC22922c.m66648e(modifier3, i39, i14, j14, j15, sections, i25, f14, interfaceC17869a2, i16, i17, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i18 |= 100663296;
        z4 = true;
        if ((i18 & 38347923) != 38347922) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q3.m87135U(i18 & 1, z13)) {
            c28655q3.m87140Z();
            i26 = i16 & 1;
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                th3 = null;
                if ((i17 & 8) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                }
                if ((i17 & 16) != 0) {
                    white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                }
                if (i45 != 0) {
                    i27 = 0;
                } else {
                    i27 = i15;
                }
                if (i46 != 0) {
                    f15 = 4 * 1;
                } else {
                    f15 = f13;
                }
                if (i19 != 0) {
                    interfaceC17869a3 = null;
                } else {
                    interfaceC17869a3 = interfaceC17869a1;
                }
                i28 = i27;
            } else {
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                th3 = null;
                if ((i17 & 8) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q3, 6).getBrandWhite();
                }
                if ((i17 & 16) != 0) {
                    white30 = C38072d.f163053a.m121949b(c28655q3, 6).getWhite30();
                }
                if (i45 != 0) {
                    i27 = 0;
                } else {
                    i27 = i15;
                }
                if (i46 != 0) {
                    f15 = 4 * 1;
                } else {
                    f15 = f13;
                }
                if (i19 != 0) {
                    interfaceC17869a3 = null;
                } else {
                    interfaceC17869a3 = interfaceC17869a1;
                }
                i28 = i27;
            }
            c28655q3.m87175r();
            if (interfaceC17869a3 == null) {
                interfaceC17869a1M105489e = AbstractC33253j.m105489e(((float) 0.5d) * 4);
            } else {
                interfaceC17869a1M105489e = interfaceC17869a3;
            }
            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f15, modifier2));
            Modifier modifier7 = modifier2;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            j16 = white30;
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3409f10);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            interfaceC17869a4 = interfaceC17869a3;
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d7);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m13);
            c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N13);
            zIsEmpty = sections.isEmpty();
            c17916v0 = AbstractC17918w0.f69621a;
            if (zIsEmpty) {
                c28655q3.m87150e0(1037208970);
                Modifier modifierM3409f11 = AbstractC1102d.m3409f(0.3f, c2314t);
                j18 = brandWhite;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q3, 54);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, modifierM3409f11);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N14);
                f16 = 8.0f;
                f17 = 32.0f;
                size = ((sections.size() - 1) * 8.0f) + 32.0f;
                c28655q3.m87150e0(1943961384);
                i35 = 0;
                while (r6.hasNext()) {
                    i36 = i35 + 1;
                    if (i35 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw th3;
                    }
                    c22920a = (C22920a) obj;
                    if (i35 == i28) {
                        r14 = z4;
                    } else {
                        r14 = 0;
                    }
                    if (r14 != 0) {
                        f18 = f17;
                    } else {
                        f18 = f16;
                    }
                    C11407v c11407v4 = AbstractC11333b0.f36310a;
                    float f112 = size;
                    c28655q2 = c28655q3;
                    long j210 = j16;
                    InterfaceC28670t2 interfaceC28670t2M30588b7 = AbstractC11352g.m30588b(f18, AbstractC11348f.m30574v(300, 0, c11407v4, 2), null, null, c28655q2, 0, 28);
                    if (c22920a.getTotalSteps() > 0) {
                        completedSteps = ((float) (c22920a.getCompletedSteps() + r14)) / c22920a.getTotalSteps();
                    } else {
                        completedSteps = 0.0f;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b8 = AbstractC11352g.m30588b(completedSteps, AbstractC11348f.m30574v(300, 0, c11407v4, 2), "fillFraction", null, c28655q2, 3072, 20);
                    Modifier modifierM3411h7 = AbstractC1102d.m3411h(f15, c2314t);
                    fM66646c = m66646c(interfaceC28670t2M30588b7) / f112;
                    if (fM66646c <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (fM66646c > Float.MAX_VALUE) {
                        fM66646c = Float.MAX_VALUE;
                    }
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3411h7.mo3471e(new LayoutWeightElement(fM66646c, z4)), interfaceC17869a1M105489e), j210, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3358c4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i5 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                    long j211 = j18;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f15, AbstractC1102d.m3409f(m66647d(interfaceC28670t2M30588b8), c2314t)), interfaceC17869a1M105489e), j211, c17916v0), c28655q2, 0);
                    c28655q2.m87173q(true);
                    if (i35 != sections.size() - 1) {
                        c28655q2.m87150e0(1224669694);
                        AbstractC31061c.m95650z(1, 4, c2314t, c28655q2, false);
                    } else {
                        c28655q2.m87150e0(1224756184);
                        c28655q2.m87173q(false);
                    }
                    i35 = i36;
                    z4 = true;
                    c28655q3 = c28655q2;
                    j18 = j211;
                    j16 = j210;
                    f16 = 8.0f;
                    f17 = 32.0f;
                    size = f112;
                }
                j17 = j16;
                c28655q = c28655q3;
                boolean z19 = z4;
                AbstractC25012a.m73392y(c28655q, false, z19, false);
                i39 = i13;
                interfaceC17869a5 = interfaceC17869a4;
                z14 = z19;
            } else {
                j17 = j16;
                c28655q = c28655q3;
                c28655q.m87150e0(1039607378);
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 54);
                j18 = brandWhite;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                c28655q.m87150e0(1521562874);
                z14 = true;
                i34 = 1;
                if (1 <= i14) {
                    i29 = 1;
                    while (true) {
                        i39 = i13;
                        if (i34 <= i29) {
                            j19 = j17;
                        } else {
                            j19 = j17;
                        }
                        Modifier modifierM3411h8 = AbstractC1102d.m3411h(f15, c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g4 = AbstractC11895b.m31988g(modifierM3411h8, true, 1.0f);
                        interfaceC17869a5 = interfaceC17869a4;
                        if (interfaceC17869a4 != null) {
                            modifierM118994r = AbstractC37056f.m118994r(c2314t, interfaceC17869a5);
                        } else {
                            modifierM118994r = c2314t;
                        }
                        z15 = false;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM31988g4.mo3471e(modifierM118994r), j19, c17916v0), c28655q, 0);
                        if (i29 != i14) {
                            c28655q.m87150e0(-75653558);
                            AbstractC31061c.m95650z(1, 4, c2314t, c28655q, false);
                        } else {
                            c28655q.m87150e0(-75567068);
                            c28655q.m87173q(false);
                        }
                        if (i29 != i14) {
                            break;
                            break;
                        } else {
                            i29++;
                            interfaceC17869a4 = interfaceC17869a5;
                            i34 = 1;
                        }
                    }
                    z14 = true;
                } else {
                    i39 = i13;
                    interfaceC17869a5 = interfaceC17869a4;
                    z15 = false;
                }
                AbstractC25012a.m73392y(c28655q, z15, z14, z15);
            }
            c28655q.m87173q(z14);
            modifier3 = modifier7;
            interfaceC17869a2 = interfaceC17869a5;
            j15 = j17;
            f14 = f15;
            i25 = i28;
            j14 = j18;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            i25 = i15;
            modifier3 = modifier2;
            j14 = brandWhite;
            j15 = white30;
            f14 = f13;
            interfaceC17869a2 = interfaceC17869a1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: kz0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC22922c.m66648e(modifier3, i39, i14, j14, j15, sections, i25, f14, interfaceC17869a2, i16, i17, (Composer) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    private static final float m66646c(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: d */
    private static final float m66647d(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m66648e(Modifier modifier, int i13, int i14, long j7, long j13, List list, int i15, float f13, InterfaceC17869a1 interfaceC17869a1, int i16, int i17, Composer composer, int i18) {
        m66645b(modifier, i13, i14, j7, j13, list, i15, f13, interfaceC17869a1, composer, AbstractC28683x.m87244L(i16 | 1), i17);
        return C23454a0.f92919a;
    }
}

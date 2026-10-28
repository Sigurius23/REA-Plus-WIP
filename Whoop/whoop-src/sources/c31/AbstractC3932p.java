package c31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bm2.C3433d0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import java.io.IOException;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C38770y;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18042x;
import p209i3.InterfaceC18044z;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p411q2.InterfaceC29805a;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c31.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a{\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0019\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"", "enabled", "", "totalCount", "filledCount", "Ly81/e;", "circleColor", "Li2/t;", "circleBrush", "Lgz0/m0;", "icon", "isError", "", "filledPercent", "", "testTag", "Lkotlin/Function1;", "Lc31/c;", "Ll83/a0;", "onViewEvent", "j", "(ZIILy81/e;Li2/t;Lgz0/m0;ZLjava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "fillPercent", "strokeWidth", "radius", "g", "(Ly81/e;Li2/t;FFFLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3932p {
    /* JADX INFO: renamed from: g */
    private static final void m11965g(final InterfaceC39332e interfaceC39332e, final AbstractC17911t abstractC17911t, final float f13, final float f14, final float f15, Composer composer, final int i13) {
        int i14;
        AbstractC17911t abstractC17911t2;
        float f16;
        C17919x c17919xM31989h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-533868435);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            abstractC17911t2 = abstractC17911t;
            i14 |= c28655q.m87153g(abstractC17911t2) ? 32 : 16;
        } else {
            abstractC17911t2 = abstractC17911t;
        }
        if ((i13 & 384) == 0) {
            f16 = f13;
            i14 |= c28655q.m87147d(f16) ? 256 : 128;
        } else {
            f16 = f13;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87147d(f15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            float f17 = (2 * f15) - f14;
            float f18 = f14 / 2.0f;
            if (interfaceC39332e == null) {
                c28655q.m87150e0(-210088586);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-210088585);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC3928l.m11957b(), C2314t.f9131w);
            boolean zM87147d = ((i14 & 112) == 32) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048) | c28655q.m87147d(f17) | c28655q.m87147d(f18) | c28655q.m87153g(c17919xM31989h);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                C38770y c38770y = new C38770y(abstractC17911t2, c17919xM31989h, f16, f14, f17, f18);
                c28655q.m87172p0(c38770y);
                objM87133R = c38770y;
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c31.o
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC3932p.m11967i(interfaceC39332e, abstractC17911t, f13, f14, f15, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m11966h(AbstractC17911t abstractC17911t, C17919x c17919x, float f13, float f14, float f15, float f16, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(-90.0f, jMo721B0);
            if (abstractC17911t != null) {
                C22135i c22135i = new C22135i(f14, 0.0f, 0, 0, null, 26);
                InterfaceC22131e.m63381X(Canvas, abstractC17911t, 0.0f, f13 * 360.0f, false, (((long) Float.floatToRawIntBits(f16)) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), c22135i, 0, 832);
            }
            if (c17919x != null) {
                InterfaceC22131e.m63380P(Canvas, c17919x.f69639a, 0.0f, f13 * 360.0f, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), 0.0f, new C22135i(f14, 0.0f, 1, 0, null, 26), 832);
            }
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m11967i(InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, float f13, float f14, float f15, int i13, Composer composer, int i14) {
        m11965g(interfaceC39332e, abstractC17911t, f13, f14, f15, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0139  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x019f  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:146:0x0220  */
    /* JADX WARN: Code duplicated, block: B:147:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x0237  */
    /* JADX WARN: Code duplicated, block: B:152:0x0245  */
    /* JADX WARN: Code duplicated, block: B:155:0x029e  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX INFO: renamed from: j */
    public static final void m11968j(final boolean z4, final int i13, final int i14, final InterfaceC39332e interfaceC39332e, final AbstractC17911t abstractC17911t, final EnumC16313m0 icon, boolean z13, Float f13, String str, Function1 function1, Composer composer, final int i15, final int i16) throws XmlPullParserException, IOException {
        int i17;
        boolean z14;
        int i18;
        Float f14;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        final String str2;
        final Function1 function2;
        final Float f15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        Float f16;
        String str3;
        C28676v0 c28676v0;
        Function1 function3;
        InterfaceC29805a interfaceC29805a;
        int i29;
        float fFloatValue;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R;
        C2314t c2314t;
        Modifier modifierM3599a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        boolean z24;
        long white20;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(icon, "icon");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1201551737);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87155h(z4) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= (i15 & 4096) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q.m87153g(abstractC17911t) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i17 |= c28655q.m87149e(icon.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i34 = i16 & 64;
        if (i34 == 0) {
            if ((1572864 & i15) == 0) {
                z14 = z13;
                i17 |= c28655q.m87155h(z14) ? 1048576 : 524288;
            }
            i18 = i16 & 128;
            if (i18 != 0) {
                if ((12582912 & i15) == 0) {
                    f14 = f13;
                    if (c28655q.m87153g(f14)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 256;
                if (i24 != 0) {
                    i17 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (c28655q.m87153g(str)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i17 |= i25;
                }
                i26 = i17;
                i27 = i16 & 512;
                if (i27 != 0) {
                    i26 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i26 |= i28;
                }
                if ((i26 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i26 & 1, z15)) {
                    if (i34 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        f16 = null;
                    } else {
                        f16 = f14;
                    }
                    if (i24 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3929m(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    } else {
                        function3 = function1;
                    }
                    interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
                    if (f16 != null) {
                        fFloatValue = f16.floatValue();
                    } else {
                        if (i14 < 1) {
                            i29 = 1;
                        } else {
                            i29 = i14;
                        }
                        fFloatValue = (i29 * 1.0f) / (i13 >= 1 ? i13 : 1);
                    }
                    float f17 = fFloatValue;
                    C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                    float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(AbstractC3928l.m11958c());
                    float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(AbstractC3928l.m11956a());
                    boolean zM87157i = c28655q.m87157i(interfaceC29805a);
                    if ((i26 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z25 = zM87157i | z17;
                    if ((i26 & 1879048192) == 536870912) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z25 | z18;
                    objM87133R = c28655q.m87133R();
                    if (z19 || objM87133R == c28676v0) {
                        objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    boolean z26 = z16;
                    c2314t = C2314t.f9131w;
                    Function1 function4 = function3;
                    Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, z4, null, null, interfaceC4339a, 14);
                    if (str3 != null) {
                        c28655q.m87150e0(-1169313942);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3929m(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1169105653);
                        c28655q.m87173q(false);
                        modifierM3599a = c2314t;
                    }
                    Modifier modifierMo3471e = modifierM3362g.mo3471e(modifierM3599a);
                    C2307m c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t);
                    float fM11958c = AbstractC3928l.m11958c();
                    c38072d = C38072d.f163053a;
                    C13825t c13825tM48880a = AbstractC17269i.m48880a(fM11958c, c38072d.m121949b(c28655q, 6).getWhite10());
                    AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3419p, c13825tM48880a.f49346b, AbstractC33253j.f138651a), c28655q, 0);
                    String str4 = str3;
                    m11965g(interfaceC39332e, abstractC17911t, f17, fMo743q0, fMo743q1, c28655q, (i26 >> 9) & 126);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * 4, C1100b.f4583a.mo3400a(c2314t, c2307m));
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
                    if (z4) {
                        white20 = AbstractC25012a.m73366B(c28655q, -1999288053, c38072d, c28655q, 6);
                        z24 = false;
                    } else {
                        z24 = false;
                        c28655q.m87150e0(-1999286968);
                        white20 = c38072d.m121949b(c28655q, 6).getWhite20();
                    }
                    c28655q.m87173q(z24);
                    AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p2, white20, c28655q, 48, 0);
                    c28655q.m87173q(true);
                    str2 = str4;
                    f15 = f16;
                    z14 = z26;
                    function2 = function4;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function2 = function1;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final boolean z27 = z14;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c31.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3932p.m11972n(z4, i13, i14, interfaceC39332e, abstractC17911t, icon, z27, f15, str2, function2, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i17 |= 12582912;
            f14 = f13;
            i24 = i16 & 256;
            if (i24 != 0) {
                i17 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q.m87153g(str)) {
                    i25 = 67108864;
                } else {
                    i25 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i25;
            }
            i26 = i17;
            i27 = i16 & 512;
            if (i27 != 0) {
                i26 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (c28655q.m87157i(function1)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i26 |= i28;
            }
            if ((i26 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i26 & 1, z15)) {
                if (i34 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3929m(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
                if (f16 != null) {
                    fFloatValue = f16.floatValue();
                } else {
                    if (i14 < 1) {
                        i29 = 1;
                    } else {
                        i29 = i14;
                    }
                    fFloatValue = (i29 * 1.0f) / (i13 >= 1 ? i13 : 1);
                }
                float f18 = fFloatValue;
                C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(AbstractC3928l.m11958c());
                float fMo743q3 = ((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(AbstractC3928l.m11956a());
                boolean zM87157i2 = c28655q.m87157i(interfaceC29805a);
                if ((i26 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z28 = zM87157i2 | z17;
                if ((i26 & 1879048192) == 536870912) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z28 | z18;
                objM87133R = c28655q.m87133R();
                if (z19) {
                    objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                boolean z29 = z16;
                c2314t = C2314t.f9131w;
                Function1 function5 = function3;
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, z4, null, null, interfaceC4339a2, 14);
                if (str3 != null) {
                    c28655q.m87150e0(-1169313942);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1169105653);
                    c28655q.m87173q(false);
                    modifierM3599a = c2314t;
                }
                Modifier modifierMo3471e2 = modifierM3362g2.mo3471e(modifierM3599a);
                C2307m c2307m2 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t);
                float fM11958c2 = AbstractC3928l.m11958c();
                c38072d = C38072d.f163053a;
                C13825t c13825tM48880a2 = AbstractC17269i.m48880a(fM11958c2, c38072d.m121949b(c28655q, 6).getWhite10());
                AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a2.f49345a, modifierM3419p3, c13825tM48880a2.f49346b, AbstractC33253j.f138651a), c28655q, 0);
                String str5 = str3;
                m11965g(interfaceC39332e, abstractC17911t, f18, fMo743q2, fMo743q3, c28655q, (i26 >> 9) & 126);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(6 * 4, C1100b.f4583a.mo3400a(c2314t, c2307m2));
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
                if (z4) {
                    white20 = AbstractC25012a.m73366B(c28655q, -1999288053, c38072d, c28655q, 6);
                    z24 = false;
                } else {
                    z24 = false;
                    c28655q.m87150e0(-1999286968);
                    white20 = c38072d.m121949b(c28655q, 6).getWhite20();
                }
                c28655q.m87173q(z24);
                AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p4, white20, c28655q, 48, 0);
                c28655q.m87173q(true);
                str2 = str5;
                f15 = f16;
                z14 = z29;
                function2 = function5;
            } else {
                c28655q.m87138X();
                str2 = str;
                function2 = function1;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final boolean z210 = z14;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c31.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3932p.m11972n(z4, i13, i14, interfaceC39332e, abstractC17911t, icon, z210, f15, str2, function2, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i17 |= 1572864;
        z14 = z13;
        i18 = i16 & 128;
        if (i18 != 0) {
            if ((12582912 & i15) == 0) {
                f14 = f13;
                if (c28655q.m87153g(f14)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i17 |= i19;
            }
            i24 = i16 & 256;
            if (i24 != 0) {
                i17 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q.m87153g(str)) {
                    i25 = 67108864;
                } else {
                    i25 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i25;
            }
            i26 = i17;
            i27 = i16 & 512;
            if (i27 != 0) {
                i26 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (c28655q.m87157i(function1)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i26 |= i28;
            }
            if ((i26 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i26 & 1, z15)) {
                if (i34 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    f16 = null;
                } else {
                    f16 = f14;
                }
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3929m(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
                if (f16 != null) {
                    fFloatValue = f16.floatValue();
                } else {
                    if (i14 < 1) {
                        i29 = 1;
                    } else {
                        i29 = i14;
                    }
                    fFloatValue = (i29 * 1.0f) / (i13 >= 1 ? i13 : 1);
                }
                float f19 = fFloatValue;
                C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                float fMo743q4 = ((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(AbstractC3928l.m11958c());
                float fMo743q5 = ((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(AbstractC3928l.m11956a());
                boolean zM87157i3 = c28655q.m87157i(interfaceC29805a);
                if ((i26 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z211 = zM87157i3 | z17;
                if ((i26 & 1879048192) == 536870912) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z211 | z18;
                objM87133R = c28655q.m87133R();
                if (z19) {
                    objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                boolean z212 = z16;
                c2314t = C2314t.f9131w;
                Function1 function6 = function3;
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t, z4, null, null, interfaceC4339a3, 14);
                if (str3 != null) {
                    c28655q.m87150e0(-1169313942);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1169105653);
                    c28655q.m87173q(false);
                    modifierM3599a = c2314t;
                }
                Modifier modifierMo3471e3 = modifierM3362g3.mo3471e(modifierM3599a);
                C2307m c2307m3 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                Modifier modifierM3419p5 = AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t);
                float fM11958c3 = AbstractC3928l.m11958c();
                c38072d = C38072d.f163053a;
                C13825t c13825tM48880a3 = AbstractC17269i.m48880a(fM11958c3, c38072d.m121949b(c28655q, 6).getWhite10());
                AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a3.f49345a, modifierM3419p5, c13825tM48880a3.f49346b, AbstractC33253j.f138651a), c28655q, 0);
                String str6 = str3;
                m11965g(interfaceC39332e, abstractC17911t, f19, fMo743q4, fMo743q5, c28655q, (i26 >> 9) & 126);
                Modifier modifierM3419p6 = AbstractC1102d.m3419p(6 * 4, C1100b.f4583a.mo3400a(c2314t, c2307m3));
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
                if (z4) {
                    white20 = AbstractC25012a.m73366B(c28655q, -1999288053, c38072d, c28655q, 6);
                    z24 = false;
                } else {
                    z24 = false;
                    c28655q.m87150e0(-1999286968);
                    white20 = c38072d.m121949b(c28655q, 6).getWhite20();
                }
                c28655q.m87173q(z24);
                AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM3419p6, white20, c28655q, 48, 0);
                c28655q.m87173q(true);
                str2 = str6;
                f15 = f16;
                z14 = z212;
                function2 = function6;
            } else {
                c28655q.m87138X();
                str2 = str;
                function2 = function1;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final boolean z213 = z14;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c31.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3932p.m11972n(z4, i13, i14, interfaceC39332e, abstractC17911t, icon, z213, f15, str2, function2, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i17 |= 12582912;
        f14 = f13;
        i24 = i16 & 256;
        if (i24 != 0) {
            i17 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q.m87153g(str)) {
                i25 = 67108864;
            } else {
                i25 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i17 |= i25;
        }
        i26 = i17;
        i27 = i16 & 512;
        if (i27 != 0) {
            i26 |= 805306368;
        } else if ((i15 & 805306368) == 0) {
            if (c28655q.m87157i(function1)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i26 |= i28;
        }
        if ((i26 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i26 & 1, z15)) {
            if (i34 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i18 != 0) {
                f16 = null;
            } else {
                f16 = f14;
            }
            if (i24 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3929m(0);
                    c28655q.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function1;
            }
            interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
            if (f16 != null) {
                fFloatValue = f16.floatValue();
            } else {
                if (i14 < 1) {
                    i29 = 1;
                } else {
                    i29 = i14;
                }
                fFloatValue = (i29 * 1.0f) / (i13 >= 1 ? i13 : 1);
            }
            float f110 = fFloatValue;
            C28674u2 c28674u5 = AbstractC2453v1.f9569h;
            float fMo743q6 = ((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(AbstractC3928l.m11958c());
            float fMo743q7 = ((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(AbstractC3928l.m11956a());
            boolean zM87157i4 = c28655q.m87157i(interfaceC29805a);
            if ((i26 & 3670016) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z214 = zM87157i4 | z17;
            if ((i26 & 1879048192) == 536870912) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z214 | z18;
            objM87133R = c28655q.m87133R();
            if (z19) {
                objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3433d0(interfaceC29805a, z16, function3, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            boolean z215 = z16;
            c2314t = C2314t.f9131w;
            Function1 function7 = function3;
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t, z4, null, null, interfaceC4339a4, 14);
            if (str3 != null) {
                c28655q.m87150e0(-1169313942);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C3929m(1);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3599a = AbstractC1136a.m3599a(AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2), str3);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1169105653);
                c28655q.m87173q(false);
                modifierM3599a = c2314t;
            }
            Modifier modifierMo3471e4 = modifierM3362g4.mo3471e(modifierM3599a);
            C2307m c2307m4 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            Modifier modifierM3419p7 = AbstractC1102d.m3419p(AbstractC3928l.m11957b(), c2314t);
            float fM11958c4 = AbstractC3928l.m11958c();
            c38072d = C38072d.f163053a;
            C13825t c13825tM48880a4 = AbstractC17269i.m48880a(fM11958c4, c38072d.m121949b(c28655q, 6).getWhite10());
            AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a4.f49345a, modifierM3419p7, c13825tM48880a4.f49346b, AbstractC33253j.f138651a), c28655q, 0);
            String str7 = str3;
            m11965g(interfaceC39332e, abstractC17911t, f110, fMo743q6, fMo743q7, c28655q, (i26 >> 9) & 126);
            Modifier modifierM3419p8 = AbstractC1102d.m3419p(6 * 4, C1100b.f4583a.mo3400a(c2314t, c2307m4));
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
            if (z4) {
                white20 = AbstractC25012a.m73366B(c28655q, -1999288053, c38072d, c28655q, 6);
                z24 = false;
            } else {
                z24 = false;
                c28655q.m87150e0(-1999286968);
                white20 = c38072d.m121949b(c28655q, 6).getWhite20();
            }
            c28655q.m87173q(z24);
            AbstractC15005f3.m43108b(c27430eM107874S4, null, modifierM3419p8, white20, c28655q, 48, 0);
            c28655q.m87173q(true);
            str2 = str7;
            f15 = f16;
            z14 = z215;
            function2 = function7;
        } else {
            c28655q.m87138X();
            str2 = str;
            function2 = function1;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final boolean z216 = z14;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c31.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3932p.m11972n(z4, i13, i14, interfaceC39332e, abstractC17911t, icon, z216, f15, str2, function2, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m11969k(EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m11970l(InterfaceC29805a interfaceC29805a, boolean z4, Function1 function1) {
        interfaceC29805a.mo7428a(0);
        if (z4) {
            function1.invoke(EnumC3919c.ERROR_BUTTON);
        } else {
            function1.invoke(EnumC3919c.PROGRESS_BUTTON);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m11971m(InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18042x.m51816a(semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m11972n(boolean z4, int i13, int i14, InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, EnumC16313m0 enumC16313m0, boolean z13, Float f13, String str, Function1 function1, int i15, int i16, Composer composer, int i17) throws XmlPullParserException, IOException {
        m11968j(z4, i13, i14, interfaceC39332e, abstractC17911t, enumC16313m0, z13, f13, str, function1, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}

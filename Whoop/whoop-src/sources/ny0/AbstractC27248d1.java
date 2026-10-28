package ny0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import j93.AbstractC21478l0;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2124a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13933e;
import p208i2.AbstractC17918w0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ny0.d1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aw\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "text", "Lny0/e0;", "type", "Li2/x;", "backgroundColor", "", "isToggled", "enabled", "Lny0/d0;", "buttonStyle", "Lkotlin/Function0;", "Ll83/a0;", "content", "Lkotlin/Function1;", "onToggle", "e", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27248d1 {
    /* JADX WARN: Code duplicated, block: B:111:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x0178  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x0229  */
    /* JADX WARN: Code duplicated, block: B:148:0x022d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0242  */
    /* JADX WARN: Code duplicated, block: B:154:0x0253  */
    /* JADX WARN: Code duplicated, block: B:158:0x027d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0281  */
    /* JADX WARN: Code duplicated, block: B:162:0x028e  */
    /* JADX WARN: Code duplicated, block: B:164:0x029c  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:183:0x02db  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:190:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:192:0x0328  */
    /* JADX WARN: Code duplicated, block: B:195:0x0355  */
    /* JADX WARN: Code duplicated, block: B:198:0x0364  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    /* JADX INFO: renamed from: e */
    public static final void m82113e(Modifier modifier, TextResource textResource, final EnumC27250e0 type, long j7, boolean z4, boolean z13, EnumC27247d0 enumC27247d0, InterfaceC4351m interfaceC4351m, final Function1 onToggle, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResourceM21267a;
        long jM125430y;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        int i18;
        int iOrdinal;
        int i19;
        int i24;
        final InterfaceC4351m interfaceC4351mM121344e;
        int i25;
        boolean z16;
        final Modifier modifier3;
        final TextResource textResource2;
        final boolean z17;
        final EnumC27247d0 enumC27247d1;
        final long j13;
        final boolean z18;
        C28677v1 c28677v1M87180u;
        int i26;
        C2314t c2314t;
        EnumC27247d0 enumC27247d2;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean z19;
        int i27;
        boolean z24;
        boolean z25;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        EnumC27247d0 enumC27247d3;
        int iHashCode2;
        boolean z26;
        float f13;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R3;
        EnumC27247d0 enumC27247d4;
        int i28;
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(518823032);
        int i29 = i14 & 1;
        if (i29 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                textResourceM21267a = textResource;
                int i34 = c28655q.m87153g(textResourceM21267a) ? 32 : 16;
                i15 |= i34;
            } else {
                textResourceM21267a = textResource;
            }
            i15 |= i34;
        } else {
            textResourceM21267a = textResource;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(type.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            jM125430y = j7;
            i15 |= ((i14 & 8) == 0 && c28655q.m87151f(jM125430y)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            jM125430y = j7;
        }
        int i35 = i14 & 16;
        if (i35 == 0) {
            if ((i13 & 24576) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (enumC27247d0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC27247d0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
                interfaceC4351mM121344e = interfaceC4351m;
            } else {
                interfaceC4351mM121344e = interfaceC4351m;
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(interfaceC4351mM121344e)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
            if ((i15 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28655q.m87140Z();
                i26 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i26 != 0 || c28655q.m87118C()) {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -7169;
                    }
                    if (i35 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        enumC27247d2 = EnumC27247d0.DEFAULT;
                    } else {
                        enumC27247d2 = enumC27247d0;
                    }
                    if (i24 != 0) {
                        interfaceC4351mM121344e = AbstractC37817c.m121344e(1745024549, c28655q, new C2124a0(textResourceM21267a, type, z14, enumC27247d2, 6));
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    enumC27247d2 = enumC27247d0;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                TextResource textResource3 = textResourceM21267a;
                Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1099a.m3394p(enumC27247d2.getPadding() * 8, modifier2), z15);
                C18027i c18027i = new C18027i(3);
                Modifier modifier4 = modifier2;
                if ((234881024 & i15) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i27 = 57344 & i15;
                boolean z34 = z19;
                if (i27 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z34 | z24;
                objM87133R2 = c28655q.m87133R();
                if (z25 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C3675b(onToggle, z14, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                boolean z35 = z15;
                Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44112a, interfaceC21083i, null, z35, c18027i, (InterfaceC4339a) objM87133R2, 8);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                InterfaceC4351m interfaceC4351m2 = interfaceC4351mM121344e;
                if (c28655q.f115903S) {
                    enumC27247d3 = enumC27247d2;
                } else {
                    enumC27247d3 = enumC27247d2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    z26 = z14;
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    f13 = 4;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(enumC27247d3.getCanvasSize() * f13, c2314t);
                    if (i27 == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if ((3670016 & i15) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z27 | z28 | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(jM125430y)) || (i15 & 3072) == 2048);
                    objM87133R3 = c28655q.m87133R();
                    if (!z29 || objM87133R3 == c28676v0) {
                        enumC27247d4 = enumC27247d3;
                        z14 = z26;
                        objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        enumC27247d4 = enumC27247d3;
                        z14 = z26;
                    }
                    AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R3, c28655q, 0);
                    if (z14) {
                        c28655q.m87150e0(-727497608);
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(enumC27247d4.getToggleSize() * f13, c2314t), AbstractC33253j.f138651a), C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), AbstractC17918w0.f69621a), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-727243904);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(enumC27247d4.getTextSpacing() * f13, c2314t));
                    interfaceC4351mM121344e = interfaceC4351m2;
                    AbstractC11895b.m32007z((i15 >> 21) & 14, interfaceC4351mM121344e, c28655q, true);
                    textResource2 = textResource3;
                    enumC27247d1 = enumC27247d4;
                    modifier3 = modifier4;
                    z17 = z35;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                z26 = z14;
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                f13 = 4;
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(enumC27247d3.getCanvasSize() * f13, c2314t);
                if (i27 == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((3670016 & i15) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z27 | z28 | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(jM125430y)) || (i15 & 3072) == 2048);
                objM87133R3 = c28655q.m87133R();
                if (z29) {
                    enumC27247d4 = enumC27247d3;
                    z14 = z26;
                    objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    enumC27247d4 = enumC27247d3;
                    z14 = z26;
                    objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21478l0.m60421a(modifierM3419p2, (Function1) objM87133R3, c28655q, 0);
                if (z14) {
                    c28655q.m87150e0(-727497608);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(enumC27247d4.getToggleSize() * f13, c2314t), AbstractC33253j.f138651a), C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), AbstractC17918w0.f69621a), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-727243904);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(enumC27247d4.getTextSpacing() * f13, c2314t));
                interfaceC4351mM121344e = interfaceC4351m2;
                AbstractC11895b.m32007z((i15 >> 21) & 14, interfaceC4351mM121344e, c28655q, true);
                textResource2 = textResource3;
                enumC27247d1 = enumC27247d4;
                modifier3 = modifier4;
                z17 = z35;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                textResource2 = textResourceM21267a;
                z17 = z15;
                enumC27247d1 = enumC27247d0;
            }
            j13 = jM125430y;
            z18 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.c1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC27248d1.m82117i(modifier3, textResource2, type, j13, z18, z17, enumC27247d1, interfaceC4351mM121344e, onToggle, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 24576;
        z14 = z4;
        i16 = i14 & 32;
        if (i16 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z13;
        } else {
            z15 = z13;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z15)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (enumC27247d0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC27247d0.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
            interfaceC4351mM121344e = interfaceC4351m;
        } else {
            interfaceC4351mM121344e = interfaceC4351m;
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(interfaceC4351mM121344e)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q.m87157i(onToggle)) {
                i28 = 67108864;
            } else {
                i28 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i28;
        }
        if ((i15 & 38347923) != 38347922) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c28655q.m87140Z();
            i26 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if ((i14 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -7169;
                }
                if (i35 != 0) {
                    z14 = true;
                }
                if (i16 != 0) {
                    z15 = true;
                }
                if (i18 != 0) {
                    enumC27247d2 = EnumC27247d0.DEFAULT;
                } else {
                    enumC27247d2 = enumC27247d0;
                }
                if (i24 != 0) {
                    interfaceC4351mM121344e = AbstractC37817c.m121344e(1745024549, c28655q, new C2124a0(textResourceM21267a, type, z14, enumC27247d2, 6));
                }
            } else {
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if ((i14 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -7169;
                }
                if (i35 != 0) {
                    z14 = true;
                }
                if (i16 != 0) {
                    z15 = true;
                }
                if (i18 != 0) {
                    enumC27247d2 = EnumC27247d0.DEFAULT;
                } else {
                    enumC27247d2 = enumC27247d0;
                }
                if (i24 != 0) {
                    interfaceC4351mM121344e = AbstractC37817c.m121344e(1745024549, c28655q, new C2124a0(textResourceM21267a, type, z14, enumC27247d2, 6));
                }
            }
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            TextResource textResource4 = textResourceM21267a;
            Modifier modifierM44112a2 = AbstractC15680h.m44112a(AbstractC1099a.m3394p(enumC27247d2.getPadding() * 8, modifier2), z15);
            C18027i c18027i2 = new C18027i(3);
            Modifier modifier5 = modifier2;
            if ((234881024 & i15) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            i27 = 57344 & i15;
            boolean z36 = z19;
            if (i27 == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z36 | z24;
            objM87133R2 = c28655q.m87133R();
            if (z25) {
                objM87133R2 = new C3675b(onToggle, z14, 5);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3675b(onToggle, z14, 5);
                c28655q.m87172p0(objM87133R2);
            }
            boolean z37 = z15;
            Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM44112a2, interfaceC21083i2, null, z37, c18027i2, (InterfaceC4339a) objM87133R2, 8);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3360e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            InterfaceC4351m interfaceC4351m3 = interfaceC4351mM121344e;
            if (c28655q.f115903S) {
                enumC27247d3 = enumC27247d2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                z26 = z14;
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                f13 = 4;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(enumC27247d3.getCanvasSize() * f13, c2314t);
                if (i27 == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((3670016 & i15) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z27 | z28 | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(jM125430y)) || (i15 & 3072) == 2048);
                objM87133R3 = c28655q.m87133R();
                if (z29) {
                    enumC27247d4 = enumC27247d3;
                    z14 = z26;
                    objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    enumC27247d4 = enumC27247d3;
                    z14 = z26;
                    objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21478l0.m60421a(modifierM3419p3, (Function1) objM87133R3, c28655q, 0);
                if (z14) {
                    c28655q.m87150e0(-727497608);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(enumC27247d4.getToggleSize() * f13, c2314t), AbstractC33253j.f138651a), C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), AbstractC17918w0.f69621a), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-727243904);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(enumC27247d4.getTextSpacing() * f13, c2314t));
                interfaceC4351mM121344e = interfaceC4351m3;
                AbstractC11895b.m32007z((i15 >> 21) & 14, interfaceC4351mM121344e, c28655q, true);
                textResource2 = textResource4;
                enumC27247d1 = enumC27247d4;
                modifier3 = modifier5;
                z17 = z37;
            } else {
                enumC27247d3 = enumC27247d2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            z26 = z14;
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            f13 = 4;
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(enumC27247d3.getCanvasSize() * f13, c2314t);
            if (i27 == 16384) {
                z27 = true;
            } else {
                z27 = false;
            }
            if ((3670016 & i15) == 1048576) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z27 | z28 | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(jM125430y)) || (i15 & 3072) == 2048);
            objM87133R3 = c28655q.m87133R();
            if (z29) {
                enumC27247d4 = enumC27247d3;
                z14 = z26;
                objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                c28655q.m87172p0(objM87133R3);
            } else {
                enumC27247d4 = enumC27247d3;
                z14 = z26;
                objM87133R3 = new C13933e(z14, enumC27247d4, jM125430y);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3419p4, (Function1) objM87133R3, c28655q, 0);
            if (z14) {
                c28655q.m87150e0(-727497608);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(enumC27247d4.getToggleSize() * f13, c2314t), AbstractC33253j.f138651a), C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), AbstractC17918w0.f69621a), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-727243904);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(enumC27247d4.getTextSpacing() * f13, c2314t));
            interfaceC4351mM121344e = interfaceC4351m3;
            AbstractC11895b.m32007z((i15 >> 21) & 14, interfaceC4351mM121344e, c28655q, true);
            textResource2 = textResource4;
            enumC27247d1 = enumC27247d4;
            modifier3 = modifier5;
            z17 = z37;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            textResource2 = textResourceM21267a;
            z17 = z15;
            enumC27247d1 = enumC27247d0;
        }
        j13 = jM125430y;
        z18 = z14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.c1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC27248d1.m82117i(modifier3, textResource2, type, j13, z18, z17, enumC27247d1, interfaceC4351mM121344e, onToggle, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82114f(TextResource textResource, EnumC27250e0 enumC27250e0, boolean z4, EnumC27247d0 enumC27247d0, Composer composer, int i13) {
        long jMo134584toComposableColorWaAFU9c;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String upperCase = AbstractC8693b.m21274h(textResource, c28655q, 0).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            c28655q.m87150e0(1931348969);
            C39336i c39336iM121949b = C38072d.f163053a.m121949b(c28655q, 6);
            if (z4) {
                c28655q.m87150e0(-718470533);
                c28655q.m87173q(false);
                jMo134584toComposableColorWaAFU9c = c39336iM121949b.getBrandWhite();
            } else {
                c28655q.m87150e0(-718469308);
                jMo134584toComposableColorWaAFU9c = enumC27247d0.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            }
            long j7 = jMo134584toComposableColorWaAFU9c;
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(upperCase, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enumC27250e0.getStyle(), null, c28655q, 0, 0, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82115g(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m82116h(boolean z4, EnumC27247d0 enumC27247d0, long j7, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63379M(Canvas, j7, 0.0f, 0L, 0.0f, z4 ? C22134h.f85857a : new C22135i(enumC27247d0.getBorderStroke().f49345a, 0.0f, 0, 0, null, 30), 110);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82117i(Modifier modifier, TextResource textResource, EnumC27250e0 enumC27250e0, long j7, boolean z4, boolean z13, EnumC27247d0 enumC27247d0, InterfaceC4351m interfaceC4351m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m82113e(modifier, textResource, enumC27250e0, j7, z4, z13, enumC27247d0, interfaceC4351m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

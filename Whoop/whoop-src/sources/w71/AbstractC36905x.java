package w71;

import a31.C0341c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import hy0.AbstractC17763k2;
import i93.C18279e;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import qz0.AbstractC30795n;
import um0.C35076b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w71.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "context", "level", "", "min", "max", "increment", "preSetNumber", "", "isSubQuestion", "enabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Ll83/a0;", "selectedNumber", "d", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36905x {
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x01be  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:136:0x0227  */
    /* JADX WARN: Code duplicated, block: B:137:0x022b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0238  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246  */
    /* JADX WARN: Code duplicated, block: B:146:0x0258  */
    /* JADX WARN: Code duplicated, block: B:149:0x0264  */
    /* JADX WARN: Code duplicated, block: B:152:0x028c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0290  */
    /* JADX WARN: Code duplicated, block: B:156:0x029d  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x0300  */
    /* JADX WARN: Code duplicated, block: B:173:0x0304  */
    /* JADX WARN: Code duplicated, block: B:176:0x038b  */
    /* JADX WARN: Code duplicated, block: B:177:0x038f  */
    /* JADX WARN: Code duplicated, block: B:180:0x039e  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    /* JADX INFO: renamed from: d */
    public static final void m118503d(final TextResource question, final TextResource context, final TextResource level, final int i13, final int i14, int i15, Integer num, boolean z4, final boolean z13, Modifier modifier, final Function1 selectedNumber, Composer composer, final int i16, final int i17, final int i18) {
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        boolean z14;
        final int i36;
        final Integer num2;
        final boolean z15;
        final Modifier modifier2;
        C28677v1 c28677v1M87180u;
        int i37;
        Integer num3;
        boolean z16;
        C2314t c2314t;
        Modifier modifier3;
        C36875c c36875c;
        float fM118269a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        int iHashCode2;
        int iHashCode3;
        C0209i c0209i2;
        boolean z18;
        C0209i c0209i3;
        float f13;
        int iHashCode4;
        int i38;
        int i39;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(selectedNumber, "selectedNumber");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-563527877);
        if ((i16 & 6) == 0) {
            i19 = (c28655q.m87153g(question) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= c28655q.m87153g(context) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i19 |= c28655q.m87153g(level) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i16 & 24576) == 0) {
            i19 |= c28655q.m87149e(i14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i44 = i18 & 32;
        if (i44 == 0) {
            if ((196608 & i16) == 0) {
                i19 |= c28655q.m87149e(i15) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i24 = i18 & 64;
            if (i24 != 0) {
                i19 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                if (c28655q.m87153g(num)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i19 |= i25;
            }
            i26 = i18 & 128;
            if (i26 != 0) {
                if ((i16 & 12582912) == 0) {
                    int i45 = i19;
                    if (c28655q.m87155h(z4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i28 = i45 | i27;
                }
                if ((i16 & 100663296) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i39 = 67108864;
                    } else {
                        i39 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i39;
                }
                i29 = i18 & 512;
                if (i29 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (c28655q.m87153g(modifier)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i28 |= i34;
                    }
                    if ((i17 & 6) == 0) {
                        if (c28655q.m87157i(selectedNumber)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i35 = i17 | i38;
                    } else {
                        i35 = i17;
                    }
                    if ((i28 & 306783379) == 306783378 || (i35 & 3) != 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z14)) {
                        if (i44 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i15;
                        }
                        if (i24 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i26 != 0) {
                            z16 = false;
                        } else {
                            z16 = z4;
                        }
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        C36903v c36903v = new C36903v(i37, i13, i14, num3);
                        c36875c = C36875c.f157714a;
                        if (z16) {
                            fM118269a = c36875c.m118270b();
                        } else {
                            fM118269a = c36875c.m118269a();
                        }
                        float f14 = fM118269a;
                        int i46 = i37;
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                        float f15 = 1 * 8;
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
                        C2305k c2305k = C2299e.f9110M;
                        Modifier modifier4 = modifier3;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i4 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                        C0209i c0209i5 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i6 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 0.0f, 0.0f, 14);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                            Integer num4 = num3;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                            if (2.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                c0209i2 = c0209i;
                            } else {
                                c0209i2 = c0209i;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                            if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            c0209i3 = c0209i2;
                            AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                            c28655q.m87173q(true);
                            String strM21274h = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f15, 0.0f, 0.0f, 0.0f, 14);
                            C38072d c38072d = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h, modifierM3398t2, c38072d.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                            c28655q.m87173q(true);
                            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                            AbstractC39330c.m125320b(c38072d.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v, z13, selectedNumber, 15)), c28655q, 24576, 14);
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            num2 = num4;
                            z15 = z17;
                            i36 = i46;
                            modifier2 = modifier4;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 0.0f, 0.0f, 14);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        Integer num5 = num3;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                        if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        c0209i3 = c0209i2;
                        AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                        c28655q.m87173q(true);
                        String strM21274h2 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f15, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d2 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h2, modifierM3398t4, c38072d2.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                        c28655q.m87173q(true);
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m7);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
                        AbstractC39330c.m125320b(c38072d2.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v, z13, selectedNumber, 15)), c28655q, 24576, 14);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        num2 = num5;
                        z15 = z17;
                        i36 = i46;
                        modifier2 = modifier4;
                    } else {
                        c28655q.m87138X();
                        i36 = i15;
                        num2 = num;
                        z15 = z4;
                        modifier2 = modifier;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i28 |= 805306368;
                if ((i17 & 6) == 0) {
                    if (c28655q.m87157i(selectedNumber)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i35 = i17 | i38;
                } else {
                    i35 = i17;
                }
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    if (i44 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i15;
                    }
                    if (i24 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i26 != 0) {
                        z16 = false;
                    } else {
                        z16 = z4;
                    }
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    C36903v c36903v2 = new C36903v(i37, i13, i14, num3);
                    c36875c = C36875c.f157714a;
                    if (z16) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f16 = fM118269a;
                    int i47 = i37;
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                    float f17 = 1 * 8;
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                    C2305k c2305k2 = C2299e.f9110M;
                    Modifier modifier5 = modifier3;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM44101d2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a4);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z17 = z16;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i10 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 0.0f, 0.0f, 14);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        Integer num6 = num3;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N10);
                        if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        c0209i3 = c0209i2;
                        AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                        c28655q.m87173q(true);
                        String strM21274h3 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f17, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d3 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h3, modifierM3398t6, c38072d3.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                        c28655q.m87173q(true);
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N11);
                        AbstractC39330c.m125320b(c38072d3.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v2, z13, selectedNumber, 15)), c28655q, 24576, 14);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        num2 = num6;
                        z15 = z17;
                        i36 = i47;
                        modifier2 = modifier5;
                    } else {
                        z17 = z16;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i11 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N8);
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Integer num7 = num3;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N12);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m13);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N13);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    c28655q.m87173q(true);
                    String strM21274h4 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f17, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d4 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h4, modifierM3398t8, c38072d4.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N14);
                    AbstractC39330c.m125320b(c38072d4.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v2, z13, selectedNumber, 15)), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    num2 = num7;
                    z15 = z17;
                    i36 = i47;
                    modifier2 = modifier5;
                } else {
                    c28655q.m87138X();
                    i36 = i15;
                    num2 = num;
                    z15 = z4;
                    modifier2 = modifier;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i19 |= 12582912;
            i28 = i19;
            if ((i16 & 100663296) == 0) {
                if (c28655q.m87155h(z13)) {
                    i39 = 67108864;
                } else {
                    i39 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i28 |= i39;
            }
            i29 = i18 & 512;
            if (i29 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (c28655q.m87153g(modifier)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i28 |= i34;
                }
                if ((i17 & 6) == 0) {
                    if (c28655q.m87157i(selectedNumber)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i35 = i17 | i38;
                } else {
                    i35 = i17;
                }
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    if (i44 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i15;
                    }
                    if (i24 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i26 != 0) {
                        z16 = false;
                    } else {
                        z16 = z4;
                    }
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    C36903v c36903v3 = new C36903v(i37, i13, i14, num3);
                    c36875c = C36875c.f157714a;
                    if (z16) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f18 = fM118269a;
                    int i48 = i37;
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                    float f19 = 1 * 8;
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f19);
                    C2305k c2305k3 = C2299e.f9110M;
                    Modifier modifier6 = modifier3;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k3, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM44101d3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i12 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a7);
                    C0209i c0209i13 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z17 = z16;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i14 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N15);
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 0.0f, 0.0f, 14);
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        Integer num8 = num3;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m16);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N16);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m17);
                        if (c28655q.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N17);
                        if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        c0209i3 = c0209i2;
                        AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                        c28655q.m87173q(true);
                        String strM21274h5 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        Modifier modifierM3398t10 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f19, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d5 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h5, modifierM3398t10, c38072d5.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                        c28655q.m87173q(true);
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 2);
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m18);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N18);
                        AbstractC39330c.m125320b(c38072d5.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v3, z13, selectedNumber, 15)), c28655q, 24576, 14);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        num2 = num8;
                        z15 = z17;
                        i36 = i48;
                        modifier2 = modifier6;
                    } else {
                        z17 = z16;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N15);
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Integer num9 = num3;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m19);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N19);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N110);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    c28655q.m87173q(true);
                    String strM21274h6 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f19, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d6 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h6, modifierM3398t12, c38072d6.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 2);
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N111);
                    AbstractC39330c.m125320b(c38072d6.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v3, z13, selectedNumber, 15)), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    num2 = num9;
                    z15 = z17;
                    i36 = i48;
                    modifier2 = modifier6;
                } else {
                    c28655q.m87138X();
                    i36 = i15;
                    num2 = num;
                    z15 = z4;
                    modifier2 = modifier;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i28 |= 805306368;
            if ((i17 & 6) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i35 = i17 | i38;
            } else {
                i35 = i17;
            }
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                if (i44 != 0) {
                    i37 = 1;
                } else {
                    i37 = i15;
                }
                if (i24 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i26 != 0) {
                    z16 = false;
                } else {
                    z16 = z4;
                }
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                C36903v c36903v4 = new C36903v(i37, i13, i14, num3);
                c36875c = C36875c.f157714a;
                if (z16) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f110 = fM118269a;
                int i49 = i37;
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                float f111 = 1 * 8;
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f111);
                C2305k c2305k4 = C2299e.f9110M;
                Modifier modifier7 = modifier3;
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k4, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM44101d4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i16 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a10);
                C0209i c0209i17 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m112);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z17 = z16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i18 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N112);
                    Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Integer num10 = num3;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3398t13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N113);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m114);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N114);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    c28655q.m87173q(true);
                    String strM21274h7 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f111, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d7 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h7, modifierM3398t14, c38072d7.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2);
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3396r7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N115);
                    AbstractC39330c.m125320b(c38072d7.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v4, z13, selectedNumber, 15)), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    num2 = num10;
                    z15 = z17;
                    i36 = i49;
                    modifier2 = modifier7;
                } else {
                    z17 = z16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N112);
                Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Integer num11 = num3;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N116);
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m117);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N117);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                c28655q.m87173q(true);
                String strM21274h8 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3398t16 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f111, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d8 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h8, modifierM3398t16, c38072d8.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                c28655q.m87173q(true);
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2);
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3396r8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N118);
                AbstractC39330c.m125320b(c38072d8.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v4, z13, selectedNumber, 15)), c28655q, 24576, 14);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                num2 = num11;
                z15 = z17;
                i36 = i49;
                modifier2 = modifier7;
            } else {
                c28655q.m87138X();
                i36 = i15;
                num2 = num;
                z15 = z4;
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i19 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i18 & 64;
        if (i24 != 0) {
            i19 |= 1572864;
        } else if ((i16 & 1572864) == 0) {
            if (c28655q.m87153g(num)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i19 |= i25;
        }
        i26 = i18 & 128;
        if (i26 != 0) {
            if ((i16 & 12582912) == 0) {
                int i410 = i19;
                if (c28655q.m87155h(z4)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i28 = i410 | i27;
            }
            if ((i16 & 100663296) == 0) {
                if (c28655q.m87155h(z13)) {
                    i39 = 67108864;
                } else {
                    i39 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i28 |= i39;
            }
            i29 = i18 & 512;
            if (i29 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (c28655q.m87153g(modifier)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i28 |= i34;
                }
                if ((i17 & 6) == 0) {
                    if (c28655q.m87157i(selectedNumber)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i35 = i17 | i38;
                } else {
                    i35 = i17;
                }
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    if (i44 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i15;
                    }
                    if (i24 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i26 != 0) {
                        z16 = false;
                    } else {
                        z16 = z4;
                    }
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    C36903v c36903v5 = new C36903v(i37, i13, i14, num3);
                    c36875c = C36875c.f157714a;
                    if (z16) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f112 = fM118269a;
                    int i411 = i37;
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                    float f113 = 1 * 8;
                    C22971k c22971kM66746i5 = AbstractC22977m.m66746i(f113);
                    C2305k c2305k5 = C2299e.f9110M;
                    Modifier modifier8 = modifier3;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22971kM66746i5, c2305k5, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM44101d5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a13);
                    C0209i c0209i111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m119);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z17 = z16;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N119);
                        Modifier modifierM3398t17 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f112, 0.0f, 0.0f, 0.0f, 14);
                        C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        Integer num12 = num3;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3398t17);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a17);
                        AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m1110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1110);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k5, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, layoutWeightElement9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m1111);
                        if (c28655q.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1111);
                        if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        c0209i3 = c0209i2;
                        AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                        c28655q.m87173q(true);
                        String strM21274h9 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        Modifier modifierM3398t18 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f113, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d9 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h9, modifierM3398t18, c38072d9.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                        c28655q.m87173q(true);
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f112, 0.0f, 2);
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3396r9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a18);
                        AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m1112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1112);
                        AbstractC39330c.m125320b(c38072d9.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v5, z13, selectedNumber, 15)), c28655q, 24576, 14);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        num2 = num12;
                        z15 = z17;
                        i36 = i411;
                        modifier2 = modifier8;
                    } else {
                        z17 = z16;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N119);
                    Modifier modifierM3398t19 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f112, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Integer num13 = num3;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM3398t19);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a19);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m1113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N1113);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k5, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, layoutWeightElement10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m1114);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N1114);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    c28655q.m87173q(true);
                    String strM21274h10 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3398t110 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f113, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d10 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h10, modifierM3398t110, c38072d10.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f112, 0.0f, 2);
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierM3396r10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m1115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N1115);
                    AbstractC39330c.m125320b(c38072d10.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v5, z13, selectedNumber, 15)), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    num2 = num13;
                    z15 = z17;
                    i36 = i411;
                    modifier2 = modifier8;
                } else {
                    c28655q.m87138X();
                    i36 = i15;
                    num2 = num;
                    z15 = z4;
                    modifier2 = modifier;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i28 |= 805306368;
            if ((i17 & 6) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i35 = i17 | i38;
            } else {
                i35 = i17;
            }
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                if (i44 != 0) {
                    i37 = 1;
                } else {
                    i37 = i15;
                }
                if (i24 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i26 != 0) {
                    z16 = false;
                } else {
                    z16 = z4;
                }
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                C36903v c36903v6 = new C36903v(i37, i13, i14, num3);
                c36875c = C36875c.f157714a;
                if (z16) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f114 = fM118269a;
                int i412 = i37;
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                float f115 = 1 * 8;
                C22971k c22971kM66746i6 = AbstractC22977m.m66746i(f115);
                C2305k c2305k6 = C2299e.f9110M;
                Modifier modifier9 = modifier3;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22971kM66746i6, c2305k6, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM44101d6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i114, c23010xM66775a16);
                C0209i c0209i115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m1116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z17 = z16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N1116);
                    Modifier modifierM3398t111 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Integer num14 = num3;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifierM3398t111);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a111);
                    AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m1117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N1117);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k6, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, layoutWeightElement11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i114, c23010xM66775a17);
                    AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m1118);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N1118);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    c28655q.m87173q(true);
                    String strM21274h11 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3398t112 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f115, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d11 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h11, modifierM3398t112, c38072d11.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 2);
                    C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, modifierM3396r11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a112);
                    AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m1119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N1119);
                    AbstractC39330c.m125320b(c38072d11.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v6, z13, selectedNumber, 15)), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    num2 = num14;
                    z15 = z17;
                    i36 = i412;
                    modifier2 = modifier9;
                } else {
                    z17 = z16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N1116);
                Modifier modifierM3398t113 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Integer num15 = num3;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3398t113);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a113);
                AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m11110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N11110);
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k6, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, layoutWeightElement12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i114, c23010xM66775a18);
                AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m11111);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N11111);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                c28655q.m87173q(true);
                String strM21274h12 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3398t114 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f115, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d12 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h12, modifierM3398t114, c38072d12.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                c28655q.m87173q(true);
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 2);
                C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, modifierM3396r12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a114);
                AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m11112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N11112);
                AbstractC39330c.m125320b(c38072d12.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v6, z13, selectedNumber, 15)), c28655q, 24576, 14);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                num2 = num15;
                z15 = z17;
                i36 = i412;
                modifier2 = modifier9;
            } else {
                c28655q.m87138X();
                i36 = i15;
                num2 = num;
                z15 = z4;
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i19 |= 12582912;
        i28 = i19;
        if ((i16 & 100663296) == 0) {
            if (c28655q.m87155h(z13)) {
                i39 = 67108864;
            } else {
                i39 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i28 |= i39;
        }
        i29 = i18 & 512;
        if (i29 != 0) {
            if ((i16 & 805306368) == 0) {
                if (c28655q.m87153g(modifier)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i28 |= i34;
            }
            if ((i17 & 6) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i35 = i17 | i38;
            } else {
                i35 = i17;
            }
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                if (i44 != 0) {
                    i37 = 1;
                } else {
                    i37 = i15;
                }
                if (i24 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i26 != 0) {
                    z16 = false;
                } else {
                    z16 = z4;
                }
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                C36903v c36903v7 = new C36903v(i37, i13, i14, num3);
                c36875c = C36875c.f157714a;
                if (z16) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f116 = fM118269a;
                int i413 = i37;
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
                float f117 = 1 * 8;
                C22971k c22971kM66746i7 = AbstractC22977m.m66746i(f117);
                C2305k c2305k7 = C2299e.f9110M;
                Modifier modifier10 = modifier3;
                C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22971kM66746i7, c2305k7, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM44101d7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i118 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i118, c23010xM66775a19);
                C0209i c0209i119 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11113);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z17 = z16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N11113);
                    Modifier modifierM3398t115 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f116, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Integer num16 = num3;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifierM3398t115);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i118, c22994r1M66759a115);
                    AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N11114);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k7, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                    Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, layoutWeightElement13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i118, c23010xM66775a110);
                    AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11115);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N11115);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    c28655q.m87173q(true);
                    String strM21274h13 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3398t116 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f117, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d13 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h13, modifierM3398t116, c38072d13.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f116, 0.0f, 2);
                    C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, modifierM3396r13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i118, c22994r1M66759a116);
                    AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11116);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N11116);
                    AbstractC39330c.m125320b(c38072d13.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v7, z13, selectedNumber, 15)), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    num2 = num16;
                    z15 = z17;
                    i36 = i413;
                    modifier2 = modifier10;
                } else {
                    z17 = z16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i1111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N11113);
                Modifier modifierM3398t117 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f116, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Integer num17 = num3;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, modifierM3398t117);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i118, c22994r1M66759a117);
                AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N11117);
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k7, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, layoutWeightElement14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i118, c23010xM66775a111);
                AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11118);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N11118);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                c28655q.m87173q(true);
                String strM21274h14 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3398t118 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f117, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d14 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h14, modifierM3398t118, c38072d14.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                c28655q.m87173q(true);
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f116, 0.0f, 2);
                C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q.m87165m();
                Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q, modifierM3396r14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i118, c22994r1M66759a118);
                AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC28653p1M87165m11119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N11119);
                AbstractC39330c.m125320b(c38072d14.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v7, z13, selectedNumber, 15)), c28655q, 24576, 14);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                num2 = num17;
                z15 = z17;
                i36 = i413;
                modifier2 = modifier10;
            } else {
                c28655q.m87138X();
                i36 = i15;
                num2 = num;
                z15 = z4;
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i28 |= 805306368;
        if ((i17 & 6) == 0) {
            if (c28655q.m87157i(selectedNumber)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i35 = i17 | i38;
        } else {
            i35 = i17;
        }
        if ((i28 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q.m87135U(i28 & 1, z14)) {
            if (i44 != 0) {
                i37 = 1;
            } else {
                i37 = i15;
            }
            if (i24 != 0) {
                num3 = null;
            } else {
                num3 = num;
            }
            if (i26 != 0) {
                z16 = false;
            } else {
                z16 = z4;
            }
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            C36903v c36903v8 = new C36903v(i37, i13, i14, num3);
            c36875c = C36875c.f157714a;
            if (z16) {
                fM118269a = c36875c.m118270b();
            } else {
                fM118269a = c36875c.m118269a();
            }
            float f118 = fM118269a;
            int i414 = i37;
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC36871a.m118259c("Journal_Slider_", question, c28655q, ((i28 << 3) & 112) | 6));
            float f119 = 1 * 8;
            C22971k c22971kM66746i8 = AbstractC22977m.m66746i(f119);
            C2305k c2305k8 = C2299e.f9110M;
            Modifier modifier11 = modifier3;
            C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22971kM66746i8, c2305k8, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
            Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, modifierM44101d8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i1112 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i1112, c23010xM66775a112);
            C0209i c0209i1113 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111110);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                z17 = z16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N111110);
                Modifier modifierM3398t119 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Integer num18 = num3;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q.m87165m();
                Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q, modifierM3398t119);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1112, c22994r1M66759a119);
                AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N111111);
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C23010x c23010xM66775a113 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k8, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
                Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, layoutWeightElement15);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1112, c23010xM66775a113);
                AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111112);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N111112);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                c28655q.m87173q(true);
                String strM21274h15 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3398t1110 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f119, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d15 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h15, modifierM3398t1110, c38072d15.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
                c28655q.m87173q(true);
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 2);
                C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q.m87165m();
                Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q, modifierM3396r15);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1112, c22994r1M66759a1110);
                AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N111113);
                AbstractC39330c.m125320b(c38072d15.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v8, z13, selectedNumber, 15)), c28655q, 24576, 14);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                num2 = num18;
                z15 = z17;
                i36 = i414;
                modifier2 = modifier11;
            } else {
                z17 = z16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i1115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N111110);
            Modifier modifierM3398t1111 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            Integer num19 = num3;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q.m87165m();
            Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1112, c22994r1M66759a1111);
            AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N111114);
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C23010x c23010xM66775a114 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k8, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q.m87165m();
            Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q, layoutWeightElement16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1112, c23010xM66775a114);
            AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111115);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N111115);
            if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            c0209i3 = c0209i2;
            AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
            c28655q.m87173q(true);
            String strM21274h16 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            Modifier modifierM3398t1112 = AbstractC1099a.m3398t(new LayoutWeightElement(f13, false), f119, 0.0f, 0.0f, 0.0f, 14);
            C38072d c38072d16 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h16, modifierM3398t1112, c38072d16.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196088);
            c28655q.m87173q(true);
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 2);
            C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
            Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifierM3396r16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1112, c22994r1M66759a1112);
            AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111116);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N111116);
            AbstractC39330c.m125320b(c38072d16.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(-874160525, c28655q, new C0341c(c36903v8, z13, selectedNumber, 15)), c28655q, 24576, 14);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            num2 = num19;
            z15 = z17;
            i36 = i414;
            modifier2 = modifier11;
        } else {
            c28655q.m87138X();
            i36 = i15;
            num2 = num;
            z15 = z4;
            modifier2 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.w
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36905x.m118506g(question, context, level, i13, i14, i36, num2, z15, z13, modifier2, selectedNumber, i16, i17, i18, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118504e(C36903v c36903v, boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 1 * 8, 0.0f, 0.0f, 0.0f, 14);
            float fM118496a = c36903v.getModifiedPreSetNumber();
            C18279e c18279e = new C18279e(c36903v.getRangeMin(), c36903v.getRangeMax());
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c36903v);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35076b(22, function1, c36903v);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17763k2.m50956d(modifierM3398t, z4, fM118496a, c18279e, 0, null, (Function1) objM87133R, c28655q, 6, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118505f(Function1 function1, C36903v c36903v, float f13) {
        function1.invoke(Integer.valueOf(c36903v.m118499d(f13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118506g(TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, int i14, int i15, Integer num, boolean z4, boolean z13, Modifier modifier, Function1 function1, int i16, int i17, int i18, Composer composer, int i19) {
        m118503d(textResource, textResource2, textResource3, i13, i14, i15, num, z4, z13, modifier, function1, composer, AbstractC28683x.m87244L(i16 | 1), AbstractC28683x.m87244L(i17), i18);
        return C23454a0.f92919a;
    }
}

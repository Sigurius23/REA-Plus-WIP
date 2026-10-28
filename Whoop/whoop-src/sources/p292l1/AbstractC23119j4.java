package p292l1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2475a0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import fg2.C14470l;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p133f1.AbstractC13923a2;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22973k1;
import p294l3.C23285v0;
import p316m1.AbstractC24913l0;
import p316m1.C24911k0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p412q3.C29871f0;
import p412q3.InterfaceC29873g0;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.j4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23119j4 {
    /* JADX INFO: renamed from: a */
    public static final void m67095a(String str, Function1 function1, Modifier modifier, boolean z4, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, InterfaceC29873g0 interfaceC29873g0, C34351r0 c34351r0, C34348q0 c34348q0, boolean z13, int i13, int i14, InterfaceC17869a1 interfaceC17869a1, C23089e4 c23089e4, Composer composer, int i15) {
        boolean z14;
        InterfaceC29873g0 interfaceC29873g1;
        C34348q0 c34348q1;
        int i16;
        int i17;
        C34348q0 c34348q2;
        int i18;
        InterfaceC29873g0 interfaceC29873g2;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-154966360);
        int i24 = i15 | (c28655q.m87153g(str) ? 4 : 2) | (c28655q.m87157i(function1) ? 32 : 16) | (c28655q.m87153g(modifier) ? 256 : 128) | 27648 | (c28655q.m87153g(c23285v0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | 907542528;
        boolean z15 = true;
        if (c28655q.m87135U(i24 & 1, ((306783379 & i24) == 306783378 && ((((c28655q.m87153g(interfaceC17869a1) ? ' ' : (char) 16) | 6) | (c28655q.m87153g(c23089e4) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            c28655q.m87140Z();
            if ((i15 & 1) == 0 || c28655q.m87118C()) {
                c34348q2 = C34348q0.f144287g;
                i18 = z13 ? 1 : Integer.MAX_VALUE;
                interfaceC29873g2 = C29871f0.f122092w;
                i19 = 1;
            } else {
                c28655q.m87138X();
                z15 = z4;
                interfaceC29873g2 = interfaceC29873g0;
                c34348q2 = c34348q0;
                i18 = i13;
                i19 = i14;
            }
            c28655q.m87175r();
            c28655q.m87150e0(488210003);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1401227490);
            long jM67366c = c23285v0.m67366c();
            if (jM67366c == 16) {
                jM67366c = c23089e4.m67065d(z15, false, ((Boolean) AbstractC32417h.m101215x(interfaceC21083i, c28655q, 0).getValue()).booleanValue());
            }
            long j7 = jM67366c;
            c28655q.m87173q(false);
            AbstractC28683x.m87247a(AbstractC13923a2.f49638a.mo86977a(c23089e4.f91146k), AbstractC37817c.m121344e(1459735400, c28655q, new C23064a3(modifier, c23089e4, str, function1, z15, c23285v0.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214)), c34351r0, c34348q2, z13, i18, i19, interfaceC29873g2, interfaceC21083i, interfaceC4351m, interfaceC17869a1, 1)), c28655q, 56);
            z14 = z15;
            c34348q1 = c34348q2;
            i16 = i18;
            i17 = i19;
            interfaceC29873g1 = interfaceC29873g2;
        } else {
            c28655q.m87138X();
            z14 = z4;
            interfaceC29873g1 = interfaceC29873g0;
            c34348q1 = c34348q0;
            i16 = i13;
            i17 = i14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2475a0(str, function1, modifier, z14, c23285v0, interfaceC4351m, interfaceC29873g1, c34351r0, c34348q1, z13, i16, i17, interfaceC17869a1, c23089e4, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0243  */
    /* JADX WARN: Code duplicated, block: B:154:0x0273  */
    /* JADX WARN: Code duplicated, block: B:155:0x0277  */
    /* JADX WARN: Code duplicated, block: B:160:0x0292  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:175:0x030e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x032c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0331  */
    /* JADX WARN: Code duplicated, block: B:185:0x0337  */
    /* JADX WARN: Code duplicated, block: B:188:0x033f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0380  */
    /* JADX WARN: Code duplicated, block: B:192:0x0386  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:203:0x0405  */
    /* JADX WARN: Code duplicated, block: B:204:0x0409  */
    /* JADX WARN: Code duplicated, block: B:209:0x0424  */
    /* JADX WARN: Code duplicated, block: B:211:0x0436  */
    /* JADX WARN: Code duplicated, block: B:214:0x0454  */
    /* JADX WARN: Code duplicated, block: B:216:0x0465  */
    /* JADX WARN: Code duplicated, block: B:218:0x0469  */
    /* JADX WARN: Code duplicated, block: B:221:0x0472  */
    /* JADX WARN: Code duplicated, block: B:223:0x0476  */
    /* JADX WARN: Code duplicated, block: B:227:0x047f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0486  */
    /* JADX WARN: Code duplicated, block: B:234:0x04be  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:238:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:240:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:242:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:245:0x050d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0510  */
    /* JADX WARN: Code duplicated, block: B:248:0x0515  */
    /* JADX WARN: Code duplicated, block: B:249:0x0518  */
    /* JADX WARN: Code duplicated, block: B:252:0x0527  */
    /* JADX WARN: Code duplicated, block: B:253:0x0549  */
    /* JADX WARN: Code duplicated, block: B:256:0x057b  */
    /* JADX WARN: Code duplicated, block: B:257:0x057f  */
    /* JADX WARN: Code duplicated, block: B:262:0x059a  */
    /* JADX WARN: Code duplicated, block: B:265:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:267:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:268:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:273:0x0609  */
    /* JADX WARN: Code duplicated, block: B:275:0x061b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r50v0, types: [java.lang.Object, x1.b] */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX INFO: renamed from: b */
    public static final void m67096b(InterfaceC4351m interfaceC4351m, final InterfaceC4351m interfaceC4351m2, Function3 function3, final InterfaceC4351m interfaceC4351m3, final InterfaceC4351m interfaceC4351m4, final InterfaceC4351m interfaceC4351m5, final InterfaceC4351m interfaceC4351m6, final boolean z4, final C23125k4 c23125k4, C24911k0 c24911k0, final C37816b c37816b, InterfaceC4351m interfaceC4351m7, final InterfaceC22973k1 interfaceC22973k1, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        InterfaceC4351m interfaceC4351m8;
        Function3 function4;
        C24911k0 c24911k1;
        C28655q c28655q;
        C28655q c28655q2;
        C2307m c2307m;
        C0209i c0209i;
        boolean z13;
        ?? r10;
        float fM3387i;
        float fM3386h;
        float fM73017e;
        float f13;
        float f14;
        C2307m c2307m2;
        Modifier modifierM3398t;
        int i17;
        float f15;
        float f16;
        Modifier modifierM3398t2;
        Function3 function5;
        int iHashCode;
        boolean z14;
        int iHashCode2;
        boolean z15;
        Object objM87133R;
        int i18;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        float f17;
        float f18;
        int iHashCode6;
        int iHashCode7;
        InterfaceC4351m interfaceC4351m9 = interfaceC4351m7;
        C2307m c2307m3 = C2299e.f9102E;
        C2307m c2307m4 = C2299e.f9114w;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1086465551);
        int i19 = i13 & 6;
        C2314t c2314t = C2314t.f9131w;
        if (i19 == 0) {
            i15 = i13 | (c28655q3.m87153g(c2314t) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(interfaceC4351m2) ? 256 : 128;
        }
        int i24 = i13 & 3072;
        int i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i24 == 0) {
            i15 |= c28655q3.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q3.m87157i(interfaceC4351m3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q3.m87157i(interfaceC4351m4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q3.m87157i(interfaceC4351m5) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q3.m87157i(interfaceC4351m6) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q3.m87155h(z4) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q3.m87153g(c23125k4) ? 536870912 : 268435456;
        }
        int i26 = i15;
        if ((i14 & 6) == 0) {
            i16 = i14 | ((i14 & 8) == 0 ? c28655q3.m87153g(c24911k0) : c28655q3.m87157i(c24911k0) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q3.m87157i(c37816b) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q3.m87157i(interfaceC4351m9) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q3.m87153g(interfaceC22973k1)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i16 |= i25;
        }
        int i27 = i16;
        if (c28655q3.m87135U(i26 & 1, ((i26 & 306783379) == 306783378 && (i27 & 1171) == 1170) ? false : true)) {
            float fM73016d = AbstractC24913l0.m73016d(c28655q3);
            int i28 = i27 & 14;
            boolean zM87147d = ((i26 & 234881024) == 67108864) | ((i26 & 1879048192) == 536870912) | (i28 == 4 || ((i27 & 8) != 0 && c28655q3.m87153g(c24911k0))) | ((i27 & 7168) == 2048) | c28655q3.m87147d(fM73016d);
            Object objM87133R2 = c28655q3.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87147d || objM87133R2 == c28676v0) {
                C28655q c28655q4 = c28655q3;
                C23137m4 c23137m4 = new C23137m4(z4, c23125k4, c24911k0, interfaceC22973k1, fM73016d);
                c28655q4.m87172p0(c23137m4);
                objM87133R2 = c23137m4;
                c28655q2 = c28655q4;
            } else {
                c28655q2 = c28655q3;
            }
            C23137m4 c23137m5 = (C23137m4) objM87133R2;
            EnumC39181m enumC39181m = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
            int iHashCode8 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, r25);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23137m5);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c2307m = r17;
            } else {
                c2307m = c2307m4;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode8))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
                c37816b.invoke(c28655q2, Integer.valueOf((r20 >> 3) & 14));
                if (interfaceC4351m3 != null) {
                    c28655q2.m87150e0(-1445181094);
                    Modifier modifierM3499c = AbstractC1131a.m3499c(r25, "Leading");
                    C39111m c39111m = AbstractC23194w1.f91761a;
                    Modifier modifierMo3471e = modifierM3499c.mo3471e(MinimumInteractiveModifier.f4745w);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode7 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N2);
                    z13 = false;
                    AbstractC11895b.m31978A((i26 >> 12) & 14, interfaceC4351m3, c28655q2, true, false);
                } else {
                    z13 = false;
                    c28655q2.m87150e0(-1444935078);
                    c28655q2.m87173q(false);
                }
                if (interfaceC4351m4 != null) {
                    c28655q2.m87150e0(-1444892360);
                    Modifier modifierM3499c2 = AbstractC1131a.m3499c(r25, "Trailing");
                    C39111m c39111m2 = AbstractC23194w1.f91761a;
                    Modifier modifierMo3471e2 = modifierM3499c2.mo3471e(MinimumInteractiveModifier.f4745w);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(r16, z13);
                    iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N3);
                    r10 = 0;
                    AbstractC11895b.m31978A((i26 >> 15) & 14, interfaceC4351m4, c28655q2, true, false);
                } else {
                    c28655q2.m87150e0(-1444644422);
                    c28655q2.m87173q(z13);
                    r10 = z13;
                }
                fM3387i = AbstractC1099a.m3387i(interfaceC22973k1, enumC39181m);
                fM3386h = AbstractC1099a.m3386h(interfaceC22973k1, enumC39181m);
                fM73017e = AbstractC24913l0.m73017e(c28655q2);
                if (interfaceC4351m3 != null) {
                    fM3387i -= fM73017e;
                    f18 = (float) r10;
                    if (fM3387i < f18) {
                        fM3387i = f18;
                    }
                }
                f13 = fM3387i;
                if (interfaceC4351m4 != null) {
                    fM3386h -= fM73017e;
                    f17 = (float) r10;
                    if (fM3386h < f17) {
                        fM3386h = f17;
                    }
                }
                f14 = fM3386h;
                if (interfaceC4351m5 != null) {
                    c28655q2.m87150e0(-1443868027);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3413j(AbstractC1131a.m3499c(r25, "Prefix"), AbstractC24913l0.f97581d, 0.0f, 2), null, 3), f13, 0.0f, AbstractC24913l0.f97580c, 0.0f, 10);
                    c2307m2 = c2307m;
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode5 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N4);
                    AbstractC11895b.m31978A((i26 >> 18) & 14, interfaceC4351m5, c28655q2, true, false);
                } else {
                    c2307m2 = c2307m;
                    c28655q2.m87150e0(-1443540326);
                    c28655q2.m87173q(false);
                }
                if (interfaceC4351m6 != null) {
                    c28655q2.m87150e0(-1443497081);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3413j(AbstractC1131a.m3499c(r25, "Suffix"), AbstractC24913l0.f97581d, 0.0f, 2), null, 3), AbstractC24913l0.f97580c, 0.0f, f14, 0.0f, 10);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N5);
                    AbstractC11895b.m31978A((i26 >> 21) & 14, interfaceC4351m6, c28655q2, true, false);
                } else {
                    c28655q2.m87150e0(-1443171302);
                    c28655q2.m87173q(false);
                }
                modifierM3398t = AbstractC1099a.m3398t(r25, f13, 0.0f, f14, 0.0f, 10);
                if (interfaceC4351m2 != null) {
                    c28655q2.m87150e0(-1442671489);
                    Modifier modifierM3499c3 = AbstractC1131a.m3499c(c2314t, "Label");
                    if (i28 != 4) {
                        if ((i27 & 8) != 0) {
                            c24911k1 = c24911k0;
                            if (c28655q2.m87157i(c24911k1)) {
                            }
                            objM87133R = c28655q2.m87133R();
                            if (!z15 || objM87133R == c28676v0) {
                                i18 = 1;
                                objM87133R = new C23183u2(c24911k1, i18);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                i18 = 1;
                            }
                            Modifier modifierMo3471e3 = AbstractC1102d.m3427x(AbstractC1131a.m3498b(modifierM3499c3, new C14470l((InterfaceC4339a) objM87133R, i18)), null, 3).mo3471e(modifierM3398t);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N6);
                            i17 = 0;
                            AbstractC11895b.m31978A((i26 >> 6) & 14, interfaceC4351m2, c28655q2, true, false);
                        } else {
                            c24911k1 = c24911k0;
                        }
                        z15 = false;
                        objM87133R = c28655q2.m87133R();
                        if (z15) {
                            i18 = 1;
                            objM87133R = new C23183u2(c24911k1, i18);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            i18 = 1;
                            objM87133R = new C23183u2(c24911k1, i18);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Modifier modifierMo3471e4 = AbstractC1102d.m3427x(AbstractC1131a.m3498b(modifierM3499c3, new C14470l((InterfaceC4339a) objM87133R, i18)), null, 3).mo3471e(modifierM3398t);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m7);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N7);
                        i17 = 0;
                        AbstractC11895b.m31978A((i26 >> 6) & 14, interfaceC4351m2, c28655q2, true, false);
                    } else {
                        c24911k1 = c24911k0;
                    }
                    z15 = true;
                    objM87133R = c28655q2.m87133R();
                    if (z15) {
                        i18 = 1;
                        objM87133R = new C23183u2(c24911k1, i18);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        i18 = 1;
                        objM87133R = new C23183u2(c24911k1, i18);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierMo3471e5 = AbstractC1102d.m3427x(AbstractC1131a.m3498b(modifierM3499c3, new C14470l((InterfaceC4339a) objM87133R, i18)), null, 3).mo3471e(modifierM3398t);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N8);
                    i17 = 0;
                    AbstractC11895b.m31978A((i26 >> 6) & 14, interfaceC4351m2, c28655q2, true, false);
                } else {
                    c24911k1 = c24911k0;
                    i17 = 0;
                    c28655q2.m87150e0(-1442276518);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3413j(c2314t, AbstractC24913l0.f97581d, 0.0f, 2), null, 3);
                if (interfaceC4351m5 == null) {
                    f15 = f13;
                } else {
                    f15 = i17;
                }
                if (interfaceC4351m6 == null) {
                    f16 = f14;
                } else {
                    f16 = i17;
                }
                modifierM3398t2 = AbstractC1099a.m3398t(modifierM3427x, f15, 0.0f, f16, 0.0f, 10);
                if (function3 != null) {
                    c28655q2.m87150e0(-1441906533);
                    Function3 function6 = function3;
                    function6.invoke(AbstractC1131a.m3499c(c2314t, "Hint").mo3471e(modifierM3398t2), c28655q2, Integer.valueOf((i26 >> 6) & 112));
                    c28655q2.m87173q(false);
                    function5 = function6;
                } else {
                    function5 = function3;
                    c28655q2.m87150e0(-1441815238);
                    c28655q2.m87173q(false);
                }
                Modifier modifierMo3471e6 = AbstractC1131a.m3499c(c2314t, "TextField").mo3471e(modifierM3398t2);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m2, true);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N9);
                interfaceC4351m8 = interfaceC4351m;
                AbstractC11895b.m32007z((i26 >> 3) & 14, interfaceC4351m8, c28655q2, true);
                if (interfaceC4351m7 != null) {
                    c28655q2.m87150e0(-1441566587);
                    Modifier modifierM3393o = AbstractC1099a.m3393o(C23107h4.m67087d(), AbstractC1102d.m3427x(AbstractC1102d.m3413j(AbstractC1131a.m3499c(c2314t, "Supporting"), AbstractC24913l0.f97583f, 0.0f, 2), null, 3));
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3393o);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m10);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N10);
                    interfaceC4351m9 = interfaceC4351m7;
                    z14 = true;
                    AbstractC11895b.m31978A((r20 >> 6) & 14, interfaceC4351m9, c28655q2, true, false);
                } else {
                    interfaceC4351m9 = interfaceC4351m7;
                    z14 = true;
                    c28655q2.m87150e0(-1441177382);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                c28655q = c28655q2;
                function4 = function5;
            }
            AbstractC11266d.m30471y(iHashCode8, c28655q2, iHashCode8, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
            c37816b.invoke(c28655q2, Integer.valueOf((r20 >> 3) & 14));
            if (interfaceC4351m3 != null) {
                c28655q2.m87150e0(-1445181094);
                Modifier modifierM3499c4 = AbstractC1131a.m3499c(r25, "Leading");
                C39111m c39111m3 = AbstractC23194w1.f91761a;
                Modifier modifierMo3471e7 = modifierM3499c4.mo3471e(MinimumInteractiveModifier.f4745w);
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode7 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d10);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N11);
                z13 = false;
                AbstractC11895b.m31978A((i26 >> 12) & 14, interfaceC4351m3, c28655q2, true, false);
            } else {
                z13 = false;
                c28655q2.m87150e0(-1444935078);
                c28655q2.m87173q(false);
            }
            if (interfaceC4351m4 != null) {
                c28655q2.m87150e0(-1444892360);
                Modifier modifierM3499c5 = AbstractC1131a.m3499c(r25, "Trailing");
                C39111m c39111m4 = AbstractC23194w1.f91761a;
                Modifier modifierMo3471e8 = modifierM3499c5.mo3471e(MinimumInteractiveModifier.f4745w);
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(r16, z13);
                iHashCode6 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N12);
                r10 = 0;
                AbstractC11895b.m31978A((i26 >> 15) & 14, interfaceC4351m4, c28655q2, true, false);
            } else {
                c28655q2.m87150e0(-1444644422);
                c28655q2.m87173q(z13);
                r10 = z13;
            }
            fM3387i = AbstractC1099a.m3387i(interfaceC22973k1, enumC39181m);
            fM3386h = AbstractC1099a.m3386h(interfaceC22973k1, enumC39181m);
            fM73017e = AbstractC24913l0.m73017e(c28655q2);
            if (interfaceC4351m3 != null) {
                fM3387i -= fM73017e;
                f18 = (float) r10;
                if (fM3387i < f18) {
                    fM3387i = f18;
                }
            }
            f13 = fM3387i;
            if (interfaceC4351m4 != null) {
                fM3386h -= fM73017e;
                f17 = (float) r10;
                if (fM3386h < f17) {
                    fM3386h = f17;
                }
            }
            f14 = fM3386h;
            if (interfaceC4351m5 != null) {
                c28655q2.m87150e0(-1443868027);
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3413j(AbstractC1131a.m3499c(r25, "Prefix"), AbstractC24913l0.f97581d, 0.0f, 2), null, 3), f13, 0.0f, AbstractC24913l0.f97580c, 0.0f, 10);
                c2307m2 = c2307m;
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m13);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N13);
                AbstractC11895b.m31978A((i26 >> 18) & 14, interfaceC4351m5, c28655q2, true, false);
            } else {
                c2307m2 = c2307m;
                c28655q2.m87150e0(-1443540326);
                c28655q2.m87173q(false);
            }
            if (interfaceC4351m6 != null) {
                c28655q2.m87150e0(-1443497081);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3413j(AbstractC1131a.m3499c(r25, "Suffix"), AbstractC24913l0.f97581d, 0.0f, 2), null, 3), AbstractC24913l0.f97580c, 0.0f, f14, 0.0f, 10);
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d13);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N14);
                AbstractC11895b.m31978A((i26 >> 21) & 14, interfaceC4351m6, c28655q2, true, false);
            } else {
                c28655q2.m87150e0(-1443171302);
                c28655q2.m87173q(false);
            }
            modifierM3398t = AbstractC1099a.m3398t(r25, f13, 0.0f, f14, 0.0f, 10);
            if (interfaceC4351m2 != null) {
                c28655q2.m87150e0(-1442671489);
                Modifier modifierM3499c6 = AbstractC1131a.m3499c(c2314t, "Label");
                if (i28 != 4) {
                    if ((i27 & 8) != 0) {
                        c24911k1 = c24911k0;
                        if (c28655q2.m87157i(c24911k1)) {
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z15) {
                            i18 = 1;
                            objM87133R = new C23183u2(c24911k1, i18);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            i18 = 1;
                            objM87133R = new C23183u2(c24911k1, i18);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Modifier modifierMo3471e9 = AbstractC1102d.m3427x(AbstractC1131a.m3498b(modifierM3499c6, new C14470l((InterfaceC4339a) objM87133R, i18)), null, 3).mo3471e(modifierM3398t);
                        InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d14);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N15);
                        i17 = 0;
                        AbstractC11895b.m31978A((i26 >> 6) & 14, interfaceC4351m2, c28655q2, true, false);
                    } else {
                        c24911k1 = c24911k0;
                    }
                    z15 = false;
                    objM87133R = c28655q2.m87133R();
                    if (z15) {
                        i18 = 1;
                        objM87133R = new C23183u2(c24911k1, i18);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        i18 = 1;
                        objM87133R = new C23183u2(c24911k1, i18);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierMo3471e10 = AbstractC1102d.m3427x(AbstractC1131a.m3498b(modifierM3499c6, new C14470l((InterfaceC4339a) objM87133R, i18)), null, 3).mo3471e(modifierM3398t);
                    InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d15);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m16);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N16);
                    i17 = 0;
                    AbstractC11895b.m31978A((i26 >> 6) & 14, interfaceC4351m2, c28655q2, true, false);
                } else {
                    c24911k1 = c24911k0;
                }
                z15 = true;
                objM87133R = c28655q2.m87133R();
                if (z15) {
                    i18 = 1;
                    objM87133R = new C23183u2(c24911k1, i18);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    i18 = 1;
                    objM87133R = new C23183u2(c24911k1, i18);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierMo3471e11 = AbstractC1102d.m3427x(AbstractC1131a.m3498b(modifierM3499c6, new C14470l((InterfaceC4339a) objM87133R, i18)), null, 3).mo3471e(modifierM3398t);
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d16);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m17);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N17);
                i17 = 0;
                AbstractC11895b.m31978A((i26 >> 6) & 14, interfaceC4351m2, c28655q2, true, false);
            } else {
                c24911k1 = c24911k0;
                i17 = 0;
                c28655q2.m87150e0(-1442276518);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3413j(c2314t, AbstractC24913l0.f97581d, 0.0f, 2), null, 3);
            if (interfaceC4351m5 == null) {
                f15 = f13;
            } else {
                f15 = i17;
            }
            if (interfaceC4351m6 == null) {
                f16 = f14;
            } else {
                f16 = i17;
            }
            modifierM3398t2 = AbstractC1099a.m3398t(modifierM3427x2, f15, 0.0f, f16, 0.0f, 10);
            if (function3 != null) {
                c28655q2.m87150e0(-1441906533);
                Function3 function7 = function3;
                function7.invoke(AbstractC1131a.m3499c(c2314t, "Hint").mo3471e(modifierM3398t2), c28655q2, Integer.valueOf((i26 >> 6) & 112));
                c28655q2.m87173q(false);
                function5 = function7;
            } else {
                function5 = function3;
                c28655q2.m87150e0(-1441815238);
                c28655q2.m87173q(false);
            }
            Modifier modifierMo3471e12 = AbstractC1131a.m3499c(c2314t, "TextField").mo3471e(modifierM3398t2);
            InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m2, true);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e12);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d17);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m18);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N18);
            interfaceC4351m8 = interfaceC4351m;
            AbstractC11895b.m32007z((i26 >> 3) & 14, interfaceC4351m8, c28655q2, true);
            if (interfaceC4351m7 != null) {
                c28655q2.m87150e0(-1441566587);
                Modifier modifierM3393o2 = AbstractC1099a.m3393o(C23107h4.m67087d(), AbstractC1102d.m3427x(AbstractC1102d.m3413j(AbstractC1131a.m3499c(c2314t, "Supporting"), AbstractC24913l0.f97583f, 0.0f, 2), null, 3));
                InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3393o2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d18);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m19);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N19);
                interfaceC4351m9 = interfaceC4351m7;
                z14 = true;
                AbstractC11895b.m31978A((r20 >> 6) & 14, interfaceC4351m9, c28655q2, true, false);
            } else {
                interfaceC4351m9 = interfaceC4351m7;
                z14 = true;
                c28655q2.m87150e0(-1441177382);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z14);
            c28655q = c28655q2;
            function4 = function5;
        } else {
            interfaceC4351m8 = interfaceC4351m;
            function4 = function3;
            c24911k1 = c24911k0;
            C28655q c28655q5 = c28655q3;
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final InterfaceC4351m interfaceC4351m10 = interfaceC4351m8;
            final C24911k0 c24911k2 = c24911k1;
            final Function3 function8 = function4;
            final InterfaceC4351m interfaceC4351m11 = interfaceC4351m9;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l1.i4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i14);
                    AbstractC23119j4.m67096b(interfaceC4351m10, interfaceC4351m2, function8, interfaceC4351m3, interfaceC4351m4, interfaceC4351m5, interfaceC4351m6, z4, c23125k4, c24911k2, c37816b, interfaceC4351m11, interfaceC22973k1, (Composer) obj, iM87244L, iM87244L2);
                    return C23454a0.f92919a;
                }
            };
        }
    }
}

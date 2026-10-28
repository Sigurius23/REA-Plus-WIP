package i40;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
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
import p163g1.C15144s8;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39072a0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i40.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18076j {

    /* JADX INFO: renamed from: a */
    public static final float f70279a = 4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.runtime.Composer, java.lang.Object, p1.q] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r2v3, types: [x1.b] */
    /* JADX WARN: Type inference failed for: r2v6, types: [x1.b] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: a */
    public static final void m51913a(Modifier modifier, C37816b c37816b, InterfaceC4351m interfaceC4351m, Function3 function3, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, boolean z4, float f13, C22976l1 c22976l1, Composer composer, int i13) {
        int i14;
        EnumC39181m enumC39181m;
        InterfaceC4351m interfaceC4351m4;
        C2307m c2307m;
        boolean z13;
        ?? r10;
        C37816b c37816b2 = c37816b;
        C22976l1 c22976l2 = c22976l1;
        C2307m c2307m2 = C2299e.f9114w;
        C2307m c2307m3 = C2299e.f9102E;
        AbstractC22676k.m65750j(modifier, "modifier");
        ?? r14 = (C28655q) composer;
        r14.m87154g0(-666417589);
        if ((i13 & 6) == 0) {
            i14 = (r14.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= r14.m87157i(c37816b2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= r14.m87157i(interfaceC4351m) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= r14.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= r14.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= r14.m87157i(interfaceC4351m3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= r14.m87155h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= r14.m87147d(f13) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= r14.m87153g(c22976l2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((38347923 & i14) == 38347922 && r14.m87121F()) {
            r14.m87138X();
            interfaceC4351m4 = interfaceC4351m;
            r10 = c37816b2;
        } else {
            r14.m87150e0(925993925);
            boolean z14 = ((29360128 & i14) == 8388608) | ((3670016 & i14) == 1048576) | ((234881024 & i14) == 67108864);
            Object objM87133R = r14.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C18077k(z4, f13, c22976l2);
                r14.m87172p0(objM87133R);
            }
            C18077k c18077k = (C18077k) objM87133R;
            r14.m87173q(false);
            EnumC39181m enumC39181m2 = (EnumC39181m) r14.m87161k(AbstractC2453v1.f9575n);
            int iHashCode = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = r14.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(r14, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            r14.m87158i0();
            int i15 = i14;
            if (r14.f115903S) {
                r14.m87163l(c0213j);
            } else {
                r14.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(r14, c0209i, c18077k);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(r14, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, r14, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(r14, c0209i4, modifierM118962N);
            r14.m87150e0(1047034057);
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC4351m2 != null) {
                Modifier modifierMo3471e = AbstractC1131a.m3499c(c2314t, "Leading").mo3471e(AbstractC18067a.f70156d);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m3, false);
                int iHashCode2 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r14.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r14, modifierMo3471e);
                r14.m87158i0();
                enumC39181m = enumC39181m2;
                if (r14.f115903S) {
                    r14.m87163l(c0213j);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(r14, c0209i2, interfaceC28653p1M87165m2);
                if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(r14, c0209i4, modifierM118962N2);
                AbstractC11895b.m32007z((i15 >> 12) & 14, interfaceC4351m2, r14, true);
            } else {
                enumC39181m = enumC39181m2;
            }
            ?? r15 = 0;
            r14.m87173q(false);
            r14.m87150e0(1047043180);
            if (interfaceC4351m3 != null) {
                Modifier modifierMo3471e2 = AbstractC1131a.m3499c(c2314t, "Trailing").mo3471e(AbstractC18067a.f70156d);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m3, false);
                int iHashCode3 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r14.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r14, modifierMo3471e2);
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(r14, c0209i2, interfaceC28653p1M87165m3);
                if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(r14, c0209i4, modifierM118962N3);
                AbstractC11895b.m32007z((i15 >> 15) & 14, interfaceC4351m3, r14, true);
                r15 = 0;
            }
            r14.m87173q(r15);
            c22976l2 = c22976l1;
            EnumC39181m enumC39181m3 = enumC39181m;
            float fM3387i = AbstractC1099a.m3387i(c22976l2, enumC39181m3);
            float fM3386h = AbstractC1099a.m3386h(c22976l2, enumC39181m3);
            if (interfaceC4351m2 != null) {
                fM3387i -= AbstractC18067a.f70155c;
                float f14 = (float) r15;
                if (fM3387i < f14) {
                    fM3387i = f14;
                }
            }
            float f15 = fM3387i;
            if (interfaceC4351m3 != null) {
                fM3386h -= AbstractC18067a.f70155c;
                float f16 = (float) r15;
                if (fM3386h < f16) {
                    fM3386h = f16;
                }
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f15, 0.0f, fM3386h, 0.0f, 10);
            r14.m87150e0(1047075373);
            if (function3 != 0) {
                function3.invoke(AbstractC1131a.m3499c(c2314t, "Hint").mo3471e(modifierM3398t), r14, Integer.valueOf((i15 >> 6) & 112));
            }
            boolean z15 = false;
            r14.m87173q(false);
            r14.m87150e0(1047079493);
            if (interfaceC4351m != null) {
                Modifier modifierMo3471e3 = AbstractC1131a.m3499c(c2314t, "Label").mo3471e(modifierM3398t);
                c2307m = c2307m2;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = r14.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r14, modifierMo3471e3);
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(r14, c0209i2, interfaceC28653p1M87165m4);
                if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(r14, c0209i4, modifierM118962N4);
                interfaceC4351m4 = interfaceC4351m;
                z13 = true;
                AbstractC11895b.m32007z((i15 >> 6) & 14, interfaceC4351m4, r14, true);
                z15 = false;
            } else {
                interfaceC4351m4 = interfaceC4351m;
                c2307m = c2307m2;
                z13 = true;
            }
            r14.m87173q(z15);
            Modifier modifierMo3471e4 = AbstractC1131a.m3499c(c2314t, "TextField").mo3471e(modifierM3398t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, z13);
            int iHashCode5 = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = r14.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r14, modifierMo3471e4);
            r14.m87158i0();
            if (r14.f115903S) {
                r14.m87163l(c0213j);
            } else {
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, c0209i, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(r14, c0209i2, interfaceC28653p1M87165m5);
            if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, r14, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(r14, c0209i4, modifierM118962N5);
            ?? r16 = c37816b;
            r16.invoke(r14, Integer.valueOf((i15 >> 3) & 14));
            r14.m87173q(true);
            r14.m87173q(true);
            r10 = r16;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15144s8(modifier, (C37816b) r10, interfaceC4351m4, (Function3) function3, interfaceC4351m2, interfaceC4351m3, z4, f13, c22976l2, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m51914b(int i13, boolean z4, int i14, int i15, int i16, int i17, long j7, float f13, C22976l1 c22976l1) {
        float f14 = f70279a * f13;
        float f15 = c22976l1.f90647b * f13;
        float f16 = c22976l1.f90649d * f13;
        int iMax = Math.max(i13, i17);
        return Math.max(AbstractC12889b.m36258X(z4 ? i14 + f14 + iMax + f16 : f15 + iMax + f16), Math.max(Math.max(i15, i16), C39169a.m124766j(j7)));
    }

    /* JADX INFO: renamed from: c */
    public static final Object m51915c(InterfaceC39124q0 interfaceC39124q0) {
        Object objMo454p = interfaceC39124q0.mo454p();
        InterfaceC39072a0 interfaceC39072a0 = objMo454p instanceof InterfaceC39072a0 ? (InterfaceC39072a0) objMo454p : null;
        if (interfaceC39072a0 != null) {
            return interfaceC39072a0.mo35475T();
        }
        return null;
    }
}

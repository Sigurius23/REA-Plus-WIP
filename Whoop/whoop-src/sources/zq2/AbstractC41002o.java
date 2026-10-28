package zq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import be1.C3172f;
import c93.InterfaceC4339a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o01.AbstractC27348d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40674e0;
import zm1.C40893d;

/* JADX INFO: renamed from: zq2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lzq2/a;", "userSelectedAnswer", "Lkd1/o;", "correctResponseIcon", "", "animatedWhoopCoachResponseText", "Ly81/e;", "correctTextColor", "incorrectTextColor", "Lv41/r0;", "lottieWrapper", "Ll83/a0;", "d", "(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41002o {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m133215d(C40988a c40988a, AbstractC22403o correctResponseIcon, String animatedWhoopCoachResponseText, InterfaceC39332e correctTextColor, InterfaceC39332e incorrectTextColor, InterfaceC35689r0 interfaceC35689r0, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        long jMo134584toComposableColorWaAFU9c;
        boolean z14;
        C23454a0 c23454a0;
        AbstractC22676k.m65750j(correctResponseIcon, "correctResponseIcon");
        AbstractC22676k.m65750j(animatedWhoopCoachResponseText, "animatedWhoopCoachResponseText");
        AbstractC22676k.m65750j(correctTextColor, "correctTextColor");
        AbstractC22676k.m65750j(incorrectTextColor, "incorrectTextColor");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1365538891);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c40988a) : c28655q.m87157i(c40988a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(correctResponseIcon) : c28655q.m87157i(correctResponseIcon) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(animatedWhoopCoachResponseText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(correctTextColor) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(incorrectTextColor) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC35689r0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 74899) != 74898)) {
            float f13 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 2 * f13, ((float) 6.5d) * f13, 0.0f, 9);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f14 = ((float) 1.5d) * f13;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f14, 0.0f, 11);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC27348d.m82519c(null, c28655q, 0, 1);
            c28655q.m87173q(true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            if (c40988a != null && c40988a.getIsCorrect()) {
                c28655q.m87150e0(-1402163219);
                if (interfaceC35689r0 == null) {
                    c28655q.m87150e0(-1402160678);
                    c28655q.m87173q(false);
                    z14 = false;
                    z13 = true;
                    c23454a0 = null;
                } else {
                    c28655q.m87150e0(-1402160677);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(38 * 4, AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 1 * f13, 6));
                    Object objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        c2314t = c2314t2;
                        objM87133R = new C40674e0(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    c2314t = c2314t2;
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    Object objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40893d(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z14 = false;
                    z13 = true;
                    AbstractC35684p.m113047h(modifierM3419p, interfaceC35689r0, false, 0.0f, 1, interfaceC4339a, (Function1) objM87133R2, C39102j.f168200b, null, c28655q, 14376966, 268);
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c2314t = c2314t2;
                    c28655q.m87150e0(-1401665421);
                    z4 = z14;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(correctResponseIcon, null, null, c28655q, AbstractC22403o.f87638a | ((i15 >> 3) & 14), 3), null, AbstractC1102d.m3419p(38 * 4, AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, (z13 ? 1.0f : 0.0f) * f13, 6)), null, null, 0.0f, null, c28655q, 432, 120);
                    c28655q.m87173q(z4);
                } else {
                    c2314t = c2314t2;
                    z4 = z14;
                    c28655q.m87150e0(647505589);
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z4);
            } else {
                c2314t = c2314t2;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(-1401294041);
                c28655q.m87173q(false);
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "Quiz whoop coach response text");
            C2886a c2886aM8418P = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
            if ((c40988a == null || c40988a.getIsCorrect() != z13) ? z4 : z13) {
                c28655q.m87150e0(-1401018885);
                jMo134584toComposableColorWaAFU9c = correctTextColor.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-1400937479);
                jMo134584toComposableColorWaAFU9c = incorrectTextColor.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 12) & 14);
                c28655q.m87173q(z4);
            }
            AbstractC30795n.m94707h(animatedWhoopCoachResponseText, modifierM3599a, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, ((i15 >> 6) & 14) | 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(c40988a, correctResponseIcon, animatedWhoopCoachResponseText, correctTextColor, incorrectTextColor, interfaceC35689r0, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m133216e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m133217f(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m133218g(C40988a c40988a, AbstractC22403o abstractC22403o, String str, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC35689r0 interfaceC35689r0, int i13, Composer composer, int i14) {
        m133215d(c40988a, abstractC22403o, str, interfaceC39332e, interfaceC39332e2, interfaceC35689r0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

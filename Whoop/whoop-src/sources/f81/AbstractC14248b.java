package f81;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import d62.C11736b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: f81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lf81/c;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lf81/c;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14248b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX INFO: renamed from: b */
    public static final void m40716b(Modifier modifier, C14249c state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        C0209i c0209i;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i2;
        C2314t c2314t;
        C0209i c0209i3;
        C0209i c0209i4;
        ?? r10;
        int i16;
        C28655q c28655q2;
        C28655q c28655q3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-346515686);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q4.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87153g(state) ? 32 : 16;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t2 : modifier2;
            float f13 = 4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q4, 6);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifier4);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N);
            String title = state.getTitle();
            if (title == null) {
                c28655q4.m87150e0(-1273012562);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
                c2314t = c2314t2;
                c0209i4 = c0209i8;
                i16 = 6;
                r10 = 0;
                c0209i3 = c0209i7;
                c0209i = c0209i6;
                interfaceC4339a = interfaceC4339a2;
                c0209i2 = c0209i5;
            } else {
                c28655q4.m87150e0(-1273012561);
                C38072d c38072d = C38072d.f163053a;
                C2886a sh4 = c38072d.m121952e(c28655q4, 6).getSh4();
                long brandWhite = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                c0209i = c0209i6;
                interfaceC4339a = interfaceC4339a2;
                c0209i2 = c0209i5;
                c2314t = c2314t2;
                c0209i3 = c0209i7;
                c0209i4 = c0209i8;
                r10 = 0;
                i16 = 6;
                AbstractC30795n.m94707h(title, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q4, 0, 0, 196602);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            }
            String subtitle = state.getSubtitle();
            if (subtitle == null) {
                c28655q2.m87150e0(-1272793268);
                c28655q2.m87173q(r10);
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(-1272793267);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q6 = c28655q2;
                AbstractC30795n.m94707h(subtitle, null, c38072d2.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i16).getB2(), null, c28655q6, 0, 0, 196602);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(r10);
                c28655q3 = c28655q7;
            }
            float f14 = 1 * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC33253j.m105489e(f14));
            long white20 = C38072d.f163053a.m121949b(c28655q3, i16).getWhite20();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, white20, c17916v0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, r10);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3358c);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88145f(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f14)), 0.0f, 0.0f, state.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0.0f, null, 27, null), state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q3, r10), c17916v0), c28655q3, r10);
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            modifier3 = modifier4;
            c28655q = c28655q3;
        } else {
            C28655q c28655q8 = c28655q4;
            c28655q8.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q8;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, state, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m40717c(Modifier modifier, C14249c c14249c, int i13, int i14, Composer composer, int i15) {
        m40716b(modifier, c14249c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

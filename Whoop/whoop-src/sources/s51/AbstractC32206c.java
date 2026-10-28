package s51;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.navigation.C9598e;
import ge3.AbstractC15751g;
import hy0.AbstractC17755i2;
import hy0.C17736e;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls51/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32206c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
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
    public static final void m100178b(Modifier modifier, C32207d state, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C2314t c2314t;
        float f13;
        boolean z4;
        boolean z13;
        float f14;
        int i16;
        int i17;
        C0209i c0209i;
        C0209i c0209i2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(349394380);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i5);
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
            float f15 = 1;
            float f16 = 8;
            float f17 = f15 * f16;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17, c2314t2));
            int i19 = i15 & 896;
            float f18 = f16;
            c28655q = c28655q2;
            AbstractC32215l.m100233m(null, state.getPillarGauges(), onViewEvent, c28655q, i19, 1);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t2));
            if (state.m100184f() != null) {
                c28655q.m87150e0(1724561886);
                C17736e streaksDivider = state.getStreaksDivider();
                if (streaksDivider == null) {
                    c28655q.m87150e0(1724580516);
                    c28655q.m87173q(false);
                    z4 = false;
                    c0209i2 = c0209i4;
                    c2314t = c2314t2;
                    f13 = f17;
                    c0209i = c0209i3;
                } else {
                    c28655q.m87150e0(1724580517);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f18, c2314t2));
                    c0209i = c0209i3;
                    c2314t = c2314t2;
                    f13 = f17;
                    c0209i2 = c0209i4;
                    z4 = false;
                    AbstractC17755i2.m50938j(null, streaksDivider.getDividerType(), streaksDivider.getDividerTextPosition(), streaksDivider.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite70(), 0L, null, c28655q, 0, 209);
                    c28655q = c28655q;
                    AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                c28655q.m87150e0(1540013308);
                for (C32218o c32218o : state.m100184f()) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC32217n.m100237b(c32218o, new LayoutWeightElement(1.0f, true), c28655q, z4 ? 1 : 0, z4 ? 1 : 0);
                }
                z13 = true;
                c28655q.m87173q(z4);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                c28655q.m87173q(z4);
            } else {
                modifier4 = modifier4;
                f15 = f15;
                c2314t = c2314t2;
                f13 = f17;
                f18 = f18;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(1725486368);
                c28655q.m87173q(false);
            }
            if (state.m100181b() != null) {
                c28655q.m87150e0(1725555653);
                C17736e notableStatsDivider = state.getNotableStatsDivider();
                if (notableStatsDivider == null) {
                    c28655q.m87150e0(1725581444);
                    c28655q.m87173q(z4);
                    f14 = f18;
                } else {
                    c28655q.m87150e0(1725581445);
                    f14 = f18;
                    float f19 = 2 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t));
                    C28655q c28655q3 = c28655q;
                    AbstractC17755i2.m50938j(null, notableStatsDivider.getDividerType(), notableStatsDivider.getDividerTextPosition(), notableStatsDivider.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite70(), 0L, null, c28655q3, 0, 209);
                    c28655q = c28655q3;
                    AbstractC30007c.m91851u(c2314t, f19, c28655q, z4);
                }
                ?? r10 = z4;
                for (Object obj : state.m100181b()) {
                    int i24 = r10 + 1;
                    if (r10 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C32211h c32211h = (C32211h) obj;
                    if (r10 <= 0 || r10 >= state.m100181b().size()) {
                        c28655q.m87150e0(-2112467647);
                        c28655q.m87173q(z4);
                    } else {
                        c28655q.m87150e0(-2112673301);
                        float f24 = 2 * f14;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f24, c2314t));
                        C28655q c28655q4 = c28655q;
                        AbstractC15751g.m44449b(null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), f15, 0.0f, c28655q4, 384, 9);
                        c28655q = c28655q4;
                        AbstractC30007c.m91851u(c2314t, f24, c28655q, z4);
                    }
                    AbstractC32210g.m100194g(null, c32211h, onViewEvent, c28655q, (C9598e.f28134d << 3) | i19, 1);
                    r10 = i24;
                }
                i16 = 2;
                i17 = 6;
                c28655q.m87173q(z4);
            } else {
                f13 = f13;
                f14 = f18;
                i16 = 2;
                i17 = 6;
                c28655q.m87150e0(1726411904);
                c28655q.m87173q(z4);
            }
            String footer = state.getFooter();
            if (footer == null) {
                c28655q.m87150e0(1726443213);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(1726443214);
                AbstractC11266d.m30469w(i16, f14, c2314t, c28655q);
                C38072d c38072d = C38072d.f163053a;
                C28655q c28655q5 = c28655q;
                AbstractC30795n.m94707h(footer, null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB3(), null, c28655q5, 0, 0, 196602);
                c28655q = c28655q5;
                c28655q.m87173q(z4);
            }
            AbstractC30007c.m91851u(c2314t, f13, c28655q, true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, state, onViewEvent, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m100179c(Modifier modifier, C32207d c32207d, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m100178b(modifier, c32207d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

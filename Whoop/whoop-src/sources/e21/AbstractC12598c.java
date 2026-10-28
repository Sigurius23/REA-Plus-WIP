package e21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bu2.C3644e;
import d62.C11736b;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p294l3.AbstractC23278s;
import p294l3.C23281t0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Le21/b;", "state", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Le21/b;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12598c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v24, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v30, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v9 */
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
    /* JADX INFO: renamed from: c */
    public static final void m35305c(Modifier modifier, C12597b state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C12597b c12597b;
        Modifier modifier3;
        ?? r10;
        int i16;
        C0213j c0213j;
        C28655q c28655q;
        float f13;
        boolean z4;
        C2314t c2314t;
        boolean z13;
        C28655q c28655q2;
        ?? r14;
        ?? r15;
        InterfaceC17869a1 interfaceC17869a1M105487c;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1589280791);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q3.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(state) ? 32 : 16;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t2 : modifier2;
            float f14 = 8;
            float f15 = 1 * f14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            if (state.getIcon() == null && state.getTitle() == null) {
                c28655q3.m87150e0(-1910907261);
                c28655q3.m87173q(false);
                modifier4 = modifier4;
                c0209i4 = c0209i4;
                c0209i2 = c0209i2;
                c0209i3 = c0209i3;
                c0213j = c0213j2;
                r15 = 0;
                c0209i = c0209i;
                c2314t = c2314t2;
                f13 = f14;
                z13 = true;
                r14 = c28655q3;
            } else {
                c28655q3.m87150e0(-1911717694);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q3, 54);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                EnumC16313m0 icon = state.getIcon();
                if (icon == null) {
                    c28655q3.m87150e0(-475903045);
                    c28655q3.m87173q(false);
                    c0213j = c0213j2;
                    i16 = 6;
                    c28655q = c28655q3;
                } else {
                    c28655q3.m87150e0(-475903044);
                    i16 = 6;
                    c0213j = c0213j2;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(icon.toWhoopIcon(), c28655q3, 0), AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62358o), AbstractC1102d.m3419p(5 * 4, c2314t2), C38072d.f163053a.m121949b(c28655q3, 6).getWhite50(), c28655q3, 384, 0);
                    C28655q c28655q4 = c28655q3;
                    c28655q4.m87173q(false);
                    c28655q = c28655q4;
                }
                String title = state.getTitle();
                if (title == null) {
                    c28655q.m87150e0(-475519823);
                    c28655q.m87173q(false);
                    z4 = false;
                    c2314t = c2314t2;
                    f13 = f14;
                    z13 = true;
                    c28655q2 = c28655q;
                } else {
                    c28655q.m87150e0(-475519822);
                    C38072d c38072d = C38072d.f163053a;
                    C28655q c28655q5 = c28655q;
                    f13 = f14;
                    z4 = false;
                    c2314t = c2314t2;
                    z13 = true;
                    AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q5, 0, 0, 196602);
                    C28655q c28655q6 = c28655q5;
                    c28655q6.m87173q(false);
                    c28655q2 = c28655q6;
                }
                c28655q2.m87173q(z13);
                c28655q2.m87173q(z4);
                r15 = z4;
                r14 = c28655q2;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.25d) * f13), C2299e.f9107J, r14, 6);
            int iHashCode3 = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = r14.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r14, modifierM3409f);
            r14.m87158i0();
            if (r14.f115903S) {
                r14.m87163l(c0213j);
            } else {
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(r14, c0209i2, interfaceC28653p1M87165m3);
            if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(r14, c0209i4, modifierM118962N3);
            r14.m87150e0(-402641019);
            Iterator it = state.m35298c().iterator();
            ?? r16 = r15;
            while (true) {
                double weight = 0.0d;
                if (!it.hasNext()) {
                    r14.m87173q(r15);
                    r14.m87173q(z13);
                    C23281t0 c23281t0M67350g = AbstractC23278s.m67350g(r14);
                    C2886a b6 = C38072d.f163053a.m121952e(r14, 6).getB3();
                    Iterator it3 = state.m35298c().iterator();
                    while (it3.hasNext()) {
                        weight += (double) ((C12597b.a) it3.next()).getWeight();
                    }
                    c12597b = state;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, c2314t), null, false, AbstractC37817c.m121344e(949046453, r14, new C3644e(c12597b, (float) weight, c23281t0M67350g, b6)), r14, 3078, 6);
                    r14.m87173q(z13);
                    modifier3 = modifier4;
                    r10 = r14;
                    break;
                }
                Object next = it.next();
                int i18 = r16 + 1;
                if (r16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C12597b.a aVar = (C12597b.a) next;
                int size = state.m35298c().size();
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                if (size == z13) {
                    interfaceC17869a1M105487c = AbstractC33253j.m105486b(50);
                } else {
                    interfaceC17869a1M105487c = (r16 == 0 || r16 == AbstractC37056f.m118951C(state.m35298c())) ? AbstractC33253j.m105487c((6 & 1) != 0 ? 0 : 50, (6 & 2) != 0 ? 0 : 50, (6 & 4) != 0 ? 0 : 50, (6 & 8) != 0 ? 0 : 50) : c17916v0;
                }
                float weight2 = aVar.getWeight();
                if (weight2 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (weight2 > Float.MAX_VALUE) {
                    weight2 = Float.MAX_VALUE;
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(2 * 4, new LayoutWeightElement(weight2, z13)), interfaceC17869a1M105487c), aVar.getColor().mo134584toComposableColorWaAFU9c(r14, r15), c17916v0), r14, r15);
                r16 = i18;
            }
        } else {
            c12597b = state;
            c28655q3.m87138X();
            modifier3 = modifier2;
            r10 = c28655q3;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, c12597b, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m35306d(C12597b c12597b, float f13, C23281t0 c23281t0, C2886a c2886a, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        C28655q c28655q;
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        int i15 = (i13 & 6) == 0 ? i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2) : i13;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f14 = ((float) 0.25d) * 8;
            float fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
            float fM124765i = C39169a.m124765i(((C1101c) BoxWithConstraints).f4585b);
            int size = c12597b.m35298c().size() - 1;
            if (size < 0) {
                size = 0;
            }
            float f15 = fM124765i - (fMo743q0 * size);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            int i16 = 6;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q2, 6);
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
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(1577464877);
            for (C12597b.a aVar : c12597b.m35298c()) {
                boolean z4 = ((float) Math.max((int) (C23281t0.m67354a(c23281t0, aVar.getLabel(), c2886a.getStyle(), 1020).f92229c >> 32), (int) (C23281t0.m67354a(c23281t0, aVar.getValue(), c2886a.getStyle(), 1020).f92229c >> 32))) <= (f13 > 0.0f ? (aVar.getWeight() / f13) * f15 : 0.0f);
                float weight = aVar.getWeight();
                if (weight <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (weight > Float.MAX_VALUE) {
                    weight = Float.MAX_VALUE;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(weight, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                if (z4) {
                    c28655q2.m87150e0(167662950);
                    String label = aVar.getLabel();
                    long jMo134584toComposableColorWaAFU9c = aVar.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    C28655q c28655q3 = c28655q2;
                    i14 = i16;
                    AbstractC30795n.m94707h(label, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q3, 0, 0, 196602);
                    AbstractC30795n.m94707h(aVar.getValue(), null, C38072d.f163053a.m121949b(c28655q3, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q3, 0, 0, 196602);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    i14 = i16;
                    c28655q.m87150e0(168154021);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i16 = i14;
                c28655q2 = c28655q;
            }
            C28655q c28655q4 = c28655q2;
            c28655q4.m87173q(false);
            c28655q4.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m35307e(Modifier modifier, C12597b c12597b, int i13, int i14, Composer composer, int i15) {
        m35305c(modifier, c12597b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

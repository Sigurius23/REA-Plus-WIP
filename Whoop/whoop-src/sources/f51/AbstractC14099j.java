package f51;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d62.C11736b;
import d71.C11757c;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import l83.C23454a0;
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
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: f51.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lf51/k;", "viewState", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lf51/k;Landroidx/compose/runtime/Composer;II)V", "Lf51/m;", "item", "e", "(Lf51/m;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14099j {
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void m40160c(Modifier modifier, C14100k viewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        C28655q c28655q2;
        boolean z4;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1590394195);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q3.m87157i(viewState) ? 32 : 16;
        }
        int i17 = 0;
        int i18 = 1;
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            float f13 = 2;
            int i19 = 6;
            Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, 4), AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q3, 6).getBlack20()));
            float f14 = 8;
            float f15 = f13 * f14;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, modifierM52565c);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            c28655q3.m87150e0(-1291204885);
            for (C14101l c14101l : viewState.m40165b()) {
                float f16 = i18 * f14;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q3, i19);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a2);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a2);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(c14101l.getTitle(), c28655q3, i17);
                C38072d c38072d = C38072d.f163053a;
                float f17 = f15;
                float f18 = f14;
                C2314t c2314t2 = c2314t;
                C28655q c28655q4 = c28655q3;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH5(), null, c28655q4, 0, 0, 196602);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q4, 6);
                int iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
                c28655q4.m87150e0(1014406657);
                Iterator<T> it = c14101l.m40166a().iterator();
                while (it.hasNext()) {
                    m40162e((C14102m) it.next(), c28655q4, 0);
                }
                AbstractC25012a.m73392y(c28655q4, false, true, true);
                i19 = 6;
                c2314t = c2314t2;
                c28655q3 = c28655q4;
                i18 = 1;
                i17 = 0;
                f14 = f18;
                modifier4 = modifier5;
                f15 = f17;
            }
            Modifier modifier6 = modifier4;
            float f19 = f15;
            C2314t c2314t3 = c2314t;
            int i24 = i19;
            boolean z13 = i17;
            int i25 = i18;
            C28655q c28655q5 = c28655q3;
            c28655q5.m87173q(z13);
            TextResource additionalInfoText = viewState.getAdditionalInfoText();
            if (additionalInfoText == null) {
                c28655q5.m87150e0(-1372052492);
                c28655q5.m87173q(z13);
                z4 = i25;
                c28655q2 = c28655q5;
            } else {
                c28655q5.m87150e0(-1372052491);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q5, i24);
                int iHashCode4 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, c2314t3);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a3 = C0217k.f724b;
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a3);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m4);
                C0209i c0209i6 = C0217k.f732j;
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N4);
                Modifier modifierM3411h = AbstractC1102d.m3411h(i25, AbstractC1102d.m3409f(1.0f, c2314t3));
                C38072d c38072d2 = C38072d.f163053a;
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(modifierM3411h, AbstractC18249c.m52577o(c38072d2.m121949b(c28655q5, i24).getWhite10())), c28655q5, z13 ? 1 : 0);
                boolean z14 = i25;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(additionalInfoText, c28655q5, z13 ? 1 : 0), null, c38072d2.m121949b(c28655q5, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, i24).getB3(), null, c28655q5, 0, 0, 196602);
                C28655q c28655q6 = c28655q5;
                c28655q6.m87173q(z14);
                c28655q6.m87173q(z13);
                z4 = z14;
                c28655q2 = c28655q6;
            }
            c28655q2.m87173q(z4);
            modifier3 = modifier6;
            c28655q = c28655q2;
        } else {
            C28655q c28655q7 = c28655q3;
            c28655q7.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, viewState, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m40161d(Modifier modifier, C14100k c14100k, int i13, int i14, Composer composer, int i15) {
        m40160c(modifier, c14100k, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final void m40162e(C14102m c14102m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-684246752);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c14102m) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, ((float) 0.5d) * 8, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c14102m.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            C2886a b6 = c38072d.m121952e(c28655q, 6).getB2();
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, 0, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14102m.getMagnitude(), c28655q, 0), null, c14102m.getMagnitudeColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN8(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c14102m, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m40163f(C14102m c14102m, int i13, Composer composer, int i14) {
        m40162e(c14102m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

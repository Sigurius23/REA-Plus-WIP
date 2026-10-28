package cr2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import ci0.C4726a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import java.util.Iterator;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: cr2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcr2/c;", "step", "", "isCurrentStep", "Ll83/a0;", "c", "(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11090f {
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
    public static final void m29939c(C11087c step, boolean z4, Composer composer, int i13) {
        int i14;
        int i15;
        C28655q c28655q;
        Object obj;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C2314t c2314t;
        boolean z13;
        float f13;
        C2305k c2305k;
        C22957g c22957g;
        C28655q c28655q2;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-700546488);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q3.m87157i(step) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q3.m87135U(i14 & 1, (i14 & 19) != 18)) {
            i15 = 1;
            c28655q3.m87138X();
            c28655q = c28655q3;
        } else if (z4) {
            c28655q3.m87150e0(-734129506);
            Object objM87133R = c28655q3.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                c11393q0.m30628I0(Boolean.TRUE);
                c28655q3.m87172p0(c11393q0);
                obj = c11393q0;
            }
            obj = objM87133R;
            C11393q0 c11393q1 = (C11393q0) obj;
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 8;
            float f15 = ((float) 2.5d) * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), f15, 12 * f14, f15, 0.0f, 8);
            C22961h c22961h = AbstractC22977m.f90654e;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k2, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 6);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N2);
            TextResource title = step.getTitle();
            if (title == null) {
                c28655q3.m87150e0(755924798);
                z13 = false;
                c28655q3.m87173q(false);
                c0209i4 = c0209i5;
                c0209i = c0209i8;
                c2314t = c2314t2;
                c22957g = c22957g2;
                c0209i2 = c0209i7;
                c0209i3 = c0209i6;
                c2305k = c2305k2;
                f13 = f14;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(755924799);
                AbstractC11266d.m30469w(2, f14, c2314t2, c28655q3);
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t2, "StatListTitle");
                String strM21274h = AbstractC8693b.m21274h(title, c28655q3, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q3, i16).getT2();
                c0209i = c0209i8;
                c0209i2 = c0209i7;
                c0209i3 = c0209i6;
                c0209i4 = c0209i5;
                c2314t = c2314t2;
                z13 = false;
                f13 = f14;
                AbstractC30795n.m94707h(strM21274h, modifierM3599a, c38072d.m121949b(c28655q3, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q3, 48, C2886a.f11498d << 18, 196600);
                C28655q c28655q4 = c28655q3;
                AbstractC25012a.m73388u(3, f13, c2314t, c28655q4, false);
                c2305k = c2305k2;
                c22957g = c22957g2;
                c28655q2 = c28655q4;
            }
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, z13 ? 1 : 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N3);
            c28655q2.m87150e0(639872831);
            Iterator it = step.m29922f().iterator();
            int i17 = z13 ? 1 : 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C11091g c11091g = (C11091g) next;
                TextResource title2 = c11091g.getTitle();
                TextResource value = c11091g.getValue();
                TextResource suffix = c11091g.getSuffix();
                EnumC11092h style = c11091g.getStyle();
                TextResource subtext = c11091g.getSubtext();
                EnumC17727b2 subtextState = c11091g.getSubtextState();
                boolean z14 = i17 == AbstractC37056f.m118951C(step.m29922f()) ? true : z13;
                Duration.Companion companion = Duration.INSTANCE;
                long jM134292timesUwyO8pc = Duration.m134292timesUwyO8pc(DurationKt.toDuration(i17, DurationUnit.SECONDS), 0.5d);
                int i19 = TextResource.$stable;
                AbstractC11086b.m29918f(title2, value, suffix, style, subtext, subtextState, z14, jM134292timesUwyO8pc, c28655q2, (i19 << 3) | i19 | (i19 << 6) | (i19 << 12));
                i17 = i18;
                it = it;
                z13 = false;
            }
            i15 = 1;
            AbstractC25012a.m73392y(c28655q2, z13, true, true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 2 * f13, 0.0f, 2));
            AbstractC22813b.m66094u(c11393q1, EnumC22818g.BOTTOM, null, AbstractC37817c.m121344e(-672716628, c28655q2, new C4726a(step, 6)), c28655q2, 3120, 4);
            c28655q2.m87173q(true);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        } else {
            i15 = 1;
            c28655q3.m87150e0(-731365670);
            c28655q3.m87173q(false);
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11088d(step, z4, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m29940d(C11087c c11087c, InterfaceC23013y interfaceC23013y, Composer composer, int i13) {
        C2307m c2307m = C2299e.f9114w;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        TextResource wirFooterText = c11087c.getWirFooterText();
        C2314t c2314t = C2314t.f9131w;
        C23454a0 c23454a1 = null;
        if (wirFooterText == null) {
            c28655q.m87150e0(-583610709);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-583610708);
            TextResource wirFooterSubText = c11087c.getWirFooterSubText();
            if (wirFooterSubText == null) {
                c28655q.m87150e0(-1477920453);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1477920452);
                Modifier modifierM3599a = AbstractC1136a.m3599a(((C23016z) interfaceC23013y).m66778b(c2314t, C2299e.f9110M), "StatListFooterV2");
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                int i14 = TextResource.$stable;
                AbstractC11089e.m29935j(wirFooterText, wirFooterSubText, c28655q, i14 | (i14 << 3));
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                c23454a1 = c23454a0;
            }
            c28655q.m87173q(false);
        }
        if (c23454a1 != null) {
            c28655q.m87150e0(2059383586);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(-583185822);
        Modifier modifierM3599a2 = AbstractC1136a.m3599a(((C23016z) interfaceC23013y).m66778b(c2314t, C2299e.f9112O), "StatListLegendV2");
        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j2 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
        C0209i c0209i2 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
        AbstractC11089e.m29933h(c11087c.getLegendText(), c28655q, TextResource.$stable);
        c28655q.m87173q(true);
        c28655q.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m29941e(C11087c c11087c, boolean z4, int i13, Composer composer, int i14) {
        m29939c(c11087c, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

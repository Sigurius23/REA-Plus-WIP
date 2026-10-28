package br2;

import a80.C0539c;
import am0.C0998b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jr2.AbstractC21904c;
import kd1.AbstractC22403o;
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
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p291l0.C23016z;
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

/* JADX INFO: renamed from: br2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lbr2/j;", "step", "", "isCurrentStep", "Ll83/a0;", "c", "(Lbr2/j;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3571m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [l0.z] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
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
    public static final void m10724c(C3568j step, boolean z4, Composer composer, int i13) {
        ?? r10;
        Object obj;
        C0209i c0209i;
        ?? r14;
        C23016z c23016z;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0213j c0213j;
        C2314t c2314t;
        ?? r15;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-104819068);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(step) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
            r10 = c28655q;
        } else if (z4) {
            c28655q.m87150e0(-223411920);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                c11393q0.m30628I0(Boolean.TRUE);
                c28655q.m87172p0(c11393q0);
                obj = c11393q0;
            }
            obj = objM87133R;
            C11393q0 c11393q1 = (C11393q0) obj;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
            C23016z c23016z2 = C23016z.f90757a;
            AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t2, true, 1.0f));
            TextResource title = step.getTitle();
            if (title == null) {
                c28655q.m87150e0(-1109029474);
                c28655q.m87173q(false);
                c0209i3 = c0209i5;
                c0209i2 = c0209i8;
                c2314t = c2314t2;
                c23016z = c23016z2;
                c0209i4 = c0209i6;
                c0213j = c0213j2;
                r14 = 0;
                c0209i = c0209i7;
                r15 = c28655q;
            } else {
                c28655q.m87150e0(-1109029473);
                float f13 = 8;
                AbstractC11266d.m30469w(6, f13, c2314t2, c28655q);
                float f14 = ((float) 2.5d) * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1136a.m3599a(c2314t2, "StackedHorizontalBarTitle"), f14, 0.0f, f14, 0.0f, 10);
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                c0209i = c0209i7;
                r14 = 0;
                c23016z = c23016z2;
                c0209i2 = c0209i8;
                c0209i3 = c0209i5;
                c0209i4 = c0209i6;
                c0213j = c0213j2;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                C28655q c28655q2 = c28655q;
                AbstractC25012a.m73388u(3, f13, c2314t, c28655q2, false);
                r15 = c28655q2;
            }
            float f15 = 8;
            C2314t c2314t3 = c2314t;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t3, 0.0f, ((float) 1.25d) * f15, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, r15, r14);
            int iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3398t2);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m2);
            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(r15, c0209i2, modifierM118962N2);
            r15.m87150e0(-465493525);
            ?? r16 = r14;
            for (Object obj2 : step.m10713e()) {
                int i16 = r16 + 1;
                if (r16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3561c c3561c = (C3561c) obj2;
                C3559a c3559aM10721d = AbstractC3570l.m10721d(c3561c);
                Modifier modifierM3413j = AbstractC1102d.m3413j(c23016z.m66779c(c2314t3, r14, c3559aM10721d.getWeight()), 0.0f, c3559aM10721d.getMaxHeight(), 1);
                Duration.Companion companion = Duration.INSTANCE;
                long jM134292timesUwyO8pc = Duration.m134292timesUwyO8pc(DurationKt.toDuration((int) r16, DurationUnit.SECONDS), 0.5d);
                int i17 = TextResource.$stable | AbstractC22403o.f87638a;
                int i18 = C2886a.f11498d;
                AbstractC3566h.m10699k(c3561c, modifierM3413j, jM134292timesUwyO8pc, r15, i18 | i17 | i18, 0);
                AbstractC22953f.m66715b(r15, AbstractC1099a.m3394p(((float) 0.25d) * f15, c2314t3));
                r16 = i16;
            }
            r15.m87173q(r14);
            r15.m87173q(true);
            AbstractC22953f.m66715b(r15, c23016z.m66779c(c2314t3, true, 1.0f));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9105H, r14);
            int iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, c2314t3);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j3);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m3);
            C0209i c0209i9 = C0217k.f732j;
            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i9);
            }
            AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N3);
            AbstractC22813b.m66094u(c11393q1, EnumC22818g.BOTTOM, null, AbstractC37817c.m121344e(1697022050, r15, new C0539c(step, 17)), r15, 3120, 4);
            AbstractC25012a.m73392y(r15, true, true, r14);
            r10 = r15;
        } else {
            c28655q.m87150e0(-220661538);
            c28655q.m87173q(false);
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(step, z4, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m10725d(C3568j c3568j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zIsEmpty = AbstractC21904c.m62321i(c3568j.m10716h()).isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(-75619223);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
                TextResource footerText = c3568j.getFooterText();
                TextResource footerSubText = c3568j.getFooterSubText();
                int i14 = TextResource.$stable;
                AbstractC3570l.m10719b(modifierM3396r, footerText, footerSubText, c28655q, (i14 << 6) | (i14 << 3) | 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-76040141);
                float f13 = 5 * 4;
                AbstractC30795n.m94704e(AbstractC21904c.m62321i(c3568j.m10716h()), AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, f13, f13, f13, 0.0f, 8), "StackedHorizontalBarV2Text"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2(), c28655q, 0, C2886a.f11498d << 21, 131068);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m10726e(C3568j c3568j, boolean z4, int i13, Composer composer, int i14) {
        m10724c(c3568j, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

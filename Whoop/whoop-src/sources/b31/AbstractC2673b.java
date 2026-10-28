package b31;

import a01.C0085e;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b01.C2185f;
import c93.InterfaceC4339a;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.DismissModalAction;
import gb1.AbstractC15676d;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.util.Iterator;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.C17820i;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: b31.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lb31/c;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lb31/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2673b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r26v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v6, types: [iz0.l] */
    /* JADX WARN: Type inference failed for: r5v19, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v23, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v9, types: [p1.q] */
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
    /* JADX INFO: renamed from: e */
    public static final void m7534e(Modifier modifier, C2674c c2674c, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function1;
        Modifier modifier3;
        ?? r10;
        ?? r14;
        C2305k c2305k;
        C0213j c0213j;
        C0209i c0209i;
        C2314t c2314t;
        int i16;
        C0209i c0209i2;
        C0209i c0209i3;
        float f13;
        ?? r15;
        ?? r16;
        ?? r17;
        C2674c state = c2674c;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(657105824);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            float f14 = 8;
            float f15 = 1 * f14;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k2, c28655q, 6);
            int i18 = i15;
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            Modifier modifier5 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
            TextResource textResourceM7543e = state.getTitle();
            if (textResourceM7543e == null) {
                c28655q.m87150e0(-1463776711);
                r14 = 0;
                c28655q.m87173q(false);
                c2314t = c2314t2;
                c0213j = c0213j2;
                c0209i2 = c0209i5;
                c0209i3 = c0209i7;
                c2305k = c2305k2;
                f13 = f14;
                c0209i = c0209i6;
                i16 = 6;
                r15 = c28655q;
            } else {
                r14 = 0;
                c28655q.m87150e0(-1463776710);
                String strM21274h = AbstractC8693b.m21274h(textResourceM7543e, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                c2305k = c2305k2;
                c0213j = c0213j2;
                c0209i = c0209i6;
                c2314t = c2314t2;
                i16 = 6;
                c0209i2 = c0209i5;
                c0209i3 = c0209i7;
                f13 = f14;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT3(), null, c28655q, 0, 0, 196602);
                C28655q c28655q2 = c28655q;
                c28655q2.m87173q(false);
                r15 = c28655q2;
            }
            TextResource textResourceM7542d = c2674c.getSubtitle();
            if (textResourceM7542d == null) {
                r15.m87150e0(-1463511630);
                r15.m87173q(r14);
                r17 = r15;
            } else {
                r15.m87150e0(-1463511629);
                if (c2674c.getSubtitleSupportsMarkdown()) {
                    r15.m87150e0(-1645818379);
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM7542d, r15, r14);
                    ?? r18 = C21053l.f79834a;
                    ?? r19 = C38072d.f163053a;
                    ?? r26 = r15;
                    AbstractC21048g.m58807M(strM21274h2, null, false, r18.m58880a(AbstractC33745d.m106661t(r19, r15, i16), r19.m121949b(r15, i16).getTextBaseSecondary(), r19.m121949b(r15, i16).getTextBaseSecondary(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r26, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, true, r26, 100663296, 246);
                    ?? r24 = r26;
                    r24.m87173q(r14);
                    r16 = r24;
                } else {
                    r15.m87150e0(-1645345412);
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM7542d, r15, r14);
                    ?? r25 = C38072d.f163053a;
                    ?? r27 = r15;
                    AbstractC30795n.m94707h(strM21274h3, null, r25.m121949b(r15, i16).getTextBaseSecondary(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r25.m121952e(r15, i16).getB1(), null, r27, 0, 0, 196602);
                    ?? r28 = r27;
                    r28.m87173q(r14);
                    r16 = r28;
                }
                r16.m87173q(r14);
                r17 = r16;
            }
            r17.m87173q(true);
            if (c2674c.getTitle() == null && c2674c.getSubtitle() == null) {
                r17.m87150e0(-1773669812);
                r17.m87173q(r14);
            } else {
                r17.m87150e0(-1773738043);
                AbstractC25012a.m73388u(2, f13, c2314t, r17, r14);
            }
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r17, i16);
            int iHashCode3 = Long.hashCode(r17.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = r17.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r17, c2314t);
            r17.m87158i0();
            if (r17.f115903S) {
                r17.m87163l(c0213j);
            } else {
                r17.m87178s0();
            }
            AbstractC28683x.m87239G(r17, c0209i4, c23010xM66775a3);
            AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m3);
            if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, r17, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(r17, c0209i3, modifierM118962N3);
            r17.m87150e0(996460018);
            Iterator it = c2674c.m7539a().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74290q((C25306o) it.next(), null, null, onViewEvent, r17, (i18 << 3) & 7168, 6);
            }
            function1 = onViewEvent;
            r17.m87173q(r14);
            r17.m87173q(true);
            AbstractC22953f.m66715b(r17, AbstractC1102d.m3411h(7 * f13, c2314t));
            boolean fillMaxSize = c2674c.getPrimaryButton().getFillMaxSize();
            Object objM87133R = r17.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            Object obj = objM87133R;
            if (objM87133R == c28676v0) {
                C2185f c2185f = new C2185f(24);
                r17.m87172p0(c2185f);
                obj = c2185f;
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t, fillMaxSize, (Function1) obj);
            boolean fillMaxWidth = c2674c.getPrimaryButton().getFillMaxWidth();
            Object objM87133R2 = r17.m87133R();
            Object obj2 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                C2185f c2185f2 = new C2185f(25);
                r17.m87172p0(c2185f2);
                obj2 = c2185f2;
            }
            Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM44099b, fillMaxWidth, (Function1) obj2);
            C27256h c27256hM7540b = c2674c.getPrimaryButton();
            state = c2674c;
            int i19 = (r17.m87157i(state) ? 1 : 0) | ((i18 & 896) == 256 ? 1 : r14);
            Object objM87133R3 = r17.m87133R();
            Object obj3 = objM87133R3;
            if (i19 != 0 || objM87133R3 == c28676v0) {
                C17820i c17820i = new C17820i(19, function1, state);
                r17.m87172p0(c17820i);
                obj3 = c17820i;
            }
            AbstractC27249e.m82121d(modifierM44099b2, c27256hM7540b, null, (InterfaceC4339a) obj3, r17, 0, 4);
            r17.m87173q(true);
            modifier3 = modifier5;
            r10 = r17;
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
            modifier3 = modifier2;
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier3, state, function1, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m7535f(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1102d.m3407d(1.0f, applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m7536g(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1102d.m3409f(1.0f, applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m7537h(Function1 function1, C2674c c2674c) {
        function1.invoke(new DesignItemInteraction(DismissModalAction.INSTANCE, null));
        function1.invoke(new DesignItemInteraction(c2674c.getPrimaryButton().getAction(), c2674c.getPrimaryButton().getAnalyticEvent()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m7538i(Modifier modifier, C2674c c2674c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m7534e(modifier, c2674c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

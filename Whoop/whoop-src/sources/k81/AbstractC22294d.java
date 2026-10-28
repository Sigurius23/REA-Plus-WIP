package k81;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import ih1.C18522f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lk81/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "sectionId", "i", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Lm91/u;", "item", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22294d {
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
    public static final void m64052d(Modifier modifier, final C22295e state, final Function1 onViewEvent, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        Modifier modifier4;
        int i16;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z4;
        C2314t c2314t;
        C2314t c2314t2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1181392428);
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
            C2314t c2314t3 = C2314t.f9131w;
            final Modifier modifier5 = i17 != 0 ? c2314t3 : modifier2;
            if (state.getIsVisible()) {
                Modifier modifierM3398t = AbstractC1099a.m3398t(m64057i(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier5), "Section_" + state.getId()), state.getId()), 0.0f, state.getSectionTopPadding(), 0.0f, state.getSectionBottomPadding(), 5);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, state.getAlignment().getHorizontalAlignment(), c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                Modifier modifier6 = modifier5;
                String title = state.getTitle();
                if (title == null) {
                    c28655q.m87150e0(-1378007875);
                    c28655q.m87173q(false);
                    modifier4 = modifier6;
                    c0209i2 = c0209i6;
                    c0209i = c0209i8;
                    c0209i3 = c0209i7;
                    i16 = i15;
                    c0213j = c0213j2;
                    c0209i4 = c0209i5;
                    z4 = false;
                } else {
                    c28655q.m87150e0(-1378007874);
                    C38072d c38072d = C38072d.f163053a;
                    modifier4 = modifier6;
                    i16 = i15;
                    c0213j = c0213j2;
                    c0209i = c0209i8;
                    c0209i2 = c0209i6;
                    c0209i3 = c0209i7;
                    c0209i4 = c0209i5;
                    z4 = false;
                    AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                String subtitle = state.getSubtitle();
                if (subtitle == null) {
                    c28655q.m87150e0(-1377782970);
                    c28655q.m87173q(z4);
                    c2314t = c2314t3;
                } else {
                    c28655q.m87150e0(-1377782969);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13);
                    C21053l c21053l = C21053l.f79834a;
                    C38072d c38072d2 = C38072d.f163053a;
                    C28655q c28655q2 = c28655q;
                    c2314t = c2314t3;
                    C21054m c21054mM58880a = c21053l.m58880a(AbstractC33745d.m106661t(c38072d2, c28655q, 6), c38072d2.m121949b(c28655q, 6).getWhite70(), c38072d2.m121949b(c28655q, 6).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760);
                    c28655q = c28655q2;
                    AbstractC21048g.m58807M(subtitle, modifierM3398t2, false, c21054mM58880a, null, 0, 0, 0, false, c28655q, 48, 500);
                    c28655q.m87173q(z4);
                }
                if ((state.getTitle() == null && state.getSubtitle() == null) || state.m64062f().isEmpty()) {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-1377242112);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-1377297850);
                    c2314t2 = c2314t;
                    AbstractC31061c.m95650z(2, 8, c2314t2, c28655q, z4);
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(state.getInterItemPadding()), state.getAlignment().getHorizontalAlignment(), c28655q, z4 ? 1 : 0);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                c28655q.m87150e0(488583829);
                for (C25306o c25306o : state.m64062f()) {
                    AbstractC25303l.m74290q(c25306o, null, new C18522f(6, c25306o, state), onViewEvent, c28655q, (i16 << 3) & 7168, 2);
                    z4 = z4 ? 1 : 0;
                }
                AbstractC25012a.m73392y(c28655q, z4, true, true);
                modifier3 = modifier4;
            } else {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i18 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: k81.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC22294d.m64053e(modifier5, state, onViewEvent, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC22294d.m64055g(modifier5, state, onViewEvent, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i19 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: k81.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i19) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC22294d.m64053e(modifier3, state, onViewEvent, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC22294d.m64055g(modifier3, state, onViewEvent, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64053e(Modifier modifier, C22295e c22295e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64052d(modifier, c22295e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m64054f(C25306o c25306o, C22295e c22295e, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(487092348);
        Modifier modifierM64056h = m64056h(C2314t.f9131w, c25306o.getState(), c22295e.getId());
        c28655q.m87173q(false);
        return modifierM64056h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64055g(Modifier modifier, C22295e c22295e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64052d(modifier, c22295e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final Modifier m64056h(Modifier modifier, InterfaceC25312u item, String sectionId) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(sectionId, "sectionId");
        return modifier;
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m64057i(Modifier modifier, String sectionId) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(sectionId, "sectionId");
        return modifier;
    }
}

package r80;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1935f;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import l83.C23454a0;
import no0.C26954j0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p714k80.Function0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import q81.C30047e;
import qn0.C30515j;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r80.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lr80/f;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Lr80/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lr80/e;", "tile", "", "isSelected", "Lr80/a;", "onTileSelected", "l", "(Lr80/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "o", "(Lr80/a;)Ljava/lang/String;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31062d {

    /* JADX INFO: renamed from: r80.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128070a;

        static {
            int[] iArr = new int[EnumC31059a.values().length];
            try {
                iArr[EnumC31059a.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31059a.ANNUALLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f128070a = iArr;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public static final void m95657g(C31064f c31064f, Function1 onViewEvent, Composer composer, int i13) {
        Function1 function1;
        C28655q c28655q;
        C28676v0 c28676v0;
        C31064f viewState = c31064f;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-515773344);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            boolean zM95676g = viewState.getShowFullScreenError();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM95676g) {
                c28655q2.m87150e0(1989454008);
                int i16 = i15 & 112;
                boolean z4 = i16 == 32;
                Object objM87133R = c28655q2.m87133R();
                if (z4 || objM87133R == c28676v1) {
                    objM87133R = new C30515j(onViewEvent, 4);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean z13 = i16 == 32;
                Object objM87133R2 = c28655q2.m87133R();
                if (z13 || objM87133R2 == c28676v1) {
                    objM87133R2 = new C30515j(onViewEvent, 5);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                c28655q2.m87173q(false);
                function1 = onViewEvent;
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(1989934291);
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t)), f14, ((float) 7.25d) * f13, f14, 13 * f13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3397s);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                TextResource textResourceM95678i = viewState.getTitle();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM95678i, c28655q2, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i18).getT2();
                long jM125430y = c38072d.m121949b(c28655q2, i18).getBrandWhite();
                int i19 = C2886a.f11498d << 18;
                C28676v0 c28676v2 = c28676v1;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, i19, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31064f.getSubtitle(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 0, i19, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f13, c2314t));
                c28655q2.m87150e0(-441935738);
                for (C31063e c31063e : c31064f.m95677h()) {
                    boolean z14 = c31064f.getBillingFrequency() == c31063e.getBillingFrequency();
                    boolean zM87157i = c28655q2.m87157i(c31063e) | ((i15 & 112) == 32) | c28655q2.m87157i(c31064f);
                    Object objM87133R3 = c28655q2.m87133R();
                    if (zM87157i) {
                        c28676v0 = c28676v2;
                    } else {
                        c28676v0 = c28676v2;
                        if (objM87133R3 == c28676v0) {
                        }
                        m95662l(c31063e, z14, (Function1) objM87133R3, c28655q2, TextResource.$stable);
                        AbstractC11266d.m30469w((float) 1.5d, f13, c2314t, c28655q2);
                        c28676v2 = c28676v0;
                    }
                    objM87133R3 = new C26954j0((Object) c31063e, onViewEvent, (Object) c31064f, 24);
                    c28655q2.m87172p0(objM87133R3);
                    m95662l(c31063e, z14, (Function1) objM87133R3, c28655q2, TextResource.$stable);
                    AbstractC11266d.m30469w((float) 1.5d, f13, c2314t, c28655q2);
                    c28676v2 = c28676v0;
                }
                c28655q2.m87173q(false);
                String strM21274h2 = AbstractC8693b.m21274h(c31064f.getDisclaimerText(), c28655q2, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d2.m121952e(c28655q2, i24).getB1();
                viewState = c31064f;
                function1 = onViewEvent;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            function1 = onViewEvent;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(viewState, function1, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m95658h(Function1 function1) {
        function1.invoke(new InterfaceC21413a.m0(ActivationFlowDestination.ACCOUNT_ACTIVATION));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m95659i(Function1 function1) {
        function1.invoke(new InterfaceC21413a.m0(ActivationFlowDestination.ACCOUNT_ACTIVATION));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m95660j(C31063e c31063e, Function1 function1, C31064f c31064f, EnumC31059a it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC31059a enumC31059aM95666a = c31063e.getBillingFrequency();
        if (enumC31059aM95666a != null) {
            function1.invoke(new InterfaceC21413a.d0(enumC31059aM95666a));
            function1.invoke(new InterfaceC17002b.i(c31064f.getAnalyticsName(), null, "tile", m95665o(enumC31059aM95666a), "membership", null, 34, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m95661k(C31064f c31064f, Function1 function1, int i13, Composer composer, int i14) {
        m95657g(c31064f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m95662l(C31063e c31063e, boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95628d;
        boolean z13;
        long jM73366B;
        boolean z14;
        long jM73366B2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1223877387);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c31063e) : c28655q2.m87157i(c31063e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z15 = ((i14 & 896) == 256) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q2.m87157i(c31063e)));
            Object objM87133R = c28655q2.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                objM87133R = new C30599e(c31063e, function1, 9);
                c28655q2.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15));
            if (z4) {
                c28655q2.m87150e0(-674857515);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(-674856430);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC31061c.m95629e(modifierM3409f, 3, 4, jM95628d), f14, f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            TextResource textResourceM95668c = c31063e.getText();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM95668c, c28655q2, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q2, i16).getSh4();
            if (z4) {
                c28655q2.m87150e0(603967343);
                jM73366B = c38072d.m121949b(c28655q2, i16).getBrandBlack();
                z13 = false;
            } else {
                z13 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q2, 603968431, c38072d, c28655q2, i16);
            }
            c28655q2.m87173q(z13);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q2, 0, i17, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(((float) 0.5d) * f13, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(c31063e.getSubtext(), c28655q2, i15);
            C2886a c2886aM8423d = c38072d.m121952e(c28655q2, i16).getB4();
            if (z4) {
                c28655q2.m87150e0(603977039);
                jM73366B2 = c38072d.m121949b(c28655q2, i16).getBrandBlack();
                z14 = false;
            } else {
                z14 = false;
                jM73366B2 = AbstractC25012a.m73366B(c28655q2, 603978127, c38072d, c28655q2, i16);
            }
            c28655q2.m87173q(z14);
            AbstractC30795n.m94707h(strM21274h2, null, jM73366B2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q2, 0, i17, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            TextResource textResourceM95669d = c31063e.getUpsellText();
            if (textResourceM95669d == null) {
                c28655q.m87150e0(-2096938994);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2096938993);
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM95669d, c28655q, i15), null, c38072d.m121949b(c28655q, i16).getBrandPrimary(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q, 0, i17, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(c31063e, z4, function1, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m95663m(C31063e c31063e, Function1 function1) {
        EnumC31059a enumC31059aM95666a = c31063e.getBillingFrequency();
        if (enumC31059aM95666a != null) {
            function1.invoke(enumC31059aM95666a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m95664n(C31063e c31063e, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m95662l(c31063e, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final String m95665o(EnumC31059a enumC31059a) {
        int i13 = a.f128070a[enumC31059a.ordinal()];
        if (i13 == 1) {
            return "monthly";
        }
        if (i13 == 2) {
            return "1YR";
        }
        throw new NoWhenBranchMatchedException();
    }
}

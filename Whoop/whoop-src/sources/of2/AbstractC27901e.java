package of2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.Locale;
import l83.C23454a0;
import lf2.C24008a;
import lf2.C24017j;
import mi2.C25592o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: of2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Llf2/j;", "wakeModeViewState", "Lkotlin/Function1;", "Llf2/b;", "Ll83/a0;", "wakeModeEventListener", "d", "(Llf2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27901e {
    /* JADX WARN: Code duplicated, block: B:68:0x0253  */
    /* JADX WARN: Code duplicated, block: B:69:0x0257  */
    /* JADX WARN: Code duplicated, block: B:74:0x0272  */
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
    public static final void m84205d(C24017j wakeModeViewState, Function1 wakeModeEventListener, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        float f13;
        int iHashCode;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(wakeModeViewState, "wakeModeViewState");
        AbstractC22676k.m65750j(wakeModeEventListener, "wakeModeEventListener");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-279834885);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(wakeModeViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(wakeModeEventListener) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C22961h c22961h = AbstractC22977m.f90655f;
            float f14 = (float) 1.5d;
            float f15 = 8;
            float f16 = f14 * f15;
            C2314t c2314t = C2314t.f9131w;
            float f17 = f16;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f18 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(5 * f18, c2314t));
            c28655q.m87150e0(-1705621670);
            Iterator it = wakeModeViewState.m70850a().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c28676v0 = C28635l.f115821a;
                if (!zHasNext) {
                    break;
                }
                C24008a c24008a = (C24008a) it.next();
                C39282o c39282oM125228b = C39282o.Companion.m125228b(C39282o.INSTANCE, AbstractC8693b.m21278l(c24008a.getAlarmModeTypeTitle()), null, AbstractC8693b.m21278l(c24008a.getAlarmModeTypeDescription()), false, false, null, 58, null);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 2 * f15, 0.0f, 2));
                boolean zM87153g = ((i14 & 112) == 32) | c28655q.m87153g(c24008a);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C25592o(26, wakeModeEventListener, c24008a);
                    c28655q.m87172p0(objM87133R);
                }
                float f19 = f14;
                AbstractC39281n.m125207c(modifierM3409f, c39282oM125228b, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                AbstractC18489d0.m53380u(f19, f18, c2314t, c28655q);
                f17 = f17;
                i14 = i14;
                f14 = f19;
                f15 = f15;
                it = it;
            }
            float f24 = f17;
            int i15 = i14;
            float f25 = f15;
            c28655q.m87173q(false);
            float f26 = 2;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f26 * f25, 0.0f, 2);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
            C18027i c18027i = new C18027i(0);
            boolean zM87157i = ((i15 & 112) == 32) | c28655q.m87157i(wakeModeViewState);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C25592o(27, wakeModeEventListener, wakeModeViewState);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3360e(modifierM3396r, interfaceC21083i, null, false, c18027i, (InterfaceC4339a) objM87133R3, 12));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                f13 = f18;
            } else {
                f13 = f18;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                float f27 = 1 * f25;
                Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3393o(new C22976l1(f24, f27, f24, f27), AbstractC15680h.m44112a(c2314t, true)));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM38560g);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                String upperCase = AbstractC8693b.m21274h(AbstractC8693b.m21278l(wakeModeViewState.getNoAlarmState().getNoAlarmTitle()), c28655q, TextResource.$stable).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                long brandWhite = c38072d.m121949b(c28655q, i16).getBrandWhite();
                C2886a btS = AbstractC2890e.m8450e().getBtS();
                int i17 = C2886a.f11498d << 18;
                float f28 = f13;
                AbstractC30795n.m94707h(upperCase, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, btS, null, c28655q, 0, i17, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f26 * f28, c2314t));
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, null).getIcon(), c28655q, 6), "", AbstractC1102d.m3419p(f28 * f28, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(wakeModeViewState.getNoAlarmState().getNoAlarmTitleDescription(), new HorizontalAlignElement(c2305k), c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB3(), null, c28655q, 0, i17, 196088);
                c28655q = c28655q;
                c28655q.m87173q(true);
                AbstractC31061c.m95650z(3, f28, c2314t, c28655q, true);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
            float f29 = 1 * f25;
            Modifier modifierM38560g2 = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3393o(new C22976l1(f24, f29, f24, f29), AbstractC15680h.m44112a(c2314t, true)));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM38560g2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
            String upperCase2 = AbstractC8693b.m21274h(AbstractC8693b.m21278l(wakeModeViewState.getNoAlarmState().getNoAlarmTitle()), c28655q, TextResource.$stable).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            long brandWhite2 = c38072d2.m121949b(c28655q, i18).getBrandWhite();
            C2886a btS2 = AbstractC2890e.m8450e().getBtS();
            int i19 = C2886a.f11498d << 18;
            float f210 = f13;
            AbstractC30795n.m94707h(upperCase2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, btS2, null, c28655q, 0, i19, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f26 * f210, c2314t));
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(new C39274g(AbstractC18489d0.m53359E(c38072d2), null, 2, null).getIcon(), c28655q, 6), "", AbstractC1102d.m3419p(f210 * f210, c2314t), c38072d2.m121949b(c28655q, i18).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(wakeModeViewState.getNoAlarmState().getNoAlarmTitleDescription(), new HorizontalAlignElement(c2305k), c38072d2.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getB3(), null, c28655q, 0, i19, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC31061c.m95650z(3, f210, c2314t, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(wakeModeViewState, wakeModeEventListener, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m84206e(Function1 function1, C24008a c24008a) {
        function1.invoke(c24008a.getAlarmType());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m84207f(Function1 function1, C24017j c24017j) {
        function1.invoke(c24017j.getNoAlarmState().getAlarmType());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84208g(C24017j c24017j, Function1 function1, int i13, Composer composer, int i14) {
        m84205d(c24017j, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

package zi1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p208i2.C17903p;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p490t0.AbstractC33253j;
import p635y2.AbstractC39083d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r51.C30936d;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi1.InterfaceC38321a;
import yf1.C39516e;
import yi1.C39578l;

/* JADX INFO: renamed from: zi1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lyi1/l;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lyi1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "navigationTextBiasWeight", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40685o {
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
    public static final void m132093d(C39578l itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1393922881);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(1.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            TextResource textResourceM126453c = itemState.getLeftTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM126453c, c28655q, i15);
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(AbstractC39083d.f168140a);
            int i16 = i14;
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e = withAlignmentLineElement.mo3471e(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true));
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierMo3471e, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            String strM21274h2 = AbstractC8693b.m21274h(itemState.getRightTitle(), c28655q, i15);
            C9598e c9598eM126456f = itemState.getRightTitleDestination();
            if (c9598eM126456f != null) {
                c28655q.m87150e0(-1348949478);
                boolean zM87153g = c28655q.m87153g(strM21274h2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C30936d(strM21274h2, 15);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
                float fM132094e = m132094e(interfaceC28690z0);
                if (fM132094e <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (fM132094e > Float.MAX_VALUE) {
                    fM132094e = Float.MAX_VALUE;
                }
                Modifier modifierMo3471e2 = modifierM51775c.mo3471e(new LayoutWeightElement(fM132094e, true));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(itemState.getRightTileIcon(), c28655q, 0);
                float f13 = 24;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3415l(f13, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7)), AbstractC33253j.m105489e(f13));
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R3;
                InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                boolean zM87157i = c28655q.m87157i(c9598eM126456f) | ((i16 & 112) == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new C4789l(onViewEvent, c9598eM126456f, 16);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC29125c.m88522c(abstractC26165aM88500I, null, modifierM118994r.mo3471e(AbstractC1092a.m3360e(c2314t, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) objM87133R4, 28)), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, i17).getWhite70(), 5), c28655q, 48, 56);
                z4 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z4 = true;
                c28655q.m87150e0(-1347952611);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(itemState, onViewEvent, i13, 18);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final float m132094e(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m132095f(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        AbstractC18041w.m51810i(semantics, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132096g(Function1 function1, C9598e c9598e) {
        function1.invoke(new InterfaceC38321a.i(c9598e));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132097h(C39578l c39578l, Function1 function1, int i13, Composer composer, int i14) {
        m132093d(c39578l, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

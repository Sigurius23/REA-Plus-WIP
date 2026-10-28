package ky2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import gb1.AbstractC15673b0;
import h02.C16576i;
import hy2.AbstractC17810a;
import iz0.AbstractC21048g;
import iz0.C21054m;
import js2.C21930h;
import kz2.AbstractC22927d;
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
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31920i;
import q83.AbstractC30060g;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ky2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lky2/g$a$a;", "viewState", "Lkotlin/Function1;", "Lhy2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "f", "(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22893b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r15v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r19v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
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
    /* JADX INFO: renamed from: f */
    public static final void m66539f(InterfaceC22898g.a.C41939a c41939a, Function1 function1, Function1 onNavEvent, Composer composer, int i13) {
        Function1 function2;
        ?? r15;
        Object obj;
        C0209i c0209i;
        C28676v0 c28676v0;
        ?? r10;
        C0213j c0213j;
        Object obj2;
        C28676v0 c28676v1;
        InterfaceC22898g.a.C41939a viewState = c41939a;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1654041410);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            TextResource textResourceM66589l = c41939a.getToolbarTitle();
            TextResource textResourceM66588k = c41939a.getToolbarSubTitle();
            int i15 = i14 & 896;
            boolean z4 = i15 == 256;
            Object objM87133R = c28655q.m87133R();
            boolean z13 = z4;
            C28676v0 c28676v2 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v2) {
                C22892a c22892a = new C22892a(onNavEvent, 0);
                c28655q.m87172p0(c22892a);
                obj = c22892a;
            } else {
                obj = objM87133R;
            }
            int i16 = TextResource.$stable;
            AbstractC22897f.m66575c(textResourceM66589l, textResourceM66588k, (InterfaceC4339a) obj, c28655q, i16 | (i16 << 3));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14), C2299e.f9105H), 0.0f, f14, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String strM66583f = c41939a.getContent();
            if (strM66583f == null) {
                c28655q.m87150e0(-1969228990);
                c28655q.m87173q(false);
                r10 = 0;
                c0209i = c0209i2;
                c28676v0 = c28676v2;
                c0213j = c0213j2;
            } else {
                c28655q.m87150e0(-1969228989);
                float f15 = 2 * f13;
                c0209i = c0209i2;
                c28676v0 = c28676v2;
                r10 = 0;
                c0213j = c0213j2;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM66583f, c28655q, 0), AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f15, f14, f15, f15), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 500);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, r10);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            c28655q.m87150e0(-2119366745);
            ?? r16 = c28655q;
            for (C22900i c22900i : c41939a.m66585h()) {
                TextResource textResourceM66625b = c22900i.getText();
                boolean zContains = c41939a.m66587j().contains(c22900i.getKey());
                ?? r14 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125430y = r14.m121949b(r16, i17).getBrandWhite();
                AbstractC33088k.g gVar = new AbstractC33088k.g(r14.m121952e(r16, i17).getB1(), null, 2, false ? 1 : 0);
                Modifier modifierM34565N = AbstractC12350b.m34565N(1.4f, c2314t);
                C2314t c2314t2 = c2314t;
                boolean z14 = ((((i14 & 112) == 32 ? 1 : r10) | (r16.m87157i(c41939a) ? 1 : 0)) == true ? 1 : 0) | (r16.m87157i(c22900i) ? 1 : 0);
                Object objM87133R2 = r16.m87133R();
                if (z14) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                    }
                    c28676v0 = c28676v1;
                    ?? r19 = r16;
                    AbstractC33087j.m104824f(textResourceM66625b, gVar, zContains, false, 1, jM125430y, modifierM34565N, null, false, 0L, (Function1) objM87133R2, r19, 1597440 | TextResource.$stable | (AbstractC33088k.g.f137992d << 3), 0, 904);
                    c2314t = c2314t2;
                    r16 = r19;
                }
                objM87133R2 = new C21930h(function1, c41939a, c22900i, 5);
                r16.m87172p0(objM87133R2);
                c28676v0 = c28676v1;
                ?? r110 = r16;
                AbstractC33087j.m104824f(textResourceM66625b, gVar, zContains, false, 1, jM125430y, modifierM34565N, null, false, 0L, (Function1) objM87133R2, r110, 1597440 | TextResource.$stable | (AbstractC33088k.g.f137992d << 3), 0, 904);
                c2314t = c2314t2;
                r16 = r110;
            }
            viewState = c41939a;
            onViewEvent = function1;
            C28676v0 c28676v3 = c28676v0;
            r16.m87173q(r10);
            r16.m87173q(true);
            TextResource textResourceM66586i = viewState.getPositiveButton();
            boolean zM66590m = viewState.getIsPositiveButtonEnabled();
            ?? r17 = (i14 & 112) == 32 ? 1 : r10;
            Object objM87133R3 = r16.m87133R();
            Object obj3 = objM87133R3;
            if (r17 != 0 || objM87133R3 == c28676v3) {
                C22892a c22892a2 = new C22892a(onViewEvent, 1);
                r16.m87172p0(c22892a2);
                obj3 = c22892a2;
            }
            int i18 = TextResource.$stable;
            AbstractC31920i.m99360c(textResourceM66586i, zM66590m, null, (InterfaceC4339a) obj3, r16, i18, 4);
            if (viewState.getNegativeButton() == null) {
                r16.m87150e0(-1966978359);
                r16.m87173q(r10);
                function2 = onNavEvent;
            } else {
                r16.m87150e0(-1966978358);
                TextResource textResourceM66584g = viewState.getNegativeButton();
                ?? r18 = i15 == 256 ? 1 : r10;
                Object objM87133R4 = r16.m87133R();
                if (r18 != 0 || objM87133R4 == c28676v3) {
                    function2 = onNavEvent;
                    C22892a c22892a3 = new C22892a(function2, 2);
                    r16.m87172p0(c22892a3);
                    obj2 = c22892a3;
                } else {
                    function2 = onNavEvent;
                    obj2 = objM87133R4;
                }
                AbstractC22899h.m66621c(textResourceM66584g, (InterfaceC4339a) obj2, r16, i18);
                r16.m87173q(r10);
            }
            AbstractC2875y.m8286B(r16, true, true, true, true);
            r15 = r16;
        } else {
            function2 = onNavEvent;
            c28655q.m87138X();
            r15 = c28655q;
        }
        C28677v1 c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(i13, 24, viewState, function2, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66540g(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66541h(Function1 function1, InterfaceC22898g.a.C41939a c41939a, C22900i c22900i, boolean z4) {
        function1.invoke(new AbstractC17810a.a(c41939a.getQuestionId(), c22900i.getKey(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m66542i(Function1 function1) {
        function1.invoke(AbstractC17810a.c.f69267a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66543j(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66544k(InterfaceC22898g.a.C41939a c41939a, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m66539f(c41939a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

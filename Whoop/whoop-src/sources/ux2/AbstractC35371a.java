package ux2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import gb1.AbstractC15673b0;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21054m;
import java.util.Iterator;
import java.util.List;
import kz2.AbstractC22927d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ox2.AbstractC28456b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17903p;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p739ui0.C35015q;
import pf.AbstractC29125c;
import px2.C29608k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rx2.AbstractC31904a;
import s01.C32049e;
import uf0.C34904e;
import ut2.C35231a;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.AbstractC39281n;
import y71.C39282o;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: ux2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lux2/b;", "viewState", "Lkotlin/Function1;", "Lrx2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "k", "(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lux2/b$b;", "g", "(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35371a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
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
    /* JADX INFO: renamed from: g */
    public static final void m112242g(InterfaceC35372b.b viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        C28655q c28655q;
        C0209i c0209i;
        int i14;
        ?? r10;
        C28655q c28655q2;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1814086070);
        int i15 = (i13 & 6) == 0 ? (c28655q3.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onNavEvent) ? 256 : 128;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 131) != 130)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
            float f13 = 2;
            float f14 = 4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC22953f.m66724m(c2314t), 0.0f, f13 * f14, 1);
            TextResource textResourceM112260j = viewState.getToolbarTitle();
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM112260j, null, AbstractC38963t7.m124375e(c38072d), AbstractC8693b.m21273g(AbstractC39833e.f171717b, c28655q3, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R = c28655q3.m87133R();
            Object obj = C28635l.f115821a;
            if (z4 || objM87133R == obj) {
                objM87133R = new C34904e(onNavEvent, 3);
                c28655q3.m87172p0(objM87133R);
            }
            Object obj2 = obj;
            AbstractC6719b.m20143d(modifierM3396r, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 52);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q3, 1), 14));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM66722k);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
            float f15 = 8;
            float f16 = 1 * f15;
            float f17 = f13 * f15;
            float f18 = 6 * f14;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f18, AbstractC1102d.m3424u(f18, AbstractC1099a.m3398t(c2314t, f17, f16, f17, 0.0f, 8)));
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(viewState.getHeaderIcon(), c28655q3, 0);
            int i16 = C38072d.f163054b;
            C2305k c2305k2 = c2305k;
            C0209i c0209i6 = c0209i;
            AbstractC29125c.m88522c(abstractC26165aM88500I, "", modifierM3411h, null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q3, i16).getWhite50(), 5), c28655q3, 48, 56);
            String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, TextResource.$stable);
            long jM125430y = c38072d.m121949b(c28655q3, i16).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q3, i16).getT2();
            float f19 = ((float) 1.5d) * f15;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, f19, f17, 0.0f, 8);
            int i17 = C2886a.f11498d << 18;
            float f24 = f19;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q3, 0, i17, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(viewState.getHeaderSubtitle(), c28655q3, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, f16, f17, 0.0f, 8), c38072d.m121949b(c28655q3, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i16).getB1(), null, c28655q3, 0, i17, 196600);
            C28655q c28655q4 = c28655q3;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, ((float) 2.5d) * f15, f17, 0.0f, 8);
            int i18 = 48;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
            int iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3398t2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
            c28655q4.m87150e0(201476934);
            Iterator it = viewState.m112253c().iterator();
            C28655q c28655q5 = c28655q4;
            while (it.hasNext()) {
                C29608k c29608k = (C29608k) it.next();
                C2305k c2305k3 = c2305k2;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q5, 0);
                int iHashCode4 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, c2314t);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a2);
                } else {
                    c28655q5.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i7, c23010xM66775a3);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i8, interfaceC28653p1M87165m4);
                C0209i c0209i9 = C0217k.f732j;
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i9);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i10, modifierM118962N4);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q5, i18);
                int iHashCode5 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q5.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q5, c2314t);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a2);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i7, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q5, c0209i8, interfaceC28653p1M87165m5);
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q5, iHashCode5, c0209i9);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i10, modifierM118962N5);
                TextResource textResource = (TextResource) c29608k.getTopText().f92937w;
                int i19 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q5, i19);
                C38072d c38072d2 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                long jM125430y2 = c38072d2.m121949b(c28655q5, i24).getBrandWhite();
                C2886a c2886aM8405C = c38072d2.m121952e(c28655q5, i24).getN6();
                int i25 = C2886a.f11498d << 18;
                C28655q c28655q6 = c28655q5;
                Iterator it3 = it;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q6, 0, i25, 196602);
                float f25 = ((float) 0.5d) * f15;
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3424u(f25, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h((TextResource) c29608k.getTopText().f92938x, c28655q6, i19), null, c38072d2.m121949b(c28655q6, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q6, i24).getH5(), null, c28655q6, 0, i25, 196602);
                AbstractC18489d0.m53356B(c28655q6, true, c2314t, f25, c28655q6);
                AbstractC30795n.m94707h(c29608k.getBottomText(), null, c38072d2.m121949b(c28655q6, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q6, i24).getH5(), null, c28655q6, 0, i25, 196602);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q7);
                c2305k2 = c2305k3;
                it = it3;
                i18 = 48;
                c28655q5 = c28655q7;
            }
            c28655q5.m87173q(false);
            c28655q5.m87173q(true);
            C28655q c28655q8 = c28655q5;
            AbstractC17755i2.m50938j(AbstractC1099a.m3395q(c2314t, f17, f14 * f15), EnumC17744g.SOLID, null, null, null, 0L, 0L, null, c28655q8, 48, 252);
            String strM112254d = viewState.getDescription();
            C21054m c21054mM66688a = AbstractC22927d.m66688a(c28655q8, 0);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
            int i26 = (C21054m.f79836p << 9) | 48;
            AbstractC21048g.m58807M(strM112254d, modifierM3396r2, false, c21054mM66688a, null, 0, 0, 0, false, c28655q8, i26, 500);
            C28655q c28655q9 = c28655q8;
            if (AbstractC8693b.m21270d(viewState.getAlertDisplayTitle())) {
                c28655q9.m87150e0(-1896299500);
                i14 = 3;
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3411h(3 * f15, c2314t));
                TextResource textResourceM112252b = viewState.getAlertDisplayTitle();
                int i27 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM112252b, c28655q9, i27);
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getAlertDisplay(), c28655q9, i27);
                C38072d c38072d3 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                AbstractC28456b.m86264c(strM21274h3, strM21274h4, c38072d3.m121949b(c28655q9, i28).getRecovery(), c38072d3.m121951d().getTinyIcons().getTinyInformation(), c38072d3.m121949b(c28655q9, i28).getRecovery10(), c28655q9, 0, 0);
                r10 = 0;
                c28655q9.m87173q(false);
            } else {
                i14 = 3;
                r10 = 0;
                c28655q9.m87150e0(-1895853596);
                c28655q9.m87173q(false);
            }
            String strM112255e = viewState.getDocumentDisplay();
            if (strM112255e == null) {
                c28655q9.m87150e0(-1895804090);
                c28655q9.m87173q(r10);
                c28655q2 = c28655q9;
            } else {
                c28655q9.m87150e0(-1895804089);
                AbstractC11266d.m30469w(i14, f15, c2314t, c28655q9);
                AbstractC21048g.m58807M(strM112255e, AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), false, AbstractC22927d.m66688a(c28655q9, r10), null, 0, 0, 0, false, c28655q9, i26, 500);
                C28655q c28655q10 = c28655q9;
                c28655q10.m87173q(r10);
                c28655q2 = c28655q10;
            }
            List<C39282o> listM112256f = viewState.m112256f();
            if (listM112256f == null) {
                c28655q2.m87150e0(-1895488386);
                c28655q2.m87173q(r10);
            } else {
                c28655q2.m87150e0(-1895488385);
                for (C39282o c39282o : listM112256f) {
                    float f26 = f24;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f26, c2314t));
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
                    Object objM87133R2 = c28655q2.m87133R();
                    Object obj3 = obj2;
                    if (objM87133R2 == obj3) {
                        objM87133R2 = new C35231a(18);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC39281n.m125207c(modifierM3396r3, c39282o, (InterfaceC4339a) objM87133R2, c28655q2, (C39282o.f168987q << i14) | 390, 0);
                    f24 = f26;
                    obj2 = obj3;
                }
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, onViewEvent, (InterfaceC23459e) onNavEvent, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112243h(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m112244i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m112245j(InterfaceC35372b.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m112242g(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m112246k(InterfaceC35372b viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-846939252);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavEvent) ? 256 : 128;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (viewState.equals(InterfaceC35372b.c.f150672a)) {
            c28655q2.m87150e0(1765885182);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            if (viewState instanceof InterfaceC35372b.a) {
                c28655q.m87150e0(1766127819);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC39833e.f171727l, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171734s, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171715B, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171716a, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C35015q(3, onViewEvent, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C34904e(onNavEvent, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                int i16 = 196608 | AbstractC33208p0.b.f138467h;
                int i17 = TextResource.C8688b.f25889c;
                AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R2, null, true, false, c28655q, i16 | (i17 << 3) | (i17 << 9) | (i17 << 21), 6, 2628);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof InterfaceC35372b.b)) {
                    throw AbstractC11895b.m32003v(2135172834, c28655q, false);
                }
                c28655q.m87150e0(1766855358);
                m112242g((InterfaceC35372b.b) viewState, onViewEvent, onNavEvent, c28655q, i14 & 1022);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, onViewEvent, (InterfaceC23459e) onNavEvent, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m112247l(Function1 function1, InterfaceC35372b interfaceC35372b) {
        function1.invoke(new AbstractC31904a.a(((InterfaceC35372b.a) interfaceC35372b).getCampaignId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m112248m(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112249n(InterfaceC35372b interfaceC35372b, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m112246k(interfaceC35372b, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

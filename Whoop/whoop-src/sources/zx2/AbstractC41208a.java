package zx2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import ay2.C2156b;
import ay2.InterfaceC2155a;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import d11.C11474i;
import gb1.AbstractC15673b0;
import h51.C16934f;
import hg3.AbstractC17269i;
import hy0.AbstractC17755i2;
import hy0.EnumC17740f;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import iz0.AbstractC21048g;
import iz0.C21054m;
import j93.AbstractC21478l0;
import kz2.AbstractC22927d;
import kz2.AbstractC22929f;
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
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p239j1.AbstractC21189g;
import p239j1.C21194l;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
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
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uf0.C34905f;
import vv2.C36537c;
import wb3.AbstractC37056f;
import wx2.AbstractC37687a;
import x81.C38072d;
import y71.C39274g;
import yf1.C39516e;
import yw2.AbstractC39833e;
import zo2.C40934e;
import zr1.C41067a;

/* JADX INFO: renamed from: zx2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lay2/a;", "viewState", "Lkotlin/Function1;", "Lwx2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "s", "(Lay2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lay2/a$b;", "x", "(Lay2/a$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "l", "(Lay2/a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/y;", "q", "(Ll0/y;Lay2/a$b;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41208a {
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
    /* JADX INFO: renamed from: l */
    private static final void m133874l(InterfaceC2155a.b bVar, Function1 function1, Function1 function2, Composer composer, int i13) {
        float f13;
        C2314t c2314t;
        float f14;
        C2314t c2314t2;
        C28676v0 c28676v0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-313012703);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(bVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM6716h = bVar.getIsPullToRefresh();
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v1) {
                objM87133R = new C40934e(function1, 5);
                c28655q.m87172p0(objM87133R);
            }
            C21194l c21194lM60416V = AbstractC21478l0.m60416V(zM6716h, (InterfaceC4339a) objM87133R, 0.0f, c28655q, 0, 12);
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(c2314t3));
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t3);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            int i15 = i14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m133886x(bVar, function2, c28655q, (i15 & 14) | ((i15 >> 3) & 112));
            Modifier modifierM48893g0 = AbstractC17269i.m48893g0(c2314t3, c21194lM60416V);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM48893g0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t3), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            String strM21274h = AbstractC8693b.m21274h(bVar.getDescription(), c28655q, TextResource.$stable);
            C21054m c21054mM66688a = AbstractC22927d.m66688a(c28655q, 0);
            float f15 = 8;
            float f16 = ((float) 2.5d) * f15;
            C2314t c2314t4 = c2314t3;
            c28655q = c28655q;
            C28676v0 c28676v2 = c28676v1;
            AbstractC21048g.m58807M(strM21274h, AbstractC1099a.m3398t(c2314t3, f16, 0.0f, f16, 0.0f, 10), false, c21054mM66688a, null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
            int i16 = 3;
            if (bVar.m6715g()) {
                c28655q.m87150e0(-640446181);
                m133879q(C23016z.f90757a, bVar, c28655q, ((i15 << 3) & 112) | 6);
                c28655q.m87173q(false);
                c2314t = c2314t4;
                f13 = f16;
            } else {
                c28655q.m87150e0(-640168638);
                float f17 = 4;
                float f18 = f17 * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t4));
                c28655q.m87150e0(1364824894);
                for (C2156b c2156b : bVar.m6709a()) {
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t4));
                    C2314t c2314t5 = c2314t4;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t5, f16, 0.0f, f16, 0.0f, 10);
                    EnumC17744g enumC17744g = EnumC17744g.SOLID;
                    float f19 = f18;
                    EnumC17740f enumC17740f = EnumC17740f.LEFT;
                    TextResource textResourceM6719c = c2156b.getTitle();
                    C38072d c38072d = C38072d.f163053a;
                    int i17 = C38072d.f163054b;
                    long jM125382b1 = c38072d.m121949b(c28655q, i17).getWhite50();
                    int i18 = TextResource.$stable;
                    C28655q c28655q2 = c28655q;
                    float f24 = f17;
                    AbstractC17755i2.m50938j(modifierM3398t, enumC17744g, enumC17740f, textResourceM6719c, null, jM125382b1, 0L, null, c28655q2, (i18 << 9) | 438, 208);
                    C28655q c28655q3 = c28655q2;
                    TextResource textResourceM6718b = c2156b.getSubtitle();
                    if (textResourceM6718b == null) {
                        c28655q3.m87150e0(2099289956);
                        c28655q3.m87173q(false);
                        f14 = f16;
                        c2314t2 = c2314t5;
                    } else {
                        c28655q3.m87150e0(2099289957);
                        float f25 = f16;
                        f14 = f25;
                        c2314t2 = c2314t5;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM6718b, c28655q3, i18), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t5), f16, ((float) 0.5d) * f15, f25, 0.0f, 8), c38072d.m121949b(c28655q3, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getB5(), null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(3 * r2, c2314t2));
                    c28655q3.m87150e0(1364873197);
                    for (InterfaceC25312u interfaceC25312u : c2156b.m6717a()) {
                        float f26 = 2 * f15;
                        C2314t c2314t6 = c2314t2;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t6, f26, 0.0f, f26, 0.0f, 10);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q3, 0);
                        int iHashCode5 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3398t2);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                        C0209i c0209i5 = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                        C25307p c25307pM66697b = AbstractC22929f.m66697b();
                        int i19 = i15;
                        boolean zM87157i = c28655q3.m87157i(interfaceC25312u) | ((i19 & 896) == 256);
                        Object objM87133R2 = c28655q3.m87133R();
                        if (zM87157i) {
                            c28676v0 = c28676v2;
                        } else {
                            c28676v0 = c28676v2;
                            if (objM87133R2 == c28676v0) {
                            }
                            i15 = i19;
                            C28655q c28655q4 = c28655q3;
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b, null, (Function1) objM87133R2, c28655q4, C25307p.f99300b << 3, 4);
                            AbstractC18489d0.m53356B(c28655q4, true, c2314t6, f19, c28655q4);
                            c28676v2 = c28676v0;
                            c2314t2 = c2314t6;
                            c28655q3 = c28655q4;
                        }
                        objM87133R2 = new C34905f(interfaceC25312u, function2, 8);
                        c28655q3.m87172p0(objM87133R2);
                        i15 = i19;
                        C28655q c28655q5 = c28655q3;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b, null, (Function1) objM87133R2, c28655q5, C25307p.f99300b << 3, 4);
                        AbstractC18489d0.m53356B(c28655q5, true, c2314t6, f19, c28655q5);
                        c28676v2 = c28676v0;
                        c2314t2 = c2314t6;
                        c28655q3 = c28655q5;
                    }
                    C28655q c28655q6 = c28655q3;
                    c28655q6.m87173q(false);
                    f16 = f14;
                    f18 = f19;
                    i16 = 3;
                    c2314t4 = c2314t2;
                    f17 = f24;
                    c28655q = c28655q6;
                }
                float f27 = f17;
                int i24 = i16;
                C28655q c28655q7 = c28655q;
                f13 = f16;
                C2314t c2314t7 = c2314t4;
                C28676v0 c28676v3 = c28676v2;
                c28655q7.m87173q(false);
                InterfaceC25312u interfaceC25312uM6712d = bVar.getFooter();
                if (interfaceC25312uM6712d == null) {
                    c28655q7.m87150e0(-637454496);
                    c28655q7.m87173q(false);
                    c2314t = c2314t7;
                    c28655q = c28655q7;
                } else {
                    c28655q7.m87150e0(-637454495);
                    if (((C16934f) interfaceC25312uM6712d).m47683h().isEmpty()) {
                        c2314t = c2314t7;
                        c28655q = c28655q7;
                        c28655q.m87150e0(1452955825);
                        c28655q.m87173q(false);
                    } else {
                        c28655q7.m87150e0(1451621957);
                        AbstractC17755i2.m50938j(AbstractC1099a.m3397s(c2314t7, f13, i24 * f15, f13, f15 * f27), EnumC17744g.SOLID, null, null, null, C38072d.f163053a.m121949b(c28655q7, C38072d.f163054b).getWhite50(), 0L, null, c28655q7, 48, 220);
                        c28655q = c28655q7;
                        c2314t = c2314t7;
                        AbstractC21048g.m58807M(AbstractC8693b.m21274h(bVar.getFooterText(), c28655q, TextResource.$stable), AbstractC1099a.m3398t(c2314t7, f13, 0.0f, f13, 0.0f, 10), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                        InterfaceC25312u interfaceC25312uM6712d2 = bVar.getFooter();
                        C25307p c25307pM66697b2 = AbstractC22929f.m66697b();
                        boolean z13 = (i15 & 896) == 256;
                        Object objM87133R3 = c28655q.m87133R();
                        if (z13 || objM87133R3 == c28676v3) {
                            objM87133R3 = new C41067a(function2, 5);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312uM6712d2, c25307pM66697b2, null, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 4);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC21189g.m59424b(bVar.getIsPullToRefresh(), c21194lM60416V, AbstractC1099a.m3394p(f13, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x)), 0L, 0L, c28655q, 64);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(bVar, function1, function2, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m133875m(Function1 function1) {
        function1.invoke(AbstractC37687a.b.f161491a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m133876n(InterfaceC25312u interfaceC25312u, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.ctatile.CtaTileState");
        C9598e c9598eM30835x = ((C11474i) interfaceC25312u).getNavigationAction();
        if (c9598eM30835x != null) {
            function1.invoke(new AbstractC10840c.i(c9598eM30835x));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133877o(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof ArticleTileModelEvent.Url) {
            function1.invoke(new AbstractC10840c.h(((ArticleTileModelEvent.Url) it).getUrl()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m133878p(InterfaceC2155a.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m133874l(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m133879q(InterfaceC23013y interfaceC23013y, InterfaceC2155a.b viewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-124842334);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            long j7 = C17919x.f69634k;
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, ((C23016z) interfaceC23013y).m66779c(AbstractC1092a.m3358c(c2314t, j7, c17916v0), true, 0.4f));
            AbstractC21048g.m58807M(viewState.getEmptyText(), AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, 5 * 8, 0.0f, 2), "CampaignListEmptyMessage"), false, C21054m.m58881b(AbstractC22927d.m66688a(c28655q, 0), C23285v0.m67364b(AbstractC22927d.m66688a(c28655q, 0).getTextStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32766, null), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
            AbstractC22953f.m66715b(c28655q, ((C23016z) interfaceC23013y).m66779c(c2314t, true, 0.6f));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(interfaceC23013y, viewState, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m133880r(InterfaceC23013y interfaceC23013y, InterfaceC2155a.b bVar, int i13, Composer composer, int i14) {
        m133879q(interfaceC23013y, bVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX INFO: renamed from: s */
    public static final void m133881s(InterfaceC2155a viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Function1 function1;
        int i15;
        C28676v0 c28676v0;
        ?? r10;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(101254542);
        int i16 = 2;
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
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zEquals = viewState.equals(InterfaceC2155a.c.f8569a);
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zEquals) {
                c28655q2.m87150e0(1407252796);
                c28676v0 = c28676v1;
                r10 = 0;
                i15 = i14;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q2;
                c28655q.m87173q(false);
                function1 = onNavEvent;
            } else {
                int i17 = i14;
                c28655q = c28655q2;
                i15 = i17;
                boolean z4 = false;
                if (viewState.equals(InterfaceC2155a.a.f8561a)) {
                    c28655q.m87150e0(1407481080);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC39833e.f171727l, null, i16, false ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171729n, false ? 1 : 0, i16, false ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171715B, false ? 1 : 0, i16, false ? 1 : 0);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171716a, false ? 1 : 0, i16, false ? 1 : 0);
                    boolean z13 = (i15 & 112) == 32;
                    Object objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v1) {
                        objM87133R = new C40934e(onViewEvent, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    boolean z14 = (i15 & 896) == 256;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v1) {
                        objM87133R2 = new C40934e(onNavEvent, 3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i18 = 196608 | AbstractC33208p0.b.f138467h;
                    int i19 = TextResource.C8688b.f25889c;
                    c28676v0 = c28676v1;
                    function1 = onNavEvent;
                    AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R2, null, true, false, c28655q, i18 | (i19 << 3) | (i19 << 9) | (i19 << 21), 6, 2628);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    r10 = z4;
                } else {
                    c28676v0 = c28676v1;
                    function1 = onNavEvent;
                    if (!(viewState instanceof InterfaceC2155a.b)) {
                        throw AbstractC11895b.m32003v(-1478626338, c28655q, false);
                    }
                    c28655q.m87150e0(-1478595437);
                    m133874l((InterfaceC2155a.b) viewState, onViewEvent, function1, c28655q, i15 & 1022);
                    c28655q.m87173q(false);
                    r10 = z4;
                }
            }
            ?? r14 = (i15 & 896) == 256 ? 1 : r10;
            Object objM87133R3 = c28655q.m87133R();
            if (r14 != 0 || objM87133R3 == c28676v0) {
                objM87133R3 = new C40934e(function1, 4);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, r10, c28655q, r10, 1);
        } else {
            c28655q = c28655q2;
            function1 = onNavEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(viewState, onViewEvent, function1, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133882t(Function1 function1) {
        function1.invoke(AbstractC37687a.a.f161490a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m133883u(Function1 function1) {
        function1.invoke(AbstractC10840c.b.f33257a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m133884v(Function1 function1) {
        function1.invoke(AbstractC10840c.b.f33257a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m133885w(InterfaceC2155a interfaceC2155a, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m133881s(interfaceC2155a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    private static final void m133886x(InterfaceC2155a.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(121630803);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC22953f.m66724m(C2314t.f9131w), 1 * f13, 2 * f13);
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getTitle(), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), new TextResource.C8688b(AbstractC39833e.f171716a, null, i15, 0 == true ? 1 : 0)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C40934e(function1, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3395q, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(bVar, function1, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m133887y(Function1 function1) {
        function1.invoke(AbstractC10840c.b.f33257a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m133888z(InterfaceC2155a.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m133886x(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

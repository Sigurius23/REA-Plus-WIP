package zy2;

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
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import d11.AbstractC11471f;
import d11.C11474i;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import hy0.EnumC17740f;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import iz0.AbstractC21048g;
import iz0.C21054m;
import kz2.AbstractC22927d;
import kz2.AbstractC22929f;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
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
import wb3.AbstractC37056f;
import wy2.AbstractC37698a;
import x81.C38072d;
import y71.C39274g;
import yo1.C39689b;
import yw2.AbstractC39833e;
import zi1.C40674e0;
import zo2.C40934e;

/* JADX INFO: renamed from: zy2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzy2/f;", "viewState", "Lkotlin/Function1;", "Lwy2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "q", "(Lzy2/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lzy2/f$b;", "m", "(Lzy2/f$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "j", "(Lzy2/f$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41231d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private static final void m133931j(InterfaceC41233f.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-80474462);
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
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getToolbarTitle(), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), new TextResource.C8688b(AbstractC39833e.f171716a, null, i15, 0 == true ? 1 : 0)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C40934e(function1, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3395q, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C41230c(bVar, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m133932k(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m133933l(InterfaceC41233f.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m133931j(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: m */
    private static final void m133934m(InterfaceC41233f.b bVar, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2;
        C2314t c2314t;
        float f13;
        float f14;
        C28655q c28655q3;
        C28655q c28655q4;
        boolean z4;
        C2314t c2314t2;
        Object obj;
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-451846377);
        int i14 = (i13 & 6) == 0 ? (c28655q5.m87157i(bVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 384) == 0) {
            i14 |= c28655q5.m87157i(function2) ? 256 : 128;
        }
        if (c28655q5.m87135U(i14 & 1, (i14 & 131) != 130)) {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(c2314t3));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t3);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3407d);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N2);
            m133931j(bVar, function2, c28655q5, (i14 & 14) | ((i14 >> 3) & 112));
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t3), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
            int iHashCode3 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM92116f0);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
            String strM21274h = AbstractC8693b.m21274h(bVar.getTitle(), c28655q5, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q5, i15).getT2();
            long jM125430y = c38072d.m121949b(c28655q5, i15).getBrandWhite();
            float f15 = 8;
            float f16 = ((float) 2.5d) * f15;
            C2314t c2314t4 = c2314t3;
            float f17 = f16;
            boolean z13 = false;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(c2314t3, f16, 0.0f, f16, 0.0f, 10), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q5, 48, C2886a.f11498d << 18, 196600);
            C28655q c28655q6 = c28655q5;
            if (bVar.getBody() == null) {
                c28655q6.m87150e0(1925472449);
                c28655q6.m87173q(false);
                c28655q2 = c28655q6;
            } else {
                c28655q6.m87150e0(1925472450);
                float f18 = 4;
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3411h(f18 * f18, c2314t4));
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(bVar.getBody(), c28655q6, 0), AbstractC1099a.m3398t(c2314t4, f17, 0.0f, f17, 0.0f, 10), false, AbstractC22927d.m66688a(c28655q6, 0), null, 0, 0, 0, false, c28655q6, (C21054m.f79836p << 9) | 48, 500);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            c28655q2.m87150e0(1724695776);
            C28655q c28655q8 = c28655q2;
            for (C41232e c41232e : bVar.m133949b()) {
                float f19 = 4;
                float f24 = f19 * f19;
                AbstractC22953f.m66715b(c28655q8, AbstractC1102d.m3411h(f24, c2314t4));
                TextResource textResourceM133946d = c41232e.getTitle();
                if (textResourceM133946d == null) {
                    c28655q8.m87150e0(1334698479);
                    c28655q8.m87173q(z13);
                    f13 = f19;
                    c2314t = c2314t4;
                    f14 = f24;
                    c28655q3 = c28655q8;
                } else {
                    c28655q8.m87150e0(1334698480);
                    C2314t c2314t5 = c2314t4;
                    C28655q c28655q9 = c28655q8;
                    c2314t = c2314t5;
                    f13 = f19;
                    f14 = f24;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t5, f17, 0.0f, f17, 0.0f, 10), EnumC17744g.SOLID, EnumC17740f.LEFT, textResourceM133946d, null, C38072d.f163053a.m121949b(c28655q8, C38072d.f163054b).getWhite50(), 0L, null, c28655q9, (TextResource.$stable << 9) | 438, 208);
                    C28655q c28655q10 = c28655q9;
                    c28655q10.m87173q(z13);
                    c28655q3 = c28655q10;
                }
                TextResource textResourceM133945c = c41232e.getSubtitle();
                if (textResourceM133945c == null) {
                    c28655q3.m87150e0(1335290424);
                    c28655q3.m87173q(z13);
                    c28655q4 = c28655q3;
                } else {
                    c28655q3.m87150e0(1335290425);
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM133945c, c28655q3, TextResource.$stable);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i16 = C38072d.f163054b;
                    C28655q c28655q11 = c28655q3;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, ((float) 0.5d) * f15, f17, 0.0f, 8), c38072d2.m121949b(c28655q3, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i16).getB5(), null, c28655q11, 0, C2886a.f11498d << 18, 196600);
                    C28655q c28655q12 = c28655q11;
                    c28655q12.m87173q(z13);
                    c28655q4 = c28655q12;
                }
                int i17 = 3;
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(3 * f13, c2314t));
                boolean zIsEmpty = c41232e.m133943a().isEmpty();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (!zIsEmpty || c41232e.getEmptyState() == null) {
                    int i18 = 2;
                    c28655q4.m87150e0(1337218315);
                    for (InterfaceC25312u interfaceC25312u : c41232e.m133943a()) {
                        float f25 = i18 * f15;
                        int i19 = i18;
                        C2314t c2314t6 = c2314t;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t6, f25, 0.0f, f25, 0.0f, 10);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q4, 0);
                        int iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j2 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
                        C0209i c0209i5 = C0217k.f732j;
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
                        C25307p c25307pM66697b = AbstractC22929f.m66697b();
                        boolean zM87157i = c28655q4.m87157i(interfaceC25312u) | ((i14 & 896) == 256);
                        Object objM87133R = c28655q4.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C34905f(interfaceC25312u, function2, 9);
                            c28655q4.m87172p0(objM87133R);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b, null, (Function1) objM87133R, c28655q4, C25307p.f99300b << i17, 4);
                        AbstractC18489d0.m53356B(c28655q4, true, c2314t6, f14, c28655q4);
                        i17 = i17;
                        c2314t = c2314t6;
                        c28676v0 = c28676v0;
                        i18 = i19;
                    }
                    z4 = false;
                    c2314t2 = c2314t;
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(1336114622);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
                    C11474i c11474i = new C11474i(null, null, null, c41232e.getEmptyState().getTitle(), c41232e.getEmptyState().getBody(), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), null, 2, false ? 1 : 0), null, c41232e.getEmptyState().getImage(), null, null, false, false, null, null, null, false, false, null, null, p712j91.Function1.m60318a(C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4280954936L))), new C23465k(Float.valueOf(0.7f), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4280954936L)))), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4280954936L))))}, 0.0f, 0.0f, 14)), null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 535756327, null);
                    Object objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        obj = objM87133R2;
                        C40674e0 c40674e0 = new C40674e0(19);
                        c28655q4.m87172p0(c40674e0);
                        obj = c40674e0;
                    }
                    obj = objM87133R2;
                    AbstractC11471f.m30786k(c11474i, modifierM3396r, null, (InterfaceC4339a) obj, c28655q4, C11474i.f36854E | 3120, 4);
                    c28655q4.m87173q(false);
                    z4 = false;
                    c2314t2 = c2314t;
                }
                z13 = z4;
                c2314t4 = c2314t2;
                f15 = f15;
                c28655q8 = c28655q4;
            }
            AbstractC2875y.m8286B(c28655q8, z13, true, true, true);
            c28655q = c28655q8;
        } else {
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C41229b(bVar, function1, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m133935n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133936o(InterfaceC25312u interfaceC25312u, Function1 function1, Object it) {
        C9598e c9598eM30835x;
        AbstractC22676k.m65750j(it, "it");
        C11474i c11474i = interfaceC25312u instanceof C11474i ? (C11474i) interfaceC25312u : null;
        if (c11474i != null && (c9598eM30835x = c11474i.getNavigationAction()) != null) {
            function1.invoke(new AbstractC10840c.i(c9598eM30835x));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m133937p(InterfaceC41233f.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m133934m(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX INFO: renamed from: q */
    public static final void m133938q(InterfaceC41233f viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
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
        c28655q2.m87154g0(-163096306);
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
            boolean zEquals = viewState.equals(InterfaceC41233f.c.f177930a);
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zEquals) {
                c28655q2.m87150e0(-1193782596);
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
                if (viewState instanceof InterfaceC41233f.a) {
                    c28655q.m87150e0(-1193546035);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC39833e.f171727l, null, i16, false ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171729n, false ? 1 : 0, i16, false ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171715B, false ? 1 : 0, i16, false ? 1 : 0);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171716a, false ? 1 : 0, i16, false ? 1 : 0);
                    boolean z13 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) | ((i15 & 112) == 32);
                    Object objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v1) {
                        objM87133R = new C39689b(29, onViewEvent, viewState);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    boolean z14 = (i15 & 896) == 256;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v1) {
                        objM87133R2 = new C40934e(onNavEvent, 7);
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
                    if (!(viewState instanceof InterfaceC41233f.b)) {
                        throw AbstractC11895b.m32003v(-2116720220, c28655q, false);
                    }
                    c28655q.m87150e0(-2116689319);
                    m133934m((InterfaceC41233f.b) viewState, onViewEvent, function1, c28655q, i15 & 1022);
                    c28655q.m87173q(false);
                    r10 = z4;
                }
            }
            ?? r14 = (i15 & 896) == 256 ? 1 : r10;
            Object objM87133R3 = c28655q.m87133R();
            if (r14 != 0 || objM87133R3 == c28676v0) {
                objM87133R3 = new C40934e(function1, 8);
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
            c28677v1M87180u.f115982d = new C41229b(viewState, onViewEvent, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m133939r(Function1 function1, InterfaceC41233f interfaceC41233f) {
        function1.invoke(new AbstractC37698a.a(((InterfaceC41233f.a) interfaceC41233f).getCampaignFilter()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m133940s(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133941t(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m133942u(InterfaceC41233f interfaceC41233f, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m133938q(interfaceC41233f, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

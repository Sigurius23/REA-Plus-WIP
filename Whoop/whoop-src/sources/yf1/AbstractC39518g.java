package yf1;

import a80.C0545i;
import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.Iterator;
import java.util.WeakHashMap;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import uf0.C34905f;
import vv2.C36538d;
import w01.C36681f;
import wb3.AbstractC37056f;
import wf1.C37245c;
import wf1.InterfaceC37243a;
import x30.C37900j1;
import x81.C38072d;
import yb1.C39389a;

/* JADX INFO: renamed from: yf1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lwf1/c$d;", "viewState", "Lkotlin/Function1;", "Lwf1/a;", "Ll83/a0;", "onEvent", "k", "(Lwf1/c$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "s", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feedback-survey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39518g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
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
    /* JADX INFO: renamed from: k */
    public static final void m126206k(C37245c.d viewState, Function1 onEvent, Composer composer, int i13) {
        ?? r10;
        C28655q c28655q;
        C28655q c28655q2;
        boolean z4;
        int i14;
        C28676v0 c28676v0;
        C28655q c28655q3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1261147186);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q4.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM66720i);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
            TextResource textResourceM21278l = viewState.getDisplayRefreshingAnimation() ? AbstractC8693b.m21278l("") : viewState.getToolbarTitle();
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, AbstractC13673n.m38561h(c38072d), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            int i16 = i15 & 112;
            boolean z13 = i16 == 32;
            Object objM87133R = c28655q4.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v1) {
                objM87133R = new C36681f(onEvent, 29);
                c28655q4.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q4, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C39513b.f169934a.m126176c(), c28655q4, 224640, 2);
            c28655q4.m87173q(true);
            float f15 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15674c.m44089m(c2314t, 0.0f, 1, null), f15, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, f15, 1);
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i = c28655q4.m87157i(viewState) | (i16 == 32);
            Object objM87133R2 = c28655q4.m87133R();
            int i17 = 9;
            if (zM87157i || objM87133R2 == c28676v1) {
                objM87133R2 = new C37900j1(i17, viewState, onEvent);
                c28655q4.m87172p0(objM87133R2);
            }
            int i18 = i16;
            C28676v0 c28676v2 = c28676v1;
            AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3379a, null, c2305k, null, false, null, (Function1) objM87133R2, c28655q4, 196992, 474);
            C28655q c28655q5 = c28655q4;
            C37245c.e eVarM119380c = viewState.getStickyArea();
            if (eVarM119380c == null) {
                c28655q5.m87150e0(23878314);
                c28655q5.m87173q(false);
                z4 = true;
                c28655q3 = c28655q5;
            } else {
                c28655q5.m87150e0(23878315);
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f15, f14, f15, f15);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                Modifier modifierM66727p = AbstractC22953f.m66727p(modifierM3397s, C22949e.m66712e(c28655q5).f90558e);
                C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 1.5d, f13, c2305k, c28655q5, 54);
                int iHashCode3 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM66727p);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
                String strM119383b = eVarM119380c.getText();
                if (strM119383b == null) {
                    c28655q5.m87150e0(807618186);
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                } else {
                    c28655q5.m87150e0(807618187);
                    String strM21275i = AbstractC8693b.m21275i(strM119383b, c28655q5, 0);
                    C21053l c21053l = C21053l.f79834a;
                    int i19 = C38072d.f163054b;
                    AbstractC21048g.m58807M(strM21275i, null, false, c21053l.m58880a(AbstractC33745d.m106661t(c38072d, c28655q5, i19), c38072d.m121949b(c28655q5, i19).getWhite50(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q5, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q5, C21054m.f79836p << 9, 502);
                    C28655q c28655q6 = c28655q5;
                    c28655q6.m87173q(false);
                    c28655q2 = c28655q6;
                }
                c28655q2.m87150e0(-528124892);
                for (InterfaceC25312u interfaceC25312u : eVarM119380c.m119382a()) {
                    if (interfaceC25312u instanceof C27256h) {
                        c28655q2.m87150e0(1289791999);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C27256h c27256h = (C27256h) interfaceC25312u;
                        i14 = i18;
                        boolean zM87157i2 = c28655q2.m87157i(interfaceC25312u) | (i14 == 32);
                        Object objM87133R3 = c28655q2.m87133R();
                        c28676v0 = c28676v2;
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C0545i(onEvent, c27256h, 14);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) objM87133R3, c28655q2, 6, 4);
                        c28655q2.m87173q(false);
                    } else {
                        i14 = i18;
                        c28676v0 = c28676v2;
                        c28655q2.m87150e0(1290198626);
                        boolean zM87157i3 = c28655q2.m87157i(interfaceC25312u) | (i14 == 32);
                        Object objM87133R4 = c28655q2.m87133R();
                        if (zM87157i3 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C34905f(onEvent, interfaceC25312u, 4);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R4, c28655q2, 0, 6);
                        c28655q2.m87173q(false);
                    }
                    i18 = i14;
                    c28676v2 = c28676v0;
                }
                z4 = true;
                AbstractC25012a.m73392y(c28655q2, false, true, false);
                c28655q3 = c28655q2;
            }
            c28655q3.m87173q(z4);
            r10 = z4;
            c28655q = c28655q3;
        } else {
            onEvent = onEvent;
            C28655q c28655q7 = c28655q4;
            r10 = 1;
            c28655q7.m87138X();
            c28655q = c28655q7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(viewState, onEvent, i13, r10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126207l(Function1 function1) {
        function1.invoke(InterfaceC37243a.f.f159304a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m126208m(C37245c.d dVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = dVar.m119379b().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C36538d(12, (C37245c.a) it.next(), function1), true, -772806102), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m126209n(C37245c.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        C2314t c2314t;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(362679912);
            Iterator<T> it = aVar.m119372b().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2314t = C2314t.f9131w;
                if (!zHasNext) {
                    break;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) it.next();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C34905f(function1, interfaceC25312u, 5);
                    c28655q.m87172p0(objM87133R);
                }
                m126214s(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                float f13 = 4;
                AbstractC11266d.m30469w(f13, f13, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getInsetBottom().getSpacing(), c2314t));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m126210o(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC37243a.g(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m126211p(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC37243a.g(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m126212q(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC37243a.g(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m126213r(C37245c.d dVar, Function1 function1, int i13, Composer composer, int i14) {
        m126206k(dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m126214s(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-794515914);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39389a(8);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39389a(9);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m126215t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m126216u(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m126217v(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126214s(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

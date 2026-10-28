package lf0;

import a71.C0520a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b30.C2476a1;
import b61.AbstractC2756k;
import b91.C2886a;
import b91.EnumC2888c;
import bm2.C3424a0;
import bm2.C3474t;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import hy0.C17731c2;
import hy0.C17750h1;
import i11.AbstractC17862e;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js2.C21927e;
import k71.C22246d;
import kl2.C22571f;
import l72.C23401h;
import l72.C23407n;
import l80.C23434k;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n21.AbstractC26194h;
import n21.C26191e;
import n21.EnumC26195i;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p708hb2.C17093a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.t */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aa\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\"\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a-\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b(\u0010)\u001a7\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010*2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010*H\u0000¢\u0006\u0004\b-\u0010.\u001a%\u00102\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00101\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b2\u00103¨\u00064²\u0006\u000e\u0010$\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010&\u001a\u0004\u0018\u00010%8\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010*8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00100\u001a\u0004\u0018\u00010/8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/u;", "state", "Lkotlin/Function1;", "Llf0/r;", "Ll83/a0;", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Llf0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "K", "(Llf0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Ld61/a;", "onDataScrubEvent", "G", "(Llf0/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", NotificationCompat.CATEGORY_EVENT, "La71/a;", "onApplyScrubbedDetails", "", "onSetScrubbing", "Lkotlin/Function0;", "onResetScrubbedState", "N", "(Ld61/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V", "Ln21/e;", "legendState", "Lk71/d;", "O", "(Ln21/e;)Lk71/d;", "Llf0/q;", "scrubbedMetrics", "originalMetrics", "R", "(Llf0/q;Llf0/q;)Llf0/q;", "isScrubbing", "Lhy0/h1;", "scrubbedPhaseTag", "basePhaseTag", "S", "(ZLhy0/h1;Lhy0/h1;)Lhy0/h1;", "", "scrubbedLegends", "originalLegends", "Q", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lc41/p2;", "scrubbedInfoCallout", "baseInfoCallout", "P", "(Lc41/p2;Lc41/p2;)Lc41/p2;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23970t {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m70645A(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new AbstractC23962r.b(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m70646B(Modifier modifier, C23973u c23973u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70677n(modifier, c23973u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final C23958q m70647C(InterfaceC28601c1 interfaceC28601c1) {
        return (C23958q) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m70648D(InterfaceC28601c1 interfaceC28601c1, C23958q c23958q) {
        interfaceC28601c1.setValue(c23958q);
    }

    /* JADX INFO: renamed from: E */
    private static final C17750h1 m70649E(InterfaceC28601c1 interfaceC28601c1) {
        return (C17750h1) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m70650F(InterfaceC28601c1 interfaceC28601c1, C17750h1 c17750h1) {
        interfaceC28601c1.setValue(c17750h1);
    }

    /* JADX INFO: renamed from: G */
    private static final void m70651G(C23973u c23973u, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1239236730);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c23973u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c23973u.m70723i() == null) {
                c28655q.m87150e0(908256057);
                c28655q.m87173q(false);
                z4 = false;
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(908256058);
                float f13 = 4;
                float f14 = 2 * f13;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t2), AbstractC33253j.m105489e(f14)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack50(), AbstractC17918w0.f69621a), 3 * f13, f14);
                c28655q = c28655q;
                c2314t = c2314t2;
                z4 = false;
                AbstractC22960g2.m66729a(modifierM3395q, null, null, null, 0, 0, AbstractC37817c.m121344e(-689218234, c28655q, new C2476a1(c23973u, 25)), c28655q, 1572864, 62);
                c28655q.m87173q(false);
            }
            C21395c graph = c23973u.getGraph();
            if (graph == null) {
                c28655q.m87150e0(909073062);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(909073063);
                float f15 = 4;
                AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q);
                Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), z4, 1.3333334f);
                boolean z13 = ((i14 & 112) == 32 ? true : z4) | ((i14 & 896) == 256 ? true : z4);
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C2777c(function2, 10, function1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC2756k.m7799p(modifierM3384f, graph, null, null, false, null, (Function1) objM87133R, c28655q, (C21395c.f81985e << 3) | 6, 60);
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(c23973u, function1, function2, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m70652H(C23973u c23973u, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        C17919x c17919xM31989h;
        long jM125385c1;
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (C22246d c22246d : c23973u.m70723i()) {
                TextResource textResourceM63807c = c22246d.getLegendText();
                AbstractC18247a abstractC18247aM63806b = c22246d.getLegendColor();
                EnumC26195i enumC26195iM63809e = c22246d.getShape();
                EnumC16313m0 enumC16313m0M63805a = c22246d.getIcon();
                EnumC2888c enumC2888c = EnumC2888c.B3;
                AbstractC18247a abstractC18247aM63808d = c22246d.getLegendTextColor();
                if (abstractC18247aM63808d == null) {
                    c28655q.m87150e0(1972669065);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(-2014575496);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, AbstractC18249c.m52573k(abstractC18247aM63808d, c28655q, AbstractC18247a.f71043a));
                }
                if (c17919xM31989h == null) {
                    c28655q.m87150e0(-2014574568);
                    jM125385c1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite70();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2014576211);
                    c28655q.m87173q(false);
                    jM125385c1 = c17919xM31989h.f69639a;
                }
                AbstractC26194h.m77780n(null, abstractC18247aM63806b, textResourceM63807c, enumC26195iM63809e, enumC16313m0M63805a, jM125385c1, null, enumC2888c, c28655q, (AbstractC18247a.f71043a << 3) | 12582912 | (TextResource.$stable << 6), 65);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m70653I(Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC11732a) {
            function1.invoke(event);
        } else {
            function2.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m70654J(C23973u c23973u, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m70651G(c23973u, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
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
    /* JADX INFO: renamed from: K */
    private static final void m70655K(C23973u c23973u, Function1 function1, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        C0209i c0209i;
        int i15;
        float f13;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0213j c0213j;
        C0209i c0209i5;
        boolean z4;
        function1 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-276611614);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c23973u) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f14 = 4;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f14);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m);
            C0209i c0209i8 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i8);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2306l c2306l = C2299e.f9109L;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i8);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N3);
            TextResource textResourceM70604c = c23973u.getMetrics().getSupertitle();
            if (textResourceM70604c == null) {
                c28655q.m87150e0(-2018350511);
                c28655q.m87173q(false);
                c0209i3 = c0209i7;
                c0209i2 = c0209i6;
                c0209i = c0209i9;
                c0209i4 = c0209i8;
                c2314t = c2314t2;
                f13 = f14;
                i15 = 1;
            } else {
                c28655q.m87150e0(-2018350510);
                String strM21274h = AbstractC8693b.m21274h(textResourceM70604c, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                c2314t = c2314t2;
                c0209i = c0209i9;
                i15 = 1;
                f13 = f14;
                c0209i2 = c0209i6;
                c0209i3 = c0209i7;
                c0209i4 = c0209i8;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getSh5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(i15, f13, c2306l, c28655q, 54);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            C2314t c2314t3 = c2314t;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            C0209i c0209i10 = c0209i2;
            AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M53376q);
            C0209i c0209i11 = c0209i3;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i5 = c0209i4;
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            } else {
                c0209i5 = c0209i4;
            }
            C0209i c0209i12 = c0209i;
            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N4);
            TextResource textResourceM70603b = c23973u.getMetrics().getMetricValue();
            int i18 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM70603b, c28655q, i18);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a c2886aM8444y = c38072d2.m121952e(c28655q, i19).getN4();
            long jM125430y = c38072d2.m121949b(c28655q, i19).getBrandWhite();
            int i24 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            C0213j c0213j3 = c0213j;
            C0209i c0209i13 = c0209i5;
            float f15 = f13;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8444y, null, c28655q2, 0, i24, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c23973u.getMetrics().getMetricUnits(), c28655q2, i18), null, c38072d2.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getB1(), null, c28655q2, 0, i24, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (c23973u.getDatePicker() == null) {
                c28655q.m87150e0(-2102618120);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(-2102618119);
                Modifier modifierM3424u = AbstractC1102d.m3424u(45 * f15, c2314t3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m5);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i13);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N5);
                boolean isDateSelectorLoading = c23973u.getIsDateSelectorLoading();
                TextResource textResourceM51373m = c23973u.getDatePicker().getText();
                boolean zM51365e = c23973u.getDatePicker().getBackButtonEnabled();
                boolean zM51368h = c23973u.getDatePicker().getForwardButtonEnabled();
                String strM51366f = c23973u.getDatePicker().getBackDate();
                String strM51369i = c23973u.getDatePicker().getForwardDate();
                boolean z13 = (i16 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C23434k(function1, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC17862e.m51358q(null, isDateSelectorLoading, null, textResourceM51373m, zM51365e, zM51368h, strM51366f, strM51369i, null, null, null, null, (Function1) objM87133R, c28655q, i18 << 9, 0, 3845);
                c28655q = c28655q;
                z4 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c23973u, function1, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m70656L(Function1 function1, Object dateToken) {
        AbstractC22676k.m65750j(dateToken, "dateToken");
        if (dateToken instanceof String) {
            function1.invoke(new AbstractC23962r.a((String) dateToken));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m70657M(C23973u c23973u, Function1 function1, int i13, Composer composer, int i14) {
        m70655K(c23973u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    public static final void m70658N(InterfaceC11732a event, Function1 onViewEvent, Function1 onApplyScrubbedDetails, Function1 onSetScrubbing, InterfaceC4339a onResetScrubbedState) {
        List<C0520a> listMo30408a;
        List<C0520a> listMo30408a2;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onApplyScrubbedDetails, "onApplyScrubbedDetails");
        AbstractC22676k.m65750j(onSetScrubbing, "onSetScrubbing");
        AbstractC22676k.m65750j(onResetScrubbedState, "onResetScrubbedState");
        C0520a c0520a = null;
        if (event instanceof InterfaceC11732a.c) {
            onSetScrubbing.invoke(Boolean.TRUE);
            onViewEvent.invoke(AbstractC23962r.d.f94641a);
            AbstractC11258s abstractC11258s = (AbstractC11258s) AbstractC25265s.m74098G0(((InterfaceC11732a.c) event).mo31360b().values());
            if (abstractC11258s != null && (listMo30408a2 = abstractC11258s.mo30408a()) != null) {
                c0520a = (C0520a) AbstractC25265s.m74100H0(listMo30408a2);
            }
            if (c0520a != null) {
                onApplyScrubbedDetails.invoke(c0520a);
                return;
            }
            return;
        }
        if (!(event instanceof InterfaceC11732a.a)) {
            if (!(event instanceof InterfaceC11732a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            onResetScrubbedState.invoke();
            return;
        }
        AbstractC11258s abstractC11258s2 = (AbstractC11258s) AbstractC25265s.m74098G0(((InterfaceC11732a.a) event).mo31360b().values());
        if (abstractC11258s2 != null && (listMo30408a = abstractC11258s2.mo30408a()) != null) {
            c0520a = (C0520a) AbstractC25265s.m74100H0(listMo30408a);
        }
        if (c0520a != null) {
            onApplyScrubbedDetails.invoke(c0520a);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final C22246d m70659O(C26191e legendState) {
        AbstractC22676k.m65750j(legendState, "legendState");
        return new C22246d(legendState.getLegendColor(), legendState.getLegendText(), AbstractC18249c.m52575m(legendState.getTextColor()), legendState.getShape(), legendState.getIcon());
    }

    /* JADX INFO: renamed from: P */
    public static final C4092p2 m70660P(C4092p2 c4092p2, C4092p2 c4092p3) {
        return c4092p2 == null ? c4092p3 : c4092p2;
    }

    /* JADX INFO: renamed from: Q */
    public static final List<C22246d> m70661Q(List<C22246d> list, List<C22246d> list2) {
        return list == null ? list2 : list;
    }

    /* JADX INFO: renamed from: R */
    public static final C23958q m70662R(C23958q c23958q, C23958q originalMetrics) {
        AbstractC22676k.m65750j(originalMetrics, "originalMetrics");
        return c23958q == null ? originalMetrics : c23958q;
    }

    /* JADX INFO: renamed from: S */
    public static final C17750h1 m70663S(boolean z4, C17750h1 c17750h1, C17750h1 c17750h2) {
        return z4 ? c17750h1 : c17750h2;
    }

    /* JADX INFO: renamed from: n */
    public static final void m70677n(Modifier modifier, C23973u state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z4;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1329272369);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (i17 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            boolean zM87153g = c28655q2.m87153g(state.getGraph());
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g2 = c28655q2.m87153g(state.getGraph());
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R2;
            boolean zM87153g3 = c28655q2.m87153g(state.getGraph());
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R3;
            boolean zM87153g4 = c28655q2.m87153g(state.getGraph());
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R4;
            boolean zM87153g5 = c28655q2.m87153g(state.getGraph());
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87153g5 || objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R5;
            boolean zM87153g6 = c28655q2.m87153g(m70647C(interfaceC28601c6)) | c28655q2.m87153g(state.getMetrics());
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87153g6 || objM87133R6 == c28676v0) {
                objM87133R6 = m70662R(m70647C(interfaceC28601c6), state.getMetrics());
                c28655q2.m87172p0(objM87133R6);
            }
            C23958q c23958q = (C23958q) objM87133R6;
            boolean zM87153g7 = c28655q2.m87153g(state.getBasePhaseTag()) | c28655q2.m87153g(m70649E(interfaceC28601c7)) | c28655q2.m87155h(m70678o(interfaceC28601c5));
            Object objM87133R7 = c28655q2.m87133R();
            if (zM87153g7 || objM87133R7 == c28676v0) {
                objM87133R7 = m70663S(m70678o(interfaceC28601c5), m70649E(interfaceC28601c7), state.getBasePhaseTag());
                c28655q2.m87172p0(objM87133R7);
            }
            C17750h1 c17750h1 = (C17750h1) objM87133R7;
            boolean zM87153g8 = c28655q2.m87153g(m70679p(interfaceC28601c8)) | c28655q2.m87153g(state.m70723i());
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87153g8 || objM87133R8 == c28676v0) {
                objM87133R8 = m70661Q(m70679p(interfaceC28601c8), state.m70723i());
                c28655q2.m87172p0(objM87133R8);
            }
            List list = (List) objM87133R8;
            boolean zM87153g9 = c28655q2.m87153g(m70681r(interfaceC28601c9)) | c28655q2.m87153g(state.getBaseInfoCallout());
            Object objM87133R9 = c28655q2.m87133R();
            if (zM87153g9 || objM87133R9 == c28676v0) {
                objM87133R9 = m70660P(m70681r(interfaceC28601c9), state.getBaseInfoCallout());
                c28655q2.m87172p0(objM87133R9);
            }
            C4092p2 c4092p2 = (C4092p2) objM87133R9;
            boolean zM87153g10 = c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c9);
            Object objM87133R10 = c28655q2.m87133R();
            if (zM87153g10 || objM87133R10 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c6;
                interfaceC28601c2 = interfaceC28601c8;
                interfaceC28601c3 = interfaceC28601c9;
                interfaceC28601c4 = interfaceC28601c7;
                objM87133R10 = new C17093a(interfaceC28601c1, interfaceC28601c4, interfaceC28601c2, interfaceC28601c3, 1);
                c28655q2.m87172p0(objM87133R10);
            } else {
                interfaceC28601c1 = interfaceC28601c6;
                interfaceC28601c2 = interfaceC28601c8;
                interfaceC28601c3 = interfaceC28601c9;
                interfaceC28601c4 = interfaceC28601c7;
            }
            Function1 function1 = (Function1) objM87133R10;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
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
            Modifier modifier5 = modifier4;
            InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c1;
            InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c4;
            InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c2;
            InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c3;
            C23973u c23973uM70716b = C23973u.m70716b(state, c23958q, null, false, null, null, null, null, null, 254, null);
            int i18 = i17 & 896;
            boolean z13 = i18 == 256;
            Object objM87133R11 = c28655q2.m87133R();
            if (z13 || objM87133R11 == c28676v0) {
                objM87133R11 = new C23434k(onViewEvent, 5);
                c28655q2.m87172p0(objM87133R11);
            }
            m70655K(c23973uM70716b, (Function1) objM87133R11, c28655q2, 0);
            C23985y categoricalBiomarkerDetails = state.getCategoricalBiomarkerDetails();
            if (categoricalBiomarkerDetails == null) {
                c28655q2.m87150e0(-1045264585);
                c28655q2.m87173q(false);
                z4 = true;
            } else {
                c28655q2.m87150e0(-1045264584);
                z4 = true;
                AbstractC23982x.m70758b(null, categoricalBiomarkerDetails, c28655q2, C17731c2.f68917p << 3, 1);
                c28655q2.m87173q(false);
            }
            if (c17750h1 == null) {
                c28655q2.m87150e0(-1045173321);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1045173320);
                AbstractC17746g1.m50872h(c17750h1, null, null, c28655q2, C17750h1.f69012w, 6);
                c28655q2.m87173q(false);
            }
            boolean z14 = z4;
            C23973u c23973uM70716b2 = C23973u.m70716b(state, null, null, false, null, list, null, null, null, 239, null);
            boolean z15 = i18 == 256 ? z14 : false;
            Object objM87133R12 = c28655q2.m87133R();
            if (z15 || objM87133R12 == c28676v0) {
                objM87133R12 = new C23434k(onViewEvent, 6);
                c28655q2.m87172p0(objM87133R12);
            }
            Function1 function2 = (Function1) objM87133R12;
            boolean zM87153g11 = c28655q2.m87153g(function1) | (i18 == 256 ? z14 : false) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c10) | c28655q2.m87153g(interfaceC28601c11) | c28655q2.m87153g(interfaceC28601c12) | c28655q2.m87153g(interfaceC28601c13);
            Object objM87133R13 = c28655q2.m87133R();
            if (zM87153g11 || objM87133R13 == c28676v0) {
                C3424a0 c3424a0 = new C3424a0((Object) onViewEvent, (Object) function1, interfaceC28601c5, interfaceC28601c10, interfaceC28601c11, interfaceC28601c12, interfaceC28601c13, 9);
                c28655q2.m87172p0(c3424a0);
                objM87133R13 = c3424a0;
            }
            m70651G(c23973uM70716b2, function2, (Function1) objM87133R13, c28655q2, 0);
            if (c4092p2 == null) {
                c28655q2.m87150e0(-1044287341);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-1044287340);
                boolean z16 = i18 == 256 ? z14 : false;
                Object objM87133R14 = c28655q2.m87133R();
                if (z16 || objM87133R14 == c28676v0) {
                    objM87133R14 = new C23434k(onViewEvent, 7);
                    c28655q2.m87172p0(objM87133R14);
                }
                c28655q = c28655q2;
                AbstractC4106r2.m12647f(null, c4092p2, (Function1) objM87133R14, c28655q, C4092p2.f16593v << 3, 1);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 9, (Object) modifier3, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m70678o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    private static final List<C22246d> m70679p(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m70680q(InterfaceC28601c1 interfaceC28601c1, List<C22246d> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: renamed from: r */
    private static final C4092p2 m70681r(InterfaceC28601c1 interfaceC28601c1) {
        return (C4092p2) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m70682s(InterfaceC28601c1 interfaceC28601c1, C4092p2 c4092p2) {
        interfaceC28601c1.setValue(c4092p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70683t(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, C0520a details) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(details, "details");
        m70648D(interfaceC28601c1, new C23958q(details.getPrimaryContextualDisplay(), details.getValueDisplay(), details.getUnitDisplay()));
        m70650F(interfaceC28601c2, details.getPhaseTag());
        List<C26191e> listM1222b = details.m1222b();
        if (listM1222b != null) {
            List<C26191e> list = listM1222b;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m70659O((C26191e) it.next()));
            }
        } else {
            arrayList = null;
        }
        m70680q(interfaceC28601c3, arrayList);
        m70682s(interfaceC28601c4, details.getInfoCalloutTile());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m70684u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70685v(Function1 function1, AbstractC23962r event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70686w(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new AbstractC23962r.c(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m70687x(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC11732a event) {
        AbstractC22676k.m65750j(event, "event");
        m70658N(event, function1, function2, new C21927e(6, interfaceC28601c1), new C3474t(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m70688y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m70684u(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m70689z(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5) {
        m70684u(interfaceC28601c1, false);
        m70648D(interfaceC28601c2, null);
        m70650F(interfaceC28601c3, null);
        m70680q(interfaceC28601c4, null);
        m70682s(interfaceC28601c5, null);
        return C23454a0.f92919a;
    }
}

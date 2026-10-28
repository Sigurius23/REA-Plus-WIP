package s71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import l83.C23454a0;
import o21.AbstractC27464b;
import o21.C27465c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s32.C32112d;
import s51.C32205b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls71/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ls71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32240b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
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
    /* JADX INFO: renamed from: c */
    public static final void m100314c(Modifier modifier, C32241c viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        Modifier modifier3;
        C28655q c28655q;
        Function1 function3;
        int i16;
        C2314t c2314t;
        boolean z4;
        C28655q c28655q2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-184171156);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q3.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t2 : modifier2;
            if ((i14 & 4) != 0) {
                Object objM87133R = c28655q3.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C32112d(11);
                    c28655q3.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (AbstractC8693b.m21270d(viewState.getHeader())) {
                c28655q3.m87150e0(185770096);
                c2314t = c2314t2;
                i16 = 4;
                AbstractC17755i2.m50938j(null, null, null, viewState.getHeader(), null, 0L, 0L, null, c28655q3, 0, 247);
                z4 = 0;
                AbstractC31061c.m95650z(2, 4, c2314t, c28655q3, false);
            } else {
                i16 = 4;
                c2314t = c2314t2;
                z4 = 0;
                c28655q3.m87150e0(185894065);
                c28655q3.m87173q(false);
            }
            c28655q3.m87150e0(-1795117993);
            Iterator<T> it = viewState.m100317a().iterator();
            while (it.hasNext()) {
                AbstractC27464b.m82877d(null, (C27465c) it.next(), null, c28655q3, 0, 5);
                AbstractC18489d0.m53380u(2, i16, c2314t, c28655q3);
            }
            c28655q3.m87173q(z4);
            if (AbstractC22676k.m65745e(viewState.getMagnitudeCallout(), AbstractC8693b.m21267a())) {
                c28655q3.m87150e0(186451569);
                c28655q3.m87173q(z4);
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(186115219);
                if (viewState.m100317a().isEmpty()) {
                    c28655q3.m87150e0(186227377);
                    c28655q3.m87173q(z4);
                } else {
                    c28655q3.m87150e0(186148575);
                    AbstractC31061c.m95650z(2, i16, c2314t, c28655q3, z4);
                }
                String strM21274h = AbstractC8693b.m21274h(viewState.getMagnitudeCallout(), c28655q3, z4);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB2(), null, c28655q3, 0, 0, 196602);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(z4);
                c28655q2 = c28655q4;
            }
            c28655q2.m87173q(true);
            modifier3 = modifier4;
            function2 = function3;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            function2 = function1;
            modifier3 = modifier2;
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, viewState, function2, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m100315d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m100316e(Modifier modifier, C32241c c32241c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100314c(modifier, c32241c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

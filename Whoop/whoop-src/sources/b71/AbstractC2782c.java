package b71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az0.AbstractC2159b;
import b30.C2663y4;
import b91.C2886a;
import c71.C4282a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import k91.C22302a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C22079k;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: b71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc71/a;", "state", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lc71/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2782c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
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
    public static final void m7885c(Modifier modifier, C4282a state, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C2314t c2314t;
        ?? r10;
        int i15;
        C28655q c28655q2;
        double d3;
        C28655q c28655q3;
        Object modifier2 = modifier;
        AbstractC22676k.m65750j(modifier2, "modifier");
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-264121937);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q4.m87153g(modifier2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q4.m87153g(state) : c28655q4.m87157i(state) ? 32 : 16;
        }
        if (c28655q4.m87135U(i14 & 1, (i14 & 19) != 18)) {
            String strM21274h = AbstractC8693b.m21274h(state.getContentDescription(), c28655q4, 0);
            boolean zM21270d = AbstractC8693b.m21270d(state.getTopLabel());
            C2314t c2314t2 = C2314t.f9131w;
            if (zM21270d) {
                c28655q4.m87150e0(-76329178);
                c2314t = c2314t2;
                i15 = 6;
                r10 = 0;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getTopLabel(), c28655q4, 0), AbstractC1099a.m3398t(AbstractC29011e.m88149j(c2314t2, state.getXPercent(), ((float) (((double) state.getHeightPercent()) + ((double) state.getYPercent()))) * (-1), new C29007a(0.0f, 0.0f, false, false, 12, null)), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7), state.getTopLabelColor().mo134584toComposableColorWaAFU9c(c28655q4, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q4, 6).getN8(), null, c28655q4, 0, 3120, 185848);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            } else {
                c2314t = c2314t2;
                r10 = 0;
                i15 = 6;
                c28655q4.m87150e0(-75695693);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            if (AbstractC8693b.m21270d(state.getBotLabel())) {
                c28655q2.m87150e0(-75611838);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC29011e.m88149j(c2314t, state.getXPercent(), state.getYPercent() * (-1), new C29007a(0.0f, -1.0f, false, false, 12, null)), 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13);
                String strM21274h2 = AbstractC8693b.m21274h(state.getBotLabel(), c28655q2, r10);
                long jMo134584toComposableColorWaAFU9c = state.getBotLabelColor().mo134584toComposableColorWaAFU9c(c28655q2, r10);
                C2886a n13 = C38072d.f163053a.m121952e(c28655q2, i15).getN8();
                C28655q c28655q6 = c28655q2;
                d3 = 0.5d;
                AbstractC30795n.m94707h(strM21274h2, modifierM3398t, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, n13, null, c28655q6, 0, 3120, 185848);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(r10);
                c28655q3 = c28655q7;
            } else {
                d3 = 0.5d;
                c28655q2.m87150e0(-75036013);
                c28655q2.m87173q(r10);
                c28655q3 = c28655q2;
            }
            Modifier modifierM88144e = AbstractC29011e.m88144e(c2314t, state.getXPercent(), 0.0f, state.getWidthPercent(), 1.0f, new C29007a(0.0f, 0.0f, false, false, 12, null));
            boolean zM87153g = c28655q3.m87153g(strM21274h);
            Object objM87133R = c28655q3.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2663y4(strM21274h, 1);
                c28655q3.m87172p0(objM87133R);
            }
            Modifier modifierMo3471e = AbstractC18032n.m51775c(modifierM88144e, true, (Function1) objM87133R).mo3471e(modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, r10);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            Modifier modifierM88144e2 = AbstractC29011e.m88144e(c2314t, 0.5f, state.getYPercent() * (-1.0f), 1.0f, state.getHeightPercent(), new C29007a(0.5f, 0.0f, false, false, 12, null));
            AbstractC18247a abstractC18247aM52575m = AbstractC18249c.m52575m(state.getLineColor());
            C22302a c22302aM64093a = C22302a.INSTANCE.m64093a(((float) d3) * 4);
            modifier2 = modifier;
            AbstractC2159b.m6721b(modifierM88144e2, abstractC18247aM52575m, c22302aM64093a, c28655q3, 0, 0);
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(modifier2, state, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m7886d(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m7887e(Modifier modifier, C4282a c4282a, int i13, Composer composer, int i14) {
        m7885c(modifier, c4282a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

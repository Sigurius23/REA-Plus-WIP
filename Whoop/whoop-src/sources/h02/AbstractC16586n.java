package h02;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b30.C2476a1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d30.C11558r;
import f01.C13845b;
import f02.C13917c;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h02.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/o;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lh02/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lh02/l;", "e", "(Lh02/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "isCollapsed", "", "caretRotation", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16586n {
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
    /* JADX INFO: renamed from: e */
    private static final void m47059e(C16582l c16582l, Function1 function1, Composer composer, int i13) {
        int i14;
        C16582l c16582l2;
        String strM92103Y;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1581525967);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c16582l) : c28655q.m87157i(c16582l) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            int i16 = i15 & 14;
            boolean z4 = i16 == 4 || ((i15 & 8) != 0 && c28655q.m87153g(c16582l));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(c16582l.getIsCollapsed()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m47060f(interfaceC28601c1) ? 0.0f : 180.0f, null, "caret", null, c28655q, 3072, 22);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), f13, f14);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i17).getGreyL6(), AbstractC17918w0.f69621a);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | ((i15 & 112) == 32) | (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c16582l)));
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C11558r(function1, c16582l, interfaceC28601c1, 23);
                c28655q.m87172p0(objM87133R2);
            }
            float f15 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R2, 15), 2.5f * f15, f13 * f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f15), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c16582l.getTitle(), c28655q, TextResource.$stable);
            C2886a sh4 = c38072d.m121952e(c28655q, i17).getSh4();
            long brandBlack = c38072d.m121949b(c28655q, i17).getBrandBlack();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), brandBlack, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            Modifier modifierM5375L = AbstractC1772c1.m5375L(m47062h(interfaceC28670t2M30588b), AbstractC1102d.m3419p(f14 * f14, c2314t));
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(EnumC16313m0.CARET_DOWN.toWhoopIcon(), c28655q, 0);
            if (m47060f(interfaceC28601c1)) {
                c28655q.m87150e0(1221289294);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62371r0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1221401452);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62367q0);
                c28655q.m87173q(false);
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, modifierM5375L, c38072d.m121949b(c28655q, i17).getBrandBlack(), c28655q, 0, 0);
            c28655q.m87173q(true);
            c16582l2 = c16582l;
            AbstractC1090b.m3350e(C23016z.f90757a, !m47060f(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-2086371939, c28655q, new C2476a1(c16582l2, 17)), c28655q, 1572870, 30);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c16582l2 = c16582l;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(c16582l2, function1, i13, 13);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m47060f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m47061g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: h */
    private static final float m47062h(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47063i(Function1 function1, C16582l c16582l, InterfaceC28601c1 interfaceC28601c1) {
        boolean zM47060f = m47060f(interfaceC28601c1);
        m47061g(interfaceC28601c1, !m47060f(interfaceC28601c1));
        function1.invoke(new C16590p(c16582l.getTitle(), zM47060f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m47064j(C16582l c16582l, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        String strM21274h = AbstractC8693b.m21274h(c16582l.getAnnotatedText(), composer, TextResource.$stable);
        C21053l c21053l = C21053l.f79834a;
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        float f13 = 8;
        AbstractC21048g.m58807M(strM21274h, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f13 * 0.5f, 0.0f, 0.0f, 13), false, c21053l.m58880a(c38072d.m121952e(composer, i14).getB3().getStyle(), c38072d.m121949b(composer, i14).getBlack70(), c38072d.m121949b(composer, i14).getBlack70(), 0L, null, c38072d.m121949b(composer, i14).getBlack70(), 0, c38072d.m121949b(composer, i14).getBlack70(), null, 0L, 0.0f, 0.0f, false, false, 1 * f13, composer, 0, (C21053l.f79835b << 15) | 24576, 16216), null, 0, 0, 0, false, composer, (C21054m.f79836p << 9) | 48, 500);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47065k(C16582l c16582l, Function1 function1, int i13, Composer composer, int i14) {
        m47059e(c16582l, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m47066l(Modifier modifier, C16588o state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-578373956);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8 * 1.5f), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-360020658);
            Iterator<T> it = state.m47068a().iterator();
            while (it.hasNext()) {
                m47059e((C16582l) it.next(), onViewEvent, c28655q, TextResource.$stable | ((i15 >> 3) & 112));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 19, modifier2, onViewEvent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47067m(Modifier modifier, C16588o c16588o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47066l(modifier, c16588o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

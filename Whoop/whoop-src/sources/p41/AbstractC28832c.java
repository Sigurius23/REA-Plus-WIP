package p41;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import as1.C1949j;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gz0.EnumC16313m0;
import hb3.AbstractC17104a0;
import l83.C23454a0;
import ov2.C28402f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p163g1.AbstractC15005f3;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lp41/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lp41/d;", "l", "()Lp41/d;", "fakeToggleCardButtonState", "", "isExpanded", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28832c {

    /* JADX INFO: renamed from: a */
    private static final C28833d f116715a = new C28833d(AbstractC8693b.m21278l("SEE MORE"), AbstractC8693b.m21278l("SEE LESS"), EnumC16313m0.CARET_DOWN, EnumC16313m0.CARET_UP, null, true);

    /* JADX INFO: renamed from: e */
    public static final void m87690e(Modifier modifier, C28833d state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-175278644);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsExpanded()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C3590i(onViewEvent, interfaceC28601c1, 29);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3409f, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Boolean boolValueOf = Boolean.valueOf(m87691f(interfaceC28601c1));
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C28402f(22);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC1089a.m3344b(boolValueOf, null, (Function1) objM87133R4, null, "content_animation", null, AbstractC37817c.m121344e(-1246542349, c28655q, new C1949j(state, 7)), c28655q, 1597824, 42);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier2, state, onViewEvent, i13, i14, 11);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m87691f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m87692g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87693h(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m87692g(interfaceC28601c1, !m87691f(interfaceC28601c1));
        function1.invoke(new C28830a(m87691f(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C3756l0 m87694i(InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(200, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(200, 0, null, 6), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m87695j(C28833d c28833d, InterfaceC3764o AnimatedContent, boolean z4, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, composer, 54);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        String strM21274h = AbstractC8693b.m21274h(z4 ? c28833d.getExpandedTitle() : c28833d.getCollapsedTitle(), composer, 0);
        C38072d c38072d = C38072d.f163053a;
        AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(composer, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, 6).getBtS(), null, composer, 0, 0, 196090);
        AbstractC15005f3.m43108b(AbstractC34132o.m107874S((z4 ? c28833d.getExpandedIcon() : c28833d.getCollapsedIcon()).toWhoopIcon(), composer, 6), null, AbstractC1102d.m3419p(((float) 3.5d) * 4, c2314t), c38072d.m121949b(composer, 6).getBrandWhite(), composer, 432, 0);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87696k(Modifier modifier, C28833d c28833d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87690e(modifier, c28833d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final C28833d m87697l() {
        return f116715a;
    }
}

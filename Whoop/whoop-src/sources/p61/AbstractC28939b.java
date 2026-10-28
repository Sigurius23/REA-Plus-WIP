package p61;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bz0.AbstractC3712b;
import g61.EnumC15533f;
import j61.C21372f;
import j71.AbstractC21394b;
import java.util.Iterator;
import l83.C23454a0;
import no0.C26984y0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.C29007a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj71/b$h;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lj71/b$h;Landroidx/compose/runtime/Composer;II)V", "a", "Lj71/b$h;", "d", "()Lj71/b$h;", "exampleLineGridPlot", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28939b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC21394b.h f117082a;

    static {
        Float fValueOf = Float.valueOf(0.18f);
        Float fValueOf2 = Float.valueOf(0.36f);
        Float fValueOf3 = Float.valueOf(0.54f);
        Float fValueOf4 = Float.valueOf(0.72f);
        Float fValueOf5 = Float.valueOf(0.9f);
        f117082a = new AbstractC21394b.h(AbstractC37056f.m118959K(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5), AbstractC37056f.m118959K(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5), null, 0.0f, "gridline", false, false, 108, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m87851b(Modifier modifier, AbstractC21394b.h state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-295323251);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM107879c = AbstractC34132o.m107879c(state.getLineAlpha(), AbstractC1102d.m3407d(1.0f, modifier3));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM107879c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-319291611);
            Iterator<T> it = state.m60078e().iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                AbstractC3712b.m11530b(null, new C21372f(fFloatValue, state.getLineColor(), EnumC15533f.X_AXIS, fFloatValue == 0.0f ? new C29007a(0.0f, 1.0f, false, false, 12, null) : C29007a.INSTANCE.m88139d(), null, null, null, 112, null), c28655q, 0, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-319271676);
            Iterator<T> it3 = state.m60081h().iterator();
            while (it3.hasNext()) {
                float fFloatValue2 = ((Number) it3.next()).floatValue();
                AbstractC3712b.m11530b(null, new C21372f(fFloatValue2, state.getLineColor(), EnumC15533f.Y_AXIS, fFloatValue2 == 1.0f ? new C29007a(1.0f, 0.0f, false, false, 12, null) : C29007a.INSTANCE.m88139d(), null, null, null, 112, null), c28655q, 0, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier3, state, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m87852c(Modifier modifier, AbstractC21394b.h hVar, int i13, int i14, Composer composer, int i15) {
        m87851b(modifier, hVar, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC21394b.h m87853d() {
        return f117082a;
    }
}

package no1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e51.AbstractC12736l;
import e51.C12738n;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import l72.C23407n;
import l83.C23454a0;
import lo1.C24618c;
import lo1.InterfaceC24616a;
import mf2.C25514e;
import no0.C26957l;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26057j;
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
import p716lb1.AbstractC23707s0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yn1.C39673b;

/* JADX INFO: renamed from: no1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llo1/c$e;", "viewState", "", "analyticsSource", "Lkotlin/Function1;", "Llo1/a;", "Ll83/a0;", "onEvent", "e", "(Llo1/c$e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/models/items/CyclePhaseStyle;", "cyclePhaseStyle", "Li2/t;", "j", "(Lcom/whoop/design/models/items/CyclePhaseStyle;Landroidx/compose/runtime/Composer;I)Li2/t;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26992f {
    /* JADX WARN: Code duplicated, block: B:103:0x0335  */
    /* JADX WARN: Code duplicated, block: B:104:0x0337  */
    /* JADX WARN: Code duplicated, block: B:107:0x0340  */
    /* JADX WARN: Code duplicated, block: B:108:0x0342  */
    /* JADX WARN: Code duplicated, block: B:114:0x0351  */
    /* JADX INFO: renamed from: e */
    public static final void m80960e(C24618c.e eVar, String str, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        EnumC16313m0 enumC16313m0M71937a;
        C24618c.e viewState = eVar;
        String analyticsSource = str;
        Function1 onEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(analyticsSource, "analyticsSource");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1502528159);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(analyticsSource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(160, AbstractC1102d.m3409f(1.0f, c2314t)), m80965j(viewState.getStyle(), c28655q, 0), null, 0.0f, 6), c28655q, 0);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66725n(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1), 0.0f, f14, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getNavigationBar().getTitle());
            C24618c.d dVarM71935a = viewState.getNavigationBar().getRightButton();
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, null, (dVarM71935a == null || (enumC16313m0M71937a = dVarM71935a.getIcon()) == null) ? null : new C39274g(enumC16313m0M71937a.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, false, null, null, null, null, null, null, null, null, 32758, null);
            int i15 = i14 & 896;
            boolean z15 = i15 == 256;
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25514e(onEvent, 23);
                c28655q.m87172p0(objM87133R2);
            }
            int i16 = i14;
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, null, (InterfaceC4339a) objM87133R2, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 44);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM71942e = eVar.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM71942e, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
            C12738n c12738nM71938a = eVar.getCategorySelector();
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null), 0.0f, f14, 0.0f, 0.0f, 13);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3398t3, true, 1.0f);
            boolean z16 = i15 == 256;
            Object objM87133R3 = c28655q.m87133R();
            if (z16 || objM87133R3 == c28676v0) {
                function2 = function1;
                objM87133R3 = new C26957l(function2, 11);
                c28655q.m87172p0(objM87133R3);
            } else {
                function2 = function1;
            }
            onEvent = function2;
            AbstractC12736l.m35622i(modifierM31988g, c12738nM71938a, null, null, (Function1) objM87133R3, c28655q, C12738n.f43579f << 3, 12);
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f14);
            C27238a0 c27238a0M71940c = eVar.getPrimaryButton();
            if ((i16 & 14) != 4) {
                viewState = eVar;
                boolean z17 = (i16 & 8) != 0 && c28655q.m87157i(viewState);
                if (i15 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z18 = z4 | z17;
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z18 | z13;
                objM87133R = c28655q.m87133R();
                if (!z14 || objM87133R == c28676v0) {
                    analyticsSource = str;
                    objM87133R = new C26057j(viewState, onEvent, analyticsSource, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    analyticsSource = str;
                }
                AbstractC27292z.m82341h(c27238a0M71940c, modifierM3395q, null, (InterfaceC4339a) objM87133R, c28655q, C27238a0.f109008k | 48, 4);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                viewState = eVar;
            }
            if (i15 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z19 = z4 | z17;
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z19 | z13;
            objM87133R = c28655q.m87133R();
            if (z14) {
                analyticsSource = str;
                objM87133R = new C26057j(viewState, onEvent, analyticsSource, 5);
                c28655q.m87172p0(objM87133R);
            } else {
                analyticsSource = str;
                objM87133R = new C26057j(viewState, onEvent, analyticsSource, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82341h(c27238a0M71940c, modifierM3395q, null, (InterfaceC4339a) objM87133R, c28655q, C27238a0.f109008k | 48, 4);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(viewState, analyticsSource, onEvent, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m80961f(Function1 function1) {
        function1.invoke(InterfaceC24616a.d.f96255a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m80962g(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new InterfaceC24616a.b(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m80963h(C24618c.e eVar, Function1 function1, String str) {
        function1.invoke(new InterfaceC24616a.i(C39673b.INSTANCE.m126875b(eVar.getStyle().name()), str));
        function1.invoke(InterfaceC24616a.h.f96258a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m80964i(C24618c.e eVar, String str, Function1 function1, int i13, Composer composer, int i14) {
        m80960e(eVar, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final AbstractC17911t m80965j(CyclePhaseStyle cyclePhaseStyle, Composer composer, int i13) {
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.5f, AbstractC23707s0.m69376a(cyclePhaseStyle).mo134584toComposableColorWaAFU9c(composer, 0))), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14);
    }
}

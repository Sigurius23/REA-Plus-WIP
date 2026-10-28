package yw1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4092p2;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import java.util.Iterator;
import l83.C23454a0;
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
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import uw1.AbstractC35312e;
import uw1.C35310c;
import w20.C36727q;
import wb3.AbstractC37056f;
import ww1.InterfaceC37657c;

/* JADX INFO: renamed from: yw1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Luw1/c;", "viewState", "Lkotlin/Function1;", "Lww1/c;", "Ll83/a0;", "onEvent", "f", "(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39821h {
    /* JADX INFO: renamed from: f */
    public static final void m127670f(C35310c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-246377244);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C35310c.a aVarM112108b = viewState.getPopUpDialog();
            AbstractC29125c.m88520b(Boolean.valueOf(aVarM112108b != null), null, null, "", AbstractC37817c.m121344e(-1661891515, c28655q, new C39818e(aVarM112108b, viewState, onEvent, 0)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39819f(viewState, onEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m127671g(C35310c.a aVar, final C35310c c35310c, final Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || aVar == null) {
            c28655q.m87150e0(-1320761187);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1321997033);
            TextResource textResourceM112118i = aVar.getTitle();
            TextResource textResourceM112112c = aVar.getDescription();
            TextResource textResourceM112115f = aVar.getPrimaryActionText();
            InterfaceC39332e interfaceC39332eM112114e = aVar.getPrimaryActionColor();
            if (interfaceC39332eM112114e == null) {
                interfaceC39332eM112114e = EnumC39333f.BRAND_WHITE;
            }
            InterfaceC39332e interfaceC39332e = interfaceC39332eM112114e;
            TextResource textResourceM112116g = aVar.getSecondaryActionText();
            boolean zM112117h = aVar.getShowCloseIcon();
            EnumC21213p enumC21213pM112119j = aVar.getTopDialogStyle();
            boolean zM112120k = aVar.getUseSolidButtons();
            boolean zM87157i = c28655q.m87157i(c35310c) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: yw1.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC39821h.m127672h(c35310c, function1);
                            default:
                                return AbstractC39821h.m127673i(c35310c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c35310c) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i16 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: yw1.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC39821h.m127672h(c35310c, function1);
                            default:
                                return AbstractC39821h.m127673i(c35310c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1967183731, c28655q, new C36727q(aVar, 19));
            int i17 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM112118i, textResourceM112112c, textResourceM112115f, zM112120k, interfaceC39332e, null, null, null, textResourceM112116g, null, false, zM112117h, enumC21213pM112119j, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, c37816bM121344e, c28655q, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 0, 12582912, 113233345);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m127672h(C35310c c35310c, Function1 function1) {
        InterfaceC37657c interfaceC37657cM112113d = c35310c.getPopUpDialog().getDismissEvent();
        if (interfaceC37657cM112113d != null) {
            function1.invoke(interfaceC37657cM112113d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m127673i(C35310c c35310c, Function1 function1) {
        InterfaceC37657c interfaceC37657cM112110a = c35310c.getPopUpDialog().getApproveEvent();
        if (interfaceC37657cM112110a != null) {
            function1.invoke(interfaceC37657cM112110a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m127674j(C35310c.a aVar, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            c28655q.m87150e0(1744826403);
            Iterator<T> it = aVar.m112111b().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((C4092p2) it.next(), AbstractC35312e.m112150c(), null, null, c28655q, C4092p2.f16593v | (C25307p.f99300b << 3), 12);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m127675k(C35310c c35310c, Function1 function1, int i13, Composer composer, int i14) {
        m127670f(c35310c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

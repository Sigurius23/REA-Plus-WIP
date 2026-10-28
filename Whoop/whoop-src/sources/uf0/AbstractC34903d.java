package uf0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import l83.C23454a0;
import no0.C26949h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import sf0.C32445c;
import sf0.InterfaceC32443a;
import so2.C32848f;

/* JADX INFO: renamed from: uf0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lsf0/c;", "viewState", "Lkotlin/Function1;", "Lsf0/a;", "Ll83/a0;", "onEvent", "e", "(Lsf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34903d {
    /* JADX INFO: renamed from: e */
    public static final void m110053e(C32445c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1722777886);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C32445c.a popUpDialog = viewState.getPopUpDialog();
            AbstractC29125c.m88520b(Boolean.valueOf(popUpDialog != null), null, null, "", AbstractC37817c.m121344e(990398173, c28655q, new C26949h(popUpDialog, viewState, onEvent, 20)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onEvent, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m110054f(C32445c.a aVar, final C32445c c32445c, final Function1 function1, boolean z4, Composer composer, int i13) {
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
            c28655q.m87150e0(-1472500539);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1473261651);
            TextResource title = aVar.getTitle();
            TextResource description = aVar.getDescription();
            TextResource primaryActionText = aVar.getPrimaryActionText();
            InterfaceC39332e primaryActionColor = aVar.getPrimaryActionColor();
            if (primaryActionColor == null) {
                primaryActionColor = EnumC39333f.BRAND_WHITE;
            }
            InterfaceC39332e interfaceC39332e = primaryActionColor;
            TextResource secondaryActionText = aVar.getSecondaryActionText();
            boolean showCloseIcon = aVar.getShowCloseIcon();
            EnumC21213p topDialogStyle = aVar.getTopDialogStyle();
            boolean useSolidButtons = aVar.getUseSolidButtons();
            boolean zM87157i = c28655q.m87157i(c32445c) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: uf0.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC34903d.m110055g(c32445c, function1);
                            default:
                                return AbstractC34903d.m110056h(c32445c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c32445c) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i16 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: uf0.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC34903d.m110055g(c32445c, function1);
                            default:
                                return AbstractC34903d.m110056h(c32445c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            int i17 = TextResource.$stable;
            AbstractC21211n.m59497o(null, title, description, primaryActionText, useSolidButtons, interfaceC39332e, null, null, null, secondaryActionText, null, false, showCloseIcon, topDialogStyle, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 0, 0, 247451073);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m110055g(C32445c c32445c, Function1 function1) {
        InterfaceC32443a dismissEvent = c32445c.getPopUpDialog().getDismissEvent();
        if (dismissEvent != null) {
            function1.invoke(dismissEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m110056h(C32445c c32445c, Function1 function1) {
        InterfaceC32443a approveEvent = c32445c.getPopUpDialog().getApproveEvent();
        if (approveEvent != null) {
            function1.invoke(approveEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m110057i(C32445c c32445c, Function1 function1, int i13, Composer composer, int i14) {
        m110053e(c32445c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

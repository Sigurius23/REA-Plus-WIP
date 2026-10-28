package pp2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j11.AbstractC21211n;
import j11.EnumC21212o;
import j11.EnumC21213p;
import kp2.InterfaceC22758a;
import l83.C23454a0;
import no0.C26949h;
import np2.C27036c;
import np2.InterfaceC27034a;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import x81.C38072d;

/* JADX INFO: renamed from: pp2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lnp2/c;", "viewState", "Lkotlin/Function1;", "Lnp2/a;", "Ll83/a0;", "onEvent", "f", "(Lnp2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29448l {
    /* JADX INFO: renamed from: f */
    public static final void m89881f(C27036c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1208993916);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C27036c.f popUpDialog = viewState.getPopUpDialog();
            AbstractC29125c.m88520b(Boolean.valueOf(popUpDialog != null), null, null, "", AbstractC37817c.m121344e(309860995, c28655q, new C26949h((Object) popUpDialog, onEvent, (Object) viewState, 10)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29445i(viewState, onEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m89882g(final C27036c.f fVar, final Function1 function1, final C27036c c27036c, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || fVar == null) {
            c28655q.m87150e0(1185832639);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1184297922);
            if (fVar.getDialogType() instanceof InterfaceC22758a.a) {
                function1.invoke(new InterfaceC27034a.g(((InterfaceC22758a.a) fVar.getDialogType()).getSource()));
            }
            TextResource title = fVar.getTitle();
            TextResource primaryActionText = fVar.getPrimaryActionText();
            InterfaceC39332e primaryActionColor = fVar.getPrimaryActionColor();
            if (primaryActionColor == null) {
                primaryActionColor = EnumC39333f.BRAND_WHITE;
            }
            InterfaceC39332e interfaceC39332e = primaryActionColor;
            TextResource secondaryActionText = fVar.getSecondaryActionText();
            boolean showCloseIcon = fVar.getShowCloseIcon();
            EnumC21213p topDialogStyle = fVar.getTopDialogStyle();
            EnumC21212o enumC21212o = EnumC21212o.CENTER;
            boolean useSolidButtons = fVar.getUseSolidButtons();
            boolean zM87157i = c28655q.m87157i(c27036c) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: pp2.j
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC29448l.m89883h(c27036c, function1);
                            default:
                                return AbstractC29448l.m89884i(c27036c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c27036c) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i16 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: pp2.j
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC29448l.m89883h(c27036c, function1);
                            default:
                                return AbstractC29448l.m89884i(c27036c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            C37816b c37816bM121344e = AbstractC37817c.m121344e(431290225, c28655q, new InterfaceC4351m() { // from class: pp2.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC29448l.m89885j(fVar, (Composer) obj, iIntValue);
                }
            });
            int i17 = TextResource.$stable;
            AbstractC21211n.m59497o(null, title, null, primaryActionText, useSolidButtons, interfaceC39332e, null, null, null, secondaryActionText, null, false, showCloseIcon, topDialogStyle, enumC21212o, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, c37816bM121344e, c28655q, (i17 << 3) | 384 | (i17 << 9) | (i17 << 27), 24576, 12582912, 113216961);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m89883h(C27036c c27036c, Function1 function1) {
        InterfaceC27034a dismissEvent = c27036c.getPopUpDialog().getDismissEvent();
        if (dismissEvent != null) {
            function1.invoke(dismissEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m89884i(C27036c c27036c, Function1 function1) {
        InterfaceC27034a approveEvent = c27036c.getPopUpDialog().getApproveEvent();
        if (approveEvent != null) {
            function1.invoke(approveEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m89885j(C27036c.f fVar, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(fVar.getDescription(), c28655q, TextResource.$stable);
            C21053l c21053l = C21053l.f79834a;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC21048g.m58807M(strM21274h, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, i14), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i14).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 384, 498);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m89886k(C27036c c27036c, Function1 function1, int i13, Composer composer, int i14) {
        m89881f(c27036c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

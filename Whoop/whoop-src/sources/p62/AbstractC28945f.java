package p62;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f62.AbstractC14152b;
import l83.C23454a0;
import m62.InterfaceC25116g;
import m62.InterfaceC25119j;
import no.nordicsemi.android.dfu.DfuBaseService;
import ox0.C28448b;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28325a;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;

/* JADX INFO: renamed from: p62.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lm62/g;", "viewState", "Lkotlin/Function1;", "Lm62/j;", "Ll83/a0;", "onViewEvent", "Ll62/a;", "onNavigationEvent", "Lh62/a;", "onAnalyticsEvent", "c", "(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28945f {
    /* JADX INFO: renamed from: c */
    public static final void m87886c(InterfaceC25116g viewState, Function1 function1, Function1 function2, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        Function1 onViewEvent = function1;
        Function1 onNavigationEvent = function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(192093499);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean z4 = viewState instanceof InterfaceC25116g.d;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(1761283637);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC22953f.m66723l(c2314t), false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState instanceof InterfaceC25116g.a) {
                c28655q.m87150e0(1761534086);
                AbstractC28941b.m87859f((InterfaceC25116g.a) viewState, onNavigationEvent, c28655q, ((i14 >> 3) & 112) | (i14 & 14));
                c28655q.m87173q(false);
            } else if (viewState instanceof InterfaceC25116g.c) {
                c28655q.m87150e0(1761676903);
                AbstractC28942c.m87870f((InterfaceC25116g.c) viewState, function1, onNavigationEvent, onAnalyticsEvent, c28655q, i14 & 8190);
                onViewEvent = function1;
                onNavigationEvent = onNavigationEvent;
                c28655q.m87173q(false);
            } else if (viewState instanceof InterfaceC25116g.e) {
                c28655q.m87150e0(1761881162);
                AbstractC28948i.m87902f((InterfaceC25116g.e) viewState, onViewEvent, onNavigationEvent, c28655q, i14 & 1022);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof InterfaceC25116g.b)) {
                    throw AbstractC11895b.m32003v(-81732685, c28655q, false);
                }
                c28655q.m87150e0(1762076183);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC14152b.f50979a, null, 2, null), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC14152b.f50985g, null, 2, null);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                boolean z13 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C28448b(13, onViewEvent, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, modifierM66723l, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(viewState, onViewEvent, onNavigationEvent, onAnalyticsEvent, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m87887d(Function1 function1, InterfaceC25116g interfaceC25116g) {
        function1.invoke(new InterfaceC25119j.c(((InterfaceC25116g.b) interfaceC25116g).getSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m87888e(InterfaceC25116g interfaceC25116g, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m87886c(interfaceC25116g, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

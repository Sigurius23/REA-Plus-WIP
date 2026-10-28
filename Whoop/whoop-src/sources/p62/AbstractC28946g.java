package p62;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import l83.C23454a0;
import m62.AbstractC25118i;
import m62.InterfaceC25119j;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27207n;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28325a;
import q62.AbstractC30004d;

/* JADX INFO: renamed from: p62.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lm62/i;", "viewState", "Lkotlin/Function1;", "Lm62/j;", "Ll83/a0;", "onViewEvent", "Ll62/a;", "onNavEvent", "Lh62/a;", "onAnalyticsEvent", "d", "(Lm62/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28946g {
    /* JADX INFO: renamed from: d */
    public static final void m87892d(AbstractC25118i viewState, Function1 function1, Function1 onNavEvent, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1418888883);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87138X();
        } else if (viewState instanceof AbstractC25118i.a) {
            c28655q.m87150e0(2047596413);
            AbstractC30004d.m91814h((AbstractC25118i.a) viewState, function1, onNavEvent, onAnalyticsEvent, c28655q, i14 & 8190);
            onViewEvent = function1;
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof AbstractC25118i.b)) {
                throw AbstractC11895b.m32003v(2047594153, c28655q, false);
            }
            c28655q.m87150e0(-948865046);
            AbstractC25118i.b bVar = (AbstractC25118i.b) viewState;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(bVar.getTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bVar.getBody());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bVar.getCloseCtaText());
            EnumC21213p enumC21213p = EnumC21213p.CENTER_ICON;
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C27207n(onViewEvent, 28);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27207n(onViewEvent, 29);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, false, null, null, null, null, null, null, false, true, enumC21213p, null, false, 0, null, null, null, true, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q, (i16 << 3) | (i16 << 6) | (i16 << 9), 3456, 6, 246403057);
            c28655q = c28655q;
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(viewState, onViewEvent, onNavEvent, onAnalyticsEvent, i13, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final void m87893e(Function1 function1) {
        function1.invoke(InterfaceC25119j.a.f98451a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m87894f(Function1 function1) {
        m87893e(function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87895g(Function1 function1) {
        m87893e(function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87896h(AbstractC25118i abstractC25118i, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m87892d(abstractC25118i, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

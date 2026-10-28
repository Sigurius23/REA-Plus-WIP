package fr1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import e93.AbstractC12889b;
import ep1.C13412g;
import f01.C13865h1;
import fq2.C14686c;
import gr1.C16110q;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.Map;
import jr1.AbstractC21896d;
import jr1.AbstractC21898f;
import jr1.AbstractC21899g;
import kotlin.C2032u;
import l83.C23454a0;
import lr1.C24697b;
import lr1.C24699d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27253f0;
import ny0.C27257h0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import r01.C30840a;
import r01.C30842c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Leb/u0;", "navHostController", "Lgr1/q;", "viewState", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "Lfr1/c;", "onNavigationEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Leb/u0;Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/p;", "a", "Lm91/p;", "integrationsItemFactory", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14713b {

    /* JADX INFO: renamed from: a */
    private static final C25307p f54403a = Function1.m74306g(new C14686c(7));

    /* JADX INFO: renamed from: h */
    public static final void m42169h(C12991u0 navHostController, C16110q viewState, p715kotlin.jvm.functions.Function1 onViewEvent, p715kotlin.jvm.functions.Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1110074695);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navHostController) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(f54403a), AbstractC37817c.m121344e(627457529, c28655q, new C2032u((Object) navHostController, (Object) viewState, onViewEvent, (Object) onNavigationEvent, 9)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13865h1(navHostController, viewState, onViewEvent, onNavigationEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m42170i(C12991u0 c12991u0, C16110q c16110q, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            boolean zM87157i = c28655q.m87157i(c16110q) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C13412g(c16110q, function1, function2, 8);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48888e(c12991u0, "DISCOVERY", null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m42171j(final C16110q c16110q, final p715kotlin.jvm.functions.Function1 function1, final p715kotlin.jvm.functions.Function1 function2, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        final int i13 = 0;
        AbstractC12889b.m36291u(NavHost, "DISCOVERY", null, new C37816b(new Function3() { // from class: fr1.a
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42172k(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42173l(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42174m(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, 938879800), 6);
        final int i14 = 1;
        AbstractC12889b.m36291u(NavHost, "DETAILS", null, new C37816b(new Function3() { // from class: fr1.a
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42172k(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42173l(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42174m(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, -1400415633), 6);
        final int i15 = 2;
        AbstractC12889b.m36291u(NavHost, "DISCLAIMER", null, new C37816b(new Function3() { // from class: fr1.a
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i15) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42172k(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42173l(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return AbstractC14713b.m42174m(c16110q, function1, function2, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, -1704273168), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m42172k(C16110q c16110q, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC21899g.m62297w(c16110q, function1, function2, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m42173l(C16110q c16110q, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC21896d.m62217x(c16110q, function1, function2, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m42174m(C16110q c16110q, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC21898f.m62272q(c16110q, function1, function2, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m42175n(C12991u0 c12991u0, C16110q c16110q, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, int i13, Composer composer, int i14) {
        m42169h(c12991u0, c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m42176o(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C24699d.class), new C24697b());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C30842c.class), new C30840a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C27257h0.class), new C27253f0());
        return C23454a0.f92919a;
    }
}

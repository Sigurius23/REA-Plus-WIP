package zk1;

import al1.AbstractC0980a;
import al1.AbstractC0983d;
import al1.C0981b;
import al1.C0982c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az1.C2172m;
import bc3.InterfaceC2994c0;
import bl1.InterfaceC3370a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dl1.AbstractC12167a;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p579wc.C37082e1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p664yy.C39850b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud0.C34789b;
import vl0.C36100c;
import wb3.AbstractC37056f;
import x30.C37894h1;
import x30.C37900j1;
import xk1.C38429c;
import yk1.AbstractC39599a;
import yl2.C39638e;

/* JADX INFO: renamed from: zk1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lal1/c;", "viewModel", "Lzk1/c;", "navigationRouter", "Leb/u0;", "navController", "Lkotlin/Function1;", "Lcom/whoop/navigation/AiAction;", "Ll83/a0;", "onClickOpenInAppSupport", "Lkotlin/Function0;", "onExitHelpCenter", "j", "(Lal1/c;Lzk1/c;Leb/u0;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "help-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40837a {

    /* JADX INFO: renamed from: zk1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.helpcenter.navigation.HelpCenterNavHostKt$HelpCenterNavHost$1$1$1$1$1$1", m100430f = "HelpCenterNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176045w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0982c f176046x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0982c c0982c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176046x = c0982c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f176046x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f176045w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f176046x.m2676q(AbstractC0980a.b.f3597a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m132338j(C0982c viewModel, C40839c navigationRouter, C12991u0 navController, Function1 onClickOpenInAppSupport, InterfaceC4339a onExitHelpCenter, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(onClickOpenInAppSupport, "onClickOpenInAppSupport");
        AbstractC22676k.m65750j(onExitHelpCenter, "onExitHelpCenter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1343195733);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navigationRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(navController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onClickOpenInAppSupport) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onExitHelpCenter) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            boolean zM87157i = c28655q.m87157i(viewModel) | c28655q.m87157i(navigationRouter) | ((i15 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C37082e1(viewModel, navigationRouter, onClickOpenInAppSupport, 24);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48888e(navController, "LANDING", null, (Function1) objM87133R, c28655q, (i15 >> 6) & 14);
            boolean zM87157i2 = c28655q.m87157i(navController) | ((57344 & i15) == 16384);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2172m(navController, onExitHelpCenter, 4);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b((Object) viewModel, (Object) navigationRouter, (Object) navController, onClickOpenInAppSupport, (Object) onExitHelpCenter, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132339k(C0982c c0982c, C40839c c40839c, Function1 function1, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "LANDING", null, new C37816b(new C39638e(c0982c, c40839c, function1, NavHost), true, 306062668), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m132340l(C0982c c0982c, C40839c c40839c, C12987s0 c12987s0, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c0982c.getViewState(), AbstractC0983d.b.f3622a, null, composer, 48, 2);
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c0982c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new a(c0982c, null);
            c28655q.m87172p0(objM87133R);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        AbstractC0983d abstractC0983d = (AbstractC0983d) interfaceC28601c1M87260n.getValue();
        boolean zM87157i2 = c28655q.m87157i(c0982c) | c28655q.m87157i(c40839c) | c28655q.m87157i(c12987s0);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C36100c(c0982c, c12987s0, c40839c, 13);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c40839c);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C39850b0(c40839c, 9);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
        boolean zM87157i4 = c28655q.m87157i(c0982c) | c28655q.m87157i(c40839c);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i4 || objM87133R4 == c28676v0) {
            objM87133R4 = new C37900j1(22, c0982c, c40839c);
            c28655q.m87172p0(objM87133R4);
        }
        Function1 function2 = (Function1) objM87133R4;
        boolean zM87157i5 = c28655q.m87157i(c0982c);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i5 || objM87133R5 == c28676v0) {
            objM87133R5 = new C0981b(c0982c, 1);
            c28655q.m87172p0(objM87133R5);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
        boolean zM87157i6 = c28655q.m87157i(c0982c);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i6 || objM87133R6 == c28676v0) {
            objM87133R6 = new C37894h1(c0982c, 18);
            c28655q.m87172p0(objM87133R6);
        }
        AbstractC12167a.m33649b(abstractC0983d, interfaceC4351m, interfaceC4339a, function1, function2, interfaceC4339a2, (Function1) objM87133R6, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m132341m(C0982c c0982c, C12987s0 c12987s0, C40839c c40839c, C38429c card, int i13) {
        AbstractC22676k.m65750j(card, "card");
        c0982c.m2675n(new InterfaceC3370a.f(null, null, card.getTitle(), null, AbstractC25247g0.m73990Y(new C23465k("Screen", "Help Center"), new C23465k("Order", Integer.valueOf(i13 + 1))), 11, null));
        String strM123111a = card.getArticleLink();
        if (strM123111a != null) {
            c40839c.m132350a(new AbstractC40838b.c(strM123111a));
        } else {
            c40839c.m132350a(new AbstractC40838b.b(""));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m132342n(C40839c c40839c) {
        c40839c.m132350a(AbstractC40838b.a.f176047a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m132343o(C0982c c0982c, C40839c c40839c, String it) {
        AbstractC22676k.m65750j(it, "it");
        c0982c.m2675n(new InterfaceC3370a.a(null, null, null, null, null, 31, null));
        c40839c.m132350a(new AbstractC40838b.c(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m132344p(C0982c c0982c) {
        c0982c.m2676q(AbstractC0980a.b.f3597a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m132345q(C0982c c0982c, Object it) {
        AbstractC22676k.m65750j(it, "it");
        String strM126481a = AbstractC39599a.m126481a(it);
        if (strM126481a != null) {
            c0982c.m2675n(new InterfaceC3370a.b(strM126481a, null, null, null, null, null, 62, null));
        }
        c0982c.m2676q(new AbstractC0980a.a(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m132346r(C12991u0 c12991u0, InterfaceC4339a interfaceC4339a) {
        if (!c12991u0.m36410z()) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m132347s(C0982c c0982c, C40839c c40839c, C12991u0 c12991u0, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m132338j(c0982c, c40839c, c12991u0, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

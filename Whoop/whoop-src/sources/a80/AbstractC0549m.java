package a80;

import a01.C0089i;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy1.AbstractC14874j;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import p000.C21061j;
import p000.C28503p;
import p000.C29656q;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.C33205o0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import x70.C38036a;
import x70.C38038c;
import xf3.C38266c;
import y70.C39266b;
import y70.C39267c;
import y70.InterfaceC39265a;

/* JADX INFO: renamed from: a80.m */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ly70/a$k;", "screenViewEvent", "Lx70/c;", "navRouter", "Lx70/a;", "actionRouter", "Ll83/a0;", "e", "(Ly70/a$k;Lx70/c;Lx70/a;Landroidx/compose/runtime/Composer;I)V", "Ly70/c;", "viewState", "Lkotlin/Function1;", "Ly70/a;", "onEvent", "f", "(Ly70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly70/b;", "viewModel", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0549m {

    /* JADX INFO: renamed from: a80.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f1887w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f1888x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f1889y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f1890z;

        /* JADX INFO: renamed from: a80.m$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41265a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f1891w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41265a(C21647a c21647a) {
                super(0);
                this.f1891w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f1891w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f1887w = c38266c;
            this.f1888x = interfaceC35951a;
            this.f1889y = interfaceC4339a;
            this.f1890z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, y70.b] */
        @Override // c93.InterfaceC4339a
        public final C39266b invoke() {
            return AbstractC21598x.m60668X(this.f1887w, this.f1888x, new C41265a(this.f1890z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39266b.class), null, this.f1889y);
        }
    }

    /* JADX INFO: renamed from: a80.m$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationScreenKt$OrderConfirmationScreen$1$1", m100430f = "OrderConfirmationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1892w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38036a f1893x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39265a.k f1894y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f1895z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38036a c38036a, InterfaceC39265a.k kVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1893x = c38036a;
            this.f1894y = kVar;
            this.f1895z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f1893x, this.f1894y, this.f1895z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f1892w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f1893x.m121774c(this.f1894y);
            AbstractC0549m.m1365g(this.f1895z).m125078u(InterfaceC39265a.l.f168847a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a80.m$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationScreenKt$OrderConfirmationScreen$2$1", m100430f = "OrderConfirmationScreen.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1896w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f1897x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C38038c f1898y;

        /* JADX INFO: renamed from: a80.m$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C38038c f1899w;

            public a(C38038c c38038c) {
                this.f1899w = c38038c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC39265a.j jVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f1899w.m121781g(jVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C38038c c38038c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1897x = interfaceC23462h;
            this.f1898y = c38038c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f1897x, this.f1898y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f1896w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM125077r = AbstractC0549m.m1365g(this.f1897x).getNavigationState();
                a aVar = new a(this.f1898y);
                this.f1896w = 1;
                if (interfaceC13058lM125077r.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1363e(InterfaceC39265a.k screenViewEvent, C38038c navRouter, C38036a actionRouter, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(screenViewEvent, "screenViewEvent");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(756331712);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(screenViewEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(actionRouter) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m1365g(interfaceC23462h).getViewState(), new C39267c(null, new C39267c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null), null, c28655q, 0, 2);
            C39266b c39266bM1365g = m1365g(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(actionRouter) | ((i14 & 14) == 4) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(actionRouter, screenViewEvent, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c39266bM1365g);
            C39266b c39266bM1365g2 = m1365g(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c39266bM1365g2);
            AbstractC14874j.m42904c(m1366h(interfaceC28601c1M87260n), "order_confirmation", c28655q, 48);
            C39267c c39267cM1366h = m1366h(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C29656q(actionRouter, navRouter, interfaceC23462h, 1);
                c28655q.m87172p0(objM87133R4);
            }
            m1364f(c39267cM1366h, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(screenViewEvent, navRouter, actionRouter, i13, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1364f(C39267c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1624501010);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28503p(10);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-2072336226);
                AbstractC0541e.m1325j(viewState.getFullScreenModal(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(182211583);
                AbstractC0544h.m1334e(viewState, function1, c28655q, i15 & 126);
                AbstractC0548l.m1348j(viewState.getScreenContent(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(182360724);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C39266b m1365g(InterfaceC23462h interfaceC23462h) {
        return (C39266b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C39267c m1366h(InterfaceC28670t2 interfaceC28670t2) {
        return (C39267c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m1367i(C38036a c38036a, C38038c c38038c, InterfaceC23462h interfaceC23462h, InterfaceC39265a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC39265a interfaceC39265aM121774c = c38036a.m121774c(event);
        if (interfaceC39265aM121774c instanceof InterfaceC39265a.m) {
            m1365g(interfaceC23462h).m125078u((InterfaceC39265a.m) interfaceC39265aM121774c);
        } else if (interfaceC39265aM121774c instanceof InterfaceC39265a.j) {
            c38038c.m121781g((InterfaceC39265a.j) interfaceC39265aM121774c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m1368j(InterfaceC39265a.k kVar, C38038c c38038c, C38036a c38036a, int i13, Composer composer, int i14) {
        m1363e(kVar, c38038c, c38036a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m1369k(InterfaceC39265a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m1370l(C39267c c39267c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m1364f(c39267c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

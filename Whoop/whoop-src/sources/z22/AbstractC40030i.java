package z22;

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
import p579wc.C37082e1;
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
import vv2.C36537c;
import w22.C36740a;
import w22.C36742c;
import x22.C37863b;
import x22.C37864c;
import x22.InterfaceC37862a;
import xf3.C38266c;
import yz1.C39913g;

/* JADX INFO: renamed from: z22.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "source", "Lw22/c;", "navRouter", "Lw22/a;", "actionRouter", "Ll83/a0;", "e", "(Ljava/lang/String;Lw22/c;Lw22/a;Landroidx/compose/runtime/Composer;I)V", "Lx22/c;", "viewState", "Lkotlin/Function1;", "Lx22/a;", "onEvent", "f", "(Lx22/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lx22/b;", "viewModel", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40030i {

    /* JADX INFO: renamed from: z22.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f172720w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f172721x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f172722y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f172723z;

        /* JADX INFO: renamed from: z22.i$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42722a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f172724w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42722a(C21647a c21647a) {
                super(0);
                this.f172724w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f172724w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f172720w = c38266c;
            this.f172721x = interfaceC35951a;
            this.f172722y = interfaceC4339a;
            this.f172723z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, x22.b] */
        @Override // c93.InterfaceC4339a
        public final C37863b invoke() {
            return AbstractC21598x.m60668X(this.f172720w, this.f172721x, new C42722a(this.f172723z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37863b.class), null, this.f172722y);
        }
    }

    /* JADX INFO: renamed from: z22.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementScreenKt$PaymentMethodManagementScreen$1$1", m100430f = "PaymentMethodManagementScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172725w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36740a f172726x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f172727y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f172728z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36740a c36740a, String str, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172726x = c36740a;
            this.f172727y = str;
            this.f172728z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f172726x, this.f172727y, this.f172728z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f172725w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f172726x.m117869d(new InterfaceC37862a.l(this.f172727y));
            AbstractC40030i.m128352g(this.f172728z).m121423o(InterfaceC37862a.t.f162106a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z22.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementScreenKt$PaymentMethodManagementScreen$2$1", m100430f = "PaymentMethodManagementScreen.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172729w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f172730x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36742c f172731y;

        /* JADX INFO: renamed from: z22.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36742c f172732w;

            public a(C36742c c36742c) {
                this.f172732w = c36742c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC37862a.n nVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f172732w.m117870a(nVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C36742c c36742c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172730x = interfaceC23462h;
            this.f172731y = c36742c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f172730x, this.f172731y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f172729w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM121422n = AbstractC40030i.m128352g(this.f172730x).getNavigationEvents();
                a aVar = new a(this.f172731y);
                this.f172729w = 1;
                if (interfaceC13058lM121422n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: z22.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementScreenKt$PaymentMethodManagementScreen$3$1", m100430f = "PaymentMethodManagementScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172733w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36740a f172734x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f172735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C36740a c36740a, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172734x = c36740a;
            this.f172735y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f172734x, this.f172735y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f172733w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC40030i.m128353h(this.f172735y).getPopUpDialog() != null) {
                this.f172734x.m117869d(InterfaceC37862a.i.f162093a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m128350e(String source, C36742c navRouter, C36740a actionRouter, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1177592931);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(source) ? 4 : 2) | i13;
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
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m128352g(interfaceC23462h).getViewState(), new C37864c(null, new C37864c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null), null, c28655q, 0, 2);
            C37863b c37863bM128352g = m128352g(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(actionRouter) | ((i14 & 14) == 4) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(actionRouter, source, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c37863bM128352g);
            C37863b c37863bM128352g2 = m128352g(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c37863bM128352g2);
            C37864c.c popUpDialog = m128353h(interfaceC28601c1M87260n).getPopUpDialog();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(actionRouter);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                objM87133R4 = new d(actionRouter, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, popUpDialog);
            AbstractC14874j.m42904c(m128353h(interfaceC28601c1M87260n), "update_payment_method_v2", c28655q, 48);
            C37864c c37864cM128353h = m128353h(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v0) {
                objM87133R5 = new C37082e1(actionRouter, navRouter, interfaceC23462h, 21);
                c28655q.m87172p0(objM87133R5);
            }
            m128351f(c37864cM128353h, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(source, navRouter, actionRouter, i13, 21);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m128351f(C37864c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(375839127);
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
                    objM87133R = new C39913g(9);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState.getScreenContent() == null) {
                c28655q.m87150e0(-356130863);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-356130862);
                AbstractC40028g.m128318f(viewState, function1, c28655q, i15 & 126, 0);
                AbstractC40029h.m128334k(viewState.getScreenContent(), function1, c28655q, i15 & 112, 0);
                c28655q.m87173q(false);
            }
            if (viewState.getFullScreenModal() == null) {
                c28655q.m87150e0(-355949172);
            } else {
                c28655q.m87150e0(-355949171);
                AbstractC40025d.m128306l(viewState.getFullScreenModal(), function1, c28655q, i15 & 112, 0);
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40026e(viewState, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C37863b m128352g(InterfaceC23462h interfaceC23462h) {
        return (C37863b) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C37864c m128353h(InterfaceC28670t2 interfaceC28670t2) {
        return (C37864c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m128354i(C37864c c37864c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128351f(c37864c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128355j(C36740a c36740a, C36742c c36742c, InterfaceC23462h interfaceC23462h, InterfaceC37862a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC37862a interfaceC37862aM117869d = c36740a.m117869d(event);
        if (interfaceC37862aM117869d instanceof InterfaceC37862a.v) {
            m128352g(interfaceC23462h).m121423o((InterfaceC37862a.v) interfaceC37862aM117869d);
        } else if (interfaceC37862aM117869d instanceof InterfaceC37862a.n) {
            c36742c.m117870a((InterfaceC37862a.n) interfaceC37862aM117869d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m128356k(String str, C36742c c36742c, C36740a c36740a, int i13, Composer composer, int i14) {
        m128350e(str, c36742c, c36740a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m128357l(InterfaceC37862a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}

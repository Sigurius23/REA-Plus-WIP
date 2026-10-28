package ev1;

import androidx.compose.runtime.Composer;
import aq1.C1909c;
import bc3.InterfaceC2994c0;
import bm2.C3424a0;
import bv1.C3671a;
import bv1.C3673c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cv1.C11145b;
import cv1.C11146c;
import cv1.InterfaceC11144a;
import d62.C11736b;
import ep1.C13406a;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import xf3.C38266c;
import zu1.C41153f;

/* JADX INFO: renamed from: ev1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lbv1/c;", "navRouter", "Lbv1/a;", "actionRouter", "Lzu1/f;", "ltoDismissHandler", "", "offerId", "source", "Ll83/a0;", "e", "(Lbv1/c;Lbv1/a;Lzu1/f;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lcv1/c;", "viewState", "Lkotlin/Function1;", "Lcv1/a;", "onEvent", "f", "(Lcv1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcv1/b;", "viewModel", "limited-time-offer_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13689h {

    /* JADX INFO: renamed from: ev1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f48502w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f48503x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f48504y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f48505z;

        /* JADX INFO: renamed from: ev1.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41571a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f48506w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41571a(C21647a c21647a) {
                super(0);
                this.f48506w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f48506w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f48502w = c38266c;
            this.f48503x = interfaceC35951a;
            this.f48504y = interfaceC4339a;
            this.f48505z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cv1.b] */
        @Override // c93.InterfaceC4339a
        public final C11145b invoke() {
            return AbstractC21598x.m60668X(this.f48502w, this.f48503x, new C41571a(this.f48505z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11145b.class), null, this.f48504y);
        }
    }

    /* JADX INFO: renamed from: ev1.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.view.LimitedTimeOfferScreenKt$LimitedTimeOfferScreen$1$1", m100430f = "LimitedTimeOfferScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48507w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f48508x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f48509y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f48510z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48508x = str;
            this.f48509y = str2;
            this.f48510z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f48508x, this.f48509y, this.f48510z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f48507w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC13689h.m38652g(this.f48510z).m30126n(new InterfaceC11144a.j(this.f48508x, this.f48509y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ev1.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.view.LimitedTimeOfferScreenKt$LimitedTimeOfferScreen$2$1", m100430f = "LimitedTimeOfferScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48511w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3671a f48512x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f48513y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f48514z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3671a c3671a, String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48512x = c3671a;
            this.f48513y = str;
            this.f48514z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f48512x, this.f48513y, this.f48514z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f48511w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f48512x.m11356e(this.f48513y, this.f48514z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m38650e(C3673c navRouter, C3671a actionRouter, C41153f ltoDismissHandler, String offerId, String source, Composer composer, int i13) {
        int i14;
        InterfaceC30057d interfaceC30057d;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(ltoDismissHandler, "ltoDismissHandler");
        AbstractC22676k.m65750j(offerId, "offerId");
        AbstractC22676k.m65750j(source, "source");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1652016837);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(actionRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(ltoDismissHandler) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(offerId) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(source) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
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
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m38652g(interfaceC23462h).getViewState(), new C11146c(null, new C11146c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null), null, c28655q, 0, 2);
            C11145b c11145bM38652g = m38652g(interfaceC23462h);
            int i15 = i14 & 7168;
            int i16 = i14 & 57344;
            boolean zM87157i = c28655q.m87157i(interfaceC23462h) | (i15 == 2048) | (i16 == 16384);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                interfaceC30057d = null;
                objM87133R2 = new b(offerId, source, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                interfaceC30057d = null;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c11145bM38652g);
            boolean zM87157i2 = c28655q.m87157i(actionRouter) | (i16 == 16384) | (i15 == 2048);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new c(actionRouter, source, offerId, interfaceC30057d);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87254h(offerId, source, (InterfaceC4351m) objM87133R3, c28655q);
            C11146c c11146cM38653h = m38653h(interfaceC28601c1M87260n);
            boolean zM87157i3 = (i16 == 16384) | c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87153g(interfaceC28601c1M87260n) | (i15 == 2048) | c28655q.m87157i(ltoDismissHandler) | c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                C3424a0 c3424a0 = new C3424a0(actionRouter, source, offerId, ltoDismissHandler, navRouter, interfaceC23462h, interfaceC28601c1M87260n, 3);
                c28655q.m87172p0(c3424a0);
                objM87133R4 = c3424a0;
            }
            m38651f(c11146cM38653h, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) navRouter, (Object) actionRouter, (Object) ltoDismissHandler, (Object) offerId, (Object) source, i13, 8, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m38651f(C11146c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1933816448);
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
                    objM87133R = new C13406a(28);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1323226801);
                AbstractC13686e.m38618j(viewState.getFullScreenModal(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1929766255);
                AbstractC13687f.m38625c(viewState, function1, c28655q, i15 & 126);
                AbstractC13688g.m38636i(viewState.getScreenContent(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1929913474);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C11145b m38652g(InterfaceC23462h interfaceC23462h) {
        return (C11145b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C11146c m38653h(InterfaceC28670t2 interfaceC28670t2) {
        return (C11146c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m38654i(C3671a c3671a, String str, String str2, C41153f c41153f, C3673c c3673c, InterfaceC23462h interfaceC23462h, InterfaceC28670t2 interfaceC28670t2, InterfaceC11144a event) {
        C11146c.e sticky;
        AbstractC22676k.m65750j(event, "event");
        InterfaceC11144a interfaceC11144aM11354c = c3671a.m11354c(event);
        if (interfaceC11144aM11354c instanceof InterfaceC11144a.k) {
            m38652g(interfaceC23462h).m30126n((InterfaceC11144a.k) interfaceC11144aM11354c);
        } else if (interfaceC11144aM11354c instanceof InterfaceC11144a.i) {
            InterfaceC11144a.i iVar = (InterfaceC11144a.i) interfaceC11144aM11354c;
            C11146c.d screenContent = m38653h(interfaceC28670t2).getScreenContent();
            c3671a.m11355d(iVar, screenContent != null ? screenContent.getSelectedCardId() : null, str, str2);
            C11146c.d screenContent2 = m38653h(interfaceC28670t2).getScreenContent();
            if (screenContent2 != null && (sticky = screenContent2.getSticky()) != null && sticky.getShouldDismissTile()) {
                c41153f.m133690e(str2);
            }
            c3673c.m11361e(iVar);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m38655j(C3673c c3673c, C3671a c3671a, C41153f c41153f, String str, String str2, int i13, Composer composer, int i14) {
        m38650e(c3673c, c3671a, c41153f, str, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m38656k(InterfaceC11144a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m38657l(C11146c c11146c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38651f(c11146c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

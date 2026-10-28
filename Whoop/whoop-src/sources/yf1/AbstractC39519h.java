package yf1;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
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
import vf1.C35946a;
import vf1.C35948c;
import vf3.InterfaceC35951a;
import vv2.C36537c;
import wf1.C37244b;
import wf1.C37245c;
import wf1.InterfaceC37243a;
import wq1.C37508b;
import xf3.C38266c;
import yb1.C39389a;

/* JADX INFO: renamed from: yf1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lwf1/a$e;", "screenViewEvent", "Lvf1/c;", "navRouter", "Lvf1/a;", "actionRouter", "Ll83/a0;", "e", "(Lwf1/a$e;Lvf1/c;Lvf1/a;Landroidx/compose/runtime/Composer;I)V", "Lwf1/c;", "viewState", "Lkotlin/Function1;", "Lwf1/a;", "onEvent", "f", "(Lwf1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwf1/b;", "viewModel", "feedback-survey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39519h {

    /* JADX INFO: renamed from: yf1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f169946w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f169947x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f169948y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f169949z;

        /* JADX INFO: renamed from: yf1.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42693a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f169950w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42693a(C21647a c21647a) {
                super(0);
                this.f169950w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f169950w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f169946w = c38266c;
            this.f169947x = interfaceC35951a;
            this.f169948y = interfaceC4339a;
            this.f169949z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, wf1.b] */
        @Override // c93.InterfaceC4339a
        public final C37244b invoke() {
            return AbstractC21598x.m60668X(this.f169946w, this.f169947x, new C42693a(this.f169949z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37244b.class), null, this.f169948y);
        }
    }

    /* JADX INFO: renamed from: yf1.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.view.FeedbackSurveyScreenKt$FeedbackSurveyScreen$1$1", m100430f = "FeedbackSurveyScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169951w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35946a f169952x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC37243a.e f169953y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f169954z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C35946a c35946a, InterfaceC37243a.e eVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169952x = c35946a;
            this.f169953y = eVar;
            this.f169954z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f169952x, this.f169953y, this.f169954z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169951w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f169952x.m114190c(this.f169953y);
            AbstractC39519h.m126224g(this.f169954z).m119367n(InterfaceC37243a.i.f159307a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m126222e(InterfaceC37243a.e screenViewEvent, C35948c navRouter, C35946a actionRouter, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(screenViewEvent, "screenViewEvent");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2130495142);
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
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m126224g(interfaceC23462h).getViewState(), new C37245c(null, new C37245c.c(C33205o0.f138451a.m105288b(), null, null, null, null, 30, null), null, 5, null), null, c28655q, 0, 2);
            C37244b c37244bM126224g = m126224g(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(actionRouter) | ((i14 & 14) == 4) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(actionRouter, screenViewEvent, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c37244bM126224g);
            C37245c c37245cM126225h = m126225h(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C37082e1(actionRouter, navRouter, interfaceC23462h, 15);
                c28655q.m87172p0(objM87133R3);
            }
            m126223f(c37245cM126225h, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(screenViewEvent, navRouter, actionRouter, i13, 14);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m126223f(C37245c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1106899680);
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
                    objM87133R = new C39389a(10);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1421291283);
                AbstractC39515d.m126186j(viewState.getFullScreenModal(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(-1110234733);
                AbstractC39517f.m126193c(viewState, function1, c28655q, i15 & 126);
                AbstractC39518g.m126206k(viewState.getScreenContent(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1110091358);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, function2, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C37244b m126224g(InterfaceC23462h interfaceC23462h) {
        return (C37244b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C37245c m126225h(InterfaceC28670t2 interfaceC28670t2) {
        return (C37245c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126226i(C35946a c35946a, C35948c c35948c, InterfaceC23462h interfaceC23462h, InterfaceC37243a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC37243a interfaceC37243aM114190c = c35946a.m114190c(event);
        if (interfaceC37243aM114190c instanceof InterfaceC37243a.l) {
            m126224g(interfaceC23462h).m119367n((InterfaceC37243a.l) interfaceC37243aM114190c);
        } else if (interfaceC37243aM114190c instanceof InterfaceC37243a.h) {
            c35948c.m114192b((InterfaceC37243a.h) interfaceC37243aM114190c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m126227j(InterfaceC37243a.e eVar, C35948c c35948c, C35946a c35946a, int i13, Composer composer, int i14) {
        m126222e(eVar, c35948c, c35946a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126228k(InterfaceC37243a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126229l(C37245c c37245c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126223f(c37245c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

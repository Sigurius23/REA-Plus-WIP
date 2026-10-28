package w60;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy1.AbstractC14874j;
import gv1.InterfaceC16239m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26967q;
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
import s90.C32290f;
import t60.C33548a;
import t60.C33550c;
import u60.C34550b;
import u60.C34551c;
import u60.InterfaceC34549a;
import v11.C35546d;
import vf3.InterfaceC35951a;
import w01.C36680e;
import xf3.C38266c;

/* JADX INFO: renamed from: w60.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "source", "achievementType", "Lt60/c;", "navRouter", "Lt60/a;", "actionRouter", "Ll83/a0;", "g", "(Ljava/lang/String;Ljava/lang/String;Lt60/c;Lt60/a;Landroidx/compose/runtime/Composer;I)V", "Lu60/c;", "viewState", "Lkotlin/Function1;", "Lu60/a;", "onEvent", "Lgv1/m;", "onLottieTesterOverrideViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lu60/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lu60/b;", "viewModel", "achievements_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36858f {

    /* JADX INFO: renamed from: w60.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f157640w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f157641x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f157642y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f157643z;

        /* JADX INFO: renamed from: w60.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42576a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f157644w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42576a(C21647a c21647a) {
                super(0);
                this.f157644w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f157644w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f157640w = c38266c;
            this.f157641x = interfaceC35951a;
            this.f157642y = interfaceC4339a;
            this.f157643z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, u60.b] */
        @Override // c93.InterfaceC4339a
        public final C34550b invoke() {
            return AbstractC21598x.m60668X(this.f157640w, this.f157641x, new C42576a(this.f157643z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34550b.class), null, this.f157642y);
        }
    }

    /* JADX INFO: renamed from: w60.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.view.AchievementsScreenKt$AchievementsScreen$1$1", m100430f = "AchievementsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f157645E;

        /* JADX INFO: renamed from: w */
        int f157646w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33548a f157647x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f157648y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f157649z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C33548a c33548a, String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157647x = c33548a;
            this.f157648y = str;
            this.f157649z = str2;
            this.f157645E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f157647x, this.f157648y, this.f157649z, this.f157645E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157646w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f157647x.m105944d(new InterfaceC34549a.e(this.f157648y));
            AbstractC36858f.m118195i(this.f157645E).m109208p(new InterfaceC34549a.i(this.f157649z, this.f157648y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w60.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.view.AchievementsScreenKt$AchievementsScreen$2$1", m100430f = "AchievementsScreen.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157650w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f157651x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33550c f157652y;

        /* JADX INFO: renamed from: w60.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C33550c f157653w;

            public a(C33550c c33550c) {
                this.f157653w = c33550c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC34549a.g gVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f157653w.m105945a(gVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C33550c c33550c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157651x = interfaceC23462h;
            this.f157652y = c33550c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f157651x, this.f157652y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f157650w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM109206n = AbstractC36858f.m118195i(this.f157651x).getNavigationEvents();
                a aVar = new a(this.f157652y);
                this.f157650w = 1;
                if (interfaceC13058lM109206n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: g */
    public static final void m118193g(String source, String achievementType, C33550c navRouter, C33548a c33548a, Composer composer, int i13) {
        int i14;
        Object obj;
        InterfaceC23462h interfaceC23462h;
        C33548a actionRouter = c33548a;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(achievementType, "achievementType");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(413897913);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(achievementType) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(actionRouter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
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
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G);
                obj = interfaceC23462hM92087G;
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) obj;
            c28655q.m87173q(false);
            boolean z4 = false;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m118195i(interfaceC23462h2).getViewState(), new C34551c(null, new C34551c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), false ? 1 : 0, false ? 1 : 0, 13, null), null, c28655q, 0, 2);
            C34550b c34550bM118195i = m118195i(interfaceC23462h2);
            boolean zM87157i = ((i14 & 14) == 4) | c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h2);
            if ((i14 & 112) == 32) {
                z4 = true;
            }
            boolean z13 = zM87157i | z4;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                interfaceC23462h = interfaceC23462h2;
                b bVar = new b(actionRouter, source, achievementType, interfaceC23462h, null);
                actionRouter = actionRouter;
                c28655q.m87172p0(bVar);
                objM87133R2 = bVar;
            } else {
                interfaceC23462h = interfaceC23462h2;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c34550bM118195i);
            C34550b c34550bM118195i2 = m118195i(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            Object obj2 = objM87133R3;
            if (zM87157i2 || objM87133R3 == c28676v0) {
                c cVar = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(cVar);
                obj2 = cVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj2, c34550bM118195i2);
            AbstractC14874j.m42904c(m118196j(interfaceC28601c1M87260n), "achievements", c28655q, 48);
            C34551c c34551cM118196j = m118196j(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            Object obj3 = objM87133R4;
            if (zM87157i3 || objM87133R4 == c28676v0) {
                C32290f c32290f = new C32290f(actionRouter, navRouter, interfaceC23462h, 26);
                c28655q.m87172p0(c32290f);
                obj3 = c32290f;
            }
            Function1 function1 = (Function1) obj3;
            boolean zM87157i4 = c28655q.m87157i(interfaceC23462h);
            Object objM87133R5 = c28655q.m87133R();
            Object obj4 = objM87133R5;
            if (zM87157i4 || objM87133R5 == c28676v0) {
                C26967q c26967q = new C26967q(interfaceC23462h, 7);
                c28655q.m87172p0(c26967q);
                obj4 = c26967q;
            }
            m118194h(c34551cM118196j, function1, (Function1) obj4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(source, achievementType, navRouter, actionRouter, i13, 22);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m118194h(C34551c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        Function1 function4;
        Function1 function5;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-165495091);
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
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C36680e(16);
                    c28655q.m87172p0(objM87133R);
                }
                function5 = (Function1) objM87133R;
            } else {
                function5 = function1;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36680e(17);
                    c28655q.m87172p0(objM87133R2);
                }
                function6 = (Function1) objM87133R2;
            } else {
                function6 = function2;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-126984392);
                AbstractC36854b.m118149h(viewState.getFullScreenModal(), function5, c28655q, i15 & 112, 0);
                c28655q.m87173q(false);
                function7 = function5;
                function8 = function6;
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(358575425);
                AbstractC36855c.m118161d(viewState, function5, c28655q, i15 & 126, 0);
                int i18 = i15 & 1022;
                function7 = function5;
                function8 = function6;
                AbstractC36857e.m118175k(viewState, function7, function8, c28655q, i18, 0);
                c28655q.m87173q(false);
            } else {
                function7 = function5;
                function8 = function6;
                c28655q.m87150e0(358846613);
                c28655q.m87173q(false);
            }
            function4 = function8;
            function3 = function7;
        } else {
            c28655q.m87138X();
            function3 = function1;
            function4 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36856d(viewState, function3, function4, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C34550b m118195i(InterfaceC23462h interfaceC23462h) {
        return (C34550b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final C34551c m118196j(InterfaceC28670t2 interfaceC28670t2) {
        return (C34551c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m118197k(C33548a c33548a, C33550c c33550c, InterfaceC23462h interfaceC23462h, InterfaceC34549a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC34549a interfaceC34549aM105944d = c33548a.m105944d(event);
        if (interfaceC34549aM105944d instanceof InterfaceC34549a.j) {
            m118195i(interfaceC23462h).m109208p((InterfaceC34549a.j) interfaceC34549aM105944d);
        } else if (interfaceC34549aM105944d instanceof InterfaceC34549a.g) {
            c33550c.m105945a((InterfaceC34549a.g) interfaceC34549aM105944d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m118198l(InterfaceC23462h interfaceC23462h, InterfaceC16239m it) {
        AbstractC22676k.m65750j(it, "it");
        m118195i(interfaceC23462h).m109207o(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m118199m(String str, String str2, C33550c c33550c, C33548a c33548a, int i13, Composer composer, int i14) {
        m118193g(str, str2, c33550c, c33548a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m118200n(InterfaceC34549a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m118201o(InterfaceC16239m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m118202p(C34551c c34551c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m118194h(c34551c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

package ph1;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import be1.C3172f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy1.AbstractC14874j;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mh1.C25558a;
import mh1.C25560c;
import nf3.C26669a;
import nh1.C26721b;
import nh1.C26722c;
import nh1.InterfaceC26720a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p395p6.C28884h1;
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

/* JADX INFO: renamed from: ph1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "source", "giftType", "testCount", "selectedTier", "Lmh1/c;", "navRouter", "Lmh1/a;", "actionRouter", "Ll83/a0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh1/c;Lmh1/a;Landroidx/compose/runtime/Composer;I)V", "Lnh1/c;", "viewState", "Lkotlin/Function1;", "Lnh1/a;", "onEvent", "f", "(Lnh1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lnh1/b;", "viewModel", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29247k {

    /* JADX INFO: renamed from: ph1.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f118360w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f118361x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f118362y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f118363z;

        /* JADX INFO: renamed from: ph1.k$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42168a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f118364w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42168a(C21647a c21647a) {
                super(0);
                this.f118364w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f118364w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f118360w = c38266c;
            this.f118361x = interfaceC35951a;
            this.f118362y = interfaceC4339a;
            this.f118363z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nh1.b] */
        @Override // c93.InterfaceC4339a
        public final C26721b invoke() {
            return AbstractC21598x.m60668X(this.f118360w, this.f118361x, new C42168a(this.f118363z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26721b.class), null, this.f118362y);
        }
    }

    /* JADX INFO: renamed from: ph1.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.view.GiftingScreenKt$GiftingScreen$1$1", m100430f = "GiftingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f118365E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f118366F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC23462h f118367G;

        /* JADX INFO: renamed from: w */
        int f118368w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25558a f118369x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f118370y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f118371z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25558a c25558a, String str, String str2, String str3, String str4, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118369x = c25558a;
            this.f118370y = str;
            this.f118371z = str2;
            this.f118365E = str3;
            this.f118366F = str4;
            this.f118367G = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f118369x, this.f118370y, this.f118371z, this.f118365E, this.f118366F, this.f118367G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f118368w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f118369x.m75160c(new InterfaceC26720a.k(this.f118370y, this.f118371z));
            AbstractC29247k.m88843g(this.f118367G).m79470o(new InterfaceC26720a.q(this.f118370y, this.f118371z, this.f118365E, this.f118366F));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ph1.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.view.GiftingScreenKt$GiftingScreen$2$1", m100430f = "GiftingScreen.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118372w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f118373x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25560c f118374y;

        /* JADX INFO: renamed from: ph1.k$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C25560c f118375w;

            public a(C25560c c25560c) {
                this.f118375w = c25560c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC26720a.n nVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f118375w.m75162b(nVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C25560c c25560c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118373x = interfaceC23462h;
            this.f118374y = c25560c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f118373x, this.f118374y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118372w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM79469n = AbstractC29247k.m88843g(this.f118373x).getNavigationEvents();
                a aVar = new a(this.f118374y);
                this.f118372w = 1;
                if (interfaceC13058lM79469n.collect(aVar, this) == enumC31071a) {
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
    public static final void m88841e(String source, String str, String testCount, String selectedTier, C25560c navRouter, C25558a c25558a, Composer composer, int i13) {
        int i14;
        Object obj;
        Object bVar;
        InterfaceC23462h interfaceC23462h;
        String giftType = str;
        C25558a actionRouter = c25558a;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1176715659);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(giftType) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(testCount) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(selectedTier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(actionRouter) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
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
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m88843g(interfaceC23462h2).getViewState(), new C26722c(null, new C26722c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), false ? 1 : 0, 5, null), null, c28655q, 0, 2);
            C26721b c26721bM88843g = m88843g(interfaceC23462h2);
            boolean zM87157i = c28655q.m87157i(actionRouter) | ((i14 & 14) == 4) | ((i14 & 112) == 32) | c28655q.m87157i(interfaceC23462h2) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                bVar = new b(c25558a, source, giftType, testCount, selectedTier, interfaceC23462h2, null);
                actionRouter = c25558a;
                interfaceC23462h = interfaceC23462h2;
                giftType = giftType;
                c28655q.m87172p0(bVar);
            } else {
                interfaceC23462h = interfaceC23462h2;
                bVar = objM87133R2;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) bVar, c26721bM88843g);
            C26721b c26721bM88843g2 = m88843g(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            Object obj2 = objM87133R3;
            if (zM87157i2 || objM87133R3 == c28676v0) {
                c cVar = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(cVar);
                obj2 = cVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj2, c26721bM88843g2);
            AbstractC14874j.m42904c(m88844h(interfaceC28601c1M87260n), "gifting_".concat(giftType), c28655q, 0);
            C26722c c26722cM88844h = m88844h(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            Object obj3 = objM87133R4;
            if (zM87157i3 || objM87133R4 == c28676v0) {
                C26954j0 c26954j0 = new C26954j0(actionRouter, navRouter, interfaceC23462h, 11);
                c28655q.m87172p0(c26954j0);
                obj3 = c26954j0;
            }
            m88842f(c26722cM88844h, (Function1) obj3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(source, giftType, testCount, selectedTier, navRouter, actionRouter, i13, 13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m88842f(C26722c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1222212626);
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
                    objM87133R = new C28884h1(22);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-2020256812);
                AbstractC29241e.m88760k(viewState.getFullScreenModal(), function3, c28655q, i15 & 112, 0);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1796663187);
                AbstractC29243g.m88769d(viewState, function3, c28655q, i15 & 126, 0);
                AbstractC29245i.m88781I(viewState.getScreenContent(), function3, null, false, c28655q, i15 & 112, 12);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1796793108);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29242f(viewState, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C26721b m88843g(InterfaceC23462h interfaceC23462h) {
        return (C26721b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C26722c m88844h(InterfaceC28670t2 interfaceC28670t2) {
        return (C26722c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m88845i(C25558a c25558a, C25560c c25560c, InterfaceC23462h interfaceC23462h, InterfaceC26720a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC26720a interfaceC26720aM75160c = c25558a.m75160c(event);
        if (interfaceC26720aM75160c instanceof InterfaceC26720a.s) {
            m88843g(interfaceC23462h).m79470o((InterfaceC26720a.s) interfaceC26720aM75160c);
        } else if (interfaceC26720aM75160c instanceof InterfaceC26720a.n) {
            c25560c.m75162b((InterfaceC26720a.n) interfaceC26720aM75160c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m88846j(String str, String str2, String str3, String str4, C25560c c25560c, C25558a c25558a, int i13, Composer composer, int i14) {
        m88841e(str, str2, str3, str4, c25560c, c25558a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m88847k(InterfaceC26720a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m88848l(C26722c c26722c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m88842f(c26722c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

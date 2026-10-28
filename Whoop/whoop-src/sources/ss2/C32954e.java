package ss2;

import com.whoop.weeklyplan.api.ChallengeLandingResponse;
import com.whoop.weeklyplan.api.WeeklyPlanChallengeGetRequest;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ss2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lss2/e;", "Lod1/g;", "Lss2/b;", "Lss2/c;", "Lnm0/e;", "cachedApiSource", "Lls2/b;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lls2/b;Ltr2/n;)V", "", "source", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lec3/l;", "Ll83/a0;", "i", "(Ljava/lang/String;)V", "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "response", "Lss2/c$c;", "g", "(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/c$c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lls2/b;", "c", "Ltr2/n;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32954e implements InterfaceC27844g<AbstractC32951b, AbstractC32952c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24717b analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ss2.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.domain.ChallengeLandingInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "ChallengeLandingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137264w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f137265x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137266y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f137267z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f137267z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f137267z);
            aVar.f137265x = interfaceC13062m;
            aVar.f137266y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137264w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f137265x;
                C26832c c26832c = (C26832c) this.f137266y;
                InterfaceC26834e interfaceC26834e = this.f137267z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ChallengeLandingResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ChallengeLandingResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f137265x = null;
                this.f137266y = null;
                this.f137264w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ss2.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f137268w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32954e f137269x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f137270y;

        /* JADX INFO: renamed from: ss2.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f137271w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32954e f137272x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f137273y;

            /* JADX INFO: renamed from: ss2.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.domain.ChallengeLandingInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "ChallengeLandingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42345a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f137274E;

                /* JADX INFO: renamed from: F */
                Object f137275F;

                /* JADX INFO: renamed from: G */
                Object f137276G;

                /* JADX INFO: renamed from: H */
                int f137277H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f137278w;

                /* JADX INFO: renamed from: x */
                int f137279x;

                /* JADX INFO: renamed from: y */
                Object f137280y;

                public C42345a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f137278w = obj;
                    this.f137279x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32954e c32954e, String str) {
                this.f137271w = interfaceC13062m;
                this.f137272x = c32954e;
                this.f137273y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42345a c42345a;
                Object aVar;
                AbstractC32952c.a aVar2;
                if (interfaceC30057d instanceof C42345a) {
                    c42345a = (C42345a) interfaceC30057d;
                    int i13 = c42345a.f137279x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42345a.f137279x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42345a = new C42345a(interfaceC30057d);
                    }
                } else {
                    c42345a = new C42345a(interfaceC30057d);
                }
                Object obj2 = c42345a.f137278w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42345a.f137279x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f137271w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        aVar = AbstractC32952c.b.f137255a;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        this.f137272x.m104067i(this.f137273y);
                        aVar = this.f137272x.m104065g((ChallengeLandingResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        aVar = AbstractC32952c.b.f137255a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                            this.f137272x.logger.mo85222m(AbstractC11266d.m30461o("Fetching challenge landing failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            aVar2 = new AbstractC32952c.a(cVar.getErrorMessage());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            this.f137272x.logger.mo85222m(AbstractC11266d.m30461o("Fetching challenge landing failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            aVar2 = new AbstractC32952c.a(dVar.getErrorMessage());
                        } else {
                            this.f137272x.logger.mo85222m("Fetching challenge landing failed with unknown error", new AbstractC30556a.a[0]);
                            aVar = new AbstractC32952c.a("Fetching challenge landing failed with unknown error");
                        }
                        aVar = aVar2;
                    }
                    c42345a.f137280y = null;
                    c42345a.f137274E = null;
                    c42345a.f137275F = null;
                    c42345a.f137276G = null;
                    c42345a.f137277H = 0;
                    c42345a.f137279x = 1;
                    if (interfaceC13062m.emit(aVar, c42345a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C32954e c32954e, String str) {
            this.f137268w = interfaceC13058l;
            this.f137269x = c32954e;
            this.f137270y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f137268w.collect(new a(interfaceC13062m, this.f137269x, this.f137270y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ss2.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.domain.ChallengeLandingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ChallengeLandingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137282w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f137283x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137284y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32954e f137285z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C32954e c32954e) {
            super(3, interfaceC30057d);
            this.f137285z = c32954e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC32951b abstractC32951b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f137285z);
            cVar.f137283x = interfaceC13062m;
            cVar.f137284y = abstractC32951b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137282w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f137283x;
                AbstractC32951b abstractC32951b = (AbstractC32951b) this.f137284y;
                if (!(abstractC32951b instanceof AbstractC32951b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM104066h = this.f137285z.m104066h(((AbstractC32951b.a) abstractC32951b).getSource());
                this.f137283x = null;
                this.f137284y = null;
                this.f137282w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM104066h, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC32951b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C32954e(InterfaceC26834e cachedApiSource, C24717b analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC32952c.c m104065g(ChallengeLandingResponse response) {
        return new AbstractC32952c.c(C32955f.f137286a.m104068a(response), response.getAiContextMetadata());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m104066h(String source) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(WeeklyPlanChallengeGetRequest.INSTANCE, 1), null, null, 3, null), new a(null, this.cachedApiSource)), this, source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m104067i(String source) {
        this.analyticsHelper.m72377q(new AbstractC24716a.t("Empty State", 0, source, null, 8, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}

package tt2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.api.WeeklyPlanGetPresets;
import com.whoop.weeklyplan.weeklyplan.domain.models.MetaData;
import com.whoop.weeklyplan.weeklyplan.domain.models.PresetLandingResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
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
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: tt2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ltt2/c;", "Lod1/g;", "Ltt2/a;", "Ltt2/b;", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "api", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Ltr2/n;)V", "Lec3/l;", "j", "()Lec3/l;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;", "response", "Ltt2/b$f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;)Ltt2/b$f;", "", "planId", "i", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "b", "Lnm0/e;", "c", "Ltr2/n;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34165c implements InterfaceC27844g<AbstractC34163a, AbstractC34164b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeeklyPlanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tt2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor", m100430f = "PresetLandingInteractor.kt", m100431l = {84}, m100432m = "cancelPlan", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f143214w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143215x;

        /* JADX INFO: renamed from: z */
        int f143217z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143215x = obj;
            this.f143217z |= Integer.MIN_VALUE;
            return C34165c.this.m107962i(null, this);
        }
    }

    /* JADX INFO: renamed from: tt2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$cancelPlan$response$1", m100430f = "PresetLandingInteractor.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f143218w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f143220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f143220y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34165c.this.new b(this.f143220y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143218w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeeklyPlanApi weeklyPlanApi = C34165c.this.api;
            String str = this.f143220y;
            this.f143218w = 1;
            Object objCancelPlan = weeklyPlanApi.cancelPlan(str, this);
            return objCancelPlan == enumC31071a ? enumC31071a : objCancelPlan;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: tt2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "PresetLandingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143221w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143222x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143223y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f143224z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f143224z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f143224z);
            cVar.f143222x = interfaceC13062m;
            cVar.f143223y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143221w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f143222x;
                C26832c c26832c = (C26832c) this.f143223y;
                InterfaceC26834e interfaceC26834e = this.f143224z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PresetLandingResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PresetLandingResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f143222x = null;
                this.f143223y = null;
                this.f143221w = 1;
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

    /* JADX INFO: renamed from: tt2.c$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f143225w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34165c f143226x;

        /* JADX INFO: renamed from: tt2.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f143227w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34165c f143228x;

            /* JADX INFO: renamed from: tt2.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "PresetLandingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42418a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f143229E;

                /* JADX INFO: renamed from: F */
                Object f143230F;

                /* JADX INFO: renamed from: G */
                Object f143231G;

                /* JADX INFO: renamed from: H */
                int f143232H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f143233w;

                /* JADX INFO: renamed from: x */
                int f143234x;

                /* JADX INFO: renamed from: y */
                Object f143235y;

                public C42418a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f143233w = obj;
                    this.f143234x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34165c c34165c) {
                this.f143227w = interfaceC13062m;
                this.f143228x = c34165c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42418a c42418a;
                Object dVar;
                AbstractC34164b.d dVar2;
                if (interfaceC30057d instanceof C42418a) {
                    c42418a = (C42418a) interfaceC30057d;
                    int i13 = c42418a.f143234x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42418a.f143234x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42418a = new C42418a(interfaceC30057d);
                    }
                } else {
                    c42418a = new C42418a(interfaceC30057d);
                }
                Object obj2 = c42418a.f143233w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42418a.f143234x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f143227w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        dVar = AbstractC34164b.e.f143208a;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        dVar = this.f143228x.m107961h((PresetLandingResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        dVar = AbstractC34164b.e.f143208a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.c) {
                            InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                            this.f143228x.logger.mo85222m(AbstractC11266d.m30461o("Fetching edit plan presets failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            dVar2 = new AbstractC34164b.d(cVar.getErrorMessage());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar3 = (InterfaceC29354a.d) interfaceC29354a;
                            this.f143228x.logger.mo85222m(AbstractC11266d.m30461o("Fetching edit plan presets failed ", dVar3.getErrorMessage()), new AbstractC30556a.a[0]);
                            dVar2 = new AbstractC34164b.d(dVar3.getErrorMessage());
                        } else {
                            this.f143228x.logger.mo85222m("Fetching edit plan presets failed with unknown error", new AbstractC30556a.a[0]);
                            dVar = new AbstractC34164b.d("Fetching edit plan presets failed with unknown error");
                        }
                        dVar = dVar2;
                    }
                    c42418a.f143235y = null;
                    c42418a.f143229E = null;
                    c42418a.f143230F = null;
                    c42418a.f143231G = null;
                    c42418a.f143232H = 0;
                    c42418a.f143234x = 1;
                    if (interfaceC13062m.emit(dVar, c42418a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C34165c c34165c) {
            this.f143225w = interfaceC13058l;
            this.f143226x = c34165c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f143225w.collect(new a(interfaceC13062m, this.f143226x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tt2.c$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PresetLandingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143237w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143238x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143239y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34165c f143240z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C34165c c34165c) {
            super(3, interfaceC30057d);
            this.f143240z = c34165c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34163a abstractC34163a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f143240z);
            eVar.f143238x = interfaceC13062m;
            eVar.f143239y = abstractC34163a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143237w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f143238x;
                AbstractC34163a abstractC34163a = (AbstractC34163a) this.f143239y;
                if (abstractC34163a instanceof AbstractC34163a.a) {
                    c13084s1 = new C13084s1(new f(null));
                } else if (abstractC34163a instanceof AbstractC34163a.c) {
                    c13084s1 = this.f143240z.m107963j();
                } else {
                    if (!(abstractC34163a instanceof AbstractC34163a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f143240z.new g(abstractC34163a, null));
                }
                this.f143238x = null;
                this.f143239y = null;
                this.f143237w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC34163a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: tt2.c$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$interact$1$1", m100430f = "PresetLandingInteractor.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltt2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f143241w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143242x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f143242x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f143242x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143241w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC34164b.e eVar = AbstractC34164b.e.f143208a;
                this.f143242x = null;
                this.f143241w = 1;
                if (interfaceC13062m.emit(eVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tt2.c$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$interact$1$2", m100430f = "PresetLandingInteractor.kt", m100431l = {37, 38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltt2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f143243w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143244x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC34163a f143246z;

        /* JADX INFO: renamed from: tt2.c$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.PresetLandingInteractor$interact$1$2$1", m100430f = "PresetLandingInteractor.kt", m100431l = {39, 39}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC34163a f143247E;

            /* JADX INFO: renamed from: w */
            Object f143248w;

            /* JADX INFO: renamed from: x */
            int f143249x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f143250y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C34165c f143251z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C34165c c34165c, AbstractC34163a abstractC34163a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f143250y = interfaceC13062m;
                this.f143251z = c34165c;
                this.f143247E = abstractC34163a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f143250y, this.f143251z, this.f143247E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f143249x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f143248w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f143250y
                    tt2.c r6 = r5.f143251z
                    tt2.a r4 = r5.f143247E
                    tt2.a$b r4 = (tt2.AbstractC34163a.b) r4
                    java.lang.String r4 = r4.getPlanId()
                    r5.f143248w = r1
                    r5.f143249x = r3
                    java.lang.Object r6 = tt2.C34165c.m107957d(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f143248w = r3
                    r5.f143249x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: tt2.C34165c.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC34163a abstractC34163a, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143246z = abstractC34163a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C34165c.this.new g(this.f143246z, interfaceC30057d);
            gVar.f143244x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f143244x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f143243w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                tt2.b$c r7 = tt2.AbstractC34164b.c.f143206a
                r6.f143244x = r0
                r6.f143243w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                tt2.c$g$a r7 = new tt2.c$g$a
                tt2.c r2 = tt2.C34165c.this
                tt2.a r4 = r6.f143246z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f143244x = r5
                r6.f143243w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: tt2.C34165c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C34165c(WeeklyPlanApi api, InterfaceC26834e cachedApiSource, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final AbstractC34164b.f m107961h(PresetLandingResponse response) {
        MetaData metadata = response.getMetadata();
        return new AbstractC34164b.f(response, metadata != null ? metadata.getAiContextMetadata() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m107962i(String str, InterfaceC30057d<? super AbstractC34164b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f143217z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f143217z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f143215x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f143217z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f143214w = str;
            aVar2.f143217z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to cancel plan", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f143214w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC34164b.b.f143205a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC34164b.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m107963j() {
        return new d(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(WeeklyPlanGetPresets.INSTANCE, 1), null, null, 3, null), new c(null, this.cachedApiSource)), this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new e(null, this));
    }

    public /* synthetic */ C34165c(WeeklyPlanApi weeklyPlanApi, InterfaceC26834e interfaceC26834e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(weeklyPlanApi, interfaceC26834e, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PresetLandingInteractor") : interfaceC34116n);
    }
}

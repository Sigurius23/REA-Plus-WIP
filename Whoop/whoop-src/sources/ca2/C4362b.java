package ca2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.MetricsProcessedTime;
import dt0.InterfaceC12361d;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28204u;
import org.joda.time.DateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ca2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020!0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lca2/b;", "", "Lzr2/a;", "timeProvider", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "Ldt0/d;", "dataSyncService", "<init>", "(Lzr2/a;Ltr2/n;Lbc3/c0;Ldt0/d;)V", "Lcom/whoop/domain/model/MetricsProcessedTime;", "metricsProcessedTime", "Lca2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/domain/model/MetricsProcessedTime;)Lca2/c;", "", "j", "(Lcom/whoop/domain/model/MetricsProcessedTime;)Z", "Lorg/joda/time/DateTime;", "i", "(Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;", "timestamp", "", "f", "(Lorg/joda/time/DateTime;)I", "a", "Lzr2/a;", "b", "Ltr2/n;", "c", "Ldt0/d;", "Lca2/a;", "d", "Lca2/a;", "initial", "Lec3/l;", "e", "Lec3/l;", "g", "()Lec3/l;", "dataCatchingUpDomainResultFlow", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4362b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a timeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12361d dataSyncService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4361a initial;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l dataCatchingUpDomainResultFlow;

    /* JADX INFO: renamed from: ca2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.sync.DataCatchingUpHelper$dataCatchingUpDomainResultFlow$3", m100430f = "DataCatchingUpHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lca2/a;", "previousDomainResult", "Lca2/d;", "action", "<anonymous>", "(Lca2/a;Lca2/d;)Lca2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f17645w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f17646x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f17647y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4361a c4361a, C4364d c4364d, InterfaceC30057d<? super C4361a> interfaceC30057d) {
            a aVar = C4362b.this.new a(interfaceC30057d);
            aVar.f17646x = c4361a;
            aVar.f17647y = c4364d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC4363c enumC4363c;
            EnumC4363c enumC4363c2;
            C4361a c4361a = (C4361a) this.f17646x;
            C4364d c4364d = (C4364d) this.f17647y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f17645w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC4363c state = c4361a.getState();
            EnumC4363c newState = c4364d.getNewState();
            EnumC4363c enumC4363c3 = EnumC4363c.CATCHING_UP;
            if (newState == enumC4363c3) {
                DateTime lastSyncTimeStamp = c4361a.getLastSyncTimeStamp();
                if (!C4362b.this.m13747i(c4364d.getMetricsProcessedTime()).isBefore(lastSyncTimeStamp) || c4361a.equals(C4362b.this.initial)) {
                    lastSyncTimeStamp = C4362b.this.m13747i(c4364d.getMetricsProcessedTime());
                }
                return new C4361a(true, lastSyncTimeStamp, enumC4363c3, C4362b.this.m13745f(lastSyncTimeStamp));
            }
            if (state == enumC4363c3 && newState == (enumC4363c2 = EnumC4363c.CAUGHT_UP)) {
                return new C4361a(false, C4362b.this.m13747i(c4364d.getMetricsProcessedTime()), enumC4363c2, 0);
            }
            EnumC4363c enumC4363c4 = EnumC4363c.STANDBY;
            if ((state == enumC4363c4 && newState == EnumC4363c.CAUGHT_UP) || (state == (enumC4363c = EnumC4363c.CAUGHT_UP) && newState == enumC4363c)) {
                return new C4361a(false, C4362b.this.m13747i(c4364d.getMetricsProcessedTime()), enumC4363c4, 0);
            }
            C4362b.this.logger.mo85222m("Old state: " + state + " and New State: " + newState, new AbstractC30556a.a[0]);
            throw new IllegalStateException("Illegal Data Catching Up State");
        }
    }

    /* JADX INFO: renamed from: ca2.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f17649w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4362b f17650x;

        /* JADX INFO: renamed from: ca2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f17651w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4362b f17652x;

            /* JADX INFO: renamed from: ca2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.sync.DataCatchingUpHelper$special$$inlined$mapNotNull$1$2", m100430f = "DataCatchingUpHelper.kt", m100431l = {53}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41334a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f17653E;

                /* JADX INFO: renamed from: F */
                Object f17654F;

                /* JADX INFO: renamed from: G */
                Object f17655G;

                /* JADX INFO: renamed from: H */
                Object f17656H;

                /* JADX INFO: renamed from: I */
                int f17657I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f17658w;

                /* JADX INFO: renamed from: x */
                int f17659x;

                /* JADX INFO: renamed from: y */
                Object f17660y;

                public C41334a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f17658w = obj;
                    this.f17659x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4362b c4362b) {
                this.f17651w = interfaceC13062m;
                this.f17652x = c4362b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41334a c41334a;
                if (interfaceC30057d instanceof C41334a) {
                    c41334a = (C41334a) interfaceC30057d;
                    int i13 = c41334a.f17659x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41334a.f17659x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41334a = new C41334a(interfaceC30057d);
                    }
                } else {
                    c41334a = new C41334a(interfaceC30057d);
                }
                Object obj2 = c41334a.f17658w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41334a.f17659x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f17651w;
                    long jLongValue = ((Number) obj).longValue();
                    this.f17652x.logger.mo85228t("Consuming DSS for high watermark", new AbstractC30556a.a[0]);
                    MetricsProcessedTime metricsProcessedTime = new MetricsProcessedTime(jLongValue);
                    c41334a.f17660y = null;
                    c41334a.f17653E = null;
                    c41334a.f17654F = null;
                    c41334a.f17655G = null;
                    c41334a.f17656H = null;
                    c41334a.f17657I = 0;
                    c41334a.f17659x = 1;
                    if (interfaceC13062m.emit(metricsProcessedTime, c41334a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C4362b c4362b) {
            this.f17649w = interfaceC13058l;
            this.f17650x = c4362b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f17649w.collect(new a(interfaceC13062m, this.f17650x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ca2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.sync.DataCatchingUpHelper$special$$inlined$transform$1", m100430f = "DataCatchingUpHelper.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17662w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f17663x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f17664y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4362b f17665z;

        /* JADX INFO: renamed from: ca2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f17666w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4362b f17667x;

            /* JADX INFO: renamed from: ca2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.sync.DataCatchingUpHelper$special$$inlined$transform$1$1", m100430f = "DataCatchingUpHelper.kt", m100431l = {41}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41335a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f17668E;

                /* JADX INFO: renamed from: F */
                Object f17669F;

                /* JADX INFO: renamed from: G */
                Object f17670G;

                /* JADX INFO: renamed from: H */
                Object f17671H;

                /* JADX INFO: renamed from: I */
                int f17672I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f17673w;

                /* JADX INFO: renamed from: x */
                int f17674x;

                /* JADX INFO: renamed from: z */
                Object f17676z;

                public C41335a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f17673w = obj;
                    this.f17674x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4362b c4362b) {
                this.f17667x = c4362b;
                this.f17666w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C41335a c41335a;
                if (interfaceC30057d instanceof C41335a) {
                    c41335a = (C41335a) interfaceC30057d;
                    int i13 = c41335a.f17674x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41335a.f17674x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41335a = new C41335a(interfaceC30057d);
                    }
                } else {
                    c41335a = new C41335a(interfaceC30057d);
                }
                Object obj = c41335a.f17673w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41335a.f17674x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f17666w;
                    MetricsProcessedTime metricsProcessedTime = (MetricsProcessedTime) t14;
                    if (metricsProcessedTime.getMillis() != 0) {
                        C4364d c4364d = new C4364d(metricsProcessedTime, this.f17667x.m13746h(metricsProcessedTime));
                        c41335a.f17676z = null;
                        c41335a.f17668E = null;
                        c41335a.f17669F = null;
                        c41335a.f17670G = null;
                        c41335a.f17671H = null;
                        c41335a.f17672I = 0;
                        c41335a.f17674x = 1;
                        if (interfaceC13062m.emit(c4364d, c41335a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C4362b c4362b) {
            super(2, interfaceC30057d);
            this.f17664y = interfaceC13058l;
            this.f17665z = c4362b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f17664y, interfaceC30057d, this.f17665z);
            cVar.f17663x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17662w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f17663x;
                InterfaceC13058l interfaceC13058l = this.f17664y;
                a aVar = new a(interfaceC13062m, this.f17665z);
                this.f17663x = null;
                this.f17662w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public C4362b(InterfaceC41070a timeProvider, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, InterfaceC12361d dataSyncService) {
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dataSyncService, "dataSyncService");
        this.timeProvider = timeProvider;
        this.logger = logger;
        this.dataSyncService = dataSyncService;
        C4361a c4361a = new C4361a(false, timeProvider.mo133364c(), null, 0, 4, null);
        this.initial = c4361a;
        this.dataCatchingUpDomainResultFlow = AbstractC13091v.m36586L(new C13060l1(c4361a, new C13084s1(new c(new b(dataSyncService.getHighWaterMark(), this), null, this)), new a(null)), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final int m13745f(DateTime timestamp) {
        long jMo133363b = this.timeProvider.mo133363b() - timestamp.getMillis();
        Duration.Companion companion = Duration.INSTANCE;
        return (int) (jMo133363b / Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.MINUTES)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final EnumC4363c m13746h(MetricsProcessedTime metricsProcessedTime) {
        return m13748j(metricsProcessedTime) ? EnumC4363c.CATCHING_UP : EnumC4363c.CAUGHT_UP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final DateTime m13747i(MetricsProcessedTime metricsProcessedTime) {
        DateTime dateTime = metricsProcessedTime.getTime().toDateTime();
        AbstractC22676k.m65749i(dateTime, "toDateTime(...)");
        return dateTime;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m13748j(MetricsProcessedTime metricsProcessedTime) {
        return this.timeProvider.mo133363b() - metricsProcessedTime.getTime().toDateTime().getMillis() > C28204u.INSTANCE.m85365h();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC13058l getDataCatchingUpDomainResultFlow() {
        return this.dataCatchingUpDomainResultFlow;
    }
}

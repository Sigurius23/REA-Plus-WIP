package qh2;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import ca2.InterfaceC4368h;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import dk0.AbstractC12109i;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.List;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import l83.C23454a0;
import lt0.AbstractC24734k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lqh2/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lbc3/c0;", "coroutineScope", "Liy1/c;", "metricsInteractor", "Lci2/b;", "whoopStrapProvider", "Lca2/h;", "rawDataTrackingService", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Liy1/c;Lci2/b;Lca2/h;Ljava/time/Clock;Ltr2/n;)V", "Lec3/l;", "Lqh2/a;", "f", "()Lec3/l;", "", "historySyncDelta", "Ll83/a0;", "e", "(JLq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Liy1/c;", "y", "Lci2/b;", "z", "Lca2/h;", "E", "Ljava/time/Clock;", "F", "Ltr2/n;", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30370b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: qh2.b$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f124589w;

        /* JADX INFO: renamed from: qh2.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42222a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f124590w;

            /* JADX INFO: renamed from: qh2.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.strapPipelineAnalytics.MetricsHistorySync$fetchMetricsMetadata$$inlined$filter$1$2", m100430f = "MetricsHistorySync.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42223a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f124592F;

                /* JADX INFO: renamed from: G */
                Object f124593G;

                /* JADX INFO: renamed from: H */
                int f124594H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f124595w;

                /* JADX INFO: renamed from: x */
                int f124596x;

                /* JADX INFO: renamed from: y */
                Object f124597y;

                /* JADX INFO: renamed from: z */
                Object f124598z;

                public C42223a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f124595w = obj;
                    this.f124596x |= Integer.MIN_VALUE;
                    return C42222a.this.emit(null, this);
                }
            }

            public C42222a(InterfaceC13062m interfaceC13062m) {
                this.f124590w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42223a c42223a;
                if (interfaceC30057d instanceof C42223a) {
                    c42223a = (C42223a) interfaceC30057d;
                    int i13 = c42223a.f124596x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42223a.f124596x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42223a = new C42223a(interfaceC30057d);
                    }
                } else {
                    c42223a = new C42223a(interfaceC30057d);
                }
                Object obj2 = c42223a.f124595w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42223a.f124596x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f124590w;
                    if (((AbstractC24734k) obj).getPacket() instanceof AbstractC12109i) {
                        c42223a.f124597y = null;
                        c42223a.f124598z = null;
                        c42223a.f124592F = null;
                        c42223a.f124593G = null;
                        c42223a.f124594H = 0;
                        c42223a.f124596x = 1;
                        if (interfaceC13062m.emit(obj, c42223a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f124589w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f124589w.collect(new C42222a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qh2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.strapPipelineAnalytics.MetricsHistorySync$fetchMetricsMetadata$$inlined$flatMapLatest$1", m100430f = "MetricsHistorySync.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f124599w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f124600x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f124601y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f124600x = interfaceC13062m;
            bVar.f124601y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124599w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f124600x;
                InterfaceC13087t1 interfaceC13087t1Mo24699N = ((InterfaceC21750d) this.f124601y).mo24699N();
                this.f124600x = null;
                this.f124601y = null;
                this.f124599w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13087t1Mo24699N, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qh2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.strapPipelineAnalytics.MetricsHistorySync$fetchMetricsMetadata$3", m100430f = "MetricsHistorySync.kt", m100431l = {81, LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqh2/a;", "accumulator", "Llt0/k;", "packet", "<anonymous>", "(Lqh2/a;Llt0/k;)Lqh2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f124602w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124603x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f124604y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30369a interfaceC30369a, AbstractC24734k abstractC24734k, InterfaceC30057d<? super InterfaceC30369a> interfaceC30057d) {
            c cVar = C30370b.this.new c(interfaceC30057d);
            cVar.f124603x = interfaceC30369a;
            cVar.f124604y = abstractC24734k;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        
            if (r4.mo58700a(r9, r17) == r3) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        
            if (r4.m92851e(r8, r17) == r3) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qh2.C30370b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C30370b(InterfaceC2994c0 coroutineScope, InterfaceC21030c metricsInteractor, InterfaceC4733b whoopStrapProvider, InterfaceC4368h rawDataTrackingService, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.metricsInteractor = metricsInteractor;
        this.whoopStrapProvider = whoopStrapProvider;
        this.rawDataTrackingService = rawDataTrackingService;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final Object m92851e(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zMo13761c = this.rawDataTrackingService.mo13761c();
        List listM118958J = AbstractC37056f.m118958J("is_raw_data_in_strap_or_app_backlog:" + zMo13761c);
        this.logger.mo85216g("Received HistoryCompleteMetadata packet - Total sync latency: " + j7 + ", isRawDataInBacklog: " + zMo13761c, new AbstractC30556a.a[0]);
        Object objMo58700a = this.metricsInteractor.mo58700a(new C22047a(0, "connectivity.strap.app.history_sync_latency", new Double((double) j7), listM118958J, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC13058l m92852f() {
        return new C13060l1(InterfaceC30369a.d.f124581a, new a(AbstractC13091v.m36590P(new C4588i(this.whoopStrapProvider.mo14818b(), 2), new b(null))), new c(null));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.logger.mo85228t("Beginning strap metrics history sync obs", new AbstractC30556a.a[0]);
        AbstractC13091v.m36582H(m92852f(), this.coroutineScope);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}

package lj0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import ca2.InterfaceC4368h;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.metrics.domain.models.MetricPostType;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32975s;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lj0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Llj0/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Liy1/c;", "metricsWriter", "Ljava/time/Clock;", "clock", "Lbc3/c0;", "scope", "Lca2/h;", "rawDataTrackingService", "Lst0/r;", "strapLockStateTracker", "<init>", "(Ltr2/n;Lci2/b;Liy1/c;Ljava/time/Clock;Lbc3/c0;Lca2/h;Lst0/r;)V", "Llj0/k;", "type", "", "packetSize", "Ll83/a0;", "d", "(Llj0/k;DLq83/d;)Ljava/lang/Object;", "c", "()V", "b", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Lci2/b;", "y", "Liy1/c;", "z", "Ljava/time/Clock;", "E", "Lbc3/c0;", "F", "Lca2/h;", "G", "Lst0/r;", "", "Llj0/j;", "H", "Ljava/util/List;", "throughputUpdateList", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24465d implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final List<C24471j> throughputUpdateList;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC21030c metricsWriter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: lj0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.HistoryPullThroughputAnalytics$onCreate$$inlined$flatMapLatest$1", m100430f = "HistoryPullThroughputAnalytics.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f95372w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95373x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f95374y;

        public a(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f95373x = interfaceC13062m;
            aVar.f95374y = interfaceC21750d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95372w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95373x;
                InterfaceC13087t1 interfaceC13087t1Mo24699N = ((InterfaceC21750d) this.f95374y).mo24699N();
                this.f95373x = null;
                this.f95374y = null;
                this.f95372w = 1;
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

    /* JADX INFO: renamed from: lj0.d$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f95375w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24465d f95376x;

        /* JADX INFO: renamed from: lj0.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f95377w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24465d f95378x;

            /* JADX INFO: renamed from: lj0.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.HistoryPullThroughputAnalytics$onCreate$$inlined$map$1$2", m100430f = "HistoryPullThroughputAnalytics.kt", m100431l = {53, 56, 60, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41951a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f95379E;

                /* JADX INFO: renamed from: F */
                Object f95380F;

                /* JADX INFO: renamed from: G */
                Object f95381G;

                /* JADX INFO: renamed from: H */
                Object f95382H;

                /* JADX INFO: renamed from: I */
                Object f95383I;

                /* JADX INFO: renamed from: J */
                Object f95384J;

                /* JADX INFO: renamed from: K */
                int f95385K;

                /* JADX INFO: renamed from: L */
                int f95386L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f95387w;

                /* JADX INFO: renamed from: x */
                int f95388x;

                /* JADX INFO: renamed from: y */
                Object f95389y;

                public C41951a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f95387w = obj;
                    this.f95388x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24465d c24465d) {
                this.f95377w = interfaceC13062m;
                this.f95378x = c24465d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
            
                if (r14.m71186d(r15, 0.0d, r0) == r1) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
            
                r14 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
            
                if (r14.m71186d(r15, 0.0d, r0) == r1) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
            
                if (r15.m71186d(r5, r9, r0) == r1) goto L34;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, q83.InterfaceC30057d r15) {
                /*
                    Method dump skipped, instruction units count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lj0.C24465d.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C24465d c24465d) {
            this.f95375w = interfaceC13058l;
            this.f95376x = c24465d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f95375w.collect(new a(interfaceC13062m, this.f95376x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lj0.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.HistoryPullThroughputAnalytics", m100430f = "HistoryPullThroughputAnalytics.kt", m100431l = {72}, m100432m = "updateThroughput", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f95392F;

        /* JADX INFO: renamed from: w */
        Object f95393w;

        /* JADX INFO: renamed from: x */
        double f95394x;

        /* JADX INFO: renamed from: y */
        long f95395y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f95396z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f95396z = obj;
            this.f95392F |= Integer.MIN_VALUE;
            return C24465d.this.m71186d(null, 0.0d, this);
        }
    }

    public C24465d(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, InterfaceC21030c metricsWriter, Clock clock, InterfaceC2994c0 scope, InterfaceC4368h rawDataTrackingService, InterfaceC32974r strapLockStateTracker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(metricsWriter, "metricsWriter");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.metricsWriter = metricsWriter;
        this.clock = clock;
        this.scope = scope;
        this.rawDataTrackingService = rawDataTrackingService;
        this.strapLockStateTracker = strapLockStateTracker;
        this.throughputUpdateList = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    private final Object m71184b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        int size = this.throughputUpdateList.size();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (size > 2) {
            long timestamp = ((C24471j) AbstractC25265s.m74096F0(this.throughputUpdateList)).getTimestamp();
            long timestamp2 = ((C24471j) AbstractC25265s.m74112P0(this.throughputUpdateList)).getTimestamp();
            if (timestamp > timestamp2) {
                this.logger.mo85222m("Earliest timestamp is after the latest timestamp, cannot report metrics", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            Iterator<T> it = this.throughputUpdateList.iterator();
            double packetSize = 0.0d;
            while (it.hasNext()) {
                packetSize += ((C24471j) it.next()).getPacketSize();
            }
            long j7 = (timestamp2 - timestamp) / ((long) 1000);
            if (j7 <= 0) {
                this.logger.mo85222m("Time span is zero or negative, cannot calculate throughput", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            double d3 = packetSize / j7;
            boolean zMo13761c = this.rawDataTrackingService.mo13761c();
            InterfaceC34116n interfaceC34116n = this.logger;
            int size2 = this.throughputUpdateList.size();
            StringBuilder sbM8306s = AbstractC2875y.m8306s("HistoryPullThroughputAnalytics: Reporting throughput metrics - total bytes: ", packetSize, ", time span: ");
            sbM8306s.append(j7);
            AbstractC31061c.m95622B(sbM8306s, "s, calculated throughput: ", d3, " bytes/s, update count: ");
            sbM8306s.append(size2);
            sbM8306s.append(", isRawDataInBacklog: ");
            sbM8306s.append(zMo13761c);
            interfaceC34116n.mo85216g(sbM8306s.toString(), new AbstractC30556a.a[0]);
            Object objMo58700a = this.metricsWriter.mo58700a(new C22047a(0, "bluetooth.historical_pull.throughput", new Double(d3), AbstractC37056f.m118959K(AbstractC11266d.m30462p("is_raw_data_in_strap_or_app_backlog:", zMo13761c), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker))), MetricPostType.DISTRIBUTION, 1, null), interfaceC30057d);
            if (objMo58700a == EnumC31071a.f128113w) {
                return objMo58700a;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: c */
    private final void m71185c() {
        this.throughputUpdateList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m71186d(InterfaceC24472k interfaceC24472k, double d3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f95392F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f95392F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f95396z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f95392F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            long jMillis = this.clock.millis();
            if (AbstractC22676k.m65745e(interfaceC24472k, InterfaceC24472k.a.f95456a)) {
                if (!this.throughputUpdateList.isEmpty()) {
                    this.throughputUpdateList.add(new C24471j(interfaceC24472k, jMillis, d3));
                    cVar.f95393w = null;
                    cVar.f95394x = d3;
                    cVar.f95395y = jMillis;
                    cVar.f95392F = 1;
                    if (m71184b(cVar) == obj2) {
                        return obj2;
                    }
                }
            } else if (AbstractC22676k.m65745e(interfaceC24472k, InterfaceC24472k.b.f95457a)) {
                if (!this.throughputUpdateList.isEmpty()) {
                    this.throughputUpdateList.add(new C24471j(interfaceC24472k, jMillis, d3));
                }
            } else {
                if (!AbstractC22676k.m65745e(interfaceC24472k, InterfaceC24472k.c.f95458a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.throughputUpdateList.add(new C24471j(interfaceC24472k, jMillis, d3));
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        m71185c();
        return C23454a0.f92919a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new b(AbstractC13091v.m36590P(new C4588i(this.whoopStrapProvider.mo14818b(), 2), new a(null)), this), this.scope);
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

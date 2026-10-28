package mx0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.dataSyncService.retrofit.DataSyncApi;
import com.whoop.domain.model.MetricsProcessedTime;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import gx0.C16271a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.AbstractC28209v1;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: mx0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lmx0/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lbc3/c0;", "coroutineScope", "Lgx0/a;", "dataSyncServicePrefs", "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;", "dataSyncApi", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Lgx0/a;Lcom/whoop/dataSyncService/retrofit/DataSyncApi;Ltr2/n;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "", "metricsProcessedTime", "g", "(J)V", "e", "(Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "getCoroutineScope", "()Lbc3/c0;", "x", "Lgx0/a;", "y", "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;", "z", "Ltr2/n;", "Lec3/p1;", "E", "Lec3/p1;", "_highWaterMarkFlow", "Lec3/f2;", "F", "Lec3/f2;", "f", "()Lec3/f2;", "highWaterMark", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25993c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13075p1 _highWaterMarkFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 highWaterMark;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C16271a dataSyncServicePrefs;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final DataSyncApi dataSyncApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: mx0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.HighWatermarkHelper", m100430f = "HighWatermarkHelper.kt", m100431l = {41}, m100432m = "fetchHighWaterMark", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f102771w;

        /* JADX INFO: renamed from: y */
        int f102773y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102771w = obj;
            this.f102773y |= Integer.MIN_VALUE;
            return C25993c.this.m77146e(this);
        }
    }

    /* JADX INFO: renamed from: mx0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.HighWatermarkHelper$fetchHighWaterMark$2", m100430f = "HighWatermarkHelper.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/domain/model/MetricsProcessedTime;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f102774w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C25993c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102774w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            DataSyncApi dataSyncApi = C25993c.this.dataSyncApi;
            this.f102774w = 1;
            Object minHighWaterMark = dataSyncApi.getMinHighWaterMark(this);
            return minHighWaterMark == enumC31071a ? enumC31071a : minHighWaterMark;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<MetricsProcessedTime>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: mx0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.HighWatermarkHelper$onCreate$1", m100430f = "HighWatermarkHelper.kt", m100431l = {25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102776w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25993c.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102776w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25993c.this.logger.mo85216g("Fetching high watermark", new AbstractC30556a.a[0]);
                C25993c c25993c = C25993c.this;
                this.f102776w = 1;
                if (c25993c.m77146e(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mx0.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.HighWatermarkHelper$updateHighWatermark$1", m100430f = "HighWatermarkHelper.kt", m100431l = {35, 36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102778w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f102780y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j7, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102780y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25993c.this.new d(this.f102780y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102778w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            }
            AbstractC34132o.m107864I(obj);
            C25993c.this.logger.mo85216g(AbstractC11266d.m30461o("Updating high watermark to ", AbstractC28209v1.m85388b(this.f102780y)), new AbstractC30556a.a[0]);
            C16271a c16271a = C25993c.this.dataSyncServicePrefs;
            long j7 = this.f102780y;
            this.f102778w = 1;
            if (c16271a.m46093c(j7, this) != enumC31071a) {
            }
            InterfaceC13075p1 interfaceC13075p1 = C25993c.this._highWaterMarkFlow;
            Long l7 = new Long(this.f102780y);
            this.f102778w = 2;
            ((C13045h2) interfaceC13075p1).emit(l7, this);
            return c23454a0 == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    public C25993c(InterfaceC2994c0 coroutineScope, C16271a dataSyncServicePrefs, DataSyncApi dataSyncApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dataSyncServicePrefs, "dataSyncServicePrefs");
        AbstractC22676k.m65750j(dataSyncApi, "dataSyncApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.dataSyncServicePrefs = dataSyncServicePrefs;
        this.dataSyncApi = dataSyncApi;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Long.valueOf(dataSyncServicePrefs.m46092b()));
        this._highWaterMarkFlow = c13045h2M36593c;
        this.highWaterMark = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m77146e(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f102773y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f102773y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f102771w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f102773y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f102773y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.logger.mo85222m(AbstractC11266d.m30461o("Error occurred when fetching high watermark ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            MetricsProcessedTime metricsProcessedTime = (MetricsProcessedTime) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            if (metricsProcessedTime != null) {
                m77148g(metricsProcessedTime.getMillis());
            } else {
                this.logger.mo85222m("high watermark response body is null", new AbstractC30556a.a[0]);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC13037f2 getHighWaterMark() {
        return this.highWaterMark;
    }

    /* JADX INFO: renamed from: g */
    public final void m77148g(long metricsProcessedTime) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(metricsProcessedTime, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
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

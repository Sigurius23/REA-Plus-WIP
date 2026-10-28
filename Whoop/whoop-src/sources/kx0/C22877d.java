package kx0;

import ci2.InterfaceC4733b;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.straphistorysync.sync.InterfaceC10278f;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import jk0.InterfaceC21750d;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import tr2.InterfaceC34116n;
import ts0.EnumC34140e;
import yh2.InterfaceC39544c;

/* JADX INFO: renamed from: kx0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lkx0/d;", "Lod1/g;", "Lkx0/b;", "Lkx0/e;", "Lyh2/c;", "sensorHistoricalPullApi", "Lci2/b;", "whoopStrapProvider", "Ltr2/n;", "logger", "Lkotlin/time/Duration;", "timeoutDuration", "<init>", "(Lyh2/c;Lci2/b;Ltr2/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lyh2/c;", "b", "Lci2/b;", "c", "Ltr2/n;", "d", "J", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22877d implements InterfaceC27844g<InterfaceC22875b, InterfaceC22878e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39544c sensorHistoricalPullApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long timeoutDuration;

    /* JADX INFO: renamed from: kx0.d$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90201w;

        /* JADX INFO: renamed from: kx0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41928a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90202w;

            /* JADX INFO: renamed from: kx0.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$$inlined$filter$1$2", m100430f = "StrapSyncInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41929a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f90204F;

                /* JADX INFO: renamed from: G */
                Object f90205G;

                /* JADX INFO: renamed from: H */
                int f90206H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90207w;

                /* JADX INFO: renamed from: x */
                int f90208x;

                /* JADX INFO: renamed from: y */
                Object f90209y;

                /* JADX INFO: renamed from: z */
                Object f90210z;

                public C41929a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90207w = obj;
                    this.f90208x |= Integer.MIN_VALUE;
                    return C41928a.this.emit(null, this);
                }
            }

            public C41928a(InterfaceC13062m interfaceC13062m) {
                this.f90202w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41929a c41929a;
                if (interfaceC30057d instanceof C41929a) {
                    c41929a = (C41929a) interfaceC30057d;
                    int i13 = c41929a.f90208x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41929a.f90208x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41929a = new C41929a(interfaceC30057d);
                    }
                } else {
                    c41929a = new C41929a(interfaceC30057d);
                }
                Object obj2 = c41929a.f90207w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41929a.f90208x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90202w;
                    if (((InterfaceC22875b) obj).getDataSyncEventMetaData().getTriggerSource() != DeviceTriggerSource.NONE) {
                        c41929a.f90209y = null;
                        c41929a.f90210z = null;
                        c41929a.f90204F = null;
                        c41929a.f90205G = null;
                        c41929a.f90206H = 0;
                        c41929a.f90208x = 1;
                        if (interfaceC13062m.emit(obj, c41929a) == enumC31071a) {
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
            this.f90201w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90201w.collect(new C41928a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StrapSyncInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f90211w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f90212x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f90213y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22877d f90214z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C22877d c22877d) {
            super(3, interfaceC30057d);
            this.f90214z = c22877d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC22875b interfaceC22875b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f90214z);
            bVar.f90212x = interfaceC13062m;
            bVar.f90213y = interfaceC22875b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13015a0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f90211w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f90212x;
                InterfaceC22875b interfaceC22875b = (InterfaceC22875b) this.f90213y;
                DeviceTriggerSource triggerSource = interfaceC22875b.getDataSyncEventMetaData().getTriggerSource();
                this.f90214z.logger.mo85228t("Receiving Strap sync action for job: " + interfaceC22875b.getDataSyncEventMetaData().getTriggerSource(), new AbstractC30556a.a[0]);
                if (interfaceC22875b instanceof InterfaceC22875b.a) {
                    this.f90214z.logger.mo85228t("Bypassing strap sync to upload", new AbstractC30556a.a[0]);
                    c13015a0 = new C0456u(new InterfaceC22878e.a(((InterfaceC22875b.a) interfaceC22875b).getDataSyncEventMetaData(), null, 2, null), 1);
                } else {
                    InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC25265s.m74100H0(this.f90214z.whoopStrapProvider.mo14818b().getReplayCache());
                    if (interfaceC21750d == null) {
                        this.f90214z.logger.mo85222m("Sensor HPS: no connected strap available", new AbstractC30556a.a[0]);
                        c13015a0 = new C0456u(new InterfaceC22878e.b(interfaceC22875b.getDataSyncEventMetaData(), null, 2, null), 1);
                    } else {
                        InterfaceC32564a interfaceC32564a = DeviceTriggerSource.INSTANCE.isProcessNow(triggerSource) ? InterfaceC32564a.c.f134908a : InterfaceC32564a.b.f134906a;
                        InterfaceC34116n interfaceC34116n = this.f90214z.logger;
                        WhoopStrapInfo whoopStrapInfo = interfaceC21750d.get_strapInfo();
                        interfaceC34116n.mo85216g(AbstractC11266d.m30461o("Sensor HPS: submitting sync for ", whoopStrapInfo != null ? whoopStrapInfo.getSerialNumber() : null), new AbstractC30556a.a[0]);
                        c13015a0 = new C13015a0(AbstractC13091v.m36589O(new e(new d(this.f90214z.sensorHistoricalPullApi.mo26279a(interfaceC21750d, interfaceC32564a)), this.f90214z, interfaceC22875b), this.f90214z.timeoutDuration), this.f90214z.new c(interfaceC22875b, null));
                    }
                }
                this.f90212x = null;
                this.f90213y = null;
                this.f90211w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13015a0, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC22875b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kx0.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$2$3", m100430f = "StrapSyncInteractor.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lkx0/e;", "", "exception", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC22875b f90215E;

        /* JADX INFO: renamed from: w */
        int f90216w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f90217x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f90218y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22875b interfaceC22875b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f90215E = interfaceC22875b;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = C22877d.this.new c(this.f90215E, interfaceC30057d);
            cVar.f90217x = interfaceC13062m;
            cVar.f90218y = th3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f90217x;
            Throwable th3 = (Throwable) this.f90218y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f90216w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof TimeoutCancellationException)) {
                    C22877d.this.logger.mo85230v("Error in sensor HPS result flow", th3, new AbstractC30556a.a[0]);
                    throw th3;
                }
                C22877d.this.logger.mo85230v("Sensor HPS timed out", th3, new AbstractC30556a.a[0]);
                InterfaceC22878e.b bVar = new InterfaceC22878e.b(this.f90215E.getDataSyncEventMetaData(), EnumC34140e.TIMEOUT);
                this.f90217x = null;
                this.f90218y = null;
                this.f90216w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kx0.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90220w;

        /* JADX INFO: renamed from: kx0.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90221w;

            /* JADX INFO: renamed from: kx0.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$lambda$1$$inlined$filter$1$2", m100430f = "StrapSyncInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41930a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f90223F;

                /* JADX INFO: renamed from: G */
                Object f90224G;

                /* JADX INFO: renamed from: H */
                int f90225H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90226w;

                /* JADX INFO: renamed from: x */
                int f90227x;

                /* JADX INFO: renamed from: y */
                Object f90228y;

                /* JADX INFO: renamed from: z */
                Object f90229z;

                public C41930a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90226w = obj;
                    this.f90227x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90221w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41930a c41930a;
                if (interfaceC30057d instanceof C41930a) {
                    c41930a = (C41930a) interfaceC30057d;
                    int i13 = c41930a.f90227x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41930a.f90227x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41930a = new C41930a(interfaceC30057d);
                    }
                } else {
                    c41930a = new C41930a(interfaceC30057d);
                }
                Object obj2 = c41930a.f90226w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41930a.f90227x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90221w;
                    if (((InterfaceC10278f) obj) instanceof InterfaceC10278f.b) {
                        c41930a.f90228y = null;
                        c41930a.f90229z = null;
                        c41930a.f90223F = null;
                        c41930a.f90224G = null;
                        c41930a.f90225H = 0;
                        c41930a.f90227x = 1;
                        if (interfaceC13062m.emit(obj, c41930a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f90220w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90220w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90230w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22877d f90231x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC22875b f90232y;

        /* JADX INFO: renamed from: kx0.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90233w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22877d f90234x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC22875b f90235y;

            /* JADX INFO: renamed from: kx0.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.StrapSyncInteractor$interact$lambda$1$$inlined$map$1$2", m100430f = "StrapSyncInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41931a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90236E;

                /* JADX INFO: renamed from: F */
                Object f90237F;

                /* JADX INFO: renamed from: G */
                Object f90238G;

                /* JADX INFO: renamed from: H */
                int f90239H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90240w;

                /* JADX INFO: renamed from: x */
                int f90241x;

                /* JADX INFO: renamed from: y */
                Object f90242y;

                public C41931a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90240w = obj;
                    this.f90241x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22877d c22877d, InterfaceC22875b interfaceC22875b) {
                this.f90233w = interfaceC13062m;
                this.f90234x = c22877d;
                this.f90235y = interfaceC22875b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41931a c41931a;
                Object bVar;
                if (interfaceC30057d instanceof C41931a) {
                    c41931a = (C41931a) interfaceC30057d;
                    int i13 = c41931a.f90241x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41931a.f90241x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41931a = new C41931a(interfaceC30057d);
                    }
                } else {
                    c41931a = new C41931a(interfaceC30057d);
                }
                Object obj2 = c41931a.f90240w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41931a.f90241x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90233w;
                    InterfaceC10278f interfaceC10278f = (InterfaceC10278f) obj;
                    this.f90234x.logger.mo85216g("Sensor HPS terminal state: " + interfaceC10278f, new AbstractC30556a.a[0]);
                    if (interfaceC10278f instanceof InterfaceC10278f.b.d) {
                        bVar = new InterfaceC22878e.a(this.f90235y.getDataSyncEventMetaData(), null, 2, null);
                    } else if (!(interfaceC10278f instanceof InterfaceC10278f.b) || interfaceC10278f.getSavedPacketCounts().m9596b() <= 0) {
                        bVar = new InterfaceC22878e.b(this.f90235y.getDataSyncEventMetaData(), null, 2, null);
                    } else {
                        this.f90234x.logger.mo85216g("HPS ended with partial data, triggering upload", new AbstractC30556a.a[0]);
                        bVar = new InterfaceC22878e.a(this.f90235y.getDataSyncEventMetaData(), null, 2, null);
                    }
                    c41931a.f90242y = null;
                    c41931a.f90236E = null;
                    c41931a.f90237F = null;
                    c41931a.f90238G = null;
                    c41931a.f90239H = 0;
                    c41931a.f90241x = 1;
                    if (interfaceC13062m.emit(bVar, c41931a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C22877d c22877d, InterfaceC22875b interfaceC22875b) {
            this.f90230w = interfaceC13058l;
            this.f90231x = c22877d;
            this.f90232y = interfaceC22875b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90230w.collect(new a(interfaceC13062m, this.f90231x, this.f90232y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public /* synthetic */ C22877d(InterfaceC39544c interfaceC39544c, InterfaceC4733b interfaceC4733b, InterfaceC34116n interfaceC34116n, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39544c, interfaceC4733b, interfaceC34116n, j7);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new a(upstream), new b(null, this));
    }

    private C22877d(InterfaceC39544c sensorHistoricalPullApi, InterfaceC4733b whoopStrapProvider, InterfaceC34116n logger, long j7) {
        AbstractC22676k.m65750j(sensorHistoricalPullApi, "sensorHistoricalPullApi");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.sensorHistoricalPullApi = sensorHistoricalPullApi;
        this.whoopStrapProvider = whoopStrapProvider;
        this.logger = logger;
        this.timeoutDuration = j7;
    }
}

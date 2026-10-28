package lx0;

import c93.InterfaceC4351m;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import dt0.C12360c;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p82.C28973b;
import p82.InterfaceC28974c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: lx0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llx0/d;", "Lod1/g;", "Llx0/b;", "Llx0/e;", "Lp82/b;", "sensorDataUploadInteractor", "Llx0/f;", "uploadGate", "Ltr2/n;", "logger", "<init>", "(Lp82/b;Llx0/f;Ltr2/n;)V", "action", "Lec3/l;", "Llx0/a;", "f", "(Llx0/b;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lp82/b;", "b", "Llx0/f;", "c", "Ltr2/n;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24787d implements InterfaceC27844g<InterfaceC24785b, InterfaceC24788e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28973b sensorDataUploadInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24789f uploadGate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: lx0.d$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96970w;

        /* JADX INFO: renamed from: lx0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41974a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96971w;

            /* JADX INFO: renamed from: lx0.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadDataInteractor$interact$$inlined$filter$1$2", m100430f = "UploadDataInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41975a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f96973F;

                /* JADX INFO: renamed from: G */
                Object f96974G;

                /* JADX INFO: renamed from: H */
                int f96975H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96976w;

                /* JADX INFO: renamed from: x */
                int f96977x;

                /* JADX INFO: renamed from: y */
                Object f96978y;

                /* JADX INFO: renamed from: z */
                Object f96979z;

                public C41975a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96976w = obj;
                    this.f96977x |= Integer.MIN_VALUE;
                    return C41974a.this.emit(null, this);
                }
            }

            public C41974a(InterfaceC13062m interfaceC13062m) {
                this.f96971w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41975a c41975a;
                if (interfaceC30057d instanceof C41975a) {
                    c41975a = (C41975a) interfaceC30057d;
                    int i13 = c41975a.f96977x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41975a.f96977x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41975a = new C41975a(interfaceC30057d);
                    }
                } else {
                    c41975a = new C41975a(interfaceC30057d);
                }
                Object obj2 = c41975a.f96976w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41975a.f96977x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96971w;
                    if (((InterfaceC24785b) obj).getDataSyncEventMetaData().getTriggerSource() != DeviceTriggerSource.NONE) {
                        c41975a.f96978y = null;
                        c41975a.f96979z = null;
                        c41975a.f96973F = null;
                        c41975a.f96974G = null;
                        c41975a.f96975H = 0;
                        c41975a.f96977x = 1;
                        if (interfaceC13062m.emit(obj, c41975a) == enumC31071a) {
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
            this.f96970w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96970w.collect(new C41974a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lx0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadDataInteractor$interact$$inlined$flatMapLatest$1", m100430f = "UploadDataInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f96980w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f96981x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f96982y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C24787d f96983z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C24787d c24787d) {
            super(3, interfaceC30057d);
            this.f96983z = c24787d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC24785b interfaceC24785b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f96983z);
            bVar.f96981x = interfaceC13062m;
            bVar.f96982y = interfaceC24785b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM72651f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f96980w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f96981x;
                InterfaceC24785b interfaceC24785b = (InterfaceC24785b) this.f96982y;
                if (interfaceC24785b instanceof InterfaceC24785b.a) {
                    interfaceC13058lM72651f = new C0456u(InterfaceC24784a.c.f96963a, 1);
                } else {
                    if (!(interfaceC24785b instanceof InterfaceC24785b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM72651f = this.f96983z.m72651f(interfaceC24785b);
                }
                this.f96981x = null;
                this.f96982y = null;
                this.f96980w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM72651f, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC24785b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: lx0.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadDataInteractor$interact$3", m100430f = "UploadDataInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Llx0/e;", "<unused var>", "Llx0/a;", "internalAction", "<anonymous>", "(Llx0/e;Llx0/a;)Llx0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f96984w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f96985x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC24788e interfaceC24788e, InterfaceC24784a interfaceC24784a, InterfaceC30057d<? super InterfaceC24788e> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f96985x = interfaceC24784a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC24784a interfaceC24784a = (InterfaceC24784a) this.f96985x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f96984w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC24784a instanceof InterfaceC24784a.a) {
                return new InterfaceC24788e.a(((InterfaceC24784a.a) interfaceC24784a).getDataSyncEventMetaData());
            }
            if (interfaceC24784a instanceof InterfaceC24784a.b) {
                return new InterfaceC24788e.b(((InterfaceC24784a.b) interfaceC24784a).getDataSyncEventMetaData());
            }
            if (AbstractC22676k.m65745e(interfaceC24784a, InterfaceC24784a.c.f96963a)) {
                return InterfaceC24788e.c.f97008a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: lx0.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadDataInteractor$upload$1", m100430f = "UploadDataInteractor.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Llx0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f96986w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f96987x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12360c f96989z;

        /* JADX INFO: renamed from: lx0.d$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadDataInteractor$upload$1$1", m100430f = "UploadDataInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f96990w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f96991x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C24787d f96992y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C12360c f96993z;

            /* JADX INFO: renamed from: lx0.d$d$a$a, reason: collision with other inner class name */
            @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41976a implements InterfaceC13058l {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l f96994w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C12360c f96995x;

                /* JADX INFO: renamed from: lx0.d$d$a$a$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41977a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC13062m f96996w;

                    /* JADX INFO: renamed from: x */
                    final /* synthetic */ C12360c f96997x;

                    /* JADX INFO: renamed from: lx0.d$d$a$a$a$a, reason: collision with other inner class name */
                    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadDataInteractor$upload$1$1$invokeSuspend$$inlined$map$1$2", m100430f = "UploadDataInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C41978a extends AbstractC32269c {

                        /* JADX INFO: renamed from: E */
                        Object f96998E;

                        /* JADX INFO: renamed from: F */
                        Object f96999F;

                        /* JADX INFO: renamed from: G */
                        Object f97000G;

                        /* JADX INFO: renamed from: H */
                        int f97001H;

                        /* JADX INFO: renamed from: w */
                        /* synthetic */ Object f97002w;

                        /* JADX INFO: renamed from: x */
                        int f97003x;

                        /* JADX INFO: renamed from: y */
                        Object f97004y;

                        public C41978a(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.f97002w = obj;
                            this.f97003x |= Integer.MIN_VALUE;
                            return C41977a.this.emit(null, this);
                        }
                    }

                    public C41977a(InterfaceC13062m interfaceC13062m, C12360c c12360c) {
                        this.f96996w = interfaceC13062m;
                        this.f96997x = c12360c;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        C41978a c41978a;
                        Object bVar;
                        if (interfaceC30057d instanceof C41978a) {
                            c41978a = (C41978a) interfaceC30057d;
                            int i13 = c41978a.f97003x;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                c41978a.f97003x = i13 - Integer.MIN_VALUE;
                            } else {
                                c41978a = new C41978a(interfaceC30057d);
                            }
                        } else {
                            c41978a = new C41978a(interfaceC30057d);
                        }
                        Object obj2 = c41978a.f97002w;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = c41978a.f97003x;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.f96996w;
                            InterfaceC28974c interfaceC28974c = (InterfaceC28974c) obj;
                            if (interfaceC28974c instanceof InterfaceC28974c.a) {
                                InterfaceC28974c.a aVar = (InterfaceC28974c.a) interfaceC28974c;
                                long millis = aVar.getMetricsProcessedTime().getMillis();
                                bVar = new InterfaceC24784a.a(C12360c.m34617b(this.f96997x, null, 0L, 0L, aVar.getExportedHeartData().getRecordCount(), 0, millis, 23, null));
                            } else if (interfaceC28974c instanceof InterfaceC28974c.b) {
                                bVar = new InterfaceC24784a.b(this.f96997x);
                            } else {
                                if (!AbstractC22676k.m65745e(interfaceC28974c, InterfaceC28974c.c.f117210a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar = InterfaceC24784a.c.f96963a;
                            }
                            c41978a.f97004y = null;
                            c41978a.f96998E = null;
                            c41978a.f96999F = null;
                            c41978a.f97000G = null;
                            c41978a.f97001H = 0;
                            c41978a.f97003x = 1;
                            if (interfaceC13062m.emit(bVar, c41978a) == enumC31071a) {
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

                public C41976a(InterfaceC13058l interfaceC13058l, C12360c c12360c) {
                    this.f96994w = interfaceC13058l;
                    this.f96995x = c12360c;
                }

                @Override // ec3.InterfaceC13058l
                public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = this.f96994w.collect(new C41977a(interfaceC13062m, this.f96995x), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C24787d c24787d, C12360c c12360c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f96991x = interfaceC13062m;
                this.f96992y = c24787d;
                this.f96993z = c12360c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f96991x, this.f96992y, this.f96993z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f96990w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f96991x;
                    C41976a c41976a = new C41976a(this.f96992y.sensorDataUploadInteractor.m88000i(this.f96993z), this.f96993z);
                    this.f96990w = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m, c41976a, this) == enumC31071a) {
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

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C12360c c12360c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f96989z = c12360c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C24787d.this.new d(this.f96989z, interfaceC30057d);
            dVar.f96987x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f96987x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f96986w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C24789f c24789f = C24787d.this.uploadGate;
                DeviceTriggerSource triggerSource = this.f96989z.getTriggerSource();
                a aVar = new a(interfaceC13062m, C24787d.this, this.f96989z, null);
                this.f96987x = null;
                this.f96986w = 1;
                if (c24789f.m72654a(triggerSource, aVar, this) == enumC31071a) {
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

    public C24787d(C28973b sensorDataUploadInteractor, C24789f uploadGate, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sensorDataUploadInteractor, "sensorDataUploadInteractor");
        AbstractC22676k.m65750j(uploadGate, "uploadGate");
        AbstractC22676k.m65750j(logger, "logger");
        this.sensorDataUploadInteractor = sensorDataUploadInteractor;
        this.uploadGate = uploadGate;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m72651f(InterfaceC24785b action) {
        C12360c dataSyncEventMetaData = action.getDataSyncEventMetaData();
        this.logger.mo85228t("Receiving Upload action for job: " + dataSyncEventMetaData.getTriggerSource(), new AbstractC30556a.a[0]);
        return new C13084s1(new d(dataSyncEventMetaData, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC24788e.c.f97008a, AbstractC13091v.m36590P(new a(upstream), new b(null, this)), new c(null));
    }
}

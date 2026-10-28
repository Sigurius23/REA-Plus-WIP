package mx0;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.data.repositories.FeatureFlagChecker;
import dt0.C12360c;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import kx0.C22877d;
import kx0.InterfaceC22875b;
import kx0.InterfaceC22876c;
import kx0.InterfaceC22878e;
import l83.C23454a0;
import lx0.C24787d;
import lx0.InterfaceC24785b;
import lx0.InterfaceC24786c;
import lx0.InterfaceC24788e;
import od1.AbstractC27845h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: mx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001d8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b$\u0010'¨\u0006)"}, m65681d2 = {"Lmx0/a;", "", "Llx0/d;", "uploadDataInteractor", "Lkx0/d;", "strapSyncInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Llx0/d;Lkx0/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lkx0/c;", NotificationCompat.CATEGORY_EVENT, "Lkx0/b;", "f", "(Lkx0/c;)Lkx0/b;", "Llx0/c;", "Llx0/b;", "g", "(Llx0/c;)Llx0/b;", "a", "Ltr2/n;", "Lec3/o1;", "b", "Lec3/o1;", "d", "()Lec3/o1;", "strapSyncEventFlow", "Lec3/l;", "Lkx0/e;", "c", "Lec3/l;", "strapSyncDomainState", "uploadSyncEventFlow", "Llx0/e;", "e", "uploadSyncDomainState", "Lmx0/d;", "()Lec3/l;", "syncState", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25991a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13072o1 strapSyncEventFlow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l strapSyncDomainState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13072o1 uploadSyncEventFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l uploadSyncDomainState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13058l syncState;

    /* JADX INFO: renamed from: mx0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102706w;

        /* JADX INFO: renamed from: mx0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42030a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102707w;

            /* JADX INFO: renamed from: mx0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$special$$inlined$filter$1$2", m100430f = "DataFlowController.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42031a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f102709F;

                /* JADX INFO: renamed from: G */
                Object f102710G;

                /* JADX INFO: renamed from: H */
                int f102711H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102712w;

                /* JADX INFO: renamed from: x */
                int f102713x;

                /* JADX INFO: renamed from: y */
                Object f102714y;

                /* JADX INFO: renamed from: z */
                Object f102715z;

                public C42031a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102712w = obj;
                    this.f102713x |= Integer.MIN_VALUE;
                    return C42030a.this.emit(null, this);
                }
            }

            public C42030a(InterfaceC13062m interfaceC13062m) {
                this.f102707w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0062  */
            /* JADX WARN: Code duplicated, block: B:24:0x0076 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42031a c42031a;
                if (interfaceC30057d instanceof C42031a) {
                    c42031a = (C42031a) interfaceC30057d;
                    int i13 = c42031a.f102713x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42031a.f102713x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42031a = new C42031a(interfaceC30057d);
                    }
                } else {
                    c42031a = new C42031a(interfaceC30057d);
                }
                Object obj2 = c42031a.f102712w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42031a.f102713x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102707w;
                    C25994d c25994d = (C25994d) obj;
                    if ((c25994d.getStrapSyncResult() instanceof InterfaceC22878e.a) && (c25994d.getUploadResult() instanceof InterfaceC24788e.a)) {
                        c42031a.f102714y = null;
                        c42031a.f102715z = null;
                        c42031a.f102709F = null;
                        c42031a.f102710G = null;
                        c42031a.f102711H = 0;
                        c42031a.f102713x = 1;
                        if (interfaceC13062m.emit(obj, c42031a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        c25994d.getStrapSyncResult();
                        if ((c25994d.getStrapSyncResult() instanceof InterfaceC22878e.b) || (c25994d.getUploadResult() instanceof InterfaceC24788e.b)) {
                            c42031a.f102714y = null;
                            c42031a.f102715z = null;
                            c42031a.f102709F = null;
                            c42031a.f102710G = null;
                            c42031a.f102711H = 0;
                            c42031a.f102713x = 1;
                            if (interfaceC13062m.emit(obj, c42031a) == enumC31071a) {
                                return enumC31071a;
                            }
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
            this.f102706w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102706w.collect(new C42030a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mx0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102716w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25991a f102717x;

        /* JADX INFO: renamed from: mx0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102718w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25991a f102719x;

            /* JADX INFO: renamed from: mx0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$special$$inlined$map$1$2", m100430f = "DataFlowController.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42032a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102720E;

                /* JADX INFO: renamed from: F */
                Object f102721F;

                /* JADX INFO: renamed from: G */
                Object f102722G;

                /* JADX INFO: renamed from: H */
                int f102723H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102724w;

                /* JADX INFO: renamed from: x */
                int f102725x;

                /* JADX INFO: renamed from: y */
                Object f102726y;

                public C42032a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102724w = obj;
                    this.f102725x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25991a c25991a) {
                this.f102718w = interfaceC13062m;
                this.f102719x = c25991a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42032a c42032a;
                if (interfaceC30057d instanceof C42032a) {
                    c42032a = (C42032a) interfaceC30057d;
                    int i13 = c42032a.f102725x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42032a.f102725x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42032a = new C42032a(interfaceC30057d);
                    }
                } else {
                    c42032a = new C42032a(interfaceC30057d);
                }
                Object obj2 = c42032a.f102724w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42032a.f102725x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102718w;
                    InterfaceC22875b interfaceC22875bM77131f = this.f102719x.m77131f((InterfaceC22876c) obj);
                    c42032a.f102726y = null;
                    c42032a.f102720E = null;
                    c42032a.f102721F = null;
                    c42032a.f102722G = null;
                    c42032a.f102723H = 0;
                    c42032a.f102725x = 1;
                    if (interfaceC13062m.emit(interfaceC22875bM77131f, c42032a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25991a c25991a) {
            this.f102716w = interfaceC13058l;
            this.f102717x = c25991a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102716w.collect(new a(interfaceC13062m, this.f102717x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mx0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102728w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25991a f102729x;

        /* JADX INFO: renamed from: mx0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102730w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25991a f102731x;

            /* JADX INFO: renamed from: mx0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$special$$inlined$map$2$2", m100430f = "DataFlowController.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42033a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102732E;

                /* JADX INFO: renamed from: F */
                Object f102733F;

                /* JADX INFO: renamed from: G */
                Object f102734G;

                /* JADX INFO: renamed from: H */
                int f102735H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102736w;

                /* JADX INFO: renamed from: x */
                int f102737x;

                /* JADX INFO: renamed from: y */
                Object f102738y;

                public C42033a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102736w = obj;
                    this.f102737x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25991a c25991a) {
                this.f102730w = interfaceC13062m;
                this.f102731x = c25991a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42033a c42033a;
                if (interfaceC30057d instanceof C42033a) {
                    c42033a = (C42033a) interfaceC30057d;
                    int i13 = c42033a.f102737x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42033a.f102737x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42033a = new C42033a(interfaceC30057d);
                    }
                } else {
                    c42033a = new C42033a(interfaceC30057d);
                }
                Object obj2 = c42033a.f102736w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42033a.f102737x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102730w;
                    InterfaceC24785b interfaceC24785bM77134g = this.f102731x.m77134g((InterfaceC24786c) obj);
                    c42033a.f102738y = null;
                    c42033a.f102732E = null;
                    c42033a.f102733F = null;
                    c42033a.f102734G = null;
                    c42033a.f102735H = 0;
                    c42033a.f102737x = 1;
                    if (interfaceC13062m.emit(interfaceC24785bM77134g, c42033a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C25991a c25991a) {
            this.f102728w = interfaceC13058l;
            this.f102729x = c25991a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102728w.collect(new a(interfaceC13062m, this.f102729x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mx0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$strapSyncDomainState$2", m100430f = "DataFlowController.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkx0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102740w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102741x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f102741x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102741x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102740w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC22875b.b bVar = new InterfaceC22875b.b(new C12360c(null, 0L, 0L, 0L, 0, 0L, 63, null));
                this.f102741x = null;
                this.f102740w = 1;
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

    /* JADX INFO: renamed from: mx0.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$strapSyncDomainState$3", m100430f = "DataFlowController.kt", m100431l = {53, 64, 67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lkx0/e;", "result", "Ll83/a0;", "<anonymous>", "(Lkx0/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102742w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102743x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ FeatureFlagChecker f102745z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FeatureFlagChecker featureFlagChecker, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102745z = featureFlagChecker;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C25991a.this.new e(this.f102745z, interfaceC30057d);
            eVar.f102743x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC22878e interfaceC22878e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC22878e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC22878e interfaceC22878e = (InterfaceC22878e) this.f102743x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102742w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (interfaceC22878e instanceof InterfaceC22878e.a) {
                    InterfaceC13072o1 interfaceC13072o1 = C25991a.this.uploadSyncEventFlow;
                    InterfaceC24786c.b bVar = new InterfaceC24786c.b(((InterfaceC22878e.a) interfaceC22878e).getDataSyncEventMetaData());
                    this.f102743x = null;
                    this.f102742w = 1;
                    if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (interfaceC22878e instanceof InterfaceC22878e.b) {
                    C25991a.this.logger.mo85228t("StrapSyncResult erred", new AbstractC30556a.a[0]);
                } else {
                    C25991a.this.logger.mo85228t("No known result for StrapSyncResult", new AbstractC30556a.a[0]);
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mx0.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$syncState$1", m100430f = "DataFlowController.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lkx0/e;", "strapSyncResult", "Llx0/e;", "uploadStateResult", "Lmx0/d;", "<anonymous>", "(Lkx0/e;Llx0/e;)Lmx0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102746w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102747x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102748y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC22878e interfaceC22878e, InterfaceC24788e interfaceC24788e, InterfaceC30057d<? super C25994d> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f102747x = interfaceC22878e;
            fVar.f102748y = interfaceC24788e;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC22878e interfaceC22878e = (InterfaceC22878e) this.f102747x;
            InterfaceC24788e interfaceC24788e = (InterfaceC24788e) this.f102748y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102746w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C25994d(interfaceC22878e, interfaceC24788e);
        }
    }

    /* JADX INFO: renamed from: mx0.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataFlowController$uploadSyncDomainState$1", m100430f = "DataFlowController.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Llx0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102749w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102750x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f102750x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102750x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102749w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC24786c.b bVar = new InterfaceC24786c.b(new C12360c(null, 0L, 0L, 0L, 0, 0L, 63, null));
                this.f102750x = null;
                this.f102749w = 1;
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

    public C25991a(C24787d uploadDataInteractor, C22877d strapSyncInteractor, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(uploadDataInteractor, "uploadDataInteractor");
        AbstractC22676k.m65750j(strapSyncInteractor, "strapSyncInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.strapSyncEventFlow = c13096w1M36592b;
        C13052j1 c13052j1 = new C13052j1(AbstractC27845h.m83945a(new C13015a0(new d(null), new b(c13096w1M36592b, this)), strapSyncInteractor), new e(featureFlagChecker, null), 0);
        this.strapSyncDomainState = c13052j1;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.uploadSyncEventFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new c(new C13015a0(new g(null), c13096w1M36592b2), this), uploadDataInteractor);
        this.uploadSyncDomainState = interfaceC13058lM83945a;
        this.syncState = new a(new C13060l1(c13052j1, interfaceC13058lM83945a, new f(null), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC22875b m77131f(InterfaceC22876c event) {
        return (event.getDataSyncEventMetaData().getTriggerSource() == DeviceTriggerSource.STRAP || event.getDataSyncEventMetaData().getTriggerSource() == DeviceTriggerSource.IMPLICIT_UPLOAD) ? new InterfaceC22875b.a(event.getDataSyncEventMetaData()) : new InterfaceC22875b.b(event.getDataSyncEventMetaData());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13072o1 getStrapSyncEventFlow() {
        return this.strapSyncEventFlow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC13058l getSyncState() {
        return this.syncState;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC24785b m77134g(InterfaceC24786c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24786c.a) {
            return new InterfaceC24785b.a(((InterfaceC24786c.a) event).m72646a());
        }
        if (event instanceof InterfaceC24786c.b) {
            return new InterfaceC24785b.b(((InterfaceC24786c.b) event).getDataSyncEventMetaData());
        }
        throw new NoWhenBranchMatchedException();
    }
}

package av0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import yu0.C39785b;

/* JADX INFO: renamed from: av0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 &2\u00020\u0001:\u0001'BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m65681d2 = {"Lav0/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lrr2/c;", "crashReporter", "Lbc3/c0;", "backgroundScope", "Lec3/l;", "Ltd1/e;", "strapStatusFlow", "", "strapGenerationFlow", "firmwareVersionFlow", "Lyu0/b;", "dataBacklogReporter", "Lca2/h;", "rawDataTrackingService", "<init>", "(Lrr2/c;Lbc3/c0;Lec3/l;Lec3/l;Lec3/l;Lyu0/b;Lca2/h;)V", NotificationCompat.CATEGORY_STATUS, "Ll83/a0;", "f", "(Ltd1/e;Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lrr2/c;", "x", "Lbc3/c0;", "y", "Lec3/l;", "z", "E", "F", "Lyu0/b;", "G", "Lca2/h;", "H", "a", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2093a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l firmwareVersionFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C39785b dataBacklogReporter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 backgroundScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l strapStatusFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l strapGenerationFlow;

    /* JADX INFO: renamed from: av0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lav0/a$a;", "", "<init>", "()V", "", "minutes", "", "a", "(D)Ljava/lang/String;", "SENTRY_TAG_STRAP_STATUS", "Ljava/lang/String;", "SENTRY_TAG_STRAP_GENERATION", "SENTRY_TAG_LAST_BACKLOG_MINUTES", "SENTRY_TAG_LAST_BACKLOG_MINUTES_BUCKET", "SENTRY_TAG_RAW_DATA_IN_BACKLOG", "SENTRY_TAG_FIRMWARE_VERSION", "SENTRY_BREADCRUMB_STRAP_STATUS", "SENTRY_BREADCRUMB_KEY_STATUS", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m6613a(double minutes) {
            if (minutes < 15.0d) {
                return "current";
            }
            return minutes < 480.0d ? "behind" : "stale";
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: av0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.crash.ConnectivityCrashContextReporter$onCreate$1", m100430f = "ConnectivityCrashContextReporter.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8272w;

        /* JADX INFO: renamed from: av0.a$b$a */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C2093a f8274w;

            public a(C2093a c2093a) {
                this.f8274w = c2093a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f8274w.crashReporter.mo98624c("strap_generation", str);
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2093a.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8272w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = C2093a.this.strapGenerationFlow;
                a aVar = new a(C2093a.this);
                this.f8272w = 1;
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

    /* JADX INFO: renamed from: av0.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.crash.ConnectivityCrashContextReporter$onCreate$2", m100430f = "ConnectivityCrashContextReporter.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8275w;

        /* JADX INFO: renamed from: av0.a$c$a */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C2093a f8277w;

            public a(C2093a c2093a) {
                this.f8277w = c2093a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f8277w.crashReporter.mo98624c("firmware_version", str);
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2093a.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8275w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = C2093a.this.firmwareVersionFlow;
                a aVar = new a(C2093a.this);
                this.f8275w = 1;
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

    /* JADX INFO: renamed from: av0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.crash.ConnectivityCrashContextReporter$onCreate$3", m100430f = "ConnectivityCrashContextReporter.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8278w;

        /* JADX INFO: renamed from: av0.a$d$a */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C2093a f8280w;

            public a(C2093a c2093a) {
                this.f8280w = c2093a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC33707e enumC33707e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objM6612f = this.f8280w.m6612f(enumC33707e, interfaceC30057d);
                return objM6612f == EnumC31071a.f128113w ? objM6612f : C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2093a.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8278w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = C2093a.this.strapStatusFlow;
                a aVar = new a(C2093a.this);
                this.f8278w = 1;
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

    /* JADX INFO: renamed from: av0.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.crash.ConnectivityCrashContextReporter", m100430f = "ConnectivityCrashContextReporter.kt", m100431l = {53}, m100432m = "onStrapStatusChanged", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f8281w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f8282x;

        /* JADX INFO: renamed from: z */
        int f8284z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f8282x = obj;
            this.f8284z |= Integer.MIN_VALUE;
            return C2093a.this.m6612f(null, this);
        }
    }

    public C2093a(InterfaceC31766c crashReporter, InterfaceC2994c0 backgroundScope, InterfaceC13058l strapStatusFlow, InterfaceC13058l strapGenerationFlow, InterfaceC13058l firmwareVersionFlow, C39785b dataBacklogReporter, InterfaceC4368h rawDataTrackingService) {
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(backgroundScope, "backgroundScope");
        AbstractC22676k.m65750j(strapStatusFlow, "strapStatusFlow");
        AbstractC22676k.m65750j(strapGenerationFlow, "strapGenerationFlow");
        AbstractC22676k.m65750j(firmwareVersionFlow, "firmwareVersionFlow");
        AbstractC22676k.m65750j(dataBacklogReporter, "dataBacklogReporter");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        this.crashReporter = crashReporter;
        this.backgroundScope = backgroundScope;
        this.strapStatusFlow = strapStatusFlow;
        this.strapGenerationFlow = strapGenerationFlow;
        this.firmwareVersionFlow = firmwareVersionFlow;
        this.dataBacklogReporter = dataBacklogReporter;
        this.rawDataTrackingService = rawDataTrackingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m6612f(EnumC33707e enumC33707e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f8284z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f8284z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM127494a = eVar.f8282x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f8284z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127494a);
            this.crashReporter.mo98624c("strap_status", enumC33707e.name());
            this.crashReporter.mo98628l("Strap status changed", AbstractC25247g0.m73989X(new C23465k(NotificationCompat.CATEGORY_STATUS, enumC33707e.name())));
            C39785b c39785b = this.dataBacklogReporter;
            eVar.f8281w = null;
            eVar.f8284z = 1;
            objM127494a = c39785b.m127494a(eVar);
            if (objM127494a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127494a);
        }
        double dDoubleValue = ((Number) objM127494a).doubleValue();
        this.crashReporter.mo98624c("last_backlog_minutes", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{new Double(dDoubleValue)}, 1)));
        this.crashReporter.mo98624c("last_backlog_minutes_bucket", INSTANCE.m6613a(dDoubleValue));
        this.crashReporter.mo98624c("is_raw_data_in_backlog", String.valueOf(this.rawDataTrackingService.mo13761c()));
        return C23454a0.f92919a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.backgroundScope, null, null, new b(null), 3);
        AbstractC3006f0.m8732z(this.backgroundScope, null, null, new c(null), 3);
        AbstractC3006f0.m8732z(this.backgroundScope, null, null, new d(null), 3);
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

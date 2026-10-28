package zu0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.metrics.domain.models.MetricPostType;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.time.Instant;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import l83.C23454a0;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p088dc.AbstractC11895b;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import us0.EnumC35206b;
import us0.InterfaceC35205a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zu0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001HB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b#\u0010\u001dJ \u0010%\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b'\u0010\u001dJ\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u0004\u0018\u00010C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, m65681d2 = {"Lzu0/a;", "Lus0/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lbc3/c0;", "coroutineScope", "La6/g;", "Lf6/f;", "dataStorePreferences", "Ljava/time/Clock;", "clock", "Liy1/c;", "metricWriter", "Lci2/b;", "whoopStrapProvider", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;La6/g;Ljava/time/Clock;Liy1/c;Lci2/b;Ltr2/n;)V", "Ll83/a0;", "t", "()V", "Lus0/b;", NotificationCompat.CATEGORY_EVENT, "o", "(Lus0/b;Lq83/d;)Ljava/lang/Object;", "", "v", "(Lus0/b;)Z", "l", "(Lq83/d;)Ljava/lang/Object;", "Lf6/d;", "", "j", "(Lus0/b;)Lf6/d;", "r", "u", "count", "p", "(Lus0/b;ILq83/d;)Ljava/lang/Object;", "q", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "m", "(Lus0/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "La6/g;", "y", "Ljava/time/Clock;", "z", "Liy1/c;", "E", "Lci2/b;", "F", "Ltr2/n;", "Lec3/o1;", "G", "Lec3/o1;", "logFlow", "Ljava/util/concurrent/ConcurrentHashMap;", "", "H", "Ljava/util/concurrent/ConcurrentHashMap;", "lastReportedMinute", "Lcom/whoop/domain/model/WhoopStrapInfo;", "n", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "I", "a", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41147a implements InterfaceC35205a, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: J */
    private static final C14132d f177380J = AbstractC15751g.m44429I("last-generated-report-date");

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 logFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final ConcurrentHashMap<EnumC35206b, Long> lastReportedMinute;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: zu0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {115, 117, 124, 129, 130}, m100432m = "generateDailyReport", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f177389E;

        /* JADX INFO: renamed from: F */
        int f177390F;

        /* JADX INFO: renamed from: G */
        int f177391G;

        /* JADX INFO: renamed from: H */
        int f177392H;

        /* JADX INFO: renamed from: I */
        int f177393I;

        /* JADX INFO: renamed from: J */
        int f177394J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f177395K;

        /* JADX INFO: renamed from: M */
        int f177397M;

        /* JADX INFO: renamed from: w */
        Object f177398w;

        /* JADX INFO: renamed from: x */
        Object f177399x;

        /* JADX INFO: renamed from: y */
        Object f177400y;

        /* JADX INFO: renamed from: z */
        Object f177401z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f177395K = obj;
            this.f177397M |= Integer.MIN_VALUE;
            return C41147a.this.m133646l(this);
        }
    }

    /* JADX INFO: renamed from: zu0.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl$logEvent$1", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177402w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC35206b f177404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC35206b enumC35206b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177404y = enumC35206b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C41147a.this.new c(this.f177404y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177402w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C41147a.this.logFlow;
                EnumC35206b enumC35206b = this.f177404y;
                this.f177402w = 1;
                if (interfaceC13072o1.emit(enumC35206b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zu0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {88, 98}, m100432m = "reportEvent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f177405E;

        /* JADX INFO: renamed from: G */
        int f177407G;

        /* JADX INFO: renamed from: w */
        Object f177408w;

        /* JADX INFO: renamed from: x */
        Object f177409x;

        /* JADX INFO: renamed from: y */
        long f177410y;

        /* JADX INFO: renamed from: z */
        long f177411z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f177405E = obj;
            this.f177407G |= Integer.MIN_VALUE;
            return C41147a.this.m133648o(null, this);
        }
    }

    /* JADX INFO: renamed from: zu0.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl$reportEvent$2", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177412w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f177413x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f177414y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C14132d c14132d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177414y = c14132d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f177414y, interfaceC30057d);
            eVar.f177413x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f177413x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f177412w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Integer num = (Integer) c14129a.mo40227b(this.f177414y);
            c14129a.m40230g(this.f177414y, new Integer((num != null ? num.intValue() : 0) + 1));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zu0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl$resetEventCounts$2", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177415w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f177416x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C41147a.this.new f(interfaceC30057d);
            fVar.f177416x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f177416x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f177415w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC35206b[] enumC35206bArrValues = EnumC35206b.values();
            C41147a c41147a = C41147a.this;
            for (EnumC35206b enumC35206b : enumC35206bArrValues) {
                c14129a.m40230g(c41147a.m133645j(enumC35206b), new Integer(0));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zu0.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {142, 146}, m100432m = "shouldGenerateReport", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f177418E;

        /* JADX INFO: renamed from: w */
        Object f177419w;

        /* JADX INFO: renamed from: x */
        Object f177420x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177421y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f177421y = obj;
            this.f177418E |= Integer.MIN_VALUE;
            return C41147a.this.m133651r(this);
        }
    }

    /* JADX INFO: renamed from: zu0.a$h */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f177423w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41147a f177424x;

        /* JADX INFO: renamed from: zu0.a$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f177425w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C41147a f177426x;

            /* JADX INFO: renamed from: zu0.a$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl$startEventCollection$$inlined$map$1$2", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42774a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f177427E;

                /* JADX INFO: renamed from: F */
                Object f177428F;

                /* JADX INFO: renamed from: G */
                Object f177429G;

                /* JADX INFO: renamed from: H */
                Object f177430H;

                /* JADX INFO: renamed from: I */
                Object f177431I;

                /* JADX INFO: renamed from: J */
                Object f177432J;

                /* JADX INFO: renamed from: K */
                int f177433K;

                /* JADX INFO: renamed from: L */
                int f177434L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f177435w;

                /* JADX INFO: renamed from: x */
                int f177436x;

                /* JADX INFO: renamed from: y */
                Object f177437y;

                public C42774a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f177435w = obj;
                    this.f177436x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C41147a c41147a) {
                this.f177425w = interfaceC13062m;
                this.f177426x = c41147a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42774a c42774a;
                InterfaceC13062m interfaceC13062m;
                int i13;
                if (interfaceC30057d instanceof C42774a) {
                    c42774a = (C42774a) interfaceC30057d;
                    int i14 = c42774a.f177436x;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c42774a.f177436x = i14 - Integer.MIN_VALUE;
                    } else {
                        c42774a = new C42774a(interfaceC30057d);
                    }
                } else {
                    c42774a = new C42774a(interfaceC30057d);
                }
                Object obj2 = c42774a.f177435w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c42774a.f177436x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i15 != 0) {
                    if (i15 == 1) {
                        i13 = c42774a.f177433K;
                        interfaceC13062m = (InterfaceC13062m) c42774a.f177430H;
                        AbstractC34132o.m107864I(obj2);
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                }
                AbstractC34132o.m107864I(obj2);
                interfaceC13062m = this.f177425w;
                C41147a c41147a = this.f177426x;
                c42774a.f177437y = null;
                c42774a.f177427E = null;
                c42774a.f177428F = null;
                c42774a.f177429G = null;
                c42774a.f177430H = interfaceC13062m;
                c42774a.f177431I = null;
                c42774a.f177432J = null;
                c42774a.f177433K = 0;
                c42774a.f177434L = 0;
                c42774a.f177436x = 1;
                if (c41147a.m133648o((EnumC35206b) obj, c42774a) != enumC31071a) {
                    i13 = 0;
                }
                c42774a.f177437y = null;
                c42774a.f177427E = null;
                c42774a.f177428F = null;
                c42774a.f177429G = null;
                c42774a.f177430H = null;
                c42774a.f177431I = null;
                c42774a.f177432J = null;
                c42774a.f177433K = i13;
                c42774a.f177436x = 2;
                return interfaceC13062m.emit(c23454a0, c42774a) == enumC31071a ? enumC31071a : c23454a0;
            }
        }

        public h(InterfaceC13058l interfaceC13058l, C41147a c41147a) {
            this.f177423w = interfaceC13058l;
            this.f177424x = c41147a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f177423w.collect(new a(interfaceC13062m, this.f177424x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zu0.a$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {163}, m100432m = "updateLastGeneratedDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f177439w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f177440x;

        /* JADX INFO: renamed from: z */
        int f177442z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f177440x = obj;
            this.f177442z |= Integer.MIN_VALUE;
            return C41147a.this.m133653u(this);
        }
    }

    /* JADX INFO: renamed from: zu0.a$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.backgroundUsage.BackgroundUsageAggregatorImpl$updateLastGeneratedDate$2", m100430f = "BackgroundUsageAggregatorImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177443w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f177444x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f177445y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j7, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177445y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f177445y, interfaceC30057d);
            jVar.f177444x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f177444x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f177443w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C41147a.f177380J, new Long(this.f177445y));
            return C23454a0.f92919a;
        }
    }

    public C41147a(InterfaceC2994c0 coroutineScope, InterfaceC0422g dataStorePreferences, Clock clock, InterfaceC21030c metricWriter, InterfaceC4733b whoopStrapProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.dataStorePreferences = dataStorePreferences;
        this.clock = clock;
        this.metricWriter = metricWriter;
        this.whoopStrapProvider = whoopStrapProvider;
        this.logger = logger;
        this.logFlow = AbstractC13091v.m36592b(0, 0, null, 6);
        this.lastReportedMinute = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C14132d m133645j(EnumC35206b event) {
        return AbstractC15751g.m44423C("background-usage-event-" + event.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r1 == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (m133649p(r15, r4, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
    
        if (m133653u(r2) == r3) goto L46;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00dd -> B:40:0x00e0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m133646l(q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C41147a.m133646l(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    private final WhoopStrapInfo m133647n() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.get_strapInfo();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m133648o(EnumC35206b enumC35206b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f177407G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f177407G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f177405E;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = dVar.f177407G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                enumC35206b = (EnumC35206b) dVar.f177408w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        }
        AbstractC34132o.m107864I(obj);
        if (m133654v(enumC35206b)) {
            return c23454a0;
        }
        C14132d c14132dM133645j = m133645j(enumC35206b);
        InterfaceC0422g interfaceC0422g = this.dataStorePreferences;
        e eVar = new e(c14132dM133645j, null);
        dVar.f177408w = enumC35206b;
        dVar.f177409x = null;
        dVar.f177407G = 1;
        if (AbstractC17269i.m48861G(interfaceC0422g, eVar, dVar) != obj2) {
        }
        long epochMilli = Instant.now(this.clock).toEpochMilli();
        long j7 = epochMilli / 60000;
        this.lastReportedMinute.put(enumC35206b, new Long(j7));
        dVar.f177408w = null;
        dVar.f177409x = null;
        dVar.f177410y = epochMilli;
        dVar.f177411z = j7;
        dVar.f177407G = 2;
        return m133646l(dVar) == obj2 ? obj2 : c23454a0;
    }

    /* JADX INFO: renamed from: p */
    private final Object m133649p(EnumC35206b enumC35206b, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String lowerCase;
        InterfaceC27939b maximVersion;
        String strMo84319a;
        EnumC32978v whoopDeviceType;
        String codeName;
        WhoopStrapInfo whoopStrapInfoM133647n = m133647n();
        String str = "unknown";
        if (whoopStrapInfoM133647n == null || (whoopDeviceType = whoopStrapInfoM133647n.getWhoopDeviceType()) == null || (codeName = whoopDeviceType.getCodeName()) == null) {
            lowerCase = "unknown";
        } else {
            lowerCase = codeName.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        }
        WhoopStrapInfo whoopStrapInfoM133647n2 = m133647n();
        if (whoopStrapInfoM133647n2 != null && (maximVersion = whoopStrapInfoM133647n2.getMaximVersion()) != null && (strMo84319a = maximVersion.mo84319a()) != null) {
            str = strMo84319a;
        }
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "background_minutes_usage_over_24_hours_distribution", new Double(i13), AbstractC37056f.m118959K(AbstractC11266d.m30461o("event:", enumC35206b.getAnalyticsName()), "strap_device:".concat(lowerCase), "firmware_version:".concat(str)), MetricPostType.DISTRIBUTION, 1, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m133650q(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.dataStorePreferences, new f(null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (m133653u(r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m133651r(q83.InterfaceC30057d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zu0.C41147a.g
            if (r0 == 0) goto L13
            r0 = r6
            zu0.a$g r0 = (zu0.C41147a.g) r0
            int r1 = r0.f177418E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177418E = r1
            goto L18
        L13:
            zu0.a$g r0 = new zu0.a$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f177421y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f177418E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f177420x
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r0 = r0.f177419w
            f6.f r0 = (p138f6.AbstractC14134f) r0
            p505ts.AbstractC34132o.m107864I(r6)
            goto L6a
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L50
        L3e:
            p505ts.AbstractC34132o.m107864I(r6)
            a6.g r6 = r5.dataStorePreferences
            ec3.l r6 = r6.getData()
            r0.f177418E = r4
            java.lang.Object r6 = ec3.AbstractC13091v.m36575A(r6, r0)
            if (r6 != r1) goto L50
            goto L69
        L50:
            f6.f r6 = (p138f6.AbstractC14134f) r6
            f6.d r2 = zu0.C41147a.f177380J
            java.lang.Object r6 = r6.mo40227b(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L6d
            r6 = 0
            r0.f177419w = r6
            r0.f177420x = r6
            r0.f177418E = r3
            java.lang.Object r6 = r5.m133653u(r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L6d:
            long r0 = r6.longValue()
            java.time.Instant r6 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneOffset r0 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r6 = r6.atZone(r0)
            java.time.LocalDate r6 = r6.toLocalDate()
            java.time.Clock r1 = r5.clock
            java.time.Instant r1 = java.time.Instant.now(r1)
            java.time.ZonedDateTime r0 = r1.atZone(r0)
            java.time.LocalDate r0 = r0.toLocalDate()
            boolean r6 = r0.isAfter(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C41147a.m133651r(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: t */
    private final void m133652t() {
        AbstractC13091v.m36582H(new h(this.logFlow, this), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m133653u(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        long j7;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f177442z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f177442z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f177440x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f177442z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            long epochMilli = Instant.now(this.clock).toEpochMilli();
            InterfaceC0422g interfaceC0422g = this.dataStorePreferences;
            j jVar = new j(epochMilli, null);
            iVar.f177439w = epochMilli;
            iVar.f177442z = 1;
            if (AbstractC17269i.m48861G(interfaceC0422g, jVar, iVar) == enumC31071a) {
                return enumC31071a;
            }
            j7 = epochMilli;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = iVar.f177439w;
            AbstractC34132o.m107864I(obj);
        }
        this.logger.mo85216g(AbstractC11895b.m31994m(j7, "Updated last generated report date to: "), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private final boolean m133654v(EnumC35206b event) {
        long epochMilli = Instant.now(this.clock).toEpochMilli() / 60000;
        Long l7 = this.lastReportedMinute.get(event);
        return l7 != null && epochMilli == l7.longValue();
    }

    @Override // us0.InterfaceC35205a
    /* JADX INFO: renamed from: m */
    public void mo111546m(EnumC35206b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(event, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m133652t();
        this.logger.mo85216g("Started", new AbstractC30556a.a[0]);
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

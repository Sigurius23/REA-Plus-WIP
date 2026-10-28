package vk2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.activitysession.PauseSegment;
import com.whoop.trackactivity.domain.models.SessionTargets;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ei1.InterfaceC13220a;
import fv1.C14814b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import mk2.C25645l;
import mk2.InterfaceC25656w;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import tr2.InterfaceC34116n;
import wk2.AbstractC37344e;
import wk2.C37340a;
import wk2.C37343d;
import wk2.C37346g;
import wk2.C37348i;
import wk2.C37349j;
import wk2.InterfaceC37342c;
import x90.EnumC38101g;
import x90.InterfaceC38100f;
import yg2.C39530e;

/* JADX INFO: renamed from: vk2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020%¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020%¢\u0006\u0004\b*\u0010)Jb\u00105\u001a\u00020%2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u00101\u001a\u0002002\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u00102\u001a\u00020.2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002030+H\u0086@¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020%H\u0086@¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020P0T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u0002030O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010RR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u0002030T8\u0006¢\u0006\f\n\u0004\b\u001e\u0010V\u001a\u0004\b\\\u0010XR\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010_R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020,0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010bR\u0011\u0010f\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006g"}, m65681d2 = {"Lvk2/d;", "", "Lwk2/i;", "hrZoneAccumulator", "Lwk2/j;", "strainCaloriesAccumulator", "Lwk2/a;", "averageHeartRateAccumulator", "Lwk2/g;", "gpsRouteAccumulator", "Lei1/a;", "foregroundGpsRouteStorage", "Lx90/f;", "activitySessionHandler", "Lwk2/c;", "elapsedTimeSource", "Ljava/time/Clock;", "clock", "Lyg2/e;", "liveHrStateCombiner", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Lwk2/i;Lwk2/j;Lwk2/a;Lwk2/g;Lei1/a;Lx90/f;Lwk2/c;Ljava/time/Clock;Lyg2/e;Lbc3/c0;Ltr2/n;)V", "", "p", "()J", "sessionStartTimeMs", "o", "(J)J", "Lx90/g;", "state", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "Ll83/a0;", "u", "(Lx90/g;Ljava/util/List;)V", "t", "()V", "v", "Lec3/l;", "Lmk2/w;", "sessionUpdateFlow", "", "gpsTrackingEnabled", "", "activityInternalName", "enableHeartRateStream", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "targetsFlow", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;", "x", "(Lq83/d;)Ljava/lang/Object;", "a", "Lwk2/i;", "b", "Lwk2/j;", "c", "Lwk2/a;", "d", "Lwk2/g;", "e", "Lei1/a;", "f", "Lx90/f;", "g", "Lwk2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/time/Clock;", "i", "Lyg2/e;", "j", "Lbc3/c0;", "k", "Ltr2/n;", "Lec3/p1;", "Lmk2/l;", "l", "Lec3/p1;", "_trackSessionState", "Lec3/f2;", "m", "Lec3/f2;", "r", "()Lec3/f2;", "trackSessionState", "n", "_targets", "q", "targets", "Lbc3/k1;", "Lbc3/k1;", "sessionJob", "Lec3/o1;", "Lec3/o1;", "sessionControlFlow", "s", "()Z", "isRunning", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36092d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37348i hrZoneAccumulator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37349j strainCaloriesAccumulator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37340a averageHeartRateAccumulator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37346g gpsRouteAccumulator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13220a foregroundGpsRouteStorage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC38100f activitySessionHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC37342c elapsedTimeSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C39530e liveHrStateCombiner;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13075p1 _trackSessionState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13037f2 trackSessionState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC13075p1 _targets;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13037f2 targets;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private InterfaceC3027k1 sessionJob;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC13072o1 sessionControlFlow;

    /* JADX INFO: renamed from: vk2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder$persistPauseState$1", m100430f = "TrackSessionStateHolder.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f154249w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC38101g f154251y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<PauseSegment> f154252z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC38101g enumC38101g, List<PauseSegment> list, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154251y = enumC38101g;
            this.f154252z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36092d.this.new a(this.f154251y, this.f154252z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objMo122074c;
            Throwable thM68037a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154249w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38100f interfaceC38100f = C36092d.this.activitySessionHandler;
                EnumC38101g enumC38101g = this.f154251y;
                List<PauseSegment> list = this.f154252z;
                this.f154249w = 1;
                objMo122074c = interfaceC38100f.mo122074c(enumC38101g, list, this);
                if (objMo122074c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo122074c = ((C23468n) obj).f92940w;
            }
            if ((objMo122074c instanceof C23467m) && (thM68037a = C23468n.m68037a(objMo122074c)) != null) {
                C36092d.this.logger.mo85230v("Failed to persist activity session pause segments", thM68037a, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vk2.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder", m100430f = "TrackSessionStateHolder.kt", m100431l = {97}, m100432m = "start", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f154253E;

        /* JADX INFO: renamed from: F */
        boolean f154254F;

        /* JADX INFO: renamed from: G */
        long f154255G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f154256H;

        /* JADX INFO: renamed from: J */
        int f154258J;

        /* JADX INFO: renamed from: w */
        Object f154259w;

        /* JADX INFO: renamed from: x */
        Object f154260x;

        /* JADX INFO: renamed from: y */
        Object f154261y;

        /* JADX INFO: renamed from: z */
        Object f154262z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154256H = obj;
            this.f154258J |= Integer.MIN_VALUE;
            return C36092d.this.m114661w(null, false, 0L, null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: vk2.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2", m100430f = "TrackSessionStateHolder.kt", m100431l = {110, 194}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f154263E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C36092d f154264F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f154265G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ long f154266H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC13058l f154267I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f154268J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ List<PauseSegment> f154269K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC13058l f154270L;

        /* JADX INFO: renamed from: w */
        Object f154271w;

        /* JADX INFO: renamed from: x */
        long f154272x;

        /* JADX INFO: renamed from: y */
        int f154273y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f154274z;

        /* JADX INFO: renamed from: vk2.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2$1", m100430f = "TrackSessionStateHolder.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f154275w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13058l f154276x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36092d f154277y;

            /* JADX INFO: renamed from: vk2.d$c$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42551a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ C36092d f154278w;

                public C42551a(C36092d c36092d) {
                    this.f154278w = c36092d;
                }

                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(SessionTargets sessionTargets, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    ((C13045h2) this.f154278w._targets).m36570j(sessionTargets);
                    return C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13058l interfaceC13058l, C36092d c36092d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f154276x = interfaceC13058l;
                this.f154277y = c36092d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f154276x, this.f154277y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f154275w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058l = this.f154276x;
                    C42551a c42551a = new C42551a(this.f154277y);
                    this.f154275w = 1;
                    if (interfaceC13058l.collect(c42551a, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: vk2.d$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2$2", m100430f = "TrackSessionStateHolder.kt", m100431l = {151, 181}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvk2/b;", NotificationCompat.CATEGORY_PROGRESS, "Lmk2/w;", "update", "<anonymous>", "(Lvk2/b;Lmk2/w;)Lvk2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: E */
            Object f154279E;

            /* JADX INFO: renamed from: F */
            long f154280F;

            /* JADX INFO: renamed from: G */
            long f154281G;

            /* JADX INFO: renamed from: H */
            long f154282H;

            /* JADX INFO: renamed from: I */
            int f154283I;

            /* JADX INFO: renamed from: J */
            /* synthetic */ Object f154284J;

            /* JADX INFO: renamed from: K */
            /* synthetic */ Object f154285K;

            /* JADX INFO: renamed from: L */
            final /* synthetic */ C36092d f154286L;

            /* JADX INFO: renamed from: M */
            final /* synthetic */ long f154287M;

            /* JADX INFO: renamed from: w */
            Object f154288w;

            /* JADX INFO: renamed from: x */
            Object f154289x;

            /* JADX INFO: renamed from: y */
            Object f154290y;

            /* JADX INFO: renamed from: z */
            Object f154291z;

            /* JADX INFO: renamed from: vk2.d$c$b$a */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2$2$1", m100430f = "TrackSessionStateHolder.kt", m100431l = {182}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f154292w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C36092d f154293x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ long f154294y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ InterfaceC25656w f154295z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C36092d c36092d, long j7, InterfaceC25656w interfaceC25656w, InterfaceC30057d<? super a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f154293x = c36092d;
                    this.f154294y = j7;
                    this.f154295z = interfaceC25656w;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new a(this.f154293x, this.f154294y, this.f154295z, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f154292w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13220a interfaceC13220a = this.f154293x.foregroundGpsRouteStorage;
                        long j7 = this.f154294y;
                        C14814b location = ((InterfaceC25656w.c) this.f154295z).getLocation();
                        this.f154292w = 1;
                        if (interfaceC13220a.mo14810b(j7, location, this) == enumC31071a) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C36092d c36092d, long j7, InterfaceC30057d<? super b> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f154286L = c36092d;
                this.f154287M = j7;
            }

            @Override // p715kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C36090b c36090b, InterfaceC25656w interfaceC25656w, InterfaceC30057d<? super C36090b> interfaceC30057d) {
                b bVar = new b(this.f154286L, this.f154287M, interfaceC30057d);
                bVar.f154284J = c36090b;
                bVar.f154285K = interfaceC25656w;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
            
                if (bc3.AbstractC3006f0.m8705K(r0, r1, r12) == r8) goto L40;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vk2.C36092d.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: vk2.d$c$c, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2$3", m100430f = "TrackSessionStateHolder.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lvk2/b;", "it", "Ll83/a0;", "<anonymous>", "(Lvk2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42552c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f154296w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f154297x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36092d f154298y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42552c(C36092d c36092d, InterfaceC30057d<? super C42552c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f154298y = c36092d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C42552c c42552c = new C42552c(this.f154298y, interfaceC30057d);
                c42552c.f154297x = obj;
                return c42552c;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C36090b c36090b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42552c) create(c36090b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C36090b c36090b = (C36090b) this.f154297x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f154296w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                ((C13045h2) this.f154298y._trackSessionState).m36570j(c36090b.m114636j(this.f154298y.m114654p()));
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, C36092d c36092d, boolean z13, long j7, InterfaceC13058l interfaceC13058l, String str, List<PauseSegment> list, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154263E = z4;
            this.f154264F = c36092d;
            this.f154265G = z13;
            this.f154266H = j7;
            this.f154267I = interfaceC13058l;
            this.f154268J = str;
            this.f154269K = list;
            this.f154270L = interfaceC13058l2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f154263E, this.f154264F, this.f154265G, this.f154266H, this.f154267I, this.f154268J, this.f154269K, this.f154270L, interfaceC30057d);
            cVar.f154274z = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0135  */
        /* JADX WARN: Code duplicated, block: B:40:0x0139  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x013a, code lost:
        
            if (r0 == r3) goto L42;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vk2.C36092d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vk2.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.TrackSessionStateHolder", m100430f = "TrackSessionStateHolder.kt", m100431l = {211}, m100432m = "stop", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f154299w;

        /* JADX INFO: renamed from: y */
        int f154301y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154299w = obj;
            this.f154301y |= Integer.MIN_VALUE;
            return C36092d.this.m114662x(this);
        }
    }

    public C36092d(C37348i hrZoneAccumulator, C37349j strainCaloriesAccumulator, C37340a averageHeartRateAccumulator, C37346g gpsRouteAccumulator, InterfaceC13220a foregroundGpsRouteStorage, InterfaceC38100f activitySessionHandler, InterfaceC37342c elapsedTimeSource, Clock clock, C39530e liveHrStateCombiner, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(hrZoneAccumulator, "hrZoneAccumulator");
        AbstractC22676k.m65750j(strainCaloriesAccumulator, "strainCaloriesAccumulator");
        AbstractC22676k.m65750j(averageHeartRateAccumulator, "averageHeartRateAccumulator");
        AbstractC22676k.m65750j(gpsRouteAccumulator, "gpsRouteAccumulator");
        AbstractC22676k.m65750j(foregroundGpsRouteStorage, "foregroundGpsRouteStorage");
        AbstractC22676k.m65750j(activitySessionHandler, "activitySessionHandler");
        AbstractC22676k.m65750j(elapsedTimeSource, "elapsedTimeSource");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(liveHrStateCombiner, "liveHrStateCombiner");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.hrZoneAccumulator = hrZoneAccumulator;
        this.strainCaloriesAccumulator = strainCaloriesAccumulator;
        this.averageHeartRateAccumulator = averageHeartRateAccumulator;
        this.gpsRouteAccumulator = gpsRouteAccumulator;
        this.foregroundGpsRouteStorage = foregroundGpsRouteStorage;
        this.activitySessionHandler = activitySessionHandler;
        this.elapsedTimeSource = elapsedTimeSource;
        this.clock = clock;
        this.liveHrStateCombiner = liveHrStateCombiner;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C25645l(null, null, null, null, null, 31, null));
        this._trackSessionState = c13045h2M36593c;
        this.trackSessionState = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new SessionTargets(null, null, null, null, 15, null));
        this._targets = c13045h2M36593c2;
        this.targets = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.sessionControlFlow = AbstractC13091v.m36592b(0, 2, null, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final long m114653o(long sessionStartTimeMs) {
        long jM114654p = m114654p();
        long jMillis = this.clock.millis() - sessionStartTimeMs;
        if (jMillis < 0) {
            jMillis = 0;
        }
        return jM114654p - jMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final long m114654p() {
        ((C37343d) this.elapsedTimeSource).getClass();
        return AbstractC37344e.m119583b() / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m114655u(EnumC38101g state, List<PauseSegment> pauseSegments) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(state, pauseSegments, null), 3);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC13037f2 getTargets() {
        return this.targets;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final InterfaceC13037f2 getTrackSessionState() {
        return this.trackSessionState;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m114658s() {
        InterfaceC3027k1 interfaceC3027k1 = this.sessionJob;
        return interfaceC3027k1 != null && interfaceC3027k1.isActive();
    }

    /* JADX INFO: renamed from: t */
    public final void m114659t() {
        this.sessionControlFlow.mo36564a(InterfaceC25656w.d.f100877a);
    }

    /* JADX INFO: renamed from: v */
    public final void m114660v() {
        this.sessionControlFlow.mo36564a(InterfaceC25656w.e.f100878a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: w */
    public final Object m114661w(InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, List<PauseSegment> list, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        long j13;
        boolean z14;
        boolean z15;
        InterfaceC13058l interfaceC13058l3;
        List<PauseSegment> list2;
        String str2;
        InterfaceC13058l interfaceC13058l4;
        List<PauseSegment> list3;
        InterfaceC13058l interfaceC13058l5;
        InterfaceC13058l interfaceC13058l6;
        String str3;
        boolean z16;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f154258J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f154258J = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f154256H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f154258J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC3027k1 interfaceC3027k1 = this.sessionJob;
            if (interfaceC3027k1 != null) {
                bVar.f154259w = interfaceC13058l;
                bVar.f154260x = str;
                list3 = list;
                bVar.f154261y = list3;
                interfaceC13058l5 = interfaceC13058l2;
                bVar.f154262z = interfaceC13058l5;
                bVar.f154253E = z4;
                j13 = j7;
                bVar.f154255G = j13;
                z14 = z13;
                bVar.f154254F = z14;
                bVar.f154258J = 1;
                if (AbstractC3006f0.m8716j(interfaceC3027k1, bVar) == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC13058l6 = interfaceC13058l;
                str3 = str;
                z16 = z4;
            } else {
                j13 = j7;
                z14 = z13;
                z15 = z4;
                interfaceC13058l3 = interfaceC13058l2;
                list2 = list;
                str2 = str;
                interfaceC13058l4 = interfaceC13058l;
            }
            this.sessionJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(z14, this, z15, j13, interfaceC13058l4, str2, list2, interfaceC13058l3, null), 3);
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z17 = bVar.f154254F;
        long j14 = bVar.f154255G;
        z16 = bVar.f154253E;
        InterfaceC13058l interfaceC13058l7 = (InterfaceC13058l) bVar.f154262z;
        List<PauseSegment> list4 = (List) bVar.f154261y;
        str3 = (String) bVar.f154260x;
        interfaceC13058l6 = (InterfaceC13058l) bVar.f154259w;
        AbstractC34132o.m107864I(obj);
        interfaceC13058l5 = interfaceC13058l7;
        list3 = list4;
        z14 = z17;
        j13 = j14;
        InterfaceC13058l interfaceC13058l8 = interfaceC13058l5;
        list2 = list3;
        str2 = str3;
        interfaceC13058l3 = interfaceC13058l8;
        z15 = z16;
        interfaceC13058l4 = interfaceC13058l6;
        this.sessionJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(z14, this, z15, j13, interfaceC13058l4, str2, list2, interfaceC13058l3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m114662x(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f154301y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f154301y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f154299w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f154301y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC3027k1 interfaceC3027k1 = this.sessionJob;
            if (interfaceC3027k1 != null) {
                dVar.f154301y = 1;
                if (AbstractC3006f0.m8716j(interfaceC3027k1, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.sessionJob = null;
        InterfaceC13075p1 interfaceC13075p1 = this._trackSessionState;
        C25645l c25645l = new C25645l(null, null, null, null, null, 31, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, c25645l);
        InterfaceC13075p1 interfaceC13075p2 = this._targets;
        SessionTargets sessionTargets = new SessionTargets(null, null, null, null, 15, null);
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
        c13045h3.getClass();
        c13045h3.m36571k(null, sessionTargets);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36092d(C37348i c37348i, C37349j c37349j, C37340a c37340a, C37346g c37346g, InterfaceC13220a interfaceC13220a, InterfaceC38100f interfaceC38100f, InterfaceC37342c interfaceC37342c, Clock clock, C39530e c39530e, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        InterfaceC37342c interfaceC37342cM119584c = (i13 & 64) != 0 ? AbstractC37344e.m119584c() : interfaceC37342c;
        if ((i13 & 128) != 0) {
            Clock clockSystemUTC = Clock.systemUTC();
            AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
            clock2 = clockSystemUTC;
        } else {
            clock2 = clock;
        }
        this(c37348i, c37349j, c37340a, c37346g, interfaceC13220a, interfaceC38100f, interfaceC37342cM119584c, clock2, c39530e, interfaceC2994c0, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TrackSessionStateHolder") : interfaceC34116n);
    }
}

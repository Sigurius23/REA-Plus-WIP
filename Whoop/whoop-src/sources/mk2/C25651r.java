package mk2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.addactivity.network.CoreDetailsActivityResponse;
import com.whoop.addactivity.network.CreateActivityPauseSegment;
import com.whoop.addactivity.network.CreateActivityRequestV1;
import com.whoop.addactivity.network.model.ScoreType;
import com.whoop.data.remote.domain.request.UserState;
import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.trackactivity.domain.SessionTargetsFetcher;
import com.whoop.trackactivity.domain.models.LiveActivityTargetsResponse;
import com.whoop.trackactivity.domain.models.SessionTargets;
import com.whoop.trackactivity.domain.models.SessionTargetsKt;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ei1.InterfaceC13220a;
import fi1.C14520a;
import ha0.C17051d;
import ia0.C18292a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rk2.C31504h;
import rk2.InterfaceC31502f;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import x90.C38098d;
import x90.InterfaceC38100f;
import yb3.AbstractC39414r;
import yg2.C39530e;
import z92.InterfaceC40205a;
import zh1.InterfaceC40639a;

/* JADX INFO: renamed from: mk2.r */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0085\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0$2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b1\u00102J4\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u000207H\u0082@¢\u0006\u0004\b:\u0010;J0\u0010C\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020<H\u0082@¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020<2\u0006\u00104\u001a\u0002032\u0006\u0010B\u001a\u00020<H\u0082@¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\b\u0012\u0004\u0012\u00020G0$2\u0006\u0010=\u001a\u00020<2\u0006\u0010B\u001a\u00020<H\u0002¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K0$2\u0006\u0010J\u001a\u00020@H\u0002¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020-0$H\u0002¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020-0$H\u0002¢\u0006\u0004\bP\u0010OJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020-0$H\u0002¢\u0006\u0004\bQ\u0010OJ*\u0010V\u001a\u00020U2\u0006\u00104\u001a\u0002032\u0010\b\u0002\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0082@¢\u0006\u0004\bV\u0010WJ4\u0010^\u001a\u00020U2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030X2\u0006\u00104\u001a\u0002032\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\H\u0082@¢\u0006\u0004\b^\u0010_J\u0018\u0010`\u001a\u00020<2\u0006\u0010]\u001a\u00020\\H\u0082@¢\u0006\u0004\b`\u0010aJ\u0010\u0010c\u001a\u00020bH\u0082@¢\u0006\u0004\bc\u00102J\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020-0$H\u0002¢\u0006\u0004\bd\u0010OJ\u0010\u0010e\u001a\u00020bH\u0082@¢\u0006\u0004\be\u00102J\u0017\u0010h\u001a\u00020b2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ!\u0010k\u001a\u00020f2\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010j\u001a\u00020@H\u0002¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008b\u0001"}, m65681d2 = {"Lmk2/r;", "Lod1/g;", "Lmk2/p;", "Lmk2/q;", "Lx90/f;", "activitySessionHandler", "Lmk2/u;", "trackSessionServiceConnector", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Lia0/a;", "activityTypesRepository", "Lrk2/f;", "pendingActivitySaveStore", "Lrk2/h;", "saveActivityScheduler", "Lyg2/e;", "liveHrStateCombiner", "Lzh1/a;", "foregroundGpsCollector", "Lei1/a;", "foregroundGpsRouteStorage", "Lfi1/a;", "foregroundGpsUploadScheduler", "Lz92/a;", "userInfoAccessor", "Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;", "sessionTargetsFetcher", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "Lbc3/c0;", "backgroundScope", "<init>", "(Lx90/f;Lmk2/u;Lcom/whoop/service/network/ActivitiesApi;Lia0/a;Lrk2/f;Lrk2/h;Lyg2/e;Lzh1/a;Lei1/a;Lfi1/a;Lz92/a;Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/time/Clock;Ltr2/n;Lbc3/c0;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lmk2/a;", "E", "(Lmk2/p;)Lmk2/a;", "Lmk2/p$k;", "action", "Lmk2/n;", "J", "(Lmk2/p$k;)Lec3/l;", "Lcom/whoop/domain/model/UnitSystem;", "C", "(Lq83/d;)Ljava/lang/Object;", "Lx90/d;", "activeSession", "Lha0/d;", "activity", "Lmk2/j;", "contentType", "Lmk2/c;", "x", "(Lmk2/p$k;Lx90/d;Lha0/d;Lmk2/j;Lq83/d;)Ljava/lang/Object;", "", "gpsTrackingEnabled", "", "sessionStartTimeMs", "", "activityInternalName", "enableHeartRateStream", "K", "(ZJLjava/lang/String;ZLq83/d;)Ljava/lang/Object;", "t", "(Lx90/d;ZLq83/d;)Ljava/lang/Object;", "Lmk2/w;", "u", "(ZZ)Lec3/l;", "activityType", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "G", "(Ljava/lang/String;)Lec3/l;", "B", "()Lec3/l;", "D", "y", "", "Lcom/whoop/activitysession/PauseSegment;", "livePauseSegments", "Lmk2/g;", "F", "(Lx90/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lu02/a$b$a;", "result", "Ljava/time/Instant;", "endTime", "Lcom/whoop/addactivity/network/CreateActivityRequestV1;", "request", "A", "(Lu02/a$b$a;Lx90/d;Ljava/time/Instant;Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;", "z", "(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "L", "Lcom/whoop/data/remote/domain/request/UserState;", "state", "I", "(Lcom/whoop/data/remote/domain/request/UserState;)V", "fallbackInternalName", "H", "(Lha0/d;Ljava/lang/String;)Lcom/whoop/data/remote/domain/request/UserState;", "a", "Lx90/f;", "b", "Lmk2/u;", "c", "Lcom/whoop/service/network/ActivitiesApi;", "d", "Lia0/a;", "e", "Lrk2/f;", "f", "Lrk2/h;", "g", "Lyg2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzh1/a;", "i", "Lei1/a;", "j", "Lfi1/a;", "k", "Lz92/a;", "l", "Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;", "m", "Ljava/time/Clock;", "n", "Ltr2/n;", "o", "Lbc3/c0;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25651r implements InterfaceC27844g<InterfaceC25649p, C25650q> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC38100f activitySessionHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25654u trackSessionServiceConnector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31502f pendingActivitySaveStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C31504h saveActivityScheduler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39530e liveHrStateCombiner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC40639a foregroundGpsCollector;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13220a foregroundGpsRouteStorage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C14520a foregroundGpsUploadScheduler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final SessionTargetsFetcher sessionTargetsFetcher;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC2994c0 backgroundScope;

    /* JADX INFO: renamed from: mk2.r$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {358, 359}, m100432m = "clearSessionAfterFinish", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f100700w;

        /* JADX INFO: renamed from: y */
        int f100702y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100700w = obj;
            this.f100702y |= Integer.MIN_VALUE;
            return C25651r.this.m75529v(this);
        }
    }

    /* JADX INFO: renamed from: mk2.r$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$confirmDiscard$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {372, 373, 374, 376, 379, 380, 382}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmk2/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f100703E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f100704F;

        /* JADX INFO: renamed from: w */
        Object f100706w;

        /* JADX INFO: renamed from: x */
        Object f100707x;

        /* JADX INFO: renamed from: y */
        Object f100708y;

        /* JADX INFO: renamed from: z */
        int f100709z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C25651r.this.new b(interfaceC30057d);
            bVar.f100704F = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0077 A[PHI: r9
          0x0077: PHI (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v0 java.lang.Object) binds: [B:17:0x0073, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x008d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0094  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[DONT_INVERT, PHI: r2
          0x00b9: PHI (r2v11 x90.d) = (r2v7 x90.d), (r2v15 x90.d) binds: [B:30:0x00b6, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:36:0x00da  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f5 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38098d c38098d;
            Object objMo122075d;
            C38098d c38098d2;
            Object obj2;
            C25651r c25651r;
            AbstractC25647n.a aVar;
            InterfaceC13220a interfaceC13220a;
            long startTimeMs;
            AbstractC25647n.c cVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100704F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100703E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            switch (i13) {
                case 0:
                    AbstractC34132o.m107864I(obj);
                    AbstractC25647n.b bVar = AbstractC25647n.b.f100628a;
                    this.f100704F = interfaceC13062m;
                    this.f100703E = 1;
                    if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                        InterfaceC38100f interfaceC38100f = C25651r.this.activitySessionHandler;
                        this.f100704F = interfaceC13062m;
                        this.f100703E = 2;
                        obj = interfaceC38100f.mo122073b(this);
                        if (obj != enumC31071a) {
                            c38098d = (C38098d) obj;
                            InterfaceC38100f interfaceC38100f2 = C25651r.this.activitySessionHandler;
                            this.f100704F = interfaceC13062m;
                            this.f100706w = c38098d;
                            this.f100703E = 3;
                            objMo122075d = interfaceC38100f2.mo122075d(this);
                            if (objMo122075d != enumC31071a) {
                                c38098d2 = c38098d;
                                obj2 = objMo122075d;
                                if (obj2 instanceof C23467m) {
                                    aVar = AbstractC25647n.a.f100627a;
                                    this.f100704F = null;
                                    this.f100706w = null;
                                    this.f100707x = null;
                                    this.f100703E = 4;
                                    if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                                        return c23454a0;
                                    }
                                } else {
                                    c25651r = C25651r.this;
                                    this.f100704F = interfaceC13062m;
                                    this.f100706w = c38098d2;
                                    this.f100707x = null;
                                    this.f100703E = 5;
                                    if (c25651r.m75509L(this) != enumC31071a) {
                                        if (c38098d2 != null) {
                                            interfaceC13220a = C25651r.this.foregroundGpsRouteStorage;
                                            startTimeMs = c38098d2.getStartTimeMs();
                                            this.f100704F = interfaceC13062m;
                                            this.f100706w = null;
                                            this.f100707x = null;
                                            this.f100708y = null;
                                            this.f100709z = 0;
                                            this.f100703E = 6;
                                            if (interfaceC13220a.mo14811c(startTimeMs, this) != enumC31071a) {
                                                C25651r.this.m75506I(UserState.Idle);
                                                cVar = AbstractC25647n.c.f100629a;
                                                this.f100704F = null;
                                                this.f100706w = null;
                                                this.f100707x = null;
                                                this.f100708y = null;
                                                this.f100703E = 7;
                                                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                                    return c23454a0;
                                                }
                                            }
                                        } else {
                                            C25651r.this.m75506I(UserState.Idle);
                                            cVar = AbstractC25647n.c.f100629a;
                                            this.f100704F = null;
                                            this.f100706w = null;
                                            this.f100707x = null;
                                            this.f100708y = null;
                                            this.f100703E = 7;
                                            if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                                return c23454a0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return enumC31071a;
                case 1:
                    AbstractC34132o.m107864I(obj);
                    InterfaceC38100f interfaceC38100f3 = C25651r.this.activitySessionHandler;
                    this.f100704F = interfaceC13062m;
                    this.f100703E = 2;
                    obj = interfaceC38100f3.mo122073b(this);
                    if (obj != enumC31071a) {
                        c38098d = (C38098d) obj;
                        InterfaceC38100f interfaceC38100f4 = C25651r.this.activitySessionHandler;
                        this.f100704F = interfaceC13062m;
                        this.f100706w = c38098d;
                        this.f100703E = 3;
                        objMo122075d = interfaceC38100f4.mo122075d(this);
                        if (objMo122075d != enumC31071a) {
                            c38098d2 = c38098d;
                            obj2 = objMo122075d;
                            if (obj2 instanceof C23467m) {
                                aVar = AbstractC25647n.a.f100627a;
                                this.f100704F = null;
                                this.f100706w = null;
                                this.f100707x = null;
                                this.f100703E = 4;
                                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                                    return c23454a0;
                                }
                            } else {
                                c25651r = C25651r.this;
                                this.f100704F = interfaceC13062m;
                                this.f100706w = c38098d2;
                                this.f100707x = null;
                                this.f100703E = 5;
                                if (c25651r.m75509L(this) != enumC31071a) {
                                    if (c38098d2 != null) {
                                        interfaceC13220a = C25651r.this.foregroundGpsRouteStorage;
                                        startTimeMs = c38098d2.getStartTimeMs();
                                        this.f100704F = interfaceC13062m;
                                        this.f100706w = null;
                                        this.f100707x = null;
                                        this.f100708y = null;
                                        this.f100709z = 0;
                                        this.f100703E = 6;
                                        if (interfaceC13220a.mo14811c(startTimeMs, this) != enumC31071a) {
                                            C25651r.this.m75506I(UserState.Idle);
                                            cVar = AbstractC25647n.c.f100629a;
                                            this.f100704F = null;
                                            this.f100706w = null;
                                            this.f100707x = null;
                                            this.f100708y = null;
                                            this.f100703E = 7;
                                            if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                                return c23454a0;
                                            }
                                        }
                                    } else {
                                        C25651r.this.m75506I(UserState.Idle);
                                        cVar = AbstractC25647n.c.f100629a;
                                        this.f100704F = null;
                                        this.f100706w = null;
                                        this.f100707x = null;
                                        this.f100708y = null;
                                        this.f100703E = 7;
                                        if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                            return c23454a0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return enumC31071a;
                case 2:
                    AbstractC34132o.m107864I(obj);
                    c38098d = (C38098d) obj;
                    InterfaceC38100f interfaceC38100f5 = C25651r.this.activitySessionHandler;
                    this.f100704F = interfaceC13062m;
                    this.f100706w = c38098d;
                    this.f100703E = 3;
                    objMo122075d = interfaceC38100f5.mo122075d(this);
                    if (objMo122075d != enumC31071a) {
                        c38098d2 = c38098d;
                        obj2 = objMo122075d;
                        if (obj2 instanceof C23467m) {
                            aVar = AbstractC25647n.a.f100627a;
                            this.f100704F = null;
                            this.f100706w = null;
                            this.f100707x = null;
                            this.f100703E = 4;
                            if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                                return c23454a0;
                            }
                        } else {
                            c25651r = C25651r.this;
                            this.f100704F = interfaceC13062m;
                            this.f100706w = c38098d2;
                            this.f100707x = null;
                            this.f100703E = 5;
                            if (c25651r.m75509L(this) != enumC31071a) {
                                if (c38098d2 != null) {
                                    interfaceC13220a = C25651r.this.foregroundGpsRouteStorage;
                                    startTimeMs = c38098d2.getStartTimeMs();
                                    this.f100704F = interfaceC13062m;
                                    this.f100706w = null;
                                    this.f100707x = null;
                                    this.f100708y = null;
                                    this.f100709z = 0;
                                    this.f100703E = 6;
                                    if (interfaceC13220a.mo14811c(startTimeMs, this) != enumC31071a) {
                                        C25651r.this.m75506I(UserState.Idle);
                                        cVar = AbstractC25647n.c.f100629a;
                                        this.f100704F = null;
                                        this.f100706w = null;
                                        this.f100707x = null;
                                        this.f100708y = null;
                                        this.f100703E = 7;
                                        if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                            return c23454a0;
                                        }
                                    }
                                } else {
                                    C25651r.this.m75506I(UserState.Idle);
                                    cVar = AbstractC25647n.c.f100629a;
                                    this.f100704F = null;
                                    this.f100706w = null;
                                    this.f100707x = null;
                                    this.f100708y = null;
                                    this.f100703E = 7;
                                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            }
                        }
                    }
                    return enumC31071a;
                case 3:
                    c38098d2 = (C38098d) this.f100706w;
                    AbstractC34132o.m107864I(obj);
                    obj2 = ((C23468n) obj).f92940w;
                    if (obj2 instanceof C23467m) {
                        aVar = AbstractC25647n.a.f100627a;
                        this.f100704F = null;
                        this.f100706w = null;
                        this.f100707x = null;
                        this.f100703E = 4;
                        if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        c25651r = C25651r.this;
                        this.f100704F = interfaceC13062m;
                        this.f100706w = c38098d2;
                        this.f100707x = null;
                        this.f100703E = 5;
                        if (c25651r.m75509L(this) != enumC31071a) {
                            if (c38098d2 != null) {
                                interfaceC13220a = C25651r.this.foregroundGpsRouteStorage;
                                startTimeMs = c38098d2.getStartTimeMs();
                                this.f100704F = interfaceC13062m;
                                this.f100706w = null;
                                this.f100707x = null;
                                this.f100708y = null;
                                this.f100709z = 0;
                                this.f100703E = 6;
                                if (interfaceC13220a.mo14811c(startTimeMs, this) != enumC31071a) {
                                    C25651r.this.m75506I(UserState.Idle);
                                    cVar = AbstractC25647n.c.f100629a;
                                    this.f100704F = null;
                                    this.f100706w = null;
                                    this.f100707x = null;
                                    this.f100708y = null;
                                    this.f100703E = 7;
                                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            } else {
                                C25651r.this.m75506I(UserState.Idle);
                                cVar = AbstractC25647n.c.f100629a;
                                this.f100704F = null;
                                this.f100706w = null;
                                this.f100707x = null;
                                this.f100708y = null;
                                this.f100703E = 7;
                                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                    return c23454a0;
                                }
                            }
                        }
                    }
                    return enumC31071a;
                case 4:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 5:
                    c38098d2 = (C38098d) this.f100706w;
                    AbstractC34132o.m107864I(obj);
                    if (c38098d2 != null) {
                        interfaceC13220a = C25651r.this.foregroundGpsRouteStorage;
                        startTimeMs = c38098d2.getStartTimeMs();
                        this.f100704F = interfaceC13062m;
                        this.f100706w = null;
                        this.f100707x = null;
                        this.f100708y = null;
                        this.f100709z = 0;
                        this.f100703E = 6;
                        if (interfaceC13220a.mo14811c(startTimeMs, this) != enumC31071a) {
                            C25651r.this.m75506I(UserState.Idle);
                            cVar = AbstractC25647n.c.f100629a;
                            this.f100704F = null;
                            this.f100706w = null;
                            this.f100707x = null;
                            this.f100708y = null;
                            this.f100703E = 7;
                            if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                return c23454a0;
                            }
                        }
                    } else {
                        C25651r.this.m75506I(UserState.Idle);
                        cVar = AbstractC25647n.c.f100629a;
                        this.f100704F = null;
                        this.f100706w = null;
                        this.f100707x = null;
                        this.f100708y = null;
                        this.f100703E = 7;
                        if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                case 6:
                    AbstractC34132o.m107864I(obj);
                    C25651r.this.m75506I(UserState.Idle);
                    cVar = AbstractC25647n.c.f100629a;
                    this.f100704F = null;
                    this.f100706w = null;
                    this.f100707x = null;
                    this.f100708y = null;
                    this.f100703E = 7;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 7:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: mk2.r$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {149, 156, 166, 171}, m100432m = "connectToSession", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f100710E;

        /* JADX INFO: renamed from: F */
        long f100711F;

        /* JADX INFO: renamed from: G */
        int f100712G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f100713H;

        /* JADX INFO: renamed from: J */
        int f100715J;

        /* JADX INFO: renamed from: w */
        Object f100716w;

        /* JADX INFO: renamed from: x */
        Object f100717x;

        /* JADX INFO: renamed from: y */
        Object f100718y;

        /* JADX INFO: renamed from: z */
        Object f100719z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100713H = obj;
            this.f100715J |= Integer.MIN_VALUE;
            return C25651r.this.m75531x(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mk2.r$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$endSession$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {268, 271, 273, 275, 276, 279, 280, 281, 286, 287, 288, 295}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmk2/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f100720E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f100721F;

        /* JADX INFO: renamed from: w */
        Object f100723w;

        /* JADX INFO: renamed from: x */
        Object f100724x;

        /* JADX INFO: renamed from: y */
        Object f100725y;

        /* JADX INFO: renamed from: z */
        int f100726z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C25651r.this.new d(interfaceC30057d);
            dVar.f100721F = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:28:0x00da A[PHI: r2 r11
          0x00da: PHI (r2v11 java.util.List<com.whoop.activitysession.PauseSegment>) = 
          (r2v8 java.util.List<com.whoop.activitysession.PauseSegment>)
          (r2v14 java.util.List<com.whoop.activitysession.PauseSegment>)
         binds: [B:26:0x00d6, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]
          0x00da: PHI (r11v14 java.lang.Object) = (r11v13 java.lang.Object), (r11v0 java.lang.Object) binds: [B:26:0x00d6, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00de  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:36:0x0115  */
        /* JADX WARN: Code duplicated, block: B:40:0x012b A[PHI: r2
          0x012b: PHI (r2v23 mk2.g) = (r2v15 mk2.g), (r2v32 mk2.g) binds: [B:38:0x0127, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x012f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0144  */
        /* JADX WARN: Code duplicated, block: B:48:0x0159  */
        /* JADX WARN: Code duplicated, block: B:51:0x016f  */
        /* JADX WARN: Code duplicated, block: B:53:0x0173  */
        /* JADX WARN: Code duplicated, block: B:56:0x0188  */
        /* JADX WARN: Code duplicated, block: B:58:0x018c  */
        /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:66:0x01cb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:72:0x01e5  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
        
            if (r11 == r1) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x016b, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0185, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x019e, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01c8, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01df, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L69;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 522
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mk2.C25651r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mk2.r$e */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {339}, m100432m = "enqueuePendingSave", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f100727w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100728x;

        /* JADX INFO: renamed from: z */
        int f100730z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100728x = obj;
            this.f100730z |= Integer.MIN_VALUE;
            return C25651r.this.m75533z(null, this);
        }
    }

    /* JADX INFO: renamed from: mk2.r$f */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {335}, m100432m = "handleHttpError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f100731E;

        /* JADX INFO: renamed from: G */
        int f100733G;

        /* JADX INFO: renamed from: w */
        Object f100734w;

        /* JADX INFO: renamed from: x */
        Object f100735x;

        /* JADX INFO: renamed from: y */
        Object f100736y;

        /* JADX INFO: renamed from: z */
        Object f100737z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100731E = obj;
            this.f100733G |= Integer.MIN_VALUE;
            return C25651r.this.m75498A(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mk2.r$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100738w;

        /* JADX INFO: renamed from: mk2.r$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100739w;

            /* JADX INFO: renamed from: mk2.r$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41999a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f100741F;

                /* JADX INFO: renamed from: G */
                Object f100742G;

                /* JADX INFO: renamed from: H */
                int f100743H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100744w;

                /* JADX INFO: renamed from: x */
                int f100745x;

                /* JADX INFO: renamed from: y */
                Object f100746y;

                /* JADX INFO: renamed from: z */
                Object f100747z;

                public C41999a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100744w = obj;
                    this.f100745x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100739w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41999a c41999a;
                if (interfaceC30057d instanceof C41999a) {
                    c41999a = (C41999a) interfaceC30057d;
                    int i13 = c41999a.f100745x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41999a.f100745x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41999a = new C41999a(interfaceC30057d);
                    }
                } else {
                    c41999a = new C41999a(interfaceC30057d);
                }
                Object obj2 = c41999a.f100744w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41999a.f100745x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100739w;
                    if (obj instanceof AbstractC25634a.b) {
                        c41999a.f100746y = null;
                        c41999a.f100747z = null;
                        c41999a.f100741F = null;
                        c41999a.f100742G = null;
                        c41999a.f100743H = 0;
                        c41999a.f100745x = 1;
                        if (interfaceC13062m.emit(obj, c41999a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f100738w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100738w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$h */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100748w;

        /* JADX INFO: renamed from: mk2.r$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100749w;

            /* JADX INFO: renamed from: mk2.r$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$$inlined$filterIsInstance$2$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42000a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f100751F;

                /* JADX INFO: renamed from: G */
                Object f100752G;

                /* JADX INFO: renamed from: H */
                int f100753H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100754w;

                /* JADX INFO: renamed from: x */
                int f100755x;

                /* JADX INFO: renamed from: y */
                Object f100756y;

                /* JADX INFO: renamed from: z */
                Object f100757z;

                public C42000a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100754w = obj;
                    this.f100755x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100749w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42000a c42000a;
                if (interfaceC30057d instanceof C42000a) {
                    c42000a = (C42000a) interfaceC30057d;
                    int i13 = c42000a.f100755x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42000a.f100755x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42000a = new C42000a(interfaceC30057d);
                    }
                } else {
                    c42000a = new C42000a(interfaceC30057d);
                }
                Object obj2 = c42000a.f100754w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42000a.f100755x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100749w;
                    if (obj instanceof AbstractC25634a.a) {
                        c42000a.f100756y = null;
                        c42000a.f100757z = null;
                        c42000a.f100751F = null;
                        c42000a.f100752G = null;
                        c42000a.f100753H = 0;
                        c42000a.f100755x = 1;
                        if (interfaceC13062m.emit(obj, c42000a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l) {
            this.f100748w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100748w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100758w;

        /* JADX INFO: renamed from: mk2.r$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100759w;

            /* JADX INFO: renamed from: mk2.r$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$$inlined$filterIsInstance$3$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42001a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f100761F;

                /* JADX INFO: renamed from: G */
                Object f100762G;

                /* JADX INFO: renamed from: H */
                int f100763H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100764w;

                /* JADX INFO: renamed from: x */
                int f100765x;

                /* JADX INFO: renamed from: y */
                Object f100766y;

                /* JADX INFO: renamed from: z */
                Object f100767z;

                public C42001a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100764w = obj;
                    this.f100765x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100759w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42001a c42001a;
                if (interfaceC30057d instanceof C42001a) {
                    c42001a = (C42001a) interfaceC30057d;
                    int i13 = c42001a.f100765x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42001a.f100765x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42001a = new C42001a(interfaceC30057d);
                    }
                } else {
                    c42001a = new C42001a(interfaceC30057d);
                }
                Object obj2 = c42001a.f100764w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42001a.f100765x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100759w;
                    if (obj instanceof AbstractC25634a.c) {
                        c42001a.f100766y = null;
                        c42001a.f100767z = null;
                        c42001a.f100761F = null;
                        c42001a.f100762G = null;
                        c42001a.f100763H = 0;
                        c42001a.f100765x = 1;
                        if (interfaceC13062m.emit(obj, c42001a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f100758w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100758w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$j */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100768w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100769x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100770y;

        public j(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC25634a.b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f100769x = interfaceC13062m;
            jVar.f100770y = bVar;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100768w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100769x;
                InterfaceC13058l events = ((AbstractC25634a.b) this.f100770y).getEvents();
                this.f100769x = null;
                this.f100770y = null;
                this.f100768w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, events, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC25634a.b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: mk2.r$k */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100771w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25651r f100772x;

        /* JADX INFO: renamed from: mk2.r$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100773w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25651r f100774x;

            /* JADX INFO: renamed from: mk2.r$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$$inlined$map$1$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42002a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100775E;

                /* JADX INFO: renamed from: F */
                Object f100776F;

                /* JADX INFO: renamed from: G */
                Object f100777G;

                /* JADX INFO: renamed from: H */
                int f100778H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100779w;

                /* JADX INFO: renamed from: x */
                int f100780x;

                /* JADX INFO: renamed from: y */
                Object f100781y;

                public C42002a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100779w = obj;
                    this.f100780x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25651r c25651r) {
                this.f100773w = interfaceC13062m;
                this.f100774x = c25651r;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42002a c42002a;
                if (interfaceC30057d instanceof C42002a) {
                    c42002a = (C42002a) interfaceC30057d;
                    int i13 = c42002a.f100780x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42002a.f100780x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42002a = new C42002a(interfaceC30057d);
                    }
                } else {
                    c42002a = new C42002a(interfaceC30057d);
                }
                Object obj2 = c42002a.f100779w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42002a.f100780x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100773w;
                    AbstractC25634a abstractC25634aM75502E = this.f100774x.m75502E((InterfaceC25649p) obj);
                    c42002a.f100781y = null;
                    c42002a.f100775E = null;
                    c42002a.f100776F = null;
                    c42002a.f100777G = null;
                    c42002a.f100778H = 0;
                    c42002a.f100780x = 1;
                    if (interfaceC13062m.emit(abstractC25634aM75502E, c42002a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l, C25651r c25651r) {
            this.f100771w = interfaceC13058l;
            this.f100772x = c25651r;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100771w.collect(new a(interfaceC13062m, this.f100772x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$l */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100783w;

        /* JADX INFO: renamed from: mk2.r$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100784w;

            /* JADX INFO: renamed from: mk2.r$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$$inlined$map$2$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42003a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100785E;

                /* JADX INFO: renamed from: F */
                Object f100786F;

                /* JADX INFO: renamed from: G */
                Object f100787G;

                /* JADX INFO: renamed from: H */
                int f100788H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100789w;

                /* JADX INFO: renamed from: x */
                int f100790x;

                /* JADX INFO: renamed from: y */
                Object f100791y;

                public C42003a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100789w = obj;
                    this.f100790x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100784w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42003a c42003a;
                if (interfaceC30057d instanceof C42003a) {
                    c42003a = (C42003a) interfaceC30057d;
                    int i13 = c42003a.f100790x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42003a.f100790x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42003a = new C42003a(interfaceC30057d);
                    }
                } else {
                    c42003a = new C42003a(interfaceC30057d);
                }
                Object obj2 = c42003a.f100789w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42003a.f100790x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100784w;
                    AbstractC25647n.i iVar = new AbstractC25647n.i(((AbstractC25634a.a) obj).getAction());
                    c42003a.f100791y = null;
                    c42003a.f100785E = null;
                    c42003a.f100786F = null;
                    c42003a.f100787G = null;
                    c42003a.f100788H = 0;
                    c42003a.f100790x = 1;
                    if (interfaceC13062m.emit(iVar, c42003a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l) {
            this.f100783w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100783w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$m */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lmk2/q;", "state", "Lmk2/n;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Lmk2/q;Lmk2/n;)Lmk2/q;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100793w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100794x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100795y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C25650q c25650q, AbstractC25647n abstractC25647n, InterfaceC30057d<? super C25650q> interfaceC30057d) {
            m mVar = new m(interfaceC30057d);
            mVar.f100794x = c25650q;
            mVar.f100795y = abstractC25647n;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C25650q c25650q = (C25650q) this.f100794x;
            AbstractC25647n abstractC25647n = (AbstractC25647n) this.f100795y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100793w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return abstractC25647n.m75464a(c25650q);
        }
    }

    /* JADX INFO: renamed from: mk2.r$n */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$interact$sessionControlEvents$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lmk2/a$c;", "it", "Lec3/l;", "Lmk2/n;", "<anonymous>", "(Lmk2/a$c;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100796w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100797x;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = new n(interfaceC30057d);
            nVar.f100797x = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC25634a.c cVar, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((n) create(cVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC25634a.c cVar = (AbstractC25634a.c) this.f100797x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100796w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return cVar.getEvents();
        }
    }

    /* JADX INFO: renamed from: mk2.r$o */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$pauseSession$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmk2/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100798w;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25651r.this.new o(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100798w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C25651r.this.trackSessionServiceConnector.pause();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$p */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {134}, m100432m = "resolveUnitSystem", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f100800E;

        /* JADX INFO: renamed from: w */
        Object f100801w;

        /* JADX INFO: renamed from: x */
        int f100802x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100803y;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100803y = obj;
            this.f100800E |= Integer.MIN_VALUE;
            return C25651r.this.m75500C(this);
        }
    }

    /* JADX INFO: renamed from: mk2.r$q */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$resumeSession$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmk2/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100805w;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25651r.this.new q(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100805w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C25651r.this.trackSessionServiceConnector.resume();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$r */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {313, 315, 316}, m100432m = "saveActivity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f100807E;

        /* JADX INFO: renamed from: F */
        Object f100808F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f100809G;

        /* JADX INFO: renamed from: I */
        int f100811I;

        /* JADX INFO: renamed from: w */
        Object f100812w;

        /* JADX INFO: renamed from: x */
        Object f100813x;

        /* JADX INFO: renamed from: y */
        Object f100814y;

        /* JADX INFO: renamed from: z */
        Object f100815z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100809G = obj;
            this.f100811I |= Integer.MIN_VALUE;
            return C25651r.this.m75503F(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mk2.r$s */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$saveActivity$result$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {313}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f100816w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CreateActivityRequestV1 f100818y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(CreateActivityRequestV1 createActivityRequestV1, InterfaceC30057d<? super s> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f100818y = createActivityRequestV1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C25651r.this.new s(this.f100818y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100816w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivitiesApi activitiesApi = C25651r.this.activitiesApi;
            CreateActivityRequestV1 createActivityRequestV1 = this.f100818y;
            this.f100816w = 1;
            Object objCreateActivity = activitiesApi.createActivity(createActivityRequestV1, this);
            return objCreateActivity == enumC31071a ? enumC31071a : objCreateActivity;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<CoreDetailsActivityResponse>> interfaceC30057d) {
            return ((s) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: mk2.r$t */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100819w;

        /* JADX INFO: renamed from: mk2.r$t$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100820w;

            /* JADX INFO: renamed from: mk2.r$t$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$sessionTargetsUpdateFlow$$inlined$mapNotNull$1$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {57}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42004a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100821E;

                /* JADX INFO: renamed from: F */
                Object f100822F;

                /* JADX INFO: renamed from: G */
                Object f100823G;

                /* JADX INFO: renamed from: H */
                Object f100824H;

                /* JADX INFO: renamed from: I */
                int f100825I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100826w;

                /* JADX INFO: renamed from: x */
                int f100827x;

                /* JADX INFO: renamed from: y */
                Object f100828y;

                public C42004a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100826w = obj;
                    this.f100827x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100820w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42004a c42004a;
                LiveActivityTargetsResponse liveActivityTargetsResponse;
                if (interfaceC30057d instanceof C42004a) {
                    c42004a = (C42004a) interfaceC30057d;
                    int i13 = c42004a.f100827x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42004a.f100827x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42004a = new C42004a(interfaceC30057d);
                    }
                } else {
                    c42004a = new C42004a(interfaceC30057d);
                }
                Object obj2 = c42004a.f100826w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42004a.f100827x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100820w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        liveActivityTargetsResponse = (LiveActivityTargetsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData();
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        liveActivityTargetsResponse = (LiveActivityTargetsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData();
                    } else {
                        liveActivityTargetsResponse = interfaceC29354a instanceof InterfaceC29354a.d ? (LiveActivityTargetsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData() : null;
                    }
                    SessionTargets sessionTargets = liveActivityTargetsResponse != null ? SessionTargetsKt.toSessionTargets(liveActivityTargetsResponse) : null;
                    if (sessionTargets != null) {
                        c42004a.f100828y = null;
                        c42004a.f100821E = null;
                        c42004a.f100822F = null;
                        c42004a.f100823G = null;
                        c42004a.f100824H = null;
                        c42004a.f100825I = 0;
                        c42004a.f100827x = 1;
                        if (interfaceC13062m.emit(sessionTargets, c42004a) == enumC31071a) {
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

        public t(InterfaceC13058l interfaceC13058l) {
            this.f100819w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100819w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.r$u */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$setUserState$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {393}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100830w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ UserState f100832y;

        /* JADX INFO: renamed from: mk2.r$u$a */
        @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$setUserState$1$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {394}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f100833w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25651r f100834x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ UserState f100835y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25651r c25651r, UserState userState, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f100834x = c25651r;
                this.f100835y = userState;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f100834x, this.f100835y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f100833w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivitiesApi activitiesApi = this.f100834x.activitiesApi;
                UserStateRequestBody userStateRequestBody = new UserStateRequestBody(this.f100835y);
                this.f100833w = 1;
                Object userState = activitiesApi.setUserState(userStateRequestBody, this);
                return userState == enumC31071a ? enumC31071a : userState;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(UserState userState, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100832y = userState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25651r.this.new u(this.f100832y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100830w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C25651r.this.logger;
                String str = "Failed to set user state to " + this.f100832y;
                a aVar = new a(C25651r.this, this.f100832y, null);
                this.f100830w = 1;
                if (InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, str, aVar, this, 2, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: mk2.r$v */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$startHandoff$1", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {94, 96, 112, 105, 116, 118, 119, 128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmk2/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f100836E;

        /* JADX INFO: renamed from: F */
        Object f100837F;

        /* JADX INFO: renamed from: G */
        Object f100838G;

        /* JADX INFO: renamed from: H */
        Object f100839H;

        /* JADX INFO: renamed from: I */
        Object f100840I;

        /* JADX INFO: renamed from: J */
        Object f100841J;

        /* JADX INFO: renamed from: K */
        Object f100842K;

        /* JADX INFO: renamed from: L */
        int f100843L;

        /* JADX INFO: renamed from: M */
        private /* synthetic */ Object f100844M;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ InterfaceC25649p.k f100846O;

        /* JADX INFO: renamed from: w */
        Object f100847w;

        /* JADX INFO: renamed from: x */
        Object f100848x;

        /* JADX INFO: renamed from: y */
        Object f100849y;

        /* JADX INFO: renamed from: z */
        Object f100850z;

        /* JADX INFO: renamed from: mk2.r$v$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f100851a;

            static {
                int[] iArr = new int[EnumC25636c.values().length];
                try {
                    iArr[EnumC25636c.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC25636c.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC25636c.PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f100851a = iArr;
            }
        }

        /* JADX INFO: renamed from: mk2.r$v$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f100852w;

            /* JADX INFO: renamed from: mk2.r$v$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f100853w;

                /* JADX INFO: renamed from: mk2.r$v$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$startHandoff$1$invokeSuspend$$inlined$map$1$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42005a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f100854E;

                    /* JADX INFO: renamed from: F */
                    Object f100855F;

                    /* JADX INFO: renamed from: G */
                    Object f100856G;

                    /* JADX INFO: renamed from: H */
                    int f100857H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f100858w;

                    /* JADX INFO: renamed from: x */
                    int f100859x;

                    /* JADX INFO: renamed from: y */
                    Object f100860y;

                    public C42005a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f100858w = obj;
                        this.f100859x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f100853w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42005a c42005a;
                    if (interfaceC30057d instanceof C42005a) {
                        c42005a = (C42005a) interfaceC30057d;
                        int i13 = c42005a.f100859x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42005a.f100859x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42005a = new C42005a(interfaceC30057d);
                        }
                    } else {
                        c42005a = new C42005a(interfaceC30057d);
                    }
                    Object obj2 = c42005a.f100858w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42005a.f100859x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f100853w;
                        AbstractC25647n.g gVar = new AbstractC25647n.g((C25645l) obj);
                        c42005a.f100860y = null;
                        c42005a.f100854E = null;
                        c42005a.f100855F = null;
                        c42005a.f100856G = null;
                        c42005a.f100857H = 0;
                        c42005a.f100859x = 1;
                        if (interfaceC13062m.emit(gVar, c42005a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l) {
                this.f100852w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f100852w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: mk2.r$v$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f100862w;

            /* JADX INFO: renamed from: mk2.r$v$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f100863w;

                /* JADX INFO: renamed from: mk2.r$v$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$startHandoff$1$invokeSuspend$$inlined$map$2$2", m100430f = "TrackSessionMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42006a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f100864E;

                    /* JADX INFO: renamed from: F */
                    Object f100865F;

                    /* JADX INFO: renamed from: G */
                    Object f100866G;

                    /* JADX INFO: renamed from: H */
                    int f100867H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f100868w;

                    /* JADX INFO: renamed from: x */
                    int f100869x;

                    /* JADX INFO: renamed from: y */
                    Object f100870y;

                    public C42006a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f100868w = obj;
                        this.f100869x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f100863w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42006a c42006a;
                    if (interfaceC30057d instanceof C42006a) {
                        c42006a = (C42006a) interfaceC30057d;
                        int i13 = c42006a.f100869x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42006a.f100869x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42006a = new C42006a(interfaceC30057d);
                        }
                    } else {
                        c42006a = new C42006a(interfaceC30057d);
                    }
                    Object obj2 = c42006a.f100868w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42006a.f100869x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f100863w;
                        AbstractC25647n.o oVar = new AbstractC25647n.o((SessionTargets) obj);
                        c42006a.f100870y = null;
                        c42006a.f100864E = null;
                        c42006a.f100865F = null;
                        c42006a.f100866G = null;
                        c42006a.f100867H = 0;
                        c42006a.f100869x = 1;
                        if (interfaceC13062m.emit(oVar, c42006a) == enumC31071a) {
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

            public c(InterfaceC13058l interfaceC13058l) {
                this.f100862w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f100862w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC25649p.k kVar, InterfaceC30057d<? super v> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100846O = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            v vVar = C25651r.this.new v(this.f100846O, interfaceC30057d);
            vVar.f100844M = obj;
            return vVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x007e A[PHI: r0 r1 r2
          0x007e: PHI (r0v17 mk2.j) = (r0v13 mk2.j), (r0v23 mk2.j) binds: [B:57:0x01e5, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r1v26 ha0.d) = (r1v22 ha0.d), (r1v29 ha0.d) binds: [B:57:0x01e5, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r2v16 x90.d) = (r2v12 x90.d), (r2v20 x90.d) binds: [B:57:0x01e5, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:26:0x0111  */
        /* JADX WARN: Code duplicated, block: B:30:0x011f  */
        /* JADX WARN: Code duplicated, block: B:36:0x013a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0151 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0153  */
        /* JADX WARN: Code duplicated, block: B:45:0x017d  */
        /* JADX WARN: Code duplicated, block: B:48:0x0182  */
        /* JADX WARN: Code duplicated, block: B:49:0x0187  */
        /* JADX WARN: Code duplicated, block: B:51:0x018a  */
        /* JADX WARN: Code duplicated, block: B:55:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:62:0x0204 A[PHI: r0
          0x0204: PHI (r0v24 java.lang.Object) = (r0v19 java.lang.Object), (r0v43 java.lang.Object) binds: [B:60:0x0200, B:8:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:64:0x0210 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:65:0x0212 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x0216  */
        /* JADX WARN: Code duplicated, block: B:69:0x021c  */
        /* JADX WARN: Code duplicated, block: B:72:0x0235  */
        /* JADX WARN: Code duplicated, block: B:75:0x024d  */
        /* JADX WARN: Code duplicated, block: B:80:0x0131 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0232, code lost:
        
            if (r6.emit(r0, r21) == r7) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0289, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r6, r0, r21) == r7) goto L77;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 678
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mk2.C25651r.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C25651r(InterfaceC38100f activitySessionHandler, InterfaceC25654u trackSessionServiceConnector, ActivitiesApi activitiesApi, C18292a activityTypesRepository, InterfaceC31502f pendingActivitySaveStore, C31504h saveActivityScheduler, C39530e liveHrStateCombiner, InterfaceC40639a foregroundGpsCollector, InterfaceC13220a foregroundGpsRouteStorage, C14520a foregroundGpsUploadScheduler, InterfaceC40205a userInfoAccessor, SessionTargetsFetcher sessionTargetsFetcher, Clock clock, InterfaceC34116n logger, InterfaceC2994c0 backgroundScope) {
        AbstractC22676k.m65750j(activitySessionHandler, "activitySessionHandler");
        AbstractC22676k.m65750j(trackSessionServiceConnector, "trackSessionServiceConnector");
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(pendingActivitySaveStore, "pendingActivitySaveStore");
        AbstractC22676k.m65750j(saveActivityScheduler, "saveActivityScheduler");
        AbstractC22676k.m65750j(liveHrStateCombiner, "liveHrStateCombiner");
        AbstractC22676k.m65750j(foregroundGpsCollector, "foregroundGpsCollector");
        AbstractC22676k.m65750j(foregroundGpsRouteStorage, "foregroundGpsRouteStorage");
        AbstractC22676k.m65750j(foregroundGpsUploadScheduler, "foregroundGpsUploadScheduler");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(sessionTargetsFetcher, "sessionTargetsFetcher");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(backgroundScope, "backgroundScope");
        this.activitySessionHandler = activitySessionHandler;
        this.trackSessionServiceConnector = trackSessionServiceConnector;
        this.activitiesApi = activitiesApi;
        this.activityTypesRepository = activityTypesRepository;
        this.pendingActivitySaveStore = pendingActivitySaveStore;
        this.saveActivityScheduler = saveActivityScheduler;
        this.liveHrStateCombiner = liveHrStateCombiner;
        this.foregroundGpsCollector = foregroundGpsCollector;
        this.foregroundGpsRouteStorage = foregroundGpsRouteStorage;
        this.foregroundGpsUploadScheduler = foregroundGpsUploadScheduler;
        this.userInfoAccessor = userInfoAccessor;
        this.sessionTargetsFetcher = sessionTargetsFetcher;
        this.clock = clock;
        this.logger = logger;
        this.backgroundScope = backgroundScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m75498A(InterfaceC34385a.b.a<?> aVar, C38098d c38098d, Instant instant, CreateActivityRequestV1 createActivityRequestV1, InterfaceC30057d<? super AbstractC25640g> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f100733G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f100733G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM75533z = fVar.f100731E;
        Object obj = EnumC31071a.f128113w;
        int i14 = fVar.f100733G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75533z);
            if (aVar.getErrorCode() == 409) {
                this.logger.mo85222m("Activity save rejected as a conflict (409)", new AbstractC30556a.a[0]);
                OffsetDateTime offsetDateTimeOfInstant = OffsetDateTime.ofInstant(Instant.ofEpochMilli(c38098d.getStartTimeMs()), ZoneId.systemDefault());
                AbstractC22676k.m65749i(offsetDateTimeOfInstant, "ofInstant(...)");
                OffsetDateTime offsetDateTimeOfInstant2 = OffsetDateTime.ofInstant(instant, ZoneId.systemDefault());
                AbstractC22676k.m65749i(offsetDateTimeOfInstant2, "ofInstant(...)");
                return new AbstractC25640g.a(offsetDateTimeOfInstant, offsetDateTimeOfInstant2, c38098d.getSelectedActivityInternalName());
            }
            fVar.f100734w = null;
            fVar.f100735x = null;
            fVar.f100736y = null;
            fVar.f100737z = null;
            fVar.f100733G = 1;
            objM75533z = m75533z(createActivityRequestV1, fVar);
            if (objM75533z == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM75533z);
        }
        return ((Boolean) objM75533z).booleanValue() ? AbstractC25640g.d.f100597a : AbstractC25640g.b.f100595a;
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC13058l m75499B() {
        return new C13084s1(new o(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m75500C(InterfaceC30057d<? super UnitSystem> interfaceC30057d) {
        p pVar;
        Object objM107888l;
        UserProfile profile;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f100800E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f100800E = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        Object objMo129089c = pVar.f100803y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = pVar.f100800E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo129089c);
                InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
                pVar.f100801w = null;
                pVar.f100802x = 0;
                pVar.f100800E = 1;
                objMo129089c = interfaceC40205a.mo129089c(pVar);
                if (objMo129089c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo129089c);
            }
            User user = (User) objMo129089c;
            objM107888l = (user == null || (profile = user.getProfile()) == null) ? null : profile.getUnitSystem();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        UnitSystem unitSystem = (UnitSystem) (objM107888l instanceof C23467m ? null : objM107888l);
        return unitSystem == null ? UnitSystem.IMPERIAL : unitSystem;
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC13058l m75501D() {
        return new C13084s1(new q(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final AbstractC25634a m75502E(InterfaceC25649p interfaceC25649p) {
        if (interfaceC25649p instanceof InterfaceC25649p.k) {
            return new AbstractC25634a.b(m75507J((InterfaceC25649p.k) interfaceC25649p));
        }
        if (AbstractC22676k.m65745e(interfaceC25649p, InterfaceC25649p.e.f100663a)) {
            return new AbstractC25634a.b(m75532y());
        }
        if (AbstractC22676k.m65745e(interfaceC25649p, InterfaceC25649p.d.f100662a)) {
            return new AbstractC25634a.b(m75530w());
        }
        if (AbstractC22676k.m65745e(interfaceC25649p, InterfaceC25649p.i.f100666a)) {
            return new AbstractC25634a.c(m75499B());
        }
        if (AbstractC22676k.m65745e(interfaceC25649p, InterfaceC25649p.j.f100667a)) {
            return new AbstractC25634a.c(m75501D());
        }
        if (interfaceC25649p instanceof InterfaceC25649p.h) {
            return new AbstractC25634a.a((InterfaceC25649p.h) interfaceC25649p);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        if (r1 == r11) goto L42;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m75503F(x90.C38098d r23, java.util.List<com.whoop.activitysession.PauseSegment> r24, q83.InterfaceC30057d<? super mk2.AbstractC25640g> r25) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk2.C25651r.m75503F(x90.d, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC13058l m75504G(String activityType) {
        return AbstractC39414r.m125890i0(activityType) ? C13054k.f45116w : new t(this.sessionTargetsFetcher.m26506d(activityType));
    }

    /* JADX INFO: renamed from: H */
    private final UserState m75505H(C17051d activity, String fallbackInternalName) {
        if (activity != null) {
            return activity.getScoreType() == ScoreType.SLEEP ? UserState.Sleep : UserState.Workout;
        }
        this.logger.mo85222m(AbstractC11895b.m31996o("Unknown activity '", fallbackInternalName, "' - defaulting user state to WORKOUT"), new AbstractC30556a.a[0]);
        return UserState.Workout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m75506I(UserState state) {
        AbstractC3006f0.m8732z(this.backgroundScope, null, null, new u(state, null), 3);
    }

    /* JADX INFO: renamed from: J */
    private final InterfaceC13058l m75507J(InterfaceC25649p.k action) {
        return new C13084s1(new v(action, null));
    }

    /* JADX INFO: renamed from: K */
    private final Object m75508K(boolean z4, long j7, String str, boolean z13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.trackSessionServiceConnector.mo75544c(m75528u(z4, z13), z4, j7, str, z13, m75504G(str), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final Object m75509L(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.foregroundGpsCollector.stop();
        Object objMo75542a = this.trackSessionServiceConnector.mo75542a(interfaceC30057d);
        return objMo75542a == EnumC31071a.f128113w ? objMo75542a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private final Object m75527t(C38098d c38098d, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        if (this.trackSessionServiceConnector.isRunning()) {
            return Boolean.TRUE;
        }
        return this.trackSessionServiceConnector.mo75543b(m75528u(c38098d.getGpsTrackingEnabled(), z4), c38098d.getGpsTrackingEnabled(), c38098d.getStartTimeMs(), c38098d.getSelectedActivityInternalName(), c38098d.m122066b(), z4, m75504G(c38098d.getSelectedActivityInternalName()), interfaceC30057d);
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC13058l m75528u(boolean gpsTrackingEnabled, boolean enableHeartRateStream) {
        InterfaceC13058l liveHrCombinedFlow = C13054k.f45116w;
        InterfaceC13058l interfaceC13058lStart = gpsTrackingEnabled ? this.foregroundGpsCollector.start() : liveHrCombinedFlow;
        if (enableHeartRateStream) {
            liveHrCombinedFlow = this.liveHrStateCombiner.getLiveHrCombinedFlow();
        }
        return AbstractC25657x.m75552c(liveHrCombinedFlow, interfaceC13058lStart, gpsTrackingEnabled, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m75529v(q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mk2.C25651r.a
            if (r0 == 0) goto L13
            r0 = r7
            mk2.r$a r0 = (mk2.C25651r.a) r0
            int r1 = r0.f100702y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100702y = r1
            goto L18
        L13:
            mk2.r$a r0 = new mk2.r$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f100700w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f100702y
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            p505ts.AbstractC34132o.m107864I(r7)
            l83.n r7 = (l83.C23468n) r7
            java.lang.Object r7 = r7.f92940w
            goto L5e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            p505ts.AbstractC34132o.m107864I(r7)
            l83.n r7 = (l83.C23468n) r7
            java.lang.Object r7 = r7.f92940w
            goto L4e
        L40:
            p505ts.AbstractC34132o.m107864I(r7)
            x90.f r7 = r6.activitySessionHandler
            r0.f100702y = r5
            java.lang.Object r7 = r7.mo122075d(r0)
            if (r7 != r1) goto L4e
            goto L5d
        L4e:
            boolean r7 = r7 instanceof l83.C23467m
            if (r7 != 0) goto L53
            goto L72
        L53:
            x90.f r7 = r6.activitySessionHandler
            r0.f100702y = r4
            java.lang.Object r7 = r7.mo122075d(r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            boolean r0 = r7 instanceof l83.C23467m
            if (r0 == 0) goto L72
            java.lang.Throwable r7 = l83.C23468n.m68037a(r7)
            if (r7 == 0) goto L72
            tr2.n r0 = r6.logger
            r1 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
            java.lang.String r2 = "Failed to clear activity session after finish - a stale session may incorrectly reattach on the next start"
            r0.mo85230v(r2, r7, r1)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mk2.C25651r.m75529v(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: w */
    private final InterfaceC13058l m75530w() {
        return new C13084s1(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x0126  */
    /* JADX WARN: Code duplicated, block: B:41:0x012a A[PHI: r2 r7 r8 r9
      0x012a: PHI (r2v8 long) = (r2v6 long), (r2v12 long) binds: [B:32:0x00f1, B:40:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r7v3 mk2.p$k) = (r7v2 mk2.p$k), (r7v4 mk2.p$k) binds: [B:32:0x00f1, B:40:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r8v3 ha0.d) = (r8v2 ha0.d), (r8v4 ha0.d) binds: [B:32:0x00f1, B:40:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r9v2 java.lang.Object) = (r9v1 java.lang.Object), (r9v3 java.lang.Object) binds: [B:32:0x00f1, B:40:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x012f A[DONT_INVERT, PHI: r1 r3 r5 r6 r14
      0x012f: PHI (r1v12 java.lang.Object) = (r1v19 java.lang.Object), (r1v20 java.lang.Object) binds: [B:41:0x012a, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r3v7 long) = (r3v8 long), (r3v9 long) binds: [B:41:0x012a, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r5v4 ha0.d) = (r5v5 ha0.d), (r5v6 ha0.d) binds: [B:41:0x012a, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r6v3 mk2.p$k) = (r6v4 mk2.p$k), (r6v5 mk2.p$k) binds: [B:41:0x012a, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r14v1 int) = (r14v2 int), (r14v0 int) binds: [B:41:0x012a, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0131  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0159, code lost:
    
        if (r1.mo122075d(r10) == r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        if (r2 == r11) goto L54;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m75531x(mk2.InterfaceC25649p.k r19, x90.C38098d r20, ha0.C17051d r21, mk2.EnumC25643j r22, q83.InterfaceC30057d<? super mk2.EnumC25636c> r23) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk2.C25651r.m75531x(mk2.p$k, x90.d, ha0.d, mk2.j, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC13058l m75532y() {
        return new C13084s1(new d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: z */
    public final Object m75533z(CreateActivityRequestV1 createActivityRequestV1, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        Object objMo97068a;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f100730z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f100730z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f100728x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f100730z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC31502f interfaceC31502f = this.pendingActivitySaveStore;
            String activityInternalName = createActivityRequestV1.getActivityInternalName();
            int garmentId = createActivityRequestV1.getGarmentId();
            String startTime = createActivityRequestV1.getStartTime();
            String endTime = createActivityRequestV1.getEndTime();
            boolean gpsEnabled = createActivityRequestV1.getGpsEnabled();
            List<CreateActivityPauseSegment> pauseSegments = createActivityRequestV1.getPauseSegments();
            eVar2.f100727w = null;
            eVar2.f100730z = 1;
            objMo97068a = interfaceC31502f.mo97068a(activityInternalName, garmentId, startTime, endTime, gpsEnabled, pauseSegments, eVar2);
            if (objMo97068a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objMo97068a = ((C23468n) obj).f92940w;
        }
        boolean z4 = objMo97068a instanceof C23467m;
        boolean z13 = !z4;
        if (z4) {
            Throwable thM68037a = C23468n.m68037a(objMo97068a);
            if (thM68037a != null) {
                this.logger.mo85230v("Failed to enqueue pending activity save - workout will be lost", thM68037a, new AbstractC30556a.a[0]);
            }
        } else {
            this.saveActivityScheduler.m97074c();
        }
        return Boolean.valueOf(z13);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        k kVar = new k(upstream, this);
        return AbstractC13091v.m36612v(new C13060l1(new C25650q(null, null, null, false, null, null, false, null, null, null, null, null, 4095, null), AbstractC13091v.m36584J(AbstractC13091v.m36590P(new g(kVar), new j(null)), new l(new h(kVar)), AbstractC13091v.m36578D(new n(null), new i(kVar))), new m(null)), 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C25651r(InterfaceC38100f interfaceC38100f, InterfaceC25654u interfaceC25654u, ActivitiesApi activitiesApi, C18292a c18292a, InterfaceC31502f interfaceC31502f, C31504h c31504h, C39530e c39530e, InterfaceC40639a interfaceC40639a, InterfaceC13220a interfaceC13220a, C14520a c14520a, InterfaceC40205a interfaceC40205a, SessionTargetsFetcher sessionTargetsFetcher, Clock clock, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        if ((i13 & 4096) != 0) {
            Clock clockSystemUTC = Clock.systemUTC();
            AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
            clock2 = clockSystemUTC;
        } else {
            clock2 = clock;
        }
        this(interfaceC38100f, interfaceC25654u, activitiesApi, c18292a, interfaceC31502f, c31504h, c39530e, interfaceC40639a, interfaceC13220a, c14520a, interfaceC40205a, sessionTargetsFetcher, clock2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TrackSessionMiniArchInteractor") : interfaceC34116n, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a)) : interfaceC2994c0);
    }
}

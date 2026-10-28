package live.hms.video.transport;

import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import g93.AbstractC15612d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.sdk.models.enums.RetrySchedulerState;
import live.hms.video.transport.models.TransportFailureCategory;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0082\u0001\u0010\u0019\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e26\u0010\u0012\u001a2\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010\u0019\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e26\u0010\u0012\u001a2\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0019\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"2\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\"0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m65681d2 = {"Llive/hms/video/transport/RetryScheduler;", "", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Lkotlin/Function2;", "Llive/hms/video/transport/models/TransportState;", "Llive/hms/video/error/HMSException;", "Ll83/a0;", "onStateChange", "<init>", "(Llive/hms/video/events/AnalyticsEventsService;Lc93/m;)V", "Llive/hms/video/transport/models/TransportFailureCategory;", "category", "error", "", "shouldSendStateUpdate", "Lkotlin/Function1;", "Lq83/d;", "task", "", "maxRetryInMillis", "failedAtMillis", "isFirstFailure", "", "retries", "schedule", "(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;", "sendEvent", "(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;)V", "maxFailedRetries", "(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;)Ljava/lang/Object;", "reset", "()V", "tfc", "Lbc3/s;", "getDependecyForCategory", "(Llive/hms/video/transport/models/TransportFailureCategory;)Lbc3/s;", "Llive/hms/video/events/AnalyticsEventsService;", "Lc93/m;", "Ljava/util/HashMap;", "inProgress", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Ljava/util/concurrent/ScheduledFuture;", "retryFutures", "Ljava/util/ArrayList;", "Llive/hms/video/sdk/models/enums/RetrySchedulerState;", "state", "Llive/hms/video/sdk/models/enums/RetrySchedulerState;", "getState$lib_release", "()Llive/hms/video/sdk/models/enums/RetrySchedulerState;", "setState$lib_release", "(Llive/hms/video/sdk/models/enums/RetrySchedulerState;)V", "errorOccuredAtMillis", "J", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class RetryScheduler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "RetryScheduler";
    private final AnalyticsEventsService analyticsEventsService;
    private long errorOccuredAtMillis;
    private final HashMap<TransportFailureCategory, InterfaceC3055s> inProgress;
    private final InterfaceC4351m onStateChange;
    private final ArrayList<ScheduledFuture<?>> retryFutures;
    private RetrySchedulerState state;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Llive/hms/video/transport/RetryScheduler$Companion;", "", "<init>", "()V", "TAG", "", "getDelayForCategory", "", "category", "Llive/hms/video/transport/models/TransportFailureCategory;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransportFailureCategory.values().length];
                try {
                    iArr[TransportFailureCategory.SignalDisconnect.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransportFailureCategory.ConnectFailed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransportFailureCategory.JoinAPIFailed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getDelayForCategory(TransportFailureCategory category) {
            AbstractC22676k.m65750j(category, "category");
            int iMo43929g = AbstractC15612d.f58613x.mo43929g(1000);
            int i13 = WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return 1000L;
            }
            if (i13 != 3) {
                return 0L;
            }
            return ((long) iMo43929g) + 2000;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransportFailureCategory.values().length];
            try {
                iArr[TransportFailureCategory.SignalDisconnect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransportFailureCategory.PublishIceConnectionFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransportFailureCategory.SubscribeIceConnectionFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransportFailureCategory.ConnectFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransportFailureCategory.JoinAPIFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.RetryScheduler$schedule$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.RetryScheduler", m100430f = "RetryScheduler.kt", m100431l = {124, 158, 251}, m100432m = "schedule")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243942 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C243942(InterfaceC30057d<? super C243942> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RetryScheduler.this.schedule(null, null, false, null, 0L, 0L, false, 0, this);
        }
    }

    public RetryScheduler(AnalyticsEventsService analyticsEventsService, InterfaceC4351m onStateChange) {
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(onStateChange, "onStateChange");
        this.analyticsEventsService = analyticsEventsService;
        this.onStateChange = onStateChange;
        this.inProgress = new HashMap<>();
        this.retryFutures = new ArrayList<>();
        this.state = RetrySchedulerState.PREVIEW;
    }

    private final void sendEvent(HMSException error, TransportFailureCategory category) {
        Object objDisconnect;
        int i13 = WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
        if (i13 == 1) {
            objDisconnect = AnalyticsEventFactory.INSTANCE.disconnect(error, this.state);
        } else if (i13 == 2) {
            objDisconnect = AnalyticsEventFactory.INSTANCE.publishFail(error);
        } else if (i13 == 3) {
            objDisconnect = AnalyticsEventFactory.INSTANCE.subscribeFail(error);
        } else if (i13 == 4) {
            objDisconnect = AnalyticsEventFactory.INSTANCE.connect(error, this.state);
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            objDisconnect = C23454a0.f92919a;
        }
        if (objDisconnect instanceof AnalyticsEvent) {
            this.analyticsEventsService.queue((AnalyticsEvent) objDisconnect).flush();
        }
    }

    public final InterfaceC3055s getDependecyForCategory(TransportFailureCategory tfc) {
        AbstractC22676k.m65750j(tfc, "tfc");
        return this.inProgress.get(tfc);
    }

    /* JADX INFO: renamed from: getState$lib_release, reason: from getter */
    public final RetrySchedulerState getState() {
        return this.state;
    }

    public final void reset() {
        Iterator<ScheduledFuture<?>> it = this.retryFutures.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            ScheduledFuture<?> next = it.next();
            AbstractC22676k.m65749i(next, "next(...)");
            next.cancel(true);
        }
        this.retryFutures.clear();
        this.inProgress.clear();
    }

    public final Object schedule(TransportFailureCategory transportFailureCategory, HMSException hMSException, boolean z4, Function1 function1, long j7, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return schedule$default(this, transportFailureCategory, hMSException, z4, function1, j7, System.currentTimeMillis(), true, 0, interfaceC30057d, 128, null);
    }

    public final void setState$lib_release(RetrySchedulerState retrySchedulerState) {
        AbstractC22676k.m65750j(retrySchedulerState, "<set-?>");
        this.state = retrySchedulerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0187  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01fd -> B:114:0x020e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0269 -> B:66:0x023e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object schedule(live.hms.video.transport.models.TransportFailureCategory r36, live.hms.video.error.HMSException r37, boolean r38, p715kotlin.jvm.functions.Function1 r39, long r40, long r42, boolean r44, int r45, q83.InterfaceC30057d<? super java.lang.Integer> r46) {
        /*
            Method dump skipped, instruction units count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.RetryScheduler.schedule(live.hms.video.transport.models.TransportFailureCategory, live.hms.video.error.HMSException, boolean, kotlin.jvm.functions.Function1, long, long, boolean, int, q83.d):java.lang.Object");
    }

    public static /* synthetic */ Object schedule$default(RetryScheduler retryScheduler, TransportFailureCategory transportFailureCategory, HMSException hMSException, boolean z4, Function1 function1, long j7, long j13, boolean z13, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        return retryScheduler.schedule(transportFailureCategory, hMSException, z4, function1, j7, j13, z13, (i14 & 128) != 0 ? 0 : i13, interfaceC30057d);
    }
}

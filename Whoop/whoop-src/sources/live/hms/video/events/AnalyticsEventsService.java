package live.hms.video.events;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import live.hms.video.database.entity.AnalyticsCluster;
import live.hms.video.database.entity.AnalyticsEntityModel;
import live.hms.video.sdk.OfflineAnalyticsPeerInfo;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import live.hms.video.utils.HMSAgentOs;
import live.hms.video.utils.HMSLogger;
import live.hms.video.viewModels.OfflineAnalyticsManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0017028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m65681d2 = {"Llive/hms/video/events/AnalyticsEventsService;", "", "Landroid/content/Context;", "context", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "level", "Llive/hms/video/utils/HMSAgentOs;", "agentOs", "Lkotlin/Function0;", "", "isQa", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "offlineAnalyticsPeerInfo", "<init>", "(Landroid/content/Context;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSAgentOs;Lc93/a;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;)V", "Ll83/a0;", "flushExistingLogs", "()V", "Llive/hms/video/events/IAnalyticsTransport;", NotificationCompat.CATEGORY_TRANSPORT, "addTransport", "(Llive/hms/video/events/IAnalyticsTransport;)Z", "removeTransport", "Llive/hms/video/events/AnalyticsEvent;", NotificationCompat.CATEGORY_EVENT, "queue", "(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;", "", "token", "sessionId", "Llive/hms/video/sdk/models/HMSPeer;", "hmsPeer", "Llive/hms/video/sdk/models/HMSRoom;", "hmsRoom", "websocketUrl", "updateAnalyticsParams", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V", "flush", "Landroid/content/Context;", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "Llive/hms/video/utils/HMSAgentOs;", "Lc93/a;", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "Llive/hms/video/viewModels/OfflineAnalyticsManager;", "offlineAnalyticsManager", "Llive/hms/video/viewModels/OfflineAnalyticsManager;", "Ljava/lang/String;", "Ljava/util/ArrayList;", "transports", "Ljava/util/ArrayList;", "Ljava/util/Deque;", "pendingEvents", "Ljava/util/Deque;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AnalyticsEventsService {
    private static final String TAG = "AnalyticsEventsService";
    private static final int cMaxBufferSize = 100;
    private final HMSAgentOs agentOs;
    private final Context context;
    private final InterfaceC4339a isQa;
    private HMSAnalyticsEventLevel level;
    private final OfflineAnalyticsManager offlineAnalyticsManager;
    private final OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo;
    private final Deque<AnalyticsEvent> pendingEvents;
    private String sessionId;
    private String token;
    private final ArrayList<IAnalyticsTransport> transports;

    public AnalyticsEventsService(Context context, HMSAnalyticsEventLevel level, HMSAgentOs agentOs, InterfaceC4339a isQa, OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(agentOs, "agentOs");
        AbstractC22676k.m65750j(isQa, "isQa");
        AbstractC22676k.m65750j(offlineAnalyticsPeerInfo, "offlineAnalyticsPeerInfo");
        this.context = context;
        this.level = level;
        this.agentOs = agentOs;
        this.isQa = isQa;
        this.offlineAnalyticsPeerInfo = offlineAnalyticsPeerInfo;
        this.offlineAnalyticsManager = new OfflineAnalyticsManager(context, agentOs, isQa);
        this.sessionId = "";
        this.token = "";
        flushExistingLogs();
        this.transports = new ArrayList<>();
        this.pendingEvents = new ConcurrentLinkedDeque();
    }

    private final void flushExistingLogs() {
        this.offlineAnalyticsManager.flushExistingLogs(this.context);
    }

    public static /* synthetic */ void updateAnalyticsParams$default(AnalyticsEventsService analyticsEventsService, String str, String str2, HMSPeer hMSPeer, HMSRoom hMSRoom, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            hMSPeer = null;
        }
        if ((i13 & 8) != 0) {
            hMSRoom = null;
        }
        if ((i13 & 16) != 0) {
            str3 = null;
        }
        analyticsEventsService.updateAnalyticsParams(str, str2, hMSPeer, hMSRoom, str3);
    }

    public final boolean addTransport(IAnalyticsTransport transport) {
        AbstractC22676k.m65750j(transport, "transport");
        return this.transports.add(transport);
    }

    @SuppressLint({"HardwareIds"})
    public final synchronized void flush() {
        try {
            if (this.pendingEvents.isEmpty()) {
                return;
            }
            if (this.transports.isEmpty()) {
                HMSLogger.INSTANCE.m71141w(TAG, "No valid signalling api found to flush analytics, trying to send via REST API");
                Iterator<AnalyticsEvent> it = this.pendingEvents.iterator();
                AbstractC22676k.m65749i(it, "iterator(...)");
                while (it.hasNext()) {
                    it.next();
                    AnalyticsEvent analyticsEventPeek = this.pendingEvents.peek();
                    if (analyticsEventPeek != null) {
                        long timestamp = analyticsEventPeek.getTimestamp();
                        String uniqueEventId = this.agentOs.getUniqueEventId(analyticsEventPeek);
                        String deviceId = this.agentOs.getDeviceId(this.context);
                        String name = analyticsEventPeek.getName();
                        HashMap<String, Object> properties = analyticsEventPeek.getProperties();
                        String str = this.token;
                        String websocketUrl = this.offlineAnalyticsPeerInfo.getWebsocketUrl();
                        if (websocketUrl == null) {
                            websocketUrl = "";
                        }
                        AnalyticsEntityModel analyticsEntityModel = new AnalyticsEntityModel(timestamp, uniqueEventId, deviceId, null, properties, name, str, false, null, new AnalyticsCluster(websocketUrl), 392, null);
                        analyticsEntityModel.setAnalyticsPeer(this.offlineAnalyticsPeerInfo.getAnalyticsPeer());
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new AnalyticsEventsService$flush$1$1(this, analyticsEntityModel, analyticsEventPeek, null), 3);
                    }
                }
            } else {
                HMSLogger.m71136d(TAG, "Sending analytics via websocket");
                synchronized (this.pendingEvents) {
                    while (!this.pendingEvents.isEmpty()) {
                        try {
                            AnalyticsEvent analyticsEventPollFirst = this.pendingEvents.pollFirst();
                            if (analyticsEventPollFirst != null) {
                                Iterator<T> it3 = this.transports.iterator();
                                while (it3.hasNext()) {
                                    ((IAnalyticsTransport) it3.next()).event(analyticsEventPollFirst);
                                }
                                C22365e c22365e2 = AbstractC3050q0.f12077a;
                                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new AnalyticsEventsService$flush$2$1$2(this, analyticsEventPollFirst, null), 3);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized AnalyticsEventsService queue(AnalyticsEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.getLevel().ordinal() <= this.level.ordinal()) {
            HMSLogger.m71136d(TAG, event + " queued");
            this.pendingEvents.addLast(event);
            if (this.pendingEvents.size() > 100) {
                HMSLogger.m71136d(TAG, "Max buffer size reached, removing " + this.pendingEvents.pollFirst() + " to accommodate new events");
            }
        }
        return this;
    }

    public final boolean removeTransport(IAnalyticsTransport transport) {
        AbstractC22676k.m65750j(transport, "transport");
        return this.transports.remove(transport);
    }

    public final void updateAnalyticsParams(String token, String sessionId, HMSPeer hmsPeer, HMSRoom hmsRoom, String websocketUrl) {
        if (token != null) {
            this.token = token;
        }
        if (sessionId != null) {
            this.sessionId = sessionId;
        }
        OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo = this.offlineAnalyticsPeerInfo;
        offlineAnalyticsPeerInfo.updateWithPeer(hmsPeer);
        offlineAnalyticsPeerInfo.updateWithRoom(hmsRoom);
        offlineAnalyticsPeerInfo.updateWithToken(token);
        if (websocketUrl != null) {
            offlineAnalyticsPeerInfo.setWebsocketUrl(websocketUrl);
        }
    }
}

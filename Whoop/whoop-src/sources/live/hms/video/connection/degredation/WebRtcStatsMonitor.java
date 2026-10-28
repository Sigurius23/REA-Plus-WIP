package live.hms.video.connection.degredation;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13087t1;
import hms.webrtc.RTCStats;
import ih0.AbstractC18489d0;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.InterfaceC23462h;
import live.hms.video.connection.stats.clientside.manager.StatsSamplingManager;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import live.hms.video.signal.init.Stats;
import live.hms.video.transport.ITransport;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0004\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0014J1\u0010#\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010\r2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u0004\u0018\u00010,2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u0004\u0018\u0001002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\r2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,03H\u0002¢\u0006\u0004\b5\u00106JU\u0010;\u001a\u00020%2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,072\b\u00108\u001a\u0004\u0018\u00010,2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020907H\u0002¢\u0006\u0004\b;\u0010<JU\u0010>\u001a\u00020=2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,072\b\u00108\u001a\u0004\u0018\u00010,2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020907H\u0002¢\u0006\u0004\b>\u0010?J7\u0010A\u001a\u00020@2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,07H\u0002¢\u0006\u0004\bA\u0010BJ7\u0010D\u001a\u00020C2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,07H\u0002¢\u0006\u0004\bD\u0010EJ9\u0010F\u001a\u0004\u0018\u00010,2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,07H\u0002¢\u0006\u0004\bF\u0010GJ9\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010H\u001a\u00020\r2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bK\u0010LJ;\u0010N\u001a\u0004\u0018\u00010\r2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,\u0018\u0001032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010TR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082D¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\"\u0010f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010Q\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010Q\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR.\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020n078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR.\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000209078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010p\u001a\u0004\bu\u0010r\"\u0004\bv\u0010tR\"\u0010w\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010^\u001a\u0004\bw\u0010x\"\u0004\by\u0010\u001cR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{¨\u0006|"}, m65681d2 = {"Llive/hms/video/connection/degredation/WebRtcStatsMonitor;", "Llive/hms/video/connection/degredation/PacketStatistics;", "Llive/hms/video/transport/ITransport;", NotificationCompat.CATEGORY_TRANSPORT, "", "delayPeriod", "Lbc3/c0;", "coroutineScope", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Landroid/content/Context;", "applicationContext", "Lkotlin/Function1;", "", "Llive/hms/video/sdk/models/HMSPeer;", "getPeerFromVideoTrackID", "<init>", "(Llive/hms/video/transport/ITransport;JLbc3/c0;Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Ll83/a0;", "reset", "()V", "Lec3/t1;", "Llive/hms/video/connection/degredation/StatsBundle;", "getFlow", "()Lec3/t1;", "", "allow", "allowExtraStatsCollection", "(Z)V", "forcePublishStats", "isPublishStatsEnabled", "Llive/hms/video/signal/init/Stats;", "publishStats", "isSubscriberStatsEnabled", "subscriberStats", "setPublishSubscriberStatsConfig", "(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V", "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;", "stats", "getUniqueTrackKey", "(Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;)Ljava/lang/String;", "retrieveStats", "(Lq83/d;)Ljava/lang/Object;", "", "Lhms/webrtc/RTCStats;", "getSelectedCandidateInfo", "(Ljava/util/Map;)Lhms/webrtc/RTCStats;", "allStats", "Llive/hms/video/connection/degredation/Peer;", "getDataForPeer", "(Ljava/util/Map;)Llive/hms/video/connection/degredation/Peer;", "", "entry", "getEntryType", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "", "candidatePairInfo", "", "localTracksJitter", "getDataForLocalVideo", "(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;", "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;", "getDataForLocalAudio", "(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;", "Llive/hms/video/connection/degredation/Video;", "getDataForVideo", "(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Video;", "Llive/hms/video/connection/degredation/Audio;", "getDataForAudio", "(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Audio;", "getTrackExtraEntry", "(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;", "entryName", "onlyForKind", "", "getEntryFromStats", "(Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;)Ljava/lang/Number;", "inboundStreamEntry", "getTrackIdForStream", "(Ljava/util/Map$Entry;Ljava/util/Map;)Ljava/lang/String;", "Llive/hms/video/transport/ITransport;", "J", "Lbc3/c0;", "Llive/hms/video/events/AnalyticsEventsService;", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "getGetPeerFromVideoTrackID", "()Lkotlin/jvm/functions/Function1;", "TAG", "Ljava/lang/String;", "", "NUMBER_OF_VALUES_TO_STORE", "I", "enableExtraStatsCollection", "Z", "collectStatsSafe", "Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;", "statsSamplingManager$delegate", "Ll83/h;", "getStatsSamplingManager", "()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;", "statsSamplingManager", "currentPacketsLost", "getCurrentPacketsLost", "()J", "setCurrentPacketsLost", "(J)V", "totalPackets", "getTotalPackets", "setTotalPackets", "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;", "packetLossTracks", "Ljava/util/Map;", "getPacketLossTracks", "()Ljava/util/Map;", "setPacketLossTracks", "(Ljava/util/Map;)V", "getLocalTracksJitter", "setLocalTracksJitter", "isTransportConnected", "()Z", "setTransportConnected", "statsFlow", "Lec3/t1;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class WebRtcStatsMonitor implements PacketStatistics {
    private final int NUMBER_OF_VALUES_TO_STORE;
    private final String TAG;
    private final AnalyticsEventsService analyticsEventsService;
    private final Context applicationContext;
    private boolean collectStatsSafe;
    private final InterfaceC2994c0 coroutineScope;
    private long currentPacketsLost;
    private final long delayPeriod;
    private boolean enableExtraStatsCollection;
    private final Function1 getPeerFromVideoTrackID;
    private boolean isTransportConnected;
    private Map<Long, Double> localTracksJitter;
    private Map<Long, ConnectionInfo.PacketLossTracks> packetLossTracks;
    private final InterfaceC13087t1 statsFlow;

    /* JADX INFO: renamed from: statsSamplingManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h statsSamplingManager;
    private long totalPackets;
    private final ITransport transport;

    /* JADX INFO: renamed from: live.hms.video.connection.degredation.WebRtcStatsMonitor$retrieveStats$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.connection.degredation.WebRtcStatsMonitor", m100430f = "WebRtcStatsMonitor.kt", m100431l = {74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "retrieveStats")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241161 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C241161(InterfaceC30057d<? super C241161> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebRtcStatsMonitor.this.retrieveStats(this);
        }
    }

    public WebRtcStatsMonitor(ITransport iTransport, long j7, InterfaceC2994c0 interfaceC2994c0, AnalyticsEventsService analyticsEventsService, Context context, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(iTransport, (i13 & 2) != 0 ? 1000L : j7, (i13 & 4) != 0 ? AbstractC3006f0.m8708b(AbstractC3050q0.f12077a) : interfaceC2994c0, analyticsEventsService, context, function1);
    }

    private final Audio getDataForAudio(Map.Entry<String, RTCStats> entry, Map<String, RTCStats> allStats) {
        Map<String, Object> members = entry.getValue().getMembers();
        double timestampUs = entry.getValue().getTimestampUs();
        RTCStats trackExtraEntry = getTrackExtraEntry(entry, allStats);
        Audio.Companion companion = Audio.INSTANCE;
        AbstractC22676k.m65747g(members);
        return companion.from(members, trackExtraEntry, timestampUs);
    }

    private final Track.LocalTrack.LocalAudio getDataForLocalAudio(Map.Entry<String, RTCStats> entry, Map<String, RTCStats> allStats, RTCStats candidatePairInfo, Map<Long, Double> localTracksJitter) {
        Map<String, Object> members = entry.getValue().getMembers();
        double timestampUs = entry.getValue().getTimestampUs();
        RTCStats trackExtraEntry = getTrackExtraEntry(entry, allStats);
        Track.LocalTrack.LocalAudio.Companion companion = Track.LocalTrack.LocalAudio.INSTANCE;
        AbstractC22676k.m65747g(members);
        return companion.from(members, trackExtraEntry, candidatePairInfo, Double.valueOf(timestampUs), localTracksJitter);
    }

    private final Track.LocalTrack.LocalVideo getDataForLocalVideo(Map.Entry<String, RTCStats> entry, Map<String, RTCStats> allStats, RTCStats candidatePairInfo, Map<Long, Double> localTracksJitter) {
        Map<String, Object> members = entry.getValue().getMembers();
        double timestampUs = entry.getValue().getTimestampUs();
        RTCStats trackExtraEntry = getTrackExtraEntry(entry, allStats);
        Track.LocalTrack.LocalVideo.Companion companion = Track.LocalTrack.LocalVideo.INSTANCE;
        AbstractC22676k.m65747g(members);
        return companion.from(members, trackExtraEntry, candidatePairInfo, Double.valueOf(timestampUs), localTracksJitter);
    }

    private final Peer getDataForPeer(Map<String, ? extends RTCStats> allStats) {
        Map<String, Object> members;
        RTCStats rTCStats = allStats.get("T01");
        RTCStats rTCStats2 = allStats.get((rTCStats == null || (members = rTCStats.getMembers()) == null) ? null : members.get("selectedCandidatePairId"));
        if (rTCStats == null || rTCStats2 == null) {
            return null;
        }
        return Peer.INSTANCE.from(rTCStats, rTCStats2);
    }

    private final Video getDataForVideo(Map.Entry<String, RTCStats> entry, Map<String, RTCStats> allStats) {
        Map<String, Object> members = entry.getValue().getMembers();
        double timestampUs = entry.getValue().getTimestampUs();
        RTCStats trackExtraEntry = getTrackExtraEntry(entry, allStats);
        Video.Companion companion = Video.INSTANCE;
        AbstractC22676k.m65747g(members);
        return companion.from(members, trackExtraEntry, timestampUs);
    }

    private final Number getEntryFromStats(String entryName, Map.Entry<String, RTCStats> entry, String onlyForKind) {
        if (!(onlyForKind == null ? true : AbstractC22676k.m65745e(entry.getValue().getMembers().get("kind"), onlyForKind))) {
            return null;
        }
        Object obj = entry.getValue().getMembers().get(entryName);
        if (!(obj instanceof Number)) {
            return null;
        }
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        String str = this.TAG;
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Got ", entryName, " from id ");
        sbM53375p.append(entry.getKey());
        hMSLogger.m71140v(str, sbM53375p.toString());
        return (Number) obj;
    }

    public static /* synthetic */ Number getEntryFromStats$default(WebRtcStatsMonitor webRtcStatsMonitor, String str, Map.Entry entry, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return webRtcStatsMonitor.getEntryFromStats(str, entry, str2);
    }

    private final String getEntryType(Map.Entry<String, RTCStats> entry) {
        return String.valueOf(entry.getValue().getMembers().get("kind"));
    }

    private final RTCStats getSelectedCandidateInfo(Map<String, ? extends RTCStats> stats) {
        RTCStats rTCStats;
        Map<String, Object> members;
        Object obj = (stats == null || (rTCStats = stats.get("T01")) == null || (members = rTCStats.getMembers()) == null) ? null : members.get("selectedCandidatePairId");
        if (obj != null) {
            return stats.get(obj);
        }
        return null;
    }

    private final StatsSamplingManager getStatsSamplingManager() {
        return (StatsSamplingManager) this.statsSamplingManager.getValue();
    }

    private final RTCStats getTrackExtraEntry(Map.Entry<String, RTCStats> entry, Map<String, RTCStats> allStats) {
        return allStats.get(entry.getValue().getMembers().get("trackId"));
    }

    private final String getTrackIdForStream(Map.Entry<String, RTCStats> inboundStreamEntry, Map<String, ? extends RTCStats> allStats) {
        Map<String, Object> members;
        RTCStats value;
        Map<String, Object> members2;
        Object obj = null;
        Object obj2 = (inboundStreamEntry == null || (value = inboundStreamEntry.getValue()) == null || (members2 = value.getMembers()) == null) ? null : members2.get("trackId");
        if (obj2 == null) {
            return null;
        }
        RTCStats rTCStats = allStats.get(obj2);
        if (rTCStats != null && (members = rTCStats.getMembers()) != null) {
            obj = members.get("trackIdentifier");
        }
        return String.valueOf(obj);
    }

    private final String getUniqueTrackKey(Track.LocalTrack.LocalVideo stats) {
        String trackIdentifier = stats.getTrackIdentifier();
        if (trackIdentifier == null || trackIdentifier.length() == 0) {
            return null;
        }
        if (stats.getHmsLayer() == null) {
            return stats.getTrackIdentifier();
        }
        return stats.getTrackIdentifier() + '_' + stats.getHmsLayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        r10 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrieveStats(q83.InterfaceC30057d<? super live.hms.video.connection.degredation.StatsBundle> r19) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.connection.degredation.WebRtcStatsMonitor.retrieveStats(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StatsSamplingManager statsSamplingManager_delegate$lambda$0(WebRtcStatsMonitor this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new StatsSamplingManager(System.currentTimeMillis(), this$0.analyticsEventsService, this$0.applicationContext, this$0.getPeerFromVideoTrackID);
    }

    public final void allowExtraStatsCollection(boolean allow) {
        this.enableExtraStatsCollection = allow;
        this.collectStatsSafe = allow;
    }

    public final void forcePublishStats() {
        try {
            getStatsSamplingManager().shouldPublishStats(true);
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    public final long getCurrentPacketsLost() {
        return this.currentPacketsLost;
    }

    @Override // live.hms.video.connection.degredation.PacketStatistics
    /* JADX INFO: renamed from: getFlow, reason: from getter */
    public InterfaceC13087t1 getStatsFlow() {
        return this.statsFlow;
    }

    public final Function1 getGetPeerFromVideoTrackID() {
        return this.getPeerFromVideoTrackID;
    }

    public final Map<Long, Double> getLocalTracksJitter() {
        return this.localTracksJitter;
    }

    public final Map<Long, ConnectionInfo.PacketLossTracks> getPacketLossTracks() {
        return this.packetLossTracks;
    }

    public final long getTotalPackets() {
        return this.totalPackets;
    }

    /* JADX INFO: renamed from: isTransportConnected, reason: from getter */
    public final boolean getIsTransportConnected() {
        return this.isTransportConnected;
    }

    public final void reset() {
        this.currentPacketsLost = 0L;
        this.totalPackets = 0L;
        this.packetLossTracks = new LinkedHashMap();
        this.localTracksJitter = new LinkedHashMap();
    }

    public final void setCurrentPacketsLost(long j7) {
        this.currentPacketsLost = j7;
    }

    public final void setLocalTracksJitter(Map<Long, Double> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.localTracksJitter = map;
    }

    public final void setPacketLossTracks(Map<Long, ConnectionInfo.PacketLossTracks> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.packetLossTracks = map;
    }

    public final void setPublishSubscriberStatsConfig(boolean isPublishStatsEnabled, Stats publishStats, boolean isSubscriberStatsEnabled, Stats subscriberStats) {
        getStatsSamplingManager().setConfig(isPublishStatsEnabled, publishStats, isSubscriberStatsEnabled, subscriberStats);
    }

    public final void setTotalPackets(long j7) {
        this.totalPackets = j7;
    }

    public final void setTransportConnected(boolean z4) {
        this.isTransportConnected = z4;
    }

    public WebRtcStatsMonitor(ITransport transport, long j7, InterfaceC2994c0 coroutineScope, AnalyticsEventsService analyticsEventsService, Context applicationContext, Function1 getPeerFromVideoTrackID) {
        AbstractC22676k.m65750j(transport, "transport");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(getPeerFromVideoTrackID, "getPeerFromVideoTrackID");
        this.transport = transport;
        this.delayPeriod = j7;
        this.coroutineScope = coroutineScope;
        this.analyticsEventsService = analyticsEventsService;
        this.applicationContext = applicationContext;
        this.getPeerFromVideoTrackID = getPeerFromVideoTrackID;
        this.TAG = "HMSWebrtcStatsMonitor";
        this.NUMBER_OF_VALUES_TO_STORE = 1;
        this.statsSamplingManager = AbstractC30060g.m92088H(new C24117a(this, 0));
        this.packetLossTracks = new LinkedHashMap();
        this.localTracksJitter = new LinkedHashMap();
        this.statsFlow = AbstractC13091v.m36586L(new C13084s1(new WebRtcStatsMonitor$statsFlow$1(this, null)), coroutineScope, C13105z1.m36630a(3, 0L), 1);
    }
}

package live.hms.video.connection.stats.clientside.manager;

import android.content.Context;
import fd3.C14408a;
import hms.webrtc.RTCStats;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.QualityLimitationReasons;
import live.hms.video.connection.stats.BitrateCalculator;
import live.hms.video.connection.stats.clientside.model.PublishAnalyticPayload;
import live.hms.video.connection.stats.clientside.sampler.PublishAudioStatsSampler;
import live.hms.video.connection.stats.clientside.sampler.PublishVideoStatsSampler;
import live.hms.video.connection.stats.clientside.sampler.SubscribeAudioStatsSampler;
import live.hms.video.connection.stats.clientside.sampler.SubscribeVideoStatsSampler;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.signal.init.Stats;
import live.hms.video.utils.HMSUtils;
import m83.C25271y;
import org.joda.time.DateTimeConstants;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b \u0010\u0017J%\u0010#\u001a\u0004\u0018\u00010\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140!H\u0002¢\u0006\u0004\b#\u0010$J9\u0010(\u001a\u0004\u0018\u00010\u00142\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020-*\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b.\u0010/J-\u00101\u001a\u0004\u0018\u00010\u00142\u0006\u00100\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0006X\u0086D¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020?8\u0006X\u0086D¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001a\u0010F\u001a\u00020?8\u0006X\u0086D¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010CR\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010H\u001a\u0004\b\u0018\u0010I\"\u0004\bJ\u0010\u0012R\"\u0010K\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010H\u001a\u0004\bK\u0010I\"\u0004\bL\u0010\u0012R\"\u0010M\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010A\u001a\u0004\bN\u0010C\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010C\"\u0004\bS\u0010PR\"\u0010T\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010A\u001a\u0004\bU\u0010C\"\u0004\bV\u0010PR\"\u0010W\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010A\u001a\u0004\bX\u0010C\"\u0004\bY\u0010PR\"\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u00103\u001a\u0004\b[\u00105\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00103\u001a\u0004\b_\u00105\"\u0004\b`\u0010]R\"\u0010a\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010g\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010b\u001a\u0004\bh\u0010d\"\u0004\bi\u0010fR\"\u0010j\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bk\u0010d\"\u0004\bl\u0010fR\"\u0010m\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010A\u001a\u0004\bn\u0010C\"\u0004\bo\u0010PR\"\u0010p\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010A\u001a\u0004\bq\u0010C\"\u0004\br\u0010PR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR'\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020v0\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR'\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020|0\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010x\u001a\u0004\b~\u0010zR+\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0080\u00010\u00138BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010x\u001a\u0005\b\u0082\u0001\u0010zR\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u0087\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010b\u001a\u0005\b\u0088\u0001\u0010d\"\u0005\b\u0089\u0001\u0010f¨\u0006\u008a\u0001"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;", "", "", "statsInitTime", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Landroid/content/Context;", "applicationContext", "Lkotlin/Function1;", "", "Llive/hms/video/sdk/models/HMSPeer;", "getPeerFromVideoTrackID", "<init>", "(JLlive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "", "forcePublish", "Ll83/a0;", "shouldPublishStats", "(Z)V", "", "Lhms/webrtc/RTCStats;", "allPublishStats", "collectPublishStats", "(Ljava/util/Map;)V", "isPublishStatsEnabled", "Llive/hms/video/signal/init/Stats;", "publishStats", "isSubscriberStatsEnabled", "subscriberStats", "setConfig", "(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V", "allSubscriberStats", "collectSubscribeStats", "", "stats", "getSelectedCandidateInfo", "(Ljava/util/Map;)Lhms/webrtc/RTCStats;", "", "entry", "allStats", "getTrackExtraEntry", "(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;", "Ljava/math/BigInteger;", "bytesTransported", "rid", "", "toBitrate", "(Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;)D", "audioTrackID", "getCorrespondingAudioStats", "(Ljava/lang/String;Ljava/util/Map;)Lhms/webrtc/RTCStats;", "J", "getStatsInitTime", "()J", "Llive/hms/video/events/AnalyticsEventsService;", "getAnalyticsEventsService", "()Llive/hms/video/events/AnalyticsEventsService;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "getGetPeerFromVideoTrackID", "()Lkotlin/jvm/functions/Function1;", "", "DEFAULT_SAMPLE_DURATION", "I", "getDEFAULT_SAMPLE_DURATION", "()I", "DEFAULT_SUBSCRIBE_SAMPLE_DURATION", "getDEFAULT_SUBSCRIBE_SAMPLE_DURATION", "DEFAULT_PUBLISH_INTERVAL", "getDEFAULT_PUBLISH_INTERVAL", "Z", "()Z", "setPublishStatsEnabled", "isSubscribeStatsEnabled", "setSubscribeStatsEnabled", "publishStatsMaxSampleWindowSize", "getPublishStatsMaxSampleWindowSize", "setPublishStatsMaxSampleWindowSize", "(I)V", "publishStatsMaxSamplePushInterval", "getPublishStatsMaxSamplePushInterval", "setPublishStatsMaxSamplePushInterval", "subscribeStatsMaxSampleWindowSize", "getSubscribeStatsMaxSampleWindowSize", "setSubscribeStatsMaxSampleWindowSize", "subscribeStatsMaxSamplePushInterval", "getSubscribeStatsMaxSamplePushInterval", "setSubscribeStatsMaxSamplePushInterval", "lastPublishedPublisherStatsTime", "getLastPublishedPublisherStatsTime", "setLastPublishedPublisherStatsTime", "(J)V", "lastPublishedSubscriberStatsTime", "getLastPublishedSubscriberStatsTime", "setLastPublishedSubscriberStatsTime", "START_VIDEO_SAMPLE_DURATION", "D", "getSTART_VIDEO_SAMPLE_DURATION", "()D", "setSTART_VIDEO_SAMPLE_DURATION", "(D)V", "publishLastTimeStamp", "getPublishLastTimeStamp", "setPublishLastTimeStamp", "subscribeLastTimeStamp", "getSubscribeLastTimeStamp", "setSubscribeLastTimeStamp", "sequenceNumber", "getSequenceNumber", "setSequenceNumber", "sequenceSusbcriberNumber", "getSequenceSusbcriberNumber", "setSequenceSusbcriberNumber", "Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;", "localPublisherAudioSampler", "Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;", "Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;", "localPublisherVideoSamplerMap$delegate", "Ll83/h;", "getLocalPublisherVideoSamplerMap", "()Ljava/util/Map;", "localPublisherVideoSamplerMap", "Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;", "subscriberAudioSamplerMap$delegate", "getSubscriberAudioSamplerMap", "subscriberAudioSamplerMap", "Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;", "subscriberVideoSamplerMap$delegate", "getSubscriberVideoSamplerMap", "subscriberVideoSamplerMap", "Llive/hms/video/connection/stats/BitrateCalculator;", "bitrateCalculator", "Llive/hms/video/connection/stats/BitrateCalculator;", "availableOutgoingBitrate", "getAvailableOutgoingBitrate", "setAvailableOutgoingBitrate", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class StatsSamplingManager {
    private final int DEFAULT_PUBLISH_INTERVAL;
    private final int DEFAULT_SAMPLE_DURATION;
    private final int DEFAULT_SUBSCRIBE_SAMPLE_DURATION;
    private double START_VIDEO_SAMPLE_DURATION;
    private final AnalyticsEventsService analyticsEventsService;
    private final Context applicationContext;
    private double availableOutgoingBitrate;
    private final BitrateCalculator bitrateCalculator;
    private final Function1 getPeerFromVideoTrackID;
    private boolean isPublishStatsEnabled;
    private boolean isSubscribeStatsEnabled;
    private long lastPublishedPublisherStatsTime;
    private long lastPublishedSubscriberStatsTime;
    private PublishAudioStatsSampler localPublisherAudioSampler;

    /* JADX INFO: renamed from: localPublisherVideoSamplerMap$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h localPublisherVideoSamplerMap;
    private double publishLastTimeStamp;
    private int publishStatsMaxSamplePushInterval;
    private int publishStatsMaxSampleWindowSize;
    private int sequenceNumber;
    private int sequenceSusbcriberNumber;
    private final long statsInitTime;
    private double subscribeLastTimeStamp;
    private int subscribeStatsMaxSamplePushInterval;
    private int subscribeStatsMaxSampleWindowSize;

    /* JADX INFO: renamed from: subscriberAudioSamplerMap$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h subscriberAudioSamplerMap;

    /* JADX INFO: renamed from: subscriberVideoSamplerMap$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h subscriberVideoSamplerMap;

    public StatsSamplingManager(long j7, AnalyticsEventsService analyticsEventsService, Context applicationContext, Function1 getPeerFromVideoTrackID) {
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(getPeerFromVideoTrackID, "getPeerFromVideoTrackID");
        this.statsInitTime = j7;
        this.analyticsEventsService = analyticsEventsService;
        this.applicationContext = applicationContext;
        this.getPeerFromVideoTrackID = getPeerFromVideoTrackID;
        this.DEFAULT_SAMPLE_DURATION = 30000;
        this.DEFAULT_SUBSCRIBE_SAMPLE_DURATION = DateTimeConstants.MILLIS_PER_MINUTE;
        this.DEFAULT_PUBLISH_INTERVAL = 300000;
        this.publishStatsMaxSampleWindowSize = 30000;
        this.publishStatsMaxSamplePushInterval = 300000;
        this.subscribeStatsMaxSampleWindowSize = DateTimeConstants.MILLIS_PER_MINUTE;
        this.subscribeStatsMaxSamplePushInterval = 300000;
        this.lastPublishedPublisherStatsTime = j7;
        this.lastPublishedSubscriberStatsTime = j7;
        this.START_VIDEO_SAMPLE_DURATION = -1.0d;
        this.sequenceNumber = 1;
        this.sequenceSusbcriberNumber = 1;
        this.localPublisherVideoSamplerMap = AbstractC30060g.m92088H(new C13998z1(8));
        this.subscriberAudioSamplerMap = AbstractC30060g.m92088H(new C13998z1(9));
        this.subscriberVideoSamplerMap = AbstractC30060g.m92088H(new C13998z1(10));
        this.bitrateCalculator = new BitrateCalculator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RTCStats collectSubscribeStats$lambda$10$lambda$9(StatsSamplingManager this$0, Map allSubscriberStats, String trackID) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(allSubscriberStats, "$allSubscriberStats");
        AbstractC22676k.m65750j(trackID, "trackID");
        return this$0.getCorrespondingAudioStats(trackID, allSubscriberStats);
    }

    private final RTCStats getCorrespondingAudioStats(String audioTrackID, Map<String, RTCStats> allSubscriberStats) {
        Iterator<Map.Entry<String, RTCStats>> it = allSubscriberStats.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<String, RTCStats> next = it.next();
            Object obj = next.getValue().getMembers().get("trackIdentifier");
            String str = obj instanceof String ? (String) obj : null;
            if (AbstractC22676k.m65745e(next.getValue().getType(), "inbound-rtp") && String.valueOf(next.getValue().getMembers().get("kind")).equals("audio") && AbstractC22676k.m65745e(audioTrackID, str)) {
                return next.getValue();
            }
        }
    }

    private final Map<String, PublishVideoStatsSampler> getLocalPublisherVideoSamplerMap() {
        return (Map) this.localPublisherVideoSamplerMap.getValue();
    }

    private final RTCStats getSelectedCandidateInfo(Map<String, ? extends RTCStats> stats) {
        RTCStats rTCStats;
        Map<String, Object> members;
        Object obj = (stats == null || (rTCStats = stats.get("RTCTransport_0_1")) == null || (members = rTCStats.getMembers()) == null) ? null : members.get("selectedCandidatePairId");
        if (obj != null) {
            return stats.get(obj);
        }
        return null;
    }

    private final Map<String, SubscribeAudioStatsSampler> getSubscriberAudioSamplerMap() {
        return (Map) this.subscriberAudioSamplerMap.getValue();
    }

    private final Map<String, SubscribeVideoStatsSampler> getSubscriberVideoSamplerMap() {
        return (Map) this.subscriberVideoSamplerMap.getValue();
    }

    private final RTCStats getTrackExtraEntry(Map.Entry<String, RTCStats> entry, Map<String, RTCStats> allStats) {
        return allStats.get(entry.getValue().getMembers().get("trackId"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map localPublisherVideoSamplerMap_delegate$lambda$0() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ void shouldPublishStats$default(StatsSamplingManager statsSamplingManager, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        statsSamplingManager.shouldPublishStats(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map subscriberAudioSamplerMap_delegate$lambda$1() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map subscriberVideoSamplerMap_delegate$lambda$2() {
        return new LinkedHashMap();
    }

    private final double toBitrate(RTCStats rTCStats, BigInteger bigInteger, String str) {
        Map<String, Object> members = rTCStats.getMembers();
        String str2 = (String) (members != null ? members.get("trackIdentifier") : null);
        double timestampUs = rTCStats.getTimestampUs();
        BitrateCalculator bitrateCalculator = this.bitrateCalculator;
        Double dValueOf = Double.valueOf(timestampUs);
        if (str == null) {
            str = "";
        }
        Double bitrateFromTrackUpdatePrev = bitrateCalculator.getBitrateFromTrackUpdatePrev(str2, dValueOf, bigInteger, str);
        if (bitrateFromTrackUpdatePrev != null) {
            return bitrateFromTrackUpdatePrev.doubleValue();
        }
        return 0.0d;
    }

    public static /* synthetic */ double toBitrate$default(StatsSamplingManager statsSamplingManager, RTCStats rTCStats, BigInteger bigInteger, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        return statsSamplingManager.toBitrate(rTCStats, bigInteger, str);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x027d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0297  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:137:0x02af  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:148:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x0308  */
    /* JADX WARN: Code duplicated, block: B:150:0x0316  */
    /* JADX WARN: Code duplicated, block: B:223:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5, types: [live.hms.video.connection.stats.clientside.sampler.PublishVideoStatsSampler] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    public final void collectPublishStats(Map<String, RTCStats> allPublishStats) {
        Object obj;
        String str;
        Map<String, Object> members;
        RTCStats trackExtraEntry;
        double d3;
        PublishAudioStatsSampler publishAudioStatsSampler;
        double bitrate$default;
        Object obj2;
        Map<String, Object> members2;
        Map<String, Object> members3;
        ?? r10;
        ?? ValueOf;
        ?? r14;
        ?? ValueOf2;
        ?? r15;
        double dDoubleValue;
        ?? r16;
        long jLongValue;
        Map<String, Object> members4;
        Long l7;
        Double d14;
        Long l12;
        Long l13;
        Map<String, Object> members5;
        Map<String, Object> members6;
        RTCStats value;
        Map<String, Object> members7;
        ?? r17;
        double dDoubleValue2;
        Double d15;
        AbstractC22676k.m65750j(allPublishStats, "allPublishStats");
        if (this.isPublishStatsEnabled) {
            this.publishLastTimeStamp = System.currentTimeMillis();
            boolean z4 = true;
            String str2 = null;
            shouldPublishStats$default(this, false, 1, null);
            Iterator<Map.Entry<String, RTCStats>> it = allPublishStats.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, RTCStats> next = it.next();
                if (AbstractC22676k.m65745e(next.getValue().getType(), "candidate-pair") && (value = next.getValue()) != null && (members7 = value.getMembers()) != null && members7.containsKey("availableOutgoingBitrate") == z4) {
                    Object obj3 = next.getValue().getMembers().get("availableOutgoingBitrate");
                    if (obj3 instanceof Double) {
                        d15 = (Double) obj3;
                    } else {
                        r17 = str2;
                    }
                    if (r17 != 0) {
                        r17 = d15;
                        dDoubleValue2 = r17.doubleValue();
                    } else {
                        r17 = d15;
                        dDoubleValue2 = 0.0d;
                    }
                    this.availableOutgoingBitrate = dDoubleValue2;
                }
                if (AbstractC22676k.m65745e(next.getValue().getType(), "outbound-rtp")) {
                    Map<String, Object> members8 = next.getValue().getMembers();
                    next.getValue().getTimestampUs();
                    RTCStats trackExtraEntry2 = getTrackExtraEntry(next, allPublishStats);
                    getSelectedCandidateInfo(allPublishStats);
                    if (String.valueOf(next.getValue().getMembers().get("kind")).equals("video")) {
                        Object obj4 = (trackExtraEntry2 == null || (members6 = trackExtraEntry2.getMembers()) == null) ? str2 : members6.get("trackIdentifier");
                        if ((obj4 instanceof String ? (String) obj4 : str2) != null) {
                            Object obj5 = (trackExtraEntry2 == null || (members5 = trackExtraEntry2.getMembers()) == null) ? str2 : members5.get("trackIdentifier");
                            if ((obj5 instanceof String ? (String) obj5 : str2) == null) {
                                return;
                            }
                            Object obj6 = members8.get("ssrc");
                            String strValueOf = String.valueOf(obj6 instanceof Long ? (Long) obj6 : str2);
                            Object obj7 = members8.get("frameWidth");
                            if (obj7 instanceof Long) {
                                l13 = (Long) obj7;
                            } else {
                                r10 = str2;
                            }
                            if (r10 != 0) {
                                r10 = l13;
                                ValueOf = Integer.valueOf((int) r10.longValue());
                            } else {
                                r10 = l13;
                                ValueOf = str2;
                            }
                            Object obj8 = members8.get("frameHeight");
                            if (obj8 instanceof Long) {
                                l12 = (Long) obj8;
                            } else {
                                r14 = str2;
                            }
                            if (r14 != 0) {
                                r14 = l12;
                                ValueOf2 = Integer.valueOf((int) r14.longValue());
                            } else {
                                r14 = l12;
                                ValueOf2 = str2;
                            }
                            Object obj9 = members8.get("totalPacketSendDelay");
                            if (obj9 instanceof Double) {
                                d14 = (Double) obj9;
                            } else {
                                r15 = str2;
                            }
                            if (r15 != 0) {
                                r15 = d14;
                                dDoubleValue = r15.doubleValue();
                            } else {
                                r15 = d14;
                                dDoubleValue = 0.0d;
                            }
                            Object obj10 = members8.get("packetsSent");
                            if (obj10 instanceof Long) {
                                l7 = (Long) obj10;
                            } else {
                                r16 = str2;
                            }
                            if (r16 != 0) {
                                r16 = l7;
                                jLongValue = r16.longValue();
                            } else {
                                r16 = l7;
                                jLongValue = 0;
                            }
                            long j7 = jLongValue;
                            Object obj11 = members8.get("qualityLimitationDurations");
                            ?? r18 = obj11 instanceof HashMap ? (HashMap) obj11 : str2;
                            Object obj12 = members8.get("qualityLimitationReason");
                            QualityLimitationReasons qualityLimitationReasons = new QualityLimitationReasons(obj12 instanceof String ? (String) obj12 : str2, r18 != 0 ? (Double) r18.get("bandwidth") : str2, r18 != 0 ? (Double) r18.get("cpu") : str2, r18 != 0 ? (Double) r18.get("none") : str2, r18 != 0 ? (Double) r18.get("other") : str2, null, 32, null);
                            Object obj13 = members8.get("framesPerSecond");
                            Object obj14 = obj13 instanceof Number ? (Number) obj13 : str2;
                            double d16 = this.availableOutgoingBitrate;
                            Map<String, PublishVideoStatsSampler> localPublisherVideoSamplerMap = getLocalPublisherVideoSamplerMap();
                            PublishVideoStatsSampler publishVideoStatsSampler = localPublisherVideoSamplerMap.get(strValueOf);
                            if (publishVideoStatsSampler == null) {
                                double d17 = this.publishStatsMaxSampleWindowSize;
                                Object obj15 = (trackExtraEntry2 == null || (members4 = trackExtraEntry2.getMembers()) == null) ? null : members4.get("trackIdentifier");
                                AbstractC22676k.m65748h(obj15, "null cannot be cast to non-null type kotlin.String");
                                PublishVideoStatsSampler publishVideoStatsSampler2 = new PublishVideoStatsSampler(d17, (String) obj15, (String) members8.get("rid"), String.valueOf((Long) members8.get("ssrc")), null, 16, null);
                                localPublisherVideoSamplerMap.put(strValueOf, publishVideoStatsSampler2);
                                publishVideoStatsSampler = publishVideoStatsSampler2;
                            }
                            publishVideoStatsSampler.add(ValueOf, ValueOf2, qualityLimitationReasons, d16, obj14 != 0 ? obj14.intValue() : 0, strValueOf, trackExtraEntry2 != null ? toBitrate(trackExtraEntry2, (BigInteger) members8.get("bytesSent"), (String) members8.get("rid")) : 0.0d, dDoubleValue, j7, this.publishLastTimeStamp);
                        } else {
                            it = it;
                            if (!String.valueOf(next.getValue().getMembers().get("kind")).equals("audio")) {
                                if (trackExtraEntry2 != null) {
                                    obj = null;
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof String) {
                                    str = (String) obj;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    members = next.getValue().getMembers();
                                    next.getValue().getTimestampUs();
                                    trackExtraEntry = getTrackExtraEntry(next, allPublishStats);
                                    getSelectedCandidateInfo(allPublishStats);
                                    d3 = this.availableOutgoingBitrate;
                                    if (this.localPublisherAudioSampler == null) {
                                        double d18 = this.publishStatsMaxSampleWindowSize;
                                        if (trackExtraEntry != null) {
                                            obj2 = null;
                                        } else {
                                            obj2 = null;
                                        }
                                        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                                        this.localPublisherAudioSampler = new PublishAudioStatsSampler(d18, (String) obj2, String.valueOf((Long) members.get("ssrc")), null, 8, null);
                                    }
                                    publishAudioStatsSampler = this.localPublisherAudioSampler;
                                    if (publishAudioStatsSampler == null) {
                                        if (trackExtraEntry != null) {
                                            bitrate$default = toBitrate$default(this, trackExtraEntry, (BigInteger) members.get("bytesSent"), null, 2, null);
                                        } else {
                                            bitrate$default = 0.0d;
                                        }
                                        publishAudioStatsSampler.add(d3, bitrate$default);
                                    }
                                }
                            }
                        }
                    } else {
                        it = it;
                        if (!String.valueOf(next.getValue().getMembers().get("kind")).equals("audio")) {
                            if (trackExtraEntry2 != null || (members3 = trackExtraEntry2.getMembers()) == null) {
                                obj = null;
                            } else {
                                obj = members3.get("trackIdentifier");
                            }
                            if (obj instanceof String) {
                                str = (String) obj;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                members = next.getValue().getMembers();
                                next.getValue().getTimestampUs();
                                trackExtraEntry = getTrackExtraEntry(next, allPublishStats);
                                getSelectedCandidateInfo(allPublishStats);
                                d3 = this.availableOutgoingBitrate;
                                if (this.localPublisherAudioSampler == null) {
                                    double d19 = this.publishStatsMaxSampleWindowSize;
                                    if (trackExtraEntry != null || (members2 = trackExtraEntry.getMembers()) == null) {
                                        obj2 = null;
                                    } else {
                                        obj2 = members2.get("trackIdentifier");
                                    }
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                                    this.localPublisherAudioSampler = new PublishAudioStatsSampler(d19, (String) obj2, String.valueOf((Long) members.get("ssrc")), null, 8, null);
                                }
                                publishAudioStatsSampler = this.localPublisherAudioSampler;
                                if (publishAudioStatsSampler == null) {
                                    if (trackExtraEntry != null) {
                                        bitrate$default = toBitrate$default(this, trackExtraEntry, (BigInteger) members.get("bytesSent"), null, 2, null);
                                    } else {
                                        bitrate$default = 0.0d;
                                    }
                                    publishAudioStatsSampler.add(d3, bitrate$default);
                                }
                            }
                        }
                    }
                } else {
                    it = it;
                    if (AbstractC22676k.m65745e(next.getValue().getType(), "remote-inbound-rtp")) {
                        Map<String, Object> members9 = next.getValue().getMembers();
                        getTrackExtraEntry(next, allPublishStats);
                        if (String.valueOf(next.getValue().getMembers().get("kind")).equals("video") && ((Long) members9.get("ssrc")) != null) {
                            Map<String, Object> members10 = next.getValue().getMembers();
                            getTrackExtraEntry(next, allPublishStats);
                            Object obj16 = members10.get("roundTripTime");
                            Double d24 = obj16 instanceof Double ? (Double) obj16 : null;
                            double dDoubleValue3 = d24 != null ? d24.doubleValue() : 0.0d;
                            Object obj17 = members10.get("jitter");
                            Double d25 = obj17 instanceof Double ? (Double) obj17 : null;
                            double dDoubleValue4 = d25 != null ? d25.doubleValue() : 0.0d;
                            Object obj18 = members10.get("packetsLost");
                            Integer num = obj18 instanceof Integer ? (Integer) obj18 : null;
                            int iIntValue = num != null ? num.intValue() : 0;
                            Object obj19 = members10.get("ssrc");
                            PublishVideoStatsSampler publishVideoStatsSampler3 = getLocalPublisherVideoSamplerMap().get(String.valueOf(obj19 instanceof Long ? (Long) obj19 : null));
                            if (publishVideoStatsSampler3 != null) {
                                publishVideoStatsSampler3.add(dDoubleValue4, iIntValue, dDoubleValue3);
                            }
                        } else if (String.valueOf(next.getValue().getMembers().get("kind")).equals("audio")) {
                            Map<String, Object> members11 = next.getValue().getMembers();
                            getTrackExtraEntry(next, allPublishStats);
                            Object obj20 = members11.get("roundTripTime");
                            Double d26 = obj20 instanceof Double ? (Double) obj20 : null;
                            double dDoubleValue5 = d26 != null ? d26.doubleValue() : 0.0d;
                            Object obj21 = members11.get("jitter");
                            Double d27 = obj21 instanceof Double ? (Double) obj21 : null;
                            double dDoubleValue6 = d27 != null ? d27.doubleValue() : 0.0d;
                            Object obj22 = members11.get("packetsLost");
                            Integer num2 = obj22 instanceof Integer ? (Integer) obj22 : null;
                            int iIntValue2 = num2 != null ? num2.intValue() : 0;
                            PublishAudioStatsSampler publishAudioStatsSampler2 = this.localPublisherAudioSampler;
                            if (publishAudioStatsSampler2 != null) {
                                publishAudioStatsSampler2.add(dDoubleValue6, iIntValue2, dDoubleValue5);
                            }
                        }
                    }
                }
                it = it;
                z4 = true;
                str2 = null;
            }
            PublishAudioStatsSampler publishAudioStatsSampler3 = this.localPublisherAudioSampler;
            if (publishAudioStatsSampler3 != null) {
                PublishAudioStatsSampler.shouldSample$default(publishAudioStatsSampler3, this.publishLastTimeStamp, false, 2, null);
            }
            for (Map.Entry<String, PublishVideoStatsSampler> entry : getLocalPublisherVideoSamplerMap().entrySet()) {
                entry.getKey();
                PublishVideoStatsSampler.shouldSample$default(entry.getValue(), this.publishLastTimeStamp, false, 2, null);
            }
        }
    }

    public final void collectSubscribeStats(Map<String, RTCStats> allSubscriberStats) {
        Integer num;
        Map<String, Object> map;
        String str;
        Object obj;
        Map<String, Object> members;
        Integer num2 = 0;
        AbstractC22676k.m65750j(allSubscriberStats, "allSubscriberStats");
        if (this.isSubscribeStatsEnabled) {
            this.subscribeLastTimeStamp = System.currentTimeMillis();
            String str2 = null;
            shouldPublishStats$default(this, false, 1, null);
            Iterator<Map.Entry<String, RTCStats>> it = allSubscriberStats.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, RTCStats> next = it.next();
                if (AbstractC22676k.m65745e(next.getValue().getType(), "inbound-rtp")) {
                    RTCStats trackExtraEntry = getTrackExtraEntry(next, allSubscriberStats);
                    Map<String, Object> members2 = next.getValue().getMembers();
                    Object obj2 = (trackExtraEntry == null || (members = trackExtraEntry.getMembers()) == null) ? str2 : members.get("trackIdentifier");
                    String str3 = obj2 instanceof String ? (String) obj2 : str2;
                    Long l7 = (Long) members2.get("ssrc");
                    if (!String.valueOf(next.getValue().getMembers().get("kind")).equals("audio") || str3 == null) {
                        map = members2;
                        str = str3;
                        num = num2;
                        it = it;
                        next = next;
                        obj = "jitterBufferDelay";
                    } else {
                        members2.get("jitter");
                        num = num2;
                        map = members2;
                        obj = "jitterBufferDelay";
                        str = str3;
                        toBitrate$default(this, trackExtraEntry, (BigInteger) members2.get("bytesReceived"), null, 2, null);
                        Object obj3 = map.get("packetsReceived");
                        String strValueOf = String.valueOf(obj3 instanceof Long ? (Long) obj3 : null);
                        Object obj4 = map.get("packetsLost");
                        String strValueOf2 = String.valueOf(obj4 instanceof Integer ? (Integer) obj4 : null);
                        Object obj5 = map.get("audioLevel");
                        Double d3 = obj5 instanceof Double ? (Double) obj5 : null;
                        double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
                        Object obj6 = map.get("concealedSamples");
                        Number number = obj6 instanceof BigInteger ? (BigInteger) obj6 : null;
                        if (number == null) {
                            number = num;
                        }
                        Object obj7 = map.get("silentConcealedSamples");
                        Number number2 = obj7 instanceof BigInteger ? (BigInteger) obj7 : null;
                        if (number2 == null) {
                            number2 = num;
                        }
                        long jLongValue = number.longValue() - number2.longValue();
                        Object obj8 = map.get("totalSamplesReceived");
                        BigInteger bigInteger = obj8 instanceof BigInteger ? (BigInteger) obj8 : null;
                        Number number3 = bigInteger == null ? num : bigInteger;
                        Object obj9 = map.get("concealmentEvents");
                        BigInteger bigInteger2 = obj9 instanceof BigInteger ? (BigInteger) obj9 : null;
                        Number number4 = bigInteger2 == null ? num : bigInteger2;
                        Object obj10 = map.get("fecPacketsDiscarded");
                        BigInteger bigInteger3 = obj10 instanceof BigInteger ? (BigInteger) obj10 : null;
                        Number number5 = bigInteger3 == null ? num : bigInteger3;
                        Object obj11 = map.get("fecPacketsReceived");
                        BigInteger bigInteger4 = obj11 instanceof BigInteger ? (BigInteger) obj11 : null;
                        Number number6 = bigInteger4 == null ? num : bigInteger4;
                        Object obj12 = map.get("totalSamplesDuration");
                        Double d14 = obj12 instanceof Double ? (Double) obj12 : null;
                        double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                        Object obj13 = map.get("jitterBufferEmittedCount");
                        BigInteger bigInteger5 = obj13 instanceof BigInteger ? (BigInteger) obj13 : null;
                        Number number7 = bigInteger5 == null ? num : bigInteger5;
                        Object obj14 = map.get(obj);
                        Double d15 = obj14 instanceof Double ? (Double) obj14 : null;
                        double dDoubleValue3 = d15 != null ? d15.doubleValue() : 0.0d;
                        Map<String, SubscribeAudioStatsSampler> subscriberAudioSamplerMap = getSubscriberAudioSamplerMap();
                        SubscribeAudioStatsSampler subscribeAudioStatsSampler = subscriberAudioSamplerMap.get(str);
                        if (subscribeAudioStatsSampler == null) {
                            subscribeAudioStatsSampler = new SubscribeAudioStatsSampler(this.subscribeStatsMaxSampleWindowSize, str, String.valueOf(l7));
                            subscriberAudioSamplerMap.put(str, subscribeAudioStatsSampler);
                        }
                        subscribeAudioStatsSampler.add(dDoubleValue, jLongValue, number3, number4, number5, number6, (float) dDoubleValue2, Long.parseLong(strValueOf), Long.parseLong(strValueOf2), dDoubleValue3, number7);
                    }
                    if (String.valueOf(next.getValue().getMembers().get("kind")).equals("video") && str != null) {
                        Object obj15 = map.get("framesReceived");
                        Integer num3 = obj15 instanceof Integer ? (Integer) obj15 : null;
                        int iIntValue = num3 != null ? num3.intValue() : 0;
                        Object obj16 = map.get("framesDropped");
                        Long l12 = obj16 instanceof Long ? (Long) obj16 : null;
                        long jLongValue2 = l12 != null ? l12.longValue() : 0L;
                        Object obj17 = map.get("framesDecoded");
                        Long l13 = obj17 instanceof Long ? (Long) obj17 : null;
                        long jLongValue3 = l13 != null ? l13.longValue() : 0L;
                        Object obj18 = map.get("pliCount");
                        Long l14 = obj18 instanceof Long ? (Long) obj18 : null;
                        long jLongValue4 = l14 != null ? l14.longValue() : 0L;
                        Object obj19 = map.get("nackCount");
                        Long l15 = obj19 instanceof Long ? (Long) obj19 : null;
                        long jLongValue5 = l15 != null ? l15.longValue() : 0L;
                        Object obj20 = map.get("frameWidth");
                        Long l16 = obj20 instanceof Long ? (Long) obj20 : null;
                        long jLongValue6 = l16 != null ? l16.longValue() : 0L;
                        Object obj21 = map.get("frameHeight");
                        long j7 = jLongValue4;
                        Long l17 = obj21 instanceof Long ? (Long) obj21 : null;
                        long jLongValue7 = l17 != null ? l17.longValue() : 0L;
                        Object obj22 = map.get("jitterBufferEmittedCount");
                        BigInteger bigInteger6 = obj22 instanceof BigInteger ? (BigInteger) obj22 : null;
                        Number number8 = bigInteger6 == null ? num : bigInteger6;
                        Object obj23 = map.get(obj);
                        Double d16 = obj23 instanceof Double ? (Double) obj23 : null;
                        double dDoubleValue4 = d16 != null ? d16.doubleValue() : 0.0d;
                        Object obj24 = map.get("estimatedPlayoutTimestamp");
                        Double d17 = obj24 instanceof Double ? (Double) obj24 : null;
                        double dDoubleValue5 = d17 != null ? d17.doubleValue() : 0.0d;
                        Map<String, SubscribeVideoStatsSampler> subscriberVideoSamplerMap = getSubscriberVideoSamplerMap();
                        SubscribeVideoStatsSampler subscribeVideoStatsSampler = subscriberVideoSamplerMap.get(str);
                        if (subscribeVideoStatsSampler == null) {
                            subscribeVideoStatsSampler = new SubscribeVideoStatsSampler(this.subscribeStatsMaxSampleWindowSize, str, String.valueOf(l7));
                            subscriberVideoSamplerMap.put(str, subscribeVideoStatsSampler);
                        }
                        SubscribeVideoStatsSampler subscribeVideoStatsSampler2 = subscribeVideoStatsSampler;
                        subscribeVideoStatsSampler2.add(iIntValue, jLongValue2, jLongValue3, Long.valueOf(j7), Long.valueOf(jLongValue5), Long.valueOf(jLongValue6), Long.valueOf(jLongValue7), number8, dDoubleValue4);
                        subscribeVideoStatsSampler2.add(dDoubleValue5, (HMSPeer) this.getPeerFromVideoTrackID.invoke(str), new C14408a(0, this, allSubscriberStats));
                    }
                } else {
                    num = num2;
                    it = it;
                    next = next;
                }
                if (AbstractC22676k.m65745e(next.getValue().getType(), "track")) {
                    Object obj25 = next.getValue().getMembers().get("trackIdentifier");
                    String str4 = obj25 instanceof String ? (String) obj25 : null;
                    if (String.valueOf(next.getValue().getMembers().get("kind")).equals("video") && str4 != null) {
                        Map<String, Object> members3 = next.getValue().getMembers();
                        Object obj26 = members3.get("pauseCount");
                        Long l18 = obj26 instanceof Long ? (Long) obj26 : null;
                        long jLongValue8 = l18 != null ? l18.longValue() : 0L;
                        Object obj27 = members3.get("freezeCount");
                        Long l19 = obj27 instanceof Long ? (Long) obj27 : null;
                        long jLongValue9 = l19 != null ? l19.longValue() : 0L;
                        Object obj28 = members3.get("totalPausesDuration");
                        Double d18 = obj28 instanceof Double ? (Double) obj28 : null;
                        double dDoubleValue6 = d18 != null ? d18.doubleValue() : 0.0d;
                        Object obj29 = members3.get("totalFreezesDuration");
                        Double d19 = obj29 instanceof Double ? (Double) obj29 : null;
                        double dDoubleValue7 = d19 != null ? d19.doubleValue() : 0.0d;
                        Map<String, SubscribeVideoStatsSampler> subscriberVideoSamplerMap2 = getSubscriberVideoSamplerMap();
                        SubscribeVideoStatsSampler subscribeVideoStatsSampler3 = subscriberVideoSamplerMap2.get(str4);
                        if (subscribeVideoStatsSampler3 == null) {
                            subscribeVideoStatsSampler3 = new SubscribeVideoStatsSampler(this.subscribeStatsMaxSampleWindowSize, str4, "");
                            subscriberVideoSamplerMap2.put(str4, subscribeVideoStatsSampler3);
                        }
                        subscribeVideoStatsSampler3.add(jLongValue8, jLongValue9, dDoubleValue6, dDoubleValue7);
                    }
                }
                num2 = num;
                it = it;
                str2 = null;
            }
            for (Map.Entry<String, SubscribeAudioStatsSampler> entry : getSubscriberAudioSamplerMap().entrySet()) {
                entry.getKey();
                SubscribeAudioStatsSampler.shouldSample$default(entry.getValue(), this.subscribeLastTimeStamp, false, 2, null);
            }
            for (Map.Entry<String, SubscribeVideoStatsSampler> entry2 : getSubscriberVideoSamplerMap().entrySet()) {
                entry2.getKey();
                SubscribeVideoStatsSampler.shouldSample$default(entry2.getValue(), this.subscribeLastTimeStamp, false, 2, null);
            }
        }
    }

    public final AnalyticsEventsService getAnalyticsEventsService() {
        return this.analyticsEventsService;
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final double getAvailableOutgoingBitrate() {
        return this.availableOutgoingBitrate;
    }

    public final int getDEFAULT_PUBLISH_INTERVAL() {
        return this.DEFAULT_PUBLISH_INTERVAL;
    }

    public final int getDEFAULT_SAMPLE_DURATION() {
        return this.DEFAULT_SAMPLE_DURATION;
    }

    public final int getDEFAULT_SUBSCRIBE_SAMPLE_DURATION() {
        return this.DEFAULT_SUBSCRIBE_SAMPLE_DURATION;
    }

    public final Function1 getGetPeerFromVideoTrackID() {
        return this.getPeerFromVideoTrackID;
    }

    public final long getLastPublishedPublisherStatsTime() {
        return this.lastPublishedPublisherStatsTime;
    }

    public final long getLastPublishedSubscriberStatsTime() {
        return this.lastPublishedSubscriberStatsTime;
    }

    public final double getPublishLastTimeStamp() {
        return this.publishLastTimeStamp;
    }

    public final int getPublishStatsMaxSamplePushInterval() {
        return this.publishStatsMaxSamplePushInterval;
    }

    public final int getPublishStatsMaxSampleWindowSize() {
        return this.publishStatsMaxSampleWindowSize;
    }

    public final double getSTART_VIDEO_SAMPLE_DURATION() {
        return this.START_VIDEO_SAMPLE_DURATION;
    }

    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final int getSequenceSusbcriberNumber() {
        return this.sequenceSusbcriberNumber;
    }

    public final long getStatsInitTime() {
        return this.statsInitTime;
    }

    public final double getSubscribeLastTimeStamp() {
        return this.subscribeLastTimeStamp;
    }

    public final int getSubscribeStatsMaxSamplePushInterval() {
        return this.subscribeStatsMaxSamplePushInterval;
    }

    public final int getSubscribeStatsMaxSampleWindowSize() {
        return this.subscribeStatsMaxSampleWindowSize;
    }

    /* JADX INFO: renamed from: isPublishStatsEnabled, reason: from getter */
    public final boolean getIsPublishStatsEnabled() {
        return this.isPublishStatsEnabled;
    }

    /* JADX INFO: renamed from: isSubscribeStatsEnabled, reason: from getter */
    public final boolean getIsSubscribeStatsEnabled() {
        return this.isSubscribeStatsEnabled;
    }

    public final void setAvailableOutgoingBitrate(double d3) {
        this.availableOutgoingBitrate = d3;
    }

    public final void setConfig(boolean isPublishStatsEnabled, Stats publishStats, boolean isSubscriberStatsEnabled, Stats subscriberStats) {
        this.isPublishStatsEnabled = isPublishStatsEnabled;
        if ((publishStats != null ? publishStats.getMaxSampleWindowSize() : null) != null && !AbstractC22676k.m65743c(publishStats.getMaxSampleWindowSize(), 0.0f)) {
            this.publishStatsMaxSampleWindowSize = ((int) publishStats.getMaxSampleWindowSize().floatValue()) * 1000;
        }
        if ((publishStats != null ? publishStats.getMaxSamplePushInterval() : null) != null) {
            if (!AbstractC22676k.m65743c(publishStats != null ? publishStats.getMaxSamplePushInterval() : null, 0.0f)) {
                this.publishStatsMaxSamplePushInterval = ((int) publishStats.getMaxSamplePushInterval().floatValue()) * 1000;
            }
        }
        this.isSubscribeStatsEnabled = isSubscriberStatsEnabled;
        if ((subscriberStats != null ? subscriberStats.getMaxSampleWindowSize() : null) != null && !AbstractC22676k.m65743c(subscriberStats.getMaxSampleWindowSize(), 0.0f)) {
            this.subscribeStatsMaxSampleWindowSize = ((int) subscriberStats.getMaxSampleWindowSize().floatValue()) * 1000;
        }
        if ((subscriberStats != null ? subscriberStats.getMaxSamplePushInterval() : null) != null && !AbstractC22676k.m65743c(subscriberStats.getMaxSamplePushInterval(), 0.0f)) {
            this.subscribeStatsMaxSamplePushInterval = ((int) subscriberStats.getMaxSamplePushInterval().floatValue()) * 1000;
        }
        this.availableOutgoingBitrate = 0.0d;
    }

    public final void setLastPublishedPublisherStatsTime(long j7) {
        this.lastPublishedPublisherStatsTime = j7;
    }

    public final void setLastPublishedSubscriberStatsTime(long j7) {
        this.lastPublishedSubscriberStatsTime = j7;
    }

    public final void setPublishLastTimeStamp(double d3) {
        this.publishLastTimeStamp = d3;
    }

    public final void setPublishStatsEnabled(boolean z4) {
        this.isPublishStatsEnabled = z4;
    }

    public final void setPublishStatsMaxSamplePushInterval(int i13) {
        this.publishStatsMaxSamplePushInterval = i13;
    }

    public final void setPublishStatsMaxSampleWindowSize(int i13) {
        this.publishStatsMaxSampleWindowSize = i13;
    }

    public final void setSTART_VIDEO_SAMPLE_DURATION(double d3) {
        this.START_VIDEO_SAMPLE_DURATION = d3;
    }

    public final void setSequenceNumber(int i13) {
        this.sequenceNumber = i13;
    }

    public final void setSequenceSusbcriberNumber(int i13) {
        this.sequenceSusbcriberNumber = i13;
    }

    public final void setSubscribeLastTimeStamp(double d3) {
        this.subscribeLastTimeStamp = d3;
    }

    public final void setSubscribeStatsEnabled(boolean z4) {
        this.isSubscribeStatsEnabled = z4;
    }

    public final void setSubscribeStatsMaxSamplePushInterval(int i13) {
        this.subscribeStatsMaxSamplePushInterval = i13;
    }

    public final void setSubscribeStatsMaxSampleWindowSize(int i13) {
        this.subscribeStatsMaxSampleWindowSize = i13;
    }

    public final void shouldPublishStats(boolean forcePublish) {
        List listM118960L;
        if (this.isPublishStatsEnabled) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= this.lastPublishedPublisherStatsTime + ((long) this.publishStatsMaxSamplePushInterval) || forcePublish) {
                this.lastPublishedPublisherStatsTime = jCurrentTimeMillis;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, PublishVideoStatsSampler> entry : getLocalPublisherVideoSamplerMap().entrySet()) {
                    entry.getKey();
                    PublishVideoStatsSampler value = entry.getValue();
                    if (value.hasSample() || forcePublish) {
                        arrayList.add(value.getCollectedSamples(forcePublish));
                    }
                }
                int i13 = this.sequenceNumber;
                this.sequenceNumber = i13 + 1;
                int i14 = this.publishStatsMaxSampleWindowSize;
                long j7 = this.statsInitTime;
                PublishAudioStatsSampler publishAudioStatsSampler = this.localPublisherAudioSampler;
                if ((publishAudioStatsSampler == null || !publishAudioStatsSampler.hasSample()) && !forcePublish) {
                    listM118960L = C25271y.f99162w;
                } else {
                    PublishAudioStatsSampler publishAudioStatsSampler2 = this.localPublisherAudioSampler;
                    listM118960L = AbstractC37056f.m118960L(publishAudioStatsSampler2 != null ? publishAudioStatsSampler2.getCollectedSamples(forcePublish) : null);
                }
                this.analyticsEventsService.queue(AnalyticsEventFactory.clientSideStats$default(AnalyticsEventFactory.INSTANCE, new PublishAnalyticPayload(i13, i14, j7, arrayList, listM118960L, HMSUtils.INSTANCE.getBatteryPercentage(this.applicationContext)), false, 2, null)).flush();
                PublishAudioStatsSampler publishAudioStatsSampler3 = this.localPublisherAudioSampler;
                if (publishAudioStatsSampler3 != null) {
                    publishAudioStatsSampler3.resetSamples();
                }
                for (Map.Entry<String, PublishVideoStatsSampler> entry2 : getLocalPublisherVideoSamplerMap().entrySet()) {
                    entry2.getKey();
                    entry2.getValue().resetSamples();
                }
            }
        }
        if (this.isSubscribeStatsEnabled) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis2 >= this.lastPublishedSubscriberStatsTime + ((long) this.subscribeStatsMaxSamplePushInterval) || forcePublish) {
                this.lastPublishedSubscriberStatsTime = jCurrentTimeMillis2;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry<String, SubscribeAudioStatsSampler> entry3 : getSubscriberAudioSamplerMap().entrySet()) {
                    entry3.getKey();
                    SubscribeAudioStatsSampler value2 = entry3.getValue();
                    if (value2.hasSample()) {
                        arrayList2.add(value2.getCollectedSamples(forcePublish));
                    }
                }
                for (Map.Entry<String, SubscribeVideoStatsSampler> entry4 : getSubscriberVideoSamplerMap().entrySet()) {
                    entry4.getKey();
                    SubscribeVideoStatsSampler value3 = entry4.getValue();
                    if (value3.hasSample()) {
                        arrayList3.add(value3.getCollectedSamples(forcePublish));
                    }
                }
                int i15 = this.sequenceSusbcriberNumber;
                this.sequenceSusbcriberNumber = i15 + 1;
                this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.clientSideStats(new PublishAnalyticPayload(i15, this.subscribeStatsMaxSampleWindowSize, this.statsInitTime, arrayList3, arrayList2, HMSUtils.INSTANCE.getBatteryPercentage(this.applicationContext)), true)).flush();
                for (Map.Entry<String, SubscribeAudioStatsSampler> entry5 : getSubscriberAudioSamplerMap().entrySet()) {
                    entry5.getKey();
                    entry5.getValue().resetSamples();
                }
                for (Map.Entry<String, SubscribeVideoStatsSampler> entry6 : getSubscriberVideoSamplerMap().entrySet()) {
                    entry6.getKey();
                    entry6.getValue().resetSamples();
                }
            }
        }
    }
}

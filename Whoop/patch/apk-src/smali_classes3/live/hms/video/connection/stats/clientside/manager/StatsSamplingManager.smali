.class public final Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\'\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u00083\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000e2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0004\u0008 \u0010\u0017J%\u0010#\u001a\u0004\u0018\u00010\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140!H\u0002\u00a2\u0006\u0004\u0008#\u0010$J9\u0010(\u001a\u0004\u0018\u00010\u00142\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140%2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u00a2\u0006\u0004\u0008(\u0010)J)\u0010.\u001a\u00020-*\u00020\u00142\u0008\u0010+\u001a\u0004\u0018\u00010*2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008.\u0010/J-\u00101\u001a\u0004\u0018\u00010\u00142\u0006\u00100\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00087\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010;R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008=\u0010>R\u001a\u0010@\u001a\u00020?8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR\u001a\u0010D\u001a\u00020?8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008D\u0010A\u001a\u0004\u0008E\u0010CR\u001a\u0010F\u001a\u00020?8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008F\u0010A\u001a\u0004\u0008G\u0010CR\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010H\u001a\u0004\u0008\u0018\u0010I\"\u0004\u0008J\u0010\u0012R\"\u0010K\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010H\u001a\u0004\u0008K\u0010I\"\u0004\u0008L\u0010\u0012R\"\u0010M\u001a\u00020?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010A\u001a\u0004\u0008N\u0010C\"\u0004\u0008O\u0010PR\"\u0010Q\u001a\u00020?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Q\u0010A\u001a\u0004\u0008R\u0010C\"\u0004\u0008S\u0010PR\"\u0010T\u001a\u00020?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008T\u0010A\u001a\u0004\u0008U\u0010C\"\u0004\u0008V\u0010PR\"\u0010W\u001a\u00020?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008W\u0010A\u001a\u0004\u0008X\u0010C\"\u0004\u0008Y\u0010PR\"\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u00103\u001a\u0004\u0008[\u00105\"\u0004\u0008\\\u0010]R\"\u0010^\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u00103\u001a\u0004\u0008_\u00105\"\u0004\u0008`\u0010]R\"\u0010a\u001a\u00020-8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR\"\u0010g\u001a\u00020-8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008g\u0010b\u001a\u0004\u0008h\u0010d\"\u0004\u0008i\u0010fR\"\u0010j\u001a\u00020-8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008j\u0010b\u001a\u0004\u0008k\u0010d\"\u0004\u0008l\u0010fR\"\u0010m\u001a\u00020?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008m\u0010A\u001a\u0004\u0008n\u0010C\"\u0004\u0008o\u0010PR\"\u0010p\u001a\u00020?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008p\u0010A\u001a\u0004\u0008q\u0010C\"\u0004\u0008r\u0010PR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\'\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020v0\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008w\u0010x\u001a\u0004\u0008y\u0010zR\'\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020|0\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008}\u0010x\u001a\u0004\u0008~\u0010zR+\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0080\u00010\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0081\u0001\u0010x\u001a\u0005\u0008\u0082\u0001\u0010zR\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R&\u0010\u0087\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0087\u0001\u0010b\u001a\u0005\u0008\u0088\u0001\u0010d\"\u0005\u0008\u0089\u0001\u0010f\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;",
        "",
        "",
        "statsInitTime",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Landroid/content/Context;",
        "applicationContext",
        "Lkotlin/Function1;",
        "",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "getPeerFromVideoTrackID",
        "<init>",
        "(JLlive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V",
        "",
        "forcePublish",
        "Ll83/a0;",
        "shouldPublishStats",
        "(Z)V",
        "",
        "Lhms/webrtc/RTCStats;",
        "allPublishStats",
        "collectPublishStats",
        "(Ljava/util/Map;)V",
        "isPublishStatsEnabled",
        "Llive/hms/video/signal/init/Stats;",
        "publishStats",
        "isSubscriberStatsEnabled",
        "subscriberStats",
        "setConfig",
        "(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V",
        "allSubscriberStats",
        "collectSubscribeStats",
        "",
        "stats",
        "getSelectedCandidateInfo",
        "(Ljava/util/Map;)Lhms/webrtc/RTCStats;",
        "",
        "entry",
        "allStats",
        "getTrackExtraEntry",
        "(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;",
        "Ljava/math/BigInteger;",
        "bytesTransported",
        "rid",
        "",
        "toBitrate",
        "(Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;)D",
        "audioTrackID",
        "getCorrespondingAudioStats",
        "(Ljava/lang/String;Ljava/util/Map;)Lhms/webrtc/RTCStats;",
        "J",
        "getStatsInitTime",
        "()J",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "getAnalyticsEventsService",
        "()Llive/hms/video/events/AnalyticsEventsService;",
        "Landroid/content/Context;",
        "getApplicationContext",
        "()Landroid/content/Context;",
        "Lkotlin/jvm/functions/Function1;",
        "getGetPeerFromVideoTrackID",
        "()Lkotlin/jvm/functions/Function1;",
        "",
        "DEFAULT_SAMPLE_DURATION",
        "I",
        "getDEFAULT_SAMPLE_DURATION",
        "()I",
        "DEFAULT_SUBSCRIBE_SAMPLE_DURATION",
        "getDEFAULT_SUBSCRIBE_SAMPLE_DURATION",
        "DEFAULT_PUBLISH_INTERVAL",
        "getDEFAULT_PUBLISH_INTERVAL",
        "Z",
        "()Z",
        "setPublishStatsEnabled",
        "isSubscribeStatsEnabled",
        "setSubscribeStatsEnabled",
        "publishStatsMaxSampleWindowSize",
        "getPublishStatsMaxSampleWindowSize",
        "setPublishStatsMaxSampleWindowSize",
        "(I)V",
        "publishStatsMaxSamplePushInterval",
        "getPublishStatsMaxSamplePushInterval",
        "setPublishStatsMaxSamplePushInterval",
        "subscribeStatsMaxSampleWindowSize",
        "getSubscribeStatsMaxSampleWindowSize",
        "setSubscribeStatsMaxSampleWindowSize",
        "subscribeStatsMaxSamplePushInterval",
        "getSubscribeStatsMaxSamplePushInterval",
        "setSubscribeStatsMaxSamplePushInterval",
        "lastPublishedPublisherStatsTime",
        "getLastPublishedPublisherStatsTime",
        "setLastPublishedPublisherStatsTime",
        "(J)V",
        "lastPublishedSubscriberStatsTime",
        "getLastPublishedSubscriberStatsTime",
        "setLastPublishedSubscriberStatsTime",
        "START_VIDEO_SAMPLE_DURATION",
        "D",
        "getSTART_VIDEO_SAMPLE_DURATION",
        "()D",
        "setSTART_VIDEO_SAMPLE_DURATION",
        "(D)V",
        "publishLastTimeStamp",
        "getPublishLastTimeStamp",
        "setPublishLastTimeStamp",
        "subscribeLastTimeStamp",
        "getSubscribeLastTimeStamp",
        "setSubscribeLastTimeStamp",
        "sequenceNumber",
        "getSequenceNumber",
        "setSequenceNumber",
        "sequenceSusbcriberNumber",
        "getSequenceSusbcriberNumber",
        "setSequenceSusbcriberNumber",
        "Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;",
        "localPublisherAudioSampler",
        "Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;",
        "Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;",
        "localPublisherVideoSamplerMap$delegate",
        "Ll83/h;",
        "getLocalPublisherVideoSamplerMap",
        "()Ljava/util/Map;",
        "localPublisherVideoSamplerMap",
        "Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;",
        "subscriberAudioSamplerMap$delegate",
        "getSubscriberAudioSamplerMap",
        "subscriberAudioSamplerMap",
        "Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;",
        "subscriberVideoSamplerMap$delegate",
        "getSubscriberVideoSamplerMap",
        "subscriberVideoSamplerMap",
        "Llive/hms/video/connection/stats/BitrateCalculator;",
        "bitrateCalculator",
        "Llive/hms/video/connection/stats/BitrateCalculator;",
        "availableOutgoingBitrate",
        "getAvailableOutgoingBitrate",
        "setAvailableOutgoingBitrate",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final DEFAULT_PUBLISH_INTERVAL:I

.field private final DEFAULT_SAMPLE_DURATION:I

.field private final DEFAULT_SUBSCRIBE_SAMPLE_DURATION:I

.field private START_VIDEO_SAMPLE_DURATION:D

.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final applicationContext:Landroid/content/Context;

.field private availableOutgoingBitrate:D

.field private final bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

.field private final getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private isPublishStatsEnabled:Z

.field private isSubscribeStatsEnabled:Z

.field private lastPublishedPublisherStatsTime:J

.field private lastPublishedSubscriberStatsTime:J

.field private localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

.field private final localPublisherVideoSamplerMap$delegate:Ll83/h;

.field private publishLastTimeStamp:D

.field private publishStatsMaxSamplePushInterval:I

.field private publishStatsMaxSampleWindowSize:I

.field private sequenceNumber:I

.field private sequenceSusbcriberNumber:I

.field private final statsInitTime:J

.field private subscribeLastTimeStamp:D

.field private subscribeStatsMaxSamplePushInterval:I

.field private subscribeStatsMaxSampleWindowSize:I

.field private final subscriberAudioSamplerMap$delegate:Ll83/h;

.field private final subscriberVideoSamplerMap$delegate:Ll83/h;


# direct methods
.method public constructor <init>(JLlive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "analyticsEventsService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getPeerFromVideoTrackID"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->statsInitTime:J

    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p4, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->applicationContext:Landroid/content/Context;

    iput-object p5, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;

    const/16 p3, 0x7530

    iput p3, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->DEFAULT_SAMPLE_DURATION:I

    const p4, 0xea60

    iput p4, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->DEFAULT_SUBSCRIBE_SAMPLE_DURATION:I

    const p5, 0x493e0

    iput p5, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->DEFAULT_PUBLISH_INTERVAL:I

    iput p3, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    iput p5, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSamplePushInterval:I

    iput p4, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    iput p5, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSamplePushInterval:I

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedPublisherStatsTime:J

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedSubscriberStatsTime:J

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->START_VIDEO_SAMPLE_DURATION:D

    const/4 p1, 0x1

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceNumber:I

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceSusbcriberNumber:I

    new-instance p1, Lf1/z1;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lf1/z1;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherVideoSamplerMap$delegate:Ll83/h;

    new-instance p1, Lf1/z1;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lf1/z1;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscriberAudioSamplerMap$delegate:Ll83/h;

    new-instance p1, Lf1/z1;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lf1/z1;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscriberVideoSamplerMap$delegate:Ll83/h;

    new-instance p1, Llive/hms/video/connection/stats/BitrateCalculator;

    invoke-direct {p1}, Llive/hms/video/connection/stats/BitrateCalculator;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscriberAudioSamplerMap_delegate$lambda$1()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/util/Map;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherVideoSamplerMap_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/util/Map;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscriberVideoSamplerMap_delegate$lambda$2()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final collectSubscribeStats$lambda$10$lambda$9(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Ljava/util/Map;Ljava/lang/String;)Lhms/webrtc/RTCStats;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$allSubscriberStats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getCorrespondingAudioStats(Ljava/lang/String;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Ljava/util/Map;Ljava/lang/String;)Lhms/webrtc/RTCStats;
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->collectSubscribeStats$lambda$10$lambda$9(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Ljava/util/Map;Ljava/lang/String;)Lhms/webrtc/RTCStats;

    move-result-object p0

    return-object p0
.end method

.method private final getCorrespondingAudioStats(Ljava/lang/String;Ljava/util/Map;)Lhms/webrtc/RTCStats;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)",
            "Lhms/webrtc/RTCStats;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    const-string v3, "trackIdentifier"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, Ljava/lang/String;

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "inbound-rtp"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    const-string v3, "kind"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "audio"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    return-object p1

    :cond_2
    return-object v1
.end method

.method private final getLocalPublisherVideoSamplerMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherVideoSamplerMap$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getSelectedCandidateInfo(Ljava/util/Map;)Lhms/webrtc/RTCStats;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lhms/webrtc/RTCStats;",
            ">;)",
            "Lhms/webrtc/RTCStats;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    move-object v1, v0

    goto :goto_0

    :cond_1
    const-string v1, "RTCTransport_0_1"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "selectedCandidatePairId"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    return-object p1

    :cond_2
    return-object v0
.end method

.method private final getSubscriberAudioSamplerMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscriberAudioSamplerMap$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getSubscriberVideoSamplerMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscriberVideoSamplerMap$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)",
            "Lhms/webrtc/RTCStats;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    const-string v0, "trackId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    return-object p1
.end method

.method private static final localPublisherVideoSamplerMap_delegate$lambda$0()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method

.method public static synthetic shouldPublishStats$default(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->shouldPublishStats(Z)V

    return-void
.end method

.method private static final subscriberAudioSamplerMap_delegate$lambda$1()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method

.method private static final subscriberVideoSamplerMap_delegate$lambda$2()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method

.method private final toBitrate(Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;)D
    .locals 3

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "trackIdentifier"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v1

    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    if-nez p3, :cond_1

    const-string p3, ""

    :cond_1
    invoke-virtual {p1, v0, v1, p2, p3}, Llive/hms/video/connection/stats/BitrateCalculator;->getBitrateFromTrackUpdatePrev(Ljava/lang/String;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    return-wide p1

    :cond_2
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public static synthetic toBitrate$default(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;ILjava/lang/Object;)D
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p3, ""

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->toBitrate(Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final collectPublishStats(Ljava/util/Map;)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    const-string v1, "allPublishStats"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isPublishStatsEnabled:Z

    if-nez v1, :cond_0

    goto/16 :goto_2f

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-double v1, v1

    iput-wide v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishLastTimeStamp:D

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v7, v8, v9}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->shouldPublishStats$default(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;ZILjava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_33

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "candidate-pair"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v5, "availableOutgoingBitrate"

    invoke-interface {v2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, v8, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/Double;

    if-eqz v5, :cond_1

    check-cast v2, Ljava/lang/Double;

    goto :goto_1

    :cond_1
    move-object v2, v9

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    goto :goto_2

    :cond_2
    const-wide/16 v11, 0x0

    :goto_2
    iput-wide v11, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->availableOutgoingBitrate:D

    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v5, "outbound-rtp"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "audio"

    const-string v11, "video"

    const-string v12, "kind"

    const-string v13, "ssrc"

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lhms/webrtc/RTCStats;

    invoke-virtual {v14}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    invoke-direct {v0, v1, v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v14

    invoke-direct/range {p0 .. p1}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSelectedCandidateInfo(Ljava/util/Map;)Lhms/webrtc/RTCStats;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lhms/webrtc/RTCStats;

    invoke-virtual {v15}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-string v15, "bytesSent"

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    const-string v4, "trackIdentifier"

    if-eqz v11, :cond_1e

    if-eqz v14, :cond_4

    invoke-virtual {v14}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-interface {v11, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    goto :goto_3

    :cond_4
    move-object v11, v9

    :goto_3
    instance-of v7, v11, Ljava/lang/String;

    if-eqz v7, :cond_5

    check-cast v11, Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v11, v9

    :goto_4
    if-eqz v11, :cond_1e

    if-eqz v14, :cond_6

    invoke-virtual {v14}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_5

    :cond_6
    move-object v1, v9

    :goto_5
    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_7

    check-cast v1, Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v1, v9

    :goto_6
    if-nez v1, :cond_8

    goto/16 :goto_2f

    :cond_8
    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v5, v1, Ljava/lang/Long;

    if-eqz v5, :cond_9

    check-cast v1, Ljava/lang/Long;

    goto :goto_7

    :cond_9
    move-object v1, v9

    :goto_7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "frameWidth"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Long;

    if-eqz v7, :cond_a

    check-cast v5, Ljava/lang/Long;

    goto :goto_8

    :cond_a
    move-object v5, v9

    :goto_8
    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    long-to-int v5, v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_9

    :cond_b
    move-object/from16 v17, v9

    :goto_9
    const-string v5, "frameHeight"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Long;

    if-eqz v7, :cond_c

    check-cast v5, Ljava/lang/Long;

    goto :goto_a

    :cond_c
    move-object v5, v9

    :goto_a
    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    long-to-int v5, v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v18, v5

    goto :goto_b

    :cond_d
    move-object/from16 v18, v9

    :goto_b
    const-string v5, "totalPacketSendDelay"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Double;

    if-eqz v7, :cond_e

    check-cast v5, Ljava/lang/Double;

    goto :goto_c

    :cond_e
    move-object v5, v9

    :goto_c
    if-eqz v5, :cond_f

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    move-wide/from16 v26, v11

    goto :goto_d

    :cond_f
    const-wide/16 v26, 0x0

    :goto_d
    const-string v5, "packetsSent"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Long;

    if-eqz v7, :cond_10

    check-cast v5, Ljava/lang/Long;

    goto :goto_e

    :cond_10
    move-object v5, v9

    :goto_e
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    :goto_f
    move-wide/from16 v28, v11

    goto :goto_10

    :cond_11
    const-wide/16 v11, 0x0

    goto :goto_f

    :goto_10
    const-string v5, "qualityLimitationDurations"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/util/HashMap;

    if-eqz v7, :cond_12

    check-cast v5, Ljava/util/HashMap;

    goto :goto_11

    :cond_12
    move-object v5, v9

    :goto_11
    new-instance v30, Llive/hms/video/connection/degredation/QualityLimitationReasons;

    const-string v7, "qualityLimitationReason"

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v11, v7, Ljava/lang/String;

    if-eqz v11, :cond_13

    check-cast v7, Ljava/lang/String;

    move-object/from16 v31, v7

    goto :goto_12

    :cond_13
    move-object/from16 v31, v9

    :goto_12
    if-eqz v5, :cond_14

    const-string v7, "bandwidth"

    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    move-object/from16 v32, v7

    goto :goto_13

    :cond_14
    move-object/from16 v32, v9

    :goto_13
    if-eqz v5, :cond_15

    const-string v7, "cpu"

    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    move-object/from16 v33, v7

    goto :goto_14

    :cond_15
    move-object/from16 v33, v9

    :goto_14
    if-eqz v5, :cond_16

    const-string v7, "none"

    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    move-object/from16 v34, v7

    goto :goto_15

    :cond_16
    move-object/from16 v34, v9

    :goto_15
    if-eqz v5, :cond_17

    const-string v7, "other"

    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    move-object/from16 v35, v5

    goto :goto_16

    :cond_17
    move-object/from16 v35, v9

    :goto_16
    const/16 v37, 0x20

    const/16 v38, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v30 .. v38}, Llive/hms/video/connection/degredation/QualityLimitationReasons;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v5, "framesPerSecond"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Number;

    if-eqz v7, :cond_18

    check-cast v5, Ljava/lang/Number;

    goto :goto_17

    :cond_18
    move-object v5, v9

    :goto_17
    iget-wide v11, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->availableOutgoingBitrate:D

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getLocalPublisherVideoSamplerMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    const-string v8, "rid"

    if-nez v16, :cond_1a

    new-instance v33, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;

    iget v9, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    move-object/from16 v42, v10

    int-to-double v9, v9

    move-object/from16 v19, v5

    if-eqz v14, :cond_19

    invoke-virtual {v14}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    if-eqz v5, :cond_19

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_18

    :cond_19
    const/4 v4, 0x0

    :goto_18
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v36, v4

    check-cast v36, Ljava/lang/String;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v37, v3

    check-cast v37, Ljava/lang/String;

    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v38

    const/16 v40, 0x10

    const/16 v41, 0x0

    const/16 v39, 0x0

    move-wide/from16 v34, v9

    invoke-direct/range {v33 .. v41}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v33

    invoke-interface {v7, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v16, v3

    goto :goto_19

    :cond_1a
    move-object/from16 v19, v5

    move-object/from16 v42, v10

    :goto_19
    check-cast v16, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;

    if-eqz v19, :cond_1b

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    move-result v3

    move/from16 v22, v3

    goto :goto_1a

    :cond_1b
    const/16 v22, 0x0

    :goto_1a
    if-eqz v14, :cond_1c

    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/math/BigInteger;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v14, v3, v2}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->toBitrate(Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;)D

    move-result-wide v3

    move-wide/from16 v24, v3

    goto :goto_1b

    :cond_1c
    const-wide/16 v24, 0x0

    :goto_1b
    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishLastTimeStamp:D

    move-object/from16 v23, v1

    move-wide/from16 v20, v11

    move-object/from16 v19, v30

    move-wide/from16 v30, v2

    invoke-virtual/range {v16 .. v31}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->add(Ljava/lang/Integer;Ljava/lang/Integer;Llive/hms/video/connection/degredation/QualityLimitationReasons;DILjava/lang/String;DDJD)V

    :cond_1d
    :goto_1c
    move-object/from16 v10, v42

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_1e
    move-object/from16 v42, v10

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    if-eqz v14, :cond_1f

    invoke-virtual {v14}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1f

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1d

    :cond_1f
    const/4 v2, 0x0

    :goto_1d
    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_20

    check-cast v2, Ljava/lang/String;

    goto :goto_1e

    :cond_20
    const/4 v2, 0x0

    :goto_1e
    if-eqz v2, :cond_1d

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhms/webrtc/RTCStats;

    invoke-virtual {v5}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    invoke-direct {v0, v1, v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v1

    invoke-direct/range {p0 .. p1}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSelectedCandidateInfo(Ljava/util/Map;)Lhms/webrtc/RTCStats;

    iget-wide v7, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->availableOutgoingBitrate:D

    iget-object v5, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    if-nez v5, :cond_22

    new-instance v16, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    iget v5, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    int-to-double v9, v5

    if-eqz v1, :cond_21

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    if-eqz v5, :cond_21

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1f

    :cond_21
    const/4 v4, 0x0

    :goto_1f
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v4

    check-cast v19, Ljava/lang/String;

    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v21, 0x0

    move-wide/from16 v17, v9

    invoke-direct/range {v16 .. v23}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v16

    iput-object v3, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    :cond_22
    iget-object v9, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    if-eqz v9, :cond_1d

    if-eqz v1, :cond_23

    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/math/BigInteger;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->toBitrate$default(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;ILjava/lang/Object;)D

    move-result-wide v3

    goto :goto_20

    :cond_23
    const-wide/16 v3, 0x0

    :goto_20
    invoke-virtual {v9, v7, v8, v3, v4}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->add(DD)V

    goto/16 :goto_1c

    :cond_24
    move-object/from16 v42, v10

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "remote-inbound-rtp"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhms/webrtc/RTCStats;

    invoke-virtual {v3}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "packetsLost"

    const-string v7, "jitter"

    const-string v8, "roundTripTime"

    if-eqz v3, :cond_2c

    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_2c

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_25

    check-cast v1, Ljava/lang/Double;

    goto :goto_21

    :cond_25
    const/4 v1, 0x0

    :goto_21
    if-eqz v1, :cond_26

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    move-wide/from16 v20, v8

    goto :goto_22

    :cond_26
    const-wide/16 v20, 0x0

    :goto_22
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_27

    check-cast v1, Ljava/lang/Double;

    goto :goto_23

    :cond_27
    const/4 v1, 0x0

    :goto_23
    if-eqz v1, :cond_28

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    move-wide/from16 v17, v7

    goto :goto_24

    :cond_28
    const-wide/16 v17, 0x0

    :goto_24
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_29

    check-cast v1, Ljava/lang/Integer;

    goto :goto_25

    :cond_29
    const/4 v1, 0x0

    :goto_25
    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move/from16 v19, v1

    goto :goto_26

    :cond_2a
    const/16 v19, 0x0

    :goto_26
    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_2b

    check-cast v1, Ljava/lang/Long;

    goto :goto_27

    :cond_2b
    const/4 v1, 0x0

    :goto_27
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getLocalPublisherVideoSamplerMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;

    if-eqz v16, :cond_1d

    invoke-virtual/range {v16 .. v21}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->add(DID)V

    goto/16 :goto_1c

    :cond_2c
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_2d

    check-cast v1, Ljava/lang/Double;

    goto :goto_28

    :cond_2d
    const/4 v1, 0x0

    :goto_28
    if-eqz v1, :cond_2e

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    move-wide v14, v8

    goto :goto_29

    :cond_2e
    const-wide/16 v14, 0x0

    :goto_29
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_2f

    check-cast v1, Ljava/lang/Double;

    goto :goto_2a

    :cond_2f
    const/4 v1, 0x0

    :goto_2a
    if-eqz v1, :cond_30

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    move-wide v11, v7

    goto :goto_2b

    :cond_30
    const-wide/16 v11, 0x0

    :goto_2b
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_31

    check-cast v1, Ljava/lang/Integer;

    goto :goto_2c

    :cond_31
    const/4 v1, 0x0

    :goto_2c
    if-eqz v1, :cond_32

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v13, v1

    goto :goto_2d

    :cond_32
    const/4 v13, 0x0

    :goto_2d
    iget-object v10, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    if-eqz v10, :cond_1d

    invoke-virtual/range {v10 .. v15}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->add(DID)V

    goto/16 :goto_1c

    :cond_33
    iget-object v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    if-eqz v1, :cond_34

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishLastTimeStamp:D

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;DZILjava/lang/Object;)Z

    :cond_34
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getLocalPublisherVideoSamplerMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;

    iget-wide v4, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishLastTimeStamp:D

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;DZILjava/lang/Object;)Z

    goto :goto_2e

    :cond_35
    :goto_2f
    return-void
.end method

.method public final collectSubscribeStats(Ljava/util/Map;)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v1, "allSubscriberStats"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isSubscribeStatsEnabled:Z

    if-nez v1, :cond_0

    goto/16 :goto_39

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-double v1, v1

    iput-wide v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeLastTimeStamp:D

    const/4 v1, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v7, v1, v9}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->shouldPublishStats$default(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;ZILjava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "inbound-rtp"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v12, "video"

    const-string v13, "trackIdentifier"

    const-string v14, "kind"

    const-wide/16 v17, 0x0

    if-eqz v1, :cond_30

    invoke-direct {v0, v11, v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v1

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v9

    :goto_1
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v3, v9

    :goto_2
    const-string v4, "ssrc"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v4

    check-cast v19, Ljava/lang/Long;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhms/webrtc/RTCStats;

    invoke-virtual {v4}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "audio"

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "jitterBufferDelay"

    const-string v7, "jitterBufferEmittedCount"

    if-eqz v4, :cond_1a

    if-eqz v3, :cond_1a

    const-string v4, "jitter"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "bytesReceived"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/math/BigInteger;

    move-object/from16 v20, v2

    move-object v2, v4

    const/4 v4, 0x2

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 v22, v3

    const/4 v3, 0x0

    move-object/from16 v16, v8

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v15, v22

    invoke-static/range {v0 .. v5}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->toBitrate$default(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Lhms/webrtc/RTCStats;Ljava/math/BigInteger;Ljava/lang/String;ILjava/lang/Object;)D

    const-string v1, "packetsReceived"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_3

    check-cast v1, Ljava/lang/Long;

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "packetsLost"

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "audioLevel"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Double;

    if-eqz v4, :cond_5

    check-cast v3, Ljava/lang/Double;

    goto :goto_5

    :cond_5
    const/4 v3, 0x0

    :goto_5
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    move-wide/from16 v24, v3

    goto :goto_6

    :cond_6
    const-wide/16 v24, 0x0

    :goto_6
    const-string v3, "concealedSamples"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/math/BigInteger;

    if-eqz v4, :cond_7

    check-cast v3, Ljava/math/BigInteger;

    goto :goto_7

    :cond_7
    const/4 v3, 0x0

    :goto_7
    if-nez v3, :cond_8

    move-object/from16 v3, v16

    :cond_8
    const-string v4, "silentConcealedSamples"

    invoke-interface {v9, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/math/BigInteger;

    if-eqz v5, :cond_9

    check-cast v4, Ljava/math/BigInteger;

    goto :goto_8

    :cond_9
    const/4 v4, 0x0

    :goto_8
    if-nez v4, :cond_a

    move-object/from16 v4, v16

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v26

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    sub-long v26, v26, v3

    const-string v3, "totalSamplesReceived"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/math/BigInteger;

    if-eqz v4, :cond_b

    check-cast v3, Ljava/math/BigInteger;

    goto :goto_9

    :cond_b
    const/4 v3, 0x0

    :goto_9
    if-nez v3, :cond_c

    move-object/from16 v28, v16

    goto :goto_a

    :cond_c
    move-object/from16 v28, v3

    :goto_a
    const-string v3, "concealmentEvents"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/math/BigInteger;

    if-eqz v4, :cond_d

    check-cast v3, Ljava/math/BigInteger;

    goto :goto_b

    :cond_d
    const/4 v3, 0x0

    :goto_b
    if-nez v3, :cond_e

    move-object/from16 v29, v16

    goto :goto_c

    :cond_e
    move-object/from16 v29, v3

    :goto_c
    const-string v3, "fecPacketsDiscarded"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/math/BigInteger;

    if-eqz v4, :cond_f

    check-cast v3, Ljava/math/BigInteger;

    goto :goto_d

    :cond_f
    const/4 v3, 0x0

    :goto_d
    if-nez v3, :cond_10

    move-object/from16 v30, v16

    goto :goto_e

    :cond_10
    move-object/from16 v30, v3

    :goto_e
    const-string v3, "fecPacketsReceived"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/math/BigInteger;

    if-eqz v4, :cond_11

    check-cast v3, Ljava/math/BigInteger;

    goto :goto_f

    :cond_11
    const/4 v3, 0x0

    :goto_f
    if-nez v3, :cond_12

    move-object/from16 v31, v16

    goto :goto_10

    :cond_12
    move-object/from16 v31, v3

    :goto_10
    const-string v3, "totalSamplesDuration"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Double;

    if-eqz v4, :cond_13

    check-cast v3, Ljava/lang/Double;

    goto :goto_11

    :cond_13
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_14

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    goto :goto_12

    :cond_14
    const-wide/16 v3, 0x0

    :goto_12
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v1

    instance-of v1, v5, Ljava/math/BigInteger;

    if-eqz v1, :cond_15

    check-cast v5, Ljava/math/BigInteger;

    goto :goto_13

    :cond_15
    const/4 v5, 0x0

    :goto_13
    if-nez v5, :cond_16

    move-object/from16 v39, v16

    goto :goto_14

    :cond_16
    move-object/from16 v39, v5

    :goto_14
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v5, v1, Ljava/lang/Double;

    if-eqz v5, :cond_17

    check-cast v1, Ljava/lang/Double;

    goto :goto_15

    :cond_17
    const/4 v1, 0x0

    :goto_15
    if-eqz v1, :cond_18

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v32

    move-wide/from16 v37, v32

    goto :goto_16

    :cond_18
    const-wide/16 v37, 0x0

    :goto_16
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberAudioSamplerMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_19

    new-instance v5, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;

    move-object/from16 v23, v2

    iget v2, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    move-object/from16 v40, v10

    move-object/from16 v41, v11

    int-to-double v10, v2

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v10, v11, v15, v2}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v15, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_17

    :cond_19
    move-object/from16 v23, v2

    move-object/from16 v40, v10

    move-object/from16 v41, v11

    :goto_17
    check-cast v5, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;

    double-to-float v1, v3

    invoke-static/range {v22 .. v22}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v33

    invoke-static/range {v23 .. v23}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v35

    move/from16 v32, v1

    move-object/from16 v23, v5

    invoke-virtual/range {v23 .. v39}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->add(DJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;FJJDLjava/lang/Number;)V

    goto :goto_18

    :cond_1a
    move-object v9, v2

    move-object v15, v3

    move-object/from16 v16, v8

    move-object/from16 v40, v10

    move-object/from16 v41, v11

    move-object v8, v5

    :goto_18
    invoke-interface/range {v41 .. v41}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    if-eqz v15, :cond_31

    const-string v1, "framesReceived"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_1b

    check-cast v1, Ljava/lang/Integer;

    goto :goto_19

    :cond_1b
    const/4 v1, 0x0

    :goto_19
    if-eqz v1, :cond_1c

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move/from16 v24, v1

    goto :goto_1a

    :cond_1c
    const/16 v24, 0x0

    :goto_1a
    const-string v1, "framesDropped"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_1d

    check-cast v1, Ljava/lang/Long;

    goto :goto_1b

    :cond_1d
    const/4 v1, 0x0

    :goto_1b
    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    move-wide/from16 v25, v1

    goto :goto_1c

    :cond_1e
    move-wide/from16 v25, v17

    :goto_1c
    const-string v1, "framesDecoded"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_1f

    check-cast v1, Ljava/lang/Long;

    goto :goto_1d

    :cond_1f
    const/4 v1, 0x0

    :goto_1d
    if-eqz v1, :cond_20

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    move-wide/from16 v27, v1

    goto :goto_1e

    :cond_20
    move-wide/from16 v27, v17

    :goto_1e
    const-string v1, "pliCount"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_21

    check-cast v1, Ljava/lang/Long;

    goto :goto_1f

    :cond_21
    const/4 v1, 0x0

    :goto_1f
    if-eqz v1, :cond_22

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_20

    :cond_22
    move-wide/from16 v1, v17

    :goto_20
    const-string v3, "nackCount"

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Long;

    if-eqz v4, :cond_23

    check-cast v3, Ljava/lang/Long;

    goto :goto_21

    :cond_23
    const/4 v3, 0x0

    :goto_21
    if-eqz v3, :cond_24

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_22

    :cond_24
    move-wide/from16 v3, v17

    :goto_22
    const-string v5, "frameWidth"

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v10, v5, Ljava/lang/Long;

    if-eqz v10, :cond_25

    check-cast v5, Ljava/lang/Long;

    goto :goto_23

    :cond_25
    const/4 v5, 0x0

    :goto_23
    if-eqz v5, :cond_26

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_24

    :cond_26
    move-wide/from16 v10, v17

    :goto_24
    const-string v5, "frameHeight"

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-wide/from16 v29, v1

    instance-of v1, v5, Ljava/lang/Long;

    if-eqz v1, :cond_27

    check-cast v5, Ljava/lang/Long;

    goto :goto_25

    :cond_27
    const/4 v5, 0x0

    :goto_25
    if-eqz v5, :cond_28

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_26

    :cond_28
    move-wide/from16 v1, v17

    :goto_26
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/math/BigInteger;

    if-eqz v7, :cond_29

    check-cast v5, Ljava/math/BigInteger;

    goto :goto_27

    :cond_29
    const/4 v5, 0x0

    :goto_27
    if-nez v5, :cond_2a

    move-object/from16 v33, v16

    goto :goto_28

    :cond_2a
    move-object/from16 v33, v5

    :goto_28
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Double;

    if-eqz v7, :cond_2b

    check-cast v5, Ljava/lang/Double;

    goto :goto_29

    :cond_2b
    const/4 v5, 0x0

    :goto_29
    if-eqz v5, :cond_2c

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    move-wide/from16 v34, v7

    goto :goto_2a

    :cond_2c
    const-wide/16 v34, 0x0

    :goto_2a
    const-string v5, "estimatedPlayoutTimestamp"

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Double;

    if-eqz v7, :cond_2d

    check-cast v5, Ljava/lang/Double;

    goto :goto_2b

    :cond_2d
    const/4 v5, 0x0

    :goto_2b
    if-eqz v5, :cond_2e

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    goto :goto_2c

    :cond_2e
    const-wide/16 v7, 0x0

    :goto_2c
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberVideoSamplerMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_2f

    new-instance v9, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    move-wide/from16 v31, v1

    iget v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    int-to-double v1, v1

    move-wide/from16 v36, v3

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v9, v1, v2, v15, v3}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v15, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2d

    :cond_2f
    move-wide/from16 v31, v1

    move-wide/from16 v36, v3

    :goto_2d
    move-object/from16 v23, v9

    check-cast v23, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v29

    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v30

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v32

    move-object/from16 v31, v1

    invoke-virtual/range {v23 .. v35}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->add(IJJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;D)V

    move-object/from16 v9, v23

    iget-object v1, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v15}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSPeer;

    new-instance v2, Lfd3/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, v6}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v7, v8, v1, v2}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->add(DLlive/hms/video/sdk/models/HMSPeer;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2e

    :cond_30
    move-object/from16 v16, v8

    move-object/from16 v40, v10

    move-object/from16 v41, v11

    :cond_31
    :goto_2e
    invoke-interface/range {v41 .. v41}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "track"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-interface/range {v41 .. v41}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_32

    check-cast v1, Ljava/lang/String;

    goto :goto_2f

    :cond_32
    const/4 v1, 0x0

    :goto_2f
    invoke-interface/range {v41 .. v41}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3c

    if-eqz v1, :cond_3c

    invoke-interface/range {v41 .. v41}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhms/webrtc/RTCStats;

    invoke-virtual {v2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    const-string v3, "pauseCount"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Long;

    if-eqz v4, :cond_33

    check-cast v3, Ljava/lang/Long;

    goto :goto_30

    :cond_33
    const/4 v3, 0x0

    :goto_30
    if-eqz v3, :cond_34

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-wide v8, v3

    goto :goto_31

    :cond_34
    move-wide/from16 v8, v17

    :goto_31
    const-string v3, "freezeCount"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Long;

    if-eqz v4, :cond_35

    check-cast v3, Ljava/lang/Long;

    goto :goto_32

    :cond_35
    const/4 v3, 0x0

    :goto_32
    if-eqz v3, :cond_36

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    :cond_36
    move-wide/from16 v10, v17

    const-string v3, "totalPausesDuration"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Double;

    if-eqz v4, :cond_37

    check-cast v3, Ljava/lang/Double;

    goto :goto_33

    :cond_37
    const/4 v3, 0x0

    :goto_33
    if-eqz v3, :cond_38

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    move-wide v12, v3

    goto :goto_34

    :cond_38
    const-wide/16 v12, 0x0

    :goto_34
    const-string v3, "totalFreezesDuration"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Double;

    if-eqz v3, :cond_39

    check-cast v2, Ljava/lang/Double;

    goto :goto_35

    :cond_39
    const/4 v2, 0x0

    :goto_35
    if-eqz v2, :cond_3a

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    move-wide v14, v2

    goto :goto_36

    :cond_3a
    const-wide/16 v14, 0x0

    :goto_36
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberVideoSamplerMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3b

    new-instance v3, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    iget v4, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    int-to-double v4, v4

    const-string v7, ""

    invoke-direct {v3, v4, v5, v1, v7}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3b
    move-object v7, v3

    check-cast v7, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    invoke-virtual/range {v7 .. v15}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->add(JJDD)V

    :cond_3c
    move-object/from16 v8, v16

    move-object/from16 v10, v40

    const/4 v7, 0x0

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_3d
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberAudioSamplerMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;

    iget-wide v4, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeLastTimeStamp:D

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;DZILjava/lang/Object;)Z

    goto :goto_37

    :cond_3e
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberVideoSamplerMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_38
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    iget-wide v4, v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeLastTimeStamp:D

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;DZILjava/lang/Object;)Z

    goto :goto_38

    :cond_3f
    :goto_39
    return-void
.end method

.method public final getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    return-object v0
.end method

.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->applicationContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getAvailableOutgoingBitrate()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->availableOutgoingBitrate:D

    return-wide v0
.end method

.method public final getDEFAULT_PUBLISH_INTERVAL()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->DEFAULT_PUBLISH_INTERVAL:I

    return v0
.end method

.method public final getDEFAULT_SAMPLE_DURATION()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->DEFAULT_SAMPLE_DURATION:I

    return v0
.end method

.method public final getDEFAULT_SUBSCRIBE_SAMPLE_DURATION()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->DEFAULT_SUBSCRIBE_SAMPLE_DURATION:I

    return v0
.end method

.method public final getGetPeerFromVideoTrackID()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getLastPublishedPublisherStatsTime()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedPublisherStatsTime:J

    return-wide v0
.end method

.method public final getLastPublishedSubscriberStatsTime()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedSubscriberStatsTime:J

    return-wide v0
.end method

.method public final getPublishLastTimeStamp()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishLastTimeStamp:D

    return-wide v0
.end method

.method public final getPublishStatsMaxSamplePushInterval()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSamplePushInterval:I

    return v0
.end method

.method public final getPublishStatsMaxSampleWindowSize()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    return v0
.end method

.method public final getSTART_VIDEO_SAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->START_VIDEO_SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSequenceNumber()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceNumber:I

    return v0
.end method

.method public final getSequenceSusbcriberNumber()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceSusbcriberNumber:I

    return v0
.end method

.method public final getStatsInitTime()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->statsInitTime:J

    return-wide v0
.end method

.method public final getSubscribeLastTimeStamp()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeLastTimeStamp:D

    return-wide v0
.end method

.method public final getSubscribeStatsMaxSamplePushInterval()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSamplePushInterval:I

    return v0
.end method

.method public final getSubscribeStatsMaxSampleWindowSize()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    return v0
.end method

.method public final isPublishStatsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isPublishStatsEnabled:Z

    return v0
.end method

.method public final isSubscribeStatsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isSubscribeStatsEnabled:Z

    return v0
.end method

.method public final setAvailableOutgoingBitrate(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->availableOutgoingBitrate:D

    return-void
.end method

.method public final setConfig(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V
    .locals 2

    iput-boolean p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isPublishStatsEnabled:Z

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Llive/hms/video/signal/init/Stats;->getMaxSampleWindowSize()Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Llive/hms/video/signal/init/Stats;->getMaxSampleWindowSize()Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Llive/hms/video/signal/init/Stats;->getMaxSampleWindowSize()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-int v0, v0

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Llive/hms/video/signal/init/Stats;->getMaxSamplePushInterval()Ljava/lang/Float;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Llive/hms/video/signal/init/Stats;->getMaxSamplePushInterval()Ljava/lang/Float;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, p1

    :goto_2
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Llive/hms/video/signal/init/Stats;->getMaxSamplePushInterval()Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    float-to-int p2, p2

    mul-int/lit16 p2, p2, 0x3e8

    iput p2, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSamplePushInterval:I

    :cond_4
    iput-boolean p3, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isSubscribeStatsEnabled:Z

    if-eqz p4, :cond_5

    invoke-virtual {p4}, Llive/hms/video/signal/init/Stats;->getMaxSampleWindowSize()Ljava/lang/Float;

    move-result-object p2

    goto :goto_3

    :cond_5
    move-object p2, p1

    :goto_3
    if-eqz p2, :cond_6

    invoke-virtual {p4}, Llive/hms/video/signal/init/Stats;->getMaxSampleWindowSize()Ljava/lang/Float;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-virtual {p4}, Llive/hms/video/signal/init/Stats;->getMaxSampleWindowSize()Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    float-to-int p2, p2

    mul-int/lit16 p2, p2, 0x3e8

    iput p2, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    :cond_6
    if-eqz p4, :cond_7

    invoke-virtual {p4}, Llive/hms/video/signal/init/Stats;->getMaxSamplePushInterval()Ljava/lang/Float;

    move-result-object p1

    :cond_7
    if-eqz p1, :cond_8

    invoke-virtual {p4}, Llive/hms/video/signal/init/Stats;->getMaxSamplePushInterval()Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p4}, Llive/hms/video/signal/init/Stats;->getMaxSamplePushInterval()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    float-to-int p1, p1

    mul-int/lit16 p1, p1, 0x3e8

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSamplePushInterval:I

    :cond_8
    const-wide/16 p1, 0x0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->availableOutgoingBitrate:D

    return-void
.end method

.method public final setLastPublishedPublisherStatsTime(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedPublisherStatsTime:J

    return-void
.end method

.method public final setLastPublishedSubscriberStatsTime(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedSubscriberStatsTime:J

    return-void
.end method

.method public final setPublishLastTimeStamp(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishLastTimeStamp:D

    return-void
.end method

.method public final setPublishStatsEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isPublishStatsEnabled:Z

    return-void
.end method

.method public final setPublishStatsMaxSamplePushInterval(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSamplePushInterval:I

    return-void
.end method

.method public final setPublishStatsMaxSampleWindowSize(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    return-void
.end method

.method public final setSTART_VIDEO_SAMPLE_DURATION(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->START_VIDEO_SAMPLE_DURATION:D

    return-void
.end method

.method public final setSequenceNumber(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceNumber:I

    return-void
.end method

.method public final setSequenceSusbcriberNumber(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceSusbcriberNumber:I

    return-void
.end method

.method public final setSubscribeLastTimeStamp(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeLastTimeStamp:D

    return-void
.end method

.method public final setSubscribeStatsEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isSubscribeStatsEnabled:Z

    return-void
.end method

.method public final setSubscribeStatsMaxSamplePushInterval(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSamplePushInterval:I

    return-void
.end method

.method public final setSubscribeStatsMaxSampleWindowSize(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    return-void
.end method

.method public final shouldPublishStats(Z)V
    .locals 12

    iget-boolean v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isPublishStatsEnabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedPublisherStatsTime:J

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSamplePushInterval:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    if-eqz p1, :cond_8

    :cond_0
    iput-wide v2, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedPublisherStatsTime:J

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getLocalPublisherVideoSamplerMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;

    invoke-virtual {v2}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->hasSample()Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz p1, :cond_1

    :cond_2
    invoke-virtual {v2, p1}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget v5, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceNumber:I

    add-int/lit8 v0, v5, 0x1

    iput v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceNumber:I

    iget v6, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->publishStatsMaxSampleWindowSize:I

    iget-wide v7, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->statsInitTime:J

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->hasSample()Z

    move-result v0

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_6

    :goto_1
    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;

    move-result-object v0

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    invoke-static {v0}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_3
    move-object v10, v0

    goto :goto_4

    :cond_6
    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :goto_4
    sget-object v0, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    iget-object v3, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->applicationContext:Landroid/content/Context;

    invoke-virtual {v0, v3}, Llive/hms/video/utils/HMSUtils;->getBatteryPercentage(Landroid/content/Context;)I

    move-result v11

    new-instance v4, Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;

    invoke-direct/range {v4 .. v11}, Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;-><init>(IIJLjava/util/List;Ljava/util/List;I)V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v3, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v3, v4, v5, v6, v2}, Llive/hms/video/events/AnalyticsEventFactory;->clientSideStats$default(Llive/hms/video/events/AnalyticsEventFactory;Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;ZILjava/lang/Object;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v0, v2}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->localPublisherAudioSampler:Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->resetSamples()V

    :cond_7
    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getLocalPublisherVideoSamplerMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;

    invoke-virtual {v2}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->resetSamples()V

    goto :goto_5

    :cond_8
    iget-boolean v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->isSubscribeStatsEnabled:Z

    if-eqz v0, :cond_f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedSubscriberStatsTime:J

    iget v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSamplePushInterval:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    cmp-long v0, v2, v4

    if-gez v0, :cond_9

    if-eqz p1, :cond_f

    :cond_9
    iput-wide v2, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->lastPublishedSubscriberStatsTime:J

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberAudioSamplerMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;

    invoke-virtual {v2}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->hasSample()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v2, p1}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberVideoSamplerMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    invoke-virtual {v2}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->hasSample()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v2, p1}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    iget v5, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceSusbcriberNumber:I

    add-int/lit8 p1, v5, 0x1

    iput p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->sequenceSusbcriberNumber:I

    iget v6, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->subscribeStatsMaxSampleWindowSize:I

    iget-wide v7, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->statsInitTime:J

    sget-object p1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->applicationContext:Landroid/content/Context;

    invoke-virtual {p1, v0}, Llive/hms/video/utils/HMSUtils;->getBatteryPercentage(Landroid/content/Context;)I

    move-result v11

    new-instance v4, Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;

    invoke-direct/range {v4 .. v11}, Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;-><init>(IIJLjava/util/List;Ljava/util/List;I)V

    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v0, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v0, v4, v1}, Llive/hms/video/events/AnalyticsEventFactory;->clientSideStats(Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;Z)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberAudioSamplerMap()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;

    invoke-virtual {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->resetSamples()V

    goto :goto_8

    :cond_e
    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->getSubscriberVideoSamplerMap()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;

    invoke-virtual {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->resetSamples()V

    goto :goto_9

    :cond_f
    return-void
.end method

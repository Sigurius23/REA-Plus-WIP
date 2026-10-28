.class public final Llive/hms/video/connection/degredation/WebRtcStatsMonitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/degredation/PacketStatistics;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\'\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0004\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001d\u0010\u0014J1\u0010#\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00192\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00192\u0008\u0010\"\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010\'\u001a\u0004\u0018\u00010\r2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0016H\u0082@\u00a2\u0006\u0004\u0008)\u0010*J%\u0010-\u001a\u0004\u0018\u00010,2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0+H\u0002\u00a2\u0006\u0004\u0008-\u0010.J%\u00101\u001a\u0004\u0018\u0001002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0+H\u0002\u00a2\u0006\u0004\u00081\u00102J#\u00105\u001a\u00020\r2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,03H\u0002\u00a2\u0006\u0004\u00085\u00106JU\u0010;\u001a\u00020%2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,072\u0008\u00108\u001a\u0004\u0018\u00010,2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020907H\u0002\u00a2\u0006\u0004\u0008;\u0010<JU\u0010>\u001a\u00020=2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,072\u0008\u00108\u001a\u0004\u0018\u00010,2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020907H\u0002\u00a2\u0006\u0004\u0008>\u0010?J7\u0010A\u001a\u00020@2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,07H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ7\u0010D\u001a\u00020C2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,07H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ9\u0010F\u001a\u0004\u0018\u00010,2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,07H\u0002\u00a2\u0006\u0004\u0008F\u0010GJ9\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010H\u001a\u00020\r2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,032\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008K\u0010LJ;\u0010N\u001a\u0004\u0018\u00010\r2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,\u0018\u0001032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0+H\u0002\u00a2\u0006\u0004\u0008N\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010RR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010TR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010U\u001a\u0004\u0008V\u0010WR\u0014\u0010X\u001a\u00020\r8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0016\u0010]\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0016\u0010_\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010^R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010dR\"\u0010f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008f\u0010Q\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR\"\u0010k\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008k\u0010Q\u001a\u0004\u0008l\u0010h\"\u0004\u0008m\u0010jR.\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020n078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008o\u0010p\u001a\u0004\u0008q\u0010r\"\u0004\u0008s\u0010tR.\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000209078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010p\u001a\u0004\u0008u\u0010r\"\u0004\u0008v\u0010tR\"\u0010w\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008w\u0010^\u001a\u0004\u0008w\u0010x\"\u0004\u0008y\u0010\u001cR\u001a\u0010z\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{\u00a8\u0006|"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/WebRtcStatsMonitor;",
        "Llive/hms/video/connection/degredation/PacketStatistics;",
        "Llive/hms/video/transport/ITransport;",
        "transport",
        "",
        "delayPeriod",
        "Lbc3/c0;",
        "coroutineScope",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Landroid/content/Context;",
        "applicationContext",
        "Lkotlin/Function1;",
        "",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "getPeerFromVideoTrackID",
        "<init>",
        "(Llive/hms/video/transport/ITransport;JLbc3/c0;Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V",
        "Ll83/a0;",
        "reset",
        "()V",
        "Lec3/t1;",
        "Llive/hms/video/connection/degredation/StatsBundle;",
        "getFlow",
        "()Lec3/t1;",
        "",
        "allow",
        "allowExtraStatsCollection",
        "(Z)V",
        "forcePublishStats",
        "isPublishStatsEnabled",
        "Llive/hms/video/signal/init/Stats;",
        "publishStats",
        "isSubscriberStatsEnabled",
        "subscriberStats",
        "setPublishSubscriberStatsConfig",
        "(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V",
        "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;",
        "stats",
        "getUniqueTrackKey",
        "(Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;)Ljava/lang/String;",
        "retrieveStats",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "Lhms/webrtc/RTCStats;",
        "getSelectedCandidateInfo",
        "(Ljava/util/Map;)Lhms/webrtc/RTCStats;",
        "allStats",
        "Llive/hms/video/connection/degredation/Peer;",
        "getDataForPeer",
        "(Ljava/util/Map;)Llive/hms/video/connection/degredation/Peer;",
        "",
        "entry",
        "getEntryType",
        "(Ljava/util/Map$Entry;)Ljava/lang/String;",
        "",
        "candidatePairInfo",
        "",
        "localTracksJitter",
        "getDataForLocalVideo",
        "(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;",
        "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;",
        "getDataForLocalAudio",
        "(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;",
        "Llive/hms/video/connection/degredation/Video;",
        "getDataForVideo",
        "(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Video;",
        "Llive/hms/video/connection/degredation/Audio;",
        "getDataForAudio",
        "(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Audio;",
        "getTrackExtraEntry",
        "(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;",
        "entryName",
        "onlyForKind",
        "",
        "getEntryFromStats",
        "(Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;)Ljava/lang/Number;",
        "inboundStreamEntry",
        "getTrackIdForStream",
        "(Ljava/util/Map$Entry;Ljava/util/Map;)Ljava/lang/String;",
        "Llive/hms/video/transport/ITransport;",
        "J",
        "Lbc3/c0;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "Landroid/content/Context;",
        "Lkotlin/jvm/functions/Function1;",
        "getGetPeerFromVideoTrackID",
        "()Lkotlin/jvm/functions/Function1;",
        "TAG",
        "Ljava/lang/String;",
        "",
        "NUMBER_OF_VALUES_TO_STORE",
        "I",
        "enableExtraStatsCollection",
        "Z",
        "collectStatsSafe",
        "Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;",
        "statsSamplingManager$delegate",
        "Ll83/h;",
        "getStatsSamplingManager",
        "()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;",
        "statsSamplingManager",
        "currentPacketsLost",
        "getCurrentPacketsLost",
        "()J",
        "setCurrentPacketsLost",
        "(J)V",
        "totalPackets",
        "getTotalPackets",
        "setTotalPackets",
        "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
        "packetLossTracks",
        "Ljava/util/Map;",
        "getPacketLossTracks",
        "()Ljava/util/Map;",
        "setPacketLossTracks",
        "(Ljava/util/Map;)V",
        "getLocalTracksJitter",
        "setLocalTracksJitter",
        "isTransportConnected",
        "()Z",
        "setTransportConnected",
        "statsFlow",
        "Lec3/t1;",
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
.field private final NUMBER_OF_VALUES_TO_STORE:I

.field private final TAG:Ljava/lang/String;

.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final applicationContext:Landroid/content/Context;

.field private collectStatsSafe:Z

.field private final coroutineScope:Lbc3/c0;

.field private currentPacketsLost:J

.field private final delayPeriod:J

.field private enableExtraStatsCollection:Z

.field private final getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private isTransportConnected:Z

.field private localTracksJitter:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private packetLossTracks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;"
        }
    .end annotation
.end field

.field private final statsFlow:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final statsSamplingManager$delegate:Ll83/h;

.field private totalPackets:J

.field private final transport:Llive/hms/video/transport/ITransport;


# direct methods
.method public constructor <init>(Llive/hms/video/transport/ITransport;JLbc3/c0;Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/ITransport;",
            "J",
            "Lbc3/c0;",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "transport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getPeerFromVideoTrackID"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->transport:Llive/hms/video/transport/ITransport;

    .line 6
    iput-wide p2, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->delayPeriod:J

    .line 7
    iput-object p4, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->coroutineScope:Lbc3/c0;

    .line 8
    iput-object p5, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    .line 9
    iput-object p6, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->applicationContext:Landroid/content/Context;

    .line 10
    iput-object p7, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;

    .line 11
    const-string p1, "HMSWebrtcStatsMonitor"

    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    const/4 p1, 0x1

    .line 12
    iput p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->NUMBER_OF_VALUES_TO_STORE:I

    .line 13
    new-instance p2, Llive/hms/video/connection/degredation/a;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->statsSamplingManager$delegate:Ll83/h;

    .line 14
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    .line 15
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    .line 16
    new-instance p2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;-><init>(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Lq83/d;)V

    .line 17
    new-instance p3, Lec3/s1;

    invoke-direct {p3, p2}, Lec3/s1;-><init>(Lc93/m;)V

    const-wide/16 p5, 0x0

    const/4 p2, 0x3

    .line 18
    invoke-static {p2, p5, p6}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p2

    invoke-static {p3, p4, p2, p1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->statsFlow:Lec3/t1;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/transport/ITransport;JLbc3/c0;Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x3e8

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_1

    .line 1
    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    .line 2
    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p4

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    .line 3
    invoke-direct/range {v0 .. v7}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;-><init>(Llive/hms/video/transport/ITransport;JLbc3/c0;Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic a(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;)Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;
    .locals 0

    invoke-static {p0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->statsSamplingManager_delegate$lambda$0(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;)Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDelayPeriod$p(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;)J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->delayPeriod:J

    return-wide v0
.end method

.method public static final synthetic access$retrieveStats(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->retrieveStats(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getDataForAudio(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Audio;
    .locals 3
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
            "Llive/hms/video/connection/degredation/Audio;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v1

    invoke-direct {p0, p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object p1

    sget-object p2, Llive/hms/video/connection/degredation/Audio;->Companion:Llive/hms/video/connection/degredation/Audio$Companion;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, v0, p1, v1, v2}, Llive/hms/video/connection/degredation/Audio$Companion;->from(Ljava/util/Map;Lhms/webrtc/RTCStats;D)Llive/hms/video/connection/degredation/Audio;

    move-result-object p1

    return-object p1
.end method

.method private final getDataForLocalAudio(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;
    .locals 7
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
            ">;",
            "Lhms/webrtc/RTCStats;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;)",
            "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v0

    invoke-direct {p0, p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v3

    move-wide p1, v0

    sget-object v1, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->Companion:Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio$Companion;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    move-object v4, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio$Companion;->from(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;

    move-result-object p1

    return-object p1
.end method

.method private final getDataForLocalVideo(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;
    .locals 7
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
            ">;",
            "Lhms/webrtc/RTCStats;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;)",
            "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v0

    invoke-direct {p0, p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v3

    move-wide p1, v0

    sget-object v1, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->Companion:Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo$Companion;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    move-object v4, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo$Companion;->from(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    move-result-object p1

    return-object p1
.end method

.method private final getDataForPeer(Ljava/util/Map;)Llive/hms/video/connection/degredation/Peer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lhms/webrtc/RTCStats;",
            ">;)",
            "Llive/hms/video/connection/degredation/Peer;"
        }
    .end annotation

    const-string v0, "T01"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "selectedCandidatePairId"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    sget-object v1, Llive/hms/video/connection/degredation/Peer;->Companion:Llive/hms/video/connection/degredation/Peer$Companion;

    invoke-virtual {v1, v0, p1}, Llive/hms/video/connection/degredation/Peer$Companion;->from(Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;)Llive/hms/video/connection/degredation/Peer;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1
.end method

.method private final getDataForVideo(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Video;
    .locals 3
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
            "Llive/hms/video/connection/degredation/Video;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v1

    invoke-direct {p0, p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getTrackExtraEntry(Ljava/util/Map$Entry;Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object p1

    sget-object p2, Llive/hms/video/connection/degredation/Video;->Companion:Llive/hms/video/connection/degredation/Video$Companion;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, v0, p1, v1, v2}, Llive/hms/video/connection/degredation/Video$Companion;->from(Ljava/util/Map;Lhms/webrtc/RTCStats;D)Llive/hms/video/connection/degredation/Video;

    move-result-object p1

    return-object p1
.end method

.method private final getEntryFromStats(Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;)Ljava/lang/Number;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Number;"
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/RTCStats;

    invoke-virtual {v0}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    const-string v1, "kind"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    :goto_0
    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lhms/webrtc/RTCStats;

    invoke-virtual {p3}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    instance-of v0, p3, Ljava/lang/Number;

    if-eqz v0, :cond_1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    const-string v2, "Got "

    const-string v3, " from id "

    invoke-static {v2, p1, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Number;

    return-object p3

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic getEntryFromStats$default(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Number;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryFromStats(Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p0

    return-object p0
.end method

.method private final getEntryType(Ljava/util/Map$Entry;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    const-string v0, "kind"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
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
    const-string v1, "T01"

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

.method private final getStatsSamplingManager()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->statsSamplingManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

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

.method private final getTrackIdForStream(Ljava/util/Map$Entry;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lhms/webrtc/RTCStats;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "trackId"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhms/webrtc/RTCStats;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p2, "trackIdentifier"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getUniqueTrackKey(Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getTrackIdentifier()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getHmsLayer()Llive/hms/video/media/settings/HMSLayer;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getTrackIdentifier()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getTrackIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getHmsLayer()Llive/hms/video/media/settings/HMSLayer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final retrieveStats(Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/degredation/StatsBundle;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;

    iget v3, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;

    invoke-direct {v2, v1, v0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;-><init>(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v2, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v2

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v4, v1, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    const-string v8, "Start"

    invoke-virtual {v0, v4, v8}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->transport:Llive/hms/video/transport/ITransport;

    iput-object v1, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->L$0:Ljava/lang/Object;

    iput v6, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->label:I

    invoke-interface {v0, v2}, Llive/hms/video/transport/ITransport;->getSubscribePacketStats(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v1

    :goto_1
    check-cast v0, Lhms/webrtc/RTCStatsReport;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lhms/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    iget-object v6, v4, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->transport:Llive/hms/video/transport/ITransport;

    iput-object v4, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$retrieveStats$1;->label:I

    invoke-interface {v6, v2}, Llive/hms/video/transport/ITransport;->getPublishPacketStats(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_6

    :goto_3
    return-object v3

    :cond_6
    move-object v3, v0

    move-object v0, v2

    move-object v8, v4

    :goto_4
    check-cast v0, Lhms/webrtc/RTCStatsReport;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lhms/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v0

    move-object v2, v0

    goto :goto_5

    :cond_7
    const/4 v2, 0x0

    :goto_5
    if-eqz v3, :cond_8

    if-nez v2, :cond_9

    :cond_8
    const/16 p1, 0x0

    goto/16 :goto_19

    :cond_9
    :try_start_0
    invoke-direct {v8}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getStatsSamplingManager()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->collectPublishStats(Ljava/util/Map;)V

    invoke-direct {v8}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getStatsSamplingManager()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->collectSubscribeStats(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :goto_6
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v8, v2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getSelectedCandidateInfo(Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v5

    invoke-direct {v8, v3}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getSelectedCandidateInfo(Ljava/util/Map;)Lhms/webrtc/RTCStats;

    move-result-object v6

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v9, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->enableExtraStatsCollection:Z

    if-eqz v9, :cond_b

    if-eqz v5, :cond_a

    sget-object v9, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->Companion:Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;

    invoke-virtual {v9, v5}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;->from(Lhms/webrtc/RTCStats;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    if-eqz v6, :cond_b

    sget-object v9, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;->Companion:Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection$Companion;

    invoke-virtual {v9, v6}, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection$Companion;->from(Lhms/webrtc/RTCStats;)Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-boolean v6, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->enableExtraStatsCollection:Z

    const-string v15, "audio"

    const-string v9, "video"

    if-eqz v6, :cond_1d

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lhms/webrtc/RTCStats;

    invoke-virtual {v11}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v11

    const-string v12, "remote-inbound-rtp"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-direct {v8, v10}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryType(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_8

    :cond_c
    move-object/from16 v17, v6

    move-object v7, v9

    const/16 p1, 0x0

    goto/16 :goto_c

    :cond_d
    :goto_8
    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v11, v9

    const-string v9, "packetsLost"

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v7, v16

    const/16 p1, 0x0

    invoke-static/range {v8 .. v13}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryFromStats$default(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Number;

    move-result-object v9

    if-eqz v9, :cond_e

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    new-instance v11, Ljava/lang/Integer;

    invoke-direct {v11, v9}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_9

    :cond_e
    move-object/from16 v11, p1

    :goto_9
    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "jitter"

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v1, v16

    invoke-static/range {v8 .. v13}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryFromStats$default(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Number;

    move-result-object v9

    if-eqz v9, :cond_f

    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v11

    new-instance v9, Ljava/lang/Double;

    invoke-direct {v9, v11, v12}, Ljava/lang/Double;-><init>(D)V

    goto :goto_a

    :cond_f
    move-object/from16 v9, p1

    :goto_a
    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v11, v9

    const-string v9, "ssrc"

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v6

    move-object/from16 v6, v16

    invoke-static/range {v8 .. v13}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryFromStats$default(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Number;

    move-result-object v9

    if-eqz v9, :cond_10

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    new-instance v9, Ljava/lang/Long;

    invoke-direct {v9, v11, v12}, Ljava/lang/Long;-><init>(J)V

    goto :goto_b

    :cond_10
    move-object/from16 v9, p1

    :goto_b
    if-eqz v9, :cond_11

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-eqz v11, :cond_11

    iget-object v11, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    new-instance v12, Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;

    invoke-direct {v12, v9, v1}, Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;-><init>(Ljava/lang/Long;Ljava/lang/Integer;)V

    invoke-interface {v11, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    if-eqz v9, :cond_12

    if-eqz v6, :cond_12

    iget-object v1, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    invoke-interface {v1, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    :goto_c
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RTCStats;

    invoke-virtual {v1}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v6, "outbound-rtp"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_13
    :goto_d
    move-object/from16 v1, p0

    move-object v9, v7

    move-object/from16 v6, v17

    goto/16 :goto_7

    :cond_14
    invoke-direct {v8, v10}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryType(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    iget-object v1, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    invoke-direct {v8, v10, v2, v5, v1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getDataForLocalVideo(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    move-result-object v1

    goto :goto_e

    :cond_15
    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    invoke-direct {v8, v10, v2, v5, v1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getDataForLocalAudio(Ljava/util/Map$Entry;Ljava/util/Map;Lhms/webrtc/RTCStats;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;

    move-result-object v1

    goto :goto_e

    :cond_16
    move-object/from16 v1, p1

    :goto_e
    const-string v6, "_publish"

    const-string v9, ""

    if-eqz v1, :cond_1a

    instance-of v10, v1, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    if-eqz v10, :cond_17

    move-object v10, v1

    check-cast v10, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    invoke-direct {v8, v10}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getUniqueTrackKey(Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_18

    :goto_f
    move-object v10, v9

    goto :goto_10

    :cond_17
    invoke-virtual {v1}, Llive/hms/video/connection/degredation/Track;->getTrackIdentifier()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_18

    goto :goto_f

    :cond_18
    :goto_10
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_19

    goto :goto_11

    :cond_19
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1a
    :goto_11
    if-eqz v1, :cond_13

    invoke-virtual {v1}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getSsrc()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_13

    instance-of v11, v1, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    if-eqz v11, :cond_1c

    check-cast v1, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    invoke-direct {v8, v1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getUniqueTrackKey(Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1b

    goto :goto_12

    :cond_1b
    move-object v9, v1

    goto :goto_12

    :cond_1c
    invoke-virtual {v1}, Llive/hms/video/connection/degredation/Track;->getTrackIdentifier()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1b

    :goto_12
    invoke-virtual {v9, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_1d
    move-object v7, v9

    const/16 p1, 0x0

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1e
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/util/Map$Entry;

    iget-boolean v2, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->enableExtraStatsCollection:Z

    if-eqz v2, :cond_23

    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v5, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    const-string v6, "Extra time to log all stats start"

    invoke-virtual {v2, v5, v6}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhms/webrtc/RTCStats;

    invoke-virtual {v5}, Lhms/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v5

    const-string v6, "inbound-rtp"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-direct {v8, v10}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryType(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-direct {v8, v10, v3}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getDataForVideo(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Video;

    move-result-object v5

    goto :goto_14

    :cond_1f
    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-direct {v8, v10, v3}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getDataForAudio(Ljava/util/Map$Entry;Ljava/util/Map;)Llive/hms/video/connection/degredation/Audio;

    move-result-object v5

    goto :goto_14

    :cond_20
    move-object/from16 v5, p1

    :goto_14
    if-eqz v5, :cond_21

    invoke-virtual {v5}, Llive/hms/video/connection/degredation/RemoteTrack;->getTrackIdentifier()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_21

    const-string v9, "_subscribe"

    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_21
    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "packetsReceived"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryFromStats$default(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Number;

    move-result-object v5

    if-eqz v5, :cond_22

    iget-wide v11, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->totalPackets:J

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    add-long/2addr v5, v11

    iput-wide v5, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->totalPackets:J

    :cond_22
    iget-object v5, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    const-string v6, "Extra time to log all stats end"

    invoke-virtual {v2, v5, v6}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    :cond_23
    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "packetsLost"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getEntryFromStats$default(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Ljava/lang/String;Ljava/util/Map$Entry;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Number;

    move-result-object v2

    if-eqz v2, :cond_1e

    iget-wide v5, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->currentPacketsLost:J

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    add-long/2addr v9, v5

    iput-wide v9, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->currentPacketsLost:J

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Adding to lost packages "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "CheckPacket"

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lhg3/i;->v(I)Ljava/lang/Integer;

    goto/16 :goto_13

    :cond_24
    invoke-direct {v8, v3}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getDataForPeer(Ljava/util/Map;)Llive/hms/video/connection/degredation/Peer;

    move-result-object v1

    if-eqz v1, :cond_25

    sget-object v2, Llive/hms/video/connection/degredation/Peer;->Companion:Llive/hms/video/connection/degredation/Peer$Companion;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Peer$Companion;->getLOCAL_PEER()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_25
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_26
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/connection/degredation/ConnectionInfo;

    instance-of v5, v2, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    if-eqz v5, :cond_27

    sget-object v5, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->Companion:Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;

    invoke-virtual {v5}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;->getPUBLISH_CONNECTION()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15

    :cond_27
    instance-of v5, v2, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;

    if-eqz v5, :cond_26

    sget-object v5, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;->Companion:Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection$Companion;

    invoke-virtual {v5}, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection$Companion;->getSUBSCRIBE_CONNECTION()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15

    :cond_28
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    sget-object v2, Llive/hms/video/utils/HMSLogger$LogFiles;->STATISTICS:Llive/hms/video/utils/HMSLogger$LogFiles;

    iget-object v5, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    invoke-virtual {v1, v2, v5, v3}, Llive/hms/video/utils/HMSLogger;->logFile$lib_release(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v2, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->TAG:Ljava/lang/String;

    const-string v3, "Stop"

    invoke-virtual {v1, v2, v3}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Returning bundle with lost: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;

    invoke-virtual {v5}, Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;->getPacketLoss()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_29
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CheckPacketP"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2a
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/connection/degredation/WebrtcStats;

    if-eqz v3, :cond_2a

    instance-of v4, v3, Llive/hms/video/connection/degredation/Track$LocalTrack;

    if-eqz v4, :cond_2a

    check-cast v3, Llive/hms/video/connection/degredation/Track$LocalTrack;

    invoke-virtual {v3}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getPacketLoss()J

    move-result-wide v4

    iget-object v6, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;

    if-eqz v2, :cond_2b

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;->getPacketLoss()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2b

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v6, v2

    goto :goto_18

    :cond_2b
    const-wide/16 v6, 0x0

    :goto_18
    add-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Llive/hms/video/connection/degredation/Track$LocalTrack;->setPacketLoss(J)V

    goto :goto_17

    :cond_2c
    new-instance v9, Llive/hms/video/connection/degredation/StatsBundle;

    iget-wide v10, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->currentPacketsLost:J

    iget-wide v13, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->totalPackets:J

    iget-object v15, v8, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    move-object v12, v0

    invoke-direct/range {v9 .. v15}, Llive/hms/video/connection/degredation/StatsBundle;-><init>(JLjava/util/Map;JLjava/util/Map;)V

    return-object v9

    :goto_19
    return-object p1
.end method

.method private static final statsSamplingManager_delegate$lambda$0(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;)Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    iget-object v5, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->applicationContext:Landroid/content/Context;

    iget-object v6, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v1 .. v6}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;-><init>(JLlive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method


# virtual methods
.method public final allowExtraStatsCollection(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->enableExtraStatsCollection:Z

    iput-boolean p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->collectStatsSafe:Z

    return-void
.end method

.method public final forcePublishStats()V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getStatsSamplingManager()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->shouldPublishStats(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method public final getCurrentPacketsLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->currentPacketsLost:J

    return-wide v0
.end method

.method public getFlow()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->statsFlow:Lec3/t1;

    return-object v0
.end method

.method public final getGetPeerFromVideoTrackID()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getPeerFromVideoTrackID:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getLocalTracksJitter()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    return-object v0
.end method

.method public final getPacketLossTracks()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    return-object v0
.end method

.method public final getTotalPackets()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->totalPackets:J

    return-wide v0
.end method

.method public final isTransportConnected()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->isTransportConnected:Z

    return v0
.end method

.method public final reset()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->currentPacketsLost:J

    iput-wide v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->totalPackets:J

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    return-void
.end method

.method public final setCurrentPacketsLost(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->currentPacketsLost:J

    return-void
.end method

.method public final setLocalTracksJitter(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->localTracksJitter:Ljava/util/Map;

    return-void
.end method

.method public final setPacketLossTracks(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->packetLossTracks:Ljava/util/Map;

    return-void
.end method

.method public final setPublishSubscriberStatsConfig(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->getStatsSamplingManager()Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->setConfig(ZLlive/hms/video/signal/init/Stats;ZLlive/hms/video/signal/init/Stats;)V

    return-void
.end method

.method public final setTotalPackets(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->totalPackets:J

    return-void
.end method

.method public final setTransportConnected(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->isTransportConnected:Z

    return-void
.end method

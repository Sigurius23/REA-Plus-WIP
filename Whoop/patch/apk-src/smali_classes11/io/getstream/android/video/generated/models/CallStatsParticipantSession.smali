.class public final Lio/getstream/android/video/generated/models/CallStatsParticipantSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008E\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010*J\u0012\u00102\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010*J\u0012\u00104\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010$J\u0012\u00109\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00100J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010$J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010$J\u0012\u0010<\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0092\u0002\u0010>\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00062\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u0010\u0010@\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008@\u0010$J\u0010\u0010A\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008A\u0010BJ\u001a\u0010D\u001a\u00020\u00022\u0008\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008D\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010F\u001a\u0004\u0008\u0003\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010G\u001a\u0004\u0008H\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010I\u001a\u0004\u0008J\u0010&R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010G\u001a\u0004\u0008K\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010G\u001a\u0004\u0008L\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010M\u001a\u0004\u0008N\u0010*R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010G\u001a\u0004\u0008O\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010G\u001a\u0004\u0008P\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010Q\u001a\u0004\u0008R\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010S\u001a\u0004\u0008T\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010M\u001a\u0004\u0008U\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010G\u001a\u0004\u0008V\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010M\u001a\u0004\u0008W\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010M\u001a\u0004\u0008X\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010G\u001a\u0004\u0008Y\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010G\u001a\u0004\u0008Z\u0010$R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010G\u001a\u0004\u0008[\u0010$R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010G\u001a\u0004\u0008\\\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010S\u001a\u0004\u0008]\u00100R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010G\u001a\u0004\u0008^\u0010$R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010G\u001a\u0004\u0008_\u0010$R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010`\u001a\u0004\u0008a\u0010=\u00a8\u0006b"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallStatsParticipantSession;",
        "",
        "",
        "isLive",
        "",
        "userSessionId",
        "Lio/getstream/android/video/generated/models/PublishedTrackFlags;",
        "publishedTracks",
        "browser",
        "browserVersion",
        "",
        "cqScore",
        "currentIp",
        "currentSfu",
        "",
        "distanceToSfuKilometers",
        "Ljg3/i;",
        "endedAt",
        "freezesDurationMs",
        "ingress",
        "jitterMs",
        "latencyMs",
        "os",
        "publisherType",
        "sdk",
        "sdkVersion",
        "startedAt",
        "unifiedSessionId",
        "webrtcVersion",
        "Lio/getstream/android/video/generated/models/CallStatsLocation;",
        "location",
        "<init>",
        "(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lio/getstream/android/video/generated/models/PublishedTrackFlags;",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Float;",
        "component10",
        "()Ljg3/i;",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "()Lio/getstream/android/video/generated/models/CallStatsLocation;",
        "copy",
        "(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)Lio/getstream/android/video/generated/models/CallStatsParticipantSession;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "Ljava/lang/String;",
        "getUserSessionId",
        "Lio/getstream/android/video/generated/models/PublishedTrackFlags;",
        "getPublishedTracks",
        "getBrowser",
        "getBrowserVersion",
        "Ljava/lang/Integer;",
        "getCqScore",
        "getCurrentIp",
        "getCurrentSfu",
        "Ljava/lang/Float;",
        "getDistanceToSfuKilometers",
        "Ljg3/i;",
        "getEndedAt",
        "getFreezesDurationMs",
        "getIngress",
        "getJitterMs",
        "getLatencyMs",
        "getOs",
        "getPublisherType",
        "getSdk",
        "getSdkVersion",
        "getStartedAt",
        "getUnifiedSessionId",
        "getWebrtcVersion",
        "Lio/getstream/android/video/generated/models/CallStatsLocation;",
        "getLocation",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final browser:Ljava/lang/String;

.field private final browserVersion:Ljava/lang/String;

.field private final cqScore:Ljava/lang/Integer;

.field private final currentIp:Ljava/lang/String;

.field private final currentSfu:Ljava/lang/String;

.field private final distanceToSfuKilometers:Ljava/lang/Float;

.field private final endedAt:Ljg3/i;

.field private final freezesDurationMs:Ljava/lang/Integer;

.field private final ingress:Ljava/lang/String;

.field private final isLive:Z

.field private final jitterMs:Ljava/lang/Integer;

.field private final latencyMs:Ljava/lang/Integer;

.field private final location:Lio/getstream/android/video/generated/models/CallStatsLocation;

.field private final os:Ljava/lang/String;

.field private final publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

.field private final publisherType:Ljava/lang/String;

.field private final sdk:Ljava/lang/String;

.field private final sdkVersion:Ljava/lang/String;

.field private final startedAt:Ljg3/i;

.field private final unifiedSessionId:Ljava/lang/String;

.field private final userSessionId:Ljava/lang/String;

.field private final webrtcVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "is_live"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/PublishedTrackFlags;
        .annotation runtime Lqx/q;
            name = "published_tracks"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "browser"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "browser_version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "cq_score"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "current_ip"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "current_sfu"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "distance_to_sfu_kilometers"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "freezes_duration_ms"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "ingress"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "jitter_ms"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "latency_ms"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "os"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "publisher_type"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk_version"
        .end annotation
    .end param
    .param p19    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "started_at"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "unified_session_id"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "webrtc_version"
        .end annotation
    .end param
    .param p22    # Lio/getstream/android/video/generated/models/CallStatsLocation;
        .annotation runtime Lqx/q;
            name = "location"
        .end annotation
    .end param

    const-string v0, "userSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishedTracks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    .line 12
    iput-object p11, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    .line 13
    iput-object p12, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    .line 15
    iput-object p14, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move-object/from16 v17, v2

    goto :goto_a

    :cond_a
    move-object/from16 v17, p14

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_b

    move-object/from16 v18, v2

    goto :goto_b

    :cond_b
    move-object/from16 v18, p15

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v19, v2

    goto :goto_c

    :cond_c
    move-object/from16 v19, p16

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v20, v2

    goto :goto_d

    :cond_d
    move-object/from16 v20, p17

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v21, v2

    goto :goto_e

    :cond_e
    move-object/from16 v21, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v22, v2

    goto :goto_f

    :cond_f
    move-object/from16 v22, p19

    :goto_f
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v23, v2

    goto :goto_10

    :cond_10
    move-object/from16 v23, p20

    :goto_10
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v24, v2

    goto :goto_11

    :cond_11
    move-object/from16 v24, p21

    :goto_11
    const/high16 v1, 0x200000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    move-object/from16 v25, v2

    :goto_12
    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    goto :goto_13

    :cond_12
    move-object/from16 v25, p22

    goto :goto_12

    .line 24
    :goto_13
    invoke-direct/range {v3 .. v25}, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;-><init>(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallStatsParticipantSession;ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallStatsParticipantSession;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->copy(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)Lio/getstream/android/video/generated/models/CallStatsParticipantSession;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    return v0
.end method

.method public final component10()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Lio/getstream/android/video/generated/models/CallStatsLocation;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/PublishedTrackFlags;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)Lio/getstream/android/video/generated/models/CallStatsParticipantSession;
    .locals 24
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "is_live"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/PublishedTrackFlags;
        .annotation runtime Lqx/q;
            name = "published_tracks"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "browser"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "browser_version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "cq_score"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "current_ip"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "current_sfu"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "distance_to_sfu_kilometers"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "freezes_duration_ms"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "ingress"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "jitter_ms"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "latency_ms"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "os"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "publisher_type"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk_version"
        .end annotation
    .end param
    .param p19    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "started_at"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "unified_session_id"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "webrtc_version"
        .end annotation
    .end param
    .param p22    # Lio/getstream/android/video/generated/models/CallStatsLocation;
        .annotation runtime Lqx/q;
            name = "location"
        .end annotation
    .end param

    const-string v0, "userSessionId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishedTracks"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;

    move/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    invoke-direct/range {v1 .. v23}, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;-><init>(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getBrowser()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    return-object v0
.end method

.method public final getBrowserVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getCqScore()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCurrentIp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrentSfu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    return-object v0
.end method

.method public final getDistanceToSfuKilometers()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    return-object v0
.end method

.method public final getEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final getFreezesDurationMs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getIngress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    return-object v0
.end method

.method public final getJitterMs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getLatencyMs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getLocation()Lio/getstream/android/video/generated/models/CallStatsLocation;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    return-object v0
.end method

.method public final getOs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishedTracks()Lio/getstream/android/video/generated/models/PublishedTrackFlags;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    return-object v0
.end method

.method public final getPublisherType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    return-object v0
.end method

.method public final getUnifiedSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebrtcVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    if-nez v0, :cond_8

    move v0, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_8
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    if-nez v0, :cond_9

    move v0, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_9
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    if-nez v0, :cond_a

    move v0, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_a
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    if-nez v0, :cond_b

    move v0, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_b
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    if-nez v0, :cond_c

    move v0, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_c
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    if-nez v0, :cond_d

    move v0, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_d
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    if-nez v0, :cond_e

    move v0, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_e
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    if-nez v0, :cond_f

    move v0, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_f
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    if-nez v0, :cond_10

    move v0, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_10
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    if-nez v0, :cond_11

    move v0, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_11
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    if-nez v0, :cond_12

    goto :goto_12

    :cond_12
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallStatsLocation;->hashCode()I

    move-result v3

    :goto_12
    add-int/2addr v2, v3

    return v2
.end method

.method public final isLive()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->isLive:Z

    iget-object v2, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->userSessionId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publishedTracks:Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browser:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->browserVersion:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->cqScore:Ljava/lang/Integer;

    iget-object v7, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentIp:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->currentSfu:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->distanceToSfuKilometers:Ljava/lang/Float;

    iget-object v10, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->endedAt:Ljg3/i;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->freezesDurationMs:Ljava/lang/Integer;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->ingress:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->jitterMs:Ljava/lang/Integer;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->latencyMs:Ljava/lang/Integer;

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->os:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->publisherType:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdk:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->sdkVersion:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->startedAt:Ljg3/i;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->unifiedSessionId:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->webrtcVersion:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallStatsParticipantSession;->location:Lio/getstream/android/video/generated/models/CallStatsLocation;

    const-string v0, ", userSessionId="

    move-object/from16 v23, v15

    const-string v15, ", publishedTracks="

    move-object/from16 v24, v13

    const-string v13, "CallStatsParticipantSession(isLive="

    invoke-static {v13, v0, v2, v15, v1}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", browser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", browserVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cqScore="

    const-string v2, ", currentIp="

    invoke-static {v6, v5, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", currentSfu="

    const-string v2, ", distanceToSfuKilometers="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", freezesDurationMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ingress="

    const-string v2, ", jitterMs="

    invoke-static {v11, v1, v12, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", latencyMs="

    const-string v2, ", os="

    move-object/from16 v3, v24

    invoke-static {v0, v3, v1, v14, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", publisherType="

    const-string v2, ", sdk="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", sdkVersion="

    const-string v2, ", startedAt="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unifiedSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", webrtcVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

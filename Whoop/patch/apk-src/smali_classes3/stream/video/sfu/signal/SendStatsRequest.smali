.class public final Lstream/video/sfu/signal/SendStatsRequest;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/signal/SendStatsRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008*\u0018\u0000 Q2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QB\u00dd\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u00e3\u0001\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00080\u0010,R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00081\u0010,R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00082\u0010,R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00083\u0010,R\u001a\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00084\u0010,R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00085\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u00108R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u00089\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008;\u0010<R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010=\u001a\u0004\u0008>\u0010?R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010@\u001a\u0004\u0008A\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010C\u001a\u0004\u0008D\u0010ER \u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010/\u0012\u0004\u0008G\u0010H\u001a\u0004\u0008F\u0010,R \u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010/\u0012\u0004\u0008J\u0010H\u001a\u0004\u0008I\u0010,R\u001a\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010/\u001a\u0004\u0008K\u0010,R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010/\u001a\u0004\u0008L\u0010,R \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010M\u001a\u0004\u0008N\u0010OR \u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010M\u001a\u0004\u0008P\u0010O\u00a8\u0006R"
    }
    d2 = {
        "Lstream/video/sfu/signal/SendStatsRequest;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "session_id",
        "subscriber_stats",
        "publisher_stats",
        "webrtc_version",
        "sdk",
        "sdk_version",
        "Lstream/video/sfu/models/InputDevices;",
        "audio_devices",
        "video_devices",
        "Lstream/video/sfu/models/AndroidState;",
        "android",
        "Lstream/video/sfu/models/AppleState;",
        "apple",
        "Lstream/video/sfu/signal/Telemetry;",
        "telemetry",
        "Lstream/video/sfu/models/RTMPIngress;",
        "rtmp",
        "subscriber_rtc_stats",
        "publisher_rtc_stats",
        "rtc_stats",
        "",
        "Lstream/video/sfu/models/PerformanceStats;",
        "encode_stats",
        "decode_stats",
        "unified_session_id",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/signal/SendStatsRequest;",
        "Ljava/lang/String;",
        "getSession_id",
        "getSubscriber_stats",
        "getPublisher_stats",
        "getWebrtc_version",
        "getSdk",
        "getSdk_version",
        "Lstream/video/sfu/models/InputDevices;",
        "getAudio_devices",
        "()Lstream/video/sfu/models/InputDevices;",
        "getVideo_devices",
        "Lstream/video/sfu/models/AndroidState;",
        "getAndroid",
        "()Lstream/video/sfu/models/AndroidState;",
        "Lstream/video/sfu/models/AppleState;",
        "getApple",
        "()Lstream/video/sfu/models/AppleState;",
        "Lstream/video/sfu/signal/Telemetry;",
        "getTelemetry",
        "()Lstream/video/sfu/signal/Telemetry;",
        "Lstream/video/sfu/models/RTMPIngress;",
        "getRtmp",
        "()Lstream/video/sfu/models/RTMPIngress;",
        "getSubscriber_rtc_stats",
        "getSubscriber_rtc_stats$annotations",
        "()V",
        "getPublisher_rtc_stats",
        "getPublisher_rtc_stats$annotations",
        "getRtc_stats",
        "getUnified_session_id",
        "Ljava/util/List;",
        "getEncode_stats",
        "()Ljava/util/List;",
        "getDecode_stats",
        "Companion",
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


# static fields
.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final Companion:Lstream/video/sfu/signal/SendStatsRequest$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final android:Lstream/video/sfu/models/AndroidState;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.AndroidState#ADAPTER"
        oneofName = "device_state"
        schemaIndex = 0x8
        tag = 0x9
    .end annotation
.end field

.field private final apple:Lstream/video/sfu/models/AppleState;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.AppleState#ADAPTER"
        oneofName = "device_state"
        schemaIndex = 0x9
        tag = 0xa
    .end annotation
.end field

.field private final audio_devices:Lstream/video/sfu/models/InputDevices;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.InputDevices#ADAPTER"
        jsonName = "audioDevices"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x6
        tag = 0x7
    .end annotation
.end field

.field private final decode_stats:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.PerformanceStats#ADAPTER"
        jsonName = "decodeStats"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        schemaIndex = 0x10
        tag = 0x11
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;"
        }
    .end annotation
.end field

.field private final encode_stats:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.PerformanceStats#ADAPTER"
        jsonName = "encodeStats"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        schemaIndex = 0xf
        tag = 0x10
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;"
        }
    .end annotation
.end field

.field private final publisher_rtc_stats:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "publisherRtcStats"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0xd
        tag = 0xe
    .end annotation
.end field

.field private final publisher_stats:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "publisherStats"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x2
        tag = 0x3
    .end annotation
.end field

.field private final rtc_stats:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "rtcStats"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0xe
        tag = 0xf
    .end annotation
.end field

.field private final rtmp:Lstream/video/sfu/models/RTMPIngress;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.RTMPIngress#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0xb
        tag = 0xc
    .end annotation
.end field

.field private final sdk:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x4
        tag = 0x5
    .end annotation
.end field

.field private final sdk_version:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "sdkVersion"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x5
        tag = 0x6
    .end annotation
.end field

.field private final session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "sessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x0
        tag = 0x1
    .end annotation
.end field

.field private final subscriber_rtc_stats:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "subscriberRtcStats"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0xc
        tag = 0xd
    .end annotation
.end field

.field private final subscriber_stats:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "subscriberStats"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x1
        tag = 0x2
    .end annotation
.end field

.field private final telemetry:Lstream/video/sfu/signal/Telemetry;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.signal.Telemetry#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0xa
        tag = 0xb
    .end annotation
.end field

.field private final unified_session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "unifiedSessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x11
        tag = 0x12
    .end annotation
.end field

.field private final video_devices:Lstream/video/sfu/models/InputDevices;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.InputDevices#ADAPTER"
        jsonName = "videoDevices"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x7
        tag = 0x8
    .end annotation
.end field

.field private final webrtc_version:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "webrtcVersion"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x3
        tag = 0x4
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/signal/SendStatsRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/signal/SendStatsRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/signal/SendStatsRequest;->Companion:Lstream/video/sfu/signal/SendStatsRequest$Companion;

    const-class v0, Lstream/video/sfu/signal/SendStatsRequest;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/signal/SendStatsRequest$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/signal/SendStatsRequest;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 22

    .line 1
    const v20, 0x7ffff

    const/16 v21, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lstream/video/sfu/signal/SendStatsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/InputDevices;",
            "Lstream/video/sfu/models/InputDevices;",
            "Lstream/video/sfu/models/AndroidState;",
            "Lstream/video/sfu/models/AppleState;",
            "Lstream/video/sfu/signal/Telemetry;",
            "Lstream/video/sfu/models/RTMPIngress;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;",
            "Ljava/lang/String;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p9

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    move-object/from16 v12, p16

    move-object/from16 v13, p17

    move-object/from16 v14, p18

    move-object/from16 v15, p19

    const-string v8, "session_id"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "subscriber_stats"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "publisher_stats"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "webrtc_version"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "sdk"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "sdk_version"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "subscriber_rtc_stats"

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "publisher_rtc_stats"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "rtc_stats"

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "encode_stats"

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v8

    const-string v8, "decode_stats"

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v8

    const-string v8, "unified_session_id"

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "unknownFields"

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v8, Lstream/video/sfu/signal/SendStatsRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {v0, v8, v15}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 6
    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    .line 7
    iput-object v2, v0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    .line 8
    iput-object v3, v0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    .line 9
    iput-object v4, v0, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    .line 10
    iput-object v5, v0, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    .line 11
    iput-object v6, v0, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    move-object/from16 v1, p7

    .line 12
    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    move-object/from16 v1, p8

    .line 13
    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    .line 14
    iput-object v7, v0, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    move-object/from16 v8, p10

    .line 15
    iput-object v8, v0, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    move-object/from16 v1, p11

    .line 16
    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    move-object/from16 v1, p12

    .line 17
    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    .line 18
    iput-object v9, v0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    .line 19
    iput-object v10, v0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    .line 20
    iput-object v11, v0, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    .line 21
    iput-object v14, v0, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    move-object/from16 v1, v16

    .line 22
    invoke-static {v1, v12}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    move-object/from16 v1, v17

    .line 23
    invoke-static {v1, v13}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v7, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v8, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v3, v1

    if-gt v3, v2, :cond_2

    return-void

    .line 24
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "At most one of android, apple may be non-null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    .line 2
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    move-object v8, v9

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v9

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move-object v11, v9

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    move-object v12, v9

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    move-object v13, v9

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move-object/from16 v9, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    move-object v15, v2

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    move-object v1, v2

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    sget-object v17, Lm83/y;->w:Lm83/y;

    if-eqz v16, :cond_f

    move-object/from16 v16, v17

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    goto :goto_11

    :cond_11
    move-object/from16 v2, p18

    :goto_11
    const/high16 v18, 0x40000

    and-int v0, v0, v18

    if-eqz v0, :cond_12

    .line 3
    sget-object v0, Lne3/l;->E:Lne3/l;

    move-object/from16 p20, v0

    :goto_12
    move-object/from16 p2, p1

    move-object/from16 p16, v1

    move-object/from16 p19, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p13, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p1, p0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    .line 4
    :goto_13
    invoke-direct/range {p1 .. p20}, Lstream/video/sfu/signal/SendStatsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/signal/SendStatsRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/signal/SendStatsRequest;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    invoke-virtual {v0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v16

    move-object/from16 p20, v16

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, v1

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

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lstream/video/sfu/signal/SendStatsRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/signal/SendStatsRequest;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getPublisher_rtc_stats$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getSubscriber_rtc_stats$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/signal/SendStatsRequest;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/InputDevices;",
            "Lstream/video/sfu/models/InputDevices;",
            "Lstream/video/sfu/models/AndroidState;",
            "Lstream/video/sfu/models/AppleState;",
            "Lstream/video/sfu/signal/Telemetry;",
            "Lstream/video/sfu/models/RTMPIngress;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;",
            "Ljava/lang/String;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/signal/SendStatsRequest;"
        }
    .end annotation

    const-string v0, "session_id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriber_stats"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publisher_stats"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webrtc_version"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdk"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdk_version"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriber_rtc_stats"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publisher_rtc_stats"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtc_stats"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encode_stats"

    move-object/from16 v8, p16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decode_stats"

    move-object/from16 v9, p17

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unified_session_id"

    move-object/from16 v10, p18

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v11, p19

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/signal/SendStatsRequest;

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v20}, Lstream/video/sfu/signal/SendStatsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/InputDevices;Lstream/video/sfu/models/AndroidState;Lstream/video/sfu/models/AppleState;Lstream/video/sfu/signal/Telemetry;Lstream/video/sfu/models/RTMPIngress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/signal/SendStatsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/signal/SendStatsRequest;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    iget-object p1, p1, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAndroid()Lstream/video/sfu/models/AndroidState;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    return-object v0
.end method

.method public final getApple()Lstream/video/sfu/models/AppleState;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    return-object v0
.end method

.method public final getAudio_devices()Lstream/video/sfu/models/InputDevices;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    return-object v0
.end method

.method public final getDecode_stats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    return-object v0
.end method

.method public final getEncode_stats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PerformanceStats;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    return-object v0
.end method

.method public final getPublisher_rtc_stats()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublisher_stats()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    return-object v0
.end method

.method public final getRtc_stats()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    return-object v0
.end method

.method public final getRtmp()Lstream/video/sfu/models/RTMPIngress;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    return-object v0
.end method

.method public final getSdk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdk_version()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    return-object v0
.end method

.method public final getSession_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubscriber_rtc_stats()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubscriber_stats()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    return-object v0
.end method

.method public final getTelemetry()Lstream/video/sfu/signal/Telemetry;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    return-object v0
.end method

.method public final getUnified_session_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideo_devices()Lstream/video/sfu/models/InputDevices;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    return-object v0
.end method

.method public final getWebrtc_version()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/InputDevices;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lstream/video/sfu/models/InputDevices;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lstream/video/sfu/models/AndroidState;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lstream/video/sfu/models/AppleState;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lstream/video/sfu/signal/Telemetry;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v3

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lstream/video/sfu/models/RTMPIngress;->hashCode()I

    move-result v3

    :cond_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_6
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/signal/SendStatsRequest;->newBuilder()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/j;

    return-object v0
.end method

.method public synthetic newBuilder()Ljava/lang/Void;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->session_id:Ljava/lang/String;

    const-string v2, "session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_stats:Ljava/lang/String;

    const-string v2, "subscriber_stats="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_stats:Ljava/lang/String;

    const-string v2, "publisher_stats="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->webrtc_version:Ljava/lang/String;

    const-string v2, "webrtc_version="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk:Ljava/lang/String;

    const-string v2, "sdk="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->sdk_version:Ljava/lang/String;

    const-string v2, "sdk_version="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->audio_devices:Lstream/video/sfu/models/InputDevices;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "audio_devices="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->video_devices:Lstream/video/sfu/models/InputDevices;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "video_devices="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->android:Lstream/video/sfu/models/AndroidState;

    if-eqz v1, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->apple:Lstream/video/sfu/models/AppleState;

    if-eqz v1, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "apple="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->telemetry:Lstream/video/sfu/signal/Telemetry;

    if-eqz v1, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "telemetry="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtmp:Lstream/video/sfu/models/RTMPIngress;

    if-eqz v1, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "rtmp="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->subscriber_rtc_stats:Ljava/lang/String;

    const-string v2, "subscriber_rtc_stats="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->publisher_rtc_stats:Ljava/lang/String;

    const-string v2, "publisher_rtc_stats="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->rtc_stats:Ljava/lang/String;

    const-string v2, "rtc_stats="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->encode_stats:Ljava/util/List;

    const-string v2, "encode_stats="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->decode_stats:Ljava/util/List;

    const-string v2, "decode_stats="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/signal/SendStatsRequest;->unified_session_id:Ljava/lang/String;

    const-string v2, "unified_session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "SendStatsRequest{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

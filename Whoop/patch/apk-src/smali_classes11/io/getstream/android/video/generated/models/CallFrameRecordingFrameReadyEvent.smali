.class public final Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0003\u0012\u0014\u0008\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0013J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0013Jv\u0010 \u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\u00032\u0008\u0008\u0003\u0010\n\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u00032\u0014\u0008\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0013J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008,\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008/\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u00080\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010+\u001a\u0004\u00081\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010+\u001a\u0004\u00082\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010+\u001a\u0004\u00083\u0010\u0013R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00104\u001a\u0004\u00085\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010+\u001a\u0004\u00086\u0010\u0013\u00a8\u00067"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "capturedAt",
        "createdAt",
        "egressId",
        "sessionId",
        "trackType",
        "url",
        "",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "users",
        "type",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCapturedAt",
        "getCreatedAt",
        "getEgressId",
        "getSessionId",
        "getTrackType",
        "getUrl",
        "Ljava/util/Map;",
        "getUsers",
        "getType",
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
.field private final callCid:Ljava/lang/String;

.field private final capturedAt:Ljg3/i;

.field private final createdAt:Ljg3/i;

.field private final egressId:Ljava/lang/String;

.field private final sessionId:Ljava/lang/String;

.field private final trackType:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final url:Ljava/lang/String;

.field private final users:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "captured_at"
        .end annotation
    .end param
    .param p3    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "egress_id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_type"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "url"
        .end annotation
    .end param
    .param p8    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "users"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capturedAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "egressId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "users"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    .line 10
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    .line 11
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    .line 12
    iput-object p9, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 1
    sget-object v0, Lm83/z;->w:Lm83/z;

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {v1 .. v10}, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->copy(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "captured_at"
        .end annotation
    .end param
    .param p3    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "egress_id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_type"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "url"
        .end annotation
    .end param
    .param p8    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "users"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capturedAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "egressId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackType"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "users"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCapturedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getEgressId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->capturedAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->createdAt:Ljg3/i;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->egressId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->sessionId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->trackType:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->url:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->users:Ljava/util/Map;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;->type:Ljava/lang/String;

    const-string v9, ", capturedAt="

    const-string v10, ", createdAt="

    const-string v11, "CallFrameRecordingFrameReadyEvent(callCid="

    invoke-static {v11, v1, v0, v9, v10}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", egressId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trackType="

    const-string v2, ", url="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", users="

    const-string v2, ", type="

    invoke-static {v0, v6, v1, v7, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

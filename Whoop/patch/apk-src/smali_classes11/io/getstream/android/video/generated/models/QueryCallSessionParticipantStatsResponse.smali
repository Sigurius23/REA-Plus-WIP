.class public final Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0008\u0003\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0017J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0017J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u00a0\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0003\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0003\u0010\u000b\u001a\u00020\n2\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0017J\u0010\u0010*\u001a\u00020)H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00083\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00084\u0010\u0017R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00088\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00109\u001a\u0004\u0008:\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00109\u001a\u0004\u0008;\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00100\u001a\u0004\u0008<\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00100\u001a\u0004\u0008=\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00100\u001a\u0004\u0008>\u0010\u0017R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u00105\u001a\u0004\u0008?\u0010\u001c\u00a8\u0006@"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;",
        "",
        "",
        "callId",
        "callSessionId",
        "callType",
        "duration",
        "",
        "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
        "participants",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "counts",
        "Ljg3/i;",
        "callEndedAt",
        "callStartedAt",
        "next",
        "prev",
        "tmpDataSource",
        "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
        "callEvents",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "component7",
        "()Ljg3/i;",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallId",
        "getCallSessionId",
        "getCallType",
        "getDuration",
        "Ljava/util/List;",
        "getParticipants",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "getCounts",
        "Ljg3/i;",
        "getCallEndedAt",
        "getCallStartedAt",
        "getNext",
        "getPrev",
        "getTmpDataSource",
        "getCallEvents",
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
.field private final callEndedAt:Ljg3/i;

.field private final callEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
            ">;"
        }
    .end annotation
.end field

.field private final callId:Ljava/lang/String;

.field private final callSessionId:Ljava/lang/String;

.field private final callStartedAt:Ljg3/i;

.field private final callType:Ljava/lang/String;

.field private final counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

.field private final duration:Ljava/lang/String;

.field private final next:Ljava/lang/String;

.field private final participants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final prev:Ljava/lang/String;

.field private final tmpDataSource:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_type"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_ended_at"
        .end annotation
    .end param
    .param p8    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_started_at"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "next"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "prev"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "tmp_data_source"
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "call_events"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x10

    .line 14
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x40

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v10, v3

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    move-object v11, v3

    goto :goto_2

    :cond_2
    move-object/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    move-object v12, v3

    goto :goto_3

    :cond_3
    move-object/from16 v12, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v13, v3

    goto :goto_4

    :cond_4
    move-object/from16 v13, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v14, v3

    goto :goto_5

    :cond_5
    move-object/from16 v14, p11

    :goto_5
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_6

    move-object v15, v2

    :goto_6
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p6

    goto :goto_7

    :cond_6
    move-object/from16 v15, p12

    goto :goto_6

    :goto_7
    invoke-direct/range {v3 .. v15}, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final component7()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final component8()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_type"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_ended_at"
        .end annotation
    .end param
    .param p8    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_started_at"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "next"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "prev"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "tmp_data_source"
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "call_events"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
            ">;)",
            "Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;"
        }
    .end annotation

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;

    move-object v2, p1

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCallEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCallEvents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    return-object v0
.end method

.method public final getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCallType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCounts()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final getPrev()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final getTmpDataSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callSessionId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->duration:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->participants:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEndedAt:Ljg3/i;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callStartedAt:Ljg3/i;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->next:Ljava/lang/String;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->prev:Ljava/lang/String;

    iget-object v10, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->tmpDataSource:Ljava/lang/String;

    iget-object v11, p0, Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;->callEvents:Ljava/util/List;

    const-string v12, ", callSessionId="

    const-string v13, ", callType="

    const-string v14, "QueryCallSessionParticipantStatsResponse(callId="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    const-string v12, ", participants="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", counts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callEndedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callStartedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", next="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", prev="

    const-string v2, ", tmpDataSource="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", callEvents="

    const-string v2, ")"

    invoke-static {v10, v1, v2, v0, v11}, Lq63/c;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

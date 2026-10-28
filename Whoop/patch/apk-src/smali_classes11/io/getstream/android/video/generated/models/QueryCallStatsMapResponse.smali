.class public final Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u00ae\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\u0019J\u0010\u00100\u001a\u00020/H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00088\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00089\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010;\u001a\u0004\u0008<\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010=\u001a\u0004\u0008>\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010=\u001a\u0004\u0008?\u0010 R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u0008@\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008A\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008B\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010=\u001a\u0004\u0008C\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010D\u001a\u0004\u0008E\u0010\'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010F\u001a\u0004\u0008G\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010H\u001a\u0004\u0008I\u0010+\u00a8\u0006J"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;",
        "",
        "",
        "callId",
        "callSessionId",
        "callType",
        "duration",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "counts",
        "Ljg3/i;",
        "callEndedAt",
        "callStartedAt",
        "dataSource",
        "endTime",
        "generatedAt",
        "startTime",
        "Lio/getstream/android/video/generated/models/CallStatsMapPublishers;",
        "publishers",
        "Lio/getstream/android/video/generated/models/CallStatsMapSFUs;",
        "sfus",
        "Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;",
        "subscribers",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "component6",
        "()Ljg3/i;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lio/getstream/android/video/generated/models/CallStatsMapPublishers;",
        "component13",
        "()Lio/getstream/android/video/generated/models/CallStatsMapSFUs;",
        "component14",
        "()Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;",
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
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "getCounts",
        "Ljg3/i;",
        "getCallEndedAt",
        "getCallStartedAt",
        "getDataSource",
        "getEndTime",
        "getGeneratedAt",
        "getStartTime",
        "Lio/getstream/android/video/generated/models/CallStatsMapPublishers;",
        "getPublishers",
        "Lio/getstream/android/video/generated/models/CallStatsMapSFUs;",
        "getSfus",
        "Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;",
        "getSubscribers",
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

.field private final callId:Ljava/lang/String;

.field private final callSessionId:Ljava/lang/String;

.field private final callStartedAt:Ljg3/i;

.field private final callType:Ljava/lang/String;

.field private final counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

.field private final dataSource:Ljava/lang/String;

.field private final duration:Ljava/lang/String;

.field private final endTime:Ljg3/i;

.field private final generatedAt:Ljg3/i;

.field private final publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

.field private final sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

.field private final startTime:Ljg3/i;

.field private final subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)V
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
    .param p5    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_ended_at"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_started_at"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "data_source"
        .end annotation
    .end param
    .param p9    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "end_time"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "generated_at"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "start_time"
        .end annotation
    .end param
    .param p12    # Lio/getstream/android/video/generated/models/CallStatsMapPublishers;
        .annotation runtime Lqx/q;
            name = "publishers"
        .end annotation
    .end param
    .param p13    # Lio/getstream/android/video/generated/models/CallStatsMapSFUs;
        .annotation runtime Lqx/q;
            name = "sfus"
        .end annotation
    .end param
    .param p14    # Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;
        .annotation runtime Lqx/q;
            name = "subscribers"
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    .line 12
    iput-object p11, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    .line 13
    iput-object p12, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    .line 14
    iput-object p13, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    .line 15
    iput-object p14, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    move-object v12, v2

    goto :goto_3

    :cond_3
    move-object/from16 v12, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v14, v2

    goto :goto_5

    :cond_5
    move-object/from16 v14, p11

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object v15, v2

    goto :goto_6

    :cond_6
    move-object/from16 v15, p12

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object/from16 v16, v2

    goto :goto_7

    :cond_7
    move-object/from16 v16, p13

    :goto_7
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_8

    move-object/from16 v17, v2

    :goto_8
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    goto :goto_9

    :cond_8
    move-object/from16 v17, p14

    goto :goto_8

    .line 16
    :goto_9
    invoke-direct/range {v3 .. v17}, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    return-object v0
.end method

.method public final component11()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    return-object v0
.end method

.method public final component12()Lio/getstream/android/video/generated/models/CallStatsMapPublishers;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    return-object v0
.end method

.method public final component13()Lio/getstream/android/video/generated/models/CallStatsMapSFUs;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    return-object v0
.end method

.method public final component14()Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final component7()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;
    .locals 16
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
    .param p5    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_ended_at"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_started_at"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "data_source"
        .end annotation
    .end param
    .param p9    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "end_time"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "generated_at"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "start_time"
        .end annotation
    .end param
    .param p12    # Lio/getstream/android/video/generated/models/CallStatsMapPublishers;
        .annotation runtime Lqx/q;
            name = "publishers"
        .end annotation
    .end param
    .param p13    # Lio/getstream/android/video/generated/models/CallStatsMapSFUs;
        .annotation runtime Lqx/q;
            name = "sfus"
        .end annotation
    .end param
    .param p14    # Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;
        .annotation runtime Lqx/q;
            name = "subscribers"
        .end annotation
    .end param

    const-string v0, "callId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getCallEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCallType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCounts()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final getDataSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndTime()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    return-object v0
.end method

.method public final getGeneratedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    return-object v0
.end method

.method public final getPublishers()Lio/getstream/android/video/generated/models/CallStatsMapPublishers;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    return-object v0
.end method

.method public final getSfus()Lio/getstream/android/video/generated/models/CallStatsMapSFUs;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    return-object v0
.end method

.method public final getStartTime()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    return-object v0
.end method

.method public final getSubscribers()Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallStatsMapPublishers;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallStatsMapSFUs;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callId:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callType:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->duration:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callEndedAt:Ljg3/i;

    iget-object v7, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->callStartedAt:Ljg3/i;

    iget-object v8, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->dataSource:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->endTime:Ljg3/i;

    iget-object v10, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->generatedAt:Ljg3/i;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->startTime:Ljg3/i;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->publishers:Lio/getstream/android/video/generated/models/CallStatsMapPublishers;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->sfus:Lio/getstream/android/video/generated/models/CallStatsMapSFUs;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;->subscribers:Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;

    const-string v15, ", callSessionId="

    const-string v0, ", callType="

    move-object/from16 v16, v14

    const-string v14, "QueryCallStatsMapResponse(callId="

    invoke-static {v14, v1, v15, v2, v0}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    const-string v2, ", counts="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callEndedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callStartedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", generatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", publishers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sfus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subscribers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

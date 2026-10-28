.class public final Lio/getstream/android/video/generated/models/CallSessionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00bf\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0003\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0008\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0008\u0003\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0008\u0003\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t\u0012\u0014\u0008\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u00c8\u0001\u0010\'\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0003\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0008\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\u0008\u0003\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\u0008\u0003\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t2\u0014\u0008\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u0017J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u0019R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\u001bR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010\u001dR#\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u00087\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00105\u001a\u0004\u00088\u0010\u001dR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00105\u001a\u0004\u00089\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008;\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010:\u001a\u0004\u0008<\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010:\u001a\u0004\u0008=\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010:\u001a\u0004\u0008>\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010:\u001a\u0004\u0008?\u0010\"\u00a8\u0006@"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "",
        "",
        "anonymousParticipantCount",
        "",
        "id",
        "",
        "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
        "participants",
        "",
        "Ljg3/i;",
        "acceptedBy",
        "missedBy",
        "participantsCountByRole",
        "rejectedBy",
        "endedAt",
        "liveEndedAt",
        "liveStartedAt",
        "startedAt",
        "timerEndsAt",
        "<init>",
        "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/util/Map;",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Ljg3/i;",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getAnonymousParticipantCount",
        "Ljava/lang/String;",
        "getId",
        "Ljava/util/List;",
        "getParticipants",
        "Ljava/util/Map;",
        "getAcceptedBy",
        "getMissedBy",
        "getParticipantsCountByRole",
        "getRejectedBy",
        "Ljg3/i;",
        "getEndedAt",
        "getLiveEndedAt",
        "getLiveStartedAt",
        "getStartedAt",
        "getTimerEndsAt",
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
.field private final acceptedBy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation
.end field

.field private final anonymousParticipantCount:I

.field private final endedAt:Ljg3/i;

.field private final id:Ljava/lang/String;

.field private final liveEndedAt:Ljg3/i;

.field private final liveStartedAt:Ljg3/i;

.field private final missedBy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation
.end field

.field private final participants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final participantsCountByRole:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final rejectedBy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation
.end field

.field private final startedAt:Ljg3/i;

.field private final timerEndsAt:Ljg3/i;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "anonymous_participant_count"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "accepted_by"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "missed_by"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "participants_count_by_role"
        .end annotation
    .end param
    .param p7    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "rejected_by"
        .end annotation
    .end param
    .param p8    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p9    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "live_ended_at"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "live_started_at"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "started_at"
        .end annotation
    .end param
    .param p12    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "timer_ends_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljg3/i;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedBy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "missedBy"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsCountByRole"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rejectedBy"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    .line 12
    iput-object p11, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    .line 13
    iput-object p12, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 14
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 15
    sget-object v2, Lm83/z;->w:Lm83/z;

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v12, v2

    goto :goto_7

    :cond_7
    move-object/from16 v12, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v13, v2

    goto :goto_8

    :cond_8
    move-object/from16 v13, p11

    :goto_8
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_9

    move-object v14, v2

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object v2, p0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p12

    move-object v2, p0

    move/from16 v3, p1

    move-object/from16 v4, p2

    :goto_9
    invoke-direct/range {v2 .. v14}, Lio/getstream/android/video/generated/models/CallSessionResponse;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallSessionResponse;ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallSessionResponse;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

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

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/android/video/generated/models/CallSessionResponse;->copy(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    return v0
.end method

.method public final component10()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final component11()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    return-object v0
.end method

.method public final component12()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final component9()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallSessionResponse;
    .locals 14
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "anonymous_participant_count"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "accepted_by"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "missed_by"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "participants_count_by_role"
        .end annotation
    .end param
    .param p7    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "rejected_by"
        .end annotation
    .end param
    .param p8    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p9    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "live_ended_at"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "live_started_at"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "started_at"
        .end annotation
    .end param
    .param p12    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "timer_ends_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljg3/i;",
            ")",
            "Lio/getstream/android/video/generated/models/CallSessionResponse;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedBy"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "missedBy"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsCountByRole"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rejectedBy"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallSessionResponse;

    move v2, p1

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lio/getstream/android/video/generated/models/CallSessionResponse;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallSessionResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAcceptedBy()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    return-object v0
.end method

.method public final getAnonymousParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    return v0
.end method

.method public final getEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLiveEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final getLiveStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final getMissedBy()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    return-object v0
.end method

.method public final getParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final getParticipantsCountByRole()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    return-object v0
.end method

.method public final getRejectedBy()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    return-object v0
.end method

.method public final getStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    return-object v0
.end method

.method public final getTimerEndsAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->anonymousParticipantCount:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participants:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->acceptedBy:Ljava/util/Map;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->missedBy:Ljava/util/Map;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->participantsCountByRole:Ljava/util/Map;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->rejectedBy:Ljava/util/Map;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->endedAt:Ljg3/i;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveEndedAt:Ljg3/i;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->liveStartedAt:Ljg3/i;

    iget-object v10, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->startedAt:Ljg3/i;

    iget-object v11, p0, Lio/getstream/android/video/generated/models/CallSessionResponse;->timerEndsAt:Ljg3/i;

    const-string v12, ", id="

    const-string v13, ", participants="

    const-string v14, "CallSessionResponse(anonymousParticipantCount="

    invoke-static {v0, v14, v12, v1, v13}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", acceptedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", missedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", participantsCountByRole="

    const-string v2, ", rejectedBy="

    invoke-static {v0, v4, v1, v5, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", liveEndedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", liveStartedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timerEndsAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

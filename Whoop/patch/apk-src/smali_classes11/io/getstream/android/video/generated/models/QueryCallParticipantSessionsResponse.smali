.class public final Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bu\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0007\u0012\u000e\u0008\u0003\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jy\u0010*\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\t\u001a\u00020\u00072\u000e\u0008\u0003\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0017\u00a8\u00060"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;",
        "",
        "callId",
        "",
        "callSessionId",
        "callType",
        "duration",
        "",
        "totalParticipantDuration",
        "totalParticipantSessions",
        "participantsSessions",
        "",
        "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
        "next",
        "prev",
        "session",
        "Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)V",
        "getCallId",
        "()Ljava/lang/String;",
        "getCallSessionId",
        "getCallType",
        "getDuration",
        "()I",
        "getNext",
        "getParticipantsSessions",
        "()Ljava/util/List;",
        "getPrev",
        "getSession",
        "()Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "getTotalParticipantDuration",
        "getTotalParticipantSessions",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final callId:Ljava/lang/String;

.field private final callSessionId:Ljava/lang/String;

.field private final callType:Ljava/lang/String;

.field private final duration:I

.field private final next:Ljava/lang/String;

.field private final participantsSessions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
            ">;"
        }
    .end annotation
.end field

.field private final prev:Ljava/lang/String;

.field private final session:Lio/getstream/android/video/generated/models/CallSessionResponse;

.field private final totalParticipantDuration:I

.field private final totalParticipantSessions:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)V
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
    .param p4    # I
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lqx/q;
            name = "total_participant_duration"
        .end annotation
    .end param
    .param p6    # I
        .annotation runtime Lqx/q;
            name = "total_participant_sessions"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants_sessions"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "next"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "prev"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/CallSessionResponse;
        .annotation runtime Lqx/q;
            name = "session"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/CallSessionResponse;",
            ")V"
        }
    .end annotation

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsSessions"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    .line 5
    iput p4, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    .line 6
    iput p5, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    .line 7
    iput p6, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    .line 12
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p9

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    move-object v12, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object v2, p0

    goto :goto_3

    :cond_3
    move-object/from16 v12, p10

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    .line 13
    :goto_3
    invoke-direct/range {v2 .. v12}, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/getstream/android/video/generated/models/CallSessionResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;
    .locals 12
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
    .param p4    # I
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lqx/q;
            name = "total_participant_duration"
        .end annotation
    .end param
    .param p6    # I
        .annotation runtime Lqx/q;
            name = "total_participant_sessions"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants_sessions"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "next"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "prev"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/CallSessionResponse;
        .annotation runtime Lqx/q;
            name = "session"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/CallSessionResponse;",
            ")",
            "Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;"
        }
    .end annotation

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsSessions"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    iget v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    iget v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    iget v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    return v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantsSessions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    return-object v0
.end method

.method public final getPrev()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    return-object v0
.end method

.method public final getTotalParticipantDuration()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    return v0
.end method

.method public final getTotalParticipantSessions()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/CallSessionResponse;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callSessionId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->callType:Ljava/lang/String;

    iget v3, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->duration:I

    iget v4, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantDuration:I

    iget v5, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->totalParticipantSessions:I

    iget-object v6, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->participantsSessions:Ljava/util/List;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->next:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->prev:Ljava/lang/String;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    const-string v10, ", callSessionId="

    const-string v11, ", callType="

    const-string v12, "QueryCallParticipantSessionsResponse(callId="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    const-string v10, ", totalParticipantDuration="

    invoke-static {v3, v2, v1, v10, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", totalParticipantSessions="

    const-string v2, ", participantsSessions="

    invoke-static {v0, v4, v1, v5, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", next="

    const-string v2, ", prev="

    invoke-static {v1, v7, v2, v0, v6}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", session="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

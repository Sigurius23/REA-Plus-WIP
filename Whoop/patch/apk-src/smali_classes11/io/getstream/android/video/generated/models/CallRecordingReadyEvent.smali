.class public final Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002:\u00010BC\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0010JL\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\u0008\u0008\u0003\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\u0008\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010&\u001a\u0004\u0008\'\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010(\u001a\u0004\u0008)\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010&\u001a\u0004\u0008*\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010+\u001a\u0004\u0008,\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010-\u001a\u0004\u0008.\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010&\u001a\u0004\u0008/\u0010\u0010\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "egressId",
        "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;",
        "recordingType",
        "Lio/getstream/android/video/generated/models/CallRecording;",
        "callRecording",
        "type",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "()Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;",
        "component5",
        "()Lio/getstream/android/video/generated/models/CallRecording;",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;",
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
        "getCreatedAt",
        "getEgressId",
        "Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;",
        "getRecordingType",
        "Lio/getstream/android/video/generated/models/CallRecording;",
        "getCallRecording",
        "getType",
        "RecordingType",
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

.field private final callRecording:Lio/getstream/android/video/generated/models/CallRecording;

.field private final createdAt:Ljg3/i;

.field private final egressId:Ljava/lang/String;

.field private final recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "egress_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;
        .annotation runtime Lqx/q;
            name = "recording_type"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/CallRecording;
        .annotation runtime Lqx/q;
            name = "call_recording"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "egressId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recordingType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callRecording"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/CallRecording;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "egress_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;
        .annotation runtime Lqx/q;
            name = "recording_type"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/CallRecording;
        .annotation runtime Lqx/q;
            name = "call_recording"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "egressId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recordingType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callRecording"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;Lio/getstream/android/video/generated/models/CallRecording;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallRecording()Lio/getstream/android/video/generated/models/CallRecording;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getEgressId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecordingType()Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRecording;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->createdAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->egressId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->recordingType:Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->callRecording:Lio/getstream/android/video/generated/models/CallRecording;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;->type:Ljava/lang/String;

    const-string v6, ", createdAt="

    const-string v7, ", egressId="

    const-string v8, "CallRecordingReadyEvent(callCid="

    invoke-static {v8, v1, v0, v6, v7}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", recordingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callRecording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

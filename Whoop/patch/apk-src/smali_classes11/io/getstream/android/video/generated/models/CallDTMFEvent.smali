.class public final Lio/getstream/android/video/generated/models/CallDTMFEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J`\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u00082\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0003\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0012J\u0010\u0010\"\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010(\u001a\u0004\u0008)\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008+\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010(\u001a\u0004\u0008,\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010-\u001a\u0004\u0008.\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010-\u001a\u0004\u0008/\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010*\u001a\u0004\u00080\u0010\u0016R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00101\u001a\u0004\u00082\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010(\u001a\u0004\u00083\u0010\u0012\u00a8\u00064"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallDTMFEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "digit",
        "",
        "durationMs",
        "seqNumber",
        "timestamp",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "user",
        "type",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "()I",
        "component5",
        "component6",
        "component7",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallDTMFEvent;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCreatedAt",
        "getDigit",
        "I",
        "getDurationMs",
        "getSeqNumber",
        "getTimestamp",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getUser",
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

.field private final createdAt:Ljg3/i;

.field private final digit:Ljava/lang/String;

.field private final durationMs:I

.field private final seqNumber:I

.field private final timestamp:Ljg3/i;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponse;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V
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
            name = "digit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lqx/q;
            name = "duration_ms"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lqx/q;
            name = "seq_number"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "timestamp"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    iput p4, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    iput p5, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallDTMFEvent;Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallDTMFEvent;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/CallDTMFEvent;->copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallDTMFEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    return v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallDTMFEvent;
    .locals 10
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
            name = "digit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lqx/q;
            name = "duration_ms"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lqx/q;
            name = "seq_number"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "timestamp"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallDTMFEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/CallDTMFEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getDigit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    return-object v0
.end method

.method public final getDurationMs()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    return v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getSeqNumber()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    return v0
.end method

.method public final getTimestamp()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->createdAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->digit:Ljava/lang/String;

    iget v3, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->durationMs:I

    iget v4, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->seqNumber:I

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->timestamp:Ljg3/i;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/CallDTMFEvent;->type:Ljava/lang/String;

    const-string v8, ", createdAt="

    const-string v9, ", digit="

    const-string v10, "CallDTMFEvent(callCid="

    invoke-static {v10, v1, v0, v8, v9}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", durationMs="

    const-string v8, ", seqNumber="

    invoke-static {v3, v2, v1, v8, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Llive/hms/video/sdk/models/HMSRtmpStreamingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003JF\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006&"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSRtmpStreamingState;",
        "",
        "running",
        "",
        "error",
        "Llive/hms/video/error/HMSException;",
        "startedAt",
        "",
        "stoppedAt",
        "state",
        "Llive/hms/video/sdk/models/enums/HMSStreamingState;",
        "<init>",
        "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V",
        "getRunning",
        "()Z",
        "getError",
        "()Llive/hms/video/error/HMSException;",
        "getStartedAt",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getStoppedAt",
        "getState",
        "()Llive/hms/video/sdk/models/enums/HMSStreamingState;",
        "setState",
        "(Llive/hms/video/sdk/models/enums/HMSStreamingState;)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSRtmpStreamingState;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final error:Llive/hms/video/error/HMSException;

.field private final running:Z

.field private final startedAt:Ljava/lang/Long;

.field private state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

.field private final stoppedAt:Ljava/lang/Long;


# direct methods
.method public constructor <init>(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    iput-object p5, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSRtmpStreamingState;ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSRtmpStreamingState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->copy(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    return v0
.end method

.method public final component2()Llive/hms/video/error/HMSException;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Llive/hms/video/sdk/models/enums/HMSStreamingState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0
.end method

.method public final copy(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSRtmpStreamingState;
    .locals 7

    const-string v0, "state"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/models/HMSRtmpStreamingState;-><init>(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getError()Llive/hms/video/error/HMSException;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    return-object v0
.end method

.method public final getRunning()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    return v0
.end method

.method public final getStartedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getState()Llive/hms/video/sdk/models/enums/HMSStreamingState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setState(Llive/hms/video/sdk/models/enums/HMSStreamingState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRtmpStreamingState(running="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->running:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->error:Llive/hms/video/error/HMSException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->startedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;
.super Llive/hms/video/sdk/models/HMSNotifications;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RtmpUpdateNotification"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0010\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006$"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;",
        "Llive/hms/video/sdk/models/HMSNotifications;",
        "startedAt",
        "",
        "stoppedAt",
        "updatedAt",
        "state",
        "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;",
        "error",
        "Llive/hms/video/sdk/models/HMSNotifications$ServerError;",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V",
        "getStartedAt",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getStoppedAt",
        "getUpdatedAt",
        "getState",
        "()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;",
        "getError",
        "()Llive/hms/video/sdk/models/HMSNotifications$ServerError;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;",
        "equals",
        "",
        "other",
        "",
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
.field private final error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private final startedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "started_at"
    .end annotation
.end field

.field private final state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "state"
    .end annotation
.end field

.field private final stoppedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stopped_at"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/HMSNotifications;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    iput-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-object v0
.end method

.method public final component5()Llive/hms/video/sdk/models/HMSNotifications$ServerError;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;
    .locals 6

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getError()Llive/hms/video/sdk/models/HMSNotifications$ServerError;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    return-object v0
.end method

.method public final getStartedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$ServerError;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RtmpUpdateNotification(startedAt="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->startedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->updatedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

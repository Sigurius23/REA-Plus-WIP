.class public final Llive/hms/video/sdk/models/HMSNotifications$Rtmp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Rtmp"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J<\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$Rtmp;",
        "",
        "enabled",
        "",
        "startedAt",
        "",
        "stoppedAt",
        "state",
        "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;",
        "<init>",
        "(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)V",
        "getEnabled",
        "()Z",
        "getStartedAt",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getStoppedAt",
        "getState",
        "()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)Llive/hms/video/sdk/models/HMSNotifications$Rtmp;",
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
.field private final enabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabled"
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


# direct methods
.method public constructor <init>(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$Rtmp;ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$Rtmp;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->copy(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)Llive/hms/video/sdk/models/HMSNotifications$Rtmp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    return v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-object v0
.end method

.method public final copy(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)Llive/hms/video/sdk/models/HMSNotifications$Rtmp;
    .locals 1

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;-><init>(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    return v0
.end method

.method public final getStartedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

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

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Rtmp(enabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->enabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->startedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->state:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

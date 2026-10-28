.class public final Llive/hms/video/sdk/models/LastTrackState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Llive/hms/video/sdk/models/LastTrackState;",
        "",
        "isLocalVideoMuted",
        "",
        "isLocalAudioMuted",
        "isScreenSharePublished",
        "isCameraFacing",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "<init>",
        "(ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V",
        "()Z",
        "()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
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
.field private final isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

.field private final isLocalAudioMuted:Z

.field private final isLocalVideoMuted:Z

.field private final isScreenSharePublished:Z


# direct methods
.method public constructor <init>(ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V
    .locals 1

    const-string v0, "isCameraFacing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    iput-boolean p2, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    iput-boolean p3, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    iput-object p4, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/LastTrackState;ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ILjava/lang/Object;)Llive/hms/video/sdk/models/LastTrackState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/LastTrackState;->copy(ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Llive/hms/video/sdk/models/LastTrackState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    return v0
.end method

.method public final component4()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-object v0
.end method

.method public final copy(ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Llive/hms/video/sdk/models/LastTrackState;
    .locals 1

    const-string v0, "isCameraFacing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/LastTrackState;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/LastTrackState;-><init>(ZZZLlive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/LastTrackState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/LastTrackState;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    iget-object p1, p1, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-object v0
.end method

.method public final isLocalAudioMuted()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    return v0
.end method

.method public final isLocalVideoMuted()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    return v0
.end method

.method public final isScreenSharePublished()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LastTrackState(isLocalVideoMuted="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalVideoMuted:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isLocalAudioMuted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isLocalAudioMuted:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isScreenSharePublished="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isScreenSharePublished:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isCameraFacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/LastTrackState;->isCameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

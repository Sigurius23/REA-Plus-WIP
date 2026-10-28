.class public final Lio/getstream/android/video/generated/models/VideoSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001fB7\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/VideoSettingsResponse;",
        "",
        "accessRequestEnabled",
        "",
        "cameraDefaultOn",
        "cameraFacing",
        "Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;",
        "enabled",
        "targetResolution",
        "Lio/getstream/android/video/generated/models/TargetResolution;",
        "(ZZLio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;ZLio/getstream/android/video/generated/models/TargetResolution;)V",
        "getAccessRequestEnabled",
        "()Z",
        "getCameraDefaultOn",
        "getCameraFacing",
        "()Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;",
        "getEnabled",
        "getTargetResolution",
        "()Lio/getstream/android/video/generated/models/TargetResolution;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "CameraFacing",
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
.field private final accessRequestEnabled:Z

.field private final cameraDefaultOn:Z

.field private final cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

.field private final enabled:Z

.field private final targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;


# direct methods
.method public constructor <init>(ZZLio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;ZLio/getstream/android/video/generated/models/TargetResolution;)V
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "camera_default_on"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;
        .annotation runtime Lqx/q;
            name = "camera_facing"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/TargetResolution;
        .annotation runtime Lqx/q;
            name = "target_resolution"
        .end annotation
    .end param

    const-string v0, "cameraFacing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetResolution"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    iput-boolean p2, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    iput-object p3, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    iput-boolean p4, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    iput-object p5, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/VideoSettingsResponse;ZZLio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;ZLio/getstream/android/video/generated/models/TargetResolution;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/VideoSettingsResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->copy(ZZLio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;ZLio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    return v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    return v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/TargetResolution;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-object v0
.end method

.method public final copy(ZZLio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;ZLio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/VideoSettingsResponse;
    .locals 7
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "camera_default_on"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;
        .annotation runtime Lqx/q;
            name = "camera_facing"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/TargetResolution;
        .annotation runtime Lqx/q;
            name = "target_resolution"
        .end annotation
    .end param

    const-string v0, "cameraFacing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetResolution"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;-><init>(ZZLio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;ZLio/getstream/android/video/generated/models/TargetResolution;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccessRequestEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    return v0
.end method

.method public final getCameraDefaultOn()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    return v0
.end method

.method public final getCameraFacing()Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    return v0
.end method

.method public final getTargetResolution()Lio/getstream/android/video/generated/models/TargetResolution;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/TargetResolution;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->accessRequestEnabled:Z

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraDefaultOn:Z

    iget-object v2, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->cameraFacing:Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing;

    iget-boolean v3, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->enabled:Z

    iget-object v4, p0, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    const-string v5, ", cameraDefaultOn="

    const-string v6, ", cameraFacing="

    const-string v7, "VideoSettingsResponse(accessRequestEnabled="

    invoke-static {v7, v5, v6, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", targetResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;",
        "",
        "accessRequestEnabled",
        "",
        "enabled",
        "targetResolution",
        "Lio/getstream/android/video/generated/models/TargetResolution;",
        "(ZZLio/getstream/android/video/generated/models/TargetResolution;)V",
        "getAccessRequestEnabled",
        "()Z",
        "getEnabled",
        "getTargetResolution",
        "()Lio/getstream/android/video/generated/models/TargetResolution;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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

.field private final enabled:Z

.field private final targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;


# direct methods
.method public constructor <init>(ZZLio/getstream/android/video/generated/models/TargetResolution;)V
    .locals 0
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/TargetResolution;
        .annotation runtime Lqx/q;
            name = "target_resolution"
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    .line 3
    iput-boolean p2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-void
.end method

.method public synthetic constructor <init>(ZZLio/getstream/android/video/generated/models/TargetResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;-><init>(ZZLio/getstream/android/video/generated/models/TargetResolution;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;ZZLio/getstream/android/video/generated/models/TargetResolution;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->copy(ZZLio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    return v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/TargetResolution;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-object v0
.end method

.method public final copy(ZZLio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/TargetResolution;
        .annotation runtime Lqx/q;
            name = "target_resolution"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;-><init>(ZZLio/getstream/android/video/generated/models/TargetResolution;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAccessRequestEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    return v0
.end method

.method public final getTargetResolution()Lio/getstream/android/video/generated/models/TargetResolution;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/TargetResolution;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->accessRequestEnabled:Z

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->enabled:Z

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    const-string v3, ", enabled="

    const-string v4, ", targetResolution="

    const-string v5, "ScreensharingSettingsResponse(accessRequestEnabled="

    invoke-static {v5, v3, v4, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

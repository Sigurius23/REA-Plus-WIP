.class public final Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J2\u0010\u0011\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;",
        "",
        "accessRequestEnabled",
        "",
        "enabled",
        "targetResolution",
        "Lio/getstream/android/video/generated/models/TargetResolution;",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)V",
        "getAccessRequestEnabled",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getEnabled",
        "getTargetResolution",
        "()Lio/getstream/android/video/generated/models/TargetResolution;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;",
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
.field private final accessRequestEnabled:Ljava/lang/Boolean;

.field private final enabled:Ljava/lang/Boolean;

.field private final targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/TargetResolution;
        .annotation runtime Lqx/q;
            name = "target_resolution"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/TargetResolution;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/TargetResolution;
        .annotation runtime Lqx/q;
            name = "target_resolution"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAccessRequestEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTargetResolution()Lio/getstream/android/video/generated/models/TargetResolution;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/TargetResolution;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->enabled:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->targetResolution:Lio/getstream/android/video/generated/models/TargetResolution;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ScreensharingSettingsRequest(accessRequestEnabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", targetResolution="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

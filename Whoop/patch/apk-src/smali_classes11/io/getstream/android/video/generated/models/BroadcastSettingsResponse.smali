.class public final Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;",
        "",
        "enabled",
        "",
        "hls",
        "Lio/getstream/android/video/generated/models/HLSSettingsResponse;",
        "rtmp",
        "Lio/getstream/android/video/generated/models/RTMPSettingsResponse;",
        "(ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;)V",
        "getEnabled",
        "()Z",
        "getHls",
        "()Lio/getstream/android/video/generated/models/HLSSettingsResponse;",
        "getRtmp",
        "()Lio/getstream/android/video/generated/models/RTMPSettingsResponse;",
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
.field private final enabled:Z

.field private final hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

.field private final rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;


# direct methods
.method public constructor <init>(ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;)V
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/HLSSettingsResponse;
        .annotation runtime Lqx/q;
            name = "hls"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/RTMPSettingsResponse;
        .annotation runtime Lqx/q;
            name = "rtmp"
        .end annotation
    .end param

    const-string v0, "hls"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtmp"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    iput-object p2, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    iput-object p3, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->copy(ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;)Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    return v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/HLSSettingsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/RTMPSettingsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    return-object v0
.end method

.method public final copy(ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;)Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/HLSSettingsResponse;
        .annotation runtime Lqx/q;
            name = "hls"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/RTMPSettingsResponse;
        .annotation runtime Lqx/q;
            name = "rtmp"
        .end annotation
    .end param

    const-string v0, "hls"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtmp"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;-><init>(ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    return v0
.end method

.method public final getHls()Lio/getstream/android/video/generated/models/HLSSettingsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    return-object v0
.end method

.method public final getRtmp()Lio/getstream/android/video/generated/models/RTMPSettingsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/HLSSettingsResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/RTMPSettingsResponse;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->enabled:Z

    iget-object v1, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->hls:Lio/getstream/android/video/generated/models/HLSSettingsResponse;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPSettingsResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "BroadcastSettingsResponse(enabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hls="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rtmp="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

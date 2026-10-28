.class public final Lio/getstream/android/video/generated/models/PublishedTrackFlags;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/PublishedTrackFlags;",
        "",
        "audio",
        "",
        "screenshare",
        "screenshareAudio",
        "video",
        "(ZZZZ)V",
        "getAudio",
        "()Z",
        "getScreenshare",
        "getScreenshareAudio",
        "getVideo",
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
.field private final audio:Z

.field private final screenshare:Z

.field private final screenshareAudio:Z

.field private final video:Z


# direct methods
.method public constructor <init>(ZZZZ)V
    .locals 0
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "audio"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "screenshare"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "screenshare_audio"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    iput-boolean p2, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    iput-boolean p3, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    iput-boolean p4, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/PublishedTrackFlags;ZZZZILjava/lang/Object;)Lio/getstream/android/video/generated/models/PublishedTrackFlags;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->copy(ZZZZ)Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    return v0
.end method

.method public final copy(ZZZZ)Lio/getstream/android/video/generated/models/PublishedTrackFlags;
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "audio"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "screenshare"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "screenshare_audio"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/PublishedTrackFlags;-><init>(ZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/PublishedTrackFlags;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    iget-boolean p1, p1, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAudio()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    return v0
.end method

.method public final getScreenshare()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    return v0
.end method

.method public final getScreenshareAudio()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    return v0
.end method

.method public final getVideo()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->audio:Z

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshare:Z

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->screenshareAudio:Z

    iget-boolean v3, p0, Lio/getstream/android/video/generated/models/PublishedTrackFlags;->video:Z

    const-string v4, ", screenshare="

    const-string v5, ", screenshareAudio="

    const-string v6, "PublishedTrackFlags(audio="

    invoke-static {v6, v4, v5, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", video="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

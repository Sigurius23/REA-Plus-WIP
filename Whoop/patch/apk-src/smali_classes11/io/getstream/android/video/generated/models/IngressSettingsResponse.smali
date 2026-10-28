.class public final Lio/getstream/android/video/generated/models/IngressSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0008\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0008\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0008H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/IngressSettingsResponse;",
        "",
        "enabled",
        "",
        "audioEncodingOptions",
        "Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;",
        "videoEncodingOptions",
        "",
        "",
        "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;",
        "(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)V",
        "getAudioEncodingOptions",
        "()Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;",
        "getEnabled",
        "()Z",
        "getVideoEncodingOptions",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

.field private final enabled:Z

.field private final videoEncodingOptions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)V
    .locals 0
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
        .annotation runtime Lqx/q;
            name = "audio_encoding_options"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "video_encoding_options"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 5
    sget-object p3, Lm83/z;->w:Lm83/z;

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressSettingsResponse;-><init>(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/IngressSettingsResponse;ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/IngressSettingsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->copy(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)Lio/getstream/android/video/generated/models/IngressSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    return v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)Lio/getstream/android/video/generated/models/IngressSettingsResponse;
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
        .annotation runtime Lqx/q;
            name = "audio_encoding_options"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "video_encoding_options"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;",
            ">;)",
            "Lio/getstream/android/video/generated/models/IngressSettingsResponse;"
        }
    .end annotation

    new-instance v0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressSettingsResponse;-><init>(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/IngressSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/IngressSettingsResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAudioEncodingOptions()Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    return v0
.end method

.method public final getVideoEncodingOptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->enabled:Z

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->audioEncodingOptions:Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/IngressSettingsResponse;->videoEncodingOptions:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "IngressSettingsResponse(enabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", audioEncodingOptions="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", videoEncodingOptions="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

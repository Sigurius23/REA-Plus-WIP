.class public final Lio/getstream/android/video/generated/models/AppEventResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003JF\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/AppEventResponse;",
        "",
        "autoTranslationEnabled",
        "",
        "name",
        "",
        "asyncUrlEnrichEnabled",
        "fileUploadConfig",
        "Lio/getstream/android/video/generated/models/FileUploadConfig;",
        "imageUploadConfig",
        "(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)V",
        "getAsyncUrlEnrichEnabled",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getAutoTranslationEnabled",
        "()Z",
        "getFileUploadConfig",
        "()Lio/getstream/android/video/generated/models/FileUploadConfig;",
        "getImageUploadConfig",
        "getName",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)Lio/getstream/android/video/generated/models/AppEventResponse;",
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
.field private final asyncUrlEnrichEnabled:Ljava/lang/Boolean;

.field private final autoTranslationEnabled:Z

.field private final fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

.field private final imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)V
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "auto_translation_enabled"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "name"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "async_url_enrich_enabled"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/FileUploadConfig;
        .annotation runtime Lqx/q;
            name = "file_upload_config"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/FileUploadConfig;
        .annotation runtime Lqx/q;
            name = "image_upload_config"
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lio/getstream/android/video/generated/models/AppEventResponse;-><init>(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/AppEventResponse;ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/AppEventResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/android/video/generated/models/AppEventResponse;->copy(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)Lio/getstream/android/video/generated/models/AppEventResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/FileUploadConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/FileUploadConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)Lio/getstream/android/video/generated/models/AppEventResponse;
    .locals 7
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "auto_translation_enabled"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "name"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "async_url_enrich_enabled"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/FileUploadConfig;
        .annotation runtime Lqx/q;
            name = "file_upload_config"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/FileUploadConfig;
        .annotation runtime Lqx/q;
            name = "image_upload_config"
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/AppEventResponse;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/android/video/generated/models/AppEventResponse;-><init>(ZLjava/lang/String;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/FileUploadConfig;Lio/getstream/android/video/generated/models/FileUploadConfig;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/AppEventResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/AppEventResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAsyncUrlEnrichEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAutoTranslationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    return v0
.end method

.method public final getFileUploadConfig()Lio/getstream/android/video/generated/models/FileUploadConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    return-object v0
.end method

.method public final getImageUploadConfig()Lio/getstream/android/video/generated/models/FileUploadConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/FileUploadConfig;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/FileUploadConfig;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->autoTranslationEnabled:Z

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->name:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->asyncUrlEnrichEnabled:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->fileUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/AppEventResponse;->imageUploadConfig:Lio/getstream/android/video/generated/models/FileUploadConfig;

    const-string v5, ", name="

    const-string v6, ", asyncUrlEnrichEnabled="

    const-string v7, "AppEventResponse(autoTranslationEnabled="

    invoke-static {v7, v5, v1, v6, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fileUploadConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUploadConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

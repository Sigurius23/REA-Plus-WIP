.class public final Lio/getstream/android/video/generated/models/RecordSettingsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;,
        Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\'\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J0\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/RecordSettingsRequest;",
        "",
        "mode",
        "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;",
        "audioOnly",
        "",
        "quality",
        "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;",
        "(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)V",
        "getAudioOnly",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getMode",
        "()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;",
        "getQuality",
        "()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)Lio/getstream/android/video/generated/models/RecordSettingsRequest;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Mode",
        "Quality",
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
.field private final audioOnly:Ljava/lang/Boolean;

.field private final mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

.field private final quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)V
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;
        .annotation runtime Lqx/q;
            name = "mode"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "audio_only"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;
        .annotation runtime Lqx/q;
            name = "quality"
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/RecordSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/RecordSettingsRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->copy(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)Lio/getstream/android/video/generated/models/RecordSettingsRequest;
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;
        .annotation runtime Lqx/q;
            name = "mode"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "audio_only"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;
        .annotation runtime Lqx/q;
            name = "quality"
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/RecordSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAudioOnly()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMode()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    return-object v0
.end method

.method public final getQuality()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

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

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->mode:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->audioOnly:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->quality:Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RecordSettingsRequest(mode="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", audioOnly="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", quality="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

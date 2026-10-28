.class public final Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;",
        "",
        "captureIntervalInSeconds",
        "",
        "mode",
        "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;",
        "quality",
        "",
        "(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)V",
        "getCaptureIntervalInSeconds",
        "()I",
        "getMode",
        "()Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;",
        "getQuality",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "Mode",
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
.field private final captureIntervalInSeconds:I

.field private final mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

.field private final quality:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "capture_interval_in_seconds"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
        .annotation runtime Lqx/q;
            name = "mode"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "quality"
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;-><init>(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->copy(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    return v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "capture_interval_in_seconds"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
        .annotation runtime Lqx/q;
            name = "mode"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "quality"
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;-><init>(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    iget v3, p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCaptureIntervalInSeconds()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    return v0
.end method

.method public final getMode()Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    return-object v0
.end method

.method public final getQuality()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->captureIntervalInSeconds:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->mode:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;->quality:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FrameRecordingSettingsResponse(captureIntervalInSeconds="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", quality="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;",
        "",
        "bitrate",
        "",
        "channels",
        "enableDtx",
        "",
        "(IIZ)V",
        "getBitrate",
        "()I",
        "getChannels",
        "getEnableDtx",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final bitrate:I

.field private final channels:I

.field private final enableDtx:Z


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "channels"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "enable_dtx"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    iput p2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    iput-boolean p3, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;IIZILjava/lang/Object;)Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->copy(IIZ)Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    return v0
.end method

.method public final copy(IIZ)Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "channels"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "enable_dtx"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;-><init>(IIZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    iget-boolean p1, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBitrate()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    return v0
.end method

.method public final getChannels()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    return v0
.end method

.method public final getEnableDtx()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->bitrate:I

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->channels:I

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;->enableDtx:Z

    const-string v3, ", channels="

    const-string v4, ", enableDtx="

    const-string v5, "IngressAudioEncodingResponse(bitrate="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

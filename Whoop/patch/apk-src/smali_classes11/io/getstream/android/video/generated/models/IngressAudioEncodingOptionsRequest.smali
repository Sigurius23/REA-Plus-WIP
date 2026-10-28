.class public final Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;",
        "",
        "bitrate",
        "",
        "channels",
        "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;",
        "enableDtx",
        "",
        "(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)V",
        "getBitrate",
        "()I",
        "getChannels",
        "()Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;",
        "getEnableDtx",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "Channels",
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

.field private final channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

.field private final enableDtx:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;
        .annotation runtime Lqx/q;
            name = "channels"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "enable_dtx"
        .end annotation
    .end param

    const-string v0, "channels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;-><init>(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->copy(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    return v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;
        .annotation runtime Lqx/q;
            name = "channels"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "enable_dtx"
        .end annotation
    .end param

    const-string v0, "channels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;-><init>(ILio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBitrate()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    return v0
.end method

.method public final getChannels()Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    return-object v0
.end method

.method public final getEnableDtx()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->bitrate:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->channels:Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;->enableDtx:Ljava/lang/Boolean;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "IngressAudioEncodingOptionsRequest(bitrate="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", channels="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableDtx="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

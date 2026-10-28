.class public final Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000bR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;",
        "",
        "bitrate",
        "",
        "codec",
        "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;",
        "frameRateLimit",
        "maxDimension",
        "minDimension",
        "(ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;III)V",
        "getBitrate",
        "()I",
        "getCodec",
        "()Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;",
        "getFrameRateLimit",
        "getMaxDimension",
        "getMinDimension",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "Codec",
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

.field private final codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

.field private final frameRateLimit:I

.field private final maxDimension:I

.field private final minDimension:I


# direct methods
.method public constructor <init>(ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;III)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;
        .annotation runtime Lqx/q;
            name = "codec"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "frame_rate_limit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lqx/q;
            name = "max_dimension"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lqx/q;
            name = "min_dimension"
        .end annotation
    .end param

    const-string v0, "codec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    iput-object p2, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    iput p3, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    iput p4, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    iput p5, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;IIIILjava/lang/Object;)Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->copy(ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;III)Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    return v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    return v0
.end method

.method public final copy(ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;III)Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;
    .locals 7
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;
        .annotation runtime Lqx/q;
            name = "codec"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "frame_rate_limit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lqx/q;
            name = "max_dimension"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lqx/q;
            name = "min_dimension"
        .end annotation
    .end param

    const-string v0, "codec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;-><init>(ILio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;III)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    iget p1, p1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBitrate()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    return v0
.end method

.method public final getCodec()Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    return-object v0
.end method

.method public final getFrameRateLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    return v0
.end method

.method public final getMaxDimension()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    return v0
.end method

.method public final getMinDimension()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->bitrate:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->codec:Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec;

    iget v2, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->frameRateLimit:I

    iget v3, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->maxDimension:I

    iget v4, p0, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;->minDimension:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "IngressVideoLayerRequest(bitrate="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", codec="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", frameRateLimit="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", maxDimension="

    const-string v1, ", minDimension="

    invoke-static {v5, v2, v0, v3, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

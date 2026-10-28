.class public final Llive/hms/video/sdk/models/role/VideoParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000cR\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000c\u00a8\u0006\u001e"
    }
    d2 = {
        "Llive/hms/video/sdk/models/role/VideoParams;",
        "",
        "bitRate",
        "",
        "codec",
        "Llive/hms/video/media/codec/HMSVideoCodec;",
        "frameRate",
        "width",
        "height",
        "<init>",
        "(ILlive/hms/video/media/codec/HMSVideoCodec;III)V",
        "getBitRate",
        "()I",
        "getCodec",
        "()Llive/hms/video/media/codec/HMSVideoCodec;",
        "getFrameRate",
        "getWidth",
        "getHeight",
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
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bitRate:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bitRate"
    .end annotation
.end field

.field private final codec:Llive/hms/video/media/codec/HMSVideoCodec;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "codec"
    .end annotation
.end field

.field private final frameRate:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "frameRate"
    .end annotation
.end field

.field private final height:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "height"
    .end annotation
.end field

.field private final width:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "width"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILlive/hms/video/media/codec/HMSVideoCodec;III)V
    .locals 1

    const-string v0, "codec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    iput-object p2, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    iput p3, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    iput p4, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    iput p5, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/role/VideoParams;ILlive/hms/video/media/codec/HMSVideoCodec;IIIILjava/lang/Object;)Llive/hms/video/sdk/models/role/VideoParams;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/models/role/VideoParams;->copy(ILlive/hms/video/media/codec/HMSVideoCodec;III)Llive/hms/video/sdk/models/role/VideoParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    return v0
.end method

.method public final component2()Llive/hms/video/media/codec/HMSVideoCodec;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    return v0
.end method

.method public final copy(ILlive/hms/video/media/codec/HMSVideoCodec;III)Llive/hms/video/sdk/models/role/VideoParams;
    .locals 7

    const-string v0, "codec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/role/VideoParams;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/models/role/VideoParams;-><init>(ILlive/hms/video/media/codec/HMSVideoCodec;III)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/role/VideoParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/role/VideoParams;

    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    iget v3, p1, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    iget-object v3, p1, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    iget v3, p1, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    iget v3, p1, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    iget p1, p1, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBitRate()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    return v0
.end method

.method public final getCodec()Llive/hms/video/media/codec/HMSVideoCodec;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    return-object v0
.end method

.method public final getFrameRate()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    return v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VideoParams(bitRate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->bitRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", codec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->frameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/role/VideoParams;->height:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

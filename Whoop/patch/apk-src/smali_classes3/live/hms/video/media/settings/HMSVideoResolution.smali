.class public final Llive/hms/video/media/settings/HMSVideoResolution;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008\"\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSVideoResolution;",
        "",
        "width",
        "",
        "height",
        "<init>",
        "(II)V",
        "getWidth",
        "()I",
        "setWidth",
        "(I)V",
        "getHeight",
        "setHeight",
        "component1",
        "component2",
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
.field private height:I

.field private width:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    iput p2, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/media/settings/HMSVideoResolution;IIILjava/lang/Object;)Llive/hms/video/media/settings/HMSVideoResolution;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/settings/HMSVideoResolution;->copy(II)Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    return v0
.end method

.method public final copy(II)Llive/hms/video/media/settings/HMSVideoResolution;
    .locals 1

    new-instance v0, Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-direct {v0, p1, p2}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/media/settings/HMSVideoResolution;

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    iget v3, p1, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    iget p1, p1, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setHeight(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    return-void
.end method

.method public final setWidth(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSVideoResolution(width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoResolution;->height:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

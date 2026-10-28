.class public final Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003J?\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;",
        "",
        "imageResizingEnabled",
        "",
        "resizedWidthPercentage",
        "",
        "resizedHeightPercentage",
        "resizeMode",
        "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;",
        "cropMode",
        "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;",
        "<init>",
        "(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)V",
        "getImageResizingEnabled",
        "()Z",
        "getResizedWidthPercentage",
        "()F",
        "getResizedHeightPercentage",
        "getResizeMode",
        "()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;",
        "getCropMode",
        "()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;


# instance fields
.field private final cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

.field private final imageResizingEnabled:Z

.field private final resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

.field private final resizedHeightPercentage:F

.field private final resizedWidthPercentage:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->Companion:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;

    return-void
.end method

.method public constructor <init>(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    iput p2, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    iput p3, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    iput-object p5, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    :cond_4
    move-object p7, p5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object p6, p4

    move p4, p2

    new-instance p2, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move p5, p3

    move p3, p1

    invoke-direct/range {p2 .. p7}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;-><init>(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)V

    return-object p2
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    return v0
.end method

.method public final component4()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    return-object v0
.end method

.method public final copy(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;
    .locals 6

    new-instance v0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;-><init>(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    iget v3, p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    iget v3, p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCropMode()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    return-object v0
.end method

.method public final getImageResizingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    return v0
.end method

.method public final getResizeMode()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    return-object v0
.end method

.method public final getResizedHeightPercentage()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    return v0
.end method

.method public final getResizedWidthPercentage()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

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

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->imageResizingEnabled:Z

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedWidthPercentage:F

    iget v2, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizedHeightPercentage:F

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->resizeMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->cropMode:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "StreamCdnImageResizing(imageResizingEnabled="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", resizedWidthPercentage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", resizedHeightPercentage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", resizeMode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cropMode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lio/getstream/android/video/generated/models/IngressSourceRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/IngressSourceRequest;",
        "",
        "fps",
        "Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;",
        "height",
        "",
        "width",
        "(Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;II)V",
        "getFps",
        "()Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;",
        "getHeight",
        "()I",
        "getWidth",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "Fps",
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
.field private final fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

.field private final height:I

.field private final width:I


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;II)V
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;
        .annotation runtime Lqx/q;
            name = "fps"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "height"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "width"
        .end annotation
    .end param

    const-string v0, "fps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    iput p2, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    iput p3, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/IngressSourceRequest;Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;IIILjava/lang/Object;)Lio/getstream/android/video/generated/models/IngressSourceRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressSourceRequest;->copy(Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;II)Lio/getstream/android/video/generated/models/IngressSourceRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    return v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;II)Lio/getstream/android/video/generated/models/IngressSourceRequest;
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;
        .annotation runtime Lqx/q;
            name = "fps"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "height"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "width"
        .end annotation
    .end param

    const-string v0, "fps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/IngressSourceRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/IngressSourceRequest;-><init>(Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/IngressSourceRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/IngressSourceRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    iget v3, p1, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    iget p1, p1, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFps()Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->fps:Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps;

    iget v1, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->height:I

    iget v2, p0, Lio/getstream/android/video/generated/models/IngressSourceRequest;->width:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "IngressSourceRequest(fps="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

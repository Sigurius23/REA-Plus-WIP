.class public final Lio/getstream/chat/android/client/audio/ProgressData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/ProgressData;",
        "",
        "currentPosition",
        "",
        "progress",
        "",
        "duration",
        "<init>",
        "(IFI)V",
        "getCurrentPosition",
        "()I",
        "getProgress",
        "()F",
        "getDuration",
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
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final currentPosition:I

.field private final duration:I

.field private final progress:F


# direct methods
.method public constructor <init>(IFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    iput p2, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    iput p3, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/client/audio/ProgressData;IFIILjava/lang/Object;)Lio/getstream/chat/android/client/audio/ProgressData;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/client/audio/ProgressData;

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/audio/ProgressData;-><init>(IFI)V

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    return v0
.end method

.method public final copy(IFI)Lio/getstream/chat/android/client/audio/ProgressData;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/audio/ProgressData;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/client/audio/ProgressData;-><init>(IFI)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/audio/ProgressData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/audio/ProgressData;

    iget v1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    iget v3, p1, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    iget v3, p1, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    iget p1, p1, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCurrentPosition()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    return v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    return v0
.end method

.method public final getProgress()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lio/getstream/chat/android/client/audio/ProgressData;->currentPosition:I

    iget v1, p0, Lio/getstream/chat/android/client/audio/ProgressData;->progress:F

    iget v2, p0, Lio/getstream/chat/android/client/audio/ProgressData;->duration:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ProgressData(currentPosition="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

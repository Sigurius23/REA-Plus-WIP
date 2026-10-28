.class public final Lio/getstream/android/video/generated/models/CountByMinuteResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ$\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0016\u001a\u0004\u0008\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CountByMinuteResponse;",
        "",
        "",
        "count",
        "Ljg3/i;",
        "startTs",
        "<init>",
        "(ILjg3/i;)V",
        "component1",
        "()I",
        "component2",
        "()Ljg3/i;",
        "copy",
        "(ILjg3/i;)Lio/getstream/android/video/generated/models/CountByMinuteResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getCount",
        "Ljg3/i;",
        "getStartTs",
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
.field private final count:I

.field private final startTs:Ljg3/i;


# direct methods
.method public constructor <init>(ILjg3/i;)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "count"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "start_ts"
        .end annotation
    .end param

    const-string v0, "startTs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    iput-object p2, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CountByMinuteResponse;ILjg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CountByMinuteResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->copy(ILjg3/i;)Lio/getstream/android/video/generated/models/CountByMinuteResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    return v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    return-object v0
.end method

.method public final copy(ILjg3/i;)Lio/getstream/android/video/generated/models/CountByMinuteResponse;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "count"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "start_ts"
        .end annotation
    .end param

    const-string v0, "startTs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;

    invoke-direct {v0, p1, p2}, Lio/getstream/android/video/generated/models/CountByMinuteResponse;-><init>(ILjg3/i;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CountByMinuteResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CountByMinuteResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCount()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    return v0
.end method

.method public final getStartTs()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->count:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CountByMinuteResponse;->startTs:Ljg3/i;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CountByMinuteResponse(count="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", startTs="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

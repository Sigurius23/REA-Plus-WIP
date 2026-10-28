.class public final Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/SubscriberStatsResponse;",
        "",
        "total",
        "",
        "totalSubscribedDurationSeconds",
        "unique",
        "(III)V",
        "getTotal",
        "()I",
        "getTotalSubscribedDurationSeconds",
        "getUnique",
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
.field private final total:I

.field private final totalSubscribedDurationSeconds:I

.field private final unique:I


# direct methods
.method public constructor <init>(III)V
    .locals 0
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "total"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "total_subscribed_duration_seconds"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "unique"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    iput p2, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    iput p3, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/SubscriberStatsResponse;IIIILjava/lang/Object;)Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->copy(III)Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    return v0
.end method

.method public final copy(III)Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "total"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "total_subscribed_duration_seconds"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "unique"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;-><init>(III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    iget v3, p1, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    iget v3, p1, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    iget p1, p1, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    return v0
.end method

.method public final getTotalSubscribedDurationSeconds()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    return v0
.end method

.method public final getUnique()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->total:I

    iget v1, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->totalSubscribedDurationSeconds:I

    iget v2, p0, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->unique:I

    const-string v3, ", totalSubscribedDurationSeconds="

    const-string v4, ", unique="

    const-string v5, "SubscriberStatsResponse(total="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

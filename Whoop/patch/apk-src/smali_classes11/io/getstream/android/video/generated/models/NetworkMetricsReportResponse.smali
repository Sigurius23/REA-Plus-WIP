.class public final Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u000c\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\r\u0010\t\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;",
        "",
        "averageConnectionTime",
        "",
        "averageJitter",
        "averageLatency",
        "averageTimeToReconnect",
        "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V",
        "getAverageConnectionTime",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getAverageJitter",
        "getAverageLatency",
        "getAverageTimeToReconnect",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final averageConnectionTime:Ljava/lang/Float;

.field private final averageJitter:Ljava/lang/Float;

.field private final averageLatency:Ljava/lang/Float;

.field private final averageTimeToReconnect:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_connection_time"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_jitter"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_latency"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_time_to_reconnect"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->copy(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    return-object v0
.end method

.method public final component2()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    return-object v0
.end method

.method public final copy(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
    .locals 1
    .param p1    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_connection_time"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_jitter"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_latency"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Float;
        .annotation runtime Lqx/q;
            name = "average_time_to_reconnect"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAverageConnectionTime()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    return-object v0
.end method

.method public final getAverageJitter()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    return-object v0
.end method

.method public final getAverageLatency()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    return-object v0
.end method

.method public final getAverageTimeToReconnect()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageConnectionTime:Ljava/lang/Float;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageJitter:Ljava/lang/Float;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageLatency:Ljava/lang/Float;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->averageTimeToReconnect:Ljava/lang/Float;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NetworkMetricsReportResponse(averageConnectionTime="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", averageJitter="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", averageLatency="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", averageTimeToReconnect="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

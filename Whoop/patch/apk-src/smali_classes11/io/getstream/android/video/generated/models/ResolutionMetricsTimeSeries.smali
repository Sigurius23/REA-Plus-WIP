.class public final Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;",
        "",
        "height",
        "Lio/getstream/android/video/generated/models/MetricTimeSeries;",
        "width",
        "(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)V",
        "getHeight",
        "()Lio/getstream/android/video/generated/models/MetricTimeSeries;",
        "getWidth",
        "component1",
        "component2",
        "copy",
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
.field private final height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

.field private final width:Lio/getstream/android/video/generated/models/MetricTimeSeries;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;-><init>(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)V
    .locals 0
    .param p1    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "height"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "width"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;-><init>(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->copy(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "height"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "width"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    invoke-direct {v0, p1, p2}, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;-><init>(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeight()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final getWidth()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/MetricTimeSeries;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/MetricTimeSeries;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->height:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->width:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ResolutionMetricsTimeSeries(height="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

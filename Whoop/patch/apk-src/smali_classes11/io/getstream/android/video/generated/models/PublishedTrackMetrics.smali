.class public final Lio/getstream/android/video/generated/models/PublishedTrackMetrics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B_\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rH\u00c6\u0003Jc\u0010!\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/PublishedTrackMetrics;",
        "",
        "codec",
        "",
        "trackId",
        "trackType",
        "warnings",
        "",
        "Lio/getstream/android/video/generated/models/SessionWarningResponse;",
        "bitrate",
        "Lio/getstream/android/video/generated/models/MetricTimeSeries;",
        "framerate",
        "resolution",
        "Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)V",
        "getBitrate",
        "()Lio/getstream/android/video/generated/models/MetricTimeSeries;",
        "getCodec",
        "()Ljava/lang/String;",
        "getFramerate",
        "getResolution",
        "()Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;",
        "getTrackId",
        "getTrackType",
        "getWarnings",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

.field private final codec:Ljava/lang/String;

.field private final framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

.field private final resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

.field private final trackId:Ljava/lang/String;

.field private final trackType:Ljava/lang/String;

.field private final warnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SessionWarningResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "codec"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_type"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "warnings"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "framerate"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
        .annotation runtime Lqx/q;
            name = "resolution"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SessionWarningResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/MetricTimeSeries;",
            "Lio/getstream/android/video/generated/models/MetricTimeSeries;",
            "Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    .line 10
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p8, p7

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/PublishedTrackMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/PublishedTrackMetrics;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)Lio/getstream/android/video/generated/models/PublishedTrackMetrics;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SessionWarningResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)Lio/getstream/android/video/generated/models/PublishedTrackMetrics;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "codec"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_type"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "warnings"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "bitrate"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/MetricTimeSeries;
        .annotation runtime Lqx/q;
            name = "framerate"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
        .annotation runtime Lqx/q;
            name = "resolution"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SessionWarningResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/MetricTimeSeries;",
            "Lio/getstream/android/video/generated/models/MetricTimeSeries;",
            "Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;",
            ")",
            "Lio/getstream/android/video/generated/models/PublishedTrackMetrics;"
        }
    .end annotation

    new-instance v0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBitrate()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final getCodec()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    return-object v0
.end method

.method public final getFramerate()Lio/getstream/android/video/generated/models/MetricTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    return-object v0
.end method

.method public final getResolution()Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    return-object v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    return-object v0
.end method

.method public final getWarnings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SessionWarningResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/MetricTimeSeries;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/MetricTimeSeries;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->codec:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->trackType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->warnings:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->bitrate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->framerate:Lio/getstream/android/video/generated/models/MetricTimeSeries;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/PublishedTrackMetrics;->resolution:Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;

    const-string v7, ", trackId="

    const-string v8, ", trackType="

    const-string v9, "PublishedTrackMetrics(codec="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", warnings="

    const-string v7, ", bitrate="

    invoke-static {v2, v1, v7, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", framerate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

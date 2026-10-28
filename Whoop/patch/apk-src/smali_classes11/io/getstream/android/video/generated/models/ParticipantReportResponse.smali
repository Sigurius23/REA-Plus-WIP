.class public final Lio/getstream/android/video/generated/models/ParticipantReportResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0010\u0008\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0010\u0008\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0010\u0008\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u009a\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0010\u0008\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0010\u0008\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0010\u0008\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\t\u00104\u001a\u000205H\u00d6\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\"\u00a8\u00066"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ParticipantReportResponse;",
        "",
        "sum",
        "",
        "unique",
        "maxConcurrent",
        "byBrowser",
        "",
        "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
        "byCountry",
        "byDevice",
        "byOperatingSystem",
        "countOverTime",
        "Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;",
        "publishers",
        "Lio/getstream/android/video/generated/models/PublisherStatsResponse;",
        "subscribers",
        "Lio/getstream/android/video/generated/models/SubscriberStatsResponse;",
        "(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)V",
        "getByBrowser",
        "()Ljava/util/List;",
        "getByCountry",
        "getByDevice",
        "getByOperatingSystem",
        "getCountOverTime",
        "()Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;",
        "getMaxConcurrent",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPublishers",
        "()Lio/getstream/android/video/generated/models/PublisherStatsResponse;",
        "getSubscribers",
        "()Lio/getstream/android/video/generated/models/SubscriberStatsResponse;",
        "getSum",
        "()I",
        "getUnique",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)Lio/getstream/android/video/generated/models/ParticipantReportResponse;",
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
.field private final byBrowser:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final byCountry:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final byDevice:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final byOperatingSystem:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

.field private final maxConcurrent:Ljava/lang/Integer;

.field private final publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

.field private final subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

.field private final sum:I

.field private final unique:I


# direct methods
.method public constructor <init>(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)V
    .locals 0
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "sum"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "unique"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_concurrent"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_browser"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_country"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_device"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_operating_system"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;
        .annotation runtime Lqx/q;
            name = "count_over_time"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/PublisherStatsResponse;
        .annotation runtime Lqx/q;
            name = "publishers"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
        .annotation runtime Lqx/q;
            name = "subscribers"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;",
            "Lio/getstream/android/video/generated/models/PublisherStatsResponse;",
            "Lio/getstream/android/video/generated/models/SubscriberStatsResponse;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    .line 3
    iput p2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x4

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p12, p11, 0x8

    .line 12
    sget-object v1, Lm83/y;->w:Lm83/y;

    if-eqz p12, :cond_1

    move-object p4, v1

    :cond_1
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_2

    move-object p5, v1

    :cond_2
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_3

    move-object p6, v1

    :cond_3
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_4

    move-object p7, v1

    :cond_4
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_5

    move-object p8, v0

    :cond_5
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_6

    move-object p9, v0

    :cond_6
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_7

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p11, p10

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p11}, Lio/getstream/android/video/generated/models/ParticipantReportResponse;-><init>(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ParticipantReportResponse;IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ParticipantReportResponse;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->copy(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    return v0
.end method

.method public final component10()Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    return v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    return-object v0
.end method

.method public final component9()Lio/getstream/android/video/generated/models/PublisherStatsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    return-object v0
.end method

.method public final copy(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)Lio/getstream/android/video/generated/models/ParticipantReportResponse;
    .locals 11
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "sum"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "unique"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_concurrent"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_browser"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_country"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_device"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "by_operating_system"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;
        .annotation runtime Lqx/q;
            name = "count_over_time"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/PublisherStatsResponse;
        .annotation runtime Lqx/q;
            name = "publishers"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
        .annotation runtime Lqx/q;
            name = "subscribers"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;",
            "Lio/getstream/android/video/generated/models/PublisherStatsResponse;",
            "Lio/getstream/android/video/generated/models/SubscriberStatsResponse;",
            ")",
            "Lio/getstream/android/video/generated/models/ParticipantReportResponse;"
        }
    .end annotation

    new-instance v0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lio/getstream/android/video/generated/models/ParticipantReportResponse;-><init>(IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;Lio/getstream/android/video/generated/models/PublisherStatsResponse;Lio/getstream/android/video/generated/models/SubscriberStatsResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    iget v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    iget v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getByBrowser()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    return-object v0
.end method

.method public final getByCountry()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    return-object v0
.end method

.method public final getByDevice()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    return-object v0
.end method

.method public final getByOperatingSystem()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/GroupedStatsResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    return-object v0
.end method

.method public final getCountOverTime()Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    return-object v0
.end method

.method public final getMaxConcurrent()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPublishers()Lio/getstream/android/video/generated/models/PublisherStatsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    return-object v0
.end method

.method public final getSubscribers()Lio/getstream/android/video/generated/models/SubscriberStatsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    return-object v0
.end method

.method public final getSum()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    return v0
.end method

.method public final getUnique()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

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

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/PublisherStatsResponse;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/SubscriberStatsResponse;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->sum:I

    iget v1, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->unique:I

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->maxConcurrent:Ljava/lang/Integer;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byBrowser:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byCountry:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byDevice:Ljava/util/List;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->byOperatingSystem:Ljava/util/List;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->countOverTime:Lio/getstream/android/video/generated/models/ParticipantCountOverTimeResponse;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->publishers:Lio/getstream/android/video/generated/models/PublisherStatsResponse;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->subscribers:Lio/getstream/android/video/generated/models/SubscriberStatsResponse;

    const-string v10, ", unique="

    const-string v11, ", maxConcurrent="

    const-string v12, "ParticipantReportResponse(sum="

    invoke-static {v0, v1, v12, v10, v11}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", byBrowser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", byCountry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", byDevice="

    const-string v2, ", byOperatingSystem="

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countOverTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", publishers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subscribers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lio/getstream/android/video/generated/models/CallDurationReportResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0008\u0003\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\u0008\u0003\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallDurationReportResponse;",
        "",
        "daily",
        "",
        "Lio/getstream/android/video/generated/models/DailyAggregateCallDurationReportResponse;",
        "(Ljava/util/List;)V",
        "getDaily",
        "()Ljava/util/List;",
        "component1",
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
.field private final daily:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/DailyAggregateCallDurationReportResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/android/video/generated/models/CallDurationReportResponse;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "daily"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/DailyAggregateCallDurationReportResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "daily"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/android/video/generated/models/CallDurationReportResponse;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallDurationReportResponse;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallDurationReportResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->copy(Ljava/util/List;)Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/DailyAggregateCallDurationReportResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lio/getstream/android/video/generated/models/CallDurationReportResponse;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "daily"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/DailyAggregateCallDurationReportResponse;",
            ">;)",
            "Lio/getstream/android/video/generated/models/CallDurationReportResponse;"
        }
    .end annotation

    const-string v0, "daily"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    invoke-direct {v0, p1}, Lio/getstream/android/video/generated/models/CallDurationReportResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDaily()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/DailyAggregateCallDurationReportResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->daily:Ljava/util/List;

    const-string v1, "CallDurationReportResponse(daily="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lte0/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

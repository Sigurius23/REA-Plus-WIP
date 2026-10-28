.class public abstract Lgi0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfg3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lgi0/i;

    invoke-static {v0}, Lfg3/d;->b(Ljava/lang/Class;)Lfg3/b;

    move-result-object v0

    sput-object v0, Lgi0/i;->a:Lfg3/b;

    return-void
.end method

.method public static synthetic a(Ljava/util/List;)J
    .locals 2

    invoke-static {p0}, Lgi0/i;->d(Ljava/util/List;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(ILjava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lgi0/h;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lgi0/h;-><init>(I)V

    invoke-static {v1}, Ljava/util/Comparator;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lgi0/i;->a:Lfg3/b;

    const-string v2, "Heart rates were out of order userId={}"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lfg3/b;->v(Ljava/lang/String;Ljava/lang/Number;)V

    const-string v2, "Heart rates were out of order userId={} original={}"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, v2, p0, p1}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static c(ILcom/whoop/analytics/strain/model/AnalyticsState;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->getLeftOvers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lgi0/h;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lgi0/h;-><init>(I)V

    invoke-static {v1}, Ljava/util/Comparator;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->getLeftOvers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lgi0/i;->a:Lfg3/b;

    const-string v2, "Left overs were out of order userId={}"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lfg3/b;->v(Ljava/lang/String;Ljava/lang/Number;)V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->getLeftOvers()Ljava/util/List;

    move-result-object p1

    const-string v2, "Left overs were out of order userId={} original={}"

    invoke-interface {v1, v2, p0, p1}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method private static synthetic d(Ljava/util/List;)J
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

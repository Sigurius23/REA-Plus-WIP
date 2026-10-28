.class public final Lcom/whoop/domain/model/RouteSummary;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J4\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001e\u001a\u0004\u0008 \u0010\u000eR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010!\u001a\u0004\u0008\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u00148\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010\u0016R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/domain/model/RouteSummary;",
        "",
        "Lorg/joda/time/DateTime;",
        "start",
        "end",
        "",
        "Lp92/h$a;",
        "routePoints",
        "<init>",
        "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V",
        "Lcom/whoop/domain/model/RouteSummaryDto;",
        "toRouteSummaryDto",
        "()Lcom/whoop/domain/model/RouteSummaryDto;",
        "component1",
        "()Lorg/joda/time/DateTime;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lcom/whoop/domain/model/RouteSummary;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lorg/joda/time/DateTime;",
        "getStart",
        "getEnd",
        "Ljava/util/List;",
        "getRoutePoints",
        "name",
        "Ljava/lang/String;",
        "getName",
        "",
        "",
        "Lcom/whoop/domain/model/RoutePointDto;",
        "values",
        "Ljava/util/Map;",
        "getValues",
        "()Ljava/util/Map;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final end:Lorg/joda/time/DateTime;

.field private final name:Ljava/lang/String;

.field private final routePoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;"
        }
    .end annotation
.end field

.field private final start:Lorg/joda/time/DateTime;

.field private final values:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/whoop/domain/model/RoutePointDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routePoints"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    iput-object p2, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    iput-object p3, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    const-string p1, "gps"

    iput-object p1, p0, Lcom/whoop/domain/model/RouteSummary;->name:Ljava/lang/String;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/RouteSummary;->values:Ljava/util/Map;

    move-object p1, p3

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Lcom/whoop/domain/model/RouteSummary$special$$inlined$sortedBy$1;

    invoke-direct {p1}, Lcom/whoop/domain/model/RouteSummary$special$$inlined$sortedBy$1;-><init>()V

    invoke-static {p3, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp92/h$a;

    iget-object p3, p0, Lcom/whoop/domain/model/RouteSummary;->values:Ljava/util/Map;

    invoke-virtual {p2}, Lp92/h$a;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lcom/whoop/domain/model/RoutePointDto;

    invoke-virtual {p2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v4}, Landroid/location/Location;->getAltitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {p2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v5

    invoke-virtual {v5}, Landroid/location/Location;->getAccuracy()F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {p2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object p2

    invoke-virtual {p2}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result p2

    float-to-double v6, p2

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/whoop/domain/model/RoutePointDto;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/RouteSummary;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/domain/model/RouteSummary;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/domain/model/RouteSummary;->copy(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lcom/whoop/domain/model/RouteSummary;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component2()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lcom/whoop/domain/model/RouteSummary;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;)",
            "Lcom/whoop/domain/model/RouteSummary;"
        }
    .end annotation

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routePoints"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/RouteSummary;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/domain/model/RouteSummary;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/RouteSummary;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/RouteSummary;

    iget-object v1, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnd()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoutePoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    return-object v0
.end method

.method public final getStart()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/whoop/domain/model/RoutePointDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->values:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toRouteSummaryDto()Lcom/whoop/domain/model/RouteSummaryDto;
    .locals 4

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    sget-object v1, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->toDateTime(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    invoke-virtual {v2, v1}, Lorg/joda/time/DateTime;->toDateTime(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/domain/model/RouteSummaryDto;

    iget-object v2, p0, Lcom/whoop/domain/model/RouteSummary;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/domain/model/RouteSummary;->values:Ljava/util/Map;

    invoke-direct {v1, v2, v3, v0}, Lcom/whoop/domain/model/RouteSummaryDto;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/domain/model/RouteSummary;->start:Lorg/joda/time/DateTime;

    iget-object v1, p0, Lcom/whoop/domain/model/RouteSummary;->end:Lorg/joda/time/DateTime;

    iget-object v2, p0, Lcom/whoop/domain/model/RouteSummary;->routePoints:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RouteSummary(start="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", end="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", routePoints="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

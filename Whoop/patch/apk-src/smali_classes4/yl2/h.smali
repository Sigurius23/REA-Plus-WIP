.class public final Lyl2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lyl2/h;",
        "Lo02/d;",
        "Ljava/time/Clock;",
        "clock",
        "Ljava/time/format/DateTimeFormatter;",
        "dateTimeFormatter",
        "<init>",
        "(Ljava/time/Clock;Ljava/time/format/DateTimeFormatter;)V",
        "",
        "dateString",
        "Ljava/time/LocalDate;",
        "d",
        "(Ljava/lang/String;)Ljava/time/LocalDate;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "c",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "a",
        "Ljava/time/Clock;",
        "b",
        "Ljava/time/format/DateTimeFormatter;",
        "trends_release"
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
.field private final a:Ljava/time/Clock;

.field private final b:Ljava/time/format/DateTimeFormatter;


# direct methods
.method public constructor <init>(Ljava/time/Clock;Ljava/time/format/DateTimeFormatter;)V
    .locals 1

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateTimeFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyl2/h;->a:Ljava/time/Clock;

    .line 3
    iput-object p2, p0, Lyl2/h;->b:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/time/Clock;Ljava/time/format/DateTimeFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object p1

    const-string p4, "systemUTC(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    const-string p2, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    invoke-static {p2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p2

    invoke-virtual {p1}, Ljava/time/Clock;->getZone()Ljava/time/ZoneId;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object p2

    const-string p3, "withZone(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lyl2/h;-><init>(Ljava/time/Clock;Ljava/time/format/DateTimeFormatter;)V

    return-void
.end method

.method private final d(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lyl2/h;->b:Ljava/time/format/DateTimeFormatter;

    new-instance v1, Llj1/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Llj1/a;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/time/ZonedDateTime;

    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object p1, p0, Lyl2/h;->a:Ljava/time/Clock;

    invoke-static {p1}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lyl2/h;->a:Ljava/time/Clock;

    invoke-static {p1}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object p1

    const-string v0, "now(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Lyl2/h;->c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 11

    const-string v0, "navigationScreenModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/TrendsScreenModel;

    if-eqz v0, :cond_2

    new-instance v1, Lj02/m0$f5;

    check-cast p1, Lcom/whoop/navigation/TrendsScreenModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/TrendsScreenModel;->getTrendKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/navigation/TrendsScreenModel;->getDate()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lyl2/h;->d(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/navigation/TrendsScreenModel;->getFromLocation()Ljava/lang/String;

    move-result-object v0

    const-string v4, ""

    if-nez v0, :cond_0

    move-object v0, v4

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/navigation/TrendsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v5, v4

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/navigation/TrendsScreenModel;->getDuration()I

    move-result v6

    invoke-virtual {p1}, Lcom/whoop/navigation/TrendsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v8

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, v0

    invoke-direct/range {v1 .. v10}, Lj02/m0$f5;-><init>(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;IZLcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    sget-object p1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object p1
.end method

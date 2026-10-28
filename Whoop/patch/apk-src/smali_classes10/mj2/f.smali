.class public abstract Lmj2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmj2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a+\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a)\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a!\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressTrend;",
        "trend",
        "Ljava/time/LocalDate;",
        "selectedDate",
        "Lnj2/y;",
        "f",
        "(Lcom/whoop/stress/domain/model/StressTrend;Ljava/time/LocalDate;)Lnj2/y;",
        "",
        "Lcom/whoop/stress/domain/model/StressTrendSegment;",
        "segments",
        "",
        "isFading",
        "Lnj2/w;",
        "b",
        "(Ljava/util/List;Z)Ljava/util/List;",
        "Lcom/whoop/stress/domain/model/StressTrendType;",
        "stressTrendType",
        "",
        "alpha",
        "Ly81/e;",
        "e",
        "(Lcom/whoop/stress/domain/model/StressTrendType;F)Ly81/e;",
        "",
        "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
        "Lcom/whoop/stress/domain/model/StressTrendStat;",
        "stats",
        "Lnj2/x;",
        "c",
        "(Ljava/util/Map;)Ljava/util/List;",
        "stat",
        "d",
        "(Lcom/whoop/stress/domain/model/StressTrendStat;)Lnj2/x;",
        "Lcom/whoop/stress/domain/model/StressCta;",
        "cta",
        "currentDate",
        "Lnj2/u;",
        "a",
        "(Lcom/whoop/stress/domain/model/StressCta;Ljava/time/LocalDate;)Lnj2/u;",
        "stress_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final a(Lcom/whoop/stress/domain/model/StressCta;Ljava/time/LocalDate;)Lnj2/u;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressCta;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressCta;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v5, :cond_2

    aget-object v8, v4, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    move-object v8, v0

    :goto_2
    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    move-object v3, v8

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressCta;->getTrendKey()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_7

    sget-object v2, Lcom/whoop/util/TrendKey;->LOW_STRESS_DURATION:Lcom/whoop/util/TrendKey;

    invoke-static {}, Lcom/whoop/util/TrendKey;->values()[Lcom/whoop/util/TrendKey;

    move-result-object v4

    array-length v5, v4

    :goto_4
    if-ge v6, v5, :cond_5

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v0, v7

    goto :goto_5

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    move-object v2, v0

    :goto_6
    if-nez v2, :cond_8

    :cond_7
    sget-object v2, Lcom/whoop/util/TrendKey;->LOW_STRESS_DURATION:Lcom/whoop/util/TrendKey;

    :cond_8
    new-instance p0, Lnj2/u;

    invoke-direct {p0, v1, v3, p1, v2}, Lnj2/u;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/util/TrendKey;)V

    return-object p0
.end method

.method public static final b(Ljava/util/List;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;Z)",
            "Ljava/util/List<",
            "Lnj2/w;",
            ">;"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    move-object v3, v1

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, v3

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/stress/domain/model/StressTrendSegment;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/stress/domain/model/StressTrendSegment;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressTrendSegment;->getStartX()F

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressTrendSegment;->getEndX()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_2

    new-instance v3, Lnj2/w;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressTrendSegment;->getStyle()Lcom/whoop/stress/domain/model/StressTrendType;

    move-result-object v1

    invoke-static {v1, p1}, Lmj2/f;->e(Lcom/whoop/stress/domain/model/StressTrendType;F)Ly81/e;

    move-result-object v1

    invoke-direct {v3, v2, v1}, Lnj2/w;-><init>(FLy81/e;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method private static final c(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
            "Lcom/whoop/stress/domain/model/StressTrendStat;",
            ">;)",
            "Ljava/util/List<",
            "Lnj2/x;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrendStatKey;->LOW:Lcom/whoop/stress/domain/model/StressTrendStatKey;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/stress/domain/model/StressTrendStat;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lmj2/f;->d(Lcom/whoop/stress/domain/model/StressTrendStat;)Lnj2/x;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lcom/whoop/stress/domain/model/StressTrendStatKey;->MEDIUM:Lcom/whoop/stress/domain/model/StressTrendStatKey;

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/StressTrendStat;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lmj2/f;->d(Lcom/whoop/stress/domain/model/StressTrendStat;)Lnj2/x;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    sget-object v3, Lcom/whoop/stress/domain/model/StressTrendStatKey;->HIGH:Lcom/whoop/stress/domain/model/StressTrendStatKey;

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/stress/domain/model/StressTrendStat;

    if-eqz p0, :cond_2

    invoke-static {p0}, Lmj2/f;->d(Lcom/whoop/stress/domain/model/StressTrendStat;)Lnj2/x;

    move-result-object v1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_3

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v2, :cond_4

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v1, :cond_5

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0
.end method

.method public static final d(Lcom/whoop/stress/domain/model/StressTrendStat;)Lnj2/x;
    .locals 9

    const-string v0, "stat"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrendStat;->getStatTrend()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget-object v2, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    invoke-static {}, Lhy0/b2;->values()[Lhy0/b2;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v1

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v6

    :goto_2
    move-object v6, v2

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    new-instance v3, Lnj2/x;

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrendStat;->getStatDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrendStat;->getStatChangeDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_4
    move-object v5, v1

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrendStat;->getStyle()Lcom/whoop/stress/domain/model/StressTrendType;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lmj2/f;->e(Lcom/whoop/stress/domain/model/StressTrendType;F)Ly81/e;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrendStat;->getStatLabel()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lnj2/x;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ly81/e;Lcom/whoop/design/util/TextResource;)V

    return-object v3
.end method

.method private static final e(Lcom/whoop/stress/domain/model/StressTrendType;F)Ly81/e;
    .locals 1

    sget-object v0, Lmj2/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    new-instance p0, Lmj2/f$d;

    invoke-direct {p0, p1}, Lmj2/f$d;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lmj2/f$c;

    invoke-direct {p0, p1}, Lmj2/f$c;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lmj2/f$b;

    invoke-direct {p0, p1}, Lmj2/f$b;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/stress/domain/model/StressTrend;Ljava/time/LocalDate;)Lnj2/y;
    .locals 14

    const-string v0, "trend"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getSuffix()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getTodaySegments()Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lmj2/f;->b(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getPreviousSegments()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1

    const/4 v6, 0x1

    invoke-static {v5, v6}, Lmj2/f;->b(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getTrendStats()Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lmj2/f;->c(Ljava/util/Map;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getCta()Lcom/whoop/stress/domain/model/StressCta;

    move-result-object v7

    invoke-static {v7, p1}, Lmj2/f;->a(Lcom/whoop/stress/domain/model/StressCta;Ljava/time/LocalDate;)Lnj2/u;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getHeader()Lcom/whoop/stress/domain/model/StressTrendHeader;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/stress/domain/model/StressTrendHeader;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/stress/domain/model/StressTrendHeader;->getIcon()Ljava/lang/String;

    move-result-object p1

    sget-object v9, Lgz0/m0;->STRESS_MONITOR_DEFAULT:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v10

    array-length v11, v10

    :goto_2
    if-ge v4, v11, :cond_3

    aget-object v12, v10, v4

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    move-object v12, v1

    :goto_3
    if-nez v12, :cond_4

    goto :goto_4

    :cond_4
    move-object v9, v12

    :goto_4
    new-instance p1, Lnj2/v;

    invoke-direct {p1, v8, v9}, Lnj2/v;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;)V

    move-object v8, p1

    goto :goto_5

    :cond_5
    move-object v8, v1

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/stress/domain/model/StressTrend;->getVow()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_6
    move-object v9, v1

    new-instance v1, Lnj2/y;

    move-object v4, v0

    invoke-direct/range {v1 .. v9}, Lnj2/y;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnj2/u;Lnj2/v;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

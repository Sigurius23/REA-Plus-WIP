.class public final Lru1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lru1/b;",
        "",
        "Lru1/a;",
        "detailsGraphingCardReducer",
        "<init>",
        "(Lru1/a;)V",
        "Lnu1/c;",
        "Lqu1/f;",
        "d",
        "(Lnu1/c;)Lqu1/f;",
        "Lnu1/a$a;",
        "c",
        "(Lnu1/a$a;)Lqu1/f;",
        "",
        "spacing",
        "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;",
        "domainResult",
        "b",
        "Lru1/a;",
        "getDetailsGraphingCardReducer",
        "()Lru1/a;",
        "last-night-sleep_release"
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
.field private final a:Lru1/a;


# direct methods
.method public constructor <init>(Lru1/a;)V
    .locals 1

    const-string v0, "detailsGraphingCardReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lru1/b;->a:Lru1/a;

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;->NORMAL:Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;->COMPACT:Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;->COMPACT:Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;

    return-object p1
.end method

.method private final c(Lnu1/a$a;)Lqu1/f;
    .locals 8

    instance-of v0, p1, Lnu1/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lqu1/f;

    new-instance v2, Lqu1/g;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lqu1/g;-><init>(Le31/c;Lqu1/c;Lqu1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x7

    move-object v5, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Lqu1/f;-><init>(Lqu1/h;Lp31/l;Luu1/c;Lqu1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lnu1/a$c;

    if-eqz v0, :cond_2

    new-instance v1, Lqu1/f;

    new-instance v2, Lqu1/g;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->c()Le31/c;

    move-result-object v3

    check-cast p1, Lnu1/a$c;

    invoke-virtual {p1}, Lnu1/a$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lqu1/c$j;

    invoke-virtual {p1}, Lnu1/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lqu1/c$j;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lqu1/g;-><init>(Le31/c;Lqu1/c;Lqu1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x7

    move-object v5, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Lqu1/f;-><init>(Lqu1/h;Lp31/l;Luu1/c;Lqu1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Lnu1/c;)Lqu1/f;
    .locals 14

    invoke-virtual {p1}, Lnu1/c;->d()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance p1, Lnu1/a$c;

    invoke-direct {p1, v1}, Lnu1/a$c;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lru1/b;->c(Lnu1/a$a;)Lqu1/f;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v2

    invoke-virtual {p1}, Lnu1/c;->d()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;->getHeaderSection()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v3

    check-cast v7, Lp31/l;

    invoke-virtual {p1}, Lnu1/c;->d()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;->getSubHeaderSection()Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v4, Luu1/c;

    invoke-virtual {v3}, Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;->getSubHeader()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;->getSubHeaderEnd()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-direct {v4, v5, v1}, Luu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v4

    goto :goto_1

    :cond_2
    move-object v8, v0

    :goto_1
    invoke-virtual {p1}, Lnu1/c;->d()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-ltz v4, :cond_8

    check-cast v5, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSectionModel;

    invoke-virtual {v5}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSectionModel;->getInsetBottom()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-direct {p0, v9}, Lru1/b;->a(Ljava/lang/String;)Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;

    move-result-object v9

    if-nez v9, :cond_4

    :cond_3
    sget-object v9, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;->COMPACT:Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;

    :cond_4
    invoke-virtual {v5}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSectionModel;->getItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v5, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v12, v11, Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;

    if-eqz v12, :cond_6

    new-instance v12, Lqu1/a;

    iget-object v13, p0, Lru1/b;->a:Lru1/a;

    check-cast v11, Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;

    invoke-virtual {v13, v11, p1}, Lru1/a;->e(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lnu1/c;)Ltu1/g;

    move-result-object v11

    invoke-virtual {p1}, Lnu1/c;->d()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;->getSections()Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v13

    if-ne v4, v13, :cond_5

    sget-object v13, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;->NONE:Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;

    goto :goto_4

    :cond_5
    move-object v13, v9

    :goto_4
    invoke-direct {v12, v11, v13}, Lqu1/a;-><init>(Lm91/u;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;)V

    goto :goto_5

    :cond_6
    new-instance v12, Lqu1/a;

    invoke-virtual {v2, v11}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v11

    invoke-direct {v12, v11, v9}, Lqu1/a;-><init>(Lm91/u;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;)V

    :goto_5
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v3, v10}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move v4, v6

    goto :goto_2

    :cond_8
    invoke-static {}, Lwb3/f;->d0()V

    throw v0

    :cond_9
    new-instance v6, Lqu1/h;

    invoke-direct {v6, v3}, Lqu1/h;-><init>(Ljava/util/List;)V

    new-instance v5, Lqu1/f;

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lqu1/f;-><init>(Lqu1/h;Lp31/l;Luu1/c;Lqu1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method


# virtual methods
.method public final b(Lnu1/c;)Lqu1/f;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lnu1/c;->c()Lnu1/a;

    move-result-object v0

    instance-of v0, v0, Lnu1/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnu1/c;->c()Lnu1/a;

    move-result-object p1

    check-cast p1, Lnu1/a$a;

    invoke-direct {p0, p1}, Lru1/b;->c(Lnu1/a$a;)Lqu1/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lru1/b;->d(Lnu1/c;)Lqu1/f;

    move-result-object p1

    return-object p1
.end method

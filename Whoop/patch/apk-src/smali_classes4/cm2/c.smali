.class public final Lcm2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcm2/c;",
        "",
        "Lcm2/x;",
        "trendsColorHelper",
        "<init>",
        "(Lcm2/x;)V",
        "",
        "Lcom/whoop/trends/data/model/BarDTOV3;",
        "bars",
        "Lor2/h0;",
        "graphKey",
        "Lc01/a;",
        "c",
        "(Ljava/util/List;Lor2/h0;)Ljava/util/List;",
        "Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;",
        "Lc01/i;",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;",
        "breakDownBarDto",
        "Lc01/h;",
        "a",
        "(Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lor2/h0;)Lc01/h;",
        "Lcm2/x;",
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
.field private final a:Lcm2/x;


# direct methods
.method public constructor <init>(Lcm2/x;)V
    .locals 1

    const-string v0, "trendsColorHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcm2/c;->a:Lcm2/x;

    return-void
.end method

.method private final b(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;",
            ">;)",
            "Ljava/util/List<",
            "Lc01/i;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;

    new-instance v2, Lc01/i;

    iget-object v3, p0, Lcm2/c;->a:Lcm2/x;

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;->getBarColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcm2/x;->h(Ljava/lang/String;)Ly81/e;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;->getPercentage()D

    move-result-wide v4

    double-to-float v4, v4

    const/16 v5, 0x3e8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;->getBottomLabelDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;->getTopLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final c(Ljava/util/List;Lor2/h0;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/BarDTOV3;",
            ">;",
            "Lor2/h0;",
            ")",
            "Ljava/util/List<",
            "Lc01/a;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_2

    check-cast v2, Lcom/whoop/trends/data/model/BarDTOV3;

    sget-object v4, Lor2/h0;->RECOVERY:Lor2/h0;

    if-ne p2, v4, :cond_0

    new-instance v4, Lc01/a;

    iget-object v5, p0, Lcm2/c;->a:Lcm2/x;

    invoke-virtual {v5, v1}, Lcm2/x;->g(I)Ly81/e;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BarDTOV3;->getOpacity()D

    move-result-wide v5

    double-to-float v5, v5

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BarDTOV3;->getBotLabel()I

    move-result v6

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BarDTOV3;->getTopLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v4, v1, v5, v6, v2}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;)V

    move-object v6, p2

    goto :goto_1

    :cond_0
    new-instance v4, Lc01/a;

    iget-object v5, p0, Lcm2/c;->a:Lcm2/x;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    invoke-static/range {v5 .. v11}, Lcm2/x;->j(Lcm2/x;Lor2/h0;Ljava/lang/Double;ZZILjava/lang/Object;)Ly81/e;

    move-result-object p2

    if-nez p2, :cond_1

    new-instance p2, Lcm2/c$a;

    invoke-direct {p2, v2}, Lcm2/c$a;-><init>(Lcom/whoop/trends/data/model/BarDTOV3;)V

    invoke-static {p2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p2

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BarDTOV3;->getOpacity()D

    move-result-wide v7

    double-to-float v1, v7

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BarDTOV3;->getBotLabel()I

    move-result v5

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/BarDTOV3;->getTopLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v4, p2, v1, v5, v2}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;)V

    :goto_1
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    move-object p2, v6

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p1, 0x0

    throw p1

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lor2/h0;)Lc01/h;
    .locals 7

    const-string v0, "breakDownBarDto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/trends/data/model/BreakDownBarDtoV3;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/trends/data/model/BreakDownBarDtoV3;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/trends/data/model/BreakDownBarDtoV3;->getNumberOfGridColumns()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_3
    move v6, v0

    goto :goto_4

    :cond_2
    const/4 v0, 0x1

    goto :goto_3

    :goto_4
    invoke-virtual {p1}, Lcom/whoop/trends/data/model/BreakDownBarDtoV3;->getBars()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcm2/c;->c(Ljava/util/List;Lor2/h0;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/trends/data/model/BreakDownBarDtoV3;->getConfigurableBars()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcm2/c;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    new-instance v1, Lc01/h;

    invoke-direct/range {v1 .. v6}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    return-object v1
.end method

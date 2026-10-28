.class public abstract Lec1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lec1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;",
        "plot",
        "Lj71/b$i;",
        "c",
        "(Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;)Lj71/b$i;",
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;",
        "style",
        "Ly81/e;",
        "b",
        "(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;)Ly81/e;",
        "design-models_release"
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
.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lec1/a;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;)Ly81/e;
    .locals 1

    sget-object v0, Lec1/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lec1/a$d;->w:Lec1/a$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lec1/a$c;->w:Lec1/a$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lec1/a$b;->w:Lec1/a$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;)Lj71/b$i;
    .locals 21

    const-string v0, "plot"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldc1/c;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Ldc1/c;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;->getOverlayGroupList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getOverlayList()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v6, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;

    new-instance v8, Ly61/b;

    invoke-virtual {v7}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->getWidth()F

    move-result v10

    invoke-virtual {v7}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->getPositionX()F

    move-result v11

    invoke-virtual {v7}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->getStyle()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    move-result-object v7

    invoke-static {v7}, Lec1/a;->b(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;)Ly81/e;

    move-result-object v7

    invoke-direct {v8, v10, v11, v7}, Ly61/b;-><init>(FFLy81/e;)V

    invoke-interface {v9, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getPositionX()F

    move-result v10

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getTopLabel()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    new-instance v11, Lu61/d;

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_1
    move-object v11, v7

    :goto_2
    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getTopIconUrl()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_2

    new-instance v12, Lkd1/o$c;

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_2
    move-object v12, v7

    :goto_3
    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getCta()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    move-object v15, v6

    goto :goto_4

    :cond_3
    move-object v15, v7

    :goto_4
    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getActivityId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getOverlayLabelCtaContent()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_4

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0, v8}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    move-object/from16 v17, v7

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->getLabel()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->getSecondaryIcon()Lgz0/m0;

    move-result-object v18

    new-instance v7, Ly61/a;

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x61

    const/16 v20, 0x0

    invoke-direct/range {v7 .. v20}, Ly61/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v8, v0

    goto :goto_6

    :cond_6
    move v8, v2

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_7
    move v7, v2

    new-instance v3, Lj71/b$i;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v10}, Lj71/b$i;-><init>(Ljava/util/List;Lx61/a;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

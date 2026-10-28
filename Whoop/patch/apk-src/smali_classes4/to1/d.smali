.class public final Lto1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lto1/d;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;",
        "model",
        "Lso1/x$f;",
        "c",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;)Lso1/x$f;",
        "Lec3/l;",
        "Lpo1/b;",
        "upstream",
        "Lso1/x;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lto1/d;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;)Lso1/x$f;
    .locals 0

    invoke-direct {p0, p1}, Lto1/d;->c(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;)Lso1/x$f;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;)Lso1/x$f;
    .locals 16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleSection;

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleSection;->getTitleDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleSection;->getCycles()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->getCycle()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-result-object v8

    invoke-static {v8}, Llb1/t0;->a(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;

    move-result-object v8

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->getIcon()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lgz0/m0;->PENCIL:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_2
    const/4 v14, 0x0

    if-ge v13, v12, :cond_1

    aget-object v15, v11, v13

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v13, v13, 0x1

    const/16 v3, 0xa

    goto :goto_2

    :cond_1
    move-object v15, v14

    :goto_3
    if-nez v15, :cond_2

    goto :goto_4

    :cond_2
    move-object v10, v15

    :goto_4
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->getHidden()Z

    move-result v3

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->getBottomSheet()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->getEditOption()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    move-result-object v9

    if-eqz v9, :cond_3

    new-instance v11, Lso1/j;

    invoke-virtual {v9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;->getDisplay()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;->getDate()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v11, v12, v9}, Lso1/j;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    move-object v11, v14

    :goto_5
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->getHideOption()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    move-result-object v9

    if-eqz v9, :cond_4

    new-instance v12, Lso1/k;

    invoke-virtual {v9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;->getDisplay()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;->getDateRange()Ljava/util/List;

    move-result-object v9

    invoke-direct {v12, v13, v9}, Lso1/k;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    goto :goto_6

    :cond_4
    move-object v12, v14

    :goto_6
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->getUnhideOption()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    move-result-object v7

    if-eqz v7, :cond_5

    new-instance v14, Lso1/o0;

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;->getDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;->getIds()Ljava/util/List;

    move-result-object v7

    invoke-direct {v14, v9, v7}, Lso1/o0;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    :cond_5
    new-instance v7, Lso1/i;

    invoke-direct {v7, v11, v12, v14}, Lso1/i;-><init>(Lso1/j;Lso1/k;Lso1/o0;)V

    new-instance v9, Lso1/g;

    invoke-direct {v9, v8, v10, v3, v7}, Lso1/g;-><init>(Lf11/e;Lgz0/m0;ZLso1/i;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v3, 0xa

    goto/16 :goto_1

    :cond_6
    new-instance v3, Lso1/f;

    invoke-direct {v3, v5, v6}, Lso1/f;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v3, 0xa

    goto/16 :goto_0

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;->getHidingCycleModal()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    move-result-object v1

    new-instance v3, Ltp1/d;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getPrimaryText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getSecondaryText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v3, v4, v5, v6, v1}, Ltp1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v1, Lso1/x$f;

    invoke-direct {v1, v0, v2, v3}, Lso1/x$f;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ltp1/d;)V

    return-object v1
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lto1/d$a;

    invoke-direct {v0, p1, p0}, Lto1/d$a;-><init>(Lec3/l;Lto1/d;)V

    return-object v0
.end method

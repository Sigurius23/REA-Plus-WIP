.class public abstract Llb1/y2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;",
        "model",
        "Lf01/l1;",
        "g",
        "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;",
        "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;",
        "body",
        "Lf01/f1;",
        "d",
        "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;)Lf01/f1;",
        "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;",
        "footer",
        "Lf01/g1;",
        "e",
        "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;)Lf01/g1;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "logButton",
        "Lny0/h;",
        "f",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "menstrualCycleInsightsCardMapper",
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


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/t2;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/y2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;
    .locals 0

    invoke-static {p0}, Llb1/y2;->i(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/y2;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/y2;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;)Lf01/f1;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;->getSupertitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;->getMetricTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v7, v6

    move v8, v4

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v5

    :goto_1
    move-object v0, v5

    goto :goto_2

    :cond_2
    move-object v0, v5

    move-object v9, v0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;->getStatusText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;->getStatus()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v6

    array-length v7, v6

    :goto_3
    if-ge v4, v7, :cond_4

    aget-object v8, v6, v4

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    move-object v0, v8

    goto :goto_4

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    invoke-static {v0}, Llb1/s0;->a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;

    move-result-object v6

    new-instance v0, Lf01/f1;

    move-object v4, v9

    invoke-direct/range {v0 .. v6}, Lf01/f1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ly81/f;)V

    return-object v0
.end method

.method private static final e(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;)Lf01/g1;
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->MENSTRUAL_CYCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lf01/g1;

    invoke-direct {v0, v1, p0}, Lf01/g1;-><init>(Lgz0/m0;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 28

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    sget-object v3, Lgz0/m0;->ADD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v7, v2

    :goto_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v7

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v4

    goto :goto_3

    :cond_4
    move-object v8, v0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_4
    move/from16 v17, v0

    goto :goto_5

    :cond_5
    const/4 v0, 0x1

    goto :goto_4

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v2

    :cond_6
    move-object/from16 v21, v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v23

    new-instance v0, Lny0/h;

    const v26, 0x1ae9f7c

    const/16 v27, 0x0

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final g(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;
    .locals 16

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getBody()Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;

    move-result-object v0

    invoke-static {v0}, Llb1/y2;->d(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;)Lf01/f1;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getGraph()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-result-object v5

    sget-object v11, Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;->HEALTH_TAB:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    const/16 v14, 0xdb

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v5 .. v15}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->copy$default(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-result-object v0

    invoke-static {v0}, Llb1/t0;->a(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getFooter()Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llb1/y2;->e(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;)Lf01/g1;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v6

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;->getLogButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Llb1/y2;->f(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v6

    :cond_1
    move-object v7, v6

    new-instance v1, Lf01/l1;

    move-object v6, v0

    invoke-direct/range {v1 .. v8}, Lf01/l1;-><init>(Ljava/lang/String;Lgz0/m0;Lf01/f1;Lf11/e;Lf01/g1;Lny0/h;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t2;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/y2$a;

    invoke-direct {v2, v0}, Llb1/y2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/y2;->g(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;)Lf01/l1;

    move-result-object p0

    return-object p0
.end method

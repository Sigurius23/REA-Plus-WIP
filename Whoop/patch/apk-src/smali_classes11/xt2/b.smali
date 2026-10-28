.class public abstract Lxt2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "h",
        "()Ljb1/a;",
        "weeklyPlanDesignItemReducer",
        "weekly-plan_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxl0/b;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lxt2/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxt2/b;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 0

    invoke-static {p0}, Lxt2/b;->o(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxt2/b;->j(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxt2/b;->l(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;)Lzt2/b;
    .locals 0

    invoke-static {p0}, Lxt2/b;->m(Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;)Lzt2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveries;)Lzt2/n;
    .locals 0

    invoke-static {p0}, Lxt2/b;->k(Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveries;)Lzt2/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxt2/b;->n(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h()Ljb1/a;
    .locals 1

    sget-object v0, Lxt2/b;->a:Ljb1/a;

    return-object v0
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk71/m;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lxt2/b$a;

    invoke-direct {v1}, Lxt2/b$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lxl0/b;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lxl0/b;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lxl0/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxl0/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    const-class v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveries;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lxt2/b$b;

    invoke-direct {v2, v0}, Lxt2/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveries;)Lzt2/n;
    .locals 6

    const-string v0, "loggedRecoveriesModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveries;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveryItem;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveryItem;->getTextDisplay()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v4

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveryItem;->getIcon()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v4

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveryItem;->getEnabled()Z

    move-result v2

    new-instance v5, Lzt2/l;

    invoke-direct {v5, v3, v4, v2}, Lzt2/l;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Z)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/LoggedRecoveries;->getGoalId()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lzt2/n;

    invoke-direct {v0, v1, p0}, Lzt2/n;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final l(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxl0/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    const-class v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lxt2/b$c;

    invoke-direct {v2, v0}, Lxt2/b$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;)Lzt2/b;
    .locals 5

    const-string v0, "addGoalCardModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v1, Ly71/g;

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;->getLeftIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    new-instance v2, Ly71/g;

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;->getRightIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/AddGoalCard;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    new-instance v3, Lzt2/b;

    invoke-direct {v3, v1, v0, v2, p0}, Lzt2/b;-><init>(Ly71/g;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/navigation/e;)V

    return-object v3
.end method

.method private static final n(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxl0/b;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lxl0/b;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lxt2/b$d;

    invoke-direct {v2, v0}, Lxt2/b$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 17

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Llb1/i1;->c(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object v1

    sget-object v9, Lf01/q1;->HAL:Lf01/q1;

    const/16 v15, 0x1f7f

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lk11/f;->b(Lk11/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lny0/h;Lny0/h;Lf01/q1;Lk11/a;ZZLcom/whoop/analytics/AnalyticEventModel;FILjava/lang/Object;)Lk11/f;

    move-result-object v0

    return-object v0
.end method

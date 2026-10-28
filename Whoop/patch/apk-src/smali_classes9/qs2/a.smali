.class public abstract Lqs2/a;
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
        "o",
        "()Ljb1/a;",
        "aiPlansDesignItemReducer",
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

    new-instance v0, Lqe0/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lqe0/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lqs2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;)Lus2/a;
    .locals 0

    invoke-static {p0}, Lqs2/a;->j(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;)Lus2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 0

    invoke-static {p0}, Lqs2/a;->n(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqs2/a;->k(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;
    .locals 0

    invoke-static {p0}, Lqs2/a;->l(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqs2/a;->m(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqs2/a;->i(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqs2/a;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqe0/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lqe0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lqe0/b;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lqe0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lny0/p0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqs2/a$a;

    invoke-direct {v2}, Lqs2/a$a;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Ld11/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqs2/a$b;

    invoke-direct {v2}, Lqs2/a$b;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Ly41/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqs2/a$c;

    invoke-direct {v2}, Lqs2/a$c;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lk11/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lqs2/a$d;

    invoke-direct {v1}, Lqs2/a$d;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqe0/b;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lqe0/b;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lqs2/a$e;

    invoke-direct {v3, v0}, Lqs2/a$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lqe0/b;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lqe0/b;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/AnnotatedTextModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqs2/a$f;

    invoke-direct {v2, v0}, Lqs2/a$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;)Lus2/a;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqe0/b;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lqe0/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lus2/a;

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->getHeaderSection()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp31/l;

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->getErrorState()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    invoke-direct {v1, v2, v3, p0}, Lus2/a;-><init>(Lp31/l;Ljava/lang/String;Lm91/u;)V

    return-object v1
.end method

.method private static final k(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsz0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnnotatedTextModel;->getText()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final m(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqe0/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lqe0/b;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqs2/a$g;

    invoke-direct {v2, v0}, Lqs2/a$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 38

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Llb1/i1;->c(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object v1

    sget-object v9, Lf01/q1;->HAL:Lf01/q1;

    invoke-virtual {v1}, Lk11/f;->j()Lny0/h;

    move-result-object v10

    if-eqz v10, :cond_0

    sget-object v17, Lny0/p;->HIGHLIGHT:Lny0/p;

    const v36, 0x1ffffbd

    const/16 v37, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v10 .. v37}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v15, 0x1f5f

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

.method public static final o()Ljb1/a;
    .locals 1

    sget-object v0, Lqs2/a;->a:Ljb1/a;

    return-object v0
.end method

.class public abstract Lc41/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a9\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\"\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/i1;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lm91/u;",
        "legendItems",
        "v",
        "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "t",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Ls01/d;",
        "a",
        "Ls01/d;",
        "sampleWhoopCoachVow",
        "b",
        "Ljava/util/List;",
        "z",
        "()Ljava/util/List;",
        "sampleContributorTiles",
        "design_release"
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
.field private static final a:Ls01/d;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/i1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 19

    const-string v0, "Your HRV is elevated while your RHR, Respiratory Rate, and Sleep Performance are all typical, resulting in a higher Recovery today."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v1, "toUpperCase(...)"

    const-string v3, "Learn More with Coach"

    invoke-static {v0, v3, v1}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v8, Ls01/c;->NORMAL:Ls01/c;

    sget-object v4, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    new-instance v1, Ls01/d;

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v10}, Ls01/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ls01/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lc41/b1;->a:Ls01/d;

    invoke-static {}, Lc41/f1;->t()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lc41/g1;

    const/16 v16, 0x77f

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Lc41/g1;->b(Lc41/g1;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;ILjava/lang/Object;)Lc41/g1;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v4, Ln21/e;

    sget-object v0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v6

    const-string v0, "Poor"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v12, Ln21/i;->RECTANGLE_SMALL:Ln21/i;

    sget-object v14, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v13, 0xd1

    move-object v10, v14

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v8, v12

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ln21/e;

    sget-object v1, Ly81/f;->WHITE_10:Ly81/f;

    invoke-static {v1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v1

    const-string v2, "Sufficient"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v17, 0xd1

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v8

    move-object v14, v10

    move-object v8, v0

    move-object v10, v1

    invoke-direct/range {v8 .. v18}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v12

    move-object v10, v14

    new-instance v1, Ln21/e;

    sget-object v2, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    invoke-static {v2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v2

    const-string v5, "Optimal"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move-object v8, v1

    move-object v10, v2

    invoke-direct/range {v8 .. v18}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v4, v0, v8}, [Ln21/e;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    sget-object v0, Lc41/b1;->a:Ls01/d;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v1, Lc41/i1;

    const-string v2, ""

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x28

    invoke-direct/range {v1 .. v9}, Lc41/i1;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm91/u;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/b1;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/b1;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk91/b;Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/b1;->m(Lk91/b;Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/b1;->p(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/b1;->r(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lk91/b;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1}, Lc41/b1;->n(Lk91/b;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/b1;->q(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/ArrayList;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/b1;->w(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc41/b1;->s(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lk91/b;Li2/u0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/b1;->o(Lk91/b;Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc41/b1;->y(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/b1;->x(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/i1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p2

    move/from16 v0, p4

    const-string v3, "modifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "viewState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v3, 0x38bba4f7

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    move v11, v3

    and-int/lit16 v3, v11, 0x93

    const/16 v5, 0x92

    const/4 v13, 0x0

    if-eq v3, v5, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    move v3, v13

    :goto_4
    and-int/lit8 v5, v11, 0x1

    invoke-virtual {v7, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1a

    sget-object v3, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v3}, Lkd1/w;->a()Lk91/a;

    move-result-object v3

    invoke-virtual {v3}, Lk91/a;->d()Lk91/b;

    move-result-object v3

    const-wide/high16 v8, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v8

    int-to-float v14, v4

    mul-float/2addr v5, v14

    sget-object v4, Li2/t;->b:Li2/s;

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v15, 0x6

    invoke-virtual {v8, v7, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    move/from16 v16, v11

    invoke-virtual {v9}, Ly81/i;->a1()J

    move-result-wide v10

    new-instance v9, Li2/x;

    invoke-direct {v9, v10, v11}, Li2/x;-><init>(J)V

    invoke-virtual {v8, v7, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->V0()J

    move-result-wide v10

    const/16 v17, 0x1

    new-instance v12, Li2/x;

    invoke-direct {v12, v10, v11}, Li2/x;-><init>(J)V

    filled-new-array {v9, v12}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const v10, 0x44098000    # 550.0f

    const/16 v11, 0xa

    const/4 v12, 0x0

    invoke-static {v4, v9, v12, v10, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v4

    invoke-static {v5, v1, v4, v3}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8, v7, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v8

    invoke-static {v4, v8, v9, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    new-instance v8, Lc41/z0;

    const/4 v5, 0x0

    invoke-direct {v8, v3, v5}, Lc41/z0;-><init>(Lk91/b;I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v8}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_9

    if-ne v8, v9, :cond_a

    :cond_9
    new-instance v8, Lc41/z0;

    const/4 v5, 0x1

    invoke-direct {v8, v3, v5}, Lc41/z0;-><init>(Lk91/b;I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v8}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v7, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-nez v10, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    invoke-static {v5, v7, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v10, v7, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-eqz v2, :cond_e

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_f

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    invoke-static {v12, v7, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v7, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x2

    int-to-float v2, v1

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v13, v2, v12

    move/from16 v19, v2

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    mul-float/2addr v1, v12

    invoke-static {v0, v13, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v3, v10, v7, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object v10, v3

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_11
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v7, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    invoke-static {v2, v7, v2, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v7, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x6598dd5d

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lc41/i1;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v20, v2, 0x1

    if-ltz v2, :cond_15

    check-cast v3, Lm91/u;

    new-instance v5, Lf;

    const/16 v4, 0x16

    invoke-direct {v5, v4}, Lf;-><init>(I)V

    shl-int/lit8 v4, v16, 0x3

    and-int/lit16 v8, v4, 0x1c00

    const/4 v9, 0x2

    const/4 v4, 0x0

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p1 .. p1}, Lc41/i1;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v2, v4, :cond_14

    const v2, 0x7a4dfce7

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move/from16 v2, v17

    int-to-float v4, v2

    mul-float/2addr v4, v12

    const/4 v5, 0x0

    invoke-static {v0, v5, v4, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v18, v5

    sget-object v5, Lhy0/g;->SOLID:Lhy0/g;

    const/16 v15, 0x36

    move/from16 v6, v16

    const/16 v16, 0xfc

    move v8, v6

    const/4 v6, 0x0

    move v9, v14

    move-object v14, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    move v11, v10

    const-wide/16 v9, 0x0

    move/from16 v21, v11

    move/from16 v22, v12

    const-wide/16 v11, 0x0

    move/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 p3, v1

    move v1, v2

    move/from16 v3, v23

    const/4 v2, 0x0

    invoke-static/range {v4 .. v16}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v14

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_14
    move-object/from16 p3, v1

    move/from16 v22, v12

    move v3, v13

    move/from16 v21, v16

    move/from16 v1, v17

    const/4 v2, 0x0

    move/from16 v17, v14

    const v4, 0x7a5154cb

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_9
    move-object/from16 v6, p2

    move v13, v3

    move/from16 v14, v17

    move/from16 v2, v20

    move/from16 v16, v21

    move/from16 v12, v22

    move/from16 v17, v1

    move-object/from16 v1, p3

    goto/16 :goto_8

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    move/from16 v22, v12

    move v3, v13

    move/from16 v21, v16

    move/from16 v1, v17

    const/4 v2, 0x0

    move/from16 v17, v14

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v3, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->t()J

    move-result-wide v4

    move/from16 v9, v17

    move/from16 v6, v19

    invoke-static {v3, v6, v9, v4, v5}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v1

    mul-float v4, v4, v22

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    mul-float v5, v5, v22

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lc41/i1;->f()Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_17

    const v4, -0x13facd8e

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object/from16 v6, p2

    move/from16 v11, v21

    goto :goto_a

    :cond_17
    const v5, -0x13facd8d

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    move/from16 v11, v21

    and-int/lit16 v5, v11, 0x380

    move-object/from16 v6, p2

    invoke-static {v3, v4, v6, v7, v5}, Lc41/b1;->v(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lc41/i1;->h()Lm91/u;

    move-result-object v4

    if-nez v4, :cond_18

    const v3, -0x13f7fb3b

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_18
    const v5, -0x13f7fb3a

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    new-instance v5, Law0/a;

    const/4 v8, 0x2

    invoke-direct {v5, v8, v3}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    shl-int/lit8 v3, v11, 0x3

    and-int/lit16 v8, v3, 0x1c00

    const/4 v9, 0x2

    move-object v3, v4

    const/4 v4, 0x0

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual/range {p1 .. p1}, Lc41/i1;->e()F

    move-result v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, -0x63bd8427

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lc41/i1;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    new-instance v5, Lf;

    const/16 v4, 0x17

    invoke-direct {v5, v4}, Lf;-><init>(I)V

    shl-int/lit8 v4, v11, 0x3

    and-int/lit16 v8, v4, 0x1c00

    const/4 v9, 0x2

    const/4 v4, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_19
    invoke-static {v7, v2, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_d

    :cond_1a
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lj;

    const/16 v5, 0x17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final m(Lk91/b;Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Li2/x0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Li2/x0;->e(Z)V

    invoke-virtual {p1, p0}, Li2/x0;->t(Li2/a1;)V

    const/4 p0, 0x2

    invoke-virtual {p1, p0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lk91/b;Lf2/d;)Lf2/g;
    .locals 10

    const-string v0, "$this$drawWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v0}, Lf2/b;->d()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v7, v0, v1

    sget-object v3, Li2/t;->b:Li2/s;

    sget-wide v0, Li2/x;->f:J

    const v4, 0x3dcccccd    # 0.1f

    invoke-static {v4, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    const/4 v4, 0x0

    invoke-static {v4, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v5, Li2/x;

    invoke-direct {v5, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v6, v5}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v8, v1

    shl-long v1, v5, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v4, v8

    or-long v5, v1, v4

    const/16 v8, 0x8

    move-object v4, v0

    invoke-static/range {v3 .. v8}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v0

    new-instance v1, Lbe1/c;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p0, v0}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lk91/b;Li2/t;Lk2/c;)Ll83/a0;
    .locals 7

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lk91/b;->j()Li2/s0;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v4, 0x0

    move-object v3, p1

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    move-object p2, v1

    check-cast p2, La3/p0;

    invoke-virtual {p2}, La3/p0;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x2cd6d6c7

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x51247b60

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final r(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x9927ad7

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lc41/b1;->l(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x426aec79

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lc41/b1$a;

    invoke-direct {v1}, Lc41/b1$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lc41/b1;->t(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v11, p4

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v1, -0x776ecf4e

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    const/4 v12, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v12

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    move-object/from16 v14, p2

    if-nez v2, :cond_5

    invoke-virtual {v4, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    move v7, v1

    and-int/lit16 v1, v7, 0x93

    const/16 v2, 0x92

    const/4 v8, 0x1

    const/4 v15, 0x0

    if-eq v1, v2, :cond_6

    move v1, v8

    goto :goto_4

    :cond_6
    move v1, v15

    :goto_4
    and-int/lit8 v2, v7, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    move-object v1, v10

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ln21/e;

    if-eqz v6, :cond_7

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lm91/u;

    instance-of v6, v6, Ln21/e;

    if-nez v6, :cond_9

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    const v1, 0x77f61c1e

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lb30/a1;

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, 0x5181d232

    invoke-static {v2, v4, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit8 v1, v7, 0xe

    const/high16 v2, 0x180000

    or-int v8, v1, v2

    const/16 v9, 0x3e

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v0

    move-object v4, v7

    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :cond_b
    move-object v9, v0

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    const v0, 0x77fa4c48

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/m;->a:Ll0/e;

    sget-object v1, Lb2/e;->J:Lb2/l;

    invoke-static {v0, v1, v4, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v1, v4, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x49f9f4fa

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    shl-int/lit8 v1, v7, 0x3

    and-int/lit16 v5, v1, 0x1c00

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v14

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, p2

    goto :goto_8

    :cond_f
    invoke-static {v4, v15, v8, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_9

    :cond_10
    const v0, 0x77fdb330

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    :goto_9
    int-to-float v0, v12

    const/4 v1, 0x4

    int-to-float v1, v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1, v2, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_a

    :cond_11
    move-object v9, v0

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lc41/a1;

    const/4 v5, 0x0

    move-object/from16 v3, p2

    move-object v1, v9

    move-object v2, v10

    move v4, v11

    invoke-direct/range {v0 .. v5}, Lc41/a1;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final w(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string v0, "$this$FlowRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ln21/e;

    new-instance p1, Ln21/d;

    invoke-direct {p1}, Ln21/d;-><init>()V

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float p3, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr p3, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p3, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v9, 0xfe

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Ln21/e;->e(Ln21/e;Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILjava/lang/Object;)Ln21/e;

    move-result-object p3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v0, Lc31/m;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lc31/m;-><init>(I)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v1, 0x30

    invoke-virtual {p1, p3, v0, p2, v1}, Ln21/d;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    :cond_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lc41/b1;->v(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/i1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/b1;->b:Ljava/util/List;

    return-object v0
.end method

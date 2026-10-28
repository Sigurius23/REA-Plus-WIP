.class public final Lny0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lny0/i0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lny0/p0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lny0/i0;",
        "Lm91/f;",
        "Lny0/p0;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
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

.method public static synthetic a(Lny0/i0;Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lny0/i0;->i(Lny0/i0;Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lny0/i0;->h(Lny0/p0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lny0/p0;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lny0/i0;->g(Lny0/p0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lny0/i0;->f(Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "buttonModifier"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p4, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v9

    :goto_2
    and-int/lit8 v7, v3, 0x1

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v0}, Lny0/p0;->l()Lny0/m0;

    move-result-object v6

    sget-object v7, Lny0/i0$a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/16 v7, 0xe

    sget-object v10, Lp1/l;->a:Lp1/v0;

    const/4 v11, 0x3

    if-eq v6, v8, :cond_8

    if-eq v6, v5, :cond_4

    if-ne v6, v11, :cond_3

    goto :goto_3

    :cond_3
    const v0, 0x32a224d6

    invoke-static {v0, v13, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_4
    :goto_3
    const v4, 0x21b83706

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lny0/p0;->c()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-virtual {v0}, Lny0/p0;->g()Lj02/s;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-virtual {v0}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object v4

    :cond_5
    move-object v11, v4

    move v4, v3

    invoke-virtual {v0}, Lny0/p0;->i()Ly71/g;

    move-result-object v3

    move v5, v4

    invoke-virtual {v0}, Lny0/p0;->k()Ly71/g;

    move-result-object v4

    move v6, v9

    invoke-virtual {v0}, Lny0/p0;->p()Z

    move-result v9

    move v12, v5

    invoke-virtual {v0}, Lny0/p0;->h()Z

    move-result v5

    move v14, v6

    invoke-virtual {v0}, Lny0/p0;->n()Ly81/e;

    move-result-object v6

    move v15, v7

    invoke-virtual {v0}, Lny0/p0;->o()Lj91/b;

    move-result-object v7

    invoke-virtual {v0}, Lny0/p0;->q()Z

    move-result v16

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v17, v17, v18

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v17, :cond_6

    if-ne v14, v10, :cond_7

    :cond_6
    new-instance v14, Llf0/s0;

    invoke-direct {v14, v0, v1, v8}, Llf0/s0;-><init>(Lny0/p0;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v14, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v0, v12, 0xe

    const/4 v15, 0x0

    move/from16 v8, v16

    const/16 v16, 0x402

    const/4 v1, 0x0

    const/4 v10, 0x0

    move-object v12, v14

    move v14, v0

    move-object/from16 v0, p2

    invoke-static/range {v0 .. v16}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :cond_8
    move v15, v7

    move v6, v9

    const v3, 0x32a229be

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-static {v2, v3, v11}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lny0/p0;->h()Z

    move-result v7

    invoke-virtual {v0}, Lny0/p0;->k()Ly71/g;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ly71/g;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_9
    int-to-float v4, v4

    mul-float v8, v4, v4

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v11, Lg1/v0;->a:Ll0/l1;

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v11, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->W0()J

    move-result-wide v16

    invoke-virtual {v11, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v11, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->W0()J

    move-result-wide v20

    invoke-virtual {v11, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->X0()J

    move-result-wide v11

    move-object v14, v10

    move-wide/from16 v30, v18

    move-object/from16 v18, v13

    move-wide/from16 v32, v16

    move-wide/from16 v16, v11

    move-wide/from16 v10, v32

    move-wide/from16 v12, v30

    const/16 v19, 0x0

    move-object/from16 v22, v14

    move-wide/from16 v30, v20

    move/from16 v21, v15

    move-wide/from16 v14, v30

    const/16 v20, 0x0

    move-object/from16 v6, v22

    invoke-static/range {v10 .. v20}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v19

    move-object/from16 v13, v18

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    int-to-float v5, v5

    mul-float v23, v5, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v5, v4

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    mul-float/2addr v10, v4

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v5, v10, v5, v10}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_a

    if-ne v10, v6, :cond_b

    :cond_a
    new-instance v10, Lmi2/o;

    const/16 v15, 0xe

    invoke-direct {v10, v0, v1, v15}, Lmi2/o;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v25, v10

    check-cast v25, Lc93/a;

    const/16 v28, 0x6c30

    const/16 v29, 0x430

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v27, 0xc00d80

    move-object v10, v2

    move-object/from16 v16, v3

    move-object/from16 v24, v4

    move v11, v7

    move-object/from16 v17, v8

    move-object/from16 v26, v18

    move-object/from16 v18, v9

    invoke-static/range {v10 .. v29}, Lny0/z;->e(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;Lb91/a;FLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lny0/p0;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lny0/p0;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1, v0, p1}, Lev/n;->y(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    invoke-virtual {p0}, Lny0/p0;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lny0/p0;->g()Lj02/s;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object v0

    :cond_1
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lny0/p0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lny0/p0;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, p0, p1}, Lev/n;->y(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lny0/i0;Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lny0/i0;->e(Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lny0/p0;

    invoke-virtual/range {p0 .. p5}, Lny0/i0;->e(Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public e(Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lny0/p0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, 0x7487fe61

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v0, 0x93

    const/16 v3, 0x92

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_6

    move v2, v5

    goto :goto_4

    :cond_6
    move v2, v4

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Lih1/f;

    const/16 v3, 0x1c

    invoke-direct {v2, v3, p2, p3}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x132098e2

    invoke-static {v3, p4, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    invoke-virtual {p2}, Lny0/p0;->e()Lk81/a;

    move-result-object v3

    sget-object v6, Lny0/i0$a;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v6, v3

    if-eq v3, v5, :cond_8

    if-eq v3, v1, :cond_8

    const/4 v1, 0x3

    if-ne v3, v1, :cond_7

    const v1, 0x72836b31

    invoke-virtual {p4, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, p1, p4, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_7

    :cond_7
    const p1, 0x72832cbf

    invoke-static {p1, p4, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p1

    throw p1

    :cond_8
    const v0, -0x221c387a

    invoke-virtual {p4, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p2}, Lny0/p0;->e()Lk81/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v6, v1

    if-ne v1, v5, :cond_9

    sget-object v1, Lb2/e;->F:Lb2/m;

    goto :goto_5

    :cond_9
    sget-object v1, Lb2/e;->E:Lb2/m;

    :goto_5
    invoke-static {v1, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v6, p4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p4}, Lp1/q;->i0()V

    iget-boolean v8, p4, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {p4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p4, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, p4, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v3, p4, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/16 v1, 0x36

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, p4, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    invoke-virtual {p4, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_e

    new-instance v0, Lno0/m0;

    const/16 v6, 0x13

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lno0/m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

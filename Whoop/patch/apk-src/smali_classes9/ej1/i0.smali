.class public abstract Lej1/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lej1/j0;",
        "itemState",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Lej1/j0;Landroidx/compose/runtime/Composer;II)V",
        "health_release"
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
.method public static synthetic a(Lej1/j0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lej1/i0;->e(Lej1/j0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lej1/j0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lej1/i0;->g(Landroidx/compose/ui/Modifier;Lej1/j0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lej1/i0;->f(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lej1/j0;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    const-string v0, "itemState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p2

    check-cast v8, Lp1/q;

    const p2, 0x145fb4ac

    invoke-virtual {v8, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p4, 0x1

    if-eqz p2, :cond_0

    or-int/lit8 v0, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_5

    move v1, v4

    goto :goto_3

    :cond_5
    move v1, v3

    :goto_3
    and-int/2addr v0, v4

    invoke-virtual {v8, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz p2, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object p2, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {p2}, Lkd1/w;->b()Lk91/a;

    move-result-object p2

    invoke-virtual {p2}, Lk91/a;->c()Lt0/i;

    move-result-object v2

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->q()J

    move-result-wide v4

    int-to-float v6, v3

    new-instance p2, Lej1/h;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v0, 0x7bf99d0f

    invoke-static {v0, v8, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0x1b0000

    const/16 v10, 0x18

    move-wide v3, v4

    const/4 v5, 0x0

    invoke-static/range {v1 .. v10}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    move-object v1, p0

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_4

    :goto_5
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v0, Ld62/b;

    const/16 v5, 0xd

    move-object v3, p1

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(Lej1/j0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    sget-object v0, Lb2/e;->K:Lb2/l;

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p2, 0x1

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v1, v5

    int-to-float v4, v4

    mul-float/2addr v4, v5

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v4, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    :cond_2
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lej1/j0;->c()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_11

    const v6, 0x4d12c43a    # 1.5389584E8f

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, Ll0/m;->f:Ll0/h;

    const/16 v2, 0x36

    invoke-static {v15, v0, v11, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v15

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v11, v12, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2, v11, v2, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x69e2aae8

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lej1/j0;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v32, v3, 0x1

    if-ltz v3, :cond_f

    move-object v14, v6

    check-cast v14, Lej1/z;

    invoke-virtual {v14}, Lej1/z;->c()Lhy0/b2;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v11, v7}, Lhy0/z1;->g(Lhy0/b2;Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v6

    invoke-virtual {v6}, Lhy0/a2;->e()J

    move-result-wide v8

    invoke-virtual {v14}, Lej1/z;->c()Lhy0/b2;

    move-result-object v6

    invoke-static {v6, v11, v7}, Lhy0/z1;->g(Lhy0/b2;Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v6

    invoke-virtual {v6}, Lhy0/a2;->c()J

    move-result-wide v6

    move/from16 p2, v5

    move-wide/from16 v16, v6

    const/high16 v15, 0x3f800000    # 1.0f

    float-to-double v5, v15

    const-wide/16 v18, 0x0

    cmpl-double v5, v5, v18

    if-lez v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v6, 0x1

    invoke-direct {v5, v15, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lej1/j0;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-le v7, v6, :cond_8

    if-nez v3, :cond_8

    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v7, v10, :cond_9

    new-instance v7, Lej1/n;

    const/16 v12, 0x9

    invoke-direct {v7, v12}, Lej1/n;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6, v7}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->e:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v0, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move-wide/from16 v18, v8

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    invoke-static {v7, v11, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v14}, Lej1/z;->b()Lgz0/m0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    const/4 v12, 0x0

    move-object v5, v10

    move-wide/from16 v9, v16

    move-wide/from16 v7, v18

    invoke-static/range {v6 .. v12}, Lhy0/w1;->e(IJJLandroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v14}, Lej1/z;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v11, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v7, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v30, v7, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move-object/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    move-object/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move-object/from16 v33, v27

    const/16 v27, 0x0

    move/from16 v34, v29

    const/16 v29, 0x0

    move-object/from16 v35, v33

    move-object/from16 v33, v0

    move-object/from16 v0, v35

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v6, 0x1

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lej1/j0;->c()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    if-eq v3, v7, :cond_e

    const v3, 0x25b34c3e

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const-wide/high16 v7, 0x401a000000000000L    # 6.5

    double-to-float v3, v7

    mul-float v3, v3, p2

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v7, v6

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_d

    sget-object v6, Lej1/i0$a;->w:Lej1/i0$a;

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-static {v3, v5}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v3, v11, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    const/4 v7, 0x0

    const v3, 0x25b80c82

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_7
    move/from16 v5, p2

    move-object v13, v0

    move/from16 v3, v32

    move-object/from16 v0, v33

    goto/16 :goto_3

    :cond_f
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_10
    move-object v0, v13

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v11, v7, v6, v7}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_8

    :cond_11
    move v7, v3

    move-object v0, v13

    const v2, 0x4d301d7d    # 1.8467016E8f

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lej1/j0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_12

    const v0, 0x4d30de44

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v6, 0x1

    goto :goto_b

    :cond_12
    const v3, 0x4d30de45    # 1.8545979E8f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lej1/j0;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_13

    const v3, -0x7ee26496

    invoke-static {v11, v3, v0, v1, v11}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_13
    const v0, -0x7ee15a0f

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_a
    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v0, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v30, v0, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_b
    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float v2, v0, v0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lej1/j0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lej1/i0;->d(Landroidx/compose/ui/Modifier;Lej1/j0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

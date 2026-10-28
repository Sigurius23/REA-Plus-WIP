.class public abstract Lig0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lgg0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lgg0/a;",
        "Ll83/a0;",
        "onEvent",
        "Lf0/r1;",
        "scrollState",
        "f",
        "(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;Landroidx/compose/runtime/Composer;II)V",
        "advanced-labs-join_release"
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
.method public static synthetic a(Lf0/r1;Lgg0/c$e;Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lig0/f;->h(Lf0/r1;Lgg0/c$e;Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lig0/f;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lig0/f;->k(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgg0/c;Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lig0/f;->i(Lgg0/c;Lkotlin/jvm/functions/Function1;Lm91/u;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Lig0/f;->j(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;Landroidx/compose/runtime/Composer;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lf0/r1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x1670e180

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v1, v6, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v6, 0x180

    if-nez v1, :cond_6

    and-int/lit8 v1, p5, 0x4

    if-nez v1, :cond_4

    move-object/from16 v1, p2

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    move-object/from16 v1, p2

    :cond_5
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    goto :goto_4

    :cond_6
    move-object/from16 v1, p2

    :goto_4
    and-int/lit16 v5, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v5, v8, :cond_7

    move v5, v9

    goto :goto_5

    :cond_7
    move v5, v10

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v7, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v5, v6, 0x1

    if-eqz v5, :cond_9

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v7}, Lp1/q;->X()V

    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_a

    :goto_6
    and-int/lit16 v0, v0, -0x381

    goto :goto_8

    :cond_9
    :goto_7
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_a

    invoke-static {v10, v7, v9}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v1

    goto :goto_6

    :cond_a
    :goto_8
    invoke-virtual {v7}, Lp1/q;->r()V

    invoke-virtual {p0}, Lgg0/c;->c()Lgg0/c$e;

    move-result-object v5

    if-eqz v5, :cond_11

    const v8, 0x7a170d2a

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lgg0/c$e;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_b

    move v12, v9

    goto :goto_9

    :cond_b
    move v12, v10

    :goto_9
    or-int/2addr v11, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_c

    if-ne v12, v13, :cond_d

    :cond_c
    new-instance v12, Lig0/f$a;

    const/4 v11, 0x0

    invoke-direct {v12, p0, p1, v11}, Lig0/f$a;-><init>(Lgg0/c;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v12, Lc93/m;

    invoke-static {v7, v12, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-ne v0, v2, :cond_e

    goto :goto_a

    :cond_e
    move v9, v10

    :goto_a
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_f

    if-ne v0, v13, :cond_10

    :cond_f
    new-instance v0, Lif0/b;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v8, v0

    check-cast v8, Lc93/a;

    new-instance v9, Lc4/a0;

    const/4 v0, 0x3

    invoke-direct {v9, v0}, Lc4/a0;-><init>(I)V

    new-instance v0, Lat2/u;

    move-object v2, v5

    const/16 v5, 0xf

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    const v2, -0xa33b44e

    invoke-static {v2, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x1b0

    invoke-static {v8, v9, v0, v7, v2}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const v0, 0x7a4a14c2

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_b
    move-object v5, v1

    goto :goto_c

    :cond_12
    invoke-virtual {v7}, Lp1/q;->X()V

    goto :goto_b

    :goto_c
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lhy0/v;

    const/16 v3, 0xb

    move-object v4, p0

    move/from16 v2, p5

    move v1, v6

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lgg0/a$e;->a:Lgg0/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lf0/r1;Lgg0/c$e;Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    and-int/lit8 v2, p5, 0x3

    const/4 v3, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v6, p5, 0x1

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x3

    int-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v8, v9

    const/4 v12, 0x0

    invoke-static {v7, v10, v12, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v10, 0x4

    int-to-float v10, v10

    invoke-static {v7, v8, v10}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v8, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->o()J

    move-result-wide v14

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v14, v15, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v14, v7, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move/from16 p5, v13

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v33, v2

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v18, v9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_2
    move/from16 v18, v9

    :goto_2
    invoke-static {v12, v11, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v9, 0x2

    int-to-float v12, v9

    mul-float v12, v12, v18

    move/from16 v17, v10

    const/4 v10, 0x0

    invoke-static {v3, v12, v10, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0xe

    move-object/from16 v10, p0

    invoke-static {v3, v10, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x30

    invoke-static {v14, v7, v11, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v11, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v9, v11, v9, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float v10, v17, v18

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lgg0/c$e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move/from16 v2, p5

    invoke-virtual {v8, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->q()Lb91/a;

    move-result-object v27

    invoke-virtual {v8, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v9

    invoke-static/range {v33 .. v33}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v2, v2, 0x12

    const/high16 v3, 0xc00000

    or-int v31, v2, v3

    const v32, 0xfffa

    const/4 v8, 0x0

    move-object/from16 v29, v11

    move v2, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v3, v17

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v11, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v4, 0x2d0ae910

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lgg0/c$e;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgg0/c$a;

    const v7, 0x2d0af0c1

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lgg0/c$a;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm91/u;

    instance-of v8, v7, Lny0/h;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_9

    const v8, 0x1a156c23

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    move/from16 v15, v33

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v10, v8

    move-object v8, v7

    check-cast v8, Lny0/h;

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v7, :cond_7

    if-ne v12, v9, :cond_8

    :cond_7
    new-instance v12, Ld30/r;

    const/16 v7, 0x1c

    invoke-direct {v12, v0, v1, v8, v7}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v12, Lc93/a;

    move-object v7, v10

    move-object v10, v12

    const/4 v12, 0x6

    const/4 v13, 0x4

    const/4 v9, 0x0

    invoke-static/range {v7 .. v13}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move v8, v7

    goto :goto_6

    :cond_9
    move/from16 v15, v33

    const v8, 0x1a1faaaa

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_a

    if-ne v10, v9, :cond_b

    :cond_a
    new-instance v10, La80/j;

    const/16 v8, 0xa

    invoke-direct {v10, v1, v7, v8}, La80/j;-><init>(Lkotlin/jvm/functions/Function1;Lm91/u;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-static {v7, v10, v11, v8, v8}, Lig0/g;->v(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static {v3, v3, v6, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    move/from16 v33, v15

    goto/16 :goto_5

    :cond_c
    move/from16 v15, v33

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lgg0/c$a;->b()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;->getSpacing-D9Ej5fM()F

    move-result v5

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v11, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto/16 :goto_4

    :cond_d
    const/4 v8, 0x0

    invoke-static {v11, v8, v6, v2, v11}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lgg0/c;Lkotlin/jvm/functions/Function1;Lm91/u;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lgg0/c;->d()Lgg0/c$c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lgg0/c$c;->d()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lgg0/a$d;

    check-cast p2, Lny0/h;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p0, v1}, Lgg0/a$d;-><init>(Lny0/h;Ljava/lang/String;Z)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgg0/a$g;

    invoke-direct {v0, p2, p1}, Lgg0/a$g;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lig0/f;->f(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

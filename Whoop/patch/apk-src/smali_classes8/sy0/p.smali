.class public abstract Lsy0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aQ\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lsy0/k;",
        "whoopCheckboxType",
        "",
        "initialToggle",
        "isEnabled",
        "Li2/x;",
        "toggledColor",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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


# direct methods
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lsy0/p;->e(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsy0/p;->d(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lsy0/k;",
            "ZZJ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v8, p8

    const-string v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCheckboxType"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    const v0, 0x445bba6a

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v8, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_5

    move/from16 v6, p2

    invoke-virtual {v14, v6}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_8

    move/from16 v10, p3

    invoke-virtual {v14, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit16 v11, v8, 0x6000

    if-nez v11, :cond_d

    and-int/lit8 v11, p9, 0x10

    if-nez v11, :cond_b

    move-wide/from16 v11, p4

    invoke-virtual {v14, v11, v12}, Lp1/q;->f(J)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_8

    :cond_b
    move-wide/from16 v11, p4

    :cond_c
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v0, v13

    goto :goto_9

    :cond_d
    move-wide/from16 v11, p4

    :goto_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v8

    const/high16 v15, 0x20000

    if-nez v13, :cond_f

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    move v13, v15

    goto :goto_a

    :cond_e
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v0, v13

    :cond_f
    const v13, 0x12493

    and-int/2addr v13, v0

    const v3, 0x12492

    const/4 v5, 0x0

    if-eq v13, v3, :cond_10

    const/4 v3, 0x1

    goto :goto_b

    :cond_10
    move v3, v5

    :goto_b
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v14, v13, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v3, v8, 0x1

    const v17, -0xe001

    const/4 v13, 0x6

    if-eqz v3, :cond_13

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_12

    and-int v0, v0, v17

    :cond_12
    move/from16 v19, v10

    move-wide v3, v11

    goto :goto_d

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    move v6, v5

    :cond_14
    if-eqz v9, :cond_15

    const/4 v10, 0x1

    :cond_15
    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_12

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    and-int v0, v0, v17

    move/from16 v19, v10

    :goto_d
    invoke-virtual {v14}, Lp1/q;->r()V

    if-eqz v6, :cond_16

    const v9, -0x63a9132a

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    move-wide v9, v3

    goto :goto_e

    :cond_16
    const v9, -0x63a90eaf

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9, v14, v13, v5}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_e
    if-eqz v6, :cond_17

    const v11, -0x63a9072c

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11, v14, v13, v5}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_f
    move-wide/from16 v23, v11

    goto :goto_10

    :cond_17
    const v11, -0x63a902ec

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11, v14, v13, v5}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_f

    :goto_10
    const/high16 v11, 0x70000

    and-int/2addr v11, v0

    if-ne v11, v15, :cond_18

    const/4 v11, 0x1

    goto :goto_11

    :cond_18
    move v11, v5

    :goto_11
    and-int/lit16 v12, v0, 0x380

    const/16 v15, 0x100

    if-ne v12, v15, :cond_19

    const/4 v12, 0x1

    goto :goto_12

    :cond_19
    move v12, v5

    :goto_12
    or-int/2addr v11, v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_1a

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v12, v11, :cond_1b

    :cond_1a
    new-instance v12, Lam2/f0;

    const/4 v11, 0x6

    invoke-direct {v12, v7, v6, v11}, Lam2/f0;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v21, v12

    check-cast v21, Lkotlin/jvm/functions/Function1;

    const/16 v22, 0xc

    sget-object v17, Lb2/t;->w:Lb2/t;

    const/16 v20, 0x0

    move/from16 v18, v6

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/selection/d;->b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v12, v17

    move/from16 v35, v18

    move/from16 v11, v19

    const/4 v15, 0x3

    const/4 v13, 0x0

    invoke-static {v6, v13, v5, v15}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v11}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v9, v10, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    double-to-float v9, v9

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v9, v10

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x1

    int-to-float v10, v9

    const/4 v9, 0x4

    int-to-float v9, v9

    invoke-static {v6, v10, v9}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Lb2/e;->K:Lb2/l;

    sget-object v13, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v13, v10, v14, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    move-object/from16 p2, v6

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    move-object/from16 v13, p2

    invoke-static {v14, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    move/from16 p2, v0

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1c
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_13
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v14, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v14, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_1d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    :cond_1d
    invoke-static {v5, v14, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v14, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/a;->b()I

    move-result v5

    const/4 v6, 0x6

    invoke-static {v5, v14, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget v10, Lgy0/f;->J:I

    invoke-static {v14, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x5

    int-to-float v13, v13

    mul-float/2addr v13, v9

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    if-eqz v35, :cond_1f

    const v15, 0x48fa998

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v15

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1f
    const/4 v15, 0x0

    const v2, 0x48fadd8

    invoke-static {v14, v2, v0, v14, v6}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v16

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    move-wide/from16 v15, v16

    :goto_14
    const/16 v0, 0x180

    move/from16 v19, v11

    move-object/from16 v17, v12

    move-object v11, v13

    move-wide v12, v15

    const/16 v16, 0x0

    move v15, v0

    move v2, v9

    move/from16 v0, v19

    move-object v9, v5

    move-object/from16 v5, v17

    invoke-static/range {v9 .. v16}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v2, v5, v14}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    and-int/lit8 v2, p2, 0xe

    invoke-static {v1, v14, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lsy0/k;->a()Lb91/a;

    move-result-object v29

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    move-object/from16 v31, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v11, v23

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    const/4 v9, 0x1

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    move-wide v5, v3

    move/from16 v3, v35

    move v4, v0

    goto :goto_15

    :cond_20
    invoke-virtual {v14}, Lp1/q;->X()V

    move v3, v6

    move v4, v10

    move-wide v5, v11

    :goto_15
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_21

    new-instance v0, Lb30/r1;

    move-object/from16 v2, p1

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb30/r1;-><init>(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-wide v5, p4

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lsy0/p;->c(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

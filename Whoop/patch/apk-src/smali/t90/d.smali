.class public abstract Lt90/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aW\u0010\n\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Ll80/o;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Lc03/c;",
        "whoopStatusViewState",
        "Lh80/b;",
        "onAnalyticsEvent",
        "Lj80/b;",
        "onViewEvent",
        "g",
        "(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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
.method public static synthetic a(Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt90/d;->l(Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt90/d;->j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt90/d;->h(Lh80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt90/d;->i(Lj80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lt90/d;->m(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt90/d;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lc03/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p5

    const-string v0, "onNavigationEvent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStatusViewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x3351a3fa

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v6, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit8 v5, p6, 0x4

    const/16 v7, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v14, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit16 v12, v0, 0x493

    const/16 v13, 0x492

    const/4 v15, 0x0

    move/from16 p4, v5

    if-eq v12, v13, :cond_b

    const/4 v12, 0x1

    goto :goto_8

    :cond_b
    move v12, v15

    :goto_8
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v14, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_25

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz p4, :cond_d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v12, :cond_c

    new-instance v8, Lqc1/a;

    const/16 v13, 0x13

    invoke-direct {v8, v13}, Lqc1/a;-><init>(I)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lkotlin/jvm/functions/Function1;

    :cond_d
    if-eqz v9, :cond_f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v12, :cond_e

    new-instance v9, Lqc1/a;

    const/16 v11, 0x14

    invoke-direct {v9, v11}, Lqc1/a;-><init>(I)V

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_f
    move-object v9, v11

    :goto_9
    and-int/lit16 v11, v0, 0x380

    if-ne v11, v7, :cond_10

    const/4 v13, 0x1

    goto :goto_a

    :cond_10
    move v13, v15

    :goto_a
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v13, :cond_11

    if-ne v3, v12, :cond_12

    :cond_11
    new-instance v3, Lt90/d$a;

    const/4 v13, 0x0

    invoke-direct {v3, v8, v13}, Lt90/d$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lc93/m;

    sget-object v13, Ll83/a0;->a:Ll83/a0;

    invoke-static {v14, v3, v13}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object/from16 v17, v8

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_13

    invoke-virtual {v14, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_b
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v14, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-nez v15, :cond_14

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 v22, v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_c

    :cond_14
    move/from16 v22, v0

    :goto_c
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v14, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x3f4ccccd    # 0.8f

    invoke-static {v5, v13}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v7, Lx60/a;->d:I

    const/4 v15, 0x0

    invoke-static {v7, v14, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    move/from16 v20, v15

    const/16 v15, 0x61b0

    const/16 v21, 0x100

    const/16 v16, 0x68

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move/from16 v25, v11

    sget-object v11, Ly2/j;->b:Ly2/b1;

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move-object/from16 v29, v9

    move-object/from16 v28, v17

    move-object/from16 v32, v23

    move-object/from16 v31, v24

    move/from16 v30, v25

    move-object/from16 v33, v26

    move-object v9, v5

    move/from16 v5, v20

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v17, v7, v8

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v18, v7, v8

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v19, v17

    move-object/from16 v16, v27

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v10, v16

    move/from16 v9, v17

    sget v11, Lc03/c;->d:I

    shl-int/lit8 v11, v11, 0x3

    and-int/lit8 v12, v22, 0x70

    or-int/2addr v11, v12

    shl-int/lit8 v12, v22, 0x6

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v11, v12

    move/from16 v20, v5

    const/4 v5, 0x0

    move-object v12, v2

    move-object v2, v1

    move-object v1, v12

    move-object v12, v0

    move-object v0, v8

    move/from16 v15, v20

    const/high16 v13, 0x3f800000    # 1.0f

    move-object v8, v4

    move v4, v11

    move-object v11, v3

    move-object v3, v14

    const/4 v14, 0x2

    invoke-static/range {v0 .. v5}, Lm80/g;->d(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v13, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->H:Lb2/m;

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v4, v3, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_16

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v15, v31

    goto :goto_e

    :cond_16
    invoke-virtual {v3}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v3, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_17

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    :cond_17
    move-object/from16 v5, v32

    goto :goto_f

    :cond_18
    move-object/from16 v5, v32

    goto :goto_10

    :goto_f
    invoke-static {v13, v3, v13, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_10
    invoke-static {v3, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v1, v4, v3, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_19

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_19
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v3, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-nez v1, :cond_1a

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    :cond_1a
    invoke-static {v0, v3, v0, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v3, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->N:Lb2/k;

    new-instance v1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v1, v0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    const/4 v0, 0x0

    const/4 v14, 0x2

    invoke-static {v1, v9, v0, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v0, Lx60/a;->e:I

    const/4 v15, 0x0

    invoke-static {v0, v3, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    move/from16 v20, v15

    const/16 v15, 0x30

    const/16 v16, 0x78

    const/4 v8, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v14, v3

    move v1, v7

    move/from16 v5, v20

    move-object/from16 v4, v27

    const/high16 v3, 0x3f800000    # 1.0f

    move-object v7, v0

    move/from16 v0, v22

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/16 v7, 0xf

    int-to-float v7, v7

    invoke-static {v7, v1, v4, v14}, Ld;->w(FFLb2/t;Lp1/q;)V

    and-int/lit16 v0, v0, 0x1c00

    const/16 v1, 0x800

    if-ne v0, v1, :cond_1c

    const/4 v15, 0x1

    :goto_12
    move/from16 v7, v30

    const/16 v8, 0x100

    goto :goto_13

    :cond_1c
    move v15, v5

    goto :goto_12

    :goto_13
    if-ne v7, v8, :cond_1d

    const/4 v9, 0x1

    goto :goto_14

    :cond_1d
    move v9, v5

    :goto_14
    or-int/2addr v9, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1f

    move-object/from16 v9, v33

    if-ne v10, v9, :cond_1e

    goto :goto_15

    :cond_1e
    move-object/from16 v12, v28

    move-object/from16 v13, v29

    goto :goto_16

    :cond_1f
    move-object/from16 v9, v33

    :goto_15
    new-instance v10, Lt90/c;

    const/4 v11, 0x0

    move-object/from16 v12, v28

    move-object/from16 v13, v29

    invoke-direct {v10, v13, v11, v12}, Lt90/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v10, Lc93/a;

    if-ne v0, v1, :cond_20

    const/4 v15, 0x1

    goto :goto_17

    :cond_20
    move v15, v5

    :goto_17
    if-ne v7, v8, :cond_21

    const/4 v0, 0x1

    goto :goto_18

    :cond_21
    move v0, v5

    :goto_18
    or-int/2addr v0, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    if-ne v1, v9, :cond_23

    :cond_22
    new-instance v1, Lt90/c;

    const/4 v0, 0x1

    invoke-direct {v1, v13, v0, v12}, Lt90/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v1, Lc93/a;

    invoke-static {v10, v1, v14, v5}, Lt90/b;->c(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->I:Lb2/m;

    invoke-virtual {v2, v1, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_24

    new-instance v2, Lqc1/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lqc1/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/16 v3, 0x30

    invoke-static {v1, v2, v14, v3}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object v3, v12

    move-object v4, v13

    goto :goto_19

    :cond_25
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v8

    move-object v4, v11

    :goto_19
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Lb11/c;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v5, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb11/c;-><init>(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final h(Lh80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lj80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 10

    sget-object v0, Lj80/a$i0;->a:Lj80/a$i0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lh80/b$i;

    const/16 v8, 0x36

    const/4 v9, 0x0

    const-string v2, "start_screen"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "i_have_a_whoop_device"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 10

    sget-object v0, Lj80/a$j0;->a:Lj80/a$j0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lh80/b$i;

    const/16 v8, 0x36

    const/4 v9, 0x0

    const-string v2, "start_screen"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "i_do_not_have_a_whoop_device"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lk2/e;)Ll83/a0;
    .locals 11

    const-string v0, "$this$Canvas"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Li2/t;->b:Li2/s;

    const-wide v3, 0x800093e7L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    new-instance v0, Li2/x;

    invoke-direct {v0, v3, v4}, Li2/x;-><init>(J)V

    const-wide v3, 0x8066bcffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    filled-new-array {v0, v5}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v4

    const/16 v0, 0x20

    shr-long/2addr v4, v0

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v9, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v9, v0

    and-long/2addr v4, v7

    or-long/2addr v4, v9

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v6

    shr-long/2addr v6, v0

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const v6, 0x3f19999a    # 0.6f

    mul-float/2addr v6, v0

    const/16 v7, 0x8

    invoke-static/range {v2 .. v7}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v2

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lt90/d;->g(Lkotlin/jvm/functions/Function1;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

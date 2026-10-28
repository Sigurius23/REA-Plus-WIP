.class public abstract Lp72/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ae\u0010\u000c\u001a\u00020\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00082\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lm72/d;",
        "state",
        "Lg1/y3;",
        "modalBottomSheetState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "onHideRequest",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/e;",
        "onNavigationAction",
        "bodyContent",
        "e",
        "(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
        "sage_release"
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
.method public static synthetic a(Lm72/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp72/b;->h(Lm72/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp72/b;->g(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm72/d;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lp72/b;->f(Lm72/d;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lp72/b;->i(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm72/d;",
            "Lg1/y3;",
            "Lc93/a;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v0, p7

    const-string v4, "modalBottomSheetState"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onDismiss"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "bodyContent"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v5, 0x39944d06

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    const/4 v7, 0x4

    if-nez v5, :cond_2

    and-int/lit8 v5, v0, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v0

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    and-int/lit8 v8, v0, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_5

    and-int/lit8 v8, v0, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_3

    :cond_3
    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_3
    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_4

    :cond_4
    const/16 v8, 0x10

    :goto_4
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v0, 0x180

    const/16 v10, 0x100

    if-nez v8, :cond_7

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v10

    goto :goto_5

    :cond_6
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v5, v8

    :cond_7
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_a

    and-int/lit8 v8, p8, 0x8

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_6

    :cond_8
    move-object/from16 v8, p3

    :cond_9
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v5, v11

    goto :goto_7

    :cond_a
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v5, v5, 0x6000

    :cond_b
    move-object/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v0, 0x6000

    if-nez v12, :cond_b

    move-object/from16 v12, p4

    invoke-virtual {v4, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v5, v13

    :goto_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v0

    if-nez v13, :cond_f

    invoke-virtual {v4, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v5, v13

    :cond_f
    const v13, 0x12493

    and-int/2addr v13, v5

    const v14, 0x12492

    const/4 v15, 0x0

    const/16 v16, 0x1

    if-eq v13, v14, :cond_10

    move/from16 v13, v16

    goto :goto_b

    :cond_10
    move v13, v15

    :goto_b
    and-int/lit8 v14, v5, 0x1

    invoke-virtual {v4, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_1a

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v13, v0, 0x1

    const/4 v14, 0x0

    if-eqz v13, :cond_13

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v13

    if-eqz v13, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v11, p8, 0x8

    if-eqz v11, :cond_12

    and-int/lit16 v5, v5, -0x1c01

    :cond_12
    move v11, v5

    move-object v5, v8

    move-object v8, v12

    goto :goto_d

    :cond_13
    :goto_c
    and-int/lit8 v13, p8, 0x8

    if-eqz v13, :cond_14

    and-int/lit16 v5, v5, -0x1c01

    move-object v8, v3

    :cond_14
    if-eqz v11, :cond_12

    move v11, v5

    move-object v5, v8

    move-object v8, v14

    :goto_d
    invoke-virtual {v4}, Lp1/q;->r()V

    invoke-virtual {v2}, Lg1/y3;->b()Lg1/z3;

    move-result-object v12

    and-int/lit8 v13, v11, 0x70

    if-eq v13, v9, :cond_16

    and-int/lit8 v9, v11, 0x40

    if-eqz v9, :cond_15

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    goto :goto_e

    :cond_15
    move v9, v15

    goto :goto_f

    :cond_16
    :goto_e
    move/from16 v9, v16

    :goto_f
    and-int/lit16 v13, v11, 0x380

    if-ne v13, v10, :cond_17

    move/from16 v15, v16

    :cond_17
    or-int/2addr v9, v15

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_18

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_19

    :cond_18
    new-instance v10, Lp72/b$a;

    invoke-direct {v10, v2, v3, v14}, Lp72/b$a;-><init>(Lg1/y3;Lc93/a;Lq83/d;)V

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v10, Lc93/m;

    invoke-static {v4, v10, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v13, Lv41/g;

    const/16 v21, 0x7f

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v13 .. v22}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lv41/f$a;

    invoke-direct {v6, v2}, Lv41/f$a;-><init>(Lg1/y3;)V

    sget-object v9, Ly81/f;->BLACK_90:Ly81/f;

    const/4 v10, 0x3

    int-to-float v12, v10

    int-to-float v7, v7

    mul-float/2addr v12, v7

    const/16 v7, 0xc

    const/4 v14, 0x0

    invoke-static {v12, v12, v14, v14, v7}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v7

    new-instance v12, Lno0/h;

    const/4 v14, 0x6

    invoke-direct {v12, v1, v8, v5, v14}, Lno0/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v14, 0x29eab934

    invoke-static {v14, v4, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    sget v14, Lv41/g;->h:I

    shl-int/2addr v14, v10

    const v15, 0x6c00c00    # 7.2240005E-35f

    or-int/2addr v14, v15

    sget v15, Lv41/f$a;->c:I

    shl-int/lit8 v15, v15, 0x6

    or-int v20, v14, v15

    const v14, 0xe000

    shr-int/lit8 v10, v11, 0x3

    and-int v21, v10, v14

    const/16 v22, 0x3e31

    move-object/from16 v19, v4

    const/4 v4, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    move-object v10, v7

    move-object v7, v9

    const/4 v9, 0x0

    move-object v11, v12

    const/4 v12, 0x1

    move-object v15, v5

    move-object v5, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v24, v18

    move-object/from16 v18, p5

    invoke-static/range {v4 .. v22}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    goto :goto_10

    :cond_1a
    move-object/from16 v19, v4

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    move-object v4, v8

    move-object v5, v12

    :goto_10
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1b

    new-instance v0, Lp72/a;

    const/4 v9, 0x0

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lp72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final f(Lm72/d;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 42

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "$this$BottomSheet"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, p5, 0x6

    const/4 v6, 0x2

    if-nez v4, :cond_1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int v4, p5, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p5

    :goto_1
    and-int/lit8 v7, v4, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v7, v8, :cond_2

    move v7, v9

    goto :goto_2

    :cond_2
    move v7, v10

    :goto_2
    and-int/2addr v4, v9

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v4, v7}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_14

    if-nez p0, :cond_3

    const v0, -0x15f796b7

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_3
    const v4, -0x15f796b6

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    const/16 v4, 0x8

    int-to-float v4, v4

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    invoke-static {v7, v4, v11, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    check-cast v3, Ll0/z;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-virtual {v3, v11, v10, v12}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v13, v14, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move-object/from16 p4, v7

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p5, v8

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v14, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-nez v9, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v6, v14, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v20, Lny0/o;

    sget-object v21, Lny0/q$b;->f:Lny0/q$b;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/i0;->k()I

    move-result v22

    const/16 v31, 0x3fc

    const/16 v32, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v20 .. v32}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lgy0/f;->K:I

    invoke-static {v14, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v9, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v9, v13}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-virtual/range {v21 .. v21}, Lny0/q;->c()F

    move-result v10

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v16, v3

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_7

    if-ne v5, v3, :cond_8

    :cond_7
    new-instance v5, Lot1/e;

    const/4 v10, 0x4

    invoke-direct {v5, v2, v10}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lc93/a;

    sget v17, Lny0/o;->k:I

    const/16 v18, 0x8

    move-object/from16 v33, v14

    const/4 v14, 0x0

    move-object v2, v13

    move-object v13, v9

    move-object v9, v2

    move/from16 v37, v4

    move-object v10, v12

    move-object v4, v15

    move-object/from16 v12, v16

    move-object/from16 v16, v33

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v15, v5

    move-object v5, v11

    move-object/from16 v11, v20

    invoke-static/range {v11 .. v18}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v16

    float-to-double v11, v2

    const-wide/16 v15, 0x0

    cmpl-double v11, v11, v15

    if-lez v11, :cond_9

    goto :goto_4

    :cond_9
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v13, v2, v12

    if-lez v13, :cond_a

    :goto_5
    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    move v12, v2

    goto :goto_5

    :goto_6
    invoke-direct {v11, v12, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v12, 0x1

    invoke-static {v13, v14, v12}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v15

    const/16 v12, 0xe

    invoke-static {v11, v15, v12}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v5, v9, v14, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v12, v14, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v14, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v14, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v12, v14, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v14, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0xf

    int-to-float v5, v5

    move-object/from16 v11, p4

    invoke-static {v5, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v14, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lm72/d;->c()Lgz0/m0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    const/4 v12, 0x6

    invoke-static {v5, v14, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v13, v14, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->b1()J

    move-result-wide v16

    const/4 v12, 0x4

    int-to-float v12, v12

    mul-float v2, v37, v12

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v9, v2}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v33, v14

    move-wide/from16 v40, v16

    move/from16 v16, v15

    move-wide/from16 v14, v40

    const/16 v17, 0x30

    const/16 v18, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 p3, v13

    move-object v13, v2

    move-object/from16 v2, p3

    move-object/from16 p3, v3

    move/from16 v3, v20

    const/16 v38, 0x6

    move-object/from16 v20, v11

    move-object v11, v5

    move/from16 v5, v16

    move-object/from16 v16, v33

    invoke-static/range {v11 .. v18}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v16

    invoke-virtual/range {p0 .. p0}, Lm72/d;->f()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v14, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->r()Lb91/a;

    move-result-object v31

    invoke-virtual {v2, v14, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    const/4 v15, 0x2

    int-to-float v15, v15

    mul-float v17, v15, v37

    const/16 v19, 0x0

    move-object/from16 v15, v20

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 p2, v11

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object v1, v15

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v9, v11}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v15, Lw3/k;

    const/4 v0, 0x5

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v35, v16, 0x12

    const v36, 0x2fdf8

    move-object/from16 v23, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v24

    const-wide/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v30, v29

    const/16 v29, 0x0

    move/from16 v32, v30

    const/16 v30, 0x0

    move/from16 v33, v32

    const/16 v32, 0x0

    const/16 v34, 0x0

    move/from16 v39, v33

    move-object/from16 v33, v14

    move-wide v13, v12

    move-object v12, v11

    move-object/from16 v11, p2

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v33

    invoke-virtual/range {p0 .. p0}, Lm72/d;->e()Lhy0/h1;

    move-result-object v11

    if-nez v11, :cond_e

    const v3, -0x742746f

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v3, v1

    goto :goto_9

    :cond_e
    const v12, -0x742746e

    invoke-static {v14, v12, v1, v3, v14}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/4 v12, 0x1

    int-to-float v3, v12

    mul-float v17, v3, v37

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v15, v1

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v3, v15

    invoke-static {v9, v1}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v12, v14, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v14, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    invoke-static {v12, v14, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v14, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v15, Lhy0/h1;->w:I

    const/16 v16, 0x6

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x1

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_9
    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v14, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lm72/d;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v14, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v31

    invoke-virtual {v2, v14, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v6

    new-instance v1, Lw3/k;

    invoke-direct {v1, v0}, Lw3/k;-><init>(I)V

    const/16 v34, 0x0

    const v36, 0x2fdfa

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v23, v1

    move-object/from16 v33, v14

    move-wide v13, v6

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v33

    move/from16 v15, v39

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v12, 0x1

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v0, v0, v37

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v3, v0, v14, v3, v15}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lm72/d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v2, v14, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v2, v14, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v6

    const/16 v20, 0x0

    const/16 v21, 0xc

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v19, v14

    move-wide v13, v6

    invoke-static/range {v11 .. v21}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v18

    move-object/from16 v14, v19

    const/4 v13, 0x0

    int-to-float v6, v13

    mul-float v6, v6, v37

    invoke-virtual {v2, v14, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v20

    move-object/from16 v2, p0

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v6, p1

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_12

    move-object/from16 v5, p3

    if-ne v7, v5, :cond_13

    :cond_12
    new-instance v7, Lox0/b;

    const/16 v5, 0xe

    invoke-direct {v7, v5, v2, v6}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v24, v7

    check-cast v24, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x12

    or-int/lit8 v26, v2, 0x6

    const/16 v27, 0x0

    const/16 v28, 0x1d3e

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v33, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v11, v1

    move-object/from16 v17, v4

    move-object/from16 v25, v33

    invoke-static/range {v11 .. v28}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v25

    const/4 v13, 0x0

    invoke-static {v3, v0, v14, v13}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_a

    :cond_14
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lm72/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lm72/d;->d()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lm72/d;->d()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lp72/b;->e(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

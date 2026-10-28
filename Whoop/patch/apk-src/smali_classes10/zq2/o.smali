.class public abstract Lzq2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzq2/a;",
        "userSelectedAnswer",
        "Lkd1/o;",
        "correctResponseIcon",
        "",
        "animatedWhoopCoachResponseText",
        "Ly81/e;",
        "correctTextColor",
        "incorrectTextColor",
        "Lv41/r0;",
        "lottieWrapper",
        "Ll83/a0;",
        "d",
        "(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;Landroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/o;->f(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lzq2/o;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lzq2/o;->g(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v11, p5

    move/from16 v3, p7

    const-string v4, "correctResponseIcon"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "animatedWhoopCoachResponseText"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "correctTextColor"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "incorrectTextColor"

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p6

    check-cast v5, Lp1/q;

    const v4, -0x5164784b

    invoke-virtual {v5, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    const/4 v6, 0x2

    if-nez v4, :cond_2

    and-int/lit8 v4, v3, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    or-int/2addr v4, v3

    goto :goto_2

    :cond_2
    move v4, v3

    :goto_2
    and-int/lit8 v10, v3, 0x30

    if-nez v10, :cond_5

    and-int/lit8 v10, v3, 0x40

    if-nez v10, :cond_3

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_3

    :cond_3
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_3
    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_4

    :cond_4
    const/16 v10, 0x10

    :goto_4
    or-int/2addr v4, v10

    :cond_5
    and-int/lit16 v10, v3, 0x180

    if-nez v10, :cond_7

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_5

    :cond_6
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v4, v10

    :cond_7
    and-int/lit16 v10, v3, 0xc00

    if-nez v10, :cond_9

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_6

    :cond_8
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :cond_9
    and-int/lit16 v10, v3, 0x6000

    if-nez v10, :cond_b

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x4000

    goto :goto_7

    :cond_a
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v4, v10

    :cond_b
    const/high16 v10, 0x30000

    and-int/2addr v10, v3

    if-nez v10, :cond_d

    invoke-virtual {v5, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/high16 v10, 0x20000

    goto :goto_8

    :cond_c
    const/high16 v10, 0x10000

    :goto_8
    or-int/2addr v4, v10

    :cond_d
    move/from16 v22, v4

    const v4, 0x12493

    and-int v4, v22, v4

    const v10, 0x12492

    const/4 v13, 0x0

    if-eq v4, v10, :cond_e

    const/4 v4, 0x1

    goto :goto_9

    :cond_e
    move v4, v13

    :goto_9
    and-int/lit8 v10, v22, 0x1

    invoke-virtual {v5, v10, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_20

    int-to-float v4, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v16, v4, v6

    const-wide/high16 v14, 0x401a000000000000L    # 6.5

    double-to-float v4, v14

    mul-float v17, v4, v6

    const/16 v18, 0x0

    const/16 v19, 0x9

    sget-object v23, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    move-object/from16 v14, v23

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Ll0/m;->a:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    invoke-static {v10, v14, v5, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v5, v10, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-nez v13, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    invoke-static {v14, v5, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v13

    mul-float v24, v4, v6

    const/16 v27, 0x0

    const/16 v28, 0xb

    move/from16 v26, v24

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v14, v23

    move/from16 v24, v26

    sget-object v13, Lb2/e;->w:Lb2/m;

    const/4 v1, 0x0

    invoke-static {v13, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v1, v5, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-eqz v3, :cond_12

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v5, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    :cond_13
    invoke-static {v1, v5, v1, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v5, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v3, v2}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v4, v5, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-eqz v1, :cond_15

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v5, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v3, v5, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v5, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p0, :cond_18

    invoke-virtual/range {p0 .. p0}, Lzq2/a;->b()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_18

    const/4 v1, 0x1

    goto :goto_d

    :cond_18
    const/4 v1, 0x0

    :goto_d
    if-eqz v1, :cond_1d

    const v0, -0x53935013

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/16 v0, 0x26

    if-nez v11, :cond_19

    const v1, -0x53934626

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    move v2, v1

    move-object/from16 v23, v14

    const/4 v1, 0x1

    const/16 v18, 0x0

    goto :goto_e

    :cond_19
    const/4 v1, 0x0

    const v2, -0x53934625

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x1

    int-to-float v3, v2

    mul-float v27, v3, v6

    const/16 v28, 0x6

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v23, v14

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v0

    const/4 v7, 0x4

    int-to-float v10, v7

    mul-float/2addr v4, v10

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_1a

    new-instance v3, Lzi1/e0;

    const/4 v7, 0x7

    invoke-direct {v3, v7}, Lzi1/e0;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v15, v3

    check-cast v15, Lc93/a;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_1b

    new-instance v3, Lzm1/d;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lzm1/d;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v16, v3

    check-cast v16, Lkotlin/jvm/functions/Function1;

    const v20, 0xdb6006

    const/16 v21, 0x10c

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    sget-object v17, Ly2/j;->b:Ly2/b1;

    const/16 v18, 0x0

    move/from16 v19, v2

    move v2, v1

    move/from16 v1, v19

    move-object/from16 v19, v5

    invoke-static/range {v10 .. v21}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    move-object/from16 v18, v3

    :goto_e
    if-nez v18, :cond_1c

    const v3, -0x538bb78d

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v1

    mul-float v27, v3, v6

    const/16 v28, 0x6

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v0, v0

    const/4 v7, 0x4

    int-to-float v4, v7

    mul-float/2addr v0, v4

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget v0, Lkd1/o;->a:I

    shr-int/lit8 v3, v22, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int v6, v0, v3

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v0, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v10

    const/16 v18, 0x1b0

    const/16 v19, 0x78

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v5

    move-object/from16 v2, v23

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    move v0, v2

    move-object/from16 v2, v23

    const v3, 0x269826b5

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1d
    move-object v2, v14

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v3, -0x53860cd9    # -3.5520005E-12f

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_10
    const-string v3, "Quiz whoop coach response text"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->P()Lb91/a;

    move-result-object v2

    if-eqz p0, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lzq2/a;->b()Z

    move-result v4

    if-ne v4, v1, :cond_1e

    move v12, v1

    goto :goto_11

    :cond_1e
    move v12, v0

    :goto_11
    if-eqz v12, :cond_1f

    const v4, -0x5381da05

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v22, 0x9

    and-int/lit8 v4, v4, 0xe

    invoke-interface {v8, v5, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1f
    const v4, -0x53809c07

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v22, 0xc

    and-int/lit8 v4, v4, 0xe

    invoke-interface {v9, v5, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_12
    shr-int/lit8 v0, v22, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v25, v0, 0x30

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v26, v0, 0x12

    const v27, 0x2fff8

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v2

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_20
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v0, Lbe1/f;

    const/16 v8, 0x12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbe1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Lzq2/o;->d(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Luz1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Luz1/u;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "native-store_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Luz1/t;->g(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Luz1/u;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Luz1/t;->e(Lkotlin/jvm/functions/Function1;Luz1/u;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luz1/t;->f(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Luz1/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v5, "state"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v5, 0x68727c8e

    invoke-virtual {v11, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, p5, 0x1

    const/4 v6, 0x4

    const/4 v12, 0x2

    if-eqz v5, :cond_0

    or-int/lit8 v7, v4, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v4, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    goto :goto_0

    :cond_1
    move v8, v12

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v4

    :goto_1
    and-int/lit8 v9, v4, 0x30

    const/16 v13, 0x20

    if-nez v9, :cond_5

    and-int/lit8 v9, v4, 0x40

    if-nez v9, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_3
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_4

    move v9, v13

    goto :goto_3

    :cond_4
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v8, v9

    :cond_5
    and-int/lit16 v9, v4, 0x180

    const/16 v10, 0x100

    if-nez v9, :cond_7

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move v9, v10

    goto :goto_4

    :cond_6
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v8, v9

    :cond_7
    and-int/lit16 v9, v8, 0x93

    const/16 v14, 0x92

    const/4 v15, 0x0

    if-eq v9, v14, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    move v9, v15

    :goto_5
    and-int/lit8 v14, v8, 0x1

    invoke-virtual {v11, v14, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_18

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_9

    move-object v5, v14

    goto :goto_6

    :cond_9
    move-object/from16 v5, p0

    :goto_6
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x1e

    int-to-float v9, v9

    int-to-float v6, v6

    mul-float/2addr v9, v6

    invoke-static {v7, v9, v0, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v7, 0x8

    int-to-float v7, v7

    const/4 v9, 0x3

    int-to-float v9, v9

    mul-float/2addr v9, v6

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v18

    const-wide/16 v22, 0x0

    const/16 v24, 0x1c

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move/from16 v17, v7

    invoke-static/range {v16 .. v24}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v7, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    and-int/lit16 v7, v8, 0x380

    if-ne v7, v10, :cond_a

    const/4 v7, 0x1

    goto :goto_7

    :cond_a
    move v7, v15

    :goto_7
    and-int/lit8 v9, v8, 0x70

    if-eq v9, v13, :cond_c

    and-int/lit8 v8, v8, 0x40

    if-eqz v8, :cond_b

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_8

    :cond_b
    move v8, v15

    goto :goto_9

    :cond_c
    :goto_8
    const/4 v8, 0x1

    :goto_9
    or-int/2addr v7, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_d

    if-ne v8, v9, :cond_e

    :cond_d
    new-instance v8, Lui0/q;

    const/4 v7, 0x5

    invoke-direct {v8, v7, v3, v2}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v22, v8

    check-cast v22, Lc93/a;

    const/16 v23, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-eqz v0, :cond_f

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v11, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v10, v11, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v15, v14}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lx81/d;->a:Lx81/d;

    move-object/from16 v21, v12

    sget v12, Lx81/d;->b:I

    invoke-virtual {v10, v11, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->w()J

    move-result-wide v3

    move-object/from16 v32, v5

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v11, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move v3, v6

    invoke-virtual/range {p1 .. p1}, Luz1/u;->c()Lkd1/o;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_12

    new-instance v5, Luk2/a;

    const/16 v7, 0x17

    invoke-direct {v5, v7}, Luk2/a;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v7, Lkd1/o;->a:I

    or-int/lit16 v7, v7, 0x180

    move-object/from16 v28, v11

    const/4 v11, 0x1

    move-object v9, v10

    move v10, v7

    const/4 v7, 0x0

    move-object/from16 p0, v8

    move-object v8, v5

    move-object/from16 v5, p0

    move-object v4, v9

    move-object/from16 v9, v28

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    invoke-virtual {v15, v14}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v7, v14

    const/16 v14, 0x6030

    move-object v9, v15

    const/16 v15, 0x68

    move-object v10, v7

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object/from16 v22, v10

    sget-object v10, Ly2/j;->a:Ly2/b1;

    move-object/from16 v23, v11

    const/4 v11, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move/from16 p3, v3

    move-object/from16 v36, v4

    move-object/from16 v33, v13

    move-object/from16 v34, v21

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    move/from16 v35, v24

    move-object/from16 v13, v28

    const/16 v18, 0x20

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v13

    invoke-virtual {v4, v3}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Li2/t;->b:Li2/s;

    sget-wide v8, Li2/x;->b:J

    const/4 v10, 0x0

    invoke-static {v10, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v10, Li2/x;

    invoke-direct {v10, v12, v13}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const v13, 0x3e4ccccd    # 0.2f

    invoke-static {v13, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v13

    new-instance v15, Li2/x;

    invoke-direct {v15, v13, v14}, Li2/x;-><init>(J)V

    new-instance v13, Ll83/k;

    invoke-direct {v13, v10, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v12, v13}, [Ll83/k;

    move-result-object v10

    const/16 v12, 0xe

    const/4 v13, 0x0

    invoke-static {v7, v10, v13, v13, v12}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v10

    const/4 v12, 0x0

    const/4 v14, 0x6

    invoke-static {v6, v10, v12, v13, v14}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v6, v11, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v3}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v10, 0x3f4ccccd    # 0.8f

    invoke-static {v10, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v14

    new-instance v10, Li2/x;

    invoke-direct {v10, v14, v15}, Li2/x;-><init>(J)V

    new-instance v14, Ll83/k;

    invoke-direct {v14, v1, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f48c155    # 0.7842f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v13, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    new-instance v10, Li2/x;

    invoke-direct {v10, v8, v9}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v1, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v14, v8}, [Ll83/k;

    move-result-object v21

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v8, v1

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v13, v1

    shl-long v8, v8, v18

    const-wide v22, 0xffffffffL

    and-long v13, v13, v22

    or-long/2addr v8, v13

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v13, v10

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    move-wide/from16 v24, v13

    int-to-long v12, v1

    shl-long v14, v24, v18

    and-long v12, v12, v22

    or-long v24, v14, v12

    const/16 v26, 0x8

    move-object/from16 v20, v7

    move-wide/from16 v22, v8

    invoke-static/range {v20 .. v26}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v1

    const/4 v7, 0x6

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-static {v6, v1, v10, v13, v7}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v1, v11, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move/from16 v1, p0

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->G:Lb2/m;

    invoke-virtual {v4, v6, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float v6, v6, v17

    const/high16 v7, 0x40200000    # 2.5f

    mul-float v7, v7, v17

    invoke-static {v4, v6, v6, v6, v7}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->g:Ll0/h;

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v6, v7, v11, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_13

    move-object/from16 v9, v33

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v11, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    move-object/from16 v0, v34

    invoke-static {v7, v11, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v11, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Luz1/u;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move/from16 v0, v35

    move-object/from16 v4, v36

    invoke-virtual {v4, v11, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->Q()Lb91/a;

    move-result-object v26

    invoke-virtual {v4, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v8

    float-to-double v12, v1

    const-wide/16 v14, 0x0

    cmpl-double v2, v12, v14

    if-lez v2, :cond_16

    const/4 v15, 0x1

    goto :goto_c

    :cond_16
    const/4 v15, 0x0

    :goto_c
    if-nez v15, :cond_17

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_17
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v2, 0x1

    invoke-direct {v7, v1, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v30, v1, 0x12

    const v31, 0x2fff8

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

    const/high16 v1, 0x40900000    # 4.5f

    mul-float v6, p3, v1

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v1, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v10, 0x0

    invoke-static {v1, v11, v10}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    invoke-virtual {v4, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object/from16 v1, v32

    goto :goto_d

    :cond_18
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v1, p0

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lt01/e;

    const/16 v6, 0x1a

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Luz1/u;)Ll83/a0;
    .locals 2

    new-instance v0, Ltz1/j;

    invoke-virtual {p1}, Luz1/u;->b()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {p1}, Luz1/u;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ltz1/j;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lmh/h;)Ll83/a0;
    .locals 3

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lph/a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lph/a;-><init>(II)V

    iput-object v0, p0, Lmh/h;->j:Lph/e;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Luz1/t;->d(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

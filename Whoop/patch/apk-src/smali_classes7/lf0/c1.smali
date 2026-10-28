.class public abstract Llf0/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llf0/c1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llf0/d1;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Llf0/e1;",
        "style",
        "Li91/a;",
        "f",
        "(Llf0/e1;Landroidx/compose/runtime/Composer;I)Li91/a;",
        "advanced-labs_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/c1;->e(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Llf0/d1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/c1;->d(Lkotlin/jvm/functions/Function1;Llf0/d1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llf0/d1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x32c73405

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    const/16 v14, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v14

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v1, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_7

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v8

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :cond_7
    and-int/lit16 v7, v4, 0x93

    const/16 v9, 0x92

    const/4 v15, 0x0

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v15

    :goto_5
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v12, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1e

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object/from16 v3, v16

    :cond_9
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    invoke-virtual {v5}, Llf0/d1;->f()Llf0/e1;

    move-result-object v7

    invoke-static {v7, v12, v15}, Llf0/c1;->f(Llf0/e1;Landroidx/compose/runtime/Composer;I)Li91/a;

    move-result-object v18

    const/16 v7, 0xc

    int-to-float v7, v7

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v19

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v23

    and-int/lit16 v7, v4, 0x380

    if-ne v7, v8, :cond_a

    const/4 v7, 0x1

    goto :goto_6

    :cond_a
    move v7, v15

    :goto_6
    and-int/lit8 v8, v4, 0x70

    if-eq v8, v14, :cond_c

    and-int/lit8 v4, v4, 0x40

    if-eqz v4, :cond_b

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_7

    :cond_b
    move v4, v15

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v4, 0x1

    :goto_8
    or-int/2addr v4, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_d

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_e

    :cond_d
    new-instance v7, Ll01/q;

    const/16 v4, 0xb

    invoke-direct {v7, v6, v5, v4}, Ll01/q;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v27, v7

    check-cast v27, Lc93/a;

    const/16 v28, 0xf

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v2, v2

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v2, v7

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v4, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_f

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_11

    :cond_10
    invoke-static {v8, v12, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v12, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v2, v7

    invoke-virtual {v5}, Llf0/d1;->b()Lkd1/o;

    move-result-object v7

    invoke-virtual {v5}, Llf0/d1;->c()Lgz0/m0;

    move-result-object v8

    const/4 v15, 0x6

    if-eqz v7, :cond_12

    const v8, 0x620543fc

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    move-object v8, v11

    sget v11, Lkd1/o;->a:I

    move-object/from16 v29, v12

    const/4 v12, 0x3

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v34, v10

    move-object/from16 v0, v16

    move-object/from16 v33, v19

    move-object/from16 v35, v20

    move-object/from16 v10, v29

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    int-to-float v8, v14

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v9, v15

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v8, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move v8, v15

    const/16 v15, 0x6030

    const/16 v16, 0x68

    move v10, v8

    const/4 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move/from16 p3, v2

    move-object/from16 v37, v3

    move v3, v14

    move-object/from16 v2, v19

    move-object/from16 v14, v29

    const/4 v1, 0x0

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_a
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_12
    move/from16 p3, v2

    move-object/from16 v37, v3

    move-object/from16 v35, v9

    move-object/from16 v34, v10

    move-object/from16 v33, v11

    move-object v2, v13

    move v3, v15

    move-object/from16 v0, v16

    const/4 v1, 0x0

    if-eqz v8, :cond_15

    const v7, 0x620a410a

    invoke-static {v12, v7, v8, v12, v3}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v5}, Llf0/d1;->f()Llf0/e1;

    move-result-object v9

    sget-object v10, Llf0/e1;->HIGHLIGHTED:Llf0/e1;

    if-eq v9, v10, :cond_14

    sget-object v9, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    if-ne v8, v9, :cond_13

    goto :goto_c

    :cond_13
    const v8, -0xd5a5d58

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-static {v8, v12, v9, v1}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    :goto_b
    move-wide v10, v8

    goto :goto_d

    :cond_14
    :goto_c
    const v8, -0xd5a6195

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-static {v8, v12, v9, v1}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    goto :goto_b

    :goto_d
    const/16 v8, 0x14

    int-to-float v8, v8

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    const/4 v8, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_15
    const v7, 0x620fe781

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_e
    float-to-double v8, v7

    const-wide/16 v10, 0x0

    cmpl-double v7, v8, v10

    if-lez v7, :cond_16

    const/4 v15, 0x1

    goto :goto_f

    :cond_16
    move v15, v1

    :goto_f
    if-nez v15, :cond_17

    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_17
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    invoke-direct {v13, v7, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v7, v8

    mul-float v14, v7, p3

    const/16 v17, 0x0

    const/16 v18, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v36, v14

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v12, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_18

    move-object/from16 v13, v33

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_10
    move-object/from16 v13, v34

    goto :goto_11

    :cond_18
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_10

    :goto_11
    invoke-static {v12, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    :cond_19
    move-object/from16 v4, v35

    invoke-static {v10, v12, v10, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Llf0/d1;->h()Ljava/lang/String;

    move-result-object v7

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v12, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fffa

    move v11, v8

    const/4 v8, 0x0

    move v13, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v33, v30

    const/16 v30, 0x0

    move/from16 v3, v33

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v5}, Llf0/d1;->i()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1b

    const v7, 0x3a52187f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1b
    const v7, 0x3a521880

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llf0/d1;->i()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v12, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->d()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->X()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Llf0/d1;->g()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1c

    const v7, 0x6218f93b

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1c
    const v8, 0x6218f93c

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v12, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->F()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v0

    move/from16 v19, v36

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v30, 0x30

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v5}, Llf0/d1;->e()Lgz0/m0;

    move-result-object v7

    if-nez v7, :cond_1d

    const v0, 0x621d5804

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1d
    const v8, 0x621d5805

    const/4 v10, 0x6

    invoke-static {v12, v8, v7, v12, v10}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v2, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v10

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    const/4 v8, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object/from16 v4, v37

    goto :goto_15

    :cond_1e
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v4, v3

    :goto_15
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Ll72/h;

    const/16 v3, 0xf

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Llf0/d1;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/c1;->c(Landroidx/compose/ui/Modifier;Llf0/d1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llf0/e1;Landroidx/compose/runtime/Composer;I)Li91/a;
    .locals 10

    sget-object p2, Llf0/c1$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    const/4 v1, 0x0

    if-eq p0, p2, :cond_3

    const/4 p2, 0x2

    if-eq p0, p2, :cond_2

    const/4 p2, 0x3

    if-ne p0, p2, :cond_1

    check-cast p1, Lp1/q;

    const p0, -0x1745376d

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_0

    sget-object p0, Llf0/c1$c;->w:Llf0/c1$c;

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0

    :cond_1
    const p0, -0x17457431

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_2
    check-cast p1, Lp1/q;

    const p0, -0x17456473

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    sget-object v2, Li2/t;->b:Li2/s;

    const p0, 0x4db9bfa9    # 3.895432E8f

    invoke-static {p0}, Li2/w0;->c(I)J

    move-result-wide p0

    new-instance p2, Li2/x;

    invoke-direct {p2, p0, p1}, Li2/x;-><init>(J)V

    const p0, 0x4dc6e3df    # 4.1710282E8f

    invoke-static {p0}, Li2/w0;->c(I)J

    move-result-wide p0

    new-instance v0, Li2/x;

    invoke-direct {v0, p0, p1}, Li2/x;-><init>(J)V

    const p0, 0x4dd9c6b6    # 4.5670982E8f

    invoke-static {p0}, Li2/w0;->c(I)J

    move-result-wide p0

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    const p0, 0x4db3a8c0    # 3.767726E8f

    invoke-static {p0}, Li2/w0;->c(I)J

    move-result-wide p0

    new-instance v3, Li2/x;

    invoke-direct {v3, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {p2, v0, v1, v3}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v8, 0x16

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v6, 0x439e0000    # 316.0f

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lgb1/u;->b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;

    move-result-object p0

    invoke-static {p0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_3
    check-cast p1, Lp1/q;

    const p0, -0x17456fb1

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4

    sget-object p0, Llf0/c1$b;->w:Llf0/c1$b;

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0
.end method

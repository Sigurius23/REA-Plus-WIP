.class public abstract Lfg2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a3\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\u000c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "coachPhoneNumber",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onTextWhoop",
        "d",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Landroid/content/Context;",
        "context",
        "phoneNumber",
        "h",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "sms_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/f;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfg2/f;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Landroid/content/Context;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfg2/f;->f(Lc93/a;Landroid/content/Context;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x7467aeb8

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

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

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v8, p2

    :goto_4
    move v14, v4

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v4, v10

    goto :goto_4

    :goto_6
    and-int/lit16 v4, v14, 0x93

    const/16 v10, 0x92

    if-eq v4, v10, :cond_9

    const/4 v4, 0x1

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v10, v14, 0x1

    invoke-virtual {v9, v10, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_19

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v0, v4

    goto :goto_8

    :cond_a
    move-object v0, v3

    :goto_8
    if-eqz v5, :cond_b

    const-string v3, ""

    goto :goto_9

    :cond_b
    move-object v3, v6

    :goto_9
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_c

    new-instance v6, Lf1/z1;

    const/16 v7, 0xd

    invoke-direct {v6, v7}, Lf1/z1;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/a;

    goto :goto_a

    :cond_d
    move-object v6, v8

    :goto_a
    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v12, v2

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v12, v13

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, Lb2/e;->M:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v2, v15, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 p0, v0

    iget-wide v0, v9, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    invoke-static {v0, v9, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v0, v8

    const-wide/16 v20, 0x0

    cmpl-double v0, v0, v20

    const-string v1, "invalid weight; must be greater than zero"

    if-lez v0, :cond_11

    goto :goto_c

    :cond_11
    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v15, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v2, v8, v15

    if-lez v2, :cond_12

    move v2, v15

    :goto_d
    const/4 v10, 0x1

    goto :goto_e

    :cond_12
    move v2, v8

    goto :goto_d

    :goto_e
    invoke-direct {v0, v2, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v11, 0x2

    invoke-static {v0, v12, v2, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v2, Lvf2/a;->a:I

    const/4 v11, 0x0

    invoke-static {v2, v9, v11}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    move/from16 v19, v10

    const/16 v10, 0x61b0

    const/16 v11, 0x68

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x0

    move-object/from16 v23, v6

    sget-object v6, Ly2/j;->d:Ly2/b1;

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v31, v4

    move-object/from16 v28, v18

    move-object/from16 v32, v22

    move-object/from16 v29, v23

    move-object/from16 v30, v24

    move-object v4, v0

    move/from16 v18, v12

    move/from16 v12, v19

    move/from16 v0, v25

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    float-to-double v2, v0

    cmpl-double v2, v2, v20

    if-lez v2, :cond_13

    goto :goto_f

    :cond_13
    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, v15

    if-lez v2, :cond_14

    move v8, v15

    goto :goto_10

    :cond_14
    move v8, v0

    :goto_10
    invoke-direct {v1, v8, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v0, Lvf2/b;->h:I

    const/4 v11, 0x0

    invoke-static {v0, v9, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->P()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v17, v11

    move/from16 v19, v12

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/16 v23, 0x100

    const-wide/16 v15, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move/from16 v35, v20

    const/16 v20, 0x0

    move/from16 v36, v21

    const/16 v21, 0x0

    move/from16 v37, v23

    const/16 v23, 0x0

    move/from16 v38, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 v39, v35

    move/from16 v0, v38

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v24

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v31

    move/from16 v18, v33

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v2, Lvf2/b;->f:I

    invoke-static {v2, v9, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p1

    invoke-virtual {v4, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v4

    const/16 v25, 0x30

    const v27, 0x2fff8

    const/4 v9, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v24

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v18, v1, v36

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v31

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v1, Lvf2/b;->a:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    move/from16 v4, v39

    and-int/lit16 v1, v4, 0x380

    const/16 v3, 0x100

    if-ne v1, v3, :cond_15

    const/4 v15, 0x1

    :goto_11
    move-object/from16 v7, v30

    goto :goto_12

    :cond_15
    move v15, v0

    goto :goto_11

    :goto_12
    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v15

    and-int/lit8 v3, v4, 0x70

    const/16 v4, 0x20

    if-ne v3, v4, :cond_16

    const/4 v15, 0x1

    goto :goto_13

    :cond_16
    move v15, v0

    :goto_13
    or-int v0, v1, v15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_18

    move-object/from16 v0, v32

    if-ne v1, v0, :cond_17

    goto :goto_14

    :cond_17
    move-object/from16 v3, v28

    move-object/from16 v4, v29

    goto :goto_15

    :cond_18
    :goto_14
    new-instance v1, Ld30/r;

    const/16 v0, 0xe

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    invoke-direct {v1, v4, v7, v3, v0}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    move-object v15, v1

    check-cast v15, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit8 v17, v0, 0x6

    const/16 v18, 0x0

    const/16 v19, 0x1fbe

    move-object/from16 v28, v3

    const/4 v3, 0x0

    move-object/from16 v29, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v24

    invoke-static/range {v2 .. v19}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v16

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move-object/from16 v4, p0

    move-object/from16 v6, v28

    move-object/from16 v5, v29

    goto :goto_16

    :cond_19
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v3

    move-object v5, v8

    :goto_16
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lfg2/e;

    const/4 v3, 0x0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lfg2/e;-><init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;Landroid/content/Context;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {p1, p2}, Lfg2/f;->h(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfg2/f;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smsto:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    sget p1, Lvf2/b;->e:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "sms_body"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

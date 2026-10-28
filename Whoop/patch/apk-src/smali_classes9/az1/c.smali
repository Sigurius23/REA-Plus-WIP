.class public abstract Laz1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aE\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a3\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "source",
        "Lzy1/f;",
        "viewModel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onAdvance",
        "Lc31/k;",
        "progressButtonState",
        "g",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lzy1/f;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V",
        "f",
        "(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V",
        "mfa_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Laz1/c;->l(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lzy1/f;Lc93/a;Lc31/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Laz1/c;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lzy1/f;Lc93/a;Lc31/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Laz1/c;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Laz1/c;->k(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Laz1/c;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Lc31/k;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v1, -0x44243ef1

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v6, v6, 0x30

    :cond_3
    move-object/from16 v8, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    :goto_3
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, p5, 0x4

    if-nez v9, :cond_7

    and-int/lit16 v9, v4, 0x200

    if-nez v9, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_4
    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_5

    :cond_7
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v6, v9

    :cond_8
    and-int/lit16 v9, v6, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v13, 0x1

    if-eq v9, v10, :cond_9

    move v9, v13

    goto :goto_6

    :cond_9
    move v9, v11

    :goto_6
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v9, v4, 0x1

    sget-object v10, Lb2/t;->w:Lb2/t;

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_c

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_b

    and-int/lit16 v6, v6, -0x381

    :cond_b
    move-object v1, v5

    move-object v5, v0

    move-object v0, v1

    move/from16 v31, v6

    move-object v1, v8

    goto :goto_9

    :cond_c
    :goto_7
    if-eqz v1, :cond_d

    move-object v5, v10

    :cond_d
    if-eqz v7, :cond_f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_e

    new-instance v1, Lat2/k;

    const/16 v7, 0x16

    invoke-direct {v1, v7}, Lat2/k;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v1, Lc93/a;

    goto :goto_8

    :cond_f
    move-object v1, v8

    :goto_8
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_10

    sget-object v0, Lzy1/d;->a:Lzy1/d;

    invoke-virtual {v0}, Lzy1/d;->b()Lc31/k;

    move-result-object v0

    and-int/lit16 v6, v6, -0x381

    :cond_10
    move-object/from16 v31, v5

    move-object v5, v0

    move-object/from16 v0, v31

    move/from16 v31, v6

    :goto_9
    invoke-virtual {v12}, Lp1/q;->r()V

    int-to-float v6, v2

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/4 v8, 0x0

    invoke-static {v0, v6, v8, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v2, v13

    mul-float v20, v2, v7

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Ll0/m;->d:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/16 v9, 0x36

    invoke-static {v6, v8, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    :cond_12
    invoke-static {v8, v12, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x64

    int-to-float v2, v2

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v6, Lpy1/c;->b:I

    invoke-static {v6, v12, v11}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    const/16 v13, 0x1b0

    move-object v8, v14

    const/16 v14, 0x78

    move-object v9, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 p1, v0

    move-object v0, v15

    move/from16 v32, v20

    const/4 v4, 0x1

    move v15, v7

    move-object v7, v2

    move-object/from16 v2, v18

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    int-to-float v3, v3

    invoke-static {v3, v15, v2, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v3, Lpy1/d;->I:I

    const/4 v5, 0x0

    invoke-static {v3, v12, v5}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fffa

    move v9, v6

    const/4 v6, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const-wide/16 v14, 0x0

    const/16 v19, 0x20

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    move/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move-object/from16 v35, v28

    const/16 v28, 0x0

    move-object v4, v5

    move-object v5, v3

    move/from16 v3, v33

    move-object/from16 v33, v1

    move/from16 v1, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    move/from16 v5, v32

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v5, Lpy1/d;->H:I

    const/4 v6, 0x0

    invoke-static {v5, v12, v6}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v4, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v7

    const/4 v6, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    const/16 v3, 0x1e

    int-to-float v3, v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    and-int/lit8 v2, v31, 0x70

    if-ne v2, v1, :cond_14

    const/4 v11, 0x1

    goto :goto_b

    :cond_14
    const/4 v11, 0x0

    :goto_b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v11, :cond_16

    if-ne v1, v0, :cond_15

    goto :goto_c

    :cond_15
    move-object/from16 v8, v33

    goto :goto_d

    :cond_16
    :goto_c
    new-instance v1, Laz1/b;

    const/4 v0, 0x0

    move-object/from16 v8, v33

    invoke-direct {v1, v8, v0}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v0, Lc31/k;->r:I

    shr-int/lit8 v2, v31, 0x6

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v0, v2

    move-object/from16 v9, v35

    const/4 v5, 0x0

    invoke-static {v9, v1, v12, v0, v5}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    move-object/from16 v1, p1

    move-object v3, v9

    :goto_e
    move-object v2, v8

    goto :goto_f

    :cond_17
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v0

    move-object v1, v5

    goto :goto_e

    :goto_f
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, La01/e;

    const/16 v6, 0xb

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lzy1/f;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Lzy1/f;",
            "Lc93/a;",
            "Lc31/k;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    move/from16 v6, p6

    const-string v1, "source"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v1, 0x28abc5ec

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    const/16 v7, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v7

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_7

    and-int/lit8 v5, p7, 0x4

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    move-object/from16 v5, p2

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    goto :goto_4

    :cond_7
    move-object/from16 v5, p2

    :goto_4
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v9, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_5

    :cond_a
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v4, v11

    :goto_6
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_d

    and-int/lit8 v11, p7, 0x10

    if-nez v11, :cond_c

    const v11, 0x8000

    and-int/2addr v11, v6

    if-nez v11, :cond_b

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_7

    :cond_b
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_7
    if-eqz v11, :cond_c

    const/16 v11, 0x4000

    goto :goto_8

    :cond_c
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v4, v11

    :cond_d
    and-int/lit16 v11, v4, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_e

    move v11, v14

    goto :goto_9

    :cond_e
    move v11, v13

    :goto_9
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1e

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v11, v6, 0x1

    const v12, -0xe001

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_13

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_10

    and-int/lit16 v4, v4, -0x381

    :cond_10
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_11

    and-int/2addr v4, v12

    :cond_11
    move-object v1, v3

    move-object v3, v5

    :cond_12
    :goto_a
    move-object v8, v9

    move-object v9, v0

    goto/16 :goto_10

    :cond_13
    :goto_b
    if-eqz v1, :cond_14

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_14
    move-object v1, v3

    :goto_c
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_18

    const v3, 0x59f3c69b

    invoke-virtual {v10, v3}, Lp1/q;->f0(I)V

    sget-object v3, Lpf3/a;->b:Lnf3/a;

    if-eqz v3, :cond_17

    iget-object v3, v3, Lnf3/a;->a:Lwf3/a;

    iget-object v3, v3, Lwf3/a;->d:Lxf3/c;

    const v5, 0x59f3c7cc

    const v11, -0x384098

    invoke-static {v10, v5, v10, v13, v11}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v5

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v16, :cond_16

    if-ne v11, v15, :cond_15

    goto :goto_d

    :cond_15
    move/from16 p5, v12

    goto :goto_e

    :cond_16
    :goto_d
    new-instance v11, Laz1/c$a;

    invoke-direct {v11, v5}, Laz1/c$a;-><init>(Ljf3/a;)V

    const-class v5, Lzy1/f;

    move/from16 p5, v12

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    const/16 v20, 0x0

    move-object/from16 v16, v3

    move-object/from16 v18, v11

    const/16 v17, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    check-cast v11, Landroidx/lifecycle/w1;

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v3, v11

    check-cast v3, Lzy1/f;

    and-int/lit16 v4, v4, -0x381

    goto :goto_f

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    move/from16 p5, v12

    move-object v3, v5

    :goto_f
    if-eqz v8, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_19

    new-instance v5, Lat2/k;

    const/16 v8, 0x15

    invoke-direct {v5, v8}, Lat2/k;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v5, Lc93/a;

    move-object v9, v5

    :cond_1a
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_12

    sget-object v0, Lzy1/d;->a:Lzy1/d;

    invoke-virtual {v0}, Lzy1/d;->b()Lc31/k;

    move-result-object v0

    and-int v4, v4, p5

    goto/16 :goto_a

    :goto_10
    invoke-virtual {v10}, Lp1/q;->r()V

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v5, v4, 0x70

    if-ne v5, v7, :cond_1b

    move v13, v14

    :cond_1b
    or-int/2addr v0, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_1c

    if-ne v5, v15, :cond_1d

    :cond_1c
    new-instance v5, Laz1/c$b;

    const/4 v0, 0x0

    invoke-direct {v5, v3, v2, v0}, Laz1/c$b;-><init>(Lzy1/f;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v5, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v10, v5, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v4, 0xe

    shr-int/lit8 v4, v4, 0x6

    and-int/lit8 v5, v4, 0x70

    or-int/2addr v0, v5

    sget v5, Lc31/k;->r:I

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v0, v5

    and-int/lit16 v4, v4, 0x380

    or-int v11, v0, v4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-static/range {v7 .. v12}, Laz1/c;->f(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    move-object v5, v9

    goto :goto_11

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v5

    move-object v4, v9

    move-object v5, v0

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1f

    new-instance v0, La01/f;

    const/4 v8, 0x4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lzy1/f;Lc93/a;Lc31/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Laz1/c;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lzy1/f;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Laz1/c;->f(Landroidx/compose/ui/Modifier;Lc93/a;Lc31/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lyo0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a_\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lb91/a;",
        "style",
        "Li2/x;",
        "color",
        "Lw3/k;",
        "textAlign",
        "",
        "durationPerChar",
        "startDelay",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onAnimationComplete",
        "c",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "charIndex",
        "visibleCharCount",
        "coach-everywhere_release"
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

    invoke-static {}, Lyo0/i;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p14}, Lyo0/i;->g(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Landroidx/compose/ui/Modifier;",
            "Lb91/a;",
            "JIJJ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v0, p12

    move/from16 v2, p13

    const-string v4, "text"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "style"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p11

    check-cast v4, Lp1/q;

    const v5, -0x7b4df01f

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

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

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v0

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v5, v8

    :goto_4
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_8

    and-int/lit16 v8, v0, 0x200

    if-nez v8, :cond_6

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_5

    :cond_6
    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_5
    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_6

    :cond_7
    const/16 v8, 0x80

    :goto_6
    or-int/2addr v5, v8

    :cond_8
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_a

    move-wide/from16 v8, p3

    invoke-virtual {v4, v8, v9}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_7

    :cond_9
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v5, v10

    goto :goto_8

    :cond_a
    move-wide/from16 v8, p3

    :goto_8
    and-int/lit16 v10, v0, 0x6000

    if-nez v10, :cond_d

    and-int/lit8 v10, v2, 0x10

    if-nez v10, :cond_b

    move/from16 v10, p5

    invoke-virtual {v4, v10}, Lp1/q;->e(I)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x4000

    goto :goto_9

    :cond_b
    move/from16 v10, p5

    :cond_c
    const/16 v11, 0x2000

    :goto_9
    or-int/2addr v5, v11

    goto :goto_a

    :cond_d
    move/from16 v10, p5

    :goto_a
    and-int/lit8 v11, v2, 0x20

    const/high16 v13, 0x30000

    if-eqz v11, :cond_f

    or-int/2addr v5, v13

    :cond_e
    move-wide/from16 v13, p6

    goto :goto_c

    :cond_f
    and-int/2addr v13, v0

    if-nez v13, :cond_e

    move-wide/from16 v13, p6

    invoke-virtual {v4, v13, v14}, Lp1/q;->f(J)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v15, 0x10000

    :goto_b
    or-int/2addr v5, v15

    :goto_c
    and-int/lit8 v15, v2, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_11

    or-int v5, v5, v16

    move-wide/from16 v12, p8

    goto :goto_e

    :cond_11
    and-int v16, v0, v16

    move-wide/from16 v12, p8

    if-nez v16, :cond_13

    invoke-virtual {v4, v12, v13}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_12
    const/high16 v16, 0x80000

    :goto_d
    or-int v5, v5, v16

    :cond_13
    :goto_e
    and-int/lit16 v14, v2, 0x80

    const/high16 v17, 0xc00000

    if-eqz v14, :cond_14

    or-int v5, v5, v17

    move-object/from16 v0, p10

    goto :goto_10

    :cond_14
    and-int v17, p12, v17

    move-object/from16 v0, p10

    if-nez v17, :cond_16

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_15

    const/high16 v18, 0x800000

    goto :goto_f

    :cond_15
    const/high16 v18, 0x400000

    :goto_f
    or-int v5, v5, v18

    :cond_16
    :goto_10
    const v18, 0x492493

    and-int v0, v5, v18

    const v2, 0x492492

    const/4 v3, 0x0

    const/16 v18, 0x1

    if-eq v0, v2, :cond_17

    move/from16 v0, v18

    goto :goto_11

    :cond_17
    move v0, v3

    :goto_11
    and-int/lit8 v2, v5, 0x1

    invoke-virtual {v4, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v0, p12, 0x1

    const v19, -0xe001

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_1a

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_12

    :cond_18
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v0, p13, 0x10

    if-eqz v0, :cond_19

    and-int v5, v5, v19

    :cond_19
    move-wide/from16 v23, p6

    move-object/from16 v25, p10

    move v0, v10

    move-wide/from16 v20, v12

    goto :goto_16

    :cond_1a
    :goto_12
    if-eqz v6, :cond_1b

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v7, v0

    :cond_1b
    and-int/lit8 v0, p13, 0x10

    if-eqz v0, :cond_1c

    and-int v5, v5, v19

    const/4 v0, 0x5

    move v10, v0

    :cond_1c
    if-eqz v11, :cond_1d

    const-wide/16 v19, 0x4b

    goto :goto_13

    :cond_1d
    move-wide/from16 v19, p6

    :goto_13
    if-eqz v15, :cond_1e

    const-wide/16 v11, 0x1f4

    goto :goto_14

    :cond_1e
    move-wide v11, v12

    :goto_14
    if-eqz v14, :cond_20

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1f

    new-instance v0, Lyo0/c;

    const/4 v6, 0x4

    invoke-direct {v0, v6}, Lyo0/c;-><init>(I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v0, Lc93/a;

    move-object/from16 v25, v0

    :goto_15
    move v0, v10

    move-wide/from16 v23, v19

    move-wide/from16 v20, v11

    goto :goto_16

    :cond_20
    move-object/from16 v25, p10

    goto :goto_15

    :goto_16
    invoke-virtual {v4}, Lp1/q;->r()V

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v10, v5, 0xe

    or-int/2addr v6, v10

    invoke-static {v1, v4, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_21

    if-ne v11, v2, :cond_22

    :cond_21
    invoke-static {v3, v4}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v11

    :cond_22
    check-cast v11, Lp1/a1;

    invoke-virtual {v4, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    const/high16 v12, 0x380000

    and-int v13, v5, v12

    const/high16 v14, 0x100000

    if-ne v13, v14, :cond_23

    move/from16 v13, v18

    goto :goto_17

    :cond_23
    move v13, v3

    :goto_17
    or-int/2addr v10, v13

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    const/high16 v13, 0x70000

    and-int/2addr v13, v5

    const/high16 v14, 0x20000

    if-ne v13, v14, :cond_24

    move/from16 v13, v18

    goto :goto_18

    :cond_24
    move v13, v3

    :goto_18
    or-int/2addr v10, v13

    const/high16 v13, 0x1c00000

    and-int/2addr v13, v5

    const/high16 v14, 0x800000

    if-ne v13, v14, :cond_25

    move/from16 v3, v18

    :cond_25
    or-int/2addr v3, v10

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_27

    if-ne v10, v2, :cond_26

    goto :goto_19

    :cond_26
    move-object v2, v6

    move-object/from16 v26, v11

    move-wide/from16 v30, v20

    move-wide/from16 v28, v23

    move-object/from16 v32, v25

    goto :goto_1a

    :cond_27
    :goto_19
    new-instance v19, Lyo0/i$a;

    const/16 v27, 0x0

    move-object/from16 v22, v6

    move-object/from16 v26, v11

    invoke-direct/range {v19 .. v27}, Lyo0/i$a;-><init>(JLjava/lang/String;JLc93/a;Lp1/a1;Lq83/d;)V

    move-object/from16 v10, v19

    move-wide/from16 v30, v20

    move-object/from16 v2, v22

    move-wide/from16 v28, v23

    move-object/from16 v32, v25

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    check-cast v10, Lc93/m;

    invoke-static {v4, v10, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v26 .. v26}, Lyo0/i;->e(Lp1/a1;)I

    move-result v3

    invoke-static {v3, v2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v14, Lw3/k;

    invoke-direct {v14, v0}, Lw3/k;-><init>(I)V

    and-int/lit8 v3, v5, 0x70

    shr-int/lit8 v6, v5, 0x3

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v3, v6

    shl-int/lit8 v6, v5, 0xf

    const/high16 v10, 0x70000000

    and-int/2addr v6, v10

    or-int v25, v3, v6

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v3, v3, 0x12

    shl-int/lit8 v5, v5, 0xc

    and-int/2addr v5, v12

    or-int v26, v3, v5

    const v27, 0x2fdf8

    move-object v3, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    move-object/from16 v24, v4

    move-wide/from16 v4, p3

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move v6, v0

    move-object v2, v3

    move-wide/from16 v7, v28

    move-wide/from16 v9, v30

    move-object/from16 v11, v32

    goto :goto_1b

    :cond_28
    move-object/from16 v24, v4

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move-object v2, v7

    move v6, v10

    move-wide v9, v12

    move-wide/from16 v7, p6

    :goto_1b
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_29

    new-instance v0, Lyo0/h;

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lyo0/h;-><init>(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;II)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final f(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v14, p12

    move-object/from16 v12, p13

    invoke-static/range {v1 .. v14}, Lyo0/i;->c(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic h(Lp1/a1;I)V
    .locals 0

    invoke-static {p0, p1}, Lyo0/i;->f(Lp1/a1;I)V

    return-void
.end method

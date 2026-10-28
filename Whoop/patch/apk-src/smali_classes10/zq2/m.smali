.class public abstract Lzq2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ll0/y;",
        "Lkd1/o;",
        "avatar",
        "Ler2/g;",
        "chatType",
        "Lzq2/a;",
        "userSelectedAnswer",
        "Ll83/a0;",
        "b",
        "(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzq2/m;->c(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    sget-object v3, Lb2/e;->K:Lb2/l;

    const-string v4, "<this>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "chatType"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v4, -0x68cf27a1

    invoke-virtual {v5, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v9, 0x6

    const/4 v6, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_1
    move v4, v9

    :goto_1
    and-int/lit8 v10, v9, 0x30

    if-nez v10, :cond_4

    and-int/lit8 v10, v9, 0x40

    if-nez v10, :cond_2

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_2

    :cond_2
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_2
    if-eqz v10, :cond_3

    const/16 v10, 0x20

    goto :goto_3

    :cond_3
    const/16 v10, 0x10

    :goto_3
    or-int/2addr v4, v10

    :cond_4
    and-int/lit16 v10, v9, 0x180

    if-nez v10, :cond_6

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    invoke-virtual {v5, v10}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :cond_6
    and-int/lit16 v10, v9, 0xc00

    if-nez v10, :cond_9

    and-int/lit16 v10, v9, 0x1000

    if-nez v10, :cond_7

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_5

    :cond_7
    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_5
    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_6

    :cond_8
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :cond_9
    and-int/lit16 v10, v4, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x1

    if-eq v10, v11, :cond_a

    move v10, v13

    goto :goto_7

    :cond_a
    const/4 v10, 0x0

    :goto_7
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v5, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_17

    if-eqz v2, :cond_b

    move/from16 v36, v13

    goto :goto_8

    :cond_b
    const/16 v36, 0x0

    :goto_8
    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v0, v13}, Ler2/e;->m(Landroidx/compose/ui/Modifier;Ler2/g;Z)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v6, v6

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v6, v14

    if-eqz v36, :cond_c

    int-to-float v15, v13

    mul-float/2addr v15, v14

    goto :goto_9

    :cond_c
    move v15, v6

    :goto_9
    const-wide/high16 v7, 0x3ff4000000000000L    # 1.25

    if-eqz v36, :cond_d

    int-to-float v12, v13

    :goto_a
    mul-float/2addr v12, v14

    goto :goto_b

    :cond_d
    double-to-float v12, v7

    goto :goto_a

    :goto_b
    if-eqz v36, :cond_e

    int-to-float v7, v13

    :goto_c
    mul-float/2addr v7, v14

    goto :goto_d

    :cond_e
    double-to-float v7, v7

    goto :goto_c

    :goto_d
    invoke-static {v11, v6, v12, v15, v7}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->O:Lb2/k;

    move-object v8, v1

    check-cast v8, Ll0/z;

    invoke-virtual {v8, v6, v7}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->a:Ll0/e;

    sget-object v8, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x0

    invoke-static {v7, v8, v5, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_f
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_e
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-nez v11, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    :cond_10
    invoke-static {v8, v5, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v5, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v36, :cond_12

    const-wide v6, 0x404d400000000000L    # 58.5

    double-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v8, v7

    mul-float/2addr v6, v8

    const/4 v7, 0x0

    invoke-static {v10, v7, v6, v13}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v7, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v7, v3}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v11, v3

    goto :goto_f

    :cond_12
    new-instance v6, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v6, v3}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    move-object v11, v6

    :goto_f
    if-eqz p3, :cond_13

    invoke-virtual/range {p3 .. p3}, Lzq2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :cond_14
    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v5, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->P()Lb91/a;

    move-result-object v30

    sget-object v8, Ler2/g;->STRAIN:Ler2/g;

    if-ne v0, v8, :cond_15

    const v8, -0x34ac13b3    # -1.3888589E7f

    invoke-static {v5, v8, v6, v5, v7}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    const/4 v8, 0x0

    :goto_10
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_15
    const/4 v8, 0x0

    const v12, -0x34ac0f73    # -1.3889677E7f

    invoke-virtual {v5, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v6

    goto :goto_10

    :goto_11
    sget v12, Lb91/a;->d:I

    shl-int/lit8 v34, v12, 0x12

    const v35, 0x2fff8

    move v12, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v32, v5

    move v5, v13

    move-object/from16 v37, v10

    move-object v10, v3

    move v3, v12

    move-wide v12, v6

    move-object/from16 v6, v37

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v32

    if-eqz v36, :cond_16

    if-eqz v2, :cond_16

    const v10, -0x60d47e89

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    mul-float v15, v10, v3

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v6

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x6

    int-to-float v6, v6

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v6, v10

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->L:Lb2/l;

    new-instance v10, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v10, v6}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v3, v10}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lt0/j;->a:Lt0/i;

    invoke-static {v3, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget v3, Lkd1/o;->a:I

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int v6, v3, v4

    move-object/from16 v32, v7

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v10, v5

    move-object/from16 v5, v32

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    const/16 v18, 0x30

    const/16 v19, 0x78

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move v5, v10

    move-object/from16 v17, v32

    move-object v10, v3

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v7, v17

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_16
    const v2, -0x60cf8881

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_17
    move-object v7, v5

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lzq0/a;

    const/4 v6, 0x4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v9

    invoke-direct/range {v0 .. v6}, Lzq0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final c(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lzq2/m;->b(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

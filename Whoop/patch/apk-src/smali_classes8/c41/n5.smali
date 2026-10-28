.class public abstract Lc41/n5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aE\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "listOfText",
        "Li2/x;",
        "textColor",
        "Li2/a1;",
        "textPartitionShape",
        "partitionShapeColor",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lc41/n5;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/util/TextResource;",
            ">;J",
            "Li2/a1;",
            "J",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v8, p8

    const-string v0, "listOfText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x3209178d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v8, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v8

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v8

    :goto_1
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p9, 0x4

    if-nez v6, :cond_5

    move-wide/from16 v6, p2

    invoke-virtual {v0, v6, v7}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_5
    move-wide/from16 v6, p2

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v5, v9

    goto :goto_4

    :cond_7
    move-wide/from16 v6, p2

    :goto_4
    and-int/lit16 v9, v8, 0xc00

    if-nez v9, :cond_a

    and-int/lit8 v9, p9, 0x8

    if-nez v9, :cond_8

    move-object/from16 v9, p4

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_5

    :cond_8
    move-object/from16 v9, p4

    :cond_9
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v5, v10

    goto :goto_6

    :cond_a
    move-object/from16 v9, p4

    :goto_6
    and-int/lit16 v10, v8, 0x6000

    if-nez v10, :cond_d

    and-int/lit8 v10, p9, 0x10

    if-nez v10, :cond_b

    move-wide/from16 v10, p5

    invoke-virtual {v0, v10, v11}, Lp1/q;->f(J)Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x4000

    goto :goto_7

    :cond_b
    move-wide/from16 v10, p5

    :cond_c
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v5, v12

    goto :goto_8

    :cond_d
    move-wide/from16 v10, p5

    :goto_8
    and-int/lit16 v12, v5, 0x2493

    const/16 v13, 0x2492

    if-eq v12, v13, :cond_e

    const/4 v12, 0x1

    goto :goto_9

    :cond_e
    const/4 v12, 0x0

    :goto_9
    and-int/lit8 v13, v5, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1d

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v12, v8, 0x1

    sget-object v13, Lb2/t;->w:Lb2/t;

    const v16, -0xe001

    if-eqz v12, :cond_13

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p9, 0x4

    if-eqz v1, :cond_10

    and-int/lit16 v5, v5, -0x381

    :cond_10
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_11

    and-int/lit16 v5, v5, -0x1c01

    :cond_11
    and-int/lit8 v1, p9, 0x10

    if-eqz v1, :cond_12

    :goto_a
    and-int v5, v5, v16

    :cond_12
    move-wide/from16 v36, v6

    move v7, v5

    move-wide v5, v10

    move-wide/from16 v11, v36

    move-object v1, v9

    goto :goto_c

    :cond_13
    :goto_b
    if-eqz v1, :cond_14

    move-object v4, v13

    :cond_14
    and-int/lit8 v1, p9, 0x4

    const/4 v12, 0x6

    if-eqz v1, :cond_15

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v6

    and-int/lit16 v5, v5, -0x381

    :cond_15
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_16

    sget-object v1, Lt0/j;->a:Lt0/i;

    and-int/lit16 v5, v5, -0x1c01

    move-object v9, v1

    :cond_16
    and-int/lit8 v1, p9, 0x10

    if-eqz v1, :cond_12

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v10

    goto :goto_a

    :goto_c
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->e:Ll0/h;

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v14, v14

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v14, v15

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v3, 0x36

    invoke-static {v10, v9, v0, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p0, v4

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-wide/from16 p2, v5

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-eqz v5, :cond_17

    invoke-virtual {v0, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_d
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_18

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    :cond_18
    invoke-static {v9, v0, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1c

    const v3, -0x34701496    # -1.8863828E7f

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1a

    const v3, -0x346fd522

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/util/TextResource;

    const/4 v5, 0x0

    invoke-static {v3, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v29

    and-int/lit16 v3, v7, 0x380

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v31, v0

    move/from16 v32, v3

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_1a
    const/4 v5, 0x0

    const v3, -0x346bd5a6    # -1.942034E7f

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const v3, 0x6912c79

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v4

    move v6, v5

    :goto_e
    if-ge v6, v3, :cond_1b

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/util/TextResource;

    invoke-static {v9, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->s()Lb91/a;

    move-result-object v29

    and-int/lit16 v10, v7, 0x380

    const/16 v33, 0x0

    const v34, 0x2fffa

    move/from16 v32, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    move v15, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    move/from16 v20, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    move-object/from16 v25, v23

    const-wide/16 v22, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    move-object/from16 v35, v30

    const/16 v30, 0x0

    move/from16 v5, v31

    move-object/from16 v31, v0

    move v0, v5

    move-object/from16 v5, v35

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v31

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v13, v4

    const/4 v14, 0x4

    int-to-float v15, v14

    mul-float/2addr v13, v15

    invoke-static {v13, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static/range {p2 .. p3}, Li91/c;->o(J)Li91/a;

    move-result-object v13

    invoke-static {v10, v13}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v13, 0x0

    invoke-static {v10, v9, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 v6, v6, 0x1

    move v14, v13

    move-object v13, v5

    move v5, v14

    move v14, v0

    move-object v0, v9

    goto/16 :goto_e

    :cond_1b
    move-object v9, v0

    move v13, v5

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-static {v2}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v9, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v29

    and-int/lit16 v3, v7, 0x380

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move/from16 v32, v3

    move-object/from16 v31, v9

    move-object v9, v0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v31

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1c
    const/4 v4, 0x1

    const/4 v5, 0x0

    const v3, -0x345ed107    # -2.1126642E7f

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    move-wide/from16 v6, p2

    move-object v5, v1

    move-wide v3, v11

    move-object/from16 v1, p0

    goto :goto_11

    :cond_1d
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v4

    move-wide v3, v6

    move-object v5, v9

    move-wide v6, v10

    :goto_11
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1e

    new-instance v0, Lc41/m5;

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lc41/m5;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-wide/from16 v6, p5

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lc41/n5;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

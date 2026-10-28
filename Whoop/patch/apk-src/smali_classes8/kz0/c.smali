.class public abstract Lkz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001ak\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0015\u001a\u00020\u00138\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "progress",
        "total",
        "Li2/x;",
        "completedColor",
        "incompleteColor",
        "",
        "Lkz0/a;",
        "sections",
        "currentSectionIndex",
        "Ly3/f;",
        "barHeight",
        "Li2/a1;",
        "barShape",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "animatedWeight",
        "fillFraction",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p14}, Lkz0/c;->e(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "IIJJ",
            "Ljava/util/List<",
            "Lkz0/a;",
            ">;IF",
            "Li2/a1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v8, p7

    move/from16 v12, p12

    move/from16 v13, p13

    sget-object v0, Lb2/e;->K:Lb2/l;

    const-string v1, "sections"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p11

    check-cast v1, Lp1/q;

    const v4, 0x57dae610

    invoke-virtual {v1, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v13, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v7, v12, 0x6

    move v9, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v12, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v12

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v9, v12

    :goto_1
    and-int/lit8 v10, v12, 0x30

    if-nez v10, :cond_4

    invoke-virtual {v1, v2}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x20

    goto :goto_2

    :cond_3
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_4
    and-int/lit16 v10, v12, 0x180

    if-nez v10, :cond_6

    invoke-virtual {v1, v3}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_3

    :cond_5
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v9, v10

    :cond_6
    and-int/lit16 v10, v12, 0xc00

    if-nez v10, :cond_9

    and-int/lit8 v10, v13, 0x8

    if-nez v10, :cond_7

    move-wide/from16 v10, p3

    invoke-virtual {v1, v10, v11}, Lp1/q;->f(J)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x800

    goto :goto_4

    :cond_7
    move-wide/from16 v10, p3

    :cond_8
    const/16 v14, 0x400

    :goto_4
    or-int/2addr v9, v14

    goto :goto_5

    :cond_9
    move-wide/from16 v10, p3

    :goto_5
    and-int/lit16 v14, v12, 0x6000

    if-nez v14, :cond_c

    and-int/lit8 v14, v13, 0x10

    if-nez v14, :cond_a

    move-wide/from16 v14, p5

    invoke-virtual {v1, v14, v15}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x4000

    goto :goto_6

    :cond_a
    move-wide/from16 v14, p5

    :cond_b
    const/16 v16, 0x2000

    :goto_6
    or-int v9, v9, v16

    goto :goto_7

    :cond_c
    move-wide/from16 v14, p5

    :goto_7
    const/high16 v16, 0x30000

    and-int v16, v12, v16

    if-nez v16, :cond_e

    invoke-virtual {v1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v16, 0x10000

    :goto_8
    or-int v9, v9, v16

    :cond_e
    and-int/lit8 v16, v13, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_f

    or-int v9, v9, v17

    move/from16 v6, p8

    goto :goto_a

    :cond_f
    and-int v17, v12, v17

    move/from16 v6, p8

    if-nez v17, :cond_11

    invoke-virtual {v1, v6}, Lp1/q;->e(I)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v17, 0x80000

    :goto_9
    or-int v9, v9, v17

    :cond_11
    :goto_a
    and-int/lit16 v5, v13, 0x80

    const/high16 v17, 0xc00000

    if-eqz v5, :cond_13

    or-int v9, v9, v17

    :cond_12
    move/from16 v17, v4

    move/from16 v4, p9

    goto :goto_c

    :cond_13
    and-int v17, v12, v17

    if-nez v17, :cond_12

    move/from16 v17, v4

    move/from16 v4, p9

    invoke-virtual {v1, v4}, Lp1/q;->d(F)Z

    move-result v18

    if-eqz v18, :cond_14

    const/high16 v18, 0x800000

    goto :goto_b

    :cond_14
    const/high16 v18, 0x400000

    :goto_b
    or-int v9, v9, v18

    :goto_c
    and-int/lit16 v4, v13, 0x100

    const/high16 v18, 0x6000000

    if-eqz v4, :cond_16

    or-int v9, v9, v18

    :cond_15
    move/from16 v18, v4

    move-object/from16 v4, p10

    goto :goto_e

    :cond_16
    and-int v18, v12, v18

    if-nez v18, :cond_15

    move/from16 v18, v4

    move-object/from16 v4, p10

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x4000000

    goto :goto_d

    :cond_17
    const/high16 v19, 0x2000000

    :goto_d
    or-int v9, v9, v19

    :goto_e
    const v19, 0x2492493

    and-int v4, v9, v19

    move/from16 v19, v5

    const v5, 0x2492492

    const/4 v6, 0x1

    if-eq v4, v5, :cond_18

    move v4, v6

    goto :goto_f

    :cond_18
    const/4 v4, 0x0

    :goto_f
    and-int/lit8 v5, v9, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_3d

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v4, v12, 0x1

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_1a

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_19

    goto :goto_10

    :cond_19
    invoke-virtual {v1}, Lp1/q;->X()V

    move/from16 v4, p8

    move/from16 v9, p9

    move/from16 v22, v6

    const/16 v21, 0x0

    move-object/from16 v6, p10

    goto :goto_14

    :cond_1a
    :goto_10
    if-eqz v17, :cond_1b

    move-object v7, v5

    :cond_1b
    and-int/lit8 v4, v13, 0x8

    const/16 v21, 0x0

    const/4 v9, 0x6

    if-eqz v4, :cond_1c

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v1, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v10

    :cond_1c
    and-int/lit8 v4, v13, 0x10

    if-eqz v4, :cond_1d

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v1, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->Y0()J

    move-result-wide v14

    :cond_1d
    if-eqz v16, :cond_1e

    const/4 v4, 0x0

    goto :goto_11

    :cond_1e
    move/from16 v4, p8

    :goto_11
    if-eqz v19, :cond_1f

    int-to-float v9, v6

    move/from16 p0, v4

    move/from16 v22, v6

    const/4 v6, 0x4

    int-to-float v4, v6

    mul-float/2addr v4, v9

    goto :goto_12

    :cond_1f
    move/from16 p0, v4

    move/from16 v22, v6

    const/4 v6, 0x4

    move/from16 v4, p9

    :goto_12
    if-eqz v18, :cond_20

    move v9, v4

    move-object/from16 v6, v21

    :goto_13
    move/from16 v4, p0

    goto :goto_14

    :cond_20
    move-object/from16 v6, p10

    move v9, v4

    goto :goto_13

    :goto_14
    invoke-virtual {v1}, Lp1/q;->r()V

    if-nez v6, :cond_21

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v12, v12

    const/4 v13, 0x4

    int-to-float v8, v13

    mul-float/2addr v12, v8

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    goto :goto_15

    :cond_21
    move-object v8, v6

    :goto_15
    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->E:Lb2/m;

    move-object/from16 p3, v7

    const/4 v7, 0x0

    invoke-static {v13, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-wide/from16 p4, v14

    iget-wide v14, v1, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v1, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    move-object/from16 p6, v6

    iget-boolean v6, v1, Lp1/q;->S:Z

    if-eqz v6, :cond_22

    invoke-virtual {v1, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_22
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_16
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v1, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v1, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_23

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    :cond_23
    invoke-static {v7, v1, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, p7

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    sget-object v7, Li2/w0;->a:Li2/v0;

    const-string v12, "invalid weight; must be greater than zero"

    const-wide/16 v23, 0x0

    move/from16 p8, v3

    if-nez p8, :cond_33

    const v3, 0x3dd28d8a

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 p9, v12

    sget-object v12, Ll0/m;->e:Ll0/h;

    move-wide/from16 v25, v10

    const/16 v10, 0x36

    invoke-static {v12, v0, v1, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v10, v1, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_25

    invoke-virtual {v1, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_25
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lp1/q;->S:Z

    if-nez v0, :cond_26

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    :cond_26
    invoke-static {v10, v1, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v1, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    const/high16 v2, 0x41000000    # 8.0f

    mul-float/2addr v0, v2

    const/high16 v3, 0x42000000    # 32.0f

    add-float/2addr v0, v3

    const v6, 0x73de7f28

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    move-object/from16 v6, p7

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v10, 0x0

    :goto_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_32

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v10, 0x1

    if-ltz v10, :cond_31

    check-cast v11, Lkz0/a;

    if-ne v10, v4, :cond_28

    move/from16 v13, v22

    goto :goto_19

    :cond_28
    const/4 v13, 0x0

    :goto_19
    if-eqz v13, :cond_29

    move v14, v3

    goto :goto_1a

    :cond_29
    move v14, v2

    :goto_1a
    sget-object v15, Ld0/b0;->a:Ld0/v;

    const/16 v2, 0x12c

    move/from16 p10, v0

    move-object/from16 v18, v1

    move-object v1, v15

    const/4 v0, 0x0

    const/4 v3, 0x2

    invoke-static {v2, v0, v1, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v15

    const/16 v19, 0x0

    const/16 v20, 0x1c

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v3, v1

    move-wide/from16 v0, p4

    invoke-static/range {v14 .. v20}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v27

    invoke-virtual {v11}, Lkz0/a;->d()I

    move-result v14

    if-lez v14, :cond_2a

    invoke-virtual {v11}, Lkz0/a;->c()I

    move-result v14

    add-int/2addr v14, v13

    int-to-float v13, v14

    invoke-virtual {v11}, Lkz0/a;->d()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v13, v11

    :goto_1b
    move v14, v13

    const/4 v11, 0x2

    const/4 v13, 0x0

    goto :goto_1c

    :cond_2a
    const/4 v13, 0x0

    goto :goto_1b

    :goto_1c
    invoke-static {v2, v13, v3, v11}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v15

    const/16 v19, 0xc00

    const/16 v20, 0x14

    const-string v16, "fillFraction"

    const/16 v17, 0x0

    invoke-static/range {v14 .. v20}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static/range {v27 .. v27}, Lkz0/c;->c(Lp1/t2;)F

    move-result v14

    div-float v14, v14, p10

    move/from16 p4, v12

    float-to-double v11, v14

    cmpl-double v11, v11, v23

    if-lez v11, :cond_2b

    goto :goto_1d

    :cond_2b
    invoke-static/range {p9 .. p9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1d
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v15, v14, v12

    if-lez v15, :cond_2c

    move v14, v12

    :cond_2c
    move/from16 v12, v22

    invoke-direct {v11, v14, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v13, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11, v0, v1, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v12, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v3, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    move-wide/from16 v16, v0

    iget-boolean v0, v3, Lp1/q;->S:Z

    if-eqz v0, :cond_2d

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_2d
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1e
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v3, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-nez v1, :cond_2e

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    :cond_2e
    invoke-static {v13, v3, v13, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lkz0/c;->d(Lp1/t2;)F

    move-result v0

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-wide/from16 v11, v25

    invoke-static {v0, v11, v12, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v13, 0x0

    invoke-static {v0, v3, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v0

    if-eq v10, v1, :cond_30

    const v1, 0x48fef9fe

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v0

    const/4 v2, 0x4

    int-to-float v10, v2

    invoke-static {v1, v10, v5, v3, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1f

    :cond_30
    const v1, 0x49004bd8    # 525501.5f

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    :goto_1f
    move/from16 v10, p4

    move/from16 v22, v0

    move-object v1, v3

    move-wide/from16 v25, v11

    move-wide/from16 p4, v16

    const/high16 v2, 0x41000000    # 8.0f

    const/high16 v3, 0x42000000    # 32.0f

    move/from16 v0, p10

    goto/16 :goto_18

    :cond_31
    invoke-static {}, Lwb3/f;->d0()V

    throw v21

    :cond_32
    move-wide/from16 v16, p4

    move-object v3, v1

    move/from16 v0, v22

    move-wide/from16 v11, v25

    const/4 v13, 0x0

    invoke-static {v3, v13, v0, v13}, Lm4/a;->y(Lp1/q;ZZZ)V

    move/from16 v2, p1

    move-object/from16 v10, p6

    move v12, v0

    move/from16 v0, p2

    goto/16 :goto_28

    :cond_33
    move-wide/from16 v16, p4

    move-object v3, v1

    move-object/from16 p9, v12

    move-wide v11, v10

    const v1, 0x3df72652

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v1, Ll0/m;->e:Ll0/h;

    const/16 v10, 0x36

    invoke-static {v1, v0, v3, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move-wide/from16 v25, v11

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_34

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_34
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_20
    invoke-static {v3, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v3, Lp1/q;->S:Z

    if-nez v0, :cond_35

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    :cond_35
    invoke-static {v1, v3, v1, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    invoke-static {v3, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x5ab134fa

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    move/from16 v0, p2

    const/4 v12, 0x1

    if-gt v12, v0, :cond_3c

    move v1, v12

    :goto_21
    move/from16 v2, p1

    if-gt v12, v1, :cond_37

    if-gt v1, v2, :cond_37

    move-wide/from16 v14, v25

    goto :goto_22

    :cond_37
    move-wide/from16 v14, v16

    :goto_22
    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v8, 0x3f800000    # 1.0f

    float-to-double v10, v8

    cmpl-double v10, v10, v23

    if-lez v10, :cond_38

    :goto_23
    const/4 v12, 0x1

    goto :goto_24

    :cond_38
    invoke-static/range {p9 .. p9}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_23

    :goto_24
    invoke-static {v6, v12, v8}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v10, p6

    if-eqz p6, :cond_39

    invoke-static {v5, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    goto :goto_25

    :cond_39
    move-object v11, v5

    :goto_25
    invoke-interface {v6, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v14, v15, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v13, 0x0

    invoke-static {v6, v3, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    if-eq v1, v0, :cond_3a

    const v6, -0x48261b6

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    int-to-float v6, v12

    const/4 v11, 0x4

    int-to-float v12, v11

    invoke-static {v6, v12, v5, v3, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_26

    :cond_3a
    const/4 v11, 0x4

    const v6, -0x4810fdc

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    :goto_26
    if-eq v1, v0, :cond_3b

    add-int/lit8 v1, v1, 0x1

    move-object/from16 p6, v10

    const/4 v12, 0x1

    goto :goto_21

    :cond_3b
    const/4 v12, 0x1

    goto :goto_27

    :cond_3c
    move/from16 v2, p1

    move-object/from16 v10, p6

    const/4 v13, 0x0

    :goto_27
    invoke-static {v3, v13, v12, v13}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_28
    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    move-object/from16 v1, p3

    move-object v11, v10

    move-wide/from16 v6, v16

    move v10, v9

    move v9, v4

    move-wide/from16 v4, v25

    goto :goto_29

    :cond_3d
    move v0, v3

    move-object v3, v1

    invoke-virtual {v3}, Lp1/q;->X()V

    move/from16 v9, p8

    move-object v1, v7

    move-wide v4, v10

    move-wide v6, v14

    move/from16 v10, p9

    move-object/from16 v11, p10

    :goto_29
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_3e

    new-instance v0, Lkz0/b;

    move/from16 v3, p2

    move-object/from16 v8, p7

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lkz0/b;-><init>(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;II)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_3e
    return-void
.end method

.method private static final c(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final d(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v14, p12

    move-object/from16 v12, p13

    invoke-static/range {v1 .. v14}, Lkz0/c;->b(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

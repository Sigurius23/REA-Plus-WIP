.class public abstract Ll72/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aM\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj72/b;",
        "state",
        "Lkotlin/Function1;",
        "La72/a;",
        "Ll83/a0;",
        "onAnalyticsEvent",
        "Lj72/h;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isChecked",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ll72/d;->m(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj72/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ll72/d;->l(Lj72/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lj72/b;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll72/d;->k(Lkotlin/jvm/functions/Function1;Lj72/b;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(La72/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/d;->g(La72/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lj72/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/d;->h(Lj72/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lj72/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x7cc453ff

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    const/16 v12, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v12

    goto :goto_3

    :cond_7
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v6, v10

    :goto_4
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v11, p3

    :goto_5
    move v14, v6

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v6, v14

    goto :goto_5

    :goto_7
    and-int/lit16 v6, v14, 0x493

    const/16 v15, 0x492

    const/4 v1, 0x0

    move/from16 v16, v7

    if-eq v6, v15, :cond_b

    const/4 v6, 0x1

    goto :goto_8

    :cond_b
    move v6, v1

    :goto_8
    and-int/lit8 v15, v14, 0x1

    invoke-virtual {v9, v15, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_2a

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v4, v15

    :cond_c
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v16, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_d

    new-instance v6, Ll60/a;

    const/16 v8, 0x8

    invoke-direct {v6, v8}, Ll60/a;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_e
    move-object v6, v8

    :goto_9
    if-eqz v10, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_f

    new-instance v8, Ll60/a;

    const/16 v10, 0x9

    invoke-direct {v8, v10}, Ll60/a;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v11, v8

    :cond_10
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_11

    invoke-virtual {v2}, Lj72/b;->i()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, Lp1/c1;

    and-int/lit16 v10, v14, 0x380

    if-ne v10, v12, :cond_12

    const/16 v16, 0x1

    goto :goto_a

    :cond_12
    move/from16 v16, v1

    :goto_a
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move/from16 v18, v14

    const/4 v14, 0x0

    if-nez v16, :cond_13

    if-ne v12, v0, :cond_14

    :cond_13
    new-instance v12, Ll72/d$a;

    invoke-direct {v12, v6, v2, v14}, Ll72/d$a;-><init>(Lkotlin/jvm/functions/Function1;Lj72/b;Lq83/d;)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v12, Lc93/m;

    invoke-static {v9, v12, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v14, 0x3

    move-object/from16 p2, v8

    int-to-float v8, v14

    const/16 v14, 0x8

    int-to-float v14, v14

    move/from16 v19, v14

    mul-float v14, v8, v19

    int-to-float v3, v3

    mul-float v3, v3, v19

    invoke-static {v13, v14, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    move-object/from16 v32, v4

    invoke-static {v7, v12, v9, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v1, v9, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 v22, v6

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_15

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_15
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    move/from16 v23, v8

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 v24, v10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto :goto_c

    :cond_16
    move/from16 v24, v10

    :goto_c
    invoke-static {v1, v9, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v8, v11

    const/high16 v13, 0x3f800000    # 1.0f

    float-to-double v10, v13

    const-wide/16 v25, 0x0

    cmpl-double v10, v10, v25

    if-lez v10, :cond_18

    :goto_d
    const/4 v10, 0x1

    goto :goto_e

    :cond_18
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_d

    :goto_e
    invoke-static {v13, v13, v10}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v20, v8

    const/4 v13, 0x0

    invoke-static {v13, v9, v10}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v10, 0xe

    invoke-static {v11, v8, v10}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v7, v12, v9, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_19

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_19
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v9, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_1a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    :cond_1a
    invoke-static {v10, v9, v10, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lj72/b;->c()Lkd1/o;

    move-result-object v6

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v5, p2

    move-object/from16 v4, v20

    move-object/from16 v2, v22

    const/4 v1, 0x1

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    const/16 v7, 0x19

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move v9, v14

    const/16 v14, 0x1b0

    move-object v10, v15

    const/16 v15, 0x78

    move v11, v8

    move-object v8, v7

    const/4 v7, 0x0

    move v12, v9

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move/from16 v20, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 p3, v2

    move-object/from16 p2, v4

    move-object/from16 p4, v5

    move-object v2, v13

    move/from16 v34, v18

    move/from16 v37, v19

    move/from16 v4, v20

    move/from16 v1, v22

    move/from16 v36, v23

    move/from16 v35, v24

    move-object/from16 v13, v28

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lj72/b;->h()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->O()Lb91/a;

    move-result-object v26

    invoke-virtual {v7, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v30, v12, 0x12

    const v31, 0x2fffa

    move-object v12, v7

    const/4 v7, 0x0

    move v13, v8

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move-object/from16 v17, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v38, v27

    const/16 v27, 0x0

    move-object/from16 v39, v29

    const/16 v29, 0x0

    move/from16 v5, v38

    move-object/from16 v38, v0

    move v0, v5

    move-object/from16 v5, v39

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lj72/b;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    move-wide v8, v7

    const/4 v7, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, 0x70dd612b

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lj72/b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj72/e;

    invoke-virtual {v1}, Lj72/e;->b()Ljava/lang/String;

    move-result-object v6

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v9, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v30, v8, 0x12

    const v31, 0x2fffa

    move v8, v7

    const/4 v7, 0x0

    move v12, v8

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v39, v29

    const/16 v29, 0x0

    move-object/from16 v40, v0

    move/from16 v0, v39

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v10, 0x1

    int-to-float v6, v10

    mul-float v18, v6, v37

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v2

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lj72/e;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    const/16 v29, 0x30

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide v8, v0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v0, v40

    goto/16 :goto_10

    :cond_1c
    const/4 v13, 0x0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    mul-float v22, v0, v37

    const/16 v23, 0x0

    const/16 v25, 0x5

    const/16 v21, 0x0

    move/from16 v24, v3

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v5, v1, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_1d

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_11
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v9, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_1e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    :cond_1e
    invoke-static {v5, v9, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x7

    int-to-float v0, v0

    mul-float/2addr v0, v4

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v10, v36

    invoke-static {v0, v10, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v4, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_20

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_20
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v9, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_21

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    :cond_21
    invoke-static {v10, v9, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "SAGE_INFO_CHECKBOX"

    invoke-static {v2, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p4 .. p4}, Ll72/d;->i(Lp1/c1;)Z

    move-result v1

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->w()J

    move-result-wide v12

    const/4 v15, 0x0

    const/16 v16, 0x18

    move-object/from16 v28, v9

    move-wide v8, v6

    move-wide v6, v10

    move-wide v10, v12

    const-wide/16 v12, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v6 .. v16}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v10

    move-object v9, v14

    move/from16 v6, v35

    const/16 v7, 0x100

    if-ne v6, v7, :cond_23

    const/4 v7, 0x1

    :goto_13
    move-object/from16 v14, p1

    goto :goto_14

    :cond_23
    const/4 v7, 0x0

    goto :goto_13

    :goto_14
    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v6, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v15, v38

    if-nez v6, :cond_25

    if-ne v7, v15, :cond_24

    goto :goto_15

    :cond_24
    move-object/from16 v8, p3

    move-object/from16 v11, p4

    goto :goto_16

    :cond_25
    :goto_15
    new-instance v7, Ljs2/h;

    const/16 v6, 0x9

    move-object/from16 v8, p3

    move-object/from16 v11, p4

    invoke-direct {v7, v8, v14, v11, v6}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v12, 0x180

    const/16 v13, 0x18

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move-object v6, v8

    move-object v8, v0

    move-object v0, v6

    move v6, v1

    move-object v1, v11

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v13}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    int-to-float v6, v10

    mul-float v6, v6, v37

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v14}, Lj72/b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-static {v1}, Ll72/d;->i(Lp1/c1;)Z

    move-result v7

    if-eqz v7, :cond_26

    const v7, -0x1108885

    invoke-static {v9, v7, v4, v9, v5}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v4

    const/4 v7, 0x0

    :goto_17
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_26
    const/4 v7, 0x0

    const v8, -0x1108448

    invoke-static {v9, v8, v4, v9, v5}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v4

    goto :goto_17

    :goto_18
    sget v8, Lb91/a;->d:I

    shl-int/lit8 v30, v8, 0x12

    const v31, 0x2fffa

    move/from16 v33, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v38, v15

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

    move-object/from16 v28, v9

    move-wide v8, v4

    move-object/from16 v4, v38

    move-object/from16 v5, p1

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static {v2, v7, v6}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    move/from16 v22, v3

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lj72/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v1}, Ll72/d;->i(Lp1/c1;)Z

    move-result v7

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move/from16 v2, v34

    and-int/lit16 v2, v2, 0x1c00

    const/16 v3, 0x800

    if-ne v2, v3, :cond_27

    const/16 v33, 0x1

    :cond_27
    or-int v1, v1, v33

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_29

    if-ne v2, v4, :cond_28

    goto :goto_19

    :cond_28
    move-object/from16 v4, p2

    goto :goto_1a

    :cond_29
    :goto_19
    new-instance v2, Ll01/q;

    const/4 v1, 0x3

    move-object/from16 v4, p2

    invoke-direct {v2, v1, v5, v4}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object/from16 v19, v2

    check-cast v19, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x12

    or-int/lit8 v21, v1, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x1fbc

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v28

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v20

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move-object v3, v0

    move-object/from16 v1, v32

    goto :goto_1b

    :cond_2a
    move-object v5, v2

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v4

    move-object v3, v8

    move-object v4, v11

    :goto_1b
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2b

    new-instance v0, Lkw1/c;

    const/4 v7, 0x3

    move/from16 v6, p6

    move-object v2, v5

    move/from16 v5, p5

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final g(La72/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lj72/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final j(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lj72/b;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p2, p3}, Ll72/d;->j(Lp1/c1;Z)V

    invoke-static {p2}, Ll72/d;->i(Lp1/c1;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, La72/a$i;

    invoke-virtual {p1}, Lj72/b;->e()Lj72/g;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const-string p3, "acknowledge"

    invoke-direct {p2, p1, p3}, La72/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lj72/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 8

    invoke-virtual {p0}, Lj72/b;->a()Lj72/g;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lj72/h$d;

    new-instance v2, Lg72/f;

    invoke-virtual {p0}, Lj72/b;->e()Lj72/g;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lg72/f;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v0, v2}, Lj72/h$d;-><init>(Lj72/g;Lg72/f;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ll72/d;->f(Landroidx/compose/ui/Modifier;Lj72/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lnq2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnq2/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lnq2/i;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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

    invoke-static {p0}, Lnq2/h;->h(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnq2/h;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lnq2/h;->i(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lnq2/h;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final e(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq2/i;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x732639b3

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    const/4 v14, 0x2

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v14

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    :goto_4
    move v15, v3

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    goto :goto_4

    :goto_6
    and-int/lit16 v3, v15, 0x93

    const/16 v8, 0x92

    if-eq v3, v8, :cond_8

    const/4 v3, 0x1

    goto :goto_7

    :cond_8
    const/4 v3, 0x0

    :goto_7
    and-int/lit8 v8, v15, 0x1

    invoke-virtual {v11, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_20

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_9

    move-object v4, v3

    goto :goto_8

    :cond_9
    move-object v4, v5

    :goto_8
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_a

    new-instance v6, Lno1/g;

    const/16 v7, 0x8

    invoke-direct {v6, v7}, Lno1/g;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v28, v6

    goto :goto_9

    :cond_b
    move-object/from16 v28, v7

    :goto_9
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x3

    int-to-float v12, v8

    int-to-float v2, v2

    invoke-static {v7, v12, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v13, v14

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v13, v6

    invoke-static {v13, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, Lb2/e;->N:Lb2/k;

    move-object/from16 v16, v4

    sget-object v4, Ll0/m;->c:Ll0/g;

    move/from16 v17, v6

    const/16 v6, 0x30

    invoke-static {v4, v14, v11, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v20, v4

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_c

    invoke-virtual {v11, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v11, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v9, v11, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->c()Lv41/r0;

    move-result-object v1

    if-nez v1, :cond_11

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    if-eqz v1, :cond_f

    invoke-static {v1}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_f
    move-object v1, v7

    :goto_b
    if-eqz v1, :cond_10

    invoke-static {v1}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v1

    goto :goto_c

    :cond_10
    move-object v1, v7

    :cond_11
    :goto_c
    const/16 v7, 0x50

    if-eqz v1, :cond_14

    const v9, 0x7848fc99

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    int-to-float v7, v7

    mul-float/2addr v7, v2

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    mul-float v12, v12, v17

    const/4 v9, 0x0

    const/4 v13, 0x1

    invoke-static {v7, v9, v12, v13}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v12, v13

    mul-float/2addr v12, v2

    invoke-static {v7, v9, v12, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_12

    new-instance v9, Lno2/a;

    const/16 v12, 0xa

    invoke-direct {v9, v12}, Lno2/a;-><init>(I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lc93/a;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v5, :cond_13

    new-instance v12, Lno1/g;

    const/16 v5, 0x9

    invoke-direct {v12, v5}, Lno1/g;-><init>(I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object v5, v8

    move-object v8, v12

    const v12, 0x1b0006

    move/from16 v18, v13

    const/16 v13, 0x19c

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x0

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move/from16 v24, v2

    move-object v2, v7

    move-object v7, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 p2, v0

    move-object v0, v3

    move-object/from16 p1, v16

    move-object/from16 v18, v17

    move-object/from16 v29, v22

    move-object/from16 v30, v25

    move-object v3, v1

    move/from16 v16, v15

    move-object/from16 v1, v20

    const/4 v15, 0x0

    invoke-static/range {v2 .. v13}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_d
    const/high16 v3, 0x3f800000    # 1.0f

    goto/16 :goto_e

    :cond_14
    move-object/from16 p2, v0

    move/from16 v24, v2

    move-object v0, v3

    move-object/from16 v18, v4

    move-object/from16 v23, v6

    move-object/from16 v29, v8

    move-object/from16 v30, v10

    move-object/from16 p1, v16

    move-object/from16 v1, v20

    move/from16 v16, v15

    const/4 v15, 0x0

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_15

    const v2, 0x784f8d9f

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v7

    mul-float v2, v2, v24

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v33, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->a()Ljava/lang/String;

    move-result-object v34

    const/16 v38, 0xe

    const/16 v39, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v33 .. v39}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lkd1/o$c;->f:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v11

    move-object/from16 v2, v33

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    const/16 v10, 0x1b0

    const/16 v11, 0x78

    move-object v6, v5

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v8

    const/4 v8, 0x0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    const v2, 0x7854b265

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v1, v14, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_16

    move-object/from16 v5, v18

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v5, v23

    goto :goto_10

    :cond_16
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v11, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v29

    invoke-static {v11, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    :cond_17
    move-object/from16 v1, v30

    goto :goto_12

    :cond_18
    :goto_11
    move-object/from16 v1, p2

    goto :goto_13

    :goto_12
    invoke-static {v3, v11, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v11, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->i()Lcom/whoop/user/journey/model/yearinreview/StyleType;

    move-result-object v3

    sget-object v4, Lnq2/h$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1b

    const/4 v5, 0x2

    if-eq v3, v5, :cond_1a

    const/4 v5, 0x3

    if-ne v3, v5, :cond_19

    goto :goto_14

    :cond_19
    const v0, 0x29febaea

    invoke-static {v0, v11, v15}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1a
    const/4 v5, 0x3

    :goto_14
    const v3, 0x29fed3e9

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v11, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->O()Lb91/a;

    move-result-object v3

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_15
    move-object/from16 v22, v3

    goto :goto_16

    :cond_1b
    const/4 v5, 0x3

    const v3, 0x29fec5a9

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v11, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->w()Lb91/a;

    move-result-object v3

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fffa

    move-object v9, v3

    const/4 v3, 0x0

    move/from16 v18, v4

    move/from16 v31, v5

    move-wide v4, v7

    move v8, v6

    const-wide/16 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move-object/from16 v17, v12

    move/from16 v14, v24

    move-object/from16 v24, v11

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v23, v15

    move/from16 v21, v16

    const-wide/16 v15, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x0

    move/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v40, v2

    move/from16 v42, v29

    move-object/from16 v41, v35

    move-object/from16 v29, v0

    move-object v2, v1

    move/from16 v1, v30

    move/from16 v0, v34

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_1c

    const v2, 0x15dda7c0

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v43, v29

    goto :goto_17

    :cond_1c
    const v3, 0x15dda7c1

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v13, 0x1

    int-to-float v3, v13

    move-object/from16 v4, v29

    invoke-static {v3, v1, v4, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    move/from16 v3, v40

    invoke-static {v2, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v12, v41

    move/from16 v10, v42

    invoke-virtual {v12, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lnq2/i;->g()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v11, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    const/16 v25, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-wide v4, v5

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v11

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

    move-object/from16 v43, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lnq2/i;->b()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_1d

    const v1, 0x15e2dad0

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v28

    :goto_18
    const/4 v13, 0x1

    goto :goto_1b

    :cond_1d
    const v3, 0x15e2dad1

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1f

    const v3, 0x1253a28

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x6

    int-to-float v3, v3

    move-object/from16 v4, v43

    invoke-static {v3, v1, v4, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    shl-int/lit8 v3, v33, 0x3

    and-int/lit16 v7, v3, 0x1c00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v11

    move-object/from16 v5, v28

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_19

    :cond_1e
    move-object/from16 v5, v28

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_1f
    move-object/from16 v5, v28

    const v1, 0x129d121

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_1b
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v4, p1

    goto :goto_1c

    :cond_20
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v5

    move-object v5, v7

    :goto_1c
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Lm31/h;

    const/16 v3, 0x14

    move-object/from16 v6, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lnq2/h;->e(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic j(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lnq2/h;->e(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

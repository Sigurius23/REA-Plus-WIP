.class public abstract Ll72/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lj72/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lj72/h;",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lj72/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lj72/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/e;->e(Lj72/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj72/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ll72/e;->g(Lj72/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lj72/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ll72/e;->f(Lkotlin/jvm/functions/Function1;Lj72/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lj72/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj72/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x5618d882

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v14, 0x12

    const/4 v15, 0x0

    if-eq v6, v14, :cond_6

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move v6, v15

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_18

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_7

    new-instance v3, Ll60/a;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Ll60/a;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v10, v3

    goto :goto_6

    :cond_8
    move-object v10, v4

    :goto_6
    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v6, v2

    const/16 v7, 0x8

    int-to-float v13, v7

    mul-float/2addr v6, v13

    move/from16 v16, v13

    const/4 v13, 0x0

    invoke-static {v4, v6, v13, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v6, v5, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move/from16 v17, v14

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v19, v10

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-nez v15, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v13, v5, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, Ll0/z;->a:Ll0/z;

    const/4 v8, 0x1

    invoke-virtual {v15, v2, v8, v11}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v28, v0

    const/4 v11, 0x0

    invoke-static {v11, v5, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v0

    const/16 v8, 0xe

    invoke-static {v2, v0, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x30

    invoke-static {v4, v2, v5, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v11, v9

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    move-object/from16 v24, v4

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-eqz v4, :cond_c

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v5, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v8, v5, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v5, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    invoke-virtual {v15, v3, v8, v0}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v2, 0x3c

    int-to-float v2, v2

    const/4 v9, 0x4

    int-to-float v4, v9

    mul-float/2addr v2, v4

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    invoke-virtual {v1}, Lj72/c;->b()Lkd1/o;

    move-result-object v2

    move-object/from16 v22, v6

    sget v6, Lkd1/o;->a:I

    move-object/from16 v23, v7

    const/4 v7, 0x3

    move-object/from16 v25, v3

    const/4 v3, 0x0

    move/from16 v26, v4

    const/4 v4, 0x0

    move-object/from16 v29, v22

    move-object/from16 v30, v23

    move-object/from16 v0, v24

    move-object/from16 v32, v25

    const/16 v31, 0x8

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    move-object v3, v10

    const/16 v10, 0x1b0

    move-object v4, v11

    const/16 v11, 0x78

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v34, v4

    move-object/from16 p1, v13

    move-object/from16 v33, v19

    move-object/from16 v4, v20

    move-object/from16 v1, v22

    const/high16 v13, 0x3f800000    # 1.0f

    move/from16 v20, v9

    move-object/from16 v19, v14

    move/from16 v14, v23

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    move-object/from16 v2, v32

    invoke-virtual {v15, v2, v14, v13}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v5, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    mul-float v3, v26, v16

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v29

    const/4 v11, 0x0

    invoke-static {v0, v7, v5, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_f

    invoke-virtual {v5, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v5, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v30

    invoke-static {v5, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    move-object/from16 v0, v19

    goto :goto_b

    :cond_11
    :goto_a
    move-object/from16 v0, p1

    goto :goto_c

    :goto_b
    invoke-static {v7, v5, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v5, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lj72/c;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-static {v0, v5, v11}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v1, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fffa

    move v9, v3

    const/4 v3, 0x0

    move/from16 v18, v4

    move-object/from16 v24, v5

    move-wide v4, v7

    move v8, v6

    const-wide/16 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    move/from16 v19, v12

    const-wide/16 v11, 0x0

    move/from16 v23, v13

    const/4 v13, 0x0

    move/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v30, v15

    move/from16 v29, v16

    const-wide/16 v15, 0x0

    move/from16 v32, v17

    const/16 v17, 0x0

    move/from16 v35, v18

    const/16 v18, 0x0

    move/from16 v36, v19

    const/16 v19, 0x0

    move/from16 v37, v20

    const/16 v20, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 p1, v1

    move-object v1, v2

    move/from16 v41, v30

    move-object v2, v0

    move/from16 v0, v40

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    int-to-float v2, v0

    mul-float v2, v2, v29

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lj72/c;->g()Ljava/lang/String;

    move-result-object v2

    const/4 v11, 0x0

    invoke-static {v2, v5, v11}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p1

    move/from16 v6, v41

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v25, 0x30

    const v27, 0x2fff8

    move/from16 v30, v6

    move-wide/from16 v42, v7

    move-object v8, v4

    move-wide/from16 v4, v42

    const-wide/16 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v13, v11

    const-wide/16 v11, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v0, v30

    move-object/from16 v30, v1

    move v1, v0

    move-object/from16 v0, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p0 .. p0}, Lj72/c;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    const/16 v25, 0x0

    const v27, 0x2fffa

    move v11, v3

    const/4 v3, 0x0

    move/from16 v21, v11

    const-wide/16 v11, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move-wide v4, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lj72/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object/from16 v1, v30

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v10, v1, v29

    const/4 v9, 0x0

    const/4 v11, 0x5

    const/4 v7, 0x0

    move/from16 v8, v36

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v1, v28, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_12

    const/4 v15, 0x1

    goto :goto_d

    :cond_12
    move/from16 v15, v38

    :goto_d
    and-int/lit8 v1, v28, 0xe

    const/4 v9, 0x4

    if-eq v1, v9, :cond_14

    and-int/lit8 v1, v28, 0x8

    if-eqz v1, :cond_13

    move-object/from16 v1, p0

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_e

    :cond_13
    move-object/from16 v1, p0

    goto :goto_f

    :cond_14
    move-object/from16 v1, p0

    :goto_e
    const/16 v38, 0x1

    :cond_15
    :goto_f
    or-int v3, v15, v38

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_17

    move-object/from16 v11, v34

    if-ne v4, v11, :cond_16

    goto :goto_10

    :cond_16
    move-object/from16 v6, v33

    goto :goto_11

    :cond_17
    :goto_10
    new-instance v4, Ll01/q;

    const/4 v3, 0x4

    move-object/from16 v6, v33

    invoke-direct {v4, v6, v1, v3}, Ll01/q;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object v15, v4

    check-cast v15, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v17, v3, 0x12

    const/16 v18, 0x0

    const/16 v19, 0x1fbe

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    move-object/from16 v33, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v8, v0

    move-object/from16 v16, v24

    invoke-static/range {v2 .. v19}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v16

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    move-object/from16 v3, v33

    goto :goto_12

    :cond_18
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_12
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lio2/k0;

    const/16 v5, 0x10

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final e(Lj72/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lj72/c;)Ll83/a0;
    .locals 7

    new-instance v0, Lj72/h$d;

    invoke-virtual {p1}, Lj72/c;->a()Lj72/g;

    move-result-object p1

    new-instance v1, Lg72/f;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lg72/f;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Lj72/h$d;-><init>(Lj72/g;Lg72/f;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lj72/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ll72/e;->d(Lj72/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

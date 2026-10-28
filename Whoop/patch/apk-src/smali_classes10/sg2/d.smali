.class public abstract Lsg2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aW\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a5\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lsg2/h;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onRecentActivityClick",
        "Lkotlin/Function0;",
        "onSearchClick",
        "",
        "onGpsToggleChanged",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "d",
        "(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "isGpsTrackingEnabled",
        "f",
        "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "start-activity_release"
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
.method public static synthetic a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsg2/d;->g(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsg2/d;->e(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsg2/d;->h(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsg2/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v11, p6

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onRecentActivityClick"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onSearchClick"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onGpsToggleChanged"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v4, -0x21ab110a

    invoke-virtual {v6, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v11, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_1
    move v4, v11

    :goto_1
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v11, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    :cond_7
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_9

    or-int/lit16 v4, v4, 0x6000

    :cond_8
    move-object/from16 v8, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_8

    move-object/from16 v8, p4

    invoke-virtual {v6, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_5

    :cond_a
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v4, v9

    :goto_6
    and-int/lit16 v9, v4, 0x2493

    const/16 v10, 0x2492

    const/4 v12, 0x0

    if-eq v9, v10, :cond_b

    const/4 v9, 0x1

    goto :goto_7

    :cond_b
    move v9, v12

    :goto_7
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v6, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_18

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_c

    move-object v7, v9

    goto :goto_8

    :cond_c
    move-object v7, v8

    :goto_8
    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v14, v14

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v14, v15

    const/4 v13, 0x0

    invoke-static {v10, v14, v13, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v6, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move-object/from16 v38, v9

    iget-wide v8, v6, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v6, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_d

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_9
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v6, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-nez v12, :cond_e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v8, v6, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v8, Lhg2/a;->n:I

    invoke-static {v6, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v8, v6, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->r()Lb91/a;

    move-result-object v32

    invoke-virtual {v8, v6, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->c1()J

    move-result-wide v17

    sget v19, Lb91/a;->d:I

    shl-int/lit8 v36, v19, 0x12

    const v37, 0x2fffa

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/16 v21, 0x0

    move-wide/from16 v42, v17

    move/from16 v18, v15

    move-wide/from16 v14, v42

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    move/from16 v25, v22

    const-wide/16 v21, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    move/from16 v30, v26

    const-wide/16 v25, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move/from16 v34, v29

    const/16 v29, 0x0

    move/from16 v35, v30

    const/16 v30, 0x0

    move-object/from16 v39, v31

    const/16 v31, 0x0

    move-object/from16 v40, v33

    const/16 v33, 0x0

    move/from16 v41, v35

    const/16 v35, 0x0

    move-object/from16 v1, v39

    const/4 v2, 0x1

    move/from16 v39, v34

    move-object/from16 v34, v6

    move-object/from16 v6, v40

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    move/from16 v13, v36

    move-object/from16 v14, v38

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, Lb2/e;->J:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    move/from16 v38, v4

    const/16 v4, 0x30

    move-object/from16 v40, v7

    invoke-static {v3, v15, v12, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    move-object/from16 v16, v5

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_10

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v11, v16

    goto :goto_b

    :cond_10
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v12, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    :cond_11
    invoke-static {v4, v12, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v12, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Ll0/t1;->a:Ll0/t1;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    invoke-virtual {v2, v14, v5, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x30

    invoke-static {v3, v4, v12, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v16, v15

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v12, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :cond_14
    invoke-static {v4, v12, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v12, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lsg2/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v12, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->O()Lb91/a;

    move-result-object v32

    invoke-virtual {v8, v12, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v3

    const/4 v1, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-virtual {v2, v14, v1, v15}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    or-int/lit16 v1, v13, 0xc30

    const v37, 0x2d7f8

    move-object/from16 v6, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x2

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move/from16 v36, v1

    move-object v13, v5

    move-object/from16 v34, v12

    move-object v1, v14

    move-object v12, v0

    move-wide v14, v3

    move-object v0, v6

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v34

    sget-object v10, Lny0/q$c;->f:Lny0/q$c;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->g()I

    move-result v11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_16

    sget-object v3, Lsg2/d$a;->w:Lsg2/d$a;

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    new-instance v9, Lny0/o;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x3f8

    const/16 v21, 0x0

    invoke-direct/range {v9 .. v21}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lhg2/a;->m:I

    invoke-static {v6, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const-string v3, "pre_session_select_activity_caret"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v5, Lny0/o;->k:I

    or-int/lit16 v5, v5, 0xc00

    shl-int/lit8 v7, v38, 0x6

    const v8, 0xe000

    and-int/2addr v7, v8

    or-int/2addr v5, v7

    const/4 v10, 0x4

    move-object/from16 v34, v6

    move-object v6, v3

    move-object v3, v9

    move v9, v5

    const/4 v5, 0x0

    move-object/from16 v7, p2

    move-object v14, v1

    move-object/from16 v8, v34

    move/from16 v1, v38

    const/4 v11, 0x2

    invoke-static/range {v3 .. v10}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    const/4 v5, 0x1

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lsg2/h;->c()Z

    move-result v3

    if-eqz v3, :cond_17

    const v3, -0x2fa2db74

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lsg2/h;->e()Z

    move-result v3

    invoke-virtual {v2, v14, v0}, Ll0/t1;->a(Landroidx/compose/ui/Modifier;Lb2/l;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v7, v0, 0x70

    const/4 v8, 0x0

    move-object/from16 v4, p3

    invoke-static/range {v3 .. v8}, Lsg2/d;->f(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v5, 0x1

    goto :goto_e

    :cond_17
    const/4 v0, 0x0

    const v2, -0x2f9eb8da

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    int-to-float v0, v11

    mul-float v0, v0, v39

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lsg2/h;->a()Lrg2/g;

    move-result-object v0

    invoke-virtual {v0}, Lrg2/g;->a()Ljava/util/List;

    move-result-object v2

    and-int/lit16 v7, v1, 0x3f0

    const/16 v8, 0x8

    move v0, v5

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-static/range {v2 .. v8}, Lsg2/l;->f(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v40

    goto :goto_f

    :cond_18
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v5, v8

    :goto_f
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lj81/e;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lj81/e;-><init>(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final e(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lsg2/d;->d(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "onGpsToggleChanged"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x64e659b5

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x1

    if-eq v6, v7, :cond_7

    move v6, v8

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    :goto_5
    and-int/2addr v0, v8

    invoke-virtual {v14, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v3, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_8
    move-object v0, v5

    :goto_6
    sget-object v3, Lb2/e;->K:Lb2/l;

    int-to-float v5, v8

    const/16 v6, 0x8

    int-to-float v6, v6

    const/16 v7, 0x36

    invoke-static {v5, v6, v3, v14, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v5, v14, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lhg2/a;->l:I

    invoke-static {v14, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v14, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->D()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v29, v7, 0x12

    const v30, 0x2fffa

    move v7, v6

    const/4 v6, 0x0

    move v11, v7

    move v12, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v27, v14

    move/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v32, v28

    const/16 v28, 0x0

    move-object/from16 p2, v0

    move/from16 v4, v31

    move/from16 v0, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    invoke-virtual {v3, v14, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j()J

    move-result-wide v7

    new-instance v0, Le41/f;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Le41/f;-><init>(ZLkotlin/jvm/functions/Function1;I)V

    const v3, 0x3d8752a0

    invoke-static {v3, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v15, 0x6000

    const/16 v16, 0xd

    const-wide/16 v5, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v5 .. v16}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v5

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lid2/a;

    const/4 v6, 0x1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lid2/a;-><init>(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final g(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object v6, Lpz0/e;->Large:Lpz0/e;

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget p3, Lx81/d;->b:I

    invoke-virtual {p2, v9, p3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->o()J

    move-result-wide v4

    const/16 v10, 0x6000

    const/16 v11, 0x25

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move v2, p0

    move-object v8, p1

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsg2/d;->f(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

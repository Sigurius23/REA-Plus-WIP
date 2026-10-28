.class public abstract Lgt1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aA\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lft1/c$g;",
        "state",
        "Lkotlin/Function1;",
        "Lft1/a;",
        "Ll83/a0;",
        "onViewEvent",
        "",
        "onSharePdf",
        "g",
        "(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "n",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "shareButtonEnabled",
        "labrador_release"
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
.method public static synthetic a(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgt1/b;->h(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgt1/b;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lft1/c$g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgt1/b;->l(Lkotlin/jvm/functions/Function1;Lft1/c$g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lft1/c$g;)Z
    .locals 0

    invoke-static {p0}, Lgt1/b;->i(Lft1/c$g;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Ljava/lang/Throwable;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgt1/b;->k(Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgt1/b;->m(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 61
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft1/c$g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x43bb384b

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v0, v9

    :goto_4
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x1

    if-eq v9, v11, :cond_7

    move v9, v12

    goto :goto_5

    :cond_7
    const/4 v9, 0x0

    :goto_5
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1e

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_8

    new-instance v5, Lgo1/a;

    const/4 v8, 0x3

    invoke-direct {v5, v8}, Lgo1/a;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v5, v8

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_a

    new-instance v8, Lgt1/a;

    const/4 v11, 0x0

    invoke-direct {v8, v1, v11}, Lgt1/a;-><init>(Lft1/c$g;I)V

    invoke-static {v8}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v31, v8

    check-cast v31, Lp1/t2;

    int-to-float v8, v3

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v8, v11

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    invoke-static {v11, v8, v14, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v3, v12

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/16 v12, 0x36

    invoke-static {v6, v7, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v20, v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_8

    :cond_c
    move-object/from16 v20, v5

    :goto_8
    invoke-static {v12, v10, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lft1/c$g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v10, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v14, Lx81/d;->a:Lx81/d;

    move-object/from16 v21, v6

    sget v6, Lx81/d;->b:I

    invoke-virtual {v14, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v14, v10, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Lb91/d;->A()Lb91/a;

    move-result-object v25

    sget v24, Lb91/a;->d:I

    shl-int/lit8 v29, v24, 0x12

    const v30, 0x2fffa

    move/from16 v24, v6

    const/4 v6, 0x0

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v28, v11

    const/4 v11, 0x0

    move/from16 v32, v12

    const/4 v12, 0x0

    move-object/from16 v33, v13

    const/4 v13, 0x0

    move-object/from16 v35, v14

    move-object/from16 v34, v15

    const-wide/16 v14, 0x0

    const/16 v36, 0x20

    const/16 v16, 0x0

    const/16 v37, 0x100

    const/16 v17, 0x0

    const/16 v38, 0x1

    const/16 v39, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v40, v20

    const/16 v20, 0x0

    move-object/from16 v41, v21

    const/16 v21, 0x0

    move-object/from16 v42, v7

    move-wide/from16 v59, v22

    move/from16 v23, v8

    move-wide/from16 v7, v59

    const/16 v22, 0x0

    move/from16 v43, v23

    const/16 v23, 0x0

    move/from16 v44, v24

    const/16 v24, 0x0

    move-object/from16 v45, v26

    const/16 v26, 0x0

    move-object/from16 v46, v28

    const/16 v28, 0x0

    move/from16 v47, v3

    move/from16 v54, v32

    move-object/from16 v53, v33

    move-object/from16 v50, v34

    move-object/from16 v3, v35

    move-object/from16 v48, v40

    move-object/from16 v52, v41

    move-object/from16 v51, v42

    move/from16 v49, v43

    move/from16 v2, v44

    move-object/from16 v1, v46

    move/from16 v32, v0

    move-object/from16 v0, v45

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    sget v5, Lrs1/f;->o:I

    invoke-static {v10, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v3, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/16 v5, 0x118

    int-to-float v5, v5

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0xf

    int-to-float v6, v6

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_e

    move-object/from16 v9, v50

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v11, v51

    goto :goto_a

    :cond_e
    move-object/from16 v9, v50

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v52

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    move-object/from16 v8, v53

    goto :goto_b

    :cond_10
    move-object/from16 v8, v53

    goto :goto_c

    :goto_b
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_c
    invoke-static {v10, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v52, v6

    invoke-virtual/range {p0 .. p0}, Lft1/c$g;->i()Ljava/lang/String;

    move-result-object v6

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x6

    if-nez v6, :cond_11

    const v6, 0x7b5abb8d

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    move-object/from16 v28, v1

    move-object/from16 v20, v4

    move v4, v5

    move-object/from16 v57, v8

    move-object/from16 v34, v9

    move-object/from16 v55, v11

    move/from16 v1, v49

    move-object/from16 v56, v52

    const/4 v7, 0x0

    goto/16 :goto_d

    :cond_11
    const v12, 0x7b5abb8e

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move/from16 v13, v49

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v12, v13, v15, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lft1/c$g;->j()Lv41/t;

    move-result-object v14

    if-nez v14, :cond_12

    new-instance v14, Lv41/t;

    invoke-direct {v14}, Lv41/t;-><init>()V

    :cond_12
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v0, :cond_13

    new-instance v15, Lgo1/a;

    const/4 v5, 0x4

    invoke-direct {v15, v5}, Lgo1/a;-><init>(I)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v15, Lkotlin/jvm/functions/Function1;

    sget v5, Lv41/t;->a:I

    shl-int/2addr v5, v7

    const v17, 0x301b6006

    or-int v17, v5, v17

    const/16 v18, 0x0

    const/16 v19, 0x588

    move-object/from16 v33, v8

    const/4 v8, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-object/from16 v42, v11

    const/4 v11, 0x0

    move-object v5, v12

    const/4 v12, 0x0

    move/from16 v43, v13

    const/4 v13, 0x0

    move/from16 v20, v7

    move-object v7, v14

    const/4 v14, 0x3

    move-object/from16 v34, v9

    move-object v9, v15

    const/4 v15, 0x0

    move-object/from16 v28, v1

    move-object/from16 v20, v4

    move-object/from16 v16, v27

    move-object/from16 v57, v33

    move-object/from16 v55, v42

    move/from16 v1, v43

    move-object/from16 v56, v52

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static/range {v5 .. v19}, Lv41/d0;->y(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv41/t;Ll0/l;Lkotlin/jvm/functions/Function1;ZZZZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v16

    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_d
    if-nez v6, :cond_14

    const v5, 0x7b61bffb

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-static {v10, v7}, Lgt1/b;->n(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v5, 0x1

    goto :goto_f

    :cond_14
    const v5, 0x7fd9a153

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    invoke-static/range {v31 .. v31}, Lgt1/b;->j(Lp1/t2;)Z

    move-result v15

    and-int/lit8 v5, v32, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_15

    const/4 v12, 0x1

    :goto_10
    move-object/from16 v13, p0

    goto :goto_11

    :cond_15
    const/4 v12, 0x0

    goto :goto_10

    :goto_11
    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v12

    move/from16 v6, v32

    and-int/lit16 v6, v6, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_16

    const/4 v12, 0x1

    goto :goto_12

    :cond_16
    const/4 v12, 0x0

    :goto_12
    or-int/2addr v5, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_18

    if-ne v6, v0, :cond_17

    goto :goto_13

    :cond_17
    move-object/from16 v5, p1

    move-object/from16 v7, v48

    goto :goto_14

    :cond_18
    :goto_13
    new-instance v6, Ld30/r;

    const/16 v0, 0x13

    move-object/from16 v5, p1

    move-object/from16 v7, v48

    invoke-direct {v6, v5, v13, v7, v0}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v6, v14

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v0, v1, v15, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {v31 .. v31}, Lgt1/b;->j(Lp1/t2;)Z

    move-result v8

    if-eqz v8, :cond_19

    const v8, -0x41cd63a4

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->W0()J

    move-result-wide v8

    const/4 v11, 0x0

    :goto_15
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_19
    const/4 v11, 0x0

    const v8, -0x41cd5fc5

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->a1()J

    move-result-wide v8

    goto :goto_15

    :goto_16
    sget-object v11, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v11}, Lkd1/w;->a()Lk91/a;

    move-result-object v11

    invoke-virtual {v11}, Lk91/a;->c()Lt0/i;

    move-result-object v11

    invoke-static {v0, v8, v9, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v1, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v8, "OpenShareButton"

    invoke-static {v0, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v9, v8, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_1a

    move-object/from16 v12, v34

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v12, v55

    goto :goto_18

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v10, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v56

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_1b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1c

    :cond_1b
    move-object/from16 v8, v57

    goto :goto_1a

    :cond_1c
    :goto_19
    move-object/from16 v8, v20

    goto :goto_1b

    :goto_1a
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->e0()I

    move-result v0

    const/4 v8, 0x6

    invoke-static {v0, v10, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const/16 v8, 0x18

    int-to-float v8, v8

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v11

    move-object/from16 v48, v7

    move-object v7, v8

    move-wide v8, v11

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    move-object/from16 v28, v6

    const/4 v6, 0x0

    move-object v5, v0

    move-object/from16 v0, v28

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13}, Lft1/c$g;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move/from16 v6, v54

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 v32, v6

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v0, v1, v15, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {v31 .. v31}, Lgt1/b;->j(Lp1/t2;)Z

    move-result v7

    if-eqz v7, :cond_1d

    const v7, -0x51ae72fd

    invoke-static {v10, v7, v3, v10, v2}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    const/4 v11, 0x0

    :goto_1c
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_1d
    const/4 v11, 0x0

    const v7, -0x51ae6ec0

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y0()J

    move-result-wide v7

    goto :goto_1c

    :goto_1d
    invoke-virtual {v3, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    const/16 v28, 0x30

    const v30, 0x2fff8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v58, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v0, v1, v15, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v5, v47

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v5

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lft1/c$g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move/from16 v6, v58

    invoke-static {v4, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v1, v15, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v3, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const-wide/16 v9, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v48

    goto :goto_1e

    :cond_1e
    move-object/from16 v27, v10

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    move-object v3, v8

    :goto_1e
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Lbu1/a;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbu1/a;-><init>(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final h(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lft1/c$g;)Z
    .locals 0

    invoke-virtual {p0}, Lft1/c$g;->i()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final j(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final k(Ljava/lang/Throwable;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lft1/c$g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lft1/a$f;->a:Lft1/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lft1/c$g;->i()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lgt1/b;->g(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v6, p0

    check-cast v6, Lp1/q;

    const v1, 0x1ae9b797

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v9, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x2

    int-to-float v5, v4

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    const/4 v8, 0x0

    invoke-static {v3, v5, v8, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v14

    sget-object v5, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v5}, Lkd1/w;->a()Lk91/a;

    move-result-object v5

    invoke-virtual {v5}, Lk91/a;->c()Lt0/i;

    move-result-object v5

    invoke-static {v3, v14, v15, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v14, v6, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v14, v6, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v11, 0x3

    int-to-float v2, v11

    mul-float/2addr v2, v7

    const/4 v3, 0x2

    invoke-static {v1, v2, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v14, 0xa

    int-to-float v3, v14

    sget-object v7, Lb2/e;->K:Lb2/l;

    invoke-static {v3, v7}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v3

    const/16 v7, 0x36

    invoke-static {v3, v2, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v3, v6, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o;->k()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v1, v6, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    invoke-virtual {v12, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v1, Lrs1/f;->J:I

    invoke-static {v6, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v3

    invoke-virtual {v12, v6, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->q()Lb91/a;

    move-result-object v21

    move v2, v13

    new-instance v13, Lw3/k;

    invoke-direct {v13, v11}, Lw3/k;-><init>(I)V

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v25, v5, 0x12

    const v26, 0x2fdfa

    move v5, v2

    const/4 v2, 0x0

    move v7, v5

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v15, v10

    move/from16 v17, v11

    const-wide/16 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move/from16 v20, v14

    move/from16 v19, v15

    const-wide/16 v14, 0x0

    const/16 v22, 0x1

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v31, v24

    const/16 v24, 0x0

    move-object/from16 v0, v27

    move/from16 v32, v28

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    sget v1, Lrs1/f;->I:I

    invoke-static {v6, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move/from16 v15, v32

    invoke-virtual {v0, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v3

    invoke-virtual {v0, v6, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    new-instance v13, Lw3/k;

    const/4 v0, 0x3

    invoke-direct {v13, v0}, Lw3/k;-><init>(I)V

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Lf01/c0;

    move/from16 v2, p1

    const/4 v3, 0x0

    const/16 v14, 0xa

    invoke-direct {v1, v3, v2, v14}, Lf01/c0;-><init>(BII)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lgt1/b;->n(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

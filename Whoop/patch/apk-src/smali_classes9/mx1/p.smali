.class public abstract Lmx1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ljx1/v;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Ljx1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "membership_release"
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
.method public static synthetic a(Ljx1/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmx1/p;->k(Ljx1/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lmx1/p;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljx1/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmx1/p;->h(Lkotlin/jvm/functions/Function1;Ljx1/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmx1/p;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lmx1/p;->j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljx1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 74
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx1/v;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, -0x639bdcb5

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    const/16 v5, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, v0, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v8, v9, :cond_5

    move v8, v10

    goto :goto_4

    :cond_5
    move v8, v11

    :goto_4
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v7, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_33

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_6

    new-instance v4, Lmm1/h;

    const/16 v6, 0x1d

    invoke-direct {v4, v6}, Lmm1/h;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v4, v6

    :goto_5
    invoke-virtual {v1}, Ljx1/v;->h()Ljava/lang/String;

    move-result-object v6

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x7fc00000    # Float.NaN

    const/4 v14, 0x3

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    move/from16 p2, v9

    goto :goto_6

    :cond_9
    const v6, 0x6929e388

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Ljx1/v;->f()Z

    move-result v6

    if-eqz v6, :cond_a

    int-to-float v13, v3

    :cond_a
    invoke-static {}, Lgb1/b0;->C0()Li2/t;

    move-result-object v6

    int-to-float v15, v14

    move/from16 p2, v9

    int-to-float v9, v2

    mul-float/2addr v15, v9

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v13, v12, v6, v9}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v15, v4

    goto :goto_7

    :goto_6
    const v6, 0x692d1d26

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ljx1/v;->f()Z

    move-result v6

    if-eqz v6, :cond_b

    int-to-float v13, v3

    :cond_b
    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v6, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    move-object v15, v4

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v3

    int-to-float v6, v14

    int-to-float v9, v2

    mul-float/2addr v6, v9

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v12, v13, v3, v4, v6}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    :goto_7
    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object v9, v15

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v9

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-eqz v4, :cond_c

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v7, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v13, v7, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v11, 0x60

    int-to-float v11, v11

    const/4 v13, 0x0

    invoke-static {v12, v13, v11, v10}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v20

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v5, :cond_f

    move v0, v10

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_11

    if-ne v5, v8, :cond_10

    goto :goto_a

    :cond_10
    move-object/from16 v15, v16

    goto :goto_b

    :cond_11
    :goto_a
    new-instance v5, Lmi2/o;

    const/4 v0, 0x7

    move-object/from16 v15, v16

    invoke-direct {v5, v0, v15, v1}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    move-object/from16 v24, v5

    check-cast v24, Lc93/a;

    const/16 v25, 0xf

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v11, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 v21, v11

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v10

    const/4 v5, 0x3

    int-to-float v1, v5

    const/4 v5, 0x4

    int-to-float v5, v5

    invoke-static {v0, v1, v5, v10, v11}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v1, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    move v11, v5

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    move-object/from16 v19, v8

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v7, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v5, v7, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v0, v5

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v8, v6, v7, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move/from16 p1, v11

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 v23, v5

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_15

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    :cond_16
    invoke-static {v10, v7, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x1

    int-to-float v6, v5

    mul-float v10, v6, v23

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    const/16 v5, 0x36

    invoke-static {v11, v0, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move v11, v6

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    move-object/from16 v23, v8

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 v24, v10

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_18

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v7, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_19

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_19
    invoke-static {v5, v7, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v7, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v2

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->i()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v5, v21

    invoke-virtual {v5, v7, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->O()Lb91/a;

    move-result-object v6

    invoke-virtual {v5, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v25

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v8, v8, 0x12

    const v27, 0x2fffa

    move-object v10, v3

    const/4 v3, 0x0

    move-object/from16 v22, v6

    move/from16 v21, v24

    const/16 v28, 0x30

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v29, v5

    move-wide/from16 v72, v25

    move-object/from16 v25, v4

    move/from16 v26, v8

    move-wide/from16 v4, v72

    const/4 v8, 0x0

    move-object/from16 v30, v9

    const/4 v9, 0x0

    move-object/from16 v31, v10

    const/4 v10, 0x0

    move/from16 v32, v11

    move-object/from16 v33, v12

    const-wide/16 v11, 0x0

    move/from16 v34, v13

    const/4 v13, 0x0

    move-object/from16 v35, v14

    const/4 v14, 0x0

    move-object/from16 v36, v15

    const/high16 v37, 0x3f800000    # 1.0f

    const-wide/16 v15, 0x0

    const/16 v38, 0x3

    const/16 v17, 0x0

    const/16 v39, 0x0

    const/16 v18, 0x0

    move-object/from16 v40, v19

    const/16 v19, 0x0

    const/16 v41, 0x1

    const/16 v20, 0x0

    move/from16 v42, v21

    const/16 v21, 0x0

    move-object/from16 v43, v23

    const/16 v23, 0x0

    move-object/from16 v44, v25

    const/16 v25, 0x0

    move/from16 v51, p1

    move-object/from16 v48, v0

    move-object/from16 p1, v1

    move-object/from16 v49, v29

    move-object/from16 v46, v31

    move/from16 v53, v32

    move-object/from16 v55, v33

    move/from16 v50, v34

    move-object/from16 v47, v35

    move/from16 v1, v37

    move-object/from16 v56, v40

    move/from16 v0, v41

    move/from16 v54, v42

    move-object/from16 v52, v43

    move-object/from16 v45, v44

    move-object/from16 v32, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    move/from16 v33, v26

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    float-to-double v2, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1b

    goto :goto_f

    :cond_1b
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    invoke-static {v1, v0, v7}, Ldc/b;->y(FZLp1/q;)V

    sget-object v1, Lb2/e;->O:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v2, v1, v7, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v5, v55

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_1c

    move-object/from16 v8, v32

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_10
    move-object/from16 v9, v45

    goto :goto_11

    :cond_1c
    move-object/from16 v8, v32

    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_10

    :goto_11
    invoke-static {v7, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v46

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_1d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    move-object/from16 v4, v47

    goto :goto_13

    :cond_1e
    move-object/from16 v4, v47

    :goto_12
    move-object/from16 v2, v48

    goto :goto_14

    :goto_13
    invoke-static {v2, v7, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v7, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->h()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1f

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_20

    :cond_1f
    move-object/from16 v46, v1

    move-object/from16 v60, v2

    move v0, v3

    move-object/from16 v59, v4

    move-object v1, v5

    move-object/from16 v32, v8

    move-object/from16 v44, v9

    move-object/from16 v61, v49

    move/from16 v62, v50

    const/4 v2, 0x0

    goto/16 :goto_15

    :cond_20
    const v6, 0x7e67617a

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->h()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v13, Lhy0/o1;->HOLIDAY:Lhy0/o1;

    move-object/from16 v10, v49

    move/from16 v11, v50

    invoke-virtual {v10, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->w()J

    move-result-wide v14

    const/high16 v12, 0x30000000

    sget v16, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int v28, v16, v12

    const/16 v30, 0x0

    const v31, 0x7ffdf6

    move/from16 v22, v3

    move-object/from16 v47, v4

    const-wide/16 v3, 0x0

    move-object/from16 v55, v5

    const/4 v5, 0x0

    move-object/from16 v32, v8

    const/4 v8, 0x0

    move-object/from16 v44, v9

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    move/from16 v34, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v48, v2

    move-object v2, v6

    move-object/from16 v24, v7

    move-wide v6, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v57, v22

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v49, v29

    const/16 v29, 0x0

    move-object/from16 v46, v1

    move/from16 v62, v34

    move-object/from16 v59, v47

    move-object/from16 v60, v48

    move-object/from16 v61, v49

    move-object/from16 v1, v55

    move/from16 v0, v57

    invoke-static/range {v2 .. v31}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v7, v27

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_16

    :goto_15
    const v3, 0x7e6aff9a

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_16
    sget-object v3, Lb2/e;->L:Lb2/l;

    move-object/from16 v4, v52

    invoke-static {v4, v3, v7, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_21

    move-object/from16 v8, v32

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v9, v44

    goto :goto_18

    :cond_21
    move-object/from16 v8, v32

    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v7, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v46

    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_22

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    :cond_22
    move-object/from16 v5, v59

    goto :goto_1a

    :cond_23
    move-object/from16 v5, v59

    :goto_19
    move-object/from16 v3, v60

    goto :goto_1b

    :goto_1a
    invoke-static {v3, v7, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v18, v2

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->c()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v6, v61

    move/from16 v10, v62

    invoke-virtual {v6, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->f()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    const/16 v25, 0x0

    const v27, 0x2fffa

    move-object/from16 v48, v3

    const/4 v3, 0x0

    move-object/from16 v29, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v32, v8

    const/4 v8, 0x0

    move-object/from16 v44, v9

    const/4 v9, 0x0

    move/from16 v34, v10

    const/4 v10, 0x0

    move-object/from16 v43, v4

    move-object/from16 v47, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move/from16 v58, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v31, v0

    move-object/from16 v66, v29

    move-object/from16 v30, v32

    move/from16 v26, v33

    move/from16 v67, v34

    move-object/from16 v0, v43

    move-object/from16 v63, v44

    move-object/from16 v64, v47

    move-object/from16 v65, v48

    move-object/from16 v33, v1

    move/from16 v1, v58

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v5, 0x1

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    sget-object v2, Lb2/e;->J:Lb2/l;

    invoke-static {v0, v2, v7, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    move-object/from16 v4, v33

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_24

    move-object/from16 v6, v30

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_1c
    move-object/from16 v8, v63

    goto :goto_1d

    :cond_24
    move-object/from16 v6, v30

    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_1c

    :goto_1d
    invoke-static {v7, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v31

    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_25

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    :cond_25
    move-object/from16 v3, v64

    goto :goto_1f

    :cond_26
    move-object/from16 v3, v64

    :goto_1e
    move-object/from16 v2, v65

    goto :goto_20

    :goto_1f
    invoke-static {v2, v7, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1e

    :goto_20
    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v48, v2

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_27

    const v2, -0xf3ff994

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    move-object/from16 v31, v0

    move-object/from16 v69, v3

    move-object v0, v4

    move-object/from16 v30, v6

    move-object/from16 v68, v8

    move-object/from16 v70, v48

    move-object/from16 v29, v66

    move/from16 v71, v67

    goto :goto_21

    :cond_27
    const v5, -0xf3ff993

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    move-object/from16 v5, v66

    move/from16 v9, v67

    invoke-virtual {v5, v7, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->M()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b1()J

    move-result-wide v10

    new-instance v14, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v14, v12}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v27, 0x2fdfa

    move-object/from16 v47, v3

    const/4 v3, 0x0

    move-object/from16 v32, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v44, v8

    const/4 v8, 0x0

    move/from16 v34, v9

    const/4 v9, 0x0

    move-object/from16 v33, v4

    move-object/from16 v29, v5

    move-wide v4, v10

    const/4 v10, 0x0

    move/from16 v17, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move/from16 v38, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v31, v0

    move-object/from16 v30, v32

    move-object/from16 v0, v33

    move/from16 v71, v34

    move-object/from16 v68, v44

    move-object/from16 v69, v47

    move-object/from16 v70, v48

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_21
    invoke-virtual/range {p0 .. p0}, Ljx1/v;->g()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_28

    const v2, -0xf3a03cc

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_22
    const/4 v5, 0x1

    goto :goto_23

    :cond_28
    const v3, -0xf3a03cb

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    move/from16 v6, v54

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v7, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v5, v29

    move/from16 v11, v71

    invoke-virtual {v5, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->M()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v4

    new-instance v14, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v14, v12}, Lw3/k;-><init>(I)V

    const/high16 v25, 0x6000000

    const v27, 0x2fcfa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    sget-object v13, Lw3/l;->d:Lw3/l;

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_23
    invoke-static {v7, v5, v5, v5, v5}, Lb9/y;->B(Lp1/q;ZZZZ)V

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->f()Z

    move-result v2

    if-eqz v2, :cond_32

    const v2, -0x34e3dd30    # -1.0232528E7f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/e;->y:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v0, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x5

    int-to-float v2, v2

    move/from16 v11, v51

    neg-float v3, v11

    invoke-static {v0, v2, v3}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v11, v53

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2a

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_29

    goto :goto_25

    :cond_29
    move v10, v1

    :goto_24
    const/16 v41, 0x1

    goto :goto_26

    :cond_2a
    :goto_25
    const/4 v10, 0x1

    goto :goto_24

    :goto_26
    xor-int/lit8 v2, v10, 0x1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v56

    if-ne v3, v4, :cond_2b

    new-instance v3, Lmx1/o;

    const/4 v5, 0x0

    invoke-direct {v3, v5}, Lmx1/o;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v3}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ljx1/v;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2d

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2c

    goto :goto_27

    :cond_2c
    move v10, v1

    goto :goto_28

    :cond_2d
    :goto_27
    const/4 v10, 0x1

    :goto_28
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2e

    new-instance v2, Lmx1/o;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lmx1/o;-><init>(I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v10, v2}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x1c

    int-to-float v2, v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_2f

    move-object/from16 v8, v30

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_29
    move-object/from16 v9, v68

    goto :goto_2a

    :cond_2f
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_29

    :goto_2a
    invoke-static {v7, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v31

    invoke-static {v7, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_30

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_31

    :cond_30
    move-object/from16 v4, v69

    goto :goto_2c

    :cond_31
    :goto_2b
    move-object/from16 v2, v70

    goto :goto_2d

    :goto_2c
    invoke-static {v3, v7, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_2b

    :goto_2d
    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lgz0/m0;->SELECTED_CHECK:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v7, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-wide v5, Li2/x;->b:J

    const/16 v8, 0xc30

    const/4 v9, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_2e

    :cond_32
    const/4 v5, 0x1

    const v0, -0x34d86faf    # -1.0981457E7f

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_2e
    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    move-object/from16 v3, v36

    goto :goto_2f

    :cond_33
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v6

    :goto_2f
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_34

    new-instance v0, Llq2/c;

    const/16 v5, 0x12

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Ljx1/v;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->C0()Li2/t;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v3, v2

    mul-float/2addr v1, v3

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v3, v2}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Li2/x;->o:I

    sget-wide v0, Li2/x;->f:J

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {p0, v2, v3, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ljx1/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lmx1/p;->f(Ljx1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

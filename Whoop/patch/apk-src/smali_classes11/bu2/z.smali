.class public abstract Lbu2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbu2/z$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a9\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u0006*\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u001aH\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lbu2/d;",
        "metricSliderItemState",
        "Ll83/a0;",
        "c",
        "(Lbu2/d;Landroidx/compose/runtime/Composer;I)V",
        "state",
        "",
        "j",
        "(Lbu2/d;)Z",
        "Lbu2/c0;",
        "toolTipType",
        "",
        "target",
        "",
        "fillPercentage",
        "",
        "Lbu2/p;",
        "rangeContent",
        "Lbu2/b0;",
        "f",
        "(Lbu2/c0;DFLjava/util/List;)Lbu2/b0;",
        "Lcom/whoop/design/util/TextResource;",
        "i",
        "(Lcom/whoop/design/util/TextResource;)Z",
        "g",
        "(Lbu2/b0;Lbu2/c0;)Z",
        "Lqt2/y;",
        "h",
        "(Lqt2/y;)Z",
        "weekly-plan_release"
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
.method public static synthetic a(Lbu2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbu2/z;->e(Lbu2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbu2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbu2/z;->d(Lbu2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lbu2/d;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "metricSliderItemState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, 0x6824b099

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v11, 0x1

    if-eq v5, v4, :cond_2

    move v5, v11

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    and-int/2addr v2, v11

    invoke-virtual {v8, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {v0}, Lbu2/d;->m()Lbu2/c0;

    move-result-object v2

    invoke-virtual {v0}, Lbu2/d;->o()D

    move-result-wide v5

    invoke-virtual {v0}, Lbu2/d;->f()F

    move-result v7

    invoke-virtual {v0}, Lbu2/d;->j()Ljava/util/List;

    move-result-object v9

    invoke-static {v2, v5, v6, v7, v9}, Lbu2/z;->f(Lbu2/c0;DFLjava/util/List;)Lbu2/b0;

    move-result-object v2

    if-nez v2, :cond_3

    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_13

    new-instance v3, Lbu2/y;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lbu2/y;-><init>(Lbu2/d;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_3
    int-to-float v13, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v13

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    invoke-static {v14, v3, v15, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_4

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-nez v15, :cond_5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v8, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->e()I

    move-result v4

    const/4 v10, 0x6

    invoke-static {v4, v8, v10}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    mul-float v10, v13, v13

    move-object/from16 v29, v2

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v2, v13

    invoke-static {v14, v10, v2}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v19, v13

    sget v13, Lx81/d;->b:I

    invoke-virtual {v3, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->w()J

    move-result-wide v20

    move-object/from16 v22, v9

    const/16 v9, 0x1b0

    move/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v24, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object/from16 v17, v6

    move-object v1, v7

    move-wide/from16 v6, v20

    move-object/from16 v0, v22

    move/from16 v30, v23

    move-object/from16 v20, v5

    move-object v5, v2

    move-object/from16 v2, v24

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x3

    int-to-float v4, v3

    mul-float v4, v4, v19

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v14, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v5

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v6, v8, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v8, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->m()Lbu2/c0;

    move-result-object v4

    sget-object v5, Lbu2/c0;->STRAIN:Lbu2/c0;

    if-ne v4, v5, :cond_a

    const/16 v4, 0x14

    int-to-float v4, v4

    mul-float v4, v4, v19

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v14, v6, v4, v7}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    :goto_5
    move/from16 v6, v30

    goto :goto_6

    :cond_a
    const/4 v7, 0x1

    move-object v4, v14

    goto :goto_5

    :goto_6
    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v9, v17

    move-object/from16 v6, v20

    const/16 v10, 0x30

    invoke-static {v9, v6, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v8, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    invoke-static {v9, v8, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v8, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v29 .. v29}, Lbu2/b0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->m()Lbu2/c0;

    move-result-object v4

    if-eq v4, v5, :cond_e

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->m()Lbu2/c0;

    move-result-object v4

    sget-object v5, Lbu2/c0;->WEIGHT:Lbu2/c0;

    if-ne v4, v5, :cond_f

    :cond_e
    const/4 v6, 0x0

    goto :goto_9

    :cond_f
    const v4, 0x61f3e953

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->A()Lb91/a;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    :goto_8
    move-object/from16 v23, v4

    goto :goto_a

    :goto_9
    const v4, 0x61f2bb13

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->q()Lb91/a;

    move-result-object v4

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lbu2/d;->l()Ly81/e;

    move-result-object v4

    if-nez v4, :cond_10

    const v4, 0x61f60d07

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    goto :goto_b

    :cond_10
    const v5, 0x24313a3a

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-interface {v4, v8, v6}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-static {v8, v6, v4, v5}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v4

    :goto_b
    if-nez v4, :cond_11

    const v4, 0x24313f51

    invoke-static {v8, v4, v2, v8, v13}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v4

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    :goto_c
    move-wide v5, v4

    goto :goto_d

    :cond_11
    const v5, 0x24313563

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    iget-wide v4, v4, Li2/x;->a:J

    goto :goto_c

    :goto_d
    new-instance v15, Lw3/k;

    invoke-direct {v15, v3}, Lw3/k;-><init>(I)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fdfa

    const/4 v4, 0x0

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v16, v13

    const-wide/16 v12, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v16

    move-object/from16 v20, v17

    const-wide/16 v16, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move-object/from16 v3, v31

    move-object/from16 v31, v2

    move-object v2, v3

    move-object v3, v0

    const/4 v0, 0x1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    int-to-float v3, v0

    mul-float v3, v3, v30

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v29 .. v29}, Lbu2/b0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, v31

    move/from16 v1, v32

    invoke-virtual {v2, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v5

    new-instance v15, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v15, v1}, Lw3/k;-><init>(I)V

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-static {v8, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_e

    :cond_12
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Lbu2/y;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbu2/y;-><init>(Lbu2/d;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final d(Lbu2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbu2/z;->c(Lbu2/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lbu2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbu2/z;->c(Lbu2/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lbu2/c0;DFLjava/util/List;)Lbu2/b0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbu2/c0;",
            "DF",
            "Ljava/util/List<",
            "Lbu2/p;",
            ">;)",
            "Lbu2/b0;"
        }
    .end annotation

    const-string v0, "rangeContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbu2/p;

    invoke-virtual {v0}, Lbu2/p;->b()Lcom/whoop/data/remote/domain/dto/DoubleRange;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/whoop/data/remote/domain/dto/DoubleRange;->isInBounds(D)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lbu2/c0;->STRAIN:Lbu2/c0;

    if-eq p0, v2, :cond_3

    sget-object v2, Lbu2/c0;->WEIGHT:Lbu2/c0;

    if-ne p0, v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lbu2/c0;->SLEEP:Lbu2/c0;

    if-ne p0, v1, :cond_0

    invoke-virtual {v0}, Lbu2/p;->c()Lbu2/b0;

    move-result-object v1

    invoke-virtual {v1}, Lbu2/b0;->a()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    float-to-double p2, p3

    mul-double/2addr p0, p2

    double-to-long p0, p0

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide p3

    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide p0

    sget-object p2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v1

    sub-long/2addr p0, v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ar"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p2}, Lor2/q0;->b(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object p2

    :cond_2
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {p3, p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%d:%02d"

    invoke-static {p2, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Lbu2/b0;

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lbu2/p;->c()Lbu2/b0;

    move-result-object p0

    invoke-virtual {p0}, Lbu2/b0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lbu2/b0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    :goto_0
    invoke-virtual {v0}, Lbu2/p;->c()Lbu2/b0;

    move-result-object p1

    invoke-static {p1, p0}, Lbu2/z;->g(Lbu2/b0;Lbu2/c0;)Z

    move-result p0

    if-eqz p0, :cond_4

    return-object p1

    :cond_4
    return-object v1
.end method

.method public static final g(Lbu2/b0;Lbu2/c0;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lbu2/z$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Lbu2/b0;->a()Ljava/lang/Double;

    move-result-object p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    return v0

    :cond_2
    invoke-virtual {p0}, Lbu2/b0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lbu2/z;->i(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lbu2/b0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-static {p0}, Lbu2/z;->i(Lcom/whoop/design/util/TextResource;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public static final h(Lqt2/y;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lqt2/y;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lbu2/z;->i(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lqt2/y;->c()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-static {p0}, Lbu2/z;->i(Lcom/whoop/design/util/TextResource;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final i(Lcom/whoop/design/util/TextResource;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/design/util/TextResource$e;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    check-cast p0, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    instance-of v0, p0, Lcom/whoop/design/util/TextResource$b;

    if-nez v0, :cond_3

    instance-of p0, p0, Lcom/whoop/design/util/TextResource$c;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    return v1
.end method

.method public static final j(Lbu2/d;)Z
    .locals 7

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbu2/d;->o()D

    move-result-wide v0

    invoke-virtual {p0}, Lbu2/d;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbu2/p;

    invoke-virtual {v3}, Lbu2/p;->b()Lcom/whoop/data/remote/domain/dto/DoubleRange;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lcom/whoop/data/remote/domain/dto/DoubleRange;->isInBounds(D)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lbu2/p;->a()Lqt2/y;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    invoke-static {v4}, Lbu2/z;->h(Lqt2/y;)Z

    move-result v4

    if-ne v4, v5, :cond_1

    return v5

    :cond_1
    invoke-virtual {p0}, Lbu2/d;->m()Lbu2/c0;

    move-result-object v4

    invoke-virtual {p0}, Lbu2/d;->f()F

    move-result v6

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v4, v0, v1, v6, v3}, Lbu2/z;->f(Lbu2/c0;DFLjava/util/List;)Lbu2/b0;

    move-result-object v3

    if-eqz v3, :cond_0

    return v5

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

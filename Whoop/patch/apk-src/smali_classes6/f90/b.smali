.class public abstract Lf90/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lf90/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lj80/a;",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lf90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "d",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "activation_release"
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf90/b;->e(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf90/b;->h(Lf90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lf90/b;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x514fbc63

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int/2addr v2, v1

    move v10, v2

    goto :goto_2

    :cond_2
    move v10, v1

    :goto_2
    and-int/lit8 v2, v10, 0x3

    const/4 v11, 0x1

    if-eq v2, v4, :cond_3

    move v2, v11

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v5, v10, 0x1

    invoke-virtual {v7, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->T()J

    move-result-wide v5

    const/4 v2, 0x3

    int-to-float v2, v2

    int-to-float v3, v3

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3, v8, v5, v6}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v3, v4, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/i0;->w()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v7, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual {v12, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v5

    const/16 v8, 0x30

    const/4 v9, 0x4

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v3, v10, 0xe

    or-int/2addr v2, v3

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v7, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v12, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v4

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

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

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v2, Lbm2/b1;

    const/4 v3, 0x3

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lbm2/b1;-><init>(Lcom/whoop/design/util/TextResource;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lf90/b;->d(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lf90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf90/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x42a60f4e

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v11, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v4, v11, :cond_4

    move v4, v13

    goto :goto_3

    :cond_4
    move v4, v12

    :goto_3
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    :cond_6
    invoke-static {v5, v7, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    move-object v5, v4

    invoke-virtual {v0}, Lf90/c;->f()Lkd1/o;

    move-result-object v4

    move-object v9, v8

    sget v8, Lkd1/o;->a:I

    move-object/from16 v20, v9

    const/4 v9, 0x3

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 v22, v6

    const/4 v6, 0x0

    move-object/from16 v14, v20

    move-object/from16 v30, v21

    move-object/from16 v31, v22

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move-object/from16 v26, v7

    move v5, v12

    const/16 v12, 0x61b0

    move v6, v13

    const/16 v13, 0x68

    move v7, v5

    const/4 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    sget-object v8, Ly2/j;->a:Ly2/b1;

    move/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v22, v10

    const/4 v10, 0x0

    move/from16 v32, v3

    move v0, v6

    move-object/from16 v34, v11

    move-object/from16 v6, v19

    move/from16 v3, v21

    move-object/from16 v33, v22

    move-object/from16 v11, v26

    const/16 v22, 0x12

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x7

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float/2addr v6, v5

    const/16 v8, 0xd

    int-to-float v8, v8

    mul-float/2addr v8, v5

    invoke-static {v3, v6, v4, v6, v8}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4, v7, v0}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v9, 0xe

    invoke-static {v3, v8, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->d:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v8, v9, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_5
    move-object/from16 v11, v33

    goto :goto_6

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_5

    :goto_6
    invoke-static {v7, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v30

    invoke-static {v7, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    move-object/from16 v8, v31

    goto :goto_8

    :cond_a
    :goto_7
    move-object/from16 v8, v34

    goto :goto_9

    :goto_8
    invoke-static {v9, v7, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v20, v6

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v30, v16

    invoke-virtual/range {p0 .. p0}, Lf90/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v7, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v9, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v28, v13, 0x12

    const v29, 0x2fff8

    move v13, v8

    move-object v14, v9

    const-wide/16 v8, 0x0

    move v15, v10

    const/4 v10, 0x0

    move/from16 v18, v4

    move-object v4, v6

    move-object/from16 v26, v7

    move-wide v6, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v16, v13

    move-object/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    move/from16 v35, v18

    const-wide/16 v17, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x0

    move/from16 v34, v27

    const/16 v27, 0x30

    move/from16 p2, v5

    move/from16 v0, v31

    move/from16 v2, v34

    const/4 v1, 0x4

    move-object v5, v3

    move-object/from16 v3, v33

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    int-to-float v1, v1

    mul-float v20, v1, p2

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v30

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v1, v16

    invoke-virtual/range {p0 .. p0}, Lf90/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v7, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v8

    move-wide v6, v8

    const-wide/16 v8, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/z;->a:Ll0/z;

    invoke-virtual {v5, v1, v4}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lf90/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v7, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    const/16 v27, 0x0

    move-object v6, v5

    move-object v5, v1

    move-object v1, v6

    move-wide v6, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    invoke-virtual/range {p0 .. p0}, Lf90/c;->c()Ljava/util/List;

    move-result-object v5

    and-int/lit8 v2, v32, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_b

    const/4 v12, 0x1

    goto :goto_a

    :cond_b
    move/from16 v12, v35

    :goto_a
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v12, :cond_d

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_c

    goto :goto_b

    :cond_c
    move-object/from16 v4, p1

    goto :goto_c

    :cond_d
    :goto_b
    new-instance v2, Ldk2/i;

    const/16 v3, 0x11

    move-object/from16 v4, p1

    invoke-direct {v2, v4, v3}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v15, v2

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x0

    const/16 v19, 0x3fe

    const/4 v6, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x6

    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v26

    invoke-static/range {v4 .. v19}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v16

    invoke-virtual/range {p0 .. p0}, Lf90/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v0}, Lf90/b;->d(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v2, Lf01/b;

    const/4 v3, 0x3

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v1, v5, v3}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Lj80/a$n0;

    invoke-direct {v0, p1}, Lj80/a$n0;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lf90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lf90/b;->f(Lf90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

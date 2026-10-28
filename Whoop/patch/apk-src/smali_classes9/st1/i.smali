.class public abstract Lst1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lrt1/h$b;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lst1/i;->c(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v0, p0

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, 0x29c744fd

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v5, v4, :cond_2

    move v5, v11

    goto :goto_2

    :cond_2
    move v5, v12

    :goto_2
    and-int/2addr v2, v11

    invoke-virtual {v8, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-static {v2, v5, v6}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v7, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    const/4 v10, 0x0

    invoke-static {v2, v7, v10, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x36

    invoke-static {v4, v7, v8, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v14, v8, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v14, v8, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v13, v2, v12, v6}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->L:Lb2/l;

    const/4 v11, 0x1

    int-to-float v14, v11

    const/16 v11, 0x36

    invoke-static {v14, v9, v6, v8, v11}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v6

    move-object v14, v13

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v8, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v9, v8, v9, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v8, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lrt1/h$b;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_b

    const v2, -0x63315291

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v2, 0x4016000000000000L    # 5.5

    double-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v12, v3

    mul-float/2addr v2, v12

    move-object v13, v14

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v3, v7}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v2, Lrs1/d;->c:I

    const/4 v11, 0x0

    invoke-static {v2, v8, v11}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    invoke-virtual {v0}, Lrt1/h$b;->w()Z

    move-result v2

    if-eqz v2, :cond_9

    const v2, -0x632c71f8    # -1.3999523E-21f

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->f()J

    move-result-wide v6

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lrt1/h$b;->x()Z

    move-result v2

    if-eqz v2, :cond_a

    const v2, -0x632a8d98

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j()J

    move-result-wide v6

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    const v2, -0x63292db2

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j0()J

    move-result-wide v6

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_5
    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lrt1/h$b;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v4, v8, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->y()Lb91/a;

    move-result-object v23

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v27, v9, 0x12

    const v28, 0x2fffa

    move-object v9, v4

    const/4 v4, 0x0

    move v10, v5

    move-wide v5, v6

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    move-object/from16 v19, v13

    const-wide/16 v12, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    const/16 v22, 0x1

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move v0, v3

    move-object v3, v2

    move v2, v0

    move-object/from16 v0, v30

    move/from16 v1, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    mul-float v17, v3, v34

    const/16 v18, 0x7

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, v29

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lrt1/h$b;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v5

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->Q()Lb91/a;

    move-result-object v23

    const/16 v26, 0x30

    const v28, 0x2fff8

    const-wide/16 v7, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v11, 0x1

    goto :goto_7

    :cond_b
    const/4 v11, 0x0

    const v0, -0x631fc163

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lst1/a;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lst1/a;-><init>(Lrt1/h$b;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final c(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lst1/i;->b(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

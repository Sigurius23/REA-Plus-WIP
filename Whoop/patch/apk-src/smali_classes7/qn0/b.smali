.class public abstract Lqn0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "description",
        "Ly3/f;",
        "shadowHeight",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLandroidx/compose/runtime/Composer;I)V",
        "challenge-details_release"
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqn0/b;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLandroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v6, p2

    move/from16 v8, p4

    const-string v2, "title"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "description"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    const v3, -0x58f4d165

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v8, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v8

    goto :goto_2

    :cond_2
    move v3, v8

    :goto_2
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v8, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_3
    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_4

    :cond_4
    const/16 v4, 0x10

    :goto_4
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_7

    invoke-virtual {v2, v6}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_5

    :cond_6
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v3, v4

    :cond_7
    and-int/lit16 v4, v3, 0x93

    const/16 v5, 0x92

    const/4 v7, 0x1

    if-eq v4, v5, :cond_8

    move v4, v7

    goto :goto_6

    :cond_8
    const/4 v4, 0x0

    :goto_6
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v2, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_c

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    double-to-float v9, v9

    mul-float/2addr v9, v5

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v9, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v9, v7

    mul-float/2addr v9, v5

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v5, v9, v2, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v9, v2, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v35, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v4, v3, 0xe

    or-int v4, v35, v4

    invoke-static {v0, v2, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->Q()Lb91/a;

    move-result-object v29

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v33, v13, 0x12

    const v34, 0x2fffa

    move-object v13, v10

    const/4 v10, 0x0

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const-wide/16 v18, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const-wide/16 v22, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v36, v31

    move-object/from16 v31, v2

    move-object/from16 v2, v36

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move v10, v5

    move-object/from16 v9, v31

    const/4 v5, 0x0

    move v11, v7

    const/4 v7, 0x7

    move v12, v3

    const/4 v3, 0x0

    move-object v13, v4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    shr-int/lit8 v3, v12, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int v3, v35, v3

    invoke-static {v1, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v9, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v29

    invoke-virtual {v13, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v4

    const v34, 0x2fff8

    const-wide/16 v13, 0x0

    move-object v10, v2

    move v2, v11

    move-object v9, v3

    move-wide v11, v4

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v31

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    move-object v9, v2

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v3, Lcom/whoop/bot/settings/h;

    invoke-direct {v3, v0, v1, v6, v8}, Lcom/whoop/bot/settings/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FI)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lqn0/b;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

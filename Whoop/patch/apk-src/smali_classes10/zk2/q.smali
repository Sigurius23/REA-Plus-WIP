.class public abstract Lzk2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Ltk2/f;",
        "metrics",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "track-activity_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Lzk2/q;->c(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltk2/f;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "metrics"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x7f953cc1

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/4 v7, 0x0

    const/16 v8, 0x12

    const/4 v9, 0x1

    if-eq v6, v8, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v7

    :goto_4
    and-int/2addr v2, v9

    invoke-virtual {v0, v2, v6}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_6

    move-object v2, v10

    goto :goto_5

    :cond_6
    move-object v2, v5

    :goto_5
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->f:Ll0/h;

    sget-object v6, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x6

    invoke-static {v5, v6, v0, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v6, v0, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x71b9934a

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v28

    :goto_7
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v29, v4

    check-cast v29, Ltk2/f;

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, v0, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v5, v0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v29 .. v29}, Ltk2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v6, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->x()Lb91/a;

    move-result-object v22

    invoke-virtual/range {v29 .. v29}, Ltk2/f;->c()Ly81/f;

    move-result-object v12

    invoke-virtual {v12, v0, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    int-to-float v12, v9

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float v14, v12, v13

    const/4 v15, 0x7

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v30, v18

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v31, v10

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v26, v10, 0x12

    const v27, 0x2fff8

    move-object v10, v6

    move v12, v7

    const-wide/16 v6, 0x0

    move v13, v8

    const/4 v8, 0x0

    move v14, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move/from16 v19, v3

    move-object v3, v11

    move/from16 v18, v12

    const-wide/16 v11, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v24, v2

    move-object v2, v4

    move/from16 v23, v5

    move-wide/from16 v4, v16

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x0

    move/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v23

    const/16 v23, 0x0

    move-object/from16 v37, v25

    const/16 v25, 0x30

    move-object/from16 p1, v24

    move-object/from16 v1, v37

    move-object/from16 v24, v0

    move/from16 v0, v36

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {v29 .. v29}, Ltk2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lb91/a;

    move/from16 v12, v30

    invoke-virtual {v1, v2, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v38

    const/16 v4, 0xf

    invoke-static {v4}, Lv63/c;->h(I)J

    move-result-wide v41

    const/16 v51, 0x0

    const v52, 0xfffffd

    const-wide/16 v39, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const-wide/16 v48, 0x0

    const/16 v50, 0x0

    invoke-static/range {v38 .. v52}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v3, v4, v5, v6, v5}, Lb91/a;-><init>(Ll3/v0;Lb91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v4

    const/16 v25, 0x0

    const v27, 0x2fffa

    move-object/from16 v22, v3

    const/4 v3, 0x0

    move/from16 v33, v6

    const-wide/16 v6, 0x0

    const-wide/16 v11, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v14, 0x1

    invoke-virtual {v2, v14}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object v0, v2

    move v9, v14

    move-object/from16 v10, v31

    move/from16 v3, v33

    move/from16 v8, v34

    const/4 v7, 0x0

    move-object/from16 v2, p1

    goto/16 :goto_7

    :cond_d
    move-object/from16 p1, v2

    move v12, v7

    move v14, v9

    move-object v2, v0

    invoke-virtual {v2, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v14}, Lp1/q;->q(Z)V

    move-object/from16 v5, p1

    goto :goto_9

    :cond_e
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Le81/g;

    move-object v2, v5

    const/4 v5, 0x7

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Le81/g;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final c(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/q;->b(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

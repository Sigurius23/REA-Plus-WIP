.class public abstract Luq2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Luq2/d;",
        "state",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "k",
        "(Luq2/d;ZLandroidx/compose/runtime/Composer;I)V",
        "Luq2/b;",
        "section",
        "f",
        "(Luq2/b;Landroidx/compose/runtime/Composer;I)V",
        "Luq2/c;",
        "item",
        "i",
        "(Luq2/c;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Luq2/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luq2/g;->h(Luq2/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luq2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luq2/g;->j(Luq2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luq2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luq2/g;->l(Luq2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Luq2/g;->m(Luq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luq2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Luq2/g;->g(Luq2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Luq2/b;Landroidx/compose/runtime/Composer;I)V
    .locals 42

    move-object/from16 v0, p0

    const-string v2, "section"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v2, -0x2ec7d2e4

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

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

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/2addr v2, v7

    invoke-virtual {v11, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    int-to-float v2, v7

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v5, v2

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v5, v12, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_3

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-static {v12, v11, v12, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Luq2/b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v11, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v11, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v12, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v27, v16, 0x12

    const v28, 0x2fffa

    move/from16 v16, v4

    const/4 v4, 0x0

    move/from16 v18, v7

    move/from16 v17, v8

    const-wide/16 v7, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    move/from16 v22, v13

    const-wide/16 v12, 0x0

    move/from16 v24, v6

    move-wide/from16 v40, v14

    move v15, v3

    move-object v3, v5

    move-wide/from16 v5, v40

    const/4 v14, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    move/from16 v30, v16

    move/from16 v29, v17

    const-wide/16 v16, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    move-object/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x0

    move/from16 v35, v22

    const/16 v22, 0x0

    move/from16 v36, v24

    const/16 v24, 0x0

    move/from16 v37, v26

    const/16 v26, 0x0

    move/from16 p1, v2

    move-object/from16 v39, v32

    move/from16 v2, v33

    move-object/from16 v1, v34

    move/from16 v0, v35

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual/range {p0 .. p0}, Luq2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v11, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v5

    const/4 v4, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual/range {p0 .. p0}, Luq2/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v11, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->E()Lb91/a;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Luq2/b;->b()Ly81/e;

    move-result-object v4

    invoke-interface {v4}, Ly81/e;->toTestableColor-0d7_KjU()J

    move-result-wide v5

    const/4 v4, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual/range {p0 .. p0}, Luq2/b;->d()Luq2/a;

    move-result-object v29

    if-nez v29, :cond_6

    const v0, -0x5d9cb063

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    move-object/from16 v2, v39

    const/4 v1, 0x4

    :goto_4
    const/4 v6, 0x1

    goto/16 :goto_6

    :cond_6
    const/4 v3, 0x0

    const v4, -0x5d9cb062

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v5, v4

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_7

    goto :goto_5

    :cond_7
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v29 .. v29}, Luq2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v11, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v26, 0x0

    const v28, 0x2fffa

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v36, v3

    move-object v3, v5

    move/from16 v31, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v38, v17

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move/from16 v35, v0

    move/from16 v0, v36

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    const/4 v3, 0x2

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v5, v4

    mul-float/2addr v3, v5

    move-object/from16 v6, v39

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v7, 0xa

    int-to-float v7, v7

    mul-float/2addr v7, v5

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {v29 .. v29}, Luq2/a;->a()Ljr2/d;

    move-result-object v5

    invoke-static {v3, v5}, Ljr2/b;->a(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v11, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {v29 .. v29}, Luq2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move/from16 v2, v35

    invoke-virtual {v1, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    move v15, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v11, 0x0

    move/from16 v37, v15

    const/4 v15, 0x0

    move-wide/from16 v40, v1

    move-object v2, v6

    move-wide/from16 v5, v40

    move/from16 v1, v37

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :goto_6
    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v0, v1

    mul-float v8, p1, v0

    const/4 v10, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lam/g;->x:Lam/g;

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    mul-float v6, v1, v0

    new-instance v0, Ltx0/a;

    const/16 v1, 0xd

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    const v1, 0x6030416

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const v12, 0xc30d86

    const/4 v4, 0x0

    const/4 v7, 0x0

    move v8, v9

    const/4 v9, 0x0

    invoke-static/range {v3 .. v12}, Lo73/a;->b(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v25, v11

    goto :goto_7

    :cond_8
    move-object v2, v0

    move-object/from16 v25, v11

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lsl0/j2;

    const/16 v3, 0xd

    move/from16 v4, p2

    invoke-direct {v1, v2, v4, v3}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final g(Luq2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Luq2/b;->c()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luq2/c;

    invoke-static {p2, p1, v2}, Luq2/g;->i(Luq2/c;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Luq2/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Luq2/g;->f(Luq2/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Luq2/c;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p1, Lp1/q;

    const v0, 0x33142742

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v2, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/2addr v0, v4

    invoke-virtual {p1, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Luq2/c;->a()Ly81/e;

    move-result-object v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v3, v6, :cond_3

    sget-object v3, Luq2/g$a;->w:Luq2/g$a;

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    sget-object v3, Li2/w0;->a:Li2/v0;

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_5

    const v0, 0x16467121    # 1.603001E-25f

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_4

    sget-object v4, Luq2/g$b;->w:Luq2/g$b;

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    invoke-interface {v4}, Ly81/e;->toTestableColor-0d7_KjU()J

    move-result-wide v8

    invoke-static {v7, v0, v8, v9, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p1, v5}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    const v0, 0x1647efe8

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v5}, Lp1/q;->q(Z)V

    move-object v0, v7

    :goto_3
    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {p0}, Luq2/c;->a()Ly81/e;

    move-result-object v2

    invoke-interface {v2}, Ly81/e;->toTestableColor-0d7_KjU()J

    move-result-wide v6

    invoke-static {v1, v6, v7, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p1, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lsl0/j2;

    const/16 v1, 0xe

    invoke-direct {v0, p0, p2, v1}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final j(Luq2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Luq2/g;->i(Luq2/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Luq2/d;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x33663d6a

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Llz1/a;

    const/16 v2, 0x1d

    invoke-direct {v1, p0, v2}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v2, 0x136d33cc

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Luq2/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Luq2/f;-><init>(Luq2/d;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final l(Luq2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    move-object/from16 v0, p2

    const-string v1, "$this$BasicAnimationComponent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    int-to-float v2, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v4, 0x5

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v5, v4

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v5, v2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v2, v8, v0, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v10, v0

    check-cast v10, Lp1/q;

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    iget-object v14, v10, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_0

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_0
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    :cond_1
    invoke-static {v11, v10, v11, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v11, v7

    const-wide/16 v13, 0x0

    cmpl-double v2, v11, v13

    if-lez v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v11, v7, v5

    if-lez v11, :cond_4

    goto :goto_2

    :cond_4
    move v5, v7

    :goto_2
    invoke-direct {v2, v5, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v11, 0x4025000000000000L    # 10.5

    double-to-float v5, v11

    mul-float/2addr v5, v3

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v2, v5, v11, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v2, -0x2cc7897

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Luq2/d;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v13, 0x0

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luq2/b;

    invoke-static {v5, v0, v13}, Luq2/g;->f(Luq2/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    mul-float/2addr v4, v3

    invoke-static {v6, v4, v11, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Luq2/d;->g()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    const v2, -0x56bfa1ee

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Luq2/d;->g()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->N()Lb91/a;

    move-result-object v21

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v24, v3, 0x15

    const v25, 0x1fffe

    move v3, v1

    const/4 v1, 0x0

    move-object v0, v2

    move v4, v3

    const-wide/16 v2, 0x0

    move v6, v4

    const-wide/16 v4, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v12, v9

    move-object v11, v10

    const-wide/16 v9, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    move-object/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v22, p2

    move-object/from16 v28, v27

    invoke-static/range {v0 .. v25}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v28

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v12, 0x1

    goto :goto_5

    :cond_6
    move-object v1, v0

    move-object v14, v10

    move v0, v13

    const v2, -0x56bc58b1

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    mul-float/2addr v4, v3

    invoke-static {v2, v4, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Luq2/d;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Luq2/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    shl-int/2addr v5, v9

    or-int/2addr v5, v6

    invoke-static {v2, v3, v4, v1, v5}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_5
    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Luq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Luq2/g;->k(Luq2/d;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

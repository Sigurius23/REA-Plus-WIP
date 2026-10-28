.class public abstract Lb71/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc71/a;",
        "state",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lc71/a;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
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
.method public static synthetic a(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb71/c;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc71/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb71/c;->e(Landroidx/compose/ui/Modifier;Lc71/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lc71/a;Landroidx/compose/runtime/Composer;I)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0xfbe2e51

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/2addr v3, v8

    invoke-virtual {v7, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v1}, Lc71/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v7, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lc71/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/4 v12, -0x1

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    const/4 v15, 0x6

    if-eqz v5, :cond_6

    const v5, -0x48cb0da

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lc71/a;->i()F

    move-result v5

    float-to-double v4, v5

    double-to-float v4, v4

    invoke-virtual {v1}, Lc71/a;->d()F

    move-result v5

    float-to-double v8, v5

    invoke-virtual {v1}, Lc71/a;->j()F

    move-result v5

    float-to-double v10, v5

    add-double/2addr v8, v10

    double-to-float v5, v8

    int-to-float v8, v12

    mul-float/2addr v5, v8

    new-instance v20, Lp91/a;

    const/16 v25, 0xc

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v20 .. v26}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v20

    invoke-static {v6, v4, v5, v8}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    double-to-float v4, v13

    const/16 v5, 0x8

    int-to-float v8, v5

    mul-float v24, v4, v8

    const/16 v25, 0x7

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v1}, Lc71/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v7, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lc71/a;->g()Ly81/e;

    move-result-object v10

    invoke-interface {v10, v7, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v7, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    new-instance v5, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v5, v9}, Lw3/k;-><init>(I)V

    const/16 v28, 0xc30

    const v29, 0x2d5f8

    move-object/from16 v16, v5

    move/from16 v18, v9

    const/16 v20, 0x1

    move-object v5, v4

    move-object v4, v8

    const-wide/16 v8, 0x0

    move-object/from16 v26, v7

    move-wide/from16 v39, v10

    move-object v11, v6

    move-wide/from16 v6, v39

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move-wide/from16 v30, v13

    const-wide/16 v13, 0x0

    move/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v25, v18

    const/16 v27, 0x0

    const-wide/16 v17, 0x0

    const/16 v32, 0x8

    const/16 v19, 0x3

    move/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x1

    move/from16 v35, v22

    const/16 v22, 0x0

    move/from16 v36, v23

    const/16 v23, 0x0

    move/from16 v37, v25

    const/16 v25, 0x0

    move/from16 v38, v27

    const/16 v27, 0x0

    move-object/from16 v1, v34

    move/from16 v0, v36

    move/from16 v2, v38

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    move-object v1, v6

    move v2, v9

    move v0, v15

    const v4, -0x483064d

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lc71/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_7

    const v4, -0x481bebe

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lc71/a;->i()F

    move-result v4

    float-to-double v4, v4

    double-to-float v4, v4

    invoke-virtual/range {p1 .. p1}, Lc71/a;->j()F

    move-result v5

    const/4 v6, -0x1

    int-to-float v6, v6

    mul-float/2addr v5, v6

    new-instance v8, Lp91/a;

    const/16 v13, 0xc

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/high16 v10, -0x40800000    # -1.0f

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v4, v5, v8}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v11, v6, v8

    const/4 v13, 0x0

    const/16 v14, 0xd

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lc71/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lc71/a;->b()Ly81/e;

    move-result-object v9

    invoke-interface {v9, v7, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v7, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    new-instance v0, Lw3/k;

    const/4 v11, 0x3

    invoke-direct {v0, v11}, Lw3/k;-><init>(I)V

    const/16 v28, 0xc30

    const v29, 0x2d5f8

    move-wide/from16 v30, v4

    move-object v5, v6

    move-object/from16 v26, v7

    move-object v4, v8

    move-wide v6, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x3

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, v0

    move-object/from16 v34, v1

    move-wide/from16 v0, v30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    move-object/from16 v34, v1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    const v4, -0x478f56d

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lc71/a;->i()F

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lc71/a;->h()F

    move-result v13

    new-instance v14, Lp91/a;

    const/16 v19, 0xc

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x0

    move-object v15, v14

    const/high16 v14, 0x3f800000    # 1.0f

    move-object/from16 v10, v34

    invoke-static/range {v10 .. v15}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_8

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_9

    :cond_8
    new-instance v6, Lb30/y4;

    const/4 v5, 0x1

    invoke-direct {v6, v3, v5}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x1

    invoke-static {v4, v3, v6}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v5, p0

    invoke-interface {v4, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->G:Lb2/m;

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    invoke-static {v6, v7, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lc71/a;->j()F

    move-result v2

    const/high16 v4, -0x40800000    # -1.0f

    mul-float v12, v2, v4

    invoke-virtual/range {p1 .. p1}, Lc71/a;->d()F

    move-result v14

    new-instance v15, Lp91/a;

    const/16 v20, 0xc

    const/16 v21, 0x0

    const/high16 v16, 0x3f000000    # 0.5f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v11, 0x3f000000    # 0.5f

    const/high16 v13, 0x3f800000    # 1.0f

    move-object/from16 v10, v34

    invoke-static/range {v10 .. v15}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lc71/a;->e()Ly81/e;

    move-result-object v2

    invoke-static {v2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v2

    sget-object v6, Lk91/a;->e:Lk91/a$a;

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, v5

    move-object v5, v2

    invoke-static/range {v4 .. v9}, Laz0/b;->b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lk;

    const/16 v3, 0xd

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final d(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lc71/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lb71/c;->c(Landroidx/compose/ui/Modifier;Lc71/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

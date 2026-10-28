.class public abstract Lsy0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aG\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lsy0/k$b;",
        "whoopCheckboxType",
        "",
        "initialToggle",
        "isEnabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "d",
        "(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsy0/g;->g(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lsy0/k$b;ZLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsy0/g;->f(Lsy0/k$b;ZLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsy0/g;->e(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lsy0/k$b;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p4

    move/from16 v7, p6

    const-string v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCheckboxType"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    const v0, 0x3ca780f4

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v7, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    and-int/lit8 v4, p7, 0x4

    const/16 v5, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v15, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v5

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_8

    move/from16 v10, p3

    invoke-virtual {v15, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit16 v11, v7, 0x6000

    const/16 v12, 0x4000

    if-nez v11, :cond_c

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    move v11, v12

    goto :goto_8

    :cond_b
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v0, v11

    :cond_c
    and-int/lit16 v11, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v3, 0x1

    if-eq v11, v13, :cond_d

    move v11, v3

    goto :goto_9

    :cond_d
    move v11, v14

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v15, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_16

    if-eqz v4, :cond_e

    move v8, v14

    :cond_e
    if-eqz v9, :cond_f

    move/from16 v18, v3

    goto :goto_a

    :cond_f
    move/from16 v18, v10

    :goto_a
    const/4 v4, 0x6

    if-eqz v8, :cond_10

    const v9, -0x4f34c7e2

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9, v15, v4, v14}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_b
    move-wide v10, v9

    goto :goto_c

    :cond_10
    const v9, -0x4f34c3a5

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9, v15, v4, v14}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    goto :goto_b

    :goto_c
    if-eqz v8, :cond_11

    const v9, -0x4f34bc22

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9, v15, v4, v14}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_d
    move-wide/from16 v22, v16

    goto :goto_e

    :cond_11
    const v9, -0x4f34b7e2

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9, v15, v4, v14}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_d

    :goto_e
    new-instance v4, Li3/i;

    invoke-direct {v4, v3}, Li3/i;-><init>(I)V

    const v9, 0xe000

    and-int/2addr v9, v0

    if-ne v9, v12, :cond_12

    move v9, v3

    goto :goto_f

    :cond_12
    move v9, v14

    :goto_f
    and-int/lit16 v0, v0, 0x380

    if-ne v0, v5, :cond_13

    move v0, v3

    goto :goto_10

    :cond_13
    move v0, v14

    :goto_10
    or-int/2addr v0, v9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_14

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v5, v0, :cond_15

    :cond_14
    new-instance v5, Lam2/f0;

    const/4 v0, 0x5

    invoke-direct {v5, v6, v8, v0}, Lam2/f0;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v20, v5

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x8

    sget-object v16, Lb2/t;->w:Lb2/t;

    move-object/from16 v19, v4

    move/from16 v17, v8

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/selection/d;->b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v8, v18

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v0, v3

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v0, v3

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v12

    int-to-float v13, v14

    new-instance v0, Lsy0/f;

    move-object v3, v1

    move-object v1, v2

    move/from16 v2, v17

    move-wide/from16 v4, v22

    invoke-direct/range {v0 .. v5}, Lsy0/f;-><init>(Lsy0/k$b;ZLcom/whoop/design/util/TextResource;J)V

    const v1, 0x61683417

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0x1b0000

    const/16 v17, 0x18

    move-object v8, v9

    move-object v9, v12

    const/4 v12, 0x0

    invoke-static/range {v8 .. v17}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move v3, v2

    move/from16 v4, v18

    goto :goto_11

    :cond_16
    invoke-virtual {v15}, Lp1/q;->X()V

    move v3, v8

    move v4, v10

    :goto_11
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lep1/p;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v6

    move v6, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lep1/p;-><init>(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lsy0/k$b;ZLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p6, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p6, 0x1

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Ll0/a1;->x:Ll0/a1;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v13, v3

    const/16 v5, 0x8

    int-to-float v11, v5

    mul-float v5, v13, v11

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v6, v6

    mul-float/2addr v6, v11

    invoke-static {v0, v5, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lsy0/k$b;->b()Lkd1/o;

    move-result-object v5

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    move-object v10, v8

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    mul-float/2addr v5, v11

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v14, v4

    move v4, v5

    const/4 v5, 0x5

    int-to-float v5, v5

    const/4 v7, 0x4

    int-to-float v15, v7

    mul-float/2addr v5, v15

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v6, 0x6

    if-eqz p1, :cond_4

    const v8, -0x1105bbfb

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v10, v6, v2}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    goto :goto_2

    :cond_4
    const v8, -0x1105b7bb

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v10, v6, v2}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    :goto_2
    const/16 v11, 0x1b0

    const/4 v12, 0x0

    move/from16 v16, v6

    const/4 v6, 0x0

    move/from16 v31, v5

    move-object v5, v0

    move/from16 v0, v31

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v13, v15, v14, v10}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v5, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v5, 0x0

    invoke-static {v6, v4, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v3, p2

    invoke-static {v3, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "toUpperCase(...)"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lsy0/k;->a()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v4, v14

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

    const/16 v28, 0x0

    move-wide/from16 v7, p3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    if-eqz p1, :cond_7

    const v3, -0xfaadeee

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/a;->b()I

    move-result v5

    const/4 v6, 0x6

    invoke-static {v5, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget v7, Lgy0/f;->J:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz p1, :cond_6

    const v4, -0x11055b7b

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v3

    :goto_4
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-wide v8, v3

    goto :goto_5

    :cond_6
    const v4, -0x1105573b

    invoke-static {v10, v4, v3, v10, v6}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v3

    goto :goto_4

    :goto_5
    const/16 v11, 0x180

    const/4 v12, 0x0

    move-object v6, v7

    move-object v7, v0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    const v0, -0xfa4ee99

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lsy0/g;->d(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

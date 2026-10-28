.class public abstract Lk80/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "Lg1/u0;",
        "buttonColors",
        "Li2/a1;",
        "shape",
        "Lf0/t;",
        "border",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lk80/i;->g(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lk80/i;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;Lg1/u0;ZLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lk80/i;->f(Lcom/whoop/design/util/TextResource;Lg1/u0;ZLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/design/util/TextResource;",
            "Lg1/u0;",
            "Li2/a1;",
            "Lf0/t;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v7, p7

    move-object/from16 v1, p6

    check-cast v1, Lp1/q;

    const v2, 0x446265c9

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p8, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v5, v7, 0x6

    move v6, v5

    move/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v7, 0x6

    if-nez v5, :cond_2

    move/from16 v5, p0

    invoke-virtual {v1, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v7

    goto :goto_1

    :cond_2
    move/from16 v5, p0

    move v6, v7

    :goto_1
    and-int/lit8 v8, v7, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, p8, 0x2

    if-nez v8, :cond_4

    and-int/lit8 v8, v7, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v6, v8

    :cond_5
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_8

    and-int/lit8 v8, p8, 0x4

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v8, p2

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    goto :goto_5

    :cond_8
    move-object/from16 v8, p2

    :goto_5
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_b

    and-int/lit8 v9, p8, 0x8

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-virtual {v1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v9, p3

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v6, v10

    goto :goto_7

    :cond_b
    move-object/from16 v9, p3

    :goto_7
    and-int/lit8 v19, p8, 0x10

    if-eqz v19, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-object/from16 v10, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_c

    move-object/from16 v10, p4

    invoke-virtual {v1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v11, 0x4000

    goto :goto_8

    :cond_e
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v6, v11

    :goto_9
    and-int/lit8 v20, p8, 0x20

    const/high16 v11, 0x30000

    if-eqz v20, :cond_10

    or-int/2addr v6, v11

    :cond_f
    move-object/from16 v11, p5

    goto :goto_b

    :cond_10
    and-int/2addr v11, v7

    if-nez v11, :cond_f

    move-object/from16 v11, p5

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    const/high16 v12, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v12, 0x10000

    :goto_a
    or-int/2addr v6, v12

    :goto_b
    const v12, 0x12493

    and-int/2addr v12, v6

    const v13, 0x12492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_12

    move v12, v15

    goto :goto_c

    :cond_12
    move v12, v14

    :goto_c
    and-int/lit8 v13, v6, 0x1

    invoke-virtual {v1, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1f

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v12, v7, 0x1

    if-eqz v12, :cond_17

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_13

    goto :goto_d

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_14

    and-int/lit8 v6, v6, -0x71

    :cond_14
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_15

    and-int/lit16 v6, v6, -0x381

    :cond_15
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_16

    and-int/lit16 v6, v6, -0x1c01

    :cond_16
    move-object v12, v9

    move-object v13, v10

    move v2, v14

    move-object v9, v1

    move v10, v5

    move-object v14, v8

    move-object v8, v11

    goto/16 :goto_11

    :cond_17
    :goto_d
    if-eqz v2, :cond_18

    move v5, v15

    :cond_18
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_19

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/lit8 v6, v6, -0x71

    :cond_19
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_1a

    sget-object v2, Lg1/v0;->a:Ll0/l1;

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v2, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    invoke-virtual {v2, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->w()J

    move-result-wide v15

    invoke-virtual {v2, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->X0()J

    move-result-wide v17

    invoke-virtual {v2, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v21

    move v2, v14

    move-wide v10, v15

    move-wide/from16 v14, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v1

    move-wide v8, v12

    move-wide/from16 v12, v21

    invoke-static/range {v8 .. v18}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v1

    move-object/from16 v9, v16

    and-int/lit16 v6, v6, -0x381

    move-object v8, v1

    goto :goto_e

    :cond_1a
    move-object v9, v1

    move v2, v14

    :goto_e
    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_1b

    int-to-float v1, v4

    mul-float/2addr v1, v1

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    and-int/lit16 v4, v6, -0x1c01

    move v6, v4

    goto :goto_f

    :cond_1b
    move-object/from16 v1, p3

    :goto_f
    if-eqz v19, :cond_1c

    const/4 v4, 0x0

    goto :goto_10

    :cond_1c
    move-object/from16 v4, p4

    :goto_10
    if-eqz v20, :cond_1e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_1d

    new-instance v10, Lj02/w;

    const/16 v11, 0x9

    invoke-direct {v10, v11}, Lj02/w;-><init>(I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v10, Lc93/a;

    move-object v12, v1

    move-object v13, v4

    move-object v14, v8

    move-object v8, v10

    move v10, v5

    goto :goto_11

    :cond_1e
    move-object v12, v1

    move-object v13, v4

    move v10, v5

    move-object v14, v8

    move-object/from16 v8, p5

    :goto_11
    invoke-virtual {v9}, Lp1/q;->r()V

    int-to-float v1, v2

    int-to-float v2, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    new-instance v15, Ll0/l1;

    invoke-direct {v15, v1, v2, v1, v2}, Ll0/l1;-><init>(FFFF)V

    new-instance v1, Lk80/g;

    invoke-direct {v1, v0, v14, v10}, Lk80/g;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Z)V

    const v2, -0x512e0a47

    invoke-static {v2, v9, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    shr-int/lit8 v1, v6, 0xf

    and-int/lit8 v1, v1, 0xe

    const v2, 0x36006000

    or-int/2addr v1, v2

    shl-int/lit8 v2, v6, 0x6

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v1, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v1, v3

    const/high16 v3, 0x380000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    const/high16 v2, 0x1c00000

    shl-int/lit8 v3, v6, 0xf

    and-int/2addr v2, v3

    or-int v18, v1, v2

    const/16 v19, 0xa

    move-object/from16 v17, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v19}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    move v1, v10

    move-object v4, v12

    move-object v5, v13

    move-object v3, v14

    :goto_12
    move-object v2, v0

    goto :goto_13

    :cond_1f
    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move v1, v5

    move-object v3, v8

    move-object/from16 v5, p4

    goto :goto_12

    :goto_13
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_20

    new-instance v0, Lk80/h;

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lk80/h;-><init>(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Lg1/u0;ZLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    const-string v0, "$this$Button"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->e:Ll0/h;

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x6

    invoke-static {v1, v4, v3, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v3, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v1, p0

    invoke-static {v1, v3, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v1, v3, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->r()Lb91/a;

    move-result-object v23

    move-object/from16 v1, p1

    check-cast v1, Lg1/m1;

    move/from16 v4, p2

    invoke-virtual {v1, v4, v3}, Lg1/m1;->a(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v5, v1, Li2/x;->a:J

    new-instance v15, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v15, v1}, Lw3/k;-><init>(I)V

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v27, v1, 0x12

    const v28, 0x2fdfa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v3

    move-object v3, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move-object v0, v3

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lk80/i;->d(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

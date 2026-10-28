.class public abstract Lfg2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a9\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNext",
        "onTermsOfService",
        "g",
        "(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "sms_release"
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
.method public static synthetic a(Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfg2/m;->k(Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/m;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/m;->j(Lc93/a;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfg2/m;->l(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfg2/m;->m(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lfg2/m;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x412295d9

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    const/16 v17, 0x20

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move/from16 v8, v17

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit16 v12, v5, 0x93

    const/16 v13, 0x92

    const/4 v14, 0x0

    if-eq v12, v13, :cond_9

    const/4 v12, 0x1

    goto :goto_6

    :cond_9
    move v12, v14

    :goto_6
    and-int/lit8 v13, v5, 0x1

    invoke-virtual {v10, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_18

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v3, v12

    :cond_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_b

    new-instance v6, Lf1/z1;

    const/16 v7, 0x12

    invoke-direct {v6, v7}, Lf1/z1;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lc93/a;

    move-object/from16 v18, v6

    goto :goto_7

    :cond_c
    move-object/from16 v18, v7

    :goto_7
    if-eqz v8, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_d

    new-instance v6, Lf1/z1;

    const/16 v7, 0x13

    invoke-direct {v6, v7}, Lf1/z1;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lc93/a;

    goto :goto_8

    :cond_e
    move-object v6, v11

    :goto_8
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_f

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v10, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v14, v10, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x2

    int-to-float v14, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v14, v8

    move/from16 p0, v8

    const/4 v8, 0x0

    move-object/from16 v22, v3

    const/4 v3, 0x2

    invoke-static {v7, v14, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit16 v7, v5, 0x380

    const/16 v14, 0x100

    if-ne v7, v14, :cond_12

    const/4 v7, 0x1

    goto :goto_a

    :cond_12
    const/4 v7, 0x0

    :goto_a
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_13

    if-ne v14, v0, :cond_14

    :cond_13
    new-instance v14, Laz1/b;

    const/16 v0, 0x18

    invoke-direct {v14, v6, v0}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lkotlin/jvm/functions/Function1;

    move-object v0, v15

    const/4 v15, 0x6

    const/4 v7, 0x1

    const/16 v16, 0x1fe

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move/from16 v21, v7

    const/4 v7, 0x0

    move/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v25, v13

    move-object v13, v14

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v26, v11

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move-object/from16 p1, v2

    move/from16 v4, v23

    move-object/from16 v2, v27

    move-object/from16 v23, v0

    move/from16 v0, v21

    move/from16 v21, p0

    move/from16 p0, v5

    move-object v5, v3

    move-object/from16 v3, v26

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v5, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v14}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v5

    iget-object v5, v5, Ll0/c2;->e:Ll0/b;

    invoke-static {v5, v14}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v5

    invoke-virtual {v5}, Ll0/x0;->a()F

    move-result v5

    const/16 v6, 0x190

    int-to-float v6, v6

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->I:Lb2/m;

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v8, v6, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v4, v5, v0}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v28, Li2/t;->b:Li2/s;

    const-wide v6, 0xff50d5ffL

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v9

    const v11, 0x3dcccccd    # 0.1f

    invoke-static {v11, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    new-instance v12, Li2/x;

    invoke-direct {v12, v9, v10}, Li2/x;-><init>(J)V

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v6

    invoke-static {v11, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v9, Li2/x;

    invoke-direct {v9, v6, v7}, Li2/x;-><init>(J)V

    const-wide v6, 0xff8b62ffL

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v6

    invoke-static {v11, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v10, Li2/x;

    invoke-direct {v10, v6, v7}, Li2/x;-><init>(J)V

    sget-wide v6, Li2/x;->m:J

    new-instance v11, Li2/x;

    invoke-direct {v11, v6, v7}, Li2/x;-><init>(J)V

    filled-new-array {v12, v9, v10, v11}, [Li2/x;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v29

    const/high16 v6, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v9, v7

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    shl-long v9, v9, v17

    const-wide v11, 0xffffffffL

    and-long/2addr v6, v11

    or-long v30, v9, v6

    const/high16 v32, 0x44610000    # 900.0f

    const/16 v33, 0x8

    invoke-static/range {v28 .. v33}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v9, 0x6

    invoke-static {v5, v6, v7, v4, v9}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v14, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v4, Lb2/e;->H:Lb2/m;

    invoke-virtual {v8, v2, v4}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v4, v4, v21

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_15

    invoke-virtual {v14, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v1, v24

    goto :goto_c

    :cond_15
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v14, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v25

    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    move-object/from16 v1, v23

    goto :goto_e

    :cond_17
    :goto_d
    move-object/from16 v1, p1

    goto :goto_f

    :goto_e
    invoke-static {v4, v14, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v14, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Leg2/k;->INTRO:Leg2/k;

    shl-int/lit8 v1, p0, 0x9

    const v2, 0xe000

    and-int/2addr v1, v2

    or-int/lit8 v11, v1, 0x6

    const/16 v12, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v14

    move-object/from16 v9, v18

    invoke-static/range {v5 .. v12}, Leg2/e;->g(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object v2, v9

    move-object/from16 v3, v20

    move-object/from16 v1, v22

    goto :goto_10

    :cond_18
    move-object v14, v10

    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v1, v3

    move-object v2, v7

    move-object v3, v11

    :goto_10
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lfg2/k;

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lfg2/k;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lc93/a;Ln0/q;)Ll83/a0;
    .locals 6

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfg2/c;->a:Lfg2/c;

    invoke-virtual {v0}, Lfg2/c;->f()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {p1, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Lfg2/c;->g()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p1, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Lfg2/c;->h()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p1, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance v1, Lfg2/l;

    const/4 v4, 0x0

    invoke-direct {v1, p0, v4}, Lfg2/l;-><init>(Lc93/a;I)V

    new-instance p0, Lx1/b;

    const/4 v4, 0x1

    const v5, 0x73774ac5

    invoke-direct {p0, v1, v4, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p1, v2, p0, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Lfg2/c;->e()Lkotlin/jvm/functions/Function3;

    move-result-object p0

    invoke-static {p1, v2, p0, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v0, p0

    const-string v1, "$this$item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x4

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v9, v1, v2

    const/4 v11, 0x0

    const/16 v12, 0xd

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    sget v1, Lvf2/b;->B:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    sget-object v1, Lfg2/m$a;->w:Lfg2/m$a;

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2

    sget-object v1, Lfg2/m$b;->w:Lfg2/m$b;

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    new-instance v1, Lm91/o;

    new-instance v17, Lny0/p0;

    sget v4, Lvf2/b;->D:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v18

    new-instance v19, Lcom/whoop/navigation/e;

    const/16 v23, 0x7

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ly71/g;

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lih0/d0;->E(Lx81/d;)I

    move-result v5

    const/4 v7, 0x0

    const/4 v9, 0x2

    invoke-direct {v4, v5, v7, v9, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v32, 0x3fb4

    const/16 v33, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v21, v4

    invoke-direct/range {v17 .. v33}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v17

    invoke-direct {v1, v4, v7, v9, v7}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v25

    new-instance v4, Lc41/p2;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const v28, 0xdfeae

    const/16 v29, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v29}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_3

    if-ne v5, v2, :cond_4

    :cond_3
    new-instance v5, Laz1/b;

    const/16 v1, 0x19

    invoke-direct {v5, v0, v1}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v0, Lc41/p2;->v:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v7, v0, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfg2/m;->g(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

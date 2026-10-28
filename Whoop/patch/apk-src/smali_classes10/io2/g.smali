.class public abstract Lio2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio2/h;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "showTopBorder",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "universal-checkout_release"
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
.method public static synthetic a(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lio2/g;->i(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio2/g;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio2/g;->g(ZJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lio2/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lio2/g;->h(Lkotlin/jvm/functions/Function1;Lio2/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio2/h;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, -0x1c8f798f

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, p6, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p2

    invoke-virtual {v15, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    move v9, v7

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_7

    :cond_b
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v0, v12

    :goto_8
    and-int/lit16 v12, v0, 0x493

    const/16 v13, 0x492

    const/16 v32, 0x0

    if-eq v12, v13, :cond_c

    const/4 v12, 0x1

    goto :goto_9

    :cond_c
    move/from16 v12, v32

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v15, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1c

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_d

    move-object v4, v12

    :cond_d
    if-eqz v6, :cond_e

    const/4 v3, 0x1

    goto :goto_a

    :cond_e
    move v3, v8

    :goto_a
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_f

    new-instance v8, Lio2/e;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lio2/e;-><init>(I)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v11, v8

    :cond_10
    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v15, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    move-object/from16 p1, v11

    invoke-virtual {v13}, Ly81/i;->a1()J

    move-result-wide v10

    sget-object v13, Lb2/e;->N:Lb2/k;

    move/from16 p2, v3

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v14, v3

    mul-float/2addr v2, v14

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    move/from16 p3, v3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit16 v5, v0, 0x380

    if-ne v5, v7, :cond_11

    const/4 v5, 0x1

    goto :goto_b

    :cond_11
    move/from16 v5, v32

    :goto_b
    invoke-virtual {v15, v10, v11}, Lp1/q;->f(J)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_13

    if-ne v7, v6, :cond_12

    goto :goto_c

    :cond_12
    move-object/from16 v17, v12

    move/from16 v12, p2

    goto :goto_d

    :cond_13
    :goto_c
    new-instance v7, Lio2/f;

    const/4 v5, 0x0

    move-object/from16 v17, v12

    move/from16 v12, p2

    invoke-direct {v7, v5, v10, v11, v12}, Lio2/f;-><init>(IJZ)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v7}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v5, v10

    mul-float/2addr v5, v14

    const/4 v7, 0x3

    int-to-float v7, v7

    mul-float/2addr v7, v14

    invoke-static {v3, v5, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v5, 0x36

    invoke-static {v2, v13, v15, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_14

    invoke-virtual {v15, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_14
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_e
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v15, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v15, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-nez v7, :cond_15

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    :cond_15
    invoke-static {v5, v15, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio2/h;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v15, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object v5, v6

    sget-object v6, Liz0/l;->a:Liz0/l;

    invoke-virtual {v8, v15, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->d()Lb91/a;

    move-result-object v7

    invoke-virtual {v7}, Lb91/a;->d()Ll3/v0;

    move-result-object v33

    const/16 v46, 0x0

    const v47, 0xff7fff

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x3

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    invoke-static/range {v33 .. v47}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v7

    invoke-virtual {v8, v15, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    sget v10, Liz0/l;->b:I

    shl-int/lit8 v30, v10, 0xf

    const/16 v31, 0x7ffc

    const-wide/16 v10, 0x0

    move/from16 v18, v12

    const-wide/16 v12, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v28, v15

    const/16 v20, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    move/from16 v25, v22

    const-wide/16 v21, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v33, v25

    const/16 v25, 0x0

    move-object/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v35, v27

    const/16 v27, 0x0

    move/from16 v36, v29

    const/16 v29, 0x0

    move-object/from16 p2, v2

    move-object/from16 v2, p1

    move-object/from16 p1, p2

    move/from16 p2, v3

    move-object/from16 v48, v5

    move-object/from16 v3, v34

    move/from16 v5, v36

    move-object/from16 v34, v4

    const/16 v4, 0x800

    invoke-virtual/range {v6 .. v31}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v9

    int-to-float v6, v5

    mul-float v6, v6, v35

    const/4 v7, 0x0

    invoke-static {v3, v7, v6, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v3, Liz0/m;->p:I

    shl-int/lit8 v3, v3, 0x9

    or-int/lit8 v16, v3, 0x30

    const/16 v17, 0x1f4

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v6, p1

    move-object/from16 v15, v28

    invoke-static/range {v6 .. v17}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lio2/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lio2/h;->i()Z

    move-result v7

    and-int/lit16 v3, v0, 0x1c00

    if-ne v3, v4, :cond_17

    move v14, v5

    goto :goto_f

    :cond_17
    move/from16 v14, v32

    :goto_f
    and-int/lit8 v3, v0, 0xe

    const/4 v4, 0x4

    if-eq v3, v4, :cond_18

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_19

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_18
    move/from16 v32, v5

    :cond_19
    or-int v0, v14, v32

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1a

    move-object/from16 v0, v48

    if-ne v3, v0, :cond_1b

    :cond_1a
    new-instance v3, Li01/d;

    const/16 v0, 0x18

    invoke-direct {v3, v2, v1, v0}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v19, v3

    check-cast v19, Lc93/a;

    shl-int/lit8 v21, p2, 0x12

    const/16 v22, 0x0

    const/16 v23, 0x1fbd

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v28, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v28

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v20

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    move-object v4, v2

    move/from16 v3, v33

    move-object/from16 v2, v34

    goto :goto_10

    :cond_1c
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v2, v4

    move v3, v8

    move-object v4, v11

    :goto_10
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Law0/h;

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Law0/h;-><init>(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ZJLk2/e;)Ll83/a0;
    .locals 12

    const-string v1, "$this$drawBehind"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    if-nez p0, :cond_0

    return-object v11

    :cond_0
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    or-long v3, v2, v4

    invoke-interface {p3}, Lk2/e;->d()J

    move-result-wide v9

    shr-long/2addr v9, v6

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long v5, v9, v6

    and-long/2addr v1, v7

    or-long/2addr v5, v1

    const/4 v1, 0x1

    int-to-float v1, v1

    invoke-interface {p3, v1}, Ly3/c;->q0(F)F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    const/4 v8, 0x0

    move-wide v1, p1

    move-object v0, p3

    invoke-static/range {v0 .. v10}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    return-object v11
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lio2/h;)Ll83/a0;
    .locals 3

    new-instance v0, Lio2/d;

    invoke-virtual {p1}, Lio2/h;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio2/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio2/h;->h()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lio2/d;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lio2/g;->e(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

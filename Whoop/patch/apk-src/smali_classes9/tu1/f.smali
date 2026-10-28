.class public abstract Ltu1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001aM\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a?\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a?\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\r\u001aA\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ltu1/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lqu1/b;",
        "Ll83/a0;",
        "onBodyItemClicked",
        "Lqu1/c$a;",
        "onAnalyticsEvent",
        "o",
        "(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "t",
        "(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "m",
        "onViewEvent",
        "A",
        "(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "shouldPad",
        "E",
        "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;",
        "isScrubbing",
        "last-night-sleep_release"
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
.method private static final A(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltu1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x51065eb3

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v0, v9

    :goto_4
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/16 v31, 0x0

    const/4 v12, 0x1

    if-eq v9, v11, :cond_7

    move v9, v12

    goto :goto_5

    :cond_7
    move/from16 v9, v31

    :goto_5
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_8

    new-instance v5, Lt71/i;

    const/16 v8, 0x11

    invoke-direct {v5, v8}, Lt71/i;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v5, v8

    :goto_6
    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->g:Ll0/h;

    const/16 v13, 0x36

    invoke-static {v11, v8, v10, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v11, v10, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ltu1/g;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v3, v7

    const-wide/16 v17, 0x0

    cmpl-double v3, v3, v17

    if-lez v3, :cond_d

    :goto_8
    move-object v8, v5

    move-object v5, v6

    goto :goto_9

    :cond_d
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_8

    :goto_9
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v7, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v3, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v29, v7, 0x12

    const v30, 0x2fff8

    move-object v7, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    move/from16 v19, v15

    const-wide/16 v14, 0x0

    const/16 v21, 0x100

    const/16 v16, 0x0

    move-object/from16 v22, v7

    move-wide/from16 v37, v17

    move-object/from16 v18, v8

    move-wide/from16 v7, v37

    const/16 v17, 0x0

    move-object/from16 v23, v18

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v32, v22

    const/16 v22, 0x0

    move-object/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move-object/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 v4, v32

    move-object/from16 v3, v33

    const/16 v2, 0x20

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v2, :cond_e

    const/4 v12, 0x1

    goto :goto_a

    :cond_e
    move/from16 v12, v31

    :goto_a
    or-int v2, v5, v12

    and-int/lit16 v0, v0, 0x380

    const/16 v5, 0x100

    if-ne v0, v5, :cond_f

    const/16 v31, 0x1

    :cond_f
    or-int v0, v2, v31

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_11

    if-ne v2, v4, :cond_10

    goto :goto_b

    :cond_10
    move-object/from16 v4, p1

    goto :goto_c

    :cond_11
    :goto_b
    new-instance v2, Lre1/k;

    const/4 v0, 0x5

    move-object/from16 v4, p1

    invoke-direct {v2, v1, v4, v3, v0}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object/from16 v18, v2

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v35

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "info_icon"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->q()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v10, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    move-object/from16 v0, p2

    move/from16 v2, p3

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_12
    move-object v4, v2

    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v3, v8

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lt01/e;

    move/from16 v5, p5

    move-object v2, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt01/e;-><init>(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final B(Lqu1/c$a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    invoke-virtual {p0}, Ltu1/g;->c()Ltu1/b;

    move-result-object v0

    invoke-virtual {v0}, Ltu1/b;->a()Ltu1/a;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lqu1/b$a;

    invoke-virtual {p0}, Ltu1/g;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lqu1/b$a;-><init>(Ljava/lang/String;Ltu1/a;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lqu1/c$g;

    invoke-virtual {p0}, Ltu1/g;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lqu1/c$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ltu1/f;->A(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float p1, v0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p1, v0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic F(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Ltu1/f;->E(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lqu1/c$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltu1/f;->B(Lqu1/c$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltu1/f;->D(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltu1/f;->w(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ltu1/f;->s(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltu1/f;->x(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ltu1/f;->C(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lqu1/c$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltu1/f;->q(Lqu1/c$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ltu1/f;->n(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ltu1/f;->y(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltu1/f;->r(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ltu1/f;->z(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lqu1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltu1/f;->p(Lqu1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltu1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v4, p4

    sget-object v0, Lb2/e;->J:Lb2/l;

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v1, 0x670f948

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    move-object/from16 v6, p1

    if-nez v5, :cond_3

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    move-object/from16 v7, p2

    if-nez v5, :cond_5

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v5, v3, 0x93

    const/16 v8, 0x92

    const/4 v12, 0x1

    if-eq v5, v8, :cond_6

    move v5, v12

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v9, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1c

    int-to-float v5, v2

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v5, v8

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    invoke-static {v14, v5, v10, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v5, v12

    mul-float/2addr v5, v8

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v5, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_7

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v9, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v8, v9, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v9, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v2, v3, 0x3fe

    move-object v3, v10

    const/4 v10, 0x0

    move-object v8, v5

    move-object v5, v1

    move-object v1, v8

    move-object v8, v9

    move v9, v2

    invoke-static/range {v5 .. v10}, Ltu1/f;->A(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v8

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->L:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v5, v9, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v9, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v6, v9, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v9, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ltu1/g;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    const v2, -0x4c6957d3

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    sget-object v2, Ll0/m;->a:Ll0/e;

    const/4 v5, 0x0

    invoke-static {v2, v0, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v9, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-static {v5, v9, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v9, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x78fad030

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ltu1/g;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lly0/f;

    sget v10, Lly0/f;->f:I

    const/16 v11, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_10
    const/4 v2, 0x1

    const/4 v5, 0x0

    invoke-static {v9, v5, v2, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_9

    :cond_11
    const/4 v5, 0x0

    const v1, -0x4c675d0c

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p0 .. p0}, Ltu1/g;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    const v1, -0x4c6667f4

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ll0/m;->a:Ll0/e;

    invoke-static {v1, v0, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v9, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {v2, v9, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x57ddb5f9

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ltu1/g;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ln21/e;

    sget v10, Ln21/e;->i:I

    const/16 v11, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_15
    const/4 v2, 0x1

    const/4 v5, 0x0

    invoke-static {v9, v5, v2, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_c

    :cond_16
    const/4 v2, 0x1

    const v1, -0x4c64696c

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual/range {p0 .. p0}, Ltu1/g;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1b

    const v1, -0x4c63528b

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ll0/m;->a:Ll0/e;

    invoke-static {v1, v0, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_17

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_18
    invoke-static {v1, v9, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x2b365f50

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ltu1/g;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltu1/h;

    invoke-virtual {v1}, Ltu1/h;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Ltu1/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Ltu1/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Ltu1/h;->a()Ly81/e;

    move-result-object v1

    const/4 v5, 0x0

    invoke-interface {v1, v9, v5}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v1, 0x6

    shl-int/lit8 v8, v1, 0xc

    or-int/2addr v6, v8

    shl-int/lit8 v1, v1, 0x15

    or-int v24, v6, v1

    const/16 v25, 0x0

    const v26, 0xfd6b

    move/from16 v16, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move/from16 v1, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, v9

    move-object v9, v3

    invoke-static/range {v5 .. v26}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v23

    goto :goto_e

    :cond_1a
    const/4 v1, 0x0

    invoke-static {v9, v1, v2, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_f

    :cond_1b
    move v1, v5

    const v0, -0x4c5cc48c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1c
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1d

    new-instance v0, Ltu1/e;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Ltu1/e;-><init>(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final n(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ltu1/f;->m(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ltu1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, -0x32c2caa0

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_5

    :cond_a
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v3, v9

    :goto_6
    and-int/lit16 v9, v3, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x1

    if-eq v9, v10, :cond_b

    move v9, v11

    goto :goto_7

    :cond_b
    const/4 v9, 0x0

    :goto_7
    and-int/2addr v3, v11

    invoke-virtual {v15, v3, v9}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    if-eqz v0, :cond_c

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_c
    move-object v0, v1

    :goto_8
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_e

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_d

    new-instance v3, Lt71/i;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lt71/i;-><init>(I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_e
    move-object v3, v6

    :goto_9
    if-eqz v7, :cond_10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_f

    new-instance v4, Lt71/i;

    const/16 v1, 0x10

    invoke-direct {v4, v1}, Lt71/i;-><init>(I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v1, v4

    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_10
    move-object v1, v8

    :goto_a
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v4, v15, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a1()J

    move-result-wide v8

    sget-object v4, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v4}, Lkd1/w;->a()Lk91/a;

    move-result-object v4

    invoke-virtual {v4}, Lk91/a;->c()Lt0/i;

    move-result-object v10

    new-instance v4, Ljp1/k;

    const/16 v7, 0x18

    invoke-direct {v4, v2, v3, v1, v7}, Ljp1/k;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v7, 0x20ad1fd0

    invoke-static {v7, v15, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0xc00000

    const/16 v17, 0x72

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v17}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v1

    move-object v1, v0

    goto :goto_b

    :cond_11
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v3, v6

    move-object v4, v8

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lsl0/k2;

    const/4 v7, 0x5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final p(Lqu1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lqu1/c$a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p4, v2

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_4

    int-to-float p4, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p4, v0

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    invoke-static {v3, v4, p4, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p4

    int-to-float v3, v2

    mul-float/2addr v3, v0

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v0, v3, p3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, p3, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p3, p4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, p3, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p3, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p3, v0, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, p1, p2, p3, v1}, Ltu1/f;->m(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, p2, p1, p3, v1}, Ltu1/f;->t(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ltu1/f;->o(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltu1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x44135ca4

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    const/16 v7, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v6, 0x180

    const/16 v8, 0x100

    if-nez v4, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v8

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    move v9, v0

    and-int/lit16 v0, v9, 0x93

    const/16 v4, 0x92

    const/4 v10, 0x1

    const/4 v12, 0x0

    if-eq v0, v4, :cond_6

    move v0, v10

    goto :goto_4

    :cond_6
    move v0, v12

    :goto_4
    and-int/lit8 v4, v9, 0x1

    invoke-virtual {v11, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v0, v13, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v0

    check-cast v4, Lp1/c1;

    invoke-virtual {v1}, Ltu1/g;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_5
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    instance-of v5, v0, Lj71/c;

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_c

    const v5, 0x5c4d70b5

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v1}, Ltu1/g;->getId()Ljava/lang/String;

    move-result-object v14

    const-string v15, "hours_of_sleep"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    xor-int/2addr v14, v10

    invoke-static {v5, v14}, Ltu1/f;->E(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v14, 0x3fd9999a    # 1.7f

    invoke-static {v5, v12, v14}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object v15, v0

    check-cast v15, Lj71/c;

    and-int/lit8 v0, v9, 0x70

    if-ne v0, v7, :cond_8

    move v0, v10

    goto :goto_6

    :cond_8
    move v0, v12

    :goto_6
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    and-int/lit16 v5, v9, 0x380

    if-ne v5, v8, :cond_9

    move v5, v10

    goto :goto_7

    :cond_9
    move v5, v12

    :goto_7
    or-int/2addr v0, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_b

    if-ne v5, v13, :cond_a

    goto :goto_8

    :cond_a
    move-object/from16 v18, v4

    goto :goto_9

    :cond_b
    :goto_8
    new-instance v0, Lry2/d;

    const/16 v5, 0x8

    move-object/from16 v22, v2

    move-object v2, v1

    move-object/from16 v1, v22

    invoke-direct/range {v0 .. v5}, Lry2/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v18, v2

    move-object v2, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v4

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v0, v15

    const/4 v15, 0x0

    const/16 v16, 0x3c

    move v4, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v20, v7

    move-object v7, v14

    move-object v14, v11

    const/4 v11, 0x0

    move/from16 v21, v12

    const/4 v12, 0x0

    move-object v8, v0

    move-object v0, v13

    move-object v13, v5

    move v5, v4

    move/from16 v4, v21

    invoke-static/range {v7 .. v16}, Lb61/k;->p(Landroidx/compose/ui/Modifier;Lj71/c;Lj71/c;Lj71/c;ZLb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    move-object v15, v0

    move/from16 v16, v5

    const/16 v14, 0x100

    const/16 v19, 0x1

    const/16 v20, 0x20

    goto/16 :goto_c

    :cond_c
    move-object/from16 v18, v4

    move v5, v9

    move v4, v12

    move-object v15, v13

    instance-of v7, v0, Lk71/n;

    if-eqz v7, :cond_11

    const v7, 0x5c64bb00

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    move-object v7, v0

    new-instance v0, Lk71/a;

    invoke-direct {v0}, Lk71/a;-><init>()V

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v14, v4, v9, v8}, Ltu1/f;->F(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    check-cast v7, Lk71/n;

    and-int/lit16 v10, v5, 0x380

    const/16 v14, 0x100

    if-ne v10, v14, :cond_d

    move v10, v9

    goto :goto_a

    :cond_d
    move v10, v4

    :goto_a
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    and-int/lit8 v12, v5, 0x70

    const/16 v13, 0x20

    if-ne v12, v13, :cond_e

    move v12, v9

    goto :goto_b

    :cond_e
    move v12, v4

    :goto_b
    or-int/2addr v10, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_f

    if-ne v12, v15, :cond_10

    :cond_f
    new-instance v12, Ls90/f;

    const/16 v10, 0xb

    invoke-direct {v12, v3, v1, v2, v10}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v12, Lkotlin/jvm/functions/Function1;

    sget v10, Lk71/a;->a:I

    shl-int/lit8 v10, v10, 0x9

    move/from16 v16, v5

    move-object v2, v7

    move-object v1, v8

    move/from16 v19, v9

    move v5, v10

    move-object v3, v12

    move v8, v4

    move-object v4, v11

    invoke-virtual/range {v0 .. v5}, Lk71/a;->c(Landroidx/compose/ui/Modifier;Lk71/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move v4, v8

    move/from16 v20, v13

    goto :goto_c

    :cond_11
    move-object v7, v0

    move v8, v4

    move/from16 v16, v5

    const/16 v13, 0x20

    const/16 v14, 0x100

    const/16 v19, 0x1

    const v0, 0x5c6a65d3

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    new-instance v9, Lqx0/a;

    const/16 v0, 0x10

    invoke-direct {v9, v0}, Lqx0/a;-><init>(I)V

    const/4 v12, 0x0

    move/from16 v20, v13

    const/16 v13, 0xa

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    :goto_c
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v12, v4

    move v8, v14

    move-object v13, v15

    move/from16 v9, v16

    move-object/from16 v4, v18

    move/from16 v10, v19

    move/from16 v7, v20

    goto/16 :goto_5

    :cond_12
    invoke-virtual {v11}, Lp1/q;->X()V

    :cond_13
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Ltu1/e;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v6

    invoke-direct/range {v0 .. v5}, Ltu1/e;-><init>(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final u(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final v(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 9

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Ld61/a;

    if-eqz v0, :cond_7

    check-cast p4, Ld61/a;

    invoke-interface {p4}, Ld61/a;->b()Ljava/util/Map;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-static {p4}, Lm83/s;->Q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcz0/s;

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcz0/s;->a()Ljava/util/List;

    move-result-object p4

    goto :goto_0

    :cond_0
    move-object p4, v0

    :goto_0
    invoke-static {p3}, Ltu1/f;->u(Lp1/c1;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    invoke-static {p3, v1}, Ltu1/f;->v(Lp1/c1;Z)V

    new-instance p3, Lqu1/c$h;

    invoke-virtual {p1}, Ltu1/g;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, v1}, Lqu1/c$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    if-nez p4, :cond_2

    invoke-static {p3, v2}, Ltu1/f;->v(Lp1/c1;Z)V

    :cond_2
    :goto_1
    new-instance v3, Lqu1/b$b;

    invoke-virtual {p1}, Ltu1/g;->getId()Ljava/lang/String;

    move-result-object v4

    if-eqz p4, :cond_3

    invoke-static {v2, p4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La71/a;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, La71/a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    move-object v5, p0

    goto :goto_2

    :cond_3
    move-object v5, v0

    :goto_2
    if-eqz p4, :cond_4

    invoke-static {v2, p4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La71/a;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, La71/a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    move-object v6, p0

    goto :goto_3

    :cond_4
    move-object v6, v0

    :goto_3
    if-eqz p4, :cond_5

    invoke-static {v2, p4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La71/a;

    if-eqz p0, :cond_5

    invoke-virtual {p0}, La71/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    move-object v7, p0

    goto :goto_4

    :cond_5
    move-object v7, v0

    :goto_4
    if-eqz p4, :cond_6

    invoke-static {v2, p4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La71/a;

    if-eqz p0, :cond_6

    invoke-virtual {p0}, La71/a;->f()Ly81/e;

    move-result-object v0

    :cond_6
    move-object v8, v0

    invoke-direct/range {v3 .. v8}, Lqu1/b$b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqu1/b$c;

    invoke-virtual {p1}, Ltu1/g;->getId()Ljava/lang/String;

    move-result-object p1

    check-cast p3, Lmc1/b;

    invoke-direct {v0, p1, p3}, Lqu1/b$c;-><init>(Ljava/lang/String;Lmc1/b;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lqu1/c$i;

    invoke-direct {p0, p3}, Lqu1/c$i;-><init>(Lmc1/b;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0xdedac17

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x1

    const/4 p2, 0x0

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0, p2}, Ltu1/f;->F(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final z(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ltu1/f;->t(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

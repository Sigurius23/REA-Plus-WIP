.class public abstract Lqq2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aE\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a1\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "text",
        "",
        "delayTimeMillis",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "updateText",
        "Lkotlin/Function0;",
        "onFinished",
        "l",
        "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lxq2/e;",
        "viewState",
        "Lb91/a;",
        "textStyle",
        "onAnimationComplete",
        "f",
        "(Lxq2/e;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "textToShow",
        "animatedText",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lqq2/b;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lqq2/b;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lqq2/b;->p(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqq2/b;->j(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxq2/e;Lb91/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqq2/b;->k(Lxq2/e;Lb91/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lxq2/e;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxq2/e;",
            "Lb91/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v4, p4

    const-string v2, "viewState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v2, 0x29a71b8c

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v4, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v4

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_5

    and-int/lit8 v3, p5, 0x2

    if-nez v3, :cond_4

    and-int/lit8 v3, v4, 0x40

    if-nez v3, :cond_3

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_3

    :cond_3
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_4

    :cond_4
    const/16 v3, 0x10

    :goto_4
    or-int/2addr v2, v3

    :cond_5
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v5, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v2, v6

    :goto_6
    and-int/lit16 v6, v2, 0x93

    const/16 v7, 0x92

    if-eq v6, v7, :cond_9

    const/4 v6, 0x1

    goto :goto_7

    :cond_9
    const/4 v6, 0x0

    :goto_7
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v6, v4, 0x1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_c

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_b

    and-int/lit8 v2, v2, -0x71

    :cond_b
    move-object/from16 v25, v0

    move-object v3, v5

    goto :goto_9

    :cond_c
    :goto_8
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_d

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v10, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->P()Lb91/a;

    move-result-object v0

    and-int/lit8 v2, v2, -0x71

    :cond_d
    if-eqz v3, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_e

    new-instance v3, Lqo1/b;

    const/16 v5, 0x10

    invoke-direct {v3, v5}, Lqo1/b;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lc93/a;

    move-object/from16 v25, v0

    :goto_9
    invoke-virtual {v10}, Lp1/q;->r()V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_f

    const-string v0, ""

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v0, Lp1/c1;

    sget-object v5, Lb2/t;->w:Lb2/t;

    const-string v6, "animText"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0}, Lqq2/b;->h(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    new-instance v11, Lw3/k;

    const/4 v12, 0x5

    invoke-direct {v11, v12}, Lw3/k;-><init>(I)V

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v12, v12, 0x12

    shl-int/lit8 v13, v2, 0xf

    const/high16 v14, 0x380000

    and-int/2addr v13, v14

    or-int v29, v12, v13

    const v30, 0x2fdf8

    move-object v12, v7

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v20, v18

    const-wide/16 v18, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v31, v28

    const/16 v28, 0x30

    move-object/from16 v1, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lxq2/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_10

    new-instance v6, Lq12/c;

    const/4 v1, 0x3

    invoke-direct {v6, v1, v0}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v2, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v11, v0, 0x1b0

    const/4 v12, 0x0

    const-wide/16 v6, 0x19

    move-object v9, v3

    invoke-static/range {v5 .. v12}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v2, v25

    goto :goto_a

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v0

    move-object v3, v5

    :goto_a
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lqb0/a;

    const/16 v6, 0x8

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final i(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lqq2/b;->i(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lxq2/e;Lb91/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqq2/b;->f(Lxq2/e;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v0, p6

    const-string v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "updateText"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v2, 0x6456ef7b

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v3, p7, 0x2

    const/16 v5, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-wide/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_2

    move-wide/from16 v6, p1

    invoke-virtual {v10, v6, v7}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit16 v8, v0, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :cond_6
    and-int/lit8 v8, p7, 0x8

    const/16 v11, 0x800

    if-eqz v8, :cond_8

    or-int/lit16 v2, v2, 0xc00

    :cond_7
    move-object/from16 v12, p4

    goto :goto_6

    :cond_8
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_7

    move-object/from16 v12, p4

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    move v13, v11

    goto :goto_5

    :cond_9
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v2, v13

    :goto_6
    and-int/lit16 v13, v2, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    const/16 v16, 0x1

    if-eq v13, v14, :cond_a

    move/from16 v13, v16

    goto :goto_7

    :cond_a
    move v13, v15

    :goto_7
    and-int/lit8 v14, v2, 0x1

    invoke-virtual {v10, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_16

    if-eqz v3, :cond_b

    const-wide/16 v6, 0x32

    :cond_b
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_c

    new-instance v8, Lqo1/b;

    const/16 v12, 0x11

    invoke-direct {v8, v12}, Lqo1/b;-><init>(I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lc93/a;

    move-object v4, v8

    goto :goto_8

    :cond_d
    move-object v4, v12

    :goto_8
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_e

    const-string v8, ""

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_10

    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    move v13, v15

    :goto_9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v13, v14, :cond_f

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    invoke-static {v14}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_f
    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v12, Ljava/util/List;

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit16 v14, v2, 0x380

    if-ne v14, v9, :cond_11

    move/from16 v9, v16

    goto :goto_a

    :cond_11
    move v9, v15

    :goto_a
    or-int/2addr v9, v13

    and-int/lit8 v13, v2, 0x70

    if-ne v13, v5, :cond_12

    move/from16 v5, v16

    goto :goto_b

    :cond_12
    move v5, v15

    :goto_b
    or-int/2addr v5, v9

    and-int/lit16 v2, v2, 0x1c00

    if-ne v2, v11, :cond_13

    move/from16 v15, v16

    :cond_13
    or-int v2, v5, v15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_14

    if-ne v5, v3, :cond_15

    :cond_14
    new-instance v2, Lqq2/b$a;

    const/4 v9, 0x0

    move-object/from16 v5, p3

    move-object v3, v12

    invoke-direct/range {v2 .. v9}, Lqq2/b$a;-><init>(Ljava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;JLp1/c1;Lq83/d;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v2

    :cond_15
    check-cast v5, Lc93/m;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v10, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v5, v4

    :goto_c
    move-wide v2, v6

    goto :goto_d

    :cond_16
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v5, v12

    goto :goto_c

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lcw2/c;

    const/4 v8, 0x3

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcw2/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final o(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic q(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lqq2/b;->n(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lqq2/b;->o(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

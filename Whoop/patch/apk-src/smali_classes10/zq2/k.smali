.class public abstract Lzq2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014\u00b2\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lzq2/f;",
        "viewState",
        "",
        "isCurrentStep",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "j",
        "(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lzq2/a;",
        "userSelectedAnswer",
        "isQuestionAnimationFinished",
        "isResponseAnimationFinished",
        "",
        "animatedWhoopCoachQuestionText",
        "animatedWhoopCoachResponseText",
        "animatedWhoopCoachAnswerText",
        "Ly3/l;",
        "screenSize",
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
.method private static final A(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzq2/k;->G(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzq2/k;->q(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lzq2/k;->j(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;)Z
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

.method private static final E(Lp1/c1;Z)V
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

.method private static final F(Lp1/c1;)Z
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

.method private static final G(Lp1/c1;Z)V
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

.method public static final synthetic H(Lp1/c1;)J
    .locals 2

    invoke-static {p0}, Lzq2/k;->u(Lp1/c1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzq2/k;->C(Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/k;->t(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/k;->w(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/k;->z(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/k;->B(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/k;->A(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/k;->x(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/k;->r(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;Lzq2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzq2/k;->y(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;Lzq2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq2/f;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x232a10a9

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

    invoke-virtual {v10, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_6

    move v5, v7

    goto :goto_4

    :cond_6
    move v5, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v10, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_28

    if-eqz v2, :cond_27

    const v5, -0x1c23d793

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v5, v9, :cond_7

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v9, :cond_8

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v11, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_9

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v12, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const-string v16, ""

    if-ne v13, v9, :cond_a

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v13, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v9, :cond_b

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v15

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v15, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v9, :cond_c

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v14, Lp1/c1;

    move-object/from16 v16, v12

    invoke-static {v8, v10, v7}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v12

    invoke-virtual {v12}, Lf0/r1;->d()Z

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v19, :cond_d

    if-ne v8, v9, :cond_e

    :cond_d
    new-instance v8, Lzq2/k$a;

    invoke-direct {v8, v12, v6}, Lzq2/k$a;-><init>(Lf0/r1;Lq83/d;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc93/m;

    invoke-static {v10, v8, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lzq2/f;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v19, v5

    move-object v5, v6

    move v8, v7

    invoke-virtual {v1}, Lzq2/f;->j()J

    move-result-wide v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_f

    new-instance v2, Lzc1/e8;

    const/16 v4, 0x11

    invoke-direct {v2, v4, v13}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_10

    new-instance v4, Lzc1/l6;

    move-object/from16 v22, v2

    const/16 v2, 0x12

    invoke-direct {v4, v2, v11}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_5

    :cond_10
    move-object/from16 v22, v2

    :goto_5
    check-cast v4, Lc93/a;

    move-object v2, v11

    const/16 v11, 0xd80

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v20, v14

    move-object/from16 v31, v16

    move-object/from16 v16, v2

    move-object v14, v9

    move-object/from16 v2, v23

    move-object v9, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v13

    move v13, v8

    move-object/from16 v8, v22

    invoke-static/range {v5 .. v12}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_11

    new-instance v5, Ly3/l;

    const-wide/16 v6, 0x0

    invoke-direct {v5, v6, v7}, Ly3/l;-><init>(J)V

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lp1/c1;

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v32

    const/16 v41, 0x1

    const v42, 0x6ffff

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-static/range {v32 .. v42}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_12

    new-instance v8, Lzm1/d;

    const/4 v9, 0x5

    invoke-direct {v8, v9}, Lzm1/d;-><init>(I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v8}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_13

    new-instance v8, Lzc1/e8;

    const/16 v9, 0x12

    invoke-direct {v8, v9, v5}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v8}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v8, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move-object v12, v7

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v23, v15

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_14

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move/from16 v24, v13

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v25, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_7

    :cond_15
    move-object/from16 v25, v4

    :goto_7
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v6, 0x2

    int-to-float v13, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v13, v6

    move/from16 v26, v6

    const/4 v6, 0x0

    const/4 v1, 0x2

    invoke-static {v12, v13, v6, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit16 v0, v0, 0x380

    const/16 v12, 0x100

    if-ne v0, v12, :cond_17

    const/4 v12, 0x1

    goto :goto_8

    :cond_17
    const/4 v12, 0x0

    :goto_8
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v12, :cond_18

    if-ne v6, v14, :cond_19

    :cond_18
    new-instance v6, Lzq2/k$b;

    invoke-direct {v6, v3, v5}, Lzq2/k$b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v5, v6}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v5, 0xc

    invoke-static {v1, v2, v5}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x0

    invoke-static {v2, v5, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_1a

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v10, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_1b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    :cond_1b
    invoke-static {v5, v10, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v10, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Ll0/z;->a:Ll0/z;

    const/4 v1, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v5, v11, v1, v6}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide v6, 0x4044400000000000L    # 40.5

    double-to-float v4, v6

    mul-float v4, v4, v26

    const/4 v6, 0x0

    invoke-static {v2, v6, v4, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v19 .. v19}, Lzq2/k;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v1, v10, v6}, Lzq2/n;->b(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v16 .. v16}, Lzq2/k;->D(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_26

    const v1, -0x3d53e737

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-static/range {v25 .. v25}, Lzq2/k;->k(Lp1/c1;)Lzq2/a;

    move-result-object v1

    if-nez v1, :cond_20

    const v1, -0x3d545091

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->e()Ljava/util/List;

    move-result-object v1

    const/16 v12, 0x100

    if-ne v0, v12, :cond_1d

    const/4 v7, 0x1

    :goto_a
    move-object/from16 v0, p0

    goto :goto_b

    :cond_1d
    const/4 v7, 0x0

    goto :goto_a

    :goto_b
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1e

    if-ne v4, v14, :cond_1f

    :cond_1e
    new-instance v4, Lzq2/h;

    const/4 v2, 0x1

    move-object/from16 v15, v25

    invoke-direct {v4, v3, v0, v15, v2}, Lzq2/h;-><init>(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-static {v1, v4, v10, v6}, Lzq2/d;->d(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    move v0, v6

    goto/16 :goto_12

    :cond_20
    move-object/from16 v0, p0

    move-object/from16 v15, v25

    const v1, -0x3d4bb6f6

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v1, v1, v26

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lzq2/f;->f()Lkd1/o;

    move-result-object v6

    invoke-virtual {v0}, Lzq2/f;->g()Ler2/g;

    move-result-object v7

    invoke-static {v15}, Lzq2/k;->k(Lp1/c1;)Lzq2/a;

    move-result-object v8

    sget v2, Lkd1/o;->a:I

    shl-int/lit8 v2, v2, 0x3

    const/4 v4, 0x6

    or-int/2addr v4, v2

    shl-int/lit8 v9, v24, 0x9

    or-int/2addr v4, v9

    move-object v9, v10

    move v10, v4

    invoke-static/range {v5 .. v10}, Lzq2/m;->b(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;Landroidx/compose/runtime/Composer;I)V

    move-object v10, v9

    invoke-static {v15}, Lzq2/k;->k(Lp1/c1;)Lzq2/a;

    move-result-object v4

    if-eqz v4, :cond_21

    invoke-virtual {v4}, Lzq2/a;->b()Z

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_21

    invoke-virtual {v0}, Lzq2/f;->l()Lzq2/p;

    move-result-object v4

    invoke-virtual {v4}, Lzq2/p;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :goto_c
    move/from16 v5, v24

    goto :goto_d

    :cond_21
    invoke-virtual {v0}, Lzq2/f;->m()Lzq2/p;

    move-result-object v4

    invoke-virtual {v4}, Lzq2/p;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_c

    :goto_d
    invoke-static {v4, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lzq2/f;->j()J

    move-result-wide v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_22

    new-instance v8, Lzc1/e8;

    const/16 v9, 0x13

    move-object/from16 v12, v23

    invoke-direct {v8, v9, v12}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_e

    :cond_22
    move-object/from16 v12, v23

    :goto_e
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v14, :cond_23

    new-instance v9, Lzc1/l6;

    const/16 v0, 0x13

    move-object/from16 v22, v11

    move-object/from16 v11, v31

    invoke-direct {v9, v0, v11}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_f

    :cond_23
    move-object/from16 v22, v11

    move-object/from16 v11, v31

    :goto_f
    check-cast v9, Lc93/a;

    move-object/from16 v31, v11

    const/16 v11, 0xd80

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move v0, v5

    move-object v5, v4

    invoke-static/range {v5 .. v12}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15}, Lzq2/k;->k(Lp1/c1;)Lzq2/a;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->h()Lkd1/o;

    move-result-object v6

    invoke-static/range {v23 .. v23}, Lzq2/k;->n(Lp1/c1;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->l()Lzq2/p;

    move-result-object v4

    invoke-virtual {v4}, Lzq2/p;->b()Ly81/e;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->m()Lzq2/p;

    move-result-object v4

    invoke-virtual {v4}, Lzq2/p;->b()Ly81/e;

    move-result-object v9

    move-object v11, v10

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->i()Lv41/r0;

    move-result-object v10

    or-int v12, v0, v2

    invoke-static/range {v5 .. v12}, Lzq2/o;->d(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    move-object v10, v11

    invoke-static/range {v31 .. v31}, Lzq2/k;->F(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_25

    const v2, -0x3d33b9ef

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lzq2/f;->j()J

    move-result-wide v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_24

    new-instance v0, Lzc1/e8;

    const/16 v2, 0x14

    move-object/from16 v14, v20

    invoke-direct {v0, v2, v14}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :cond_24
    move-object/from16 v14, v20

    :goto_10
    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v11, 0x180

    const/16 v12, 0x8

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_25
    move-object/from16 v14, v20

    const/4 v6, 0x0

    const v0, -0x3d2e50be

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    :goto_11
    const-wide/high16 v4, 0x401a000000000000L    # 6.5

    double-to-float v0, v4

    mul-float v25, v0, v26

    const/16 v26, 0x0

    const/16 v27, 0x8

    move/from16 v23, v1

    move/from16 v24, v13

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "Quiz whoop coach answer text"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14}, Lzq2/k;->p(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->P()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v7

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v29, v1, 0x12

    const v30, 0x2fff8

    move-object v11, v10

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v28, 0x30

    move/from16 v43, v6

    move-object v6, v0

    move/from16 v0, v43

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v1, 0x1

    goto :goto_14

    :cond_26
    const/4 v0, 0x0

    const v1, -0x3d267d5e

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-static {v10, v1, v1, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_15

    :cond_27
    move v0, v8

    const v1, -0x1bcb2f75

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_28
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_29

    new-instance v0, Lzq2/g;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lzq2/g;-><init>(Lzq2/f;ZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final k(Lp1/c1;)Lzq2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lzq2/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzq2/a;

    return-object p0
.end method

.method private static final l(Lp1/c1;)Ljava/lang/String;
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

.method private static final m(Lp1/c1;Ljava/lang/String;)V
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

.method private static final p(Lp1/c1;)Ljava/lang/String;
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

.method private static final q(Lp1/c1;Ljava/lang/String;)V
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

.method private static final r(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzq2/k;->m(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;Lzq2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lzq2/a;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzq2/k;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    iget-wide v0, p0, Ly3/l;->a:J

    return-wide v0
.end method

.method private static final v(Lp1/c1;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    new-instance v0, Ly3/l;

    invoke-direct {v0, p1, p2}, Ly3/l;-><init>(J)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lk2/c;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v2, Li2/x;->m:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v3, Li2/x;->b:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v5

    const/4 v12, 0x6

    const/16 v13, 0x3e

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v13}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 2

    iget-wide v0, p1, Ly3/l;->a:J

    invoke-static {p0, v0, v1}, Lzq2/k;->v(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;Lzq2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lzq2/k;->s(Lp1/c1;Lzq2/a;)V

    new-instance p2, Lrq2/t0$d;

    invoke-virtual {p3}, Lzq2/a;->b()Z

    move-result p3

    invoke-virtual {p1}, Lzq2/f;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lrq2/t0$d;-><init>(ZLjava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzq2/k;->o(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

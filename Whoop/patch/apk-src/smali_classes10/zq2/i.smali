.class public abstract Lzq2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\r\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019\u00b2\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"
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
        "k",
        "(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lh2/b;",
        "",
        "screenWidth",
        "K",
        "(JI)Z",
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;Lzq2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lzq2/i;->u(Lp1/c1;Lzq2/a;)V

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

.method private static final B(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzq2/i;->q(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzq2/i;->H(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzq2/i;->s(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/c1;)Z
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

.method private static final F(Lp1/c1;Z)V
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

.method private static final G(Lp1/c1;)Z
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

.method private static final H(Lp1/c1;Z)V
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

.method private static final I(Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lzq2/i;->k(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic J(Lp1/c1;)J
    .locals 2

    invoke-static {p0}, Lzq2/i;->w(Lp1/c1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final K(JI)Z
    .locals 4

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    float-to-double p0, p0

    const-wide v0, 0x3fd3333333333333L    # 0.3

    int-to-double v2, p2

    mul-double/2addr v2, v0

    cmpg-double p0, p0, v2

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Lzq2/f;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzq2/i;->l(Lzq2/f;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/i;->t(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/i;->D(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;Lzq2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzq2/i;->A(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;Lzq2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/i;->B(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/i;->v(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/i;->y(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzq2/i;->I(Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq2/i;->C(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq2/i;->z(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 6
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

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x49a22f29

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-eq v1, v2, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Lzq2/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p2, v2}, Lzq2/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    const v2, -0x69e63373

    invoke-static {v2, p3, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p3, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_7
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_8

    new-instance v0, Lzq2/g;

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lzq2/g;-><init>(Lzq2/f;ZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final l(Lzq2/f;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$BasicAnimationComponent"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v2, v11, :cond_0

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v2, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_1

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v12, v4

    check-cast v12, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_2

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v13, v4

    check-cast v13, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    const-string v5, ""

    if-ne v4, v11, :cond_3

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v14, v4

    check-cast v14, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_4

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v15, v4

    check-cast v15, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_5

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lp1/c1;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v5, v8, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    invoke-virtual {v7}, Lf0/r1;->d()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_6

    if-ne v5, v11, :cond_7

    :cond_6
    new-instance v5, Lzq2/i$a;

    invoke-direct {v5, v7, v3}, Lzq2/i$a;-><init>(Lf0/r1;Lq83/d;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lc93/m;

    invoke-static {v8, v5, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lzq2/f;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object v9, v4

    move v10, v5

    invoke-virtual {v0}, Lzq2/f;->j()J

    move-result-wide v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_8

    new-instance v6, Lzc1/e8;

    move-object/from16 p4, v3

    const/16 v3, 0xd

    invoke-direct {v6, v3, v14}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_8
    move-object/from16 p4, v3

    :goto_0
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_9

    new-instance v3, Lzc1/l6;

    move-wide/from16 v16, v4

    const/16 v4, 0x10

    invoke-direct {v3, v4, v12}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_9
    move-wide/from16 v16, v4

    :goto_1
    check-cast v3, Lc93/a;

    move-object v4, v9

    const/16 v9, 0xd80

    move v5, v10

    const/4 v10, 0x0

    move-object/from16 v18, v12

    move-object/from16 p3, v13

    move-object/from16 p2, v14

    const/4 v13, 0x0

    move v12, v5

    move-object v14, v7

    move-object v7, v3

    move-object/from16 v3, p4

    move-wide/from16 v30, v16

    move-object/from16 v16, v4

    move-wide/from16 v4, v30

    invoke-static/range {v3 .. v10}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_a

    new-instance v3, Ly3/l;

    const-wide/16 v4, 0x0

    invoke-direct {v3, v4, v5}, Ly3/l;-><init>(J)V

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lp1/c1;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v28, 0x1

    const v29, 0x6ffff

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v19 .. v29}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_b

    new-instance v6, Lzm1/d;

    const/4 v7, 0x4

    invoke-direct {v6, v7}, Lzm1/d;-><init>(I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_c

    new-instance v6, Lzc1/e8;

    const/16 v7, 0xe

    invoke-direct {v6, v7, v3}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    move-object v7, v14

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_d

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_d
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_2
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 v19, v7

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v20, v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    goto :goto_3

    :cond_e
    move-object/from16 v20, v15

    :goto_3
    invoke-static {v10, v8, v10, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v8, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v5, 0x2

    int-to-float v15, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v15, v5

    move/from16 v22, v5

    const/4 v5, 0x0

    move/from16 v23, v12

    const/4 v12, 0x2

    invoke-static {v10, v15, v5, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v12, :cond_10

    if-ne v5, v11, :cond_11

    :cond_10
    new-instance v5, Lzq2/i$b;

    invoke-direct {v5, v1, v3}, Lzq2/i$b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    invoke-static {v10, v12, v5}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v5, 0xc

    move-object/from16 v10, v19

    invoke-static {v3, v10, v5}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    move-object/from16 v26, v12

    const/4 v12, 0x0

    invoke-static {v5, v10, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object v12, v11

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    move-object/from16 v19, v12

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_12

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_12
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v8, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    :cond_13
    invoke-static {v10, v8, v10, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v8, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/z;->a:Ll0/z;

    const/4 v4, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v3, v9, v4, v5}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide v6, 0x4044400000000000L    # 40.5

    double-to-float v6, v6

    mul-float v6, v6, v22

    const/4 v7, 0x0

    invoke-static {v5, v7, v6, v4}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {p2 .. p2}, Lzq2/i;->n(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x0

    invoke-static {v4, v8, v12}, Lzq2/n;->b(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v18 .. v18}, Lzq2/i;->E(Lp1/c1;)Z

    move-result v4

    if-eqz v4, :cond_1e

    const v4, 0x61004ec0

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-static {v2}, Lzq2/i;->m(Lp1/c1;)Lzq2/a;

    move-result-object v4

    if-nez v4, :cond_17

    const v3, 0x60ffe566

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lzq2/f;->e()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_15

    move-object/from16 v12, v19

    if-ne v5, v12, :cond_16

    :cond_15
    new-instance v5, Lzq2/h;

    const/4 v4, 0x0

    invoke-direct {v5, v1, v0, v2, v4}, Lzq2/h;-><init>(Lkotlin/jvm/functions/Function1;Lzq2/f;Lp1/c1;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    invoke-static {v3, v5, v8, v12}, Lzq2/d;->d(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move v0, v12

    move-object/from16 v2, v26

    const/4 v1, 0x1

    goto/16 :goto_b

    :cond_17
    move-object/from16 v12, v19

    const v1, 0x61087f01

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v1, v1, v22

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v8, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lzq2/f;->f()Lkd1/o;

    move-result-object v4

    invoke-virtual {v0}, Lzq2/f;->g()Ler2/g;

    move-result-object v5

    invoke-static {v2}, Lzq2/i;->m(Lp1/c1;)Lzq2/a;

    move-result-object v6

    sget v7, Lkd1/o;->a:I

    shl-int/lit8 v11, v7, 0x3

    const/4 v7, 0x6

    or-int/2addr v7, v11

    shl-int/lit8 v10, v23, 0x9

    or-int/2addr v7, v10

    move-object/from16 v30, v8

    move v8, v7

    move-object/from16 v7, v30

    invoke-static/range {v3 .. v8}, Lzq2/m;->b(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v7

    invoke-static {v2}, Lzq2/i;->m(Lp1/c1;)Lzq2/a;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-virtual {v3}, Lzq2/a;->b()Z

    move-result v3

    const/4 v13, 0x1

    if-ne v3, v13, :cond_19

    invoke-virtual {v0}, Lzq2/f;->l()Lzq2/p;

    move-result-object v3

    invoke-virtual {v3}, Lzq2/p;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :goto_5
    move/from16 v14, v23

    goto :goto_6

    :cond_18
    const/4 v13, 0x1

    :cond_19
    invoke-virtual {v0}, Lzq2/f;->m()Lzq2/p;

    move-result-object v3

    invoke-virtual {v3}, Lzq2/p;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_5

    :goto_6
    invoke-static {v3, v8, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lzq2/f;->j()J

    move-result-wide v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_1a

    new-instance v6, Lzc1/e8;

    const/16 v7, 0xf

    move-object/from16 v10, v20

    invoke-direct {v6, v7, v10}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_7

    :cond_1a
    move-object/from16 v10, v20

    :goto_7
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v12, :cond_1b

    new-instance v7, Lzc1/l6;

    const/16 v13, 0x11

    move-object/from16 v19, v9

    move-object/from16 v9, p3

    invoke-direct {v7, v13, v9}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_8

    :cond_1b
    move-object/from16 v19, v9

    move-object/from16 v9, p3

    :goto_8
    check-cast v7, Lc93/a;

    move-object v13, v9

    const/16 v9, 0xd80

    move-object/from16 v20, v10

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v2}, Lzq2/i;->m(Lp1/c1;)Lzq2/a;

    move-result-object v3

    invoke-virtual {v0}, Lzq2/f;->h()Lkd1/o;

    move-result-object v4

    invoke-static/range {v20 .. v20}, Lzq2/i;->p(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lzq2/f;->l()Lzq2/p;

    move-result-object v2

    invoke-virtual {v2}, Lzq2/p;->b()Ly81/e;

    move-result-object v6

    invoke-virtual {v0}, Lzq2/f;->m()Lzq2/p;

    move-result-object v2

    invoke-virtual {v2}, Lzq2/p;->b()Ly81/e;

    move-result-object v7

    move-object v9, v8

    invoke-virtual {v0}, Lzq2/f;->i()Lv41/r0;

    move-result-object v8

    or-int v10, v14, v11

    invoke-static/range {v3 .. v10}, Lzq2/o;->d(Lzq2/a;Lkd1/o;Ljava/lang/String;Ly81/e;Ly81/e;Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v9

    invoke-static {v13}, Lzq2/i;->G(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const v2, 0x61207c08

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lzq2/f;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v8, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lzq2/f;->j()J

    move-result-wide v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1c

    new-instance v0, Lzc1/e8;

    const/16 v2, 0x10

    move-object/from16 v11, v16

    invoke-direct {v0, v2, v11}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_9

    :cond_1c
    move-object/from16 v11, v16

    :goto_9
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/16 v10, 0x8

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_1d
    move-object/from16 v11, v16

    const/4 v12, 0x0

    const v0, 0x6125e539

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_a
    const-wide/high16 v2, 0x401a000000000000L    # 6.5

    double-to-float v0, v2

    mul-float v22, v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x8

    move/from16 v20, v1

    move/from16 v21, v15

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "Quiz whoop coach answer text"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v11}, Lzq2/i;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->P()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v5

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v27, v0, 0x12

    const v28, 0x2fff8

    move-object v9, v8

    const-wide/16 v7, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v0, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v1, 0x1

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v2, v26

    const/16 v26, 0x30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_1e
    move-object/from16 v2, v26

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v3, 0x612db899

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-object v2
.end method

.method private static final m(Lp1/c1;)Lzq2/a;
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

.method private static final r(Lp1/c1;)Ljava/lang/String;
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

.method private static final s(Lp1/c1;Ljava/lang/String;)V
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

.method private static final t(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzq2/i;->o(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;Lzq2/a;)V
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

.method private static final v(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzq2/i;->F(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp1/c1;)J
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

.method private static final x(Lp1/c1;J)V
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

.method private static final y(Lk2/c;)Ll83/a0;
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

.method private static final z(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 2

    iget-wide v0, p1, Ly3/l;->a:J

    invoke-static {p0, v0, v1}, Lzq2/i;->x(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

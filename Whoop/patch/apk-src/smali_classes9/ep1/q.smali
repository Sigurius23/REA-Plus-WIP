.class public abstract Lep1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001aW\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001aW\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\n\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcp1/n;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "Lbp1/b;",
        "onNavigationEvent",
        "",
        "initialShowWelcomeScreen",
        "isInitialScreen",
        "D",
        "(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V",
        "Lcp1/o;",
        "Lkotlin/Function0;",
        "showDueDateScreen",
        "M",
        "(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "Lcp1/m;",
        "showWelcomeScreen",
        "t",
        "(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selectedDateText",
        "hormonal-insights_release"
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
.method private static final A(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    const-string v0, "$this$Button"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static/range {p0 .. p0}, Lep1/q;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    new-instance v0, Lcp1/i$h;

    invoke-static {p1}, Lep1/q;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcp1/i$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lep1/q;->t(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final D(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/n;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "ZZ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x20a0baaf

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move/from16 v11, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p3

    invoke-virtual {v10, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_7

    :cond_b
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v0, v12

    :goto_8
    and-int/lit8 v12, p7, 0x10

    const/16 v13, 0x4000

    if-eqz v12, :cond_d

    or-int/lit16 v0, v0, 0x6000

    :cond_c
    move/from16 v14, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_c

    move/from16 v14, p4

    invoke-virtual {v10, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_e

    move v15, v13

    goto :goto_9

    :cond_e
    const/16 v15, 0x2000

    :goto_9
    or-int/2addr v0, v15

    :goto_a
    and-int/lit16 v15, v0, 0x2493

    const/16 v3, 0x2492

    const/4 v7, 0x1

    const/4 v14, 0x0

    if-eq v15, v3, :cond_f

    move v3, v7

    goto :goto_b

    :cond_f
    move v3, v14

    :goto_b
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v10, v15, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1f

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_10

    new-instance v2, Lep1/a;

    const/16 v4, 0xc

    invoke-direct {v2, v4}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move/from16 v16, v9

    move-object v9, v2

    move/from16 v2, v16

    goto :goto_c

    :cond_11
    move v2, v9

    move-object v9, v4

    :goto_c
    if-eqz v5, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_12

    new-instance v4, Lep1/a;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v8, v4

    :cond_13
    if-eqz v2, :cond_14

    move v2, v7

    goto :goto_d

    :cond_14
    move v2, v11

    :goto_d
    if-eqz v12, :cond_15

    move v11, v14

    goto :goto_e

    :cond_15
    move/from16 v11, p4

    :goto_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_16

    invoke-static {v2, v10}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v4

    :cond_16
    check-cast v4, Lp1/c1;

    const v5, 0xe000

    and-int/2addr v5, v0

    if-ne v5, v13, :cond_17

    move v12, v7

    goto :goto_f

    :cond_17
    move v12, v14

    :goto_f
    and-int/lit16 v13, v0, 0x380

    const/16 v15, 0x100

    if-ne v13, v15, :cond_18

    move v13, v7

    goto :goto_10

    :cond_18
    move v13, v14

    :goto_10
    or-int/2addr v12, v13

    and-int/lit8 v13, v0, 0x70

    const/16 v15, 0x20

    if-ne v13, v15, :cond_19

    move v13, v7

    goto :goto_11

    :cond_19
    move v13, v14

    :goto_11
    or-int/2addr v12, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_1a

    if-ne v13, v3, :cond_1b

    :cond_1a
    new-instance v13, Lep1/o;

    invoke-direct {v13, v11, v8, v9, v4}, Lep1/o;-><init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v13, Lc93/a;

    invoke-static {v13, v14, v10, v14, v7}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v4}, Lep1/q;->G(Lp1/c1;)Z

    move-result v7

    if-eqz v7, :cond_1d

    const v7, -0xfb8431e

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lcp1/n;->b()Lcp1/o;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_1c

    new-instance v12, Lb01/m;

    const/16 v3, 0x1b

    invoke-direct {v12, v3, v4}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v12, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v4, Lkd1/o;->a:I

    or-int/2addr v3, v4

    or-int/lit8 v3, v3, 0x30

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v4, v0, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v3

    or-int v13, v0, v5

    move v0, v14

    const/4 v14, 0x0

    move-object v5, v10

    move-object v10, v8

    move-object v8, v12

    move-object v12, v5

    move v5, v0

    invoke-static/range {v7 .. v14}, Lep1/q;->M(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    move-object v13, v10

    move v14, v11

    move-object v10, v12

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1d
    move-object v13, v8

    move v5, v14

    move v14, v11

    const v7, -0xfb39ab5

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lcp1/n;->a()Lcp1/m;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_1e

    new-instance v8, Lb01/m;

    const/16 v3, 0x1c

    invoke-direct {v8, v3, v4}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v8, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit8 v3, v3, 0x30

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v11, v3, v0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lep1/q;->t(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_12
    move v4, v2

    move-object v2, v9

    move-object v3, v13

    move v5, v14

    goto :goto_13

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->X()V

    move/from16 v5, p4

    move-object v2, v4

    move-object v3, v8

    move v4, v11

    :goto_13
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lep1/p;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lep1/p;-><init>(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final E(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lbp1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

.method private static final I(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p3}, Lep1/q;->G(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    sget-object p0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lcp1/i$c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcp1/i$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    invoke-static {p3, p0}, Lep1/q;->H(Lp1/c1;Z)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lep1/q;->H(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lep1/q;->H(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lep1/q;->D(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final M(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/o;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showDueDateScreen"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x74a11df7

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move-object/from16 v8, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_b

    invoke-virtual {v10, v5}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_7

    :cond_a
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v0, v9

    :cond_b
    and-int/lit16 v9, v0, 0x2493

    const/16 v12, 0x2492

    const/4 v4, 0x0

    if-eq v9, v12, :cond_c

    const/4 v9, 0x1

    goto :goto_8

    :cond_c
    move v9, v4

    :goto_8
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_23

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_d

    new-instance v7, Lep1/a;

    const/16 v8, 0xd

    invoke-direct {v7, v8}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v8, v7

    :cond_e
    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v10, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    invoke-static {v13, v10, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/o;->a()Lkd1/o;

    move-result-object v6

    if-eqz v6, :cond_14

    const v6, 0x3ce4004e

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcp1/o;->a()Lkd1/o;

    move-result-object v7

    move-object v6, v11

    sget v11, Lkd1/o;->a:I

    move-object/from16 v21, v12

    const/4 v12, 0x3

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v34, v6

    move-object/from16 p3, v15

    move-object/from16 v2, v21

    move-object/from16 v6, v22

    move-object/from16 v13, v23

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v13, :cond_12

    new-instance v9, Lep1/a;

    const/16 v11, 0xe

    invoke-direct {v9, v11}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v13, :cond_13

    new-instance v9, Lep1/a;

    const/16 v11, 0xf

    invoke-direct {v9, v11}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v9}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v8, 0xe

    int-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v11, v9

    mul-float v25, v8, v11

    const/16 v26, 0x7

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move v11, v15

    const/16 v15, 0x6030

    const/16 v12, 0x20

    const/16 v16, 0x68

    move/from16 v17, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    move/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v3, p3

    move-object/from16 p3, v6

    move-object v5, v14

    move/from16 v6, v21

    move-object/from16 v37, v23

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    move-object/from16 p3, v8

    move-object/from16 v37, v9

    move-object/from16 v34, v11

    move-object v2, v12

    move-object v5, v14

    move-object v3, v15

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const v8, 0x3cf03885

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    :goto_a
    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->g:Ll0/h;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v8, v9, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_15

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v34

    invoke-static {v10, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_17

    :cond_16
    invoke-static {v11, v10, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v13, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v16

    sget v11, Luv0/c;->E:I

    invoke-static {v10, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v17

    const v30, 0xfff2

    const/16 v31, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v13 .. v31}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v7

    invoke-static {v2}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v12, 0xe000

    and-int/2addr v12, v0

    const/16 v14, 0x4000

    if-ne v12, v14, :cond_18

    const/4 v12, 0x1

    goto :goto_c

    :cond_18
    const/4 v12, 0x0

    :goto_c
    and-int/lit16 v14, v0, 0x1c00

    const/16 v15, 0x800

    if-ne v14, v15, :cond_19

    const/4 v14, 0x1

    goto :goto_d

    :cond_19
    const/4 v14, 0x0

    :goto_d
    or-int/2addr v12, v14

    and-int/lit16 v14, v0, 0x380

    const/16 v15, 0x100

    if-ne v14, v15, :cond_1a

    const/4 v14, 0x1

    goto :goto_e

    :cond_1a
    const/4 v14, 0x0

    :goto_e
    or-int/2addr v12, v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_1c

    move-object/from16 v12, v37

    if-ne v14, v12, :cond_1b

    goto :goto_f

    :cond_1b
    move-object/from16 v6, p2

    move-object/from16 v16, v11

    move-object/from16 v11, p3

    move-object/from16 p3, v9

    move/from16 v9, p4

    goto :goto_10

    :cond_1c
    move-object/from16 v12, v37

    :goto_f
    new-instance v14, Lep1/n;

    const/4 v15, 0x0

    move-object/from16 v6, p2

    move-object/from16 v16, v11

    move-object/from16 v11, p3

    move-object/from16 p3, v9

    move/from16 v9, p4

    invoke-direct {v14, v9, v11, v6, v15}, Lep1/n;-><init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v14, Lc93/a;

    sget v15, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v15, v15, 0x3

    move-object/from16 v29, v10

    move-object v10, v14

    move v14, v15

    const/16 v15, 0x34

    const/4 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v6, p3

    move/from16 v36, v0

    move-object v0, v8

    move-object v8, v13

    move-object/from16 v38, v16

    move-object/from16 v35, v22

    move-object/from16 v39, v23

    move-object/from16 v13, v29

    invoke-static/range {v7 .. v15}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    const/4 v7, 0x4

    int-to-float v7, v7

    const/16 v9, 0x8

    int-to-float v8, v9

    mul-float v9, v7, v8

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/4 v12, 0x0

    invoke-static {v11, v6, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_1d

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v10, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_1e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    :cond_1e
    invoke-static {v11, v10, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/o;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget v3, Lx81/d;->b:I

    move-object/from16 v4, v38

    invoke-virtual {v4, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v4, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->O()Lb91/a;

    move-result-object v27

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v31, v9, 0x12

    const v32, 0x2fffa

    move v9, v8

    const/4 v8, 0x0

    move/from16 v33, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move/from16 v29, v7

    move-object v7, v0

    move/from16 v0, v29

    move-object/from16 v29, v10

    move-wide/from16 v40, v5

    move v5, v9

    move-wide/from16 v9, v40

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    const/4 v6, 0x1

    int-to-float v7, v6

    mul-float/2addr v7, v5

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v10, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/o;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v4, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    move-wide v9, v8

    const/4 v8, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    const/16 v5, 0xb

    int-to-float v5, v5

    invoke-static {v5, v0, v2, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lcp1/o;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v11

    and-int/lit8 v0, v36, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_20

    move v4, v6

    goto :goto_12

    :cond_20
    move/from16 v4, v33

    :goto_12
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_22

    move-object/from16 v13, v39

    if-ne v0, v13, :cond_21

    goto :goto_13

    :cond_21
    move-object/from16 v2, p1

    goto :goto_14

    :cond_22
    :goto_13
    new-instance v0, Ld42/o;

    const/16 v1, 0x11

    move-object/from16 v2, p1

    invoke-direct {v0, v2, v1}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v15, v0

    check-cast v15, Lc93/a;

    const/16 v17, 0x36

    const/16 v18, 0x68

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-static {v10, v6, v6, v6}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v4, v35

    goto :goto_15

    :cond_23
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v8

    :goto_15
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_24

    new-instance v0, Lbf0/g;

    const/4 v8, 0x7

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final N(Lbp1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lk2/c;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->b:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v4, Li2/x;->m:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4}, [Ll83/k;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v0, v2, v1, v1, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

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

.method private static final Q(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lcp1/i$c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcp1/i$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lep1/q;->M(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/q;->B(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lep1/q;->x(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V

    return-void
.end method

.method public static synthetic c(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lep1/q;->S(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbp1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->F(Lbp1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lep1/q;->C(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->J(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p2, p0, p1}, Lep1/q;->Q(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->y(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->P(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->K(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lbp1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->N(Lbp1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->E(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep1/q;->A(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->O(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->R(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Landroid/app/DatePickerDialog;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->z(Landroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p3, p0, p1, p2}, Lep1/q;->I(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lep1/q;->L(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/q;->u(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 63
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/m;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showWelcomeScreen"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x72dadc80

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_8

    move v9, v12

    goto :goto_6

    :cond_8
    move v9, v11

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v15, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_25

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_9

    new-instance v3, Lep1/a;

    const/16 v8, 0x11

    invoke-direct {v3, v8}, Lep1/a;-><init>(I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v3, v8

    :goto_7
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v10, "yyyy-MM-dd"

    invoke-direct {v8, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v9, :cond_b

    invoke-virtual {v4}, Lcp1/m;->d()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v13, Lp1/c1;

    invoke-virtual {v4}, Lcp1/m;->b()Ll83/q;

    move-result-object v14

    iget-object v7, v14, Ll83/q;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v20

    iget-object v7, v14, Ll83/q;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v21

    iget-object v7, v14, Ll83/q;->y:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v22

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v15, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v17, v7

    check-cast v17, Landroid/content/Context;

    sget v18, Lxn1/d;->d:I

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v7, v14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_c

    if-ne v14, v9, :cond_d

    :cond_c
    new-instance v14, Ld42/e;

    invoke-direct {v14, v10, v8, v13, v12}, Ld42/e;-><init>(Ljava/util/Calendar;Ljava/lang/Object;Lp1/c1;I)V

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v19, v14

    check-cast v19, Landroid/app/DatePickerDialog$OnDateSetListener;

    new-instance v16, Landroid/app/DatePickerDialog;

    invoke-direct/range {v16 .. v22}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;III)V

    invoke-virtual/range {v16 .. v16}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v7

    invoke-virtual {v4}, Lcp1/m;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    move-object/from16 p2, v13

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v7, v12, v13}, Landroid/widget/DatePicker;->setMinDate(J)V

    invoke-virtual {v4}, Lcp1/m;->d()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v7, v12, v13}, Landroid/widget/DatePicker;->setMaxDate(J)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Lgb1/b0;->T(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v18, v12

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v15, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v15, v14, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v15, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-nez v6, :cond_f

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static {v11, v15, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->x:Lb2/m;

    move-object/from16 v21, v8

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v8, v10, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->d:Ll0/g;

    move-object/from16 v22, v8

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v1, 0x6

    invoke-static {v11, v8, v15, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    move-object/from16 v24, v8

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-eqz v1, :cond_11

    invoke-virtual {v15, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v15, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v7, v15, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v32, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v33

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v35

    sget v7, Luv0/c;->E:I

    invoke-static {v15, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v36

    const v49, 0xfff2

    const/16 v50, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v32 .. v50}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    invoke-static/range {v21 .. v21}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit8 v8, v0, 0x70

    const/16 v10, 0x20

    if-ne v8, v10, :cond_14

    const/4 v8, 0x1

    goto :goto_a

    :cond_14
    const/4 v8, 0x0

    :goto_a
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/16 v11, 0x12

    if-nez v8, :cond_15

    if-ne v10, v9, :cond_16

    :cond_15
    new-instance v10, Ld42/o;

    invoke-direct {v10, v5, v11}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v10, Lc93/a;

    sget v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v28, v15

    const/4 v15, 0x3

    shl-int/2addr v8, v15

    move-object/from16 v20, v14

    const/16 v14, 0x34

    move-object/from16 v26, v13

    move v13, v8

    const/4 v8, 0x0

    move-object/from16 v27, v9

    move-object v9, v10

    const/4 v10, 0x0

    move/from16 v29, v11

    const/4 v11, 0x0

    move-object/from16 v51, p2

    move/from16 v33, v0

    move-object/from16 p3, v1

    move-object/from16 v34, v7

    move-object v5, v12

    move-object/from16 v52, v16

    move-object/from16 v53, v18

    move-object/from16 v15, v20

    move-object/from16 v56, v22

    move-object/from16 v0, v24

    move-object/from16 v4, v26

    move-object/from16 v54, v27

    move-object/from16 v12, v28

    move-object/from16 v7, v32

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v32, v3

    move-object/from16 v3, v21

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->e:Ll0/h;

    const/4 v9, 0x6

    invoke-static {v7, v0, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_17

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_17
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v12, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_d

    :cond_18
    :goto_c
    move-object/from16 v0, v34

    goto :goto_e

    :cond_19
    :goto_d
    invoke-static {v7, v12, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/m;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget v9, Lx81/d;->b:I

    move-object/from16 v10, p3

    invoke-virtual {v10, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->O()Lb91/a;

    move-result-object v26

    invoke-virtual {v10, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v13

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v30, v11, 0x12

    const v31, 0x2fffa

    move v11, v7

    const/4 v7, 0x0

    move-object/from16 v16, v10

    move/from16 v17, v11

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move/from16 v18, v9

    move-wide/from16 v61, v13

    move v14, v8

    move-wide/from16 v8, v61

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    move-object/from16 v21, v16

    const-wide/16 v15, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    move-object/from16 v24, v20

    const-wide/16 v19, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move-object/from16 v37, v27

    const/16 v27, 0x0

    move/from16 v38, v29

    const/16 v29, 0x0

    move-object/from16 v57, v35

    move-object/from16 v1, v37

    move-object/from16 v35, v0

    move-object/from16 v37, v4

    move/from16 v4, v34

    move/from16 v0, v36

    move-object/from16 v36, v5

    move/from16 v5, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    const/4 v6, 0x1

    int-to-float v7, v6

    mul-float/2addr v7, v0

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/m;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v12, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v12, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    move v11, v7

    const/4 v7, 0x0

    move-wide v13, v9

    move v9, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move/from16 v55, v6

    move-object v6, v8

    move-wide/from16 v61, v13

    move v14, v9

    move-wide/from16 v8, v61

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v38, v27

    const/16 v27, 0x0

    move/from16 v39, v5

    move/from16 v5, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    invoke-static {v0, v0, v3, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->g:Ll0/h;

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x36

    invoke-static {v7, v8, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_1a

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v10, v57

    goto :goto_10

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v12, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v37

    invoke-static {v12, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_1b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    move-object/from16 v9, v36

    goto :goto_12

    :cond_1c
    move-object/from16 v9, v36

    :goto_11
    move-object/from16 v8, v35

    goto :goto_13

    :goto_12
    invoke-static {v8, v12, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lxn1/c;->c:I

    invoke-static {v12, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v1, v12, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->r()Lb91/a;

    move-result-object v26

    const/16 v29, 0x0

    const v31, 0x2fffa

    move-object/from16 v37, v7

    const/4 v7, 0x0

    move-object/from16 v20, v10

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v35, v8

    move-object/from16 v36, v9

    move-wide v8, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v57, v20

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 p2, v0

    move-object/from16 v60, v35

    move-object/from16 v59, v36

    move-object/from16 v58, v37

    move-object/from16 v0, v57

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v1, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v6

    const/4 v15, 0x0

    const/16 v16, 0xe

    const-wide/16 v8, 0x0

    const-wide/16 v12, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v6 .. v16}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    move-object v15, v14

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v3, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v8, 0x400c000000000000L    # 3.5

    double-to-float v8, v8

    mul-float v8, v8, p2

    new-instance v13, Ll0/l1;

    invoke-direct {v13, v8, v5, v8, v5}, Ll0/l1;-><init>(FFFF)V

    move-object/from16 v5, v52

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1e

    move-object/from16 v8, v54

    if-ne v9, v8, :cond_1d

    goto :goto_14

    :cond_1d
    const/4 v10, 0x1

    goto :goto_15

    :cond_1e
    move-object/from16 v8, v54

    :goto_14
    new-instance v9, Ld42/i;

    const/4 v10, 0x1

    invoke-direct {v9, v5, v10}, Ld42/i;-><init>(Landroid/app/DatePickerDialog;I)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    check-cast v9, Lc93/a;

    new-instance v5, Lea2/g;

    move-object/from16 v11, v51

    const/4 v14, 0x3

    invoke-direct {v5, v14, v11}, Lea2/g;-><init>(ILp1/c1;)V

    const v14, -0x67d952ba

    invoke-static {v14, v15, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const v16, 0x36006000

    const/16 v17, 0x6c

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move v5, v7

    move-object v7, v6

    move-object v6, v9

    const/4 v9, 0x0

    move/from16 v55, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v18, v5

    move/from16 v5, v55

    invoke-static/range {v6 .. v17}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    mul-float v7, v18, p2

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->H:Lb2/m;

    move-object/from16 v8, v56

    invoke-virtual {v8, v6, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v53

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1f

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_1f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v12, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v58

    invoke-static {v12, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_20

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    :cond_20
    move-object/from16 v0, v59

    goto :goto_18

    :cond_21
    :goto_17
    move-object/from16 v0, v60

    goto :goto_19

    :goto_18
    invoke-static {v9, v12, v9, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lcp1/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v11, v39

    invoke-static {v0, v12, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->i0()J

    move-result-wide v10

    move/from16 v1, v33

    and-int/lit16 v1, v1, 0x380

    const/16 v2, 0x100

    if-ne v1, v2, :cond_22

    move v8, v5

    :cond_22
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v8, :cond_24

    move-object/from16 v8, v27

    if-ne v1, v8, :cond_23

    goto :goto_1a

    :cond_23
    move-object/from16 v3, v32

    goto :goto_1b

    :cond_24
    :goto_1a
    new-instance v1, Lbs1/i;

    const/16 v2, 0xc

    move-object/from16 v3, v32

    move-object/from16 v13, v51

    invoke-direct {v1, v3, v13, v2}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    move-object v14, v1

    check-cast v14, Lc93/a;

    const/16 v16, 0x36

    const/16 v17, 0x68

    const/4 v9, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v0

    move-object/from16 v15, v28

    invoke-static/range {v6 .. v17}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move-object v6, v3

    goto :goto_1c

    :cond_25
    move-object v12, v15

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v6, v8

    :goto_1c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Le11/b;

    const/16 v3, 0x11

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final u(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;)Ljava/lang/String;
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

.method private static final w(Lp1/c1;Ljava/lang/String;)V
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

.method private static final x(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p5, p6}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p2, p0}, Lep1/q;->w(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method private static final y(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroid/app/DatePickerDialog;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

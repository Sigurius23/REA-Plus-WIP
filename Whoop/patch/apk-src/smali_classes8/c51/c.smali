.class public abstract Lc51/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a1\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aE\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001d\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001b\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lc51/s;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "subtitleModifier",
        "Lc51/v;",
        "frameMillisProvider",
        "Ll83/a0;",
        "g",
        "(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;Landroidx/compose/runtime/Composer;II)V",
        "Lc51/p;",
        "forTransitionType",
        "",
        "transitionAnimationDuration",
        "Lkotlin/Function1;",
        "",
        "onAnimationProgress",
        "C",
        "(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V",
        "alphaAnimation",
        "nonYearsDifferenceTextAlpha",
        "yearsDifferenceTextSizeMultiplier",
        "Ly3/f;",
        "yearsDifferenceSpacerHeight",
        "",
        "ageValueDisplay",
        "ageTitleDisplay",
        "ageSubtitleDisplay",
        "ageSubtitleValueDisplay",
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
.method private static final A(Lp1/c1;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")D"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method private static final B(Lp1/c1;D)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "D)V"
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc51/s;",
            "Lc51/p;",
            "F",
            "Lkotlin/jvm/functions/Function1;",
            "Lc51/v;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move/from16 v7, p6

    const-string v2, "viewState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "forTransitionType"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onAnimationProgress"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v2, -0x31f35976

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v8, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v7, 0x180

    const/16 v9, 0x100

    if-nez v5, :cond_5

    move/from16 v5, p2

    invoke-virtual {v8, v5}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_4

    move v10, v9

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v2, v10

    goto :goto_4

    :cond_5
    move/from16 v5, p2

    :goto_4
    and-int/lit16 v10, v7, 0xc00

    const/16 v11, 0x800

    if-nez v10, :cond_7

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    move v10, v11

    goto :goto_5

    :cond_6
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v2, v10

    :cond_7
    and-int/lit16 v10, v7, 0x6000

    const/16 v12, 0x4000

    if-nez v10, :cond_a

    and-int/lit8 v10, p7, 0x10

    if-nez v10, :cond_9

    const v10, 0x8000

    and-int/2addr v10, v7

    if-nez v10, :cond_8

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_6

    :cond_8
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_6
    if-eqz v10, :cond_9

    move v10, v12

    goto :goto_7

    :cond_9
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v2, v10

    :cond_a
    and-int/lit16 v10, v2, 0x2493

    const/16 v13, 0x2492

    const/4 v15, 0x1

    if-eq v10, v13, :cond_b

    move v10, v15

    goto :goto_8

    :cond_b
    const/4 v10, 0x0

    :goto_8
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v8, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v10, v7, 0x1

    const v13, -0xe001

    if-eqz v10, :cond_d

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_a

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_e

    :goto_9
    and-int/2addr v2, v13

    goto :goto_b

    :cond_d
    :goto_a
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_e

    new-instance v0, Lc51/a0;

    invoke-direct {v0}, Lc51/a0;-><init>()V

    goto :goto_9

    :cond_e
    :goto_b
    invoke-virtual {v8}, Lp1/q;->r()V

    invoke-virtual {v1}, Lc51/s;->o()Lc51/o;

    move-result-object v10

    const/4 v13, 0x0

    if-eqz v10, :cond_f

    invoke-virtual {v10}, Lc51/o;->f()Ljava/lang/String;

    move-result-object v10

    goto :goto_c

    :cond_f
    move-object v10, v13

    :goto_c
    invoke-virtual {v1}, Lc51/s;->o()Lc51/o;

    move-result-object v16

    if-eqz v16, :cond_10

    invoke-virtual/range {v16 .. v16}, Lc51/o;->c()Ljava/lang/String;

    move-result-object v13

    :cond_10
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    and-int/lit8 v14, v2, 0x70

    if-ne v14, v6, :cond_11

    move v6, v15

    goto :goto_d

    :cond_11
    const/4 v6, 0x0

    :goto_d
    or-int v6, v16, v6

    and-int/lit16 v14, v2, 0x380

    if-ne v14, v9, :cond_12

    move v9, v15

    goto :goto_e

    :cond_12
    const/4 v9, 0x0

    :goto_e
    or-int/2addr v6, v9

    const v9, 0xe000

    and-int/2addr v9, v2

    xor-int/lit16 v9, v9, 0x6000

    if-le v9, v12, :cond_13

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    :cond_13
    and-int/lit16 v9, v2, 0x6000

    if-ne v9, v12, :cond_15

    :cond_14
    move v9, v15

    goto :goto_f

    :cond_15
    const/4 v9, 0x0

    :goto_f
    or-int/2addr v6, v9

    and-int/lit16 v2, v2, 0x1c00

    if-ne v2, v11, :cond_16

    move v14, v15

    goto :goto_10

    :cond_16
    const/4 v14, 0x0

    :goto_10
    or-int v2, v6, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_17

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v6, v2, :cond_18

    :cond_17
    move-object v4, v0

    goto :goto_11

    :cond_18
    move-object v4, v0

    goto :goto_12

    :goto_11
    new-instance v0, Lc51/c$b;

    const/4 v6, 0x0

    move-object v2, v3

    move v3, v5

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lc51/c$b;-><init>(Lc51/s;Lc51/p;FLc51/v;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :goto_12
    check-cast v6, Lc93/m;

    invoke-static {v10, v13, v6, v8}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    move-object v5, v4

    goto :goto_13

    :cond_19
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v5, v0

    :goto_13
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v0, Lc51/b;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move v6, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lc51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;FLl83/e;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final D(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lc51/c;->C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic E(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lc51/c;->p(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic F(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lc51/c;->s(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic G(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lc51/c;->u(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic H(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lc51/c;->w(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lc51/c;->D(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;D)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc51/c;->l(Lp1/c1;D)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;D)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc51/c;->k(Lp1/c1;D)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lc51/c;->x(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;D)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc51/c;->n(Lp1/c1;D)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(FLp1/c1;D)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc51/c;->m(FLp1/c1;D)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;Landroidx/compose/runtime/Composer;II)V
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v10, p2

    move-object/from16 v1, p3

    move/from16 v9, p5

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v33

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "modifier"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "subtitleModifier"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v2, 0x189fbd43

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v5, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_8

    and-int/lit8 v3, p6, 0x8

    if-nez v3, :cond_7

    and-int/lit16 v3, v9, 0x1000

    if-nez v3, :cond_6

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_4

    :cond_6
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_4
    if-eqz v3, :cond_7

    const/16 v3, 0x800

    goto :goto_5

    :cond_7
    const/16 v3, 0x400

    :goto_5
    or-int/2addr v2, v3

    :cond_8
    and-int/lit16 v3, v2, 0x493

    const/16 v4, 0x492

    if-eq v3, v4, :cond_9

    const/4 v3, 0x1

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    :goto_6
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v5, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2f

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v3, v9, 0x1

    if-eqz v3, :cond_c

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_b

    :goto_7
    and-int/lit16 v2, v2, -0x1c01

    :cond_b
    move-object v4, v1

    move/from16 v38, v2

    goto :goto_9

    :cond_c
    :goto_8
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_b

    new-instance v1, Lc51/a0;

    invoke-direct {v1}, Lc51/a0;-><init>()V

    goto :goto_7

    :goto_9
    invoke-virtual {v5}, Lp1/q;->r()V

    const/16 v1, 0x5a

    int-to-float v14, v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v1, v15, :cond_d

    const/4 v1, 0x0

    invoke-static {v1, v5}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v1

    :cond_d
    check-cast v1, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_e

    invoke-static/range {v33 .. v33}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_f

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_10

    new-instance v6, Ly3/f;

    invoke-direct {v6, v14}, Ly3/f;-><init>(F)V

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lp1/c1;

    move-object v7, v1

    sget-object v1, Lc51/p;->PULSE_YEARS_DIFFERENCE:Lc51/p;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v15, :cond_11

    new-instance v12, Laq1/d;

    const/16 v13, 0x8

    invoke-direct {v12, v13, v2}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v12, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v13, v38, 0xe

    or-int/lit16 v13, v13, 0xdb0

    shl-int/lit8 v17, v38, 0x3

    const v18, 0xe000

    and-int v17, v17, v18

    or-int v13, v13, v17

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v18, v2

    const/high16 v2, 0x40400000    # 3.0f

    move-object v11, v6

    move v6, v13

    move-object v13, v3

    move-object v3, v12

    move-object/from16 v12, v17

    invoke-static/range {v0 .. v7}, Lc51/c;->C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_12

    new-instance v0, Laq1/d;

    const/16 v2, 0x9

    invoke-direct {v0, v2, v13}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/high16 v2, 0x40400000    # 3.0f

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v7}, Lc51/c;->C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_13

    new-instance v0, Lc51/a;

    const/4 v2, 0x0

    invoke-direct {v0, v14, v11, v2}, Lc51/a;-><init>(FLp1/c1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/high16 v2, 0x40400000    # 3.0f

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v7}, Lc51/c;->C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v12, v0}, Lc51/c;->q(Lp1/c1;F)V

    move-object v0, v1

    sget-object v1, Lc51/p;->FADE_IN:Lc51/p;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_14

    new-instance v2, Laq1/d;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v12}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/high16 v2, 0x3fc00000    # 1.5f

    move-object v9, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v7}, Lc51/c;->C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v39, v4

    move-object v7, v5

    invoke-virtual {v0}, Lc51/s;->p()Lc51/r;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v0}, Lc51/s;->p()Lc51/r;

    move-result-object v1

    invoke-virtual {v1}, Lc51/r;->d()Lc51/p;

    move-result-object v1

    if-ne v1, v9, :cond_16

    :cond_15
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v12, v1}, Lc51/c;->q(Lp1/c1;F)V

    :cond_16
    invoke-virtual {v0}, Lc51/s;->o()Lc51/o;

    move-result-object v1

    if-eqz v1, :cond_2e

    const v1, -0x7ad2891b

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    if-ne v1, v15, :cond_17

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v1, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_18

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_19

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_1a

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v5, Lp1/c1;

    invoke-virtual {v0}, Lc51/s;->o()Lc51/o;

    move-result-object v9

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_1c

    if-ne v6, v15, :cond_1b

    goto :goto_a

    :cond_1b
    move-object v2, v1

    goto :goto_b

    :cond_1c
    :goto_a
    new-instance v0, Lc51/c$a;

    const/4 v6, 0x0

    move-object v2, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lc51/c$a;-><init>(Lc51/s;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :goto_b
    check-cast v6, Lc93/m;

    invoke-static {v7, v6, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12}, Lc51/c;->h(Lp1/c1;)F

    move-result v0

    invoke-static {v0, v8}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v1, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move-object/from16 p3, v2

    move-object v9, v3

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_1d

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_1d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_c
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_1e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v40, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    goto :goto_d

    :cond_1e
    move-object/from16 v40, v4

    :goto_d
    invoke-static {v2, v7, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    invoke-virtual {v0}, Lc51/o;->g()Z

    move-result v0

    if-eqz v0, :cond_20

    sget-object v0, Ll0/m;->e:Ll0/h;

    move-object v4, v0

    const/4 v0, 0x1

    goto :goto_e

    :cond_20
    const/4 v0, 0x1

    int-to-float v4, v0

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    :goto_e
    sget-object v6, Lb2/e;->N:Lb2/k;

    move-object/from16 v17, v13

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static/range {v18 .. v18}, Lc51/c;->y(Lp1/c1;)F

    move-result v0

    invoke-static {v0, v14}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v14, 0x30

    invoke-static {v4, v6, v7, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 v18, v15

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    move-object/from16 v41, v5

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_21

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v5, v18

    goto :goto_10

    :cond_21
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v7, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_22

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_23

    :cond_22
    invoke-static {v14, v7, v14, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p3 .. p3}, Lc51/c;->o(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual/range {p0 .. p0}, Lc51/s;->o()Lc51/o;

    move-result-object v14

    invoke-virtual {v14}, Lc51/o;->h()Lb91/c;

    move-result-object v14

    invoke-virtual {v4, v14}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v32

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v4, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v20

    new-instance v15, Lw3/k;

    move-object/from16 p3, v0

    const/4 v0, 0x3

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    const v36, 0xc00c30

    const v37, 0xd5f8

    move-object/from16 v18, v17

    const/16 v22, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    const/16 v24, 0x30

    const/16 v19, 0x0

    move/from16 v25, v14

    move/from16 v46, v24

    move-object/from16 v24, v15

    move-wide/from16 v14, v20

    move/from16 v21, v46

    const/16 v20, 0x0

    move/from16 v26, v21

    move/from16 v27, v22

    const-wide/16 v21, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    move/from16 v29, v26

    const-wide/16 v25, 0x0

    move/from16 v31, v27

    const/16 v27, 0x3

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v35, v29

    const/16 v29, 0x1

    move/from16 v42, v30

    const/16 v30, 0x0

    move/from16 v43, v31

    const/16 v31, 0x0

    move/from16 v44, v35

    const/16 v35, 0x30

    move-object/from16 v45, v5

    move-object/from16 v5, v34

    move/from16 v0, v42

    move-object/from16 v34, v7

    move-object v7, v12

    move-object/from16 v12, p3

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    invoke-virtual/range {p0 .. p0}, Lc51/s;->o()Lc51/o;

    move-result-object v14

    invoke-virtual {v14}, Lc51/o;->g()Z

    move-result v14

    if-eqz v14, :cond_24

    const v14, -0x1e15e7ff

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    int-to-float v14, v0

    const/4 v15, 0x0

    invoke-static {v13, v14, v12, v15}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_11

    :cond_24
    const/4 v15, 0x0

    const v14, -0x1e14bbaf

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_11
    invoke-static {v9}, Lc51/c;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lc51/s;->o()Lc51/o;

    move-result-object v14

    invoke-virtual {v14}, Lc51/o;->g()Z

    move-result v14

    if-eqz v14, :cond_25

    const v14, -0x117c762d

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->s()Lb91/a;

    move-result-object v14

    :goto_12
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object/from16 v32, v14

    goto :goto_13

    :cond_25
    const v14, -0x117c726c

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->K()Lb91/a;

    move-result-object v14

    goto :goto_12

    :goto_13
    invoke-virtual {v4, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->c1()J

    move-result-wide v14

    new-instance v0, Lw3/k;

    move-object/from16 p4, v5

    const/4 v5, 0x3

    invoke-direct {v0, v5}, Lw3/k;-><init>(I)V

    const/high16 v36, 0xc00000

    const v37, 0xfdfa

    move-object v5, v13

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v35, 0x0

    move-object/from16 v24, v0

    move-object/from16 v34, v12

    move-object v12, v9

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    int-to-float v9, v0

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    const/16 v13, 0x36

    invoke-static {v9, v6, v12, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_26

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_14
    move-object/from16 v15, v45

    goto :goto_15

    :cond_26
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_14

    :goto_15
    invoke-static {v12, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_27

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_28

    :cond_27
    invoke-static {v9, v12, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v12, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11}, Lc51/c;->i(Lp1/c1;)F

    move-result v6

    const/4 v9, 0x0

    int-to-float v13, v9

    invoke-static {v6, v13}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-lez v6, :cond_29

    const v6, 0x1199ecf3

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-static {v11}, Lc51/c;->i(Lp1/c1;)F

    move-result v6

    invoke-static {v5, v6, v12, v9}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_16

    :cond_29
    const v6, 0x119b6f9a

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    :goto_16
    sget-object v6, Lb2/e;->L:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x30

    invoke-static {v9, v6, v12, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move-object v9, v1

    iget-wide v0, v12, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_2a

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_2a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v12, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_2b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    :cond_2b
    invoke-static {v0, v12, v0, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    invoke-static {v12, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v41 .. v41}, Lc51/c;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object v9

    const/4 v0, 0x6

    invoke-virtual {v4, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->F()Lb91/a;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lc51/s;->o()Lc51/o;

    move-result-object v1

    invoke-virtual {v1}, Lc51/o;->i()Ly81/f;

    move-result-object v1

    const/4 v15, 0x0

    invoke-virtual {v1, v12, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    invoke-virtual {v4, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->D()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v0

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v6, v0, Ll3/m0;->b:J

    invoke-static {v6, v7}, Ly3/o;->c(J)F

    move-result v0

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    const-wide v7, 0x100000000L

    invoke-static {v0, v7, v8, v6}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v14

    invoke-static/range {p4 .. p4}, Lc51/c;->A(Lp1/c1;)D

    move-result-wide v16

    invoke-static {v14, v15}, Lv63/c;->a(J)V

    const-wide v35, 0xff00000000L

    and-long v7, v14, v35

    invoke-static {v14, v15}, Ly3/o;->c(J)F

    move-result v0

    float-to-double v14, v0

    mul-double v14, v14, v16

    double-to-float v0, v14

    invoke-static {v0, v7, v8}, Lv63/c;->j(FJ)J

    move-result-wide v6

    new-instance v0, Lw3/k;

    const/4 v8, 0x3

    invoke-direct {v0, v8}, Lw3/k;-><init>(I)V

    shr-int/lit8 v14, v38, 0x3

    and-int/lit8 v32, v14, 0x70

    const/16 v33, 0x0

    const v34, 0x2fdf0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v21, v0

    move-object/from16 v31, v12

    move v0, v13

    move-wide v13, v6

    move-object v6, v11

    move-wide v11, v1

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    invoke-static/range {v40 .. v40}, Lc51/c;->t(Lp1/c1;)Ljava/lang/String;

    move-result-object v9

    const/4 v1, 0x6

    invoke-virtual {v4, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->D()Lb91/a;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lc51/s;->o()Lc51/o;

    move-result-object v2

    invoke-virtual {v2}, Lc51/o;->i()Ly81/f;

    move-result-object v2

    const/4 v15, 0x0

    invoke-virtual {v2, v12, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-virtual {v4, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->D()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v1, v1, Ll3/m0;->b:J

    invoke-static {v1, v2}, Ly3/o;->c(J)F

    move-result v1

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    const-wide v3, 0x100000000L

    invoke-static {v1, v3, v4, v2}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v1

    invoke-static/range {p4 .. p4}, Lc51/c;->A(Lp1/c1;)D

    move-result-wide v3

    invoke-static {v1, v2}, Lv63/c;->a(J)V

    and-long v10, v1, v35

    invoke-static {v1, v2}, Ly3/o;->c(J)F

    move-result v1

    float-to-double v1, v1

    mul-double/2addr v1, v3

    double-to-float v1, v1

    invoke-static {v1, v10, v11}, Lv63/c;->j(FJ)J

    move-result-wide v13

    new-instance v1, Lw3/k;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lw3/k;-><init>(I)V

    const/4 v15, 0x0

    move-object/from16 v10, p2

    move-object/from16 v21, v1

    move-wide v11, v7

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-static {v6}, Lc51/c;->i(Lp1/c1;)F

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-gez v0, :cond_2d

    const v0, 0x11a780f2

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-static {v6}, Lc51/c;->i(Lp1/c1;)F

    move-result v0

    neg-float v0, v0

    const/4 v15, 0x0

    invoke-static {v5, v0, v12, v15}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_18
    const/4 v0, 0x1

    goto :goto_19

    :cond_2d
    const/4 v15, 0x0

    const v0, 0x11a9075a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_19
    invoke-static {v12, v0, v0, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_1a

    :cond_2e
    move-object v12, v7

    const/4 v15, 0x0

    const v0, -0x7a9f7a01

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_1a
    move-object/from16 v4, v39

    goto :goto_1b

    :cond_2f
    move-object v12, v5

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v4, v1

    :goto_1b
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_30

    new-instance v0, La81/f;

    const/16 v7, 0xc

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final h(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final i(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final j(Lp1/c1;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    new-instance v0, Ly3/f;

    invoke-direct {v0, p1}, Ly3/f;-><init>(F)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lp1/c1;D)Ll83/a0;
    .locals 1

    sget-object v0, Lc51/z;->a:Lc51/z;

    invoke-virtual {v0}, Lc51/z;->a()Ld51/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld51/d;->c(D)D

    move-result-wide p1

    double-to-float p1, p1

    invoke-static {p0, p1}, Lc51/c;->z(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;D)Ll83/a0;
    .locals 1

    sget-object v0, Lc51/z;->a:Lc51/z;

    invoke-virtual {v0}, Lc51/z;->c()Ld51/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld51/d;->c(D)D

    move-result-wide p1

    invoke-static {p0, p1, p2}, Lc51/c;->B(Lp1/c1;D)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(FLp1/c1;D)Ll83/a0;
    .locals 1

    sget-object v0, Lc51/z;->a:Lc51/z;

    invoke-virtual {v0}, Lc51/z;->b()Ld51/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ld51/d;->c(D)D

    move-result-wide p2

    double-to-float p2, p2

    sub-float/2addr p0, p2

    invoke-static {p1, p0}, Lc51/c;->j(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;D)Ll83/a0;
    .locals 1

    sget-object v0, Lc51/u;->a:Lc51/u;

    invoke-virtual {v0}, Lc51/u;->a()Ld51/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld51/d;->c(D)D

    move-result-wide p1

    double-to-float p1, p1

    invoke-static {p0, p1}, Lc51/c;->q(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;)Ljava/lang/String;
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

.method private static final p(Lp1/c1;Ljava/lang/String;)V
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

.method private static final q(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

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

.method private static final t(Lp1/c1;)Ljava/lang/String;
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

.method private static final u(Lp1/c1;Ljava/lang/String;)V
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

.method private static final x(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lc51/c;->g(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final z(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

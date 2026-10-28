.class public abstract Ly80/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00ab\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022T\u0010\u0010\u001aP\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\nH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lg80/f;",
        "viewState",
        "Lkotlin/Function1;",
        "Lj80/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll80/o;",
        "onNavigationEvent",
        "Lh80/b;",
        "onAnalyticsEvent",
        "Lkotlin/Function8;",
        "Lm91/u;",
        "Lp90/e;",
        "Lc31/k;",
        "Lg80/g;",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "handleProgressButtonClick",
        "e",
        "(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lh80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly80/b;->f(Lh80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly80/b;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly80/b;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ly80/b;->i(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg80/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/r;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v10, p4

    move/from16 v0, p6

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onNavigationEvent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "handleProgressButtonClick"

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v4, -0x201c40f

    invoke-virtual {v11, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0xc00

    :cond_6
    move-object/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit16 v8, v0, 0x6000

    if-nez v8, :cond_a

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v4, v8

    :cond_a
    and-int/lit16 v8, v4, 0x2493

    const/16 v9, 0x2492

    const/4 v14, 0x0

    if-eq v8, v9, :cond_b

    const/4 v8, 0x1

    goto :goto_7

    :cond_b
    move v8, v14

    :goto_7
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1d

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_c

    new-instance v5, Ly41/b;

    const/16 v7, 0xb

    invoke-direct {v5, v7}, Ly41/b;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_d
    move-object v5, v7

    :goto_8
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v7

    const-string v9, "activation_device_education"

    const/16 v13, 0x30

    invoke-static {v7, v9, v11, v13}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v7, v4, 0x70

    if-ne v7, v6, :cond_e

    const/4 v9, 0x1

    goto :goto_9

    :cond_e
    move v9, v14

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    const/4 v12, 0x0

    if-nez v9, :cond_f

    if-ne v15, v8, :cond_10

    :cond_f
    new-instance v15, Ly80/b$a;

    invoke-direct {v15, v2, v12}, Ly80/b$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v15, Lc93/m;

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v15, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v9

    invoke-virtual {v9}, Lg80/d;->b()Lg80/g;

    move-result-object v9

    if-eqz v9, :cond_11

    invoke-virtual {v9}, Lg80/g;->g()Lc31/k;

    move-result-object v9

    if-eqz v9, :cond_11

    invoke-virtual {v9}, Lc31/k;->p()Lc31/d;

    move-result-object v9

    goto :goto_a

    :cond_11
    move-object v9, v12

    :goto_a
    sget-object v15, Lc31/d;->LOADING:Lc31/d;

    if-ne v9, v15, :cond_12

    const v9, 0x7490124c

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-static {v11, v14}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    const v9, 0x74909d31

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v9

    invoke-virtual {v9}, Lg80/d;->d()Z

    move-result v9

    if-eqz v9, :cond_19

    const v4, 0x7491c9bf

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    if-ne v7, v6, :cond_13

    const/4 v4, 0x1

    goto :goto_c

    :cond_13
    move v4, v14

    :goto_c
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_14

    if-ne v9, v8, :cond_15

    :cond_14
    new-instance v9, Lw01/f;

    const/16 v4, 0x18

    invoke-direct {v9, v2, v4}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lc93/a;

    if-ne v7, v6, :cond_16

    const/4 v12, 0x1

    goto :goto_d

    :cond_16
    move v12, v14

    :goto_d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v12, :cond_17

    if-ne v4, v8, :cond_18

    :cond_17
    new-instance v4, Lw01/f;

    const/16 v6, 0x19

    invoke-direct {v4, v2, v6}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v4, Lc93/a;

    invoke-static {v9, v4, v11, v14}, Lk80/o;->b(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_e
    move-object v8, v5

    goto :goto_f

    :cond_19
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->e()Z

    move-result v6

    if-eqz v6, :cond_1a

    const v4, 0x7497332e

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-static {v11, v14}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v11, v14}, Lk80/r;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1a
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->b()Lg80/g;

    move-result-object v6

    if-eqz v6, :cond_1b

    invoke-virtual {v6}, Lg80/g;->h()Ljava/util/List;

    move-result-object v12

    :cond_1b
    if-eqz v12, :cond_1c

    const v6, 0x74999be9

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->b()Lg80/g;

    move-result-object v6

    sget-object v3, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->DEVICE_EDUCATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    shl-int/lit8 v7, v4, 0x6

    and-int/lit16 v8, v7, 0x1c00

    or-int/2addr v8, v13

    const v9, 0xe000

    and-int/2addr v7, v9

    or-int/2addr v7, v8

    shl-int/lit8 v8, v4, 0x9

    const/high16 v9, 0x380000

    and-int/2addr v8, v9

    or-int/2addr v7, v8

    shl-int/lit8 v4, v4, 0xc

    const/high16 v8, 0xe000000

    and-int/2addr v4, v8

    or-int v12, v7, v4

    const/16 v13, 0xa4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v8, v5

    move-object v5, v2

    move-object v2, v6

    move-object/from16 v6, p2

    invoke-static/range {v2 .. v13}, Lq80/i;->m(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/r;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    move-object v8, v5

    const v2, 0x74a062f1

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_f
    move-object v4, v8

    goto :goto_10

    :cond_1d
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v7

    :goto_10
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1e

    new-instance v0, La90/a;

    const/4 v8, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La90/a;-><init>(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final f(Lh80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$p;->a:Lj80/a$p;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$p;->a:Lj80/a$p;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ly80/b;->e(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Ld80/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld80/e$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u00e1\u0001\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u00062\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00080\u00062*\u0008\u0002\u0010\u0013\u001a$\u0008\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2H\u0010\u0016\u001aD\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lg80/g;",
        "viewState",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "currentNavHostDestination",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "signUpSource",
        "Lkotlin/Function1;",
        "Lj80/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll80/o;",
        "onNavigationEvent",
        "Lh80/b;",
        "onAnalyticsEvent",
        "Lkotlin/Function3;",
        "Lm91/u;",
        "Lf70/q0;",
        "Lq83/d;",
        "",
        "onBeforeAdvance",
        "Lkotlin/Function6;",
        "Lc31/k;",
        "handleProgressButtonClick",
        "m",
        "(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;Landroidx/compose/runtime/Composer;II)V",
        "",
        "D",
        "(Lm91/u;)Z",
        "showLocalLoadingOverlay",
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
.method private static final A(Lp1/c1;)Z
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

.method private static final B(Lp1/c1;Z)V
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

.method public static final synthetic C(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Ld80/e;->B(Lp1/c1;Z)V

    return-void
.end method

.method private static final D(Lm91/u;)Z
    .locals 0

    instance-of p0, p0, Lc90/b;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static synthetic a(Lg80/c;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld80/e;->u(Lg80/c;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ll80/o;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld80/e;->o(Ll80/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld80/e;->n(Lj80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lc93/p;Lc31/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Ld80/e;->x(Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lc93/p;Lc31/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ld80/f;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ld80/e;->q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ld80/f;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld80/e;->z(Lh80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Ld80/e;->y(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ZZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lcom/whoop/activation/iajf/domain/SignUpSource;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Ld80/e;->v(ZZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lcom/whoop/activation/iajf/domain/SignUpSource;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lg80/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld80/e;->s(Lg80/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lg80/c;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld80/e;->t(Lg80/c;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ld80/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld80/e;->r(Ld80/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1}, Ld80/e;->p(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;Landroidx/compose/runtime/Composer;II)V
    .locals 68
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg80/g;",
            "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/p;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p7

    move/from16 v0, p9

    sget-object v1, Lb2/e;->E:Lb2/m;

    sget-object v2, Lb2/e;->H:Lb2/m;

    const-string v3, "viewState"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "currentNavHostDestination"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "handleProgressButtonClick"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v3, 0x12e883fb

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v8, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, p10, 0x4

    if-eqz v6, :cond_4

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_4
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_7

    if-nez p2, :cond_5

    const/4 v11, -0x1

    goto :goto_3

    :cond_5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    :goto_3
    invoke-virtual {v8, v11}, Lp1/q;->e(I)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x100

    goto :goto_4

    :cond_6
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    :cond_7
    :goto_5
    and-int/lit8 v11, p10, 0x8

    if-eqz v11, :cond_8

    or-int/lit16 v3, v3, 0xc00

    move-object/from16 v7, p3

    const/16 p8, 0x10

    goto :goto_7

    :cond_8
    const/16 p8, 0x10

    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_a

    move-object/from16 v7, p3

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_9

    const/16 v16, 0x800

    goto :goto_6

    :cond_9
    const/16 v16, 0x400

    :goto_6
    or-int v3, v3, v16

    goto :goto_7

    :cond_a
    move-object/from16 v7, p3

    :goto_7
    and-int/lit8 v16, p10, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-object/from16 v9, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_b

    move-object/from16 v9, p4

    invoke-virtual {v8, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_d

    const/16 v18, 0x4000

    goto :goto_8

    :cond_d
    const/16 v18, 0x2000

    :goto_8
    or-int v3, v3, v18

    :goto_9
    and-int/lit8 v18, p10, 0x20

    const/high16 v19, 0x30000

    if-eqz v18, :cond_e

    or-int v3, v3, v19

    move-object/from16 v10, p5

    goto :goto_b

    :cond_e
    and-int v19, v0, v19

    move-object/from16 v10, p5

    if-nez v19, :cond_10

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_f

    const/high16 v20, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v20, 0x10000

    :goto_a
    or-int v3, v3, v20

    :cond_10
    :goto_b
    const/high16 v20, 0x180000

    and-int v20, v0, v20

    if-nez v20, :cond_12

    and-int/lit8 v20, p10, 0x40

    move-object/from16 v4, p6

    if-nez v20, :cond_11

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_11
    const/high16 v20, 0x80000

    :goto_c
    or-int v3, v3, v20

    goto :goto_d

    :cond_12
    move-object/from16 v4, p6

    :goto_d
    const/high16 v20, 0xc00000

    and-int v20, v0, v20

    if-nez v20, :cond_14

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_13
    const/high16 v20, 0x400000

    :goto_e
    or-int v3, v3, v20

    :cond_14
    const v20, 0x492493

    and-int v12, v3, v20

    const v13, 0x492492

    const/16 v28, 0x1

    const/4 v15, 0x0

    if-eq v12, v13, :cond_15

    move/from16 v12, v28

    goto :goto_f

    :cond_15
    move v12, v15

    :goto_f
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v8, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_77

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v12, v0, 0x1

    const v23, -0x380001

    sget-object v13, Lp1/l;->a:Lp1/v0;

    move/from16 v24, v12

    const/4 v12, 0x0

    if-eqz v24, :cond_18

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v24

    if-eqz v24, :cond_16

    goto :goto_10

    :cond_16
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit8 v6, p10, 0x40

    if-eqz v6, :cond_17

    and-int v3, v3, v23

    :cond_17
    move v6, v3

    move-object v3, v4

    move-object/from16 v30, v7

    move-object/from16 v31, v9

    move-object v7, v10

    move-object/from16 v4, p2

    goto :goto_12

    :cond_18
    :goto_10
    if-eqz v6, :cond_19

    sget-object v6, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    goto :goto_11

    :cond_19
    move-object/from16 v6, p2

    :goto_11
    if-eqz v11, :cond_1b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_1a

    new-instance v7, Ld11/h;

    const/16 v11, 0xa

    invoke-direct {v7, v11}, Ld11/h;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    :cond_1b
    if-eqz v16, :cond_1d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v13, :cond_1c

    new-instance v9, Ld11/h;

    const/16 v11, 0xb

    invoke-direct {v9, v11}, Ld11/h;-><init>(I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v9, Lkotlin/jvm/functions/Function1;

    :cond_1d
    if-eqz v18, :cond_1f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v13, :cond_1e

    new-instance v10, Ld11/h;

    const/16 v11, 0xc

    invoke-direct {v10, v11}, Ld11/h;-><init>(I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lkotlin/jvm/functions/Function1;

    :cond_1f
    and-int/lit8 v11, p10, 0x40

    if-eqz v11, :cond_21

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_20

    new-instance v4, Ld80/e$a;

    invoke-direct {v4, v12}, Ld80/e$a;-><init>(Lq83/d;)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v4, Lkotlin/jvm/functions/Function3;

    and-int v3, v3, v23

    :cond_21
    move-object/from16 v30, v6

    move v6, v3

    move-object v3, v4

    move-object/from16 v4, v30

    move-object/from16 v30, v7

    move-object/from16 v31, v9

    move-object v7, v10

    :goto_12
    invoke-virtual {v8}, Lp1/q;->r()V

    invoke-virtual {v5}, Lg80/g;->h()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v5}, Lg80/g;->b()I

    move-result v10

    invoke-virtual {v5}, Lg80/g;->h()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    invoke-static {v10, v15, v11}, Le93/b;->n(III)I

    move-result v10

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lm91/u;

    invoke-virtual {v5}, Lg80/g;->h()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v5}, Lg80/g;->b()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    invoke-static {v10, v9}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm91/u;

    invoke-virtual {v5}, Lg80/g;->d()Ljava/util/List;

    move-result-object v10

    if-nez v10, :cond_22

    sget-object v10, Lm83/y;->w:Lm83/y;

    :cond_22
    move-object/from16 v35, v10

    move-object/from16 v10, v35

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v36

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v13, :cond_23

    new-instance v10, Ld80/f;

    invoke-virtual {v5}, Lg80/g;->g()Lc31/k;

    move-result-object v15

    invoke-direct {v10, v15}, Ld80/f;-><init>(Lc31/k;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v10, Ld80/f;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v13, :cond_24

    invoke-static {v8}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v15

    invoke-virtual {v8, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v15, Lbc3/c0;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v13, :cond_25

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v12, Lp1/c1;

    invoke-virtual {v5}, Lg80/g;->g()Lc31/k;

    move-result-object v0

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    move-object/from16 v32, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v18, :cond_27

    if-ne v7, v13, :cond_26

    goto :goto_13

    :cond_26
    move-object/from16 p2, v9

    const/4 v9, 0x0

    goto :goto_14

    :cond_27
    :goto_13
    new-instance v7, Ld80/e$b;

    move-object/from16 p2, v9

    const/4 v9, 0x0

    invoke-direct {v7, v10, v5, v9}, Ld80/e$b;-><init>(Ld80/f;Lg80/g;Lq83/d;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v7, Lc93/m;

    sget v9, Lc31/k;->r:I

    invoke-static {v8, v7, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lg80/g;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_28

    new-instance v7, Ld80/e$c;

    move/from16 p3, v9

    const/4 v9, 0x0

    invoke-direct {v7, v10, v9}, Ld80/e$c;-><init>(Ld80/f;Lq83/d;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_15

    :cond_28
    move/from16 p3, v9

    :goto_15
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lg80/g;->j()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v5}, Lg80/g;->b()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    move/from16 p4, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez p4, :cond_2a

    if-ne v9, v13, :cond_29

    goto :goto_16

    :cond_29
    move-object/from16 v33, v10

    const/4 v10, 0x0

    goto :goto_17

    :cond_2a
    :goto_16
    new-instance v9, Ld80/e$d;

    move-object/from16 v33, v10

    const/4 v10, 0x0

    invoke-direct {v9, v5, v12, v10}, Ld80/e$d;-><init>(Lg80/g;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    check-cast v9, Lc93/m;

    invoke-static {v0, v7, v9, v8}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual/range {v33 .. v33}, Ld80/f;->c()Lc31/k;

    move-result-object v0

    invoke-virtual {v5}, Lg80/g;->i()Z

    move-result v7

    const/16 v9, 0x8

    move-object/from16 p4, v12

    const/4 v12, 0x6

    if-eqz v7, :cond_2b

    int-to-float v7, v12

    int-to-float v10, v9

    mul-float/2addr v7, v10

    invoke-interface/range {v35 .. v35}, Ljava/util/List;->size()I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v7, v10

    :goto_18
    move/from16 v41, v7

    goto :goto_19

    :cond_2b
    const/4 v7, 0x4

    int-to-float v10, v7

    int-to-float v7, v9

    mul-float/2addr v7, v10

    goto :goto_18

    :goto_19
    sget-object v7, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v8}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v7

    iget-object v7, v7, Ll0/c2;->k:Ll0/w1;

    sget v10, Ll0/g2;->b:I

    sget v18, Ll0/g2;->c:I

    or-int v10, v10, v18

    or-int/lit8 v10, v10, 0x10

    new-instance v9, Ll0/e1;

    invoke-direct {v9, v7, v10}, Ll0/e1;-><init>(Ll0/b2;I)V

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9}, Ll0/f;->p(Landroidx/compose/ui/Modifier;Ll0/b2;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v12, 0x3f800000    # 1.0f

    move/from16 p8, v10

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lx81/d;->a:Lx81/d;

    move-object/from16 v48, v0

    sget v0, Lx81/d;->b:I

    invoke-virtual {v12, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v23

    move-object/from16 v24, v11

    move-object/from16 v25, v12

    invoke-virtual/range {v23 .. v23}, Ly81/i;->o()J

    move-result-wide v11

    move-object/from16 v43, v3

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v11, v12, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static/range {v24 .. v24}, Ld80/e;->D(Lm91/u;)Z

    move-result v11

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    move-object/from16 v44, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v12, :cond_2c

    if-ne v3, v13, :cond_2d

    :cond_2c
    new-instance v3, Lck1/c;

    const/16 v12, 0x12

    invoke-direct {v3, v9, v12}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v11, v3}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v9, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object v12, v9

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v12

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move-object/from16 v45, v15

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_2e

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_2e
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1a
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v8, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v8, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 v46, v2

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_2f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move/from16 v47, v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    goto :goto_1b

    :cond_2f
    move/from16 v47, v0

    :goto_1b
    invoke-static {v9, v8, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v37

    const/16 v40, 0x0

    const/16 v42, 0x7

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v37 .. v42}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v1, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move-object/from16 v37, v4

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_31

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_31
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v8, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_32

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    :cond_32
    invoke-static {v4, v8, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_33
    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v2

    const v38, 0xe000

    const/high16 v39, 0x70000

    const/4 v3, 0x3

    if-eq v2, v14, :cond_34

    const v2, 0x135f7110

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-static {v8, v9}, Lk80/r;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move/from16 v50, p3

    move-object/from16 v42, p4

    move/from16 v5, p8

    move-object/from16 p8, v0

    move-object/from16 v51, v1

    move/from16 p6, v6

    move-object v0, v7

    move-object/from16 v52, v10

    move-object v1, v11

    move-object v2, v12

    move-object/from16 v14, v23

    move-object/from16 v6, v24

    move-object/from16 p5, v25

    move-object/from16 p4, v31

    move-object/from16 v40, v32

    move-object/from16 v49, v33

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v20, 0x4

    move-object v10, v8

    :goto_1d
    move/from16 v7, v28

    goto/16 :goto_23

    :cond_34
    const v2, 0x1362d209

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    move-object/from16 v42, v7

    invoke-static {}, Lg80/b;->c()Lm91/p;

    move-result-object v7

    and-int/lit16 v2, v6, 0x1c00

    const/16 v4, 0x800

    if-ne v2, v4, :cond_35

    move/from16 v2, v28

    goto :goto_1e

    :cond_35
    const/4 v2, 0x0

    :goto_1e
    and-int v5, v6, v38

    const/16 v9, 0x4000

    if-ne v5, v9, :cond_36

    move/from16 v5, v28

    goto :goto_1f

    :cond_36
    const/4 v5, 0x0

    :goto_1f
    or-int/2addr v2, v5

    and-int v5, v6, v39

    const/high16 v9, 0x20000

    if-ne v5, v9, :cond_37

    move/from16 v5, v28

    goto :goto_20

    :cond_37
    const/4 v5, 0x0

    :goto_20
    or-int/2addr v2, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_39

    if-ne v5, v13, :cond_38

    goto :goto_21

    :cond_38
    move-object/from16 v2, v31

    move-object/from16 v40, v32

    goto :goto_22

    :cond_39
    :goto_21
    new-instance v29, Lam2/s;

    const/16 v34, 0xf

    invoke-direct/range {v29 .. v34}, Lam2/s;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v5, v29

    move-object/from16 v2, v31

    move-object/from16 v40, v32

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v5, Lm91/p;->b:I

    shl-int/2addr v5, v3

    move-object/from16 v21, v12

    const/4 v12, 0x4

    move-object/from16 v26, v10

    move-object v10, v8

    const/4 v8, 0x0

    move-object/from16 v3, p2

    move/from16 v50, p3

    move-object/from16 v51, v1

    move/from16 p6, v6

    move-object v1, v11

    move-object/from16 v14, v23

    move-object/from16 v6, v24

    move-object/from16 p5, v25

    move-object/from16 v52, v26

    move-object/from16 v49, v33

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v20, 0x4

    move v11, v5

    move/from16 v5, p8

    move-object/from16 p8, v0

    move-object/from16 v0, v42

    move-object/from16 v42, p4

    move-object/from16 p4, v2

    move-object/from16 v2, v21

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_1d

    :goto_23
    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lg80/g;->b()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v8

    invoke-virtual {v10, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-nez v8, :cond_3a

    const/4 v8, -0x1

    goto :goto_24

    :cond_3a
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    :goto_24
    invoke-virtual {v10, v8}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_3c

    if-ne v8, v13, :cond_3b

    goto :goto_25

    :cond_3b
    move-object/from16 v3, v30

    goto :goto_26

    :cond_3c
    :goto_25
    new-instance v29, Ld80/a;

    move-object/from16 v8, v30

    invoke-virtual/range {p0 .. p0}, Lg80/g;->b()I

    move-result v30

    invoke-virtual/range {p0 .. p0}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v31

    move-object/from16 v33, v3

    move-object/from16 v32, v6

    move-object/from16 v34, v8

    invoke-direct/range {v29 .. v34}, Ld80/a;-><init>(ILcom/whoop/activation/view/navigation/ActivationFlowDestination;Lm91/u;Lm91/u;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v8, v29

    move-object/from16 v3, v34

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_26
    check-cast v8, Ld80/a;

    invoke-virtual {v8}, Ld80/a;->c()Z

    move-result v7

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_3d

    if-ne v11, v13, :cond_3e

    :cond_3d
    new-instance v11, Ld1/i;

    const/4 v9, 0x7

    invoke-direct {v11, v8, v9}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    check-cast v11, Lc93/a;

    const/4 v9, 0x0

    invoke-static {v11, v7, v10, v9, v9}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v9

    iget-object v9, v9, Ll0/c2;->k:Ll0/w1;

    new-instance v11, Ll0/e1;

    invoke-direct {v11, v9, v5}, Ll0/e1;-><init>(Ll0/b2;I)V

    invoke-static {v7, v11}, Ll0/f;->p(Landroidx/compose/ui/Modifier;Ll0/b2;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/4 v5, 0x2

    int-to-float v7, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v23, v7, v5

    const/4 v7, 0x1

    int-to-float v9, v7

    mul-float v22, v9, v5

    const/16 v25, 0x0

    const/16 v26, 0x8

    move/from16 v24, v22

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v29, v23

    const/4 v9, 0x0

    invoke-static {v14, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move/from16 v31, v5

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_3f

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_27

    :cond_3f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_27
    invoke-static {v10, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_40

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_41

    :cond_40
    move-object/from16 v5, v52

    goto :goto_29

    :cond_41
    move-object/from16 v5, v52

    :goto_28
    move-object/from16 v4, p8

    goto :goto_2a

    :goto_29
    invoke-static {v4, v10, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_28

    :goto_2a
    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8}, Ld80/a;->b()Z

    move-result v7

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-eqz v7, :cond_45

    const v7, -0x4dd39f8e

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    new-instance v53, Lny0/o;

    sget-object v54, Lny0/q$a;->f:Lny0/q$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/w;->q()I

    move-result v55

    const/16 v64, 0x3fc

    const/16 v65, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    invoke-direct/range {v53 .. v65}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Lb2/e;->z:Lb2/m;

    invoke-virtual {v8, v0, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v9, Lgy0/f;->E:I

    const/4 v11, 0x0

    invoke-static {v9, v10, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v11, p0

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    move-object/from16 v24, v6

    move-object/from16 p8, v9

    move/from16 v9, p6

    and-int/lit16 v6, v9, 0x1c00

    const/16 v9, 0x800

    if-ne v6, v9, :cond_42

    const/4 v6, 0x1

    goto :goto_2b

    :cond_42
    const/4 v6, 0x0

    :goto_2b
    or-int/2addr v6, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_44

    if-ne v12, v13, :cond_43

    goto :goto_2c

    :cond_43
    const/4 v6, 0x0

    goto :goto_2d

    :cond_44
    :goto_2c
    new-instance v12, Ld80/d;

    const/4 v6, 0x0

    invoke-direct {v12, v11, v3, v6}, Ld80/d;-><init>(Lg80/g;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2d
    check-cast v12, Lc93/a;

    move-object v11, v10

    move-object v10, v12

    sget v12, Lny0/o;->k:I

    move-object/from16 v16, v13

    const/16 v13, 0x8

    move/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v33, v1

    move-object/from16 v52, v5

    move v1, v6

    move-object/from16 v32, v14

    move-object/from16 v5, v16

    move-object/from16 v6, v53

    move/from16 v14, p6

    move-object/from16 p6, v15

    move-object v15, v8

    move-object v8, v7

    move-object/from16 v7, p8

    move-object/from16 p8, v4

    move-object/from16 v4, v24

    invoke-static/range {v6 .. v13}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_2e

    :cond_45
    move-object/from16 v33, v1

    move-object/from16 p8, v4

    move-object/from16 v52, v5

    move-object v4, v6

    move-object v5, v13

    move-object/from16 v32, v14

    const/4 v1, 0x0

    move/from16 v14, p6

    move-object/from16 p6, v15

    move-object v15, v8

    const v6, -0x4dca3b5c

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_2e
    invoke-virtual/range {p0 .. p0}, Lg80/g;->f()Lg80/c;

    move-result-object v6

    if-nez v6, :cond_46

    const v6, -0x4dc8fd02

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v6, v10

    move-object/from16 v7, v37

    move-object/from16 v1, v51

    const/16 v9, 0x100

    :goto_2f
    const/4 v8, 0x1

    goto/16 :goto_36

    :cond_46
    const v1, -0x4dc8fd01

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lg80/c;->a()Lg80/k;

    move-result-object v1

    sget-object v7, Lg80/k;->TITLE:Lg80/k;

    if-ne v1, v7, :cond_47

    move-object/from16 v1, v51

    invoke-virtual {v15, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    :goto_30
    move-object/from16 v17, v7

    goto :goto_31

    :cond_47
    move-object/from16 v1, v51

    sget-object v7, Lb2/e;->F:Lb2/m;

    invoke-virtual {v15, v0, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_30

    :goto_31
    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v8, v14, 0x1c00

    const/16 v9, 0x800

    if-ne v8, v9, :cond_48

    const/4 v8, 0x1

    goto :goto_32

    :cond_48
    const/4 v8, 0x0

    :goto_32
    or-int/2addr v7, v8

    and-int/lit16 v8, v14, 0x380

    const/16 v9, 0x100

    if-ne v8, v9, :cond_49

    const/4 v8, 0x1

    goto :goto_33

    :cond_49
    const/4 v8, 0x0

    :goto_33
    or-int/2addr v7, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_4b

    if-ne v8, v5, :cond_4a

    goto :goto_34

    :cond_4a
    move-object/from16 v7, v37

    goto :goto_35

    :cond_4b
    :goto_34
    new-instance v8, Ld30/r;

    move-object/from16 v7, v37

    const/4 v11, 0x2

    invoke-direct {v8, v6, v3, v7, v11}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_35
    move-object/from16 v16, v8

    check-cast v16, Lc93/a;

    new-instance v8, Ld80/b;

    const/4 v11, 0x0

    invoke-direct {v8, v6, v11}, Ld80/b;-><init>(Lg80/c;I)V

    const v6, -0x556cd746

    invoke-static {v6, v10, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v23

    const/high16 v25, 0x30000000

    const/16 v26, 0x1fc

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v24, v10

    invoke-static/range {v16 .. v26}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, v24

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    goto :goto_2f

    :goto_36
    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    if-eqz v36, :cond_4d

    if-eqz v48, :cond_4c

    invoke-virtual/range {v48 .. v48}, Lc31/k;->t()Z

    move-result v10

    if-ne v10, v8, :cond_4c

    goto :goto_37

    :cond_4c
    const/4 v8, 0x0

    goto :goto_38

    :cond_4d
    :goto_37
    const/4 v8, 0x1

    :goto_38
    instance-of v10, v4, Lw90/c;

    if-nez v10, :cond_4e

    if-eqz v8, :cond_4e

    const v8, -0x57e86adb

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    sget-object v8, Li2/t;->b:Li2/s;

    move-object/from16 v10, p5

    move/from16 v11, v47

    invoke-virtual {v10, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->o()J

    move-result-wide v12

    const/4 v9, 0x0

    invoke-static {v9, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v9, Li2/x;

    invoke-direct {v9, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v10, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->o()J

    move-result-wide v12

    move-object/from16 v51, v1

    new-instance v1, Li2/x;

    invoke-direct {v1, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v10, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->o()J

    move-result-wide v10

    new-instance v12, Li2/x;

    invoke-direct {v12, v10, v11}, Li2/x;-><init>(J)V

    filled-new-array {v9, v1, v12}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static {v8, v1, v10, v10, v9}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v1

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static {v0, v1, v9, v10, v8}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v9, 0x90

    int-to-float v9, v9

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v9, v46

    invoke-virtual {v15, v1, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v11, 0x0

    invoke-static {v1, v6, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    goto :goto_39

    :cond_4e
    move-object/from16 v51, v1

    move-object/from16 v9, v46

    const/4 v8, 0x6

    const/4 v11, 0x0

    const v1, -0x57df175f

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    :goto_39
    if-nez v36, :cond_64

    const v1, -0x57dc3fb8    # -9.090012E-15f

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x3

    const/4 v12, 0x0

    invoke-static {v10, v12, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15, v10, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    double-to-float v9, v9

    mul-float v19, v9, v31

    const/4 v9, 0x5

    int-to-float v9, v9

    mul-float v22, v9, v31

    const/16 v23, 0x2

    const/16 v20, 0x0

    move/from16 v21, v19

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lg80/g;->c()Lcom/whoop/activation/domain/models/FooterAlignment;

    move-result-object v10

    if-nez v10, :cond_4f

    const/4 v10, -0x1

    :goto_3a
    const/4 v11, -0x1

    goto :goto_3b

    :cond_4f
    sget-object v11, Ld80/e$h;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v11, v10

    goto :goto_3a

    :goto_3b
    if-eq v10, v11, :cond_53

    const/4 v11, 0x1

    if-eq v10, v11, :cond_52

    const/4 v11, 0x2

    if-eq v10, v11, :cond_51

    const/4 v11, 0x3

    if-ne v10, v11, :cond_50

    goto :goto_3c

    :cond_50
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_51
    const/4 v11, 0x3

    sget-object v10, Lb2/e;->O:Lb2/k;

    goto :goto_3d

    :cond_52
    const/4 v11, 0x3

    sget-object v10, Lb2/e;->N:Lb2/k;

    goto :goto_3d

    :cond_53
    const/4 v11, 0x3

    :goto_3c
    sget-object v10, Lb2/e;->M:Lb2/k;

    :goto_3d
    invoke-static/range {v29 .. v29}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    invoke-static {v13, v10, v6, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_54

    invoke-virtual {v6, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_3e
    move-object/from16 v12, p6

    goto :goto_3f

    :cond_54
    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_3e

    :goto_3f
    invoke-static {v6, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v33

    invoke-static {v6, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_55

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_56

    :cond_55
    move-object/from16 v11, v52

    goto :goto_41

    :cond_56
    :goto_40
    move-object/from16 v10, p8

    goto :goto_42

    :goto_41
    invoke-static {v10, v6, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_40

    :goto_42
    invoke-static {v6, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x44093ed6

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    check-cast v35, Ljava/lang/Iterable;

    invoke-interface/range {v35 .. v35}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_43
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_63

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    instance-of v8, v2, Lny0/h;

    if-eqz v8, :cond_57

    move-object v12, v2

    check-cast v12, Lny0/h;

    goto :goto_44

    :cond_57
    const/4 v12, 0x0

    :goto_44
    move-object/from16 v8, v49

    if-eqz v12, :cond_58

    invoke-virtual {v8, v12}, Ld80/f;->a(Lny0/h;)Lny0/h;

    move-result-object v9

    if-eqz v9, :cond_58

    move-object v2, v9

    :cond_58
    nop

    instance-of v9, v2, Lny0/h;

    if-eqz v9, :cond_59

    move-object v9, v2

    check-cast v9, Lny0/h;

    goto :goto_45

    :cond_59
    const/4 v9, 0x0

    :goto_45
    if-eqz v9, :cond_5a

    invoke-virtual {v9}, Lny0/h;->o()Z

    move-result v9

    goto :goto_46

    :cond_5a
    invoke-virtual {v8}, Ld80/f;->b()Z

    move-result v9

    :goto_46
    if-eqz v12, :cond_5b

    invoke-virtual {v12}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v10

    goto :goto_47

    :cond_5b
    const/4 v10, 0x0

    :goto_47
    if-eqz v10, :cond_5c

    invoke-virtual {v10}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v11

    instance-of v11, v11, Lcom/whoop/navigation/AppScreen$g6;

    if-nez v11, :cond_5c

    const/4 v11, 0x1

    goto :goto_48

    :cond_5c
    const/4 v11, 0x0

    :goto_48
    invoke-static {}, Lg80/b;->c()Lm91/p;

    move-result-object v18

    invoke-virtual {v6, v9}, Lp1/q;->h(Z)Z

    move-result v13

    invoke-virtual {v6, v11}, Lp1/q;->h(Z)Z

    move-result v19

    or-int v13, v13, v19

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v13, v13, v19

    and-int v1, v14, v38

    move-object/from16 v19, v0

    const/16 v0, 0x4000

    if-ne v1, v0, :cond_5d

    const/4 v1, 0x1

    goto :goto_49

    :cond_5d
    const/4 v1, 0x0

    :goto_49
    or-int/2addr v1, v13

    move-object/from16 v13, v45

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v1, v1, v20

    move-object/from16 v0, v43

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v1, v1, v20

    invoke-virtual {v6, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v1, v1, v20

    move-object/from16 v0, p0

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v1, v1, v20

    and-int/lit16 v0, v14, 0x1c00

    move/from16 p3, v1

    const/16 v1, 0x800

    if-ne v0, v1, :cond_5e

    const/4 v0, 0x1

    goto :goto_4a

    :cond_5e
    const/4 v0, 0x0

    :goto_4a
    or-int v0, p3, v0

    and-int/lit16 v1, v14, 0x380

    move/from16 p3, v0

    const/16 v0, 0x100

    if-ne v1, v0, :cond_5f

    const/4 v1, 0x1

    goto :goto_4b

    :cond_5f
    const/4 v1, 0x0

    :goto_4b
    or-int v1, p3, v1

    and-int v0, v14, v39

    move/from16 p3, v1

    const/high16 v1, 0x20000

    if-ne v0, v1, :cond_60

    const/4 v0, 0x1

    goto :goto_4c

    :cond_60
    const/4 v0, 0x0

    :goto_4c
    or-int v0, p3, v0

    invoke-virtual {v6, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v0, v0, v20

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_62

    if-ne v1, v5, :cond_61

    goto :goto_4d

    :cond_61
    move-object/from16 v20, p4

    move-object v0, v1

    move-object/from16 v16, v2

    move-object/from16 v30, v3

    move-object/from16 v24, v4

    move-object/from16 v67, v5

    move-object/from16 v37, v7

    move-object/from16 v33, v8

    move/from16 p6, v14

    move-object/from16 p2, v15

    move-object/from16 v14, v19

    move-object/from16 v21, v42

    move-object/from16 v3, v43

    move-object/from16 v66, v44

    const/16 v17, 0x3

    const/16 v19, 0x0

    const/16 v27, 0x4000

    move-object/from16 v1, p0

    move-object v15, v6

    goto :goto_4e

    :cond_62
    :goto_4d
    new-instance v0, Ld80/c;

    const/16 v27, 0x4000

    move-object/from16 v16, v2

    move-object/from16 v67, v5

    move-object/from16 v33, v8

    move v1, v9

    move v5, v11

    move-object v8, v13

    move/from16 p6, v14

    move-object/from16 p2, v15

    move-object/from16 v14, v19

    move-object/from16 v9, v42

    move-object/from16 v66, v44

    const/16 v17, 0x3

    const/16 v19, 0x0

    move-object/from16 v2, p4

    move-object v13, v3

    move-object v11, v4

    move-object v15, v6

    move-object v4, v7

    move-object v6, v10

    move-object v3, v12

    move-object/from16 v7, v40

    move-object/from16 v10, v43

    move-object/from16 v12, p0

    invoke-direct/range {v0 .. v13}, Ld80/c;-><init>(ZLkotlin/jvm/functions/Function1;Lny0/h;Lcom/whoop/activation/iajf/domain/SignUpSource;ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v20, v2

    move-object/from16 v37, v4

    move-object/from16 v21, v9

    move-object v3, v10

    move-object/from16 v24, v11

    move-object v1, v12

    move-object/from16 v30, v13

    move-object v13, v8

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_4e
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v0, Lm91/p;->b:I

    shl-int/lit8 v9, v0, 0x3

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, v15

    move-object/from16 v4, v16

    move-object/from16 v5, v18

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, p2

    move-object/from16 v43, v3

    move-object v6, v8

    move-object/from16 v45, v13

    move-object v0, v14

    move-object/from16 p4, v20

    move-object/from16 v42, v21

    move-object/from16 v4, v24

    move-object/from16 v3, v30

    move-object/from16 v49, v33

    move-object/from16 v7, v37

    move-object/from16 v44, v66

    move-object/from16 v5, v67

    const/high16 v1, 0x3f800000    # 1.0f

    move/from16 v14, p6

    goto/16 :goto_43

    :cond_63
    move-object/from16 v1, p0

    move-object/from16 v20, p4

    move-object v14, v0

    move-object/from16 v30, v3

    move-object v0, v6

    move-object/from16 v37, v7

    move-object/from16 v21, v42

    move-object/from16 v3, v43

    move-object/from16 v66, v44

    const/4 v7, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v9, v7, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v11, v0

    move-object v15, v14

    const/high16 v12, 0x3f800000    # 1.0f

    goto/16 :goto_59

    :cond_64
    move-object/from16 v1, p0

    move-object/from16 v20, p4

    move-object/from16 v12, p6

    move-object/from16 v10, p8

    move-object/from16 v30, v3

    move-object/from16 v67, v5

    move-object/from16 v37, v7

    move/from16 p6, v14

    move-object/from16 v13, v33

    move-object/from16 v21, v42

    move-object/from16 v3, v43

    move-object/from16 v66, v44

    move-object/from16 v11, v52

    move-object v14, v0

    move-object v0, v6

    move-object v6, v4

    move-object/from16 v4, v45

    const v5, -0x5798c68b

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v15, v7, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->b:Ll0/e;

    sget-object v15, Lb2/e;->J:Lb2/l;

    invoke-static {v9, v15, v0, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 v24, v6

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_65

    invoke-virtual {v0, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4f

    :cond_65
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_4f
    invoke-static {v0, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_66

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_67

    :cond_66
    invoke-static {v5, v0, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_67
    invoke-static {v0, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v7, 0x4

    int-to-float v5, v7

    mul-float v43, v5, v31

    const/16 v44, 0x0

    const/16 v47, 0x2

    move/from16 v45, v43

    move-object/from16 v42, v14

    move/from16 v46, v29

    invoke-static/range {v42 .. v47}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v14, v32

    move-object/from16 v15, v42

    const/4 v9, 0x0

    invoke-static {v14, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_68

    invoke-virtual {v0, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_50

    :cond_68
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_50
    invoke-static {v0, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_69

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6a

    :cond_69
    invoke-static {v7, v0, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6a
    invoke-static {v0, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v48, :cond_71

    invoke-virtual/range {v48 .. v48}, Lc31/k;->t()Z

    move-result v2

    const/4 v7, 0x1

    if-ne v2, v7, :cond_71

    const v2, 0x64199c63

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    move-object/from16 v6, v24

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    const/high16 v5, 0x1c00000

    and-int v5, p6, v5

    const/high16 v7, 0x800000

    if-ne v5, v7, :cond_6b

    const/4 v5, 0x1

    goto :goto_51

    :cond_6b
    const/4 v5, 0x0

    :goto_51
    or-int/2addr v2, v5

    move-object/from16 v7, v48

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    move/from16 v9, p6

    and-int/lit16 v5, v9, 0x1c00

    const/16 v8, 0x800

    if-ne v5, v8, :cond_6c

    const/4 v5, 0x1

    goto :goto_52

    :cond_6c
    const/4 v5, 0x0

    :goto_52
    or-int/2addr v2, v5

    and-int v5, v9, v39

    const/high16 v8, 0x20000

    if-ne v5, v8, :cond_6d

    const/4 v5, 0x1

    goto :goto_53

    :cond_6d
    const/4 v5, 0x0

    :goto_53
    or-int/2addr v2, v5

    and-int/lit16 v5, v9, 0x380

    const/16 v9, 0x100

    if-ne v5, v9, :cond_6e

    const/4 v5, 0x1

    goto :goto_54

    :cond_6e
    const/4 v5, 0x0

    :goto_54
    or-int/2addr v2, v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_6f

    move-object/from16 v2, v67

    if-ne v5, v2, :cond_70

    :cond_6f
    move-object v10, v0

    goto :goto_55

    :cond_70
    move-object v11, v0

    move-object/from16 v43, v3

    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_56

    :goto_55
    new-instance v0, Lcp0/y;

    move-object v5, v1

    move-object v1, v4

    move-object v4, v6

    move-object v11, v10

    move-object/from16 v2, v21

    move-object/from16 v8, v30

    move-object/from16 v10, v37

    move-object/from16 v9, v40

    const/high16 v12, 0x3f800000    # 1.0f

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v10}, Lcp0/y;-><init>(Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lc93/p;Lc31/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    move-object/from16 v43, v3

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_56
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move/from16 v0, v50

    const/4 v9, 0x0

    invoke-static {v7, v5, v11, v0, v9}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    :goto_57
    const/4 v7, 0x1

    goto :goto_58

    :cond_71
    move-object v11, v0

    move-object/from16 v43, v3

    const/4 v9, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    const v0, 0x64253d3c

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_57

    :goto_58
    invoke-static {v11, v7, v7, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_59
    invoke-static/range {v21 .. v21}, Ld80/e;->A(Lp1/c1;)Z

    move-result v0

    if-nez v0, :cond_73

    invoke-virtual/range {p0 .. p0}, Lg80/g;->j()Z

    move-result v0

    if-eqz v0, :cond_72

    goto :goto_5a

    :cond_72
    const v0, -0x577d623f

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    const/4 v7, 0x1

    goto/16 :goto_5c

    :cond_73
    :goto_5a
    const v0, -0x5781b967

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-static {v12, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->o()J

    move-result-wide v1

    const v3, 0x3f666666    # 0.9f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    move-object/from16 v3, v66

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v51

    const/4 v9, 0x0

    invoke-static {v1, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_74

    invoke-virtual {v11, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5b

    :cond_74
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5b
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v11, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_75

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_76

    :cond_75
    invoke-static {v2, v11, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_76
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v9, 0x0

    invoke-static {v11, v9}, Lk80/r;->b(Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x1

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    :goto_5c
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move-object/from16 v5, v20

    move-object/from16 v4, v30

    move-object/from16 v3, v37

    move-object/from16 v6, v40

    move-object/from16 v7, v43

    goto :goto_5d

    :cond_77
    move-object v11, v8

    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v7

    move-object v7, v4

    move-object v4, v3

    move-object/from16 v3, p2

    move-object v5, v9

    move-object v6, v10

    :goto_5d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_78

    new-instance v0, Lb90/b;

    const/4 v11, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lb90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll83/e;Ljava/lang/Object;III)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_78
    return-void
.end method

.method private static final n(Lj80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ll80/o;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ld80/f;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lc31/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lc31/e;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p3, v0}, Ld80/f;->d(Lc31/e;)V

    :cond_1
    instance-of p3, p4, Lj80/b;

    if-eqz p3, :cond_2

    move-object p3, p4

    check-cast p3, Lj80/b;

    goto :goto_1

    :cond_2
    move-object p3, v1

    :goto_1
    if-eqz p3, :cond_3

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    instance-of p0, p4, Ll80/o;

    if-eqz p0, :cond_4

    move-object p0, p4

    check-cast p0, Ll80/o;

    goto :goto_2

    :cond_4
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_5

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    instance-of p0, p4, Lh80/b;

    if-eqz p0, :cond_6

    move-object v1, p4

    check-cast v1, Lh80/b;

    :cond_6
    if-eqz v1, :cond_7

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ld80/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ld80/a;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lg80/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lj80/a$m0;

    invoke-direct {v0, p0}, Lj80/a$m0;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lg80/c;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ll83/a0;
    .locals 7

    invoke-virtual {p0}, Lg80/c;->a()Lg80/k;

    move-result-object p0

    sget-object v0, Lg80/k;->SKIP:Lg80/k;

    if-ne p0, v0, :cond_0

    new-instance v1, Lj80/a$c0;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lg80/c;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$TextButton"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lg80/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lg80/c;->a()Lg80/k;

    move-result-object v0

    sget-object v1, Lg80/k;->TITLE:Lg80/k;

    if-ne v0, v1, :cond_1

    const v0, -0x4ed0e08

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    :goto_1
    move-object/from16 v24, v0

    goto :goto_2

    :cond_1
    const v0, -0x4ebc0a9

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v28, v0, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_2
    move-object/from16 v26, v2

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(ZZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lcom/whoop/activation/iajf/domain/SignUpSource;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 14

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v0, p13

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lj80/a$c0;

    if-eqz v1, :cond_1

    if-eqz p0, :cond_7

    if-eqz p1, :cond_0

    if-eqz v5, :cond_0

    new-instance p0, Ll80/o$a;

    invoke-direct {p0, v5}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v6, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_0
    const/4 p0, 0x1

    move-object/from16 v8, p7

    invoke-static {v8, p0}, Ld80/e;->B(Lp1/c1;Z)V

    new-instance v0, Ld80/e$e;

    const/4 v7, 0x0

    move-object/from16 v4, p6

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move-object/from16 v3, p10

    move-object/from16 v6, p11

    move-object/from16 v5, p13

    invoke-direct/range {v0 .. v7}, Ld80/e$e;-><init>(Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    move-object/from16 v7, p4

    invoke-static {v7, p1, p1, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_0

    :cond_1
    move-object/from16 v7, p4

    move-object/from16 v8, p7

    move-object v13, v0

    nop

    instance-of v0, v13, Ll80/o;

    if-eqz v0, :cond_2

    invoke-interface {v6, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_2
    instance-of v0, v13, Lh80/b;

    if-eqz v0, :cond_3

    move-object/from16 v1, p5

    invoke-interface {v1, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    move-object/from16 v1, p5

    instance-of v0, v13, Lc31/e;

    if-nez v0, :cond_7

    instance-of v0, v13, Lj80/b;

    if-eqz v0, :cond_4

    move-object/from16 v12, p6

    invoke-interface {v12, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    move-object/from16 v12, p6

    instance-of v0, v13, Lny0/h;

    if-eqz v0, :cond_5

    move v0, p0

    move v4, p1

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v3, p11

    move-object/from16 v2, p12

    invoke-static/range {v0 .. v12}, Ld80/e;->w(ZLkotlin/jvm/functions/Function1;Lny0/h;Lcom/whoop/activation/iajf/domain/SignUpSource;ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_5
    instance-of v0, v13, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_6

    if-eqz p0, :cond_7

    new-instance p0, Ll80/o$a;

    move-object p1, v13

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v6, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    move v0, p0

    move v4, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p4

    move-object/from16 v1, p5

    move-object/from16 v12, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v3, p11

    move-object/from16 v2, p12

    invoke-static/range {v0 .. v12}, Ld80/e;->w(ZLkotlin/jvm/functions/Function1;Lny0/h;Lcom/whoop/activation/iajf/domain/SignUpSource;ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;)V

    :cond_7
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(ZLkotlin/jvm/functions/Function1;Lny0/h;Lcom/whoop/activation/iajf/domain/SignUpSource;ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lny0/h;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            "Z",
            "Lcom/whoop/navigation/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lkotlin/jvm/functions/Function3;",
            "Lm91/u;",
            "Lg80/g;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lh80/b$i;

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lny0/h;->j()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, v2

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v5, p0

    :goto_2
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x22

    const/4 v9, 0x0

    const-string v2, "in_app_join_flow_footer"

    const/4 v3, 0x0

    const-string v4, "footer_cta"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p4, :cond_4

    if-eqz p5, :cond_4

    new-instance p0, Ll80/o$a;

    invoke-direct {p0, p5}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    move-object/from16 p1, p6

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    const/4 p1, 0x1

    move-object/from16 p2, p8

    invoke-static {p2, p1}, Ld80/e;->B(Lp1/c1;Z)V

    new-instance v0, Ld80/e$f;

    const/4 v6, 0x0

    move-object v5, p3

    move-object/from16 v1, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    invoke-direct/range {v0 .. v6}, Ld80/e$f;-><init>(Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V

    const/4 p1, 0x3

    move-object/from16 p2, p7

    invoke-static {p2, p0, p0, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final x(Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lc93/p;Lc31/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lc31/c;)Ll83/a0;
    .locals 11

    const-string v0, "it"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ld80/e;->B(Lp1/c1;Z)V

    new-instance v1, Ld80/e$g;

    const/4 v10, 0x0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v1 .. v10}, Ld80/e$g;-><init>(Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lc93/p;Lc31/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Ld80/e;->m(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lh80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

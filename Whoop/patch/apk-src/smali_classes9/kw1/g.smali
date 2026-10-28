.class public abstract Lkw1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Liw1/f;",
        "viewState",
        "Lkotlin/Function1;",
        "Liw1/e;",
        "Ll83/a0;",
        "onViewEvent",
        "",
        "isFromLto",
        "f",
        "(Liw1/f;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "membership_release"
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
.method public static synthetic a(Liw1/f;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkw1/g;->k(Liw1/f;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/g;->j(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/g;->i(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Liw1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/g;->g(Liw1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/g;->h(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Liw1/f;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw1/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x6f10de3e

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v2, p5, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_5

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v3

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    :goto_4
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_7

    invoke-virtual {v8, p2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_5

    :cond_6
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v9, 0x1

    const/4 v11, 0x0

    if-eq v5, v6, :cond_8

    move v5, v9

    goto :goto_6

    :cond_8
    move v5, v11

    :goto_6
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v8, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1d

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_9

    new-instance p1, Lkm2/e;

    const/16 v2, 0xe

    invoke-direct {p1, v2}, Lkm2/e;-><init>(I)V

    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_a
    instance-of v2, p0, Liw1/f$a;

    if-eqz v2, :cond_10

    const v2, 0x11add9df

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    move-object v2, p0

    check-cast v2, Liw1/f$a;

    invoke-virtual {v2}, Liw1/f$a;->e()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v2

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v3, :cond_b

    move v3, v9

    goto :goto_7

    :cond_b
    move v3, v11

    :goto_7
    and-int/lit8 v6, v0, 0xe

    if-eq v6, v1, :cond_d

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_c

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    move v9, v11

    :cond_d
    :goto_8
    or-int v0, v3, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    if-ne v1, v5, :cond_f

    :cond_e
    new-instance v1, Lkw1/f;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p0, v0}, Lkw1/f;-><init>(Lkotlin/jvm/functions/Function1;Liw1/f;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1, v8, v11, v11}, Lkw1/m;->e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto/16 :goto_d

    :cond_10
    instance-of v2, p0, Liw1/f$b;

    if-eqz v2, :cond_16

    const v2, 0x11adfd02

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    move-object v2, p0

    check-cast v2, Liw1/f$b;

    invoke-virtual {v2}, Liw1/f$b;->e()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v2

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v3, :cond_11

    move v3, v9

    goto :goto_9

    :cond_11
    move v3, v11

    :goto_9
    and-int/lit8 v6, v0, 0xe

    if-eq v6, v1, :cond_13

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_12

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_a

    :cond_12
    move v9, v11

    :cond_13
    :goto_a
    or-int v0, v3, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_14

    if-ne v1, v5, :cond_15

    :cond_14
    new-instance v1, Lkw1/f;

    const/4 v0, 0x1

    invoke-direct {v1, p1, p0, v0}, Lkw1/f;-><init>(Lkotlin/jvm/functions/Function1;Liw1/f;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1, v8, v11, v11}, Lkw1/r;->e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_16
    instance-of v2, p0, Liw1/f$c;

    if-eqz v2, :cond_1c

    const v2, 0x11ae20a2

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    move-object v2, p0

    check-cast v2, Liw1/f$c;

    invoke-virtual {v2}, Liw1/f$c;->e()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v2

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v3, :cond_17

    move v3, v9

    goto :goto_b

    :cond_17
    move v3, v11

    :goto_b
    and-int/lit8 v6, v0, 0xe

    if-eq v6, v1, :cond_19

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_18

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    move v9, v11

    :cond_19
    :goto_c
    or-int v1, v3, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1a

    if-ne v3, v5, :cond_1b

    :cond_1a
    new-instance v3, Lkw1/f;

    const/4 v1, 0x2

    invoke-direct {v3, p1, p0, v1}, Lkw1/f;-><init>(Lkotlin/jvm/functions/Function1;Liw1/f;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v9, v0, 0x380

    const/4 v10, 0x0

    move v7, p2

    move-object v5, v2

    invoke-static/range {v5 .. v10}, Lkw1/v;->f(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_d
    move-object v2, p1

    goto :goto_e

    :cond_1c
    const p0, 0x11add309

    invoke-static {p0, v8, v11}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1d
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_d

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_1e

    new-instance v0, Lbg0/h;

    const/16 v6, 0xf

    move-object v1, p0

    move v3, p2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final g(Liw1/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liw1/e$a;

    invoke-direct {v0, p1, p2}, Liw1/e$a;-><init>(Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liw1/e$a;

    invoke-direct {v0, p1, p2}, Liw1/e$a;-><init>(Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liw1/e$a;

    invoke-direct {v0, p1, p2}, Liw1/e$a;-><init>(Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Liw1/f;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkw1/g;->f(Liw1/f;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
